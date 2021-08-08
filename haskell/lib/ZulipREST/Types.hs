{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module ZulipREST.Types (
  AddSubscriptionsResponse (..),
  AddSubscriptionsResponseAllOf (..),
  ApiKeyResponse (..),
  ApiKeyResponseAllOf (..),
  Attachments (..),
  AttachmentsMessages (..),
  BadEventQueueIdError (..),
  BadEventQueueIdErrorAllOf (..),
  BasicBot (..),
  BasicBotAllOf (..),
  BasicBotBase (..),
  BasicStream (..),
  BasicStreamAllOf (..),
  BasicStreamBase (..),
  Bot (..),
  BotAllOf (..),
  CodedError (..),
  CodedErrorAllOf (..),
  CodedErrorBase (..),
  CodedErrorBaseAllOf (..),
  CustomProfileField (..),
  DefaultStreamGroup (..),
  EmojiReaction (..),
  EmojiReactionAllOf (..),
  EmojiReactionBase (..),
  EmojiReactionBaseUser (..),
  GetMessages (..),
  GetMessagesAllOf (..),
  Hotspot (..),
  InlineResponse200 (..),
  InvalidApiKeyError (..),
  InvalidMessageError (..),
  InvalidMessageErrorAllOf (..),
  JsonError (..),
  JsonErrorBase (..),
  JsonErrorBaseAllOf (..),
  JsonResponseBase (..),
  JsonSuccess (..),
  JsonSuccessAllOf (..),
  JsonSuccessBase (..),
  JsonSuccessBaseAllOf (..),
  Messages (..),
  MessagesAllOf (..),
  MessagesBase (..),
  MessagesBaseTopicLinks (..),
  MissingArgumentError (..),
  MissingArgumentErrorAllOf (..),
  NonExistingStreamError (..),
  NonExistingStreamErrorAllOf (..),
  Presence (..),
  RateLimitedError (..),
  RealmDeactivatedError (..),
  RealmDomain (..),
  RealmEmoji (..),
  RealmExport (..),
  RealmPlayground (..),
  Subscriptions (..),
  User (..),
  UserAllOf (..),
  UserBase (..),
  UserDeactivatedError (..),
  UserGroup (..),
  UserNotAuthorizedError (..),
  ) where

import Data.Data (Data)
import Data.UUID (UUID)
import Data.List (stripPrefix)
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import Data.Set (Set)
import Data.Text (Text)
import Data.Time
import Data.Swagger (ToSchema, declareNamedSchema)
import qualified Data.Swagger as Swagger
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)
import Data.Function ((&))


-- | 
data AddSubscriptionsResponse = AddSubscriptionsResponse
  { addSubscriptionsResponseResult :: Value -- ^ 
  , addSubscriptionsResponseMsg :: Value -- ^ 
  , addSubscriptionsResponseSubscribed :: Maybe (Map.Map String [Text]) -- ^ A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
  , addSubscriptionsResponseAlreadyUnderscoresubscribed :: Maybe (Map.Map String [Text]) -- ^ A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
  , addSubscriptionsResponseUnauthorized :: Maybe [Text] -- ^ A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AddSubscriptionsResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "addSubscriptionsResponse")
instance ToJSON AddSubscriptionsResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "addSubscriptionsResponse")


-- | 
data AddSubscriptionsResponseAllOf = AddSubscriptionsResponseAllOf
  { addSubscriptionsResponseAllOfResult :: Maybe Value -- ^ 
  , addSubscriptionsResponseAllOfMsg :: Maybe Value -- ^ 
  , addSubscriptionsResponseAllOfSubscribed :: Maybe (Map.Map String [Text]) -- ^ A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
  , addSubscriptionsResponseAllOfAlreadyUnderscoresubscribed :: Maybe (Map.Map String [Text]) -- ^ A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
  , addSubscriptionsResponseAllOfUnauthorized :: Maybe [Text] -- ^ A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AddSubscriptionsResponseAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "addSubscriptionsResponseAllOf")
instance ToJSON AddSubscriptionsResponseAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "addSubscriptionsResponseAllOf")


-- | 
data ApiKeyResponse = ApiKeyResponse
  { apiKeyResponseResult :: Value -- ^ 
  , apiKeyResponseMsg :: Value -- ^ 
  , apiKeyResponseApiUnderscorekey :: Text -- ^ The API key that can be used to authenticate as the requested user. 
  , apiKeyResponseEmail :: Text -- ^ The email address of the user who owns the API key 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ApiKeyResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "apiKeyResponse")
instance ToJSON ApiKeyResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "apiKeyResponse")


-- | 
data ApiKeyResponseAllOf = ApiKeyResponseAllOf
  { apiKeyResponseAllOfResult :: Maybe Value -- ^ 
  , apiKeyResponseAllOfMsg :: Maybe Value -- ^ 
  , apiKeyResponseAllOfApiUnderscorekey :: Text -- ^ The API key that can be used to authenticate as the requested user. 
  , apiKeyResponseAllOfEmail :: Text -- ^ The email address of the user who owns the API key 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ApiKeyResponseAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "apiKeyResponseAllOf")
instance ToJSON ApiKeyResponseAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "apiKeyResponseAllOf")


