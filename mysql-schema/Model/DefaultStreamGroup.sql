--
-- Zulip REST API.
-- Prepared SQL queries for 'DefaultStreamGroup' definition.
--


--
-- SELECT template for table `DefaultStreamGroup`
--
SELECT `name`, `description`, `id`, `streams` FROM `DefaultStreamGroup` WHERE 1;

--
-- INSERT template for table `DefaultStreamGroup`
--
INSERT INTO `DefaultStreamGroup`(`name`, `description`, `id`, `streams`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `DefaultStreamGroup`
--
UPDATE `DefaultStreamGroup` SET `name` = ?, `description` = ?, `id` = ?, `streams` = ? WHERE 1;

--
-- DELETE template for table `DefaultStreamGroup`
--
DELETE FROM `DefaultStreamGroup` WHERE 0;

