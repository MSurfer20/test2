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
import org.openapitools.server.api.model.JsonSuccess
import org.openapitools.server.api.model.JsonSuccessBase

class ServerAndOrganizationsApiVertxProxyHandler(private val vertx: Vertx, private val service: ServerAndOrganizationsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "addCodePlayground" -> {
                    val params = context.params
                    val name = ApiHandlerUtils.searchStringInJson(params,"name")
                    if(name == null){
                        throw IllegalArgumentException("name is required")
                    }
                    val pygmentsLanguage = ApiHandlerUtils.searchStringInJson(params,"pygments_language")
                    if(pygmentsLanguage == null){
                        throw IllegalArgumentException("pygmentsLanguage is required")
                    }
                    val urlPrefix = ApiHandlerUtils.searchStringInJson(params,"url_prefix")
                    if(urlPrefix == null){
                        throw IllegalArgumentException("urlPrefix is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.addCodePlayground(name,pygmentsLanguage,urlPrefix,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "addLinkifier" -> {
                    val params = context.params
                    val pattern = ApiHandlerUtils.searchStringInJson(params,"pattern")
                    if(pattern == null){
                        throw IllegalArgumentException("pattern is required")
                    }
                    val urlFormatString = ApiHandlerUtils.searchStringInJson(params,"url_format_string")
                    if(urlFormatString == null){
                        throw IllegalArgumentException("urlFormatString is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.addLinkifier(pattern,urlFormatString,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createCustomProfileField" -> {
                    val params = context.params
                    val fieldType = ApiHandlerUtils.searchIntegerInJson(params,"field_type")
                    if(fieldType == null){
                        throw IllegalArgumentException("fieldType is required")
                    }
                    val name = ApiHandlerUtils.searchStringInJson(params,"name")
                    val hint = ApiHandlerUtils.searchStringInJson(params,"hint")
                    val fieldDataParam = ApiHandlerUtils.searchJsonObjectInJson(params,"field_data")
                    val fieldData = if(fieldDataParam ==null) null else Gson().fromJson(fieldDataParam.encode(), kotlin.Any::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createCustomProfileField(fieldType,name,hint,fieldData,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getCustomEmoji" -> {
                }
        
                "getCustomProfileFields" -> {
                }
        
                "getLinkifiers" -> {
                }
        
                "getServerSettings" -> {
                }
        
                "removeCodePlayground" -> {
                    val params = context.params
                    val playgroundId = ApiHandlerUtils.searchIntegerInJson(params,"playground_id")
                    if(playgroundId == null){
                        throw IllegalArgumentException("playgroundId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.removeCodePlayground(playgroundId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "removeLinkifier" -> {
                    val params = context.params
                    val filterId = ApiHandlerUtils.searchIntegerInJson(params,"filter_id")
                    if(filterId == null){
                        throw IllegalArgumentException("filterId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.removeLinkifier(filterId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "reorderCustomProfileFields" -> {
                    val params = context.params
                    val orderParam = ApiHandlerUtils.searchJsonArrayInJson(params,"order")
                    if(orderParam == null){
                         throw IllegalArgumentException("order is required")
                    }
                    val order:kotlin.Array<kotlin.Int> = Gson().fromJson(orderParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.Int>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.reorderCustomProfileFields(order,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateLinkifier" -> {
                    val params = context.params
                    val filterId = ApiHandlerUtils.searchIntegerInJson(params,"filter_id")
                    if(filterId == null){
                        throw IllegalArgumentException("filterId is required")
                    }
                    val pattern = ApiHandlerUtils.searchStringInJson(params,"pattern")
                    if(pattern == null){
                        throw IllegalArgumentException("pattern is required")
                    }
                    val urlFormatString = ApiHandlerUtils.searchStringInJson(params,"url_format_string")
                    if(urlFormatString == null){
                        throw IllegalArgumentException("urlFormatString is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateLinkifier(filterId,pattern,urlFormatString,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "uploadCustomEmoji" -> {
                    val params = context.params
                    val emojiName = ApiHandlerUtils.searchStringInJson(params,"emoji_name")
                    if(emojiName == null){
                        throw IllegalArgumentException("emojiName is required")
                    }
                    val filenameParam = context.extra.getJsonArray("files")
                    val filename = filenameParam?.map{ java.io.File(it as String) }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.uploadCustomEmoji(emojiName,filename,context)
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
