@isTest
private class OASBasicStreamAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASBasicStreamAllOf basicStreamAllOf1 = OASBasicStreamAllOf.getExample();
        OASBasicStreamAllOf basicStreamAllOf2 = basicStreamAllOf1;
        OASBasicStreamAllOf basicStreamAllOf3 = new OASBasicStreamAllOf();
        OASBasicStreamAllOf basicStreamAllOf4 = basicStreamAllOf3;

        System.assert(basicStreamAllOf1.equals(basicStreamAllOf2));
        System.assert(basicStreamAllOf2.equals(basicStreamAllOf1));
        System.assert(basicStreamAllOf1.equals(basicStreamAllOf1));
        System.assert(basicStreamAllOf3.equals(basicStreamAllOf4));
        System.assert(basicStreamAllOf4.equals(basicStreamAllOf3));
        System.assert(basicStreamAllOf3.equals(basicStreamAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBasicStreamAllOf basicStreamAllOf1 = OASBasicStreamAllOf.getExample();
        OASBasicStreamAllOf basicStreamAllOf2 = OASBasicStreamAllOf.getExample();
        OASBasicStreamAllOf basicStreamAllOf3 = new OASBasicStreamAllOf();
        OASBasicStreamAllOf basicStreamAllOf4 = new OASBasicStreamAllOf();

        System.assert(basicStreamAllOf1.equals(basicStreamAllOf2));
        System.assert(basicStreamAllOf2.equals(basicStreamAllOf1));
        System.assert(basicStreamAllOf3.equals(basicStreamAllOf4));
        System.assert(basicStreamAllOf4.equals(basicStreamAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBasicStreamAllOf basicStreamAllOf1 = OASBasicStreamAllOf.getExample();
        OASBasicStreamAllOf basicStreamAllOf2 = new OASBasicStreamAllOf();

        System.assertEquals(false, basicStreamAllOf1.equals('foo'));
        System.assertEquals(false, basicStreamAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBasicStreamAllOf basicStreamAllOf1 = OASBasicStreamAllOf.getExample();
        OASBasicStreamAllOf basicStreamAllOf2 = new OASBasicStreamAllOf();
        OASBasicStreamAllOf basicStreamAllOf3;

        System.assertEquals(false, basicStreamAllOf1.equals(basicStreamAllOf3));
        System.assertEquals(false, basicStreamAllOf2.equals(basicStreamAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBasicStreamAllOf basicStreamAllOf1 = OASBasicStreamAllOf.getExample();
        OASBasicStreamAllOf basicStreamAllOf2 = new OASBasicStreamAllOf();

        System.assertEquals(basicStreamAllOf1.hashCode(), basicStreamAllOf1.hashCode());
        System.assertEquals(basicStreamAllOf2.hashCode(), basicStreamAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBasicStreamAllOf basicStreamAllOf1 = OASBasicStreamAllOf.getExample();
        OASBasicStreamAllOf basicStreamAllOf2 = OASBasicStreamAllOf.getExample();
        OASBasicStreamAllOf basicStreamAllOf3 = new OASBasicStreamAllOf();
        OASBasicStreamAllOf basicStreamAllOf4 = new OASBasicStreamAllOf();

        System.assert(basicStreamAllOf1.equals(basicStreamAllOf2));
        System.assert(basicStreamAllOf3.equals(basicStreamAllOf4));
        System.assertEquals(basicStreamAllOf1.hashCode(), basicStreamAllOf2.hashCode());
        System.assertEquals(basicStreamAllOf3.hashCode(), basicStreamAllOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBasicStreamAllOf basicStreamAllOf = new OASBasicStreamAllOf();
        Map<String, String> x-property-mappings = basicStreamAllOf.getx-property-mappings();
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
