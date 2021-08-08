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

import org.openapitools.client.model.BadEventQueueIdError
import org.openapitools.client.model.JsonSuccess
import org.openapitools.client.model.JsonSuccessBase
import org.openapitools.client.model.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError
import org.openapitools.client.model.OneOfRateLimitedError
import org.openapitools.client.model.OneOfUserDeactivatedErrorRealmDeactivatedError
import org.openapitools.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object RealTimeEventsApi {

def apply(baseUrl: String = "https://example.zulipchat.com/api/v1") = new RealTimeEventsApi(baseUrl)
}

class RealTimeEventsApi(baseUrl: String) {

  /**
   * Delete a previously registered queue.  `DELETE {{ api_url }}/v1/events` 
   * 
   * Expected answers:
   *   code 200 : JsonSuccess (Success.)
   *   code 400 : BadEventQueueIdError (Bad request.)
   * 
   * @param queueId The ID of an event queue that was previously registered via `POST /api/v1/register` (see [Register a queue](/api/register-queue)). 
   */
  def deleteQueue(queueId: String
): Request[Either[ResponseError[Exception], JsonSuccess], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/events?queue_id=${ queueId }")
      .contentType("application/json")
      .response(asJson[JsonSuccess])

  /**
   * `GET {{ api_url }}/v1/events`  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the `event_queue_longpoll_timeout_seconds` property returned by `POST /register` as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases. 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   *   code 400 : BadEventQueueIdError (Bad request.)
   * 
   * @param queueId The ID of an event queue that was previously registered via `POST /api/v1/register` (see [Register a queue](/api/register-queue)). 
   * @param lastEventId The highest event ID in this queue that you've received and wish to acknowledge. See the [code for `call_on_each_event`](https://github.com/zulip/python-zulip-api/blob/master/zulip/zulip/__init__.py) in the [zulip Python module](https://github.com/zulip/python-zulip-api) for an example implementation of correctly processing each event exactly once. 
   * @param dontBlock Set to `true` if the client is requesting a nonblocking reply. If not specified, the request will block until either a new event is available or a few minutes have passed, in which case the server will send the client a heartbeat event. 
   */
  def getEvents(queueId: String, lastEventId: Option[Int] = None, dontBlock: Option[Boolean] = None
): Request[Either[ResponseError[Exception], JsonSuccessBase], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/events?queue_id=${ queueId }&last_event_id=${ lastEventId }&dont_block=${ dontBlock }")
      .contentType("application/json")
      .response(asJson[JsonSuccessBase])

  /**
   * (Ignored) 
   * 
   * Expected answers:
   *   code 200 :  (Success)
   * 
   * @param eventTypes A JSON-encoded array indicating which types of events you're interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: `event_types=['message']`  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
   * @param narrow A JSON-encoded array of arrays of length 2 indicating the narrow for which you'd like to receive events for. For instance, to receive events for the stream `Denmark`, you would specify `narrow=[['stream', 'Denmark']]`.  Another example is `narrow=[['is', 'private']]` for private messages. Default is `[]`. 
   * @param allPublicStreams Whether you would like to request message events from all public streams.  Useful for workflow bots that you'd like to see all new messages sent to public streams.  (You can also subscribe the user to private streams). 
   */
  def realTimePost(eventTypes: Seq[String], narrow: Seq[Seq[String]], allPublicStreams: Option[Boolean] = None
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/real-time?event_types=${ eventTypes }&narrow=${ narrow }&all_public_streams=${ allPublicStreams }")
      .contentType("application/json")
      .response(asJson[Unit])

  /**
   * `POST {{ api_url }}/v1/register`  This powerful endpoint can be used to register a Zulip \"event queue\" (subscribed to certain types of \"events\", or updates to the messages and other Zulip data the current user has access to), as well as to fetch the current state of that data.  (`register` also powers the `call_on_each_event` Python API, and is intended primarily for complex applications for which the more convenient `call_on_each_event` API is insufficient).  This endpoint returns a `queue_id` and a `last_event_id`; these can be used in subsequent calls to the [\"events\" endpoint](/api/get-events) to request events from the Zulip server using long-polling.  The server will queue events for up to 10 minutes of inactivity. After 10 minutes, your event queue will be garbage-collected.  The server will send `heartbeat` events every minute, which makes it easy to implement a robust client that does not miss events unless the client loses network connectivity with the Zulip server for 10 minutes or longer.  Once the server garbage-collects your event queue, the server will [return an error](/api/get-events#bad_event_queue_id-errors) with a code of `BAD_EVENT_QUEUE_ID` if you try to fetch events from the event queue.  Your software will need to handle that error condition by re-initializing itself (e.g. this is what triggers your browser reloading the Zulip web app when your laptop comes back online after being offline for more than 10 minutes).  When prototyping with this API, we recommend first calling `register` with no `event_types` parameter to see all the available data from all supported event types.  Before using your client in production, you should set appropriate `event_types` and `fetch_event_types` filters so that your client only requests the data it needs.  A few minutes doing this often saves 90% of the total bandwidth and other resources consumed by a client using this API.  See the [events system developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/events-system.html) if you need deeper details about how the Zulip event queue system works, avoids clients needing to worry about large classes of potentially messy races, etc. 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   * 
   * @param applyMarkdown Set to `true` if you would like the content to be rendered in HTML format (otherwise the API will return the raw text that the user entered) 
   * @param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
   * @param slimPresence Setting this to `true` will make presence dictionaries be keyed by user_id instead of email.  **Changes**: New in Zulip 3.0 (Unstable with no feature level yet). 
   * @param eventTypes A JSON-encoded array indicating which types of events you're interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: `event_types=['message']`  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
   * @param allPublicStreams Whether you would like to request message events from all public streams.  Useful for workflow bots that you'd like to see all new messages sent to public streams.  (You can also subscribe the user to private streams). 
   * @param includeSubscribers Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 
   * @param clientCapabilities Dictionary containing details on features the client supports that are relevant to the format of responses sent by the server.  * `notification_settings_null`: Boolean for whether the   client can handle the current API with null values for   stream-level notification settings (which means the stream   is not customized and should inherit the user's global   notification settings for stream messages).  New in Zulip   2.1.0; in earlier Zulip releases, stream-level   notification settings were simple booleans.  * `bulk_message_deletion`: Boolean for whether the client's    handler for the `delete_message` event type has been    updated to process the new bulk format (with a    `message_ids`, rather than a singleton `message_id`).    Otherwise, the server will send `delete_message` events    in a loop.  New in Zulip 3.0 (feature level 13).  This    capability is for backwards-compatibility; it will be    required in a future server release.  * `user_avatar_url_field_optional`: Boolean for whether the    client required avatar URLs for all users, or supports    using `GET /avatar/{user_id}` to access user avatars.  If the    client has this capability, the server may skip sending a    `avatar_url` field in the `realm_user` at its sole discretion    to optimize network performance.  This is an important optimization    in organizations with 10,000s of users.    New in Zulip 3.0 (feature level 18).  * `stream_typing_notifications`: Boolean for whether the client   supports stream typing notifications.    New in Zulip 4.0 (feature level 58).  This capability is   for backwards-compatibility; it will be required in a   future server release. 
   * @param fetchEventTypes Same as the `event_types` parameter except that the values in `fetch_event_types` are used to fetch initial data. If `fetch_event_types` is not provided, `event_types` is used and if `event_types` is not provided, this parameter defaults to `None`.  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
   * @param narrow A JSON-encoded array of arrays of length 2 indicating the narrow for which you'd like to receive events for. For instance, to receive events for the stream `Denmark`, you would specify `narrow=[['stream', 'Denmark']]`.  Another example is `narrow=[['is', 'private']]` for private messages. Default is `[]`. 
   */
  def registerQueue(applyMarkdown: Option[Boolean] = None, clientGravatar: Option[Boolean] = None, slimPresence: Option[Boolean] = None, eventTypes: Seq[String], allPublicStreams: Option[Boolean] = None, includeSubscribers: Option[Boolean] = None, clientCapabilities: Option[Any] = None, fetchEventTypes: Seq[String], narrow: Seq[Seq[String]]
): Request[Either[ResponseError[Exception], JsonSuccessBase], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/register?apply_markdown=${ applyMarkdown }&client_gravatar=${ clientGravatar }&slim_presence=${ slimPresence }&event_types=${ eventTypes }&all_public_streams=${ allPublicStreams }&include_subscribers=${ includeSubscribers }&client_capabilities=${ clientCapabilities }&fetch_event_types=${ fetchEventTypes }&narrow=${ narrow }")
      .contentType("application/json")
      .response(asJson[JsonSuccessBase])

  /**
   * Common error to many endpoints 
   * 
   * Expected answers:
   *   code 400 : OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError (Bad request. )
   *   code 401 : OneOfUserDeactivatedErrorRealmDeactivatedError (Unauthorized. )
   *   code 429 : OneOfRateLimitedError (Rate limit exceeded. )
   */
  def restErrorHandling(
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/rest-error-handling")
      .contentType("application/json")
      .response(asJson[Unit])

}