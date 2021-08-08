--
-- Zulip REST API.
-- Prepared SQL queries for 'Presence' definition.
--


--
-- SELECT template for table `Presence`
--
SELECT `client`, `status`, `timestamp`, `pushable` FROM `Presence` WHERE 1;

--
-- INSERT template for table `Presence`
--
INSERT INTO `Presence`(`client`, `status`, `timestamp`, `pushable`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `Presence`
--
UPDATE `Presence` SET `client` = ?, `status` = ?, `timestamp` = ?, `pushable` = ? WHERE 1;

--
-- DELETE template for table `Presence`
--
DELETE FROM `Presence` WHERE 0;

