package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.InlineResponse200

class WebhooksApi {
    String basePath = "https://example.zulipchat.com/api/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def zulipOutgoingWebhooks ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/zulip-outgoing-webhook"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    InlineResponse200.class )

    }

}
