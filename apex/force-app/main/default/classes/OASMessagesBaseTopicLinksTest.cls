@isTest
private class OASMessagesBaseTopicLinksTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessagesBaseTopicLinks messagesBaseTopicLinks1 = OASMessagesBaseTopicLinks.getExample();
        OASMessagesBaseTopicLinks messagesBaseTopicLinks2 = messagesBaseTopicLinks1;
        OASMessagesBaseTopicLinks messagesBaseTopicLinks3 = new OASMessagesBaseTopicLinks();
        OASMessagesBaseTopicLinks messagesBaseTopicLinks4 = messagesBaseTopicLinks3;

        System.assert(messagesBaseTopicLinks1.equals(messagesBaseTopicLinks2));
        System.assert(messagesBaseTopicLinks2.equals(messagesBaseTopicLinks1));
        System.assert(messagesBaseTopicLinks1.equals(messagesBaseTopicLinks1));
        System.assert(messagesBaseTopicLinks3.equals(messagesBaseTopicLinks4));
        System.assert(messagesBaseTopicLinks4.equals(messagesBaseTopicLinks3));
        System.assert(messagesBaseTopicLinks3.equals(messagesBaseTopicLinks3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessagesBaseTopicLinks messagesBaseTopicLinks1 = OASMessagesBaseTopicLinks.getExample();
        OASMessagesBaseTopicLinks messagesBaseTopicLinks2 = OASMessagesBaseTopicLinks.getExample();
        OASMessagesBaseTopicLinks messagesBaseTopicLinks3 = new OASMessagesBaseTopicLinks();
        OASMessagesBaseTopicLinks messagesBaseTopicLinks4 = new OASMessagesBaseTopicLinks();

        System.assert(messagesBaseTopicLinks1.equals(messagesBaseTopicLinks2));
        System.assert(messagesBaseTopicLinks2.equals(messagesBaseTopicLinks1));
        System.assert(messagesBaseTopicLinks3.equals(messagesBaseTopicLinks4));
        System.assert(messagesBaseTopicLinks4.equals(messagesBaseTopicLinks3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessagesBaseTopicLinks messagesBaseTopicLinks1 = OASMessagesBaseTopicLinks.getExample();
        OASMessagesBaseTopicLinks messagesBaseTopicLinks2 = new OASMessagesBaseTopicLinks();

        System.assertEquals(false, messagesBaseTopicLinks1.equals('foo'));
        System.assertEquals(false, messagesBaseTopicLinks2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessagesBaseTopicLinks messagesBaseTopicLinks1 = OASMessagesBaseTopicLinks.getExample();
        OASMessagesBaseTopicLinks messagesBaseTopicLinks2 = new OASMessagesBaseTopicLinks();
        OASMessagesBaseTopicLinks messagesBaseTopicLinks3;

        System.assertEquals(false, messagesBaseTopicLinks1.equals(messagesBaseTopicLinks3));
        System.assertEquals(false, messagesBaseTopicLinks2.equals(messagesBaseTopicLinks3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessagesBaseTopicLinks messagesBaseTopicLinks1 = OASMessagesBaseTopicLinks.getExample();
        OASMessagesBaseTopicLinks messagesBaseTopicLinks2 = new OASMessagesBaseTopicLinks();

        System.assertEquals(messagesBaseTopicLinks1.hashCode(), messagesBaseTopicLinks1.hashCode());
        System.assertEquals(messagesBaseTopicLinks2.hashCode(), messagesBaseTopicLinks2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessagesBaseTopicLinks messagesBaseTopicLinks1 = OASMessagesBaseTopicLinks.getExample();
        OASMessagesBaseTopicLinks messagesBaseTopicLinks2 = OASMessagesBaseTopicLinks.getExample();
        OASMessagesBaseTopicLinks messagesBaseTopicLinks3 = new OASMessagesBaseTopicLinks();
        OASMessagesBaseTopicLinks messagesBaseTopicLinks4 = new OASMessagesBaseTopicLinks();

        System.assert(messagesBaseTopicLinks1.equals(messagesBaseTopicLinks2));
        System.assert(messagesBaseTopicLinks3.equals(messagesBaseTopicLinks4));
        System.assertEquals(messagesBaseTopicLinks1.hashCode(), messagesBaseTopicLinks2.hashCode());
        System.assertEquals(messagesBaseTopicLinks3.hashCode(), messagesBaseTopicLinks4.hashCode());
    }
}
