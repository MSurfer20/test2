--
-- Zulip REST API.
-- Prepared SQL queries for 'inline_response_200' definition.
--


--
-- SELECT template for table `inline_response_200`
--
SELECT `bot_email`, `bot_full_name`, `data`, `trigger`, `token`, `message` FROM `inline_response_200` WHERE 1;

--
-- INSERT template for table `inline_response_200`
--
INSERT INTO `inline_response_200`(`bot_email`, `bot_full_name`, `data`, `trigger`, `token`, `message`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `inline_response_200`
--
UPDATE `inline_response_200` SET `bot_email` = ?, `bot_full_name` = ?, `data` = ?, `trigger` = ?, `token` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `inline_response_200`
--
DELETE FROM `inline_response_200` WHERE 0;

