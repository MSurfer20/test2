package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CodedError;
import org.openapitools.vertxweb.server.model.JsonError;
import org.openapitools.vertxweb.server.model.JsonSuccess;
import org.openapitools.vertxweb.server.model.JsonSuccessBase;
import org.openapitools.vertxweb.server.model.OneOfobjectobject;
import org.openapitools.vertxweb.server.model.OneOfobjectobjectobject;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.impl.HttpStatusException;

import java.util.List;
import java.util.Map;

// Implement this class

public class UsersApiImpl implements UsersApi {
    public Future<ApiResponse<JsonSuccessBase>> createUser(String email, String password, String fullName) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> createUserGroup(String name, String description, List<Integer> members) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> deactivateOwnUser() {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> deactivateUser(Integer userId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> getAttachments() {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> getOwnUser() {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> getUser(Integer userId, Boolean clientGravatar, Boolean includeCustomProfileFields) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> getUserByEmail(String email, Boolean clientGravatar, Boolean includeCustomProfileFields) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> getUserGroups() {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> getUserPresence(String userIdOrEmail) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> getUsers(Boolean clientGravatar, Boolean includeCustomProfileFields) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> muteUser(Integer mutedUserId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<Object>> reactivateUser(Integer userId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> removeUserGroup(Integer userGroupId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> setTypingStatus(String op, List<Integer> to, String type, String topic) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> unmuteUser(Integer mutedUserId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> updateDisplaySettings(Boolean twentyFourHourTime, Boolean denseMode, Boolean starredMessageCounts, Boolean fluidLayoutWidth, Boolean highContrastMode, Integer colorScheme, Boolean translateEmoticons, String defaultLanguage, String defaultView, Boolean leftSideUserlist, String emojiset, Integer demoteInactiveStreams, String timezone) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> updateNotificationSettings(Boolean enableStreamDesktopNotifications, Boolean enableStreamEmailNotifications, Boolean enableStreamPushNotifications, Boolean enableStreamAudibleNotifications, String notificationSound, Boolean enableDesktopNotifications, Boolean enableSounds, Boolean enableOfflineEmailNotifications, Boolean enableOfflinePushNotifications, Boolean enableOnlinePushNotifications, Boolean enableDigestEmails, Boolean enableMarketingEmails, Boolean enableLoginEmails, Boolean messageContentInEmailNotifications, Boolean pmContentInDesktopNotifications, Boolean wildcardMentionsNotify, Integer desktopIconCountDisplay, Boolean realmNameInNotifications, Boolean presenceEnabled) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> updateUser(Integer userId, String fullName, Integer role, List<Object> profileData) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> updateUserGroup(Integer userGroupId, String name, String description) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> updateUserGroupMembers(Integer userGroupId, List<Integer> delete, List<Integer> add) {
        return Future.failedFuture(new HttpStatusException(501));
    }

}
