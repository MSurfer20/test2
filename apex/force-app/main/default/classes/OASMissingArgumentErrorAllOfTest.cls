@isTest
private class OASMissingArgumentErrorAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASMissingArgumentErrorAllOf missingArgumentErrorAllOf1 = OASMissingArgumentErrorAllOf.getExample();
        OASMissingArgumentErrorAllOf missingArgumentErrorAllOf2 = missingArgumentErrorAllOf1;
        OASMissingArgumentErrorAllOf missingArgumentErrorAllOf3 = new OASMissingArgumentErrorAllOf();
        OASMissingArgumentErrorAllOf missingArgumentErrorAllOf4 = missingArgumentErrorAllOf3;

        System.assert(missingArgumentErrorAllOf1.equals(missingArgumentErrorAllOf2));
        System.assert(missingArgumentErrorAllOf2.equals(missingArgumentErrorAllOf1));
        System.assert(missingArgumentErrorAllOf1.equals(missingArgumentErrorAllOf1));
        System.assert(missingArgumentErrorAllOf3.equals(missingArgumentErrorAllOf4));
        System.assert(missingArgumentErrorAllOf4.equals(missingArgumentErrorAllOf3));
        System.assert(missingArgumentErrorAllOf3.equals(missingArgumentErrorAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMissingArgumentErrorAllOf missingArgumentErrorAllOf1 = OASMissingArgumentErrorAllOf.getExample();
        OASMissingArgumentErrorAllOf missingArgumentErrorAllOf2 = OASMissingArgumentErrorAllOf.getExample();
        OASMissingArgumentErrorAllOf missingArgumentErrorAllOf3 = new OASMissingArgumentErrorAllOf();
        OASMissingArgumentErrorAllOf missingArgumentErrorAllOf4 = new OASMissingArgumentErrorAllOf();

        System.assert(missingArgumentErrorAllOf1.equals(missingArgumentErrorAllOf2));
        System.assert(missingArgumentErrorAllOf2.equals(missingArgumentErrorAllOf1));
        System.assert(missingArgumentErrorAllOf3.equals(missingArgumentErrorAllOf4));
        System.assert(missingArgumentErrorAllOf4.equals(missingArgumentErrorAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMissingArgumentErrorAllOf missingArgumentErrorAllOf1 = OASMissingArgumentErrorAllOf.getExample();
        OASMissingArgumentErrorAllOf missingArgumentErrorAllOf2 = new OASMissingArgumentErrorAllOf();

        System.assertEquals(false, missingArgumentErrorAllOf1.equals('foo'));
        System.assertEquals(false, missingArgumentErrorAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMissingArgumentErrorAllOf missingArgumentErrorAllOf1 = OASMissingArgumentErrorAllOf.getExample();
        OASMissingArgumentErrorAllOf missingArgumentErrorAllOf2 = new OASMissingArgumentErrorAllOf();
        OASMissingArgumentErrorAllOf missingArgumentErrorAllOf3;

        System.assertEquals(false, missingArgumentErrorAllOf1.equals(missingArgumentErrorAllOf3));
        System.assertEquals(false, missingArgumentErrorAllOf2.equals(missingArgumentErrorAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMissingArgumentErrorAllOf missingArgumentErrorAllOf1 = OASMissingArgumentErrorAllOf.getExample();
        OASMissingArgumentErrorAllOf missingArgumentErrorAllOf2 = new OASMissingArgumentErrorAllOf();

        System.assertEquals(missingArgumentErrorAllOf1.hashCode(), missingArgumentErrorAllOf1.hashCode());
        System.assertEquals(missingArgumentErrorAllOf2.hashCode(), missingArgumentErrorAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMissingArgumentErrorAllOf missingArgumentErrorAllOf1 = OASMissingArgumentErrorAllOf.getExample();
        OASMissingArgumentErrorAllOf missingArgumentErrorAllOf2 = OASMissingArgumentErrorAllOf.getExample();
        OASMissingArgumentErrorAllOf missingArgumentErrorAllOf3 = new OASMissingArgumentErrorAllOf();
        OASMissingArgumentErrorAllOf missingArgumentErrorAllOf4 = new OASMissingArgumentErrorAllOf();

        System.assert(missingArgumentErrorAllOf1.equals(missingArgumentErrorAllOf2));
        System.assert(missingArgumentErrorAllOf3.equals(missingArgumentErrorAllOf4));
        System.assertEquals(missingArgumentErrorAllOf1.hashCode(), missingArgumentErrorAllOf2.hashCode());
        System.assertEquals(missingArgumentErrorAllOf3.hashCode(), missingArgumentErrorAllOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMissingArgumentErrorAllOf missingArgumentErrorAllOf = new OASMissingArgumentErrorAllOf();
        Map<String, String> x-property-mappings = missingArgumentErrorAllOf.getx-property-mappings();
        System.assertEquals('varName', x-property-mappings.get('var_name'));
    }
}
