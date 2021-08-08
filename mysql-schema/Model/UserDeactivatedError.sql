--
-- Zulip REST API.
-- Prepared SQL queries for 'UserDeactivatedError' definition.
--


--
-- SELECT template for table `UserDeactivatedError`
--
SELECT `result`, `msg`, `code` FROM `UserDeactivatedError` WHERE 1;

--
-- INSERT template for table `UserDeactivatedError`
--
INSERT INTO `UserDeactivatedError`(`result`, `msg`, `code`) VALUES (?, ?, ?);

--
-- UPDATE template for table `UserDeactivatedError`
--
UPDATE `UserDeactivatedError` SET `result` = ?, `msg` = ?, `code` = ? WHERE 1;

--
-- DELETE template for table `UserDeactivatedError`
--
DELETE FROM `UserDeactivatedError` WHERE 0;

