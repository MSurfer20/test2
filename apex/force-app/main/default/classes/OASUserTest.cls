@isTest
private class OASUserTest {
    @isTest
    private static void equalsSameInstance() {
        OASUser user1 = OASUser.getExample();
        OASUser user2 = user1;
        OASUser user3 = new OASUser();
        OASUser user4 = user3;

        System.assert(user1.equals(user2));
        System.assert(user2.equals(user1));
        System.assert(user1.equals(user1));
        System.assert(user3.equals(user4));
        System.assert(user4.equals(user3));
        System.assert(user3.equals(user3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUser user1 = OASUser.getExample();
        OASUser user2 = OASUser.getExample();
        OASUser user3 = new OASUser();
        OASUser user4 = new OASUser();

        System.assert(user1.equals(user2));
        System.assert(user2.equals(user1));
        System.assert(user3.equals(user4));
        System.assert(user4.equals(user3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUser user1 = OASUser.getExample();
        OASUser user2 = new OASUser();

        System.assertEquals(false, user1.equals('foo'));
        System.assertEquals(false, user2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUser user1 = OASUser.getExample();
        OASUser user2 = new OASUser();
        OASUser user3;

        System.assertEquals(false, user1.equals(user3));
        System.assertEquals(false, user2.equals(user3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUser user1 = OASUser.getExample();
        OASUser user2 = new OASUser();

        System.assertEquals(user1.hashCode(), user1.hashCode());
        System.assertEquals(user2.hashCode(), user2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUser user1 = OASUser.getExample();
        OASUser user2 = OASUser.getExample();
        OASUser user3 = new OASUser();
        OASUser user4 = new OASUser();

        System.assert(user1.equals(user2));
        System.assert(user3.equals(user4));
        System.assertEquals(user1.hashCode(), user2.hashCode());
        System.assertEquals(user3.hashCode(), user4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUser user = new OASUser();
        Map<String, String> x-property-mappings = user.getx-property-mappings();
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