-- | Dictionary containing details of a file uploaded by a user. 
data Attachments = Attachments
  { attachmentsId :: Maybe Int -- ^ The unique ID for the attachment. 
  , attachmentsName :: Maybe Text -- ^ Name of the uploaded file. 
  , attachmentsPathUnderscoreid :: Maybe Text -- ^ A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`. 
  , attachmentsSize :: Maybe Int -- ^ Size of the file in bytes. 
  , attachmentsCreateUnderscoretime :: Maybe Int -- ^ Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 
  , attachmentsMessages :: Maybe [AttachmentsMessages] -- ^ Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Attachments where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "attachments")
instance ToJSON Attachments where
  toJSON = genericToJSON (removeFieldLabelPrefix False "attachments")


-- | 
data AttachmentsMessages = AttachmentsMessages
  { attachmentsMessagesDateUnderscoresent :: Maybe Int -- ^ Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number. 
  , attachmentsMessagesId :: Maybe Int -- ^ The unique message ID.  Messages should always be displayed sorted by ID. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AttachmentsMessages where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "attachmentsMessages")
instance ToJSON AttachmentsMessages where
  toJSON = genericToJSON (removeFieldLabelPrefix False "attachmentsMessages")


-- | 
data BadEventQueueIdError = BadEventQueueIdError
  { badEventQueueIdErrorResult :: Value -- ^ 
  , badEventQueueIdErrorMsg :: Value -- ^ 
  , badEventQueueIdErrorCode :: Maybe Value -- ^ 
  , badEventQueueIdErrorQueueUnderscoreid :: Maybe Text -- ^ The string that identifies the invalid event queue. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BadEventQueueIdError where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "badEventQueueIdError")
instance ToJSON BadEventQueueIdError where
  toJSON = genericToJSON (removeFieldLabelPrefix False "badEventQueueIdError")


-- | 
data BadEventQueueIdErrorAllOf = BadEventQueueIdErrorAllOf
  { badEventQueueIdErrorAllOfResult :: Maybe Value -- ^ 
  , badEventQueueIdErrorAllOfMsg :: Maybe Value -- ^ 
  , badEventQueueIdErrorAllOfCode :: Maybe Value -- ^ 
  , badEventQueueIdErrorAllOfQueueUnderscoreid :: Maybe Text -- ^ The string that identifies the invalid event queue. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BadEventQueueIdErrorAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "badEventQueueIdErrorAllOf")
instance ToJSON BadEventQueueIdErrorAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "badEventQueueIdErrorAllOf")


-- | 
data BasicBot = BasicBot
  { basicBotUserUnderscoreid :: Maybe Value -- ^ 
  , basicBotFullUnderscorename :: Maybe Value -- ^ 
  , basicBotApiUnderscorekey :: Maybe Value -- ^ 
  , basicBotDefaultUnderscoresendingUnderscorestream :: Maybe Value -- ^ 
  , basicBotDefaultUnderscoreeventsUnderscoreregisterUnderscorestream :: Maybe Value -- ^ 
  , basicBotDefaultUnderscoreallUnderscorepublicUnderscorestreams :: Maybe Value -- ^ 
  , basicBotAvatarUnderscoreurl :: Maybe Value -- ^ 
  , basicBotOwnerUnderscoreid :: Maybe Value -- ^ 
  , basicBotServices :: Maybe Value -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BasicBot where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "basicBot")
instance ToJSON BasicBot where
  toJSON = genericToJSON (removeFieldLabelPrefix False "basicBot")


-- | 
data BasicBotAllOf = BasicBotAllOf
  { basicBotAllOfUserUnderscoreid :: Maybe Value -- ^ 
  , basicBotAllOfFullUnderscorename :: Maybe Value -- ^ 
  , basicBotAllOfApiUnderscorekey :: Maybe Value -- ^ 
  , basicBotAllOfDefaultUnderscoresendingUnderscorestream :: Maybe Value -- ^ 
  , basicBotAllOfDefaultUnderscoreeventsUnderscoreregisterUnderscorestream :: Maybe Value -- ^ 
  , basicBotAllOfDefaultUnderscoreallUnderscorepublicUnderscorestreams :: Maybe Value -- ^ 
  , basicBotAllOfAvatarUnderscoreurl :: Maybe Value -- ^ 
  , basicBotAllOfOwnerUnderscoreid :: Maybe Value -- ^ 
  , basicBotAllOfServices :: Maybe Value -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BasicBotAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "basicBotAllOf")
instance ToJSON BasicBotAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "basicBotAllOf")


-- | 
data BasicBotBase = BasicBotBase
  { basicBotBaseUserUnderscoreid :: Maybe Int -- ^ The user id of the bot. 
  , basicBotBaseFullUnderscorename :: Maybe Text -- ^ The full name of the bot. 
  , basicBotBaseApiUnderscorekey :: Maybe Text -- ^ The API key of the bot which it uses to make API requests. 
  , basicBotBaseDefaultUnderscoresendingUnderscorestream :: Maybe Text -- ^ The default sending stream of the bot. Null if the bot doesn't have a default sending stream. 
  , basicBotBaseDefaultUnderscoreeventsUnderscoreregisterUnderscorestream :: Maybe Text -- ^ The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. 
  , basicBotBaseDefaultUnderscoreallUnderscorepublicUnderscorestreams :: Maybe Bool -- ^ Whether the bot can send messages to all streams by default. 
  , basicBotBaseAvatarUnderscoreurl :: Maybe Text -- ^ The URL of the bot's avatar. 
  , basicBotBaseOwnerUnderscoreid :: Maybe Int -- ^ The user id of the bot's owner.  Null if the bot has no owner. 
  , basicBotBaseServices :: Maybe [OneOf&lt;object,object&gt;] -- ^ The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BasicBotBase where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "basicBotBase")
instance ToJSON BasicBotBase where
  toJSON = genericToJSON (removeFieldLabelPrefix False "basicBotBase")


-- | 
data BasicStream = BasicStream
  { basicStreamStreamUnderscoreid :: Maybe Value -- ^ 
  , basicStreamName :: Maybe Value -- ^ 
  , basicStreamDescription :: Maybe Value -- ^ 
  , basicStreamDateUnderscorecreated :: Maybe Value -- ^ 
  , basicStreamInviteUnderscoreonly :: Maybe Value -- ^ 
  , basicStreamRenderedUnderscoredescription :: Maybe Value -- ^ 
  , basicStreamIsUnderscorewebUnderscorepublic :: Maybe Value -- ^ 
  , basicStreamStreamUnderscorepostUnderscorepolicy :: Maybe Value -- ^ 
  , basicStreamMessageUnderscoreretentionUnderscoredays :: Maybe Value -- ^ 
  , basicStreamHistoryUnderscorepublicUnderscoretoUnderscoresubscribers :: Maybe Value -- ^ 
  , basicStreamFirstUnderscoremessageUnderscoreid :: Maybe Value -- ^ 
  , basicStreamIsUnderscoreannouncementUnderscoreonly :: Maybe Value -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BasicStream where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "basicStream")
instance ToJSON BasicStream where
  toJSON = genericToJSON (removeFieldLabelPrefix False "basicStream")


-- | 
data BasicStreamAllOf = BasicStreamAllOf
  { basicStreamAllOfStreamUnderscoreid :: Maybe Value -- ^ 
  , basicStreamAllOfName :: Maybe Value -- ^ 
  , basicStreamAllOfDescription :: Maybe Value -- ^ 
  , basicStreamAllOfDateUnderscorecreated :: Maybe Value -- ^ 
  , basicStreamAllOfInviteUnderscoreonly :: Maybe Value -- ^ 
  , basicStreamAllOfRenderedUnderscoredescription :: Maybe Value -- ^ 
  , basicStreamAllOfIsUnderscorewebUnderscorepublic :: Maybe Value -- ^ 
  , basicStreamAllOfStreamUnderscorepostUnderscorepolicy :: Maybe Value -- ^ 
  , basicStreamAllOfMessageUnderscoreretentionUnderscoredays :: Maybe Value -- ^ 
  , basicStreamAllOfHistoryUnderscorepublicUnderscoretoUnderscoresubscribers :: Maybe Value -- ^ 
  , basicStreamAllOfFirstUnderscoremessageUnderscoreid :: Maybe Value -- ^ 
  , basicStreamAllOfIsUnderscoreannouncementUnderscoreonly :: Maybe Value -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BasicStreamAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "basicStreamAllOf")
instance ToJSON BasicStreamAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "basicStreamAllOf")


-- | Object containing basic details about the stream. 
data BasicStreamBase = BasicStreamBase
  { basicStreamBaseStreamUnderscoreid :: Maybe Int -- ^ The unique ID of the stream. 
  , basicStreamBaseName :: Maybe Text -- ^ The name of the stream. 
  , basicStreamBaseDescription :: Maybe Text -- ^ The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
  , basicStreamBaseDateUnderscorecreated :: Maybe Int -- ^ The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
  , basicStreamBaseInviteUnderscoreonly :: Maybe Bool -- ^ Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
  , basicStreamBaseRenderedUnderscoredescription :: Maybe Text -- ^ The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
  , basicStreamBaseIsUnderscorewebUnderscorepublic :: Maybe Bool -- ^ Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
  , basicStreamBaseStreamUnderscorepostUnderscorepolicy :: Maybe Int -- ^ Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
  , basicStreamBaseMessageUnderscoreretentionUnderscoredays :: Maybe Int -- ^ Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
  , basicStreamBaseHistoryUnderscorepublicUnderscoretoUnderscoresubscribers :: Maybe Bool -- ^ Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
  , basicStreamBaseFirstUnderscoremessageUnderscoreid :: Maybe Int -- ^ The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
  , basicStreamBaseIsUnderscoreannouncementUnderscoreonly :: Maybe Bool -- ^ Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BasicStreamBase where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "basicStreamBase")
instance ToJSON BasicStreamBase where
  toJSON = genericToJSON (removeFieldLabelPrefix False "basicStreamBase")


-- | 
data Bot = Bot
  { botUserUnderscoreid :: Maybe Value -- ^ 
  , botFullUnderscorename :: Maybe Value -- ^ 
  , botApiUnderscorekey :: Maybe Value -- ^ 
  , botDefaultUnderscoresendingUnderscorestream :: Maybe Value -- ^ 
  , botDefaultUnderscoreeventsUnderscoreregisterUnderscorestream :: Maybe Value -- ^ 
  , botDefaultUnderscoreallUnderscorepublicUnderscorestreams :: Maybe Value -- ^ 
  , botAvatarUnderscoreurl :: Maybe Value -- ^ 
  , botOwnerUnderscoreid :: Maybe Value -- ^ 
  , botServices :: Maybe Value -- ^ 
  , botEmail :: Maybe Text -- ^ The email of the bot. 
  , botBotUnderscoretype :: Maybe Int -- ^ An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
  , botIsUnderscoreactive :: Maybe Bool -- ^ A boolean describing whether the user account has been deactivated. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Bot where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "bot")
instance ToJSON Bot where
  toJSON = genericToJSON (removeFieldLabelPrefix False "bot")


-- | Object containing details of a bot. 
data BotAllOf = BotAllOf
  { botAllOfUserUnderscoreid :: Maybe Value -- ^ 
  , botAllOfFullUnderscorename :: Maybe Value -- ^ 
  , botAllOfApiUnderscorekey :: Maybe Value -- ^ 
  , botAllOfDefaultUnderscoresendingUnderscorestream :: Maybe Value -- ^ 
  , botAllOfDefaultUnderscoreeventsUnderscoreregisterUnderscorestream :: Maybe Value -- ^ 
  , botAllOfDefaultUnderscoreallUnderscorepublicUnderscorestreams :: Maybe Value -- ^ 
  , botAllOfAvatarUnderscoreurl :: Maybe Value -- ^ 
  , botAllOfOwnerUnderscoreid :: Maybe Value -- ^ 
  , botAllOfServices :: Maybe Value -- ^ 
  , botAllOfEmail :: Maybe Text -- ^ The email of the bot. 
  , botAllOfBotUnderscoretype :: Maybe Int -- ^ An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
  , botAllOfIsUnderscoreactive :: Maybe Bool -- ^ A boolean describing whether the user account has been deactivated. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BotAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "botAllOf")
instance ToJSON BotAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "botAllOf")


-- | 
data CodedError = CodedError
  { codedErrorResult :: Value -- ^ 
  , codedErrorMsg :: Value -- ^ 
  , codedErrorCode :: Maybe Value -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON CodedError where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "codedError")
instance ToJSON CodedError where
  toJSON = genericToJSON (removeFieldLabelPrefix False "codedError")


-- | 
data CodedErrorAllOf = CodedErrorAllOf
  { codedErrorAllOfResult :: Maybe Value -- ^ 
  , codedErrorAllOfMsg :: Maybe Value -- ^ 
  , codedErrorAllOfCode :: Maybe Value -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON CodedErrorAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "codedErrorAllOf")
instance ToJSON CodedErrorAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "codedErrorAllOf")


-- | 
data CodedErrorBase = CodedErrorBase
  { codedErrorBaseResult :: Value -- ^ 
  , codedErrorBaseMsg :: Value -- ^ 
  , codedErrorBaseCode :: Maybe Text -- ^ A string that identifies the error. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON CodedErrorBase where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "codedErrorBase")
instance ToJSON CodedErrorBase where
  toJSON = genericToJSON (removeFieldLabelPrefix False "codedErrorBase")


-- | 
data CodedErrorBaseAllOf = CodedErrorBaseAllOf
  { codedErrorBaseAllOfResult :: Maybe Value -- ^ 
  , codedErrorBaseAllOfMsg :: Maybe Value -- ^ 
  , codedErrorBaseAllOfCode :: Maybe Text -- ^ A string that identifies the error. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON CodedErrorBaseAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "codedErrorBaseAllOf")
instance ToJSON CodedErrorBaseAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "codedErrorBaseAllOf")


-- | Dictionary containing the details of a custom profile field configured for this organization. 
data CustomProfileField = CustomProfileField
  { customProfileFieldId :: Maybe Int -- ^ The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. 
  , customProfileFieldType :: Maybe Int -- ^ An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
  , customProfileFieldOrder :: Maybe Int -- ^ Custom profile fields are displayed in both settings UI and UI showing users' profiles in increasing `order`. 
  , customProfileFieldName :: Maybe Text -- ^ The name of the custom profile field. 
  , customProfileFieldHint :: Maybe Text -- ^ The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
  , customProfileFieldFieldUnderscoredata :: Maybe Text -- ^ Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON CustomProfileField where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "customProfileField")
instance ToJSON CustomProfileField where
  toJSON = genericToJSON (removeFieldLabelPrefix False "customProfileField")


-- | Dictionary containing details of a default stream group. 
data DefaultStreamGroup = DefaultStreamGroup
  { defaultStreamGroupName :: Maybe Text -- ^ Name of the default stream group. 
  , defaultStreamGroupDescription :: Maybe Text -- ^ Description of the default stream group. 
  , defaultStreamGroupId :: Maybe Int -- ^ id of the default stream group. 
  , defaultStreamGroupStreams :: Maybe [BasicStream] -- ^ Array containing details about the streams in the default stream group. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DefaultStreamGroup where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "defaultStreamGroup")
instance ToJSON DefaultStreamGroup where
  toJSON = genericToJSON (removeFieldLabelPrefix False "defaultStreamGroup")


-- | 
data EmojiReaction = EmojiReaction
  { emojiReactionEmojiUnderscorecode :: Maybe Value -- ^ 
  , emojiReactionEmojiUnderscorename :: Maybe Value -- ^ 
  , emojiReactionReactionUnderscoretype :: Maybe Value -- ^ 
  , emojiReactionUserUnderscoreid :: Maybe Value -- ^ 
  , emojiReactionUser :: Maybe Value -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON EmojiReaction where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "emojiReaction")
instance ToJSON EmojiReaction where
  toJSON = genericToJSON (removeFieldLabelPrefix False "emojiReaction")


-- | 
data EmojiReactionAllOf = EmojiReactionAllOf
  { emojiReactionAllOfEmojiUnderscorecode :: Maybe Value -- ^ 
  , emojiReactionAllOfEmojiUnderscorename :: Maybe Value -- ^ 
  , emojiReactionAllOfReactionUnderscoretype :: Maybe Value -- ^ 
  , emojiReactionAllOfUserUnderscoreid :: Maybe Value -- ^ 
  , emojiReactionAllOfUser :: Maybe Value -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON EmojiReactionAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "emojiReactionAllOf")
instance ToJSON EmojiReactionAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "emojiReactionAllOf")


-- | 
data EmojiReactionBase = EmojiReactionBase
  { emojiReactionBaseEmojiUnderscorecode :: Maybe Text -- ^ A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint. 
  , emojiReactionBaseEmojiUnderscorename :: Maybe Text -- ^ Name of the emoji. 
  , emojiReactionBaseReactionUnderscoretype :: Maybe Text -- ^ One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
  , emojiReactionBaseUserUnderscoreid :: Maybe Int -- ^ The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
  , emojiReactionBaseUser :: Maybe EmojiReactionBaseUser -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON EmojiReactionBase where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "emojiReactionBase")
instance ToJSON EmojiReactionBase where
  toJSON = genericToJSON (removeFieldLabelPrefix False "emojiReactionBase")


-- | Dictionary with data on the user who added the reaction, including the user ID as the &#x60;id&#x60; field.  **Note**: In the [events API](/api/get-events), this &#x60;user&#x60; dictionary confusing had the user ID in a field called &#x60;user_id&#x60; instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the &#x60;user_id&#x60; field. 
data EmojiReactionBaseUser = EmojiReactionBaseUser
  { emojiReactionBaseUserId :: Maybe Int -- ^ ID of the user. 
  , emojiReactionBaseUserEmail :: Maybe Text -- ^ Email of the user. 
  , emojiReactionBaseUserFullUnderscorename :: Maybe Text -- ^ Full name of the user. 
  , emojiReactionBaseUserIsUnderscoremirrorUnderscoredummy :: Maybe Bool -- ^ Whether the user is a mirror dummy. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON EmojiReactionBaseUser where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "emojiReactionBaseUser")
instance ToJSON EmojiReactionBaseUser where
  toJSON = genericToJSON (removeFieldLabelPrefix False "emojiReactionBaseUser")


-- | 
data GetMessages = GetMessages
  { getMessagesAvatarUnderscoreurl :: Maybe Value -- ^ 
  , getMessagesClient :: Maybe Value -- ^ 
  , getMessagesContent :: Maybe Value -- ^ 
  , getMessagesContentUnderscoretype :: Maybe Value -- ^ 
  , getMessagesDisplayUnderscorerecipient :: Maybe Value -- ^ 
  , getMessagesId :: Maybe Value -- ^ 
  , getMessagesIsUnderscoremeUnderscoremessage :: Maybe Value -- ^ 
  , getMessagesReactions :: Maybe Value -- ^ 
  , getMessagesRecipientUnderscoreid :: Maybe Value -- ^ 
  , getMessagesSenderUnderscoreemail :: Maybe Value -- ^ 
  , getMessagesSenderUnderscorefullUnderscorename :: Maybe Value -- ^ 
  , getMessagesSenderUnderscoreid :: Maybe Value -- ^ 
  , getMessagesSenderUnderscorerealmUnderscorestr :: Maybe Value -- ^ 
  , getMessagesStreamUnderscoreid :: Maybe Value -- ^ 
  , getMessagesSubject :: Maybe Value -- ^ 
  , getMessagesTopicUnderscorelinks :: Maybe Value -- ^ 
  , getMessagesSubmessages :: Maybe Value -- ^ 
  , getMessagesTimestamp :: Maybe Value -- ^ 
  , getMessagesType :: Maybe Value -- ^ 
  , getMessagesFlags :: Maybe [Text] -- ^ The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 
  , getMessagesLastUnderscoreeditUnderscoretimestamp :: Maybe Int -- ^ The UNIX timestamp for when the message was last edited, in UTC seconds. 
  , getMessagesMatchUnderscorecontent :: Maybe Text -- ^ Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
  , getMessagesMatchUnderscoresubject :: Maybe Text -- ^ Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON GetMessages where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "getMessages")
instance ToJSON GetMessages where
  toJSON = genericToJSON (removeFieldLabelPrefix False "getMessages")


-- | 
data GetMessagesAllOf = GetMessagesAllOf
  { getMessagesAllOfAvatarUnderscoreurl :: Maybe Value -- ^ 
  , getMessagesAllOfClient :: Maybe Value -- ^ 
  , getMessagesAllOfContent :: Maybe Value -- ^ 
  , getMessagesAllOfContentUnderscoretype :: Maybe Value -- ^ 
  , getMessagesAllOfDisplayUnderscorerecipient :: Maybe Value -- ^ 
  , getMessagesAllOfId :: Maybe Value -- ^ 
  , getMessagesAllOfIsUnderscoremeUnderscoremessage :: Maybe Value -- ^ 
  , getMessagesAllOfReactions :: Maybe Value -- ^ 
  , getMessagesAllOfRecipientUnderscoreid :: Maybe Value -- ^ 
  , getMessagesAllOfSenderUnderscoreemail :: Maybe Value -- ^ 
  , getMessagesAllOfSenderUnderscorefullUnderscorename :: Maybe Value -- ^ 
  , getMessagesAllOfSenderUnderscoreid :: Maybe Value -- ^ 
  , getMessagesAllOfSenderUnderscorerealmUnderscorestr :: Maybe Value -- ^ 
  , getMessagesAllOfStreamUnderscoreid :: Maybe Value -- ^ 
  , getMessagesAllOfSubject :: Maybe Value -- ^ 
  , getMessagesAllOfTopicUnderscorelinks :: Maybe Value -- ^ 
  , getMessagesAllOfSubmessages :: Maybe Value -- ^ 
  , getMessagesAllOfTimestamp :: Maybe Value -- ^ 
  , getMessagesAllOfType :: Maybe Value -- ^ 
  , getMessagesAllOfFlags :: Maybe [Text] -- ^ The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 
  , getMessagesAllOfLastUnderscoreeditUnderscoretimestamp :: Maybe Int -- ^ The UNIX timestamp for when the message was last edited, in UTC seconds. 
  , getMessagesAllOfMatchUnderscorecontent :: Maybe Text -- ^ Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
  , getMessagesAllOfMatchUnderscoresubject :: Maybe Text -- ^ Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON GetMessagesAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "getMessagesAllOf")
instance ToJSON GetMessagesAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "getMessagesAllOf")


-- | Dictionary containing details of a single hotspot. 
data Hotspot = Hotspot
  { hotspotDelay :: Maybe Double -- ^ The delay after which the user should be shown the hotspot. 
  , hotspotName :: Maybe Text -- ^ The name of the hotspot. 
  , hotspotTitle :: Maybe Text -- ^ The title of the hotspot, as will be displayed to the user. 
  , hotspotDescription :: Maybe Text -- ^ The description of the hotspot, as will be displayed to the user. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Hotspot where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "hotspot")
instance ToJSON Hotspot where
  toJSON = genericToJSON (removeFieldLabelPrefix False "hotspot")


-- | This is an example of the JSON payload that the Zulip server will &#x60;POST&#x60; to your server 
data InlineResponse200 = InlineResponse200
  { inlineResponse200BotUnderscoreemail :: Maybe Text -- ^ Email of the bot user. 
  , inlineResponse200BotUnderscorefullUnderscorename :: Maybe Text -- ^ The full name of the bot user. 
  , inlineResponse200Data :: Maybe Text -- ^ The message content, in raw Markdown format (not rendered to HTML). 
  , inlineResponse200Trigger :: Maybe Text -- ^ What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`. 
  , inlineResponse200Token :: Maybe Text -- ^ A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot. 
  , inlineResponse200Message :: Maybe MessagesBase -- ^ A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages). 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineResponse200 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineResponse200")
