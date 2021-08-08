package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CodedError
import org.openapitools.model.InvalidMessageError
import org.openapitools.model.JsonSuccess
import org.openapitools.model.JsonSuccessBase
import org.openapitools.model.OneOfobjectobject
import org.openapitools.model.OneOfstringinteger

class MessagesApi {
    String basePath = "https://example.zulipchat.com/api/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def addReaction ( Integer messageId, String emojiName, String emojiCode, String reactionType, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/messages/${message_id}/reactions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (messageId == null) {
            throw new RuntimeException("missing required params messageId")
        }
        // verify required params are set
        if (emojiName == null) {
            throw new RuntimeException("missing required params emojiName")
        }

        if (emojiName != null) {
            queryParams.put("emoji_name", emojiName)
        }
        if (emojiCode != null) {
            queryParams.put("emoji_code", emojiCode)
        }
        if (reactionType != null) {
            queryParams.put("reaction_type", reactionType)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    JsonSuccess.class )

    }

    def checkMessagesMatchNarrow ( List<Integer> msgIds, List<Object> narrow, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/messages/matches_narrow"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (msgIds == null) {
            throw new RuntimeException("missing required params msgIds")
        }
        // verify required params are set
        if (narrow == null) {
            throw new RuntimeException("missing required params narrow")
        }

        if (msgIds != null) {
            queryParams.put("msg_ids", msgIds)
        }
        if (narrow != null) {
            queryParams.put("narrow", narrow)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Object.class )

    }

    def deleteMessage ( Integer messageId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/messages/${message_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (messageId == null) {
            throw new RuntimeException("missing required params messageId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    JsonSuccess.class )

    }

    def getFileTemporaryUrl ( Integer realmIdStr, String filename, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_uploads/${realm_id_str}/${filename}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (realmIdStr == null) {
            throw new RuntimeException("missing required params realmIdStr")
        }
        // verify required params are set
        if (filename == null) {
            throw new RuntimeException("missing required params filename")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    JsonSuccessBase.class )

    }

    def getMessageHistory ( Integer messageId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/messages/${message_id}/history"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (messageId == null) {
            throw new RuntimeException("missing required params messageId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    JsonSuccessBase.class )

    }

    def getMessages ( Integer numBefore, Integer numAfter, OneOfstringinteger anchor, List<Object> narrow, Boolean clientGravatar, Boolean applyMarkdown, Boolean useFirstUnreadAnchor, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/messages"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (numBefore == null) {
            throw new RuntimeException("missing required params numBefore")
        }
        // verify required params are set
        if (numAfter == null) {
            throw new RuntimeException("missing required params numAfter")
        }

        if (anchor != null) {
            queryParams.put("anchor", anchor)
        }
        if (numBefore != null) {
            queryParams.put("num_before", numBefore)
        }
        if (numAfter != null) {
            queryParams.put("num_after", numAfter)
        }
        if (narrow != null) {
            queryParams.put("narrow", narrow)
        }
        if (clientGravatar != null) {
            queryParams.put("client_gravatar", clientGravatar)
        }
        if (applyMarkdown != null) {
            queryParams.put("apply_markdown", applyMarkdown)
        }
        if (useFirstUnreadAnchor != null) {
            queryParams.put("use_first_unread_anchor", useFirstUnreadAnchor)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    JsonSuccessBase.class )

    }

    def getRawMessage ( Integer messageId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/messages/${message_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (messageId == null) {
            throw new RuntimeException("missing required params messageId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    JsonSuccessBase.class )

    }

    def markAllAsRead ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/mark_all_as_read"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    JsonSuccess.class )

    }

    def markStreamAsRead ( Integer streamId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/mark_stream_as_read"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (streamId == null) {
            throw new RuntimeException("missing required params streamId")
        }

        if (streamId != null) {
            queryParams.put("stream_id", streamId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    JsonSuccess.class )

    }

    def markTopicAsRead ( Integer streamId, String topicName, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/mark_topic_as_read"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (streamId == null) {
            throw new RuntimeException("missing required params streamId")
        }
        // verify required params are set
        if (topicName == null) {
            throw new RuntimeException("missing required params topicName")
        }

        if (streamId != null) {
            queryParams.put("stream_id", streamId)
        }
        if (topicName != null) {
            queryParams.put("topic_name", topicName)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    JsonSuccess.class )

    }

    def removeReaction ( Integer messageId, String emojiName, String emojiCode, String reactionType, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/messages/${message_id}/reactions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (messageId == null) {
            throw new RuntimeException("missing required params messageId")
        }

        if (emojiName != null) {
            queryParams.put("emoji_name", emojiName)
        }
        if (emojiCode != null) {
            queryParams.put("emoji_code", emojiCode)
        }
        if (reactionType != null) {
            queryParams.put("reaction_type", reactionType)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    JsonSuccess.class )

    }

    def renderMessage ( String content, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/messages/render"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (content == null) {
            throw new RuntimeException("missing required params content")
        }

        if (content != null) {
            queryParams.put("content", content)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    JsonSuccessBase.class )

    }

    def sendMessage ( String type, List<Integer> to, String content, String topic, String queueId, String localId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/messages"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (type == null) {
            throw new RuntimeException("missing required params type")
        }
        // verify required params are set
        if (to == null) {
            throw new RuntimeException("missing required params to")
        }
        // verify required params are set
        if (content == null) {
            throw new RuntimeException("missing required params content")
        }

        if (type != null) {
            queryParams.put("type", type)
        }
        if (to != null) {
            queryParams.put("to", to)
        }
        if (content != null) {
            queryParams.put("content", content)
        }
        if (topic != null) {
            queryParams.put("topic", topic)
        }
        if (queueId != null) {
            queryParams.put("queue_id", queueId)
        }
        if (localId != null) {
            queryParams.put("local_id", localId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    JsonSuccessBase.class )

    }

    def updateMessage ( Integer messageId, String topic, String propagateMode, Boolean sendNotificationToOldThread, Boolean sendNotificationToNewThread, String content, Integer streamId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/messages/${message_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (messageId == null) {
            throw new RuntimeException("missing required params messageId")
        }

        if (topic != null) {
            queryParams.put("topic", topic)
        }
        if (propagateMode != null) {
            queryParams.put("propagate_mode", propagateMode)
        }
        if (sendNotificationToOldThread != null) {
            queryParams.put("send_notification_to_old_thread", sendNotificationToOldThread)
        }
        if (sendNotificationToNewThread != null) {
            queryParams.put("send_notification_to_new_thread", sendNotificationToNewThread)
        }
        if (content != null) {
            queryParams.put("content", content)
        }
        if (streamId != null) {
            queryParams.put("stream_id", streamId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    JsonSuccess.class )

    }

    def updateMessageFlags ( List<Integer> messages, String op, String flag, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/messages/flags"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (messages == null) {
            throw new RuntimeException("missing required params messages")
        }
        // verify required params are set
        if (op == null) {
            throw new RuntimeException("missing required params op")
        }
        // verify required params are set
        if (flag == null) {
            throw new RuntimeException("missing required params flag")
        }

        if (messages != null) {
            queryParams.put("messages", messages)
        }
        if (op != null) {
            queryParams.put("op", op)
        }
        if (flag != null) {
            queryParams.put("flag", flag)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    JsonSuccessBase.class )

    }

    def uploadFile ( File filename, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_uploads"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType





        contentType = 'multipart/form-data';
        bodyParams = filename

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    JsonSuccessBase.class )

    }

}
