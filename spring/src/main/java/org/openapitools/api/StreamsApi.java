/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.CodedError;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.model.OneOfstringinteger;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-08T21:15:36.024879Z[Etc/UTC]")
@Validated
@Api(value = "streams", description = "the streams API")
public interface StreamsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /streams/{stream_id} : Archive a stream
     * [Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.  &#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60; 
     *
     * @param streamId The ID of the stream to access.  (required)
     * @return Success. (status code 200)
     *         or Bad request. (status code 400)
     */
    @ApiOperation(value = "Archive a stream", nickname = "archiveStream", notes = "[Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` ", response = JsonSuccess.class, tags={ "streams", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    @DeleteMapping(
        value = "/streams/{stream_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccess> archiveStream(@ApiParam(value = "The ID of the stream to access. ",required=true) @PathVariable("stream_id") Integer streamId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /streams/{stream_id}/delete_topic : Delete a topic
     * Delete all messages in a topic.  &#x60;POST {{ api_url }}/v1/streams/{stream_id}/delete_topic&#x60;  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. 
     *
     * @param streamId The ID of the stream to access.  (required)
     * @param topicName The name of the topic to delete.  (required)
     * @return Success. (status code 200)
     *         or Error. (status code 400)
     */
    @ApiOperation(value = "Delete a topic", nickname = "deleteTopic", notes = "Delete all messages in a topic.  `POST {{ api_url }}/v1/streams/{stream_id}/delete_topic`  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. ", response = JsonSuccess.class, tags={ "streams", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Error.", response = JsonError.class) })
    @PostMapping(
        value = "/streams/{stream_id}/delete_topic",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccess> deleteTopic(@ApiParam(value = "The ID of the stream to access. ",required=true) @PathVariable("stream_id") Integer streamId,@NotNull @ApiParam(value = "The name of the topic to delete. ", required = true) @Valid @RequestParam(value = "topic_name", required = true) String topicName) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /streams : Get all streams
     * Get all streams that the user has access to.  &#x60;GET {{ api_url }}/v1/streams&#x60; 
     *
     * @param includePublic Include all public streams.  (optional, default to true)
     * @param includeWebPublic Include all web public streams.  (optional, default to false)
     * @param includeSubscribed Include all streams that the user is subscribed to.  (optional, default to true)
     * @param includeAllActive Include all active streams. The user must have administrative privileges to use this parameter.  (optional, default to false)
     * @param includeDefault Include all default streams for the user&#39;s realm.  (optional, default to false)
     * @param includeOwnerSubscribed If the user is a bot, include all streams that the bot&#39;s owner is subscribed to.  (optional, default to false)
     * @return Success. (status code 200)
     *         or Bad request. (status code 400)
     */
    @ApiOperation(value = "Get all streams", nickname = "getStreams", notes = "Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` ", response = JsonSuccessBase.class, tags={ "streams", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    @GetMapping(
        value = "/streams",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccessBase> getStreams(@ApiParam(value = "Include all public streams. ", defaultValue = "true") @Valid @RequestParam(value = "include_public", required = false, defaultValue="true") Boolean includePublic,@ApiParam(value = "Include all web public streams. ", defaultValue = "false") @Valid @RequestParam(value = "include_web_public", required = false, defaultValue="false") Boolean includeWebPublic,@ApiParam(value = "Include all streams that the user is subscribed to. ", defaultValue = "true") @Valid @RequestParam(value = "include_subscribed", required = false, defaultValue="true") Boolean includeSubscribed,@ApiParam(value = "Include all active streams. The user must have administrative privileges to use this parameter. ", defaultValue = "false") @Valid @RequestParam(value = "include_all_active", required = false, defaultValue="false") Boolean includeAllActive,@ApiParam(value = "Include all default streams for the user's realm. ", defaultValue = "false") @Valid @RequestParam(value = "include_default", required = false, defaultValue="false") Boolean includeDefault,@ApiParam(value = "If the user is a bot, include all streams that the bot's owner is subscribed to. ", defaultValue = "false") @Valid @RequestParam(value = "include_owner_subscribed", required = false, defaultValue="false") Boolean includeOwnerSubscribed) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /streams/{stream_id}/members : Get the subscribers of a stream
     * Get all users subscribed to a stream.  &#x60;Get {{ api_url }}/v1/streams/{stream_id}/members&#x60; 
     *
     * @param streamId The ID of the stream to access.  (required)
     * @return Success. (status code 200)
     *         or Bad request. (status code 400)
     */
    @ApiOperation(value = "Get the subscribers of a stream", nickname = "getSubscribers", notes = "Get all users subscribed to a stream.  `Get {{ api_url }}/v1/streams/{stream_id}/members` ", response = JsonSuccessBase.class, tags={ "streams", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    @GetMapping(
        value = "/streams/{stream_id}/members",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccessBase> getSubscribers(@ApiParam(value = "The ID of the stream to access. ",required=true) @PathVariable("stream_id") Integer streamId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PATCH /streams/{stream_id} : Update a stream
     * Configure the stream with the ID &#x60;stream_id&#x60;.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  &#x60;PATCH {{ api_url }}/v1/streams/{stream_id}&#x60; 
     *
     * @param streamId The ID of the stream to access.  (required)
     * @param description The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional)
     * @param newName The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional)
     * @param isPrivate Change whether the stream is a private stream.  (optional)
     * @param isAnnouncementOnly Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead.  (optional)
     * @param streamPostPolicy Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  (optional, default to 1)
     * @param historyPublicToSubscribers Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  (optional)
     * @param messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  (optional)
     * @return Success. (status code 200)
     *         or Bad request. (status code 400)
     */
    @ApiOperation(value = "Update a stream", nickname = "updateStream", notes = "Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` ", response = JsonSuccess.class, tags={ "streams", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    @PatchMapping(
        value = "/streams/{stream_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccess> updateStream(@ApiParam(value = "The ID of the stream to access. ",required=true) @PathVariable("stream_id") Integer streamId,@ApiParam(value = "The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). ") @Valid @RequestParam(value = "description", required = false) String description,@ApiParam(value = "The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). ") @Valid @RequestParam(value = "new_name", required = false) String newName,@ApiParam(value = "Change whether the stream is a private stream. ") @Valid @RequestParam(value = "is_private", required = false) Boolean isPrivate,@ApiParam(value = "Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead. ") @Valid @RequestParam(value = "is_announcement_only", required = false) Boolean isAnnouncementOnly,@ApiParam(value = "Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. ", defaultValue = "1") @Valid @RequestParam(value = "stream_post_policy", required = false, defaultValue="1") Integer streamPostPolicy,@ApiParam(value = "Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. ") @Valid @RequestParam(value = "history_public_to_subscribers", required = false) Boolean historyPublicToSubscribers,@ApiParam(value = "Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). ") @Valid OneOfstringinteger messageRetentionDays) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
