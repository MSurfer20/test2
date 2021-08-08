package org.openapitools.api.factories;

import org.openapitools.api.RealmApiService;
import org.openapitools.api.impl.RealmApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T20:42:23.370561Z[Etc/UTC]")
public class RealmApiServiceFactory {
    private static final RealmApiService service = new RealmApiServiceImpl();

    public static RealmApiService getRealmApi() {
        return service;
    }
}
