/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.api

import org.openapitools.client.model.CodedError
import org.openapitools.client.model.JsonError
import org.openapitools.client.model.JsonSuccess
import org.openapitools.client.model.JsonSuccessBase
import org.openapitools.client.model.NonExistingStreamError
import org.openapitools.client.model.OneOfobjectobject
import org.openapitools.client.model.OneOfstringinteger
import org.openapitools.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object StreamsApi {

def apply(baseUrl: String = "https://example.zulipchat.com/api/v1") = new StreamsApi(baseUrl)
}

class StreamsApi(baseUrl: String) {

  /**
   * [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 
   * 
   * Expected answers:
   *   code 200 : JsonSuccess (Success.)
   *   code 400 : JsonError (Bad request.)
   * 
   * @param streamId The ID of the stream to access. 
   */
  def archiveStream(streamId: Int
): Request[Either[ResponseError[Exception], JsonSuccess], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/streams/${streamId}")
      .contentType("application/json")
      .response(asJson[JsonSuccess])

  /**
   * Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   */
  def createBigBlueButtonVideoCall(
): Request[Either[ResponseError[Exception], JsonSuccessBase], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/calls/bigbluebutton/create")
      .contentType("application/json")
      .response(asJson[JsonSuccessBase])

  /**
   * Delete all messages in a topic.  `POST {{ api_url }}/v1/streams/{stream_id}/delete_topic`  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. 
   * 
   * Expected answers:
   *   code 200 : JsonSuccess (Success.)
   *   code 400 : JsonError (Error.)
   * 
   * @param streamId The ID of the stream to access. 
   * @param topicName The name of the topic to delete. 
   */
  def deleteTopic(streamId: Int, topicName: String
): Request[Either[ResponseError[Exception], JsonSuccess], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/streams/${streamId}/delete_topic?topic_name=${ topicName }")
      .contentType("application/json")
      .response(asJson[JsonSuccess])

  /**
   * Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   *   code 400 : CodedError (Bad request.)
   * 
   * @param stream The name of the stream to access. 
   */
  def getStreamId(stream: String
): Request[Either[ResponseError[Exception], JsonSuccessBase], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/get_stream_id?stream=${ stream }")
      .contentType("application/json")
      .response(asJson[JsonSuccessBase])

  /**
   * Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   *   code 400 : JsonError (Bad request.)
   * 
   * @param streamId The ID of the stream to access. 
   */
  def getStreamTopics(streamId: Int
): Request[Either[ResponseError[Exception], JsonSuccessBase], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/users/me/${streamId}/topics")
      .contentType("application/json")
      .response(asJson[JsonSuccessBase])

  /**
   * Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   *   code 400 : CodedError (Bad request.)
   * 
   * @param includePublic Include all public streams. 
   * @param includeWebPublic Include all web public streams. 
   * @param includeSubscribed Include all streams that the user is subscribed to. 
   * @param includeAllActive Include all active streams. The user must have administrative privileges to use this parameter. 
   * @param includeDefault Include all default streams for the user's realm. 
   * @param includeOwnerSubscribed If the user is a bot, include all streams that the bot's owner is subscribed to. 
   */
  def getStreams(includePublic: Option[Boolean] = None, includeWebPublic: Option[Boolean] = None, includeSubscribed: Option[Boolean] = None, includeAllActive: Option[Boolean] = None, includeDefault: Option[Boolean] = None, includeOwnerSubscribed: Option[Boolean] = None
): Request[Either[ResponseError[Exception], JsonSuccessBase], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/streams?include_public=${ includePublic }&include_web_public=${ includeWebPublic }&include_subscribed=${ includeSubscribed }&include_all_active=${ includeAllActive }&include_default=${ includeDefault }&include_owner_subscribed=${ includeOwnerSubscribed }")
      .contentType("application/json")
      .response(asJson[JsonSuccessBase])

  /**
   * Get all users subscribed to a stream.  `Get {{ api_url }}/v1/streams/{stream_id}/members` 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   *   code 400 : JsonError (Bad request.)
   * 
   * @param streamId The ID of the stream to access. 
   */
  def getSubscribers(streamId: Int
): Request[Either[ResponseError[Exception], JsonSuccessBase], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/streams/${streamId}/members")
      .contentType("application/json")
      .response(asJson[JsonSuccessBase])

  /**
   * Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success)
   * 
   * @param userId The target user's ID. 
   * @param streamId The ID of the stream to access. 
   */
  def getSubscriptionStatus(userId: Int, streamId: Int
): Request[Either[ResponseError[Exception], JsonSuccessBase], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/users/${userId}/subscriptions/${streamId}")
      .contentType("application/json")
      .response(asJson[JsonSuccessBase])

  /**
   * Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   * 
   * @param includeSubscribers Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 
   */
  def getSubscriptions(includeSubscribers: Option[Boolean] = None
): Request[Either[ResponseError[Exception], JsonSuccessBase], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/users/me/subscriptions?include_subscribers=${ includeSubscribers }")
      .contentType("application/json")
      .response(asJson[JsonSuccessBase])

  /**
   * This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 
   * 
   * Expected answers:
   *   code 200 : JsonSuccess (Success.)
   *   code 400 : OneOfobjectobject (Bad request.)
   * 
   * @param topic The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
   * @param op Whether to mute (`add`) or unmute (`remove`) the provided topic. 
   * @param stream The name of the stream to access. 
   * @param streamId The ID of the stream to access. 
   */
  def muteTopic(topic: String, op: String, stream: Option[String] = None, streamId: Option[Int] = None
): Request[Either[ResponseError[Exception], JsonSuccess], Nothing] =
    basicRequest
      .method(Method.PATCH, uri"$baseUrl/users/me/subscriptions/muted_topics?stream=${ stream }&stream_id=${ streamId }&topic=${ topic }&op=${ op }")
      .contentType("application/json")
      .response(asJson[JsonSuccess])

  /**
   * Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 
   * 
   * Expected answers:
   *   code 200 : OneOfobjectobject (Success.)
   *   code 400 : OneOfobjectobject (Success.)
   * 
   * @param subscriptions A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value. 
   * @param principals A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
   * @param authorizationErrorsFatal A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When `True`, an authorization error is reported as such. When set to `False`, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the `unauthorized` key. 
   * @param announce If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream's creation. 
   * @param inviteOnly As described above, this endpoint will create a new stream if passed a stream name that doesn't already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. 
   * @param historyPublicToSubscribers Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
   * @param streamPostPolicy Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
   * @param messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
   */
  def subscribe(subscriptions: Seq[Any], principals: Seq[OneOfstringinteger], authorizationErrorsFatal: Option[Boolean] = None, announce: Option[Boolean] = None, inviteOnly: Option[Boolean] = None, historyPublicToSubscribers: Option[Boolean] = None, streamPostPolicy: Option[Int] = None, messageRetentionDays: Option[OneOfstringinteger] = None
): Request[Either[ResponseError[Exception], OneOfobjectobject], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/users/me/subscriptions?subscriptions=${ subscriptions }&principals=${ principals }&authorization_errors_fatal=${ authorizationErrorsFatal }&announce=${ announce }&invite_only=${ inviteOnly }&history_public_to_subscribers=${ historyPublicToSubscribers }&stream_post_policy=${ streamPostPolicy }&message_retention_days=${ messageRetentionDays }")
      .contentType("application/json")
      .response(asJson[OneOfobjectobject])

  /**
   * Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   *   code 400 : NonExistingStreamError (Bad request.)
   * 
   * @param subscriptions A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API. 
   * @param principals A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
   */
  def unsubscribe(subscriptions: Seq[String], principals: Seq[OneOfstringinteger]
): Request[Either[ResponseError[Exception], JsonSuccessBase], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/users/me/subscriptions?subscriptions=${ subscriptions }&principals=${ principals }")
      .contentType("application/json")
      .response(asJson[JsonSuccessBase])

  /**
   * Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 
   * 
   * Expected answers:
   *   code 200 : JsonSuccess (Success.)
   *   code 400 : JsonError (Bad request.)
   * 
   * @param streamId The ID of the stream to access. 
   * @param description The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
   * @param newName The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
   * @param isPrivate Change whether the stream is a private stream. 
   * @param isAnnouncementOnly Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead. 
   * @param streamPostPolicy Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
   * @param historyPublicToSubscribers Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
   * @param messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
   */
  def updateStream(streamId: Int, description: Option[String] = None, newName: Option[String] = None, isPrivate: Option[Boolean] = None, isAnnouncementOnly: Option[Boolean] = None, streamPostPolicy: Option[Int] = None, historyPublicToSubscribers: Option[Boolean] = None, messageRetentionDays: Option[OneOfstringinteger] = None
): Request[Either[ResponseError[Exception], JsonSuccess], Nothing] =
    basicRequest
      .method(Method.PATCH, uri"$baseUrl/streams/${streamId}?description=${ description }&new_name=${ newName }&is_private=${ isPrivate }&is_announcement_only=${ isAnnouncementOnly }&stream_post_policy=${ streamPostPolicy }&history_public_to_subscribers=${ historyPublicToSubscribers }&message_retention_days=${ messageRetentionDays }")
      .contentType("application/json")
      .response(asJson[JsonSuccess])

  /**
   * This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   * 
   * @param subscriptionData A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream. 
   */
  def updateSubscriptionSettings(subscriptionData: Seq[Any]
): Request[Either[ResponseError[Exception], JsonSuccessBase], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/users/me/subscriptions/properties?subscription_data=${ subscriptionData }")
      .contentType("application/json")
      .response(asJson[JsonSuccessBase])

  /**
   * Update which streams you are are subscribed to. 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   * 
   * @param delete A list of stream names to unsubscribe from. 
   * @param add A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. 
   */
  def updateSubscriptions(delete: Seq[String], add: Seq[Any]
): Request[Either[ResponseError[Exception], JsonSuccessBase], Nothing] =
    basicRequest
      .method(Method.PATCH, uri"$baseUrl/users/me/subscriptions?delete=${ delete }&add=${ add }")
      .contentType("application/json")
      .response(asJson[JsonSuccessBase])

}