instance ToJSON InlineResponse200 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineResponse200")


-- | 
data InvalidApiKeyError = InvalidApiKeyError
  { invalidApiKeyErrorResult :: Value -- ^ 
  , invalidApiKeyErrorMsg :: Value -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InvalidApiKeyError where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "invalidApiKeyError")
instance ToJSON InvalidApiKeyError where
  toJSON = genericToJSON (removeFieldLabelPrefix False "invalidApiKeyError")


-- | 
data InvalidMessageError = InvalidMessageError
  { invalidMessageErrorResult :: Value -- ^ 
  , invalidMessageErrorMsg :: Value -- ^ 
  , invalidMessageErrorRawUnderscorecontent :: Maybe Text -- ^ The raw content of the message. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InvalidMessageError where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "invalidMessageError")
instance ToJSON InvalidMessageError where
  toJSON = genericToJSON (removeFieldLabelPrefix False "invalidMessageError")


-- | 
data InvalidMessageErrorAllOf = InvalidMessageErrorAllOf
  { invalidMessageErrorAllOfResult :: Maybe Value -- ^ 
  , invalidMessageErrorAllOfMsg :: Maybe Value -- ^ 
  , invalidMessageErrorAllOfRawUnderscorecontent :: Maybe Text -- ^ The raw content of the message. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InvalidMessageErrorAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "invalidMessageErrorAllOf")
