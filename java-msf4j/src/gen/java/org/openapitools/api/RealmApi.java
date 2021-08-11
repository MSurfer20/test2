package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.RealmApiService;
import org.openapitools.api.factories.RealmApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/realm")


@io.swagger.annotations.Api(description = "the realm API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen")
public class RealmApi  {
   private final RealmApiService delegate = RealmApiServiceFactory.getRealmApi();

    @POST
    @Path("/playgrounds")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add a code playground", notes = "Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). ", response = JsonSuccessBase.class, tags={ "server_and_organizations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response addCodePlayground(@ApiParam(value = "The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. ",required=true) @QueryParam("name") String name
,@ApiParam(value = "The name of the Pygments language lexer for that programming language. ",required=true) @QueryParam("pygments_language") String pygmentsLanguage
,@ApiParam(value = "The url prefix for the playground. ",required=true) @QueryParam("url_prefix") String urlPrefix
)
    throws NotFoundException {
        return delegate.addCodePlayground(name,pygmentsLanguage,urlPrefix);
    }
    @POST
    @Path("/filters")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add a linkifier", notes = "Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` ", response = JsonSuccessBase.class, tags={ "server_and_organizations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response addLinkifier(@ApiParam(value = "The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. ",required=true) @QueryParam("pattern") String pattern
,@ApiParam(value = "The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. ",required=true) @QueryParam("url_format_string") String urlFormatString
)
    throws NotFoundException {
        return delegate.addLinkifier(pattern,urlFormatString);
    }
    @POST
    @Path("/profile_fields")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a custom profile field", notes = "[Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` ", response = JsonSuccessBase.class, tags={ "server_and_organizations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response createCustomProfileField(@ApiParam(value = "The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account ",required=true) @QueryParam("field_type") Integer fieldType
,@ApiParam(value = "The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user's profile. ") @QueryParam("name") String name
,@ApiParam(value = "The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. ") @QueryParam("hint") String hint
,@ApiParam(value = "Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. ") @QueryParam("field_data") Object fieldData
)
    throws NotFoundException {
        return delegate.createCustomProfileField(fieldType,name,hint,fieldData);
    }
    @GET
    @Path("/emoji")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all custom emoji", notes = "Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` ", response = JsonSuccessBase.class, tags={ "server_and_organizations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getCustomEmoji()
    throws NotFoundException {
        return delegate.getCustomEmoji();
    }
    @GET
    @Path("/profile_fields")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all custom profile fields", notes = "Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` ", response = JsonSuccessBase.class, tags={ "server_and_organizations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getCustomProfileFields()
    throws NotFoundException {
        return delegate.getCustomProfileFields();
    }
    @GET
    @Path("/linkifiers")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get linkifiers", notes = "List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. ", response = JsonSuccessBase.class, tags={ "server_and_organizations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getLinkifiers()
    throws NotFoundException {
        return delegate.getLinkifiers();
    }
    @DELETE
    @Path("/playgrounds/{playground_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Remove a code playground", notes = "Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). ", response = JsonSuccess.class, tags={ "server_and_organizations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public Response removeCodePlayground(@ApiParam(value = "The ID of the playground that you want to remove. ",required=true) @PathParam("playground_id") Integer playgroundId
)
    throws NotFoundException {
        return delegate.removeCodePlayground(playgroundId);
    }
    @DELETE
    @Path("/filters/{filter_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Remove a linkifier", notes = "Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` ", response = JsonSuccess.class, tags={ "server_and_organizations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public Response removeLinkifier(@ApiParam(value = "The ID of the linkifier that you want to remove. ",required=true) @PathParam("filter_id") Integer filterId
)
    throws NotFoundException {
        return delegate.removeLinkifier(filterId);
    }
    @PATCH
    @Path("/profile_fields")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Reorder custom profile fields", notes = "Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). ", response = JsonSuccess.class, tags={ "server_and_organizations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public Response reorderCustomProfileFields(@ApiParam(value = "A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. ",required=true) @QueryParam("order") List<Integer> order
)
    throws NotFoundException {
        return delegate.reorderCustomProfileFields(order);
    }
    @PATCH
    @Path("/filters/{filter_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update a linkifier", notes = "Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). ", response = JsonSuccess.class, tags={ "server_and_organizations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public Response updateLinkifier(@ApiParam(value = "The ID of the linkifier that you want to update. ",required=true) @PathParam("filter_id") Integer filterId
,@ApiParam(value = "The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. ",required=true) @QueryParam("pattern") String pattern
,@ApiParam(value = "The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. ",required=true) @QueryParam("url_format_string") String urlFormatString
)
    throws NotFoundException {
        return delegate.updateLinkifier(filterId,pattern,urlFormatString);
    }
    @POST
    @Path("/emoji/{emoji_name}")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Upload custom emoji", notes = "This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` ", response = JsonSuccess.class, tags={ "server_and_organizations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public Response uploadCustomEmoji(@ApiParam(value = "The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). ",required=true) @PathParam("emoji_name") String emojiName
,
            @FormDataParam("filename") InputStream filenameInputStream,
            @FormDataParam("filename") FileInfo filenameDetail
)
    throws NotFoundException {
        return delegate.uploadCustomEmoji(emojiName,filenameInputStream, filenameDetail);
    }
}
