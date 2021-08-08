@isTest
private class OASJsonErrorBaseTest {
    @isTest
    private static void equalsSameInstance() {
        OASJsonErrorBase jsonErrorBase1 = OASJsonErrorBase.getExample();
        OASJsonErrorBase jsonErrorBase2 = jsonErrorBase1;
        OASJsonErrorBase jsonErrorBase3 = new OASJsonErrorBase();
        OASJsonErrorBase jsonErrorBase4 = jsonErrorBase3;

        System.assert(jsonErrorBase1.equals(jsonErrorBase2));
        System.assert(jsonErrorBase2.equals(jsonErrorBase1));
        System.assert(jsonErrorBase1.equals(jsonErrorBase1));
        System.assert(jsonErrorBase3.equals(jsonErrorBase4));
        System.assert(jsonErrorBase4.equals(jsonErrorBase3));
        System.assert(jsonErrorBase3.equals(jsonErrorBase3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASJsonErrorBase jsonErrorBase1 = OASJsonErrorBase.getExample();
        OASJsonErrorBase jsonErrorBase2 = OASJsonErrorBase.getExample();
        OASJsonErrorBase jsonErrorBase3 = new OASJsonErrorBase();
        OASJsonErrorBase jsonErrorBase4 = new OASJsonErrorBase();

        System.assert(jsonErrorBase1.equals(jsonErrorBase2));
        System.assert(jsonErrorBase2.equals(jsonErrorBase1));
        System.assert(jsonErrorBase3.equals(jsonErrorBase4));
        System.assert(jsonErrorBase4.equals(jsonErrorBase3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASJsonErrorBase jsonErrorBase1 = OASJsonErrorBase.getExample();
        OASJsonErrorBase jsonErrorBase2 = new OASJsonErrorBase();

        System.assertEquals(false, jsonErrorBase1.equals('foo'));
        System.assertEquals(false, jsonErrorBase2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASJsonErrorBase jsonErrorBase1 = OASJsonErrorBase.getExample();
        OASJsonErrorBase jsonErrorBase2 = new OASJsonErrorBase();
        OASJsonErrorBase jsonErrorBase3;

        System.assertEquals(false, jsonErrorBase1.equals(jsonErrorBase3));
        System.assertEquals(false, jsonErrorBase2.equals(jsonErrorBase3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASJsonErrorBase jsonErrorBase1 = OASJsonErrorBase.getExample();
        OASJsonErrorBase jsonErrorBase2 = new OASJsonErrorBase();

        System.assertEquals(jsonErrorBase1.hashCode(), jsonErrorBase1.hashCode());
        System.assertEquals(jsonErrorBase2.hashCode(), jsonErrorBase2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASJsonErrorBase jsonErrorBase1 = OASJsonErrorBase.getExample();
        OASJsonErrorBase jsonErrorBase2 = OASJsonErrorBase.getExample();
        OASJsonErrorBase jsonErrorBase3 = new OASJsonErrorBase();
        OASJsonErrorBase jsonErrorBase4 = new OASJsonErrorBase();

        System.assert(jsonErrorBase1.equals(jsonErrorBase2));
        System.assert(jsonErrorBase3.equals(jsonErrorBase4));
        System.assertEquals(jsonErrorBase1.hashCode(), jsonErrorBase2.hashCode());
        System.assertEquals(jsonErrorBase3.hashCode(), jsonErrorBase4.hashCode());
    }
}
