package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CodedError;
import org.openapitools.server.api.model.JsonError;
import org.openapitools.server.api.model.JsonSuccess;
import org.openapitools.server.api.model.JsonSuccessBase;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OneOfobjectobject;
import org.openapitools.server.api.model.OneOfobjectobjectobject;
import org.openapitools.server.api.model.OneOfobjectobjectobjectobjectobjectobject;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface UsersApi  {
    //create-user
    void createUser(String email, String password, String fullName, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //create-user-group
    void createUserGroup(String name, String description, List<Integer> members, Handler<AsyncResult<JsonSuccess>> handler);
    
    //deactivate-own-user
    void deactivateOwnUser(Handler<AsyncResult<JsonSuccess>> handler);
    
    //deactivate-user
    void deactivateUser(Integer userId, Handler<AsyncResult<JsonSuccess>> handler);
    
    //get-attachments
    void getAttachments(Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get-own-user
    void getOwnUser(Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get-user
    void getUser(Integer userId, Boolean clientGravatar, Boolean includeCustomProfileFields, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get-user-by-email
    void getUserByEmail(String email, Boolean clientGravatar, Boolean includeCustomProfileFields, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get-user-groups
    void getUserGroups(Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get-user-presence
    void getUserPresence(String userIdOrEmail, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get-users
    void getUsers(Boolean clientGravatar, Boolean includeCustomProfileFields, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //mute-user
    void muteUser(Integer mutedUserId, Handler<AsyncResult<JsonSuccess>> handler);
    
    //reactivate-user
    void reactivateUser(Integer userId, Handler<AsyncResult<Object>> handler);
    
    //remove-user-group
    void removeUserGroup(Integer userGroupId, Handler<AsyncResult<JsonSuccess>> handler);
    
    //set-typing-status
    void setTypingStatus(String op, List<Integer> to, String type, String topic, Handler<AsyncResult<JsonSuccess>> handler);
    
    //unmute-user
    void unmuteUser(Integer mutedUserId, Handler<AsyncResult<JsonSuccess>> handler);
    
    //update-settings
    void updateSettings(String fullName, String email, String oldPassword, String newPassword, Boolean twentyFourHourTime, Boolean denseMode, Boolean starredMessageCounts, Boolean fluidLayoutWidth, Boolean highContrastMode, Integer colorScheme, Boolean enableDraftsSynchronization, Boolean translateEmoticons, String defaultLanguage, String defaultView, Boolean leftSideUserlist, String emojiset, Integer demoteInactiveStreams, String timezone, Boolean enableStreamDesktopNotifications, Boolean enableStreamEmailNotifications, Boolean enableStreamPushNotifications, Boolean enableStreamAudibleNotifications, String notificationSound, Boolean enableDesktopNotifications, Boolean enableSounds, Integer emailNotificationsBatchingPeriodSeconds, Boolean enableOfflineEmailNotifications, Boolean enableOfflinePushNotifications, Boolean enableOnlinePushNotifications, Boolean enableDigestEmails, Boolean enableMarketingEmails, Boolean enableLoginEmails, Boolean messageContentInEmailNotifications, Boolean pmContentInDesktopNotifications, Boolean wildcardMentionsNotify, Integer desktopIconCountDisplay, Boolean realmNameInNotifications, Boolean presenceEnabled, Boolean enterSends, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //update-status
    void updateStatus(String statusText, Boolean away, String emojiName, String emojiCode, String reactionType, Handler<AsyncResult<JsonSuccess>> handler);
    
    //update-user
    void updateUser(Integer userId, String fullName, Integer role, List<Object> profileData, Handler<AsyncResult<JsonSuccess>> handler);
    
    //update-user-group
    void updateUserGroup(Integer userGroupId, String name, String description, Handler<AsyncResult<JsonSuccess>> handler);
    
    //update-user-group-members
    void updateUserGroupMembers(Integer userGroupId, List<Integer> delete, List<Integer> add, Handler<AsyncResult<JsonSuccess>> handler);
    
}
