package org.openapitools.api.factories;

import org.openapitools.api.RegisterApiService;
import org.openapitools.api.impl.RegisterApiServiceImpl;

public class RegisterApiServiceFactory {
    private static final RegisterApiService service = new RegisterApiServiceImpl();

    public static RegisterApiService getRegisterApi() {
        return service;
    }
}
