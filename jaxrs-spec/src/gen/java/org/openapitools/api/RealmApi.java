package org.openapitools.api;

import java.io.File;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/realm")
@Api(description = "the realm API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-08T20:42:36.410808Z[Etc/UTC]")public class RealmApi {

    @POST
    @Path("/playgrounds")
    @Produces({ "application/json" })
    @ApiOperation(value = "Add a code playground", notes = "Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). ", response = JsonSuccessBase.class, tags={ "server_and_organizations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response addCodePlayground(@QueryParam("name") @NotNull   @ApiParam("The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. ")  String name,@QueryParam("pygments_language") @NotNull   @ApiParam("The name of the Pygments language lexer for that programming language. ")  String pygmentsLanguage,@QueryParam("url_prefix") @NotNull   @ApiParam("The url prefix for the playground. ")  String urlPrefix) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/filters")
    @Produces({ "application/json" })
    @ApiOperation(value = "Add a linkifier", notes = "Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` ", response = JsonSuccessBase.class, tags={ "server_and_organizations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response addLinkifier(@QueryParam("pattern") @NotNull   @ApiParam("The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. ")  String pattern,@QueryParam("url_format_string") @NotNull   @ApiParam("The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. ")  String urlFormatString) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/profile_fields")
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a custom profile field", notes = "[Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` ", response = JsonSuccessBase.class, tags={ "server_and_organizations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response createCustomProfileField(@QueryParam("field_type") @NotNull   @ApiParam("The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account ")  Integer fieldType,@QueryParam("name")   @ApiParam("The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile. ")  String name,@QueryParam("hint")   @ApiParam("The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. ")  String hint,@QueryParam("field_data")   @ApiParam("Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. ")  Object fieldData) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/emoji")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all custom emoji", notes = "Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` ", response = JsonSuccessBase.class, tags={ "server_and_organizations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response getCustomEmoji() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/profile_fields")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all custom profile fields", notes = "Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` ", response = JsonSuccessBase.class, tags={ "server_and_organizations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response getCustomProfileFields() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/linkifiers")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get linkifiers", notes = "List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. ", response = JsonSuccessBase.class, tags={ "server_and_organizations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response getLinkifiers() {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/playgrounds/{playground_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove a code playground", notes = "Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). ", response = JsonSuccess.class, tags={ "server_and_organizations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class)
    })
    public Response removeCodePlayground(@PathParam("playground_id") @ApiParam("The ID of the playground that you want to remove. ") Integer playgroundId) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/filters/{filter_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove a linkifier", notes = "Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` ", response = JsonSuccess.class, tags={ "server_and_organizations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class)
    })
    public Response removeLinkifier(@PathParam("filter_id") @ApiParam("The ID of the linkifier that you want to remove. ") Integer filterId) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/profile_fields")
    @Produces({ "application/json" })
    @ApiOperation(value = "Reorder custom profile fields", notes = "Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). ", response = JsonSuccess.class, tags={ "server_and_organizations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class)
    })
    public Response reorderCustomProfileFields(@QueryParam("order") @NotNull   @ApiParam("A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. ")  List<Integer> order) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/filters/{filter_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Update a linkifier", notes = "Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). ", response = JsonSuccess.class, tags={ "server_and_organizations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class)
    })
    public Response updateLinkifier(@PathParam("filter_id") @ApiParam("The ID of the linkifier that you want to update. ") Integer filterId,@QueryParam("pattern") @NotNull   @ApiParam("The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. ")  String pattern,@QueryParam("url_format_string") @NotNull   @ApiParam("The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. ")  String urlFormatString) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/emoji/{emoji_name}")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Upload custom emoji", notes = "This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` ", response = JsonSuccess.class, tags={ "server_and_organizations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class)
    })
    public Response uploadCustomEmoji(@PathParam("emoji_name") @ApiParam("The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). ") String emojiName, @FormParam(value = "filename") InputStream filenameInputStream) {
        return Response.ok().entity("magic!").build();
    }
}
