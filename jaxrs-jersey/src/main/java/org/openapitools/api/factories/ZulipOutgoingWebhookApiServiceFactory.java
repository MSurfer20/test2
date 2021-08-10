package org.openapitools.api.factories;

import org.openapitools.api.ZulipOutgoingWebhookApiService;
import org.openapitools.api.impl.ZulipOutgoingWebhookApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-10T11:44:46.274064Z[Etc/UTC]")
public class ZulipOutgoingWebhookApiServiceFactory {
    private static final ZulipOutgoingWebhookApiService service = new ZulipOutgoingWebhookApiServiceImpl();

    public static ZulipOutgoingWebhookApiService getZulipOutgoingWebhookApi() {
        return service;
    }
}
