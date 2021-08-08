--
-- Zulip REST API.
-- Prepared SQL queries for 'NonExistingStreamError' definition.
--


--
-- SELECT template for table `NonExistingStreamError`
--
SELECT `result`, `msg`, `code`, `stream` FROM `NonExistingStreamError` WHERE 1;

--
-- INSERT template for table `NonExistingStreamError`
--
INSERT INTO `NonExistingStreamError`(`result`, `msg`, `code`, `stream`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `NonExistingStreamError`
--
UPDATE `NonExistingStreamError` SET `result` = ?, `msg` = ?, `code` = ?, `stream` = ? WHERE 1;

--
-- DELETE template for table `NonExistingStreamError`
--
DELETE FROM `NonExistingStreamError` WHERE 0;

