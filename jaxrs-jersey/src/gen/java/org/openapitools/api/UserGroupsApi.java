package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.UserGroupsApiService;
import org.openapitools.api.factories.UserGroupsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/user_groups")


@io.swagger.annotations.Api(description = "the user_groups API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-09T21:34:02.517112Z[Etc/UTC]")
public class UserGroupsApi  {
   private final UserGroupsApiService delegate;

   public UserGroupsApi(@Context ServletConfig servletContext) {
      UserGroupsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("UserGroupsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (UserGroupsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = UserGroupsApiServiceFactory.getUserGroupsApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/create")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a user group", notes = "Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` ", response = JsonSuccess.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonError.class)
    })
    public Response createUserGroup(@ApiParam(value = "The name of the user group. ", required = true) @QueryParam("name") @NotNull  String name,@ApiParam(value = "The description of the user group. ", required = true) @QueryParam("description") @NotNull  String description,@ApiParam(value = "An array containing the user IDs of the initial members for the new user group. ", required = true) @QueryParam("members") @NotNull @Valid  List<Integer> members,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createUserGroup(name, description, members, securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get user groups", notes = "{!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` ", response = JsonSuccessBase.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response getUserGroups(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUserGroups(securityContext);
    }
    @DELETE
    @Path("/{user_group_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a user group", notes = "Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` ", response = JsonSuccess.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonError.class)
    })
    public Response removeUserGroup(@ApiParam(value = "The ID of the target user group. ", required = true) @PathParam("user_group_id") @NotNull  Integer userGroupId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.removeUserGroup(userGroupId, securityContext);
    }
    @PATCH
    @Path("/{user_group_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update a user group", notes = "Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` ", response = JsonSuccess.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonError.class)
    })
    public Response updateUserGroup(@ApiParam(value = "The ID of the target user group. ", required = true) @PathParam("user_group_id") @NotNull  Integer userGroupId,@ApiParam(value = "The new name of the group. ", required = true) @QueryParam("name") @NotNull  String name,@ApiParam(value = "The new description of the group. ", required = true) @QueryParam("description") @NotNull  String description,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateUserGroup(userGroupId, name, description, securityContext);
    }
    @POST
    @Path("/{user_group_id}/members")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update user group members", notes = "Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` ", response = JsonSuccess.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class)
    })
    public Response updateUserGroupMembers(@ApiParam(value = "The ID of the target user group. ", required = true) @PathParam("user_group_id") @NotNull  Integer userGroupId,@ApiParam(value = "The list of user ids to be removed from the user group. ") @QueryParam("delete") @Valid  List<Integer> delete,@ApiParam(value = "The list of user ids to be added to the user group. ") @QueryParam("add") @Valid  List<Integer> add,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateUserGroupMembers(userGroupId, delete, add, securityContext);
    }
}
