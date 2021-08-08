--
-- Zulip REST API.
-- Prepared SQL queries for 'RateLimitedError' definition.
--


--
-- SELECT template for table `RateLimitedError`
--
SELECT `result`, `msg`, `code` FROM `RateLimitedError` WHERE 1;

--
-- INSERT template for table `RateLimitedError`
--
INSERT INTO `RateLimitedError`(`result`, `msg`, `code`) VALUES (?, ?, ?);

--
-- UPDATE template for table `RateLimitedError`
--
UPDATE `RateLimitedError` SET `result` = ?, `msg` = ?, `code` = ? WHERE 1;

--
-- DELETE template for table `RateLimitedError`
--
DELETE FROM `RateLimitedError` WHERE 0;

