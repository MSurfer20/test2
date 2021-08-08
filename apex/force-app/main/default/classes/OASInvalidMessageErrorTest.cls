@isTest
private class OASInvalidMessageErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASInvalidMessageError invalidMessageError1 = OASInvalidMessageError.getExample();
        OASInvalidMessageError invalidMessageError2 = invalidMessageError1;
        OASInvalidMessageError invalidMessageError3 = new OASInvalidMessageError();
        OASInvalidMessageError invalidMessageError4 = invalidMessageError3;

        System.assert(invalidMessageError1.equals(invalidMessageError2));
        System.assert(invalidMessageError2.equals(invalidMessageError1));
        System.assert(invalidMessageError1.equals(invalidMessageError1));
        System.assert(invalidMessageError3.equals(invalidMessageError4));
        System.assert(invalidMessageError4.equals(invalidMessageError3));
        System.assert(invalidMessageError3.equals(invalidMessageError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInvalidMessageError invalidMessageError1 = OASInvalidMessageError.getExample();
        OASInvalidMessageError invalidMessageError2 = OASInvalidMessageError.getExample();
        OASInvalidMessageError invalidMessageError3 = new OASInvalidMessageError();
        OASInvalidMessageError invalidMessageError4 = new OASInvalidMessageError();

        System.assert(invalidMessageError1.equals(invalidMessageError2));
        System.assert(invalidMessageError2.equals(invalidMessageError1));
        System.assert(invalidMessageError3.equals(invalidMessageError4));
        System.assert(invalidMessageError4.equals(invalidMessageError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInvalidMessageError invalidMessageError1 = OASInvalidMessageError.getExample();
        OASInvalidMessageError invalidMessageError2 = new OASInvalidMessageError();

        System.assertEquals(false, invalidMessageError1.equals('foo'));
        System.assertEquals(false, invalidMessageError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInvalidMessageError invalidMessageError1 = OASInvalidMessageError.getExample();
        OASInvalidMessageError invalidMessageError2 = new OASInvalidMessageError();
        OASInvalidMessageError invalidMessageError3;

        System.assertEquals(false, invalidMessageError1.equals(invalidMessageError3));
        System.assertEquals(false, invalidMessageError2.equals(invalidMessageError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInvalidMessageError invalidMessageError1 = OASInvalidMessageError.getExample();
        OASInvalidMessageError invalidMessageError2 = new OASInvalidMessageError();

        System.assertEquals(invalidMessageError1.hashCode(), invalidMessageError1.hashCode());
        System.assertEquals(invalidMessageError2.hashCode(), invalidMessageError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInvalidMessageError invalidMessageError1 = OASInvalidMessageError.getExample();
        OASInvalidMessageError invalidMessageError2 = OASInvalidMessageError.getExample();
        OASInvalidMessageError invalidMessageError3 = new OASInvalidMessageError();
        OASInvalidMessageError invalidMessageError4 = new OASInvalidMessageError();

        System.assert(invalidMessageError1.equals(invalidMessageError2));
        System.assert(invalidMessageError3.equals(invalidMessageError4));
        System.assertEquals(invalidMessageError1.hashCode(), invalidMessageError2.hashCode());
        System.assertEquals(invalidMessageError3.hashCode(), invalidMessageError4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASInvalidMessageError invalidMessageError = new OASInvalidMessageError();
        Map<String, String> x-property-mappings = invalidMessageError.getx-property-mappings();
        System.assertEquals('rawContent', x-property-mappings.get('raw_content'));
    }
}
