package org.openapitools.api.factories;

import org.openapitools.api.TypingApiService;
import org.openapitools.api.impl.TypingApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T20:40:02.257444Z[Etc/UTC]")
public class TypingApiServiceFactory {
    private static final TypingApiService service = new TypingApiServiceImpl();

    public static TypingApiService getTypingApi() {
        return service;
    }
}
