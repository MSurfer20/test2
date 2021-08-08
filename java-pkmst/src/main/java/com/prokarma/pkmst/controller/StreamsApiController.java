package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CodedError;
import com.prokarma.pkmst.model.JsonError;
import com.prokarma.pkmst.model.JsonSuccess;
import com.prokarma.pkmst.model.JsonSuccessBase;
import com.prokarma.pkmst.model.NonExistingStreamError;
import com.prokarma.pkmst.model.OneOfobjectobject;
import com.prokarma.pkmst.model.OneOfstringinteger;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2021-08-08T21:11:34.287957Z[Etc/UTC]")
@Controller
public class StreamsApiController implements StreamsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public StreamsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<JsonSuccess> archiveStream(@ApiParam(value = "The ID of the stream to access. ",required=true ) @PathVariable("stream_id") Integer streamId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> createBigBlueButtonVideoCall(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> deleteTopic(@ApiParam(value = "The ID of the stream to access. ",required=true ) @PathVariable("stream_id") Integer streamId,
        @ApiParam(value = "The name of the topic to delete. ", required = true)  @RequestParam(value = "topic_name", required = true) String topicName,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> getStreamId(@ApiParam(value = "The name of the stream to access. ", required = true)  @RequestParam(value = "stream", required = true) String stream,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> getStreamTopics(@ApiParam(value = "The ID of the stream to access. ",required=true ) @PathVariable("stream_id") Integer streamId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> getStreams(@ApiParam(value = "Include all public streams. ", defaultValue = "true")  @RequestParam(value = "include_public", required = false, defaultValue="true") Boolean includePublic,
        @ApiParam(value = "Include all web public streams. ", defaultValue = "false")  @RequestParam(value = "include_web_public", required = false, defaultValue="false") Boolean includeWebPublic,
        @ApiParam(value = "Include all streams that the user is subscribed to. ", defaultValue = "true")  @RequestParam(value = "include_subscribed", required = false, defaultValue="true") Boolean includeSubscribed,
        @ApiParam(value = "Include all active streams. The user must have administrative privileges to use this parameter. ", defaultValue = "false")  @RequestParam(value = "include_all_active", required = false, defaultValue="false") Boolean includeAllActive,
        @ApiParam(value = "Include all default streams for the user's realm. ", defaultValue = "false")  @RequestParam(value = "include_default", required = false, defaultValue="false") Boolean includeDefault,
        @ApiParam(value = "If the user is a bot, include all streams that the bot's owner is subscribed to. ", defaultValue = "false")  @RequestParam(value = "include_owner_subscribed", required = false, defaultValue="false") Boolean includeOwnerSubscribed,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> getSubscribers(@ApiParam(value = "The ID of the stream to access. ",required=true ) @PathVariable("stream_id") Integer streamId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> getSubscriptionStatus(@ApiParam(value = "The target user's ID. ",required=true ) @PathVariable("user_id") Integer userId,
        @ApiParam(value = "The ID of the stream to access. ",required=true ) @PathVariable("stream_id") Integer streamId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> getSubscriptions(@ApiParam(value = "Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. ", defaultValue = "false")  @RequestParam(value = "include_subscribers", required = false, defaultValue="false") Boolean includeSubscribers,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> muteTopic(@ApiParam(value = "The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. ", required = true)  @RequestParam(value = "topic", required = true) String topic,
        @ApiParam(value = "Whether to mute (`add`) or unmute (`remove`) the provided topic. ", required = true, allowableValues = "add, remove")  @RequestParam(value = "op", required = true) String op,
        @ApiParam(value = "The name of the stream to access. ")  @RequestParam(value = "stream", required = false) String stream,
        @ApiParam(value = "The ID of the stream to access. ")  @RequestParam(value = "stream_id", required = false) Integer streamId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<OneOfobjectobject> subscribe(@ApiParam(value = "A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value. ", required = true)  @RequestParam(value = "subscriptions", required = true) List<Object> subscriptions,
        @ApiParam(value = "A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). ")  @RequestParam(value = "principals", required = false) List<OneOfstringinteger> principals,
        @ApiParam(value = "A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When `True`, an authorization error is reported as such. When set to `False`, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the `unauthorized` key. ", defaultValue = "true")  @RequestParam(value = "authorization_errors_fatal", required = false, defaultValue="true") Boolean authorizationErrorsFatal,
        @ApiParam(value = "If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream's creation. ", defaultValue = "false")  @RequestParam(value = "announce", required = false, defaultValue="false") Boolean announce,
        @ApiParam(value = "As described above, this endpoint will create a new stream if passed a stream name that doesn't already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. ", defaultValue = "false")  @RequestParam(value = "invite_only", required = false, defaultValue="false") Boolean inviteOnly,
        @ApiParam(value = "Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. ")  @RequestParam(value = "history_public_to_subscribers", required = false) Boolean historyPublicToSubscribers,
        @ApiParam(value = "Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. ", defaultValue = "1")  @RequestParam(value = "stream_post_policy", required = false, defaultValue="1") Integer streamPostPolicy,
        @ApiParam(value = "Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). ")  @RequestParam(value = "message_retention_days", required = false) OneOfstringinteger messageRetentionDays,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<OneOfobjectobject>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> unsubscribe(@ApiParam(value = "A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API. ", required = true)  @RequestParam(value = "subscriptions", required = true) List<String> subscriptions,
        @ApiParam(value = "A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). ")  @RequestParam(value = "principals", required = false) List<OneOfstringinteger> principals,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> updateStream(@ApiParam(value = "The ID of the stream to access. ",required=true ) @PathVariable("stream_id") Integer streamId,
        @ApiParam(value = "The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). ")  @RequestParam(value = "description", required = false) String description,
        @ApiParam(value = "The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). ")  @RequestParam(value = "new_name", required = false) String newName,
        @ApiParam(value = "Change whether the stream is a private stream. ")  @RequestParam(value = "is_private", required = false) Boolean isPrivate,
        @ApiParam(value = "Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead. ")  @RequestParam(value = "is_announcement_only", required = false) Boolean isAnnouncementOnly,
        @ApiParam(value = "Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. ", defaultValue = "1")  @RequestParam(value = "stream_post_policy", required = false, defaultValue="1") Integer streamPostPolicy,
        @ApiParam(value = "Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. ")  @RequestParam(value = "history_public_to_subscribers", required = false) Boolean historyPublicToSubscribers,
        @ApiParam(value = "Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). ")  @RequestParam(value = "message_retention_days", required = false) OneOfstringinteger messageRetentionDays,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> updateSubscriptionSettings(@ApiParam(value = "A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream. ", required = true)  @RequestParam(value = "subscription_data", required = true) List<Object> subscriptionData,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> updateSubscriptions(@ApiParam(value = "A list of stream names to unsubscribe from. ")  @RequestParam(value = "delete", required = false) List<String> delete,
        @ApiParam(value = "A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. ")  @RequestParam(value = "add", required = false) List<Object> add,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

}
