@isTest
private class OASBotTest {
    @isTest
    private static void equalsSameInstance() {
        OASBot bot1 = OASBot.getExample();
        OASBot bot2 = bot1;
        OASBot bot3 = new OASBot();
        OASBot bot4 = bot3;

        System.assert(bot1.equals(bot2));
        System.assert(bot2.equals(bot1));
        System.assert(bot1.equals(bot1));
        System.assert(bot3.equals(bot4));
        System.assert(bot4.equals(bot3));
        System.assert(bot3.equals(bot3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBot bot1 = OASBot.getExample();
        OASBot bot2 = OASBot.getExample();
        OASBot bot3 = new OASBot();
        OASBot bot4 = new OASBot();

        System.assert(bot1.equals(bot2));
        System.assert(bot2.equals(bot1));
        System.assert(bot3.equals(bot4));
        System.assert(bot4.equals(bot3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBot bot1 = OASBot.getExample();
        OASBot bot2 = new OASBot();

        System.assertEquals(false, bot1.equals('foo'));
        System.assertEquals(false, bot2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBot bot1 = OASBot.getExample();
        OASBot bot2 = new OASBot();
        OASBot bot3;

        System.assertEquals(false, bot1.equals(bot3));
        System.assertEquals(false, bot2.equals(bot3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBot bot1 = OASBot.getExample();
        OASBot bot2 = new OASBot();

        System.assertEquals(bot1.hashCode(), bot1.hashCode());
        System.assertEquals(bot2.hashCode(), bot2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBot bot1 = OASBot.getExample();
        OASBot bot2 = OASBot.getExample();
        OASBot bot3 = new OASBot();
        OASBot bot4 = new OASBot();

        System.assert(bot1.equals(bot2));
        System.assert(bot3.equals(bot4));
        System.assertEquals(bot1.hashCode(), bot2.hashCode());
        System.assertEquals(bot3.hashCode(), bot4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBot bot = new OASBot();
        Map<String, String> x-property-mappings = bot.getx-property-mappings();
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
