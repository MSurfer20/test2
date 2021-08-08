--
-- Zulip REST API.
-- Prepared SQL queries for 'AddSubscriptionsResponse' definition.
--


--
-- SELECT template for table `AddSubscriptionsResponse`
--
SELECT `result`, `msg`, `subscribed`, `already_subscribed`, `unauthorized` FROM `AddSubscriptionsResponse` WHERE 1;

--
-- INSERT template for table `AddSubscriptionsResponse`
--
INSERT INTO `AddSubscriptionsResponse`(`result`, `msg`, `subscribed`, `already_subscribed`, `unauthorized`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `AddSubscriptionsResponse`
--
UPDATE `AddSubscriptionsResponse` SET `result` = ?, `msg` = ?, `subscribed` = ?, `already_subscribed` = ?, `unauthorized` = ? WHERE 1;

--
-- DELETE template for table `AddSubscriptionsResponse`
--
DELETE FROM `AddSubscriptionsResponse` WHERE 0;

