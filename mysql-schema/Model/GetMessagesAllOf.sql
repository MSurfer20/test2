--
-- Zulip REST API.
-- Prepared SQL queries for 'GetMessages_allOf' definition.
--


--
-- SELECT template for table `GetMessages_allOf`
--
SELECT `avatar_url`, `client`, `content`, `content_type`, `display_recipient`, `id`, `is_me_message`, `reactions`, `recipient_id`, `sender_email`, `sender_full_name`, `sender_id`, `sender_realm_str`, `stream_id`, `subject`, `topic_links`, `submessages`, `timestamp`, `type`, `flags`, `last_edit_timestamp`, `match_content`, `match_subject` FROM `GetMessages_allOf` WHERE 1;

--
-- INSERT template for table `GetMessages_allOf`
--
INSERT INTO `GetMessages_allOf`(`avatar_url`, `client`, `content`, `content_type`, `display_recipient`, `id`, `is_me_message`, `reactions`, `recipient_id`, `sender_email`, `sender_full_name`, `sender_id`, `sender_realm_str`, `stream_id`, `subject`, `topic_links`, `submessages`, `timestamp`, `type`, `flags`, `last_edit_timestamp`, `match_content`, `match_subject`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `GetMessages_allOf`
--
UPDATE `GetMessages_allOf` SET `avatar_url` = ?, `client` = ?, `content` = ?, `content_type` = ?, `display_recipient` = ?, `id` = ?, `is_me_message` = ?, `reactions` = ?, `recipient_id` = ?, `sender_email` = ?, `sender_full_name` = ?, `sender_id` = ?, `sender_realm_str` = ?, `stream_id` = ?, `subject` = ?, `topic_links` = ?, `submessages` = ?, `timestamp` = ?, `type` = ?, `flags` = ?, `last_edit_timestamp` = ?, `match_content` = ?, `match_subject` = ? WHERE 1;

--
-- DELETE template for table `GetMessages_allOf`
--
DELETE FROM `GetMessages_allOf` WHERE 0;

