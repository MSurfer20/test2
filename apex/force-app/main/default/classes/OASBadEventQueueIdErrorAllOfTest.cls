@isTest
private class OASBadEventQueueIdErrorAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASBadEventQueueIdErrorAllOf badEventQueueIdErrorAllOf1 = OASBadEventQueueIdErrorAllOf.getExample();
        OASBadEventQueueIdErrorAllOf badEventQueueIdErrorAllOf2 = badEventQueueIdErrorAllOf1;
        OASBadEventQueueIdErrorAllOf badEventQueueIdErrorAllOf3 = new OASBadEventQueueIdErrorAllOf();
        OASBadEventQueueIdErrorAllOf badEventQueueIdErrorAllOf4 = badEventQueueIdErrorAllOf3;

        System.assert(badEventQueueIdErrorAllOf1.equals(badEventQueueIdErrorAllOf2));
        System.assert(badEventQueueIdErrorAllOf2.equals(badEventQueueIdErrorAllOf1));
        System.assert(badEventQueueIdErrorAllOf1.equals(badEventQueueIdErrorAllOf1));
        System.assert(badEventQueueIdErrorAllOf3.equals(badEventQueueIdErrorAllOf4));
        System.assert(badEventQueueIdErrorAllOf4.equals(badEventQueueIdErrorAllOf3));
        System.assert(badEventQueueIdErrorAllOf3.equals(badEventQueueIdErrorAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBadEventQueueIdErrorAllOf badEventQueueIdErrorAllOf1 = OASBadEventQueueIdErrorAllOf.getExample();
        OASBadEventQueueIdErrorAllOf badEventQueueIdErrorAllOf2 = OASBadEventQueueIdErrorAllOf.getExample();
        OASBadEventQueueIdErrorAllOf badEventQueueIdErrorAllOf3 = new OASBadEventQueueIdErrorAllOf();
        OASBadEventQueueIdErrorAllOf badEventQueueIdErrorAllOf4 = new OASBadEventQueueIdErrorAllOf();

        System.assert(badEventQueueIdErrorAllOf1.equals(badEventQueueIdErrorAllOf2));
        System.assert(badEventQueueIdErrorAllOf2.equals(badEventQueueIdErrorAllOf1));
        System.assert(badEventQueueIdErrorAllOf3.equals(badEventQueueIdErrorAllOf4));
        System.assert(badEventQueueIdErrorAllOf4.equals(badEventQueueIdErrorAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBadEventQueueIdErrorAllOf badEventQueueIdErrorAllOf1 = OASBadEventQueueIdErrorAllOf.getExample();
        OASBadEventQueueIdErrorAllOf badEventQueueIdErrorAllOf2 = new OASBadEventQueueIdErrorAllOf();

        System.assertEquals(false, badEventQueueIdErrorAllOf1.equals('foo'));
        System.assertEquals(false, badEventQueueIdErrorAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBadEventQueueIdErrorAllOf badEventQueueIdErrorAllOf1 = OASBadEventQueueIdErrorAllOf.getExample();
        OASBadEventQueueIdErrorAllOf badEventQueueIdErrorAllOf2 = new OASBadEventQueueIdErrorAllOf();
        OASBadEventQueueIdErrorAllOf badEventQueueIdErrorAllOf3;

        System.assertEquals(false, badEventQueueIdErrorAllOf1.equals(badEventQueueIdErrorAllOf3));
        System.assertEquals(false, badEventQueueIdErrorAllOf2.equals(badEventQueueIdErrorAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBadEventQueueIdErrorAllOf badEventQueueIdErrorAllOf1 = OASBadEventQueueIdErrorAllOf.getExample();
        OASBadEventQueueIdErrorAllOf badEventQueueIdErrorAllOf2 = new OASBadEventQueueIdErrorAllOf();

        System.assertEquals(badEventQueueIdErrorAllOf1.hashCode(), badEventQueueIdErrorAllOf1.hashCode());
        System.assertEquals(badEventQueueIdErrorAllOf2.hashCode(), badEventQueueIdErrorAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBadEventQueueIdErrorAllOf badEventQueueIdErrorAllOf1 = OASBadEventQueueIdErrorAllOf.getExample();
        OASBadEventQueueIdErrorAllOf badEventQueueIdErrorAllOf2 = OASBadEventQueueIdErrorAllOf.getExample();
        OASBadEventQueueIdErrorAllOf badEventQueueIdErrorAllOf3 = new OASBadEventQueueIdErrorAllOf();
        OASBadEventQueueIdErrorAllOf badEventQueueIdErrorAllOf4 = new OASBadEventQueueIdErrorAllOf();

        System.assert(badEventQueueIdErrorAllOf1.equals(badEventQueueIdErrorAllOf2));
        System.assert(badEventQueueIdErrorAllOf3.equals(badEventQueueIdErrorAllOf4));
        System.assertEquals(badEventQueueIdErrorAllOf1.hashCode(), badEventQueueIdErrorAllOf2.hashCode());
        System.assertEquals(badEventQueueIdErrorAllOf3.hashCode(), badEventQueueIdErrorAllOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBadEventQueueIdErrorAllOf badEventQueueIdErrorAllOf = new OASBadEventQueueIdErrorAllOf();
        Map<String, String> x-property-mappings = badEventQueueIdErrorAllOf.getx-property-mappings();
        System.assertEquals('queueId', x-property-mappings.get('queue_id'));
    }
}
