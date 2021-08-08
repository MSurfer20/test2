/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */

-- --------------------------------------------------------

--
-- Table structure for table `AddSubscriptionsResponse` generated from model 'AddSubscriptionsResponse'
--

CREATE TABLE IF NOT EXISTS `AddSubscriptionsResponse` (
  `result` TEXT NOT NULL,
  `msg` TEXT NOT NULL,
  `subscribed` JSON DEFAULT NULL COMMENT 'A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. ',
  `already_subscribed` JSON DEFAULT NULL COMMENT 'A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. ',
  `unauthorized` JSON DEFAULT NULL COMMENT 'A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if &#x60;authorization_errors_fatal&#x3D;false&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AddSubscriptionsResponse_allOf` generated from model 'AddSubscriptionsResponseUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `AddSubscriptionsResponse_allOf` (
  `result` TEXT DEFAULT NULL,
  `msg` TEXT DEFAULT NULL,
  `subscribed` JSON DEFAULT NULL COMMENT 'A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. ',
  `already_subscribed` JSON DEFAULT NULL COMMENT 'A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. ',
  `unauthorized` JSON DEFAULT NULL COMMENT 'A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if &#x60;authorization_errors_fatal&#x3D;false&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ApiKeyResponse` generated from model 'ApiKeyResponse'
--

CREATE TABLE IF NOT EXISTS `ApiKeyResponse` (
  `result` TEXT NOT NULL,
  `msg` TEXT NOT NULL,
  `api_key` TEXT NOT NULL COMMENT 'The API key that can be used to authenticate as the requested user. ',
  `email` TEXT NOT NULL COMMENT 'The email address of the user who owns the API key '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ApiKeyResponse_allOf` generated from model 'ApiKeyResponseUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `ApiKeyResponse_allOf` (
  `result` TEXT DEFAULT NULL,
  `msg` TEXT DEFAULT NULL,
  `api_key` TEXT NOT NULL COMMENT 'The API key that can be used to authenticate as the requested user. ',
  `email` TEXT NOT NULL COMMENT 'The email address of the user who owns the API key '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Attachments` generated from model 'Attachments'
-- Dictionary containing details of a file uploaded by a user. 
--

CREATE TABLE IF NOT EXISTS `Attachments` (
  `id` INT DEFAULT NULL COMMENT 'The unique ID for the attachment. ',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the uploaded file. ',
  `path_id` TEXT DEFAULT NULL COMMENT 'A representation of the path of the file within the repository of user-uploaded files.  If the &#x60;path_id&#x60; of a file is &#x60;{realm_id}/ab/cdef/temp_file.py&#x60;, its URL will be: &#x60;{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py&#x60;. ',
  `size` INT DEFAULT NULL COMMENT 'Size of the file in bytes. ',
  `create_time` INT DEFAULT NULL COMMENT 'Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. ',
  `messages` JSON DEFAULT NULL COMMENT 'Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Dictionary containing details of a file uploaded by a user. ';

--
-- Table structure for table `Attachments_messages` generated from model 'AttachmentsUnderscoremessages'
--

CREATE TABLE IF NOT EXISTS `Attachments_messages` (
  `date_sent` INT DEFAULT NULL COMMENT 'Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called &#x60;name&#x60; and was a floating point number. ',
  `id` INT DEFAULT NULL COMMENT 'The unique message ID.  Messages should always be displayed sorted by ID. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BadEventQueueIdError` generated from model 'BadEventQueueIdError'
--

CREATE TABLE IF NOT EXISTS `BadEventQueueIdError` (
  `result` TEXT NOT NULL,
  `msg` TEXT NOT NULL,
  `code` TEXT DEFAULT NULL,
  `queue_id` TEXT DEFAULT NULL COMMENT 'The string that identifies the invalid event queue. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BadEventQueueIdError_allOf` generated from model 'BadEventQueueIdErrorUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `BadEventQueueIdError_allOf` (
  `result` TEXT DEFAULT NULL,
  `msg` TEXT DEFAULT NULL,
  `code` TEXT DEFAULT NULL,
  `queue_id` TEXT DEFAULT NULL COMMENT 'The string that identifies the invalid event queue. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BasicBot` generated from model 'BasicBot'
--

CREATE TABLE IF NOT EXISTS `BasicBot` (
  `user_id` TEXT DEFAULT NULL,
  `full_name` TEXT DEFAULT NULL,
  `api_key` TEXT DEFAULT NULL,
  `default_sending_stream` TEXT DEFAULT NULL,
  `default_events_register_stream` TEXT DEFAULT NULL,
  `default_all_public_streams` TEXT DEFAULT NULL,
  `avatar_url` TEXT DEFAULT NULL,
  `owner_id` TEXT DEFAULT NULL,
  `services` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BasicBot_allOf` generated from model 'BasicBotUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `BasicBot_allOf` (
  `user_id` TEXT DEFAULT NULL,
  `full_name` TEXT DEFAULT NULL,
  `api_key` TEXT DEFAULT NULL,
  `default_sending_stream` TEXT DEFAULT NULL,
  `default_events_register_stream` TEXT DEFAULT NULL,
  `default_all_public_streams` TEXT DEFAULT NULL,
  `avatar_url` TEXT DEFAULT NULL,
  `owner_id` TEXT DEFAULT NULL,
  `services` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BasicBotBase` generated from model 'BasicBotBase'
--

CREATE TABLE IF NOT EXISTS `BasicBotBase` (
  `user_id` INT DEFAULT NULL COMMENT 'The user id of the bot. ',
  `full_name` TEXT DEFAULT NULL COMMENT 'The full name of the bot. ',
  `api_key` TEXT DEFAULT NULL COMMENT 'The API key of the bot which it uses to make API requests. ',
  `default_sending_stream` TEXT DEFAULT NULL COMMENT 'The default sending stream of the bot. Null if the bot doesn&#39;t have a default sending stream. ',
  `default_events_register_stream` TEXT DEFAULT NULL COMMENT 'The default stream for which the bot receives events/register data. Null if the bot doesn&#39;t have such a default stream. ',
  `default_all_public_streams` TINYINT(1) DEFAULT NULL COMMENT 'Whether the bot can send messages to all streams by default. ',
  `avatar_url` TEXT DEFAULT NULL COMMENT 'The URL of the bot&#39;s avatar. ',
  `owner_id` INT DEFAULT NULL COMMENT 'The user id of the bot&#39;s owner.  Null if the bot has no owner. ',
  `services` JSON DEFAULT NULL COMMENT 'The \&quot;Services\&quot; array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BasicStream` generated from model 'BasicStream'
--

CREATE TABLE IF NOT EXISTS `BasicStream` (
  `stream_id` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `date_created` TEXT DEFAULT NULL,
  `invite_only` TEXT DEFAULT NULL,
  `rendered_description` TEXT DEFAULT NULL,
  `is_web_public` TEXT DEFAULT NULL,
  `stream_post_policy` TEXT DEFAULT NULL,
  `message_retention_days` TEXT DEFAULT NULL,
  `history_public_to_subscribers` TEXT DEFAULT NULL,
  `first_message_id` TEXT DEFAULT NULL,
  `is_announcement_only` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BasicStream_allOf` generated from model 'BasicStreamUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `BasicStream_allOf` (
  `stream_id` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `date_created` TEXT DEFAULT NULL,
  `invite_only` TEXT DEFAULT NULL,
  `rendered_description` TEXT DEFAULT NULL,
  `is_web_public` TEXT DEFAULT NULL,
  `stream_post_policy` TEXT DEFAULT NULL,
  `message_retention_days` TEXT DEFAULT NULL,
  `history_public_to_subscribers` TEXT DEFAULT NULL,
  `first_message_id` TEXT DEFAULT NULL,
  `is_announcement_only` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BasicStreamBase` generated from model 'BasicStreamBase'
-- Object containing basic details about the stream. 
--

CREATE TABLE IF NOT EXISTS `BasicStreamBase` (
  `stream_id` INT DEFAULT NULL COMMENT 'The unique ID of the stream. ',
  `name` TEXT DEFAULT NULL COMMENT 'The name of the stream. ',
  `description` TEXT DEFAULT NULL COMMENT 'The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream&#39;s description. ',
  `date_created` INT DEFAULT NULL COMMENT 'The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). ',
  `invite_only` TINYINT(1) DEFAULT NULL COMMENT 'Specifies whether the stream is private or not. Only people who have been invited can access a private stream. ',
  `rendered_description` TEXT DEFAULT NULL COMMENT 'The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. ',
  `is_web_public` TINYINT(1) DEFAULT NULL COMMENT 'Whether the stream has been configured to allow unauthenticated access to its message history from the web. ',
  `stream_post_policy` INT DEFAULT NULL COMMENT 'Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. ',
  `message_retention_days` INT DEFAULT NULL COMMENT 'Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * &#x60;null&#x60;, the default, means the stream will inherit the organization   level setting. * &#x60;-1&#x60; encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). ',
  `history_public_to_subscribers` TINYINT(1) DEFAULT NULL COMMENT 'Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only&#x3D;False implies history_public_to_subscribers&#x3D;True), but clients should not make that assumption, as we may change that behavior in the future. ',
  `first_message_id` INT DEFAULT NULL COMMENT 'The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \&quot;more topics\&quot; widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. ',
  `is_announcement_only` TINYINT(1) DEFAULT NULL COMMENT 'Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use &#x60;stream_post_policy&#x60; instead. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object containing basic details about the stream. ';

--
-- Table structure for table `Bot` generated from model 'Bot'
--

CREATE TABLE IF NOT EXISTS `Bot` (
  `user_id` TEXT DEFAULT NULL,
  `full_name` TEXT DEFAULT NULL,
  `api_key` TEXT DEFAULT NULL,
  `default_sending_stream` TEXT DEFAULT NULL,
  `default_events_register_stream` TEXT DEFAULT NULL,
  `default_all_public_streams` TEXT DEFAULT NULL,
  `avatar_url` TEXT DEFAULT NULL,
  `owner_id` TEXT DEFAULT NULL,
  `services` TEXT DEFAULT NULL,
  `email` TEXT DEFAULT NULL COMMENT 'The email of the bot. ',
  `bot_type` INT DEFAULT NULL COMMENT 'An integer describing the type of bot: * &#x60;1&#x60; for a &#x60;Generic&#x60; bot. * &#x60;2&#x60; for an &#x60;Incoming webhook&#x60; bot. * &#x60;3&#x60; for an &#x60;Outgoing webhook&#x60; bot. * &#x60;4&#x60; for an &#x60;Embedded&#x60; bot. ',
  `is_active` TINYINT(1) DEFAULT NULL COMMENT 'A boolean describing whether the user account has been deactivated. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Bot_allOf` generated from model 'BotUnderscoreallOf'
-- Object containing details of a bot. 
--

CREATE TABLE IF NOT EXISTS `Bot_allOf` (
  `user_id` TEXT DEFAULT NULL,
  `full_name` TEXT DEFAULT NULL,
  `api_key` TEXT DEFAULT NULL,
  `default_sending_stream` TEXT DEFAULT NULL,
  `default_events_register_stream` TEXT DEFAULT NULL,
  `default_all_public_streams` TEXT DEFAULT NULL,
  `avatar_url` TEXT DEFAULT NULL,
  `owner_id` TEXT DEFAULT NULL,
  `services` TEXT DEFAULT NULL,
  `email` TEXT DEFAULT NULL COMMENT 'The email of the bot. ',
  `bot_type` INT DEFAULT NULL COMMENT 'An integer describing the type of bot: * &#x60;1&#x60; for a &#x60;Generic&#x60; bot. * &#x60;2&#x60; for an &#x60;Incoming webhook&#x60; bot. * &#x60;3&#x60; for an &#x60;Outgoing webhook&#x60; bot. * &#x60;4&#x60; for an &#x60;Embedded&#x60; bot. ',
  `is_active` TINYINT(1) DEFAULT NULL COMMENT 'A boolean describing whether the user account has been deactivated. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object containing details of a bot. ';

--
-- Table structure for table `CodedError` generated from model 'CodedError'
--

CREATE TABLE IF NOT EXISTS `CodedError` (
  `result` TEXT NOT NULL,
  `msg` TEXT NOT NULL,
  `code` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CodedError_allOf` generated from model 'CodedErrorUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `CodedError_allOf` (
  `result` TEXT DEFAULT NULL,
  `msg` TEXT DEFAULT NULL,
  `code` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CodedErrorBase` generated from model 'CodedErrorBase'
--

CREATE TABLE IF NOT EXISTS `CodedErrorBase` (
  `result` TEXT NOT NULL,
  `msg` TEXT NOT NULL,
  `code` TEXT DEFAULT NULL COMMENT 'A string that identifies the error. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CodedErrorBase_allOf` generated from model 'CodedErrorBaseUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `CodedErrorBase_allOf` (
  `result` TEXT DEFAULT NULL,
  `msg` TEXT DEFAULT NULL,
  `code` TEXT DEFAULT NULL COMMENT 'A string that identifies the error. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CustomProfileField` generated from model 'CustomProfileField'
-- Dictionary containing the details of a custom profile field configured for this organization. 
--

CREATE TABLE IF NOT EXISTS `CustomProfileField` (
  `id` INT DEFAULT NULL COMMENT 'The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. ',
  `type` INT DEFAULT NULL COMMENT 'An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account ',
  `order` INT DEFAULT NULL COMMENT 'Custom profile fields are displayed in both settings UI and UI showing users&#39; profiles in increasing &#x60;order&#x60;. ',
  `name` TEXT DEFAULT NULL COMMENT 'The name of the custom profile field. ',
  `hint` TEXT DEFAULT NULL COMMENT 'The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. ',
  `field_data` TEXT DEFAULT NULL COMMENT 'Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Dictionary containing the details of a custom profile field configured for this organization. ';

--
-- Table structure for table `DefaultStreamGroup` generated from model 'DefaultStreamGroup'
-- Dictionary containing details of a default stream group. 
--

CREATE TABLE IF NOT EXISTS `DefaultStreamGroup` (
  `name` TEXT DEFAULT NULL COMMENT 'Name of the default stream group. ',
  `description` TEXT DEFAULT NULL COMMENT 'Description of the default stream group. ',
  `id` INT DEFAULT NULL COMMENT 'id of the default stream group. ',
  `streams` JSON DEFAULT NULL COMMENT 'Array containing details about the streams in the default stream group. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Dictionary containing details of a default stream group. ';

--
-- Table structure for table `EmojiReaction` generated from model 'EmojiReaction'
--

CREATE TABLE IF NOT EXISTS `EmojiReaction` (
  `emoji_code` TEXT DEFAULT NULL,
  `emoji_name` TEXT DEFAULT NULL,
  `reaction_type` TEXT DEFAULT NULL,
  `user_id` TEXT DEFAULT NULL,
  `user` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EmojiReaction_allOf` generated from model 'EmojiReactionUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `EmojiReaction_allOf` (
  `emoji_code` TEXT DEFAULT NULL,
  `emoji_name` TEXT DEFAULT NULL,
  `reaction_type` TEXT DEFAULT NULL,
  `user_id` TEXT DEFAULT NULL,
  `user` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EmojiReactionBase` generated from model 'EmojiReactionBase'
--

CREATE TABLE IF NOT EXISTS `EmojiReactionBase` (
  `emoji_code` TEXT DEFAULT NULL COMMENT 'A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint. ',
  `emoji_name` TEXT DEFAULT NULL COMMENT 'Name of the emoji. ',
  `reaction_type` TEXT DEFAULT NULL COMMENT 'One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji. ',
  `user_id` INT DEFAULT NULL COMMENT 'The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The &#x60;user&#x60; object is deprecated and will be removed in the future. ',
  `user` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EmojiReactionBase_user` generated from model 'EmojiReactionBaseUnderscoreuser'
-- Dictionary with data on the user who added the reaction, including the user ID as the &#x60;id&#x60; field.  **Note**: In the [events API](/api/get-events), this &#x60;user&#x60; dictionary confusing had the user ID in a field called &#x60;user_id&#x60; instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the &#x60;user_id&#x60; field. 
--

CREATE TABLE IF NOT EXISTS `EmojiReactionBase_user` (
  `id` INT DEFAULT NULL COMMENT 'ID of the user. ',
  `email` TEXT DEFAULT NULL COMMENT 'Email of the user. ',
  `full_name` TEXT DEFAULT NULL COMMENT 'Full name of the user. ',
  `is_mirror_dummy` TINYINT(1) DEFAULT NULL COMMENT 'Whether the user is a mirror dummy. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Dictionary with data on the user who added the reaction, including the user ID as the &#x60;id&#x60; field.  **Note**: In the [events API](/api/get-events), this &#x60;user&#x60; dictionary confusing had the user ID in a field called &#x60;user_id&#x60; instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the &#x60;user_id&#x60; field. ';

--
-- Table structure for table `GetMessages` generated from model 'GetMessages'
--

CREATE TABLE IF NOT EXISTS `GetMessages` (
  `avatar_url` TEXT DEFAULT NULL,
  `client` TEXT DEFAULT NULL,
  `content` TEXT DEFAULT NULL,
  `content_type` TEXT DEFAULT NULL,
  `display_recipient` TEXT DEFAULT NULL,
  `id` TEXT DEFAULT NULL,
  `is_me_message` TEXT DEFAULT NULL,
  `reactions` TEXT DEFAULT NULL,
  `recipient_id` TEXT DEFAULT NULL,
  `sender_email` TEXT DEFAULT NULL,
  `sender_full_name` TEXT DEFAULT NULL,
  `sender_id` TEXT DEFAULT NULL,
  `sender_realm_str` TEXT DEFAULT NULL,
  `stream_id` TEXT DEFAULT NULL,
  `subject` TEXT DEFAULT NULL,
  `topic_links` TEXT DEFAULT NULL,
  `submessages` TEXT DEFAULT NULL,
  `timestamp` TEXT DEFAULT NULL,
  `type` TEXT DEFAULT NULL,
  `flags` JSON DEFAULT NULL COMMENT 'The user&#39;s [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags ',
  `last_edit_timestamp` INT DEFAULT NULL COMMENT 'The UNIX timestamp for when the message was last edited, in UTC seconds. ',
  `match_content` TEXT DEFAULT NULL COMMENT 'Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords. ',
  `match_subject` TEXT DEFAULT NULL COMMENT 'Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetMessages_allOf` generated from model 'GetMessagesUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `GetMessages_allOf` (
  `avatar_url` TEXT DEFAULT NULL,
  `client` TEXT DEFAULT NULL,
  `content` TEXT DEFAULT NULL,
  `content_type` TEXT DEFAULT NULL,
  `display_recipient` TEXT DEFAULT NULL,
  `id` TEXT DEFAULT NULL,
  `is_me_message` TEXT DEFAULT NULL,
  `reactions` TEXT DEFAULT NULL,
  `recipient_id` TEXT DEFAULT NULL,
  `sender_email` TEXT DEFAULT NULL,
  `sender_full_name` TEXT DEFAULT NULL,
  `sender_id` TEXT DEFAULT NULL,
  `sender_realm_str` TEXT DEFAULT NULL,
  `stream_id` TEXT DEFAULT NULL,
  `subject` TEXT DEFAULT NULL,
  `topic_links` TEXT DEFAULT NULL,
  `submessages` TEXT DEFAULT NULL,
  `timestamp` TEXT DEFAULT NULL,
  `type` TEXT DEFAULT NULL,
  `flags` JSON DEFAULT NULL COMMENT 'The user&#39;s [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags ',
  `last_edit_timestamp` INT DEFAULT NULL COMMENT 'The UNIX timestamp for when the message was last edited, in UTC seconds. ',
  `match_content` TEXT DEFAULT NULL COMMENT 'Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords. ',
  `match_subject` TEXT DEFAULT NULL COMMENT 'Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Hotspot` generated from model 'Hotspot'
-- Dictionary containing details of a single hotspot. 
--

CREATE TABLE IF NOT EXISTS `Hotspot` (
  `delay` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The delay after which the user should be shown the hotspot. ',
  `name` TEXT DEFAULT NULL COMMENT 'The name of the hotspot. ',
  `title` TEXT DEFAULT NULL COMMENT 'The title of the hotspot, as will be displayed to the user. ',
  `description` TEXT DEFAULT NULL COMMENT 'The description of the hotspot, as will be displayed to the user. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Dictionary containing details of a single hotspot. ';

--
-- Table structure for table `inline_response_200` generated from model 'inlineUnderscoreresponseUnderscore200'
-- This is an example of the JSON payload that the Zulip server will &#x60;POST&#x60; to your server 
--

CREATE TABLE IF NOT EXISTS `inline_response_200` (
  `bot_email` TEXT DEFAULT NULL COMMENT 'Email of the bot user. ',
  `bot_full_name` TEXT DEFAULT NULL COMMENT 'The full name of the bot user. ',
  `data` TEXT DEFAULT NULL COMMENT 'The message content, in raw Markdown format (not rendered to HTML). ',
  `trigger` TEXT DEFAULT NULL COMMENT 'What aspect of the message triggered the outgoing webhook notification. Possible values include &#x60;private_message&#x60; and &#x60;mention&#x60;. ',
  `token` TEXT DEFAULT NULL COMMENT 'A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the &#x60;zuliprc&#x60; file downloaded when creating the bot. ',
  `message` TEXT DEFAULT NULL COMMENT 'A dict containing details on the message that triggered the outgoing webhook, in the format used by [&#x60;GET /messages&#x60;](/api/get-messages). '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This is an example of the JSON payload that the Zulip server will &#x60;POST&#x60; to your server ';

--
-- Table structure for table `InvalidApiKeyError` generated from model 'InvalidApiKeyError'
--

CREATE TABLE IF NOT EXISTS `InvalidApiKeyError` (
  `result` TEXT NOT NULL,
  `msg` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `InvalidMessageError` generated from model 'InvalidMessageError'
--

CREATE TABLE IF NOT EXISTS `InvalidMessageError` (
  `result` TEXT NOT NULL,
  `msg` TEXT NOT NULL,
  `raw_content` TEXT DEFAULT NULL COMMENT 'The raw content of the message. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `InvalidMessageError_allOf` generated from model 'InvalidMessageErrorUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `InvalidMessageError_allOf` (
  `result` TEXT DEFAULT NULL,
  `msg` TEXT DEFAULT NULL,
  `raw_content` TEXT DEFAULT NULL COMMENT 'The raw content of the message. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `JsonError` generated from model 'JsonError'
--

CREATE TABLE IF NOT EXISTS `JsonError` (
  `result` TEXT NOT NULL,
  `msg` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `JsonErrorBase` generated from model 'JsonErrorBase'
--

CREATE TABLE IF NOT EXISTS `JsonErrorBase` (
  `result` ENUM('error') NOT NULL,
  `msg` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `JsonErrorBase_allOf` generated from model 'JsonErrorBaseUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `JsonErrorBase_allOf` (
  `result` ENUM('error') NOT NULL,
  `msg` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `JsonResponseBase` generated from model 'JsonResponseBase'
--

CREATE TABLE IF NOT EXISTS `JsonResponseBase` (
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `JsonSuccess` generated from model 'JsonSuccess'
--

CREATE TABLE IF NOT EXISTS `JsonSuccess` (
  `result` TEXT NOT NULL,
  `msg` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `JsonSuccess_allOf` generated from model 'JsonSuccessUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `JsonSuccess_allOf` (
  `result` TEXT DEFAULT NULL,
  `msg` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `JsonSuccessBase` generated from model 'JsonSuccessBase'
--

CREATE TABLE IF NOT EXISTS `JsonSuccessBase` (
  `result` ENUM('success') NOT NULL,
  `msg` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `JsonSuccessBase_allOf` generated from model 'JsonSuccessBaseUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `JsonSuccessBase_allOf` (
  `result` ENUM('success') NOT NULL,
  `msg` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Messages` generated from model 'Messages'
--

CREATE TABLE IF NOT EXISTS `Messages` (
  `avatar_url` TEXT DEFAULT NULL,
  `client` TEXT DEFAULT NULL,
  `content` TEXT DEFAULT NULL,
  `content_type` TEXT DEFAULT NULL,
  `display_recipient` TEXT DEFAULT NULL,
  `id` TEXT DEFAULT NULL,
  `is_me_message` TEXT DEFAULT NULL,
  `reactions` TEXT DEFAULT NULL,
  `recipient_id` TEXT DEFAULT NULL,
  `sender_email` TEXT DEFAULT NULL,
  `sender_full_name` TEXT DEFAULT NULL,
  `sender_id` TEXT DEFAULT NULL,
  `sender_realm_str` TEXT DEFAULT NULL,
  `stream_id` TEXT DEFAULT NULL,
  `subject` TEXT DEFAULT NULL,
  `topic_links` TEXT DEFAULT NULL,
  `submessages` TEXT DEFAULT NULL,
  `timestamp` TEXT DEFAULT NULL,
  `type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Messages_allOf` generated from model 'MessagesUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `Messages_allOf` (
  `avatar_url` TEXT DEFAULT NULL,
  `client` TEXT DEFAULT NULL,
  `content` TEXT DEFAULT NULL,
  `content_type` TEXT DEFAULT NULL,
  `display_recipient` TEXT DEFAULT NULL,
  `id` TEXT DEFAULT NULL,
  `is_me_message` TEXT DEFAULT NULL,
  `reactions` TEXT DEFAULT NULL,
  `recipient_id` TEXT DEFAULT NULL,
  `sender_email` TEXT DEFAULT NULL,
  `sender_full_name` TEXT DEFAULT NULL,
  `sender_id` TEXT DEFAULT NULL,
  `sender_realm_str` TEXT DEFAULT NULL,
  `stream_id` TEXT DEFAULT NULL,
  `subject` TEXT DEFAULT NULL,
  `topic_links` TEXT DEFAULT NULL,
  `submessages` TEXT DEFAULT NULL,
  `timestamp` TEXT DEFAULT NULL,
  `type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MessagesBase` generated from model 'MessagesBase'
-- Object containing details of the message. 
--

CREATE TABLE IF NOT EXISTS `MessagesBase` (
  `avatar_url` TEXT DEFAULT NULL COMMENT 'The URL of the user&#39;s avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user&#39;s email address itself for this user. ',
  `client` TEXT DEFAULT NULL COMMENT 'A Zulip \&quot;client\&quot; string, describing what Zulip client sent the message. ',
  `content` TEXT DEFAULT NULL COMMENT 'The content/body of the message. ',
  `content_type` TEXT DEFAULT NULL COMMENT 'The HTTP &#x60;content_type&#x60; for the message content.  This will be &#x60;text/html&#x60; or &#x60;text/x-markdown&#x60;, depending on whether &#x60;apply_markdown&#x60; was set. ',
  `display_recipient` TEXT DEFAULT NULL COMMENT 'Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. ',
  `id` INT DEFAULT NULL COMMENT 'The unique message ID.  Messages should always be displayed sorted by ID. ',
  `is_me_message` TINYINT(1) DEFAULT NULL COMMENT 'Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages ',
  `reactions` JSON DEFAULT NULL COMMENT 'Data on any reactions to the message. ',
  `recipient_id` INT DEFAULT NULL COMMENT 'A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. ',
  `sender_email` TEXT DEFAULT NULL COMMENT 'The Zulip display email address of the message&#39;s sender. ',
  `sender_full_name` TEXT DEFAULT NULL COMMENT 'The full name of the message&#39;s sender. ',
  `sender_id` INT DEFAULT NULL COMMENT 'The user ID of the message&#39;s sender. ',
  `sender_realm_str` TEXT DEFAULT NULL COMMENT 'A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on &#x60;example.zulip.com&#x60;, this will be &#x60;example&#x60;. ',
  `stream_id` INT DEFAULT NULL COMMENT 'Only present for stream messages; the ID of the stream. ',
  `subject` TEXT DEFAULT NULL COMMENT 'The &#x60;topic&#x60; of the message.  Currently always &#x60;\&quot;\&quot;&#x60; for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \&quot;subjects\&quot; and will eventually change. ',
  `topic_links` JSON DEFAULT NULL COMMENT 'Data on any links to be included in the &#x60;topic&#x60; line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message&#39;s topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called &#x60;subject_links&#x60;; clients are recommended to rename &#x60;subject_links&#x60; to &#x60;topic_links&#x60; if present for compatibility with older Zulip servers. ',
  `submessages` JSON DEFAULT NULL COMMENT 'Data used for certain experimental Zulip integrations. ',
  `timestamp` INT DEFAULT NULL COMMENT 'The UNIX timestamp for when the message was sent, in UTC seconds. ',
  `type` TEXT DEFAULT NULL COMMENT 'The type of the message: &#x60;stream&#x60; or &#x60;private&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object containing details of the message. ';

--
-- Table structure for table `MessagesBase_topic_links` generated from model 'MessagesBaseUnderscoretopicUnderscorelinks'
--

CREATE TABLE IF NOT EXISTS `MessagesBase_topic_links` (
  `text` TEXT DEFAULT NULL COMMENT 'The original link text present in the topic. ',
  `url` TEXT DEFAULT NULL COMMENT 'The expanded target url which the link points to. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MissingArgumentError` generated from model 'MissingArgumentError'
--

CREATE TABLE IF NOT EXISTS `MissingArgumentError` (
  `result` TEXT NOT NULL,
  `msg` TEXT NOT NULL,
  `code` TEXT DEFAULT NULL,
  `var_name` TEXT DEFAULT NULL COMMENT 'It contains the information about the missing parameter. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MissingArgumentError_allOf` generated from model 'MissingArgumentErrorUnderscoreallOf'
-- ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
--

CREATE TABLE IF NOT EXISTS `MissingArgumentError_allOf` (
  `result` TEXT DEFAULT NULL,
  `msg` TEXT DEFAULT NULL,
  `code` TEXT DEFAULT NULL,
  `var_name` TEXT DEFAULT NULL COMMENT 'It contains the information about the missing parameter. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied ';

--
-- Table structure for table `NonExistingStreamError` generated from model 'NonExistingStreamError'
--

CREATE TABLE IF NOT EXISTS `NonExistingStreamError` (
  `result` TEXT NOT NULL,
  `msg` TEXT NOT NULL,
  `code` TEXT DEFAULT NULL,
  `stream` TEXT DEFAULT NULL COMMENT 'The name of the stream that could not be found. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `NonExistingStreamError_allOf` generated from model 'NonExistingStreamErrorUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `NonExistingStreamError_allOf` (
  `result` TEXT DEFAULT NULL,
  `msg` TEXT DEFAULT NULL,
  `code` TEXT DEFAULT NULL,
  `stream` TEXT DEFAULT NULL COMMENT 'The name of the stream that could not be found. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Presence` generated from model 'Presence'
-- &#x60;{client_name}&#x60;: Object containing the details of the user&#39;s presence on a particular platform with the client&#39;s platform name being the object key. 
--

CREATE TABLE IF NOT EXISTS `Presence` (
  `client` TEXT DEFAULT NULL COMMENT 'The client&#39;s platform name. ',
  `status` ENUM('idle', 'active') DEFAULT NULL COMMENT 'The status of the user on this client. It is either &#x60;idle&#x60; or &#x60;active&#x60;. ',
  `timestamp` INT DEFAULT NULL COMMENT 'The UNIX timestamp of when this client sent the user&#39;s presence to the server with the precision of a second. ',
  `pushable` TINYINT(1) DEFAULT NULL COMMENT 'Whether the client is capable of showing mobile/push notifications to the user. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='&#x60;{client_name}&#x60;: Object containing the details of the user&#39;s presence on a particular platform with the client&#39;s platform name being the object key. ';

--
-- Table structure for table `RateLimitedError` generated from model 'RateLimitedError'
--

CREATE TABLE IF NOT EXISTS `RateLimitedError` (
  `result` TEXT NOT NULL,
  `msg` TEXT NOT NULL,
  `code` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RealmDeactivatedError` generated from model 'RealmDeactivatedError'
--

CREATE TABLE IF NOT EXISTS `RealmDeactivatedError` (
  `result` TEXT NOT NULL,
  `msg` TEXT NOT NULL,
  `code` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RealmDomain` generated from model 'RealmDomain'
-- Object containing details of the newly added domain. 
--

CREATE TABLE IF NOT EXISTS `RealmDomain` (
  `domain` TEXT DEFAULT NULL COMMENT 'The new allowed domain. ',
  `allow_subdomains` TINYINT(1) DEFAULT NULL COMMENT 'Whether subdomains are allowed for this domain. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object containing details of the newly added domain. ';

--
-- Table structure for table `RealmEmoji` generated from model 'RealmEmoji'
-- &#x60;{emoji_id}&#x60;: Object containing details about the emoji with  the specified ID. It has the following properties: 
--

CREATE TABLE IF NOT EXISTS `RealmEmoji` (
  `id` TEXT DEFAULT NULL COMMENT 'The ID for this emoji, same as the object&#39;s key. ',
  `name` TEXT DEFAULT NULL COMMENT 'The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (&#x60;:name  :&#x60;). ',
  `source_url` TEXT DEFAULT NULL COMMENT 'The path relative to the organization&#39;s URL where the emoji&#39;s image can be found. ',
  `deactivated` TINYINT(1) DEFAULT NULL COMMENT 'Whether the emoji has been deactivated or not. ',
  `author_id` INT DEFAULT NULL COMMENT 'The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and &#x60;author&#x60; object with an &#x60;id&#x60; field. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='&#x60;{emoji_id}&#x60;: Object containing details about the emoji with  the specified ID. It has the following properties: ';

--
-- Table structure for table `RealmExport` generated from model 'RealmExport'
-- Object containing details about a realm export. 
--

CREATE TABLE IF NOT EXISTS `RealmExport` (
  `id` INT DEFAULT NULL COMMENT 'The id of the export. ',
  `acting_user_id` INT DEFAULT NULL COMMENT 'The id of the user who did the export. ',
  `export_time` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The UNIX timestamp of when the export was made. ',
  `deleted_timestamp` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The timestamp of when the export was deleted. Null if it wasn&#39;t. ',
  `failed_timestamp` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The timestamp of when the export failed. Null if it didn&#39;t. ',
  `export_url` TEXT DEFAULT NULL COMMENT 'The URL of the export. &#x60;null&#x60; if there&#39;s no URL. ',
  `pending` TINYINT(1) DEFAULT NULL COMMENT 'Whether the export is pending or not. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object containing details about a realm export. ';

--
-- Table structure for table `RealmPlayground` generated from model 'RealmPlayground'
-- Object containing details about a realm playground. 
--

CREATE TABLE IF NOT EXISTS `RealmPlayground` (
  `id` INT DEFAULT NULL COMMENT 'The unique ID for the realm playground. ',
  `name` TEXT DEFAULT NULL COMMENT 'The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). ',
  `pygments_language` TEXT DEFAULT NULL COMMENT 'The name of the Pygments language lexer for that programming language. ',
  `url_prefix` TEXT DEFAULT NULL COMMENT 'The url prefix for the playground. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object containing details about a realm playground. ';

--
-- Table structure for table `Subscriptions` generated from model 'Subscriptions'
--

CREATE TABLE IF NOT EXISTS `Subscriptions` (
  `stream_id` INT DEFAULT NULL COMMENT 'The unique ID of a stream. ',
  `name` TEXT DEFAULT NULL COMMENT 'The name of a stream. ',
  `description` TEXT DEFAULT NULL COMMENT 'The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream&#39;s description. ',
  `rendered_description` TEXT DEFAULT NULL COMMENT 'A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. ',
  `date_created` INT DEFAULT NULL COMMENT 'The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). ',
  `invite_only` TINYINT(1) DEFAULT NULL COMMENT 'Specifies whether the stream is private or not. Only people who have been invited can access a private stream. ',
  `subscribers` JSON DEFAULT NULL COMMENT 'A list of user IDs of users who are also subscribed to a given stream. Included only if &#x60;include_subscribers&#x60; is &#x60;true&#x60;. ',
  `desktop_notifications` TINYINT(1) DEFAULT NULL COMMENT 'A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. ',
  `email_notifications` TINYINT(1) DEFAULT NULL COMMENT 'A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. ',
  `wildcard_mentions_notify` TINYINT(1) DEFAULT NULL COMMENT 'A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. ',
  `push_notifications` TINYINT(1) DEFAULT NULL COMMENT 'A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. ',
  `audible_notifications` TINYINT(1) DEFAULT NULL COMMENT 'A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. ',
  `pin_to_top` TINYINT(1) DEFAULT NULL COMMENT 'A boolean specifying whether the given stream has been pinned to the top. ',
  `email_address` TEXT DEFAULT NULL COMMENT 'Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). ',
  `is_muted` TINYINT(1) DEFAULT NULL COMMENT 'Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in &#x60;All messages&#x60; view (previously known as &#x60;Home&#x60; view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named &#x60;in_home_view&#x60; (with the opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;). ',
  `in_home_view` TINYINT(1) DEFAULT NULL COMMENT 'Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. ',
  `is_announcement_only` TINYINT(1) DEFAULT NULL COMMENT 'Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use &#x60;stream_post_policy&#x60; instead. ',
  `is_web_public` TINYINT(1) DEFAULT NULL COMMENT 'Whether the stream has been configured to allow unauthenticated access to its message history from the web. ',
  `role` ENUM('20', '50') DEFAULT NULL COMMENT 'The user&#39;s role within the stream (distinct from the user&#39;s [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 &#x3D;&gt; Stream administrator. * 50 &#x3D;&gt; Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). ',
  `color` TEXT DEFAULT NULL COMMENT 'The user&#39;s personal color for the stream. ',
  `stream_post_policy` INT DEFAULT NULL COMMENT 'Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. ',
  `message_retention_days` INT DEFAULT NULL COMMENT 'Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * &#x60;null&#x60;, the default, means the stream will inherit the organization   level setting. * &#x60;-1&#x60; encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). ',
  `history_public_to_subscribers` TINYINT(1) DEFAULT NULL COMMENT 'Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only&#x3D;False implies history_public_to_subscribers&#x3D;True), but clients should not make that assumption, as we may change that behavior in the future. ',
  `first_message_id` INT DEFAULT NULL COMMENT 'The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \&quot;more topics\&quot; widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. ',
  `stream_weekly_traffic` INT DEFAULT NULL COMMENT 'The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `User` generated from model 'User'
--

CREATE TABLE IF NOT EXISTS `User` (
  `email` TEXT DEFAULT NULL,
  `is_bot` TEXT DEFAULT NULL,
  `avatar_url` TEXT DEFAULT NULL,
  `avatar_version` TEXT DEFAULT NULL,
  `full_name` TEXT DEFAULT NULL,
  `is_admin` TEXT DEFAULT NULL,
  `is_owner` TEXT DEFAULT NULL,
  `is_billing_admin` TEXT DEFAULT NULL,
  `role` TEXT DEFAULT NULL,
  `bot_type` TEXT DEFAULT NULL,
  `user_id` TEXT DEFAULT NULL,
  `bot_owner_id` TEXT DEFAULT NULL,
  `is_active` TEXT DEFAULT NULL,
  `is_guest` TEXT DEFAULT NULL,
  `timezone` TEXT DEFAULT NULL,
  `date_joined` TEXT DEFAULT NULL,
  `delivery_email` TEXT DEFAULT NULL,
  `profile_data` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `User_allOf` generated from model 'UserUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `User_allOf` (
  `email` TEXT DEFAULT NULL,
  `is_bot` TEXT DEFAULT NULL,
  `avatar_url` TEXT DEFAULT NULL,
  `avatar_version` TEXT DEFAULT NULL,
  `full_name` TEXT DEFAULT NULL,
  `is_admin` TEXT DEFAULT NULL,
  `is_owner` TEXT DEFAULT NULL,
  `is_billing_admin` TEXT DEFAULT NULL,
  `role` TEXT DEFAULT NULL,
  `bot_type` TEXT DEFAULT NULL,
  `user_id` TEXT DEFAULT NULL,
  `bot_owner_id` TEXT DEFAULT NULL,
  `is_active` TEXT DEFAULT NULL,
  `is_guest` TEXT DEFAULT NULL,
  `timezone` TEXT DEFAULT NULL,
  `date_joined` TEXT DEFAULT NULL,
  `delivery_email` TEXT DEFAULT NULL,
  `profile_data` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UserBase` generated from model 'UserBase'
-- A dictionary containing basic data on a given Zulip user. 
--

CREATE TABLE IF NOT EXISTS `UserBase` (
  `email` TEXT DEFAULT NULL COMMENT 'The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. ',
  `is_bot` TINYINT(1) DEFAULT NULL COMMENT 'A boolean specifying whether the user is a bot or full account. ',
  `avatar_url` TEXT DEFAULT NULL COMMENT 'URL for the user&#39;s avatar.  Will be &#x60;null&#x60; if the &#x60;client_gravatar&#x60; query parameter was set to &#x60;True&#x60; and the user&#39;s avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the &#x60;user_avatar_url_field_optional&#x60; capability, this will be missing at the server&#39;s sole discretion. ',
  `avatar_version` INT DEFAULT NULL COMMENT 'Version for the user&#39;s avatar.  Used for cache-busting requests for the user&#39;s avatar.  Clients generally shouldn&#39;t need to use this; most avatar URLs sent by Zulip will already end with &#x60;?v&#x3D;{avatar_version}&#x60;. ',
  `full_name` TEXT DEFAULT NULL COMMENT 'Full name of the user or bot, used for all display purposes. ',
  `is_admin` TINYINT(1) DEFAULT NULL COMMENT 'A boolean specifying whether the user is an organization administrator. ',
  `is_owner` TINYINT(1) DEFAULT NULL COMMENT 'A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). ',
  `is_billing_admin` TINYINT(1) DEFAULT NULL COMMENT 'A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). ',
  `role` ENUM('100', '200', '300', '400', '600') DEFAULT NULL COMMENT '[Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner &#x3D;&gt; 100 * Organization administrator &#x3D;&gt; 200 * Organization moderator &#x3D;&gt; 300 * Member &#x3D;&gt; 400 * Guest &#x3D;&gt; 600  **Changes**: New in Zulip 4.0 (feature level 59). ',
  `bot_type` INT DEFAULT NULL COMMENT 'An integer describing the type of bot: * &#x60;null&#x60; if the user isn&#39;t a bot. * &#x60;1&#x60; for a &#x60;Generic&#x60; bot. * &#x60;2&#x60; for an &#x60;Incoming webhook&#x60; bot. * &#x60;3&#x60; for an &#x60;Outgoing webhook&#x60; bot. * &#x60;4&#x60; for an &#x60;Embedded&#x60; bot. ',
  `user_id` INT DEFAULT NULL COMMENT 'The unique ID of the user. ',
  `bot_owner_id` INT DEFAULT NULL COMMENT 'If the user is a bot (i.e. &#x60;is_bot&#x60; is &#x60;True&#x60;), &#x60;bot_owner&#x60; is the user ID of the bot&#39;s owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a &#x60;bot_owner&#x60; field containing the email address of the bot&#39;s owner. ',
  `is_active` TINYINT(1) DEFAULT NULL COMMENT 'A boolean specifying whether the user account has been deactivated. ',
  `is_guest` TINYINT(1) DEFAULT NULL COMMENT 'A boolean specifying whether the user is a guest user. ',
  `timezone` TEXT DEFAULT NULL COMMENT 'The time zone of the user. ',
  `date_joined` TEXT DEFAULT NULL COMMENT 'The time the user account was created. ',
  `delivery_email` TEXT DEFAULT NULL COMMENT 'The user&#39;s real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. ',
  `profile_data` JSON DEFAULT NULL COMMENT 'A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user&#39;s data for that field.  Generally the data includes just a single &#x60;value&#x60; key; for those custom profile fields supporting Markdown, a &#x60;rendered_value&#x60; key will also be present. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A dictionary containing basic data on a given Zulip user. ';

--
-- Table structure for table `UserDeactivatedError` generated from model 'UserDeactivatedError'
--

CREATE TABLE IF NOT EXISTS `UserDeactivatedError` (
  `result` TEXT NOT NULL,
  `msg` TEXT NOT NULL,
  `code` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UserGroup` generated from model 'UserGroup'
-- Object containing the user group&#39;s attributes. 
--

CREATE TABLE IF NOT EXISTS `UserGroup` (
  `name` TEXT DEFAULT NULL COMMENT 'The name of the user group. ',
  `description` TEXT DEFAULT NULL COMMENT 'The description of the user group. ',
  `members` JSON DEFAULT NULL COMMENT 'Array containing the id of the users who are members of this user group. ',
  `id` INT DEFAULT NULL COMMENT 'The ID of the user group. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object containing the user group&#39;s attributes. ';

--
-- Table structure for table `UserNotAuthorizedError` generated from model 'UserNotAuthorizedError'
--

CREATE TABLE IF NOT EXISTS `UserNotAuthorizedError` (
  `result` TEXT NOT NULL,
  `msg` TEXT NOT NULL,
  `code` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


