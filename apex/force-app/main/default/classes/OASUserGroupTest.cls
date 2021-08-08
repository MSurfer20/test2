@isTest
private class OASUserGroupTest {
    @isTest
    private static void equalsSameInstance() {
        OASUserGroup userGroup1 = OASUserGroup.getExample();
        OASUserGroup userGroup2 = userGroup1;
        OASUserGroup userGroup3 = new OASUserGroup();
        OASUserGroup userGroup4 = userGroup3;

        System.assert(userGroup1.equals(userGroup2));
        System.assert(userGroup2.equals(userGroup1));
        System.assert(userGroup1.equals(userGroup1));
        System.assert(userGroup3.equals(userGroup4));
        System.assert(userGroup4.equals(userGroup3));
        System.assert(userGroup3.equals(userGroup3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUserGroup userGroup1 = OASUserGroup.getExample();
        OASUserGroup userGroup2 = OASUserGroup.getExample();
        OASUserGroup userGroup3 = new OASUserGroup();
        OASUserGroup userGroup4 = new OASUserGroup();

        System.assert(userGroup1.equals(userGroup2));
        System.assert(userGroup2.equals(userGroup1));
        System.assert(userGroup3.equals(userGroup4));
        System.assert(userGroup4.equals(userGroup3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUserGroup userGroup1 = OASUserGroup.getExample();
        OASUserGroup userGroup2 = new OASUserGroup();

        System.assertEquals(false, userGroup1.equals('foo'));
        System.assertEquals(false, userGroup2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUserGroup userGroup1 = OASUserGroup.getExample();
        OASUserGroup userGroup2 = new OASUserGroup();
        OASUserGroup userGroup3;

        System.assertEquals(false, userGroup1.equals(userGroup3));
        System.assertEquals(false, userGroup2.equals(userGroup3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUserGroup userGroup1 = OASUserGroup.getExample();
        OASUserGroup userGroup2 = new OASUserGroup();

        System.assertEquals(userGroup1.hashCode(), userGroup1.hashCode());
        System.assertEquals(userGroup2.hashCode(), userGroup2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUserGroup userGroup1 = OASUserGroup.getExample();
        OASUserGroup userGroup2 = OASUserGroup.getExample();
        OASUserGroup userGroup3 = new OASUserGroup();
        OASUserGroup userGroup4 = new OASUserGroup();

        System.assert(userGroup1.equals(userGroup2));
        System.assert(userGroup3.equals(userGroup4));
        System.assertEquals(userGroup1.hashCode(), userGroup2.hashCode());
        System.assertEquals(userGroup3.hashCode(), userGroup4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUserGroup userGroup = new OASUserGroup();
        System.assertEquals(new List<Integer>(), userGroup.members);
        System.assertEquals(null, userGroup.name);
        System.assertEquals(null, userGroup.description);
        System.assertEquals(null, userGroup.id);
    }
}
