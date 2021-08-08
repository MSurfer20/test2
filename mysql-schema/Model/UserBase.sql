--
-- Zulip REST API.
-- Prepared SQL queries for 'UserBase' definition.
--


--
-- SELECT template for table `UserBase`
--
SELECT `email`, `is_bot`, `avatar_url`, `avatar_version`, `full_name`, `is_admin`, `is_owner`, `is_billing_admin`, `role`, `bot_type`, `user_id`, `bot_owner_id`, `is_active`, `is_guest`, `timezone`, `date_joined`, `delivery_email`, `profile_data` FROM `UserBase` WHERE 1;

--
-- INSERT template for table `UserBase`
--
INSERT INTO `UserBase`(`email`, `is_bot`, `avatar_url`, `avatar_version`, `full_name`, `is_admin`, `is_owner`, `is_billing_admin`, `role`, `bot_type`, `user_id`, `bot_owner_id`, `is_active`, `is_guest`, `timezone`, `date_joined`, `delivery_email`, `profile_data`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `UserBase`
--
UPDATE `UserBase` SET `email` = ?, `is_bot` = ?, `avatar_url` = ?, `avatar_version` = ?, `full_name` = ?, `is_admin` = ?, `is_owner` = ?, `is_billing_admin` = ?, `role` = ?, `bot_type` = ?, `user_id` = ?, `bot_owner_id` = ?, `is_active` = ?, `is_guest` = ?, `timezone` = ?, `date_joined` = ?, `delivery_email` = ?, `profile_data` = ? WHERE 1;

--
-- DELETE template for table `UserBase`
--
DELETE FROM `UserBase` WHERE 0;

