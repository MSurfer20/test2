package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen")
public class UserGroupsApiServiceImpl implements UserGroupsApi {
      public Response createUserGroup(String name,String description,List<Integer> members,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getUserGroups(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response removeUserGroup(Integer userGroupId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updateUserGroup(Integer userGroupId,String name,String description,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updateUserGroupMembers(Integer userGroupId,List<Integer> delete,List<Integer> add,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
