--
-- Zulip REST API.
-- Prepared SQL queries for 'AddSubscriptionsResponse_allOf' definition.
--


--
-- SELECT template for table `AddSubscriptionsResponse_allOf`
--
SELECT `result`, `msg`, `subscribed`, `already_subscribed`, `unauthorized` FROM `AddSubscriptionsResponse_allOf` WHERE 1;

--
-- INSERT template for table `AddSubscriptionsResponse_allOf`
--
INSERT INTO `AddSubscriptionsResponse_allOf`(`result`, `msg`, `subscribed`, `already_subscribed`, `unauthorized`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `AddSubscriptionsResponse_allOf`
--
UPDATE `AddSubscriptionsResponse_allOf` SET `result` = ?, `msg` = ?, `subscribed` = ?, `already_subscribed` = ?, `unauthorized` = ? WHERE 1;

--
-- DELETE template for table `AddSubscriptionsResponse_allOf`
--
DELETE FROM `AddSubscriptionsResponse_allOf` WHERE 0;

