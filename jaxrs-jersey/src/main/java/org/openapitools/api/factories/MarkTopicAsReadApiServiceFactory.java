package org.openapitools.api.factories;

import org.openapitools.api.MarkTopicAsReadApiService;
import org.openapitools.api.impl.MarkTopicAsReadApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen")
public class MarkTopicAsReadApiServiceFactory {
    private static final MarkTopicAsReadApiService service = new MarkTopicAsReadApiServiceImpl();

    public static MarkTopicAsReadApiService getMarkTopicAsReadApi() {
        return service;
    }
}
