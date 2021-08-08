@isTest
private class OASEmojiReactionBaseUserTest {
    @isTest
    private static void equalsSameInstance() {
        OASEmojiReactionBaseUser emojiReactionBaseUser1 = OASEmojiReactionBaseUser.getExample();
        OASEmojiReactionBaseUser emojiReactionBaseUser2 = emojiReactionBaseUser1;
        OASEmojiReactionBaseUser emojiReactionBaseUser3 = new OASEmojiReactionBaseUser();
        OASEmojiReactionBaseUser emojiReactionBaseUser4 = emojiReactionBaseUser3;

        System.assert(emojiReactionBaseUser1.equals(emojiReactionBaseUser2));
        System.assert(emojiReactionBaseUser2.equals(emojiReactionBaseUser1));
        System.assert(emojiReactionBaseUser1.equals(emojiReactionBaseUser1));
        System.assert(emojiReactionBaseUser3.equals(emojiReactionBaseUser4));
        System.assert(emojiReactionBaseUser4.equals(emojiReactionBaseUser3));
        System.assert(emojiReactionBaseUser3.equals(emojiReactionBaseUser3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEmojiReactionBaseUser emojiReactionBaseUser1 = OASEmojiReactionBaseUser.getExample();
        OASEmojiReactionBaseUser emojiReactionBaseUser2 = OASEmojiReactionBaseUser.getExample();
        OASEmojiReactionBaseUser emojiReactionBaseUser3 = new OASEmojiReactionBaseUser();
        OASEmojiReactionBaseUser emojiReactionBaseUser4 = new OASEmojiReactionBaseUser();

        System.assert(emojiReactionBaseUser1.equals(emojiReactionBaseUser2));
        System.assert(emojiReactionBaseUser2.equals(emojiReactionBaseUser1));
        System.assert(emojiReactionBaseUser3.equals(emojiReactionBaseUser4));
        System.assert(emojiReactionBaseUser4.equals(emojiReactionBaseUser3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEmojiReactionBaseUser emojiReactionBaseUser1 = OASEmojiReactionBaseUser.getExample();
        OASEmojiReactionBaseUser emojiReactionBaseUser2 = new OASEmojiReactionBaseUser();

        System.assertEquals(false, emojiReactionBaseUser1.equals('foo'));
        System.assertEquals(false, emojiReactionBaseUser2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEmojiReactionBaseUser emojiReactionBaseUser1 = OASEmojiReactionBaseUser.getExample();
        OASEmojiReactionBaseUser emojiReactionBaseUser2 = new OASEmojiReactionBaseUser();
        OASEmojiReactionBaseUser emojiReactionBaseUser3;

        System.assertEquals(false, emojiReactionBaseUser1.equals(emojiReactionBaseUser3));
        System.assertEquals(false, emojiReactionBaseUser2.equals(emojiReactionBaseUser3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEmojiReactionBaseUser emojiReactionBaseUser1 = OASEmojiReactionBaseUser.getExample();
        OASEmojiReactionBaseUser emojiReactionBaseUser2 = new OASEmojiReactionBaseUser();

        System.assertEquals(emojiReactionBaseUser1.hashCode(), emojiReactionBaseUser1.hashCode());
        System.assertEquals(emojiReactionBaseUser2.hashCode(), emojiReactionBaseUser2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEmojiReactionBaseUser emojiReactionBaseUser1 = OASEmojiReactionBaseUser.getExample();
        OASEmojiReactionBaseUser emojiReactionBaseUser2 = OASEmojiReactionBaseUser.getExample();
        OASEmojiReactionBaseUser emojiReactionBaseUser3 = new OASEmojiReactionBaseUser();
        OASEmojiReactionBaseUser emojiReactionBaseUser4 = new OASEmojiReactionBaseUser();

        System.assert(emojiReactionBaseUser1.equals(emojiReactionBaseUser2));
        System.assert(emojiReactionBaseUser3.equals(emojiReactionBaseUser4));
        System.assertEquals(emojiReactionBaseUser1.hashCode(), emojiReactionBaseUser2.hashCode());
        System.assertEquals(emojiReactionBaseUser3.hashCode(), emojiReactionBaseUser4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEmojiReactionBaseUser emojiReactionBaseUser = new OASEmojiReactionBaseUser();
        Map<String, String> x-property-mappings = emojiReactionBaseUser.getx-property-mappings();
        System.assertEquals('fullName', x-property-mappings.get('full_name'));
        System.assertEquals('isMirrorDummy', x-property-mappings.get('is_mirror_dummy'));
    }
}
