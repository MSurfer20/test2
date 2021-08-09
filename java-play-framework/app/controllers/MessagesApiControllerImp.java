package controllers;

import apimodels.CodedError;
import java.io.InputStream;
import apimodels.InvalidMessageError;
import apimodels.JsonSuccess;
import apimodels.JsonSuccessBase;
import apimodels.OneOfobjectobject;
import apimodels.OneOfstringinteger;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-09T21:33:34.002001Z[Etc/UTC]")
public class MessagesApiControllerImp extends MessagesApiControllerImpInterface {
    @Override
    public JsonSuccess addReaction(Http.Request request, Integer messageId, @NotNull String emojiName, String emojiCode, String reactionType) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public Object checkMessagesMatchNarrow(Http.Request request, @NotNull List<Integer> msgIds, @NotNull List<Object> narrow) throws Exception {
        //Do your magic!!!
        return new Object();
    }

    @Override
    public JsonSuccess deleteMessage(Http.Request request, Integer messageId) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccessBase getFileTemporaryUrl(Http.Request request, Integer realmIdStr, String filename) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccessBase getMessageHistory(Http.Request request, Integer messageId) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccessBase getMessages(Http.Request request, @NotNull  @Min(0)Integer numBefore, @NotNull  @Min(0)Integer numAfter, OneOfstringinteger anchor, List<Object> narrow, Boolean clientGravatar, Boolean applyMarkdown, Boolean useFirstUnreadAnchor) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccessBase getRawMessage(Http.Request request, Integer messageId) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccess markAllAsRead(Http.Request request) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccess markStreamAsRead(Http.Request request, @NotNull Integer streamId) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccess markTopicAsRead(Http.Request request, @NotNull Integer streamId, @NotNull String topicName) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccess removeReaction(Http.Request request, Integer messageId, String emojiName, String emojiCode, String reactionType) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccessBase renderMessage(Http.Request request, @NotNull String content) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccessBase sendMessage(Http.Request request, @NotNull String type, @NotNull List<Integer> to, @NotNull String content, String topic, String queueId, String localId) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccess updateMessage(Http.Request request, Integer messageId, String topic, String propagateMode, Boolean sendNotificationToOldThread, Boolean sendNotificationToNewThread, String content, Integer streamId) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccessBase updateMessageFlags(Http.Request request, @NotNull List<Integer> messages, @NotNull String op, @NotNull String flag) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccessBase uploadFile(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> filename) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

}
