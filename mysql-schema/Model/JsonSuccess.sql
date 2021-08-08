--
-- Zulip REST API.
-- Prepared SQL queries for 'JsonSuccess' definition.
--


--
-- SELECT template for table `JsonSuccess`
--
SELECT `result`, `msg` FROM `JsonSuccess` WHERE 1;

--
-- INSERT template for table `JsonSuccess`
--
INSERT INTO `JsonSuccess`(`result`, `msg`) VALUES (?, ?);

--
-- UPDATE template for table `JsonSuccess`
--
UPDATE `JsonSuccess` SET `result` = ?, `msg` = ? WHERE 1;

--
-- DELETE template for table `JsonSuccess`
--
DELETE FROM `JsonSuccess` WHERE 0;

