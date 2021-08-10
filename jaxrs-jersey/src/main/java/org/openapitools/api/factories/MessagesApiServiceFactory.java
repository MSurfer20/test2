package org.openapitools.api.factories;

import org.openapitools.api.MessagesApiService;
import org.openapitools.api.impl.MessagesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-10T11:44:46.274064Z[Etc/UTC]")
public class MessagesApiServiceFactory {
    private static final MessagesApiService service = new MessagesApiServiceImpl();

    public static MessagesApiService getMessagesApi() {
        return service;
    }
}
