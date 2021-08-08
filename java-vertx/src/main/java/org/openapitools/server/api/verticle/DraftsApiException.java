package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CodedError;
import org.openapitools.server.api.model.Draft;
import org.openapitools.server.api.model.JsonError;
import org.openapitools.server.api.model.JsonSuccess;
import org.openapitools.server.api.MainApiException;

public final class DraftsApiException extends MainApiException {
    public DraftsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final DraftsApiException Drafts_createDrafts_200_Exception = new DraftsApiException(200, "Success.");
    public static final DraftsApiException Drafts_createDrafts_400_Exception = new DraftsApiException(400, "Bad request.");
    public static final DraftsApiException Drafts_deleteDraft_200_Exception = new DraftsApiException(200, "Success.");
    public static final DraftsApiException Drafts_deleteDraft_404_Exception = new DraftsApiException(404, "Not Found.");
    public static final DraftsApiException Drafts_editDraft_200_Exception = new DraftsApiException(200, "Success.");
    public static final DraftsApiException Drafts_editDraft_404_Exception = new DraftsApiException(404, "Not Found.");
    public static final DraftsApiException Drafts_getDrafts_200_Exception = new DraftsApiException(200, "Success.");
    

}