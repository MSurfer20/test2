package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.BadEventQueueIdError;
import com.prokarma.pkmst.model.JsonSuccess;
import com.prokarma.pkmst.model.JsonSuccessBase;
import java.util.List;
import com.prokarma.pkmst.model.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError;
import com.prokarma.pkmst.model.OneOfRateLimitedError;
import com.prokarma.pkmst.model.OneOfUserDeactivatedErrorRealmDeactivatedError;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implemention
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2021-08-08T21:11:40.512025Z[Etc/UTC]")
@Controller
public class RealTimeEventsApiController implements RealTimeEventsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public RealTimeEventsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<JsonSuccess> deleteQueue(@ApiParam(value = "The ID of an event queue that was previously registered via `POST /api/v1/register` (see [Register a queue](/api/register-queue)). ", required = true)  @RequestParam(value = "queue_id", required = true) String queueId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> getEvents(@ApiParam(value = "The ID of an event queue that was previously registered via `POST /api/v1/register` (see [Register a queue](/api/register-queue)). ", required = true)  @RequestParam(value = "queue_id", required = true) String queueId,
        @ApiParam(value = "The highest event ID in this queue that you've received and wish to acknowledge. See the [code for `call_on_each_event`](https://github.com/zulip/python-zulip-api/blob/master/zulip/zulip/__init__.py) in the [zulip Python module](https://github.com/zulip/python-zulip-api) for an example implementation of correctly processing each event exactly once. ")  @RequestParam(value = "last_event_id", required = false) Integer lastEventId,
        @ApiParam(value = "Set to `true` if the client is requesting a nonblocking reply. If not specified, the request will block until either a new event is available or a few minutes have passed, in which case the server will send the client a heartbeat event. ", defaultValue = "false")  @RequestParam(value = "dont_block", required = false, defaultValue="false") Boolean dontBlock,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<Void> realTimePost(@ApiParam(value = "A JSON-encoded array indicating which types of events you're interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: `event_types=['message']`  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. ")  @RequestParam(value = "event_types", required = false) List<String> eventTypes,
        @ApiParam(value = "A JSON-encoded array of arrays of length 2 indicating the narrow for which you'd like to receive events for. For instance, to receive events for the stream `Denmark`, you would specify `narrow=[['stream', 'Denmark']]`.  Another example is `narrow=[['is', 'private']]` for private messages. Default is `[]`. ")  @RequestParam(value = "narrow", required = false) List<List<String>> narrow,
        @ApiParam(value = "Whether you would like to request message events from all public streams.  Useful for workflow bots that you'd like to see all new messages sent to public streams.  (You can also subscribe the user to private streams). ", defaultValue = "false")  @RequestParam(value = "all_public_streams", required = false, defaultValue="false") Boolean allPublicStreams,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> registerQueue(@ApiParam(value = "Set to `true` if you would like the content to be rendered in HTML format (otherwise the API will return the raw text that the user entered) ", defaultValue = "false")  @RequestParam(value = "apply_markdown", required = false, defaultValue="false") Boolean applyMarkdown,
        @ApiParam(value = "Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. ", defaultValue = "false")  @RequestParam(value = "client_gravatar", required = false, defaultValue="false") Boolean clientGravatar,
        @ApiParam(value = "Setting this to `true` will make presence dictionaries be keyed by user_id instead of email.  **Changes**: New in Zulip 3.0 (Unstable with no feature level yet). ", defaultValue = "false")  @RequestParam(value = "slim_presence", required = false, defaultValue="false") Boolean slimPresence,
        @ApiParam(value = "A JSON-encoded array indicating which types of events you're interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: `event_types=['message']`  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. ")  @RequestParam(value = "event_types", required = false) List<String> eventTypes,
        @ApiParam(value = "Whether you would like to request message events from all public streams.  Useful for workflow bots that you'd like to see all new messages sent to public streams.  (You can also subscribe the user to private streams). ", defaultValue = "false")  @RequestParam(value = "all_public_streams", required = false, defaultValue="false") Boolean allPublicStreams,
        @ApiParam(value = "Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. ", defaultValue = "false")  @RequestParam(value = "include_subscribers", required = false, defaultValue="false") Boolean includeSubscribers,
        @ApiParam(value = "Dictionary containing details on features the client supports that are relevant to the format of responses sent by the server.  * `notification_settings_null`: Boolean for whether the   client can handle the current API with null values for   stream-level notification settings (which means the stream   is not customized and should inherit the user's global   notification settings for stream messages).   <br />   New in Zulip 2.1.0; in earlier Zulip releases, stream-level   notification settings were simple booleans.  * `bulk_message_deletion`: Boolean for whether the client's    handler for the `delete_message` event type has been    updated to process the new bulk format (with a    `message_ids`, rather than a singleton `message_id`).    Otherwise, the server will send `delete_message` events    in a loop.    <br />    New in Zulip 3.0 (feature level 13).  This    capability is for backwards-compatibility; it will be    required in a future server release.  * `user_avatar_url_field_optional`: Boolean for whether the    client required avatar URLs for all users, or supports    using `GET /avatar/{user_id}` to access user avatars.  If the    client has this capability, the server may skip sending a    `avatar_url` field in the `realm_user` at its sole discretion    to optimize network performance.  This is an important optimization    in organizations with 10,000s of users.    <br />    New in Zulip 3.0 (feature level 18).  * `stream_typing_notifications`: Boolean for whether the client   supports stream typing notifications.   <br />   New in Zulip 4.0 (feature level 58).  This capability is   for backwards-compatibility; it will be required in a   future server release.  * `user_settings_object`: Boolean for whether the client supports the modern   `user_settings` event type. If False, the server will additionally send the   legacy `update_display_settings` and `update_global_notifications` event   types for backwards-compatibility with clients that predate this API migration.   <br />   <br />   Because the feature level 89 API changes were merged together, clients can   safely make a request with this client capability and requesting all of the   `user_settings`, `update_display_settings`, and   `update_global_notifications` event types, and get exactly one copy of   settings data on any server version. (And then use the `zulip_feature_level`   in the `/register` response or the presence/absence of a `user_settings` key   to determine where to look).   <br />   New in Zulip 5.0 (feature level 89).  This capability is for   backwards-compatibility; it will be removed in a future server release. ")  @RequestParam(value = "client_capabilities", required = false) Object clientCapabilities,
        @ApiParam(value = "Same as the `event_types` parameter except that the values in `fetch_event_types` are used to fetch initial data. If `fetch_event_types` is not provided, `event_types` is used and if `event_types` is not provided, this parameter defaults to `None`.  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. ")  @RequestParam(value = "fetch_event_types", required = false) List<String> fetchEventTypes,
        @ApiParam(value = "A JSON-encoded array of arrays of length 2 indicating the narrow for which you'd like to receive events for. For instance, to receive events for the stream `Denmark`, you would specify `narrow=[['stream', 'Denmark']]`.  Another example is `narrow=[['is', 'private']]` for private messages. Default is `[]`. ")  @RequestParam(value = "narrow", required = false) List<List<String>> narrow,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<Void> restErrorHandling(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
