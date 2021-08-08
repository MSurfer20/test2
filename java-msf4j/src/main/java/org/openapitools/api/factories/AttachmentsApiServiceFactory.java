package org.openapitools.api.factories;

import org.openapitools.api.AttachmentsApiService;
import org.openapitools.api.impl.AttachmentsApiServiceImpl;

public class AttachmentsApiServiceFactory {
    private static final AttachmentsApiService service = new AttachmentsApiServiceImpl();

    public static AttachmentsApiService getAttachmentsApi() {
        return service;
    }
}
