--
-- Zulip REST API.
-- Prepared SQL queries for 'MissingArgumentError' definition.
--


--
-- SELECT template for table `MissingArgumentError`
--
SELECT `result`, `msg`, `code`, `var_name` FROM `MissingArgumentError` WHERE 1;

--
-- INSERT template for table `MissingArgumentError`
--
INSERT INTO `MissingArgumentError`(`result`, `msg`, `code`, `var_name`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `MissingArgumentError`
--
UPDATE `MissingArgumentError` SET `result` = ?, `msg` = ?, `code` = ?, `var_name` = ? WHERE 1;

--
-- DELETE template for table `MissingArgumentError`
--
DELETE FROM `MissingArgumentError` WHERE 0;

