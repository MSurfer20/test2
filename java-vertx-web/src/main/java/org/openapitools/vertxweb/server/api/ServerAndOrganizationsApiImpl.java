package org.openapitools.vertxweb.server.api;

import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.JsonSuccess;
import org.openapitools.vertxweb.server.model.JsonSuccessBase;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.impl.HttpStatusException;

import java.util.List;
import java.util.Map;

// Implement this class

public class ServerAndOrganizationsApiImpl implements ServerAndOrganizationsApi {
    public Future<ApiResponse<JsonSuccessBase>> addCodePlayground(String name, String pygmentsLanguage, String urlPrefix) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> addLinkifier(String pattern, String urlFormatString) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> createCustomProfileField(Integer fieldType, String name, String hint, Object fieldData) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> getCustomEmoji() {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> getCustomProfileFields() {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> getLinkifiers() {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> getServerSettings() {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> removeCodePlayground(Integer playgroundId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> removeLinkifier(Integer filterId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> reorderCustomProfileFields(List<Integer> order) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> updateLinkifier(Integer filterId, String pattern, String urlFormatString) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> uploadCustomEmoji(String emojiName, FileUpload filename) {
        return Future.failedFuture(new HttpStatusException(501));
    }

}
