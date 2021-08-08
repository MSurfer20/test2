@isTest
private class OASEmojiReactionBaseTest {
    @isTest
    private static void equalsSameInstance() {
        OASEmojiReactionBase emojiReactionBase1 = OASEmojiReactionBase.getExample();
        OASEmojiReactionBase emojiReactionBase2 = emojiReactionBase1;
        OASEmojiReactionBase emojiReactionBase3 = new OASEmojiReactionBase();
        OASEmojiReactionBase emojiReactionBase4 = emojiReactionBase3;

        System.assert(emojiReactionBase1.equals(emojiReactionBase2));
        System.assert(emojiReactionBase2.equals(emojiReactionBase1));
        System.assert(emojiReactionBase1.equals(emojiReactionBase1));
        System.assert(emojiReactionBase3.equals(emojiReactionBase4));
        System.assert(emojiReactionBase4.equals(emojiReactionBase3));
        System.assert(emojiReactionBase3.equals(emojiReactionBase3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEmojiReactionBase emojiReactionBase1 = OASEmojiReactionBase.getExample();
        OASEmojiReactionBase emojiReactionBase2 = OASEmojiReactionBase.getExample();
        OASEmojiReactionBase emojiReactionBase3 = new OASEmojiReactionBase();
        OASEmojiReactionBase emojiReactionBase4 = new OASEmojiReactionBase();

        System.assert(emojiReactionBase1.equals(emojiReactionBase2));
        System.assert(emojiReactionBase2.equals(emojiReactionBase1));
        System.assert(emojiReactionBase3.equals(emojiReactionBase4));
        System.assert(emojiReactionBase4.equals(emojiReactionBase3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEmojiReactionBase emojiReactionBase1 = OASEmojiReactionBase.getExample();
        OASEmojiReactionBase emojiReactionBase2 = new OASEmojiReactionBase();

        System.assertEquals(false, emojiReactionBase1.equals('foo'));
        System.assertEquals(false, emojiReactionBase2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEmojiReactionBase emojiReactionBase1 = OASEmojiReactionBase.getExample();
        OASEmojiReactionBase emojiReactionBase2 = new OASEmojiReactionBase();
        OASEmojiReactionBase emojiReactionBase3;

        System.assertEquals(false, emojiReactionBase1.equals(emojiReactionBase3));
        System.assertEquals(false, emojiReactionBase2.equals(emojiReactionBase3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEmojiReactionBase emojiReactionBase1 = OASEmojiReactionBase.getExample();
        OASEmojiReactionBase emojiReactionBase2 = new OASEmojiReactionBase();

        System.assertEquals(emojiReactionBase1.hashCode(), emojiReactionBase1.hashCode());
        System.assertEquals(emojiReactionBase2.hashCode(), emojiReactionBase2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEmojiReactionBase emojiReactionBase1 = OASEmojiReactionBase.getExample();
        OASEmojiReactionBase emojiReactionBase2 = OASEmojiReactionBase.getExample();
        OASEmojiReactionBase emojiReactionBase3 = new OASEmojiReactionBase();
        OASEmojiReactionBase emojiReactionBase4 = new OASEmojiReactionBase();

        System.assert(emojiReactionBase1.equals(emojiReactionBase2));
        System.assert(emojiReactionBase3.equals(emojiReactionBase4));
        System.assertEquals(emojiReactionBase1.hashCode(), emojiReactionBase2.hashCode());
        System.assertEquals(emojiReactionBase3.hashCode(), emojiReactionBase4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEmojiReactionBase emojiReactionBase = new OASEmojiReactionBase();
        Map<String, String> x-property-mappings = emojiReactionBase.getx-property-mappings();
        System.assertEquals('emojiCode', x-property-mappings.get('emoji_code'));
        System.assertEquals('emojiName', x-property-mappings.get('emoji_name'));
        System.assertEquals('reactionType', x-property-mappings.get('reaction_type'));
        System.assertEquals('userId', x-property-mappings.get('user_id'));
    }
}
