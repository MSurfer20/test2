package org.openapitools.api.factories;

import org.openapitools.api.CallsApiService;
import org.openapitools.api.impl.CallsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T20:40:02.257444Z[Etc/UTC]")
public class CallsApiServiceFactory {
    private static final CallsApiService service = new CallsApiServiceImpl();

    public static CallsApiService getCallsApi() {
        return service;
    }
}
