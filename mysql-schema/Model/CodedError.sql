--
-- Zulip REST API.
-- Prepared SQL queries for 'CodedError' definition.
--


--
-- SELECT template for table `CodedError`
--
SELECT `result`, `msg`, `code` FROM `CodedError` WHERE 1;

--
-- INSERT template for table `CodedError`
--
INSERT INTO `CodedError`(`result`, `msg`, `code`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CodedError`
--
UPDATE `CodedError` SET `result` = ?, `msg` = ?, `code` = ? WHERE 1;

--
-- DELETE template for table `CodedError`
--
DELETE FROM `CodedError` WHERE 0;

