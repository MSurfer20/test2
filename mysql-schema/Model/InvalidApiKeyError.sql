--
-- Zulip REST API.
-- Prepared SQL queries for 'InvalidApiKeyError' definition.
--


--
-- SELECT template for table `InvalidApiKeyError`
--
SELECT `result`, `msg` FROM `InvalidApiKeyError` WHERE 1;

--
-- INSERT template for table `InvalidApiKeyError`
--
INSERT INTO `InvalidApiKeyError`(`result`, `msg`) VALUES (?, ?);

--
-- UPDATE template for table `InvalidApiKeyError`
--
UPDATE `InvalidApiKeyError` SET `result` = ?, `msg` = ? WHERE 1;

--
-- DELETE template for table `InvalidApiKeyError`
--
DELETE FROM `InvalidApiKeyError` WHERE 0;

