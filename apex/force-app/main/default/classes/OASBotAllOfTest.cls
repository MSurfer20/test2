@isTest
private class OASBotAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASBotAllOf botAllOf1 = OASBotAllOf.getExample();
        OASBotAllOf botAllOf2 = botAllOf1;
        OASBotAllOf botAllOf3 = new OASBotAllOf();
        OASBotAllOf botAllOf4 = botAllOf3;

        System.assert(botAllOf1.equals(botAllOf2));
        System.assert(botAllOf2.equals(botAllOf1));
        System.assert(botAllOf1.equals(botAllOf1));
        System.assert(botAllOf3.equals(botAllOf4));
        System.assert(botAllOf4.equals(botAllOf3));
        System.assert(botAllOf3.equals(botAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBotAllOf botAllOf1 = OASBotAllOf.getExample();
        OASBotAllOf botAllOf2 = OASBotAllOf.getExample();
        OASBotAllOf botAllOf3 = new OASBotAllOf();
        OASBotAllOf botAllOf4 = new OASBotAllOf();

        System.assert(botAllOf1.equals(botAllOf2));
        System.assert(botAllOf2.equals(botAllOf1));
        System.assert(botAllOf3.equals(botAllOf4));
        System.assert(botAllOf4.equals(botAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBotAllOf botAllOf1 = OASBotAllOf.getExample();
        OASBotAllOf botAllOf2 = new OASBotAllOf();

        System.assertEquals(false, botAllOf1.equals('foo'));
        System.assertEquals(false, botAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBotAllOf botAllOf1 = OASBotAllOf.getExample();
        OASBotAllOf botAllOf2 = new OASBotAllOf();
        OASBotAllOf botAllOf3;

        System.assertEquals(false, botAllOf1.equals(botAllOf3));
        System.assertEquals(false, botAllOf2.equals(botAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBotAllOf botAllOf1 = OASBotAllOf.getExample();
        OASBotAllOf botAllOf2 = new OASBotAllOf();

        System.assertEquals(botAllOf1.hashCode(), botAllOf1.hashCode());
        System.assertEquals(botAllOf2.hashCode(), botAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBotAllOf botAllOf1 = OASBotAllOf.getExample();
        OASBotAllOf botAllOf2 = OASBotAllOf.getExample();
        OASBotAllOf botAllOf3 = new OASBotAllOf();
        OASBotAllOf botAllOf4 = new OASBotAllOf();

        System.assert(botAllOf1.equals(botAllOf2));
        System.assert(botAllOf3.equals(botAllOf4));
        System.assertEquals(botAllOf1.hashCode(), botAllOf2.hashCode());
        System.assertEquals(botAllOf3.hashCode(), botAllOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBotAllOf botAllOf = new OASBotAllOf();
        Map<String, String> x-property-mappings = botAllOf.getx-property-mappings();
        System.assertEquals('userId', x-property-mappings.get('user_id'));
        System.assertEquals('fullName', x-property-mappings.get('full_name'));
        System.assertEquals('apiKey', x-property-mappings.get('api_key'));
        System.assertEquals('defaultSendingStream', x-property-mappings.get('default_sending_stream'));
        System.assertEquals('defaultEventsRegisterStream', x-property-mappings.get('default_events_register_stream'));
        System.assertEquals('defaultAllPublicStreams', x-property-mappings.get('default_all_public_streams'));
        System.assertEquals('avatarUrl', x-property-mappings.get('avatar_url'));
        System.assertEquals('ownerId', x-property-mappings.get('owner_id'));
        System.assertEquals('botType', x-property-mappings.get('bot_type'));
        System.assertEquals('isActive', x-property-mappings.get('is_active'));
    }
}
