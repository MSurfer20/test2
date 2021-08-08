--
-- Zulip REST API.
-- Prepared SQL queries for 'BadEventQueueIdError' definition.
--


--
-- SELECT template for table `BadEventQueueIdError`
--
SELECT `result`, `msg`, `code`, `queue_id` FROM `BadEventQueueIdError` WHERE 1;

--
-- INSERT template for table `BadEventQueueIdError`
--
INSERT INTO `BadEventQueueIdError`(`result`, `msg`, `code`, `queue_id`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `BadEventQueueIdError`
--
UPDATE `BadEventQueueIdError` SET `result` = ?, `msg` = ?, `code` = ?, `queue_id` = ? WHERE 1;

--
-- DELETE template for table `BadEventQueueIdError`
--
DELETE FROM `BadEventQueueIdError` WHERE 0;

