--
-- Zulip REST API.
-- Prepared SQL queries for 'EmojiBase' definition.
--


--
-- SELECT template for table `EmojiBase`
--
SELECT `emoji_code`, `emoji_name`, `reaction_type` FROM `EmojiBase` WHERE 1;

--
-- INSERT template for table `EmojiBase`
--
INSERT INTO `EmojiBase`(`emoji_code`, `emoji_name`, `reaction_type`) VALUES (?, ?, ?);

--
-- UPDATE template for table `EmojiBase`
--
UPDATE `EmojiBase` SET `emoji_code` = ?, `emoji_name` = ?, `reaction_type` = ? WHERE 1;

--
-- DELETE template for table `EmojiBase`
--
DELETE FROM `EmojiBase` WHERE 0;

