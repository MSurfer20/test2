package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CodedError;
import org.openapitools.server.api.model.JsonError;
import org.openapitools.server.api.model.JsonSuccess;
import org.openapitools.server.api.model.JsonSuccessBase;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OneOfobjectobject;
import org.openapitools.server.api.model.OneOfobjectobjectobject;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface UsersApi  {
    //create_user
    void createUser(String email, String password, String fullName, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //create_user_group
    void createUserGroup(String name, String description, List<Integer> members, Handler<AsyncResult<JsonSuccess>> handler);
    
    //deactivate_own_user
    void deactivateOwnUser(Handler<AsyncResult<JsonSuccess>> handler);
    
    //deactivate_user
    void deactivateUser(Integer userId, Handler<AsyncResult<JsonSuccess>> handler);
    
    //get_attachments
    void getAttachments(Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get_own_user
    void getOwnUser(Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get_user
    void getUser(Integer userId, Boolean clientGravatar, Boolean includeCustomProfileFields, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get_user_by_email
    void getUserByEmail(String email, Boolean clientGravatar, Boolean includeCustomProfileFields, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get_user_groups
    void getUserGroups(Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get_user_presence
    void getUserPresence(String userIdOrEmail, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get_users
    void getUsers(Boolean clientGravatar, Boolean includeCustomProfileFields, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //mute_user
    void muteUser(Integer mutedUserId, Handler<AsyncResult<JsonSuccess>> handler);
    
    //reactivate_user
    void reactivateUser(Integer userId, Handler<AsyncResult<Object>> handler);
    
    //remove_user_group
    void removeUserGroup(Integer userGroupId, Handler<AsyncResult<JsonSuccess>> handler);
    
    //set_typing_status
    void setTypingStatus(String op, List<Integer> to, String type, String topic, Handler<AsyncResult<JsonSuccess>> handler);
    
    //unmute_user
    void unmuteUser(Integer mutedUserId, Handler<AsyncResult<JsonSuccess>> handler);
    
    //update_display_settings
    void updateDisplaySettings(Boolean twentyFourHourTime, Boolean denseMode, Boolean starredMessageCounts, Boolean fluidLayoutWidth, Boolean highContrastMode, Integer colorScheme, Boolean translateEmoticons, String defaultLanguage, String defaultView, Boolean leftSideUserlist, String emojiset, Integer demoteInactiveStreams, String timezone, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //update_notification_settings
    void updateNotificationSettings(Boolean enableStreamDesktopNotifications, Boolean enableStreamEmailNotifications, Boolean enableStreamPushNotifications, Boolean enableStreamAudibleNotifications, String notificationSound, Boolean enableDesktopNotifications, Boolean enableSounds, Boolean enableOfflineEmailNotifications, Boolean enableOfflinePushNotifications, Boolean enableOnlinePushNotifications, Boolean enableDigestEmails, Boolean enableMarketingEmails, Boolean enableLoginEmails, Boolean messageContentInEmailNotifications, Boolean pmContentInDesktopNotifications, Boolean wildcardMentionsNotify, Integer desktopIconCountDisplay, Boolean realmNameInNotifications, Boolean presenceEnabled, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //update_user
    void updateUser(Integer userId, String fullName, Integer role, List<Object> profileData, Handler<AsyncResult<JsonSuccess>> handler);
    
    //update_user_group
    void updateUserGroup(Integer userGroupId, String name, String description, Handler<AsyncResult<JsonSuccess>> handler);
    
    //update_user_group_members
    void updateUserGroupMembers(Integer userGroupId, List<Integer> delete, List<Integer> add, Handler<AsyncResult<JsonSuccess>> handler);
    
}
