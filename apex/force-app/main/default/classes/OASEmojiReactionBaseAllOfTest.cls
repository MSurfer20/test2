@isTest
private class OASEmojiReactionBaseAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASEmojiReactionBaseAllOf emojiReactionBaseAllOf1 = OASEmojiReactionBaseAllOf.getExample();
        OASEmojiReactionBaseAllOf emojiReactionBaseAllOf2 = emojiReactionBaseAllOf1;
        OASEmojiReactionBaseAllOf emojiReactionBaseAllOf3 = new OASEmojiReactionBaseAllOf();
        OASEmojiReactionBaseAllOf emojiReactionBaseAllOf4 = emojiReactionBaseAllOf3;

        System.assert(emojiReactionBaseAllOf1.equals(emojiReactionBaseAllOf2));
        System.assert(emojiReactionBaseAllOf2.equals(emojiReactionBaseAllOf1));
        System.assert(emojiReactionBaseAllOf1.equals(emojiReactionBaseAllOf1));
        System.assert(emojiReactionBaseAllOf3.equals(emojiReactionBaseAllOf4));
        System.assert(emojiReactionBaseAllOf4.equals(emojiReactionBaseAllOf3));
        System.assert(emojiReactionBaseAllOf3.equals(emojiReactionBaseAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEmojiReactionBaseAllOf emojiReactionBaseAllOf1 = OASEmojiReactionBaseAllOf.getExample();
        OASEmojiReactionBaseAllOf emojiReactionBaseAllOf2 = OASEmojiReactionBaseAllOf.getExample();
        OASEmojiReactionBaseAllOf emojiReactionBaseAllOf3 = new OASEmojiReactionBaseAllOf();
        OASEmojiReactionBaseAllOf emojiReactionBaseAllOf4 = new OASEmojiReactionBaseAllOf();

        System.assert(emojiReactionBaseAllOf1.equals(emojiReactionBaseAllOf2));
        System.assert(emojiReactionBaseAllOf2.equals(emojiReactionBaseAllOf1));
        System.assert(emojiReactionBaseAllOf3.equals(emojiReactionBaseAllOf4));
        System.assert(emojiReactionBaseAllOf4.equals(emojiReactionBaseAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEmojiReactionBaseAllOf emojiReactionBaseAllOf1 = OASEmojiReactionBaseAllOf.getExample();
        OASEmojiReactionBaseAllOf emojiReactionBaseAllOf2 = new OASEmojiReactionBaseAllOf();

        System.assertEquals(false, emojiReactionBaseAllOf1.equals('foo'));
        System.assertEquals(false, emojiReactionBaseAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEmojiReactionBaseAllOf emojiReactionBaseAllOf1 = OASEmojiReactionBaseAllOf.getExample();
        OASEmojiReactionBaseAllOf emojiReactionBaseAllOf2 = new OASEmojiReactionBaseAllOf();
        OASEmojiReactionBaseAllOf emojiReactionBaseAllOf3;

        System.assertEquals(false, emojiReactionBaseAllOf1.equals(emojiReactionBaseAllOf3));
        System.assertEquals(false, emojiReactionBaseAllOf2.equals(emojiReactionBaseAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEmojiReactionBaseAllOf emojiReactionBaseAllOf1 = OASEmojiReactionBaseAllOf.getExample();
        OASEmojiReactionBaseAllOf emojiReactionBaseAllOf2 = new OASEmojiReactionBaseAllOf();

        System.assertEquals(emojiReactionBaseAllOf1.hashCode(), emojiReactionBaseAllOf1.hashCode());
        System.assertEquals(emojiReactionBaseAllOf2.hashCode(), emojiReactionBaseAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEmojiReactionBaseAllOf emojiReactionBaseAllOf1 = OASEmojiReactionBaseAllOf.getExample();
        OASEmojiReactionBaseAllOf emojiReactionBaseAllOf2 = OASEmojiReactionBaseAllOf.getExample();
        OASEmojiReactionBaseAllOf emojiReactionBaseAllOf3 = new OASEmojiReactionBaseAllOf();
        OASEmojiReactionBaseAllOf emojiReactionBaseAllOf4 = new OASEmojiReactionBaseAllOf();

        System.assert(emojiReactionBaseAllOf1.equals(emojiReactionBaseAllOf2));
        System.assert(emojiReactionBaseAllOf3.equals(emojiReactionBaseAllOf4));
        System.assertEquals(emojiReactionBaseAllOf1.hashCode(), emojiReactionBaseAllOf2.hashCode());
        System.assertEquals(emojiReactionBaseAllOf3.hashCode(), emojiReactionBaseAllOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEmojiReactionBaseAllOf emojiReactionBaseAllOf = new OASEmojiReactionBaseAllOf();
        Map<String, String> x-property-mappings = emojiReactionBaseAllOf.getx-property-mappings();
        System.assertEquals('userId', x-property-mappings.get('user_id'));
    }
}
