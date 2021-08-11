package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen")
public abstract class UserGroupsApiService {
    public abstract Response createUserGroup( @NotNull String name, @NotNull String description, @NotNull List<Integer> members,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getUserGroups(SecurityContext securityContext) throws NotFoundException;
    public abstract Response removeUserGroup(Integer userGroupId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateUserGroup(Integer userGroupId, @NotNull String name, @NotNull String description,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateUserGroupMembers(Integer userGroupId,List<Integer> delete,List<Integer> add,SecurityContext securityContext) throws NotFoundException;
}
