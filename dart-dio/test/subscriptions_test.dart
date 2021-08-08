//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:openapi/model/subscriptions.dart';
import 'package:test/test.dart';

// tests for Subscriptions
void main() {
  final instance = SubscriptionsBuilder();
  // TODO add properties to the builder and call build()

  group(Subscriptions, () {
    // The unique ID of a stream. 
    // int streamId
    test('to test the property `streamId`', () async {
      // TODO
    });

    // The name of a stream. 
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
    // String description
    test('to test the property `description`', () async {
      // TODO
    });

    // A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
    // String renderedDescription
    test('to test the property `renderedDescription`', () async {
      // TODO
    });

    // The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
    // int dateCreated
    test('to test the property `dateCreated`', () async {
      // TODO
    });

    // Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
    // bool inviteOnly
    test('to test the property `inviteOnly`', () async {
      // TODO
    });

    // A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`. 
    // BuiltList<int> subscribers
    test('to test the property `subscribers`', () async {
      // TODO
    });

    // A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. 
    // bool desktopNotifications
    test('to test the property `desktopNotifications`', () async {
      // TODO
    });

    // A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. 
    // bool emailNotifications
    test('to test the property `emailNotifications`', () async {
      // TODO
    });

    // A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. 
    // bool wildcardMentionsNotify
    test('to test the property `wildcardMentionsNotify`', () async {
      // TODO
    });

    // A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. 
    // bool pushNotifications
    test('to test the property `pushNotifications`', () async {
      // TODO
    });

    // A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. 
    // bool audibleNotifications
    test('to test the property `audibleNotifications`', () async {
      // TODO
    });

    // A boolean specifying whether the given stream has been pinned to the top. 
    // bool pinToTop
    test('to test the property `pinToTop`', () async {
      // TODO
    });

    // Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). 
    // String emailAddress
    test('to test the property `emailAddress`', () async {
      // TODO
    });

    // Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`). 
    // bool isMuted
    test('to test the property `isMuted`', () async {
      // TODO
    });

    // Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. 
    // bool inHomeView
    test('to test the property `inHomeView`', () async {
      // TODO
    });

    // Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
    // bool isAnnouncementOnly
    test('to test the property `isAnnouncementOnly`', () async {
      // TODO
    });

    // Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
    // bool isWebPublic
    test('to test the property `isWebPublic`', () async {
      // TODO
    });

    // The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
    // int role
    test('to test the property `role`', () async {
      // TODO
    });

    // The user's personal color for the stream. 
    // String color
    test('to test the property `color`', () async {
      // TODO
    });

    // Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
    // int streamPostPolicy
    test('to test the property `streamPostPolicy`', () async {
      // TODO
    });

    // Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
    // int messageRetentionDays
    test('to test the property `messageRetentionDays`', () async {
      // TODO
    });

    // Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
    // bool historyPublicToSubscribers
    test('to test the property `historyPublicToSubscribers`', () async {
      // TODO
    });

    // The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
    // int firstMessageId
    test('to test the property `firstMessageId`', () async {
      // TODO
    });

    // The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. 
    // int streamWeeklyTraffic
    test('to test the property `streamWeeklyTraffic`', () async {
      // TODO
    });


  });

}
