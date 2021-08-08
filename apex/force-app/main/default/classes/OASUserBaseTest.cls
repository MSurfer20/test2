@isTest
private class OASUserBaseTest {
    @isTest
    private static void equalsSameInstance() {
        OASUserBase userBase1 = OASUserBase.getExample();
        OASUserBase userBase2 = userBase1;
        OASUserBase userBase3 = new OASUserBase();
        OASUserBase userBase4 = userBase3;

        System.assert(userBase1.equals(userBase2));
        System.assert(userBase2.equals(userBase1));
        System.assert(userBase1.equals(userBase1));
        System.assert(userBase3.equals(userBase4));
        System.assert(userBase4.equals(userBase3));
        System.assert(userBase3.equals(userBase3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUserBase userBase1 = OASUserBase.getExample();
        OASUserBase userBase2 = OASUserBase.getExample();
        OASUserBase userBase3 = new OASUserBase();
        OASUserBase userBase4 = new OASUserBase();

        System.assert(userBase1.equals(userBase2));
        System.assert(userBase2.equals(userBase1));
        System.assert(userBase3.equals(userBase4));
        System.assert(userBase4.equals(userBase3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUserBase userBase1 = OASUserBase.getExample();
        OASUserBase userBase2 = new OASUserBase();

        System.assertEquals(false, userBase1.equals('foo'));
        System.assertEquals(false, userBase2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUserBase userBase1 = OASUserBase.getExample();
        OASUserBase userBase2 = new OASUserBase();
        OASUserBase userBase3;

        System.assertEquals(false, userBase1.equals(userBase3));
        System.assertEquals(false, userBase2.equals(userBase3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUserBase userBase1 = OASUserBase.getExample();
        OASUserBase userBase2 = new OASUserBase();

        System.assertEquals(userBase1.hashCode(), userBase1.hashCode());
        System.assertEquals(userBase2.hashCode(), userBase2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUserBase userBase1 = OASUserBase.getExample();
        OASUserBase userBase2 = OASUserBase.getExample();
        OASUserBase userBase3 = new OASUserBase();
        OASUserBase userBase4 = new OASUserBase();

        System.assert(userBase1.equals(userBase2));
        System.assert(userBase3.equals(userBase4));
        System.assertEquals(userBase1.hashCode(), userBase2.hashCode());
        System.assertEquals(userBase3.hashCode(), userBase4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUserBase userBase = new OASUserBase();
        Map<String, String> x-property-mappings = userBase.getx-property-mappings();
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

    @isTest
    private static void defaultValuesPopulated() {
        OASUserBase userBase = new OASUserBase();
        System.assertEquals(new Map<String, Object>(), userBase.profileData);
        System.assertEquals(null, userBase.email);
        System.assertEquals(null, userBase.isBot);
        System.assertEquals(null, userBase.avatarUrl);
        System.assertEquals(null, userBase.avatarVersion);
        System.assertEquals(null, userBase.fullName);
        System.assertEquals(null, userBase.isAdmin);
        System.assertEquals(null, userBase.isOwner);
        System.assertEquals(null, userBase.isBillingAdmin);
        System.assertEquals(null, userBase.role);
        System.assertEquals(null, userBase.botType);
        System.assertEquals(null, userBase.userId);
        System.assertEquals(null, userBase.botOwnerId);
        System.assertEquals(null, userBase.isActive);
        System.assertEquals(null, userBase.isGuest);
        System.assertEquals(null, userBase.timezone);
        System.assertEquals(null, userBase.dateJoined);
        System.assertEquals(null, userBase.deliveryEmail);
    }
}
