package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.CodedError;
import org.openapitools.model.InvalidMessageError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.model.OneOfobjectobject;
import org.openapitools.model.OneOfstringinteger;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-08-08T21:19:56.888133Z[Etc/UTC]")
public interface MessagesApiService {
      public Response addReaction(Integer messageId, String emojiName, String emojiCode, String reactionType, SecurityContext securityContext);
      public Response checkMessagesMatchNarrow(List<Integer> msgIds, List<Object> narrow, SecurityContext securityContext);
      public Response deleteMessage(Integer messageId, SecurityContext securityContext);
      public Response getMessageHistory(Integer messageId, SecurityContext securityContext);
      public Response getMessages(Integer numBefore, Integer numAfter, OneOfstringinteger anchor, List<Object> narrow, Boolean clientGravatar, Boolean applyMarkdown, Boolean useFirstUnreadAnchor, SecurityContext securityContext);
      public Response getRawMessage(Integer messageId, SecurityContext securityContext);
      public Response removeReaction(Integer messageId, String emojiName, String emojiCode, String reactionType, SecurityContext securityContext);
      public Response renderMessage(String content, SecurityContext securityContext);
      public Response sendMessage(String type, List<Integer> to, String content, String topic, String queueId, String localId, SecurityContext securityContext);
      public Response updateMessage(Integer messageId, String topic, String propagateMode, Boolean sendNotificationToOldThread, Boolean sendNotificationToNewThread, String content, Integer streamId, SecurityContext securityContext);
      public Response updateMessageFlags(List<Integer> messages, String op, String flag, SecurityContext securityContext);
}
