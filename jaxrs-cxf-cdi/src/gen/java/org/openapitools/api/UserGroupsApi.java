package org.openapitools.api;

import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.api.UserGroupsApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/user_groups")
@RequestScoped

@Api(description = "the user_groups API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-08-08T21:12:04.371582Z[Etc/UTC]")

public class UserGroupsApi  {

  @Context SecurityContext securityContext;

  @Inject UserGroupsApiService delegate;


    @POST
    @Path("/create")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a user group", notes = "Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` ", response = JsonSuccess.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public Response createUserGroup( @NotNull @ApiParam(value = "The name of the user group. ",required=true)  @QueryParam("name") String name,  @NotNull @ApiParam(value = "The description of the user group. ",required=true)  @QueryParam("description") String description,  @NotNull @ApiParam(value = "An array containing the user IDs of the initial members for the new user group. ",required=true)  @QueryParam("members") List<Integer> members) {
        return delegate.createUserGroup(name, description, members, securityContext);
    }

    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user groups", notes = "{!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` ", response = JsonSuccessBase.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getUserGroups() {
        return delegate.getUserGroups(securityContext);
    }

    @DELETE
    @Path("/{user_group_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a user group", notes = "Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` ", response = JsonSuccess.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public Response removeUserGroup(@ApiParam(value = "The ID of the target user group. ",required=true) @PathParam("user_group_id") Integer userGroupId) {
        return delegate.removeUserGroup(userGroupId, securityContext);
    }

    @PATCH
    @Path("/{user_group_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Update a user group", notes = "Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` ", response = JsonSuccess.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public Response updateUserGroup(@ApiParam(value = "The ID of the target user group. ",required=true) @PathParam("user_group_id") Integer userGroupId,  @NotNull @ApiParam(value = "The new name of the group. ",required=true)  @QueryParam("name") String name,  @NotNull @ApiParam(value = "The new description of the group. ",required=true)  @QueryParam("description") String description) {
        return delegate.updateUserGroup(userGroupId, name, description, securityContext);
    }

    @POST
    @Path("/{user_group_id}/members")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Update user group members", notes = "Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` ", response = JsonSuccess.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public Response updateUserGroupMembers(@ApiParam(value = "The ID of the target user group. ",required=true) @PathParam("user_group_id") Integer userGroupId, @ApiParam(value = "The list of user ids to be removed from the user group. ")  @QueryParam("delete") List<Integer> delete, @ApiParam(value = "The list of user ids to be added to the user group. ")  @QueryParam("add") List<Integer> add) {
        return delegate.updateUserGroupMembers(userGroupId, delete, add, securityContext);
    }
}
