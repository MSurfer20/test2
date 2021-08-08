

-- --------------------------------------------------------------------------
-- Table structure for table `AddSubscriptionsResponse` generated from model 'addSubscriptionsResponse'
--

CREATE TABLE IF NOT EXISTS `AddSubscriptionsResponse` (
  `result` blob NOT NULL,
  `msg` blob NOT NULL,
  `subscribed` blob /*A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. */,
  `already_subscribed` blob /*A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. */,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AddSubscriptionsResponseUnauthorized` generated from model 'AddSubscriptionsResponseUnauthorized'

CREATE TABLE IF NOT EXISTS `AddSubscriptionsResponseUnauthorized` (
  `addSubscriptionsResponse` long NOT NULL
  `unauthorized` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AddSubscriptionsResponse_allOf` generated from model 'addSubscriptionsResponseAllOf'
--

CREATE TABLE IF NOT EXISTS `AddSubscriptionsResponse_allOf` (
  `result` blob,
  `msg` blob,
  `subscribed` blob /*A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. */,
  `already_subscribed` blob /*A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. */,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AddSubscriptionsResponseAllOfUnauthorized` generated from model 'AddSubscriptionsResponseAllOfUnauthorized'

CREATE TABLE IF NOT EXISTS `AddSubscriptionsResponseAllOfUnauthorized` (
  `addSubscriptionsResponseAllOf` long NOT NULL
  `unauthorized` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ApiKeyResponse` generated from model 'apiKeyResponse'
--

CREATE TABLE IF NOT EXISTS `ApiKeyResponse` (
  `result` blob NOT NULL,
  `msg` blob NOT NULL,
  `api_key` text NOT NULL /*The API key that can be used to authenticate as the requested user. */,
  `email` text NOT NULL /*The email address of the user who owns the API key */
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ApiKeyResponse_allOf` generated from model 'apiKeyResponseAllOf'
--

CREATE TABLE IF NOT EXISTS `ApiKeyResponse_allOf` (
  `api_key` text NOT NULL /*The API key that can be used to authenticate as the requested user. */,
  `email` text NOT NULL /*The email address of the user who owns the API key */,
  `result` blob,
  `msg` blob
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Attachments` generated from model 'attachments'
-- Dictionary containing details of a file uploaded by a user. 
--

CREATE TABLE IF NOT EXISTS `Attachments` (
  `id` int PRIMARY KEY AUTOINCREMENT /*The unique ID for the attachment. */,
  `name` text /*Name of the uploaded file. */,
  `path_id` text /*A representation of the path of the file within the repository of user-uploaded files.  If the &#x60;path_id&#x60; of a file is &#x60;{realm_id}/ab/cdef/temp_file.py&#x60;, its URL will be: &#x60;{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py&#x60;. */,
  `size` int /*Size of the file in bytes. */,
  `create_time` int /*Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. */,
);  /*Dictionary containing details of a file uploaded by a user. */

-- --------------------------------------------------------------------------
-- Table structure for table `AttachmentsAttachmentsMessages` generated from model 'AttachmentsAttachmentsMessages'

CREATE TABLE IF NOT EXISTS `AttachmentsAttachmentsMessages` (
  `attachments` long NOT NULL
  `attachmentsMessages` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `Attachments_messages` generated from model 'attachmentsMessages'
--

CREATE TABLE IF NOT EXISTS `Attachments_messages` (
  `date_sent` int /*Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called &#x60;name&#x60; and was a floating point number. */,
  `id` int PRIMARY KEY AUTOINCREMENT /*The unique message ID.  Messages should always be displayed sorted by ID. */
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BadEventQueueIdError` generated from model 'badEventQueueIdError'
--

CREATE TABLE IF NOT EXISTS `BadEventQueueIdError` (
  `result` blob NOT NULL,
  `msg` blob NOT NULL,
  `code` blob,
  `queue_id` text /*The string that identifies the invalid event queue. */
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BadEventQueueIdError_allOf` generated from model 'badEventQueueIdErrorAllOf'
--

CREATE TABLE IF NOT EXISTS `BadEventQueueIdError_allOf` (
  `result` blob,
  `msg` blob,
  `code` blob,
  `queue_id` text /*The string that identifies the invalid event queue. */
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BasicBot` generated from model 'basicBot'
--

CREATE TABLE IF NOT EXISTS `BasicBot` (
  `user_id` blob,
  `full_name` blob,
  `api_key` blob,
  `default_sending_stream` blob,
  `default_events_register_stream` blob,
  `default_all_public_streams` blob,
  `avatar_url` blob,
  `owner_id` blob,
  `services` blob
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BasicBot_allOf` generated from model 'basicBotAllOf'
--

CREATE TABLE IF NOT EXISTS `BasicBot_allOf` (
  `user_id` blob,
  `full_name` blob,
  `api_key` blob,
  `default_sending_stream` blob,
  `default_events_register_stream` blob,
  `default_all_public_streams` blob,
  `avatar_url` blob,
  `owner_id` blob,
  `services` blob
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BasicBotBase` generated from model 'basicBotBase'
--

CREATE TABLE IF NOT EXISTS `BasicBotBase` (
  `user_id` int /*The user id of the bot. */,
  `full_name` text /*The full name of the bot. */,
  `api_key` text /*The API key of the bot which it uses to make API requests. */,
  `default_sending_stream` text /*The default sending stream of the bot. Null if the bot doesn&#39;t have a default sending stream. */,
  `default_events_register_stream` text /*The default stream for which the bot receives events/register data. Null if the bot doesn&#39;t have such a default stream. */,
  `default_all_public_streams` boolean /*Whether the bot can send messages to all streams by default. */,
  `avatar_url` text /*The URL of the bot&#39;s avatar. */,
  `owner_id` int /*The user id of the bot&#39;s owner.  Null if the bot has no owner. */,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BasicBotBaseOneOfLessThanObjectCommaObjectGreaterThan` generated from model 'BasicBotBaseOneOfLessThanObjectCommaObjectGreaterThan'

CREATE TABLE IF NOT EXISTS `BasicBotBaseOneOfLessThanObjectCommaObjectGreaterThan` (
  `basicBotBase` long NOT NULL
  `oneOfLessThanObjectCommaObjectGreaterThan` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BasicStream` generated from model 'basicStream'
--

CREATE TABLE IF NOT EXISTS `BasicStream` (
  `stream_id` blob,
  `name` blob,
  `description` blob,
  `date_created` blob,
  `invite_only` blob,
  `rendered_description` blob,
  `is_web_public` blob,
  `stream_post_policy` blob,
  `message_retention_days` blob,
  `history_public_to_subscribers` blob,
  `first_message_id` blob,
  `is_announcement_only` blob
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BasicStream_allOf` generated from model 'basicStreamAllOf'
--

CREATE TABLE IF NOT EXISTS `BasicStream_allOf` (
  `stream_id` blob,
  `name` blob,
  `description` blob,
  `date_created` blob,
  `invite_only` blob,
  `rendered_description` blob,
  `is_web_public` blob,
  `stream_post_policy` blob,
  `message_retention_days` blob,
  `history_public_to_subscribers` blob,
  `first_message_id` blob,
  `is_announcement_only` blob
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BasicStreamBase` generated from model 'basicStreamBase'
-- Object containing basic details about the stream. 
--

CREATE TABLE IF NOT EXISTS `BasicStreamBase` (
  `stream_id` int /*The unique ID of the stream. */,
  `name` text /*The name of the stream. */,
  `description` text /*The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream&#39;s description. */,
  `date_created` int /*The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). */,
  `invite_only` boolean /*Specifies whether the stream is private or not. Only people who have been invited can access a private stream. */,
  `rendered_description` text /*The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. */,
  `is_web_public` boolean /*Whether the stream has been configured to allow unauthenticated access to its message history from the web. */,
  `stream_post_policy` int /*Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. */,
  `message_retention_days` int /*Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * &#x60;null&#x60;, the default, means the stream will inherit the organization   level setting. * &#x60;-1&#x60; encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). */,
  `history_public_to_subscribers` boolean /*Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only&#x3D;False implies history_public_to_subscribers&#x3D;True), but clients should not make that assumption, as we may change that behavior in the future. */,
  `first_message_id` int /*The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \&quot;more topics\&quot; widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. */,
  `is_announcement_only` boolean /*Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use &#x60;stream_post_policy&#x60; instead. */
);  /*Object containing basic details about the stream. */


-- --------------------------------------------------------------------------
-- Table structure for table `Bot` generated from model 'bot'
--

CREATE TABLE IF NOT EXISTS `Bot` (
  `user_id` blob,
  `full_name` blob,
  `api_key` blob,
  `default_sending_stream` blob,
  `default_events_register_stream` blob,
  `default_all_public_streams` blob,
  `avatar_url` blob,
  `owner_id` blob,
  `services` blob,
  `email` text /*The email of the bot. */,
  `bot_type` int /*An integer describing the type of bot: * &#x60;1&#x60; for a &#x60;Generic&#x60; bot. * &#x60;2&#x60; for an &#x60;Incoming webhook&#x60; bot. * &#x60;3&#x60; for an &#x60;Outgoing webhook&#x60; bot. * &#x60;4&#x60; for an &#x60;Embedded&#x60; bot. */,
  `is_active` boolean /*A boolean describing whether the user account has been deactivated. */
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Bot_allOf` generated from model 'botAllOf'
-- Object containing details of a bot. 
--

CREATE TABLE IF NOT EXISTS `Bot_allOf` (
  `user_id` blob,
  `full_name` blob,
  `api_key` blob,
  `default_sending_stream` blob,
  `default_events_register_stream` blob,
  `default_all_public_streams` blob,
  `avatar_url` blob,
  `owner_id` blob,
  `services` blob,
  `email` text /*The email of the bot. */,
  `bot_type` int /*An integer describing the type of bot: * &#x60;1&#x60; for a &#x60;Generic&#x60; bot. * &#x60;2&#x60; for an &#x60;Incoming webhook&#x60; bot. * &#x60;3&#x60; for an &#x60;Outgoing webhook&#x60; bot. * &#x60;4&#x60; for an &#x60;Embedded&#x60; bot. */,
  `is_active` boolean /*A boolean describing whether the user account has been deactivated. */
);  /*Object containing details of a bot. */


-- --------------------------------------------------------------------------
-- Table structure for table `CodedError` generated from model 'codedError'
--

CREATE TABLE IF NOT EXISTS `CodedError` (
  `result` blob NOT NULL,
  `msg` blob NOT NULL,
  `code` blob
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CodedError_allOf` generated from model 'codedErrorAllOf'
--

CREATE TABLE IF NOT EXISTS `CodedError_allOf` (
  `result` blob,
  `msg` blob,
  `code` blob
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CodedErrorBase` generated from model 'codedErrorBase'
--

CREATE TABLE IF NOT EXISTS `CodedErrorBase` (
  `result` blob NOT NULL,
  `msg` blob NOT NULL,
  `code` text /*A string that identifies the error. */
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CodedErrorBase_allOf` generated from model 'codedErrorBaseAllOf'
--

CREATE TABLE IF NOT EXISTS `CodedErrorBase_allOf` (
  `result` blob,
  `msg` blob,
  `code` text /*A string that identifies the error. */
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CustomProfileField` generated from model 'customProfileField'
-- Dictionary containing the details of a custom profile field configured for this organization. 
--

CREATE TABLE IF NOT EXISTS `CustomProfileField` (
  `id` int PRIMARY KEY AUTOINCREMENT /*The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. */,
  `type` int /*An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account */,
  `order` int /*Custom profile fields are displayed in both settings UI and UI showing users&#39; profiles in increasing &#x60;order&#x60;. */,
  `name` text /*The name of the custom profile field. */,
  `hint` text /*The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. */,
  `field_data` text /*Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. */
);  /*Dictionary containing the details of a custom profile field configured for this organization. */


-- --------------------------------------------------------------------------
-- Table structure for table `DefaultStreamGroup` generated from model 'defaultStreamGroup'
-- Dictionary containing details of a default stream group. 
--

CREATE TABLE IF NOT EXISTS `DefaultStreamGroup` (
  `name` text /*Name of the default stream group. */,
  `description` text /*Description of the default stream group. */,
  `id` int PRIMARY KEY AUTOINCREMENT /*id of the default stream group. */,
);  /*Dictionary containing details of a default stream group. */

-- --------------------------------------------------------------------------
-- Table structure for table `DefaultStreamGroupBasicStream` generated from model 'DefaultStreamGroupBasicStream'

CREATE TABLE IF NOT EXISTS `DefaultStreamGroupBasicStream` (
  `defaultStreamGroup` long NOT NULL
  `basicStream` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `Draft` generated from model 'draft'
-- A dictionary for representing a message draft. 
--

CREATE TABLE IF NOT EXISTS `Draft` (
  `type` text NOT NULL /*The type of the draft. Either unaddressed (empty string), \&quot;stream\&quot;, or \&quot;private\&quot; (for PMs and private group messages). */,
  `topic` text NOT NULL /*For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. */,
  `content` text NOT NULL /*The body of the draft. Should not contain null bytes. */,
  `id` int PRIMARY KEY AUTOINCREMENT /*The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. */,
  `timestamp` decimal /*A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. */
);  /*A dictionary for representing a message draft. */

-- --------------------------------------------------------------------------
-- Table structure for table `DraftTo` generated from model 'DraftTo'

CREATE TABLE IF NOT EXISTS `DraftTo` (
  `draft` long NOT NULL
  `to` int NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `EmojiBase` generated from model 'emojiBase'
--

CREATE TABLE IF NOT EXISTS `EmojiBase` (
  `emoji_code` text /*A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji. */,
  `emoji_name` text /*Name of the emoji. */,
  `reaction_type` text /*One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji. */
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EmojiReaction` generated from model 'emojiReaction'
--

CREATE TABLE IF NOT EXISTS `EmojiReaction` (
  `emoji_code` blob,
  `emoji_name` blob,
  `reaction_type` blob,
  `user_id` blob,
  `user` blob
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EmojiReaction_allOf` generated from model 'emojiReactionAllOf'
--

CREATE TABLE IF NOT EXISTS `EmojiReaction_allOf` (
  `emoji_code` blob,
  `emoji_name` blob,
  `reaction_type` blob,
  `user_id` blob,
  `user` blob
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EmojiReactionBase` generated from model 'emojiReactionBase'
--

CREATE TABLE IF NOT EXISTS `EmojiReactionBase` (
  `emoji_code` text /*A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji. */,
  `emoji_name` text /*Name of the emoji. */,
  `reaction_type` text /*One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji. */,
  `user_id` int /*The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The &#x60;user&#x60; object is deprecated and will be removed in the future. */,
  `user` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EmojiReactionBase_allOf` generated from model 'emojiReactionBaseAllOf'
--

CREATE TABLE IF NOT EXISTS `EmojiReactionBase_allOf` (
  `user_id` int /*The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The &#x60;user&#x60; object is deprecated and will be removed in the future. */,
  `user` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EmojiReactionBase_allOf_user` generated from model 'emojiReactionBaseAllOfUser'
-- Whether the user is a mirror dummy. Dictionary with data on the user who added the reaction, including the user ID as the &#x60;id&#x60; field.  **Note**: In the [events API](/api/get-events), this &#x60;user&#x60; dictionary confusing had the user ID in a field called &#x60;user_id&#x60; instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the &#x60;user_id&#x60; field. 
--

CREATE TABLE IF NOT EXISTS `EmojiReactionBase_allOf_user` (
  `id` int PRIMARY KEY AUTOINCREMENT /*ID of the user. */,
  `email` text /*Email of the user. */,
  `full_name` text /*Full name of the user. */,
  `is_mirror_dummy` boolean /*Whether the user is a mirror dummy. */
);  /*Whether the user is a mirror dummy. Dictionary with data on the user who added the reaction, including the user ID as the &#x60;id&#x60; field.  **Note**: In the [events API](/api/get-events), this &#x60;user&#x60; dictionary confusing had the user ID in a field called &#x60;user_id&#x60; instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the &#x60;user_id&#x60; field. */


-- --------------------------------------------------------------------------
-- Table structure for table `GetMessages` generated from model 'getMessages'
--

CREATE TABLE IF NOT EXISTS `GetMessages` (
  `avatar_url` blob,
  `client` blob,
  `content` blob,
  `content_type` blob,
  `display_recipient` blob,
  `id` blob PRIMARY KEY,
  `is_me_message` blob,
  `reactions` blob,
  `recipient_id` blob,
  `sender_email` blob,
  `sender_full_name` blob,
  `sender_id` blob,
  `sender_realm_str` blob,
  `stream_id` blob,
  `subject` blob,
  `topic_links` blob,
  `submessages` blob,
  `timestamp` blob,
  `type` blob,
  `last_edit_timestamp` int /*The UNIX timestamp for when the message was last edited, in UTC seconds. */,
  `match_content` text /*Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords. */,
  `match_subject` text /*Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords. */
); 

-- --------------------------------------------------------------------------
-- Table structure for table `GetMessagesFlags` generated from model 'GetMessagesFlags'

CREATE TABLE IF NOT EXISTS `GetMessagesFlags` (
  `getMessages` long NOT NULL
  `flags` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetMessages_allOf` generated from model 'getMessagesAllOf'
--

CREATE TABLE IF NOT EXISTS `GetMessages_allOf` (
  `avatar_url` blob,
  `client` blob,
  `content` blob,
  `content_type` blob,
  `display_recipient` blob,
  `id` blob PRIMARY KEY,
  `is_me_message` blob,
  `reactions` blob,
  `recipient_id` blob,
  `sender_email` blob,
  `sender_full_name` blob,
  `sender_id` blob,
  `sender_realm_str` blob,
  `stream_id` blob,
  `subject` blob,
  `topic_links` blob,
  `submessages` blob,
  `timestamp` blob,
  `type` blob,
  `last_edit_timestamp` int /*The UNIX timestamp for when the message was last edited, in UTC seconds. */,
  `match_content` text /*Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords. */,
  `match_subject` text /*Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords. */
); 

-- --------------------------------------------------------------------------
-- Table structure for table `GetMessagesAllOfFlags` generated from model 'GetMessagesAllOfFlags'

CREATE TABLE IF NOT EXISTS `GetMessagesAllOfFlags` (
  `getMessagesAllOf` long NOT NULL
  `flags` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `Hotspot` generated from model 'hotspot'
-- Dictionary containing details of a single hotspot. 
--

CREATE TABLE IF NOT EXISTS `Hotspot` (
  `delay` decimal /*The delay after which the user should be shown the hotspot. */,
  `name` text /*The name of the hotspot. */,
  `title` text /*The title of the hotspot, as will be displayed to the user. */,
  `description` text /*The description of the hotspot, as will be displayed to the user. */
);  /*Dictionary containing details of a single hotspot. */


-- --------------------------------------------------------------------------
-- Table structure for table `inline_response_200` generated from model 'inlineResponse200'
-- This is an example of the JSON payload that the Zulip server will &#x60;POST&#x60; to your server 
--

CREATE TABLE IF NOT EXISTS `inline_response_200` (
  `bot_email` text /*Email of the bot user. */,
  `bot_full_name` text /*The full name of the bot user. */,
  `data` text /*The message content, in raw Markdown format (not rendered to HTML). */,
  `trigger` text /*What aspect of the message triggered the outgoing webhook notification. Possible values include &#x60;private_message&#x60; and &#x60;mention&#x60;. */,
  `token` text /*A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the &#x60;zuliprc&#x60; file downloaded when creating the bot. */,
  `message` long /*A dict containing details on the message that triggered the outgoing webhook, in the format used by [&#x60;GET /messages&#x60;](/api/get-messages). */
);  /*This is an example of the JSON payload that the Zulip server will &#x60;POST&#x60; to your server */


-- --------------------------------------------------------------------------
-- Table structure for table `InvalidApiKeyError` generated from model 'invalidApiKeyError'
--

CREATE TABLE IF NOT EXISTS `InvalidApiKeyError` (
  `result` blob NOT NULL,
  `msg` blob NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `InvalidMessageError` generated from model 'invalidMessageError'
--

CREATE TABLE IF NOT EXISTS `InvalidMessageError` (
  `result` blob NOT NULL,
  `msg` blob NOT NULL,
  `raw_content` text /*The raw content of the message. */
); 


-- --------------------------------------------------------------------------
-- Table structure for table `InvalidMessageError_allOf` generated from model 'invalidMessageErrorAllOf'
--

CREATE TABLE IF NOT EXISTS `InvalidMessageError_allOf` (
  `result` blob,
  `msg` blob,
  `raw_content` text /*The raw content of the message. */
); 


-- --------------------------------------------------------------------------
-- Table structure for table `JsonError` generated from model 'jsonError'
--

CREATE TABLE IF NOT EXISTS `JsonError` (
  `result` blob NOT NULL,
  `msg` blob NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `JsonErrorBase` generated from model 'jsonErrorBase'
--

CREATE TABLE IF NOT EXISTS `JsonErrorBase` (
  `result` text NOT NULL,
  `msg` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `JsonErrorBase_allOf` generated from model 'jsonErrorBaseAllOf'
--

CREATE TABLE IF NOT EXISTS `JsonErrorBase_allOf` (
  `result` text NOT NULL,
  `msg` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `JsonResponseBase` generated from model 'jsonResponseBase'
--

CREATE TABLE IF NOT EXISTS `JsonResponseBase` (
  `result` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `JsonSuccess` generated from model 'jsonSuccess'
--

CREATE TABLE IF NOT EXISTS `JsonSuccess` (
  `result` blob NOT NULL,
  `msg` blob NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `JsonSuccess_allOf` generated from model 'jsonSuccessAllOf'
--

CREATE TABLE IF NOT EXISTS `JsonSuccess_allOf` (
  `result` blob,
  `msg` blob
); 


-- --------------------------------------------------------------------------
-- Table structure for table `JsonSuccessBase` generated from model 'jsonSuccessBase'
--

CREATE TABLE IF NOT EXISTS `JsonSuccessBase` (
  `result` text NOT NULL,
  `msg` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `JsonSuccessBase_allOf` generated from model 'jsonSuccessBaseAllOf'
--

CREATE TABLE IF NOT EXISTS `JsonSuccessBase_allOf` (
  `result` text NOT NULL,
  `msg` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Messages` generated from model 'messages'
--

CREATE TABLE IF NOT EXISTS `Messages` (
  `avatar_url` blob,
  `client` blob,
  `content` blob,
  `content_type` blob,
  `display_recipient` blob,
  `id` blob PRIMARY KEY,
  `is_me_message` blob,
  `reactions` blob,
  `recipient_id` blob,
  `sender_email` blob,
  `sender_full_name` blob,
  `sender_id` blob,
  `sender_realm_str` blob,
  `stream_id` blob,
  `subject` blob,
  `topic_links` blob,
  `submessages` blob,
  `timestamp` blob,
  `type` blob
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Messages_allOf` generated from model 'messagesAllOf'
--

CREATE TABLE IF NOT EXISTS `Messages_allOf` (
  `avatar_url` blob,
  `client` blob,
  `content` blob,
  `content_type` blob,
  `display_recipient` blob,
  `id` blob PRIMARY KEY,
  `is_me_message` blob,
  `reactions` blob,
  `recipient_id` blob,
  `sender_email` blob,
  `sender_full_name` blob,
  `sender_id` blob,
  `sender_realm_str` blob,
  `stream_id` blob,
  `subject` blob,
  `topic_links` blob,
  `submessages` blob,
  `timestamp` blob,
  `type` blob
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MessagesBase` generated from model 'messagesBase'
-- Object containing details of the message. 
--

CREATE TABLE IF NOT EXISTS `MessagesBase` (
  `avatar_url` text /*The URL of the user&#39;s avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user&#39;s email address itself for this user. */,
  `client` text /*A Zulip \&quot;client\&quot; string, describing what Zulip client sent the message. */,
  `content` text /*The content/body of the message. */,
  `content_type` text /*The HTTP &#x60;content_type&#x60; for the message content.  This will be &#x60;text/html&#x60; or &#x60;text/x-markdown&#x60;, depending on whether &#x60;apply_markdown&#x60; was set. */,
  `display_recipient` long /*Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. */,
  `id` int PRIMARY KEY AUTOINCREMENT /*The unique message ID.  Messages should always be displayed sorted by ID. */,
  `is_me_message` boolean /*Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages */,
  `recipient_id` int /*A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. */,
  `sender_email` text /*The Zulip display email address of the message&#39;s sender. */,
  `sender_full_name` text /*The full name of the message&#39;s sender. */,
  `sender_id` int /*The user ID of the message&#39;s sender. */,
  `sender_realm_str` text /*A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on &#x60;example.zulip.com&#x60;, this will be &#x60;example&#x60;. */,
  `stream_id` int /*Only present for stream messages; the ID of the stream. */,
  `subject` text /*The &#x60;topic&#x60; of the message.  Currently always &#x60;\&quot;\&quot;&#x60; for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \&quot;subjects\&quot; and will eventually change. */,
  `timestamp` int /*The UNIX timestamp for when the message was sent, in UTC seconds. */,
  `type` text /*The type of the message: &#x60;stream&#x60; or &#x60;private&#x60;. */
);  /*Object containing details of the message. */

-- --------------------------------------------------------------------------
-- Table structure for table `MessagesBaseEmojiReaction` generated from model 'MessagesBaseEmojiReaction'

CREATE TABLE IF NOT EXISTS `MessagesBaseEmojiReaction` (
  `messagesBase` long NOT NULL
  `emojiReaction` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MessagesBaseMessagesBaseTopicLinks` generated from model 'MessagesBaseMessagesBaseTopicLinks'

CREATE TABLE IF NOT EXISTS `MessagesBaseMessagesBaseTopicLinks` (
  `messagesBase` long NOT NULL
  `messagesBaseTopicLinks` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MessagesBaseSubmessages` generated from model 'MessagesBaseSubmessages'

CREATE TABLE IF NOT EXISTS `MessagesBaseSubmessages` (
  `messagesBase` long NOT NULL
  `submessages` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MessagesBase_topic_links` generated from model 'messagesBaseTopicLinks'
--

CREATE TABLE IF NOT EXISTS `MessagesBase_topic_links` (
  `text` text /*The original link text present in the topic. */,
  `url` text /*The expanded target url which the link points to. */
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MissingArgumentError` generated from model 'missingArgumentError'
--

CREATE TABLE IF NOT EXISTS `MissingArgumentError` (
  `result` blob NOT NULL,
  `msg` blob NOT NULL,
  `code` blob,
  `var_name` text /*It contains the information about the missing parameter. */
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MissingArgumentError_allOf` generated from model 'missingArgumentErrorAllOf'
-- ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
--

CREATE TABLE IF NOT EXISTS `MissingArgumentError_allOf` (
  `result` blob,
  `msg` blob,
  `code` blob,
  `var_name` text /*It contains the information about the missing parameter. */
);  /*## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied */


-- --------------------------------------------------------------------------
-- Table structure for table `NonExistingStreamError` generated from model 'nonExistingStreamError'
--

CREATE TABLE IF NOT EXISTS `NonExistingStreamError` (
  `result` blob NOT NULL,
  `msg` blob NOT NULL,
  `code` blob,
  `stream` text /*The name of the stream that could not be found. */
); 


-- --------------------------------------------------------------------------
-- Table structure for table `NonExistingStreamError_allOf` generated from model 'nonExistingStreamErrorAllOf'
--

CREATE TABLE IF NOT EXISTS `NonExistingStreamError_allOf` (
  `result` blob,
  `msg` blob,
  `code` blob,
  `stream` text /*The name of the stream that could not be found. */
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Presence` generated from model 'presence'
-- &#x60;{client_name}&#x60;: Object containing the details of the user&#39;s presence on a particular platform with the client&#39;s platform name being the object key. 
--

CREATE TABLE IF NOT EXISTS `Presence` (
  `client` text /*The client&#39;s platform name. */,
  `status` text /*The status of the user on this client. It is either &#x60;idle&#x60; or &#x60;active&#x60;. */,
  `timestamp` int /*The UNIX timestamp of when this client sent the user&#39;s presence to the server with the precision of a second. */,
  `pushable` boolean /*Whether the client is capable of showing mobile/push notifications to the user. */
);  /*&#x60;{client_name}&#x60;: Object containing the details of the user&#39;s presence on a particular platform with the client&#39;s platform name being the object key. */


-- --------------------------------------------------------------------------
-- Table structure for table `RateLimitedError` generated from model 'rateLimitedError'
--

CREATE TABLE IF NOT EXISTS `RateLimitedError` (
  `result` blob NOT NULL,
  `msg` blob NOT NULL,
  `code` blob
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RealmDeactivatedError` generated from model 'realmDeactivatedError'
--

CREATE TABLE IF NOT EXISTS `RealmDeactivatedError` (
  `result` blob NOT NULL,
  `msg` blob NOT NULL,
  `code` blob
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RealmDomain` generated from model 'realmDomain'
-- Object containing details of the newly added domain. 
--

CREATE TABLE IF NOT EXISTS `RealmDomain` (
  `domain` text /*The new allowed domain. */,
  `allow_subdomains` boolean /*Whether subdomains are allowed for this domain. */
);  /*Object containing details of the newly added domain. */


-- --------------------------------------------------------------------------
-- Table structure for table `RealmEmoji` generated from model 'realmEmoji'
-- &#x60;{emoji_id}&#x60;: Object containing details about the emoji with  the specified ID. It has the following properties: 
--

CREATE TABLE IF NOT EXISTS `RealmEmoji` (
  `id` text PRIMARY KEY /*The ID for this emoji, same as the object&#39;s key. */,
  `name` text /*The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (&#x60;:name  :&#x60;). */,
  `source_url` text /*The path relative to the organization&#39;s URL where the emoji&#39;s image can be found. */,
  `deactivated` boolean /*Whether the emoji has been deactivated or not. */,
  `author_id` int /*The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and &#x60;author&#x60; object with an &#x60;id&#x60; field. */
);  /*&#x60;{emoji_id}&#x60;: Object containing details about the emoji with  the specified ID. It has the following properties: */


-- --------------------------------------------------------------------------
-- Table structure for table `RealmExport` generated from model 'realmExport'
-- Object containing details about a realm export. 
--

CREATE TABLE IF NOT EXISTS `RealmExport` (
  `id` int PRIMARY KEY AUTOINCREMENT /*The id of the export. */,
  `acting_user_id` int /*The id of the user who did the export. */,
  `export_time` decimal /*The UNIX timestamp of when the export was made. */,
  `deleted_timestamp` decimal /*The timestamp of when the export was deleted. Null if it wasn&#39;t. */,
  `failed_timestamp` decimal /*The timestamp of when the export failed. Null if it didn&#39;t. */,
  `export_url` text /*The URL of the export. &#x60;null&#x60; if there&#39;s no URL. */,
  `pending` boolean /*Whether the export is pending or not. */
);  /*Object containing details about a realm export. */


-- --------------------------------------------------------------------------
-- Table structure for table `RealmPlayground` generated from model 'realmPlayground'
-- Object containing details about a realm playground. 
--

CREATE TABLE IF NOT EXISTS `RealmPlayground` (
  `id` int PRIMARY KEY AUTOINCREMENT /*The unique ID for the realm playground. */,
  `name` text /*The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). */,
  `pygments_language` text /*The name of the Pygments language lexer for that programming language. */,
  `url_prefix` text /*The url prefix for the playground. */
);  /*Object containing details about a realm playground. */


-- --------------------------------------------------------------------------
-- Table structure for table `Subscriptions` generated from model 'subscriptions'
--

CREATE TABLE IF NOT EXISTS `Subscriptions` (
  `stream_id` int /*The unique ID of a stream. */,
  `name` text /*The name of a stream. */,
  `description` text /*The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream&#39;s description. */,
  `rendered_description` text /*A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. */,
  `date_created` int /*The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). */,
  `invite_only` boolean /*Specifies whether the stream is private or not. Only people who have been invited can access a private stream. */,
  `desktop_notifications` boolean /*A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. */,
  `email_notifications` boolean /*A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. */,
  `wildcard_mentions_notify` boolean /*A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. */,
  `push_notifications` boolean /*A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. */,
  `audible_notifications` boolean /*A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. */,
  `pin_to_top` boolean /*A boolean specifying whether the given stream has been pinned to the top. */,
  `email_address` text /*Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). */,
  `is_muted` boolean /*Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in &#x60;All messages&#x60; view (previously known as &#x60;Home&#x60; view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named &#x60;in_home_view&#x60; (with the opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;). */,
  `in_home_view` boolean /*Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. */,
  `is_announcement_only` boolean /*Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use &#x60;stream_post_policy&#x60; instead. */,
  `is_web_public` boolean /*Whether the stream has been configured to allow unauthenticated access to its message history from the web. */,
  `role` int /*The user&#39;s role within the stream (distinct from the user&#39;s [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 &#x3D;&gt; Stream administrator. * 50 &#x3D;&gt; Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). */,
  `color` text /*The user&#39;s personal color for the stream. */,
  `stream_post_policy` int /*Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. */,
  `message_retention_days` int /*Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * &#x60;null&#x60;, the default, means the stream will inherit the organization   level setting. * &#x60;-1&#x60; encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). */,
  `history_public_to_subscribers` boolean /*Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only&#x3D;False implies history_public_to_subscribers&#x3D;True), but clients should not make that assumption, as we may change that behavior in the future. */,
  `first_message_id` int /*The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \&quot;more topics\&quot; widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. */,
  `stream_weekly_traffic` int /*The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. */
); 

-- --------------------------------------------------------------------------
-- Table structure for table `SubscriptionsSubscribers` generated from model 'SubscriptionsSubscribers'

CREATE TABLE IF NOT EXISTS `SubscriptionsSubscribers` (
  `subscriptions` long NOT NULL
  `subscribers` int NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `User` generated from model 'user'
--

CREATE TABLE IF NOT EXISTS `User` (
  `email` blob,
  `is_bot` blob,
  `avatar_url` blob,
  `avatar_version` blob,
  `full_name` blob,
  `is_admin` blob,
  `is_owner` blob,
  `is_billing_admin` blob,
  `role` blob,
  `bot_type` blob,
  `user_id` blob,
  `bot_owner_id` blob,
  `is_active` blob,
  `is_guest` blob,
  `timezone` blob,
  `date_joined` blob,
  `delivery_email` blob,
  `profile_data` blob
); 


-- --------------------------------------------------------------------------
-- Table structure for table `User_allOf` generated from model 'userAllOf'
--

CREATE TABLE IF NOT EXISTS `User_allOf` (
  `email` blob,
  `is_bot` blob,
  `avatar_url` blob,
  `avatar_version` blob,
  `full_name` blob,
  `is_admin` blob,
  `is_owner` blob,
  `is_billing_admin` blob,
  `role` blob,
  `bot_type` blob,
  `user_id` blob,
  `bot_owner_id` blob,
  `is_active` blob,
  `is_guest` blob,
  `timezone` blob,
  `date_joined` blob,
  `delivery_email` blob,
  `profile_data` blob
); 


-- --------------------------------------------------------------------------
-- Table structure for table `UserBase` generated from model 'userBase'
-- A dictionary containing basic data on a given Zulip user. 
--

CREATE TABLE IF NOT EXISTS `UserBase` (
  `email` text /*The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. */,
  `is_bot` boolean /*A boolean specifying whether the user is a bot or full account. */,
  `avatar_url` text /*URL for the user&#39;s avatar.  Will be &#x60;null&#x60; if the &#x60;client_gravatar&#x60; query parameter was set to &#x60;True&#x60; and the user&#39;s avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the &#x60;user_avatar_url_field_optional&#x60; capability, this will be missing at the server&#39;s sole discretion. */,
  `avatar_version` int /*Version for the user&#39;s avatar.  Used for cache-busting requests for the user&#39;s avatar.  Clients generally shouldn&#39;t need to use this; most avatar URLs sent by Zulip will already end with &#x60;?v&#x3D;{avatar_version}&#x60;. */,
  `full_name` text /*Full name of the user or bot, used for all display purposes. */,
  `is_admin` boolean /*A boolean specifying whether the user is an organization administrator. */,
  `is_owner` boolean /*A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). */,
  `is_billing_admin` boolean /*A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). */,
  `role` int /*[Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner &#x3D;&gt; 100 * Organization administrator &#x3D;&gt; 200 * Organization moderator &#x3D;&gt; 300 * Member &#x3D;&gt; 400 * Guest &#x3D;&gt; 600  **Changes**: New in Zulip 4.0 (feature level 59). */,
  `bot_type` int /*An integer describing the type of bot: * &#x60;null&#x60; if the user isn&#39;t a bot. * &#x60;1&#x60; for a &#x60;Generic&#x60; bot. * &#x60;2&#x60; for an &#x60;Incoming webhook&#x60; bot. * &#x60;3&#x60; for an &#x60;Outgoing webhook&#x60; bot. * &#x60;4&#x60; for an &#x60;Embedded&#x60; bot. */,
  `user_id` int /*The unique ID of the user. */,
  `bot_owner_id` int /*If the user is a bot (i.e. &#x60;is_bot&#x60; is &#x60;True&#x60;), &#x60;bot_owner&#x60; is the user ID of the bot&#39;s owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a &#x60;bot_owner&#x60; field containing the email address of the bot&#39;s owner. */,
  `is_active` boolean /*A boolean specifying whether the user account has been deactivated. */,
  `is_guest` boolean /*A boolean specifying whether the user is a guest user. */,
  `timezone` text /*The time zone of the user. */,
  `date_joined` text /*The time the user account was created. */,
  `delivery_email` text /*The user&#39;s real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. */,
  `profile_data` blob /*A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user&#39;s data for that field.  Generally the data includes just a single &#x60;value&#x60; key; for those custom profile fields supporting Markdown, a &#x60;rendered_value&#x60; key will also be present. */
);  /*A dictionary containing basic data on a given Zulip user. */


-- --------------------------------------------------------------------------
-- Table structure for table `UserDeactivatedError` generated from model 'userDeactivatedError'
--

CREATE TABLE IF NOT EXISTS `UserDeactivatedError` (
  `result` blob NOT NULL,
  `msg` blob NOT NULL,
  `code` blob
); 


-- --------------------------------------------------------------------------
-- Table structure for table `UserGroup` generated from model 'userGroup'
-- Object containing the user group&#39;s attributes. 
--

CREATE TABLE IF NOT EXISTS `UserGroup` (
  `name` text /*The name of the user group. */,
  `description` text /*The description of the user group. */,
  `id` int PRIMARY KEY AUTOINCREMENT /*The ID of the user group. */
);  /*Object containing the user group&#39;s attributes. */

-- --------------------------------------------------------------------------
-- Table structure for table `UserGroupMembers` generated from model 'UserGroupMembers'

CREATE TABLE IF NOT EXISTS `UserGroupMembers` (
  `userGroup` long NOT NULL
  `members` int NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UserNotAuthorizedError` generated from model 'userNotAuthorizedError'
--

CREATE TABLE IF NOT EXISTS `UserNotAuthorizedError` (
  `result` blob NOT NULL,
  `msg` blob NOT NULL,
  `code` blob
); 



--
-- Table structure for table `_db_version`
--
CREATE TABLE IF NOT EXISTS `_db_version` (
  `version`    LONG    DEFAULT 1
);
