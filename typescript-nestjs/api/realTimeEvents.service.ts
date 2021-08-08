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
/* tslint:disable:no-unused-variable member-ordering */

import { HttpService, Inject, Injectable, Optional } from '@nestjs/common';
import { AxiosResponse } from 'axios';
import { Observable } from 'rxjs';
import { BadEventQueueIdError } from '../model/badEventQueueIdError';
import { InvalidApiKeyError } from '../model/invalidApiKeyError';
import { JsonSuccess } from '../model/jsonSuccess';
import { JsonSuccessBase } from '../model/jsonSuccessBase';
import { MissingArgumentError } from '../model/missingArgumentError';
import { RateLimitedError } from '../model/rateLimitedError';
import { RealmDeactivatedError } from '../model/realmDeactivatedError';
import { UserDeactivatedError } from '../model/userDeactivatedError';
import { UserNotAuthorizedError } from '../model/userNotAuthorizedError';
import { Configuration } from '../configuration';


@Injectable()
export class RealTimeEventsService {

    protected basePath = 'https://example.zulipchat.com/api/v1';
    public defaultHeaders = new Map()
    public configuration = new Configuration();

    constructor(protected httpClient: HttpService, @Optional() configuration: Configuration) {
        this.configuration = configuration || this.configuration;
        this.basePath = configuration?.basePath || this.basePath;
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        return consumes.includes(form);
    }

