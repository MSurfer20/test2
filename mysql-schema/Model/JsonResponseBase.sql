--
-- Zulip REST API.
-- Prepared SQL queries for 'JsonResponseBase' definition.
--


--
-- SELECT template for table `JsonResponseBase`
--
SELECT `result` FROM `JsonResponseBase` WHERE 1;

--
-- INSERT template for table `JsonResponseBase`
--
INSERT INTO `JsonResponseBase`(`result`) VALUES (?);

--
-- UPDATE template for table `JsonResponseBase`
--
UPDATE `JsonResponseBase` SET `result` = ? WHERE 1;

--
-- DELETE template for table `JsonResponseBase`
--
DELETE FROM `JsonResponseBase` WHERE 0;

