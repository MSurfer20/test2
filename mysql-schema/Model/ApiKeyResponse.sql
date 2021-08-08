--
-- Zulip REST API.
-- Prepared SQL queries for 'ApiKeyResponse' definition.
--


--
-- SELECT template for table `ApiKeyResponse`
--
SELECT `result`, `msg`, `api_key`, `email` FROM `ApiKeyResponse` WHERE 1;

--
-- INSERT template for table `ApiKeyResponse`
--
INSERT INTO `ApiKeyResponse`(`result`, `msg`, `api_key`, `email`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ApiKeyResponse`
--
UPDATE `ApiKeyResponse` SET `result` = ?, `msg` = ?, `api_key` = ?, `email` = ? WHERE 1;

--
-- DELETE template for table `ApiKeyResponse`
--
DELETE FROM `ApiKeyResponse` WHERE 0;

