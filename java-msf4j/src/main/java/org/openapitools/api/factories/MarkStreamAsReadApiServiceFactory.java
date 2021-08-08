package org.openapitools.api.factories;

import org.openapitools.api.MarkStreamAsReadApiService;
import org.openapitools.api.impl.MarkStreamAsReadApiServiceImpl;

public class MarkStreamAsReadApiServiceFactory {
    private static final MarkStreamAsReadApiService service = new MarkStreamAsReadApiServiceImpl();

    public static MarkStreamAsReadApiService getMarkStreamAsReadApi() {
        return service;
    }
}
