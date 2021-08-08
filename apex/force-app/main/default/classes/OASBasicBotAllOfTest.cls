@isTest
private class OASBasicBotAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASBasicBotAllOf basicBotAllOf1 = OASBasicBotAllOf.getExample();
        OASBasicBotAllOf basicBotAllOf2 = basicBotAllOf1;
        OASBasicBotAllOf basicBotAllOf3 = new OASBasicBotAllOf();
        OASBasicBotAllOf basicBotAllOf4 = basicBotAllOf3;

        System.assert(basicBotAllOf1.equals(basicBotAllOf2));
        System.assert(basicBotAllOf2.equals(basicBotAllOf1));
        System.assert(basicBotAllOf1.equals(basicBotAllOf1));
        System.assert(basicBotAllOf3.equals(basicBotAllOf4));
        System.assert(basicBotAllOf4.equals(basicBotAllOf3));
        System.assert(basicBotAllOf3.equals(basicBotAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBasicBotAllOf basicBotAllOf1 = OASBasicBotAllOf.getExample();
        OASBasicBotAllOf basicBotAllOf2 = OASBasicBotAllOf.getExample();
        OASBasicBotAllOf basicBotAllOf3 = new OASBasicBotAllOf();
        OASBasicBotAllOf basicBotAllOf4 = new OASBasicBotAllOf();

        System.assert(basicBotAllOf1.equals(basicBotAllOf2));
        System.assert(basicBotAllOf2.equals(basicBotAllOf1));
        System.assert(basicBotAllOf3.equals(basicBotAllOf4));
        System.assert(basicBotAllOf4.equals(basicBotAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBasicBotAllOf basicBotAllOf1 = OASBasicBotAllOf.getExample();
        OASBasicBotAllOf basicBotAllOf2 = new OASBasicBotAllOf();

        System.assertEquals(false, basicBotAllOf1.equals('foo'));
        System.assertEquals(false, basicBotAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBasicBotAllOf basicBotAllOf1 = OASBasicBotAllOf.getExample();
        OASBasicBotAllOf basicBotAllOf2 = new OASBasicBotAllOf();
        OASBasicBotAllOf basicBotAllOf3;

        System.assertEquals(false, basicBotAllOf1.equals(basicBotAllOf3));
        System.assertEquals(false, basicBotAllOf2.equals(basicBotAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBasicBotAllOf basicBotAllOf1 = OASBasicBotAllOf.getExample();
        OASBasicBotAllOf basicBotAllOf2 = new OASBasicBotAllOf();

        System.assertEquals(basicBotAllOf1.hashCode(), basicBotAllOf1.hashCode());
        System.assertEquals(basicBotAllOf2.hashCode(), basicBotAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBasicBotAllOf basicBotAllOf1 = OASBasicBotAllOf.getExample();
        OASBasicBotAllOf basicBotAllOf2 = OASBasicBotAllOf.getExample();
        OASBasicBotAllOf basicBotAllOf3 = new OASBasicBotAllOf();
        OASBasicBotAllOf basicBotAllOf4 = new OASBasicBotAllOf();

        System.assert(basicBotAllOf1.equals(basicBotAllOf2));
        System.assert(basicBotAllOf3.equals(basicBotAllOf4));
        System.assertEquals(basicBotAllOf1.hashCode(), basicBotAllOf2.hashCode());
        System.assertEquals(basicBotAllOf3.hashCode(), basicBotAllOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBasicBotAllOf basicBotAllOf = new OASBasicBotAllOf();
        Map<String, String> x-property-mappings = basicBotAllOf.getx-property-mappings();
        System.assertEquals('userId', x-property-mappings.get('user_id'));
        System.assertEquals('fullName', x-property-mappings.get('full_name'));
        System.assertEquals('apiKey', x-property-mappings.get('api_key'));
        System.assertEquals('defaultSendingStream', x-property-mappings.get('default_sending_stream'));
        System.assertEquals('defaultEventsRegisterStream', x-property-mappings.get('default_events_register_stream'));
        System.assertEquals('defaultAllPublicStreams', x-property-mappings.get('default_all_public_streams'));
        System.assertEquals('avatarUrl', x-property-mappings.get('avatar_url'));
        System.assertEquals('ownerId', x-property-mappings.get('owner_id'));
    }
}
