package org.openapitools.api.factories;

import org.openapitools.api.UserUploadsApiService;
import org.openapitools.api.impl.UserUploadsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T21:12:08.960239Z[Etc/UTC]")
public class UserUploadsApiServiceFactory {
    private static final UserUploadsApiService service = new UserUploadsApiServiceImpl();

    public static UserUploadsApiService getUserUploadsApi() {
        return service;
    }
}