instance ToJSON InvalidMessageErrorAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "invalidMessageErrorAllOf")


-- | 
data JsonError = JsonError
  { jsonErrorResult :: Value -- ^ 
  , jsonErrorMsg :: Value -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON JsonError where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "jsonError")
instance ToJSON JsonError where
  toJSON = genericToJSON (removeFieldLabelPrefix False "jsonError")


-- | 
data JsonErrorBase = JsonErrorBase
  { jsonErrorBaseResult :: Text -- ^ 
  , jsonErrorBaseMsg :: Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON JsonErrorBase where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "jsonErrorBase")
instance ToJSON JsonErrorBase where
  toJSON = genericToJSON (removeFieldLabelPrefix False "jsonErrorBase")


-- | 
data JsonErrorBaseAllOf = JsonErrorBaseAllOf
  { jsonErrorBaseAllOfResult :: Text -- ^ 
  , jsonErrorBaseAllOfMsg :: Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON JsonErrorBaseAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "jsonErrorBaseAllOf")
instance ToJSON JsonErrorBaseAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "jsonErrorBaseAllOf")


-- | 
data JsonResponseBase = JsonResponseBase
  { jsonResponseBaseResult :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON JsonResponseBase where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "jsonResponseBase")
instance ToJSON JsonResponseBase where
  toJSON = genericToJSON (removeFieldLabelPrefix False "jsonResponseBase")


