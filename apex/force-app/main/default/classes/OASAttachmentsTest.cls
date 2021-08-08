@isTest
private class OASAttachmentsTest {
    @isTest
    private static void equalsSameInstance() {
        OASAttachments attachments1 = OASAttachments.getExample();
        OASAttachments attachments2 = attachments1;
        OASAttachments attachments3 = new OASAttachments();
        OASAttachments attachments4 = attachments3;

        System.assert(attachments1.equals(attachments2));
        System.assert(attachments2.equals(attachments1));
        System.assert(attachments1.equals(attachments1));
        System.assert(attachments3.equals(attachments4));
        System.assert(attachments4.equals(attachments3));
        System.assert(attachments3.equals(attachments3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAttachments attachments1 = OASAttachments.getExample();
        OASAttachments attachments2 = OASAttachments.getExample();
        OASAttachments attachments3 = new OASAttachments();
        OASAttachments attachments4 = new OASAttachments();

        System.assert(attachments1.equals(attachments2));
        System.assert(attachments2.equals(attachments1));
        System.assert(attachments3.equals(attachments4));
        System.assert(attachments4.equals(attachments3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAttachments attachments1 = OASAttachments.getExample();
        OASAttachments attachments2 = new OASAttachments();

        System.assertEquals(false, attachments1.equals('foo'));
        System.assertEquals(false, attachments2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAttachments attachments1 = OASAttachments.getExample();
        OASAttachments attachments2 = new OASAttachments();
        OASAttachments attachments3;

        System.assertEquals(false, attachments1.equals(attachments3));
        System.assertEquals(false, attachments2.equals(attachments3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAttachments attachments1 = OASAttachments.getExample();
        OASAttachments attachments2 = new OASAttachments();

        System.assertEquals(attachments1.hashCode(), attachments1.hashCode());
        System.assertEquals(attachments2.hashCode(), attachments2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAttachments attachments1 = OASAttachments.getExample();
        OASAttachments attachments2 = OASAttachments.getExample();
        OASAttachments attachments3 = new OASAttachments();
        OASAttachments attachments4 = new OASAttachments();

        System.assert(attachments1.equals(attachments2));
        System.assert(attachments3.equals(attachments4));
        System.assertEquals(attachments1.hashCode(), attachments2.hashCode());
        System.assertEquals(attachments3.hashCode(), attachments4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAttachments attachments = new OASAttachments();
        Map<String, String> x-property-mappings = attachments.getx-property-mappings();
        System.assertEquals('pathId', x-property-mappings.get('path_id'));
        System.assertEquals('createTime', x-property-mappings.get('create_time'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAttachments attachments = new OASAttachments();
        System.assertEquals(new List<OASAttachmentsMessages>(), attachments.messages);
        System.assertEquals(null, attachments.id);
        System.assertEquals(null, attachments.name);
        System.assertEquals(null, attachments.pathId);
        System.assertEquals(null, attachments.size);
        System.assertEquals(null, attachments.createTime);
    }
}
