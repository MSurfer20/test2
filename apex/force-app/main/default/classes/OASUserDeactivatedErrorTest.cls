@isTest
private class OASUserDeactivatedErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASUserDeactivatedError userDeactivatedError1 = OASUserDeactivatedError.getExample();
        OASUserDeactivatedError userDeactivatedError2 = userDeactivatedError1;
        OASUserDeactivatedError userDeactivatedError3 = new OASUserDeactivatedError();
        OASUserDeactivatedError userDeactivatedError4 = userDeactivatedError3;

        System.assert(userDeactivatedError1.equals(userDeactivatedError2));
        System.assert(userDeactivatedError2.equals(userDeactivatedError1));
        System.assert(userDeactivatedError1.equals(userDeactivatedError1));
        System.assert(userDeactivatedError3.equals(userDeactivatedError4));
        System.assert(userDeactivatedError4.equals(userDeactivatedError3));
        System.assert(userDeactivatedError3.equals(userDeactivatedError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUserDeactivatedError userDeactivatedError1 = OASUserDeactivatedError.getExample();
        OASUserDeactivatedError userDeactivatedError2 = OASUserDeactivatedError.getExample();
        OASUserDeactivatedError userDeactivatedError3 = new OASUserDeactivatedError();
        OASUserDeactivatedError userDeactivatedError4 = new OASUserDeactivatedError();

        System.assert(userDeactivatedError1.equals(userDeactivatedError2));
        System.assert(userDeactivatedError2.equals(userDeactivatedError1));
        System.assert(userDeactivatedError3.equals(userDeactivatedError4));
        System.assert(userDeactivatedError4.equals(userDeactivatedError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUserDeactivatedError userDeactivatedError1 = OASUserDeactivatedError.getExample();
        OASUserDeactivatedError userDeactivatedError2 = new OASUserDeactivatedError();

        System.assertEquals(false, userDeactivatedError1.equals('foo'));
        System.assertEquals(false, userDeactivatedError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUserDeactivatedError userDeactivatedError1 = OASUserDeactivatedError.getExample();
        OASUserDeactivatedError userDeactivatedError2 = new OASUserDeactivatedError();
        OASUserDeactivatedError userDeactivatedError3;

        System.assertEquals(false, userDeactivatedError1.equals(userDeactivatedError3));
        System.assertEquals(false, userDeactivatedError2.equals(userDeactivatedError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUserDeactivatedError userDeactivatedError1 = OASUserDeactivatedError.getExample();
        OASUserDeactivatedError userDeactivatedError2 = new OASUserDeactivatedError();

        System.assertEquals(userDeactivatedError1.hashCode(), userDeactivatedError1.hashCode());
        System.assertEquals(userDeactivatedError2.hashCode(), userDeactivatedError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUserDeactivatedError userDeactivatedError1 = OASUserDeactivatedError.getExample();
        OASUserDeactivatedError userDeactivatedError2 = OASUserDeactivatedError.getExample();
        OASUserDeactivatedError userDeactivatedError3 = new OASUserDeactivatedError();
        OASUserDeactivatedError userDeactivatedError4 = new OASUserDeactivatedError();

        System.assert(userDeactivatedError1.equals(userDeactivatedError2));
        System.assert(userDeactivatedError3.equals(userDeactivatedError4));
        System.assertEquals(userDeactivatedError1.hashCode(), userDeactivatedError2.hashCode());
        System.assertEquals(userDeactivatedError3.hashCode(), userDeactivatedError4.hashCode());
    }
}
