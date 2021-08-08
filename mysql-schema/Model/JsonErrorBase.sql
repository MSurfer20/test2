--
-- Zulip REST API.
-- Prepared SQL queries for 'JsonErrorBase' definition.
--


--
-- SELECT template for table `JsonErrorBase`
--
SELECT `result`, `msg` FROM `JsonErrorBase` WHERE 1;

--
-- INSERT template for table `JsonErrorBase`
--
INSERT INTO `JsonErrorBase`(`result`, `msg`) VALUES (?, ?);

--
-- UPDATE template for table `JsonErrorBase`
--
UPDATE `JsonErrorBase` SET `result` = ?, `msg` = ? WHERE 1;

--
-- DELETE template for table `JsonErrorBase`
--
DELETE FROM `JsonErrorBase` WHERE 0;

