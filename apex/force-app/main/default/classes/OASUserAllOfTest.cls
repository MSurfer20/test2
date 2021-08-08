@isTest
private class OASUserAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASUserAllOf userAllOf1 = OASUserAllOf.getExample();
        OASUserAllOf userAllOf2 = userAllOf1;
        OASUserAllOf userAllOf3 = new OASUserAllOf();
        OASUserAllOf userAllOf4 = userAllOf3;

        System.assert(userAllOf1.equals(userAllOf2));
        System.assert(userAllOf2.equals(userAllOf1));
        System.assert(userAllOf1.equals(userAllOf1));
        System.assert(userAllOf3.equals(userAllOf4));
        System.assert(userAllOf4.equals(userAllOf3));
        System.assert(userAllOf3.equals(userAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUserAllOf userAllOf1 = OASUserAllOf.getExample();
        OASUserAllOf userAllOf2 = OASUserAllOf.getExample();
        OASUserAllOf userAllOf3 = new OASUserAllOf();
        OASUserAllOf userAllOf4 = new OASUserAllOf();

        System.assert(userAllOf1.equals(userAllOf2));
        System.assert(userAllOf2.equals(userAllOf1));
        System.assert(userAllOf3.equals(userAllOf4));
        System.assert(userAllOf4.equals(userAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUserAllOf userAllOf1 = OASUserAllOf.getExample();
        OASUserAllOf userAllOf2 = new OASUserAllOf();

        System.assertEquals(false, userAllOf1.equals('foo'));
        System.assertEquals(false, userAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUserAllOf userAllOf1 = OASUserAllOf.getExample();
        OASUserAllOf userAllOf2 = new OASUserAllOf();
        OASUserAllOf userAllOf3;

        System.assertEquals(false, userAllOf1.equals(userAllOf3));
        System.assertEquals(false, userAllOf2.equals(userAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUserAllOf userAllOf1 = OASUserAllOf.getExample();
        OASUserAllOf userAllOf2 = new OASUserAllOf();

        System.assertEquals(userAllOf1.hashCode(), userAllOf1.hashCode());
        System.assertEquals(userAllOf2.hashCode(), userAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUserAllOf userAllOf1 = OASUserAllOf.getExample();
        OASUserAllOf userAllOf2 = OASUserAllOf.getExample();
        OASUserAllOf userAllOf3 = new OASUserAllOf();
        OASUserAllOf userAllOf4 = new OASUserAllOf();

        System.assert(userAllOf1.equals(userAllOf2));
        System.assert(userAllOf3.equals(userAllOf4));
        System.assertEquals(userAllOf1.hashCode(), userAllOf2.hashCode());
        System.assertEquals(userAllOf3.hashCode(), userAllOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUserAllOf userAllOf = new OASUserAllOf();
        Map<String, String> x-property-mappings = userAllOf.getx-property-mappings();
        System.assertEquals('isBot', x-property-mappings.get('is_bot'));
        System.assertEquals('avatarUrl', x-property-mappings.get('avatar_url'));
        System.assertEquals('avatarVersion', x-property-mappings.get('avatar_version'));
        System.assertEquals('fullName', x-property-mappings.get('full_name'));
        System.assertEquals('isAdmin', x-property-mappings.get('is_admin'));
        System.assertEquals('isOwner', x-property-mappings.get('is_owner'));
        System.assertEquals('isBillingAdmin', x-property-mappings.get('is_billing_admin'));
        System.assertEquals('botType', x-property-mappings.get('bot_type'));
        System.assertEquals('userId', x-property-mappings.get('user_id'));
        System.assertEquals('botOwnerId', x-property-mappings.get('bot_owner_id'));
        System.assertEquals('isActive', x-property-mappings.get('is_active'));
        System.assertEquals('isGuest', x-property-mappings.get('is_guest'));
        System.assertEquals('dateJoined', x-property-mappings.get('date_joined'));
        System.assertEquals('deliveryEmail', x-property-mappings.get('delivery_email'));
        System.assertEquals('profileData', x-property-mappings.get('profile_data'));
    }
}
