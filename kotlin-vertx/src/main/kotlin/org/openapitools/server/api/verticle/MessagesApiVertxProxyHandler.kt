package org.openapitools.server.api.verticle

import io.vertx.core.Vertx
import io.vertx.core.eventbus.Message
import io.vertx.core.json.JsonObject
import io.vertx.ext.web.api.OperationRequest
import io.vertx.ext.web.api.OperationResponse
import io.vertx.ext.web.api.generator.ApiHandlerUtils
import io.vertx.serviceproxy.ProxyHandler
import io.vertx.serviceproxy.ServiceException
import io.vertx.serviceproxy.ServiceExceptionMessageCodec
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import io.vertx.kotlin.coroutines.dispatcher
import io.vertx.core.json.Json
import io.vertx.core.json.JsonArray
import com.google.gson.reflect.TypeToken
import com.google.gson.Gson
import org.openapitools.server.api.model.AnyType
import org.openapitools.server.api.model.CodedError
import org.openapitools.server.api.model.InvalidMessageError
import org.openapitools.server.api.model.JsonSuccess
import org.openapitools.server.api.model.JsonSuccessBase
import org.openapitools.server.api.model.OneOfLessThanObjectCommaObjectGreaterThan
import org.openapitools.server.api.model.OneOfLessThanStringCommaIntegerGreaterThan

