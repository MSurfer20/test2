--
-- Zulip REST API.
-- Prepared SQL queries for 'CodedErrorBase_allOf' definition.
--


--
-- SELECT template for table `CodedErrorBase_allOf`
--
SELECT `result`, `msg`, `code` FROM `CodedErrorBase_allOf` WHERE 1;

--
-- INSERT template for table `CodedErrorBase_allOf`
--
INSERT INTO `CodedErrorBase_allOf`(`result`, `msg`, `code`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CodedErrorBase_allOf`
--
UPDATE `CodedErrorBase_allOf` SET `result` = ?, `msg` = ?, `code` = ? WHERE 1;

--
-- DELETE template for table `CodedErrorBase_allOf`
--
DELETE FROM `CodedErrorBase_allOf` WHERE 0;

