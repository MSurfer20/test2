--
-- Zulip REST API.
-- Prepared SQL queries for 'BadEventQueueIdError_allOf' definition.
--


--
-- SELECT template for table `BadEventQueueIdError_allOf`
--
SELECT `result`, `msg`, `code`, `queue_id` FROM `BadEventQueueIdError_allOf` WHERE 1;

--
-- INSERT template for table `BadEventQueueIdError_allOf`
--
INSERT INTO `BadEventQueueIdError_allOf`(`result`, `msg`, `code`, `queue_id`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `BadEventQueueIdError_allOf`
--
UPDATE `BadEventQueueIdError_allOf` SET `result` = ?, `msg` = ?, `code` = ?, `queue_id` = ? WHERE 1;

--
-- DELETE template for table `BadEventQueueIdError_allOf`
--
DELETE FROM `BadEventQueueIdError_allOf` WHERE 0;

