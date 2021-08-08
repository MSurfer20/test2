--
-- Zulip REST API.
-- Prepared SQL queries for 'JsonError' definition.
--


--
-- SELECT template for table `JsonError`
--
SELECT `result`, `msg` FROM `JsonError` WHERE 1;

--
-- INSERT template for table `JsonError`
--
INSERT INTO `JsonError`(`result`, `msg`) VALUES (?, ?);

--
-- UPDATE template for table `JsonError`
--
UPDATE `JsonError` SET `result` = ?, `msg` = ? WHERE 1;

--
-- DELETE template for table `JsonError`
--
DELETE FROM `JsonError` WHERE 0;

