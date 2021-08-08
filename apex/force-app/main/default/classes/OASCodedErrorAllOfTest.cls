@isTest
private class OASCodedErrorAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASCodedErrorAllOf codedErrorAllOf1 = OASCodedErrorAllOf.getExample();
        OASCodedErrorAllOf codedErrorAllOf2 = codedErrorAllOf1;
        OASCodedErrorAllOf codedErrorAllOf3 = new OASCodedErrorAllOf();
        OASCodedErrorAllOf codedErrorAllOf4 = codedErrorAllOf3;

        System.assert(codedErrorAllOf1.equals(codedErrorAllOf2));
        System.assert(codedErrorAllOf2.equals(codedErrorAllOf1));
        System.assert(codedErrorAllOf1.equals(codedErrorAllOf1));
        System.assert(codedErrorAllOf3.equals(codedErrorAllOf4));
        System.assert(codedErrorAllOf4.equals(codedErrorAllOf3));
        System.assert(codedErrorAllOf3.equals(codedErrorAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCodedErrorAllOf codedErrorAllOf1 = OASCodedErrorAllOf.getExample();
        OASCodedErrorAllOf codedErrorAllOf2 = OASCodedErrorAllOf.getExample();
        OASCodedErrorAllOf codedErrorAllOf3 = new OASCodedErrorAllOf();
        OASCodedErrorAllOf codedErrorAllOf4 = new OASCodedErrorAllOf();

        System.assert(codedErrorAllOf1.equals(codedErrorAllOf2));
        System.assert(codedErrorAllOf2.equals(codedErrorAllOf1));
        System.assert(codedErrorAllOf3.equals(codedErrorAllOf4));
        System.assert(codedErrorAllOf4.equals(codedErrorAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCodedErrorAllOf codedErrorAllOf1 = OASCodedErrorAllOf.getExample();
        OASCodedErrorAllOf codedErrorAllOf2 = new OASCodedErrorAllOf();

        System.assertEquals(false, codedErrorAllOf1.equals('foo'));
        System.assertEquals(false, codedErrorAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCodedErrorAllOf codedErrorAllOf1 = OASCodedErrorAllOf.getExample();
        OASCodedErrorAllOf codedErrorAllOf2 = new OASCodedErrorAllOf();
        OASCodedErrorAllOf codedErrorAllOf3;

        System.assertEquals(false, codedErrorAllOf1.equals(codedErrorAllOf3));
        System.assertEquals(false, codedErrorAllOf2.equals(codedErrorAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCodedErrorAllOf codedErrorAllOf1 = OASCodedErrorAllOf.getExample();
        OASCodedErrorAllOf codedErrorAllOf2 = new OASCodedErrorAllOf();

        System.assertEquals(codedErrorAllOf1.hashCode(), codedErrorAllOf1.hashCode());
        System.assertEquals(codedErrorAllOf2.hashCode(), codedErrorAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCodedErrorAllOf codedErrorAllOf1 = OASCodedErrorAllOf.getExample();
        OASCodedErrorAllOf codedErrorAllOf2 = OASCodedErrorAllOf.getExample();
        OASCodedErrorAllOf codedErrorAllOf3 = new OASCodedErrorAllOf();
        OASCodedErrorAllOf codedErrorAllOf4 = new OASCodedErrorAllOf();

        System.assert(codedErrorAllOf1.equals(codedErrorAllOf2));
        System.assert(codedErrorAllOf3.equals(codedErrorAllOf4));
        System.assertEquals(codedErrorAllOf1.hashCode(), codedErrorAllOf2.hashCode());
        System.assertEquals(codedErrorAllOf3.hashCode(), codedErrorAllOf4.hashCode());
    }
}
