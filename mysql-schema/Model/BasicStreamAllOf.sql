--
-- Zulip REST API.
-- Prepared SQL queries for 'BasicStream_allOf' definition.
--


--
-- SELECT template for table `BasicStream_allOf`
--
SELECT `stream_id`, `name`, `description`, `date_created`, `invite_only`, `rendered_description`, `is_web_public`, `stream_post_policy`, `message_retention_days`, `history_public_to_subscribers`, `first_message_id`, `is_announcement_only` FROM `BasicStream_allOf` WHERE 1;

--
-- INSERT template for table `BasicStream_allOf`
--
INSERT INTO `BasicStream_allOf`(`stream_id`, `name`, `description`, `date_created`, `invite_only`, `rendered_description`, `is_web_public`, `stream_post_policy`, `message_retention_days`, `history_public_to_subscribers`, `first_message_id`, `is_announcement_only`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BasicStream_allOf`
--
UPDATE `BasicStream_allOf` SET `stream_id` = ?, `name` = ?, `description` = ?, `date_created` = ?, `invite_only` = ?, `rendered_description` = ?, `is_web_public` = ?, `stream_post_policy` = ?, `message_retention_days` = ?, `history_public_to_subscribers` = ?, `first_message_id` = ?, `is_announcement_only` = ? WHERE 1;

--
-- DELETE template for table `BasicStream_allOf`
--
DELETE FROM `BasicStream_allOf` WHERE 0;

