@isTest
private class OASBadEventQueueIdErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASBadEventQueueIdError badEventQueueIdError1 = OASBadEventQueueIdError.getExample();
        OASBadEventQueueIdError badEventQueueIdError2 = badEventQueueIdError1;
        OASBadEventQueueIdError badEventQueueIdError3 = new OASBadEventQueueIdError();
        OASBadEventQueueIdError badEventQueueIdError4 = badEventQueueIdError3;

        System.assert(badEventQueueIdError1.equals(badEventQueueIdError2));
        System.assert(badEventQueueIdError2.equals(badEventQueueIdError1));
        System.assert(badEventQueueIdError1.equals(badEventQueueIdError1));
        System.assert(badEventQueueIdError3.equals(badEventQueueIdError4));
        System.assert(badEventQueueIdError4.equals(badEventQueueIdError3));
        System.assert(badEventQueueIdError3.equals(badEventQueueIdError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBadEventQueueIdError badEventQueueIdError1 = OASBadEventQueueIdError.getExample();
        OASBadEventQueueIdError badEventQueueIdError2 = OASBadEventQueueIdError.getExample();
        OASBadEventQueueIdError badEventQueueIdError3 = new OASBadEventQueueIdError();
        OASBadEventQueueIdError badEventQueueIdError4 = new OASBadEventQueueIdError();

        System.assert(badEventQueueIdError1.equals(badEventQueueIdError2));
        System.assert(badEventQueueIdError2.equals(badEventQueueIdError1));
        System.assert(badEventQueueIdError3.equals(badEventQueueIdError4));
        System.assert(badEventQueueIdError4.equals(badEventQueueIdError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBadEventQueueIdError badEventQueueIdError1 = OASBadEventQueueIdError.getExample();
        OASBadEventQueueIdError badEventQueueIdError2 = new OASBadEventQueueIdError();

        System.assertEquals(false, badEventQueueIdError1.equals('foo'));
        System.assertEquals(false, badEventQueueIdError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBadEventQueueIdError badEventQueueIdError1 = OASBadEventQueueIdError.getExample();
        OASBadEventQueueIdError badEventQueueIdError2 = new OASBadEventQueueIdError();
        OASBadEventQueueIdError badEventQueueIdError3;

        System.assertEquals(false, badEventQueueIdError1.equals(badEventQueueIdError3));
        System.assertEquals(false, badEventQueueIdError2.equals(badEventQueueIdError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBadEventQueueIdError badEventQueueIdError1 = OASBadEventQueueIdError.getExample();
        OASBadEventQueueIdError badEventQueueIdError2 = new OASBadEventQueueIdError();

        System.assertEquals(badEventQueueIdError1.hashCode(), badEventQueueIdError1.hashCode());
        System.assertEquals(badEventQueueIdError2.hashCode(), badEventQueueIdError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBadEventQueueIdError badEventQueueIdError1 = OASBadEventQueueIdError.getExample();
        OASBadEventQueueIdError badEventQueueIdError2 = OASBadEventQueueIdError.getExample();
        OASBadEventQueueIdError badEventQueueIdError3 = new OASBadEventQueueIdError();
        OASBadEventQueueIdError badEventQueueIdError4 = new OASBadEventQueueIdError();

        System.assert(badEventQueueIdError1.equals(badEventQueueIdError2));
        System.assert(badEventQueueIdError3.equals(badEventQueueIdError4));
        System.assertEquals(badEventQueueIdError1.hashCode(), badEventQueueIdError2.hashCode());
        System.assertEquals(badEventQueueIdError3.hashCode(), badEventQueueIdError4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBadEventQueueIdError badEventQueueIdError = new OASBadEventQueueIdError();
        Map<String, String> x-property-mappings = badEventQueueIdError.getx-property-mappings();
        System.assertEquals('queueId', x-property-mappings.get('queue_id'));
    }
}
