--
-- Zulip REST API.
-- Prepared SQL queries for 'EmojiReaction' definition.
--


--
-- SELECT template for table `EmojiReaction`
--
SELECT `emoji_code`, `emoji_name`, `reaction_type`, `user_id`, `user` FROM `EmojiReaction` WHERE 1;

--
-- INSERT template for table `EmojiReaction`
--
INSERT INTO `EmojiReaction`(`emoji_code`, `emoji_name`, `reaction_type`, `user_id`, `user`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `EmojiReaction`
--
UPDATE `EmojiReaction` SET `emoji_code` = ?, `emoji_name` = ?, `reaction_type` = ?, `user_id` = ?, `user` = ? WHERE 1;

--
-- DELETE template for table `EmojiReaction`
--
DELETE FROM `EmojiReaction` WHERE 0;

