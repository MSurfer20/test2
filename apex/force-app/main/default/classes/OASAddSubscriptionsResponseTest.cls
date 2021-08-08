@isTest
private class OASAddSubscriptionsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAddSubscriptionsResponse addSubscriptionsResponse1 = OASAddSubscriptionsResponse.getExample();
        OASAddSubscriptionsResponse addSubscriptionsResponse2 = addSubscriptionsResponse1;
        OASAddSubscriptionsResponse addSubscriptionsResponse3 = new OASAddSubscriptionsResponse();
        OASAddSubscriptionsResponse addSubscriptionsResponse4 = addSubscriptionsResponse3;

        System.assert(addSubscriptionsResponse1.equals(addSubscriptionsResponse2));
        System.assert(addSubscriptionsResponse2.equals(addSubscriptionsResponse1));
        System.assert(addSubscriptionsResponse1.equals(addSubscriptionsResponse1));
        System.assert(addSubscriptionsResponse3.equals(addSubscriptionsResponse4));
        System.assert(addSubscriptionsResponse4.equals(addSubscriptionsResponse3));
        System.assert(addSubscriptionsResponse3.equals(addSubscriptionsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAddSubscriptionsResponse addSubscriptionsResponse1 = OASAddSubscriptionsResponse.getExample();
        OASAddSubscriptionsResponse addSubscriptionsResponse2 = OASAddSubscriptionsResponse.getExample();
        OASAddSubscriptionsResponse addSubscriptionsResponse3 = new OASAddSubscriptionsResponse();
        OASAddSubscriptionsResponse addSubscriptionsResponse4 = new OASAddSubscriptionsResponse();

        System.assert(addSubscriptionsResponse1.equals(addSubscriptionsResponse2));
        System.assert(addSubscriptionsResponse2.equals(addSubscriptionsResponse1));
        System.assert(addSubscriptionsResponse3.equals(addSubscriptionsResponse4));
        System.assert(addSubscriptionsResponse4.equals(addSubscriptionsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAddSubscriptionsResponse addSubscriptionsResponse1 = OASAddSubscriptionsResponse.getExample();
        OASAddSubscriptionsResponse addSubscriptionsResponse2 = new OASAddSubscriptionsResponse();

        System.assertEquals(false, addSubscriptionsResponse1.equals('foo'));
        System.assertEquals(false, addSubscriptionsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAddSubscriptionsResponse addSubscriptionsResponse1 = OASAddSubscriptionsResponse.getExample();
        OASAddSubscriptionsResponse addSubscriptionsResponse2 = new OASAddSubscriptionsResponse();
        OASAddSubscriptionsResponse addSubscriptionsResponse3;

        System.assertEquals(false, addSubscriptionsResponse1.equals(addSubscriptionsResponse3));
        System.assertEquals(false, addSubscriptionsResponse2.equals(addSubscriptionsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAddSubscriptionsResponse addSubscriptionsResponse1 = OASAddSubscriptionsResponse.getExample();
        OASAddSubscriptionsResponse addSubscriptionsResponse2 = new OASAddSubscriptionsResponse();

        System.assertEquals(addSubscriptionsResponse1.hashCode(), addSubscriptionsResponse1.hashCode());
        System.assertEquals(addSubscriptionsResponse2.hashCode(), addSubscriptionsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAddSubscriptionsResponse addSubscriptionsResponse1 = OASAddSubscriptionsResponse.getExample();
        OASAddSubscriptionsResponse addSubscriptionsResponse2 = OASAddSubscriptionsResponse.getExample();
        OASAddSubscriptionsResponse addSubscriptionsResponse3 = new OASAddSubscriptionsResponse();
        OASAddSubscriptionsResponse addSubscriptionsResponse4 = new OASAddSubscriptionsResponse();

        System.assert(addSubscriptionsResponse1.equals(addSubscriptionsResponse2));
        System.assert(addSubscriptionsResponse3.equals(addSubscriptionsResponse4));
        System.assertEquals(addSubscriptionsResponse1.hashCode(), addSubscriptionsResponse2.hashCode());
        System.assertEquals(addSubscriptionsResponse3.hashCode(), addSubscriptionsResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAddSubscriptionsResponse addSubscriptionsResponse = new OASAddSubscriptionsResponse();
        Map<String, String> x-property-mappings = addSubscriptionsResponse.getx-property-mappings();
        System.assertEquals('alreadySubscribed', x-property-mappings.get('already_subscribed'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAddSubscriptionsResponse addSubscriptionsResponse = new OASAddSubscriptionsResponse();
        System.assertEquals(new Map<String, List<String>>(), addSubscriptionsResponse.subscribed);
        System.assertEquals(new Map<String, List<String>>(), addSubscriptionsResponse.alreadySubscribed);
        System.assertEquals(new List<String>(), addSubscriptionsResponse.unauthorized);
        System.assertEquals(null, addSubscriptionsResponse.result);
        System.assertEquals(null, addSubscriptionsResponse.msg);
    }
}