-- | 
data JsonSuccess = JsonSuccess
  { jsonSuccessResult :: Value -- ^ 
  , jsonSuccessMsg :: Value -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON JsonSuccess where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "jsonSuccess")
instance ToJSON JsonSuccess where
  toJSON = genericToJSON (removeFieldLabelPrefix False "jsonSuccess")


-- | 
data JsonSuccessAllOf = JsonSuccessAllOf
  { jsonSuccessAllOfResult :: Maybe Value -- ^ 
  , jsonSuccessAllOfMsg :: Maybe Value -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON JsonSuccessAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "jsonSuccessAllOf")
instance ToJSON JsonSuccessAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "jsonSuccessAllOf")


-- | 
data JsonSuccessBase = JsonSuccessBase
  { jsonSuccessBaseResult :: Text -- ^ 
  , jsonSuccessBaseMsg :: Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON JsonSuccessBase where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "jsonSuccessBase")
instance ToJSON JsonSuccessBase where
  toJSON = genericToJSON (removeFieldLabelPrefix False "jsonSuccessBase")


-- | 
data JsonSuccessBaseAllOf = JsonSuccessBaseAllOf
  { jsonSuccessBaseAllOfResult :: Text -- ^ 
  , jsonSuccessBaseAllOfMsg :: Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON JsonSuccessBaseAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "jsonSuccessBaseAllOf")
instance ToJSON JsonSuccessBaseAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "jsonSuccessBaseAllOf")


-- | 
data Messages = Messages
  { messagesAvatarUnderscoreurl :: Maybe Value -- ^ 
  , messagesClient :: Maybe Value -- ^ 
  , messagesContent :: Maybe Value -- ^ 
  , messagesContentUnderscoretype :: Maybe Value -- ^ 
  , messagesDisplayUnderscorerecipient :: Maybe Value -- ^ 
  , messagesId :: Maybe Value -- ^ 
  , messagesIsUnderscoremeUnderscoremessage :: Maybe Value -- ^ 
  , messagesReactions :: Maybe Value -- ^ 
  , messagesRecipientUnderscoreid :: Maybe Value -- ^ 
  , messagesSenderUnderscoreemail :: Maybe Value -- ^ 
  , messagesSenderUnderscorefullUnderscorename :: Maybe Value -- ^ 
  , messagesSenderUnderscoreid :: Maybe Value -- ^ 
  , messagesSenderUnderscorerealmUnderscorestr :: Maybe Value -- ^ 
  , messagesStreamUnderscoreid :: Maybe Value -- ^ 
  , messagesSubject :: Maybe Value -- ^ 
  , messagesTopicUnderscorelinks :: Maybe Value -- ^ 
  , messagesSubmessages :: Maybe Value -- ^ 
  , messagesTimestamp :: Maybe Value -- ^ 
  , messagesType :: Maybe Value -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Messages where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "messages")
instance ToJSON Messages where
  toJSON = genericToJSON (removeFieldLabelPrefix False "messages")


-- | 
data MessagesAllOf = MessagesAllOf
  { messagesAllOfAvatarUnderscoreurl :: Maybe Value -- ^ 
  , messagesAllOfClient :: Maybe Value -- ^ 
  , messagesAllOfContent :: Maybe Value -- ^ 
  , messagesAllOfContentUnderscoretype :: Maybe Value -- ^ 
  , messagesAllOfDisplayUnderscorerecipient :: Maybe Value -- ^ 
  , messagesAllOfId :: Maybe Value -- ^ 
  , messagesAllOfIsUnderscoremeUnderscoremessage :: Maybe Value -- ^ 
  , messagesAllOfReactions :: Maybe Value -- ^ 
  , messagesAllOfRecipientUnderscoreid :: Maybe Value -- ^ 
  , messagesAllOfSenderUnderscoreemail :: Maybe Value -- ^ 
  , messagesAllOfSenderUnderscorefullUnderscorename :: Maybe Value -- ^ 
  , messagesAllOfSenderUnderscoreid :: Maybe Value -- ^ 
  , messagesAllOfSenderUnderscorerealmUnderscorestr :: Maybe Value -- ^ 
  , messagesAllOfStreamUnderscoreid :: Maybe Value -- ^ 
  , messagesAllOfSubject :: Maybe Value -- ^ 
  , messagesAllOfTopicUnderscorelinks :: Maybe Value -- ^ 
  , messagesAllOfSubmessages :: Maybe Value -- ^ 
  , messagesAllOfTimestamp :: Maybe Value -- ^ 
  , messagesAllOfType :: Maybe Value -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON MessagesAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "messagesAllOf")
