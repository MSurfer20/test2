--
-- Zulip REST API.
-- Prepared SQL queries for 'CodedErrorBase' definition.
--


--
-- SELECT template for table `CodedErrorBase`
--
SELECT `result`, `msg`, `code` FROM `CodedErrorBase` WHERE 1;

--
-- INSERT template for table `CodedErrorBase`
--
INSERT INTO `CodedErrorBase`(`result`, `msg`, `code`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CodedErrorBase`
--
UPDATE `CodedErrorBase` SET `result` = ?, `msg` = ?, `code` = ? WHERE 1;

--
-- DELETE template for table `CodedErrorBase`
--
DELETE FROM `CodedErrorBase` WHERE 0;

