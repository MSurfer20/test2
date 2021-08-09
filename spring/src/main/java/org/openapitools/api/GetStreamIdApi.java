/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.CodedError;
import org.openapitools.model.JsonSuccessBase;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-09T21:37:26.812648Z[Etc/UTC]")
@Validated
@Api(value = "get_stream_id", description = "the get_stream_id API")
public interface GetStreamIdApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /get_stream_id : Get stream ID
     * Get the unique ID of a given stream.  &#x60;GET {{ api_url }}/v1/get_stream_id&#x60; 
     *
     * @param stream The name of the stream to access.  (required)
     * @return Success. (status code 200)
     *         or Bad request. (status code 400)
     */
    @ApiOperation(value = "Get stream ID", nickname = "getStreamId", notes = "Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` ", response = JsonSuccessBase.class, tags={ "streams", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    @GetMapping(
        value = "/get_stream_id",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccessBase> getStreamId(@NotNull @ApiParam(value = "The name of the stream to access. ", required = true) @Valid @RequestParam(value = "stream", required = true) String stream) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
