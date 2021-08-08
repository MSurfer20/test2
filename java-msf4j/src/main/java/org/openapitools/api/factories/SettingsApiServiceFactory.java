package org.openapitools.api.factories;

import org.openapitools.api.SettingsApiService;
import org.openapitools.api.impl.SettingsApiServiceImpl;

public class SettingsApiServiceFactory {
    private static final SettingsApiService service = new SettingsApiServiceImpl();

    public static SettingsApiService getSettingsApi() {
        return service;
    }
}
