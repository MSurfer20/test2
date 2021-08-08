@isTest
private class OASSubscriptionsTest {
    @isTest
    private static void equalsSameInstance() {
        OASSubscriptions subscriptions1 = OASSubscriptions.getExample();
        OASSubscriptions subscriptions2 = subscriptions1;
        OASSubscriptions subscriptions3 = new OASSubscriptions();
        OASSubscriptions subscriptions4 = subscriptions3;

        System.assert(subscriptions1.equals(subscriptions2));
        System.assert(subscriptions2.equals(subscriptions1));
        System.assert(subscriptions1.equals(subscriptions1));
        System.assert(subscriptions3.equals(subscriptions4));
        System.assert(subscriptions4.equals(subscriptions3));
        System.assert(subscriptions3.equals(subscriptions3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSubscriptions subscriptions1 = OASSubscriptions.getExample();
        OASSubscriptions subscriptions2 = OASSubscriptions.getExample();
        OASSubscriptions subscriptions3 = new OASSubscriptions();
        OASSubscriptions subscriptions4 = new OASSubscriptions();

        System.assert(subscriptions1.equals(subscriptions2));
        System.assert(subscriptions2.equals(subscriptions1));
        System.assert(subscriptions3.equals(subscriptions4));
        System.assert(subscriptions4.equals(subscriptions3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSubscriptions subscriptions1 = OASSubscriptions.getExample();
        OASSubscriptions subscriptions2 = new OASSubscriptions();

        System.assertEquals(false, subscriptions1.equals('foo'));
        System.assertEquals(false, subscriptions2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSubscriptions subscriptions1 = OASSubscriptions.getExample();
        OASSubscriptions subscriptions2 = new OASSubscriptions();
        OASSubscriptions subscriptions3;

        System.assertEquals(false, subscriptions1.equals(subscriptions3));
        System.assertEquals(false, subscriptions2.equals(subscriptions3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSubscriptions subscriptions1 = OASSubscriptions.getExample();
        OASSubscriptions subscriptions2 = new OASSubscriptions();

        System.assertEquals(subscriptions1.hashCode(), subscriptions1.hashCode());
        System.assertEquals(subscriptions2.hashCode(), subscriptions2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSubscriptions subscriptions1 = OASSubscriptions.getExample();
        OASSubscriptions subscriptions2 = OASSubscriptions.getExample();
        OASSubscriptions subscriptions3 = new OASSubscriptions();
        OASSubscriptions subscriptions4 = new OASSubscriptions();

        System.assert(subscriptions1.equals(subscriptions2));
        System.assert(subscriptions3.equals(subscriptions4));
        System.assertEquals(subscriptions1.hashCode(), subscriptions2.hashCode());
        System.assertEquals(subscriptions3.hashCode(), subscriptions4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSubscriptions subscriptions = new OASSubscriptions();
        Map<String, String> x-property-mappings = subscriptions.getx-property-mappings();
        System.assertEquals('streamId', x-property-mappings.get('stream_id'));
        System.assertEquals('renderedDescription', x-property-mappings.get('rendered_description'));
        System.assertEquals('dateCreated', x-property-mappings.get('date_created'));
        System.assertEquals('inviteOnly', x-property-mappings.get('invite_only'));
        System.assertEquals('desktopNotifications', x-property-mappings.get('desktop_notifications'));
        System.assertEquals('emailNotifications', x-property-mappings.get('email_notifications'));
        System.assertEquals('wildcardMentionsNotify', x-property-mappings.get('wildcard_mentions_notify'));
        System.assertEquals('pushNotifications', x-property-mappings.get('push_notifications'));
        System.assertEquals('audibleNotifications', x-property-mappings.get('audible_notifications'));
        System.assertEquals('pinToTop', x-property-mappings.get('pin_to_top'));
        System.assertEquals('emailAddress', x-property-mappings.get('email_address'));
        System.assertEquals('isMuted', x-property-mappings.get('is_muted'));
        System.assertEquals('inHomeView', x-property-mappings.get('in_home_view'));
        System.assertEquals('isAnnouncementOnly', x-property-mappings.get('is_announcement_only'));
        System.assertEquals('isWebPublic', x-property-mappings.get('is_web_public'));
        System.assertEquals('streamPostPolicy', x-property-mappings.get('stream_post_policy'));
        System.assertEquals('messageRetentionDays', x-property-mappings.get('message_retention_days'));
        System.assertEquals('historyPublicToSubscribers', x-property-mappings.get('history_public_to_subscribers'));
        System.assertEquals('firstMessageId', x-property-mappings.get('first_message_id'));
        System.assertEquals('streamWeeklyTraffic', x-property-mappings.get('stream_weekly_traffic'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSubscriptions subscriptions = new OASSubscriptions();
        System.assertEquals(new List<Integer>(), subscriptions.subscribers);
        System.assertEquals(null, subscriptions.streamId);
        System.assertEquals(null, subscriptions.name);
        System.assertEquals(null, subscriptions.description);
        System.assertEquals(null, subscriptions.renderedDescription);
        System.assertEquals(null, subscriptions.dateCreated);
        System.assertEquals(null, subscriptions.inviteOnly);
        System.assertEquals(null, subscriptions.desktopNotifications);
        System.assertEquals(null, subscriptions.emailNotifications);
        System.assertEquals(null, subscriptions.wildcardMentionsNotify);
        System.assertEquals(null, subscriptions.pushNotifications);
        System.assertEquals(null, subscriptions.audibleNotifications);
        System.assertEquals(null, subscriptions.pinToTop);
        System.assertEquals(null, subscriptions.emailAddress);
        System.assertEquals(null, subscriptions.isMuted);
        System.assertEquals(null, subscriptions.inHomeView);
        System.assertEquals(null, subscriptions.isAnnouncementOnly);
        System.assertEquals(null, subscriptions.isWebPublic);
        System.assertEquals(null, subscriptions.role);
        System.assertEquals(null, subscriptions.color);
        System.assertEquals(null, subscriptions.streamPostPolicy);
        System.assertEquals(null, subscriptions.messageRetentionDays);
        System.assertEquals(null, subscriptions.historyPublicToSubscribers);
        System.assertEquals(null, subscriptions.firstMessageId);
        System.assertEquals(null, subscriptions.streamWeeklyTraffic);
    }
}
