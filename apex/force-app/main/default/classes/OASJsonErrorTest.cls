@isTest
private class OASJsonErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASJsonError jsonError1 = OASJsonError.getExample();
        OASJsonError jsonError2 = jsonError1;
        OASJsonError jsonError3 = new OASJsonError();
        OASJsonError jsonError4 = jsonError3;

        System.assert(jsonError1.equals(jsonError2));
        System.assert(jsonError2.equals(jsonError1));
        System.assert(jsonError1.equals(jsonError1));
        System.assert(jsonError3.equals(jsonError4));
        System.assert(jsonError4.equals(jsonError3));
        System.assert(jsonError3.equals(jsonError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASJsonError jsonError1 = OASJsonError.getExample();
        OASJsonError jsonError2 = OASJsonError.getExample();
        OASJsonError jsonError3 = new OASJsonError();
        OASJsonError jsonError4 = new OASJsonError();

        System.assert(jsonError1.equals(jsonError2));
        System.assert(jsonError2.equals(jsonError1));
        System.assert(jsonError3.equals(jsonError4));
        System.assert(jsonError4.equals(jsonError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASJsonError jsonError1 = OASJsonError.getExample();
        OASJsonError jsonError2 = new OASJsonError();

        System.assertEquals(false, jsonError1.equals('foo'));
        System.assertEquals(false, jsonError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASJsonError jsonError1 = OASJsonError.getExample();
        OASJsonError jsonError2 = new OASJsonError();
        OASJsonError jsonError3;

        System.assertEquals(false, jsonError1.equals(jsonError3));
        System.assertEquals(false, jsonError2.equals(jsonError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASJsonError jsonError1 = OASJsonError.getExample();
        OASJsonError jsonError2 = new OASJsonError();

        System.assertEquals(jsonError1.hashCode(), jsonError1.hashCode());
        System.assertEquals(jsonError2.hashCode(), jsonError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASJsonError jsonError1 = OASJsonError.getExample();
        OASJsonError jsonError2 = OASJsonError.getExample();
        OASJsonError jsonError3 = new OASJsonError();
        OASJsonError jsonError4 = new OASJsonError();

        System.assert(jsonError1.equals(jsonError2));
        System.assert(jsonError3.equals(jsonError4));
        System.assertEquals(jsonError1.hashCode(), jsonError2.hashCode());
        System.assertEquals(jsonError3.hashCode(), jsonError4.hashCode());
    }
}
