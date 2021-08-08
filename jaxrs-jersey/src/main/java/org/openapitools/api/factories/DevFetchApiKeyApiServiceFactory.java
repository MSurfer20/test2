package org.openapitools.api.factories;

import org.openapitools.api.DevFetchApiKeyApiService;
import org.openapitools.api.impl.DevFetchApiKeyApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T21:12:13.281187Z[Etc/UTC]")
public class DevFetchApiKeyApiServiceFactory {
    private static final DevFetchApiKeyApiService service = new DevFetchApiKeyApiServiceImpl();

    public static DevFetchApiKeyApiService getDevFetchApiKeyApi() {
        return service;
    }
}
