--
-- Zulip REST API.
-- Prepared SQL queries for 'CustomProfileField' definition.
--


--
-- SELECT template for table `CustomProfileField`
--
SELECT `id`, `type`, `order`, `name`, `hint`, `field_data` FROM `CustomProfileField` WHERE 1;

--
-- INSERT template for table `CustomProfileField`
--
INSERT INTO `CustomProfileField`(`id`, `type`, `order`, `name`, `hint`, `field_data`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CustomProfileField`
--
UPDATE `CustomProfileField` SET `id` = ?, `type` = ?, `order` = ?, `name` = ?, `hint` = ?, `field_data` = ? WHERE 1;

--
-- DELETE template for table `CustomProfileField`
--
DELETE FROM `CustomProfileField` WHERE 0;

