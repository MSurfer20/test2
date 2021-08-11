package org.openapitools.api.factories;

import org.openapitools.api.UserUploadsApiService;
import org.openapitools.api.impl.UserUploadsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen")
public class UserUploadsApiServiceFactory {
    private static final UserUploadsApiService service = new UserUploadsApiServiceImpl();

    public static UserUploadsApiService getUserUploadsApi() {
        return service;
    }
}
