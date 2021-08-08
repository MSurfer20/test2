/**
 * 
 * Zulip REST API
 * 
 * 
 * Powerful open source group chat 
 * 
 * Version: 1.0.0
 * 
 * Generated by OpenAPI Generator: https://openapi-generator.tech
 */

// package openapi3graphql-server

// users_api

export default {
    Query: {

        // @return JsonSuccessBase
        GetAttachments: () => {
            return {
                
            };
        },

        // @return JsonSuccessBase
        GetOwnUser: () => {
            return {
                
            };
        },

        // @return JsonSuccessBase
        GetUser: ($userId, $clientGravatar, $includeCustomProfileFields) => {
            return {
                "userId": "12",
                "clientGravatar": "true",
                "includeCustomProfileFields": "true"
            };
        },

        // @return JsonSuccessBase
        GetUserByEmail: ($email, $clientGravatar, $includeCustomProfileFields) => {
            return {
                "email": "iago@zulip.com",
                "clientGravatar": "true",
                "includeCustomProfileFields": "true"
            };
        },

        // @return JsonSuccessBase
        GetUserGroups: () => {
            return {
                
            };
        },

        // @return JsonSuccessBase
        GetUserPresence: ($userIdOrEmail) => {
            return {
                "userIdOrEmail": "iago@zulip.com"
            };
        },

        // @return JsonSuccessBase
        GetUsers: ($clientGravatar, $includeCustomProfileFields) => {
            return {
                "clientGravatar": "true",
                "includeCustomProfileFields": "true"
            };
        },

    },

    Mutation: {

        // @return JsonSuccessBase
        CreateUser: ($email, $password, $fullName) => {
            return {
                "email": "username@example.com",
                "password": "abcd1234",
                "fullName": "New User"
            };
        },

        // @return JsonSuccess
        CreateUserGroup: ($name, $description, $members) => {
            return {
                "name": "marketing",
                "description": "The marketing team.",
                "members": ""
            };
        },

        // @return JsonSuccess
        DeactivateOwnUser: () => {
            return {
                
            };
        },

        // @return JsonSuccess
        DeactivateUser: ($userId) => {
            return {
                "userId": "12"
            };
        },

        // @return JsonSuccess
        MuteUser: ($mutedUserId) => {
            return {
                "mutedUserId": "10"
            };
        },

        // @return AnyType
        ReactivateUser: ($userId) => {
            return {
                "userId": "12"
            };
        },

        // @return JsonSuccess
        RemoveUserGroup: ($userGroupId) => {
            return {
                "userGroupId": "1"
            };
        },

        // @return JsonSuccess
        SetTypingStatus: ($op, $to, $Type_, $topic) => {
            return {
                "op": "start",
                "to": "",
                "Type_": "private",
                "topic": "typing notifications"
            };
        },

        // @return JsonSuccess
        UnmuteUser: ($mutedUserId) => {
            return {
                "mutedUserId": "10"
            };
        },

        // @return JsonSuccessBase
        UpdateDisplaySettings: ($twentyFourHourTime, $denseMode, $starredMessageCounts, $fluidLayoutWidth, $highContrastMode, $colorScheme, $translateEmoticons, $defaultLanguage, $defaultView, $leftSideUserlist, $emojiset, $demoteInactiveStreams, $timezone) => {
            return {
                "twentyFourHourTime": "true",
                "denseMode": "true",
                "starredMessageCounts": "true",
                "fluidLayoutWidth": "true",
                "highContrastMode": "true",
                "colorScheme": "56",
                "translateEmoticons": "true",
                "defaultLanguage": "en",
                "defaultView": "all_messages",
                "leftSideUserlist": "true",
                "emojiset": "google",
                "demoteInactiveStreams": "56",
                "timezone": "Asia/Kolkata"
            };
        },

        // @return JsonSuccessBase
        UpdateNotificationSettings: ($enableStreamDesktopNotifications, $enableStreamEmailNotifications, $enableStreamPushNotifications, $enableStreamAudibleNotifications, $notificationSound, $enableDesktopNotifications, $enableSounds, $enableOfflineEmailNotifications, $enableOfflinePushNotifications, $enableOnlinePushNotifications, $enableDigestEmails, $enableMarketingEmails, $enableLoginEmails, $messageContentInEmailNotifications, $pmContentInDesktopNotifications, $wildcardMentionsNotify, $desktopIconCountDisplay, $realmNameInNotifications, $presenceEnabled) => {
            return {
                "enableStreamDesktopNotifications": "true",
                "enableStreamEmailNotifications": "true",
                "enableStreamPushNotifications": "true",
                "enableStreamAudibleNotifications": "true",
                "notificationSound": "ding",
                "enableDesktopNotifications": "true",
                "enableSounds": "true",
                "enableOfflineEmailNotifications": "true",
                "enableOfflinePushNotifications": "true",
                "enableOnlinePushNotifications": "true",
                "enableDigestEmails": "true",
                "enableMarketingEmails": "true",
                "enableLoginEmails": "true",
                "messageContentInEmailNotifications": "true",
                "pmContentInDesktopNotifications": "true",
                "wildcardMentionsNotify": "true",
                "desktopIconCountDisplay": "56",
                "realmNameInNotifications": "true",
                "presenceEnabled": "true"
            };
        },

        // @return JsonSuccess
        UpdateUser: ($userId, $fullName, $role, $profileData) => {
            return {
                "userId": "12",
                "fullName": "fullName_example",
                "role": "400",
                "profileData": ""
            };
        },

        // @return JsonSuccess
        UpdateUserGroup: ($userGroupId, $name, $description) => {
            return {
                "userGroupId": "1",
                "name": "marketing team",
                "description": "The marketing team."
            };
        },

        // @return JsonSuccess
        UpdateUserGroupMembers: ($userGroupId, $delete, $add) => {
            return {
                "userGroupId": "1",
                "delete": "",
                "add": ""
            };
        },

    }
}