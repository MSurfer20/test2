--
-- Zulip REST API.
-- Prepared SQL queries for 'EmojiReactionBase' definition.
--


--
-- SELECT template for table `EmojiReactionBase`
--
SELECT `emoji_code`, `emoji_name`, `reaction_type`, `user_id`, `user` FROM `EmojiReactionBase` WHERE 1;

--
-- INSERT template for table `EmojiReactionBase`
--
INSERT INTO `EmojiReactionBase`(`emoji_code`, `emoji_name`, `reaction_type`, `user_id`, `user`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `EmojiReactionBase`
--
UPDATE `EmojiReactionBase` SET `emoji_code` = ?, `emoji_name` = ?, `reaction_type` = ?, `user_id` = ?, `user` = ? WHERE 1;

--
-- DELETE template for table `EmojiReactionBase`
--
DELETE FROM `EmojiReactionBase` WHERE 0;

