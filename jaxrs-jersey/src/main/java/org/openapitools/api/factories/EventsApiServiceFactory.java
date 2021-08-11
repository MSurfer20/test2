package org.openapitools.api.factories;

import org.openapitools.api.EventsApiService;
import org.openapitools.api.impl.EventsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen")
public class EventsApiServiceFactory {
    private static final EventsApiService service = new EventsApiServiceImpl();

    public static EventsApiService getEventsApi() {
        return service;
    }
}
