package org.openapitools.api.factories;

import org.openapitools.api.StreamsApiService;
import org.openapitools.api.impl.StreamsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T21:12:13.281187Z[Etc/UTC]")
public class StreamsApiServiceFactory {
    private static final StreamsApiService service = new StreamsApiServiceImpl();

    public static StreamsApiService getStreamsApi() {
        return service;
    }
}
