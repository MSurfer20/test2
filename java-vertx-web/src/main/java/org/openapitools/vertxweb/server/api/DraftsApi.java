package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CodedError;
import org.openapitools.vertxweb.server.model.Draft;
import org.openapitools.vertxweb.server.model.JsonError;
import org.openapitools.vertxweb.server.model.JsonSuccess;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface DraftsApi  {
    Future<ApiResponse<JsonSuccess>> createDrafts(List<Draft> drafts);
    Future<ApiResponse<JsonSuccess>> deleteDraft(Integer draftId);
    Future<ApiResponse<JsonSuccess>> editDraft(Integer draftId, Draft draft);
    Future<ApiResponse<JsonSuccess>> getDrafts();
}
