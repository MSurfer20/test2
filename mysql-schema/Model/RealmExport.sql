--
-- Zulip REST API.
-- Prepared SQL queries for 'RealmExport' definition.
--


--
-- SELECT template for table `RealmExport`
--
SELECT `id`, `acting_user_id`, `export_time`, `deleted_timestamp`, `failed_timestamp`, `export_url`, `pending` FROM `RealmExport` WHERE 1;

--
-- INSERT template for table `RealmExport`
--
INSERT INTO `RealmExport`(`id`, `acting_user_id`, `export_time`, `deleted_timestamp`, `failed_timestamp`, `export_url`, `pending`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `RealmExport`
--
UPDATE `RealmExport` SET `id` = ?, `acting_user_id` = ?, `export_time` = ?, `deleted_timestamp` = ?, `failed_timestamp` = ?, `export_url` = ?, `pending` = ? WHERE 1;

--
-- DELETE template for table `RealmExport`
--
DELETE FROM `RealmExport` WHERE 0;

