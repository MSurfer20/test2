package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.CodedError
import org.openapitools.server.api.model.JsonError
import org.openapitools.server.api.model.JsonSuccess
import org.openapitools.server.api.model.JsonSuccessBase
import org.openapitools.server.api.model.NonExistingStreamError
import org.openapitools.server.api.model.OneOfLessThanObjectCommaObjectGreaterThan
import org.openapitools.server.api.model.OneOfLessThanStringCommaIntegerGreaterThan
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


interface StreamsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* archiveStream
     * Archive a stream */
    suspend fun archiveStream(streamId:kotlin.Int?,context:OperationRequest):Response<JsonSuccess>
    /* createBigBlueButtonVideoCall
     * Create BigBlueButton video call */
    suspend fun createBigBlueButtonVideoCall(context:OperationRequest):Response<JsonSuccessBase>
    /* getStreamId
     * Get stream ID */
    suspend fun getStreamId(stream:kotlin.String?,context:OperationRequest):Response<JsonSuccessBase>
    /* getStreamTopics
     * Get topics in a stream */
    suspend fun getStreamTopics(streamId:kotlin.Int?,context:OperationRequest):Response<JsonSuccessBase>
    /* getStreams
     * Get all streams */
    suspend fun getStreams(includePublic:kotlin.Boolean?,includeWebPublic:kotlin.Boolean?,includeSubscribed:kotlin.Boolean?,includeAllActive:kotlin.Boolean?,includeDefault:kotlin.Boolean?,includeOwnerSubscribed:kotlin.Boolean?,context:OperationRequest):Response<JsonSuccessBase>
    /* getSubscriptionStatus
     * Get subscription status */
    suspend fun getSubscriptionStatus(userId:kotlin.Int?,streamId:kotlin.Int?,context:OperationRequest):Response<JsonSuccessBase>
    /* getSubscriptions
     * Get subscribed streams */
    suspend fun getSubscriptions(includeSubscribers:kotlin.Boolean?,context:OperationRequest):Response<JsonSuccessBase>
    /* muteTopic
     * Topic muting */
    suspend fun muteTopic(topic:kotlin.String?,op:kotlin.String?,stream:kotlin.String?,streamId:kotlin.Int?,context:OperationRequest):Response<JsonSuccess>
    /* subscribe
     * Subscribe to a stream */
    suspend fun subscribe(subscriptions:kotlin.Array<kotlin.Any>?,principals:kotlin.Array<OneOfLessThanStringCommaIntegerGreaterThan>?,authorizationErrorsFatal:kotlin.Boolean?,announce:kotlin.Boolean?,inviteOnly:kotlin.Boolean?,historyPublicToSubscribers:kotlin.Boolean?,streamPostPolicy:kotlin.Int?,messageRetentionDays:OneOfLessThanStringCommaIntegerGreaterThan?,context:OperationRequest):Response<OneOfLessThanObjectCommaObjectGreaterThan>
    /* unsubscribe
     * Unsubscribe from a stream */
    suspend fun unsubscribe(subscriptions:kotlin.Array<kotlin.String>?,principals:kotlin.Array<OneOfLessThanStringCommaIntegerGreaterThan>?,context:OperationRequest):Response<JsonSuccessBase>
    /* updateStream
     * Update a stream */
    suspend fun updateStream(streamId:kotlin.Int?,description:kotlin.String?,newName:kotlin.String?,isPrivate:kotlin.Boolean?,isAnnouncementOnly:kotlin.Boolean?,streamPostPolicy:kotlin.Int?,historyPublicToSubscribers:kotlin.Boolean?,messageRetentionDays:OneOfLessThanStringCommaIntegerGreaterThan?,context:OperationRequest):Response<JsonSuccess>
    /* updateSubscriptionSettings
     * Update subscription settings */
    suspend fun updateSubscriptionSettings(subscriptionData:kotlin.Array<kotlin.Any>?,context:OperationRequest):Response<JsonSuccessBase>
    /* updateSubscriptions
     * Update subscriptions */
    suspend fun updateSubscriptions(delete:kotlin.Array<kotlin.String>?,add:kotlin.Array<kotlin.Any>?,context:OperationRequest):Response<JsonSuccessBase>
    companion object {
        const val address = "StreamsApi-service"
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
            for (m in StreamsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(StreamsApi::class.java, address)
            return routerFactory
        }
    }
}
