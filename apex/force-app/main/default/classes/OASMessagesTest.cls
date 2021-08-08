@isTest
private class OASMessagesTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessages messages1 = OASMessages.getExample();
        OASMessages messages2 = messages1;
        OASMessages messages3 = new OASMessages();
        OASMessages messages4 = messages3;

        System.assert(messages1.equals(messages2));
        System.assert(messages2.equals(messages1));
        System.assert(messages1.equals(messages1));
        System.assert(messages3.equals(messages4));
        System.assert(messages4.equals(messages3));
        System.assert(messages3.equals(messages3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessages messages1 = OASMessages.getExample();
        OASMessages messages2 = OASMessages.getExample();
        OASMessages messages3 = new OASMessages();
        OASMessages messages4 = new OASMessages();

        System.assert(messages1.equals(messages2));
        System.assert(messages2.equals(messages1));
        System.assert(messages3.equals(messages4));
        System.assert(messages4.equals(messages3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessages messages1 = OASMessages.getExample();
        OASMessages messages2 = new OASMessages();

        System.assertEquals(false, messages1.equals('foo'));
        System.assertEquals(false, messages2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessages messages1 = OASMessages.getExample();
        OASMessages messages2 = new OASMessages();
        OASMessages messages3;

        System.assertEquals(false, messages1.equals(messages3));
        System.assertEquals(false, messages2.equals(messages3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessages messages1 = OASMessages.getExample();
        OASMessages messages2 = new OASMessages();

        System.assertEquals(messages1.hashCode(), messages1.hashCode());
        System.assertEquals(messages2.hashCode(), messages2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessages messages1 = OASMessages.getExample();
        OASMessages messages2 = OASMessages.getExample();
        OASMessages messages3 = new OASMessages();
        OASMessages messages4 = new OASMessages();

        System.assert(messages1.equals(messages2));
        System.assert(messages3.equals(messages4));
        System.assertEquals(messages1.hashCode(), messages2.hashCode());
        System.assertEquals(messages3.hashCode(), messages4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMessages messages = new OASMessages();
        Map<String, String> x-property-mappings = messages.getx-property-mappings();
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
