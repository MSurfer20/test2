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
    //add_code_playground
    void addCodePlayground(String name, String pygmentsLanguage, String urlPrefix, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //add_linkifier
    void addLinkifier(String pattern, String urlFormatString, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //create_custom_profile_field
    void createCustomProfileField(Integer fieldType, String name, String hint, Object fieldData, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get_custom_emoji
    void getCustomEmoji(Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get_custom_profile_fields
    void getCustomProfileFields(Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get_linkifiers
    void getLinkifiers(Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get_server_settings
    void getServerSettings(Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //remove_code_playground
    void removeCodePlayground(Integer playgroundId, Handler<AsyncResult<JsonSuccess>> handler);
    
    //remove_linkifier
    void removeLinkifier(Integer filterId, Handler<AsyncResult<JsonSuccess>> handler);
    
    //reorder_custom_profile_fields
    void reorderCustomProfileFields(List<Integer> order, Handler<AsyncResult<JsonSuccess>> handler);
    
    //update_linkifier
    void updateLinkifier(Integer filterId, String pattern, String urlFormatString, Handler<AsyncResult<JsonSuccess>> handler);
    
    //upload_custom_emoji
    void uploadCustomEmoji(String emojiName, File filename, Handler<AsyncResult<JsonSuccess>> handler);
    
}
