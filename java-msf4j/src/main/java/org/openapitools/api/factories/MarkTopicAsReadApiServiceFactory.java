package org.openapitools.api.factories;

import org.openapitools.api.MarkTopicAsReadApiService;
import org.openapitools.api.impl.MarkTopicAsReadApiServiceImpl;

public class MarkTopicAsReadApiServiceFactory {
    private static final MarkTopicAsReadApiService service = new MarkTopicAsReadApiServiceImpl();

    public static MarkTopicAsReadApiService getMarkTopicAsReadApi() {
        return service;
    }
}
