--
-- Zulip REST API.
-- Prepared SQL queries for 'BasicStream' definition.
--


--
-- SELECT template for table `BasicStream`
--
SELECT `stream_id`, `name`, `description`, `date_created`, `invite_only`, `rendered_description`, `is_web_public`, `stream_post_policy`, `message_retention_days`, `history_public_to_subscribers`, `first_message_id`, `is_announcement_only` FROM `BasicStream` WHERE 1;

--
-- INSERT template for table `BasicStream`
--
INSERT INTO `BasicStream`(`stream_id`, `name`, `description`, `date_created`, `invite_only`, `rendered_description`, `is_web_public`, `stream_post_policy`, `message_retention_days`, `history_public_to_subscribers`, `first_message_id`, `is_announcement_only`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BasicStream`
--
UPDATE `BasicStream` SET `stream_id` = ?, `name` = ?, `description` = ?, `date_created` = ?, `invite_only` = ?, `rendered_description` = ?, `is_web_public` = ?, `stream_post_policy` = ?, `message_retention_days` = ?, `history_public_to_subscribers` = ?, `first_message_id` = ?, `is_announcement_only` = ? WHERE 1;

--
-- DELETE template for table `BasicStream`
--
DELETE FROM `BasicStream` WHERE 0;

