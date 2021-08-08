@isTest
private class OASJsonResponseBaseTest {
    @isTest
    private static void equalsSameInstance() {
        OASJsonResponseBase jsonResponseBase1 = OASJsonResponseBase.getExample();
        OASJsonResponseBase jsonResponseBase2 = jsonResponseBase1;
        OASJsonResponseBase jsonResponseBase3 = new OASJsonResponseBase();
        OASJsonResponseBase jsonResponseBase4 = jsonResponseBase3;

        System.assert(jsonResponseBase1.equals(jsonResponseBase2));
        System.assert(jsonResponseBase2.equals(jsonResponseBase1));
        System.assert(jsonResponseBase1.equals(jsonResponseBase1));
        System.assert(jsonResponseBase3.equals(jsonResponseBase4));
        System.assert(jsonResponseBase4.equals(jsonResponseBase3));
        System.assert(jsonResponseBase3.equals(jsonResponseBase3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASJsonResponseBase jsonResponseBase1 = OASJsonResponseBase.getExample();
        OASJsonResponseBase jsonResponseBase2 = OASJsonResponseBase.getExample();
        OASJsonResponseBase jsonResponseBase3 = new OASJsonResponseBase();
        OASJsonResponseBase jsonResponseBase4 = new OASJsonResponseBase();

        System.assert(jsonResponseBase1.equals(jsonResponseBase2));
        System.assert(jsonResponseBase2.equals(jsonResponseBase1));
        System.assert(jsonResponseBase3.equals(jsonResponseBase4));
        System.assert(jsonResponseBase4.equals(jsonResponseBase3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASJsonResponseBase jsonResponseBase1 = OASJsonResponseBase.getExample();
        OASJsonResponseBase jsonResponseBase2 = new OASJsonResponseBase();

        System.assertEquals(false, jsonResponseBase1.equals('foo'));
        System.assertEquals(false, jsonResponseBase2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASJsonResponseBase jsonResponseBase1 = OASJsonResponseBase.getExample();
        OASJsonResponseBase jsonResponseBase2 = new OASJsonResponseBase();
        OASJsonResponseBase jsonResponseBase3;

        System.assertEquals(false, jsonResponseBase1.equals(jsonResponseBase3));
        System.assertEquals(false, jsonResponseBase2.equals(jsonResponseBase3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASJsonResponseBase jsonResponseBase1 = OASJsonResponseBase.getExample();
        OASJsonResponseBase jsonResponseBase2 = new OASJsonResponseBase();

        System.assertEquals(jsonResponseBase1.hashCode(), jsonResponseBase1.hashCode());
        System.assertEquals(jsonResponseBase2.hashCode(), jsonResponseBase2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASJsonResponseBase jsonResponseBase1 = OASJsonResponseBase.getExample();
        OASJsonResponseBase jsonResponseBase2 = OASJsonResponseBase.getExample();
        OASJsonResponseBase jsonResponseBase3 = new OASJsonResponseBase();
        OASJsonResponseBase jsonResponseBase4 = new OASJsonResponseBase();

        System.assert(jsonResponseBase1.equals(jsonResponseBase2));
        System.assert(jsonResponseBase3.equals(jsonResponseBase4));
        System.assertEquals(jsonResponseBase1.hashCode(), jsonResponseBase2.hashCode());
        System.assertEquals(jsonResponseBase3.hashCode(), jsonResponseBase4.hashCode());
    }
}
