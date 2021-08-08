--
-- Zulip REST API.
-- Prepared SQL queries for 'Attachments_messages' definition.
--


--
-- SELECT template for table `Attachments_messages`
--
SELECT `date_sent`, `id` FROM `Attachments_messages` WHERE 1;

--
-- INSERT template for table `Attachments_messages`
--
INSERT INTO `Attachments_messages`(`date_sent`, `id`) VALUES (?, ?);

--
-- UPDATE template for table `Attachments_messages`
--
UPDATE `Attachments_messages` SET `date_sent` = ?, `id` = ? WHERE 1;

--
-- DELETE template for table `Attachments_messages`
--
DELETE FROM `Attachments_messages` WHERE 0;

