--
-- Zulip REST API.
-- Prepared SQL queries for 'MessagesBase_topic_links' definition.
--


--
-- SELECT template for table `MessagesBase_topic_links`
--
SELECT `text`, `url` FROM `MessagesBase_topic_links` WHERE 1;

--
-- INSERT template for table `MessagesBase_topic_links`
--
INSERT INTO `MessagesBase_topic_links`(`text`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `MessagesBase_topic_links`
--
UPDATE `MessagesBase_topic_links` SET `text` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `MessagesBase_topic_links`
--
DELETE FROM `MessagesBase_topic_links` WHERE 0;

