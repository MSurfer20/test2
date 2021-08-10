package org.openapitools.api.factories;

import org.openapitools.api.RestErrorHandlingApiService;
import org.openapitools.api.impl.RestErrorHandlingApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-10T11:44:46.274064Z[Etc/UTC]")
public class RestErrorHandlingApiServiceFactory {
    private static final RestErrorHandlingApiService service = new RestErrorHandlingApiServiceImpl();

    public static RestErrorHandlingApiService getRestErrorHandlingApi() {
        return service;
    }
}
