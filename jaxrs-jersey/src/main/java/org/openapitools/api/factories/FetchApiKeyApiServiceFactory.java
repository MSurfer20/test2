package org.openapitools.api.factories;

import org.openapitools.api.FetchApiKeyApiService;
import org.openapitools.api.impl.FetchApiKeyApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen")
public class FetchApiKeyApiServiceFactory {
    private static final FetchApiKeyApiService service = new FetchApiKeyApiServiceImpl();

    public static FetchApiKeyApiService getFetchApiKeyApi() {
        return service;
    }
}
