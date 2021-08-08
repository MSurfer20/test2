@isTest
private class OASEmojiReactionBaseAllOfUserTest {
    @isTest
    private static void equalsSameInstance() {
        OASEmojiReactionBaseAllOfUser emojiReactionBaseAllOfUser1 = OASEmojiReactionBaseAllOfUser.getExample();
        OASEmojiReactionBaseAllOfUser emojiReactionBaseAllOfUser2 = emojiReactionBaseAllOfUser1;
        OASEmojiReactionBaseAllOfUser emojiReactionBaseAllOfUser3 = new OASEmojiReactionBaseAllOfUser();
        OASEmojiReactionBaseAllOfUser emojiReactionBaseAllOfUser4 = emojiReactionBaseAllOfUser3;

        System.assert(emojiReactionBaseAllOfUser1.equals(emojiReactionBaseAllOfUser2));
        System.assert(emojiReactionBaseAllOfUser2.equals(emojiReactionBaseAllOfUser1));
        System.assert(emojiReactionBaseAllOfUser1.equals(emojiReactionBaseAllOfUser1));
        System.assert(emojiReactionBaseAllOfUser3.equals(emojiReactionBaseAllOfUser4));
        System.assert(emojiReactionBaseAllOfUser4.equals(emojiReactionBaseAllOfUser3));
        System.assert(emojiReactionBaseAllOfUser3.equals(emojiReactionBaseAllOfUser3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEmojiReactionBaseAllOfUser emojiReactionBaseAllOfUser1 = OASEmojiReactionBaseAllOfUser.getExample();
        OASEmojiReactionBaseAllOfUser emojiReactionBaseAllOfUser2 = OASEmojiReactionBaseAllOfUser.getExample();
        OASEmojiReactionBaseAllOfUser emojiReactionBaseAllOfUser3 = new OASEmojiReactionBaseAllOfUser();
        OASEmojiReactionBaseAllOfUser emojiReactionBaseAllOfUser4 = new OASEmojiReactionBaseAllOfUser();

        System.assert(emojiReactionBaseAllOfUser1.equals(emojiReactionBaseAllOfUser2));
        System.assert(emojiReactionBaseAllOfUser2.equals(emojiReactionBaseAllOfUser1));
        System.assert(emojiReactionBaseAllOfUser3.equals(emojiReactionBaseAllOfUser4));
        System.assert(emojiReactionBaseAllOfUser4.equals(emojiReactionBaseAllOfUser3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEmojiReactionBaseAllOfUser emojiReactionBaseAllOfUser1 = OASEmojiReactionBaseAllOfUser.getExample();
        OASEmojiReactionBaseAllOfUser emojiReactionBaseAllOfUser2 = new OASEmojiReactionBaseAllOfUser();

        System.assertEquals(false, emojiReactionBaseAllOfUser1.equals('foo'));
        System.assertEquals(false, emojiReactionBaseAllOfUser2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEmojiReactionBaseAllOfUser emojiReactionBaseAllOfUser1 = OASEmojiReactionBaseAllOfUser.getExample();
        OASEmojiReactionBaseAllOfUser emojiReactionBaseAllOfUser2 = new OASEmojiReactionBaseAllOfUser();
        OASEmojiReactionBaseAllOfUser emojiReactionBaseAllOfUser3;

        System.assertEquals(false, emojiReactionBaseAllOfUser1.equals(emojiReactionBaseAllOfUser3));
        System.assertEquals(false, emojiReactionBaseAllOfUser2.equals(emojiReactionBaseAllOfUser3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEmojiReactionBaseAllOfUser emojiReactionBaseAllOfUser1 = OASEmojiReactionBaseAllOfUser.getExample();
        OASEmojiReactionBaseAllOfUser emojiReactionBaseAllOfUser2 = new OASEmojiReactionBaseAllOfUser();

        System.assertEquals(emojiReactionBaseAllOfUser1.hashCode(), emojiReactionBaseAllOfUser1.hashCode());
        System.assertEquals(emojiReactionBaseAllOfUser2.hashCode(), emojiReactionBaseAllOfUser2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEmojiReactionBaseAllOfUser emojiReactionBaseAllOfUser1 = OASEmojiReactionBaseAllOfUser.getExample();
        OASEmojiReactionBaseAllOfUser emojiReactionBaseAllOfUser2 = OASEmojiReactionBaseAllOfUser.getExample();
        OASEmojiReactionBaseAllOfUser emojiReactionBaseAllOfUser3 = new OASEmojiReactionBaseAllOfUser();
        OASEmojiReactionBaseAllOfUser emojiReactionBaseAllOfUser4 = new OASEmojiReactionBaseAllOfUser();

        System.assert(emojiReactionBaseAllOfUser1.equals(emojiReactionBaseAllOfUser2));
        System.assert(emojiReactionBaseAllOfUser3.equals(emojiReactionBaseAllOfUser4));
        System.assertEquals(emojiReactionBaseAllOfUser1.hashCode(), emojiReactionBaseAllOfUser2.hashCode());
        System.assertEquals(emojiReactionBaseAllOfUser3.hashCode(), emojiReactionBaseAllOfUser4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEmojiReactionBaseAllOfUser emojiReactionBaseAllOfUser = new OASEmojiReactionBaseAllOfUser();
        Map<String, String> x-property-mappings = emojiReactionBaseAllOfUser.getx-property-mappings();
        System.assertEquals('fullName', x-property-mappings.get('full_name'));
        System.assertEquals('isMirrorDummy', x-property-mappings.get('is_mirror_dummy'));
    }
}
