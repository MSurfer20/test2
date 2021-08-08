@isTest
private class OASMessagesBaseTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessagesBase messagesBase1 = OASMessagesBase.getExample();
        OASMessagesBase messagesBase2 = messagesBase1;
        OASMessagesBase messagesBase3 = new OASMessagesBase();
        OASMessagesBase messagesBase4 = messagesBase3;

        System.assert(messagesBase1.equals(messagesBase2));
        System.assert(messagesBase2.equals(messagesBase1));
        System.assert(messagesBase1.equals(messagesBase1));
        System.assert(messagesBase3.equals(messagesBase4));
        System.assert(messagesBase4.equals(messagesBase3));
        System.assert(messagesBase3.equals(messagesBase3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessagesBase messagesBase1 = OASMessagesBase.getExample();
        OASMessagesBase messagesBase2 = OASMessagesBase.getExample();
        OASMessagesBase messagesBase3 = new OASMessagesBase();
        OASMessagesBase messagesBase4 = new OASMessagesBase();

        System.assert(messagesBase1.equals(messagesBase2));
        System.assert(messagesBase2.equals(messagesBase1));
        System.assert(messagesBase3.equals(messagesBase4));
        System.assert(messagesBase4.equals(messagesBase3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessagesBase messagesBase1 = OASMessagesBase.getExample();
        OASMessagesBase messagesBase2 = new OASMessagesBase();

        System.assertEquals(false, messagesBase1.equals('foo'));
        System.assertEquals(false, messagesBase2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessagesBase messagesBase1 = OASMessagesBase.getExample();
        OASMessagesBase messagesBase2 = new OASMessagesBase();
        OASMessagesBase messagesBase3;

        System.assertEquals(false, messagesBase1.equals(messagesBase3));
        System.assertEquals(false, messagesBase2.equals(messagesBase3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessagesBase messagesBase1 = OASMessagesBase.getExample();
        OASMessagesBase messagesBase2 = new OASMessagesBase();

        System.assertEquals(messagesBase1.hashCode(), messagesBase1.hashCode());
        System.assertEquals(messagesBase2.hashCode(), messagesBase2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessagesBase messagesBase1 = OASMessagesBase.getExample();
        OASMessagesBase messagesBase2 = OASMessagesBase.getExample();
        OASMessagesBase messagesBase3 = new OASMessagesBase();
        OASMessagesBase messagesBase4 = new OASMessagesBase();

        System.assert(messagesBase1.equals(messagesBase2));
        System.assert(messagesBase3.equals(messagesBase4));
        System.assertEquals(messagesBase1.hashCode(), messagesBase2.hashCode());
        System.assertEquals(messagesBase3.hashCode(), messagesBase4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMessagesBase messagesBase = new OASMessagesBase();
        Map<String, String> x-property-mappings = messagesBase.getx-property-mappings();
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

    @isTest
    private static void defaultValuesPopulated() {
        OASMessagesBase messagesBase = new OASMessagesBase();
        System.assertEquals(new List<OASEmojiReaction>(), messagesBase.reactions);
        System.assertEquals(new List<OASMessagesBaseTopicLinks>(), messagesBase.topicLinks);
        System.assertEquals(new List<String>(), messagesBase.submessages);
        System.assertEquals(null, messagesBase.avatarUrl);
        System.assertEquals(null, messagesBase.client);
        System.assertEquals(null, messagesBase.content);
        System.assertEquals(null, messagesBase.contentType);
        System.assertEquals(null, messagesBase.displayRecipient);
        System.assertEquals(null, messagesBase.id);
        System.assertEquals(null, messagesBase.isMeMessage);
        System.assertEquals(null, messagesBase.recipientId);
        System.assertEquals(null, messagesBase.senderEmail);
        System.assertEquals(null, messagesBase.senderFullName);
        System.assertEquals(null, messagesBase.senderId);
        System.assertEquals(null, messagesBase.senderRealmStr);
        System.assertEquals(null, messagesBase.streamId);
        System.assertEquals(null, messagesBase.subject);
        System.assertEquals(null, messagesBase.timestamp);
        System.assertEquals(null, messagesBase.type);
    }
}
