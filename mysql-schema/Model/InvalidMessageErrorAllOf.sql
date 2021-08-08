--
-- Zulip REST API.
-- Prepared SQL queries for 'InvalidMessageError_allOf' definition.
--


--
-- SELECT template for table `InvalidMessageError_allOf`
--
SELECT `result`, `msg`, `raw_content` FROM `InvalidMessageError_allOf` WHERE 1;

--
-- INSERT template for table `InvalidMessageError_allOf`
--
INSERT INTO `InvalidMessageError_allOf`(`result`, `msg`, `raw_content`) VALUES (?, ?, ?);

--
-- UPDATE template for table `InvalidMessageError_allOf`
--
UPDATE `InvalidMessageError_allOf` SET `result` = ?, `msg` = ?, `raw_content` = ? WHERE 1;

--
-- DELETE template for table `InvalidMessageError_allOf`
--
DELETE FROM `InvalidMessageError_allOf` WHERE 0;

