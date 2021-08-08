--
-- Zulip REST API.
-- Prepared SQL queries for 'BasicBot_allOf' definition.
--


--
-- SELECT template for table `BasicBot_allOf`
--
SELECT `user_id`, `full_name`, `api_key`, `default_sending_stream`, `default_events_register_stream`, `default_all_public_streams`, `avatar_url`, `owner_id`, `services` FROM `BasicBot_allOf` WHERE 1;

--
-- INSERT template for table `BasicBot_allOf`
--
INSERT INTO `BasicBot_allOf`(`user_id`, `full_name`, `api_key`, `default_sending_stream`, `default_events_register_stream`, `default_all_public_streams`, `avatar_url`, `owner_id`, `services`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BasicBot_allOf`
--
UPDATE `BasicBot_allOf` SET `user_id` = ?, `full_name` = ?, `api_key` = ?, `default_sending_stream` = ?, `default_events_register_stream` = ?, `default_all_public_streams` = ?, `avatar_url` = ?, `owner_id` = ?, `services` = ? WHERE 1;

--
-- DELETE template for table `BasicBot_allOf`
--
DELETE FROM `BasicBot_allOf` WHERE 0;

