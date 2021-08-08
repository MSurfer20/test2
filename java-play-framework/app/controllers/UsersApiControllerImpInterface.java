package controllers;

import apimodels.CodedError;
import apimodels.JsonError;
import apimodels.JsonSuccess;
import apimodels.JsonSuccessBase;
import apimodels.OneOfobjectobject;
import apimodels.OneOfobjectobjectobject;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import static play.mvc.Results.ok;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public abstract class UsersApiControllerImpInterface {
    @Inject private Config configuration;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createUserHttp(Http.Request request, @NotNull String email, @NotNull String password, @NotNull String fullName) throws Exception {
        JsonSuccessBase obj = createUser(request, email, password, fullName);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase createUser(Http.Request request, @NotNull String email, @NotNull String password, @NotNull String fullName) throws Exception;

    public Result createUserGroupHttp(Http.Request request, @NotNull String name, @NotNull String description, @NotNull List<Integer> members) throws Exception {
        JsonSuccess obj = createUserGroup(request, name, description, members);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess createUserGroup(Http.Request request, @NotNull String name, @NotNull String description, @NotNull List<Integer> members) throws Exception;

    public Result deactivateOwnUserHttp(Http.Request request) throws Exception {
        JsonSuccess obj = deactivateOwnUser(request);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess deactivateOwnUser(Http.Request request) throws Exception;

    public Result deactivateUserHttp(Http.Request request, Integer userId) throws Exception {
        JsonSuccess obj = deactivateUser(request, userId);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess deactivateUser(Http.Request request, Integer userId) throws Exception;

    public Result getAttachmentsHttp(Http.Request request) throws Exception {
        JsonSuccessBase obj = getAttachments(request);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase getAttachments(Http.Request request) throws Exception;

    public Result getOwnUserHttp(Http.Request request) throws Exception {
        JsonSuccessBase obj = getOwnUser(request);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase getOwnUser(Http.Request request) throws Exception;

    public Result getUserHttp(Http.Request request, Integer userId, Boolean clientGravatar, Boolean includeCustomProfileFields) throws Exception {
        JsonSuccessBase obj = getUser(request, userId, clientGravatar, includeCustomProfileFields);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase getUser(Http.Request request, Integer userId, Boolean clientGravatar, Boolean includeCustomProfileFields) throws Exception;

    public Result getUserByEmailHttp(Http.Request request, String email, Boolean clientGravatar, Boolean includeCustomProfileFields) throws Exception {
        JsonSuccessBase obj = getUserByEmail(request, email, clientGravatar, includeCustomProfileFields);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase getUserByEmail(Http.Request request, String email, Boolean clientGravatar, Boolean includeCustomProfileFields) throws Exception;

    public Result getUserGroupsHttp(Http.Request request) throws Exception {
        JsonSuccessBase obj = getUserGroups(request);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase getUserGroups(Http.Request request) throws Exception;

    public Result getUserPresenceHttp(Http.Request request, String userIdOrEmail) throws Exception {
        JsonSuccessBase obj = getUserPresence(request, userIdOrEmail);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase getUserPresence(Http.Request request, String userIdOrEmail) throws Exception;

    public Result getUsersHttp(Http.Request request, Boolean clientGravatar, Boolean includeCustomProfileFields) throws Exception {
        JsonSuccessBase obj = getUsers(request, clientGravatar, includeCustomProfileFields);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase getUsers(Http.Request request, Boolean clientGravatar, Boolean includeCustomProfileFields) throws Exception;

    public Result muteUserHttp(Http.Request request, Integer mutedUserId) throws Exception {
        JsonSuccess obj = muteUser(request, mutedUserId);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess muteUser(Http.Request request, Integer mutedUserId) throws Exception;

    public Result reactivateUserHttp(Http.Request request, Integer userId) throws Exception {
        Object obj = reactivateUser(request, userId);
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract Object reactivateUser(Http.Request request, Integer userId) throws Exception;

    public Result removeUserGroupHttp(Http.Request request, Integer userGroupId) throws Exception {
        JsonSuccess obj = removeUserGroup(request, userGroupId);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess removeUserGroup(Http.Request request, Integer userGroupId) throws Exception;

    public Result setTypingStatusHttp(Http.Request request, @NotNull String op, @NotNull List<Integer> to, String type, String topic) throws Exception {
        JsonSuccess obj = setTypingStatus(request, op, to, type, topic);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess setTypingStatus(Http.Request request, @NotNull String op, @NotNull List<Integer> to, String type, String topic) throws Exception;

    public Result unmuteUserHttp(Http.Request request, Integer mutedUserId) throws Exception {
        JsonSuccess obj = unmuteUser(request, mutedUserId);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess unmuteUser(Http.Request request, Integer mutedUserId) throws Exception;

    public Result updateDisplaySettingsHttp(Http.Request request, Boolean twentyFourHourTime, Boolean denseMode, Boolean starredMessageCounts, Boolean fluidLayoutWidth, Boolean highContrastMode, Integer colorScheme, Boolean translateEmoticons, String defaultLanguage, String defaultView, Boolean leftSideUserlist, String emojiset, Integer demoteInactiveStreams, String timezone) throws Exception {
        JsonSuccessBase obj = updateDisplaySettings(request, twentyFourHourTime, denseMode, starredMessageCounts, fluidLayoutWidth, highContrastMode, colorScheme, translateEmoticons, defaultLanguage, defaultView, leftSideUserlist, emojiset, demoteInactiveStreams, timezone);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase updateDisplaySettings(Http.Request request, Boolean twentyFourHourTime, Boolean denseMode, Boolean starredMessageCounts, Boolean fluidLayoutWidth, Boolean highContrastMode, Integer colorScheme, Boolean translateEmoticons, String defaultLanguage, String defaultView, Boolean leftSideUserlist, String emojiset, Integer demoteInactiveStreams, String timezone) throws Exception;

    public Result updateNotificationSettingsHttp(Http.Request request, Boolean enableStreamDesktopNotifications, Boolean enableStreamEmailNotifications, Boolean enableStreamPushNotifications, Boolean enableStreamAudibleNotifications, String notificationSound, Boolean enableDesktopNotifications, Boolean enableSounds, Boolean enableOfflineEmailNotifications, Boolean enableOfflinePushNotifications, Boolean enableOnlinePushNotifications, Boolean enableDigestEmails, Boolean enableMarketingEmails, Boolean enableLoginEmails, Boolean messageContentInEmailNotifications, Boolean pmContentInDesktopNotifications, Boolean wildcardMentionsNotify, Integer desktopIconCountDisplay, Boolean realmNameInNotifications, Boolean presenceEnabled) throws Exception {
        JsonSuccessBase obj = updateNotificationSettings(request, enableStreamDesktopNotifications, enableStreamEmailNotifications, enableStreamPushNotifications, enableStreamAudibleNotifications, notificationSound, enableDesktopNotifications, enableSounds, enableOfflineEmailNotifications, enableOfflinePushNotifications, enableOnlinePushNotifications, enableDigestEmails, enableMarketingEmails, enableLoginEmails, messageContentInEmailNotifications, pmContentInDesktopNotifications, wildcardMentionsNotify, desktopIconCountDisplay, realmNameInNotifications, presenceEnabled);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase updateNotificationSettings(Http.Request request, Boolean enableStreamDesktopNotifications, Boolean enableStreamEmailNotifications, Boolean enableStreamPushNotifications, Boolean enableStreamAudibleNotifications, String notificationSound, Boolean enableDesktopNotifications, Boolean enableSounds, Boolean enableOfflineEmailNotifications, Boolean enableOfflinePushNotifications, Boolean enableOnlinePushNotifications, Boolean enableDigestEmails, Boolean enableMarketingEmails, Boolean enableLoginEmails, Boolean messageContentInEmailNotifications, Boolean pmContentInDesktopNotifications, Boolean wildcardMentionsNotify, Integer desktopIconCountDisplay, Boolean realmNameInNotifications, Boolean presenceEnabled) throws Exception;

    public Result updateUserHttp(Http.Request request, Integer userId, String fullName, Integer role, List<Object> profileData) throws Exception {
        JsonSuccess obj = updateUser(request, userId, fullName, role, profileData);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess updateUser(Http.Request request, Integer userId, String fullName, Integer role, List<Object> profileData) throws Exception;

    public Result updateUserGroupHttp(Http.Request request, Integer userGroupId, @NotNull String name, @NotNull String description) throws Exception {
        JsonSuccess obj = updateUserGroup(request, userGroupId, name, description);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess updateUserGroup(Http.Request request, Integer userGroupId, @NotNull String name, @NotNull String description) throws Exception;

    public Result updateUserGroupMembersHttp(Http.Request request, Integer userGroupId, List<Integer> delete, List<Integer> add) throws Exception {
        JsonSuccess obj = updateUserGroupMembers(request, userGroupId, delete, add);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess updateUserGroupMembers(Http.Request request, Integer userGroupId, List<Integer> delete, List<Integer> add) throws Exception;

}
