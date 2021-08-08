package org.openapitools.api.factories;

import org.openapitools.api.MarkAllAsReadApiService;
import org.openapitools.api.impl.MarkAllAsReadApiServiceImpl;

public class MarkAllAsReadApiServiceFactory {
    private static final MarkAllAsReadApiService service = new MarkAllAsReadApiServiceImpl();

    public static MarkAllAsReadApiService getMarkAllAsReadApi() {
        return service;
    }
}
