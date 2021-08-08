package org.openapitools.api.impl;

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

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2021-08-08T21:12:21.563950Z[Etc/UTC]")
public class UsersApiServiceImpl implements UsersApi {
      public Response createUser(String email,String password,String fullName,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response deactivateOwnUser(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response deactivateUser(Integer userId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getOwnUser(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getStreamTopics(Integer streamId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getSubscriptionStatus(Integer userId,Integer streamId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getSubscriptions(Boolean includeSubscribers,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getUser(Integer userId,Boolean clientGravatar,Boolean includeCustomProfileFields,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getUserByEmail(String email,Boolean clientGravatar,Boolean includeCustomProfileFields,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getUserPresence(String userIdOrEmail,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getUsers(Boolean clientGravatar,Boolean includeCustomProfileFields,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response muteTopic(String topic,String op,String stream,Integer streamId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response muteUser(Integer mutedUserId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response reactivateUser(Integer userId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response subscribe(List<Object> subscriptions,List<OneOfstringinteger> principals,Boolean authorizationErrorsFatal,Boolean announce,Boolean inviteOnly,Boolean historyPublicToSubscribers,Integer streamPostPolicy,OneOfstringinteger messageRetentionDays,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response unmuteUser(Integer mutedUserId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response unsubscribe(List<String> subscriptions,List<OneOfstringinteger> principals,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updateStatus(String statusText,Boolean away,String emojiName,String emojiCode,String reactionType,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updateSubscriptionSettings(List<Object> subscriptionData,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updateSubscriptions(List<String> delete,List<Object> add,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updateUser(Integer userId,String fullName,Integer role,List<Object> profileData,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
