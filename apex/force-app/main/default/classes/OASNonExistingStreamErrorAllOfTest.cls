@isTest
private class OASNonExistingStreamErrorAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASNonExistingStreamErrorAllOf nonExistingStreamErrorAllOf1 = OASNonExistingStreamErrorAllOf.getExample();
        OASNonExistingStreamErrorAllOf nonExistingStreamErrorAllOf2 = nonExistingStreamErrorAllOf1;
        OASNonExistingStreamErrorAllOf nonExistingStreamErrorAllOf3 = new OASNonExistingStreamErrorAllOf();
        OASNonExistingStreamErrorAllOf nonExistingStreamErrorAllOf4 = nonExistingStreamErrorAllOf3;

        System.assert(nonExistingStreamErrorAllOf1.equals(nonExistingStreamErrorAllOf2));
        System.assert(nonExistingStreamErrorAllOf2.equals(nonExistingStreamErrorAllOf1));
        System.assert(nonExistingStreamErrorAllOf1.equals(nonExistingStreamErrorAllOf1));
        System.assert(nonExistingStreamErrorAllOf3.equals(nonExistingStreamErrorAllOf4));
        System.assert(nonExistingStreamErrorAllOf4.equals(nonExistingStreamErrorAllOf3));
        System.assert(nonExistingStreamErrorAllOf3.equals(nonExistingStreamErrorAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASNonExistingStreamErrorAllOf nonExistingStreamErrorAllOf1 = OASNonExistingStreamErrorAllOf.getExample();
        OASNonExistingStreamErrorAllOf nonExistingStreamErrorAllOf2 = OASNonExistingStreamErrorAllOf.getExample();
        OASNonExistingStreamErrorAllOf nonExistingStreamErrorAllOf3 = new OASNonExistingStreamErrorAllOf();
        OASNonExistingStreamErrorAllOf nonExistingStreamErrorAllOf4 = new OASNonExistingStreamErrorAllOf();

        System.assert(nonExistingStreamErrorAllOf1.equals(nonExistingStreamErrorAllOf2));
        System.assert(nonExistingStreamErrorAllOf2.equals(nonExistingStreamErrorAllOf1));
        System.assert(nonExistingStreamErrorAllOf3.equals(nonExistingStreamErrorAllOf4));
        System.assert(nonExistingStreamErrorAllOf4.equals(nonExistingStreamErrorAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASNonExistingStreamErrorAllOf nonExistingStreamErrorAllOf1 = OASNonExistingStreamErrorAllOf.getExample();
        OASNonExistingStreamErrorAllOf nonExistingStreamErrorAllOf2 = new OASNonExistingStreamErrorAllOf();

        System.assertEquals(false, nonExistingStreamErrorAllOf1.equals('foo'));
        System.assertEquals(false, nonExistingStreamErrorAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASNonExistingStreamErrorAllOf nonExistingStreamErrorAllOf1 = OASNonExistingStreamErrorAllOf.getExample();
        OASNonExistingStreamErrorAllOf nonExistingStreamErrorAllOf2 = new OASNonExistingStreamErrorAllOf();
        OASNonExistingStreamErrorAllOf nonExistingStreamErrorAllOf3;

        System.assertEquals(false, nonExistingStreamErrorAllOf1.equals(nonExistingStreamErrorAllOf3));
        System.assertEquals(false, nonExistingStreamErrorAllOf2.equals(nonExistingStreamErrorAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASNonExistingStreamErrorAllOf nonExistingStreamErrorAllOf1 = OASNonExistingStreamErrorAllOf.getExample();
        OASNonExistingStreamErrorAllOf nonExistingStreamErrorAllOf2 = new OASNonExistingStreamErrorAllOf();

        System.assertEquals(nonExistingStreamErrorAllOf1.hashCode(), nonExistingStreamErrorAllOf1.hashCode());
        System.assertEquals(nonExistingStreamErrorAllOf2.hashCode(), nonExistingStreamErrorAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASNonExistingStreamErrorAllOf nonExistingStreamErrorAllOf1 = OASNonExistingStreamErrorAllOf.getExample();
        OASNonExistingStreamErrorAllOf nonExistingStreamErrorAllOf2 = OASNonExistingStreamErrorAllOf.getExample();
        OASNonExistingStreamErrorAllOf nonExistingStreamErrorAllOf3 = new OASNonExistingStreamErrorAllOf();
        OASNonExistingStreamErrorAllOf nonExistingStreamErrorAllOf4 = new OASNonExistingStreamErrorAllOf();

        System.assert(nonExistingStreamErrorAllOf1.equals(nonExistingStreamErrorAllOf2));
        System.assert(nonExistingStreamErrorAllOf3.equals(nonExistingStreamErrorAllOf4));
        System.assertEquals(nonExistingStreamErrorAllOf1.hashCode(), nonExistingStreamErrorAllOf2.hashCode());
        System.assertEquals(nonExistingStreamErrorAllOf3.hashCode(), nonExistingStreamErrorAllOf4.hashCode());
    }
}
