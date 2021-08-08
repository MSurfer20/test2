@isTest
private class OASRealmDomainTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealmDomain realmDomain1 = OASRealmDomain.getExample();
        OASRealmDomain realmDomain2 = realmDomain1;
        OASRealmDomain realmDomain3 = new OASRealmDomain();
        OASRealmDomain realmDomain4 = realmDomain3;

        System.assert(realmDomain1.equals(realmDomain2));
        System.assert(realmDomain2.equals(realmDomain1));
        System.assert(realmDomain1.equals(realmDomain1));
        System.assert(realmDomain3.equals(realmDomain4));
        System.assert(realmDomain4.equals(realmDomain3));
        System.assert(realmDomain3.equals(realmDomain3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealmDomain realmDomain1 = OASRealmDomain.getExample();
        OASRealmDomain realmDomain2 = OASRealmDomain.getExample();
        OASRealmDomain realmDomain3 = new OASRealmDomain();
        OASRealmDomain realmDomain4 = new OASRealmDomain();

        System.assert(realmDomain1.equals(realmDomain2));
        System.assert(realmDomain2.equals(realmDomain1));
        System.assert(realmDomain3.equals(realmDomain4));
        System.assert(realmDomain4.equals(realmDomain3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealmDomain realmDomain1 = OASRealmDomain.getExample();
        OASRealmDomain realmDomain2 = new OASRealmDomain();

        System.assertEquals(false, realmDomain1.equals('foo'));
        System.assertEquals(false, realmDomain2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealmDomain realmDomain1 = OASRealmDomain.getExample();
        OASRealmDomain realmDomain2 = new OASRealmDomain();
        OASRealmDomain realmDomain3;

        System.assertEquals(false, realmDomain1.equals(realmDomain3));
        System.assertEquals(false, realmDomain2.equals(realmDomain3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealmDomain realmDomain1 = OASRealmDomain.getExample();
        OASRealmDomain realmDomain2 = new OASRealmDomain();

        System.assertEquals(realmDomain1.hashCode(), realmDomain1.hashCode());
        System.assertEquals(realmDomain2.hashCode(), realmDomain2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealmDomain realmDomain1 = OASRealmDomain.getExample();
        OASRealmDomain realmDomain2 = OASRealmDomain.getExample();
        OASRealmDomain realmDomain3 = new OASRealmDomain();
        OASRealmDomain realmDomain4 = new OASRealmDomain();

        System.assert(realmDomain1.equals(realmDomain2));
        System.assert(realmDomain3.equals(realmDomain4));
        System.assertEquals(realmDomain1.hashCode(), realmDomain2.hashCode());
        System.assertEquals(realmDomain3.hashCode(), realmDomain4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealmDomain realmDomain = new OASRealmDomain();
        Map<String, String> x-property-mappings = realmDomain.getx-property-mappings();
        System.assertEquals('allowSubdomains', x-property-mappings.get('allow_subdomains'));
    }
}
