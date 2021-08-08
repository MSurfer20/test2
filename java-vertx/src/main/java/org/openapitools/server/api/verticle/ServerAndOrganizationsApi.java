package org.openapitools.server.api.verticle;

import java.io.File;
import org.openapitools.server.api.model.JsonSuccess;
import org.openapitools.server.api.model.JsonSuccessBase;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ServerAndOrganizationsApi  {
    //add-code-playground
    void addCodePlayground(String name, String pygmentsLanguage, String urlPrefix, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //add-linkifier
    void addLinkifier(String pattern, String urlFormatString, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //create-custom-profile-field
    void createCustomProfileField(Integer fieldType, String name, String hint, Object fieldData, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get-custom-emoji
    void getCustomEmoji(Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get-custom-profile-fields
    void getCustomProfileFields(Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get-linkifiers
    void getLinkifiers(Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get-server-settings
    void getServerSettings(Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //remove-code-playground
    void removeCodePlayground(Integer playgroundId, Handler<AsyncResult<JsonSuccess>> handler);
    
    //remove-linkifier
    void removeLinkifier(Integer filterId, Handler<AsyncResult<JsonSuccess>> handler);
    
    //reorder-custom-profile-fields
    void reorderCustomProfileFields(List<Integer> order, Handler<AsyncResult<JsonSuccess>> handler);
    
    //update-linkifier
    void updateLinkifier(Integer filterId, String pattern, String urlFormatString, Handler<AsyncResult<JsonSuccess>> handler);
    
    //upload-custom-emoji
    void uploadCustomEmoji(String emojiName, File filename, Handler<AsyncResult<JsonSuccess>> handler);
    
}
