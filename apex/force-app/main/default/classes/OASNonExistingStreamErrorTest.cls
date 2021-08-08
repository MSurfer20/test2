@isTest
private class OASNonExistingStreamErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASNonExistingStreamError nonExistingStreamError1 = OASNonExistingStreamError.getExample();
        OASNonExistingStreamError nonExistingStreamError2 = nonExistingStreamError1;
        OASNonExistingStreamError nonExistingStreamError3 = new OASNonExistingStreamError();
        OASNonExistingStreamError nonExistingStreamError4 = nonExistingStreamError3;

        System.assert(nonExistingStreamError1.equals(nonExistingStreamError2));
        System.assert(nonExistingStreamError2.equals(nonExistingStreamError1));
        System.assert(nonExistingStreamError1.equals(nonExistingStreamError1));
        System.assert(nonExistingStreamError3.equals(nonExistingStreamError4));
        System.assert(nonExistingStreamError4.equals(nonExistingStreamError3));
        System.assert(nonExistingStreamError3.equals(nonExistingStreamError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASNonExistingStreamError nonExistingStreamError1 = OASNonExistingStreamError.getExample();
        OASNonExistingStreamError nonExistingStreamError2 = OASNonExistingStreamError.getExample();
        OASNonExistingStreamError nonExistingStreamError3 = new OASNonExistingStreamError();
        OASNonExistingStreamError nonExistingStreamError4 = new OASNonExistingStreamError();

        System.assert(nonExistingStreamError1.equals(nonExistingStreamError2));
        System.assert(nonExistingStreamError2.equals(nonExistingStreamError1));
        System.assert(nonExistingStreamError3.equals(nonExistingStreamError4));
        System.assert(nonExistingStreamError4.equals(nonExistingStreamError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASNonExistingStreamError nonExistingStreamError1 = OASNonExistingStreamError.getExample();
        OASNonExistingStreamError nonExistingStreamError2 = new OASNonExistingStreamError();

        System.assertEquals(false, nonExistingStreamError1.equals('foo'));
        System.assertEquals(false, nonExistingStreamError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASNonExistingStreamError nonExistingStreamError1 = OASNonExistingStreamError.getExample();
        OASNonExistingStreamError nonExistingStreamError2 = new OASNonExistingStreamError();
        OASNonExistingStreamError nonExistingStreamError3;

        System.assertEquals(false, nonExistingStreamError1.equals(nonExistingStreamError3));
        System.assertEquals(false, nonExistingStreamError2.equals(nonExistingStreamError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASNonExistingStreamError nonExistingStreamError1 = OASNonExistingStreamError.getExample();
        OASNonExistingStreamError nonExistingStreamError2 = new OASNonExistingStreamError();

        System.assertEquals(nonExistingStreamError1.hashCode(), nonExistingStreamError1.hashCode());
        System.assertEquals(nonExistingStreamError2.hashCode(), nonExistingStreamError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASNonExistingStreamError nonExistingStreamError1 = OASNonExistingStreamError.getExample();
        OASNonExistingStreamError nonExistingStreamError2 = OASNonExistingStreamError.getExample();
        OASNonExistingStreamError nonExistingStreamError3 = new OASNonExistingStreamError();
        OASNonExistingStreamError nonExistingStreamError4 = new OASNonExistingStreamError();

        System.assert(nonExistingStreamError1.equals(nonExistingStreamError2));
        System.assert(nonExistingStreamError3.equals(nonExistingStreamError4));
        System.assertEquals(nonExistingStreamError1.hashCode(), nonExistingStreamError2.hashCode());
        System.assertEquals(nonExistingStreamError3.hashCode(), nonExistingStreamError4.hashCode());
    }
}
