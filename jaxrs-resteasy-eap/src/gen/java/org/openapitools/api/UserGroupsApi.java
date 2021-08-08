package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/user_groups")


@io.swagger.annotations.Api(description = "the user_groups API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2021-08-08T20:40:09.617193Z[Etc/UTC]")
public interface UserGroupsApi  {
   
    @POST
    @Path("/create")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a user group", notes = "Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` ", response = JsonSuccess.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public Response createUserGroup( @NotNull  @QueryParam("name") String name, @NotNull  @QueryParam("description") String description, @NotNull  @QueryParam("members") List<Integer> members,@Context SecurityContext securityContext);
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get user groups", notes = "{!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` ", response = JsonSuccessBase.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getUserGroups(@Context SecurityContext securityContext);
    @DELETE
    @Path("/{user_group_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a user group", notes = "Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` ", response = JsonSuccess.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public Response removeUserGroup( @PathParam("user_group_id") Integer userGroupId,@Context SecurityContext securityContext);
    @PATCH
    @Path("/{user_group_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update a user group", notes = "Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` ", response = JsonSuccess.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public Response updateUserGroup( @PathParam("user_group_id") Integer userGroupId, @NotNull  @QueryParam("name") String name, @NotNull  @QueryParam("description") String description,@Context SecurityContext securityContext);
    @POST
    @Path("/{user_group_id}/members")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update user group members", notes = "Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` ", response = JsonSuccess.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public Response updateUserGroupMembers( @PathParam("user_group_id") Integer userGroupId,  @QueryParam("delete") List<Integer> delete,  @QueryParam("add") List<Integer> add,@Context SecurityContext securityContext);
}
