package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-08T21:11:29.842761Z[Etc/UTC]")
public abstract class MessagesApiService {
    public abstract Response addReaction(Integer messageId
 ,String emojiName
 ,String emojiCode
 ,String reactionType
 ) throws NotFoundException;
    public abstract Response checkMessagesMatchNarrow(List<Integer> msgIds
 ,List<Object> narrow
 ) throws NotFoundException;
    public abstract Response deleteMessage(Integer messageId
 ) throws NotFoundException;
    public abstract Response getMessageHistory(Integer messageId
 ) throws NotFoundException;
    public abstract Response getMessages(Integer numBefore
 ,Integer numAfter
 ,OneOfstringinteger anchor
 ,List<Object> narrow
 ,Boolean clientGravatar
 ,Boolean applyMarkdown
 ,Boolean useFirstUnreadAnchor
 ) throws NotFoundException;
    public abstract Response getRawMessage(Integer messageId
 ) throws NotFoundException;
    public abstract Response removeReaction(Integer messageId
 ,String emojiName
 ,String emojiCode
 ,String reactionType
 ) throws NotFoundException;
    public abstract Response renderMessage(String content
 ) throws NotFoundException;
    public abstract Response sendMessage(String type
 ,List<Integer> to
 ,String content
 ,String topic
 ,String queueId
 ,String localId
 ) throws NotFoundException;
    public abstract Response updateMessage(Integer messageId
 ,String topic
 ,String propagateMode
 ,Boolean sendNotificationToOldThread
 ,Boolean sendNotificationToNewThread
 ,String content
 ,Integer streamId
 ) throws NotFoundException;
    public abstract Response updateMessageFlags(List<Integer> messages
 ,String op
 ,String flag
 ) throws NotFoundException;
}
