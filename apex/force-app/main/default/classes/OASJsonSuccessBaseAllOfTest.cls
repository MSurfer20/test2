@isTest
private class OASJsonSuccessBaseAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASJsonSuccessBaseAllOf jsonSuccessBaseAllOf1 = OASJsonSuccessBaseAllOf.getExample();
        OASJsonSuccessBaseAllOf jsonSuccessBaseAllOf2 = jsonSuccessBaseAllOf1;
        OASJsonSuccessBaseAllOf jsonSuccessBaseAllOf3 = new OASJsonSuccessBaseAllOf();
        OASJsonSuccessBaseAllOf jsonSuccessBaseAllOf4 = jsonSuccessBaseAllOf3;

        System.assert(jsonSuccessBaseAllOf1.equals(jsonSuccessBaseAllOf2));
        System.assert(jsonSuccessBaseAllOf2.equals(jsonSuccessBaseAllOf1));
        System.assert(jsonSuccessBaseAllOf1.equals(jsonSuccessBaseAllOf1));
        System.assert(jsonSuccessBaseAllOf3.equals(jsonSuccessBaseAllOf4));
        System.assert(jsonSuccessBaseAllOf4.equals(jsonSuccessBaseAllOf3));
        System.assert(jsonSuccessBaseAllOf3.equals(jsonSuccessBaseAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASJsonSuccessBaseAllOf jsonSuccessBaseAllOf1 = OASJsonSuccessBaseAllOf.getExample();
        OASJsonSuccessBaseAllOf jsonSuccessBaseAllOf2 = OASJsonSuccessBaseAllOf.getExample();
        OASJsonSuccessBaseAllOf jsonSuccessBaseAllOf3 = new OASJsonSuccessBaseAllOf();
        OASJsonSuccessBaseAllOf jsonSuccessBaseAllOf4 = new OASJsonSuccessBaseAllOf();

        System.assert(jsonSuccessBaseAllOf1.equals(jsonSuccessBaseAllOf2));
        System.assert(jsonSuccessBaseAllOf2.equals(jsonSuccessBaseAllOf1));
        System.assert(jsonSuccessBaseAllOf3.equals(jsonSuccessBaseAllOf4));
        System.assert(jsonSuccessBaseAllOf4.equals(jsonSuccessBaseAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASJsonSuccessBaseAllOf jsonSuccessBaseAllOf1 = OASJsonSuccessBaseAllOf.getExample();
        OASJsonSuccessBaseAllOf jsonSuccessBaseAllOf2 = new OASJsonSuccessBaseAllOf();

        System.assertEquals(false, jsonSuccessBaseAllOf1.equals('foo'));
        System.assertEquals(false, jsonSuccessBaseAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASJsonSuccessBaseAllOf jsonSuccessBaseAllOf1 = OASJsonSuccessBaseAllOf.getExample();
        OASJsonSuccessBaseAllOf jsonSuccessBaseAllOf2 = new OASJsonSuccessBaseAllOf();
        OASJsonSuccessBaseAllOf jsonSuccessBaseAllOf3;

        System.assertEquals(false, jsonSuccessBaseAllOf1.equals(jsonSuccessBaseAllOf3));
        System.assertEquals(false, jsonSuccessBaseAllOf2.equals(jsonSuccessBaseAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASJsonSuccessBaseAllOf jsonSuccessBaseAllOf1 = OASJsonSuccessBaseAllOf.getExample();
        OASJsonSuccessBaseAllOf jsonSuccessBaseAllOf2 = new OASJsonSuccessBaseAllOf();

        System.assertEquals(jsonSuccessBaseAllOf1.hashCode(), jsonSuccessBaseAllOf1.hashCode());
        System.assertEquals(jsonSuccessBaseAllOf2.hashCode(), jsonSuccessBaseAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASJsonSuccessBaseAllOf jsonSuccessBaseAllOf1 = OASJsonSuccessBaseAllOf.getExample();
        OASJsonSuccessBaseAllOf jsonSuccessBaseAllOf2 = OASJsonSuccessBaseAllOf.getExample();
        OASJsonSuccessBaseAllOf jsonSuccessBaseAllOf3 = new OASJsonSuccessBaseAllOf();
        OASJsonSuccessBaseAllOf jsonSuccessBaseAllOf4 = new OASJsonSuccessBaseAllOf();

        System.assert(jsonSuccessBaseAllOf1.equals(jsonSuccessBaseAllOf2));
        System.assert(jsonSuccessBaseAllOf3.equals(jsonSuccessBaseAllOf4));
        System.assertEquals(jsonSuccessBaseAllOf1.hashCode(), jsonSuccessBaseAllOf2.hashCode());
        System.assertEquals(jsonSuccessBaseAllOf3.hashCode(), jsonSuccessBaseAllOf4.hashCode());
    }
}
