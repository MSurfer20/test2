@isTest
private class OASJsonSuccessTest {
    @isTest
    private static void equalsSameInstance() {
        OASJsonSuccess jsonSuccess1 = OASJsonSuccess.getExample();
        OASJsonSuccess jsonSuccess2 = jsonSuccess1;
        OASJsonSuccess jsonSuccess3 = new OASJsonSuccess();
        OASJsonSuccess jsonSuccess4 = jsonSuccess3;

        System.assert(jsonSuccess1.equals(jsonSuccess2));
        System.assert(jsonSuccess2.equals(jsonSuccess1));
        System.assert(jsonSuccess1.equals(jsonSuccess1));
        System.assert(jsonSuccess3.equals(jsonSuccess4));
        System.assert(jsonSuccess4.equals(jsonSuccess3));
        System.assert(jsonSuccess3.equals(jsonSuccess3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASJsonSuccess jsonSuccess1 = OASJsonSuccess.getExample();
        OASJsonSuccess jsonSuccess2 = OASJsonSuccess.getExample();
        OASJsonSuccess jsonSuccess3 = new OASJsonSuccess();
        OASJsonSuccess jsonSuccess4 = new OASJsonSuccess();

        System.assert(jsonSuccess1.equals(jsonSuccess2));
        System.assert(jsonSuccess2.equals(jsonSuccess1));
        System.assert(jsonSuccess3.equals(jsonSuccess4));
        System.assert(jsonSuccess4.equals(jsonSuccess3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASJsonSuccess jsonSuccess1 = OASJsonSuccess.getExample();
        OASJsonSuccess jsonSuccess2 = new OASJsonSuccess();

        System.assertEquals(false, jsonSuccess1.equals('foo'));
        System.assertEquals(false, jsonSuccess2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASJsonSuccess jsonSuccess1 = OASJsonSuccess.getExample();
        OASJsonSuccess jsonSuccess2 = new OASJsonSuccess();
        OASJsonSuccess jsonSuccess3;

        System.assertEquals(false, jsonSuccess1.equals(jsonSuccess3));
        System.assertEquals(false, jsonSuccess2.equals(jsonSuccess3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASJsonSuccess jsonSuccess1 = OASJsonSuccess.getExample();
        OASJsonSuccess jsonSuccess2 = new OASJsonSuccess();

        System.assertEquals(jsonSuccess1.hashCode(), jsonSuccess1.hashCode());
        System.assertEquals(jsonSuccess2.hashCode(), jsonSuccess2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASJsonSuccess jsonSuccess1 = OASJsonSuccess.getExample();
        OASJsonSuccess jsonSuccess2 = OASJsonSuccess.getExample();
        OASJsonSuccess jsonSuccess3 = new OASJsonSuccess();
        OASJsonSuccess jsonSuccess4 = new OASJsonSuccess();

        System.assert(jsonSuccess1.equals(jsonSuccess2));
        System.assert(jsonSuccess3.equals(jsonSuccess4));
        System.assertEquals(jsonSuccess1.hashCode(), jsonSuccess2.hashCode());
        System.assertEquals(jsonSuccess3.hashCode(), jsonSuccess4.hashCode());
    }
}
