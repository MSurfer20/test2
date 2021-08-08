package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiKeyResponse

class AuthenticationApi {
    String basePath = "https://example.zulipchat.com/api/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def devFetchApiKey ( String username, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dev_fetch_api_key"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (username == null) {
            throw new RuntimeException("missing required params username")
        }

        if (username != null) {
            queryParams.put("username", username)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    ApiKeyResponse.class )

    }

    def fetchApiKey ( String username, String password, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/fetch_api_key"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (username == null) {
            throw new RuntimeException("missing required params username")
        }
        // verify required params are set
        if (password == null) {
            throw new RuntimeException("missing required params password")
        }

        if (username != null) {
            queryParams.put("username", username)
        }
        if (password != null) {
            queryParams.put("password", password)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    ApiKeyResponse.class )

    }

}
