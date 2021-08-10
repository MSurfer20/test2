package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-10T11:44:15.430476Z[Etc/UTC]")
public abstract class UserGroupsApiService {
    public abstract Response createUserGroup(String name
 ,String description
 ,List<Integer> members
 ) throws NotFoundException;
    public abstract Response getUserGroups() throws NotFoundException;
    public abstract Response removeUserGroup(Integer userGroupId
 ) throws NotFoundException;
    public abstract Response updateUserGroup(Integer userGroupId
 ,String name
 ,String description
 ) throws NotFoundException;
    public abstract Response updateUserGroupMembers(Integer userGroupId
 ,List<Integer> delete
 ,List<Integer> add
 ) throws NotFoundException;
}
