/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-08T20:43:06.633496Z[Etc/UTC]")
@Validated
@Api(value = "realm", description = "the realm API")
public interface RealmApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /realm/playgrounds : Add a code playground
     * Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  &#x60;POST {{ api_url }}/v1/realm/playgrounds&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
     *
     * @param name The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language.  (required)
     * @param pygmentsLanguage The name of the Pygments language lexer for that programming language.  (required)
     * @param urlPrefix The url prefix for the playground.  (required)
     * @return Success. (status code 200)
     */
    @ApiOperation(value = "Add a code playground", nickname = "addCodePlayground", notes = "Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). ", response = JsonSuccessBase.class, tags={ "server_and_organizations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    @PostMapping(
        value = "/realm/playgrounds",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccessBase> addCodePlayground(@NotNull @ApiParam(value = "The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. ", required = true) @Valid @RequestParam(value = "name", required = true) String name,@NotNull @ApiParam(value = "The name of the Pygments language lexer for that programming language. ", required = true) @Valid @RequestParam(value = "pygments_language", required = true) String pygmentsLanguage,@NotNull @ApiParam(value = "The url prefix for the playground. ", required = true) @Valid @RequestParam(value = "url_prefix", required = true) String urlPrefix) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /realm/filters : Add a linkifier
     * Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;POST {{ api_url }}/v1/realm/filters&#x60; 
     *
     * @param pattern The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  (required)
     * @param urlFormatString The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;.  (required)
     * @return Success. (status code 200)
     */
    @ApiOperation(value = "Add a linkifier", nickname = "addLinkifier", notes = "Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` ", response = JsonSuccessBase.class, tags={ "server_and_organizations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    @PostMapping(
        value = "/realm/filters",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccessBase> addLinkifier(@NotNull @ApiParam(value = "The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. ", required = true) @Valid @RequestParam(value = "pattern", required = true) String pattern,@NotNull @ApiParam(value = "The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. ", required = true) @Valid @RequestParam(value = "url_format_string", required = true) String urlFormatString) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /realm/profile_fields : Create a custom profile field
     * [Create a custom profile field](/help/add-custom-profile-fields) in the user&#39;s organization.  &#x60;POST {{ api_url }}/v1/realm/profile_fields&#x60; 
     *
     * @param fieldType The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account  (required)
     * @param name The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile.  (optional)
     * @param hint The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  (optional)
     * @param fieldData Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  (optional)
     * @return Success. (status code 200)
     */
    @ApiOperation(value = "Create a custom profile field", nickname = "createCustomProfileField", notes = "[Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` ", response = JsonSuccessBase.class, tags={ "server_and_organizations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    @PostMapping(
        value = "/realm/profile_fields",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccessBase> createCustomProfileField(@NotNull @ApiParam(value = "The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account ", required = true) @Valid @RequestParam(value = "field_type", required = true) Integer fieldType,@ApiParam(value = "The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user's profile. ") @Valid @RequestParam(value = "name", required = false) String name,@ApiParam(value = "The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. ") @Valid @RequestParam(value = "hint", required = false) String hint,@ApiParam(value = "Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. ") @Valid @RequestParam(value = "field_data", required = false) Object fieldData) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /realm/emoji : Get all custom emoji
     * Get all the custom emoji in the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/emoji&#x60; 
     *
     * @return Success. (status code 200)
     */
    @ApiOperation(value = "Get all custom emoji", nickname = "getCustomEmoji", notes = "Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` ", response = JsonSuccessBase.class, tags={ "server_and_organizations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    @GetMapping(
        value = "/realm/emoji",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccessBase> getCustomEmoji() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /realm/profile_fields : Get all custom profile fields
     * Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/profile_fields&#x60; 
     *
     * @return Success. (status code 200)
     */
    @ApiOperation(value = "Get all custom profile fields", nickname = "getCustomProfileFields", notes = "Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` ", response = JsonSuccessBase.class, tags={ "server_and_organizations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    @GetMapping(
        value = "/realm/profile_fields",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccessBase> getCustomProfileFields() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /realm/linkifiers : Get linkifiers
     * List all of an organization&#39;s configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;GET {{ api_url }}/v1/realm/linkifiers&#x60;  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar &#x60;GET /realm/filters&#x60; endpoint was available with each entry in a &#x60;[pattern, url_format, id]&#x60; tuple format. 
     *
     * @return Success. (status code 200)
     */
    @ApiOperation(value = "Get linkifiers", nickname = "getLinkifiers", notes = "List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. ", response = JsonSuccessBase.class, tags={ "server_and_organizations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    @GetMapping(
        value = "/realm/linkifiers",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccessBase> getLinkifiers() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /realm/playgrounds/{playground_id} : Remove a code playground
     * Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  &#x60;DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). 
     *
     * @param playgroundId The ID of the playground that you want to remove.  (required)
     * @return Success. (status code 200)
     */
    @ApiOperation(value = "Remove a code playground", nickname = "removeCodePlayground", notes = "Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). ", response = JsonSuccess.class, tags={ "server_and_organizations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    @DeleteMapping(
        value = "/realm/playgrounds/{playground_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccess> removeCodePlayground(@ApiParam(value = "The ID of the playground that you want to remove. ",required=true) @PathVariable("playground_id") Integer playgroundId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /realm/filters/{filter_id} : Remove a linkifier
     * Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;DELETE {{ api_url }}/v1/realm/filters/{filter_id}&#x60; 
     *
     * @param filterId The ID of the linkifier that you want to remove.  (required)
     * @return Success. (status code 200)
     */
    @ApiOperation(value = "Remove a linkifier", nickname = "removeLinkifier", notes = "Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` ", response = JsonSuccess.class, tags={ "server_and_organizations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    @DeleteMapping(
        value = "/realm/filters/{filter_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccess> removeLinkifier(@ApiParam(value = "The ID of the linkifier that you want to remove. ",required=true) @PathVariable("filter_id") Integer filterId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PATCH /realm/profile_fields : Reorder custom profile fields
     * Reorder the custom profile fields in the user&#39;s organization.  &#x60;PATCH {{ api_url }}/v1/realm/profile_fields&#x60;  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
     *
     * @param order A list of the IDs of all the custom profile fields defined in this organization, in the desired new order.  (required)
     * @return Success. (status code 200)
     */
    @ApiOperation(value = "Reorder custom profile fields", nickname = "reorderCustomProfileFields", notes = "Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). ", response = JsonSuccess.class, tags={ "server_and_organizations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    @PatchMapping(
        value = "/realm/profile_fields",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccess> reorderCustomProfileFields(@NotNull @ApiParam(value = "A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. ", required = true) @Valid @RequestParam(value = "order", required = true) List<Integer> order) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PATCH /realm/filters/{filter_id} : Update a linkifier
     * Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;PATCH {{ api_url }}/v1/realm/filters/{filter_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 57). 
     *
     * @param filterId The ID of the linkifier that you want to update.  (required)
     * @param pattern The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  (required)
     * @param urlFormatString The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;.  (required)
     * @return Success. (status code 200)
     */
    @ApiOperation(value = "Update a linkifier", nickname = "updateLinkifier", notes = "Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). ", response = JsonSuccess.class, tags={ "server_and_organizations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    @PatchMapping(
        value = "/realm/filters/{filter_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccess> updateLinkifier(@ApiParam(value = "The ID of the linkifier that you want to update. ",required=true) @PathVariable("filter_id") Integer filterId,@NotNull @ApiParam(value = "The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. ", required = true) @Valid @RequestParam(value = "pattern", required = true) String pattern,@NotNull @ApiParam(value = "The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. ", required = true) @Valid @RequestParam(value = "url_format_string", required = true) String urlFormatString) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /realm/emoji/{emoji_name} : Upload custom emoji
     * This endpoint is used to upload a custom emoji for use in the user&#39;s organization.  Access to this endpoint depends on the [organization&#39;s configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  &#x60;POST {{ api_url }}/v1/realm/emoji/{emoji_name}&#x60; 
     *
     * @param emojiName The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji).  (required)
     * @param filename  (optional)
     * @return Success. (status code 200)
     */
    @ApiOperation(value = "Upload custom emoji", nickname = "uploadCustomEmoji", notes = "This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` ", response = JsonSuccess.class, tags={ "server_and_organizations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    @PostMapping(
        value = "/realm/emoji/{emoji_name}",
        produces = { "application/json" },
        consumes = { "multipart/form-data" }
    )
    default ResponseEntity<JsonSuccess> uploadCustomEmoji(@ApiParam(value = "The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). ",required=true) @PathVariable("emoji_name") String emojiName,@ApiParam(value = "") @Valid @RequestPart(value = "filename", required = false) MultipartFile filename) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}