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
import org.openapitools.server.api.model.BadEventQueueIdError
import org.openapitools.server.api.model.JsonSuccess
import org.openapitools.server.api.model.JsonSuccessBase
import org.openapitools.server.api.model.OneOfLessThanInvalidApiKeyErrorCommaMissingArgumentErrorCommaUserNotAuthorizedErrorGreaterThan
import org.openapitools.server.api.model.OneOfLessThanRateLimitedErrorGreaterThan
import org.openapitools.server.api.model.OneOfLessThanUserDeactivatedErrorCommaRealmDeactivatedErrorGreaterThan

class RealTimeEventsApiVertxProxyHandler(private val vertx: Vertx, private val service: RealTimeEventsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "deleteQueue" -> {
                    val params = context.params
                    val queueId = ApiHandlerUtils.searchStringInJson(params,"queue_id")
                    if(queueId == null){
                        throw IllegalArgumentException("queueId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteQueue(queueId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getEvents" -> {
                    val params = context.params
                    val queueId = ApiHandlerUtils.searchStringInJson(params,"queue_id")
                    if(queueId == null){
                        throw IllegalArgumentException("queueId is required")
                    }
                    val lastEventId = ApiHandlerUtils.searchIntegerInJson(params,"last_event_id")
                    val dontBlock = ApiHandlerUtils.searchStringInJson(params,"dont_block")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getEvents(queueId,lastEventId,dontBlock,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "realTimePost" -> {
                    val params = context.params
                    val eventTypesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"event_types")
                    val eventTypes:kotlin.Array<kotlin.String>? = if(eventTypesParam == null) null
                            else Gson().fromJson(eventTypesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val narrowParam = ApiHandlerUtils.searchJsonArrayInJson(params,"narrow")
                    val narrow:kotlin.Array<kotlin.Array<kotlin.String>>? = if(narrowParam == null) null
                            else Gson().fromJson(narrowParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.Array<kotlin.String>>>(){}.type)
                    val allPublicStreams = ApiHandlerUtils.searchStringInJson(params,"all_public_streams")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.realTimePost(eventTypes,narrow,allPublicStreams,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "registerQueue" -> {
                    val params = context.params
                    val applyMarkdown = ApiHandlerUtils.searchStringInJson(params,"apply_markdown")?.toBoolean()
                    val clientGravatar = ApiHandlerUtils.searchStringInJson(params,"client_gravatar")?.toBoolean()
                    val slimPresence = ApiHandlerUtils.searchStringInJson(params,"slim_presence")?.toBoolean()
                    val eventTypesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"event_types")
                    val eventTypes:kotlin.Array<kotlin.String>? = if(eventTypesParam == null) null
                            else Gson().fromJson(eventTypesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val allPublicStreams = ApiHandlerUtils.searchStringInJson(params,"all_public_streams")?.toBoolean()
                    val includeSubscribers = ApiHandlerUtils.searchStringInJson(params,"include_subscribers")?.toBoolean()
                    val clientCapabilitiesParam = ApiHandlerUtils.searchJsonObjectInJson(params,"client_capabilities")
                    val clientCapabilities = if(clientCapabilitiesParam ==null) null else Gson().fromJson(clientCapabilitiesParam.encode(), kotlin.Any::class.java)
                    val fetchEventTypesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"fetch_event_types")
                    val fetchEventTypes:kotlin.Array<kotlin.String>? = if(fetchEventTypesParam == null) null
                            else Gson().fromJson(fetchEventTypesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val narrowParam = ApiHandlerUtils.searchJsonArrayInJson(params,"narrow")
                    val narrow:kotlin.Array<kotlin.Array<kotlin.String>>? = if(narrowParam == null) null
                            else Gson().fromJson(narrowParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.Array<kotlin.String>>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.registerQueue(applyMarkdown,clientGravatar,slimPresence,eventTypes,allPublicStreams,includeSubscribers,clientCapabilities,fetchEventTypes,narrow,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "restErrorHandling" -> {
                }
        
            }
        }catch (t: Throwable) {
            msg.reply(ServiceException(500, t.message))
            throw t
        }
    }
}
