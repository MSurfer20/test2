@isTest
private class OASRealmDeactivatedErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealmDeactivatedError realmDeactivatedError1 = OASRealmDeactivatedError.getExample();
        OASRealmDeactivatedError realmDeactivatedError2 = realmDeactivatedError1;
        OASRealmDeactivatedError realmDeactivatedError3 = new OASRealmDeactivatedError();
        OASRealmDeactivatedError realmDeactivatedError4 = realmDeactivatedError3;

        System.assert(realmDeactivatedError1.equals(realmDeactivatedError2));
        System.assert(realmDeactivatedError2.equals(realmDeactivatedError1));
        System.assert(realmDeactivatedError1.equals(realmDeactivatedError1));
        System.assert(realmDeactivatedError3.equals(realmDeactivatedError4));
        System.assert(realmDeactivatedError4.equals(realmDeactivatedError3));
        System.assert(realmDeactivatedError3.equals(realmDeactivatedError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealmDeactivatedError realmDeactivatedError1 = OASRealmDeactivatedError.getExample();
        OASRealmDeactivatedError realmDeactivatedError2 = OASRealmDeactivatedError.getExample();
        OASRealmDeactivatedError realmDeactivatedError3 = new OASRealmDeactivatedError();
        OASRealmDeactivatedError realmDeactivatedError4 = new OASRealmDeactivatedError();

        System.assert(realmDeactivatedError1.equals(realmDeactivatedError2));
        System.assert(realmDeactivatedError2.equals(realmDeactivatedError1));
        System.assert(realmDeactivatedError3.equals(realmDeactivatedError4));
        System.assert(realmDeactivatedError4.equals(realmDeactivatedError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealmDeactivatedError realmDeactivatedError1 = OASRealmDeactivatedError.getExample();
        OASRealmDeactivatedError realmDeactivatedError2 = new OASRealmDeactivatedError();

        System.assertEquals(false, realmDeactivatedError1.equals('foo'));
        System.assertEquals(false, realmDeactivatedError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealmDeactivatedError realmDeactivatedError1 = OASRealmDeactivatedError.getExample();
        OASRealmDeactivatedError realmDeactivatedError2 = new OASRealmDeactivatedError();
        OASRealmDeactivatedError realmDeactivatedError3;

        System.assertEquals(false, realmDeactivatedError1.equals(realmDeactivatedError3));
        System.assertEquals(false, realmDeactivatedError2.equals(realmDeactivatedError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealmDeactivatedError realmDeactivatedError1 = OASRealmDeactivatedError.getExample();
        OASRealmDeactivatedError realmDeactivatedError2 = new OASRealmDeactivatedError();

        System.assertEquals(realmDeactivatedError1.hashCode(), realmDeactivatedError1.hashCode());
        System.assertEquals(realmDeactivatedError2.hashCode(), realmDeactivatedError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealmDeactivatedError realmDeactivatedError1 = OASRealmDeactivatedError.getExample();
        OASRealmDeactivatedError realmDeactivatedError2 = OASRealmDeactivatedError.getExample();
        OASRealmDeactivatedError realmDeactivatedError3 = new OASRealmDeactivatedError();
        OASRealmDeactivatedError realmDeactivatedError4 = new OASRealmDeactivatedError();

        System.assert(realmDeactivatedError1.equals(realmDeactivatedError2));
        System.assert(realmDeactivatedError3.equals(realmDeactivatedError4));
        System.assertEquals(realmDeactivatedError1.hashCode(), realmDeactivatedError2.hashCode());
        System.assertEquals(realmDeactivatedError3.hashCode(), realmDeactivatedError4.hashCode());
    }
}
