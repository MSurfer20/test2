<?php

/**
 * Zulip REST API
 * Powerful open source group chat
 * PHP version 7.2.5
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 * Source files are located at:
 *
 * > https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator/src/main/resources/php-laravel/
 */


namespace App\Http\Controllers;

use Illuminate\Support\Facades\Request;

class UsersController extends Controller
{
    /**
     * Constructor
     */
    public function __construct()
    {
    }

    /**
     * Operation getAttachments
     *
     * Get attachments.
     *
     *
     * @return Http response
     */
    public function getAttachments()
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getAttachments as a get method ?');
    }
    /**
     * Operation updateSettings
     *
     * Update settings.
     *
     *
     * @return Http response
     */
    public function updateSettings()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        $fullName = $input['fullName'];

        $email = $input['email'];

        $oldPassword = $input['oldPassword'];

        $newPassword = $input['newPassword'];

        $twentyFourHourTime = $input['twentyFourHourTime'];

        $denseMode = $input['denseMode'];

        $starredMessageCounts = $input['starredMessageCounts'];

        $fluidLayoutWidth = $input['fluidLayoutWidth'];

        $highContrastMode = $input['highContrastMode'];

        $colorScheme = $input['colorScheme'];

        $enableDraftsSynchronization = $input['enableDraftsSynchronization'];

        $translateEmoticons = $input['translateEmoticons'];

        $defaultLanguage = $input['defaultLanguage'];

        $defaultView = $input['defaultView'];

        $leftSideUserlist = $input['leftSideUserlist'];

        $emojiset = $input['emojiset'];

        $demoteInactiveStreams = $input['demoteInactiveStreams'];

        $timezone = $input['timezone'];

        $enableStreamDesktopNotifications = $input['enableStreamDesktopNotifications'];

        $enableStreamEmailNotifications = $input['enableStreamEmailNotifications'];

        $enableStreamPushNotifications = $input['enableStreamPushNotifications'];

        $enableStreamAudibleNotifications = $input['enableStreamAudibleNotifications'];

        $notificationSound = $input['notificationSound'];

        $enableDesktopNotifications = $input['enableDesktopNotifications'];

        $enableSounds = $input['enableSounds'];

        $emailNotificationsBatchingPeriodSeconds = $input['emailNotificationsBatchingPeriodSeconds'];

        $enableOfflineEmailNotifications = $input['enableOfflineEmailNotifications'];

        $enableOfflinePushNotifications = $input['enableOfflinePushNotifications'];

        $enableOnlinePushNotifications = $input['enableOnlinePushNotifications'];

        $enableDigestEmails = $input['enableDigestEmails'];

        $enableMarketingEmails = $input['enableMarketingEmails'];

        $enableLoginEmails = $input['enableLoginEmails'];

        $messageContentInEmailNotifications = $input['messageContentInEmailNotifications'];

        $pmContentInDesktopNotifications = $input['pmContentInDesktopNotifications'];

        $wildcardMentionsNotify = $input['wildcardMentionsNotify'];

        $desktopIconCountDisplay = $input['desktopIconCountDisplay'];

        $realmNameInNotifications = $input['realmNameInNotifications'];

        $presenceEnabled = $input['presenceEnabled'];

        $enterSends = $input['enterSends'];


        return response('How about implementing updateSettings as a patch method ?');
    }
    /**
     * Operation setTypingStatus
     *
     * Set \"typing\" status.
     *
     *
     * @return Http response
     */
    public function setTypingStatus()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['op'])) {
            throw new \InvalidArgumentException('Missing the required parameter $op when calling setTypingStatus');
        }
        $op = $input['op'];

        if (!isset($input['to'])) {
            throw new \InvalidArgumentException('Missing the required parameter $to when calling setTypingStatus');
        }
        $to = $input['to'];

        $type = $input['type'];

        $topic = $input['topic'];


        return response('How about implementing setTypingStatus as a post method ?');
    }
    /**
     * Operation getUserGroups
     *
     * Get user groups.
     *
     *
     * @return Http response
     */
    public function getUserGroups()
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getUserGroups as a get method ?');
    }
    /**
     * Operation createUserGroup
     *
     * Create a user group.
     *
     *
     * @return Http response
     */
    public function createUserGroup()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['name'])) {
            throw new \InvalidArgumentException('Missing the required parameter $name when calling createUserGroup');
        }
        $name = $input['name'];

        if (!isset($input['description'])) {
            throw new \InvalidArgumentException('Missing the required parameter $description when calling createUserGroup');
        }
        $description = $input['description'];

        if (!isset($input['members'])) {
            throw new \InvalidArgumentException('Missing the required parameter $members when calling createUserGroup');
        }
        $members = $input['members'];


        return response('How about implementing createUserGroup as a post method ?');
    }
    /**
     * Operation removeUserGroup
     *
     * Delete a user group.
     *
     * @param int $userGroupId The ID of the target user group. (required)
     *
     * @return Http response
     */
    public function removeUserGroup($userGroupId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing removeUserGroup as a delete method ?');
    }
    /**
     * Operation updateUserGroup
     *
     * Update a user group.
     *
     * @param int $userGroupId The ID of the target user group. (required)
     *
     * @return Http response
     */
    public function updateUserGroup($userGroupId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing updateUserGroup as a patch method ?');
    }
    /**
     * Operation updateUserGroupMembers
     *
     * Update user group members.
     *
     * @param int $userGroupId The ID of the target user group. (required)
     *
     * @return Http response
     */
    public function updateUserGroupMembers($userGroupId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing updateUserGroupMembers as a post method ?');
    }
    /**
     * Operation createUser
     *
     * Create a user.
     *
     *
     * @return Http response
     */
    public function createUser()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['email'])) {
            throw new \InvalidArgumentException('Missing the required parameter $email when calling createUser');
        }
        $email = $input['email'];

        if (!isset($input['password'])) {
            throw new \InvalidArgumentException('Missing the required parameter $password when calling createUser');
        }
        $password = $input['password'];

        if (!isset($input['fullName'])) {
            throw new \InvalidArgumentException('Missing the required parameter $fullName when calling createUser');
        }
        $fullName = $input['fullName'];


        return response('How about implementing createUser as a post method ?');
    }
    /**
     * Operation getUsers
     *
     * Get all users.
     *
     *
     * @return Http response
     */
    public function getUsers()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        $clientGravatar = $input['clientGravatar'];

        $includeCustomProfileFields = $input['includeCustomProfileFields'];


        return response('How about implementing getUsers as a get method ?');
    }
    /**
     * Operation deactivateOwnUser
     *
     * Deactivate own user.
     *
     *
     * @return Http response
     */
    public function deactivateOwnUser()
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing deactivateOwnUser as a delete method ?');
    }
    /**
     * Operation getOwnUser
     *
     * Get own user.
     *
     *
     * @return Http response
     */
    public function getOwnUser()
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getOwnUser as a get method ?');
    }
    /**
     * Operation muteUser
     *
     * Mute a user.
     *
     * @param int $mutedUserId The ID of the user to mute/un-mute. (required)
     *
     * @return Http response
     */
    public function muteUser($mutedUserId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing muteUser as a post method ?');
    }
    /**
     * Operation unmuteUser
     *
     * Unmute a user.
     *
     * @param int $mutedUserId The ID of the user to mute/un-mute. (required)
     *
     * @return Http response
     */
    public function unmuteUser($mutedUserId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing unmuteUser as a delete method ?');
    }
    /**
     * Operation updateStatus
     *
     * Update your status.
     *
     *
     * @return Http response
     */
    public function updateStatus()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        $statusText = $input['statusText'];

        $away = $input['away'];

        $emojiName = $input['emojiName'];

        $emojiCode = $input['emojiCode'];

        $reactionType = $input['reactionType'];


        return response('How about implementing updateStatus as a post method ?');
    }
    /**
     * Operation getUserByEmail
     *
     * Get a user by email.
     *
     * @param string $email The email address of the user whose details you want to fetch. (required)
     *
     * @return Http response
     */
    public function getUserByEmail($email)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getUserByEmail as a get method ?');
    }
    /**
     * Operation getUserPresence
     *
     * Get user presence.
     *
     * @param string $userIdOrEmail The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. (required)
     *
     * @return Http response
     */
    public function getUserPresence($userIdOrEmail)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getUserPresence as a get method ?');
    }
    /**
     * Operation deactivateUser
     *
     * Deactivate a user.
     *
     * @param int $userId The target user&#39;s ID. (required)
     *
     * @return Http response
     */
    public function deactivateUser($userId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing deactivateUser as a delete method ?');
    }
    /**
     * Operation getUser
     *
     * Get a user.
     *
     * @param int $userId The target user&#39;s ID. (required)
     *
     * @return Http response
     */
    public function getUser($userId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getUser as a get method ?');
    }
    /**
     * Operation updateUser
     *
     * Update a user.
     *
     * @param int $userId The target user&#39;s ID. (required)
     *
     * @return Http response
     */
    public function updateUser($userId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing updateUser as a patch method ?');
    }
    /**
     * Operation reactivateUser
     *
     * Reactivate a user.
     *
     * @param int $userId The target user&#39;s ID. (required)
     *
     * @return Http response
     */
    public function reactivateUser($userId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing reactivateUser as a post method ?');
    }
}
