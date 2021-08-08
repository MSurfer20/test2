package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CodedError;
import org.openapitools.vertxweb.server.model.JsonError;
import org.openapitools.vertxweb.server.model.JsonSuccess;
import org.openapitools.vertxweb.server.model.JsonSuccessBase;
import org.openapitools.vertxweb.server.model.OneOfobjectobject;
import org.openapitools.vertxweb.server.model.OneOfobjectobjectobject;
import org.openapitools.vertxweb.server.model.OneOfobjectobjectobjectobjectobjectobject;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface UsersApi  {
    Future<ApiResponse<JsonSuccessBase>> createUser(String email, String password, String fullName);
    Future<ApiResponse<JsonSuccess>> createUserGroup(String name, String description, List<Integer> members);
    Future<ApiResponse<JsonSuccess>> deactivateOwnUser();
    Future<ApiResponse<JsonSuccess>> deactivateUser(Integer userId);
    Future<ApiResponse<JsonSuccessBase>> getAttachments();
    Future<ApiResponse<JsonSuccessBase>> getOwnUser();
    Future<ApiResponse<JsonSuccessBase>> getUser(Integer userId, Boolean clientGravatar, Boolean includeCustomProfileFields);
    Future<ApiResponse<JsonSuccessBase>> getUserByEmail(String email, Boolean clientGravatar, Boolean includeCustomProfileFields);
    Future<ApiResponse<JsonSuccessBase>> getUserGroups();
    Future<ApiResponse<JsonSuccessBase>> getUserPresence(String userIdOrEmail);
    Future<ApiResponse<JsonSuccessBase>> getUsers(Boolean clientGravatar, Boolean includeCustomProfileFields);
    Future<ApiResponse<JsonSuccess>> muteUser(Integer mutedUserId);
    Future<ApiResponse<Object>> reactivateUser(Integer userId);
    Future<ApiResponse<JsonSuccess>> removeUserGroup(Integer userGroupId);
    Future<ApiResponse<JsonSuccess>> setTypingStatus(String op, List<Integer> to, String type, String topic);
    Future<ApiResponse<JsonSuccess>> unmuteUser(Integer mutedUserId);
    Future<ApiResponse<JsonSuccessBase>> updateSettings(String fullName, String email, String oldPassword, String newPassword, Boolean twentyFourHourTime, Boolean denseMode, Boolean starredMessageCounts, Boolean fluidLayoutWidth, Boolean highContrastMode, Integer colorScheme, Boolean enableDraftsSynchronization, Boolean translateEmoticons, String defaultLanguage, String defaultView, Boolean leftSideUserlist, String emojiset, Integer demoteInactiveStreams, String timezone, Boolean enableStreamDesktopNotifications, Boolean enableStreamEmailNotifications, Boolean enableStreamPushNotifications, Boolean enableStreamAudibleNotifications, String notificationSound, Boolean enableDesktopNotifications, Boolean enableSounds, Integer emailNotificationsBatchingPeriodSeconds, Boolean enableOfflineEmailNotifications, Boolean enableOfflinePushNotifications, Boolean enableOnlinePushNotifications, Boolean enableDigestEmails, Boolean enableMarketingEmails, Boolean enableLoginEmails, Boolean messageContentInEmailNotifications, Boolean pmContentInDesktopNotifications, Boolean wildcardMentionsNotify, Integer desktopIconCountDisplay, Boolean realmNameInNotifications, Boolean presenceEnabled, Boolean enterSends);
    Future<ApiResponse<JsonSuccess>> updateStatus(String statusText, Boolean away, String emojiName, String emojiCode, String reactionType);
    Future<ApiResponse<JsonSuccess>> updateUser(Integer userId, String fullName, Integer role, List<Object> profileData);
    Future<ApiResponse<JsonSuccess>> updateUserGroup(Integer userGroupId, String name, String description);
    Future<ApiResponse<JsonSuccess>> updateUserGroupMembers(Integer userGroupId, List<Integer> delete, List<Integer> add);
}
