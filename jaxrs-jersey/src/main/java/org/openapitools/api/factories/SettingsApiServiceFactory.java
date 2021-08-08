package org.openapitools.api.factories;

import org.openapitools.api.SettingsApiService;
import org.openapitools.api.impl.SettingsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T21:12:08.960239Z[Etc/UTC]")
public class SettingsApiServiceFactory {
    private static final SettingsApiService service = new SettingsApiServiceImpl();

    public static SettingsApiService getSettingsApi() {
        return service;
    }
}
