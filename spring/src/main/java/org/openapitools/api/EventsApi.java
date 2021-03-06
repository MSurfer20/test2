/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.BadEventQueueIdError;
import org.openapitools.model.JsonSuccess;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Api(value = "events", description = "the events API")
public interface EventsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /events : Delete an event queue
     * Delete a previously registered queue.  &#x60;DELETE {{ api_url }}/v1/events&#x60; 
     *
     * @param queueId The ID of an event queue that was previously registered via &#x60;POST /api/v1/register&#x60; (see [Register a queue](/api/register-queue)).  (required)
     * @return Success. (status code 200)
     *         or Bad request. (status code 400)
     */
    @ApiOperation(value = "Delete an event queue", nickname = "deleteQueue", notes = "Delete a previously registered queue.  `DELETE {{ api_url }}/v1/events` ", response = JsonSuccess.class, tags={ "real_time_events", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = BadEventQueueIdError.class) })
    @DeleteMapping(
        value = "/events",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccess> deleteQueue(@NotNull @ApiParam(value = "The ID of an event queue that was previously registered via `POST /api/v1/register` (see [Register a queue](/api/register-queue)). ", required = true) @Valid @RequestParam(value = "queue_id", required = true) String queueId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /events : Get events from an event queue
     * &#x60;GET {{ api_url }}/v1/events&#x60;  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the &#x60;event_queue_longpoll_timeout_seconds&#x60; property returned by &#x60;POST /register&#x60; as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases. 
     *
     * @param queueId The ID of an event queue that was previously registered via &#x60;POST /api/v1/register&#x60; (see [Register a queue](/api/register-queue)).  (required)
     * @param lastEventId The highest event ID in this queue that you&#39;ve received and wish to acknowledge. See the [code for &#x60;call_on_each_event&#x60;](https://github.com/zulip/python-zulip-api/blob/master/zulip/zulip/__init__.py) in the [zulip Python module](https://github.com/zulip/python-zulip-api) for an example implementation of correctly processing each event exactly once.  (optional)
     * @param dontBlock Set to &#x60;true&#x60; if the client is requesting a nonblocking reply. If not specified, the request will block until either a new event is available or a few minutes have passed, in which case the server will send the client a heartbeat event.  (optional, default to false)
     * @return Success. (status code 200)
     *         or Bad request. (status code 400)
     */
    @ApiOperation(value = "Get events from an event queue", nickname = "getEvents", notes = "`GET {{ api_url }}/v1/events`  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the `event_queue_longpoll_timeout_seconds` property returned by `POST /register` as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases. ", response = JsonSuccessBase.class, tags={ "real_time_events", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = BadEventQueueIdError.class) })
    @GetMapping(
        value = "/events",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccessBase> getEvents(@NotNull @ApiParam(value = "The ID of an event queue that was previously registered via `POST /api/v1/register` (see [Register a queue](/api/register-queue)). ", required = true) @Valid @RequestParam(value = "queue_id", required = true) String queueId,@ApiParam(value = "The highest event ID in this queue that you've received and wish to acknowledge. See the [code for `call_on_each_event`](https://github.com/zulip/python-zulip-api/blob/master/zulip/zulip/__init__.py) in the [zulip Python module](https://github.com/zulip/python-zulip-api) for an example implementation of correctly processing each event exactly once. ") @Valid @RequestParam(value = "last_event_id", required = false) Integer lastEventId,@ApiParam(value = "Set to `true` if the client is requesting a nonblocking reply. If not specified, the request will block until either a new event is available or a few minutes have passed, in which case the server will send the client a heartbeat event. ", defaultValue = "false") @Valid @RequestParam(value = "dont_block", required = false, defaultValue="false") Boolean dontBlock) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
