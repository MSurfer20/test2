package org.openapitools.api.factories;

import org.openapitools.api.RealmApiService;
import org.openapitools.api.impl.RealmApiServiceImpl;

public class RealmApiServiceFactory {
    private static final RealmApiService service = new RealmApiServiceImpl();

    public static RealmApiService getRealmApi() {
        return service;
    }
}
