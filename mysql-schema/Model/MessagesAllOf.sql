--
-- Zulip REST API.
-- Prepared SQL queries for 'Messages_allOf' definition.
--


--
-- SELECT template for table `Messages_allOf`
--
SELECT `avatar_url`, `client`, `content`, `content_type`, `display_recipient`, `id`, `is_me_message`, `reactions`, `recipient_id`, `sender_email`, `sender_full_name`, `sender_id`, `sender_realm_str`, `stream_id`, `subject`, `topic_links`, `submessages`, `timestamp`, `type` FROM `Messages_allOf` WHERE 1;

--
-- INSERT template for table `Messages_allOf`
--
INSERT INTO `Messages_allOf`(`avatar_url`, `client`, `content`, `content_type`, `display_recipient`, `id`, `is_me_message`, `reactions`, `recipient_id`, `sender_email`, `sender_full_name`, `sender_id`, `sender_realm_str`, `stream_id`, `subject`, `topic_links`, `submessages`, `timestamp`, `type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Messages_allOf`
--
UPDATE `Messages_allOf` SET `avatar_url` = ?, `client` = ?, `content` = ?, `content_type` = ?, `display_recipient` = ?, `id` = ?, `is_me_message` = ?, `reactions` = ?, `recipient_id` = ?, `sender_email` = ?, `sender_full_name` = ?, `sender_id` = ?, `sender_realm_str` = ?, `stream_id` = ?, `subject` = ?, `topic_links` = ?, `submessages` = ?, `timestamp` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `Messages_allOf`
--
DELETE FROM `Messages_allOf` WHERE 0;

