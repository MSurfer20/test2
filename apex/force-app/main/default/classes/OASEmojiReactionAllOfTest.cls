@isTest
private class OASEmojiReactionAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASEmojiReactionAllOf emojiReactionAllOf1 = OASEmojiReactionAllOf.getExample();
        OASEmojiReactionAllOf emojiReactionAllOf2 = emojiReactionAllOf1;
        OASEmojiReactionAllOf emojiReactionAllOf3 = new OASEmojiReactionAllOf();
        OASEmojiReactionAllOf emojiReactionAllOf4 = emojiReactionAllOf3;

        System.assert(emojiReactionAllOf1.equals(emojiReactionAllOf2));
        System.assert(emojiReactionAllOf2.equals(emojiReactionAllOf1));
        System.assert(emojiReactionAllOf1.equals(emojiReactionAllOf1));
        System.assert(emojiReactionAllOf3.equals(emojiReactionAllOf4));
        System.assert(emojiReactionAllOf4.equals(emojiReactionAllOf3));
        System.assert(emojiReactionAllOf3.equals(emojiReactionAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEmojiReactionAllOf emojiReactionAllOf1 = OASEmojiReactionAllOf.getExample();
        OASEmojiReactionAllOf emojiReactionAllOf2 = OASEmojiReactionAllOf.getExample();
        OASEmojiReactionAllOf emojiReactionAllOf3 = new OASEmojiReactionAllOf();
        OASEmojiReactionAllOf emojiReactionAllOf4 = new OASEmojiReactionAllOf();

        System.assert(emojiReactionAllOf1.equals(emojiReactionAllOf2));
        System.assert(emojiReactionAllOf2.equals(emojiReactionAllOf1));
        System.assert(emojiReactionAllOf3.equals(emojiReactionAllOf4));
        System.assert(emojiReactionAllOf4.equals(emojiReactionAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEmojiReactionAllOf emojiReactionAllOf1 = OASEmojiReactionAllOf.getExample();
        OASEmojiReactionAllOf emojiReactionAllOf2 = new OASEmojiReactionAllOf();

        System.assertEquals(false, emojiReactionAllOf1.equals('foo'));
        System.assertEquals(false, emojiReactionAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEmojiReactionAllOf emojiReactionAllOf1 = OASEmojiReactionAllOf.getExample();
        OASEmojiReactionAllOf emojiReactionAllOf2 = new OASEmojiReactionAllOf();
        OASEmojiReactionAllOf emojiReactionAllOf3;

        System.assertEquals(false, emojiReactionAllOf1.equals(emojiReactionAllOf3));
        System.assertEquals(false, emojiReactionAllOf2.equals(emojiReactionAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEmojiReactionAllOf emojiReactionAllOf1 = OASEmojiReactionAllOf.getExample();
        OASEmojiReactionAllOf emojiReactionAllOf2 = new OASEmojiReactionAllOf();

        System.assertEquals(emojiReactionAllOf1.hashCode(), emojiReactionAllOf1.hashCode());
        System.assertEquals(emojiReactionAllOf2.hashCode(), emojiReactionAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEmojiReactionAllOf emojiReactionAllOf1 = OASEmojiReactionAllOf.getExample();
        OASEmojiReactionAllOf emojiReactionAllOf2 = OASEmojiReactionAllOf.getExample();
        OASEmojiReactionAllOf emojiReactionAllOf3 = new OASEmojiReactionAllOf();
        OASEmojiReactionAllOf emojiReactionAllOf4 = new OASEmojiReactionAllOf();

        System.assert(emojiReactionAllOf1.equals(emojiReactionAllOf2));
        System.assert(emojiReactionAllOf3.equals(emojiReactionAllOf4));
        System.assertEquals(emojiReactionAllOf1.hashCode(), emojiReactionAllOf2.hashCode());
        System.assertEquals(emojiReactionAllOf3.hashCode(), emojiReactionAllOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEmojiReactionAllOf emojiReactionAllOf = new OASEmojiReactionAllOf();
        Map<String, String> x-property-mappings = emojiReactionAllOf.getx-property-mappings();
        System.assertEquals('emojiCode', x-property-mappings.get('emoji_code'));
        System.assertEquals('emojiName', x-property-mappings.get('emoji_name'));
        System.assertEquals('reactionType', x-property-mappings.get('reaction_type'));
        System.assertEquals('userId', x-property-mappings.get('user_id'));
    }
}
