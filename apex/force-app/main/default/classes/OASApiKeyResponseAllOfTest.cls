@isTest
private class OASApiKeyResponseAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASApiKeyResponseAllOf apiKeyResponseAllOf1 = OASApiKeyResponseAllOf.getExample();
        OASApiKeyResponseAllOf apiKeyResponseAllOf2 = apiKeyResponseAllOf1;
        OASApiKeyResponseAllOf apiKeyResponseAllOf3 = new OASApiKeyResponseAllOf();
        OASApiKeyResponseAllOf apiKeyResponseAllOf4 = apiKeyResponseAllOf3;

        System.assert(apiKeyResponseAllOf1.equals(apiKeyResponseAllOf2));
        System.assert(apiKeyResponseAllOf2.equals(apiKeyResponseAllOf1));
        System.assert(apiKeyResponseAllOf1.equals(apiKeyResponseAllOf1));
        System.assert(apiKeyResponseAllOf3.equals(apiKeyResponseAllOf4));
        System.assert(apiKeyResponseAllOf4.equals(apiKeyResponseAllOf3));
        System.assert(apiKeyResponseAllOf3.equals(apiKeyResponseAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASApiKeyResponseAllOf apiKeyResponseAllOf1 = OASApiKeyResponseAllOf.getExample();
        OASApiKeyResponseAllOf apiKeyResponseAllOf2 = OASApiKeyResponseAllOf.getExample();
        OASApiKeyResponseAllOf apiKeyResponseAllOf3 = new OASApiKeyResponseAllOf();
        OASApiKeyResponseAllOf apiKeyResponseAllOf4 = new OASApiKeyResponseAllOf();

        System.assert(apiKeyResponseAllOf1.equals(apiKeyResponseAllOf2));
        System.assert(apiKeyResponseAllOf2.equals(apiKeyResponseAllOf1));
        System.assert(apiKeyResponseAllOf3.equals(apiKeyResponseAllOf4));
        System.assert(apiKeyResponseAllOf4.equals(apiKeyResponseAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASApiKeyResponseAllOf apiKeyResponseAllOf1 = OASApiKeyResponseAllOf.getExample();
        OASApiKeyResponseAllOf apiKeyResponseAllOf2 = new OASApiKeyResponseAllOf();

        System.assertEquals(false, apiKeyResponseAllOf1.equals('foo'));
        System.assertEquals(false, apiKeyResponseAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASApiKeyResponseAllOf apiKeyResponseAllOf1 = OASApiKeyResponseAllOf.getExample();
        OASApiKeyResponseAllOf apiKeyResponseAllOf2 = new OASApiKeyResponseAllOf();
        OASApiKeyResponseAllOf apiKeyResponseAllOf3;

        System.assertEquals(false, apiKeyResponseAllOf1.equals(apiKeyResponseAllOf3));
        System.assertEquals(false, apiKeyResponseAllOf2.equals(apiKeyResponseAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASApiKeyResponseAllOf apiKeyResponseAllOf1 = OASApiKeyResponseAllOf.getExample();
        OASApiKeyResponseAllOf apiKeyResponseAllOf2 = new OASApiKeyResponseAllOf();

        System.assertEquals(apiKeyResponseAllOf1.hashCode(), apiKeyResponseAllOf1.hashCode());
        System.assertEquals(apiKeyResponseAllOf2.hashCode(), apiKeyResponseAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASApiKeyResponseAllOf apiKeyResponseAllOf1 = OASApiKeyResponseAllOf.getExample();
        OASApiKeyResponseAllOf apiKeyResponseAllOf2 = OASApiKeyResponseAllOf.getExample();
        OASApiKeyResponseAllOf apiKeyResponseAllOf3 = new OASApiKeyResponseAllOf();
        OASApiKeyResponseAllOf apiKeyResponseAllOf4 = new OASApiKeyResponseAllOf();

        System.assert(apiKeyResponseAllOf1.equals(apiKeyResponseAllOf2));
        System.assert(apiKeyResponseAllOf3.equals(apiKeyResponseAllOf4));
        System.assertEquals(apiKeyResponseAllOf1.hashCode(), apiKeyResponseAllOf2.hashCode());
        System.assertEquals(apiKeyResponseAllOf3.hashCode(), apiKeyResponseAllOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASApiKeyResponseAllOf apiKeyResponseAllOf = new OASApiKeyResponseAllOf();
        Map<String, String> x-property-mappings = apiKeyResponseAllOf.getx-property-mappings();
        System.assertEquals('apiKey', x-property-mappings.get('api_key'));
    }
}
