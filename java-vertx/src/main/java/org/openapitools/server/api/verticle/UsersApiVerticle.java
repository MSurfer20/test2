package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.CodedError;
import org.openapitools.server.api.model.JsonError;
import org.openapitools.server.api.model.JsonSuccess;
import org.openapitools.server.api.model.JsonSuccessBase;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OneOfobjectobject;
import org.openapitools.server.api.model.OneOfobjectobjectobject;
import org.openapitools.server.api.model.OneOfobjectobjectobjectobjectobjectobject;

import java.util.List;
import java.util.Map;

public class UsersApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(UsersApiVerticle.class);
    
    static final String CREATE-USER_SERVICE_ID = "create-user";
    static final String CREATE-USER-GROUP_SERVICE_ID = "create-user-group";
    static final String DEACTIVATE-OWN-USER_SERVICE_ID = "deactivate-own-user";
    static final String DEACTIVATE-USER_SERVICE_ID = "deactivate-user";
    static final String GET-ATTACHMENTS_SERVICE_ID = "get-attachments";
    static final String GET-OWN-USER_SERVICE_ID = "get-own-user";
    static final String GET-USER_SERVICE_ID = "get-user";
    static final String GET-USER-BY-EMAIL_SERVICE_ID = "get-user-by-email";
    static final String GET-USER-GROUPS_SERVICE_ID = "get-user-groups";
    static final String GET-USER-PRESENCE_SERVICE_ID = "get-user-presence";
    static final String GET-USERS_SERVICE_ID = "get-users";
    static final String MUTE-USER_SERVICE_ID = "mute-user";
    static final String REACTIVATE-USER_SERVICE_ID = "reactivate-user";
    static final String REMOVE-USER-GROUP_SERVICE_ID = "remove-user-group";
    static final String SET-TYPING-STATUS_SERVICE_ID = "set-typing-status";
    static final String UNMUTE-USER_SERVICE_ID = "unmute-user";
    static final String UPDATE-SETTINGS_SERVICE_ID = "update-settings";
    static final String UPDATE-STATUS_SERVICE_ID = "update-status";
    static final String UPDATE-USER_SERVICE_ID = "update-user";
    static final String UPDATE-USER-GROUP_SERVICE_ID = "update-user-group";
    static final String UPDATE-USER-GROUP-MEMBERS_SERVICE_ID = "update-user-group-members";
    
    final UsersApi service;

    public UsersApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.UsersApiImpl");
            service = (UsersApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("UsersApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for create-user
        vertx.eventBus().<JsonObject> consumer(CREATE-USER_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "create-user";
                String emailParam = message.body().getString("email");
                if(emailParam == null) {
                    manageError(message, new MainApiException(400, "email is required"), serviceId);
                    return;
                }
                String email = emailParam;
                String passwordParam = message.body().getString("password");
                if(passwordParam == null) {
                    manageError(message, new MainApiException(400, "password is required"), serviceId);
                    return;
                }
                String password = passwordParam;
                String fullNameParam = message.body().getString("full_name");
                if(fullNameParam == null) {
                    manageError(message, new MainApiException(400, "full_name is required"), serviceId);
                    return;
                }
                String fullName = fullNameParam;
                service.createUser(email, password, fullName, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "create-user");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("create-user", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for create-user-group
        vertx.eventBus().<JsonObject> consumer(CREATE-USER-GROUP_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "create-user-group";
                String nameParam = message.body().getString("name");
                if(nameParam == null) {
                    manageError(message, new MainApiException(400, "name is required"), serviceId);
                    return;
                }
                String name = nameParam;
                String descriptionParam = message.body().getString("description");
                if(descriptionParam == null) {
                    manageError(message, new MainApiException(400, "description is required"), serviceId);
                    return;
                }
                String description = descriptionParam;
                JsonArray membersParam = message.body().getJsonArray("members");
                if(membersParam == null) {
                    manageError(message, new MainApiException(400, "members is required"), serviceId);
                    return;
                }
                List<Integer> members = Json.mapper.readValue(membersParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Integer.class));
                service.createUserGroup(name, description, members, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "create-user-group");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("create-user-group", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for deactivate-own-user
        vertx.eventBus().<JsonObject> consumer(DEACTIVATE-OWN-USER_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deactivate-own-user";
                service.deactivateOwnUser(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deactivate-own-user");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deactivate-own-user", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for deactivate-user
        vertx.eventBus().<JsonObject> consumer(DEACTIVATE-USER_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deactivate-user";
                String userIdParam = message.body().getString("user_id");
                if(userIdParam == null) {
                    manageError(message, new MainApiException(400, "user_id is required"), serviceId);
                    return;
                }
                Integer userId = Json.mapper.readValue(userIdParam, Integer.class);
                service.deactivateUser(userId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deactivate-user");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deactivate-user", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-attachments
        vertx.eventBus().<JsonObject> consumer(GET-ATTACHMENTS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-attachments";
                service.getAttachments(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-attachments");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-attachments", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-own-user
        vertx.eventBus().<JsonObject> consumer(GET-OWN-USER_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-own-user";
                service.getOwnUser(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-own-user");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-own-user", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-user
        vertx.eventBus().<JsonObject> consumer(GET-USER_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-user";
                String userIdParam = message.body().getString("user_id");
                if(userIdParam == null) {
                    manageError(message, new MainApiException(400, "user_id is required"), serviceId);
                    return;
                }
                Integer userId = Json.mapper.readValue(userIdParam, Integer.class);
                String clientGravatarParam = message.body().getString("client_gravatar");
                Boolean clientGravatar = (clientGravatarParam == null) ? false : Json.mapper.readValue(clientGravatarParam, Boolean.class);
                String includeCustomProfileFieldsParam = message.body().getString("include_custom_profile_fields");
                Boolean includeCustomProfileFields = (includeCustomProfileFieldsParam == null) ? false : Json.mapper.readValue(includeCustomProfileFieldsParam, Boolean.class);
                service.getUser(userId, clientGravatar, includeCustomProfileFields, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-user");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-user", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-user-by-email
        vertx.eventBus().<JsonObject> consumer(GET-USER-BY-EMAIL_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-user-by-email";
                String emailParam = message.body().getString("email");
                if(emailParam == null) {
                    manageError(message, new MainApiException(400, "email is required"), serviceId);
                    return;
                }
                String email = emailParam;
                String clientGravatarParam = message.body().getString("client_gravatar");
                Boolean clientGravatar = (clientGravatarParam == null) ? false : Json.mapper.readValue(clientGravatarParam, Boolean.class);
                String includeCustomProfileFieldsParam = message.body().getString("include_custom_profile_fields");
                Boolean includeCustomProfileFields = (includeCustomProfileFieldsParam == null) ? false : Json.mapper.readValue(includeCustomProfileFieldsParam, Boolean.class);
                service.getUserByEmail(email, clientGravatar, includeCustomProfileFields, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-user-by-email");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-user-by-email", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-user-groups
        vertx.eventBus().<JsonObject> consumer(GET-USER-GROUPS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-user-groups";
                service.getUserGroups(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-user-groups");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-user-groups", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-user-presence
        vertx.eventBus().<JsonObject> consumer(GET-USER-PRESENCE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-user-presence";
                String userIdOrEmailParam = message.body().getString("user_id_or_email");
                if(userIdOrEmailParam == null) {
                    manageError(message, new MainApiException(400, "user_id_or_email is required"), serviceId);
                    return;
                }
                String userIdOrEmail = userIdOrEmailParam;
                service.getUserPresence(userIdOrEmail, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-user-presence");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-user-presence", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-users
        vertx.eventBus().<JsonObject> consumer(GET-USERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-users";
                String clientGravatarParam = message.body().getString("client_gravatar");
                Boolean clientGravatar = (clientGravatarParam == null) ? false : Json.mapper.readValue(clientGravatarParam, Boolean.class);
                String includeCustomProfileFieldsParam = message.body().getString("include_custom_profile_fields");
                Boolean includeCustomProfileFields = (includeCustomProfileFieldsParam == null) ? false : Json.mapper.readValue(includeCustomProfileFieldsParam, Boolean.class);
                service.getUsers(clientGravatar, includeCustomProfileFields, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-users");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-users", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for mute-user
        vertx.eventBus().<JsonObject> consumer(MUTE-USER_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "mute-user";
                String mutedUserIdParam = message.body().getString("muted_user_id");
                if(mutedUserIdParam == null) {
                    manageError(message, new MainApiException(400, "muted_user_id is required"), serviceId);
                    return;
                }
                Integer mutedUserId = Json.mapper.readValue(mutedUserIdParam, Integer.class);
                service.muteUser(mutedUserId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "mute-user");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("mute-user", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for reactivate-user
        vertx.eventBus().<JsonObject> consumer(REACTIVATE-USER_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "reactivate-user";
                String userIdParam = message.body().getString("user_id");
                if(userIdParam == null) {
                    manageError(message, new MainApiException(400, "user_id is required"), serviceId);
                    return;
                }
                Integer userId = Json.mapper.readValue(userIdParam, Integer.class);
                service.reactivateUser(userId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "reactivate-user");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("reactivate-user", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for remove-user-group
        vertx.eventBus().<JsonObject> consumer(REMOVE-USER-GROUP_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "remove-user-group";
                String userGroupIdParam = message.body().getString("user_group_id");
                if(userGroupIdParam == null) {
                    manageError(message, new MainApiException(400, "user_group_id is required"), serviceId);
                    return;
                }
                Integer userGroupId = Json.mapper.readValue(userGroupIdParam, Integer.class);
                service.removeUserGroup(userGroupId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "remove-user-group");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("remove-user-group", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for set-typing-status
        vertx.eventBus().<JsonObject> consumer(SET-TYPING-STATUS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "set-typing-status";
                String opParam = message.body().getString("op");
                if(opParam == null) {
                    manageError(message, new MainApiException(400, "op is required"), serviceId);
                    return;
                }
                String op = opParam;
                JsonArray toParam = message.body().getJsonArray("to");
                if(toParam == null) {
                    manageError(message, new MainApiException(400, "to is required"), serviceId);
                    return;
                }
                List<Integer> to = Json.mapper.readValue(toParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Integer.class));
                String typeParam = message.body().getString("type");
                String type = (typeParam == null) ? "private" : typeParam;
                String topicParam = message.body().getString("topic");
                String topic = (topicParam == null) ? null : topicParam;
                service.setTypingStatus(op, to, type, topic, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "set-typing-status");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("set-typing-status", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for unmute-user
        vertx.eventBus().<JsonObject> consumer(UNMUTE-USER_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "unmute-user";
                String mutedUserIdParam = message.body().getString("muted_user_id");
                if(mutedUserIdParam == null) {
                    manageError(message, new MainApiException(400, "muted_user_id is required"), serviceId);
                    return;
                }
                Integer mutedUserId = Json.mapper.readValue(mutedUserIdParam, Integer.class);
                service.unmuteUser(mutedUserId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "unmute-user");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("unmute-user", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for update-settings
        vertx.eventBus().<JsonObject> consumer(UPDATE-SETTINGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "update-settings";
                String fullNameParam = message.body().getString("full_name");
                String fullName = (fullNameParam == null) ? null : fullNameParam;
                String emailParam = message.body().getString("email");
                String email = (emailParam == null) ? null : emailParam;
                String oldPasswordParam = message.body().getString("old_password");
                String oldPassword = (oldPasswordParam == null) ? null : oldPasswordParam;
                String newPasswordParam = message.body().getString("new_password");
                String newPassword = (newPasswordParam == null) ? null : newPasswordParam;
                String twentyFourHourTimeParam = message.body().getString("twenty_four_hour_time");
                Boolean twentyFourHourTime = (twentyFourHourTimeParam == null) ? null : Json.mapper.readValue(twentyFourHourTimeParam, Boolean.class);
                String denseModeParam = message.body().getString("dense_mode");
                Boolean denseMode = (denseModeParam == null) ? null : Json.mapper.readValue(denseModeParam, Boolean.class);
                String starredMessageCountsParam = message.body().getString("starred_message_counts");
                Boolean starredMessageCounts = (starredMessageCountsParam == null) ? null : Json.mapper.readValue(starredMessageCountsParam, Boolean.class);
                String fluidLayoutWidthParam = message.body().getString("fluid_layout_width");
                Boolean fluidLayoutWidth = (fluidLayoutWidthParam == null) ? null : Json.mapper.readValue(fluidLayoutWidthParam, Boolean.class);
                String highContrastModeParam = message.body().getString("high_contrast_mode");
                Boolean highContrastMode = (highContrastModeParam == null) ? null : Json.mapper.readValue(highContrastModeParam, Boolean.class);
                String colorSchemeParam = message.body().getString("color_scheme");
                Integer colorScheme = (colorSchemeParam == null) ? null : Json.mapper.readValue(colorSchemeParam, Integer.class);
                String enableDraftsSynchronizationParam = message.body().getString("enable_drafts_synchronization");
                Boolean enableDraftsSynchronization = (enableDraftsSynchronizationParam == null) ? null : Json.mapper.readValue(enableDraftsSynchronizationParam, Boolean.class);
                String translateEmoticonsParam = message.body().getString("translate_emoticons");
                Boolean translateEmoticons = (translateEmoticonsParam == null) ? null : Json.mapper.readValue(translateEmoticonsParam, Boolean.class);
                String defaultLanguageParam = message.body().getString("default_language");
                String defaultLanguage = (defaultLanguageParam == null) ? null : defaultLanguageParam;
                String defaultViewParam = message.body().getString("default_view");
                String defaultView = (defaultViewParam == null) ? null : defaultViewParam;
                String leftSideUserlistParam = message.body().getString("left_side_userlist");
                Boolean leftSideUserlist = (leftSideUserlistParam == null) ? null : Json.mapper.readValue(leftSideUserlistParam, Boolean.class);
                String emojisetParam = message.body().getString("emojiset");
                String emojiset = (emojisetParam == null) ? null : emojisetParam;
                String demoteInactiveStreamsParam = message.body().getString("demote_inactive_streams");
                Integer demoteInactiveStreams = (demoteInactiveStreamsParam == null) ? null : Json.mapper.readValue(demoteInactiveStreamsParam, Integer.class);
                String timezoneParam = message.body().getString("timezone");
                String timezone = (timezoneParam == null) ? null : timezoneParam;
                String enableStreamDesktopNotificationsParam = message.body().getString("enable_stream_desktop_notifications");
                Boolean enableStreamDesktopNotifications = (enableStreamDesktopNotificationsParam == null) ? null : Json.mapper.readValue(enableStreamDesktopNotificationsParam, Boolean.class);
                String enableStreamEmailNotificationsParam = message.body().getString("enable_stream_email_notifications");
                Boolean enableStreamEmailNotifications = (enableStreamEmailNotificationsParam == null) ? null : Json.mapper.readValue(enableStreamEmailNotificationsParam, Boolean.class);
                String enableStreamPushNotificationsParam = message.body().getString("enable_stream_push_notifications");
                Boolean enableStreamPushNotifications = (enableStreamPushNotificationsParam == null) ? null : Json.mapper.readValue(enableStreamPushNotificationsParam, Boolean.class);
                String enableStreamAudibleNotificationsParam = message.body().getString("enable_stream_audible_notifications");
                Boolean enableStreamAudibleNotifications = (enableStreamAudibleNotificationsParam == null) ? null : Json.mapper.readValue(enableStreamAudibleNotificationsParam, Boolean.class);
                String notificationSoundParam = message.body().getString("notification_sound");
                String notificationSound = (notificationSoundParam == null) ? null : notificationSoundParam;
                String enableDesktopNotificationsParam = message.body().getString("enable_desktop_notifications");
                Boolean enableDesktopNotifications = (enableDesktopNotificationsParam == null) ? null : Json.mapper.readValue(enableDesktopNotificationsParam, Boolean.class);
                String enableSoundsParam = message.body().getString("enable_sounds");
                Boolean enableSounds = (enableSoundsParam == null) ? null : Json.mapper.readValue(enableSoundsParam, Boolean.class);
                String emailNotificationsBatchingPeriodSecondsParam = message.body().getString("email_notifications_batching_period_seconds");
                Integer emailNotificationsBatchingPeriodSeconds = (emailNotificationsBatchingPeriodSecondsParam == null) ? null : Json.mapper.readValue(emailNotificationsBatchingPeriodSecondsParam, Integer.class);
                String enableOfflineEmailNotificationsParam = message.body().getString("enable_offline_email_notifications");
                Boolean enableOfflineEmailNotifications = (enableOfflineEmailNotificationsParam == null) ? null : Json.mapper.readValue(enableOfflineEmailNotificationsParam, Boolean.class);
                String enableOfflinePushNotificationsParam = message.body().getString("enable_offline_push_notifications");
                Boolean enableOfflinePushNotifications = (enableOfflinePushNotificationsParam == null) ? null : Json.mapper.readValue(enableOfflinePushNotificationsParam, Boolean.class);
                String enableOnlinePushNotificationsParam = message.body().getString("enable_online_push_notifications");
                Boolean enableOnlinePushNotifications = (enableOnlinePushNotificationsParam == null) ? null : Json.mapper.readValue(enableOnlinePushNotificationsParam, Boolean.class);
                String enableDigestEmailsParam = message.body().getString("enable_digest_emails");
                Boolean enableDigestEmails = (enableDigestEmailsParam == null) ? null : Json.mapper.readValue(enableDigestEmailsParam, Boolean.class);
                String enableMarketingEmailsParam = message.body().getString("enable_marketing_emails");
                Boolean enableMarketingEmails = (enableMarketingEmailsParam == null) ? null : Json.mapper.readValue(enableMarketingEmailsParam, Boolean.class);
                String enableLoginEmailsParam = message.body().getString("enable_login_emails");
                Boolean enableLoginEmails = (enableLoginEmailsParam == null) ? null : Json.mapper.readValue(enableLoginEmailsParam, Boolean.class);
                String messageContentInEmailNotificationsParam = message.body().getString("message_content_in_email_notifications");
                Boolean messageContentInEmailNotifications = (messageContentInEmailNotificationsParam == null) ? null : Json.mapper.readValue(messageContentInEmailNotificationsParam, Boolean.class);
                String pmContentInDesktopNotificationsParam = message.body().getString("pm_content_in_desktop_notifications");
                Boolean pmContentInDesktopNotifications = (pmContentInDesktopNotificationsParam == null) ? null : Json.mapper.readValue(pmContentInDesktopNotificationsParam, Boolean.class);
                String wildcardMentionsNotifyParam = message.body().getString("wildcard_mentions_notify");
                Boolean wildcardMentionsNotify = (wildcardMentionsNotifyParam == null) ? null : Json.mapper.readValue(wildcardMentionsNotifyParam, Boolean.class);
                String desktopIconCountDisplayParam = message.body().getString("desktop_icon_count_display");
                Integer desktopIconCountDisplay = (desktopIconCountDisplayParam == null) ? null : Json.mapper.readValue(desktopIconCountDisplayParam, Integer.class);
                String realmNameInNotificationsParam = message.body().getString("realm_name_in_notifications");
                Boolean realmNameInNotifications = (realmNameInNotificationsParam == null) ? null : Json.mapper.readValue(realmNameInNotificationsParam, Boolean.class);
                String presenceEnabledParam = message.body().getString("presence_enabled");
                Boolean presenceEnabled = (presenceEnabledParam == null) ? null : Json.mapper.readValue(presenceEnabledParam, Boolean.class);
                String enterSendsParam = message.body().getString("enter_sends");
                Boolean enterSends = (enterSendsParam == null) ? null : Json.mapper.readValue(enterSendsParam, Boolean.class);
                service.updateSettings(fullName, email, oldPassword, newPassword, twentyFourHourTime, denseMode, starredMessageCounts, fluidLayoutWidth, highContrastMode, colorScheme, enableDraftsSynchronization, translateEmoticons, defaultLanguage, defaultView, leftSideUserlist, emojiset, demoteInactiveStreams, timezone, enableStreamDesktopNotifications, enableStreamEmailNotifications, enableStreamPushNotifications, enableStreamAudibleNotifications, notificationSound, enableDesktopNotifications, enableSounds, emailNotificationsBatchingPeriodSeconds, enableOfflineEmailNotifications, enableOfflinePushNotifications, enableOnlinePushNotifications, enableDigestEmails, enableMarketingEmails, enableLoginEmails, messageContentInEmailNotifications, pmContentInDesktopNotifications, wildcardMentionsNotify, desktopIconCountDisplay, realmNameInNotifications, presenceEnabled, enterSends, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "update-settings");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("update-settings", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for update-status
        vertx.eventBus().<JsonObject> consumer(UPDATE-STATUS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "update-status";
                String statusTextParam = message.body().getString("status_text");
                String statusText = (statusTextParam == null) ? null : statusTextParam;
                String awayParam = message.body().getString("away");
                Boolean away = (awayParam == null) ? null : Json.mapper.readValue(awayParam, Boolean.class);
                String emojiNameParam = message.body().getString("emoji_name");
                String emojiName = (emojiNameParam == null) ? null : emojiNameParam;
                String emojiCodeParam = message.body().getString("emoji_code");
                String emojiCode = (emojiCodeParam == null) ? null : emojiCodeParam;
                String reactionTypeParam = message.body().getString("reaction_type");
                String reactionType = (reactionTypeParam == null) ? null : reactionTypeParam;
                service.updateStatus(statusText, away, emojiName, emojiCode, reactionType, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "update-status");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("update-status", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for update-user
        vertx.eventBus().<JsonObject> consumer(UPDATE-USER_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "update-user";
                String userIdParam = message.body().getString("user_id");
                if(userIdParam == null) {
                    manageError(message, new MainApiException(400, "user_id is required"), serviceId);
                    return;
                }
                Integer userId = Json.mapper.readValue(userIdParam, Integer.class);
                String fullNameParam = message.body().getString("full_name");
                String fullName = (fullNameParam == null) ? null : fullNameParam;
                String roleParam = message.body().getString("role");
                Integer role = (roleParam == null) ? null : Json.mapper.readValue(roleParam, Integer.class);
                JsonArray profileDataParam = message.body().getJsonArray("profile_data");
                List<Object> profileData = (profileDataParam == null) ? null : Json.mapper.readValue(profileDataParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Object.class));
                service.updateUser(userId, fullName, role, profileData, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "update-user");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("update-user", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for update-user-group
        vertx.eventBus().<JsonObject> consumer(UPDATE-USER-GROUP_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "update-user-group";
                String userGroupIdParam = message.body().getString("user_group_id");
                if(userGroupIdParam == null) {
                    manageError(message, new MainApiException(400, "user_group_id is required"), serviceId);
                    return;
                }
                Integer userGroupId = Json.mapper.readValue(userGroupIdParam, Integer.class);
                String nameParam = message.body().getString("name");
                if(nameParam == null) {
                    manageError(message, new MainApiException(400, "name is required"), serviceId);
                    return;
                }
                String name = nameParam;
                String descriptionParam = message.body().getString("description");
                if(descriptionParam == null) {
                    manageError(message, new MainApiException(400, "description is required"), serviceId);
                    return;
                }
                String description = descriptionParam;
                service.updateUserGroup(userGroupId, name, description, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "update-user-group");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("update-user-group", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for update-user-group-members
        vertx.eventBus().<JsonObject> consumer(UPDATE-USER-GROUP-MEMBERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "update-user-group-members";
                String userGroupIdParam = message.body().getString("user_group_id");
                if(userGroupIdParam == null) {
                    manageError(message, new MainApiException(400, "user_group_id is required"), serviceId);
                    return;
                }
                Integer userGroupId = Json.mapper.readValue(userGroupIdParam, Integer.class);
                JsonArray deleteParam = message.body().getJsonArray("delete");
                List<Integer> delete = (deleteParam == null) ? null : Json.mapper.readValue(deleteParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Integer.class));
                JsonArray addParam = message.body().getJsonArray("add");
                List<Integer> add = (addParam == null) ? null : Json.mapper.readValue(addParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Integer.class));
                service.updateUserGroupMembers(userGroupId, delete, add, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "update-user-group-members");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("update-user-group-members", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }
    
    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause); 
        }
            
        message.fail(code, statusMessage);
    }
    
    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
