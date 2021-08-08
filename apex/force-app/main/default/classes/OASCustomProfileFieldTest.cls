@isTest
private class OASCustomProfileFieldTest {
    @isTest
    private static void equalsSameInstance() {
        OASCustomProfileField customProfileField1 = OASCustomProfileField.getExample();
        OASCustomProfileField customProfileField2 = customProfileField1;
        OASCustomProfileField customProfileField3 = new OASCustomProfileField();
        OASCustomProfileField customProfileField4 = customProfileField3;

        System.assert(customProfileField1.equals(customProfileField2));
        System.assert(customProfileField2.equals(customProfileField1));
        System.assert(customProfileField1.equals(customProfileField1));
        System.assert(customProfileField3.equals(customProfileField4));
        System.assert(customProfileField4.equals(customProfileField3));
        System.assert(customProfileField3.equals(customProfileField3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCustomProfileField customProfileField1 = OASCustomProfileField.getExample();
        OASCustomProfileField customProfileField2 = OASCustomProfileField.getExample();
        OASCustomProfileField customProfileField3 = new OASCustomProfileField();
        OASCustomProfileField customProfileField4 = new OASCustomProfileField();

        System.assert(customProfileField1.equals(customProfileField2));
        System.assert(customProfileField2.equals(customProfileField1));
        System.assert(customProfileField3.equals(customProfileField4));
        System.assert(customProfileField4.equals(customProfileField3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCustomProfileField customProfileField1 = OASCustomProfileField.getExample();
        OASCustomProfileField customProfileField2 = new OASCustomProfileField();

        System.assertEquals(false, customProfileField1.equals('foo'));
        System.assertEquals(false, customProfileField2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCustomProfileField customProfileField1 = OASCustomProfileField.getExample();
        OASCustomProfileField customProfileField2 = new OASCustomProfileField();
        OASCustomProfileField customProfileField3;

        System.assertEquals(false, customProfileField1.equals(customProfileField3));
        System.assertEquals(false, customProfileField2.equals(customProfileField3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCustomProfileField customProfileField1 = OASCustomProfileField.getExample();
        OASCustomProfileField customProfileField2 = new OASCustomProfileField();

        System.assertEquals(customProfileField1.hashCode(), customProfileField1.hashCode());
        System.assertEquals(customProfileField2.hashCode(), customProfileField2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCustomProfileField customProfileField1 = OASCustomProfileField.getExample();
        OASCustomProfileField customProfileField2 = OASCustomProfileField.getExample();
        OASCustomProfileField customProfileField3 = new OASCustomProfileField();
        OASCustomProfileField customProfileField4 = new OASCustomProfileField();

        System.assert(customProfileField1.equals(customProfileField2));
        System.assert(customProfileField3.equals(customProfileField4));
        System.assertEquals(customProfileField1.hashCode(), customProfileField2.hashCode());
        System.assertEquals(customProfileField3.hashCode(), customProfileField4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCustomProfileField customProfileField = new OASCustomProfileField();
        Map<String, String> x-property-mappings = customProfileField.getx-property-mappings();
        System.assertEquals('r_hint', x-property-mappings.get('hint'));
        System.assertEquals('fieldData', x-property-mappings.get('field_data'));
    }
}
