package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CodedError;
import org.openapitools.server.api.model.JsonError;
import org.openapitools.server.api.model.JsonSuccess;
import org.openapitools.server.api.model.JsonSuccessBase;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OneOfobjectobject;
import org.openapitools.server.api.model.OneOfobjectobjectobject;

public final class UsersApiException extends MainApiException {
    public UsersApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final UsersApiException Users_createUser_200_Exception = new UsersApiException(200, "Success.");
    public static final UsersApiException Users_createUser_400_Exception = new UsersApiException(400, "Bad request.");
    public static final UsersApiException Users_createUserGroup_200_Exception = new UsersApiException(200, "Success.");
    public static final UsersApiException Users_createUserGroup_400_Exception = new UsersApiException(400, "Bad request.");
    public static final UsersApiException Users_deactivateOwnUser_200_Exception = new UsersApiException(200, "Success.");
    public static final UsersApiException Users_deactivateOwnUser_400_Exception = new UsersApiException(400, "Bad request.");
    public static final UsersApiException Users_deactivateUser_200_Exception = new UsersApiException(200, "Success");
    public static final UsersApiException Users_deactivateUser_400_Exception = new UsersApiException(400, "Bad request");
    public static final UsersApiException Users_getAttachments_200_Exception = new UsersApiException(200, "Success.");
    public static final UsersApiException Users_getOwnUser_200_Exception = new UsersApiException(200, "Success");
    public static final UsersApiException Users_getUser_200_Exception = new UsersApiException(200, "Success.");
    public static final UsersApiException Users_getUserByEmail_200_Exception = new UsersApiException(200, "Success.");
    public static final UsersApiException Users_getUserGroups_200_Exception = new UsersApiException(200, "Success.");
    public static final UsersApiException Users_getUserPresence_200_Exception = new UsersApiException(200, "Success.");
    public static final UsersApiException Users_getUsers_200_Exception = new UsersApiException(200, "Success.");
    public static final UsersApiException Users_muteUser_200_Exception = new UsersApiException(200, "Success.");
    public static final UsersApiException Users_muteUser_400_Exception = new UsersApiException(400, "Bad request.");
    public static final UsersApiException Users_reactivateUser_200_Exception = new UsersApiException(200, "Success");
    public static final UsersApiException Users_removeUserGroup_200_Exception = new UsersApiException(200, "Success.");
    public static final UsersApiException Users_removeUserGroup_400_Exception = new UsersApiException(400, "Bad request.");
    public static final UsersApiException Users_setTypingStatus_200_Exception = new UsersApiException(200, "Success.");
    public static final UsersApiException Users_setTypingStatus_400_Exception = new UsersApiException(400, "Bad request.");
    public static final UsersApiException Users_unmuteUser_200_Exception = new UsersApiException(200, "Success.");
    public static final UsersApiException Users_unmuteUser_400_Exception = new UsersApiException(400, "Bad request.");
    public static final UsersApiException Users_updateDisplaySettings_200_Exception = new UsersApiException(200, "Success");
    public static final UsersApiException Users_updateNotificationSettings_200_Exception = new UsersApiException(200, "Success.");
    public static final UsersApiException Users_updateUser_200_Exception = new UsersApiException(200, "Success.");
    public static final UsersApiException Users_updateUser_400_Exception = new UsersApiException(400, "Bad request.");
    public static final UsersApiException Users_updateUserGroup_200_Exception = new UsersApiException(200, "Success.");
    public static final UsersApiException Users_updateUserGroup_400_Exception = new UsersApiException(400, "Bad request.");
    public static final UsersApiException Users_updateUserGroupMembers_200_Exception = new UsersApiException(200, "Success.");
    

}