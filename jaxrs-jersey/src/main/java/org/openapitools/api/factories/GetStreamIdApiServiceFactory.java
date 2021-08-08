package org.openapitools.api.factories;

import org.openapitools.api.GetStreamIdApiService;
import org.openapitools.api.impl.GetStreamIdApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T21:20:01.120158Z[Etc/UTC]")
public class GetStreamIdApiServiceFactory {
    private static final GetStreamIdApiService service = new GetStreamIdApiServiceImpl();

    public static GetStreamIdApiService getGetStreamIdApi() {
        return service;
    }
}
