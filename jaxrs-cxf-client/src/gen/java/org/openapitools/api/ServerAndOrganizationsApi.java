package org.openapitools.api;

import java.io.File;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * Zulip REST API
 *
 * <p>Powerful open source group chat 
 *
 */
@Path("")
@Api(value = "/", description = "")
public interface ServerAndOrganizationsApi  {

    /**
     * Add a code playground
     *
     * Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  &#x60;POST {{ api_url }}/v1/realm/playgrounds&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
     *
     */
    @POST
    @Path("/realm/playgrounds")
    @Produces({ "application/json" })
    @ApiOperation(value = "Add a code playground", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public JsonSuccessBase addCodePlayground(@QueryParam("name") String name, @QueryParam("pygments_language") String pygmentsLanguage, @QueryParam("url_prefix") String urlPrefix);

    /**
     * Add a linkifier
     *
     * Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;POST {{ api_url }}/v1/realm/filters&#x60; 
     *
     */
    @POST
    @Path("/realm/filters")
    @Produces({ "application/json" })
    @ApiOperation(value = "Add a linkifier", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public JsonSuccessBase addLinkifier(@QueryParam("pattern") String pattern, @QueryParam("url_format_string") String urlFormatString);

    /**
     * Create a custom profile field
     *
     * [Create a custom profile field](/help/add-custom-profile-fields) in the user&#39;s organization.  &#x60;POST {{ api_url }}/v1/realm/profile_fields&#x60; 
     *
     */
    @POST
    @Path("/realm/profile_fields")
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a custom profile field", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public JsonSuccessBase createCustomProfileField(@QueryParam("field_type") Integer fieldType, @QueryParam("name") String name, @QueryParam("hint") String hint, @QueryParam("field_data") Object fieldData);

    /**
     * Get all custom emoji
     *
     * Get all the custom emoji in the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/emoji&#x60; 
     *
     */
    @GET
    @Path("/realm/emoji")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all custom emoji", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public JsonSuccessBase getCustomEmoji();

    /**
     * Get all custom profile fields
     *
     * Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/profile_fields&#x60; 
     *
     */
    @GET
    @Path("/realm/profile_fields")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all custom profile fields", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public JsonSuccessBase getCustomProfileFields();

    /**
     * Get linkifiers
     *
     * List all of an organization&#39;s configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;GET {{ api_url }}/v1/realm/linkifiers&#x60;  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar &#x60;GET /realm/filters&#x60; endpoint was available with each entry in a &#x60;[pattern, url_format, id]&#x60; tuple format. 
     *
     */
    @GET
    @Path("/realm/linkifiers")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get linkifiers", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public JsonSuccessBase getLinkifiers();

    /**
     * Get server settings
     *
     * Fetch global settings for a Zulip server.  &#x60;GET {{ api_url }}/v1/server_settings&#x60;  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it&#39;s running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
     *
     */
    @GET
    @Path("/server_settings")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get server settings", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public JsonSuccessBase getServerSettings();

    /**
     * Remove a code playground
     *
     * Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  &#x60;DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). 
     *
     */
    @DELETE
    @Path("/realm/playgrounds/{playground_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove a code playground", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public JsonSuccess removeCodePlayground(@PathParam("playground_id") Integer playgroundId);

    /**
     * Remove a linkifier
     *
     * Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;DELETE {{ api_url }}/v1/realm/filters/{filter_id}&#x60; 
     *
     */
    @DELETE
    @Path("/realm/filters/{filter_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove a linkifier", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public JsonSuccess removeLinkifier(@PathParam("filter_id") Integer filterId);

    /**
     * Reorder custom profile fields
     *
     * Reorder the custom profile fields in the user&#39;s organization.  &#x60;PATCH {{ api_url }}/v1/realm/profile_fields&#x60;  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
     *
     */
    @PATCH
    @Path("/realm/profile_fields")
    @Produces({ "application/json" })
    @ApiOperation(value = "Reorder custom profile fields", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public JsonSuccess reorderCustomProfileFields(@QueryParam("order") List<Integer> order);

    /**
     * Update a linkifier
     *
     * Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;PATCH {{ api_url }}/v1/realm/filters/{filter_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 57). 
     *
     */
    @PATCH
    @Path("/realm/filters/{filter_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Update a linkifier", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public JsonSuccess updateLinkifier(@PathParam("filter_id") Integer filterId, @QueryParam("pattern") String pattern, @QueryParam("url_format_string") String urlFormatString);

    /**
     * Upload custom emoji
     *
     * This endpoint is used to upload a custom emoji for use in the user&#39;s organization.  Access to this endpoint depends on the [organization&#39;s configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  &#x60;POST {{ api_url }}/v1/realm/emoji/{emoji_name}&#x60; 
     *
     */
    @POST
    @Path("/realm/emoji/{emoji_name}")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Upload custom emoji", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public JsonSuccess uploadCustomEmoji(@PathParam("emoji_name") String emojiName,  @Multipart(value = "filename" , required = false) Attachment filenameDetail);
}

