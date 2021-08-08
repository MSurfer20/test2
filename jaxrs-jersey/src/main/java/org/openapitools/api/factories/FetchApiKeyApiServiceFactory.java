package org.openapitools.api.factories;

import org.openapitools.api.FetchApiKeyApiService;
import org.openapitools.api.impl.FetchApiKeyApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T20:42:23.370561Z[Etc/UTC]")
public class FetchApiKeyApiServiceFactory {
    private static final FetchApiKeyApiService service = new FetchApiKeyApiServiceImpl();

    public static FetchApiKeyApiService getFetchApiKeyApi() {
        return service;
    }
}
