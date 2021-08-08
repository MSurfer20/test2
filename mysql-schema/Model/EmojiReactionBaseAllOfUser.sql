--
-- Zulip REST API.
-- Prepared SQL queries for 'EmojiReactionBase_allOf_user' definition.
--


--
-- SELECT template for table `EmojiReactionBase_allOf_user`
--
SELECT `id`, `email`, `full_name`, `is_mirror_dummy` FROM `EmojiReactionBase_allOf_user` WHERE 1;

--
-- INSERT template for table `EmojiReactionBase_allOf_user`
--
INSERT INTO `EmojiReactionBase_allOf_user`(`id`, `email`, `full_name`, `is_mirror_dummy`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `EmojiReactionBase_allOf_user`
--
UPDATE `EmojiReactionBase_allOf_user` SET `id` = ?, `email` = ?, `full_name` = ?, `is_mirror_dummy` = ? WHERE 1;

--
-- DELETE template for table `EmojiReactionBase_allOf_user`
--
DELETE FROM `EmojiReactionBase_allOf_user` WHERE 0;

