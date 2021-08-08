@isTest
private class OASJsonSuccessAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASJsonSuccessAllOf jsonSuccessAllOf1 = OASJsonSuccessAllOf.getExample();
        OASJsonSuccessAllOf jsonSuccessAllOf2 = jsonSuccessAllOf1;
        OASJsonSuccessAllOf jsonSuccessAllOf3 = new OASJsonSuccessAllOf();
        OASJsonSuccessAllOf jsonSuccessAllOf4 = jsonSuccessAllOf3;

        System.assert(jsonSuccessAllOf1.equals(jsonSuccessAllOf2));
        System.assert(jsonSuccessAllOf2.equals(jsonSuccessAllOf1));
        System.assert(jsonSuccessAllOf1.equals(jsonSuccessAllOf1));
        System.assert(jsonSuccessAllOf3.equals(jsonSuccessAllOf4));
        System.assert(jsonSuccessAllOf4.equals(jsonSuccessAllOf3));
        System.assert(jsonSuccessAllOf3.equals(jsonSuccessAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASJsonSuccessAllOf jsonSuccessAllOf1 = OASJsonSuccessAllOf.getExample();
        OASJsonSuccessAllOf jsonSuccessAllOf2 = OASJsonSuccessAllOf.getExample();
        OASJsonSuccessAllOf jsonSuccessAllOf3 = new OASJsonSuccessAllOf();
        OASJsonSuccessAllOf jsonSuccessAllOf4 = new OASJsonSuccessAllOf();

        System.assert(jsonSuccessAllOf1.equals(jsonSuccessAllOf2));
        System.assert(jsonSuccessAllOf2.equals(jsonSuccessAllOf1));
        System.assert(jsonSuccessAllOf3.equals(jsonSuccessAllOf4));
        System.assert(jsonSuccessAllOf4.equals(jsonSuccessAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASJsonSuccessAllOf jsonSuccessAllOf1 = OASJsonSuccessAllOf.getExample();
        OASJsonSuccessAllOf jsonSuccessAllOf2 = new OASJsonSuccessAllOf();

        System.assertEquals(false, jsonSuccessAllOf1.equals('foo'));
        System.assertEquals(false, jsonSuccessAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASJsonSuccessAllOf jsonSuccessAllOf1 = OASJsonSuccessAllOf.getExample();
        OASJsonSuccessAllOf jsonSuccessAllOf2 = new OASJsonSuccessAllOf();
        OASJsonSuccessAllOf jsonSuccessAllOf3;

        System.assertEquals(false, jsonSuccessAllOf1.equals(jsonSuccessAllOf3));
        System.assertEquals(false, jsonSuccessAllOf2.equals(jsonSuccessAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASJsonSuccessAllOf jsonSuccessAllOf1 = OASJsonSuccessAllOf.getExample();
        OASJsonSuccessAllOf jsonSuccessAllOf2 = new OASJsonSuccessAllOf();

        System.assertEquals(jsonSuccessAllOf1.hashCode(), jsonSuccessAllOf1.hashCode());
        System.assertEquals(jsonSuccessAllOf2.hashCode(), jsonSuccessAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASJsonSuccessAllOf jsonSuccessAllOf1 = OASJsonSuccessAllOf.getExample();
        OASJsonSuccessAllOf jsonSuccessAllOf2 = OASJsonSuccessAllOf.getExample();
        OASJsonSuccessAllOf jsonSuccessAllOf3 = new OASJsonSuccessAllOf();
        OASJsonSuccessAllOf jsonSuccessAllOf4 = new OASJsonSuccessAllOf();

        System.assert(jsonSuccessAllOf1.equals(jsonSuccessAllOf2));
        System.assert(jsonSuccessAllOf3.equals(jsonSuccessAllOf4));
        System.assertEquals(jsonSuccessAllOf1.hashCode(), jsonSuccessAllOf2.hashCode());
        System.assertEquals(jsonSuccessAllOf3.hashCode(), jsonSuccessAllOf4.hashCode());
    }
}
