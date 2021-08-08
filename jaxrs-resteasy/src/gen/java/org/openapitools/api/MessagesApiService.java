package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.CodedError;
import org.openapitools.model.InvalidMessageError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.model.OneOfobjectobject;
import org.openapitools.model.OneOfstringinteger;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-08T20:42:27.763537Z[Etc/UTC]")
public interface MessagesApiService {
      Response addReaction(Integer messageId,String emojiName,String emojiCode,String reactionType,SecurityContext securityContext)
      throws NotFoundException;
      Response checkMessagesMatchNarrow(List<Integer> msgIds,List<Object> narrow,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteMessage(Integer messageId,SecurityContext securityContext)
      throws NotFoundException;
      Response getMessageHistory(Integer messageId,SecurityContext securityContext)
      throws NotFoundException;
      Response getMessages(Integer numBefore,Integer numAfter,OneOfstringinteger anchor,List<Object> narrow,Boolean clientGravatar,Boolean applyMarkdown,Boolean useFirstUnreadAnchor,SecurityContext securityContext)
      throws NotFoundException;
      Response getRawMessage(Integer messageId,SecurityContext securityContext)
      throws NotFoundException;
      Response removeReaction(Integer messageId,String emojiName,String emojiCode,String reactionType,SecurityContext securityContext)
      throws NotFoundException;
      Response renderMessage(String content,SecurityContext securityContext)
      throws NotFoundException;
      Response sendMessage(String type,List<Integer> to,String content,String topic,String queueId,String localId,SecurityContext securityContext)
      throws NotFoundException;
      Response updateMessage(Integer messageId,String topic,String propagateMode,Boolean sendNotificationToOldThread,Boolean sendNotificationToNewThread,String content,Integer streamId,SecurityContext securityContext)
      throws NotFoundException;
      Response updateMessageFlags(List<Integer> messages,String op,String flag,SecurityContext securityContext)
      throws NotFoundException;
}
