package org.openapitools.api.factories;

import org.openapitools.api.TypingApiService;
import org.openapitools.api.impl.TypingApiServiceImpl;

public class TypingApiServiceFactory {
    private static final TypingApiService service = new TypingApiServiceImpl();

    public static TypingApiService getTypingApi() {
        return service;
    }
}
