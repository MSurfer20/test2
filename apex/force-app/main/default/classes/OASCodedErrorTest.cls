@isTest
private class OASCodedErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASCodedError codedError1 = OASCodedError.getExample();
        OASCodedError codedError2 = codedError1;
        OASCodedError codedError3 = new OASCodedError();
        OASCodedError codedError4 = codedError3;

        System.assert(codedError1.equals(codedError2));
        System.assert(codedError2.equals(codedError1));
        System.assert(codedError1.equals(codedError1));
        System.assert(codedError3.equals(codedError4));
        System.assert(codedError4.equals(codedError3));
        System.assert(codedError3.equals(codedError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCodedError codedError1 = OASCodedError.getExample();
        OASCodedError codedError2 = OASCodedError.getExample();
        OASCodedError codedError3 = new OASCodedError();
        OASCodedError codedError4 = new OASCodedError();

        System.assert(codedError1.equals(codedError2));
        System.assert(codedError2.equals(codedError1));
        System.assert(codedError3.equals(codedError4));
        System.assert(codedError4.equals(codedError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCodedError codedError1 = OASCodedError.getExample();
        OASCodedError codedError2 = new OASCodedError();

        System.assertEquals(false, codedError1.equals('foo'));
        System.assertEquals(false, codedError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCodedError codedError1 = OASCodedError.getExample();
        OASCodedError codedError2 = new OASCodedError();
        OASCodedError codedError3;

        System.assertEquals(false, codedError1.equals(codedError3));
        System.assertEquals(false, codedError2.equals(codedError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCodedError codedError1 = OASCodedError.getExample();
        OASCodedError codedError2 = new OASCodedError();

        System.assertEquals(codedError1.hashCode(), codedError1.hashCode());
        System.assertEquals(codedError2.hashCode(), codedError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCodedError codedError1 = OASCodedError.getExample();
        OASCodedError codedError2 = OASCodedError.getExample();
        OASCodedError codedError3 = new OASCodedError();
        OASCodedError codedError4 = new OASCodedError();

        System.assert(codedError1.equals(codedError2));
        System.assert(codedError3.equals(codedError4));
        System.assertEquals(codedError1.hashCode(), codedError2.hashCode());
        System.assertEquals(codedError3.hashCode(), codedError4.hashCode());
    }
}
