package org.openapitools.api.factories;

import org.openapitools.api.CallsApiService;
import org.openapitools.api.impl.CallsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-10T11:44:46.274064Z[Etc/UTC]")
public class CallsApiServiceFactory {
    private static final CallsApiService service = new CallsApiServiceImpl();

    public static CallsApiService getCallsApi() {
        return service;
    }
}
