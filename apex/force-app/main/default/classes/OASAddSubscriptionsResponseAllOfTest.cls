@isTest
private class OASAddSubscriptionsResponseAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASAddSubscriptionsResponseAllOf addSubscriptionsResponseAllOf1 = OASAddSubscriptionsResponseAllOf.getExample();
        OASAddSubscriptionsResponseAllOf addSubscriptionsResponseAllOf2 = addSubscriptionsResponseAllOf1;
        OASAddSubscriptionsResponseAllOf addSubscriptionsResponseAllOf3 = new OASAddSubscriptionsResponseAllOf();
        OASAddSubscriptionsResponseAllOf addSubscriptionsResponseAllOf4 = addSubscriptionsResponseAllOf3;

        System.assert(addSubscriptionsResponseAllOf1.equals(addSubscriptionsResponseAllOf2));
        System.assert(addSubscriptionsResponseAllOf2.equals(addSubscriptionsResponseAllOf1));
        System.assert(addSubscriptionsResponseAllOf1.equals(addSubscriptionsResponseAllOf1));
        System.assert(addSubscriptionsResponseAllOf3.equals(addSubscriptionsResponseAllOf4));
        System.assert(addSubscriptionsResponseAllOf4.equals(addSubscriptionsResponseAllOf3));
        System.assert(addSubscriptionsResponseAllOf3.equals(addSubscriptionsResponseAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAddSubscriptionsResponseAllOf addSubscriptionsResponseAllOf1 = OASAddSubscriptionsResponseAllOf.getExample();
        OASAddSubscriptionsResponseAllOf addSubscriptionsResponseAllOf2 = OASAddSubscriptionsResponseAllOf.getExample();
        OASAddSubscriptionsResponseAllOf addSubscriptionsResponseAllOf3 = new OASAddSubscriptionsResponseAllOf();
        OASAddSubscriptionsResponseAllOf addSubscriptionsResponseAllOf4 = new OASAddSubscriptionsResponseAllOf();

        System.assert(addSubscriptionsResponseAllOf1.equals(addSubscriptionsResponseAllOf2));
        System.assert(addSubscriptionsResponseAllOf2.equals(addSubscriptionsResponseAllOf1));
        System.assert(addSubscriptionsResponseAllOf3.equals(addSubscriptionsResponseAllOf4));
        System.assert(addSubscriptionsResponseAllOf4.equals(addSubscriptionsResponseAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAddSubscriptionsResponseAllOf addSubscriptionsResponseAllOf1 = OASAddSubscriptionsResponseAllOf.getExample();
        OASAddSubscriptionsResponseAllOf addSubscriptionsResponseAllOf2 = new OASAddSubscriptionsResponseAllOf();

        System.assertEquals(false, addSubscriptionsResponseAllOf1.equals('foo'));
        System.assertEquals(false, addSubscriptionsResponseAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAddSubscriptionsResponseAllOf addSubscriptionsResponseAllOf1 = OASAddSubscriptionsResponseAllOf.getExample();
        OASAddSubscriptionsResponseAllOf addSubscriptionsResponseAllOf2 = new OASAddSubscriptionsResponseAllOf();
        OASAddSubscriptionsResponseAllOf addSubscriptionsResponseAllOf3;

        System.assertEquals(false, addSubscriptionsResponseAllOf1.equals(addSubscriptionsResponseAllOf3));
        System.assertEquals(false, addSubscriptionsResponseAllOf2.equals(addSubscriptionsResponseAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAddSubscriptionsResponseAllOf addSubscriptionsResponseAllOf1 = OASAddSubscriptionsResponseAllOf.getExample();
        OASAddSubscriptionsResponseAllOf addSubscriptionsResponseAllOf2 = new OASAddSubscriptionsResponseAllOf();

        System.assertEquals(addSubscriptionsResponseAllOf1.hashCode(), addSubscriptionsResponseAllOf1.hashCode());
        System.assertEquals(addSubscriptionsResponseAllOf2.hashCode(), addSubscriptionsResponseAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAddSubscriptionsResponseAllOf addSubscriptionsResponseAllOf1 = OASAddSubscriptionsResponseAllOf.getExample();
        OASAddSubscriptionsResponseAllOf addSubscriptionsResponseAllOf2 = OASAddSubscriptionsResponseAllOf.getExample();
        OASAddSubscriptionsResponseAllOf addSubscriptionsResponseAllOf3 = new OASAddSubscriptionsResponseAllOf();
        OASAddSubscriptionsResponseAllOf addSubscriptionsResponseAllOf4 = new OASAddSubscriptionsResponseAllOf();

        System.assert(addSubscriptionsResponseAllOf1.equals(addSubscriptionsResponseAllOf2));
        System.assert(addSubscriptionsResponseAllOf3.equals(addSubscriptionsResponseAllOf4));
        System.assertEquals(addSubscriptionsResponseAllOf1.hashCode(), addSubscriptionsResponseAllOf2.hashCode());
        System.assertEquals(addSubscriptionsResponseAllOf3.hashCode(), addSubscriptionsResponseAllOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAddSubscriptionsResponseAllOf addSubscriptionsResponseAllOf = new OASAddSubscriptionsResponseAllOf();
        Map<String, String> x-property-mappings = addSubscriptionsResponseAllOf.getx-property-mappings();
        System.assertEquals('alreadySubscribed', x-property-mappings.get('already_subscribed'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAddSubscriptionsResponseAllOf addSubscriptionsResponseAllOf = new OASAddSubscriptionsResponseAllOf();
        System.assertEquals(new Map<String, List<String>>(), addSubscriptionsResponseAllOf.subscribed);
        System.assertEquals(new Map<String, List<String>>(), addSubscriptionsResponseAllOf.alreadySubscribed);
        System.assertEquals(new List<String>(), addSubscriptionsResponseAllOf.unauthorized);
        System.assertEquals(null, addSubscriptionsResponseAllOf.result);
        System.assertEquals(null, addSubscriptionsResponseAllOf.msg);
    }
}
