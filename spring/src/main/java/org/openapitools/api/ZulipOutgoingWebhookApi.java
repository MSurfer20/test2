/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.InlineResponse200;
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
@Api(value = "zulip-outgoing-webhook", description = "the zulip-outgoing-webhook API")
public interface ZulipOutgoingWebhookApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /zulip-outgoing-webhook : Outgoing webhooks
     * Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
     *
     * @return Success  (status code 200)
     */
    @ApiOperation(value = "Outgoing webhooks", nickname = "zulipOutgoingWebhooks", notes = "Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. ", response = InlineResponse200.class, tags={ "webhooks", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success ", response = InlineResponse200.class) })
    @PostMapping(
        value = "/zulip-outgoing-webhook",
        produces = { "application/json" }
    )
    default ResponseEntity<InlineResponse200> zulipOutgoingWebhooks() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : \"@**Outgoing webhook test** Zulip is the world’s most productive group chat!\", \"trigger\" : \"mention\", \"token\" : \"xvOzfurIutdRRVLzpXrIIHXJvNfaJLJ0\", \"message\" : { \"subject\" : \"Verona2\", \"sender_email\" : \"iago@zulip.com\", \"timestamp\" : 1527876931, \"client\" : \"website\", \"submessages\" : [ ], \"recipient_id\" : 20, \"topic_links\" : [ ], \"sender_full_name\" : \"Iago\", \"avatar_url\" : \"https://secure.gravatar.com/avatar/1f4f1575bf002ae562fea8fc4b861b09?d=identicon&version=1\", \"rendered_content\" : \"<p><span class=\\"user-mention\\" data-user-id=\\"25\\">@Outgoing webhook test</span> Zulip is the world’s most productive group chat!</p>\", \"sender_id\" : 5, \"stream_id\" : 5, \"content\" : \"@**Outgoing webhook test** Zulip is the world’s most productive group chat!\", \"display_recipient\" : \"Verona\", \"type\" : \"stream\", \"id\" : 112, \"is_me_message\" : false, \"reactions\" : [ ], \"sender_realm_str\" : \"zulip\" }, \"bot_email\" : \"outgoing-bot@localhost\", \"bot_full_name\" : \"Outgoing webhook test\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