    /**
     * Delete an event queue
     * Delete a previously registered queue.  &#x60;DELETE {{ api_url }}/v1/events&#x60; 
     * @param queueId The ID of an event queue that was previously registered via &#x60;POST /api/v1/register&#x60; (see [Register a queue](/api/register-queue)). 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public deleteQueue(queueId: string, ): Observable<AxiosResponse<JsonSuccess>>;
    public deleteQueue(queueId: string, ): Observable<any> {

        if (queueId === null || queueId === undefined) {
            throw new Error('Required parameter queueId was null or undefined when calling deleteQueue.');
        }

        let queryParameters = {};   
        if (queueId !== undefined && queueId !== null) {
            queryParameters['queue_id'] = <any>queueId;
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.delete<JsonSuccess>(`${this.basePath}/events`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Get events from an event queue
     * &#x60;GET {{ api_url }}/v1/events&#x60;  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the &#x60;event_queue_longpoll_timeout_seconds&#x60; property returned by &#x60;POST /register&#x60; as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases. 
     * @param queueId The ID of an event queue that was previously registered via &#x60;POST /api/v1/register&#x60; (see [Register a queue](/api/register-queue)). 
     * @param lastEventId The highest event ID in this queue that you\&#39;ve received and wish to acknowledge. See the [code for &#x60;call_on_each_event&#x60;](https://github.com/zulip/python-zulip-api/blob/master/zulip/zulip/__init__.py) in the [zulip Python module](https://github.com/zulip/python-zulip-api) for an example implementation of correctly processing each event exactly once. 
     * @param dontBlock Set to &#x60;true&#x60; if the client is requesting a nonblocking reply. If not specified, the request will block until either a new event is available or a few minutes have passed, in which case the server will send the client a heartbeat event. 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getEvents(queueId: string, lastEventId?: number, dontBlock?: boolean, ): Observable<AxiosResponse<JsonSuccessBase & object>>;
    public getEvents(queueId: string, lastEventId?: number, dontBlock?: boolean, ): Observable<any> {

        if (queueId === null || queueId === undefined) {
            throw new Error('Required parameter queueId was null or undefined when calling getEvents.');
        }



        let queryParameters = {};   
        if (queueId !== undefined && queueId !== null) {
            queryParameters['queue_id'] = <any>queueId;
        }
        if (lastEventId !== undefined && lastEventId !== null) {
            queryParameters['last_event_id'] = <any>lastEventId;
        }
        if (dontBlock !== undefined && dontBlock !== null) {
            queryParameters['dont_block'] = <any>dontBlock;
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.get<JsonSuccessBase & object>(`${this.basePath}/events`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * 
     * (Ignored) 
     * @param eventTypes A JSON-encoded array indicating which types of events you\&#39;re interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: &#x60;event_types&#x3D;[\&#39;message\&#39;]&#x60;  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
     * @param narrow A JSON-encoded array of arrays of length 2 indicating the narrow for which you\&#39;d like to receive events for. For instance, to receive events for the stream &#x60;Denmark&#x60;, you would specify &#x60;narrow&#x3D;[[\&#39;stream\&#39;, \&#39;Denmark\&#39;]]&#x60;.  Another example is &#x60;narrow&#x3D;[[\&#39;is\&#39;, \&#39;private\&#39;]]&#x60; for private messages. Default is &#x60;[]&#x60;. 
     * @param allPublicStreams Whether you would like to request message events from all public streams.  Useful for workflow bots that you\&#39;d like to see all new messages sent to public streams.  (You can also subscribe the user to private streams). 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public realTimePost(eventTypes?: Array<string>, narrow?: Array<Array<string>>, allPublicStreams?: boolean, ): Observable<AxiosResponse<any>>;
    public realTimePost(eventTypes?: Array<string>, narrow?: Array<Array<string>>, allPublicStreams?: boolean, ): Observable<any> {




        let queryParameters = {};   
        if (eventTypes !== undefined && eventTypes !== null) {
            queryParameters['event_types'] = <any>eventTypes;
        }
        if (narrow !== undefined && narrow !== null) {
            queryParameters['narrow'] = <any>narrow;
        }
        if (allPublicStreams !== undefined && allPublicStreams !== null) {
            queryParameters['all_public_streams'] = <any>allPublicStreams;
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.post<any>(`${this.basePath}/real-time`,
            null,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Register an event queue
     * &#x60;POST {{ api_url }}/v1/register&#x60;  This powerful endpoint can be used to register a Zulip \&quot;event queue\&quot; (subscribed to certain types of \&quot;events\&quot;, or updates to the messages and other Zulip data the current user has access to), as well as to fetch the current state of that data.  (&#x60;register&#x60; also powers the &#x60;call_on_each_event&#x60; Python API, and is intended primarily for complex applications for which the more convenient &#x60;call_on_each_event&#x60; API is insufficient).  This endpoint returns a &#x60;queue_id&#x60; and a &#x60;last_event_id&#x60;; these can be used in subsequent calls to the [\&quot;events\&quot; endpoint](/api/get-events) to request events from the Zulip server using long-polling.  The server will queue events for up to 10 minutes of inactivity. After 10 minutes, your event queue will be garbage-collected.  The server will send &#x60;heartbeat&#x60; events every minute, which makes it easy to implement a robust client that does not miss events unless the client loses network connectivity with the Zulip server for 10 minutes or longer.  Once the server garbage-collects your event queue, the server will [return an error](/api/get-events#bad_event_queue_id-errors) with a code of &#x60;BAD_EVENT_QUEUE_ID&#x60; if you try to fetch events from the event queue.  Your software will need to handle that error condition by re-initializing itself (e.g. this is what triggers your browser reloading the Zulip web app when your laptop comes back online after being offline for more than 10 minutes).  When prototyping with this API, we recommend first calling &#x60;register&#x60; with no &#x60;event_types&#x60; parameter to see all the available data from all supported event types.  Before using your client in production, you should set appropriate &#x60;event_types&#x60; and &#x60;fetch_event_types&#x60; filters so that your client only requests the data it needs.  A few minutes doing this often saves 90% of the total bandwidth and other resources consumed by a client using this API.  See the [events system developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/events-system.html) if you need deeper details about how the Zulip event queue system works, avoids clients needing to worry about large classes of potentially messy races, etc. 
     * @param applyMarkdown Set to &#x60;true&#x60; if you would like the content to be rendered in HTML format (otherwise the API will return the raw text that the user entered) 
     * @param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. 
     * @param slimPresence Setting this to &#x60;true&#x60; will make presence dictionaries be keyed by user_id instead of email.  **Changes**: New in Zulip 3.0 (Unstable with no feature level yet). 
     * @param eventTypes A JSON-encoded array indicating which types of events you\&#39;re interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: &#x60;event_types&#x3D;[\&#39;message\&#39;]&#x60;  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
     * @param allPublicStreams Whether you would like to request message events from all public streams.  Useful for workflow bots that you\&#39;d like to see all new messages sent to public streams.  (You can also subscribe the user to private streams). 
     * @param includeSubscribers Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 
     * @param clientCapabilities Dictionary containing details on features the client supports that are relevant to the format of responses sent by the server.  * &#x60;notification_settings_null&#x60;: Boolean for whether the   client can handle the current API with null values for   stream-level notification settings (which means the stream   is not customized and should inherit the user\&#39;s global   notification settings for stream messages).  New in Zulip   2.1.0; in earlier Zulip releases, stream-level   notification settings were simple booleans.  * &#x60;bulk_message_deletion&#x60;: Boolean for whether the client\&#39;s    handler for the &#x60;delete_message&#x60; event type has been    updated to process the new bulk format (with a    &#x60;message_ids&#x60;, rather than a singleton &#x60;message_id&#x60;).    Otherwise, the server will send &#x60;delete_message&#x60; events    in a loop.  New in Zulip 3.0 (feature level 13).  This    capability is for backwards-compatibility; it will be    required in a future server release.  * &#x60;user_avatar_url_field_optional&#x60;: Boolean for whether the    client required avatar URLs for all users, or supports    using &#x60;GET /avatar/{user_id}&#x60; to access user avatars.  If the    client has this capability, the server may skip sending a    &#x60;avatar_url&#x60; field in the &#x60;realm_user&#x60; at its sole discretion    to optimize network performance.  This is an important optimization    in organizations with 10,000s of users.    New in Zulip 3.0 (feature level 18).  * &#x60;stream_typing_notifications&#x60;: Boolean for whether the client   supports stream typing notifications.    New in Zulip 4.0 (feature level 58).  This capability is   for backwards-compatibility; it will be required in a   future server release. 
     * @param fetchEventTypes Same as the &#x60;event_types&#x60; parameter except that the values in &#x60;fetch_event_types&#x60; are used to fetch initial data. If &#x60;fetch_event_types&#x60; is not provided, &#x60;event_types&#x60; is used and if &#x60;event_types&#x60; is not provided, this parameter defaults to &#x60;None&#x60;.  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
     * @param narrow A JSON-encoded array of arrays of length 2 indicating the narrow for which you\&#39;d like to receive events for. For instance, to receive events for the stream &#x60;Denmark&#x60;, you would specify &#x60;narrow&#x3D;[[\&#39;stream\&#39;, \&#39;Denmark\&#39;]]&#x60;.  Another example is &#x60;narrow&#x3D;[[\&#39;is\&#39;, \&#39;private\&#39;]]&#x60; for private messages. Default is &#x60;[]&#x60;. 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public registerQueue(applyMarkdown?: boolean, clientGravatar?: boolean, slimPresence?: boolean, eventTypes?: Array<string>, allPublicStreams?: boolean, includeSubscribers?: boolean, clientCapabilities?: object, fetchEventTypes?: Array<string>, narrow?: Array<Array<string>>, ): Observable<AxiosResponse<JsonSuccessBase & object>>;
    public registerQueue(applyMarkdown?: boolean, clientGravatar?: boolean, slimPresence?: boolean, eventTypes?: Array<string>, allPublicStreams?: boolean, includeSubscribers?: boolean, clientCapabilities?: object, fetchEventTypes?: Array<string>, narrow?: Array<Array<string>>, ): Observable<any> {










        let queryParameters = {};   
        if (applyMarkdown !== undefined && applyMarkdown !== null) {
            queryParameters['apply_markdown'] = <any>applyMarkdown;
        }
        if (clientGravatar !== undefined && clientGravatar !== null) {
            queryParameters['client_gravatar'] = <any>clientGravatar;
        }
        if (slimPresence !== undefined && slimPresence !== null) {
            queryParameters['slim_presence'] = <any>slimPresence;
        }
        if (eventTypes !== undefined && eventTypes !== null) {
            queryParameters['event_types'] = <any>eventTypes;
        }
        if (allPublicStreams !== undefined && allPublicStreams !== null) {
            queryParameters['all_public_streams'] = <any>allPublicStreams;
        }
        if (includeSubscribers !== undefined && includeSubscribers !== null) {
            queryParameters['include_subscribers'] = <any>includeSubscribers;
        }
        if (clientCapabilities !== undefined && clientCapabilities !== null) {
            queryParameters['client_capabilities'] = <any>clientCapabilities;
        }
        if (fetchEventTypes !== undefined && fetchEventTypes !== null) {
            queryParameters['fetch_event_types'] = <any>fetchEventTypes;
        }
        if (narrow !== undefined && narrow !== null) {
            queryParameters['narrow'] = <any>narrow;
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.post<JsonSuccessBase & object>(`${this.basePath}/register`,
            null,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Error handling
     * Common error to many endpoints 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public restErrorHandling(): Observable<AxiosResponse<any>>;
    public restErrorHandling(): Observable<any> {

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.post<any>(`${this.basePath}/rest-error-handling`,
            null,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
}
