package org.openapitools.api.factories;

import org.openapitools.api.UserGroupsApiService;
import org.openapitools.api.impl.UserGroupsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-10T11:44:46.274064Z[Etc/UTC]")
public class UserGroupsApiServiceFactory {
    private static final UserGroupsApiService service = new UserGroupsApiServiceImpl();

    public static UserGroupsApiService getUserGroupsApi() {
        return service;
    }
}
