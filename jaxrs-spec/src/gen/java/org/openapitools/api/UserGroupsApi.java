package org.openapitools.api;

import org.openapitools.model.JsonError;
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

@Path("/user_groups")
@Api(description = "the user_groups API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-08T20:40:13.248583Z[Etc/UTC]")public class UserGroupsApi {

    @POST
    @Path("/create")
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a user group", notes = "Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` ", response = JsonSuccess.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class)
    })
    public Response createUserGroup(@QueryParam("name") @NotNull   @ApiParam("The name of the user group. ")  String name,@QueryParam("description") @NotNull   @ApiParam("The description of the user group. ")  String description,@QueryParam("members") @NotNull   @ApiParam("An array containing the user IDs of the initial members for the new user group. ")  List<Integer> members) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user groups", notes = "{!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` ", response = JsonSuccessBase.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response getUserGroups() {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{user_group_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a user group", notes = "Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` ", response = JsonSuccess.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class)
    })
    public Response removeUserGroup(@PathParam("user_group_id") @ApiParam("The ID of the target user group. ") Integer userGroupId) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{user_group_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Update a user group", notes = "Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` ", response = JsonSuccess.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class)
    })
    public Response updateUserGroup(@PathParam("user_group_id") @ApiParam("The ID of the target user group. ") Integer userGroupId,@QueryParam("name") @NotNull   @ApiParam("The new name of the group. ")  String name,@QueryParam("description") @NotNull   @ApiParam("The new description of the group. ")  String description) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{user_group_id}/members")
    @Produces({ "application/json" })
    @ApiOperation(value = "Update user group members", notes = "Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` ", response = JsonSuccess.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class)
    })
    public Response updateUserGroupMembers(@PathParam("user_group_id") @ApiParam("The ID of the target user group. ") Integer userGroupId,@QueryParam("delete")   @ApiParam("The list of user ids to be removed from the user group. ")  List<Integer> delete,@QueryParam("add")   @ApiParam("The list of user ids to be added to the user group. ")  List<Integer> add) {
        return Response.ok().entity("magic!").build();
    }
}
