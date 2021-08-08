@isTest
private class OASBasicBotBaseTest {
    @isTest
    private static void equalsSameInstance() {
        OASBasicBotBase basicBotBase1 = OASBasicBotBase.getExample();
        OASBasicBotBase basicBotBase2 = basicBotBase1;
        OASBasicBotBase basicBotBase3 = new OASBasicBotBase();
        OASBasicBotBase basicBotBase4 = basicBotBase3;

        System.assert(basicBotBase1.equals(basicBotBase2));
        System.assert(basicBotBase2.equals(basicBotBase1));
        System.assert(basicBotBase1.equals(basicBotBase1));
        System.assert(basicBotBase3.equals(basicBotBase4));
        System.assert(basicBotBase4.equals(basicBotBase3));
        System.assert(basicBotBase3.equals(basicBotBase3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBasicBotBase basicBotBase1 = OASBasicBotBase.getExample();
        OASBasicBotBase basicBotBase2 = OASBasicBotBase.getExample();
        OASBasicBotBase basicBotBase3 = new OASBasicBotBase();
        OASBasicBotBase basicBotBase4 = new OASBasicBotBase();

        System.assert(basicBotBase1.equals(basicBotBase2));
        System.assert(basicBotBase2.equals(basicBotBase1));
        System.assert(basicBotBase3.equals(basicBotBase4));
        System.assert(basicBotBase4.equals(basicBotBase3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBasicBotBase basicBotBase1 = OASBasicBotBase.getExample();
        OASBasicBotBase basicBotBase2 = new OASBasicBotBase();

        System.assertEquals(false, basicBotBase1.equals('foo'));
        System.assertEquals(false, basicBotBase2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBasicBotBase basicBotBase1 = OASBasicBotBase.getExample();
        OASBasicBotBase basicBotBase2 = new OASBasicBotBase();
        OASBasicBotBase basicBotBase3;

        System.assertEquals(false, basicBotBase1.equals(basicBotBase3));
        System.assertEquals(false, basicBotBase2.equals(basicBotBase3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBasicBotBase basicBotBase1 = OASBasicBotBase.getExample();
        OASBasicBotBase basicBotBase2 = new OASBasicBotBase();

        System.assertEquals(basicBotBase1.hashCode(), basicBotBase1.hashCode());
        System.assertEquals(basicBotBase2.hashCode(), basicBotBase2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBasicBotBase basicBotBase1 = OASBasicBotBase.getExample();
        OASBasicBotBase basicBotBase2 = OASBasicBotBase.getExample();
        OASBasicBotBase basicBotBase3 = new OASBasicBotBase();
        OASBasicBotBase basicBotBase4 = new OASBasicBotBase();

        System.assert(basicBotBase1.equals(basicBotBase2));
        System.assert(basicBotBase3.equals(basicBotBase4));
        System.assertEquals(basicBotBase1.hashCode(), basicBotBase2.hashCode());
        System.assertEquals(basicBotBase3.hashCode(), basicBotBase4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBasicBotBase basicBotBase = new OASBasicBotBase();
        Map<String, String> x-property-mappings = basicBotBase.getx-property-mappings();
        System.assertEquals('userId', x-property-mappings.get('user_id'));
        System.assertEquals('fullName', x-property-mappings.get('full_name'));
        System.assertEquals('apiKey', x-property-mappings.get('api_key'));
        System.assertEquals('defaultSendingStream', x-property-mappings.get('default_sending_stream'));
        System.assertEquals('defaultEventsRegisterStream', x-property-mappings.get('default_events_register_stream'));
        System.assertEquals('defaultAllPublicStreams', x-property-mappings.get('default_all_public_streams'));
        System.assertEquals('avatarUrl', x-property-mappings.get('avatar_url'));
        System.assertEquals('ownerId', x-property-mappings.get('owner_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBasicBotBase basicBotBase = new OASBasicBotBase();
        System.assertEquals(new List<OASOneOfobjectobject>(), basicBotBase.services);
        System.assertEquals(null, basicBotBase.userId);
        System.assertEquals(null, basicBotBase.fullName);
        System.assertEquals(null, basicBotBase.apiKey);
        System.assertEquals(null, basicBotBase.defaultSendingStream);
        System.assertEquals(null, basicBotBase.defaultEventsRegisterStream);
        System.assertEquals(null, basicBotBase.defaultAllPublicStreams);
        System.assertEquals(null, basicBotBase.avatarUrl);
        System.assertEquals(null, basicBotBase.ownerId);
    }
}
