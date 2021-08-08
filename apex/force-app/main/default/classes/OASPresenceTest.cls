@isTest
private class OASPresenceTest {
    @isTest
    private static void equalsSameInstance() {
        OASPresence presence1 = OASPresence.getExample();
        OASPresence presence2 = presence1;
        OASPresence presence3 = new OASPresence();
        OASPresence presence4 = presence3;

        System.assert(presence1.equals(presence2));
        System.assert(presence2.equals(presence1));
        System.assert(presence1.equals(presence1));
        System.assert(presence3.equals(presence4));
        System.assert(presence4.equals(presence3));
        System.assert(presence3.equals(presence3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPresence presence1 = OASPresence.getExample();
        OASPresence presence2 = OASPresence.getExample();
        OASPresence presence3 = new OASPresence();
        OASPresence presence4 = new OASPresence();

        System.assert(presence1.equals(presence2));
        System.assert(presence2.equals(presence1));
        System.assert(presence3.equals(presence4));
        System.assert(presence4.equals(presence3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPresence presence1 = OASPresence.getExample();
        OASPresence presence2 = new OASPresence();

        System.assertEquals(false, presence1.equals('foo'));
        System.assertEquals(false, presence2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPresence presence1 = OASPresence.getExample();
        OASPresence presence2 = new OASPresence();
        OASPresence presence3;

        System.assertEquals(false, presence1.equals(presence3));
        System.assertEquals(false, presence2.equals(presence3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPresence presence1 = OASPresence.getExample();
        OASPresence presence2 = new OASPresence();

        System.assertEquals(presence1.hashCode(), presence1.hashCode());
        System.assertEquals(presence2.hashCode(), presence2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPresence presence1 = OASPresence.getExample();
        OASPresence presence2 = OASPresence.getExample();
        OASPresence presence3 = new OASPresence();
        OASPresence presence4 = new OASPresence();

        System.assert(presence1.equals(presence2));
        System.assert(presence3.equals(presence4));
        System.assertEquals(presence1.hashCode(), presence2.hashCode());
        System.assertEquals(presence3.hashCode(), presence4.hashCode());
    }
}
