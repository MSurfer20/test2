@isTest
private class OASJsonErrorBaseAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASJsonErrorBaseAllOf jsonErrorBaseAllOf1 = OASJsonErrorBaseAllOf.getExample();
        OASJsonErrorBaseAllOf jsonErrorBaseAllOf2 = jsonErrorBaseAllOf1;
        OASJsonErrorBaseAllOf jsonErrorBaseAllOf3 = new OASJsonErrorBaseAllOf();
        OASJsonErrorBaseAllOf jsonErrorBaseAllOf4 = jsonErrorBaseAllOf3;

        System.assert(jsonErrorBaseAllOf1.equals(jsonErrorBaseAllOf2));
        System.assert(jsonErrorBaseAllOf2.equals(jsonErrorBaseAllOf1));
        System.assert(jsonErrorBaseAllOf1.equals(jsonErrorBaseAllOf1));
        System.assert(jsonErrorBaseAllOf3.equals(jsonErrorBaseAllOf4));
        System.assert(jsonErrorBaseAllOf4.equals(jsonErrorBaseAllOf3));
        System.assert(jsonErrorBaseAllOf3.equals(jsonErrorBaseAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASJsonErrorBaseAllOf jsonErrorBaseAllOf1 = OASJsonErrorBaseAllOf.getExample();
        OASJsonErrorBaseAllOf jsonErrorBaseAllOf2 = OASJsonErrorBaseAllOf.getExample();
        OASJsonErrorBaseAllOf jsonErrorBaseAllOf3 = new OASJsonErrorBaseAllOf();
        OASJsonErrorBaseAllOf jsonErrorBaseAllOf4 = new OASJsonErrorBaseAllOf();

        System.assert(jsonErrorBaseAllOf1.equals(jsonErrorBaseAllOf2));
        System.assert(jsonErrorBaseAllOf2.equals(jsonErrorBaseAllOf1));
        System.assert(jsonErrorBaseAllOf3.equals(jsonErrorBaseAllOf4));
        System.assert(jsonErrorBaseAllOf4.equals(jsonErrorBaseAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASJsonErrorBaseAllOf jsonErrorBaseAllOf1 = OASJsonErrorBaseAllOf.getExample();
        OASJsonErrorBaseAllOf jsonErrorBaseAllOf2 = new OASJsonErrorBaseAllOf();

        System.assertEquals(false, jsonErrorBaseAllOf1.equals('foo'));
        System.assertEquals(false, jsonErrorBaseAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASJsonErrorBaseAllOf jsonErrorBaseAllOf1 = OASJsonErrorBaseAllOf.getExample();
        OASJsonErrorBaseAllOf jsonErrorBaseAllOf2 = new OASJsonErrorBaseAllOf();
        OASJsonErrorBaseAllOf jsonErrorBaseAllOf3;

        System.assertEquals(false, jsonErrorBaseAllOf1.equals(jsonErrorBaseAllOf3));
        System.assertEquals(false, jsonErrorBaseAllOf2.equals(jsonErrorBaseAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASJsonErrorBaseAllOf jsonErrorBaseAllOf1 = OASJsonErrorBaseAllOf.getExample();
        OASJsonErrorBaseAllOf jsonErrorBaseAllOf2 = new OASJsonErrorBaseAllOf();

        System.assertEquals(jsonErrorBaseAllOf1.hashCode(), jsonErrorBaseAllOf1.hashCode());
        System.assertEquals(jsonErrorBaseAllOf2.hashCode(), jsonErrorBaseAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASJsonErrorBaseAllOf jsonErrorBaseAllOf1 = OASJsonErrorBaseAllOf.getExample();
        OASJsonErrorBaseAllOf jsonErrorBaseAllOf2 = OASJsonErrorBaseAllOf.getExample();
        OASJsonErrorBaseAllOf jsonErrorBaseAllOf3 = new OASJsonErrorBaseAllOf();
        OASJsonErrorBaseAllOf jsonErrorBaseAllOf4 = new OASJsonErrorBaseAllOf();

        System.assert(jsonErrorBaseAllOf1.equals(jsonErrorBaseAllOf2));
        System.assert(jsonErrorBaseAllOf3.equals(jsonErrorBaseAllOf4));
        System.assertEquals(jsonErrorBaseAllOf1.hashCode(), jsonErrorBaseAllOf2.hashCode());
        System.assertEquals(jsonErrorBaseAllOf3.hashCode(), jsonErrorBaseAllOf4.hashCode());
    }
}
