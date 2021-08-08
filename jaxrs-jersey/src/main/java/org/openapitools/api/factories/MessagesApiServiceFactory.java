package org.openapitools.api.factories;

import org.openapitools.api.MessagesApiService;
import org.openapitools.api.impl.MessagesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T21:12:08.960239Z[Etc/UTC]")
public class MessagesApiServiceFactory {
    private static final MessagesApiService service = new MessagesApiServiceImpl();

    public static MessagesApiService getMessagesApi() {
        return service;
    }
}
