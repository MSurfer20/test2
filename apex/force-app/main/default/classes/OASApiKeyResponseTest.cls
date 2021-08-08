@isTest
private class OASApiKeyResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASApiKeyResponse apiKeyResponse1 = OASApiKeyResponse.getExample();
        OASApiKeyResponse apiKeyResponse2 = apiKeyResponse1;
        OASApiKeyResponse apiKeyResponse3 = new OASApiKeyResponse();
        OASApiKeyResponse apiKeyResponse4 = apiKeyResponse3;

        System.assert(apiKeyResponse1.equals(apiKeyResponse2));
        System.assert(apiKeyResponse2.equals(apiKeyResponse1));
        System.assert(apiKeyResponse1.equals(apiKeyResponse1));
        System.assert(apiKeyResponse3.equals(apiKeyResponse4));
        System.assert(apiKeyResponse4.equals(apiKeyResponse3));
        System.assert(apiKeyResponse3.equals(apiKeyResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASApiKeyResponse apiKeyResponse1 = OASApiKeyResponse.getExample();
        OASApiKeyResponse apiKeyResponse2 = OASApiKeyResponse.getExample();
        OASApiKeyResponse apiKeyResponse3 = new OASApiKeyResponse();
        OASApiKeyResponse apiKeyResponse4 = new OASApiKeyResponse();

        System.assert(apiKeyResponse1.equals(apiKeyResponse2));
        System.assert(apiKeyResponse2.equals(apiKeyResponse1));
        System.assert(apiKeyResponse3.equals(apiKeyResponse4));
        System.assert(apiKeyResponse4.equals(apiKeyResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASApiKeyResponse apiKeyResponse1 = OASApiKeyResponse.getExample();
        OASApiKeyResponse apiKeyResponse2 = new OASApiKeyResponse();

        System.assertEquals(false, apiKeyResponse1.equals('foo'));
        System.assertEquals(false, apiKeyResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASApiKeyResponse apiKeyResponse1 = OASApiKeyResponse.getExample();
        OASApiKeyResponse apiKeyResponse2 = new OASApiKeyResponse();
        OASApiKeyResponse apiKeyResponse3;

        System.assertEquals(false, apiKeyResponse1.equals(apiKeyResponse3));
        System.assertEquals(false, apiKeyResponse2.equals(apiKeyResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASApiKeyResponse apiKeyResponse1 = OASApiKeyResponse.getExample();
        OASApiKeyResponse apiKeyResponse2 = new OASApiKeyResponse();

        System.assertEquals(apiKeyResponse1.hashCode(), apiKeyResponse1.hashCode());
        System.assertEquals(apiKeyResponse2.hashCode(), apiKeyResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASApiKeyResponse apiKeyResponse1 = OASApiKeyResponse.getExample();
        OASApiKeyResponse apiKeyResponse2 = OASApiKeyResponse.getExample();
        OASApiKeyResponse apiKeyResponse3 = new OASApiKeyResponse();
        OASApiKeyResponse apiKeyResponse4 = new OASApiKeyResponse();

        System.assert(apiKeyResponse1.equals(apiKeyResponse2));
        System.assert(apiKeyResponse3.equals(apiKeyResponse4));
        System.assertEquals(apiKeyResponse1.hashCode(), apiKeyResponse2.hashCode());
        System.assertEquals(apiKeyResponse3.hashCode(), apiKeyResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASApiKeyResponse apiKeyResponse = new OASApiKeyResponse();
        Map<String, String> x-property-mappings = apiKeyResponse.getx-property-mappings();
        System.assertEquals('apiKey', x-property-mappings.get('api_key'));
    }
}
