--
-- Zulip REST API.
-- Prepared SQL queries for 'Bot' definition.
--


--
-- SELECT template for table `Bot`
--
SELECT `user_id`, `full_name`, `api_key`, `default_sending_stream`, `default_events_register_stream`, `default_all_public_streams`, `avatar_url`, `owner_id`, `services`, `email`, `bot_type`, `is_active` FROM `Bot` WHERE 1;

--
-- INSERT template for table `Bot`
--
INSERT INTO `Bot`(`user_id`, `full_name`, `api_key`, `default_sending_stream`, `default_events_register_stream`, `default_all_public_streams`, `avatar_url`, `owner_id`, `services`, `email`, `bot_type`, `is_active`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Bot`
--
UPDATE `Bot` SET `user_id` = ?, `full_name` = ?, `api_key` = ?, `default_sending_stream` = ?, `default_events_register_stream` = ?, `default_all_public_streams` = ?, `avatar_url` = ?, `owner_id` = ?, `services` = ?, `email` = ?, `bot_type` = ?, `is_active` = ? WHERE 1;

--
-- DELETE template for table `Bot`
--
DELETE FROM `Bot` WHERE 0;

