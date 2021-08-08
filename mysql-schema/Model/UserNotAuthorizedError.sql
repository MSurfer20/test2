--
-- Zulip REST API.
-- Prepared SQL queries for 'UserNotAuthorizedError' definition.
--


--
-- SELECT template for table `UserNotAuthorizedError`
--
SELECT `result`, `msg`, `code` FROM `UserNotAuthorizedError` WHERE 1;

--
-- INSERT template for table `UserNotAuthorizedError`
--
INSERT INTO `UserNotAuthorizedError`(`result`, `msg`, `code`) VALUES (?, ?, ?);

--
-- UPDATE template for table `UserNotAuthorizedError`
--
UPDATE `UserNotAuthorizedError` SET `result` = ?, `msg` = ?, `code` = ? WHERE 1;

--
-- DELETE template for table `UserNotAuthorizedError`
--
DELETE FROM `UserNotAuthorizedError` WHERE 0;

