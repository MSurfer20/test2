package org.openapitools.api.factories;

import org.openapitools.api.DraftsApiService;
import org.openapitools.api.impl.DraftsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen")
public class DraftsApiServiceFactory {
    private static final DraftsApiService service = new DraftsApiServiceImpl();

    public static DraftsApiService getDraftsApi() {
        return service;
    }
}
