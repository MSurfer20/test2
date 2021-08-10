package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

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
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-10T11:44:46.274064Z[Etc/UTC]")
public abstract class MessagesApiService {
    public abstract Response addReaction(Integer messageId, @NotNull String emojiName,String emojiCode,String reactionType,SecurityContext securityContext) throws NotFoundException;
    public abstract Response checkMessagesMatchNarrow( @NotNull List<Integer> msgIds, @NotNull List<Object> narrow,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteMessage(Integer messageId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getMessageHistory(Integer messageId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getMessages( @NotNull  @Min(0)Integer numBefore, @NotNull  @Min(0)Integer numAfter,OneOfstringinteger anchor,List<Object> narrow,Boolean clientGravatar,Boolean applyMarkdown,Boolean useFirstUnreadAnchor,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getRawMessage(Integer messageId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response removeReaction(Integer messageId,String emojiName,String emojiCode,String reactionType,SecurityContext securityContext) throws NotFoundException;
    public abstract Response renderMessage( @NotNull String content,SecurityContext securityContext) throws NotFoundException;
    public abstract Response sendMessage( @NotNull String type, @NotNull List<Integer> to, @NotNull String content,String topic,String queueId,String localId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateMessage(Integer messageId,String topic,String propagateMode,Boolean sendNotificationToOldThread,Boolean sendNotificationToNewThread,String content,Integer streamId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateMessageFlags( @NotNull List<Integer> messages, @NotNull String op, @NotNull String flag,SecurityContext securityContext) throws NotFoundException;
}
