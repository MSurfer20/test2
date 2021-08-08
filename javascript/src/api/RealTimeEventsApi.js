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
 *
 */


import ApiClient from "../ApiClient";
import BadEventQueueIdError from '../model/BadEventQueueIdError';
import JsonSuccess from '../model/JsonSuccess';
import JsonSuccessBase from '../model/JsonSuccessBase';
import OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError from '../model/OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError';
import OneOfRateLimitedError from '../model/OneOfRateLimitedError';
import OneOfUserDeactivatedErrorRealmDeactivatedError from '../model/OneOfUserDeactivatedErrorRealmDeactivatedError';

/**
* RealTimeEvents service.
* @module api/RealTimeEventsApi
* @version 1.0.0
*/
export default class RealTimeEventsApi {

    /**
    * Constructs a new RealTimeEventsApi. 
    * @alias module:api/RealTimeEventsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the deleteQueue operation.
     * @callback module:api/RealTimeEventsApi~deleteQueueCallback
     * @param {String} error Error message, if any.
     * @param {module:model/JsonSuccess} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete an event queue
     * Delete a previously registered queue.  `DELETE {{ api_url }}/v1/events` 
     * @param {String} queueId The ID of an event queue that was previously registered via `POST /api/v1/register` (see [Register a queue](/api/register-queue)). 
     * @param {module:api/RealTimeEventsApi~deleteQueueCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/JsonSuccess}
     */
    deleteQueue(queueId, callback) {
      let postBody = null;
      // verify the required parameter 'queueId' is set
      if (queueId === undefined || queueId === null) {
        throw new Error("Missing the required parameter 'queueId' when calling deleteQueue");
      }

      let pathParams = {
      };
      let queryParams = {
        'queue_id': queueId
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccess;
      return this.apiClient.callApi(
        '/events', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getEvents operation.
     * @callback module:api/RealTimeEventsApi~getEventsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/JsonSuccessBase} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get events from an event queue
     * `GET {{ api_url }}/v1/events`  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the `event_queue_longpoll_timeout_seconds` property returned by `POST /register` as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases. 
     * @param {String} queueId The ID of an event queue that was previously registered via `POST /api/v1/register` (see [Register a queue](/api/register-queue)). 
     * @param {Object} opts Optional parameters
     * @param {Number} opts.lastEventId The highest event ID in this queue that you've received and wish to acknowledge. See the [code for `call_on_each_event`](https://github.com/zulip/python-zulip-api/blob/master/zulip/zulip/__init__.py) in the [zulip Python module](https://github.com/zulip/python-zulip-api) for an example implementation of correctly processing each event exactly once. 
     * @param {Boolean} opts.dontBlock Set to `true` if the client is requesting a nonblocking reply. If not specified, the request will block until either a new event is available or a few minutes have passed, in which case the server will send the client a heartbeat event.  (default to false)
     * @param {module:api/RealTimeEventsApi~getEventsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/JsonSuccessBase}
     */
    getEvents(queueId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'queueId' is set
      if (queueId === undefined || queueId === null) {
        throw new Error("Missing the required parameter 'queueId' when calling getEvents");
      }

      let pathParams = {
      };
      let queryParams = {
        'queue_id': queueId,
        'last_event_id': opts['lastEventId'],
        'dont_block': opts['dontBlock']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccessBase;
      return this.apiClient.callApi(
        '/events', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the realTimePost operation.
     * @callback module:api/RealTimeEventsApi~realTimePostCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * (Ignored) 
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.eventTypes A JSON-encoded array indicating which types of events you're interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: `event_types=['message']`  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
     * @param {Array.<module:model/[String]>} opts.narrow A JSON-encoded array of arrays of length 2 indicating the narrow for which you'd like to receive events for. For instance, to receive events for the stream `Denmark`, you would specify `narrow=[['stream', 'Denmark']]`.  Another example is `narrow=[['is', 'private']]` for private messages. Default is `[]`. 
     * @param {Boolean} opts.allPublicStreams Whether you would like to request message events from all public streams.  Useful for workflow bots that you'd like to see all new messages sent to public streams.  (You can also subscribe the user to private streams).  (default to false)
     * @param {module:api/RealTimeEventsApi~realTimePostCallback} callback The callback function, accepting three arguments: error, data, response
     */
    realTimePost(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'event_types': this.apiClient.buildCollectionParam(opts['eventTypes'], 'multi'),
        'narrow': this.apiClient.buildCollectionParam(opts['narrow'], 'multi'),
        'all_public_streams': opts['allPublicStreams']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;
      return this.apiClient.callApi(
        '/real-time', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the registerQueue operation.
     * @callback module:api/RealTimeEventsApi~registerQueueCallback
     * @param {String} error Error message, if any.
     * @param {module:model/JsonSuccessBase} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Register an event queue
     * `POST {{ api_url }}/v1/register`  This powerful endpoint can be used to register a Zulip \"event queue\" (subscribed to certain types of \"events\", or updates to the messages and other Zulip data the current user has access to), as well as to fetch the current state of that data.  (`register` also powers the `call_on_each_event` Python API, and is intended primarily for complex applications for which the more convenient `call_on_each_event` API is insufficient).  This endpoint returns a `queue_id` and a `last_event_id`; these can be used in subsequent calls to the [\"events\" endpoint](/api/get-events) to request events from the Zulip server using long-polling.  The server will queue events for up to 10 minutes of inactivity. After 10 minutes, your event queue will be garbage-collected.  The server will send `heartbeat` events every minute, which makes it easy to implement a robust client that does not miss events unless the client loses network connectivity with the Zulip server for 10 minutes or longer.  Once the server garbage-collects your event queue, the server will [return an error](/api/get-events#bad_event_queue_id-errors) with a code of `BAD_EVENT_QUEUE_ID` if you try to fetch events from the event queue.  Your software will need to handle that error condition by re-initializing itself (e.g. this is what triggers your browser reloading the Zulip web app when your laptop comes back online after being offline for more than 10 minutes).  When prototyping with this API, we recommend first calling `register` with no `event_types` parameter to see all the available data from all supported event types.  Before using your client in production, you should set appropriate `event_types` and `fetch_event_types` filters so that your client only requests the data it needs.  A few minutes doing this often saves 90% of the total bandwidth and other resources consumed by a client using this API.  See the [events system developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/events-system.html) if you need deeper details about how the Zulip event queue system works, avoids clients needing to worry about large classes of potentially messy races, etc. 
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.applyMarkdown Set to `true` if you would like the content to be rendered in HTML format (otherwise the API will return the raw text that the user entered)  (default to false)
     * @param {Boolean} opts.clientGravatar Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (default to false)
     * @param {Boolean} opts.slimPresence Setting this to `true` will make presence dictionaries be keyed by user_id instead of email.  **Changes**: New in Zulip 3.0 (Unstable with no feature level yet).  (default to false)
     * @param {Array.<String>} opts.eventTypes A JSON-encoded array indicating which types of events you're interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: `event_types=['message']`  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
     * @param {Boolean} opts.allPublicStreams Whether you would like to request message events from all public streams.  Useful for workflow bots that you'd like to see all new messages sent to public streams.  (You can also subscribe the user to private streams).  (default to false)
     * @param {Boolean} opts.includeSubscribers Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  (default to false)
     * @param {Object} opts.clientCapabilities Dictionary containing details on features the client supports that are relevant to the format of responses sent by the server.  * `notification_settings_null`: Boolean for whether the   client can handle the current API with null values for   stream-level notification settings (which means the stream   is not customized and should inherit the user's global   notification settings for stream messages).  New in Zulip   2.1.0; in earlier Zulip releases, stream-level   notification settings were simple booleans.  * `bulk_message_deletion`: Boolean for whether the client's    handler for the `delete_message` event type has been    updated to process the new bulk format (with a    `message_ids`, rather than a singleton `message_id`).    Otherwise, the server will send `delete_message` events    in a loop.  New in Zulip 3.0 (feature level 13).  This    capability is for backwards-compatibility; it will be    required in a future server release.  * `user_avatar_url_field_optional`: Boolean for whether the    client required avatar URLs for all users, or supports    using `GET /avatar/{user_id}` to access user avatars.  If the    client has this capability, the server may skip sending a    `avatar_url` field in the `realm_user` at its sole discretion    to optimize network performance.  This is an important optimization    in organizations with 10,000s of users.    New in Zulip 3.0 (feature level 18).  * `stream_typing_notifications`: Boolean for whether the client   supports stream typing notifications.    New in Zulip 4.0 (feature level 58).  This capability is   for backwards-compatibility; it will be required in a   future server release. 
     * @param {Array.<String>} opts.fetchEventTypes Same as the `event_types` parameter except that the values in `fetch_event_types` are used to fetch initial data. If `fetch_event_types` is not provided, `event_types` is used and if `event_types` is not provided, this parameter defaults to `None`.  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
     * @param {Array.<module:model/[String]>} opts.narrow A JSON-encoded array of arrays of length 2 indicating the narrow for which you'd like to receive events for. For instance, to receive events for the stream `Denmark`, you would specify `narrow=[['stream', 'Denmark']]`.  Another example is `narrow=[['is', 'private']]` for private messages. Default is `[]`. 
     * @param {module:api/RealTimeEventsApi~registerQueueCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/JsonSuccessBase}
     */
    registerQueue(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'apply_markdown': opts['applyMarkdown'],
        'client_gravatar': opts['clientGravatar'],
        'slim_presence': opts['slimPresence'],
        'event_types': this.apiClient.buildCollectionParam(opts['eventTypes'], 'multi'),
        'all_public_streams': opts['allPublicStreams'],
        'include_subscribers': opts['includeSubscribers'],
        'client_capabilities': opts['clientCapabilities'],
        'fetch_event_types': this.apiClient.buildCollectionParam(opts['fetchEventTypes'], 'multi'),
        'narrow': this.apiClient.buildCollectionParam(opts['narrow'], 'multi')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccessBase;
      return this.apiClient.callApi(
        '/register', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the restErrorHandling operation.
     * @callback module:api/RealTimeEventsApi~restErrorHandlingCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Error handling
     * Common error to many endpoints 
     * @param {module:api/RealTimeEventsApi~restErrorHandlingCallback} callback The callback function, accepting three arguments: error, data, response
     */
    restErrorHandling(callback) {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = null;
      return this.apiClient.callApi(
        '/rest-error-handling', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}