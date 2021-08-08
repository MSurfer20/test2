package org.openapitools.api.factories;

import org.openapitools.api.ServerSettingsApiService;
import org.openapitools.api.impl.ServerSettingsApiServiceImpl;

public class ServerSettingsApiServiceFactory {
    private static final ServerSettingsApiService service = new ServerSettingsApiServiceImpl();

    public static ServerSettingsApiService getServerSettingsApi() {
        return service;
    }
}
