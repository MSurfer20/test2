//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';


/// tests for MessagesApi
void main() {
  final instance = MessagesApi();

  group('tests for MessagesApi', () {
    // Add an emoji reaction
    //
    // Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` 
    //
    //Future<JsonSuccess> addReaction(int messageId, String emojiName, { String emojiCode, String reactionType }) async
    test('test addReaction', () async {
      // TODO
    });

    // Check if messages match a narrow
    //
    // Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. 
    //
    //Future<Object> checkMessagesMatchNarrow(List<int> msgIds, List<Object> narrow) async
    test('test checkMessagesMatchNarrow', () async {
      // TODO
    });

    // Delete a message
    //
    // Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
    //
    //Future<JsonSuccess> deleteMessage(int messageId) async
    test('test deleteMessage', () async {
      // TODO
    });

    // Get public temporary URL
    //
    // Get a temporary URL for access to the file that doesn't require authentication. 
    //
    //Future<JsonSuccessBase> getFileTemporaryUrl(int realmIdStr, String filename) async
    test('test getFileTemporaryUrl', () async {
      // TODO
    });

    // Get a message's edit history
    //
    // Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
    //
    //Future<JsonSuccessBase> getMessageHistory(int messageId) async
    test('test getMessageHistory', () async {
      // TODO
    });

    // Get messages
    //
    // Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
    //
    //Future<JsonSuccessBase> getMessages(int numBefore, int numAfter, { OneOfstringinteger anchor, List<Object> narrow, bool clientGravatar, bool applyMarkdown, bool useFirstUnreadAnchor }) async
    test('test getMessages', () async {
      // TODO
    });

    // Get a message's raw Markdown
    //
    // Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). 
    //
    //Future<JsonSuccessBase> getRawMessage(int messageId) async
    test('test getRawMessage', () async {
      // TODO
    });

    // Mark all messages as read
    //
    // Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` 
    //
    //Future<JsonSuccess> markAllAsRead() async
    test('test markAllAsRead', () async {
      // TODO
    });

    // Mark messages in a stream as read
    //
    // Mark all the unread messages in a stream as read. 
    //
    //Future<JsonSuccess> markStreamAsRead(int streamId) async
    test('test markStreamAsRead', () async {
      // TODO
    });

    // Mark messages in a topic as read
    //
    // Mark all the unread messages in a topic as read. 
    //
    //Future<JsonSuccess> markTopicAsRead(int streamId, String topicName) async
    test('test markTopicAsRead', () async {
      // TODO
    });

    // Remove an emoji reaction
    //
    // Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` 
    //
    //Future<JsonSuccess> removeReaction(int messageId, { String emojiName, String emojiCode, String reactionType }) async
    test('test removeReaction', () async {
      // TODO
    });

    // Render message
    //
    // Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` 
    //
    //Future<JsonSuccessBase> renderMessage(String content) async
    test('test renderMessage', () async {
      // TODO
    });

    // Send a message
    //
    // Send a stream or a private message.  `POST {{ api_url }}/v1/messages` 
    //
    //Future<JsonSuccessBase> sendMessage(String type, List<int> to, String content, { String topic, String queueId, String localId }) async
    test('test sendMessage', () async {
      // TODO
    });

    // Edit a message
    //
    // Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
    //
    //Future<JsonSuccess> updateMessage(int messageId, { String topic, String propagateMode, bool sendNotificationToOldThread, bool sendNotificationToNewThread, String content, int streamId }) async
    test('test updateMessage', () async {
      // TODO
    });

    // Update personal message flags
    //
    // Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
    //
    //Future<JsonSuccessBase> updateMessageFlags(List<int> messages, String op, String flag) async
    test('test updateMessageFlags', () async {
      // TODO
    });

    // Upload a file
    //
    // Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
    //
    //Future<JsonSuccessBase> uploadFile({ MultipartFile filename }) async
    test('test uploadFile', () async {
      // TODO
    });

  });
}
