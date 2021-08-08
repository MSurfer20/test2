package org.openapitools.api.factories;

import org.openapitools.api.EventsApiService;
import org.openapitools.api.impl.EventsApiServiceImpl;

public class EventsApiServiceFactory {
    private static final EventsApiService service = new EventsApiServiceImpl();

    public static EventsApiService getEventsApi() {
        return service;
    }
}
