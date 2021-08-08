--
-- Zulip REST API.
-- Prepared SQL queries for 'Messages' definition.
--


--
-- SELECT template for table `Messages`
--
SELECT `avatar_url`, `client`, `content`, `content_type`, `display_recipient`, `id`, `is_me_message`, `reactions`, `recipient_id`, `sender_email`, `sender_full_name`, `sender_id`, `sender_realm_str`, `stream_id`, `subject`, `topic_links`, `submessages`, `timestamp`, `type` FROM `Messages` WHERE 1;

--
-- INSERT template for table `Messages`
--
INSERT INTO `Messages`(`avatar_url`, `client`, `content`, `content_type`, `display_recipient`, `id`, `is_me_message`, `reactions`, `recipient_id`, `sender_email`, `sender_full_name`, `sender_id`, `sender_realm_str`, `stream_id`, `subject`, `topic_links`, `submessages`, `timestamp`, `type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Messages`
--
UPDATE `Messages` SET `avatar_url` = ?, `client` = ?, `content` = ?, `content_type` = ?, `display_recipient` = ?, `id` = ?, `is_me_message` = ?, `reactions` = ?, `recipient_id` = ?, `sender_email` = ?, `sender_full_name` = ?, `sender_id` = ?, `sender_realm_str` = ?, `stream_id` = ?, `subject` = ?, `topic_links` = ?, `submessages` = ?, `timestamp` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `Messages`
--
DELETE FROM `Messages` WHERE 0;

