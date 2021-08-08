package org.openapitools.api.factories;

import org.openapitools.api.UserGroupsApiService;
import org.openapitools.api.impl.UserGroupsApiServiceImpl;

public class UserGroupsApiServiceFactory {
    private static final UserGroupsApiService service = new UserGroupsApiServiceImpl();

    public static UserGroupsApiService getUserGroupsApi() {
        return service;
    }
}
