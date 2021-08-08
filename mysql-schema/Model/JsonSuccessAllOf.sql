--
-- Zulip REST API.
-- Prepared SQL queries for 'JsonSuccess_allOf' definition.
--


--
-- SELECT template for table `JsonSuccess_allOf`
--
SELECT `result`, `msg` FROM `JsonSuccess_allOf` WHERE 1;

--
-- INSERT template for table `JsonSuccess_allOf`
--
INSERT INTO `JsonSuccess_allOf`(`result`, `msg`) VALUES (?, ?);

--
-- UPDATE template for table `JsonSuccess_allOf`
--
UPDATE `JsonSuccess_allOf` SET `result` = ?, `msg` = ? WHERE 1;

--
-- DELETE template for table `JsonSuccess_allOf`
--
DELETE FROM `JsonSuccess_allOf` WHERE 0;

