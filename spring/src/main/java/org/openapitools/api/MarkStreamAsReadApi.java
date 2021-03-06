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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Api(value = "mark_stream_as_read", description = "the mark_stream_as_read API")
public interface MarkStreamAsReadApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /mark_stream_as_read : Mark messages in a stream as read
     * Mark all the unread messages in a stream as read. 
     *
     * @param streamId The ID of the stream to access.  (required)
     * @return Success. (status code 200)
     */
    @ApiOperation(value = "Mark messages in a stream as read", nickname = "markStreamAsRead", notes = "Mark all the unread messages in a stream as read. ", response = JsonSuccess.class, tags={ "messages", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    @PostMapping(
        value = "/mark_stream_as_read",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccess> markStreamAsRead(@NotNull @ApiParam(value = "The ID of the stream to access. ", required = true) @Valid @RequestParam(value = "stream_id", required = true) Integer streamId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
