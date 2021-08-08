--
-- Zulip REST API.
-- Prepared SQL queries for 'MessagesBase' definition.
--


--
-- SELECT template for table `MessagesBase`
--
SELECT `avatar_url`, `client`, `content`, `content_type`, `display_recipient`, `id`, `is_me_message`, `reactions`, `recipient_id`, `sender_email`, `sender_full_name`, `sender_id`, `sender_realm_str`, `stream_id`, `subject`, `topic_links`, `submessages`, `timestamp`, `type` FROM `MessagesBase` WHERE 1;

--
-- INSERT template for table `MessagesBase`
--
INSERT INTO `MessagesBase`(`avatar_url`, `client`, `content`, `content_type`, `display_recipient`, `id`, `is_me_message`, `reactions`, `recipient_id`, `sender_email`, `sender_full_name`, `sender_id`, `sender_realm_str`, `stream_id`, `subject`, `topic_links`, `submessages`, `timestamp`, `type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `MessagesBase`
--
UPDATE `MessagesBase` SET `avatar_url` = ?, `client` = ?, `content` = ?, `content_type` = ?, `display_recipient` = ?, `id` = ?, `is_me_message` = ?, `reactions` = ?, `recipient_id` = ?, `sender_email` = ?, `sender_full_name` = ?, `sender_id` = ?, `sender_realm_str` = ?, `stream_id` = ?, `subject` = ?, `topic_links` = ?, `submessages` = ?, `timestamp` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `MessagesBase`
--
DELETE FROM `MessagesBase` WHERE 0;

