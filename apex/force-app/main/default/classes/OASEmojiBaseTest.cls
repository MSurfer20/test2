@isTest
private class OASEmojiBaseTest {
    @isTest
    private static void equalsSameInstance() {
        OASEmojiBase emojiBase1 = OASEmojiBase.getExample();
        OASEmojiBase emojiBase2 = emojiBase1;
        OASEmojiBase emojiBase3 = new OASEmojiBase();
        OASEmojiBase emojiBase4 = emojiBase3;

        System.assert(emojiBase1.equals(emojiBase2));
        System.assert(emojiBase2.equals(emojiBase1));
        System.assert(emojiBase1.equals(emojiBase1));
        System.assert(emojiBase3.equals(emojiBase4));
        System.assert(emojiBase4.equals(emojiBase3));
        System.assert(emojiBase3.equals(emojiBase3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEmojiBase emojiBase1 = OASEmojiBase.getExample();
        OASEmojiBase emojiBase2 = OASEmojiBase.getExample();
        OASEmojiBase emojiBase3 = new OASEmojiBase();
        OASEmojiBase emojiBase4 = new OASEmojiBase();

        System.assert(emojiBase1.equals(emojiBase2));
        System.assert(emojiBase2.equals(emojiBase1));
        System.assert(emojiBase3.equals(emojiBase4));
        System.assert(emojiBase4.equals(emojiBase3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEmojiBase emojiBase1 = OASEmojiBase.getExample();
        OASEmojiBase emojiBase2 = new OASEmojiBase();

        System.assertEquals(false, emojiBase1.equals('foo'));
        System.assertEquals(false, emojiBase2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEmojiBase emojiBase1 = OASEmojiBase.getExample();
        OASEmojiBase emojiBase2 = new OASEmojiBase();
        OASEmojiBase emojiBase3;

        System.assertEquals(false, emojiBase1.equals(emojiBase3));
        System.assertEquals(false, emojiBase2.equals(emojiBase3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEmojiBase emojiBase1 = OASEmojiBase.getExample();
        OASEmojiBase emojiBase2 = new OASEmojiBase();

        System.assertEquals(emojiBase1.hashCode(), emojiBase1.hashCode());
        System.assertEquals(emojiBase2.hashCode(), emojiBase2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEmojiBase emojiBase1 = OASEmojiBase.getExample();
        OASEmojiBase emojiBase2 = OASEmojiBase.getExample();
        OASEmojiBase emojiBase3 = new OASEmojiBase();
        OASEmojiBase emojiBase4 = new OASEmojiBase();

        System.assert(emojiBase1.equals(emojiBase2));
        System.assert(emojiBase3.equals(emojiBase4));
        System.assertEquals(emojiBase1.hashCode(), emojiBase2.hashCode());
        System.assertEquals(emojiBase3.hashCode(), emojiBase4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEmojiBase emojiBase = new OASEmojiBase();
        Map<String, String> x-property-mappings = emojiBase.getx-property-mappings();
        System.assertEquals('emojiCode', x-property-mappings.get('emoji_code'));
        System.assertEquals('emojiName', x-property-mappings.get('emoji_name'));
        System.assertEquals('reactionType', x-property-mappings.get('reaction_type'));
    }
}
