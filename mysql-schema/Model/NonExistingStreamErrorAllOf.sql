--
-- Zulip REST API.
-- Prepared SQL queries for 'NonExistingStreamError_allOf' definition.
--


--
-- SELECT template for table `NonExistingStreamError_allOf`
--
SELECT `result`, `msg`, `code`, `stream` FROM `NonExistingStreamError_allOf` WHERE 1;

--
-- INSERT template for table `NonExistingStreamError_allOf`
--
INSERT INTO `NonExistingStreamError_allOf`(`result`, `msg`, `code`, `stream`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `NonExistingStreamError_allOf`
--
UPDATE `NonExistingStreamError_allOf` SET `result` = ?, `msg` = ?, `code` = ?, `stream` = ? WHERE 1;

--
-- DELETE template for table `NonExistingStreamError_allOf`
--
DELETE FROM `NonExistingStreamError_allOf` WHERE 0;

