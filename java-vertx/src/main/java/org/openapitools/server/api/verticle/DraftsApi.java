package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CodedError;
import org.openapitools.server.api.model.Draft;
import org.openapitools.server.api.model.JsonError;
import org.openapitools.server.api.model.JsonSuccess;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface DraftsApi  {
    //create-drafts
    void createDrafts(List<Draft> drafts, Handler<AsyncResult<JsonSuccess>> handler);
    
    //delete-draft
    void deleteDraft(Integer draftId, Handler<AsyncResult<JsonSuccess>> handler);
    
    //edit-draft
    void editDraft(Integer draftId, Draft draft, Handler<AsyncResult<JsonSuccess>> handler);
    
    //get-drafts
    void getDrafts(Handler<AsyncResult<JsonSuccess>> handler);
    
}