instance ToJSON MessagesAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "messagesAllOf")


-- | Object containing details of the message. 
data MessagesBase = MessagesBase
  { messagesBaseAvatarUnderscoreurl :: Maybe Text -- ^ The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. 
  , messagesBaseClient :: Maybe Text -- ^ A Zulip \"client\" string, describing what Zulip client sent the message. 
  , messagesBaseContent :: Maybe Text -- ^ The content/body of the message. 
  , messagesBaseContentUnderscoretype :: Maybe Text -- ^ The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. 
  , messagesBaseDisplayUnderscorerecipient :: Maybe OneOf&lt;string,array&gt; -- ^ Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
  , messagesBaseId :: Maybe Int -- ^ The unique message ID.  Messages should always be displayed sorted by ID. 
  , messagesBaseIsUnderscoremeUnderscoremessage :: Maybe Bool -- ^ Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
  , messagesBaseReactions :: Maybe [EmojiReaction] -- ^ Data on any reactions to the message. 
  , messagesBaseRecipientUnderscoreid :: Maybe Int -- ^ A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
  , messagesBaseSenderUnderscoreemail :: Maybe Text -- ^ The Zulip display email address of the message's sender. 
  , messagesBaseSenderUnderscorefullUnderscorename :: Maybe Text -- ^ The full name of the message's sender. 
  , messagesBaseSenderUnderscoreid :: Maybe Int -- ^ The user ID of the message's sender. 
  , messagesBaseSenderUnderscorerealmUnderscorestr :: Maybe Text -- ^ A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. 
  , messagesBaseStreamUnderscoreid :: Maybe Int -- ^ Only present for stream messages; the ID of the stream. 
  , messagesBaseSubject :: Maybe Text -- ^ The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. 
  , messagesBaseTopicUnderscorelinks :: Maybe [MessagesBaseTopicLinks] -- ^ Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. 
  , messagesBaseSubmessages :: Maybe [Text] -- ^ Data used for certain experimental Zulip integrations. 
  , messagesBaseTimestamp :: Maybe Int -- ^ The UNIX timestamp for when the message was sent, in UTC seconds. 
  , messagesBaseType :: Maybe Text -- ^ The type of the message: `stream` or `private`. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON MessagesBase where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "messagesBase")
instance ToJSON MessagesBase where
  toJSON = genericToJSON (removeFieldLabelPrefix False "messagesBase")


-- | 
data MessagesBaseTopicLinks = MessagesBaseTopicLinks
  { messagesBaseTopicLinksText :: Maybe Text -- ^ The original link text present in the topic. 
  , messagesBaseTopicLinksUrl :: Maybe Text -- ^ The expanded target url which the link points to. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON MessagesBaseTopicLinks where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "messagesBaseTopicLinks")
instance ToJSON MessagesBaseTopicLinks where
  toJSON = genericToJSON (removeFieldLabelPrefix False "messagesBaseTopicLinks")


-- | 
data MissingArgumentError = MissingArgumentError
  { missingArgumentErrorResult :: Value -- ^ 
  , missingArgumentErrorMsg :: Value -- ^ 
  , missingArgumentErrorCode :: Maybe Value -- ^ 
  , missingArgumentErrorVarUnderscorename :: Maybe Text -- ^ It contains the information about the missing parameter. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON MissingArgumentError where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "missingArgumentError")
instance ToJSON MissingArgumentError where
  toJSON = genericToJSON (removeFieldLabelPrefix False "missingArgumentError")


-- | ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
data MissingArgumentErrorAllOf = MissingArgumentErrorAllOf
  { missingArgumentErrorAllOfResult :: Maybe Value -- ^ 
  , missingArgumentErrorAllOfMsg :: Maybe Value -- ^ 
  , missingArgumentErrorAllOfCode :: Maybe Value -- ^ 
  , missingArgumentErrorAllOfVarUnderscorename :: Maybe Text -- ^ It contains the information about the missing parameter. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON MissingArgumentErrorAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "missingArgumentErrorAllOf")
instance ToJSON MissingArgumentErrorAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "missingArgumentErrorAllOf")


-- | 
data NonExistingStreamError = NonExistingStreamError
  { nonExistingStreamErrorResult :: Value -- ^ 
  , nonExistingStreamErrorMsg :: Value -- ^ 
  , nonExistingStreamErrorCode :: Maybe Value -- ^ 
  , nonExistingStreamErrorStream :: Maybe Text -- ^ The name of the stream that could not be found. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON NonExistingStreamError where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "nonExistingStreamError")
instance ToJSON NonExistingStreamError where
  toJSON = genericToJSON (removeFieldLabelPrefix False "nonExistingStreamError")


-- | 
data NonExistingStreamErrorAllOf = NonExistingStreamErrorAllOf
  { nonExistingStreamErrorAllOfResult :: Maybe Value -- ^ 
  , nonExistingStreamErrorAllOfMsg :: Maybe Value -- ^ 
  , nonExistingStreamErrorAllOfCode :: Maybe Value -- ^ 
  , nonExistingStreamErrorAllOfStream :: Maybe Text -- ^ The name of the stream that could not be found. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON NonExistingStreamErrorAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "nonExistingStreamErrorAllOf")
instance ToJSON NonExistingStreamErrorAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "nonExistingStreamErrorAllOf")


-- | &#x60;{client_name}&#x60;: Object containing the details of the user&#39;s presence on a particular platform with the client&#39;s platform name being the object key. 
data Presence = Presence
  { presenceClient :: Maybe Text -- ^ The client's platform name. 
  , presenceStatus :: Maybe Text -- ^ The status of the user on this client. It is either `idle` or `active`. 
  , presenceTimestamp :: Maybe Int -- ^ The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second. 
  , presencePushable :: Maybe Bool -- ^ Whether the client is capable of showing mobile/push notifications to the user. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Presence where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "presence")
instance ToJSON Presence where
  toJSON = genericToJSON (removeFieldLabelPrefix False "presence")


-- | 
data RateLimitedError = RateLimitedError
  { rateLimitedErrorResult :: Value -- ^ 
  , rateLimitedErrorMsg :: Value -- ^ 
  , rateLimitedErrorCode :: Maybe Value -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RateLimitedError where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "rateLimitedError")
instance ToJSON RateLimitedError where
  toJSON = genericToJSON (removeFieldLabelPrefix False "rateLimitedError")


-- | 
data RealmDeactivatedError = RealmDeactivatedError
  { realmDeactivatedErrorResult :: Value -- ^ 
  , realmDeactivatedErrorMsg :: Value -- ^ 
  , realmDeactivatedErrorCode :: Maybe Value -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RealmDeactivatedError where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "realmDeactivatedError")
instance ToJSON RealmDeactivatedError where
  toJSON = genericToJSON (removeFieldLabelPrefix False "realmDeactivatedError")


