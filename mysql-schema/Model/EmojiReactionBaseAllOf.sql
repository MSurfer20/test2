--
-- Zulip REST API.
-- Prepared SQL queries for 'EmojiReactionBase_allOf' definition.
--


--
-- SELECT template for table `EmojiReactionBase_allOf`
--
SELECT `user_id`, `user` FROM `EmojiReactionBase_allOf` WHERE 1;

--
-- INSERT template for table `EmojiReactionBase_allOf`
--
INSERT INTO `EmojiReactionBase_allOf`(`user_id`, `user`) VALUES (?, ?);

--
-- UPDATE template for table `EmojiReactionBase_allOf`
--
UPDATE `EmojiReactionBase_allOf` SET `user_id` = ?, `user` = ? WHERE 1;

--
-- DELETE template for table `EmojiReactionBase_allOf`
--
DELETE FROM `EmojiReactionBase_allOf` WHERE 0;

