--
-- Zulip REST API.
-- Prepared SQL queries for 'JsonErrorBase_allOf' definition.
--


--
-- SELECT template for table `JsonErrorBase_allOf`
--
SELECT `result`, `msg` FROM `JsonErrorBase_allOf` WHERE 1;

--
-- INSERT template for table `JsonErrorBase_allOf`
--
INSERT INTO `JsonErrorBase_allOf`(`result`, `msg`) VALUES (?, ?);

--
-- UPDATE template for table `JsonErrorBase_allOf`
--
UPDATE `JsonErrorBase_allOf` SET `result` = ?, `msg` = ? WHERE 1;

--
-- DELETE template for table `JsonErrorBase_allOf`
--
DELETE FROM `JsonErrorBase_allOf` WHERE 0;

