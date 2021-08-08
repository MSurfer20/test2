package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.BadEventQueueIdError
import org.openapitools.server.api.model.JsonSuccess
import org.openapitools.server.api.model.JsonSuccessBase
import org.openapitools.server.api.model.OneOfLessThanInvalidApiKeyErrorCommaMissingArgumentErrorCommaUserNotAuthorizedErrorGreaterThan
import org.openapitools.server.api.model.OneOfLessThanRateLimitedErrorGreaterThan
import org.openapitools.server.api.model.OneOfLessThanUserDeactivatedErrorCommaRealmDeactivatedErrorGreaterThan
import io.vertx.core.Vertx
import io.vertx.core.json.JsonObject
import io.vertx.core.json.JsonArray
import com.github.wooyme.openapi.Response
import io.vertx.ext.web.api.OperationRequest
import io.vertx.kotlin.ext.web.api.contract.openapi3.OpenAPI3RouterFactory
import io.vertx.serviceproxy.ServiceBinder
import io.vertx.ext.web.handler.CookieHandler
import io.vertx.ext.web.handler.SessionHandler
import io.vertx.ext.web.sstore.LocalSessionStore
import java.util.List
import java.util.Map


interface RealTimeEventsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* deleteQueue
     * Delete an event queue */
    suspend fun deleteQueue(queueId:kotlin.String?,context:OperationRequest):Response<JsonSuccess>
    /* getEvents
     * Get events from an event queue */
    suspend fun getEvents(queueId:kotlin.String?,lastEventId:kotlin.Int?,dontBlock:kotlin.Boolean?,context:OperationRequest):Response<JsonSuccessBase>
    /* realTimePost
     *  */
    suspend fun realTimePost(eventTypes:kotlin.Array<kotlin.String>?,narrow:kotlin.Array<kotlin.Array<kotlin.String>>?,allPublicStreams:kotlin.Boolean?,context:OperationRequest):Response<Void>
    /* registerQueue
     * Register an event queue */
    suspend fun registerQueue(applyMarkdown:kotlin.Boolean?,clientGravatar:kotlin.Boolean?,slimPresence:kotlin.Boolean?,eventTypes:kotlin.Array<kotlin.String>?,allPublicStreams:kotlin.Boolean?,includeSubscribers:kotlin.Boolean?,clientCapabilities:kotlin.Any?,fetchEventTypes:kotlin.Array<kotlin.String>?,narrow:kotlin.Array<kotlin.Array<kotlin.String>>?,context:OperationRequest):Response<JsonSuccessBase>
    /* restErrorHandling
     * Error handling */
    suspend fun restErrorHandling(context:OperationRequest):Response<Void>
    companion object {
        const val address = "RealTimeEventsApi-service"
        suspend fun createRouterFactory(vertx: Vertx,path:String): io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory {
            val routerFactory = OpenAPI3RouterFactory.createAwait(vertx,path)
            routerFactory.addGlobalHandler(CookieHandler.create())
            routerFactory.addGlobalHandler(SessionHandler.create(LocalSessionStore.create(vertx)))
            routerFactory.setExtraOperationContextPayloadMapper{
                JsonObject().put("files",JsonArray(it.fileUploads().map { it.uploadedFileName() }))
            }
            val opf = routerFactory::class.java.getDeclaredField("operations")
            opf.isAccessible = true
            val operations = opf.get(routerFactory) as Map<String, Any>
            for (m in RealTimeEventsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(RealTimeEventsApi::class.java, address)
            return routerFactory
        }
    }
}
