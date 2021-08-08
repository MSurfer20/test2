// TODO: better import syntax?
import { BaseAPIRequestFactory, RequiredError } from './baseapi';
import {Configuration} from '../configuration';
import { RequestContext, HttpMethod, ResponseContext, HttpFile} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {isCodeInRange} from '../util';

import { BadEventQueueIdError } from '../models/BadEventQueueIdError';
import { InvalidApiKeyError | MissingArgumentError | UserNotAuthorizedError } from '../models/InvalidApiKeyError | MissingArgumentError | UserNotAuthorizedError';
import { JsonSuccess } from '../models/JsonSuccess';
import { JsonSuccessBase } from '../models/JsonSuccessBase';
import { RateLimitedError } from '../models/RateLimitedError';
import { UserDeactivatedError | RealmDeactivatedError } from '../models/UserDeactivatedError | RealmDeactivatedError';

/**
 * no description
 */
export class RealTimeEventsApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Delete a previously registered queue.  `DELETE {{ api_url }}/v1/events` 
     * Delete an event queue
     * @param queueId The ID of an event queue that was previously registered via &#x60;POST /api/v1/register&#x60; (see [Register a queue](/api/register-queue)). 
     */
    public async deleteQueue(queueId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'queueId' is not null or undefined
        if (queueId === null || queueId === undefined) {
            throw new RequiredError('Required parameter queueId was null or undefined when calling deleteQueue.');
        }


        // Path Params
        const localVarPath = '/events';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (queueId !== undefined) {
            requestContext.setQueryParam("queue_id", ObjectSerializer.serialize(queueId, "string", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * `GET {{ api_url }}/v1/events`  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the `event_queue_longpoll_timeout_seconds` property returned by `POST /register` as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases. 
     * Get events from an event queue
     * @param queueId The ID of an event queue that was previously registered via &#x60;POST /api/v1/register&#x60; (see [Register a queue](/api/register-queue)). 
     * @param lastEventId The highest event ID in this queue that you&#39;ve received and wish to acknowledge. See the [code for &#x60;call_on_each_event&#x60;](https://github.com/zulip/python-zulip-api/blob/master/zulip/zulip/__init__.py) in the [zulip Python module](https://github.com/zulip/python-zulip-api) for an example implementation of correctly processing each event exactly once. 
     * @param dontBlock Set to &#x60;true&#x60; if the client is requesting a nonblocking reply. If not specified, the request will block until either a new event is available or a few minutes have passed, in which case the server will send the client a heartbeat event. 
     */
    public async getEvents(queueId: string, lastEventId?: number, dontBlock?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'queueId' is not null or undefined
        if (queueId === null || queueId === undefined) {
            throw new RequiredError('Required parameter queueId was null or undefined when calling getEvents.');
        }




        // Path Params
        const localVarPath = '/events';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (queueId !== undefined) {
            requestContext.setQueryParam("queue_id", ObjectSerializer.serialize(queueId, "string", ""));
        }
        if (lastEventId !== undefined) {
            requestContext.setQueryParam("last_event_id", ObjectSerializer.serialize(lastEventId, "number", ""));
        }
        if (dontBlock !== undefined) {
            requestContext.setQueryParam("dont_block", ObjectSerializer.serialize(dontBlock, "boolean", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * (Ignored) 
     * @param eventTypes A JSON-encoded array indicating which types of events you&#39;re interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: &#x60;event_types&#x3D;[&#39;message&#39;]&#x60;  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
     * @param narrow A JSON-encoded array of arrays of length 2 indicating the narrow for which you&#39;d like to receive events for. For instance, to receive events for the stream &#x60;Denmark&#x60;, you would specify &#x60;narrow&#x3D;[[&#39;stream&#39;, &#39;Denmark&#39;]]&#x60;.  Another example is &#x60;narrow&#x3D;[[&#39;is&#39;, &#39;private&#39;]]&#x60; for private messages. Default is &#x60;[]&#x60;. 
     * @param allPublicStreams Whether you would like to request message events from all public streams.  Useful for workflow bots that you&#39;d like to see all new messages sent to public streams.  (You can also subscribe the user to private streams). 
     */
    public async realTimePost(eventTypes?: Array<string>, narrow?: Array<Array<string>>, allPublicStreams?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;




        // Path Params
        const localVarPath = '/real-time';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (eventTypes !== undefined) {
            requestContext.setQueryParam("event_types", ObjectSerializer.serialize(eventTypes, "Array<string>", ""));
        }
        if (narrow !== undefined) {
            requestContext.setQueryParam("narrow", ObjectSerializer.serialize(narrow, "Array<Array<string>>", ""));
        }
        if (allPublicStreams !== undefined) {
            requestContext.setQueryParam("all_public_streams", ObjectSerializer.serialize(allPublicStreams, "boolean", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * `POST {{ api_url }}/v1/register`  This powerful endpoint can be used to register a Zulip \"event queue\" (subscribed to certain types of \"events\", or updates to the messages and other Zulip data the current user has access to), as well as to fetch the current state of that data.  (`register` also powers the `call_on_each_event` Python API, and is intended primarily for complex applications for which the more convenient `call_on_each_event` API is insufficient).  This endpoint returns a `queue_id` and a `last_event_id`; these can be used in subsequent calls to the [\"events\" endpoint](/api/get-events) to request events from the Zulip server using long-polling.  The server will queue events for up to 10 minutes of inactivity. After 10 minutes, your event queue will be garbage-collected.  The server will send `heartbeat` events every minute, which makes it easy to implement a robust client that does not miss events unless the client loses network connectivity with the Zulip server for 10 minutes or longer.  Once the server garbage-collects your event queue, the server will [return an error](/api/get-events#bad_event_queue_id-errors) with a code of `BAD_EVENT_QUEUE_ID` if you try to fetch events from the event queue.  Your software will need to handle that error condition by re-initializing itself (e.g. this is what triggers your browser reloading the Zulip web app when your laptop comes back online after being offline for more than 10 minutes).  When prototyping with this API, we recommend first calling `register` with no `event_types` parameter to see all the available data from all supported event types.  Before using your client in production, you should set appropriate `event_types` and `fetch_event_types` filters so that your client only requests the data it needs.  A few minutes doing this often saves 90% of the total bandwidth and other resources consumed by a client using this API.  See the [events system developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/events-system.html) if you need deeper details about how the Zulip event queue system works, avoids clients needing to worry about large classes of potentially messy races, etc. 
     * Register an event queue
     * @param applyMarkdown Set to &#x60;true&#x60; if you would like the content to be rendered in HTML format (otherwise the API will return the raw text that the user entered) 
     * @param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. 
     * @param slimPresence Setting this to &#x60;true&#x60; will make presence dictionaries be keyed by user_id instead of email.  **Changes**: New in Zulip 3.0 (Unstable with no feature level yet). 
     * @param eventTypes A JSON-encoded array indicating which types of events you&#39;re interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: &#x60;event_types&#x3D;[&#39;message&#39;]&#x60;  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
     * @param allPublicStreams Whether you would like to request message events from all public streams.  Useful for workflow bots that you&#39;d like to see all new messages sent to public streams.  (You can also subscribe the user to private streams). 
     * @param includeSubscribers Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 
     * @param clientCapabilities Dictionary containing details on features the client supports that are relevant to the format of responses sent by the server.  * &#x60;notification_settings_null&#x60;: Boolean for whether the   client can handle the current API with null values for   stream-level notification settings (which means the stream   is not customized and should inherit the user&#39;s global   notification settings for stream messages).   &lt;br /&gt;   New in Zulip 2.1.0; in earlier Zulip releases, stream-level   notification settings were simple booleans.  * &#x60;bulk_message_deletion&#x60;: Boolean for whether the client&#39;s    handler for the &#x60;delete_message&#x60; event type has been    updated to process the new bulk format (with a    &#x60;message_ids&#x60;, rather than a singleton &#x60;message_id&#x60;).    Otherwise, the server will send &#x60;delete_message&#x60; events    in a loop.    &lt;br /&gt;    New in Zulip 3.0 (feature level 13).  This    capability is for backwards-compatibility; it will be    required in a future server release.  * &#x60;user_avatar_url_field_optional&#x60;: Boolean for whether the    client required avatar URLs for all users, or supports    using &#x60;GET /avatar/{user_id}&#x60; to access user avatars.  If the    client has this capability, the server may skip sending a    &#x60;avatar_url&#x60; field in the &#x60;realm_user&#x60; at its sole discretion    to optimize network performance.  This is an important optimization    in organizations with 10,000s of users.    &lt;br /&gt;    New in Zulip 3.0 (feature level 18).  * &#x60;stream_typing_notifications&#x60;: Boolean for whether the client   supports stream typing notifications.   &lt;br /&gt;   New in Zulip 4.0 (feature level 58).  This capability is   for backwards-compatibility; it will be required in a   future server release.  * &#x60;user_settings_object&#x60;: Boolean for whether the client supports the modern   &#x60;user_settings&#x60; event type. If False, the server will additionally send the   legacy &#x60;update_display_settings&#x60; and &#x60;update_global_notifications&#x60; event   types for backwards-compatibility with clients that predate this API migration.   &lt;br /&gt;   &lt;br /&gt;   Because the feature level 89 API changes were merged together, clients can   safely make a request with this client capability and requesting all of the   &#x60;user_settings&#x60;, &#x60;update_display_settings&#x60;, and   &#x60;update_global_notifications&#x60; event types, and get exactly one copy of   settings data on any server version. (And then use the &#x60;zulip_feature_level&#x60;   in the &#x60;/register&#x60; response or the presence/absence of a &#x60;user_settings&#x60; key   to determine where to look).   &lt;br /&gt;   New in Zulip 5.0 (feature level 89).  This capability is for   backwards-compatibility; it will be removed in a future server release. 
     * @param fetchEventTypes Same as the &#x60;event_types&#x60; parameter except that the values in &#x60;fetch_event_types&#x60; are used to fetch initial data. If &#x60;fetch_event_types&#x60; is not provided, &#x60;event_types&#x60; is used and if &#x60;event_types&#x60; is not provided, this parameter defaults to &#x60;None&#x60;.  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
     * @param narrow A JSON-encoded array of arrays of length 2 indicating the narrow for which you&#39;d like to receive events for. For instance, to receive events for the stream &#x60;Denmark&#x60;, you would specify &#x60;narrow&#x3D;[[&#39;stream&#39;, &#39;Denmark&#39;]]&#x60;.  Another example is &#x60;narrow&#x3D;[[&#39;is&#39;, &#39;private&#39;]]&#x60; for private messages. Default is &#x60;[]&#x60;. 
     */
    public async registerQueue(applyMarkdown?: boolean, clientGravatar?: boolean, slimPresence?: boolean, eventTypes?: Array<string>, allPublicStreams?: boolean, includeSubscribers?: boolean, clientCapabilities?: any, fetchEventTypes?: Array<string>, narrow?: Array<Array<string>>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;










        // Path Params
        const localVarPath = '/register';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (applyMarkdown !== undefined) {
            requestContext.setQueryParam("apply_markdown", ObjectSerializer.serialize(applyMarkdown, "boolean", ""));
        }
        if (clientGravatar !== undefined) {
            requestContext.setQueryParam("client_gravatar", ObjectSerializer.serialize(clientGravatar, "boolean", ""));
        }
        if (slimPresence !== undefined) {
            requestContext.setQueryParam("slim_presence", ObjectSerializer.serialize(slimPresence, "boolean", ""));
        }
        if (eventTypes !== undefined) {
            requestContext.setQueryParam("event_types", ObjectSerializer.serialize(eventTypes, "Array<string>", ""));
        }
        if (allPublicStreams !== undefined) {
            requestContext.setQueryParam("all_public_streams", ObjectSerializer.serialize(allPublicStreams, "boolean", ""));
        }
        if (includeSubscribers !== undefined) {
            requestContext.setQueryParam("include_subscribers", ObjectSerializer.serialize(includeSubscribers, "boolean", ""));
        }
        if (clientCapabilities !== undefined) {
            requestContext.setQueryParam("client_capabilities", ObjectSerializer.serialize(clientCapabilities, "any", ""));
        }
        if (fetchEventTypes !== undefined) {
            requestContext.setQueryParam("fetch_event_types", ObjectSerializer.serialize(fetchEventTypes, "Array<string>", ""));
        }
        if (narrow !== undefined) {
            requestContext.setQueryParam("narrow", ObjectSerializer.serialize(narrow, "Array<Array<string>>", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Common error to many endpoints 
     * Error handling
     */
    public async restErrorHandling(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/rest-error-handling';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

}

export class RealTimeEventsApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteQueue
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async deleteQueue(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: BadEventQueueIdError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "BadEventQueueIdError", ""
            ) as BadEventQueueIdError;
            throw new ApiException<BadEventQueueIdError>(400, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getEvents
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getEvents(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: BadEventQueueIdError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "BadEventQueueIdError", ""
            ) as BadEventQueueIdError;
            throw new ApiException<BadEventQueueIdError>(400, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to realTimePost
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async realTimePost(response: ResponseContext): Promise<void > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            return;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: void = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "void", ""
            ) as void;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to registerQueue
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async registerQueue(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to restErrorHandling
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async restErrorHandling(response: ResponseContext): Promise< void> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: InvalidApiKeyError | MissingArgumentError | UserNotAuthorizedError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "InvalidApiKeyError | MissingArgumentError | UserNotAuthorizedError", ""
            ) as InvalidApiKeyError | MissingArgumentError | UserNotAuthorizedError;
            throw new ApiException<InvalidApiKeyError | MissingArgumentError | UserNotAuthorizedError>(400, body);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: UserDeactivatedError | RealmDeactivatedError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UserDeactivatedError | RealmDeactivatedError", ""
            ) as UserDeactivatedError | RealmDeactivatedError;
            throw new ApiException<UserDeactivatedError | RealmDeactivatedError>(401, body);
        }
        if (isCodeInRange("429", response.httpStatusCode)) {
            const body: RateLimitedError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RateLimitedError", ""
            ) as RateLimitedError;
            throw new ApiException<RateLimitedError>(429, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

}
