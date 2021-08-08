package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.JsonSuccess
import org.openapitools.model.JsonSuccessBase

class ServerAndOrganizationsApi {
    String basePath = "https://example.zulipchat.com/api/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def addCodePlayground ( String name, String pygmentsLanguage, String urlPrefix, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/realm/playgrounds"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }
        // verify required params are set
        if (pygmentsLanguage == null) {
            throw new RuntimeException("missing required params pygmentsLanguage")
        }
        // verify required params are set
        if (urlPrefix == null) {
            throw new RuntimeException("missing required params urlPrefix")
        }

        if (name != null) {
            queryParams.put("name", name)
        }
        if (pygmentsLanguage != null) {
            queryParams.put("pygments_language", pygmentsLanguage)
        }
        if (urlPrefix != null) {
            queryParams.put("url_prefix", urlPrefix)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    JsonSuccessBase.class )

    }

    def addLinkifier ( String pattern, String urlFormatString, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/realm/filters"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (pattern == null) {
            throw new RuntimeException("missing required params pattern")
        }
        // verify required params are set
        if (urlFormatString == null) {
            throw new RuntimeException("missing required params urlFormatString")
        }

        if (pattern != null) {
            queryParams.put("pattern", pattern)
        }
        if (urlFormatString != null) {
            queryParams.put("url_format_string", urlFormatString)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    JsonSuccessBase.class )

    }

    def createCustomProfileField ( Integer fieldType, String name, String hint, Object fieldData, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/realm/profile_fields"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (fieldType == null) {
            throw new RuntimeException("missing required params fieldType")
        }

        if (name != null) {
            queryParams.put("name", name)
        }
        if (hint != null) {
            queryParams.put("hint", hint)
        }
        if (fieldType != null) {
            queryParams.put("field_type", fieldType)
        }
        if (fieldData != null) {
            queryParams.put("field_data", fieldData)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    JsonSuccessBase.class )

    }

    def getCustomEmoji ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/realm/emoji"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    JsonSuccessBase.class )

    }

    def getCustomProfileFields ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/realm/profile_fields"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    JsonSuccessBase.class )

    }

    def getLinkifiers ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/realm/linkifiers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    JsonSuccessBase.class )

    }

    def getServerSettings ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/server_settings"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    JsonSuccessBase.class )

    }

    def removeCodePlayground ( Integer playgroundId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/realm/playgrounds/${playground_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (playgroundId == null) {
            throw new RuntimeException("missing required params playgroundId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    JsonSuccess.class )

    }

    def removeLinkifier ( Integer filterId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/realm/filters/${filter_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (filterId == null) {
            throw new RuntimeException("missing required params filterId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    JsonSuccess.class )

    }

    def reorderCustomProfileFields ( List<Integer> order, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/realm/profile_fields"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (order == null) {
            throw new RuntimeException("missing required params order")
        }

        if (order != null) {
            queryParams.put("order", order)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    JsonSuccess.class )

    }

    def updateLinkifier ( Integer filterId, String pattern, String urlFormatString, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/realm/filters/${filter_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (filterId == null) {
            throw new RuntimeException("missing required params filterId")
        }
        // verify required params are set
        if (pattern == null) {
            throw new RuntimeException("missing required params pattern")
        }
        // verify required params are set
        if (urlFormatString == null) {
            throw new RuntimeException("missing required params urlFormatString")
        }

        if (pattern != null) {
            queryParams.put("pattern", pattern)
        }
        if (urlFormatString != null) {
            queryParams.put("url_format_string", urlFormatString)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    JsonSuccess.class )

    }

    def uploadCustomEmoji ( String emojiName, File filename, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/realm/emoji/${emoji_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (emojiName == null) {
            throw new RuntimeException("missing required params emojiName")
        }




        contentType = 'multipart/form-data';
        bodyParams = filename

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    JsonSuccess.class )

    }

}
