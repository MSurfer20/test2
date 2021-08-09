package controllers;

import apimodels.CodedError;
import apimodels.JsonError;
import apimodels.JsonSuccess;
import apimodels.JsonSuccessBase;
import apimodels.OneOfobjectobject;
import apimodels.OneOfobjectobjectobject;
import apimodels.OneOfobjectobjectobjectobjectobjectobject;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-09T21:33:34.002001Z[Etc/UTC]")
public class UsersApiController extends Controller {
    private final UsersApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private UsersApiController(Config configuration, UsersApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createUser(Http.Request request) throws Exception {
        String valueemail = request.getQueryString("email");
        String email;
        if (valueemail != null) {
            email = valueemail;
        } else {
            throw new IllegalArgumentException("'email' parameter is required");
        }
        String valuepassword = request.getQueryString("password");
        String password;
        if (valuepassword != null) {
            password = valuepassword;
        } else {
            throw new IllegalArgumentException("'password' parameter is required");
        }
        String valuefullName = request.getQueryString("full_name");
        String fullName;
        if (valuefullName != null) {
            fullName = valuefullName;
        } else {
            throw new IllegalArgumentException("'full_name' parameter is required");
        }
        return imp.createUserHttp(request, email, password, fullName);
    }

    @ApiAction
    public Result createUserGroup(Http.Request request) throws Exception {
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            throw new IllegalArgumentException("'name' parameter is required");
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            throw new IllegalArgumentException("'description' parameter is required");
        }
        String[] membersArray = request.queryString().get("members");
        if (membersArray == null) {
            throw new IllegalArgumentException("'members' parameter is required");
        }
        List<String> membersList = OpenAPIUtils.parametersToList("multi", membersArray);
        List<Integer> members = new ArrayList<>();
        for (String curParam : membersList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                members.add(Integer.parseInt(curParam));
            }
        }
        return imp.createUserGroupHttp(request, name, description, members);
    }

    @ApiAction
    public Result deactivateOwnUser(Http.Request request) throws Exception {
        return imp.deactivateOwnUserHttp(request);
    }

    @ApiAction
    public Result deactivateUser(Http.Request request, Integer userId) throws Exception {
        return imp.deactivateUserHttp(request, userId);
    }

    @ApiAction
    public Result getAttachments(Http.Request request) throws Exception {
        return imp.getAttachmentsHttp(request);
    }

    @ApiAction
    public Result getOwnUser(Http.Request request) throws Exception {
        return imp.getOwnUserHttp(request);
    }

    @ApiAction
    public Result getUser(Http.Request request, Integer userId) throws Exception {
        String valueclientGravatar = request.getQueryString("client_gravatar");
        Boolean clientGravatar;
        if (valueclientGravatar != null) {
            clientGravatar = Boolean.valueOf(valueclientGravatar);
        } else {
            clientGravatar = false;
        }
        String valueincludeCustomProfileFields = request.getQueryString("include_custom_profile_fields");
        Boolean includeCustomProfileFields;
        if (valueincludeCustomProfileFields != null) {
            includeCustomProfileFields = Boolean.valueOf(valueincludeCustomProfileFields);
        } else {
            includeCustomProfileFields = false;
        }
        return imp.getUserHttp(request, userId, clientGravatar, includeCustomProfileFields);
    }

    @ApiAction
    public Result getUserByEmail(Http.Request request, String email) throws Exception {
        String valueclientGravatar = request.getQueryString("client_gravatar");
        Boolean clientGravatar;
        if (valueclientGravatar != null) {
            clientGravatar = Boolean.valueOf(valueclientGravatar);
        } else {
            clientGravatar = false;
        }
        String valueincludeCustomProfileFields = request.getQueryString("include_custom_profile_fields");
        Boolean includeCustomProfileFields;
        if (valueincludeCustomProfileFields != null) {
            includeCustomProfileFields = Boolean.valueOf(valueincludeCustomProfileFields);
        } else {
            includeCustomProfileFields = false;
        }
        return imp.getUserByEmailHttp(request, email, clientGravatar, includeCustomProfileFields);
    }

    @ApiAction
    public Result getUserGroups(Http.Request request) throws Exception {
        return imp.getUserGroupsHttp(request);
    }

    @ApiAction
    public Result getUserPresence(Http.Request request, String userIdOrEmail) throws Exception {
        return imp.getUserPresenceHttp(request, userIdOrEmail);
    }

    @ApiAction
    public Result getUsers(Http.Request request) throws Exception {
        String valueclientGravatar = request.getQueryString("client_gravatar");
        Boolean clientGravatar;
        if (valueclientGravatar != null) {
            clientGravatar = Boolean.valueOf(valueclientGravatar);
        } else {
            clientGravatar = false;
        }
        String valueincludeCustomProfileFields = request.getQueryString("include_custom_profile_fields");
        Boolean includeCustomProfileFields;
        if (valueincludeCustomProfileFields != null) {
            includeCustomProfileFields = Boolean.valueOf(valueincludeCustomProfileFields);
        } else {
            includeCustomProfileFields = false;
        }
        return imp.getUsersHttp(request, clientGravatar, includeCustomProfileFields);
    }

    @ApiAction
    public Result muteUser(Http.Request request, Integer mutedUserId) throws Exception {
        return imp.muteUserHttp(request, mutedUserId);
    }

    @ApiAction
    public Result reactivateUser(Http.Request request, Integer userId) throws Exception {
        return imp.reactivateUserHttp(request, userId);
    }

    @ApiAction
    public Result removeUserGroup(Http.Request request, Integer userGroupId) throws Exception {
        return imp.removeUserGroupHttp(request, userGroupId);
    }

    @ApiAction
    public Result setTypingStatus(Http.Request request) throws Exception {
        String valuetype = request.getQueryString("type");
        String type;
        if (valuetype != null) {
            type = valuetype;
        } else {
            type = "private";
        }
        String valueop = request.getQueryString("op");
        String op;
        if (valueop != null) {
            op = valueop;
        } else {
            throw new IllegalArgumentException("'op' parameter is required");
        }
        String[] toArray = request.queryString().get("to");
        if (toArray == null) {
            throw new IllegalArgumentException("'to' parameter is required");
        }
        List<String> toList = OpenAPIUtils.parametersToList("multi", toArray);
        List<Integer> to = new ArrayList<>();
        for (String curParam : toList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                to.add(Integer.parseInt(curParam));
            }
        }
        String valuetopic = request.getQueryString("topic");
        String topic;
        if (valuetopic != null) {
            topic = valuetopic;
        } else {
            topic = null;
        }
        return imp.setTypingStatusHttp(request, op, to, type, topic);
    }

    @ApiAction
    public Result unmuteUser(Http.Request request, Integer mutedUserId) throws Exception {
        return imp.unmuteUserHttp(request, mutedUserId);
    }

    @ApiAction
    public Result updateSettings(Http.Request request) throws Exception {
        String valuefullName = request.getQueryString("full_name");
        String fullName;
        if (valuefullName != null) {
            fullName = valuefullName;
        } else {
            fullName = null;
        }
        String valueemail = request.getQueryString("email");
        String email;
        if (valueemail != null) {
            email = valueemail;
        } else {
            email = null;
        }
        String valueoldPassword = request.getQueryString("old_password");
        String oldPassword;
        if (valueoldPassword != null) {
            oldPassword = valueoldPassword;
        } else {
            oldPassword = null;
        }
        String valuenewPassword = request.getQueryString("new_password");
        String newPassword;
        if (valuenewPassword != null) {
            newPassword = valuenewPassword;
        } else {
            newPassword = null;
        }
        String valuetwentyFourHourTime = request.getQueryString("twenty_four_hour_time");
        Boolean twentyFourHourTime;
        if (valuetwentyFourHourTime != null) {
            twentyFourHourTime = Boolean.valueOf(valuetwentyFourHourTime);
        } else {
            twentyFourHourTime = null;
        }
        String valuedenseMode = request.getQueryString("dense_mode");
        Boolean denseMode;
        if (valuedenseMode != null) {
            denseMode = Boolean.valueOf(valuedenseMode);
        } else {
            denseMode = null;
        }
        String valuestarredMessageCounts = request.getQueryString("starred_message_counts");
        Boolean starredMessageCounts;
        if (valuestarredMessageCounts != null) {
            starredMessageCounts = Boolean.valueOf(valuestarredMessageCounts);
        } else {
            starredMessageCounts = null;
        }
        String valuefluidLayoutWidth = request.getQueryString("fluid_layout_width");
        Boolean fluidLayoutWidth;
        if (valuefluidLayoutWidth != null) {
            fluidLayoutWidth = Boolean.valueOf(valuefluidLayoutWidth);
        } else {
            fluidLayoutWidth = null;
        }
        String valuehighContrastMode = request.getQueryString("high_contrast_mode");
        Boolean highContrastMode;
        if (valuehighContrastMode != null) {
            highContrastMode = Boolean.valueOf(valuehighContrastMode);
        } else {
            highContrastMode = null;
        }
        String valuecolorScheme = request.getQueryString("color_scheme");
        Integer colorScheme;
        if (valuecolorScheme != null) {
            colorScheme = Integer.parseInt(valuecolorScheme);
        } else {
            colorScheme = null;
        }
        String valueenableDraftsSynchronization = request.getQueryString("enable_drafts_synchronization");
        Boolean enableDraftsSynchronization;
        if (valueenableDraftsSynchronization != null) {
            enableDraftsSynchronization = Boolean.valueOf(valueenableDraftsSynchronization);
        } else {
            enableDraftsSynchronization = null;
        }
        String valuetranslateEmoticons = request.getQueryString("translate_emoticons");
        Boolean translateEmoticons;
        if (valuetranslateEmoticons != null) {
            translateEmoticons = Boolean.valueOf(valuetranslateEmoticons);
        } else {
            translateEmoticons = null;
        }
        String valuedefaultLanguage = request.getQueryString("default_language");
        String defaultLanguage;
        if (valuedefaultLanguage != null) {
            defaultLanguage = valuedefaultLanguage;
        } else {
            defaultLanguage = null;
        }
        String valuedefaultView = request.getQueryString("default_view");
        String defaultView;
        if (valuedefaultView != null) {
            defaultView = valuedefaultView;
        } else {
            defaultView = null;
        }
        String valueleftSideUserlist = request.getQueryString("left_side_userlist");
        Boolean leftSideUserlist;
        if (valueleftSideUserlist != null) {
            leftSideUserlist = Boolean.valueOf(valueleftSideUserlist);
        } else {
            leftSideUserlist = null;
        }
        String valueemojiset = request.getQueryString("emojiset");
        String emojiset;
        if (valueemojiset != null) {
            emojiset = valueemojiset;
        } else {
            emojiset = null;
        }
        String valuedemoteInactiveStreams = request.getQueryString("demote_inactive_streams");
        Integer demoteInactiveStreams;
        if (valuedemoteInactiveStreams != null) {
            demoteInactiveStreams = Integer.parseInt(valuedemoteInactiveStreams);
        } else {
            demoteInactiveStreams = null;
        }
        String valuetimezone = request.getQueryString("timezone");
        String timezone;
        if (valuetimezone != null) {
            timezone = valuetimezone;
        } else {
            timezone = null;
        }
        String valueenableStreamDesktopNotifications = request.getQueryString("enable_stream_desktop_notifications");
        Boolean enableStreamDesktopNotifications;
        if (valueenableStreamDesktopNotifications != null) {
            enableStreamDesktopNotifications = Boolean.valueOf(valueenableStreamDesktopNotifications);
        } else {
            enableStreamDesktopNotifications = null;
        }
        String valueenableStreamEmailNotifications = request.getQueryString("enable_stream_email_notifications");
        Boolean enableStreamEmailNotifications;
        if (valueenableStreamEmailNotifications != null) {
            enableStreamEmailNotifications = Boolean.valueOf(valueenableStreamEmailNotifications);
        } else {
            enableStreamEmailNotifications = null;
        }
        String valueenableStreamPushNotifications = request.getQueryString("enable_stream_push_notifications");
        Boolean enableStreamPushNotifications;
        if (valueenableStreamPushNotifications != null) {
            enableStreamPushNotifications = Boolean.valueOf(valueenableStreamPushNotifications);
        } else {
            enableStreamPushNotifications = null;
        }
        String valueenableStreamAudibleNotifications = request.getQueryString("enable_stream_audible_notifications");
        Boolean enableStreamAudibleNotifications;
        if (valueenableStreamAudibleNotifications != null) {
            enableStreamAudibleNotifications = Boolean.valueOf(valueenableStreamAudibleNotifications);
        } else {
            enableStreamAudibleNotifications = null;
        }
        String valuenotificationSound = request.getQueryString("notification_sound");
        String notificationSound;
        if (valuenotificationSound != null) {
            notificationSound = valuenotificationSound;
        } else {
            notificationSound = null;
        }
        String valueenableDesktopNotifications = request.getQueryString("enable_desktop_notifications");
        Boolean enableDesktopNotifications;
        if (valueenableDesktopNotifications != null) {
            enableDesktopNotifications = Boolean.valueOf(valueenableDesktopNotifications);
        } else {
            enableDesktopNotifications = null;
        }
        String valueenableSounds = request.getQueryString("enable_sounds");
        Boolean enableSounds;
        if (valueenableSounds != null) {
            enableSounds = Boolean.valueOf(valueenableSounds);
        } else {
            enableSounds = null;
        }
        String valueemailNotificationsBatchingPeriodSeconds = request.getQueryString("email_notifications_batching_period_seconds");
        Integer emailNotificationsBatchingPeriodSeconds;
        if (valueemailNotificationsBatchingPeriodSeconds != null) {
            emailNotificationsBatchingPeriodSeconds = Integer.parseInt(valueemailNotificationsBatchingPeriodSeconds);
        } else {
            emailNotificationsBatchingPeriodSeconds = null;
        }
        String valueenableOfflineEmailNotifications = request.getQueryString("enable_offline_email_notifications");
        Boolean enableOfflineEmailNotifications;
        if (valueenableOfflineEmailNotifications != null) {
            enableOfflineEmailNotifications = Boolean.valueOf(valueenableOfflineEmailNotifications);
        } else {
            enableOfflineEmailNotifications = null;
        }
        String valueenableOfflinePushNotifications = request.getQueryString("enable_offline_push_notifications");
        Boolean enableOfflinePushNotifications;
        if (valueenableOfflinePushNotifications != null) {
            enableOfflinePushNotifications = Boolean.valueOf(valueenableOfflinePushNotifications);
        } else {
            enableOfflinePushNotifications = null;
        }
        String valueenableOnlinePushNotifications = request.getQueryString("enable_online_push_notifications");
        Boolean enableOnlinePushNotifications;
        if (valueenableOnlinePushNotifications != null) {
            enableOnlinePushNotifications = Boolean.valueOf(valueenableOnlinePushNotifications);
        } else {
            enableOnlinePushNotifications = null;
        }
        String valueenableDigestEmails = request.getQueryString("enable_digest_emails");
        Boolean enableDigestEmails;
        if (valueenableDigestEmails != null) {
            enableDigestEmails = Boolean.valueOf(valueenableDigestEmails);
        } else {
            enableDigestEmails = null;
        }
        String valueenableMarketingEmails = request.getQueryString("enable_marketing_emails");
        Boolean enableMarketingEmails;
        if (valueenableMarketingEmails != null) {
            enableMarketingEmails = Boolean.valueOf(valueenableMarketingEmails);
        } else {
            enableMarketingEmails = null;
        }
        String valueenableLoginEmails = request.getQueryString("enable_login_emails");
        Boolean enableLoginEmails;
        if (valueenableLoginEmails != null) {
            enableLoginEmails = Boolean.valueOf(valueenableLoginEmails);
        } else {
            enableLoginEmails = null;
        }
        String valuemessageContentInEmailNotifications = request.getQueryString("message_content_in_email_notifications");
        Boolean messageContentInEmailNotifications;
        if (valuemessageContentInEmailNotifications != null) {
            messageContentInEmailNotifications = Boolean.valueOf(valuemessageContentInEmailNotifications);
        } else {
            messageContentInEmailNotifications = null;
        }
        String valuepmContentInDesktopNotifications = request.getQueryString("pm_content_in_desktop_notifications");
        Boolean pmContentInDesktopNotifications;
        if (valuepmContentInDesktopNotifications != null) {
            pmContentInDesktopNotifications = Boolean.valueOf(valuepmContentInDesktopNotifications);
        } else {
            pmContentInDesktopNotifications = null;
        }
        String valuewildcardMentionsNotify = request.getQueryString("wildcard_mentions_notify");
        Boolean wildcardMentionsNotify;
        if (valuewildcardMentionsNotify != null) {
            wildcardMentionsNotify = Boolean.valueOf(valuewildcardMentionsNotify);
        } else {
            wildcardMentionsNotify = null;
        }
        String valuedesktopIconCountDisplay = request.getQueryString("desktop_icon_count_display");
        Integer desktopIconCountDisplay;
        if (valuedesktopIconCountDisplay != null) {
            desktopIconCountDisplay = Integer.parseInt(valuedesktopIconCountDisplay);
        } else {
            desktopIconCountDisplay = null;
        }
        String valuerealmNameInNotifications = request.getQueryString("realm_name_in_notifications");
        Boolean realmNameInNotifications;
        if (valuerealmNameInNotifications != null) {
            realmNameInNotifications = Boolean.valueOf(valuerealmNameInNotifications);
        } else {
            realmNameInNotifications = null;
        }
        String valuepresenceEnabled = request.getQueryString("presence_enabled");
        Boolean presenceEnabled;
        if (valuepresenceEnabled != null) {
            presenceEnabled = Boolean.valueOf(valuepresenceEnabled);
        } else {
            presenceEnabled = null;
        }
        String valueenterSends = request.getQueryString("enter_sends");
        Boolean enterSends;
        if (valueenterSends != null) {
            enterSends = Boolean.valueOf(valueenterSends);
        } else {
            enterSends = null;
        }
        return imp.updateSettingsHttp(request, fullName, email, oldPassword, newPassword, twentyFourHourTime, denseMode, starredMessageCounts, fluidLayoutWidth, highContrastMode, colorScheme, enableDraftsSynchronization, translateEmoticons, defaultLanguage, defaultView, leftSideUserlist, emojiset, demoteInactiveStreams, timezone, enableStreamDesktopNotifications, enableStreamEmailNotifications, enableStreamPushNotifications, enableStreamAudibleNotifications, notificationSound, enableDesktopNotifications, enableSounds, emailNotificationsBatchingPeriodSeconds, enableOfflineEmailNotifications, enableOfflinePushNotifications, enableOnlinePushNotifications, enableDigestEmails, enableMarketingEmails, enableLoginEmails, messageContentInEmailNotifications, pmContentInDesktopNotifications, wildcardMentionsNotify, desktopIconCountDisplay, realmNameInNotifications, presenceEnabled, enterSends);
    }

    @ApiAction
    public Result updateStatus(Http.Request request) throws Exception {
        String valuestatusText = request.getQueryString("status_text");
        String statusText;
        if (valuestatusText != null) {
            statusText = valuestatusText;
        } else {
            statusText = null;
        }
        String valueaway = request.getQueryString("away");
        Boolean away;
        if (valueaway != null) {
            away = Boolean.valueOf(valueaway);
        } else {
            away = null;
        }
        String valueemojiName = request.getQueryString("emoji_name");
        String emojiName;
        if (valueemojiName != null) {
            emojiName = valueemojiName;
        } else {
            emojiName = null;
        }
        String valueemojiCode = request.getQueryString("emoji_code");
        String emojiCode;
        if (valueemojiCode != null) {
            emojiCode = valueemojiCode;
        } else {
            emojiCode = null;
        }
        String valuereactionType = request.getQueryString("reaction_type");
        String reactionType;
        if (valuereactionType != null) {
            reactionType = valuereactionType;
        } else {
            reactionType = null;
        }
        return imp.updateStatusHttp(request, statusText, away, emojiName, emojiCode, reactionType);
    }

    @ApiAction
    public Result updateUser(Http.Request request, Integer userId) throws Exception {
        String valuefullName = request.getQueryString("full_name");
        String fullName;
        if (valuefullName != null) {
            fullName = valuefullName;
        } else {
            fullName = null;
        }
        String valuerole = request.getQueryString("role");
        Integer role;
        if (valuerole != null) {
            role = Integer.parseInt(valuerole);
        } else {
            role = null;
        }
        String[] profileDataArray = request.queryString().get("profile_data");
        List<String> profileDataList = OpenAPIUtils.parametersToList("multi", profileDataArray);
        List<Object> profileData = new ArrayList<>();
        for (String curParam : profileDataList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                profileData.add(curParam);
            }
        }
        return imp.updateUserHttp(request, userId, fullName, role, profileData);
    }

    @ApiAction
    public Result updateUserGroup(Http.Request request, Integer userGroupId) throws Exception {
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            throw new IllegalArgumentException("'name' parameter is required");
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            throw new IllegalArgumentException("'description' parameter is required");
        }
        return imp.updateUserGroupHttp(request, userGroupId, name, description);
    }

    @ApiAction
    public Result updateUserGroupMembers(Http.Request request, Integer userGroupId) throws Exception {
        String[] deleteArray = request.queryString().get("delete");
        List<String> deleteList = OpenAPIUtils.parametersToList("multi", deleteArray);
        List<Integer> delete = new ArrayList<>();
        for (String curParam : deleteList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                delete.add(Integer.parseInt(curParam));
            }
        }
        String[] addArray = request.queryString().get("add");
        List<String> addList = OpenAPIUtils.parametersToList("multi", addArray);
        List<Integer> add = new ArrayList<>();
        for (String curParam : addList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                add.add(Integer.parseInt(curParam));
            }
        }
        return imp.updateUserGroupMembersHttp(request, userGroupId, delete, add);
    }

}