class MessagesApiVertxProxyHandler(private val vertx: Vertx, private val service: MessagesApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
    private val timerID: Long
    private var lastAccessed: Long = 0
    init {
        try {
            this.vertx.eventBus().registerDefaultCodec(ServiceException::class.java,
            ServiceExceptionMessageCodec())
        } catch (ex: IllegalStateException) {}

        if (timeoutSeconds != (-1).toLong() && !topLevel) {
            var period = timeoutSeconds * 1000 / 2
            if (period > 10000) {
                period = 10000
            }
            this.timerID = vertx.setPeriodic(period) { this.checkTimedOut(it) }
        } else {
            this.timerID = -1
        }
        accessed()
    }
    private fun checkTimedOut(id: Long) {
        val now = System.nanoTime()
        if (now - lastAccessed > timeoutSeconds * 1000000000) {
            close()
        }
    }

    override fun close() {
        if (timerID != (-1).toLong()) {
            vertx.cancelTimer(timerID)
        }
        super.close()
    }

    private fun accessed() {
        this.lastAccessed = System.nanoTime()
    }
    override fun handle(msg: Message<JsonObject>) {
        try {
            val json = msg.body()
            val action = msg.headers().get("action") ?: throw IllegalStateException("action not specified")
            accessed()
            val contextSerialized = json.getJsonObject("context") ?: throw IllegalStateException("Received action $action without OperationRequest \"context\"")
            val context = OperationRequest(contextSerialized)
            when (action) {
        
                "addReaction" -> {
                    val params = context.params
                    val messageId = ApiHandlerUtils.searchIntegerInJson(params,"message_id")
                    if(messageId == null){
                        throw IllegalArgumentException("messageId is required")
                    }
                    val emojiName = ApiHandlerUtils.searchStringInJson(params,"emoji_name")
                    if(emojiName == null){
                        throw IllegalArgumentException("emojiName is required")
                    }
                    val emojiCode = ApiHandlerUtils.searchStringInJson(params,"emoji_code")
                    val reactionType = ApiHandlerUtils.searchStringInJson(params,"reaction_type")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.addReaction(messageId,emojiName,emojiCode,reactionType,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "checkMessagesMatchNarrow" -> {
                    val params = context.params
                    val msgIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"msg_ids")
                    if(msgIdsParam == null){
                         throw IllegalArgumentException("msgIds is required")
                    }
                    val msgIds:kotlin.Array<kotlin.Int> = Gson().fromJson(msgIdsParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.Int>>(){}.type)
                    val narrowParam = ApiHandlerUtils.searchJsonArrayInJson(params,"narrow")
                    if(narrowParam == null){
                         throw IllegalArgumentException("narrow is required")
                    }
                    val narrow:kotlin.Array<kotlin.Any> = Gson().fromJson(narrowParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.Any>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.checkMessagesMatchNarrow(msgIds,narrow,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "deleteMessage" -> {
                    val params = context.params
                    val messageId = ApiHandlerUtils.searchIntegerInJson(params,"message_id")
                    if(messageId == null){
                        throw IllegalArgumentException("messageId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteMessage(messageId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getFileTemporaryUrl" -> {
                    val params = context.params
                    val realmIdStr = ApiHandlerUtils.searchIntegerInJson(params,"realm_id_str")
                    if(realmIdStr == null){
                        throw IllegalArgumentException("realmIdStr is required")
                    }
                    val filename = ApiHandlerUtils.searchStringInJson(params,"filename")
                    if(filename == null){
                        throw IllegalArgumentException("filename is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getFileTemporaryUrl(realmIdStr,filename,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getMessageHistory" -> {
                    val params = context.params
                    val messageId = ApiHandlerUtils.searchIntegerInJson(params,"message_id")
                    if(messageId == null){
                        throw IllegalArgumentException("messageId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getMessageHistory(messageId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getMessages" -> {
                    val params = context.params
                    val numBefore = ApiHandlerUtils.searchIntegerInJson(params,"num_before")
                    if(numBefore == null){
                        throw IllegalArgumentException("numBefore is required")
                    }
                    val numAfter = ApiHandlerUtils.searchIntegerInJson(params,"num_after")
                    if(numAfter == null){
                        throw IllegalArgumentException("numAfter is required")
                    }
                    val anchorParam = ApiHandlerUtils.searchJsonObjectInJson(params,"anchor")
                    val anchor = if(anchorParam ==null) null else Gson().fromJson(anchorParam.encode(), OneOfLessThanStringCommaIntegerGreaterThan::class.java)
                    val narrowParam = ApiHandlerUtils.searchJsonArrayInJson(params,"narrow")
                    val narrow:kotlin.Array<kotlin.Any>? = if(narrowParam == null) null
                            else Gson().fromJson(narrowParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.Any>>(){}.type)
                    val clientGravatar = ApiHandlerUtils.searchStringInJson(params,"client_gravatar")?.toBoolean()
                    val applyMarkdown = ApiHandlerUtils.searchStringInJson(params,"apply_markdown")?.toBoolean()
                    val useFirstUnreadAnchor = ApiHandlerUtils.searchStringInJson(params,"use_first_unread_anchor")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getMessages(numBefore,numAfter,anchor,narrow,clientGravatar,applyMarkdown,useFirstUnreadAnchor,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getRawMessage" -> {
                    val params = context.params
                    val messageId = ApiHandlerUtils.searchIntegerInJson(params,"message_id")
                    if(messageId == null){
                        throw IllegalArgumentException("messageId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getRawMessage(messageId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "markAllAsRead" -> {
                }
        
                "markStreamAsRead" -> {
                    val params = context.params
                    val streamId = ApiHandlerUtils.searchIntegerInJson(params,"stream_id")
                    if(streamId == null){
                        throw IllegalArgumentException("streamId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.markStreamAsRead(streamId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "markTopicAsRead" -> {
                    val params = context.params
                    val streamId = ApiHandlerUtils.searchIntegerInJson(params,"stream_id")
                    if(streamId == null){
                        throw IllegalArgumentException("streamId is required")
                    }
                    val topicName = ApiHandlerUtils.searchStringInJson(params,"topic_name")
                    if(topicName == null){
                        throw IllegalArgumentException("topicName is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.markTopicAsRead(streamId,topicName,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "removeReaction" -> {
                    val params = context.params
                    val messageId = ApiHandlerUtils.searchIntegerInJson(params,"message_id")
                    if(messageId == null){
                        throw IllegalArgumentException("messageId is required")
                    }
                    val emojiName = ApiHandlerUtils.searchStringInJson(params,"emoji_name")
                    val emojiCode = ApiHandlerUtils.searchStringInJson(params,"emoji_code")
                    val reactionType = ApiHandlerUtils.searchStringInJson(params,"reaction_type")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.removeReaction(messageId,emojiName,emojiCode,reactionType,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "renderMessage" -> {
                    val params = context.params
                    val content = ApiHandlerUtils.searchStringInJson(params,"content")
                    if(content == null){
                        throw IllegalArgumentException("content is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.renderMessage(content,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "sendMessage" -> {
                    val params = context.params
                    val type = ApiHandlerUtils.searchStringInJson(params,"type")
                    if(type == null){
                        throw IllegalArgumentException("type is required")
                    }
                    val toParam = ApiHandlerUtils.searchJsonArrayInJson(params,"to")
                    if(toParam == null){
                         throw IllegalArgumentException("to is required")
                    }
                    val to:kotlin.Array<kotlin.Int> = Gson().fromJson(toParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.Int>>(){}.type)
                    val content = ApiHandlerUtils.searchStringInJson(params,"content")
                    if(content == null){
                        throw IllegalArgumentException("content is required")
                    }
                    val topic = ApiHandlerUtils.searchStringInJson(params,"topic")
                    val queueId = ApiHandlerUtils.searchStringInJson(params,"queue_id")
                    val localId = ApiHandlerUtils.searchStringInJson(params,"local_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.sendMessage(type,to,content,topic,queueId,localId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateMessage" -> {
                    val params = context.params
                    val messageId = ApiHandlerUtils.searchIntegerInJson(params,"message_id")
                    if(messageId == null){
                        throw IllegalArgumentException("messageId is required")
                    }
                    val topic = ApiHandlerUtils.searchStringInJson(params,"topic")
                    val propagateMode = ApiHandlerUtils.searchStringInJson(params,"propagate_mode")
                    val sendNotificationToOldThread = ApiHandlerUtils.searchStringInJson(params,"send_notification_to_old_thread")?.toBoolean()
                    val sendNotificationToNewThread = ApiHandlerUtils.searchStringInJson(params,"send_notification_to_new_thread")?.toBoolean()
                    val content = ApiHandlerUtils.searchStringInJson(params,"content")
                    val streamId = ApiHandlerUtils.searchIntegerInJson(params,"stream_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateMessage(messageId,topic,propagateMode,sendNotificationToOldThread,sendNotificationToNewThread,content,streamId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateMessageFlags" -> {
                    val params = context.params
                    val messagesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"messages")
                    if(messagesParam == null){
                         throw IllegalArgumentException("messages is required")
                    }
                    val messages:kotlin.Array<kotlin.Int> = Gson().fromJson(messagesParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.Int>>(){}.type)
                    val op = ApiHandlerUtils.searchStringInJson(params,"op")
                    if(op == null){
                        throw IllegalArgumentException("op is required")
                    }
                    val flag = ApiHandlerUtils.searchStringInJson(params,"flag")
                    if(flag == null){
                        throw IllegalArgumentException("flag is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateMessageFlags(messages,op,flag,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "uploadFile" -> {
                    val params = context.params
                    val filenameParam = context.extra.getJsonArray("files")
                    val filename = filenameParam?.map{ java.io.File(it as String) }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.uploadFile(filename,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
            }
        }catch (t: Throwable) {
            msg.reply(ServiceException(500, t.message))
            throw t
        }
    }
}
