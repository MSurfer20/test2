--
-- Zulip REST API.
-- Prepared SQL queries for 'Attachments' definition.
--


--
-- SELECT template for table `Attachments`
--
SELECT `id`, `name`, `path_id`, `size`, `create_time`, `messages` FROM `Attachments` WHERE 1;

--
-- INSERT template for table `Attachments`
--
INSERT INTO `Attachments`(`id`, `name`, `path_id`, `size`, `create_time`, `messages`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Attachments`
--
UPDATE `Attachments` SET `id` = ?, `name` = ?, `path_id` = ?, `size` = ?, `create_time` = ?, `messages` = ? WHERE 1;

--
-- DELETE template for table `Attachments`
--
DELETE FROM `Attachments` WHERE 0;

