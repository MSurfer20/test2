@isTest
private class OASJsonSuccessBaseTest {
    @isTest
    private static void equalsSameInstance() {
        OASJsonSuccessBase jsonSuccessBase1 = OASJsonSuccessBase.getExample();
        OASJsonSuccessBase jsonSuccessBase2 = jsonSuccessBase1;
        OASJsonSuccessBase jsonSuccessBase3 = new OASJsonSuccessBase();
        OASJsonSuccessBase jsonSuccessBase4 = jsonSuccessBase3;

        System.assert(jsonSuccessBase1.equals(jsonSuccessBase2));
        System.assert(jsonSuccessBase2.equals(jsonSuccessBase1));
        System.assert(jsonSuccessBase1.equals(jsonSuccessBase1));
        System.assert(jsonSuccessBase3.equals(jsonSuccessBase4));
        System.assert(jsonSuccessBase4.equals(jsonSuccessBase3));
        System.assert(jsonSuccessBase3.equals(jsonSuccessBase3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASJsonSuccessBase jsonSuccessBase1 = OASJsonSuccessBase.getExample();
        OASJsonSuccessBase jsonSuccessBase2 = OASJsonSuccessBase.getExample();
        OASJsonSuccessBase jsonSuccessBase3 = new OASJsonSuccessBase();
        OASJsonSuccessBase jsonSuccessBase4 = new OASJsonSuccessBase();

        System.assert(jsonSuccessBase1.equals(jsonSuccessBase2));
        System.assert(jsonSuccessBase2.equals(jsonSuccessBase1));
        System.assert(jsonSuccessBase3.equals(jsonSuccessBase4));
        System.assert(jsonSuccessBase4.equals(jsonSuccessBase3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASJsonSuccessBase jsonSuccessBase1 = OASJsonSuccessBase.getExample();
        OASJsonSuccessBase jsonSuccessBase2 = new OASJsonSuccessBase();

        System.assertEquals(false, jsonSuccessBase1.equals('foo'));
        System.assertEquals(false, jsonSuccessBase2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASJsonSuccessBase jsonSuccessBase1 = OASJsonSuccessBase.getExample();
        OASJsonSuccessBase jsonSuccessBase2 = new OASJsonSuccessBase();
        OASJsonSuccessBase jsonSuccessBase3;

        System.assertEquals(false, jsonSuccessBase1.equals(jsonSuccessBase3));
        System.assertEquals(false, jsonSuccessBase2.equals(jsonSuccessBase3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASJsonSuccessBase jsonSuccessBase1 = OASJsonSuccessBase.getExample();
        OASJsonSuccessBase jsonSuccessBase2 = new OASJsonSuccessBase();

        System.assertEquals(jsonSuccessBase1.hashCode(), jsonSuccessBase1.hashCode());
        System.assertEquals(jsonSuccessBase2.hashCode(), jsonSuccessBase2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASJsonSuccessBase jsonSuccessBase1 = OASJsonSuccessBase.getExample();
        OASJsonSuccessBase jsonSuccessBase2 = OASJsonSuccessBase.getExample();
        OASJsonSuccessBase jsonSuccessBase3 = new OASJsonSuccessBase();
        OASJsonSuccessBase jsonSuccessBase4 = new OASJsonSuccessBase();

        System.assert(jsonSuccessBase1.equals(jsonSuccessBase2));
        System.assert(jsonSuccessBase3.equals(jsonSuccessBase4));
        System.assertEquals(jsonSuccessBase1.hashCode(), jsonSuccessBase2.hashCode());
        System.assertEquals(jsonSuccessBase3.hashCode(), jsonSuccessBase4.hashCode());
    }
}
