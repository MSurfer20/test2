--
-- Zulip REST API.
-- Prepared SQL queries for 'BasicBot' definition.
--


--
-- SELECT template for table `BasicBot`
--
SELECT `user_id`, `full_name`, `api_key`, `default_sending_stream`, `default_events_register_stream`, `default_all_public_streams`, `avatar_url`, `owner_id`, `services` FROM `BasicBot` WHERE 1;

--
-- INSERT template for table `BasicBot`
--
INSERT INTO `BasicBot`(`user_id`, `full_name`, `api_key`, `default_sending_stream`, `default_events_register_stream`, `default_all_public_streams`, `avatar_url`, `owner_id`, `services`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BasicBot`
--
UPDATE `BasicBot` SET `user_id` = ?, `full_name` = ?, `api_key` = ?, `default_sending_stream` = ?, `default_events_register_stream` = ?, `default_all_public_streams` = ?, `avatar_url` = ?, `owner_id` = ?, `services` = ? WHERE 1;

--
-- DELETE template for table `BasicBot`
--
DELETE FROM `BasicBot` WHERE 0;

