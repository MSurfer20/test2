@isTest
private class OASUserNotAuthorizedErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASUserNotAuthorizedError userNotAuthorizedError1 = OASUserNotAuthorizedError.getExample();
        OASUserNotAuthorizedError userNotAuthorizedError2 = userNotAuthorizedError1;
        OASUserNotAuthorizedError userNotAuthorizedError3 = new OASUserNotAuthorizedError();
        OASUserNotAuthorizedError userNotAuthorizedError4 = userNotAuthorizedError3;

        System.assert(userNotAuthorizedError1.equals(userNotAuthorizedError2));
        System.assert(userNotAuthorizedError2.equals(userNotAuthorizedError1));
        System.assert(userNotAuthorizedError1.equals(userNotAuthorizedError1));
        System.assert(userNotAuthorizedError3.equals(userNotAuthorizedError4));
        System.assert(userNotAuthorizedError4.equals(userNotAuthorizedError3));
        System.assert(userNotAuthorizedError3.equals(userNotAuthorizedError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUserNotAuthorizedError userNotAuthorizedError1 = OASUserNotAuthorizedError.getExample();
        OASUserNotAuthorizedError userNotAuthorizedError2 = OASUserNotAuthorizedError.getExample();
        OASUserNotAuthorizedError userNotAuthorizedError3 = new OASUserNotAuthorizedError();
        OASUserNotAuthorizedError userNotAuthorizedError4 = new OASUserNotAuthorizedError();

        System.assert(userNotAuthorizedError1.equals(userNotAuthorizedError2));
        System.assert(userNotAuthorizedError2.equals(userNotAuthorizedError1));
        System.assert(userNotAuthorizedError3.equals(userNotAuthorizedError4));
        System.assert(userNotAuthorizedError4.equals(userNotAuthorizedError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUserNotAuthorizedError userNotAuthorizedError1 = OASUserNotAuthorizedError.getExample();
        OASUserNotAuthorizedError userNotAuthorizedError2 = new OASUserNotAuthorizedError();

        System.assertEquals(false, userNotAuthorizedError1.equals('foo'));
        System.assertEquals(false, userNotAuthorizedError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUserNotAuthorizedError userNotAuthorizedError1 = OASUserNotAuthorizedError.getExample();
        OASUserNotAuthorizedError userNotAuthorizedError2 = new OASUserNotAuthorizedError();
        OASUserNotAuthorizedError userNotAuthorizedError3;

        System.assertEquals(false, userNotAuthorizedError1.equals(userNotAuthorizedError3));
        System.assertEquals(false, userNotAuthorizedError2.equals(userNotAuthorizedError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUserNotAuthorizedError userNotAuthorizedError1 = OASUserNotAuthorizedError.getExample();
        OASUserNotAuthorizedError userNotAuthorizedError2 = new OASUserNotAuthorizedError();

        System.assertEquals(userNotAuthorizedError1.hashCode(), userNotAuthorizedError1.hashCode());
        System.assertEquals(userNotAuthorizedError2.hashCode(), userNotAuthorizedError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUserNotAuthorizedError userNotAuthorizedError1 = OASUserNotAuthorizedError.getExample();
        OASUserNotAuthorizedError userNotAuthorizedError2 = OASUserNotAuthorizedError.getExample();
        OASUserNotAuthorizedError userNotAuthorizedError3 = new OASUserNotAuthorizedError();
        OASUserNotAuthorizedError userNotAuthorizedError4 = new OASUserNotAuthorizedError();

        System.assert(userNotAuthorizedError1.equals(userNotAuthorizedError2));
        System.assert(userNotAuthorizedError3.equals(userNotAuthorizedError4));
        System.assertEquals(userNotAuthorizedError1.hashCode(), userNotAuthorizedError2.hashCode());
        System.assertEquals(userNotAuthorizedError3.hashCode(), userNotAuthorizedError4.hashCode());
    }
}
