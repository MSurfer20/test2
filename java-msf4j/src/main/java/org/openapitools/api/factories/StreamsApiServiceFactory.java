package org.openapitools.api.factories;

import org.openapitools.api.StreamsApiService;
import org.openapitools.api.impl.StreamsApiServiceImpl;

public class StreamsApiServiceFactory {
    private static final StreamsApiService service = new StreamsApiServiceImpl();

    public static StreamsApiService getStreamsApi() {
        return service;
    }
}
