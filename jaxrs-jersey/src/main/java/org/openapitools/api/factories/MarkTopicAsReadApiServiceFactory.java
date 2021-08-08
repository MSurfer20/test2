package org.openapitools.api.factories;

import org.openapitools.api.MarkTopicAsReadApiService;
import org.openapitools.api.impl.MarkTopicAsReadApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T20:40:02.257444Z[Etc/UTC]")
public class MarkTopicAsReadApiServiceFactory {
    private static final MarkTopicAsReadApiService service = new MarkTopicAsReadApiServiceImpl();

    public static MarkTopicAsReadApiService getMarkTopicAsReadApi() {
        return service;
    }
}
