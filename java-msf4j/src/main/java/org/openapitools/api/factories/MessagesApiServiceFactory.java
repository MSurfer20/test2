package org.openapitools.api.factories;

import org.openapitools.api.MessagesApiService;
import org.openapitools.api.impl.MessagesApiServiceImpl;

public class MessagesApiServiceFactory {
    private static final MessagesApiService service = new MessagesApiServiceImpl();

    public static MessagesApiService getMessagesApi() {
        return service;
    }
}
