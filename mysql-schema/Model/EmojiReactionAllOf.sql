--
-- Zulip REST API.
-- Prepared SQL queries for 'EmojiReaction_allOf' definition.
--


--
-- SELECT template for table `EmojiReaction_allOf`
--
SELECT `emoji_code`, `emoji_name`, `reaction_type`, `user_id`, `user` FROM `EmojiReaction_allOf` WHERE 1;

--
-- INSERT template for table `EmojiReaction_allOf`
--
INSERT INTO `EmojiReaction_allOf`(`emoji_code`, `emoji_name`, `reaction_type`, `user_id`, `user`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `EmojiReaction_allOf`
--
UPDATE `EmojiReaction_allOf` SET `emoji_code` = ?, `emoji_name` = ?, `reaction_type` = ?, `user_id` = ?, `user` = ? WHERE 1;

--
-- DELETE template for table `EmojiReaction_allOf`
--
DELETE FROM `EmojiReaction_allOf` WHERE 0;

