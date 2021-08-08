--
-- Zulip REST API.
-- Prepared SQL queries for 'User' definition.
--


--
-- SELECT template for table `User`
--
SELECT `email`, `is_bot`, `avatar_url`, `avatar_version`, `full_name`, `is_admin`, `is_owner`, `is_billing_admin`, `role`, `bot_type`, `user_id`, `bot_owner_id`, `is_active`, `is_guest`, `timezone`, `date_joined`, `delivery_email`, `profile_data` FROM `User` WHERE 1;

--
-- INSERT template for table `User`
--
INSERT INTO `User`(`email`, `is_bot`, `avatar_url`, `avatar_version`, `full_name`, `is_admin`, `is_owner`, `is_billing_admin`, `role`, `bot_type`, `user_id`, `bot_owner_id`, `is_active`, `is_guest`, `timezone`, `date_joined`, `delivery_email`, `profile_data`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `User`
--
UPDATE `User` SET `email` = ?, `is_bot` = ?, `avatar_url` = ?, `avatar_version` = ?, `full_name` = ?, `is_admin` = ?, `is_owner` = ?, `is_billing_admin` = ?, `role` = ?, `bot_type` = ?, `user_id` = ?, `bot_owner_id` = ?, `is_active` = ?, `is_guest` = ?, `timezone` = ?, `date_joined` = ?, `delivery_email` = ?, `profile_data` = ? WHERE 1;

--
-- DELETE template for table `User`
--
DELETE FROM `User` WHERE 0;

