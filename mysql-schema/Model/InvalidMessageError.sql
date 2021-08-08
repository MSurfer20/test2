--
-- Zulip REST API.
-- Prepared SQL queries for 'InvalidMessageError' definition.
--


--
-- SELECT template for table `InvalidMessageError`
--
SELECT `result`, `msg`, `raw_content` FROM `InvalidMessageError` WHERE 1;

--
-- INSERT template for table `InvalidMessageError`
--
INSERT INTO `InvalidMessageError`(`result`, `msg`, `raw_content`) VALUES (?, ?, ?);

--
-- UPDATE template for table `InvalidMessageError`
--
UPDATE `InvalidMessageError` SET `result` = ?, `msg` = ?, `raw_content` = ? WHERE 1;

--
-- DELETE template for table `InvalidMessageError`
--
DELETE FROM `InvalidMessageError` WHERE 0;

