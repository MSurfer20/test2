package org.openapitools.api.factories;

import org.openapitools.api.UserUploadsApiService;
import org.openapitools.api.impl.UserUploadsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-10T11:44:46.274064Z[Etc/UTC]")
public class UserUploadsApiServiceFactory {
    private static final UserUploadsApiService service = new UserUploadsApiServiceImpl();

    public static UserUploadsApiService getUserUploadsApi() {
        return service;
    }
}
