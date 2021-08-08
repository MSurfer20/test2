@isTest
private class OASRealmPlaygroundTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealmPlayground realmPlayground1 = OASRealmPlayground.getExample();
        OASRealmPlayground realmPlayground2 = realmPlayground1;
        OASRealmPlayground realmPlayground3 = new OASRealmPlayground();
        OASRealmPlayground realmPlayground4 = realmPlayground3;

        System.assert(realmPlayground1.equals(realmPlayground2));
        System.assert(realmPlayground2.equals(realmPlayground1));
        System.assert(realmPlayground1.equals(realmPlayground1));
        System.assert(realmPlayground3.equals(realmPlayground4));
        System.assert(realmPlayground4.equals(realmPlayground3));
        System.assert(realmPlayground3.equals(realmPlayground3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealmPlayground realmPlayground1 = OASRealmPlayground.getExample();
        OASRealmPlayground realmPlayground2 = OASRealmPlayground.getExample();
        OASRealmPlayground realmPlayground3 = new OASRealmPlayground();
        OASRealmPlayground realmPlayground4 = new OASRealmPlayground();

        System.assert(realmPlayground1.equals(realmPlayground2));
        System.assert(realmPlayground2.equals(realmPlayground1));
        System.assert(realmPlayground3.equals(realmPlayground4));
        System.assert(realmPlayground4.equals(realmPlayground3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealmPlayground realmPlayground1 = OASRealmPlayground.getExample();
        OASRealmPlayground realmPlayground2 = new OASRealmPlayground();

        System.assertEquals(false, realmPlayground1.equals('foo'));
        System.assertEquals(false, realmPlayground2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealmPlayground realmPlayground1 = OASRealmPlayground.getExample();
        OASRealmPlayground realmPlayground2 = new OASRealmPlayground();
        OASRealmPlayground realmPlayground3;

        System.assertEquals(false, realmPlayground1.equals(realmPlayground3));
        System.assertEquals(false, realmPlayground2.equals(realmPlayground3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealmPlayground realmPlayground1 = OASRealmPlayground.getExample();
        OASRealmPlayground realmPlayground2 = new OASRealmPlayground();

        System.assertEquals(realmPlayground1.hashCode(), realmPlayground1.hashCode());
        System.assertEquals(realmPlayground2.hashCode(), realmPlayground2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealmPlayground realmPlayground1 = OASRealmPlayground.getExample();
        OASRealmPlayground realmPlayground2 = OASRealmPlayground.getExample();
        OASRealmPlayground realmPlayground3 = new OASRealmPlayground();
        OASRealmPlayground realmPlayground4 = new OASRealmPlayground();

        System.assert(realmPlayground1.equals(realmPlayground2));
        System.assert(realmPlayground3.equals(realmPlayground4));
        System.assertEquals(realmPlayground1.hashCode(), realmPlayground2.hashCode());
        System.assertEquals(realmPlayground3.hashCode(), realmPlayground4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealmPlayground realmPlayground = new OASRealmPlayground();
        Map<String, String> x-property-mappings = realmPlayground.getx-property-mappings();
        System.assertEquals('pygmentsLanguage', x-property-mappings.get('pygments_language'));
        System.assertEquals('urlPrefix', x-property-mappings.get('url_prefix'));
    }
}
