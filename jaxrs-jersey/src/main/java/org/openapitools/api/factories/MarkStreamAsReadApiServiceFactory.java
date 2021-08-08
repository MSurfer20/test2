package org.openapitools.api.factories;

import org.openapitools.api.MarkStreamAsReadApiService;
import org.openapitools.api.impl.MarkStreamAsReadApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T20:42:23.370561Z[Etc/UTC]")
public class MarkStreamAsReadApiServiceFactory {
    private static final MarkStreamAsReadApiService service = new MarkStreamAsReadApiServiceImpl();

    public static MarkStreamAsReadApiService getMarkStreamAsReadApi() {
        return service;
    }
}
