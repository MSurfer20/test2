--
-- Zulip REST API.
-- Prepared SQL queries for 'Draft' definition.
--


--
-- SELECT template for table `Draft`
--
SELECT `id`, `type`, `to`, `topic`, `content`, `timestamp` FROM `Draft` WHERE 1;

--
-- INSERT template for table `Draft`
--
INSERT INTO `Draft`(`id`, `type`, `to`, `topic`, `content`, `timestamp`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Draft`
--
UPDATE `Draft` SET `id` = ?, `type` = ?, `to` = ?, `topic` = ?, `content` = ?, `timestamp` = ? WHERE 1;

--
-- DELETE template for table `Draft`
--
DELETE FROM `Draft` WHERE 0;

