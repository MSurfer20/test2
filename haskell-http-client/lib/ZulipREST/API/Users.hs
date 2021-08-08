{-
   Zulip REST API

   Powerful open source group chat 

   OpenAPI Version: 3.0.1
   Zulip REST API API version: 1.0.0
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : ZulipREST.API.Users
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module ZulipREST.API.Users where

import ZulipREST.Core
import ZulipREST.MimeTypes
import ZulipREST.Model as M

import qualified Data.Aeson as A
import qualified Data.ByteString as B
import qualified Data.ByteString.Lazy as BL
import qualified Data.Data as P (Typeable, TypeRep, typeOf, typeRep)
import qualified Data.Foldable as P
import qualified Data.Map as Map
import qualified Data.Maybe as P
import qualified Data.Proxy as P (Proxy(..))
import qualified Data.Set as Set
import qualified Data.String as P
import qualified Data.Text as T
import qualified Data.Text.Encoding as T
import qualified Data.Text.Lazy as TL
import qualified Data.Text.Lazy.Encoding as TL
import qualified Data.Time as TI
import qualified Network.HTTP.Client.MultipartFormData as NH
import qualified Network.HTTP.Media as ME
import qualified Network.HTTP.Types as NH
import qualified Web.FormUrlEncoded as WH
import qualified Web.HttpApiData as WH

import Data.Text (Text)
import GHC.Base ((<|>))

import Prelude ((==),(/=),($), (.),(<$>),(<*>),(>>=),Maybe(..),Bool(..),Char,Double,FilePath,Float,Int,Integer,String,fmap,undefined,mempty,maybe,pure,Monad,Applicative,Functor)
import qualified Prelude as P

-- * Operations


-- ** Users

-- *** createUser

-- | @POST \/users@
-- 
-- Create a user
-- 
-- {!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 
-- 
createUser 
  :: Email -- ^ "email" -  The email address of the new user. 
  -> Password -- ^ "password" -  The password of the new user. 
  -> FullName -- ^ "fullName" -  The full name of the new user. 
  -> ZulipRESTRequest CreateUser MimeNoContent JsonSuccessBase MimeJSON
createUser (Email email) (Password password) (FullName fullName) =
  _mkRequest "POST" ["/users"]
    `addQuery` toQuery ("email", Just email)
    `addQuery` toQuery ("password", Just password)
    `addQuery` toQuery ("full_name", Just fullName)

data CreateUser  
-- | @application/json@
instance Produces CreateUser MimeJSON


-- *** createUserGroup

-- | @POST \/user_groups\/create@
-- 
-- Create a user group
-- 
-- Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 
-- 
createUserGroup 
  :: Name -- ^ "name" -  The name of the user group. 
  -> Description -- ^ "description" -  The description of the user group. 
  -> Members -- ^ "members" -  An array containing the user IDs of the initial members for the new user group. 
  -> ZulipRESTRequest CreateUserGroup MimeNoContent JsonSuccess MimeJSON
createUserGroup (Name name) (Description description) (Members members) =
  _mkRequest "POST" ["/user_groups/create"]
    `addQuery` toQuery ("name", Just name)
    `addQuery` toQuery ("description", Just description)
    `addQuery` toQueryColl MultiParamArray ("members", Just members)

data CreateUserGroup  
-- | @application/json@
instance Produces CreateUserGroup MimeJSON


-- *** deactivateOwnUser

-- | @DELETE \/users\/me@
-- 
-- Deactivate own user
-- 
-- Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
-- 
deactivateOwnUser 
  :: ZulipRESTRequest DeactivateOwnUser MimeNoContent JsonSuccess MimeJSON
deactivateOwnUser =
  _mkRequest "DELETE" ["/users/me"]

data DeactivateOwnUser  
-- | @application/json@
instance Produces DeactivateOwnUser MimeJSON


-- *** deactivateUser

-- | @DELETE \/users\/{user_id}@
-- 
-- Deactivate a user
-- 
-- [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 
-- 
deactivateUser 
  :: UserId -- ^ "userId" -  The target user's ID. 
  -> ZulipRESTRequest DeactivateUser MimeNoContent JsonSuccess MimeJSON
deactivateUser (UserId userId) =
  _mkRequest "DELETE" ["/users/",toPath userId]

data DeactivateUser  
-- | @application/json@
instance Produces DeactivateUser MimeJSON


-- *** getAttachments

-- | @GET \/attachments@
-- 
-- Get attachments
-- 
-- Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 
-- 
getAttachments 
  :: ZulipRESTRequest GetAttachments MimeNoContent JsonSuccessBase MimeJSON
getAttachments =
  _mkRequest "GET" ["/attachments"]

data GetAttachments  
-- | @application/json@
instance Produces GetAttachments MimeJSON


-- *** getOwnUser

-- | @GET \/users\/me@
-- 
-- Get own user
-- 
-- Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 
-- 
getOwnUser 
  :: ZulipRESTRequest GetOwnUser MimeNoContent JsonSuccessBase MimeJSON
getOwnUser =
  _mkRequest "GET" ["/users/me"]

data GetOwnUser  
-- | @application/json@
instance Produces GetOwnUser MimeJSON


-- *** getUser

-- | @GET \/users\/{user_id}@
-- 
-- Get a user
-- 
-- Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
-- 
getUser 
  :: UserId -- ^ "userId" -  The target user's ID. 
  -> ZulipRESTRequest GetUser MimeNoContent JsonSuccessBase MimeJSON
getUser (UserId userId) =
  _mkRequest "GET" ["/users/",toPath userId]

data GetUser  

-- | /Optional Param/ "client_gravatar" - Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
instance HasOptionalParam GetUser ClientGravatar where
  applyOptionalParam req (ClientGravatar xs) =
    req `addQuery` toQuery ("client_gravatar", Just xs)

-- | /Optional Param/ "include_custom_profile_fields" - Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
instance HasOptionalParam GetUser IncludeCustomProfileFields where
  applyOptionalParam req (IncludeCustomProfileFields xs) =
    req `addQuery` toQuery ("include_custom_profile_fields", Just xs)
-- | @application/json@
instance Produces GetUser MimeJSON


-- *** getUserByEmail

-- | @GET \/users\/{email}@
-- 
-- Get a user by email
-- 
-- Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
-- 
getUserByEmail 
  :: Email -- ^ "email" -  The email address of the user whose details you want to fetch. 
  -> ZulipRESTRequest GetUserByEmail MimeNoContent JsonSuccessBase MimeJSON
getUserByEmail (Email email) =
  _mkRequest "GET" ["/users/",toPath email]

data GetUserByEmail  

-- | /Optional Param/ "client_gravatar" - Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
instance HasOptionalParam GetUserByEmail ClientGravatar where
  applyOptionalParam req (ClientGravatar xs) =
    req `addQuery` toQuery ("client_gravatar", Just xs)

-- | /Optional Param/ "include_custom_profile_fields" - Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
instance HasOptionalParam GetUserByEmail IncludeCustomProfileFields where
  applyOptionalParam req (IncludeCustomProfileFields xs) =
    req `addQuery` toQuery ("include_custom_profile_fields", Just xs)
-- | @application/json@
instance Produces GetUserByEmail MimeJSON


-- *** getUserGroups

-- | @GET \/user_groups@
-- 
-- Get user groups
-- 
-- {!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 
-- 
getUserGroups 
  :: ZulipRESTRequest GetUserGroups MimeNoContent JsonSuccessBase MimeJSON
getUserGroups =
  _mkRequest "GET" ["/user_groups"]

data GetUserGroups  
-- | @application/json@
instance Produces GetUserGroups MimeJSON


-- *** getUserPresence

-- | @GET \/users\/{user_id_or_email}\/presence@
-- 
-- Get user presence
-- 
-- Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
-- 
getUserPresence 
  :: UserIdOrEmail -- ^ "userIdOrEmail" -  The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. 
  -> ZulipRESTRequest GetUserPresence MimeNoContent JsonSuccessBase MimeJSON
getUserPresence (UserIdOrEmail userIdOrEmail) =
  _mkRequest "GET" ["/users/",toPath userIdOrEmail,"/presence"]

data GetUserPresence  
-- | @application/json@
instance Produces GetUserPresence MimeJSON


-- *** getUsers

-- | @GET \/users@
-- 
-- Get all users
-- 
-- Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 
-- 
getUsers 
  :: ZulipRESTRequest GetUsers MimeNoContent JsonSuccessBase MimeJSON
getUsers =
  _mkRequest "GET" ["/users"]

data GetUsers  

-- | /Optional Param/ "client_gravatar" - Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
instance HasOptionalParam GetUsers ClientGravatar where
  applyOptionalParam req (ClientGravatar xs) =
    req `addQuery` toQuery ("client_gravatar", Just xs)

-- | /Optional Param/ "include_custom_profile_fields" - Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
instance HasOptionalParam GetUsers IncludeCustomProfileFields where
  applyOptionalParam req (IncludeCustomProfileFields xs) =
    req `addQuery` toQuery ("include_custom_profile_fields", Just xs)
-- | @application/json@
instance Produces GetUsers MimeJSON


-- *** muteUser

-- | @POST \/users\/me\/muted_users\/{muted_user_id}@
-- 
-- Mute a user
-- 
-- This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
-- 
muteUser 
  :: MutedUserId -- ^ "mutedUserId" -  The ID of the user to mute/un-mute. 
  -> ZulipRESTRequest MuteUser MimeNoContent JsonSuccess MimeJSON
muteUser (MutedUserId mutedUserId) =
  _mkRequest "POST" ["/users/me/muted_users/",toPath mutedUserId]

data MuteUser  
-- | @application/json@
instance Produces MuteUser MimeJSON


-- *** reactivateUser

-- | @POST \/users\/{user_id}\/reactivate@
-- 
-- Reactivate a user
-- 
-- [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 
-- 
reactivateUser 
  :: UserId -- ^ "userId" -  The target user's ID. 
  -> ZulipRESTRequest ReactivateUser MimeNoContent AnyType MimeJSON
reactivateUser (UserId userId) =
  _mkRequest "POST" ["/users/",toPath userId,"/reactivate"]

data ReactivateUser  
-- | @application/json@
instance Produces ReactivateUser MimeJSON


-- *** removeUserGroup

-- | @DELETE \/user_groups\/{user_group_id}@
-- 
-- Delete a user group
-- 
-- Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 
-- 
removeUserGroup 
  :: UserGroupId -- ^ "userGroupId" -  The ID of the target user group. 
  -> ZulipRESTRequest RemoveUserGroup MimeNoContent JsonSuccess MimeJSON
removeUserGroup (UserGroupId userGroupId) =
  _mkRequest "DELETE" ["/user_groups/",toPath userGroupId]

data RemoveUserGroup  
-- | @application/json@
instance Produces RemoveUserGroup MimeJSON


-- *** setTypingStatus

-- | @POST \/typing@
-- 
-- Set \"typing\" status
-- 
-- Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 
-- 
setTypingStatus 
  :: Op2 -- ^ "op" -  Whether the user has started (`start`) or stopped (`stop`) to type. 
  -> To -- ^ "to" -  For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). 
  -> ZulipRESTRequest SetTypingStatus MimeNoContent JsonSuccess MimeJSON
setTypingStatus (Op2 op) (To to) =
  _mkRequest "POST" ["/typing"]
    `addQuery` toQuery ("op", Just op)
    `addQuery` toQueryColl MultiParamArray ("to", Just to)

data SetTypingStatus  

-- | /Optional Param/ "type" - Type of the message being composed. 
instance HasOptionalParam SetTypingStatus ParamType where
  applyOptionalParam req (ParamType xs) =
    req `addQuery` toQuery ("type", Just xs)

-- | /Optional Param/ "topic" - Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type. 
instance HasOptionalParam SetTypingStatus Topic where
  applyOptionalParam req (Topic xs) =
    req `addQuery` toQuery ("topic", Just xs)
-- | @application/json@
instance Produces SetTypingStatus MimeJSON


-- *** unmuteUser

-- | @DELETE \/users\/me\/muted_users\/{muted_user_id}@
-- 
-- Unmute a user
-- 
-- This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 
-- 
unmuteUser 
  :: MutedUserId -- ^ "mutedUserId" -  The ID of the user to mute/un-mute. 
  -> ZulipRESTRequest UnmuteUser MimeNoContent JsonSuccess MimeJSON
unmuteUser (MutedUserId mutedUserId) =
  _mkRequest "DELETE" ["/users/me/muted_users/",toPath mutedUserId]

data UnmuteUser  
-- | @application/json@
instance Produces UnmuteUser MimeJSON


-- *** updateDisplaySettings

-- | @PATCH \/settings\/display@
-- 
-- Update display settings
-- 
-- This endpoint is used to edit the current user's user interface settings.  `PATCH {{ api_url }}/v1/settings/display` 
-- 
updateDisplaySettings 
  :: ZulipRESTRequest UpdateDisplaySettings MimeNoContent JsonSuccessBase MimeJSON
updateDisplaySettings =
  _mkRequest "PATCH" ["/settings/display"]

data UpdateDisplaySettings  

-- | /Optional Param/ "twenty_four_hour_time" - Whether time should be [displayed in 24-hour notation](/help/change-the-time-format). 
instance HasOptionalParam UpdateDisplaySettings TwentyFourHourTime where
  applyOptionalParam req (TwentyFourHourTime xs) =
    req `addQuery` toQuery ("twenty_four_hour_time", Just xs)

-- | /Optional Param/ "dense_mode" - This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip. 
instance HasOptionalParam UpdateDisplaySettings DenseMode where
  applyOptionalParam req (DenseMode xs) =
    req `addQuery` toQuery ("dense_mode", Just xs)

-- | /Optional Param/ "starred_message_counts" - Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages). 
instance HasOptionalParam UpdateDisplaySettings StarredMessageCounts where
  applyOptionalParam req (StarredMessageCounts xs) =
    req `addQuery` toQuery ("starred_message_counts", Just xs)

-- | /Optional Param/ "fluid_layout_width" - Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens. 
instance HasOptionalParam UpdateDisplaySettings FluidLayoutWidth where
  applyOptionalParam req (FluidLayoutWidth xs) =
    req `addQuery` toQuery ("fluid_layout_width", Just xs)

-- | /Optional Param/ "high_contrast_mode" - This setting is reserved for use to control variations in Zulip's design to help visually impaired users. 
instance HasOptionalParam UpdateDisplaySettings HighContrastMode where
  applyOptionalParam req (HighContrastMode xs) =
    req `addQuery` toQuery ("high_contrast_mode", Just xs)

-- | /Optional Param/ "color_scheme" - Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query. 
instance HasOptionalParam UpdateDisplaySettings ColorScheme where
  applyOptionalParam req (ColorScheme xs) =
    req `addQuery` toQuery ("color_scheme", Just xs)

-- | /Optional Param/ "translate_emoticons" - Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends. 
instance HasOptionalParam UpdateDisplaySettings TranslateEmoticons where
  applyOptionalParam req (TranslateEmoticons xs) =
    req `addQuery` toQuery ("translate_emoticons", Just xs)

-- | /Optional Param/ "default_language" - What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). 
instance HasOptionalParam UpdateDisplaySettings DefaultLanguage where
  applyOptionalParam req (DefaultLanguage xs) =
    req `addQuery` toQuery ("default_language", Just xs)

-- | /Optional Param/ "default_view" - The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
instance HasOptionalParam UpdateDisplaySettings DefaultView where
  applyOptionalParam req (DefaultView xs) =
    req `addQuery` toQuery ("default_view", Just xs)

-- | /Optional Param/ "left_side_userlist" - Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked. 
instance HasOptionalParam UpdateDisplaySettings LeftSideUserlist where
  applyOptionalParam req (LeftSideUserlist xs) =
    req `addQuery` toQuery ("left_side_userlist", Just xs)

-- | /Optional Param/ "emojiset" - The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
instance HasOptionalParam UpdateDisplaySettings Emojiset where
  applyOptionalParam req (Emojiset xs) =
    req `addQuery` toQuery ("emojiset", Just xs)

-- | /Optional Param/ "demote_inactive_streams" - Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never 
instance HasOptionalParam UpdateDisplaySettings DemoteInactiveStreams where
  applyOptionalParam req (DemoteInactiveStreams xs) =
    req `addQuery` toQuery ("demote_inactive_streams", Just xs)

-- | /Optional Param/ "timezone" - The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
instance HasOptionalParam UpdateDisplaySettings Timezone where
  applyOptionalParam req (Timezone xs) =
    req `addQuery` toQuery ("timezone", Just xs)
-- | @application/json@
instance Produces UpdateDisplaySettings MimeJSON


-- *** updateNotificationSettings

-- | @PATCH \/settings\/notifications@
-- 
-- Update notification settings
-- 
-- This endpoint is used to edit the user's global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  `PATCH {{ api_url }}/v1/settings/notifications` 
-- 
updateNotificationSettings 
  :: ZulipRESTRequest UpdateNotificationSettings MimeNoContent JsonSuccessBase MimeJSON
updateNotificationSettings =
  _mkRequest "PATCH" ["/settings/notifications"]

data UpdateNotificationSettings  

-- | /Optional Param/ "enable_stream_desktop_notifications" - Enable visual desktop notifications for stream messages. 
instance HasOptionalParam UpdateNotificationSettings EnableStreamDesktopNotifications where
  applyOptionalParam req (EnableStreamDesktopNotifications xs) =
    req `addQuery` toQuery ("enable_stream_desktop_notifications", Just xs)

-- | /Optional Param/ "enable_stream_email_notifications" - Enable email notifications for stream messages. 
instance HasOptionalParam UpdateNotificationSettings EnableStreamEmailNotifications where
  applyOptionalParam req (EnableStreamEmailNotifications xs) =
    req `addQuery` toQuery ("enable_stream_email_notifications", Just xs)

-- | /Optional Param/ "enable_stream_push_notifications" - Enable mobile notifications for stream messages. 
instance HasOptionalParam UpdateNotificationSettings EnableStreamPushNotifications where
  applyOptionalParam req (EnableStreamPushNotifications xs) =
    req `addQuery` toQuery ("enable_stream_push_notifications", Just xs)

-- | /Optional Param/ "enable_stream_audible_notifications" - Enable audible desktop notifications for stream messages. 
instance HasOptionalParam UpdateNotificationSettings EnableStreamAudibleNotifications where
  applyOptionalParam req (EnableStreamAudibleNotifications xs) =
    req `addQuery` toQuery ("enable_stream_audible_notifications", Just xs)

-- | /Optional Param/ "notification_sound" - Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). 
instance HasOptionalParam UpdateNotificationSettings NotificationSound where
  applyOptionalParam req (NotificationSound xs) =
    req `addQuery` toQuery ("notification_sound", Just xs)

-- | /Optional Param/ "enable_desktop_notifications" - Enable visual desktop notifications for private messages and @-mentions. 
instance HasOptionalParam UpdateNotificationSettings EnableDesktopNotifications where
  applyOptionalParam req (EnableDesktopNotifications xs) =
    req `addQuery` toQuery ("enable_desktop_notifications", Just xs)

-- | /Optional Param/ "enable_sounds" - Enable audible desktop notifications for private messages and @-mentions. 
instance HasOptionalParam UpdateNotificationSettings EnableSounds where
  applyOptionalParam req (EnableSounds xs) =
    req `addQuery` toQuery ("enable_sounds", Just xs)

-- | /Optional Param/ "enable_offline_email_notifications" - Enable email notifications for private messages and @-mentions received when the user is offline. 
instance HasOptionalParam UpdateNotificationSettings EnableOfflineEmailNotifications where
  applyOptionalParam req (EnableOfflineEmailNotifications xs) =
    req `addQuery` toQuery ("enable_offline_email_notifications", Just xs)

-- | /Optional Param/ "enable_offline_push_notifications" - Enable mobile notification for private messages and @-mentions received when the user is offline. 
instance HasOptionalParam UpdateNotificationSettings EnableOfflinePushNotifications where
  applyOptionalParam req (EnableOfflinePushNotifications xs) =
    req `addQuery` toQuery ("enable_offline_push_notifications", Just xs)

-- | /Optional Param/ "enable_online_push_notifications" - Enable mobile notification for private messages and @-mentions received when the user is online. 
instance HasOptionalParam UpdateNotificationSettings EnableOnlinePushNotifications where
  applyOptionalParam req (EnableOnlinePushNotifications xs) =
    req `addQuery` toQuery ("enable_online_push_notifications", Just xs)

-- | /Optional Param/ "enable_digest_emails" - Enable digest emails when the user is away. 
instance HasOptionalParam UpdateNotificationSettings EnableDigestEmails where
  applyOptionalParam req (EnableDigestEmails xs) =
    req `addQuery` toQuery ("enable_digest_emails", Just xs)

-- | /Optional Param/ "enable_marketing_emails" - Enable marketing emails. Has no function outside Zulip Cloud. 
instance HasOptionalParam UpdateNotificationSettings EnableMarketingEmails where
  applyOptionalParam req (EnableMarketingEmails xs) =
    req `addQuery` toQuery ("enable_marketing_emails", Just xs)

-- | /Optional Param/ "enable_login_emails" - Enable email notifications for new logins to account. 
instance HasOptionalParam UpdateNotificationSettings EnableLoginEmails where
  applyOptionalParam req (EnableLoginEmails xs) =
    req `addQuery` toQuery ("enable_login_emails", Just xs)

-- | /Optional Param/ "message_content_in_email_notifications" - Include the message's content in email notifications for new messages. 
instance HasOptionalParam UpdateNotificationSettings MessageContentInEmailNotifications where
  applyOptionalParam req (MessageContentInEmailNotifications xs) =
    req `addQuery` toQuery ("message_content_in_email_notifications", Just xs)

-- | /Optional Param/ "pm_content_in_desktop_notifications" - Include content of private messages in desktop notifications. 
instance HasOptionalParam UpdateNotificationSettings PmContentInDesktopNotifications where
  applyOptionalParam req (PmContentInDesktopNotifications xs) =
    req `addQuery` toQuery ("pm_content_in_desktop_notifications", Just xs)

-- | /Optional Param/ "wildcard_mentions_notify" - Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention. 
instance HasOptionalParam UpdateNotificationSettings WildcardMentionsNotify where
  applyOptionalParam req (WildcardMentionsNotify xs) =
    req `addQuery` toQuery ("wildcard_mentions_notify", Just xs)

-- | /Optional Param/ "desktop_icon_count_display" - Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None 
instance HasOptionalParam UpdateNotificationSettings DesktopIconCountDisplay where
  applyOptionalParam req (DesktopIconCountDisplay xs) =
    req `addQuery` toQuery ("desktop_icon_count_display", Just xs)

-- | /Optional Param/ "realm_name_in_notifications" - Include organization name in subject of message notification emails. 
instance HasOptionalParam UpdateNotificationSettings RealmNameInNotifications where
  applyOptionalParam req (RealmNameInNotifications xs) =
    req `addQuery` toQuery ("realm_name_in_notifications", Just xs)

-- | /Optional Param/ "presence_enabled" - Display the presence status to other users when online. 
instance HasOptionalParam UpdateNotificationSettings PresenceEnabled where
  applyOptionalParam req (PresenceEnabled xs) =
    req `addQuery` toQuery ("presence_enabled", Just xs)
-- | @application/json@
instance Produces UpdateNotificationSettings MimeJSON


-- *** updateUser

-- | @PATCH \/users\/{user_id}@
-- 
-- Update a user
-- 
-- Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
-- 
updateUser 
  :: UserId -- ^ "userId" -  The target user's ID. 
  -> ZulipRESTRequest UpdateUser MimeNoContent JsonSuccess MimeJSON
updateUser (UserId userId) =
  _mkRequest "PATCH" ["/users/",toPath userId]

data UpdateUser  

-- | /Optional Param/ "full_name" - The user's full name. 
instance HasOptionalParam UpdateUser FullName where
  applyOptionalParam req (FullName xs) =
    req `addQuery` toQuery ("full_name", Just xs)

-- | /Optional Param/ "role" - New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). 
instance HasOptionalParam UpdateUser Role where
  applyOptionalParam req (Role xs) =
    req `addQuery` toQuery ("role", Just xs)

