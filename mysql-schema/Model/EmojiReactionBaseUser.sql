--
-- Zulip REST API.
-- Prepared SQL queries for 'EmojiReactionBase_user' definition.
--


--
-- SELECT template for table `EmojiReactionBase_user`
--
SELECT `id`, `email`, `full_name`, `is_mirror_dummy` FROM `EmojiReactionBase_user` WHERE 1;

--
-- INSERT template for table `EmojiReactionBase_user`
--
INSERT INTO `EmojiReactionBase_user`(`id`, `email`, `full_name`, `is_mirror_dummy`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `EmojiReactionBase_user`
--
UPDATE `EmojiReactionBase_user` SET `id` = ?, `email` = ?, `full_name` = ?, `is_mirror_dummy` = ? WHERE 1;

--
-- DELETE template for table `EmojiReactionBase_user`
--
DELETE FROM `EmojiReactionBase_user` WHERE 0;

