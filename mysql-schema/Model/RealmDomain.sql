--
-- Zulip REST API.
-- Prepared SQL queries for 'RealmDomain' definition.
--


--
-- SELECT template for table `RealmDomain`
--
SELECT `domain`, `allow_subdomains` FROM `RealmDomain` WHERE 1;

--
-- INSERT template for table `RealmDomain`
--
INSERT INTO `RealmDomain`(`domain`, `allow_subdomains`) VALUES (?, ?);

--
-- UPDATE template for table `RealmDomain`
--
UPDATE `RealmDomain` SET `domain` = ?, `allow_subdomains` = ? WHERE 1;

--
-- DELETE template for table `RealmDomain`
--
DELETE FROM `RealmDomain` WHERE 0;

