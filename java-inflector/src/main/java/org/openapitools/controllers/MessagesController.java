package org.openapitools.controllers;

import io.swagger.inflector.models.RequestContext;
import io.swagger.inflector.models.ResponseContext;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import java.io.File;
import java.util.List;

import org.openapitools.model.*;

import org.openapitools.model.CodedError;
import org.openapitools.model.InvalidMessageError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.model.OneOfobjectobject;
import org.openapitools.model.OneOfstringinteger;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen")
public class MessagesController  {
  /** 
   * Uncomment and implement as you see fit.  These operations will map
   * Directly to operation calls from the routing logic.  Because the inflector
   * Code allows you to implement logic incrementally, they are disabled.
   **/

  /*
    public ResponseContext addReaction(RequestContext request , Integer messageId, String emojiName, String emojiCode, String reactionType) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext checkMessagesMatchNarrow(RequestContext request , List<Integer> msgIds, List<Object> narrow) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteMessage(RequestContext request , Integer messageId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getMessageHistory(RequestContext request , Integer messageId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getMessages(RequestContext request , Integer numBefore, Integer numAfter, OneOfstringinteger anchor, List<Object> narrow, Boolean clientGravatar, Boolean applyMarkdown, Boolean useFirstUnreadAnchor) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getRawMessage(RequestContext request , Integer messageId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext removeReaction(RequestContext request , Integer messageId, String emojiName, String emojiCode, String reactionType) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext renderMessage(RequestContext request , String content) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext sendMessage(RequestContext request , String type, List<Integer> to, String content, String topic, String queueId, String localId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateMessage(RequestContext request , Integer messageId, String topic, String propagateMode, Boolean sendNotificationToOldThread, Boolean sendNotificationToNewThread, String content, Integer streamId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateMessageFlags(RequestContext request , List<Integer> messages, String op, String flag) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

}

