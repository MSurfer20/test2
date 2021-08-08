package org.openapitools.vertxweb.server.api;

import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.JsonSuccess;
import org.openapitools.vertxweb.server.model.JsonSuccessBase;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ServerAndOrganizationsApi  {
    Future<ApiResponse<JsonSuccessBase>> addCodePlayground(String name, String pygmentsLanguage, String urlPrefix);
    Future<ApiResponse<JsonSuccessBase>> addLinkifier(String pattern, String urlFormatString);
    Future<ApiResponse<JsonSuccessBase>> createCustomProfileField(Integer fieldType, String name, String hint, Object fieldData);
    Future<ApiResponse<JsonSuccessBase>> getCustomEmoji();
    Future<ApiResponse<JsonSuccessBase>> getCustomProfileFields();
    Future<ApiResponse<JsonSuccessBase>> getLinkifiers();
    Future<ApiResponse<JsonSuccessBase>> getServerSettings();
    Future<ApiResponse<JsonSuccess>> removeCodePlayground(Integer playgroundId);
    Future<ApiResponse<JsonSuccess>> removeLinkifier(Integer filterId);
    Future<ApiResponse<JsonSuccess>> reorderCustomProfileFields(List<Integer> order);
    Future<ApiResponse<JsonSuccess>> updateLinkifier(Integer filterId, String pattern, String urlFormatString);
    Future<ApiResponse<JsonSuccess>> uploadCustomEmoji(String emojiName, FileUpload filename);
}
