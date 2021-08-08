--
-- Zulip REST API.
-- Prepared SQL queries for 'RealmPlayground' definition.
--


--
-- SELECT template for table `RealmPlayground`
--
SELECT `id`, `name`, `pygments_language`, `url_prefix` FROM `RealmPlayground` WHERE 1;

--
-- INSERT template for table `RealmPlayground`
--
INSERT INTO `RealmPlayground`(`id`, `name`, `pygments_language`, `url_prefix`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `RealmPlayground`
--
UPDATE `RealmPlayground` SET `id` = ?, `name` = ?, `pygments_language` = ?, `url_prefix` = ? WHERE 1;

--
-- DELETE template for table `RealmPlayground`
--
DELETE FROM `RealmPlayground` WHERE 0;

