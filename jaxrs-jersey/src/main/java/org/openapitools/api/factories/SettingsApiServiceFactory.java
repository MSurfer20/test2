package org.openapitools.api.factories;

import org.openapitools.api.SettingsApiService;
import org.openapitools.api.impl.SettingsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen")
public class SettingsApiServiceFactory {
    private static final SettingsApiService service = new SettingsApiServiceImpl();

    public static SettingsApiService getSettingsApi() {
        return service;
    }
}
