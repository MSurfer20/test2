package org.openapitools.api.factories;

import org.openapitools.api.RegisterApiService;
import org.openapitools.api.impl.RegisterApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T21:12:13.281187Z[Etc/UTC]")
public class RegisterApiServiceFactory {
    private static final RegisterApiService service = new RegisterApiServiceImpl();

    public static RegisterApiService getRegisterApi() {
        return service;
    }
}
