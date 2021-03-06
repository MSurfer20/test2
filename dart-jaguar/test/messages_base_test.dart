import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for MessagesBase
void main() {
  var instance = new MessagesBase();

  group('test MessagesBase', () {
    // The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. 
    // String avatarUrl (default value: null)
    test('to test the property `avatarUrl`', () async {
      // TODO
    });

    // A Zulip \"client\" string, describing what Zulip client sent the message. 
    // String client (default value: null)
    test('to test the property `client`', () async {
      // TODO
    });

    // The content/body of the message. 
    // String content (default value: null)
    test('to test the property `content`', () async {
      // TODO
    });

    // The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. 
    // String contentType (default value: null)
    test('to test the property `contentType`', () async {
      // TODO
    });

    // Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
    // OneOfstringarray displayRecipient (default value: null)
    test('to test the property `displayRecipient`', () async {
      // TODO
    });

    // The unique message ID.  Messages should always be displayed sorted by ID. 
    // int id (default value: null)
    test('to test the property `id`', () async {
      // TODO
    });

    // Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
    // bool isMeMessage (default value: null)
    test('to test the property `isMeMessage`', () async {
      // TODO
    });

    // Data on any reactions to the message. 
    // List<EmojiReaction> reactions (default value: const [])
    test('to test the property `reactions`', () async {
      // TODO
    });

    // A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
    // int recipientId (default value: null)
    test('to test the property `recipientId`', () async {
      // TODO
    });

    // The Zulip display email address of the message's sender. 
    // String senderEmail (default value: null)
    test('to test the property `senderEmail`', () async {
      // TODO
    });

    // The full name of the message's sender. 
    // String senderFullName (default value: null)
    test('to test the property `senderFullName`', () async {
      // TODO
    });

    // The user ID of the message's sender. 
    // int senderId (default value: null)
    test('to test the property `senderId`', () async {
      // TODO
    });

    // A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. 
    // String senderRealmStr (default value: null)
    test('to test the property `senderRealmStr`', () async {
      // TODO
    });

    // Only present for stream messages; the ID of the stream. 
    // int streamId (default value: null)
    test('to test the property `streamId`', () async {
      // TODO
    });

    // The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. 
    // String subject (default value: null)
    test('to test the property `subject`', () async {
      // TODO
    });

    // Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. 
    // List<MessagesBaseTopicLinks> topicLinks (default value: const [])
    test('to test the property `topicLinks`', () async {
      // TODO
    });

    // Data used for certain experimental Zulip integrations. 
    // List<String> submessages (default value: const [])
    test('to test the property `submessages`', () async {
      // TODO
    });

    // The UNIX timestamp for when the message was sent, in UTC seconds. 
    // int timestamp (default value: null)
    test('to test the property `timestamp`', () async {
      // TODO
    });

    // The type of the message: `stream` or `private`. 
    // String type (default value: null)
    test('to test the property `type`', () async {
      // TODO
    });


  });

}
