--
-- Zulip REST API.
-- Prepared SQL queries for 'CodedError_allOf' definition.
--


--
-- SELECT template for table `CodedError_allOf`
--
SELECT `result`, `msg`, `code` FROM `CodedError_allOf` WHERE 1;

--
-- INSERT template for table `CodedError_allOf`
--
INSERT INTO `CodedError_allOf`(`result`, `msg`, `code`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CodedError_allOf`
--
UPDATE `CodedError_allOf` SET `result` = ?, `msg` = ?, `code` = ? WHERE 1;

--
-- DELETE template for table `CodedError_allOf`
--
DELETE FROM `CodedError_allOf` WHERE 0;

