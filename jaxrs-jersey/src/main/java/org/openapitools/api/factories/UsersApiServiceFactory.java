package org.openapitools.api.factories;

import org.openapitools.api.UsersApiService;
import org.openapitools.api.impl.UsersApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-10T11:44:46.274064Z[Etc/UTC]")
public class UsersApiServiceFactory {
    private static final UsersApiService service = new UsersApiServiceImpl();

    public static UsersApiService getUsersApi() {
        return service;
    }
}
