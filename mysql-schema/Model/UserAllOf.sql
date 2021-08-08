--
-- Zulip REST API.
-- Prepared SQL queries for 'User_allOf' definition.
--


--
-- SELECT template for table `User_allOf`
--
SELECT `email`, `is_bot`, `avatar_url`, `avatar_version`, `full_name`, `is_admin`, `is_owner`, `is_billing_admin`, `role`, `bot_type`, `user_id`, `bot_owner_id`, `is_active`, `is_guest`, `timezone`, `date_joined`, `delivery_email`, `profile_data` FROM `User_allOf` WHERE 1;

--
-- INSERT template for table `User_allOf`
--
INSERT INTO `User_allOf`(`email`, `is_bot`, `avatar_url`, `avatar_version`, `full_name`, `is_admin`, `is_owner`, `is_billing_admin`, `role`, `bot_type`, `user_id`, `bot_owner_id`, `is_active`, `is_guest`, `timezone`, `date_joined`, `delivery_email`, `profile_data`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `User_allOf`
--
UPDATE `User_allOf` SET `email` = ?, `is_bot` = ?, `avatar_url` = ?, `avatar_version` = ?, `full_name` = ?, `is_admin` = ?, `is_owner` = ?, `is_billing_admin` = ?, `role` = ?, `bot_type` = ?, `user_id` = ?, `bot_owner_id` = ?, `is_active` = ?, `is_guest` = ?, `timezone` = ?, `date_joined` = ?, `delivery_email` = ?, `profile_data` = ? WHERE 1;

--
-- DELETE template for table `User_allOf`
--
DELETE FROM `User_allOf` WHERE 0;

