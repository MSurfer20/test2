package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2021-08-08T21:12:21.563950Z[Etc/UTC]")
public class MessagesApiServiceImpl implements MessagesApi {
      public Response addReaction(Integer messageId,String emojiName,String emojiCode,String reactionType,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response checkMessagesMatchNarrow(List<Integer> msgIds,List<Object> narrow,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response deleteMessage(Integer messageId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getMessageHistory(Integer messageId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getMessages(Integer numBefore,Integer numAfter,OneOfstringinteger anchor,List<Object> narrow,Boolean clientGravatar,Boolean applyMarkdown,Boolean useFirstUnreadAnchor,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getRawMessage(Integer messageId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response removeReaction(Integer messageId,String emojiName,String emojiCode,String reactionType,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response renderMessage(String content,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response sendMessage(String type,List<Integer> to,String content,String topic,String queueId,String localId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updateMessage(Integer messageId,String topic,String propagateMode,Boolean sendNotificationToOldThread,Boolean sendNotificationToNewThread,String content,Integer streamId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updateMessageFlags(List<Integer> messages,String op,String flag,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
