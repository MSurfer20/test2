package org.openapitools.api.factories;

import org.openapitools.api.ServerSettingsApiService;
import org.openapitools.api.impl.ServerSettingsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen")
public class ServerSettingsApiServiceFactory {
    private static final ServerSettingsApiService service = new ServerSettingsApiServiceImpl();

    public static ServerSettingsApiService getServerSettingsApi() {
        return service;
    }
}
