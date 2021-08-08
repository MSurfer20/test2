@isTest
private class OASRealmEmojiTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealmEmoji realmEmoji1 = OASRealmEmoji.getExample();
        OASRealmEmoji realmEmoji2 = realmEmoji1;
        OASRealmEmoji realmEmoji3 = new OASRealmEmoji();
        OASRealmEmoji realmEmoji4 = realmEmoji3;

        System.assert(realmEmoji1.equals(realmEmoji2));
        System.assert(realmEmoji2.equals(realmEmoji1));
        System.assert(realmEmoji1.equals(realmEmoji1));
        System.assert(realmEmoji3.equals(realmEmoji4));
        System.assert(realmEmoji4.equals(realmEmoji3));
        System.assert(realmEmoji3.equals(realmEmoji3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealmEmoji realmEmoji1 = OASRealmEmoji.getExample();
        OASRealmEmoji realmEmoji2 = OASRealmEmoji.getExample();
        OASRealmEmoji realmEmoji3 = new OASRealmEmoji();
        OASRealmEmoji realmEmoji4 = new OASRealmEmoji();

        System.assert(realmEmoji1.equals(realmEmoji2));
        System.assert(realmEmoji2.equals(realmEmoji1));
        System.assert(realmEmoji3.equals(realmEmoji4));
        System.assert(realmEmoji4.equals(realmEmoji3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealmEmoji realmEmoji1 = OASRealmEmoji.getExample();
        OASRealmEmoji realmEmoji2 = new OASRealmEmoji();

        System.assertEquals(false, realmEmoji1.equals('foo'));
        System.assertEquals(false, realmEmoji2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealmEmoji realmEmoji1 = OASRealmEmoji.getExample();
        OASRealmEmoji realmEmoji2 = new OASRealmEmoji();
        OASRealmEmoji realmEmoji3;

        System.assertEquals(false, realmEmoji1.equals(realmEmoji3));
        System.assertEquals(false, realmEmoji2.equals(realmEmoji3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealmEmoji realmEmoji1 = OASRealmEmoji.getExample();
        OASRealmEmoji realmEmoji2 = new OASRealmEmoji();

        System.assertEquals(realmEmoji1.hashCode(), realmEmoji1.hashCode());
        System.assertEquals(realmEmoji2.hashCode(), realmEmoji2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealmEmoji realmEmoji1 = OASRealmEmoji.getExample();
        OASRealmEmoji realmEmoji2 = OASRealmEmoji.getExample();
        OASRealmEmoji realmEmoji3 = new OASRealmEmoji();
        OASRealmEmoji realmEmoji4 = new OASRealmEmoji();

        System.assert(realmEmoji1.equals(realmEmoji2));
        System.assert(realmEmoji3.equals(realmEmoji4));
        System.assertEquals(realmEmoji1.hashCode(), realmEmoji2.hashCode());
        System.assertEquals(realmEmoji3.hashCode(), realmEmoji4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealmEmoji realmEmoji = new OASRealmEmoji();
        Map<String, String> x-property-mappings = realmEmoji.getx-property-mappings();
        System.assertEquals('sourceUrl', x-property-mappings.get('source_url'));
        System.assertEquals('authorId', x-property-mappings.get('author_id'));
    }
}
