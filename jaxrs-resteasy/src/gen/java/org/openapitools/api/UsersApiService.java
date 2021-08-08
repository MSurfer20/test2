package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-08T21:12:17.400215Z[Etc/UTC]")
public interface UsersApiService {
      Response createUser(String email,String password,String fullName,SecurityContext securityContext)
      throws NotFoundException;
      Response deactivateOwnUser(SecurityContext securityContext)
      throws NotFoundException;
      Response deactivateUser(Integer userId,SecurityContext securityContext)
      throws NotFoundException;
      Response getOwnUser(SecurityContext securityContext)
      throws NotFoundException;
      Response getStreamTopics(Integer streamId,SecurityContext securityContext)
      throws NotFoundException;
      Response getSubscriptionStatus(Integer userId,Integer streamId,SecurityContext securityContext)
      throws NotFoundException;
      Response getSubscriptions(Boolean includeSubscribers,SecurityContext securityContext)
      throws NotFoundException;
      Response getUser(Integer userId,Boolean clientGravatar,Boolean includeCustomProfileFields,SecurityContext securityContext)
      throws NotFoundException;
      Response getUserByEmail(String email,Boolean clientGravatar,Boolean includeCustomProfileFields,SecurityContext securityContext)
      throws NotFoundException;
      Response getUserPresence(String userIdOrEmail,SecurityContext securityContext)
      throws NotFoundException;
      Response getUsers(Boolean clientGravatar,Boolean includeCustomProfileFields,SecurityContext securityContext)
      throws NotFoundException;
      Response muteTopic(String topic,String op,String stream,Integer streamId,SecurityContext securityContext)
      throws NotFoundException;
      Response muteUser(Integer mutedUserId,SecurityContext securityContext)
      throws NotFoundException;
      Response reactivateUser(Integer userId,SecurityContext securityContext)
      throws NotFoundException;
      Response subscribe(List<Object> subscriptions,List<OneOfstringinteger> principals,Boolean authorizationErrorsFatal,Boolean announce,Boolean inviteOnly,Boolean historyPublicToSubscribers,Integer streamPostPolicy,OneOfstringinteger messageRetentionDays,SecurityContext securityContext)
      throws NotFoundException;
      Response unmuteUser(Integer mutedUserId,SecurityContext securityContext)
      throws NotFoundException;
      Response unsubscribe(List<String> subscriptions,List<OneOfstringinteger> principals,SecurityContext securityContext)
      throws NotFoundException;
      Response updateStatus(String statusText,Boolean away,String emojiName,String emojiCode,String reactionType,SecurityContext securityContext)
      throws NotFoundException;
      Response updateSubscriptionSettings(List<Object> subscriptionData,SecurityContext securityContext)
      throws NotFoundException;
      Response updateSubscriptions(List<String> delete,List<Object> add,SecurityContext securityContext)
      throws NotFoundException;
      Response updateUser(Integer userId,String fullName,Integer role,List<Object> profileData,SecurityContext securityContext)
      throws NotFoundException;
}
