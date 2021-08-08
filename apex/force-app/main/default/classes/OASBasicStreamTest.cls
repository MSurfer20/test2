@isTest
private class OASBasicStreamTest {
    @isTest
    private static void equalsSameInstance() {
        OASBasicStream basicStream1 = OASBasicStream.getExample();
        OASBasicStream basicStream2 = basicStream1;
        OASBasicStream basicStream3 = new OASBasicStream();
        OASBasicStream basicStream4 = basicStream3;

        System.assert(basicStream1.equals(basicStream2));
        System.assert(basicStream2.equals(basicStream1));
        System.assert(basicStream1.equals(basicStream1));
        System.assert(basicStream3.equals(basicStream4));
        System.assert(basicStream4.equals(basicStream3));
        System.assert(basicStream3.equals(basicStream3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBasicStream basicStream1 = OASBasicStream.getExample();
        OASBasicStream basicStream2 = OASBasicStream.getExample();
        OASBasicStream basicStream3 = new OASBasicStream();
        OASBasicStream basicStream4 = new OASBasicStream();

        System.assert(basicStream1.equals(basicStream2));
        System.assert(basicStream2.equals(basicStream1));
        System.assert(basicStream3.equals(basicStream4));
        System.assert(basicStream4.equals(basicStream3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBasicStream basicStream1 = OASBasicStream.getExample();
        OASBasicStream basicStream2 = new OASBasicStream();

        System.assertEquals(false, basicStream1.equals('foo'));
        System.assertEquals(false, basicStream2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBasicStream basicStream1 = OASBasicStream.getExample();
        OASBasicStream basicStream2 = new OASBasicStream();
        OASBasicStream basicStream3;

        System.assertEquals(false, basicStream1.equals(basicStream3));
        System.assertEquals(false, basicStream2.equals(basicStream3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBasicStream basicStream1 = OASBasicStream.getExample();
        OASBasicStream basicStream2 = new OASBasicStream();

        System.assertEquals(basicStream1.hashCode(), basicStream1.hashCode());
        System.assertEquals(basicStream2.hashCode(), basicStream2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBasicStream basicStream1 = OASBasicStream.getExample();
        OASBasicStream basicStream2 = OASBasicStream.getExample();
        OASBasicStream basicStream3 = new OASBasicStream();
        OASBasicStream basicStream4 = new OASBasicStream();

        System.assert(basicStream1.equals(basicStream2));
        System.assert(basicStream3.equals(basicStream4));
        System.assertEquals(basicStream1.hashCode(), basicStream2.hashCode());
        System.assertEquals(basicStream3.hashCode(), basicStream4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBasicStream basicStream = new OASBasicStream();
        Map<String, String> x-property-mappings = basicStream.getx-property-mappings();
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
