@isTest
private class OASBasicBotTest {
    @isTest
    private static void equalsSameInstance() {
        OASBasicBot basicBot1 = OASBasicBot.getExample();
        OASBasicBot basicBot2 = basicBot1;
        OASBasicBot basicBot3 = new OASBasicBot();
        OASBasicBot basicBot4 = basicBot3;

        System.assert(basicBot1.equals(basicBot2));
        System.assert(basicBot2.equals(basicBot1));
        System.assert(basicBot1.equals(basicBot1));
        System.assert(basicBot3.equals(basicBot4));
        System.assert(basicBot4.equals(basicBot3));
        System.assert(basicBot3.equals(basicBot3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBasicBot basicBot1 = OASBasicBot.getExample();
        OASBasicBot basicBot2 = OASBasicBot.getExample();
        OASBasicBot basicBot3 = new OASBasicBot();
        OASBasicBot basicBot4 = new OASBasicBot();

        System.assert(basicBot1.equals(basicBot2));
        System.assert(basicBot2.equals(basicBot1));
        System.assert(basicBot3.equals(basicBot4));
        System.assert(basicBot4.equals(basicBot3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBasicBot basicBot1 = OASBasicBot.getExample();
        OASBasicBot basicBot2 = new OASBasicBot();

        System.assertEquals(false, basicBot1.equals('foo'));
        System.assertEquals(false, basicBot2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBasicBot basicBot1 = OASBasicBot.getExample();
        OASBasicBot basicBot2 = new OASBasicBot();
        OASBasicBot basicBot3;

        System.assertEquals(false, basicBot1.equals(basicBot3));
        System.assertEquals(false, basicBot2.equals(basicBot3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBasicBot basicBot1 = OASBasicBot.getExample();
        OASBasicBot basicBot2 = new OASBasicBot();

        System.assertEquals(basicBot1.hashCode(), basicBot1.hashCode());
        System.assertEquals(basicBot2.hashCode(), basicBot2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBasicBot basicBot1 = OASBasicBot.getExample();
        OASBasicBot basicBot2 = OASBasicBot.getExample();
        OASBasicBot basicBot3 = new OASBasicBot();
        OASBasicBot basicBot4 = new OASBasicBot();

        System.assert(basicBot1.equals(basicBot2));
        System.assert(basicBot3.equals(basicBot4));
        System.assertEquals(basicBot1.hashCode(), basicBot2.hashCode());
        System.assertEquals(basicBot3.hashCode(), basicBot4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBasicBot basicBot = new OASBasicBot();
        Map<String, String> x-property-mappings = basicBot.getx-property-mappings();
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
