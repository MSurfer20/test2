package org.openapitools.api.factories;

import org.openapitools.api.CallsApiService;
import org.openapitools.api.impl.CallsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen")
public class CallsApiServiceFactory {
    private static final CallsApiService service = new CallsApiServiceImpl();

    public static CallsApiService getCallsApi() {
        return service;
    }
}
