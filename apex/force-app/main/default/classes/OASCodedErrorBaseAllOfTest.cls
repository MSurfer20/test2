@isTest
private class OASCodedErrorBaseAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASCodedErrorBaseAllOf codedErrorBaseAllOf1 = OASCodedErrorBaseAllOf.getExample();
        OASCodedErrorBaseAllOf codedErrorBaseAllOf2 = codedErrorBaseAllOf1;
        OASCodedErrorBaseAllOf codedErrorBaseAllOf3 = new OASCodedErrorBaseAllOf();
        OASCodedErrorBaseAllOf codedErrorBaseAllOf4 = codedErrorBaseAllOf3;

        System.assert(codedErrorBaseAllOf1.equals(codedErrorBaseAllOf2));
        System.assert(codedErrorBaseAllOf2.equals(codedErrorBaseAllOf1));
        System.assert(codedErrorBaseAllOf1.equals(codedErrorBaseAllOf1));
        System.assert(codedErrorBaseAllOf3.equals(codedErrorBaseAllOf4));
        System.assert(codedErrorBaseAllOf4.equals(codedErrorBaseAllOf3));
        System.assert(codedErrorBaseAllOf3.equals(codedErrorBaseAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCodedErrorBaseAllOf codedErrorBaseAllOf1 = OASCodedErrorBaseAllOf.getExample();
        OASCodedErrorBaseAllOf codedErrorBaseAllOf2 = OASCodedErrorBaseAllOf.getExample();
        OASCodedErrorBaseAllOf codedErrorBaseAllOf3 = new OASCodedErrorBaseAllOf();
        OASCodedErrorBaseAllOf codedErrorBaseAllOf4 = new OASCodedErrorBaseAllOf();

        System.assert(codedErrorBaseAllOf1.equals(codedErrorBaseAllOf2));
        System.assert(codedErrorBaseAllOf2.equals(codedErrorBaseAllOf1));
        System.assert(codedErrorBaseAllOf3.equals(codedErrorBaseAllOf4));
        System.assert(codedErrorBaseAllOf4.equals(codedErrorBaseAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCodedErrorBaseAllOf codedErrorBaseAllOf1 = OASCodedErrorBaseAllOf.getExample();
        OASCodedErrorBaseAllOf codedErrorBaseAllOf2 = new OASCodedErrorBaseAllOf();

        System.assertEquals(false, codedErrorBaseAllOf1.equals('foo'));
        System.assertEquals(false, codedErrorBaseAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCodedErrorBaseAllOf codedErrorBaseAllOf1 = OASCodedErrorBaseAllOf.getExample();
        OASCodedErrorBaseAllOf codedErrorBaseAllOf2 = new OASCodedErrorBaseAllOf();
        OASCodedErrorBaseAllOf codedErrorBaseAllOf3;

        System.assertEquals(false, codedErrorBaseAllOf1.equals(codedErrorBaseAllOf3));
        System.assertEquals(false, codedErrorBaseAllOf2.equals(codedErrorBaseAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCodedErrorBaseAllOf codedErrorBaseAllOf1 = OASCodedErrorBaseAllOf.getExample();
        OASCodedErrorBaseAllOf codedErrorBaseAllOf2 = new OASCodedErrorBaseAllOf();

        System.assertEquals(codedErrorBaseAllOf1.hashCode(), codedErrorBaseAllOf1.hashCode());
        System.assertEquals(codedErrorBaseAllOf2.hashCode(), codedErrorBaseAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCodedErrorBaseAllOf codedErrorBaseAllOf1 = OASCodedErrorBaseAllOf.getExample();
        OASCodedErrorBaseAllOf codedErrorBaseAllOf2 = OASCodedErrorBaseAllOf.getExample();
        OASCodedErrorBaseAllOf codedErrorBaseAllOf3 = new OASCodedErrorBaseAllOf();
        OASCodedErrorBaseAllOf codedErrorBaseAllOf4 = new OASCodedErrorBaseAllOf();

        System.assert(codedErrorBaseAllOf1.equals(codedErrorBaseAllOf2));
        System.assert(codedErrorBaseAllOf3.equals(codedErrorBaseAllOf4));
        System.assertEquals(codedErrorBaseAllOf1.hashCode(), codedErrorBaseAllOf2.hashCode());
        System.assertEquals(codedErrorBaseAllOf3.hashCode(), codedErrorBaseAllOf4.hashCode());
    }
}
