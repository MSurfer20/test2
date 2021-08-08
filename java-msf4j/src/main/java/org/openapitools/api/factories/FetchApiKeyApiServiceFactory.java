package org.openapitools.api.factories;

import org.openapitools.api.FetchApiKeyApiService;
import org.openapitools.api.impl.FetchApiKeyApiServiceImpl;

public class FetchApiKeyApiServiceFactory {
    private static final FetchApiKeyApiService service = new FetchApiKeyApiServiceImpl();

    public static FetchApiKeyApiService getFetchApiKeyApi() {
        return service;
    }
}
