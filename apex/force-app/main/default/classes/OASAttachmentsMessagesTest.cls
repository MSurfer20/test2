@isTest
private class OASAttachmentsMessagesTest {
    @isTest
    private static void equalsSameInstance() {
        OASAttachmentsMessages attachmentsMessages1 = OASAttachmentsMessages.getExample();
        OASAttachmentsMessages attachmentsMessages2 = attachmentsMessages1;
        OASAttachmentsMessages attachmentsMessages3 = new OASAttachmentsMessages();
        OASAttachmentsMessages attachmentsMessages4 = attachmentsMessages3;

        System.assert(attachmentsMessages1.equals(attachmentsMessages2));
        System.assert(attachmentsMessages2.equals(attachmentsMessages1));
        System.assert(attachmentsMessages1.equals(attachmentsMessages1));
        System.assert(attachmentsMessages3.equals(attachmentsMessages4));
        System.assert(attachmentsMessages4.equals(attachmentsMessages3));
        System.assert(attachmentsMessages3.equals(attachmentsMessages3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAttachmentsMessages attachmentsMessages1 = OASAttachmentsMessages.getExample();
        OASAttachmentsMessages attachmentsMessages2 = OASAttachmentsMessages.getExample();
        OASAttachmentsMessages attachmentsMessages3 = new OASAttachmentsMessages();
        OASAttachmentsMessages attachmentsMessages4 = new OASAttachmentsMessages();

        System.assert(attachmentsMessages1.equals(attachmentsMessages2));
        System.assert(attachmentsMessages2.equals(attachmentsMessages1));
        System.assert(attachmentsMessages3.equals(attachmentsMessages4));
        System.assert(attachmentsMessages4.equals(attachmentsMessages3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAttachmentsMessages attachmentsMessages1 = OASAttachmentsMessages.getExample();
        OASAttachmentsMessages attachmentsMessages2 = new OASAttachmentsMessages();

        System.assertEquals(false, attachmentsMessages1.equals('foo'));
        System.assertEquals(false, attachmentsMessages2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAttachmentsMessages attachmentsMessages1 = OASAttachmentsMessages.getExample();
        OASAttachmentsMessages attachmentsMessages2 = new OASAttachmentsMessages();
        OASAttachmentsMessages attachmentsMessages3;

        System.assertEquals(false, attachmentsMessages1.equals(attachmentsMessages3));
        System.assertEquals(false, attachmentsMessages2.equals(attachmentsMessages3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAttachmentsMessages attachmentsMessages1 = OASAttachmentsMessages.getExample();
        OASAttachmentsMessages attachmentsMessages2 = new OASAttachmentsMessages();

        System.assertEquals(attachmentsMessages1.hashCode(), attachmentsMessages1.hashCode());
        System.assertEquals(attachmentsMessages2.hashCode(), attachmentsMessages2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAttachmentsMessages attachmentsMessages1 = OASAttachmentsMessages.getExample();
        OASAttachmentsMessages attachmentsMessages2 = OASAttachmentsMessages.getExample();
        OASAttachmentsMessages attachmentsMessages3 = new OASAttachmentsMessages();
        OASAttachmentsMessages attachmentsMessages4 = new OASAttachmentsMessages();

        System.assert(attachmentsMessages1.equals(attachmentsMessages2));
        System.assert(attachmentsMessages3.equals(attachmentsMessages4));
        System.assertEquals(attachmentsMessages1.hashCode(), attachmentsMessages2.hashCode());
        System.assertEquals(attachmentsMessages3.hashCode(), attachmentsMessages4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAttachmentsMessages attachmentsMessages = new OASAttachmentsMessages();
        Map<String, String> x-property-mappings = attachmentsMessages.getx-property-mappings();
        System.assertEquals('dateSent', x-property-mappings.get('date_sent'));
    }
}
