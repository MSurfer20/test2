@isTest
private class OASHotspotTest {
    @isTest
    private static void equalsSameInstance() {
        OASHotspot hotspot1 = OASHotspot.getExample();
        OASHotspot hotspot2 = hotspot1;
        OASHotspot hotspot3 = new OASHotspot();
        OASHotspot hotspot4 = hotspot3;

        System.assert(hotspot1.equals(hotspot2));
        System.assert(hotspot2.equals(hotspot1));
        System.assert(hotspot1.equals(hotspot1));
        System.assert(hotspot3.equals(hotspot4));
        System.assert(hotspot4.equals(hotspot3));
        System.assert(hotspot3.equals(hotspot3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASHotspot hotspot1 = OASHotspot.getExample();
        OASHotspot hotspot2 = OASHotspot.getExample();
        OASHotspot hotspot3 = new OASHotspot();
        OASHotspot hotspot4 = new OASHotspot();

        System.assert(hotspot1.equals(hotspot2));
        System.assert(hotspot2.equals(hotspot1));
        System.assert(hotspot3.equals(hotspot4));
        System.assert(hotspot4.equals(hotspot3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASHotspot hotspot1 = OASHotspot.getExample();
        OASHotspot hotspot2 = new OASHotspot();

        System.assertEquals(false, hotspot1.equals('foo'));
        System.assertEquals(false, hotspot2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASHotspot hotspot1 = OASHotspot.getExample();
        OASHotspot hotspot2 = new OASHotspot();
        OASHotspot hotspot3;

        System.assertEquals(false, hotspot1.equals(hotspot3));
        System.assertEquals(false, hotspot2.equals(hotspot3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASHotspot hotspot1 = OASHotspot.getExample();
        OASHotspot hotspot2 = new OASHotspot();

        System.assertEquals(hotspot1.hashCode(), hotspot1.hashCode());
        System.assertEquals(hotspot2.hashCode(), hotspot2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASHotspot hotspot1 = OASHotspot.getExample();
        OASHotspot hotspot2 = OASHotspot.getExample();
        OASHotspot hotspot3 = new OASHotspot();
        OASHotspot hotspot4 = new OASHotspot();

        System.assert(hotspot1.equals(hotspot2));
        System.assert(hotspot3.equals(hotspot4));
        System.assertEquals(hotspot1.hashCode(), hotspot2.hashCode());
        System.assertEquals(hotspot3.hashCode(), hotspot4.hashCode());
    }
}
