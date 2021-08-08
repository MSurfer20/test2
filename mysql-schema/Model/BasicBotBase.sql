--
-- Zulip REST API.
-- Prepared SQL queries for 'BasicBotBase' definition.
--


--
-- SELECT template for table `BasicBotBase`
--
SELECT `user_id`, `full_name`, `api_key`, `default_sending_stream`, `default_events_register_stream`, `default_all_public_streams`, `avatar_url`, `owner_id`, `services` FROM `BasicBotBase` WHERE 1;

--
-- INSERT template for table `BasicBotBase`
--
INSERT INTO `BasicBotBase`(`user_id`, `full_name`, `api_key`, `default_sending_stream`, `default_events_register_stream`, `default_all_public_streams`, `avatar_url`, `owner_id`, `services`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BasicBotBase`
--
UPDATE `BasicBotBase` SET `user_id` = ?, `full_name` = ?, `api_key` = ?, `default_sending_stream` = ?, `default_events_register_stream` = ?, `default_all_public_streams` = ?, `avatar_url` = ?, `owner_id` = ?, `services` = ? WHERE 1;

--
-- DELETE template for table `BasicBotBase`
--
DELETE FROM `BasicBotBase` WHERE 0;

