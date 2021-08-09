package org.openapitools.api.factories;

import org.openapitools.api.AttachmentsApiService;
import org.openapitools.api.impl.AttachmentsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-09T21:34:02.517112Z[Etc/UTC]")
public class AttachmentsApiServiceFactory {
    private static final AttachmentsApiService service = new AttachmentsApiServiceImpl();

    public static AttachmentsApiService getAttachmentsApi() {
        return service;
    }
}
