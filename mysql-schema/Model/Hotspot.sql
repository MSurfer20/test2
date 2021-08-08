--
-- Zulip REST API.
-- Prepared SQL queries for 'Hotspot' definition.
--


--
-- SELECT template for table `Hotspot`
--
SELECT `delay`, `name`, `title`, `description` FROM `Hotspot` WHERE 1;

--
-- INSERT template for table `Hotspot`
--
INSERT INTO `Hotspot`(`delay`, `name`, `title`, `description`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `Hotspot`
--
UPDATE `Hotspot` SET `delay` = ?, `name` = ?, `title` = ?, `description` = ? WHERE 1;

--
-- DELETE template for table `Hotspot`
--
DELETE FROM `Hotspot` WHERE 0;

