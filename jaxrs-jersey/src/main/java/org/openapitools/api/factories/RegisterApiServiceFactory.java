package org.openapitools.api.factories;

import org.openapitools.api.RegisterApiService;
import org.openapitools.api.impl.RegisterApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T20:42:23.370561Z[Etc/UTC]")
public class RegisterApiServiceFactory {
    private static final RegisterApiService service = new RegisterApiServiceImpl();

    public static RegisterApiService getRegisterApi() {
        return service;
    }
}
