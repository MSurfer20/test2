package org.openapitools.api.factories;

import org.openapitools.api.RealTimeApiService;
import org.openapitools.api.impl.RealTimeApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen")
public class RealTimeApiServiceFactory {
    private static final RealTimeApiService service = new RealTimeApiServiceImpl();

    public static RealTimeApiService getRealTimeApi() {
        return service;
    }
}
