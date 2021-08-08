package org.openapitools.api.factories;

import org.openapitools.api.RestErrorHandlingApiService;
import org.openapitools.api.impl.RestErrorHandlingApiServiceImpl;

public class RestErrorHandlingApiServiceFactory {
    private static final RestErrorHandlingApiService service = new RestErrorHandlingApiServiceImpl();

    public static RestErrorHandlingApiService getRestErrorHandlingApi() {
        return service;
    }
}
