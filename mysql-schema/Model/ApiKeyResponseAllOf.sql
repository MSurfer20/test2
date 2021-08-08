--
-- Zulip REST API.
-- Prepared SQL queries for 'ApiKeyResponse_allOf' definition.
--


--
-- SELECT template for table `ApiKeyResponse_allOf`
--
SELECT `result`, `msg`, `api_key`, `email` FROM `ApiKeyResponse_allOf` WHERE 1;

--
-- INSERT template for table `ApiKeyResponse_allOf`
--
INSERT INTO `ApiKeyResponse_allOf`(`result`, `msg`, `api_key`, `email`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ApiKeyResponse_allOf`
--
UPDATE `ApiKeyResponse_allOf` SET `result` = ?, `msg` = ?, `api_key` = ?, `email` = ? WHERE 1;

--
-- DELETE template for table `ApiKeyResponse_allOf`
--
DELETE FROM `ApiKeyResponse_allOf` WHERE 0;

