{-# LANGUAGE DataKinds                  #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE DeriveTraversable          #-}
{-# LANGUAGE FlexibleContexts           #-}
{-# LANGUAGE FlexibleInstances          #-}
{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE OverloadedStrings          #-}
{-# LANGUAGE RecordWildCards            #-}
{-# LANGUAGE TypeFamilies               #-}
{-# LANGUAGE TypeOperators              #-}
{-# LANGUAGE ViewPatterns               #-}
{-# OPTIONS_GHC
-fno-warn-unused-binds -fno-warn-unused-imports -freduction-depth=328 #-}

module ZulipREST.API
  ( -- * Client and Server
    Config(..)
  , ZulipRESTBackend(..)
  , createZulipRESTClient
  , runZulipRESTServer
  , runZulipRESTMiddlewareServer
  , runZulipRESTClient
  , runZulipRESTClientWithManager
  , callZulipREST
  , ZulipRESTClient
  , ZulipRESTClientError(..)
  -- ** Servant
  , ZulipRESTAPI
  ) where

import           ZulipREST.Types

import           Control.Monad.Catch                (Exception, MonadThrow, throwM)
import           Control.Monad.Except               (ExceptT, runExceptT)
import           Control.Monad.IO.Class
import           Control.Monad.Trans.Reader         (ReaderT (..))
import           Data.Aeson                         (Value)
import           Data.Coerce                        (coerce)
import           Data.Data                          (Data)
import           Data.Function                      ((&))
import qualified Data.Map                           as Map
import           Data.Monoid                        ((<>))
import           Data.Proxy                         (Proxy (..))
import           Data.Set                           (Set)
import           Data.Text                          (Text)
import qualified Data.Text                          as T
import           Data.Time
import           Data.UUID                          (UUID)
import           GHC.Exts                           (IsString (..))
import           GHC.Generics                       (Generic)
import           Network.HTTP.Client                (Manager, newManager)
import           Network.HTTP.Client.TLS            (tlsManagerSettings)
import           Network.HTTP.Types.Method          (methodOptions)
import           Network.Wai                        (Middleware)
import qualified Network.Wai.Handler.Warp           as Warp
import           Servant                            (ServerError, serve)
import           Servant.API
import           Servant.API.Verbs                  (StdMethod (..), Verb)
import           Servant.Client                     (ClientEnv, Scheme (Http), ClientError, client,
                                                     mkClientEnv, parseBaseUrl)
import           Servant.Client.Core                (baseUrlPort, baseUrlHost)
import           Servant.Client.Internal.HttpClient (ClientM (..))
import           Servant.Server                     (Handler (..), Application)
import           Servant.Server.StaticFiles         (serveDirectoryFileServer)
import           Web.FormUrlEncoded
import           Web.HttpApiData



data FormUploadFile = FormUploadFile
  { uploadFileFilename :: FilePath
  } deriving (Show, Eq, Generic, Data)

instance FromForm FormUploadFile
instance ToForm FormUploadFile

data FormUploadCustomEmoji = FormUploadCustomEmoji
  { uploadCustomEmojiFilename :: FilePath
  } deriving (Show, Eq, Generic, Data)

instance FromForm FormUploadCustomEmoji
instance ToForm FormUploadCustomEmoji


-- | List of elements parsed from a query.
newtype QueryList (p :: CollectionFormat) a = QueryList
  { fromQueryList :: [a]
  } deriving (Functor, Applicative, Monad, Foldable, Traversable)

-- | Formats in which a list can be encoded into a HTTP path.
data CollectionFormat
  = CommaSeparated -- ^ CSV format for multiple parameters.
  | SpaceSeparated -- ^ Also called "SSV"
  | TabSeparated -- ^ Also called "TSV"
  | PipeSeparated -- ^ `value1|value2|value2`
  | MultiParamArray -- ^ Using multiple GET parameters, e.g. `foo=bar&foo=baz`. Only for GET params.

instance FromHttpApiData a => FromHttpApiData (QueryList 'CommaSeparated a) where
  parseQueryParam = parseSeparatedQueryList ','

instance FromHttpApiData a => FromHttpApiData (QueryList 'TabSeparated a) where
  parseQueryParam = parseSeparatedQueryList '\t'

instance FromHttpApiData a => FromHttpApiData (QueryList 'SpaceSeparated a) where
  parseQueryParam = parseSeparatedQueryList ' '

instance FromHttpApiData a => FromHttpApiData (QueryList 'PipeSeparated a) where
  parseQueryParam = parseSeparatedQueryList '|'

instance FromHttpApiData a => FromHttpApiData (QueryList 'MultiParamArray a) where
  parseQueryParam = error "unimplemented FromHttpApiData for MultiParamArray collection format"

parseSeparatedQueryList :: FromHttpApiData a => Char -> Text -> Either Text (QueryList p a)
parseSeparatedQueryList char = fmap QueryList . mapM parseQueryParam . T.split (== char)

instance ToHttpApiData a => ToHttpApiData (QueryList 'CommaSeparated a) where
  toQueryParam = formatSeparatedQueryList ','

instance ToHttpApiData a => ToHttpApiData (QueryList 'TabSeparated a) where
  toQueryParam = formatSeparatedQueryList '\t'

instance ToHttpApiData a => ToHttpApiData (QueryList 'SpaceSeparated a) where
  toQueryParam = formatSeparatedQueryList ' '

instance ToHttpApiData a => ToHttpApiData (QueryList 'PipeSeparated a) where
  toQueryParam = formatSeparatedQueryList '|'

instance ToHttpApiData a => ToHttpApiData (QueryList 'MultiParamArray a) where
  toQueryParam = error "unimplemented ToHttpApiData for MultiParamArray collection format"

formatSeparatedQueryList :: ToHttpApiData a => Char ->  QueryList p a -> Text
formatSeparatedQueryList char = T.intercalate (T.singleton char) . map toQueryParam . fromQueryList


-- | Servant type-level API, generated from the OpenAPI spec for ZulipREST.
type ZulipRESTAPI
    =    "dev_fetch_api_key" :> QueryParam "username" Text :> Verb 'POST 200 '[JSON] ApiKeyResponse -- 'devFetchApiKey' route
    :<|> "fetch_api_key" :> QueryParam "username" Text :> QueryParam "password" Text :> Verb 'POST 200 '[JSON] ApiKeyResponse -- 'fetchApiKey' route
    :<|> "drafts" :> QueryParam "drafts" (QueryList 'MultiParamArray (Draft)) :> Verb 'POST 200 '[JSON] JsonSuccess -- 'createDrafts' route
    :<|> "drafts" :> Capture "draft_id" Int :> Verb 'DELETE 200 '[JSON] JsonSuccess -- 'deleteDraft' route
    :<|> "drafts" :> Capture "draft_id" Int :> QueryParam "draft" Draft :> Verb 'PATCH 200 '[JSON] JsonSuccess -- 'editDraft' route
    :<|> "drafts" :> Verb 'GET 200 '[JSON] JsonSuccess -- 'getDrafts' route
    :<|> "messages" :> Capture "message_id" Int :> "reactions" :> QueryParam "emoji_name" Text :> QueryParam "emoji_code" Text :> QueryParam "reaction_type" Text :> Verb 'POST 200 '[JSON] JsonSuccess -- 'addReaction' route
    :<|> "messages" :> "matches_narrow" :> QueryParam "msg_ids" (QueryList 'MultiParamArray (Int)) :> QueryParam "narrow" (QueryList 'MultiParamArray (Value)) :> Verb 'GET 200 '[JSON] Value -- 'checkMessagesMatchNarrow' route
    :<|> "messages" :> Capture "message_id" Int :> Verb 'DELETE 200 '[JSON] JsonSuccess -- 'deleteMessage' route
    :<|> "user_uploads" :> Capture "realm_id_str" Int :> Capture "filename" Text :> Verb 'GET 200 '[JSON] JsonSuccessBase -- 'getFileTemporaryUrl' route
    :<|> "messages" :> Capture "message_id" Int :> "history" :> Verb 'GET 200 '[JSON] JsonSuccessBase -- 'getMessageHistory' route
    :<|> "messages" :> QueryParam "anchor" OneOf<string,integer> :> QueryParam "num_before" Int :> QueryParam "num_after" Int :> QueryParam "narrow" (QueryList 'MultiParamArray (Value)) :> QueryParam "client_gravatar" Bool :> QueryParam "apply_markdown" Bool :> QueryParam "use_first_unread_anchor" Bool :> Verb 'GET 200 '[JSON] JsonSuccessBase -- 'getMessages' route
    :<|> "messages" :> Capture "message_id" Int :> Verb 'GET 200 '[JSON] JsonSuccessBase -- 'getRawMessage' route
    :<|> "mark_all_as_read" :> Verb 'POST 200 '[JSON] JsonSuccess -- 'markAllAsRead' route
    :<|> "mark_stream_as_read" :> QueryParam "stream_id" Int :> Verb 'POST 200 '[JSON] JsonSuccess -- 'markStreamAsRead' route
    :<|> "mark_topic_as_read" :> QueryParam "stream_id" Int :> QueryParam "topic_name" Text :> Verb 'POST 200 '[JSON] JsonSuccess -- 'markTopicAsRead' route
    :<|> "messages" :> Capture "message_id" Int :> "reactions" :> QueryParam "emoji_name" Text :> QueryParam "emoji_code" Text :> QueryParam "reaction_type" Text :> Verb 'DELETE 200 '[JSON] JsonSuccess -- 'removeReaction' route
    :<|> "messages" :> "render" :> QueryParam "content" Text :> Verb 'POST 200 '[JSON] JsonSuccessBase -- 'renderMessage' route
    :<|> "messages" :> QueryParam "type" Text :> QueryParam "to" (QueryList 'MultiParamArray (Int)) :> QueryParam "content" Text :> QueryParam "topic" Text :> QueryParam "queue_id" Text :> QueryParam "local_id" Text :> Verb 'POST 200 '[JSON] JsonSuccessBase -- 'sendMessage' route
    :<|> "messages" :> Capture "message_id" Int :> QueryParam "topic" Text :> QueryParam "propagate_mode" Text :> QueryParam "send_notification_to_old_thread" Bool :> QueryParam "send_notification_to_new_thread" Bool :> QueryParam "content" Text :> QueryParam "stream_id" Int :> Verb 'PATCH 200 '[JSON] JsonSuccess -- 'updateMessage' route
    :<|> "messages" :> "flags" :> QueryParam "messages" (QueryList 'MultiParamArray (Int)) :> QueryParam "op" Text :> QueryParam "flag" Text :> Verb 'POST 200 '[JSON] JsonSuccessBase -- 'updateMessageFlags' route
    :<|> "user_uploads" :> ReqBody '[FormUrlEncoded] FormUploadFile :> Verb 'POST 200 '[JSON] JsonSuccessBase -- 'uploadFile' route
    :<|> "events" :> QueryParam "queue_id" Text :> Verb 'DELETE 200 '[JSON] JsonSuccess -- 'deleteQueue' route
    :<|> "events" :> QueryParam "queue_id" Text :> QueryParam "last_event_id" Int :> QueryParam "dont_block" Bool :> Verb 'GET 200 '[JSON] JsonSuccessBase -- 'getEvents' route
    :<|> "real-time" :> QueryParam "event_types" (QueryList 'MultiParamArray (Text)) :> QueryParam "narrow" (QueryList 'MultiParamArray ([Text])) :> QueryParam "all_public_streams" Bool :> Verb 'POST 200 '[JSON] NoContent -- 'realTimePost' route
    :<|> "register" :> QueryParam "apply_markdown" Bool :> QueryParam "client_gravatar" Bool :> QueryParam "slim_presence" Bool :> QueryParam "event_types" (QueryList 'MultiParamArray (Text)) :> QueryParam "all_public_streams" Bool :> QueryParam "include_subscribers" Bool :> QueryParam "client_capabilities" Value :> QueryParam "fetch_event_types" (QueryList 'MultiParamArray (Text)) :> QueryParam "narrow" (QueryList 'MultiParamArray ([Text])) :> Verb 'POST 200 '[JSON] JsonSuccessBase -- 'registerQueue' route
    :<|> "rest-error-handling" :> Verb 'POST 200 '[JSON] NoContent -- 'restErrorHandling' route
    :<|> "realm" :> "playgrounds" :> QueryParam "name" Text :> QueryParam "pygments_language" Text :> QueryParam "url_prefix" Text :> Verb 'POST 200 '[JSON] JsonSuccessBase -- 'addCodePlayground' route
    :<|> "realm" :> "filters" :> QueryParam "pattern" Text :> QueryParam "url_format_string" Text :> Verb 'POST 200 '[JSON] JsonSuccessBase -- 'addLinkifier' route
    :<|> "realm" :> "profile_fields" :> QueryParam "name" Text :> QueryParam "hint" Text :> QueryParam "field_type" Int :> QueryParam "field_data" Value :> Verb 'POST 200 '[JSON] JsonSuccessBase -- 'createCustomProfileField' route
    :<|> "realm" :> "emoji" :> Verb 'GET 200 '[JSON] JsonSuccessBase -- 'getCustomEmoji' route
    :<|> "realm" :> "profile_fields" :> Verb 'GET 200 '[JSON] JsonSuccessBase -- 'getCustomProfileFields' route
    :<|> "realm" :> "linkifiers" :> Verb 'GET 200 '[JSON] JsonSuccessBase -- 'getLinkifiers' route
    :<|> "server_settings" :> Verb 'GET 200 '[JSON] JsonSuccessBase -- 'getServerSettings' route
    :<|> "realm" :> "playgrounds" :> Capture "playground_id" Int :> Verb 'DELETE 200 '[JSON] JsonSuccess -- 'removeCodePlayground' route
    :<|> "realm" :> "filters" :> Capture "filter_id" Int :> Verb 'DELETE 200 '[JSON] JsonSuccess -- 'removeLinkifier' route
    :<|> "realm" :> "profile_fields" :> QueryParam "order" (QueryList 'MultiParamArray (Int)) :> Verb 'PATCH 200 '[JSON] JsonSuccess -- 'reorderCustomProfileFields' route
    :<|> "realm" :> "filters" :> Capture "filter_id" Int :> QueryParam "pattern" Text :> QueryParam "url_format_string" Text :> Verb 'PATCH 200 '[JSON] JsonSuccess -- 'updateLinkifier' route
    :<|> "realm" :> "emoji" :> Capture "emoji_name" Text :> ReqBody '[FormUrlEncoded] FormUploadCustomEmoji :> Verb 'POST 200 '[JSON] JsonSuccess -- 'uploadCustomEmoji' route
    :<|> "streams" :> Capture "stream_id" Int :> Verb 'DELETE 200 '[JSON] JsonSuccess -- 'archiveStream' route
    :<|> "calls" :> "bigbluebutton" :> "create" :> Verb 'GET 200 '[JSON] JsonSuccessBase -- 'createBigBlueButtonVideoCall' route
    :<|> "streams" :> Capture "stream_id" Int :> "delete_topic" :> QueryParam "topic_name" Text :> Verb 'POST 200 '[JSON] JsonSuccess -- 'deleteTopic' route
    :<|> "get_stream_id" :> QueryParam "stream" Text :> Verb 'GET 200 '[JSON] JsonSuccessBase -- 'getStreamId' route
    :<|> "users" :> "me" :> Capture "stream_id" Int :> "topics" :> Verb 'GET 200 '[JSON] JsonSuccessBase -- 'getStreamTopics' route
    :<|> "streams" :> QueryParam "include_public" Bool :> QueryParam "include_web_public" Bool :> QueryParam "include_subscribed" Bool :> QueryParam "include_all_active" Bool :> QueryParam "include_default" Bool :> QueryParam "include_owner_subscribed" Bool :> Verb 'GET 200 '[JSON] JsonSuccessBase -- 'getStreams' route
    :<|> "streams" :> Capture "stream_id" Int :> "members" :> Verb 'GET 200 '[JSON] JsonSuccessBase -- 'getSubscribers' route
    :<|> "users" :> Capture "user_id" Int :> "subscriptions" :> Capture "stream_id" Int :> Verb 'GET 200 '[JSON] JsonSuccessBase -- 'getSubscriptionStatus' route
    :<|> "users" :> "me" :> "subscriptions" :> QueryParam "include_subscribers" Bool :> Verb 'GET 200 '[JSON] JsonSuccessBase -- 'getSubscriptions' route
    :<|> "users" :> "me" :> "subscriptions" :> "muted_topics" :> QueryParam "stream" Text :> QueryParam "stream_id" Int :> QueryParam "topic" Text :> QueryParam "op" Text :> Verb 'PATCH 200 '[JSON] JsonSuccess -- 'muteTopic' route
    :<|> "users" :> "me" :> "subscriptions" :> QueryParam "subscriptions" (QueryList 'MultiParamArray (Value)) :> QueryParam "principals" (QueryList 'MultiParamArray (OneOf<string,integer>)) :> QueryParam "authorization_errors_fatal" Bool :> QueryParam "announce" Bool :> QueryParam "invite_only" Bool :> QueryParam "history_public_to_subscribers" Bool :> QueryParam "stream_post_policy" Int :> QueryParam "message_retention_days" OneOf<string,integer> :> Verb 'POST 200 '[JSON] OneOf<object,object> -- 'subscribe' route
    :<|> "users" :> "me" :> "subscriptions" :> QueryParam "subscriptions" (QueryList 'MultiParamArray (Text)) :> QueryParam "principals" (QueryList 'MultiParamArray (OneOf<string,integer>)) :> Verb 'DELETE 200 '[JSON] JsonSuccessBase -- 'unsubscribe' route
    :<|> "streams" :> Capture "stream_id" Int :> QueryParam "description" Text :> QueryParam "new_name" Text :> QueryParam "is_private" Bool :> QueryParam "is_announcement_only" Bool :> QueryParam "stream_post_policy" Int :> QueryParam "history_public_to_subscribers" Bool :> QueryParam "message_retention_days" OneOf<string,integer> :> Verb 'PATCH 200 '[JSON] JsonSuccess -- 'updateStream' route
    :<|> "users" :> "me" :> "subscriptions" :> "properties" :> QueryParam "subscription_data" (QueryList 'MultiParamArray (Value)) :> Verb 'POST 200 '[JSON] JsonSuccessBase -- 'updateSubscriptionSettings' route
    :<|> "users" :> "me" :> "subscriptions" :> QueryParam "delete" (QueryList 'MultiParamArray (Text)) :> QueryParam "add" (QueryList 'MultiParamArray (Value)) :> Verb 'PATCH 200 '[JSON] JsonSuccessBase -- 'updateSubscriptions' route
    :<|> "users" :> QueryParam "email" Text :> QueryParam "password" Text :> QueryParam "full_name" Text :> Verb 'POST 200 '[JSON] JsonSuccessBase -- 'createUser' route
    :<|> "user_groups" :> "create" :> QueryParam "name" Text :> QueryParam "description" Text :> QueryParam "members" (QueryList 'MultiParamArray (Int)) :> Verb 'POST 200 '[JSON] JsonSuccess -- 'createUserGroup' route
    :<|> "users" :> "me" :> Verb 'DELETE 200 '[JSON] JsonSuccess -- 'deactivateOwnUser' route
    :<|> "users" :> Capture "user_id" Int :> Verb 'DELETE 200 '[JSON] JsonSuccess -- 'deactivateUser' route
    :<|> "attachments" :> Verb 'GET 200 '[JSON] JsonSuccessBase -- 'getAttachments' route
    :<|> "users" :> "me" :> Verb 'GET 200 '[JSON] JsonSuccessBase -- 'getOwnUser' route
    :<|> "users" :> Capture "user_id" Int :> QueryParam "client_gravatar" Bool :> QueryParam "include_custom_profile_fields" Bool :> Verb 'GET 200 '[JSON] JsonSuccessBase -- 'getUser' route
    :<|> "users" :> Capture "email" Text :> QueryParam "client_gravatar" Bool :> QueryParam "include_custom_profile_fields" Bool :> Verb 'GET 200 '[JSON] JsonSuccessBase -- 'getUserByEmail' route
    :<|> "user_groups" :> Verb 'GET 200 '[JSON] JsonSuccessBase -- 'getUserGroups' route
    :<|> "users" :> Capture "user_id_or_email" Text :> "presence" :> Verb 'GET 200 '[JSON] JsonSuccessBase -- 'getUserPresence' route
    :<|> "users" :> QueryParam "client_gravatar" Bool :> QueryParam "include_custom_profile_fields" Bool :> Verb 'GET 200 '[JSON] JsonSuccessBase -- 'getUsers' route
    :<|> "users" :> "me" :> "muted_users" :> Capture "muted_user_id" Int :> Verb 'POST 200 '[JSON] JsonSuccess -- 'muteUser' route
    :<|> "users" :> Capture "user_id" Int :> "reactivate" :> Verb 'POST 200 '[JSON] Value -- 'reactivateUser' route
    :<|> "user_groups" :> Capture "user_group_id" Int :> Verb 'DELETE 200 '[JSON] JsonSuccess -- 'removeUserGroup' route
    :<|> "typing" :> QueryParam "type" Text :> QueryParam "op" Text :> QueryParam "to" (QueryList 'MultiParamArray (Int)) :> QueryParam "topic" Text :> Verb 'POST 200 '[JSON] JsonSuccess -- 'setTypingStatus' route
    :<|> "users" :> "me" :> "muted_users" :> Capture "muted_user_id" Int :> Verb 'DELETE 200 '[JSON] JsonSuccess -- 'unmuteUser' route
    :<|> "settings" :> QueryParam "full_name" Text :> QueryParam "email" Text :> QueryParam "old_password" Text :> QueryParam "new_password" Text :> QueryParam "twenty_four_hour_time" Bool :> QueryParam "dense_mode" Bool :> QueryParam "starred_message_counts" Bool :> QueryParam "fluid_layout_width" Bool :> QueryParam "high_contrast_mode" Bool :> QueryParam "color_scheme" Int :> QueryParam "enable_drafts_synchronization" Bool :> QueryParam "translate_emoticons" Bool :> QueryParam "default_language" Text :> QueryParam "default_view" Text :> QueryParam "left_side_userlist" Bool :> QueryParam "emojiset" Text :> QueryParam "demote_inactive_streams" Int :> QueryParam "timezone" Text :> QueryParam "enable_stream_desktop_notifications" Bool :> QueryParam "enable_stream_email_notifications" Bool :> QueryParam "enable_stream_push_notifications" Bool :> QueryParam "enable_stream_audible_notifications" Bool :> QueryParam "notification_sound" Text :> QueryParam "enable_desktop_notifications" Bool :> QueryParam "enable_sounds" Bool :> QueryParam "email_notifications_batching_period_seconds" Int :> QueryParam "enable_offline_email_notifications" Bool :> QueryParam "enable_offline_push_notifications" Bool :> QueryParam "enable_online_push_notifications" Bool :> QueryParam "enable_digest_emails" Bool :> QueryParam "enable_marketing_emails" Bool :> QueryParam "enable_login_emails" Bool :> QueryParam "message_content_in_email_notifications" Bool :> QueryParam "pm_content_in_desktop_notifications" Bool :> QueryParam "wildcard_mentions_notify" Bool :> QueryParam "desktop_icon_count_display" Int :> QueryParam "realm_name_in_notifications" Bool :> QueryParam "presence_enabled" Bool :> QueryParam "enter_sends" Bool :> Verb 'PATCH 200 '[JSON] JsonSuccessBase -- 'updateSettings' route
    :<|> "users" :> "me" :> "status" :> QueryParam "status_text" Text :> QueryParam "away" Bool :> QueryParam "emoji_name" Text :> QueryParam "emoji_code" Text :> QueryParam "reaction_type" Text :> Verb 'POST 200 '[JSON] JsonSuccess -- 'updateStatus' route
    :<|> "users" :> Capture "user_id" Int :> QueryParam "full_name" Text :> QueryParam "role" Int :> QueryParam "profile_data" (QueryList 'MultiParamArray (Value)) :> Verb 'PATCH 200 '[JSON] JsonSuccess -- 'updateUser' route
    :<|> "user_groups" :> Capture "user_group_id" Int :> QueryParam "name" Text :> QueryParam "description" Text :> Verb 'PATCH 200 '[JSON] JsonSuccess -- 'updateUserGroup' route
    :<|> "user_groups" :> Capture "user_group_id" Int :> "members" :> QueryParam "delete" (QueryList 'MultiParamArray (Int)) :> QueryParam "add" (QueryList 'MultiParamArray (Int)) :> Verb 'POST 200 '[JSON] JsonSuccess -- 'updateUserGroupMembers' route
    :<|> "zulip-outgoing-webhook" :> Verb 'POST 200 '[JSON] InlineResponse200 -- 'zulipOutgoingWebhooks' route
    :<|> Raw 


-- | Server or client configuration, specifying the host and port to query or serve on.
data Config = Config
  { configUrl :: String  -- ^ scheme://hostname:port/path, e.g. "http://localhost:8080/"
  } deriving (Eq, Ord, Show, Read)


-- | Custom exception type for our errors.
newtype ZulipRESTClientError = ZulipRESTClientError ClientError
  deriving (Show, Exception)
-- | Configuration, specifying the full url of the service.


-- | Backend for ZulipREST.
-- The backend can be used both for the client and the server. The client generated from the ZulipREST OpenAPI spec
-- is a backend that executes actions by sending HTTP requests (see @createZulipRESTClient@). Alternatively, provided
-- a backend, the API can be served using @runZulipRESTMiddlewareServer@.
data ZulipRESTBackend m = ZulipRESTBackend
  { devFetchApiKey :: Maybe Text -> m ApiKeyResponse{- ^ For easy testing of mobile apps and other clients and against Zulip development servers, we support fetching a Zulip API key for any user on the development server without authentication (so that they can implement analogues of the one-click login process available for Zulip development servers on the web).  **Note:** This endpoint is only available on Zulip development servers; for obvious security reasons it will always return an error in a Zulip production server.  `POST {{ api_url }}/v1/dev_fetch_api_key`  -}
  , fetchApiKey :: Maybe Text -> Maybe Text -> m ApiKeyResponse{- ^ This API endpoint is used by clients such as the Zulip mobile and terminal apps to implement password-based authentication.  Given the user's Zulip login credentials, it returns a Zulip API key that the client can use to make requests requests as the user.  This endpoint is only useful for Zulip servers/organizations with EmailAuthBackend or LDAPAuthBackend enabled.  The Zulip mobile apps also support SSO/social authentication (GitHub auth, Google auth, SAML, etc.) that does not use this endpoint.  Instead, the mobile apps reuse the web login flow passing the `mobile_flow_otp` in a webview, and the credentials are returned to the app (encrypted) via a redirect to a `zulip://` URL.  !!! warn \"\"     **Note:** If you signed up using passwordless authentication and     never had a password, you can [reset your password](/help/change-your-password).      See the [API keys](/api/api-keys) documentation for     more details on how to download API key manually.  In a [Zulip development environment](https://zulip.readthedocs.io/en/latest/development/overview.html), see also [the unauthenticated variant](/api/dev-fetch-api-key).  -}
  , createDrafts :: Maybe [Draft] -> m JsonSuccess{- ^ Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts`  -}
  , deleteDraft :: Int -> m JsonSuccess{- ^ Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}`  -}
  , editDraft :: Int -> Maybe Draft -> m JsonSuccess{- ^ Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}`  -}
  , getDrafts :: m JsonSuccess{- ^ Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts`  -}
  , addReaction :: Int -> Maybe Text -> Maybe Text -> Maybe Text -> m JsonSuccess{- ^ Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions`  -}
  , checkMessagesMatchNarrow :: Maybe [Int] -> Maybe [Value] -> m Value{- ^ Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message.  -}
  , deleteMessage :: Int -> m JsonSuccess{- ^ Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely  -}
  , getFileTemporaryUrl :: Int -> Text -> m JsonSuccessBase{- ^ Get a temporary URL for access to the file that doesn't require authentication.  -}
  , getMessageHistory :: Int -> m JsonSuccessBase{- ^ Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history  -}
  , getMessages :: Maybe OneOf<string,integer> -> Maybe Int -> Maybe Int -> Maybe [Value] -> Maybe Bool -> Maybe Bool -> Maybe Bool -> m JsonSuccessBase{- ^ Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error.  -}
  , getRawMessage :: Int -> m JsonSuccessBase{- ^ Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI).  -}
  , markAllAsRead :: m JsonSuccess{- ^ Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read`  -}
  , markStreamAsRead :: Maybe Int -> m JsonSuccess{- ^ Mark all the unread messages in a stream as read.  -}
  , markTopicAsRead :: Maybe Int -> Maybe Text -> m JsonSuccess{- ^ Mark all the unread messages in a topic as read.  -}
  , removeReaction :: Int -> Maybe Text -> Maybe Text -> Maybe Text -> m JsonSuccess{- ^ Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions`  -}
  , renderMessage :: Maybe Text -> m JsonSuccessBase{- ^ Render a message to HTML.  `POST {{ api_url }}/v1/messages/render`  -}
  , sendMessage :: Maybe Text -> Maybe [Int] -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m JsonSuccessBase{- ^ Send a stream or a private message.  `POST {{ api_url }}/v1/messages`  -}
  , updateMessage :: Int -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Int -> m JsonSuccess{- ^ Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion  -}
  , updateMessageFlags :: Maybe [Int] -> Maybe Text -> Maybe Text -> m JsonSuccessBase{- ^ Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read).  -}
  , uploadFile :: FormUploadFile -> m JsonSuccessBase{- ^ Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message  -}
  , deleteQueue :: Maybe Text -> m JsonSuccess{- ^ Delete a previously registered queue.  `DELETE {{ api_url }}/v1/events`  -}
  , getEvents :: Maybe Text -> Maybe Int -> Maybe Bool -> m JsonSuccessBase{- ^ `GET {{ api_url }}/v1/events`  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the `event_queue_longpoll_timeout_seconds` property returned by `POST /register` as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases.  -}
  , realTimePost :: Maybe [Text] -> Maybe [[Text]] -> Maybe Bool -> m NoContent{- ^ (Ignored)  -}
  , registerQueue :: Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe [Text] -> Maybe Bool -> Maybe Bool -> Maybe Value -> Maybe [Text] -> Maybe [[Text]] -> m JsonSuccessBase{- ^ `POST {{ api_url }}/v1/register`  This powerful endpoint can be used to register a Zulip \"event queue\" (subscribed to certain types of \"events\", or updates to the messages and other Zulip data the current user has access to), as well as to fetch the current state of that data.  (`register` also powers the `call_on_each_event` Python API, and is intended primarily for complex applications for which the more convenient `call_on_each_event` API is insufficient).  This endpoint returns a `queue_id` and a `last_event_id`; these can be used in subsequent calls to the [\"events\" endpoint](/api/get-events) to request events from the Zulip server using long-polling.  The server will queue events for up to 10 minutes of inactivity. After 10 minutes, your event queue will be garbage-collected.  The server will send `heartbeat` events every minute, which makes it easy to implement a robust client that does not miss events unless the client loses network connectivity with the Zulip server for 10 minutes or longer.  Once the server garbage-collects your event queue, the server will [return an error](/api/get-events#bad_event_queue_id-errors) with a code of `BAD_EVENT_QUEUE_ID` if you try to fetch events from the event queue.  Your software will need to handle that error condition by re-initializing itself (e.g. this is what triggers your browser reloading the Zulip web app when your laptop comes back online after being offline for more than 10 minutes).  When prototyping with this API, we recommend first calling `register` with no `event_types` parameter to see all the available data from all supported event types.  Before using your client in production, you should set appropriate `event_types` and `fetch_event_types` filters so that your client only requests the data it needs.  A few minutes doing this often saves 90% of the total bandwidth and other resources consumed by a client using this API.  See the [events system developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/events-system.html) if you need deeper details about how the Zulip event queue system works, avoids clients needing to worry about large classes of potentially messy races, etc.  -}
  , restErrorHandling :: m NoContent{- ^ Common error to many endpoints  -}
  , addCodePlayground :: Maybe Text -> Maybe Text -> Maybe Text -> m JsonSuccessBase{- ^ Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57).  -}
  , addLinkifier :: Maybe Text -> Maybe Text -> m JsonSuccessBase{- ^ Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters`  -}
  , createCustomProfileField :: Maybe Text -> Maybe Text -> Maybe Int -> Maybe Value -> m JsonSuccessBase{- ^ [Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields`  -}
  , getCustomEmoji :: m JsonSuccessBase{- ^ Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji`  -}
  , getCustomProfileFields :: m JsonSuccessBase{- ^ Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields`  -}
  , getLinkifiers :: m JsonSuccessBase{- ^ List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format.  -}
  , getServerSettings :: m JsonSuccessBase{- ^ Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available).  -}
  , removeCodePlayground :: Int -> m JsonSuccess{- ^ Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49).  -}
  , removeLinkifier :: Int -> m JsonSuccess{- ^ Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}`  -}
  , reorderCustomProfileFields :: Maybe [Int] -> m JsonSuccess{- ^ Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields).  -}
  , updateLinkifier :: Int -> Maybe Text -> Maybe Text -> m JsonSuccess{- ^ Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57).  -}
  , uploadCustomEmoji :: Text -> FormUploadCustomEmoji -> m JsonSuccess{- ^ This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}`  -}
  , archiveStream :: Int -> m JsonSuccess{- ^ [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}`  -}
  , createBigBlueButtonVideoCall :: m JsonSuccessBase{- ^ Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server.  -}
  , deleteTopic :: Int -> Maybe Text -> m JsonSuccess{- ^ Delete all messages in a topic.  `POST {{ api_url }}/v1/streams/{stream_id}/delete_topic`  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip.  -}
  , getStreamId :: Maybe Text -> m JsonSuccessBase{- ^ Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id`  -}
  , getStreamTopics :: Int -> m JsonSuccessBase{- ^ Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics`  -}
  , getStreams :: Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> m JsonSuccessBase{- ^ Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams`  -}
  , getSubscribers :: Int -> m JsonSuccessBase{- ^ Get all users subscribed to a stream.  `Get {{ api_url }}/v1/streams/{stream_id}/members`  -}
  , getSubscriptionStatus :: Int -> Int -> m JsonSuccessBase{- ^ Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11).  -}
  , getSubscriptions :: Maybe Bool -> m JsonSuccessBase{- ^ Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions`  -}
  , muteTopic :: Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> m JsonSuccess{- ^ This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics`  -}
  , subscribe :: Maybe [Value] -> Maybe [OneOf<string,integer>] -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Int -> Maybe OneOf<string,integer> -> m OneOf<object,object>{- ^ Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below.  -}
  , unsubscribe :: Maybe [Text] -> Maybe [OneOf<string,integer>] -> m JsonSuccessBase{- ^ Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions`  -}
  , updateStream :: Int -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Int -> Maybe Bool -> Maybe OneOf<string,integer> -> m JsonSuccess{- ^ Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}`  -}
  , updateSubscriptionSettings :: Maybe [Value] -> m JsonSuccessBase{- ^ This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties`  -}
  , updateSubscriptions :: Maybe [Text] -> Maybe [Value] -> m JsonSuccessBase{- ^ Update which streams you are are subscribed to.  -}
  , createUser :: Maybe Text -> Maybe Text -> Maybe Text -> m JsonSuccessBase{- ^ {!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users`  -}
  , createUserGroup :: Maybe Text -> Maybe Text -> Maybe [Int] -> m JsonSuccess{- ^ Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create`  -}
  , deactivateOwnUser :: m JsonSuccess{- ^ Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI.  -}
  , deactivateUser :: Int -> m JsonSuccess{- ^ [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}`  -}
  , getAttachments :: m JsonSuccessBase{- ^ Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments`  -}
  , getOwnUser :: m JsonSuccessBase{- ^ Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me`  -}
  , getUser :: Int -> Maybe Bool -> Maybe Bool -> m JsonSuccessBase{- ^ Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).*  -}
  , getUserByEmail :: Text -> Maybe Bool -> Maybe Bool -> m JsonSuccessBase{- ^ Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).*  -}
  , getUserGroups :: m JsonSuccessBase{- ^ {!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups`  -}
  , getUserPresence :: Text -> m JsonSuccessBase{- ^ Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip.  -}
  , getUsers :: Maybe Bool -> Maybe Bool -> m JsonSuccessBase{- ^ Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user).  -}
  , muteUser :: Int -> m JsonSuccess{- ^ This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48).  -}
  , reactivateUser :: Int -> m Value{- ^ [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate`  -}
  , removeUserGroup :: Int -> m JsonSuccess{- ^ Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}`  -}
  , setTypingStatus :: Maybe Text -> Maybe Text -> Maybe [Int] -> Maybe Text -> m JsonSuccess{- ^ Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol.  -}
  , unmuteUser :: Int -> m JsonSuccess{- ^ This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48).  -}
  , updateSettings :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Bool -> m JsonSuccessBase{- ^ This endpoint is used to edit the current user's settings.  `PATCH {{ api_url }}/v1/settings`  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the `full_name`, `email`, `old_password`, and `new_password` parameters. Notification settings were managed by `PATCH /settings/notifications`, and all other settings by `PATCH /settings/display`. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for `/settings` in Zulip 5.0 (feature level 78).  The `/settings/display` and `/settings/notifications` endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint.  -}
  , updateStatus :: Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> m JsonSuccess{- ^ Change your [status](/help/status-and-availability).  `POST {{ api_url }}/v1/users/me/status`  A request to this endpoint will only change the parameters passed. For example, passing just `status_text` requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user's status to a specific value should pass all supported parameters.  -}
  , updateUser :: Int -> Maybe Text -> Maybe Int -> Maybe [Value] -> m JsonSuccess{- ^ Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields).  -}
  , updateUserGroup :: Int -> Maybe Text -> Maybe Text -> m JsonSuccess{- ^ Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}`  -}
  , updateUserGroupMembers :: Int -> Maybe [Int] -> Maybe [Int] -> m JsonSuccess{- ^ Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members`  -}
  , zulipOutgoingWebhooks :: m InlineResponse200{- ^ Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip.  -}
  }

newtype ZulipRESTClient a = ZulipRESTClient
  { runClient :: ClientEnv -> ExceptT ClientError IO a
  } deriving Functor

instance Applicative ZulipRESTClient where
  pure x = ZulipRESTClient (\_ -> pure x)
  (ZulipRESTClient f) <*> (ZulipRESTClient x) =
    ZulipRESTClient (\env -> f env <*> x env)

instance Monad ZulipRESTClient where
  (ZulipRESTClient a) >>= f =
    ZulipRESTClient (\env -> do
      value <- a env
      runClient (f value) env)

instance MonadIO ZulipRESTClient where
  liftIO io = ZulipRESTClient (\_ -> liftIO io)

createZulipRESTClient :: ZulipRESTBackend ZulipRESTClient
createZulipRESTClient = ZulipRESTBackend{..}
  where
    ((coerce -> devFetchApiKey) :<|>
     (coerce -> fetchApiKey) :<|>
     (coerce -> createDrafts) :<|>
     (coerce -> deleteDraft) :<|>
     (coerce -> editDraft) :<|>
     (coerce -> getDrafts) :<|>
     (coerce -> addReaction) :<|>
     (coerce -> checkMessagesMatchNarrow) :<|>
     (coerce -> deleteMessage) :<|>
     (coerce -> getFileTemporaryUrl) :<|>
     (coerce -> getMessageHistory) :<|>
     (coerce -> getMessages) :<|>
     (coerce -> getRawMessage) :<|>
     (coerce -> markAllAsRead) :<|>
     (coerce -> markStreamAsRead) :<|>
     (coerce -> markTopicAsRead) :<|>
     (coerce -> removeReaction) :<|>
     (coerce -> renderMessage) :<|>
     (coerce -> sendMessage) :<|>
     (coerce -> updateMessage) :<|>
     (coerce -> updateMessageFlags) :<|>
     (coerce -> uploadFile) :<|>
     (coerce -> deleteQueue) :<|>
     (coerce -> getEvents) :<|>
     (coerce -> realTimePost) :<|>
     (coerce -> registerQueue) :<|>
     (coerce -> restErrorHandling) :<|>
     (coerce -> addCodePlayground) :<|>
     (coerce -> addLinkifier) :<|>
     (coerce -> createCustomProfileField) :<|>
     (coerce -> getCustomEmoji) :<|>
     (coerce -> getCustomProfileFields) :<|>
     (coerce -> getLinkifiers) :<|>
     (coerce -> getServerSettings) :<|>
     (coerce -> removeCodePlayground) :<|>
     (coerce -> removeLinkifier) :<|>
     (coerce -> reorderCustomProfileFields) :<|>
     (coerce -> updateLinkifier) :<|>
     (coerce -> uploadCustomEmoji) :<|>
     (coerce -> archiveStream) :<|>
     (coerce -> createBigBlueButtonVideoCall) :<|>
     (coerce -> deleteTopic) :<|>
     (coerce -> getStreamId) :<|>
     (coerce -> getStreamTopics) :<|>
     (coerce -> getStreams) :<|>
     (coerce -> getSubscribers) :<|>
     (coerce -> getSubscriptionStatus) :<|>
     (coerce -> getSubscriptions) :<|>
     (coerce -> muteTopic) :<|>
     (coerce -> subscribe) :<|>
     (coerce -> unsubscribe) :<|>
     (coerce -> updateStream) :<|>
     (coerce -> updateSubscriptionSettings) :<|>
     (coerce -> updateSubscriptions) :<|>
     (coerce -> createUser) :<|>
     (coerce -> createUserGroup) :<|>
     (coerce -> deactivateOwnUser) :<|>
     (coerce -> deactivateUser) :<|>
     (coerce -> getAttachments) :<|>
     (coerce -> getOwnUser) :<|>
     (coerce -> getUser) :<|>
     (coerce -> getUserByEmail) :<|>
     (coerce -> getUserGroups) :<|>
     (coerce -> getUserPresence) :<|>
     (coerce -> getUsers) :<|>
     (coerce -> muteUser) :<|>
     (coerce -> reactivateUser) :<|>
     (coerce -> removeUserGroup) :<|>
     (coerce -> setTypingStatus) :<|>
     (coerce -> unmuteUser) :<|>
     (coerce -> updateSettings) :<|>
     (coerce -> updateStatus) :<|>
     (coerce -> updateUser) :<|>
     (coerce -> updateUserGroup) :<|>
     (coerce -> updateUserGroupMembers) :<|>
     (coerce -> zulipOutgoingWebhooks) :<|>
     _) = client (Proxy :: Proxy ZulipRESTAPI)

-- | Run requests in the ZulipRESTClient monad.
runZulipRESTClient :: Config -> ZulipRESTClient a -> ExceptT ClientError IO a
runZulipRESTClient clientConfig cl = do
  manager <- liftIO $ newManager tlsManagerSettings
  runZulipRESTClientWithManager manager clientConfig cl

-- | Run requests in the ZulipRESTClient monad using a custom manager.
runZulipRESTClientWithManager :: Manager -> Config -> ZulipRESTClient a -> ExceptT ClientError IO a
runZulipRESTClientWithManager manager Config{..} cl = do
  url <- parseBaseUrl configUrl
  runClient cl $ mkClientEnv manager url

-- | Like @runClient@, but returns the response or throws
--   a ZulipRESTClientError
callZulipREST
  :: (MonadIO m, MonadThrow m)
  => ClientEnv -> ZulipRESTClient a -> m a
callZulipREST env f = do
  res <- liftIO $ runExceptT $ runClient f env
  case res of
    Left err       -> throwM (ZulipRESTClientError err)
    Right response -> pure response


requestMiddlewareId :: Application -> Application
requestMiddlewareId a = a

-- | Run the ZulipREST server at the provided host and port.
runZulipRESTServer
  :: (MonadIO m, MonadThrow m)
  => Config -> ZulipRESTBackend (ExceptT ServerError IO) -> m ()
runZulipRESTServer config backend = runZulipRESTMiddlewareServer config requestMiddlewareId backend

-- | Run the ZulipREST server at the provided host and port.
runZulipRESTMiddlewareServer
  :: (MonadIO m, MonadThrow m)
  => Config -> Middleware -> ZulipRESTBackend (ExceptT ServerError IO) -> m ()
runZulipRESTMiddlewareServer Config{..} middleware backend = do
  url <- parseBaseUrl configUrl
  let warpSettings = Warp.defaultSettings
        & Warp.setPort (baseUrlPort url)
        & Warp.setHost (fromString $ baseUrlHost url)
  liftIO $ Warp.runSettings warpSettings $ middleware $ serve (Proxy :: Proxy ZulipRESTAPI) (serverFromBackend backend)
  where
    serverFromBackend ZulipRESTBackend{..} =
      (coerce devFetchApiKey :<|>
       coerce fetchApiKey :<|>
       coerce createDrafts :<|>
       coerce deleteDraft :<|>
       coerce editDraft :<|>
       coerce getDrafts :<|>
       coerce addReaction :<|>
       coerce checkMessagesMatchNarrow :<|>
       coerce deleteMessage :<|>
       coerce getFileTemporaryUrl :<|>
       coerce getMessageHistory :<|>
       coerce getMessages :<|>
       coerce getRawMessage :<|>
       coerce markAllAsRead :<|>
       coerce markStreamAsRead :<|>
       coerce markTopicAsRead :<|>
       coerce removeReaction :<|>
       coerce renderMessage :<|>
       coerce sendMessage :<|>
       coerce updateMessage :<|>
       coerce updateMessageFlags :<|>
       coerce uploadFile :<|>
       coerce deleteQueue :<|>
       coerce getEvents :<|>
       coerce realTimePost :<|>
       coerce registerQueue :<|>
       coerce restErrorHandling :<|>
       coerce addCodePlayground :<|>
       coerce addLinkifier :<|>
       coerce createCustomProfileField :<|>
       coerce getCustomEmoji :<|>
       coerce getCustomProfileFields :<|>
       coerce getLinkifiers :<|>
       coerce getServerSettings :<|>
       coerce removeCodePlayground :<|>
       coerce removeLinkifier :<|>
       coerce reorderCustomProfileFields :<|>
       coerce updateLinkifier :<|>
       coerce uploadCustomEmoji :<|>
       coerce archiveStream :<|>
       coerce createBigBlueButtonVideoCall :<|>
       coerce deleteTopic :<|>
       coerce getStreamId :<|>
       coerce getStreamTopics :<|>
       coerce getStreams :<|>
       coerce getSubscribers :<|>
       coerce getSubscriptionStatus :<|>
       coerce getSubscriptions :<|>
       coerce muteTopic :<|>
       coerce subscribe :<|>
       coerce unsubscribe :<|>
       coerce updateStream :<|>
       coerce updateSubscriptionSettings :<|>
       coerce updateSubscriptions :<|>
       coerce createUser :<|>
       coerce createUserGroup :<|>
       coerce deactivateOwnUser :<|>
       coerce deactivateUser :<|>
       coerce getAttachments :<|>
       coerce getOwnUser :<|>
       coerce getUser :<|>
       coerce getUserByEmail :<|>
       coerce getUserGroups :<|>
       coerce getUserPresence :<|>
       coerce getUsers :<|>
       coerce muteUser :<|>
       coerce reactivateUser :<|>
       coerce removeUserGroup :<|>
       coerce setTypingStatus :<|>
       coerce unmuteUser :<|>
       coerce updateSettings :<|>
       coerce updateStatus :<|>
       coerce updateUser :<|>
       coerce updateUserGroup :<|>
       coerce updateUserGroupMembers :<|>
       coerce zulipOutgoingWebhooks :<|>
       serveDirectoryFileServer "static")
