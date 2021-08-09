package org.openapitools.api.factories;

import org.openapitools.api.EventsApiService;
import org.openapitools.api.impl.EventsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-09T21:34:02.517112Z[Etc/UTC]")
public class EventsApiServiceFactory {
    private static final EventsApiService service = new EventsApiServiceImpl();

    public static EventsApiService getEventsApi() {
        return service;
    }
}
