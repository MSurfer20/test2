--
-- Zulip REST API.
-- Prepared SQL queries for 'GetMessages' definition.
--


--
-- SELECT template for table `GetMessages`
--
SELECT `avatar_url`, `client`, `content`, `content_type`, `display_recipient`, `id`, `is_me_message`, `reactions`, `recipient_id`, `sender_email`, `sender_full_name`, `sender_id`, `sender_realm_str`, `stream_id`, `subject`, `topic_links`, `submessages`, `timestamp`, `type`, `flags`, `last_edit_timestamp`, `match_content`, `match_subject` FROM `GetMessages` WHERE 1;

--
-- INSERT template for table `GetMessages`
--
INSERT INTO `GetMessages`(`avatar_url`, `client`, `content`, `content_type`, `display_recipient`, `id`, `is_me_message`, `reactions`, `recipient_id`, `sender_email`, `sender_full_name`, `sender_id`, `sender_realm_str`, `stream_id`, `subject`, `topic_links`, `submessages`, `timestamp`, `type`, `flags`, `last_edit_timestamp`, `match_content`, `match_subject`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `GetMessages`
--
UPDATE `GetMessages` SET `avatar_url` = ?, `client` = ?, `content` = ?, `content_type` = ?, `display_recipient` = ?, `id` = ?, `is_me_message` = ?, `reactions` = ?, `recipient_id` = ?, `sender_email` = ?, `sender_full_name` = ?, `sender_id` = ?, `sender_realm_str` = ?, `stream_id` = ?, `subject` = ?, `topic_links` = ?, `submessages` = ?, `timestamp` = ?, `type` = ?, `flags` = ?, `last_edit_timestamp` = ?, `match_content` = ?, `match_subject` = ? WHERE 1;

--
-- DELETE template for table `GetMessages`
--
DELETE FROM `GetMessages` WHERE 0;

