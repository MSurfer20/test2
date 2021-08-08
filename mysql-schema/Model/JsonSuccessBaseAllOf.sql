--
-- Zulip REST API.
-- Prepared SQL queries for 'JsonSuccessBase_allOf' definition.
--


--
-- SELECT template for table `JsonSuccessBase_allOf`
--
SELECT `result`, `msg` FROM `JsonSuccessBase_allOf` WHERE 1;

--
-- INSERT template for table `JsonSuccessBase_allOf`
--
INSERT INTO `JsonSuccessBase_allOf`(`result`, `msg`) VALUES (?, ?);

--
-- UPDATE template for table `JsonSuccessBase_allOf`
--
UPDATE `JsonSuccessBase_allOf` SET `result` = ?, `msg` = ? WHERE 1;

--
-- DELETE template for table `JsonSuccessBase_allOf`
--
DELETE FROM `JsonSuccessBase_allOf` WHERE 0;

