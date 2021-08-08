--
-- Zulip REST API.
-- Prepared SQL queries for 'JsonSuccessBase' definition.
--


--
-- SELECT template for table `JsonSuccessBase`
--
SELECT `result`, `msg` FROM `JsonSuccessBase` WHERE 1;

--
-- INSERT template for table `JsonSuccessBase`
--
INSERT INTO `JsonSuccessBase`(`result`, `msg`) VALUES (?, ?);

--
-- UPDATE template for table `JsonSuccessBase`
--
UPDATE `JsonSuccessBase` SET `result` = ?, `msg` = ? WHERE 1;

--
-- DELETE template for table `JsonSuccessBase`
--
DELETE FROM `JsonSuccessBase` WHERE 0;

