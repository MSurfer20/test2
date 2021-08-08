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
import org.openapitools.server.api.model.CodedError
import org.openapitools.server.api.model.JsonError
import org.openapitools.server.api.model.JsonSuccess
import org.openapitools.server.api.model.JsonSuccessBase
import org.openapitools.server.api.model.NonExistingStreamError
import org.openapitools.server.api.model.OneOfLessThanObjectCommaObjectGreaterThan
import org.openapitools.server.api.model.OneOfLessThanStringCommaIntegerGreaterThan

class StreamsApiVertxProxyHandler(private val vertx: Vertx, private val service: StreamsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "archiveStream" -> {
                    val params = context.params
                    val streamId = ApiHandlerUtils.searchIntegerInJson(params,"stream_id")
                    if(streamId == null){
                        throw IllegalArgumentException("streamId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.archiveStream(streamId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createBigBlueButtonVideoCall" -> {
                }
        
                "deleteTopic" -> {
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
                        val result = service.deleteTopic(streamId,topicName,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getStreamId" -> {
                    val params = context.params
                    val stream = ApiHandlerUtils.searchStringInJson(params,"stream")
                    if(stream == null){
                        throw IllegalArgumentException("stream is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getStreamId(stream,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getStreamTopics" -> {
                    val params = context.params
                    val streamId = ApiHandlerUtils.searchIntegerInJson(params,"stream_id")
                    if(streamId == null){
                        throw IllegalArgumentException("streamId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getStreamTopics(streamId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getStreams" -> {
                    val params = context.params
                    val includePublic = ApiHandlerUtils.searchStringInJson(params,"include_public")?.toBoolean()
                    val includeWebPublic = ApiHandlerUtils.searchStringInJson(params,"include_web_public")?.toBoolean()
                    val includeSubscribed = ApiHandlerUtils.searchStringInJson(params,"include_subscribed")?.toBoolean()
                    val includeAllActive = ApiHandlerUtils.searchStringInJson(params,"include_all_active")?.toBoolean()
                    val includeDefault = ApiHandlerUtils.searchStringInJson(params,"include_default")?.toBoolean()
                    val includeOwnerSubscribed = ApiHandlerUtils.searchStringInJson(params,"include_owner_subscribed")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getStreams(includePublic,includeWebPublic,includeSubscribed,includeAllActive,includeDefault,includeOwnerSubscribed,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getSubscribers" -> {
                    val params = context.params
                    val streamId = ApiHandlerUtils.searchIntegerInJson(params,"stream_id")
                    if(streamId == null){
                        throw IllegalArgumentException("streamId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getSubscribers(streamId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getSubscriptionStatus" -> {
                    val params = context.params
                    val userId = ApiHandlerUtils.searchIntegerInJson(params,"user_id")
                    if(userId == null){
                        throw IllegalArgumentException("userId is required")
                    }
                    val streamId = ApiHandlerUtils.searchIntegerInJson(params,"stream_id")
                    if(streamId == null){
                        throw IllegalArgumentException("streamId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getSubscriptionStatus(userId,streamId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getSubscriptions" -> {
                    val params = context.params
                    val includeSubscribers = ApiHandlerUtils.searchStringInJson(params,"include_subscribers")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getSubscriptions(includeSubscribers,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "muteTopic" -> {
                    val params = context.params
                    val topic = ApiHandlerUtils.searchStringInJson(params,"topic")
                    if(topic == null){
                        throw IllegalArgumentException("topic is required")
                    }
                    val op = ApiHandlerUtils.searchStringInJson(params,"op")
                    if(op == null){
                        throw IllegalArgumentException("op is required")
                    }
                    val stream = ApiHandlerUtils.searchStringInJson(params,"stream")
                    val streamId = ApiHandlerUtils.searchIntegerInJson(params,"stream_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.muteTopic(topic,op,stream,streamId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "subscribe" -> {
                    val params = context.params
                    val subscriptionsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"subscriptions")
                    if(subscriptionsParam == null){
                         throw IllegalArgumentException("subscriptions is required")
                    }
                    val subscriptions:kotlin.Array<kotlin.Any> = Gson().fromJson(subscriptionsParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.Any>>(){}.type)
                    val principalsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"principals")
                    val principals:kotlin.Array<OneOfLessThanStringCommaIntegerGreaterThan>? = if(principalsParam == null) null
                            else Gson().fromJson(principalsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<OneOfLessThanStringCommaIntegerGreaterThan>>(){}.type)
                    val authorizationErrorsFatal = ApiHandlerUtils.searchStringInJson(params,"authorization_errors_fatal")?.toBoolean()
                    val announce = ApiHandlerUtils.searchStringInJson(params,"announce")?.toBoolean()
                    val inviteOnly = ApiHandlerUtils.searchStringInJson(params,"invite_only")?.toBoolean()
                    val historyPublicToSubscribers = ApiHandlerUtils.searchStringInJson(params,"history_public_to_subscribers")?.toBoolean()
                    val streamPostPolicy = ApiHandlerUtils.searchIntegerInJson(params,"stream_post_policy")
                    val messageRetentionDaysParam = ApiHandlerUtils.searchJsonObjectInJson(params,"message_retention_days")
                    val messageRetentionDays = if(messageRetentionDaysParam ==null) null else Gson().fromJson(messageRetentionDaysParam.encode(), OneOfLessThanStringCommaIntegerGreaterThan::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.subscribe(subscriptions,principals,authorizationErrorsFatal,announce,inviteOnly,historyPublicToSubscribers,streamPostPolicy,messageRetentionDays,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "unsubscribe" -> {
                    val params = context.params
                    val subscriptionsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"subscriptions")
                    if(subscriptionsParam == null){
                         throw IllegalArgumentException("subscriptions is required")
                    }
                    val subscriptions:kotlin.Array<kotlin.String> = Gson().fromJson(subscriptionsParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val principalsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"principals")
                    val principals:kotlin.Array<OneOfLessThanStringCommaIntegerGreaterThan>? = if(principalsParam == null) null
                            else Gson().fromJson(principalsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<OneOfLessThanStringCommaIntegerGreaterThan>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.unsubscribe(subscriptions,principals,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateStream" -> {
                    val params = context.params
                    val streamId = ApiHandlerUtils.searchIntegerInJson(params,"stream_id")
                    if(streamId == null){
                        throw IllegalArgumentException("streamId is required")
                    }
                    val description = ApiHandlerUtils.searchStringInJson(params,"description")
                    val newName = ApiHandlerUtils.searchStringInJson(params,"new_name")
                    val isPrivate = ApiHandlerUtils.searchStringInJson(params,"is_private")?.toBoolean()
                    val isAnnouncementOnly = ApiHandlerUtils.searchStringInJson(params,"is_announcement_only")?.toBoolean()
                    val streamPostPolicy = ApiHandlerUtils.searchIntegerInJson(params,"stream_post_policy")
                    val historyPublicToSubscribers = ApiHandlerUtils.searchStringInJson(params,"history_public_to_subscribers")?.toBoolean()
                    val messageRetentionDaysParam = ApiHandlerUtils.searchJsonObjectInJson(params,"message_retention_days")
                    val messageRetentionDays = if(messageRetentionDaysParam ==null) null else Gson().fromJson(messageRetentionDaysParam.encode(), OneOfLessThanStringCommaIntegerGreaterThan::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateStream(streamId,description,newName,isPrivate,isAnnouncementOnly,streamPostPolicy,historyPublicToSubscribers,messageRetentionDays,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateSubscriptionSettings" -> {
                    val params = context.params
                    val subscriptionDataParam = ApiHandlerUtils.searchJsonArrayInJson(params,"subscription_data")
                    if(subscriptionDataParam == null){
                         throw IllegalArgumentException("subscriptionData is required")
                    }
                    val subscriptionData:kotlin.Array<kotlin.Any> = Gson().fromJson(subscriptionDataParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.Any>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateSubscriptionSettings(subscriptionData,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateSubscriptions" -> {
                    val params = context.params
                    val deleteParam = ApiHandlerUtils.searchJsonArrayInJson(params,"delete")
                    val delete:kotlin.Array<kotlin.String>? = if(deleteParam == null) null
                            else Gson().fromJson(deleteParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val addParam = ApiHandlerUtils.searchJsonArrayInJson(params,"add")
                    val add:kotlin.Array<kotlin.Any>? = if(addParam == null) null
                            else Gson().fromJson(addParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.Any>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateSubscriptions(delete,add,context)
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
