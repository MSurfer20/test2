package org.openapitools.api.factories;

import org.openapitools.api.MessagesApiService;
import org.openapitools.api.impl.MessagesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T20:42:23.370561Z[Etc/UTC]")
public class MessagesApiServiceFactory {
    private static final MessagesApiService service = new MessagesApiServiceImpl();

    public static MessagesApiService getMessagesApi() {
        return service;
    }
}
