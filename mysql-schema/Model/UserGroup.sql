--
-- Zulip REST API.
-- Prepared SQL queries for 'UserGroup' definition.
--


--
-- SELECT template for table `UserGroup`
--
SELECT `name`, `description`, `members`, `id` FROM `UserGroup` WHERE 1;

--
-- INSERT template for table `UserGroup`
--
INSERT INTO `UserGroup`(`name`, `description`, `members`, `id`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `UserGroup`
--
UPDATE `UserGroup` SET `name` = ?, `description` = ?, `members` = ?, `id` = ? WHERE 1;

--
-- DELETE template for table `UserGroup`
--
DELETE FROM `UserGroup` WHERE 0;

