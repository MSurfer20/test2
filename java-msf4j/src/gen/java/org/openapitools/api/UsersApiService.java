package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.CodedError;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.model.NonExistingStreamError;
import org.openapitools.model.OneOfobjectobject;
import org.openapitools.model.OneOfobjectobjectobject;
import org.openapitools.model.OneOfobjectobjectobjectobjectobjectobject;
import org.openapitools.model.OneOfstringinteger;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-09T21:33:26.116785Z[Etc/UTC]")
public abstract class UsersApiService {
    public abstract Response createUser(String email
 ,String password
 ,String fullName
 ) throws NotFoundException;
    public abstract Response deactivateOwnUser() throws NotFoundException;
    public abstract Response deactivateUser(Integer userId
 ) throws NotFoundException;
    public abstract Response getOwnUser() throws NotFoundException;
    public abstract Response getStreamTopics(Integer streamId
 ) throws NotFoundException;
    public abstract Response getSubscriptionStatus(Integer userId
 ,Integer streamId
 ) throws NotFoundException;
    public abstract Response getSubscriptions(Boolean includeSubscribers
 ) throws NotFoundException;
    public abstract Response getUser(Integer userId
 ,Boolean clientGravatar
 ,Boolean includeCustomProfileFields
 ) throws NotFoundException;
    public abstract Response getUserByEmail(String email
 ,Boolean clientGravatar
 ,Boolean includeCustomProfileFields
 ) throws NotFoundException;
    public abstract Response getUserPresence(String userIdOrEmail
 ) throws NotFoundException;
    public abstract Response getUsers(Boolean clientGravatar
 ,Boolean includeCustomProfileFields
 ) throws NotFoundException;
    public abstract Response muteTopic(String topic
 ,String op
 ,String stream
 ,Integer streamId
 ) throws NotFoundException;
    public abstract Response muteUser(Integer mutedUserId
 ) throws NotFoundException;
    public abstract Response reactivateUser(Integer userId
 ) throws NotFoundException;
    public abstract Response subscribe(List<Object> subscriptions
 ,List<OneOfstringinteger> principals
 ,Boolean authorizationErrorsFatal
 ,Boolean announce
 ,Boolean inviteOnly
 ,Boolean historyPublicToSubscribers
 ,Integer streamPostPolicy
 ,OneOfstringinteger messageRetentionDays
 ) throws NotFoundException;
    public abstract Response unmuteUser(Integer mutedUserId
 ) throws NotFoundException;
    public abstract Response unsubscribe(List<String> subscriptions
 ,List<OneOfstringinteger> principals
 ) throws NotFoundException;
    public abstract Response updateStatus(String statusText
 ,Boolean away
 ,String emojiName
 ,String emojiCode
 ,String reactionType
 ) throws NotFoundException;
    public abstract Response updateSubscriptionSettings(List<Object> subscriptionData
 ) throws NotFoundException;
    public abstract Response updateSubscriptions(List<String> delete
 ,List<Object> add
 ) throws NotFoundException;
    public abstract Response updateUser(Integer userId
 ,String fullName
 ,Integer role
 ,List<Object> profileData
 ) throws NotFoundException;
}
