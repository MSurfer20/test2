@isTest
private class OASInvalidApiKeyErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASInvalidApiKeyError invalidApiKeyError1 = OASInvalidApiKeyError.getExample();
        OASInvalidApiKeyError invalidApiKeyError2 = invalidApiKeyError1;
        OASInvalidApiKeyError invalidApiKeyError3 = new OASInvalidApiKeyError();
        OASInvalidApiKeyError invalidApiKeyError4 = invalidApiKeyError3;

        System.assert(invalidApiKeyError1.equals(invalidApiKeyError2));
        System.assert(invalidApiKeyError2.equals(invalidApiKeyError1));
        System.assert(invalidApiKeyError1.equals(invalidApiKeyError1));
        System.assert(invalidApiKeyError3.equals(invalidApiKeyError4));
        System.assert(invalidApiKeyError4.equals(invalidApiKeyError3));
        System.assert(invalidApiKeyError3.equals(invalidApiKeyError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInvalidApiKeyError invalidApiKeyError1 = OASInvalidApiKeyError.getExample();
        OASInvalidApiKeyError invalidApiKeyError2 = OASInvalidApiKeyError.getExample();
        OASInvalidApiKeyError invalidApiKeyError3 = new OASInvalidApiKeyError();
        OASInvalidApiKeyError invalidApiKeyError4 = new OASInvalidApiKeyError();

        System.assert(invalidApiKeyError1.equals(invalidApiKeyError2));
        System.assert(invalidApiKeyError2.equals(invalidApiKeyError1));
        System.assert(invalidApiKeyError3.equals(invalidApiKeyError4));
        System.assert(invalidApiKeyError4.equals(invalidApiKeyError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInvalidApiKeyError invalidApiKeyError1 = OASInvalidApiKeyError.getExample();
        OASInvalidApiKeyError invalidApiKeyError2 = new OASInvalidApiKeyError();

        System.assertEquals(false, invalidApiKeyError1.equals('foo'));
        System.assertEquals(false, invalidApiKeyError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInvalidApiKeyError invalidApiKeyError1 = OASInvalidApiKeyError.getExample();
        OASInvalidApiKeyError invalidApiKeyError2 = new OASInvalidApiKeyError();
        OASInvalidApiKeyError invalidApiKeyError3;

        System.assertEquals(false, invalidApiKeyError1.equals(invalidApiKeyError3));
        System.assertEquals(false, invalidApiKeyError2.equals(invalidApiKeyError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInvalidApiKeyError invalidApiKeyError1 = OASInvalidApiKeyError.getExample();
        OASInvalidApiKeyError invalidApiKeyError2 = new OASInvalidApiKeyError();

        System.assertEquals(invalidApiKeyError1.hashCode(), invalidApiKeyError1.hashCode());
        System.assertEquals(invalidApiKeyError2.hashCode(), invalidApiKeyError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInvalidApiKeyError invalidApiKeyError1 = OASInvalidApiKeyError.getExample();
        OASInvalidApiKeyError invalidApiKeyError2 = OASInvalidApiKeyError.getExample();
        OASInvalidApiKeyError invalidApiKeyError3 = new OASInvalidApiKeyError();
        OASInvalidApiKeyError invalidApiKeyError4 = new OASInvalidApiKeyError();

        System.assert(invalidApiKeyError1.equals(invalidApiKeyError2));
        System.assert(invalidApiKeyError3.equals(invalidApiKeyError4));
        System.assertEquals(invalidApiKeyError1.hashCode(), invalidApiKeyError2.hashCode());
        System.assertEquals(invalidApiKeyError3.hashCode(), invalidApiKeyError4.hashCode());
    }
}