-- | /Optional Param/ "profile_data" - A dictionary containing the to be updated custom profile field data for the user. 
instance HasOptionalParam UpdateUser ProfileData where
  applyOptionalParam req (ProfileData xs) =
    req `addQuery` toQueryColl MultiParamArray ("profile_data", Just xs)
-- | @application/json@
instance Produces UpdateUser MimeJSON


-- *** updateUserGroup

-- | @PATCH \/user_groups\/{user_group_id}@
-- 
-- Update a user group
-- 
-- Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 
-- 
updateUserGroup 
  :: UserGroupId -- ^ "userGroupId" -  The ID of the target user group. 
  -> Name -- ^ "name" -  The new name of the group. 
  -> Description -- ^ "description" -  The new description of the group. 
  -> ZulipRESTRequest UpdateUserGroup MimeNoContent JsonSuccess MimeJSON
updateUserGroup (UserGroupId userGroupId) (Name name) (Description description) =
  _mkRequest "PATCH" ["/user_groups/",toPath userGroupId]
    `addQuery` toQuery ("name", Just name)
    `addQuery` toQuery ("description", Just description)

data UpdateUserGroup  
-- | @application/json@
instance Produces UpdateUserGroup MimeJSON


-- *** updateUserGroupMembers

-- | @POST \/user_groups\/{user_group_id}\/members@
-- 
-- Update user group members
-- 
-- Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 
-- 
updateUserGroupMembers 
  :: UserGroupId -- ^ "userGroupId" -  The ID of the target user group. 
  -> ZulipRESTRequest UpdateUserGroupMembers MimeNoContent JsonSuccess MimeJSON
updateUserGroupMembers (UserGroupId userGroupId) =
  _mkRequest "POST" ["/user_groups/",toPath userGroupId,"/members"]

data UpdateUserGroupMembers  

-- | /Optional Param/ "delete" - The list of user ids to be removed from the user group. 
instance HasOptionalParam UpdateUserGroupMembers DeleteInt where
  applyOptionalParam req (DeleteInt xs) =
    req `addQuery` toQueryColl MultiParamArray ("delete", Just xs)

-- | /Optional Param/ "add" - The list of user ids to be added to the user group. 
instance HasOptionalParam UpdateUserGroupMembers AddInt where
  applyOptionalParam req (AddInt xs) =
    req `addQuery` toQueryColl MultiParamArray ("add", Just xs)
-- | @application/json@
instance Produces UpdateUserGroupMembers MimeJSON

