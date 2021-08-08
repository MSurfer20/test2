import 'package:openapi/api.dart';
import 'package:test/test.dart';


/// tests for StreamsApi
void main() {
  var instance = new StreamsApi();

  group('tests for StreamsApi', () {
    // Archive a stream
    //
    // [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 
    //
    //Future<JsonSuccess> archiveStream(int streamId) async
    test('test archiveStream', () async {
      // TODO
    });

    // Create BigBlueButton video call
    //
    // Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
    //
    //Future<JsonSuccessBase> createBigBlueButtonVideoCall() async
    test('test createBigBlueButtonVideoCall', () async {
      // TODO
    });

    // Delete a topic
    //
    // Delete all messages in a topic.  `POST {{ api_url }}/v1/streams/{stream_id}/delete_topic`  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. 
    //
    //Future<JsonSuccess> deleteTopic(int streamId, String topicName) async
    test('test deleteTopic', () async {
      // TODO
    });

    // Get stream ID
    //
    // Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 
    //
    //Future<JsonSuccessBase> getStreamId(String stream) async
    test('test getStreamId', () async {
      // TODO
    });

    // Get topics in a stream
    //
    // Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 
    //
    //Future<JsonSuccessBase> getStreamTopics(int streamId) async
    test('test getStreamTopics', () async {
      // TODO
    });

    // Get all streams
    //
    // Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 
    //
    //Future<JsonSuccessBase> getStreams({ bool includePublic, bool includeWebPublic, bool includeSubscribed, bool includeAllActive, bool includeDefault, bool includeOwnerSubscribed }) async
    test('test getStreams', () async {
      // TODO
    });

    // Get the subscribers of a stream
    //
    // Get all users subscribed to a stream.  `Get {{ api_url }}/v1/streams/{stream_id}/members` 
    //
    //Future<JsonSuccessBase> getSubscribers(int streamId) async
    test('test getSubscribers', () async {
      // TODO
    });

    // Get subscription status
    //
    // Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 
    //
    //Future<JsonSuccessBase> getSubscriptionStatus(int userId, int streamId) async
    test('test getSubscriptionStatus', () async {
      // TODO
    });

    // Get subscribed streams
    //
    // Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 
    //
    //Future<JsonSuccessBase> getSubscriptions({ bool includeSubscribers }) async
    test('test getSubscriptions', () async {
      // TODO
    });

    // Topic muting
    //
    // This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 
    //
    //Future<JsonSuccess> muteTopic(String topic, String op, { String stream, int streamId }) async
    test('test muteTopic', () async {
      // TODO
    });

    // Subscribe to a stream
    //
    // Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 
    //
    //Future<OneOfobjectobject> subscribe(List<Object> subscriptions, { List<OneOfstringinteger> principals, bool authorizationErrorsFatal, bool announce, bool inviteOnly, bool historyPublicToSubscribers, int streamPostPolicy, OneOfstringinteger messageRetentionDays }) async
    test('test subscribe', () async {
      // TODO
    });

    // Unsubscribe from a stream
    //
    // Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 
    //
    //Future<JsonSuccessBase> unsubscribe(List<String> subscriptions, { List<OneOfstringinteger> principals }) async
    test('test unsubscribe', () async {
      // TODO
    });

    // Update a stream
    //
    // Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 
    //
    //Future<JsonSuccess> updateStream(int streamId, { String description, String newName, bool isPrivate, bool isAnnouncementOnly, int streamPostPolicy, bool historyPublicToSubscribers, OneOfstringinteger messageRetentionDays }) async
    test('test updateStream', () async {
      // TODO
    });

    // Update subscription settings
    //
    // This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 
    //
    //Future<JsonSuccessBase> updateSubscriptionSettings(List<Object> subscriptionData) async
    test('test updateSubscriptionSettings', () async {
      // TODO
    });

    // Update subscriptions
    //
    // Update which streams you are are subscribed to. 
    //
    //Future<JsonSuccessBase> updateSubscriptions({ List<String> delete, List<Object> add }) async
    test('test updateSubscriptions', () async {
      // TODO
    });

  });
}
