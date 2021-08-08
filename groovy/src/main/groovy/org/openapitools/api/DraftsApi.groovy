package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CodedError
import org.openapitools.model.Draft
import org.openapitools.model.JsonError
import org.openapitools.model.JsonSuccess

class DraftsApi {
    String basePath = "https://example.zulipchat.com/api/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createDrafts ( List<Draft> drafts, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/drafts"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (drafts != null) {
            queryParams.put("drafts", drafts)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    JsonSuccess.class )

    }

    def deleteDraft ( Integer draftId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/drafts/${draft_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (draftId == null) {
            throw new RuntimeException("missing required params draftId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    JsonSuccess.class )

    }

    def editDraft ( Integer draftId, Draft draft, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/drafts/${draft_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (draftId == null) {
            throw new RuntimeException("missing required params draftId")
        }
        // verify required params are set
        if (draft == null) {
            throw new RuntimeException("missing required params draft")
        }

        if (draft != null) {
            queryParams.put("draft", draft)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    JsonSuccess.class )

    }

    def getDrafts ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/drafts"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    JsonSuccess.class )

    }

}