-- | Object containing details of the newly added domain. 
data RealmDomain = RealmDomain
  { realmDomainDomain :: Maybe Text -- ^ The new allowed domain. 
  , realmDomainAllowUnderscoresubdomains :: Maybe Bool -- ^ Whether subdomains are allowed for this domain. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RealmDomain where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "realmDomain")
instance ToJSON RealmDomain where
  toJSON = genericToJSON (removeFieldLabelPrefix False "realmDomain")


-- | &#x60;{emoji_id}&#x60;: Object containing details about the emoji with  the specified ID. It has the following properties: 
data RealmEmoji = RealmEmoji
  { realmEmojiId :: Maybe Text -- ^ The ID for this emoji, same as the object's key. 
  , realmEmojiName :: Maybe Text -- ^ The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). 
  , realmEmojiSourceUnderscoreurl :: Maybe Text -- ^ The path relative to the organization's URL where the emoji's image can be found. 
  , realmEmojiDeactivated :: Maybe Bool -- ^ Whether the emoji has been deactivated or not. 
  , realmEmojiAuthorUnderscoreid :: Maybe Int -- ^ The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RealmEmoji where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "realmEmoji")
instance ToJSON RealmEmoji where
  toJSON = genericToJSON (removeFieldLabelPrefix False "realmEmoji")


-- | Object containing details about a realm export. 
data RealmExport = RealmExport
  { realmExportId :: Maybe Int -- ^ The id of the export. 
  , realmExportActingUnderscoreuserUnderscoreid :: Maybe Int -- ^ The id of the user who did the export. 
  , realmExportExportUnderscoretime :: Maybe Double -- ^ The UNIX timestamp of when the export was made. 
  , realmExportDeletedUnderscoretimestamp :: Maybe Double -- ^ The timestamp of when the export was deleted. Null if it wasn't. 
  , realmExportFailedUnderscoretimestamp :: Maybe Double -- ^ The timestamp of when the export failed. Null if it didn't. 
  , realmExportExportUnderscoreurl :: Maybe Text -- ^ The URL of the export. `null` if there's no URL. 
  , realmExportPending :: Maybe Bool -- ^ Whether the export is pending or not. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RealmExport where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "realmExport")
instance ToJSON RealmExport where
  toJSON = genericToJSON (removeFieldLabelPrefix False "realmExport")


-- | Object containing details about a realm playground. 
data RealmPlayground = RealmPlayground
  { realmPlaygroundId :: Maybe Int -- ^ The unique ID for the realm playground. 
  , realmPlaygroundName :: Maybe Text -- ^ The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
  , realmPlaygroundPygmentsUnderscorelanguage :: Maybe Text -- ^ The name of the Pygments language lexer for that programming language. 
  , realmPlaygroundUrlUnderscoreprefix :: Maybe Text -- ^ The url prefix for the playground. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RealmPlayground where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "realmPlayground")
instance ToJSON RealmPlayground where
  toJSON = genericToJSON (removeFieldLabelPrefix False "realmPlayground")


-- | 
data Subscriptions = Subscriptions
  { subscriptionsStreamUnderscoreid :: Maybe Int -- ^ The unique ID of a stream. 
  , subscriptionsName :: Maybe Text -- ^ The name of a stream. 
  , subscriptionsDescription :: Maybe Text -- ^ The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
  , subscriptionsRenderedUnderscoredescription :: Maybe Text -- ^ A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
  , subscriptionsDateUnderscorecreated :: Maybe Int -- ^ The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
  , subscriptionsInviteUnderscoreonly :: Maybe Bool -- ^ Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
  , subscriptionsSubscribers :: Maybe [Int] -- ^ A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`. 
  , subscriptionsDesktopUnderscorenotifications :: Maybe Bool -- ^ A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. 
  , subscriptionsEmailUnderscorenotifications :: Maybe Bool -- ^ A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. 
  , subscriptionsWildcardUnderscorementionsUnderscorenotify :: Maybe Bool -- ^ A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. 
  , subscriptionsPushUnderscorenotifications :: Maybe Bool -- ^ A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. 
  , subscriptionsAudibleUnderscorenotifications :: Maybe Bool -- ^ A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. 
  , subscriptionsPinUnderscoretoUnderscoretop :: Maybe Bool -- ^ A boolean specifying whether the given stream has been pinned to the top. 
  , subscriptionsEmailUnderscoreaddress :: Maybe Text -- ^ Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). 
  , subscriptionsIsUnderscoremuted :: Maybe Bool -- ^ Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`). 
  , subscriptionsInUnderscorehomeUnderscoreview :: Maybe Bool -- ^ Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. 
  , subscriptionsIsUnderscoreannouncementUnderscoreonly :: Maybe Bool -- ^ Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
  , subscriptionsIsUnderscorewebUnderscorepublic :: Maybe Bool -- ^ Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
  , subscriptionsRole :: Maybe Int -- ^ The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
  , subscriptionsColor :: Maybe Text -- ^ The user's personal color for the stream. 
  , subscriptionsStreamUnderscorepostUnderscorepolicy :: Maybe Int -- ^ Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
  , subscriptionsMessageUnderscoreretentionUnderscoredays :: Maybe Int -- ^ Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
  , subscriptionsHistoryUnderscorepublicUnderscoretoUnderscoresubscribers :: Maybe Bool -- ^ Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
  , subscriptionsFirstUnderscoremessageUnderscoreid :: Maybe Int -- ^ The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
  , subscriptionsStreamUnderscoreweeklyUnderscoretraffic :: Maybe Int -- ^ The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Subscriptions where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "subscriptions")
instance ToJSON Subscriptions where
  toJSON = genericToJSON (removeFieldLabelPrefix False "subscriptions")


-- | 
data User = User
  { userEmail :: Maybe Value -- ^ 
  , userIsUnderscorebot :: Maybe Value -- ^ 
  , userAvatarUnderscoreurl :: Maybe Value -- ^ 
  , userAvatarUnderscoreversion :: Maybe Value -- ^ 
  , userFullUnderscorename :: Maybe Value -- ^ 
  , userIsUnderscoreadmin :: Maybe Value -- ^ 
  , userIsUnderscoreowner :: Maybe Value -- ^ 
  , userIsUnderscorebillingUnderscoreadmin :: Maybe Value -- ^ 
  , userRole :: Maybe Value -- ^ 
  , userBotUnderscoretype :: Maybe Value -- ^ 
  , userUserUnderscoreid :: Maybe Value -- ^ 
  , userBotUnderscoreownerUnderscoreid :: Maybe Value -- ^ 
  , userIsUnderscoreactive :: Maybe Value -- ^ 
  , userIsUnderscoreguest :: Maybe Value -- ^ 
  , userTimezone :: Maybe Value -- ^ 
  , userDateUnderscorejoined :: Maybe Value -- ^ 
  , userDeliveryUnderscoreemail :: Maybe Value -- ^ 
  , userProfileUnderscoredata :: Maybe Value -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON User where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "user")
instance ToJSON User where
  toJSON = genericToJSON (removeFieldLabelPrefix False "user")


