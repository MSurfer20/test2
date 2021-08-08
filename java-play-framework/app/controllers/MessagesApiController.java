package controllers;

import apimodels.CodedError;
import java.io.InputStream;
import apimodels.InvalidMessageError;
import apimodels.JsonSuccess;
import apimodels.JsonSuccessBase;
import apimodels.OneOfobjectobject;
import apimodels.OneOfstringinteger;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-08T21:19:33.131185Z[Etc/UTC]")
public class MessagesApiController extends Controller {
    private final MessagesApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private MessagesApiController(Config configuration, MessagesApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result addReaction(Http.Request request, Integer messageId) throws Exception {
        String valueemojiName = request.getQueryString("emoji_name");
        String emojiName;
        if (valueemojiName != null) {
            emojiName = valueemojiName;
        } else {
            throw new IllegalArgumentException("'emoji_name' parameter is required");
        }
        String valueemojiCode = request.getQueryString("emoji_code");
        String emojiCode;
        if (valueemojiCode != null) {
            emojiCode = valueemojiCode;
        } else {
            emojiCode = null;
        }
        String valuereactionType = request.getQueryString("reaction_type");
        String reactionType;
        if (valuereactionType != null) {
            reactionType = valuereactionType;
        } else {
            reactionType = null;
        }
        return imp.addReactionHttp(request, messageId, emojiName, emojiCode, reactionType);
    }

    @ApiAction
    public Result checkMessagesMatchNarrow(Http.Request request) throws Exception {
        String[] msgIdsArray = request.queryString().get("msg_ids");
        if (msgIdsArray == null) {
            throw new IllegalArgumentException("'msg_ids' parameter is required");
        }
        List<String> msgIdsList = OpenAPIUtils.parametersToList("multi", msgIdsArray);
        List<Integer> msgIds = new ArrayList<>();
        for (String curParam : msgIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                msgIds.add(Integer.parseInt(curParam));
            }
        }
        String[] narrowArray = request.queryString().get("narrow");
        if (narrowArray == null) {
            throw new IllegalArgumentException("'narrow' parameter is required");
        }
        List<String> narrowList = OpenAPIUtils.parametersToList("multi", narrowArray);
        List<Object> narrow = new ArrayList<>();
        for (String curParam : narrowList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                narrow.add(curParam);
            }
        }
        return imp.checkMessagesMatchNarrowHttp(request, msgIds, narrow);
    }

    @ApiAction
    public Result deleteMessage(Http.Request request, Integer messageId) throws Exception {
        return imp.deleteMessageHttp(request, messageId);
    }

    @ApiAction
    public Result getFileTemporaryUrl(Http.Request request, Integer realmIdStr,String filename) throws Exception {
        return imp.getFileTemporaryUrlHttp(request, realmIdStr, filename);
    }

    @ApiAction
    public Result getMessageHistory(Http.Request request, Integer messageId) throws Exception {
        return imp.getMessageHistoryHttp(request, messageId);
    }

    @ApiAction
    public Result getMessages(Http.Request request) throws Exception {
        String valueanchor = request.getQueryString("anchor");
        OneOfstringinteger anchor;
        if (valueanchor != null) {
            anchor = valueanchor;
        } else {
            anchor = null;
        }
        String valuenumBefore = request.getQueryString("num_before");
        Integer numBefore;
        if (valuenumBefore != null) {
            numBefore = Integer.parseInt(valuenumBefore);
        } else {
            throw new IllegalArgumentException("'num_before' parameter is required");
        }
        String valuenumAfter = request.getQueryString("num_after");
        Integer numAfter;
        if (valuenumAfter != null) {
            numAfter = Integer.parseInt(valuenumAfter);
        } else {
            throw new IllegalArgumentException("'num_after' parameter is required");
        }
        String[] narrowArray = request.queryString().get("narrow");
        List<String> narrowList = OpenAPIUtils.parametersToList("multi", narrowArray);
        List<Object> narrow = new ArrayList<>();
        for (String curParam : narrowList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                narrow.add(curParam);
            }
        }
        String valueclientGravatar = request.getQueryString("client_gravatar");
        Boolean clientGravatar;
        if (valueclientGravatar != null) {
            clientGravatar = Boolean.valueOf(valueclientGravatar);
        } else {
            clientGravatar = false;
        }
        String valueapplyMarkdown = request.getQueryString("apply_markdown");
        Boolean applyMarkdown;
        if (valueapplyMarkdown != null) {
            applyMarkdown = Boolean.valueOf(valueapplyMarkdown);
        } else {
            applyMarkdown = true;
        }
        String valueuseFirstUnreadAnchor = request.getQueryString("use_first_unread_anchor");
        Boolean useFirstUnreadAnchor;
        if (valueuseFirstUnreadAnchor != null) {
            useFirstUnreadAnchor = Boolean.valueOf(valueuseFirstUnreadAnchor);
        } else {
            useFirstUnreadAnchor = false;
        }
        return imp.getMessagesHttp(request, numBefore, numAfter, anchor, narrow, clientGravatar, applyMarkdown, useFirstUnreadAnchor);
    }

    @ApiAction
    public Result getRawMessage(Http.Request request, Integer messageId) throws Exception {
        return imp.getRawMessageHttp(request, messageId);
    }

    @ApiAction
    public Result markAllAsRead(Http.Request request) throws Exception {
        return imp.markAllAsReadHttp(request);
    }

    @ApiAction
    public Result markStreamAsRead(Http.Request request) throws Exception {
        String valuestreamId = request.getQueryString("stream_id");
        Integer streamId;
        if (valuestreamId != null) {
            streamId = Integer.parseInt(valuestreamId);
        } else {
            throw new IllegalArgumentException("'stream_id' parameter is required");
        }
        return imp.markStreamAsReadHttp(request, streamId);
    }

    @ApiAction
    public Result markTopicAsRead(Http.Request request) throws Exception {
        String valuestreamId = request.getQueryString("stream_id");
        Integer streamId;
        if (valuestreamId != null) {
            streamId = Integer.parseInt(valuestreamId);
        } else {
            throw new IllegalArgumentException("'stream_id' parameter is required");
        }
        String valuetopicName = request.getQueryString("topic_name");
        String topicName;
        if (valuetopicName != null) {
            topicName = valuetopicName;
        } else {
            throw new IllegalArgumentException("'topic_name' parameter is required");
        }
        return imp.markTopicAsReadHttp(request, streamId, topicName);
    }

    @ApiAction
    public Result removeReaction(Http.Request request, Integer messageId) throws Exception {
        String valueemojiName = request.getQueryString("emoji_name");
        String emojiName;
        if (valueemojiName != null) {
            emojiName = valueemojiName;
        } else {
            emojiName = null;
        }
        String valueemojiCode = request.getQueryString("emoji_code");
        String emojiCode;
        if (valueemojiCode != null) {
            emojiCode = valueemojiCode;
        } else {
            emojiCode = null;
        }
        String valuereactionType = request.getQueryString("reaction_type");
        String reactionType;
        if (valuereactionType != null) {
            reactionType = valuereactionType;
        } else {
            reactionType = null;
        }
        return imp.removeReactionHttp(request, messageId, emojiName, emojiCode, reactionType);
    }

    @ApiAction
    public Result renderMessage(Http.Request request) throws Exception {
        String valuecontent = request.getQueryString("content");
        String content;
        if (valuecontent != null) {
            content = valuecontent;
        } else {
            throw new IllegalArgumentException("'content' parameter is required");
        }
        return imp.renderMessageHttp(request, content);
    }

    @ApiAction
    public Result sendMessage(Http.Request request) throws Exception {
        String valuetype = request.getQueryString("type");
        String type;
        if (valuetype != null) {
            type = valuetype;
        } else {
            throw new IllegalArgumentException("'type' parameter is required");
        }
        String[] toArray = request.queryString().get("to");
        if (toArray == null) {
            throw new IllegalArgumentException("'to' parameter is required");
        }
        List<String> toList = OpenAPIUtils.parametersToList("multi", toArray);
        List<Integer> to = new ArrayList<>();
        for (String curParam : toList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                to.add(Integer.parseInt(curParam));
            }
        }
        String valuecontent = request.getQueryString("content");
        String content;
        if (valuecontent != null) {
            content = valuecontent;
        } else {
            throw new IllegalArgumentException("'content' parameter is required");
        }
        String valuetopic = request.getQueryString("topic");
        String topic;
        if (valuetopic != null) {
            topic = valuetopic;
        } else {
            topic = null;
        }
        String valuequeueId = request.getQueryString("queue_id");
        String queueId;
        if (valuequeueId != null) {
            queueId = valuequeueId;
        } else {
            queueId = null;
        }
        String valuelocalId = request.getQueryString("local_id");
        String localId;
        if (valuelocalId != null) {
            localId = valuelocalId;
        } else {
            localId = null;
        }
        return imp.sendMessageHttp(request, type, to, content, topic, queueId, localId);
    }

    @ApiAction
    public Result updateMessage(Http.Request request, Integer messageId) throws Exception {
        String valuetopic = request.getQueryString("topic");
        String topic;
        if (valuetopic != null) {
            topic = valuetopic;
        } else {
            topic = null;
        }
        String valuepropagateMode = request.getQueryString("propagate_mode");
        String propagateMode;
        if (valuepropagateMode != null) {
            propagateMode = valuepropagateMode;
        } else {
            propagateMode = "change_one";
        }
        String valuesendNotificationToOldThread = request.getQueryString("send_notification_to_old_thread");
        Boolean sendNotificationToOldThread;
        if (valuesendNotificationToOldThread != null) {
            sendNotificationToOldThread = Boolean.valueOf(valuesendNotificationToOldThread);
        } else {
            sendNotificationToOldThread = true;
        }
        String valuesendNotificationToNewThread = request.getQueryString("send_notification_to_new_thread");
        Boolean sendNotificationToNewThread;
        if (valuesendNotificationToNewThread != null) {
            sendNotificationToNewThread = Boolean.valueOf(valuesendNotificationToNewThread);
        } else {
            sendNotificationToNewThread = true;
        }
        String valuecontent = request.getQueryString("content");
        String content;
        if (valuecontent != null) {
            content = valuecontent;
        } else {
            content = null;
        }
        String valuestreamId = request.getQueryString("stream_id");
        Integer streamId;
        if (valuestreamId != null) {
            streamId = Integer.parseInt(valuestreamId);
        } else {
            streamId = null;
        }
        return imp.updateMessageHttp(request, messageId, topic, propagateMode, sendNotificationToOldThread, sendNotificationToNewThread, content, streamId);
    }

    @ApiAction
    public Result updateMessageFlags(Http.Request request) throws Exception {
        String[] messagesArray = request.queryString().get("messages");
        if (messagesArray == null) {
            throw new IllegalArgumentException("'messages' parameter is required");
        }
        List<String> messagesList = OpenAPIUtils.parametersToList("multi", messagesArray);
        List<Integer> messages = new ArrayList<>();
        for (String curParam : messagesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                messages.add(Integer.parseInt(curParam));
            }
        }
        String valueop = request.getQueryString("op");
        String op;
        if (valueop != null) {
            op = valueop;
        } else {
            throw new IllegalArgumentException("'op' parameter is required");
        }
        String valueflag = request.getQueryString("flag");
        String flag;
        if (valueflag != null) {
            flag = valueflag;
        } else {
            throw new IllegalArgumentException("'flag' parameter is required");
        }
        return imp.updateMessageFlagsHttp(request, messages, op, flag);
    }

    @ApiAction
    public Result uploadFile(Http.Request request) throws Exception {
        Http.MultipartFormData<TemporaryFile> bodyfilename = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> filename = bodyfilename.getFile("filename");
        return imp.uploadFileHttp(request, filename);
    }

}
