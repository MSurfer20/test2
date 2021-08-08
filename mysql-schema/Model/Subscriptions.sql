--
-- Zulip REST API.
-- Prepared SQL queries for 'Subscriptions' definition.
--


--
-- SELECT template for table `Subscriptions`
--
SELECT `stream_id`, `name`, `description`, `rendered_description`, `date_created`, `invite_only`, `subscribers`, `desktop_notifications`, `email_notifications`, `wildcard_mentions_notify`, `push_notifications`, `audible_notifications`, `pin_to_top`, `email_address`, `is_muted`, `in_home_view`, `is_announcement_only`, `is_web_public`, `role`, `color`, `stream_post_policy`, `message_retention_days`, `history_public_to_subscribers`, `first_message_id`, `stream_weekly_traffic` FROM `Subscriptions` WHERE 1;

--
-- INSERT template for table `Subscriptions`
--
INSERT INTO `Subscriptions`(`stream_id`, `name`, `description`, `rendered_description`, `date_created`, `invite_only`, `subscribers`, `desktop_notifications`, `email_notifications`, `wildcard_mentions_notify`, `push_notifications`, `audible_notifications`, `pin_to_top`, `email_address`, `is_muted`, `in_home_view`, `is_announcement_only`, `is_web_public`, `role`, `color`, `stream_post_policy`, `message_retention_days`, `history_public_to_subscribers`, `first_message_id`, `stream_weekly_traffic`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Subscriptions`
--
UPDATE `Subscriptions` SET `stream_id` = ?, `name` = ?, `description` = ?, `rendered_description` = ?, `date_created` = ?, `invite_only` = ?, `subscribers` = ?, `desktop_notifications` = ?, `email_notifications` = ?, `wildcard_mentions_notify` = ?, `push_notifications` = ?, `audible_notifications` = ?, `pin_to_top` = ?, `email_address` = ?, `is_muted` = ?, `in_home_view` = ?, `is_announcement_only` = ?, `is_web_public` = ?, `role` = ?, `color` = ?, `stream_post_policy` = ?, `message_retention_days` = ?, `history_public_to_subscribers` = ?, `first_message_id` = ?, `stream_weekly_traffic` = ? WHERE 1;

--
-- DELETE template for table `Subscriptions`
--
DELETE FROM `Subscriptions` WHERE 0;

