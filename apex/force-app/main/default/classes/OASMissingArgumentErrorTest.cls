@isTest
private class OASMissingArgumentErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASMissingArgumentError missingArgumentError1 = OASMissingArgumentError.getExample();
        OASMissingArgumentError missingArgumentError2 = missingArgumentError1;
        OASMissingArgumentError missingArgumentError3 = new OASMissingArgumentError();
        OASMissingArgumentError missingArgumentError4 = missingArgumentError3;

        System.assert(missingArgumentError1.equals(missingArgumentError2));
        System.assert(missingArgumentError2.equals(missingArgumentError1));
        System.assert(missingArgumentError1.equals(missingArgumentError1));
        System.assert(missingArgumentError3.equals(missingArgumentError4));
        System.assert(missingArgumentError4.equals(missingArgumentError3));
        System.assert(missingArgumentError3.equals(missingArgumentError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMissingArgumentError missingArgumentError1 = OASMissingArgumentError.getExample();
        OASMissingArgumentError missingArgumentError2 = OASMissingArgumentError.getExample();
        OASMissingArgumentError missingArgumentError3 = new OASMissingArgumentError();
        OASMissingArgumentError missingArgumentError4 = new OASMissingArgumentError();

        System.assert(missingArgumentError1.equals(missingArgumentError2));
        System.assert(missingArgumentError2.equals(missingArgumentError1));
        System.assert(missingArgumentError3.equals(missingArgumentError4));
        System.assert(missingArgumentError4.equals(missingArgumentError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMissingArgumentError missingArgumentError1 = OASMissingArgumentError.getExample();
        OASMissingArgumentError missingArgumentError2 = new OASMissingArgumentError();

        System.assertEquals(false, missingArgumentError1.equals('foo'));
        System.assertEquals(false, missingArgumentError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMissingArgumentError missingArgumentError1 = OASMissingArgumentError.getExample();
        OASMissingArgumentError missingArgumentError2 = new OASMissingArgumentError();
        OASMissingArgumentError missingArgumentError3;

        System.assertEquals(false, missingArgumentError1.equals(missingArgumentError3));
        System.assertEquals(false, missingArgumentError2.equals(missingArgumentError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMissingArgumentError missingArgumentError1 = OASMissingArgumentError.getExample();
        OASMissingArgumentError missingArgumentError2 = new OASMissingArgumentError();

        System.assertEquals(missingArgumentError1.hashCode(), missingArgumentError1.hashCode());
        System.assertEquals(missingArgumentError2.hashCode(), missingArgumentError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMissingArgumentError missingArgumentError1 = OASMissingArgumentError.getExample();
        OASMissingArgumentError missingArgumentError2 = OASMissingArgumentError.getExample();
        OASMissingArgumentError missingArgumentError3 = new OASMissingArgumentError();
        OASMissingArgumentError missingArgumentError4 = new OASMissingArgumentError();

        System.assert(missingArgumentError1.equals(missingArgumentError2));
        System.assert(missingArgumentError3.equals(missingArgumentError4));
        System.assertEquals(missingArgumentError1.hashCode(), missingArgumentError2.hashCode());
        System.assertEquals(missingArgumentError3.hashCode(), missingArgumentError4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMissingArgumentError missingArgumentError = new OASMissingArgumentError();
        Map<String, String> x-property-mappings = missingArgumentError.getx-property-mappings();
        System.assertEquals('varName', x-property-mappings.get('var_name'));
    }
}
