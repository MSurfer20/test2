package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-08T20:40:06.005587Z[Etc/UTC]")
public interface UserGroupsApiService {
      Response createUserGroup(String name,String description,List<Integer> members,SecurityContext securityContext)
      throws NotFoundException;
      Response getUserGroups(SecurityContext securityContext)
      throws NotFoundException;
      Response removeUserGroup(Integer userGroupId,SecurityContext securityContext)
      throws NotFoundException;
      Response updateUserGroup(Integer userGroupId,String name,String description,SecurityContext securityContext)
      throws NotFoundException;
      Response updateUserGroupMembers(Integer userGroupId,List<Integer> delete,List<Integer> add,SecurityContext securityContext)
      throws NotFoundException;
}
