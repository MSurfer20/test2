@isTest
private class OASRealmExportTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealmExport realmExport1 = OASRealmExport.getExample();
        OASRealmExport realmExport2 = realmExport1;
        OASRealmExport realmExport3 = new OASRealmExport();
        OASRealmExport realmExport4 = realmExport3;

        System.assert(realmExport1.equals(realmExport2));
        System.assert(realmExport2.equals(realmExport1));
        System.assert(realmExport1.equals(realmExport1));
        System.assert(realmExport3.equals(realmExport4));
        System.assert(realmExport4.equals(realmExport3));
        System.assert(realmExport3.equals(realmExport3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealmExport realmExport1 = OASRealmExport.getExample();
        OASRealmExport realmExport2 = OASRealmExport.getExample();
        OASRealmExport realmExport3 = new OASRealmExport();
        OASRealmExport realmExport4 = new OASRealmExport();

        System.assert(realmExport1.equals(realmExport2));
        System.assert(realmExport2.equals(realmExport1));
        System.assert(realmExport3.equals(realmExport4));
        System.assert(realmExport4.equals(realmExport3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealmExport realmExport1 = OASRealmExport.getExample();
        OASRealmExport realmExport2 = new OASRealmExport();

        System.assertEquals(false, realmExport1.equals('foo'));
        System.assertEquals(false, realmExport2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealmExport realmExport1 = OASRealmExport.getExample();
        OASRealmExport realmExport2 = new OASRealmExport();
        OASRealmExport realmExport3;

        System.assertEquals(false, realmExport1.equals(realmExport3));
        System.assertEquals(false, realmExport2.equals(realmExport3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealmExport realmExport1 = OASRealmExport.getExample();
        OASRealmExport realmExport2 = new OASRealmExport();

        System.assertEquals(realmExport1.hashCode(), realmExport1.hashCode());
        System.assertEquals(realmExport2.hashCode(), realmExport2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealmExport realmExport1 = OASRealmExport.getExample();
        OASRealmExport realmExport2 = OASRealmExport.getExample();
        OASRealmExport realmExport3 = new OASRealmExport();
        OASRealmExport realmExport4 = new OASRealmExport();

        System.assert(realmExport1.equals(realmExport2));
        System.assert(realmExport3.equals(realmExport4));
        System.assertEquals(realmExport1.hashCode(), realmExport2.hashCode());
        System.assertEquals(realmExport3.hashCode(), realmExport4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealmExport realmExport = new OASRealmExport();
        Map<String, String> x-property-mappings = realmExport.getx-property-mappings();
        System.assertEquals('actingUserId', x-property-mappings.get('acting_user_id'));
        System.assertEquals('exportTime', x-property-mappings.get('export_time'));
        System.assertEquals('deletedTimestamp', x-property-mappings.get('deleted_timestamp'));
        System.assertEquals('failedTimestamp', x-property-mappings.get('failed_timestamp'));
        System.assertEquals('exportUrl', x-property-mappings.get('export_url'));
    }
}
