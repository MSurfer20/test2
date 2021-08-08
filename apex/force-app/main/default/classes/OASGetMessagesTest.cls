@isTest
private class OASGetMessagesTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetMessages getMessages1 = OASGetMessages.getExample();
        OASGetMessages getMessages2 = getMessages1;
        OASGetMessages getMessages3 = new OASGetMessages();
        OASGetMessages getMessages4 = getMessages3;

        System.assert(getMessages1.equals(getMessages2));
        System.assert(getMessages2.equals(getMessages1));
        System.assert(getMessages1.equals(getMessages1));
        System.assert(getMessages3.equals(getMessages4));
        System.assert(getMessages4.equals(getMessages3));
        System.assert(getMessages3.equals(getMessages3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetMessages getMessages1 = OASGetMessages.getExample();
        OASGetMessages getMessages2 = OASGetMessages.getExample();
        OASGetMessages getMessages3 = new OASGetMessages();
        OASGetMessages getMessages4 = new OASGetMessages();

        System.assert(getMessages1.equals(getMessages2));
        System.assert(getMessages2.equals(getMessages1));
        System.assert(getMessages3.equals(getMessages4));
        System.assert(getMessages4.equals(getMessages3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetMessages getMessages1 = OASGetMessages.getExample();
        OASGetMessages getMessages2 = new OASGetMessages();

        System.assertEquals(false, getMessages1.equals('foo'));
        System.assertEquals(false, getMessages2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetMessages getMessages1 = OASGetMessages.getExample();
        OASGetMessages getMessages2 = new OASGetMessages();
        OASGetMessages getMessages3;

        System.assertEquals(false, getMessages1.equals(getMessages3));
        System.assertEquals(false, getMessages2.equals(getMessages3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetMessages getMessages1 = OASGetMessages.getExample();
        OASGetMessages getMessages2 = new OASGetMessages();

        System.assertEquals(getMessages1.hashCode(), getMessages1.hashCode());
        System.assertEquals(getMessages2.hashCode(), getMessages2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetMessages getMessages1 = OASGetMessages.getExample();
        OASGetMessages getMessages2 = OASGetMessages.getExample();
        OASGetMessages getMessages3 = new OASGetMessages();
        OASGetMessages getMessages4 = new OASGetMessages();

        System.assert(getMessages1.equals(getMessages2));
        System.assert(getMessages3.equals(getMessages4));
        System.assertEquals(getMessages1.hashCode(), getMessages2.hashCode());
        System.assertEquals(getMessages3.hashCode(), getMessages4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGetMessages getMessages = new OASGetMessages();
        Map<String, String> x-property-mappings = getMessages.getx-property-mappings();
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
        System.assertEquals('lastEditTimestamp', x-property-mappings.get('last_edit_timestamp'));
        System.assertEquals('matchContent', x-property-mappings.get('match_content'));
        System.assertEquals('matchSubject', x-property-mappings.get('match_subject'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetMessages getMessages = new OASGetMessages();
        System.assertEquals(new List<String>(), getMessages.flags);
        System.assertEquals(null, getMessages.avatarUrl);
        System.assertEquals(null, getMessages.client);
        System.assertEquals(null, getMessages.content);
        System.assertEquals(null, getMessages.contentType);
        System.assertEquals(null, getMessages.displayRecipient);
        System.assertEquals(null, getMessages.id);
        System.assertEquals(null, getMessages.isMeMessage);
        System.assertEquals(null, getMessages.reactions);
        System.assertEquals(null, getMessages.recipientId);
        System.assertEquals(null, getMessages.senderEmail);
        System.assertEquals(null, getMessages.senderFullName);
        System.assertEquals(null, getMessages.senderId);
        System.assertEquals(null, getMessages.senderRealmStr);
        System.assertEquals(null, getMessages.streamId);
        System.assertEquals(null, getMessages.subject);
        System.assertEquals(null, getMessages.topicLinks);
        System.assertEquals(null, getMessages.submessages);
        System.assertEquals(null, getMessages.timestamp);
        System.assertEquals(null, getMessages.type);
        System.assertEquals(null, getMessages.lastEditTimestamp);
        System.assertEquals(null, getMessages.matchContent);
        System.assertEquals(null, getMessages.matchSubject);
    }
}
