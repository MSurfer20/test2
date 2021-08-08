package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CodedError
import org.openapitools.model.JsonError
import org.openapitools.model.JsonSuccess
import org.openapitools.model.JsonSuccessBase
import org.openapitools.model.OneOfobjectobject
import org.openapitools.model.OneOfobjectobjectobject
import org.openapitools.model.OneOfobjectobjectobjectobjectobjectobject

class UsersApi {
    String basePath = "https://example.zulipchat.com/api/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createUser ( String email, String password, String fullName, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (email == null) {
            throw new RuntimeException("missing required params email")
        }
        // verify required params are set
        if (password == null) {
            throw new RuntimeException("missing required params password")
        }
        // verify required params are set
        if (fullName == null) {
            throw new RuntimeException("missing required params fullName")
        }

        if (email != null) {
            queryParams.put("email", email)
        }
        if (password != null) {
            queryParams.put("password", password)
        }
        if (fullName != null) {
            queryParams.put("full_name", fullName)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    JsonSuccessBase.class )

    }

    def createUserGroup ( String name, String description, List<Integer> members, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_groups/create"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }
        // verify required params are set
        if (description == null) {
            throw new RuntimeException("missing required params description")
        }
        // verify required params are set
        if (members == null) {
            throw new RuntimeException("missing required params members")
        }

        if (name != null) {
            queryParams.put("name", name)
        }
        if (description != null) {
            queryParams.put("description", description)
        }
        if (members != null) {
            queryParams.put("members", members)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    JsonSuccess.class )

    }

    def deactivateOwnUser ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users/me"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    JsonSuccess.class )

    }

    def deactivateUser ( Integer userId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users/${user_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    JsonSuccess.class )

    }

    def getAttachments ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/attachments"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    JsonSuccessBase.class )

    }

    def getOwnUser ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users/me"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    JsonSuccessBase.class )

    }

    def getUser ( Integer userId, Boolean clientGravatar, Boolean includeCustomProfileFields, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users/${user_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }

        if (clientGravatar != null) {
            queryParams.put("client_gravatar", clientGravatar)
        }
        if (includeCustomProfileFields != null) {
            queryParams.put("include_custom_profile_fields", includeCustomProfileFields)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    JsonSuccessBase.class )

    }

    def getUserByEmail ( String email, Boolean clientGravatar, Boolean includeCustomProfileFields, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users/${email}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (email == null) {
            throw new RuntimeException("missing required params email")
        }

        if (clientGravatar != null) {
            queryParams.put("client_gravatar", clientGravatar)
        }
        if (includeCustomProfileFields != null) {
            queryParams.put("include_custom_profile_fields", includeCustomProfileFields)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    JsonSuccessBase.class )

    }

    def getUserGroups ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_groups"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    JsonSuccessBase.class )

    }

    def getUserPresence ( String userIdOrEmail, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users/${user_id_or_email}/presence"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (userIdOrEmail == null) {
            throw new RuntimeException("missing required params userIdOrEmail")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    JsonSuccessBase.class )

    }

    def getUsers ( Boolean clientGravatar, Boolean includeCustomProfileFields, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (clientGravatar != null) {
            queryParams.put("client_gravatar", clientGravatar)
        }
        if (includeCustomProfileFields != null) {
            queryParams.put("include_custom_profile_fields", includeCustomProfileFields)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    JsonSuccessBase.class )

    }

    def muteUser ( Integer mutedUserId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users/me/muted_users/${muted_user_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (mutedUserId == null) {
            throw new RuntimeException("missing required params mutedUserId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    JsonSuccess.class )

    }

    def reactivateUser ( Integer userId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users/${user_id}/reactivate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    Object.class )

    }

    def removeUserGroup ( Integer userGroupId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_groups/${user_group_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (userGroupId == null) {
            throw new RuntimeException("missing required params userGroupId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    JsonSuccess.class )

    }

    def setTypingStatus ( String op, List<Integer> to, String type, String topic, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/typing"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (op == null) {
            throw new RuntimeException("missing required params op")
        }
        // verify required params are set
        if (to == null) {
            throw new RuntimeException("missing required params to")
        }

        if (type != null) {
            queryParams.put("type", type)
        }
        if (op != null) {
            queryParams.put("op", op)
        }
        if (to != null) {
            queryParams.put("to", to)
        }
        if (topic != null) {
            queryParams.put("topic", topic)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    JsonSuccess.class )

    }

    def unmuteUser ( Integer mutedUserId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users/me/muted_users/${muted_user_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (mutedUserId == null) {
            throw new RuntimeException("missing required params mutedUserId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    JsonSuccess.class )

    }

    def updateSettings ( String fullName, String email, String oldPassword, String newPassword, Boolean twentyFourHourTime, Boolean denseMode, Boolean starredMessageCounts, Boolean fluidLayoutWidth, Boolean highContrastMode, Integer colorScheme, Boolean enableDraftsSynchronization, Boolean translateEmoticons, String defaultLanguage, String defaultView, Boolean leftSideUserlist, String emojiset, Integer demoteInactiveStreams, String timezone, Boolean enableStreamDesktopNotifications, Boolean enableStreamEmailNotifications, Boolean enableStreamPushNotifications, Boolean enableStreamAudibleNotifications, String notificationSound, Boolean enableDesktopNotifications, Boolean enableSounds, Integer emailNotificationsBatchingPeriodSeconds, Boolean enableOfflineEmailNotifications, Boolean enableOfflinePushNotifications, Boolean enableOnlinePushNotifications, Boolean enableDigestEmails, Boolean enableMarketingEmails, Boolean enableLoginEmails, Boolean messageContentInEmailNotifications, Boolean pmContentInDesktopNotifications, Boolean wildcardMentionsNotify, Integer desktopIconCountDisplay, Boolean realmNameInNotifications, Boolean presenceEnabled, Boolean enterSends, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/settings"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (fullName != null) {
            queryParams.put("full_name", fullName)
        }
        if (email != null) {
            queryParams.put("email", email)
        }
        if (oldPassword != null) {
            queryParams.put("old_password", oldPassword)
        }
        if (newPassword != null) {
            queryParams.put("new_password", newPassword)
        }
        if (twentyFourHourTime != null) {
            queryParams.put("twenty_four_hour_time", twentyFourHourTime)
        }
        if (denseMode != null) {
            queryParams.put("dense_mode", denseMode)
        }
        if (starredMessageCounts != null) {
            queryParams.put("starred_message_counts", starredMessageCounts)
        }
        if (fluidLayoutWidth != null) {
            queryParams.put("fluid_layout_width", fluidLayoutWidth)
        }
        if (highContrastMode != null) {
            queryParams.put("high_contrast_mode", highContrastMode)
        }
        if (colorScheme != null) {
            queryParams.put("color_scheme", colorScheme)
        }
        if (enableDraftsSynchronization != null) {
            queryParams.put("enable_drafts_synchronization", enableDraftsSynchronization)
        }
        if (translateEmoticons != null) {
            queryParams.put("translate_emoticons", translateEmoticons)
        }
        if (defaultLanguage != null) {
            queryParams.put("default_language", defaultLanguage)
        }
        if (defaultView != null) {
            queryParams.put("default_view", defaultView)
        }
        if (leftSideUserlist != null) {
            queryParams.put("left_side_userlist", leftSideUserlist)
        }
        if (emojiset != null) {
            queryParams.put("emojiset", emojiset)
        }
        if (demoteInactiveStreams != null) {
            queryParams.put("demote_inactive_streams", demoteInactiveStreams)
        }
        if (timezone != null) {
            queryParams.put("timezone", timezone)
        }
        if (enableStreamDesktopNotifications != null) {
            queryParams.put("enable_stream_desktop_notifications", enableStreamDesktopNotifications)
        }
        if (enableStreamEmailNotifications != null) {
            queryParams.put("enable_stream_email_notifications", enableStreamEmailNotifications)
        }
        if (enableStreamPushNotifications != null) {
            queryParams.put("enable_stream_push_notifications", enableStreamPushNotifications)
        }
        if (enableStreamAudibleNotifications != null) {
            queryParams.put("enable_stream_audible_notifications", enableStreamAudibleNotifications)
        }
        if (notificationSound != null) {
            queryParams.put("notification_sound", notificationSound)
        }
        if (enableDesktopNotifications != null) {
            queryParams.put("enable_desktop_notifications", enableDesktopNotifications)
        }
        if (enableSounds != null) {
            queryParams.put("enable_sounds", enableSounds)
        }
        if (emailNotificationsBatchingPeriodSeconds != null) {
            queryParams.put("email_notifications_batching_period_seconds", emailNotificationsBatchingPeriodSeconds)
        }
        if (enableOfflineEmailNotifications != null) {
            queryParams.put("enable_offline_email_notifications", enableOfflineEmailNotifications)
        }
        if (enableOfflinePushNotifications != null) {
            queryParams.put("enable_offline_push_notifications", enableOfflinePushNotifications)
        }
        if (enableOnlinePushNotifications != null) {
            queryParams.put("enable_online_push_notifications", enableOnlinePushNotifications)
        }
        if (enableDigestEmails != null) {
            queryParams.put("enable_digest_emails", enableDigestEmails)
        }
        if (enableMarketingEmails != null) {
            queryParams.put("enable_marketing_emails", enableMarketingEmails)
        }
        if (enableLoginEmails != null) {
            queryParams.put("enable_login_emails", enableLoginEmails)
        }
        if (messageContentInEmailNotifications != null) {
            queryParams.put("message_content_in_email_notifications", messageContentInEmailNotifications)
        }
        if (pmContentInDesktopNotifications != null) {
            queryParams.put("pm_content_in_desktop_notifications", pmContentInDesktopNotifications)
        }
        if (wildcardMentionsNotify != null) {
            queryParams.put("wildcard_mentions_notify", wildcardMentionsNotify)
        }
        if (desktopIconCountDisplay != null) {
            queryParams.put("desktop_icon_count_display", desktopIconCountDisplay)
        }
        if (realmNameInNotifications != null) {
            queryParams.put("realm_name_in_notifications", realmNameInNotifications)
        }
        if (presenceEnabled != null) {
            queryParams.put("presence_enabled", presenceEnabled)
        }
        if (enterSends != null) {
            queryParams.put("enter_sends", enterSends)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    JsonSuccessBase.class )

    }

    def updateStatus ( String statusText, Boolean away, String emojiName, String emojiCode, String reactionType, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users/me/status"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (statusText != null) {
            queryParams.put("status_text", statusText)
        }
        if (away != null) {
            queryParams.put("away", away)
        }
        if (emojiName != null) {
            queryParams.put("emoji_name", emojiName)
        }
        if (emojiCode != null) {
            queryParams.put("emoji_code", emojiCode)
        }
        if (reactionType != null) {
            queryParams.put("reaction_type", reactionType)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    JsonSuccess.class )

    }

    def updateUser ( Integer userId, String fullName, Integer role, List<Object> profileData, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users/${user_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }

        if (fullName != null) {
            queryParams.put("full_name", fullName)
        }
        if (role != null) {
            queryParams.put("role", role)
        }
        if (profileData != null) {
            queryParams.put("profile_data", profileData)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    JsonSuccess.class )

    }

    def updateUserGroup ( Integer userGroupId, String name, String description, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_groups/${user_group_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (userGroupId == null) {
            throw new RuntimeException("missing required params userGroupId")
        }
        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }
        // verify required params are set
        if (description == null) {
            throw new RuntimeException("missing required params description")
        }

        if (name != null) {
            queryParams.put("name", name)
        }
        if (description != null) {
            queryParams.put("description", description)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    JsonSuccess.class )

    }

    def updateUserGroupMembers ( Integer userGroupId, List<Integer> delete, List<Integer> add, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_groups/${user_group_id}/members"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (userGroupId == null) {
            throw new RuntimeException("missing required params userGroupId")
        }

        if (delete != null) {
            queryParams.put("delete", delete)
        }
        if (add != null) {
            queryParams.put("add", add)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    JsonSuccess.class )

    }

}
