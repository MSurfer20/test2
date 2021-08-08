--
-- Zulip REST API.
-- Prepared SQL queries for 'MissingArgumentError_allOf' definition.
--


--
-- SELECT template for table `MissingArgumentError_allOf`
--
SELECT `result`, `msg`, `code`, `var_name` FROM `MissingArgumentError_allOf` WHERE 1;

--
-- INSERT template for table `MissingArgumentError_allOf`
--
INSERT INTO `MissingArgumentError_allOf`(`result`, `msg`, `code`, `var_name`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `MissingArgumentError_allOf`
--
UPDATE `MissingArgumentError_allOf` SET `result` = ?, `msg` = ?, `code` = ?, `var_name` = ? WHERE 1;

--
-- DELETE template for table `MissingArgumentError_allOf`
--
DELETE FROM `MissingArgumentError_allOf` WHERE 0;

