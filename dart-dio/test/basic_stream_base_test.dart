//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:openapi/model/basic_stream_base.dart';
import 'package:test/test.dart';

// tests for BasicStreamBase
void main() {
  final instance = BasicStreamBaseBuilder();
  // TODO add properties to the builder and call build()

  group(BasicStreamBase, () {
    // The unique ID of the stream. 
    // int streamId
    test('to test the property `streamId`', () async {
      // TODO
    });

    // The name of the stream. 
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
    // String description
    test('to test the property `description`', () async {
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

    // The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
    // String renderedDescription
    test('to test the property `renderedDescription`', () async {
      // TODO
    });

    // Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
    // bool isWebPublic
    test('to test the property `isWebPublic`', () async {
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

    // Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
    // bool isAnnouncementOnly
    test('to test the property `isAnnouncementOnly`', () async {
      // TODO
    });


  });

}
