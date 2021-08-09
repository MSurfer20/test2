package controllers;

import apimodels.CodedError;
import apimodels.JsonError;
import apimodels.JsonSuccess;
import apimodels.JsonSuccessBase;
import apimodels.OneOfobjectobject;
import apimodels.OneOfobjectobjectobject;
import apimodels.OneOfobjectobjectobjectobjectobjectobject;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-09T21:33:34.002001Z[Etc/UTC]")
public class UsersApiControllerImp extends UsersApiControllerImpInterface {
    @Override
    public JsonSuccessBase createUser(Http.Request request, @NotNull String email, @NotNull String password, @NotNull String fullName) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccess createUserGroup(Http.Request request, @NotNull String name, @NotNull String description, @NotNull List<Integer> members) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccess deactivateOwnUser(Http.Request request) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccess deactivateUser(Http.Request request, Integer userId) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccessBase getAttachments(Http.Request request) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccessBase getOwnUser(Http.Request request) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccessBase getUser(Http.Request request, Integer userId, Boolean clientGravatar, Boolean includeCustomProfileFields) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccessBase getUserByEmail(Http.Request request, String email, Boolean clientGravatar, Boolean includeCustomProfileFields) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccessBase getUserGroups(Http.Request request) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccessBase getUserPresence(Http.Request request, String userIdOrEmail) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccessBase getUsers(Http.Request request, Boolean clientGravatar, Boolean includeCustomProfileFields) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccess muteUser(Http.Request request, Integer mutedUserId) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public Object reactivateUser(Http.Request request, Integer userId) throws Exception {
        //Do your magic!!!
        return new Object();
    }

    @Override
    public JsonSuccess removeUserGroup(Http.Request request, Integer userGroupId) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccess setTypingStatus(Http.Request request, @NotNull String op, @NotNull List<Integer> to, String type, String topic) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccess unmuteUser(Http.Request request, Integer mutedUserId) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccessBase updateSettings(Http.Request request, String fullName, String email, String oldPassword, String newPassword, Boolean twentyFourHourTime, Boolean denseMode, Boolean starredMessageCounts, Boolean fluidLayoutWidth, Boolean highContrastMode, Integer colorScheme, Boolean enableDraftsSynchronization, Boolean translateEmoticons, String defaultLanguage, String defaultView, Boolean leftSideUserlist, String emojiset, Integer demoteInactiveStreams, String timezone, Boolean enableStreamDesktopNotifications, Boolean enableStreamEmailNotifications, Boolean enableStreamPushNotifications, Boolean enableStreamAudibleNotifications, String notificationSound, Boolean enableDesktopNotifications, Boolean enableSounds, Integer emailNotificationsBatchingPeriodSeconds, Boolean enableOfflineEmailNotifications, Boolean enableOfflinePushNotifications, Boolean enableOnlinePushNotifications, Boolean enableDigestEmails, Boolean enableMarketingEmails, Boolean enableLoginEmails, Boolean messageContentInEmailNotifications, Boolean pmContentInDesktopNotifications, Boolean wildcardMentionsNotify, Integer desktopIconCountDisplay, Boolean realmNameInNotifications, Boolean presenceEnabled, Boolean enterSends) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccess updateStatus(Http.Request request, String statusText, Boolean away, String emojiName, String emojiCode, String reactionType) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccess updateUser(Http.Request request, Integer userId, String fullName, Integer role, List<Object> profileData) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccess updateUserGroup(Http.Request request, Integer userGroupId, @NotNull String name, @NotNull String description) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccess updateUserGroupMembers(Http.Request request, Integer userGroupId, List<Integer> delete, List<Integer> add) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

}
