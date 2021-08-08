package org.openapitools.api.factories;

import org.openapitools.api.DraftsApiService;
import org.openapitools.api.impl.DraftsApiServiceImpl;

public class DraftsApiServiceFactory {
    private static final DraftsApiService service = new DraftsApiServiceImpl();

    public static DraftsApiService getDraftsApi() {
        return service;
    }
}
