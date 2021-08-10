/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.JsonSuccess;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-10T11:47:39.922565Z[Etc/UTC]")
@Validated
@Api(value = "mark_topic_as_read", description = "the mark_topic_as_read API")
public interface MarkTopicAsReadApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /mark_topic_as_read : Mark messages in a topic as read
     * Mark all the unread messages in a topic as read. 
     *
     * @param streamId The ID of the stream to access.  (required)
     * @param topicName The name of the topic whose messages should be marked as read.  (required)
     * @return Success. (status code 200)
     */
    @ApiOperation(value = "Mark messages in a topic as read", nickname = "markTopicAsRead", notes = "Mark all the unread messages in a topic as read. ", response = JsonSuccess.class, tags={ "messages", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    @PostMapping(
        value = "/mark_topic_as_read",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccess> markTopicAsRead(@NotNull @ApiParam(value = "The ID of the stream to access. ", required = true) @Valid @RequestParam(value = "stream_id", required = true) Integer streamId,@NotNull @ApiParam(value = "The name of the topic whose messages should be marked as read. ", required = true) @Valid @RequestParam(value = "topic_name", required = true) String topicName) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
