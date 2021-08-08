package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CodedError;
import org.openapitools.vertxweb.server.model.JsonError;
import org.openapitools.vertxweb.server.model.JsonSuccess;
import org.openapitools.vertxweb.server.model.JsonSuccessBase;
import org.openapitools.vertxweb.server.model.OneOfobjectobject;
import org.openapitools.vertxweb.server.model.OneOfobjectobjectobject;
import org.openapitools.vertxweb.server.model.OneOfobjectobjectobjectobjectobjectobject;

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class UsersApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(UsersApiHandler.class);

    private final UsersApi api;

    public UsersApiHandler(UsersApi api) {
        this.api = api;
    }

    @Deprecated
    public UsersApiHandler() {
        this(new UsersApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("createUser").handler(this::createUser);
        builder.operation("createUserGroup").handler(this::createUserGroup);
        builder.operation("deactivateOwnUser").handler(this::deactivateOwnUser);
        builder.operation("deactivateUser").handler(this::deactivateUser);
        builder.operation("getAttachments").handler(this::getAttachments);
        builder.operation("getOwnUser").handler(this::getOwnUser);
        builder.operation("getUser").handler(this::getUser);
        builder.operation("getUserByEmail").handler(this::getUserByEmail);
        builder.operation("getUserGroups").handler(this::getUserGroups);
        builder.operation("getUserPresence").handler(this::getUserPresence);
        builder.operation("getUsers").handler(this::getUsers);
        builder.operation("muteUser").handler(this::muteUser);
        builder.operation("reactivateUser").handler(this::reactivateUser);
        builder.operation("removeUserGroup").handler(this::removeUserGroup);
        builder.operation("setTypingStatus").handler(this::setTypingStatus);
        builder.operation("unmuteUser").handler(this::unmuteUser);
        builder.operation("updateSettings").handler(this::updateSettings);
        builder.operation("updateStatus").handler(this::updateStatus);
        builder.operation("updateUser").handler(this::updateUser);
        builder.operation("updateUserGroup").handler(this::updateUserGroup);
        builder.operation("updateUserGroupMembers").handler(this::updateUserGroupMembers);
    }

    private void createUser(RoutingContext routingContext) {
        logger.info("createUser()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String email = requestParameters.queryParameter("email") != null ? requestParameters.queryParameter("email").getString() : null;
        String password = requestParameters.queryParameter("password") != null ? requestParameters.queryParameter("password").getString() : null;
        String fullName = requestParameters.queryParameter("full_name") != null ? requestParameters.queryParameter("full_name").getString() : null;

        logger.debug("Parameter email is {}", email);
        logger.debug("Parameter password is {}", password);
        logger.debug("Parameter fullName is {}", fullName);

        api.createUser(email, password, fullName)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void createUserGroup(RoutingContext routingContext) {
        logger.info("createUserGroup()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String name = requestParameters.queryParameter("name") != null ? requestParameters.queryParameter("name").getString() : null;
        String description = requestParameters.queryParameter("description") != null ? requestParameters.queryParameter("description").getString() : null;
        List<Integer> members = requestParameters.queryParameter("members") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("members").get(), new TypeReference<List<Integer>>(){}) : null;

        logger.debug("Parameter name is {}", name);
        logger.debug("Parameter description is {}", description);
        logger.debug("Parameter members is {}", members);

        api.createUserGroup(name, description, members)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void deactivateOwnUser(RoutingContext routingContext) {
        logger.info("deactivateOwnUser()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.deactivateOwnUser()
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void deactivateUser(RoutingContext routingContext) {
        logger.info("deactivateUser()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer userId = requestParameters.pathParameter("user_id") != null ? requestParameters.pathParameter("user_id").getInteger() : null;

        logger.debug("Parameter userId is {}", userId);

        api.deactivateUser(userId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getAttachments(RoutingContext routingContext) {
        logger.info("getAttachments()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.getAttachments()
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getOwnUser(RoutingContext routingContext) {
        logger.info("getOwnUser()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.getOwnUser()
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getUser(RoutingContext routingContext) {
        logger.info("getUser()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer userId = requestParameters.pathParameter("user_id") != null ? requestParameters.pathParameter("user_id").getInteger() : null;
        Boolean clientGravatar = requestParameters.queryParameter("client_gravatar") != null ? requestParameters.queryParameter("client_gravatar").getBoolean() : null;
        Boolean includeCustomProfileFields = requestParameters.queryParameter("include_custom_profile_fields") != null ? requestParameters.queryParameter("include_custom_profile_fields").getBoolean() : null;

        logger.debug("Parameter userId is {}", userId);
        logger.debug("Parameter clientGravatar is {}", clientGravatar);
        logger.debug("Parameter includeCustomProfileFields is {}", includeCustomProfileFields);

        api.getUser(userId, clientGravatar, includeCustomProfileFields)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getUserByEmail(RoutingContext routingContext) {
        logger.info("getUserByEmail()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String email = requestParameters.pathParameter("email") != null ? requestParameters.pathParameter("email").getString() : null;
        Boolean clientGravatar = requestParameters.queryParameter("client_gravatar") != null ? requestParameters.queryParameter("client_gravatar").getBoolean() : null;
        Boolean includeCustomProfileFields = requestParameters.queryParameter("include_custom_profile_fields") != null ? requestParameters.queryParameter("include_custom_profile_fields").getBoolean() : null;

        logger.debug("Parameter email is {}", email);
        logger.debug("Parameter clientGravatar is {}", clientGravatar);
        logger.debug("Parameter includeCustomProfileFields is {}", includeCustomProfileFields);

        api.getUserByEmail(email, clientGravatar, includeCustomProfileFields)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getUserGroups(RoutingContext routingContext) {
        logger.info("getUserGroups()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.getUserGroups()
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getUserPresence(RoutingContext routingContext) {
        logger.info("getUserPresence()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String userIdOrEmail = requestParameters.pathParameter("user_id_or_email") != null ? requestParameters.pathParameter("user_id_or_email").getString() : null;

        logger.debug("Parameter userIdOrEmail is {}", userIdOrEmail);

        api.getUserPresence(userIdOrEmail)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getUsers(RoutingContext routingContext) {
        logger.info("getUsers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Boolean clientGravatar = requestParameters.queryParameter("client_gravatar") != null ? requestParameters.queryParameter("client_gravatar").getBoolean() : null;
        Boolean includeCustomProfileFields = requestParameters.queryParameter("include_custom_profile_fields") != null ? requestParameters.queryParameter("include_custom_profile_fields").getBoolean() : null;

        logger.debug("Parameter clientGravatar is {}", clientGravatar);
        logger.debug("Parameter includeCustomProfileFields is {}", includeCustomProfileFields);

        api.getUsers(clientGravatar, includeCustomProfileFields)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void muteUser(RoutingContext routingContext) {
        logger.info("muteUser()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer mutedUserId = requestParameters.pathParameter("muted_user_id") != null ? requestParameters.pathParameter("muted_user_id").getInteger() : null;

        logger.debug("Parameter mutedUserId is {}", mutedUserId);

        api.muteUser(mutedUserId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void reactivateUser(RoutingContext routingContext) {
        logger.info("reactivateUser()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer userId = requestParameters.pathParameter("user_id") != null ? requestParameters.pathParameter("user_id").getInteger() : null;

        logger.debug("Parameter userId is {}", userId);

        api.reactivateUser(userId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void removeUserGroup(RoutingContext routingContext) {
        logger.info("removeUserGroup()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer userGroupId = requestParameters.pathParameter("user_group_id") != null ? requestParameters.pathParameter("user_group_id").getInteger() : null;

        logger.debug("Parameter userGroupId is {}", userGroupId);

        api.removeUserGroup(userGroupId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void setTypingStatus(RoutingContext routingContext) {
        logger.info("setTypingStatus()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String op = requestParameters.queryParameter("op") != null ? requestParameters.queryParameter("op").getString() : null;
        List<Integer> to = requestParameters.queryParameter("to") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("to").get(), new TypeReference<List<Integer>>(){}) : null;
        String type = requestParameters.queryParameter("type") != null ? requestParameters.queryParameter("type").getString() : null;
        String topic = requestParameters.queryParameter("topic") != null ? requestParameters.queryParameter("topic").getString() : null;

        logger.debug("Parameter op is {}", op);
        logger.debug("Parameter to is {}", to);
        logger.debug("Parameter type is {}", type);
        logger.debug("Parameter topic is {}", topic);

        api.setTypingStatus(op, to, type, topic)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void unmuteUser(RoutingContext routingContext) {
        logger.info("unmuteUser()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer mutedUserId = requestParameters.pathParameter("muted_user_id") != null ? requestParameters.pathParameter("muted_user_id").getInteger() : null;

        logger.debug("Parameter mutedUserId is {}", mutedUserId);

        api.unmuteUser(mutedUserId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void updateSettings(RoutingContext routingContext) {
        logger.info("updateSettings()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String fullName = requestParameters.queryParameter("full_name") != null ? requestParameters.queryParameter("full_name").getString() : null;
        String email = requestParameters.queryParameter("email") != null ? requestParameters.queryParameter("email").getString() : null;
        String oldPassword = requestParameters.queryParameter("old_password") != null ? requestParameters.queryParameter("old_password").getString() : null;
        String newPassword = requestParameters.queryParameter("new_password") != null ? requestParameters.queryParameter("new_password").getString() : null;
        Boolean twentyFourHourTime = requestParameters.queryParameter("twenty_four_hour_time") != null ? requestParameters.queryParameter("twenty_four_hour_time").getBoolean() : null;
        Boolean denseMode = requestParameters.queryParameter("dense_mode") != null ? requestParameters.queryParameter("dense_mode").getBoolean() : null;
        Boolean starredMessageCounts = requestParameters.queryParameter("starred_message_counts") != null ? requestParameters.queryParameter("starred_message_counts").getBoolean() : null;
        Boolean fluidLayoutWidth = requestParameters.queryParameter("fluid_layout_width") != null ? requestParameters.queryParameter("fluid_layout_width").getBoolean() : null;
        Boolean highContrastMode = requestParameters.queryParameter("high_contrast_mode") != null ? requestParameters.queryParameter("high_contrast_mode").getBoolean() : null;
        Integer colorScheme = requestParameters.queryParameter("color_scheme") != null ? requestParameters.queryParameter("color_scheme").getInteger() : null;
        Boolean enableDraftsSynchronization = requestParameters.queryParameter("enable_drafts_synchronization") != null ? requestParameters.queryParameter("enable_drafts_synchronization").getBoolean() : null;
        Boolean translateEmoticons = requestParameters.queryParameter("translate_emoticons") != null ? requestParameters.queryParameter("translate_emoticons").getBoolean() : null;
        String defaultLanguage = requestParameters.queryParameter("default_language") != null ? requestParameters.queryParameter("default_language").getString() : null;
        String defaultView = requestParameters.queryParameter("default_view") != null ? requestParameters.queryParameter("default_view").getString() : null;
        Boolean leftSideUserlist = requestParameters.queryParameter("left_side_userlist") != null ? requestParameters.queryParameter("left_side_userlist").getBoolean() : null;
        String emojiset = requestParameters.queryParameter("emojiset") != null ? requestParameters.queryParameter("emojiset").getString() : null;
        Integer demoteInactiveStreams = requestParameters.queryParameter("demote_inactive_streams") != null ? requestParameters.queryParameter("demote_inactive_streams").getInteger() : null;
        String timezone = requestParameters.queryParameter("timezone") != null ? requestParameters.queryParameter("timezone").getString() : null;
        Boolean enableStreamDesktopNotifications = requestParameters.queryParameter("enable_stream_desktop_notifications") != null ? requestParameters.queryParameter("enable_stream_desktop_notifications").getBoolean() : null;
        Boolean enableStreamEmailNotifications = requestParameters.queryParameter("enable_stream_email_notifications") != null ? requestParameters.queryParameter("enable_stream_email_notifications").getBoolean() : null;
        Boolean enableStreamPushNotifications = requestParameters.queryParameter("enable_stream_push_notifications") != null ? requestParameters.queryParameter("enable_stream_push_notifications").getBoolean() : null;
        Boolean enableStreamAudibleNotifications = requestParameters.queryParameter("enable_stream_audible_notifications") != null ? requestParameters.queryParameter("enable_stream_audible_notifications").getBoolean() : null;
        String notificationSound = requestParameters.queryParameter("notification_sound") != null ? requestParameters.queryParameter("notification_sound").getString() : null;
        Boolean enableDesktopNotifications = requestParameters.queryParameter("enable_desktop_notifications") != null ? requestParameters.queryParameter("enable_desktop_notifications").getBoolean() : null;
        Boolean enableSounds = requestParameters.queryParameter("enable_sounds") != null ? requestParameters.queryParameter("enable_sounds").getBoolean() : null;
        Integer emailNotificationsBatchingPeriodSeconds = requestParameters.queryParameter("email_notifications_batching_period_seconds") != null ? requestParameters.queryParameter("email_notifications_batching_period_seconds").getInteger() : null;
        Boolean enableOfflineEmailNotifications = requestParameters.queryParameter("enable_offline_email_notifications") != null ? requestParameters.queryParameter("enable_offline_email_notifications").getBoolean() : null;
        Boolean enableOfflinePushNotifications = requestParameters.queryParameter("enable_offline_push_notifications") != null ? requestParameters.queryParameter("enable_offline_push_notifications").getBoolean() : null;
        Boolean enableOnlinePushNotifications = requestParameters.queryParameter("enable_online_push_notifications") != null ? requestParameters.queryParameter("enable_online_push_notifications").getBoolean() : null;
        Boolean enableDigestEmails = requestParameters.queryParameter("enable_digest_emails") != null ? requestParameters.queryParameter("enable_digest_emails").getBoolean() : null;
        Boolean enableMarketingEmails = requestParameters.queryParameter("enable_marketing_emails") != null ? requestParameters.queryParameter("enable_marketing_emails").getBoolean() : null;
        Boolean enableLoginEmails = requestParameters.queryParameter("enable_login_emails") != null ? requestParameters.queryParameter("enable_login_emails").getBoolean() : null;
        Boolean messageContentInEmailNotifications = requestParameters.queryParameter("message_content_in_email_notifications") != null ? requestParameters.queryParameter("message_content_in_email_notifications").getBoolean() : null;
        Boolean pmContentInDesktopNotifications = requestParameters.queryParameter("pm_content_in_desktop_notifications") != null ? requestParameters.queryParameter("pm_content_in_desktop_notifications").getBoolean() : null;
        Boolean wildcardMentionsNotify = requestParameters.queryParameter("wildcard_mentions_notify") != null ? requestParameters.queryParameter("wildcard_mentions_notify").getBoolean() : null;
        Integer desktopIconCountDisplay = requestParameters.queryParameter("desktop_icon_count_display") != null ? requestParameters.queryParameter("desktop_icon_count_display").getInteger() : null;
        Boolean realmNameInNotifications = requestParameters.queryParameter("realm_name_in_notifications") != null ? requestParameters.queryParameter("realm_name_in_notifications").getBoolean() : null;
        Boolean presenceEnabled = requestParameters.queryParameter("presence_enabled") != null ? requestParameters.queryParameter("presence_enabled").getBoolean() : null;
        Boolean enterSends = requestParameters.queryParameter("enter_sends") != null ? requestParameters.queryParameter("enter_sends").getBoolean() : null;

        logger.debug("Parameter fullName is {}", fullName);
        logger.debug("Parameter email is {}", email);
        logger.debug("Parameter oldPassword is {}", oldPassword);
        logger.debug("Parameter newPassword is {}", newPassword);
        logger.debug("Parameter twentyFourHourTime is {}", twentyFourHourTime);
        logger.debug("Parameter denseMode is {}", denseMode);
        logger.debug("Parameter starredMessageCounts is {}", starredMessageCounts);
        logger.debug("Parameter fluidLayoutWidth is {}", fluidLayoutWidth);
        logger.debug("Parameter highContrastMode is {}", highContrastMode);
        logger.debug("Parameter colorScheme is {}", colorScheme);
        logger.debug("Parameter enableDraftsSynchronization is {}", enableDraftsSynchronization);
        logger.debug("Parameter translateEmoticons is {}", translateEmoticons);
        logger.debug("Parameter defaultLanguage is {}", defaultLanguage);
        logger.debug("Parameter defaultView is {}", defaultView);
        logger.debug("Parameter leftSideUserlist is {}", leftSideUserlist);
        logger.debug("Parameter emojiset is {}", emojiset);
        logger.debug("Parameter demoteInactiveStreams is {}", demoteInactiveStreams);
        logger.debug("Parameter timezone is {}", timezone);
        logger.debug("Parameter enableStreamDesktopNotifications is {}", enableStreamDesktopNotifications);
        logger.debug("Parameter enableStreamEmailNotifications is {}", enableStreamEmailNotifications);
        logger.debug("Parameter enableStreamPushNotifications is {}", enableStreamPushNotifications);
        logger.debug("Parameter enableStreamAudibleNotifications is {}", enableStreamAudibleNotifications);
        logger.debug("Parameter notificationSound is {}", notificationSound);
        logger.debug("Parameter enableDesktopNotifications is {}", enableDesktopNotifications);
        logger.debug("Parameter enableSounds is {}", enableSounds);
        logger.debug("Parameter emailNotificationsBatchingPeriodSeconds is {}", emailNotificationsBatchingPeriodSeconds);
        logger.debug("Parameter enableOfflineEmailNotifications is {}", enableOfflineEmailNotifications);
        logger.debug("Parameter enableOfflinePushNotifications is {}", enableOfflinePushNotifications);
        logger.debug("Parameter enableOnlinePushNotifications is {}", enableOnlinePushNotifications);
        logger.debug("Parameter enableDigestEmails is {}", enableDigestEmails);
        logger.debug("Parameter enableMarketingEmails is {}", enableMarketingEmails);
        logger.debug("Parameter enableLoginEmails is {}", enableLoginEmails);
        logger.debug("Parameter messageContentInEmailNotifications is {}", messageContentInEmailNotifications);
        logger.debug("Parameter pmContentInDesktopNotifications is {}", pmContentInDesktopNotifications);
        logger.debug("Parameter wildcardMentionsNotify is {}", wildcardMentionsNotify);
        logger.debug("Parameter desktopIconCountDisplay is {}", desktopIconCountDisplay);
        logger.debug("Parameter realmNameInNotifications is {}", realmNameInNotifications);
        logger.debug("Parameter presenceEnabled is {}", presenceEnabled);
        logger.debug("Parameter enterSends is {}", enterSends);

        api.updateSettings(fullName, email, oldPassword, newPassword, twentyFourHourTime, denseMode, starredMessageCounts, fluidLayoutWidth, highContrastMode, colorScheme, enableDraftsSynchronization, translateEmoticons, defaultLanguage, defaultView, leftSideUserlist, emojiset, demoteInactiveStreams, timezone, enableStreamDesktopNotifications, enableStreamEmailNotifications, enableStreamPushNotifications, enableStreamAudibleNotifications, notificationSound, enableDesktopNotifications, enableSounds, emailNotificationsBatchingPeriodSeconds, enableOfflineEmailNotifications, enableOfflinePushNotifications, enableOnlinePushNotifications, enableDigestEmails, enableMarketingEmails, enableLoginEmails, messageContentInEmailNotifications, pmContentInDesktopNotifications, wildcardMentionsNotify, desktopIconCountDisplay, realmNameInNotifications, presenceEnabled, enterSends)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void updateStatus(RoutingContext routingContext) {
        logger.info("updateStatus()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String statusText = requestParameters.queryParameter("status_text") != null ? requestParameters.queryParameter("status_text").getString() : null;
        Boolean away = requestParameters.queryParameter("away") != null ? requestParameters.queryParameter("away").getBoolean() : null;
        String emojiName = requestParameters.queryParameter("emoji_name") != null ? requestParameters.queryParameter("emoji_name").getString() : null;
        String emojiCode = requestParameters.queryParameter("emoji_code") != null ? requestParameters.queryParameter("emoji_code").getString() : null;
        String reactionType = requestParameters.queryParameter("reaction_type") != null ? requestParameters.queryParameter("reaction_type").getString() : null;

        logger.debug("Parameter statusText is {}", statusText);
        logger.debug("Parameter away is {}", away);
        logger.debug("Parameter emojiName is {}", emojiName);
        logger.debug("Parameter emojiCode is {}", emojiCode);
        logger.debug("Parameter reactionType is {}", reactionType);

        api.updateStatus(statusText, away, emojiName, emojiCode, reactionType)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void updateUser(RoutingContext routingContext) {
        logger.info("updateUser()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer userId = requestParameters.pathParameter("user_id") != null ? requestParameters.pathParameter("user_id").getInteger() : null;
        String fullName = requestParameters.queryParameter("full_name") != null ? requestParameters.queryParameter("full_name").getString() : null;
        Integer role = requestParameters.queryParameter("role") != null ? requestParameters.queryParameter("role").getInteger() : null;
        List<Object> profileData = requestParameters.queryParameter("profile_data") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("profile_data").get(), new TypeReference<List<Object>>(){}) : null;

        logger.debug("Parameter userId is {}", userId);
        logger.debug("Parameter fullName is {}", fullName);
        logger.debug("Parameter role is {}", role);
        logger.debug("Parameter profileData is {}", profileData);

        api.updateUser(userId, fullName, role, profileData)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void updateUserGroup(RoutingContext routingContext) {
        logger.info("updateUserGroup()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer userGroupId = requestParameters.pathParameter("user_group_id") != null ? requestParameters.pathParameter("user_group_id").getInteger() : null;
        String name = requestParameters.queryParameter("name") != null ? requestParameters.queryParameter("name").getString() : null;
        String description = requestParameters.queryParameter("description") != null ? requestParameters.queryParameter("description").getString() : null;

        logger.debug("Parameter userGroupId is {}", userGroupId);
        logger.debug("Parameter name is {}", name);
        logger.debug("Parameter description is {}", description);

        api.updateUserGroup(userGroupId, name, description)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void updateUserGroupMembers(RoutingContext routingContext) {
        logger.info("updateUserGroupMembers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer userGroupId = requestParameters.pathParameter("user_group_id") != null ? requestParameters.pathParameter("user_group_id").getInteger() : null;
        List<Integer> delete = requestParameters.queryParameter("delete") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("delete").get(), new TypeReference<List<Integer>>(){}) : null;
        List<Integer> add = requestParameters.queryParameter("add") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("add").get(), new TypeReference<List<Integer>>(){}) : null;

        logger.debug("Parameter userGroupId is {}", userGroupId);
        logger.debug("Parameter delete is {}", delete);
        logger.debug("Parameter add is {}", add);

        api.updateUserGroupMembers(userGroupId, delete, add)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
