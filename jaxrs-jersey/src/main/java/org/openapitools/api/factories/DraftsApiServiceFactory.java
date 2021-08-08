package org.openapitools.api.factories;

import org.openapitools.api.DraftsApiService;
import org.openapitools.api.impl.DraftsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T21:12:13.281187Z[Etc/UTC]")
public class DraftsApiServiceFactory {
    private static final DraftsApiService service = new DraftsApiServiceImpl();

    public static DraftsApiService getDraftsApi() {
        return service;
    }
}
