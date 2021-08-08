@isTest
private class OASBasicStreamBaseTest {
    @isTest
    private static void equalsSameInstance() {
        OASBasicStreamBase basicStreamBase1 = OASBasicStreamBase.getExample();
        OASBasicStreamBase basicStreamBase2 = basicStreamBase1;
        OASBasicStreamBase basicStreamBase3 = new OASBasicStreamBase();
        OASBasicStreamBase basicStreamBase4 = basicStreamBase3;

        System.assert(basicStreamBase1.equals(basicStreamBase2));
        System.assert(basicStreamBase2.equals(basicStreamBase1));
        System.assert(basicStreamBase1.equals(basicStreamBase1));
        System.assert(basicStreamBase3.equals(basicStreamBase4));
        System.assert(basicStreamBase4.equals(basicStreamBase3));
        System.assert(basicStreamBase3.equals(basicStreamBase3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBasicStreamBase basicStreamBase1 = OASBasicStreamBase.getExample();
        OASBasicStreamBase basicStreamBase2 = OASBasicStreamBase.getExample();
        OASBasicStreamBase basicStreamBase3 = new OASBasicStreamBase();
        OASBasicStreamBase basicStreamBase4 = new OASBasicStreamBase();

        System.assert(basicStreamBase1.equals(basicStreamBase2));
        System.assert(basicStreamBase2.equals(basicStreamBase1));
        System.assert(basicStreamBase3.equals(basicStreamBase4));
        System.assert(basicStreamBase4.equals(basicStreamBase3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBasicStreamBase basicStreamBase1 = OASBasicStreamBase.getExample();
        OASBasicStreamBase basicStreamBase2 = new OASBasicStreamBase();

        System.assertEquals(false, basicStreamBase1.equals('foo'));
        System.assertEquals(false, basicStreamBase2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBasicStreamBase basicStreamBase1 = OASBasicStreamBase.getExample();
        OASBasicStreamBase basicStreamBase2 = new OASBasicStreamBase();
        OASBasicStreamBase basicStreamBase3;

        System.assertEquals(false, basicStreamBase1.equals(basicStreamBase3));
        System.assertEquals(false, basicStreamBase2.equals(basicStreamBase3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBasicStreamBase basicStreamBase1 = OASBasicStreamBase.getExample();
        OASBasicStreamBase basicStreamBase2 = new OASBasicStreamBase();

        System.assertEquals(basicStreamBase1.hashCode(), basicStreamBase1.hashCode());
        System.assertEquals(basicStreamBase2.hashCode(), basicStreamBase2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBasicStreamBase basicStreamBase1 = OASBasicStreamBase.getExample();
        OASBasicStreamBase basicStreamBase2 = OASBasicStreamBase.getExample();
        OASBasicStreamBase basicStreamBase3 = new OASBasicStreamBase();
        OASBasicStreamBase basicStreamBase4 = new OASBasicStreamBase();

        System.assert(basicStreamBase1.equals(basicStreamBase2));
        System.assert(basicStreamBase3.equals(basicStreamBase4));
        System.assertEquals(basicStreamBase1.hashCode(), basicStreamBase2.hashCode());
        System.assertEquals(basicStreamBase3.hashCode(), basicStreamBase4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBasicStreamBase basicStreamBase = new OASBasicStreamBase();
        Map<String, String> x-property-mappings = basicStreamBase.getx-property-mappings();
        System.assertEquals('streamId', x-property-mappings.get('stream_id'));
        System.assertEquals('dateCreated', x-property-mappings.get('date_created'));
        System.assertEquals('inviteOnly', x-property-mappings.get('invite_only'));
        System.assertEquals('renderedDescription', x-property-mappings.get('rendered_description'));
        System.assertEquals('isWebPublic', x-property-mappings.get('is_web_public'));
        System.assertEquals('streamPostPolicy', x-property-mappings.get('stream_post_policy'));
        System.assertEquals('messageRetentionDays', x-property-mappings.get('message_retention_days'));
        System.assertEquals('historyPublicToSubscribers', x-property-mappings.get('history_public_to_subscribers'));
        System.assertEquals('firstMessageId', x-property-mappings.get('first_message_id'));
        System.assertEquals('isAnnouncementOnly', x-property-mappings.get('is_announcement_only'));
    }
}
