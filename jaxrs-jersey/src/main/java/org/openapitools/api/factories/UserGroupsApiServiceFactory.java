package org.openapitools.api.factories;

import org.openapitools.api.UserGroupsApiService;
import org.openapitools.api.impl.UserGroupsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T20:40:02.257444Z[Etc/UTC]")
public class UserGroupsApiServiceFactory {
    private static final UserGroupsApiService service = new UserGroupsApiServiceImpl();

    public static UserGroupsApiService getUserGroupsApi() {
        return service;
    }
}
