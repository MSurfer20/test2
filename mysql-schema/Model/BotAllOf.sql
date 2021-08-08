--
-- Zulip REST API.
-- Prepared SQL queries for 'Bot_allOf' definition.
--


--
-- SELECT template for table `Bot_allOf`
--
SELECT `user_id`, `full_name`, `api_key`, `default_sending_stream`, `default_events_register_stream`, `default_all_public_streams`, `avatar_url`, `owner_id`, `services`, `email`, `bot_type`, `is_active` FROM `Bot_allOf` WHERE 1;

--
-- INSERT template for table `Bot_allOf`
--
INSERT INTO `Bot_allOf`(`user_id`, `full_name`, `api_key`, `default_sending_stream`, `default_events_register_stream`, `default_all_public_streams`, `avatar_url`, `owner_id`, `services`, `email`, `bot_type`, `is_active`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Bot_allOf`
--
UPDATE `Bot_allOf` SET `user_id` = ?, `full_name` = ?, `api_key` = ?, `default_sending_stream` = ?, `default_events_register_stream` = ?, `default_all_public_streams` = ?, `avatar_url` = ?, `owner_id` = ?, `services` = ?, `email` = ?, `bot_type` = ?, `is_active` = ? WHERE 1;

--
-- DELETE template for table `Bot_allOf`
--
DELETE FROM `Bot_allOf` WHERE 0;

