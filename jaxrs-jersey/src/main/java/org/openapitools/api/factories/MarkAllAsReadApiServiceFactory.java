package org.openapitools.api.factories;

import org.openapitools.api.MarkAllAsReadApiService;
import org.openapitools.api.impl.MarkAllAsReadApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T21:20:01.120158Z[Etc/UTC]")
public class MarkAllAsReadApiServiceFactory {
    private static final MarkAllAsReadApiService service = new MarkAllAsReadApiServiceImpl();

    public static MarkAllAsReadApiService getMarkAllAsReadApi() {
        return service;
    }
}
