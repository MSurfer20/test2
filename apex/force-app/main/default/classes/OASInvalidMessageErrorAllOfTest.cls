@isTest
private class OASInvalidMessageErrorAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASInvalidMessageErrorAllOf invalidMessageErrorAllOf1 = OASInvalidMessageErrorAllOf.getExample();
        OASInvalidMessageErrorAllOf invalidMessageErrorAllOf2 = invalidMessageErrorAllOf1;
        OASInvalidMessageErrorAllOf invalidMessageErrorAllOf3 = new OASInvalidMessageErrorAllOf();
        OASInvalidMessageErrorAllOf invalidMessageErrorAllOf4 = invalidMessageErrorAllOf3;

        System.assert(invalidMessageErrorAllOf1.equals(invalidMessageErrorAllOf2));
        System.assert(invalidMessageErrorAllOf2.equals(invalidMessageErrorAllOf1));
        System.assert(invalidMessageErrorAllOf1.equals(invalidMessageErrorAllOf1));
        System.assert(invalidMessageErrorAllOf3.equals(invalidMessageErrorAllOf4));
        System.assert(invalidMessageErrorAllOf4.equals(invalidMessageErrorAllOf3));
        System.assert(invalidMessageErrorAllOf3.equals(invalidMessageErrorAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInvalidMessageErrorAllOf invalidMessageErrorAllOf1 = OASInvalidMessageErrorAllOf.getExample();
        OASInvalidMessageErrorAllOf invalidMessageErrorAllOf2 = OASInvalidMessageErrorAllOf.getExample();
        OASInvalidMessageErrorAllOf invalidMessageErrorAllOf3 = new OASInvalidMessageErrorAllOf();
        OASInvalidMessageErrorAllOf invalidMessageErrorAllOf4 = new OASInvalidMessageErrorAllOf();

        System.assert(invalidMessageErrorAllOf1.equals(invalidMessageErrorAllOf2));
        System.assert(invalidMessageErrorAllOf2.equals(invalidMessageErrorAllOf1));
        System.assert(invalidMessageErrorAllOf3.equals(invalidMessageErrorAllOf4));
        System.assert(invalidMessageErrorAllOf4.equals(invalidMessageErrorAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInvalidMessageErrorAllOf invalidMessageErrorAllOf1 = OASInvalidMessageErrorAllOf.getExample();
        OASInvalidMessageErrorAllOf invalidMessageErrorAllOf2 = new OASInvalidMessageErrorAllOf();

        System.assertEquals(false, invalidMessageErrorAllOf1.equals('foo'));
        System.assertEquals(false, invalidMessageErrorAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInvalidMessageErrorAllOf invalidMessageErrorAllOf1 = OASInvalidMessageErrorAllOf.getExample();
        OASInvalidMessageErrorAllOf invalidMessageErrorAllOf2 = new OASInvalidMessageErrorAllOf();
        OASInvalidMessageErrorAllOf invalidMessageErrorAllOf3;

        System.assertEquals(false, invalidMessageErrorAllOf1.equals(invalidMessageErrorAllOf3));
        System.assertEquals(false, invalidMessageErrorAllOf2.equals(invalidMessageErrorAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInvalidMessageErrorAllOf invalidMessageErrorAllOf1 = OASInvalidMessageErrorAllOf.getExample();
        OASInvalidMessageErrorAllOf invalidMessageErrorAllOf2 = new OASInvalidMessageErrorAllOf();

        System.assertEquals(invalidMessageErrorAllOf1.hashCode(), invalidMessageErrorAllOf1.hashCode());
        System.assertEquals(invalidMessageErrorAllOf2.hashCode(), invalidMessageErrorAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInvalidMessageErrorAllOf invalidMessageErrorAllOf1 = OASInvalidMessageErrorAllOf.getExample();
        OASInvalidMessageErrorAllOf invalidMessageErrorAllOf2 = OASInvalidMessageErrorAllOf.getExample();
        OASInvalidMessageErrorAllOf invalidMessageErrorAllOf3 = new OASInvalidMessageErrorAllOf();
        OASInvalidMessageErrorAllOf invalidMessageErrorAllOf4 = new OASInvalidMessageErrorAllOf();

        System.assert(invalidMessageErrorAllOf1.equals(invalidMessageErrorAllOf2));
        System.assert(invalidMessageErrorAllOf3.equals(invalidMessageErrorAllOf4));
        System.assertEquals(invalidMessageErrorAllOf1.hashCode(), invalidMessageErrorAllOf2.hashCode());
        System.assertEquals(invalidMessageErrorAllOf3.hashCode(), invalidMessageErrorAllOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASInvalidMessageErrorAllOf invalidMessageErrorAllOf = new OASInvalidMessageErrorAllOf();
        Map<String, String> x-property-mappings = invalidMessageErrorAllOf.getx-property-mappings();
        System.assertEquals('rawContent', x-property-mappings.get('raw_content'));
    }
}
