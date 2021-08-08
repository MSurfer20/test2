package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CodedError;
import org.openapitools.vertxweb.server.model.Draft;
import org.openapitools.vertxweb.server.model.JsonError;
import org.openapitools.vertxweb.server.model.JsonSuccess;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.impl.HttpStatusException;

import java.util.List;
import java.util.Map;

// Implement this class

public class DraftsApiImpl implements DraftsApi {
    public Future<ApiResponse<JsonSuccess>> createDrafts(List<Draft> drafts) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> deleteDraft(Integer draftId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> editDraft(Integer draftId, Draft draft) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> getDrafts() {
        return Future.failedFuture(new HttpStatusException(501));
    }

}
