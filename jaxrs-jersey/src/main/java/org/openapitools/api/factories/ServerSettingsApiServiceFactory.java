package org.openapitools.api.factories;

import org.openapitools.api.ServerSettingsApiService;
import org.openapitools.api.impl.ServerSettingsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T20:40:02.257444Z[Etc/UTC]")
public class ServerSettingsApiServiceFactory {
    private static final ServerSettingsApiService service = new ServerSettingsApiServiceImpl();

    public static ServerSettingsApiService getServerSettingsApi() {
        return service;
    }
}
