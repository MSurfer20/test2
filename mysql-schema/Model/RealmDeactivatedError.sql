--
-- Zulip REST API.
-- Prepared SQL queries for 'RealmDeactivatedError' definition.
--


--
-- SELECT template for table `RealmDeactivatedError`
--
SELECT `result`, `msg`, `code` FROM `RealmDeactivatedError` WHERE 1;

--
-- INSERT template for table `RealmDeactivatedError`
--
INSERT INTO `RealmDeactivatedError`(`result`, `msg`, `code`) VALUES (?, ?, ?);

--
-- UPDATE template for table `RealmDeactivatedError`
--
UPDATE `RealmDeactivatedError` SET `result` = ?, `msg` = ?, `code` = ? WHERE 1;

--
-- DELETE template for table `RealmDeactivatedError`
--
DELETE FROM `RealmDeactivatedError` WHERE 0;

