@isTest
private class OASMessagesAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessagesAllOf messagesAllOf1 = OASMessagesAllOf.getExample();
        OASMessagesAllOf messagesAllOf2 = messagesAllOf1;
        OASMessagesAllOf messagesAllOf3 = new OASMessagesAllOf();
        OASMessagesAllOf messagesAllOf4 = messagesAllOf3;

        System.assert(messagesAllOf1.equals(messagesAllOf2));
        System.assert(messagesAllOf2.equals(messagesAllOf1));
        System.assert(messagesAllOf1.equals(messagesAllOf1));
        System.assert(messagesAllOf3.equals(messagesAllOf4));
        System.assert(messagesAllOf4.equals(messagesAllOf3));
        System.assert(messagesAllOf3.equals(messagesAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessagesAllOf messagesAllOf1 = OASMessagesAllOf.getExample();
        OASMessagesAllOf messagesAllOf2 = OASMessagesAllOf.getExample();
        OASMessagesAllOf messagesAllOf3 = new OASMessagesAllOf();
        OASMessagesAllOf messagesAllOf4 = new OASMessagesAllOf();

        System.assert(messagesAllOf1.equals(messagesAllOf2));
        System.assert(messagesAllOf2.equals(messagesAllOf1));
        System.assert(messagesAllOf3.equals(messagesAllOf4));
        System.assert(messagesAllOf4.equals(messagesAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessagesAllOf messagesAllOf1 = OASMessagesAllOf.getExample();
        OASMessagesAllOf messagesAllOf2 = new OASMessagesAllOf();

        System.assertEquals(false, messagesAllOf1.equals('foo'));
        System.assertEquals(false, messagesAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessagesAllOf messagesAllOf1 = OASMessagesAllOf.getExample();
        OASMessagesAllOf messagesAllOf2 = new OASMessagesAllOf();
        OASMessagesAllOf messagesAllOf3;

        System.assertEquals(false, messagesAllOf1.equals(messagesAllOf3));
        System.assertEquals(false, messagesAllOf2.equals(messagesAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessagesAllOf messagesAllOf1 = OASMessagesAllOf.getExample();
        OASMessagesAllOf messagesAllOf2 = new OASMessagesAllOf();

        System.assertEquals(messagesAllOf1.hashCode(), messagesAllOf1.hashCode());
        System.assertEquals(messagesAllOf2.hashCode(), messagesAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessagesAllOf messagesAllOf1 = OASMessagesAllOf.getExample();
        OASMessagesAllOf messagesAllOf2 = OASMessagesAllOf.getExample();
        OASMessagesAllOf messagesAllOf3 = new OASMessagesAllOf();
        OASMessagesAllOf messagesAllOf4 = new OASMessagesAllOf();

        System.assert(messagesAllOf1.equals(messagesAllOf2));
        System.assert(messagesAllOf3.equals(messagesAllOf4));
        System.assertEquals(messagesAllOf1.hashCode(), messagesAllOf2.hashCode());
        System.assertEquals(messagesAllOf3.hashCode(), messagesAllOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMessagesAllOf messagesAllOf = new OASMessagesAllOf();
        Map<String, String> x-property-mappings = messagesAllOf.getx-property-mappings();
        System.assertEquals('avatarUrl', x-property-mappings.get('avatar_url'));
        System.assertEquals('contentType', x-property-mappings.get('content_type'));
        System.assertEquals('displayRecipient', x-property-mappings.get('display_recipient'));
        System.assertEquals('isMeMessage', x-property-mappings.get('is_me_message'));
        System.assertEquals('recipientId', x-property-mappings.get('recipient_id'));
        System.assertEquals('senderEmail', x-property-mappings.get('sender_email'));
        System.assertEquals('senderFullName', x-property-mappings.get('sender_full_name'));
        System.assertEquals('senderId', x-property-mappings.get('sender_id'));
        System.assertEquals('senderRealmStr', x-property-mappings.get('sender_realm_str'));
        System.assertEquals('streamId', x-property-mappings.get('stream_id'));
        System.assertEquals('topicLinks', x-property-mappings.get('topic_links'));
    }
}