-- | 
data UserAllOf = UserAllOf
  { userAllOfEmail :: Maybe Value -- ^ 
  , userAllOfIsUnderscorebot :: Maybe Value -- ^ 
  , userAllOfAvatarUnderscoreurl :: Maybe Value -- ^ 
  , userAllOfAvatarUnderscoreversion :: Maybe Value -- ^ 
  , userAllOfFullUnderscorename :: Maybe Value -- ^ 
  , userAllOfIsUnderscoreadmin :: Maybe Value -- ^ 
  , userAllOfIsUnderscoreowner :: Maybe Value -- ^ 
  , userAllOfIsUnderscorebillingUnderscoreadmin :: Maybe Value -- ^ 
  , userAllOfRole :: Maybe Value -- ^ 
  , userAllOfBotUnderscoretype :: Maybe Value -- ^ 
  , userAllOfUserUnderscoreid :: Maybe Value -- ^ 
  , userAllOfBotUnderscoreownerUnderscoreid :: Maybe Value -- ^ 
  , userAllOfIsUnderscoreactive :: Maybe Value -- ^ 
  , userAllOfIsUnderscoreguest :: Maybe Value -- ^ 
  , userAllOfTimezone :: Maybe Value -- ^ 
  , userAllOfDateUnderscorejoined :: Maybe Value -- ^ 
  , userAllOfDeliveryUnderscoreemail :: Maybe Value -- ^ 
  , userAllOfProfileUnderscoredata :: Maybe Value -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON UserAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "userAllOf")
instance ToJSON UserAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "userAllOf")


-- | A dictionary containing basic data on a given Zulip user. 
data UserBase = UserBase
  { userBaseEmail :: Maybe Text -- ^ The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. 
  , userBaseIsUnderscorebot :: Maybe Bool -- ^ A boolean specifying whether the user is a bot or full account. 
  , userBaseAvatarUnderscoreurl :: Maybe Text -- ^ URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion. 
  , userBaseAvatarUnderscoreversion :: Maybe Int -- ^ Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`. 
  , userBaseFullUnderscorename :: Maybe Text -- ^ Full name of the user or bot, used for all display purposes. 
  , userBaseIsUnderscoreadmin :: Maybe Bool -- ^ A boolean specifying whether the user is an organization administrator. 
  , userBaseIsUnderscoreowner :: Maybe Bool -- ^ A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). 
  , userBaseIsUnderscorebillingUnderscoreadmin :: Maybe Bool -- ^ A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). 
  , userBaseRole :: Maybe Int -- ^ [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
  , userBaseBotUnderscoretype :: Maybe Int -- ^ An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
  , userBaseUserUnderscoreid :: Maybe Int -- ^ The unique ID of the user. 
  , userBaseBotUnderscoreownerUnderscoreid :: Maybe Int -- ^ If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner. 
  , userBaseIsUnderscoreactive :: Maybe Bool -- ^ A boolean specifying whether the user account has been deactivated. 
  , userBaseIsUnderscoreguest :: Maybe Bool -- ^ A boolean specifying whether the user is a guest user. 
  , userBaseTimezone :: Maybe Text -- ^ The time zone of the user. 
  , userBaseDateUnderscorejoined :: Maybe Text -- ^ The time the user account was created. 
  , userBaseDeliveryUnderscoreemail :: Maybe Text -- ^ The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. 
  , userBaseProfileUnderscoredata :: Maybe (Map.Map String Value) -- ^ A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON UserBase where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "userBase")
instance ToJSON UserBase where
  toJSON = genericToJSON (removeFieldLabelPrefix False "userBase")


-- | 
data UserDeactivatedError = UserDeactivatedError
  { userDeactivatedErrorResult :: Value -- ^ 
  , userDeactivatedErrorMsg :: Value -- ^ 
  , userDeactivatedErrorCode :: Maybe Value -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON UserDeactivatedError where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "userDeactivatedError")
instance ToJSON UserDeactivatedError where
  toJSON = genericToJSON (removeFieldLabelPrefix False "userDeactivatedError")


-- | Object containing the user group&#39;s attributes. 
data UserGroup = UserGroup
  { userGroupName :: Maybe Text -- ^ The name of the user group. 
  , userGroupDescription :: Maybe Text -- ^ The description of the user group. 
  , userGroupMembers :: Maybe [Int] -- ^ Array containing the id of the users who are members of this user group. 
  , userGroupId :: Maybe Int -- ^ The ID of the user group. 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON UserGroup where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "userGroup")
instance ToJSON UserGroup where
  toJSON = genericToJSON (removeFieldLabelPrefix False "userGroup")


-- | 
data UserNotAuthorizedError = UserNotAuthorizedError
  { userNotAuthorizedErrorResult :: Value -- ^ 
  , userNotAuthorizedErrorMsg :: Value -- ^ 
  , userNotAuthorizedErrorCode :: Maybe Value -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON UserNotAuthorizedError where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "userNotAuthorizedError")
instance ToJSON UserNotAuthorizedError where
  toJSON = genericToJSON (removeFieldLabelPrefix False "userNotAuthorizedError")


uncapitalize :: String -> String
uncapitalize (first:rest) = Char.toLower first : rest
uncapitalize [] = []

-- | Remove a field label prefix during JSON parsing.
--   Also perform any replacements for special characters.
--   The @forParsing@ parameter is to distinguish between the cases in which we're using this
--   to power a @FromJSON@ or a @ToJSON@ instance. In the first case we're parsing, and we want
--   to replace special characters with their quoted equivalents (because we cannot have special
--   chars in identifier names), while we want to do viceversa when sending data instead.
removeFieldLabelPrefix :: Bool -> String -> Options
removeFieldLabelPrefix forParsing prefix =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = uncapitalize . fromMaybe (error ("did not find prefix " ++ prefix)) . stripPrefix prefix . replaceSpecialChars
    }
  where
    replaceSpecialChars field = foldl (&) field (map mkCharReplacement specialChars)
    specialChars =
      [ ("@", "'At")
      , ("\\", "'Back_Slash")
      , ("<=", "'Less_Than_Or_Equal_To")
      , ("\"", "'Double_Quote")
      , ("[", "'Left_Square_Bracket")
      , ("]", "'Right_Square_Bracket")
      , ("^", "'Caret")
      , ("_", "'Underscore")
      , ("`", "'Backtick")
      , ("!", "'Exclamation")
      , ("#", "'Hash")
      , ("$", "'Dollar")
      , ("%", "'Percent")
      , ("&", "'Ampersand")
      , ("'", "'Quote")
      , ("(", "'Left_Parenthesis")
      , (")", "'Right_Parenthesis")
      , ("*", "'Star")
      , ("+", "'Plus")
      , (",", "'Comma")
      , ("-", "'Dash")
      , (".", "'Period")
      , ("/", "'Slash")
      , (":", "'Colon")
      , ("{", "'Left_Curly_Bracket")
      , ("|", "'Pipe")
      , ("<", "'LessThan")
      , ("!=", "'Not_Equal")
      , ("=", "'Equal")
      , ("}", "'Right_Curly_Bracket")
      , (">", "'GreaterThan")
      , ("~", "'Tilde")
      , ("?", "'Question_Mark")
      , (">=", "'Greater_Than_Or_Equal_To")
      , ("~=", "'Tilde_Equal")
      ]
    mkCharReplacement (replaceStr, searchStr) = T.unpack . replacer (T.pack searchStr) (T.pack replaceStr) . T.pack
    replacer =
      if forParsing
        then flip T.replace
        else T.replace
