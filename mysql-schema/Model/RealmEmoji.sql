--
-- Zulip REST API.
-- Prepared SQL queries for 'RealmEmoji' definition.
--


--
-- SELECT template for table `RealmEmoji`
--
SELECT `id`, `name`, `source_url`, `deactivated`, `author_id` FROM `RealmEmoji` WHERE 1;

--
-- INSERT template for table `RealmEmoji`
--
INSERT INTO `RealmEmoji`(`id`, `name`, `source_url`, `deactivated`, `author_id`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `RealmEmoji`
--
UPDATE `RealmEmoji` SET `id` = ?, `name` = ?, `source_url` = ?, `deactivated` = ?, `author_id` = ? WHERE 1;

--
-- DELETE template for table `RealmEmoji`
--
DELETE FROM `RealmEmoji` WHERE 0;

