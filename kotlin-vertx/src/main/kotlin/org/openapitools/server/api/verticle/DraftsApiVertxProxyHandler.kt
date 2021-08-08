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
import org.openapitools.server.api.model.Draft
import org.openapitools.server.api.model.JsonError
import org.openapitools.server.api.model.JsonSuccess

class DraftsApiVertxProxyHandler(private val vertx: Vertx, private val service: DraftsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "createDrafts" -> {
                    val params = context.params
                    val draftsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"drafts")
                    val drafts:kotlin.Array<Draft>? = if(draftsParam == null) null
                            else Gson().fromJson(draftsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<Draft>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createDrafts(drafts,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "deleteDraft" -> {
                    val params = context.params
                    val draftId = ApiHandlerUtils.searchIntegerInJson(params,"draft_id")
                    if(draftId == null){
                        throw IllegalArgumentException("draftId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteDraft(draftId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "editDraft" -> {
                    val params = context.params
                    val draftId = ApiHandlerUtils.searchIntegerInJson(params,"draft_id")
                    if(draftId == null){
                        throw IllegalArgumentException("draftId is required")
                    }
                    val draftParam = ApiHandlerUtils.searchJsonObjectInJson(params,"draft")
                    if (draftParam == null) {
                        throw IllegalArgumentException("draft is required")
                    }
                    val draft = Gson().fromJson(draftParam.encode(), Draft::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.editDraft(draftId,draft,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getDrafts" -> {
                }
        
            }
        }catch (t: Throwable) {
            msg.reply(ServiceException(500, t.message))
            throw t
        }
    }
}
