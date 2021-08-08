package org.openapitools.api.factories;

import org.openapitools.api.RealTimeApiService;
import org.openapitools.api.impl.RealTimeApiServiceImpl;

public class RealTimeApiServiceFactory {
    private static final RealTimeApiService service = new RealTimeApiServiceImpl();

    public static RealTimeApiService getRealTimeApi() {
        return service;
    }
}
