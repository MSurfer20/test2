package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import org.openapitools.model.CodedError;
import org.openapitools.model.InvalidMessageError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.model.OneOfobjectobject;
import org.openapitools.model.OneOfstringinteger;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-08-08T21:19:56.888133Z[Etc/UTC]")
public class MessagesApiServiceImpl implements MessagesApiService {
      @Override
      public Response addReaction(Integer messageId, String emojiName, String emojiCode, String reactionType, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response checkMessagesMatchNarrow(List<Integer> msgIds, List<Object> narrow, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response deleteMessage(Integer messageId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getMessageHistory(Integer messageId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getMessages(Integer numBefore, Integer numAfter, OneOfstringinteger anchor, List<Object> narrow, Boolean clientGravatar, Boolean applyMarkdown, Boolean useFirstUnreadAnchor, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getRawMessage(Integer messageId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response removeReaction(Integer messageId, String emojiName, String emojiCode, String reactionType, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response renderMessage(String content, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response sendMessage(String type, List<Integer> to, String content, String topic, String queueId, String localId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response updateMessage(Integer messageId, String topic, String propagateMode, Boolean sendNotificationToOldThread, Boolean sendNotificationToNewThread, String content, Integer streamId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response updateMessageFlags(List<Integer> messages, String op, String flag, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
