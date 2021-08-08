@isTest
private class OASEmojiReactionTest {
    @isTest
    private static void equalsSameInstance() {
        OASEmojiReaction emojiReaction1 = OASEmojiReaction.getExample();
        OASEmojiReaction emojiReaction2 = emojiReaction1;
        OASEmojiReaction emojiReaction3 = new OASEmojiReaction();
        OASEmojiReaction emojiReaction4 = emojiReaction3;

        System.assert(emojiReaction1.equals(emojiReaction2));
        System.assert(emojiReaction2.equals(emojiReaction1));
        System.assert(emojiReaction1.equals(emojiReaction1));
        System.assert(emojiReaction3.equals(emojiReaction4));
        System.assert(emojiReaction4.equals(emojiReaction3));
        System.assert(emojiReaction3.equals(emojiReaction3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEmojiReaction emojiReaction1 = OASEmojiReaction.getExample();
        OASEmojiReaction emojiReaction2 = OASEmojiReaction.getExample();
        OASEmojiReaction emojiReaction3 = new OASEmojiReaction();
        OASEmojiReaction emojiReaction4 = new OASEmojiReaction();

        System.assert(emojiReaction1.equals(emojiReaction2));
        System.assert(emojiReaction2.equals(emojiReaction1));
        System.assert(emojiReaction3.equals(emojiReaction4));
        System.assert(emojiReaction4.equals(emojiReaction3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEmojiReaction emojiReaction1 = OASEmojiReaction.getExample();
        OASEmojiReaction emojiReaction2 = new OASEmojiReaction();

        System.assertEquals(false, emojiReaction1.equals('foo'));
        System.assertEquals(false, emojiReaction2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEmojiReaction emojiReaction1 = OASEmojiReaction.getExample();
        OASEmojiReaction emojiReaction2 = new OASEmojiReaction();
        OASEmojiReaction emojiReaction3;

        System.assertEquals(false, emojiReaction1.equals(emojiReaction3));
        System.assertEquals(false, emojiReaction2.equals(emojiReaction3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEmojiReaction emojiReaction1 = OASEmojiReaction.getExample();
        OASEmojiReaction emojiReaction2 = new OASEmojiReaction();

        System.assertEquals(emojiReaction1.hashCode(), emojiReaction1.hashCode());
        System.assertEquals(emojiReaction2.hashCode(), emojiReaction2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEmojiReaction emojiReaction1 = OASEmojiReaction.getExample();
        OASEmojiReaction emojiReaction2 = OASEmojiReaction.getExample();
        OASEmojiReaction emojiReaction3 = new OASEmojiReaction();
        OASEmojiReaction emojiReaction4 = new OASEmojiReaction();

        System.assert(emojiReaction1.equals(emojiReaction2));
        System.assert(emojiReaction3.equals(emojiReaction4));
        System.assertEquals(emojiReaction1.hashCode(), emojiReaction2.hashCode());
        System.assertEquals(emojiReaction3.hashCode(), emojiReaction4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEmojiReaction emojiReaction = new OASEmojiReaction();
        Map<String, String> x-property-mappings = emojiReaction.getx-property-mappings();
        System.assertEquals('emojiCode', x-property-mappings.get('emoji_code'));
        System.assertEquals('emojiName', x-property-mappings.get('emoji_name'));
        System.assertEquals('reactionType', x-property-mappings.get('reaction_type'));
        System.assertEquals('userId', x-property-mappings.get('user_id'));
    }
}
