package org.openapitools.api.factories;

import org.openapitools.api.TypingApiService;
import org.openapitools.api.impl.TypingApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-10T11:44:46.274064Z[Etc/UTC]")
public class TypingApiServiceFactory {
    private static final TypingApiService service = new TypingApiServiceImpl();

    public static TypingApiService getTypingApi() {
        return service;
    }
}
