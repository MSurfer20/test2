@isTest
private class OASDefaultStreamGroupTest {
    @isTest
    private static void equalsSameInstance() {
        OASDefaultStreamGroup defaultStreamGroup1 = OASDefaultStreamGroup.getExample();
        OASDefaultStreamGroup defaultStreamGroup2 = defaultStreamGroup1;
        OASDefaultStreamGroup defaultStreamGroup3 = new OASDefaultStreamGroup();
        OASDefaultStreamGroup defaultStreamGroup4 = defaultStreamGroup3;

        System.assert(defaultStreamGroup1.equals(defaultStreamGroup2));
        System.assert(defaultStreamGroup2.equals(defaultStreamGroup1));
        System.assert(defaultStreamGroup1.equals(defaultStreamGroup1));
        System.assert(defaultStreamGroup3.equals(defaultStreamGroup4));
        System.assert(defaultStreamGroup4.equals(defaultStreamGroup3));
        System.assert(defaultStreamGroup3.equals(defaultStreamGroup3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDefaultStreamGroup defaultStreamGroup1 = OASDefaultStreamGroup.getExample();
        OASDefaultStreamGroup defaultStreamGroup2 = OASDefaultStreamGroup.getExample();
        OASDefaultStreamGroup defaultStreamGroup3 = new OASDefaultStreamGroup();
        OASDefaultStreamGroup defaultStreamGroup4 = new OASDefaultStreamGroup();

        System.assert(defaultStreamGroup1.equals(defaultStreamGroup2));
        System.assert(defaultStreamGroup2.equals(defaultStreamGroup1));
        System.assert(defaultStreamGroup3.equals(defaultStreamGroup4));
        System.assert(defaultStreamGroup4.equals(defaultStreamGroup3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDefaultStreamGroup defaultStreamGroup1 = OASDefaultStreamGroup.getExample();
        OASDefaultStreamGroup defaultStreamGroup2 = new OASDefaultStreamGroup();

        System.assertEquals(false, defaultStreamGroup1.equals('foo'));
        System.assertEquals(false, defaultStreamGroup2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDefaultStreamGroup defaultStreamGroup1 = OASDefaultStreamGroup.getExample();
        OASDefaultStreamGroup defaultStreamGroup2 = new OASDefaultStreamGroup();
        OASDefaultStreamGroup defaultStreamGroup3;

        System.assertEquals(false, defaultStreamGroup1.equals(defaultStreamGroup3));
        System.assertEquals(false, defaultStreamGroup2.equals(defaultStreamGroup3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDefaultStreamGroup defaultStreamGroup1 = OASDefaultStreamGroup.getExample();
        OASDefaultStreamGroup defaultStreamGroup2 = new OASDefaultStreamGroup();

        System.assertEquals(defaultStreamGroup1.hashCode(), defaultStreamGroup1.hashCode());
        System.assertEquals(defaultStreamGroup2.hashCode(), defaultStreamGroup2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDefaultStreamGroup defaultStreamGroup1 = OASDefaultStreamGroup.getExample();
        OASDefaultStreamGroup defaultStreamGroup2 = OASDefaultStreamGroup.getExample();
        OASDefaultStreamGroup defaultStreamGroup3 = new OASDefaultStreamGroup();
        OASDefaultStreamGroup defaultStreamGroup4 = new OASDefaultStreamGroup();

        System.assert(defaultStreamGroup1.equals(defaultStreamGroup2));
        System.assert(defaultStreamGroup3.equals(defaultStreamGroup4));
        System.assertEquals(defaultStreamGroup1.hashCode(), defaultStreamGroup2.hashCode());
        System.assertEquals(defaultStreamGroup3.hashCode(), defaultStreamGroup4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDefaultStreamGroup defaultStreamGroup = new OASDefaultStreamGroup();
        System.assertEquals(new List<OASBasicStream>(), defaultStreamGroup.streams);
        System.assertEquals(null, defaultStreamGroup.name);
        System.assertEquals(null, defaultStreamGroup.description);
        System.assertEquals(null, defaultStreamGroup.id);
    }
}
