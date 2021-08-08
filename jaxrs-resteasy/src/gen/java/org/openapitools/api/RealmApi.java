package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.RealmApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

@Path("/realm")


@io.swagger.annotations.Api(description = "the realm API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-08T21:20:05.336070Z[Etc/UTC]")
public class RealmApi  {

    @Inject RealmApiService service;

    @POST
    @Path("/playgrounds")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add a code playground", notes = "Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). ", response = JsonSuccessBase.class, tags={ "server_and_organizations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response addCodePlayground( @NotNull  @QueryParam("name") String name, @NotNull  @QueryParam("pygments_language") String pygmentsLanguage, @NotNull  @QueryParam("url_prefix") String urlPrefix,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addCodePlayground(name,pygmentsLanguage,urlPrefix,securityContext);
    }
    @POST
    @Path("/filters")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add a linkifier", notes = "Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` ", response = JsonSuccessBase.class, tags={ "server_and_organizations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response addLinkifier( @NotNull  @QueryParam("pattern") String pattern, @NotNull  @QueryParam("url_format_string") String urlFormatString,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addLinkifier(pattern,urlFormatString,securityContext);
    }
    @POST
    @Path("/profile_fields")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a custom profile field", notes = "[Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` ", response = JsonSuccessBase.class, tags={ "server_and_organizations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response createCustomProfileField( @NotNull  @QueryParam("field_type") Integer fieldType,  @QueryParam("name") String name,  @QueryParam("hint") String hint,  @QueryParam("field_data") Object fieldData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createCustomProfileField(fieldType,name,hint,fieldData,securityContext);
    }
    @GET
    @Path("/emoji")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all custom emoji", notes = "Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` ", response = JsonSuccessBase.class, tags={ "server_and_organizations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getCustomEmoji(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCustomEmoji(securityContext);
    }
    @GET
    @Path("/profile_fields")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all custom profile fields", notes = "Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` ", response = JsonSuccessBase.class, tags={ "server_and_organizations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getCustomProfileFields(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCustomProfileFields(securityContext);
    }
    @GET
    @Path("/linkifiers")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get linkifiers", notes = "List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. ", response = JsonSuccessBase.class, tags={ "server_and_organizations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getLinkifiers(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getLinkifiers(securityContext);
    }
    @DELETE
    @Path("/playgrounds/{playground_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Remove a code playground", notes = "Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). ", response = JsonSuccess.class, tags={ "server_and_organizations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public Response removeCodePlayground( @PathParam("playground_id") Integer playgroundId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeCodePlayground(playgroundId,securityContext);
    }
    @DELETE
    @Path("/filters/{filter_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Remove a linkifier", notes = "Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` ", response = JsonSuccess.class, tags={ "server_and_organizations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public Response removeLinkifier( @PathParam("filter_id") Integer filterId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeLinkifier(filterId,securityContext);
    }
    @PATCH
    @Path("/profile_fields")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Reorder custom profile fields", notes = "Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). ", response = JsonSuccess.class, tags={ "server_and_organizations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public Response reorderCustomProfileFields( @NotNull  @QueryParam("order") List<Integer> order,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.reorderCustomProfileFields(order,securityContext);
    }
    @PATCH
    @Path("/filters/{filter_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update a linkifier", notes = "Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). ", response = JsonSuccess.class, tags={ "server_and_organizations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public Response updateLinkifier( @PathParam("filter_id") Integer filterId, @NotNull  @QueryParam("pattern") String pattern, @NotNull  @QueryParam("url_format_string") String urlFormatString,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateLinkifier(filterId,pattern,urlFormatString,securityContext);
    }
    @POST
    @Path("/emoji/{emoji_name}")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Upload custom emoji", notes = "This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` ", response = JsonSuccess.class, tags={ "server_and_organizations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public Response uploadCustomEmoji(MultipartFormDataInput input, @PathParam("emoji_name") String emojiName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.uploadCustomEmoji(input,emojiName,securityContext);
    }
}
