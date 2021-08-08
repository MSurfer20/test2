package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-08-08T21:12:04.371582Z[Etc/UTC]")
public interface UsersApiService {
      public Response createUser(String email, String password, String fullName, SecurityContext securityContext);
      public Response deactivateOwnUser(SecurityContext securityContext);
      public Response deactivateUser(Integer userId, SecurityContext securityContext);
      public Response getOwnUser(SecurityContext securityContext);
      public Response getStreamTopics(Integer streamId, SecurityContext securityContext);
      public Response getSubscriptionStatus(Integer userId, Integer streamId, SecurityContext securityContext);
      public Response getSubscriptions(Boolean includeSubscribers, SecurityContext securityContext);
      public Response getUser(Integer userId, Boolean clientGravatar, Boolean includeCustomProfileFields, SecurityContext securityContext);
      public Response getUserByEmail(String email, Boolean clientGravatar, Boolean includeCustomProfileFields, SecurityContext securityContext);
      public Response getUserPresence(String userIdOrEmail, SecurityContext securityContext);
      public Response getUsers(Boolean clientGravatar, Boolean includeCustomProfileFields, SecurityContext securityContext);
      public Response muteTopic(String topic, String op, String stream, Integer streamId, SecurityContext securityContext);
      public Response muteUser(Integer mutedUserId, SecurityContext securityContext);
      public Response reactivateUser(Integer userId, SecurityContext securityContext);
      public Response subscribe(List<Object> subscriptions, List<OneOfstringinteger> principals, Boolean authorizationErrorsFatal, Boolean announce, Boolean inviteOnly, Boolean historyPublicToSubscribers, Integer streamPostPolicy, OneOfstringinteger messageRetentionDays, SecurityContext securityContext);
      public Response unmuteUser(Integer mutedUserId, SecurityContext securityContext);
      public Response unsubscribe(List<String> subscriptions, List<OneOfstringinteger> principals, SecurityContext securityContext);
      public Response updateStatus(String statusText, Boolean away, String emojiName, String emojiCode, String reactionType, SecurityContext securityContext);
      public Response updateSubscriptionSettings(List<Object> subscriptionData, SecurityContext securityContext);
      public Response updateSubscriptions(List<String> delete, List<Object> add, SecurityContext securityContext);
      public Response updateUser(Integer userId, String fullName, Integer role, List<Object> profileData, SecurityContext securityContext);
}
