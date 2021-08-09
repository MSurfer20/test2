package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

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
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-09T21:34:02.517112Z[Etc/UTC]")
public abstract class UsersApiService {
    public abstract Response createUser( @NotNull String email, @NotNull String password, @NotNull String fullName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deactivateOwnUser(SecurityContext securityContext) throws NotFoundException;
    public abstract Response deactivateUser(Integer userId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getOwnUser(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getStreamTopics(Integer streamId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSubscriptionStatus(Integer userId,Integer streamId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSubscriptions(Boolean includeSubscribers,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getUser(Integer userId,Boolean clientGravatar,Boolean includeCustomProfileFields,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getUserByEmail(String email,Boolean clientGravatar,Boolean includeCustomProfileFields,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getUserPresence(String userIdOrEmail,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getUsers(Boolean clientGravatar,Boolean includeCustomProfileFields,SecurityContext securityContext) throws NotFoundException;
    public abstract Response muteTopic( @NotNull String topic, @NotNull String op,String stream,Integer streamId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response muteUser(Integer mutedUserId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response reactivateUser(Integer userId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response subscribe( @NotNull List<Object> subscriptions,List<OneOfstringinteger> principals,Boolean authorizationErrorsFatal,Boolean announce,Boolean inviteOnly,Boolean historyPublicToSubscribers,Integer streamPostPolicy,OneOfstringinteger messageRetentionDays,SecurityContext securityContext) throws NotFoundException;
    public abstract Response unmuteUser(Integer mutedUserId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response unsubscribe( @NotNull List<String> subscriptions,List<OneOfstringinteger> principals,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateStatus(String statusText,Boolean away,String emojiName,String emojiCode,String reactionType,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateSubscriptionSettings( @NotNull List<Object> subscriptionData,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateSubscriptions(List<String> delete,List<Object> add,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateUser(Integer userId,String fullName,Integer role,List<Object> profileData,SecurityContext securityContext) throws NotFoundException;
}
