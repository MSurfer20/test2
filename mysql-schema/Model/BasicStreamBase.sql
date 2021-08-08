--
-- Zulip REST API.
-- Prepared SQL queries for 'BasicStreamBase' definition.
--


--
-- SELECT template for table `BasicStreamBase`
--
SELECT `stream_id`, `name`, `description`, `date_created`, `invite_only`, `rendered_description`, `is_web_public`, `stream_post_policy`, `message_retention_days`, `history_public_to_subscribers`, `first_message_id`, `is_announcement_only` FROM `BasicStreamBase` WHERE 1;

--
-- INSERT template for table `BasicStreamBase`
--
INSERT INTO `BasicStreamBase`(`stream_id`, `name`, `description`, `date_created`, `invite_only`, `rendered_description`, `is_web_public`, `stream_post_policy`, `message_retention_days`, `history_public_to_subscribers`, `first_message_id`, `is_announcement_only`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BasicStreamBase`
--
UPDATE `BasicStreamBase` SET `stream_id` = ?, `name` = ?, `description` = ?, `date_created` = ?, `invite_only` = ?, `rendered_description` = ?, `is_web_public` = ?, `stream_post_policy` = ?, `message_retention_days` = ?, `history_public_to_subscribers` = ?, `first_message_id` = ?, `is_announcement_only` = ? WHERE 1;

--
-- DELETE template for table `BasicStreamBase`
--
DELETE FROM `BasicStreamBase` WHERE 0;

