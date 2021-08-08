@isTest
private class OASGetMessagesAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetMessagesAllOf getMessagesAllOf1 = OASGetMessagesAllOf.getExample();
        OASGetMessagesAllOf getMessagesAllOf2 = getMessagesAllOf1;
        OASGetMessagesAllOf getMessagesAllOf3 = new OASGetMessagesAllOf();
        OASGetMessagesAllOf getMessagesAllOf4 = getMessagesAllOf3;

        System.assert(getMessagesAllOf1.equals(getMessagesAllOf2));
        System.assert(getMessagesAllOf2.equals(getMessagesAllOf1));
        System.assert(getMessagesAllOf1.equals(getMessagesAllOf1));
        System.assert(getMessagesAllOf3.equals(getMessagesAllOf4));
        System.assert(getMessagesAllOf4.equals(getMessagesAllOf3));
        System.assert(getMessagesAllOf3.equals(getMessagesAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetMessagesAllOf getMessagesAllOf1 = OASGetMessagesAllOf.getExample();
        OASGetMessagesAllOf getMessagesAllOf2 = OASGetMessagesAllOf.getExample();
        OASGetMessagesAllOf getMessagesAllOf3 = new OASGetMessagesAllOf();
        OASGetMessagesAllOf getMessagesAllOf4 = new OASGetMessagesAllOf();

        System.assert(getMessagesAllOf1.equals(getMessagesAllOf2));
        System.assert(getMessagesAllOf2.equals(getMessagesAllOf1));
        System.assert(getMessagesAllOf3.equals(getMessagesAllOf4));
        System.assert(getMessagesAllOf4.equals(getMessagesAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetMessagesAllOf getMessagesAllOf1 = OASGetMessagesAllOf.getExample();
        OASGetMessagesAllOf getMessagesAllOf2 = new OASGetMessagesAllOf();

        System.assertEquals(false, getMessagesAllOf1.equals('foo'));
        System.assertEquals(false, getMessagesAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetMessagesAllOf getMessagesAllOf1 = OASGetMessagesAllOf.getExample();
        OASGetMessagesAllOf getMessagesAllOf2 = new OASGetMessagesAllOf();
        OASGetMessagesAllOf getMessagesAllOf3;

        System.assertEquals(false, getMessagesAllOf1.equals(getMessagesAllOf3));
        System.assertEquals(false, getMessagesAllOf2.equals(getMessagesAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetMessagesAllOf getMessagesAllOf1 = OASGetMessagesAllOf.getExample();
        OASGetMessagesAllOf getMessagesAllOf2 = new OASGetMessagesAllOf();

        System.assertEquals(getMessagesAllOf1.hashCode(), getMessagesAllOf1.hashCode());
        System.assertEquals(getMessagesAllOf2.hashCode(), getMessagesAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetMessagesAllOf getMessagesAllOf1 = OASGetMessagesAllOf.getExample();
        OASGetMessagesAllOf getMessagesAllOf2 = OASGetMessagesAllOf.getExample();
        OASGetMessagesAllOf getMessagesAllOf3 = new OASGetMessagesAllOf();
        OASGetMessagesAllOf getMessagesAllOf4 = new OASGetMessagesAllOf();

        System.assert(getMessagesAllOf1.equals(getMessagesAllOf2));
        System.assert(getMessagesAllOf3.equals(getMessagesAllOf4));
        System.assertEquals(getMessagesAllOf1.hashCode(), getMessagesAllOf2.hashCode());
        System.assertEquals(getMessagesAllOf3.hashCode(), getMessagesAllOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGetMessagesAllOf getMessagesAllOf = new OASGetMessagesAllOf();
        Map<String, String> x-property-mappings = getMessagesAllOf.getx-property-mappings();
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
        OASGetMessagesAllOf getMessagesAllOf = new OASGetMessagesAllOf();
        System.assertEquals(new List<String>(), getMessagesAllOf.flags);
        System.assertEquals(null, getMessagesAllOf.avatarUrl);
        System.assertEquals(null, getMessagesAllOf.client);
        System.assertEquals(null, getMessagesAllOf.content);
        System.assertEquals(null, getMessagesAllOf.contentType);
        System.assertEquals(null, getMessagesAllOf.displayRecipient);
        System.assertEquals(null, getMessagesAllOf.id);
        System.assertEquals(null, getMessagesAllOf.isMeMessage);
        System.assertEquals(null, getMessagesAllOf.reactions);
        System.assertEquals(null, getMessagesAllOf.recipientId);
        System.assertEquals(null, getMessagesAllOf.senderEmail);
        System.assertEquals(null, getMessagesAllOf.senderFullName);
        System.assertEquals(null, getMessagesAllOf.senderId);
        System.assertEquals(null, getMessagesAllOf.senderRealmStr);
        System.assertEquals(null, getMessagesAllOf.streamId);
        System.assertEquals(null, getMessagesAllOf.subject);
        System.assertEquals(null, getMessagesAllOf.topicLinks);
        System.assertEquals(null, getMessagesAllOf.submessages);
        System.assertEquals(null, getMessagesAllOf.timestamp);
        System.assertEquals(null, getMessagesAllOf.type);
        System.assertEquals(null, getMessagesAllOf.lastEditTimestamp);
        System.assertEquals(null, getMessagesAllOf.matchContent);
        System.assertEquals(null, getMessagesAllOf.matchSubject);
    }
}
