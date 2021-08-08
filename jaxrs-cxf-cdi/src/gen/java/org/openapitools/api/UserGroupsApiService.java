package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-08-08T20:42:18.771666Z[Etc/UTC]")
public interface UserGroupsApiService {
      public Response createUserGroup(String name, String description, List<Integer> members, SecurityContext securityContext);
      public Response getUserGroups(SecurityContext securityContext);
      public Response removeUserGroup(Integer userGroupId, SecurityContext securityContext);
      public Response updateUserGroup(Integer userGroupId, String name, String description, SecurityContext securityContext);
      public Response updateUserGroupMembers(Integer userGroupId, List<Integer> delete, List<Integer> add, SecurityContext securityContext);
}
