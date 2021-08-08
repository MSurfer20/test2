package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.AnyType
import org.openapitools.server.api.model.CodedError
import org.openapitools.server.api.model.InvalidMessageError
import org.openapitools.server.api.model.JsonSuccess
import org.openapitools.server.api.model.JsonSuccessBase
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


interface MessagesApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* addReaction
     * Add an emoji reaction */
    suspend fun addReaction(messageId:kotlin.Int?,emojiName:kotlin.String?,emojiCode:kotlin.String?,reactionType:kotlin.String?,context:OperationRequest):Response<JsonSuccess>
    /* checkMessagesMatchNarrow
     * Check if messages match a narrow */
    suspend fun checkMessagesMatchNarrow(msgIds:kotlin.Array<kotlin.Int>?,narrow:kotlin.Array<kotlin.Any>?,context:OperationRequest):Response<AnyType>
    /* deleteMessage
     * Delete a message */
    suspend fun deleteMessage(messageId:kotlin.Int?,context:OperationRequest):Response<JsonSuccess>
    /* getFileTemporaryUrl
     * Get public temporary URL */
    suspend fun getFileTemporaryUrl(realmIdStr:kotlin.Int?,filename:kotlin.String?,context:OperationRequest):Response<JsonSuccessBase>
    /* getMessageHistory
     * Get a message&#39;s edit history */
    suspend fun getMessageHistory(messageId:kotlin.Int?,context:OperationRequest):Response<JsonSuccessBase>
    /* getMessages
     * Get messages */
    suspend fun getMessages(numBefore:kotlin.Int?,numAfter:kotlin.Int?,anchor:OneOfLessThanStringCommaIntegerGreaterThan?,narrow:kotlin.Array<kotlin.Any>?,clientGravatar:kotlin.Boolean?,applyMarkdown:kotlin.Boolean?,useFirstUnreadAnchor:kotlin.Boolean?,context:OperationRequest):Response<JsonSuccessBase>
    /* getRawMessage
     * Get a message&#39;s raw Markdown */
    suspend fun getRawMessage(messageId:kotlin.Int?,context:OperationRequest):Response<JsonSuccessBase>
    /* markAllAsRead
     * Mark all messages as read */
    suspend fun markAllAsRead(context:OperationRequest):Response<JsonSuccess>
    /* markStreamAsRead
     * Mark messages in a stream as read */
    suspend fun markStreamAsRead(streamId:kotlin.Int?,context:OperationRequest):Response<JsonSuccess>
    /* markTopicAsRead
     * Mark messages in a topic as read */
    suspend fun markTopicAsRead(streamId:kotlin.Int?,topicName:kotlin.String?,context:OperationRequest):Response<JsonSuccess>
    /* removeReaction
     * Remove an emoji reaction */
    suspend fun removeReaction(messageId:kotlin.Int?,emojiName:kotlin.String?,emojiCode:kotlin.String?,reactionType:kotlin.String?,context:OperationRequest):Response<JsonSuccess>
    /* renderMessage
     * Render message */
    suspend fun renderMessage(content:kotlin.String?,context:OperationRequest):Response<JsonSuccessBase>
    /* sendMessage
     * Send a message */
    suspend fun sendMessage(type:kotlin.String?,to:kotlin.Array<kotlin.Int>?,content:kotlin.String?,topic:kotlin.String?,queueId:kotlin.String?,localId:kotlin.String?,context:OperationRequest):Response<JsonSuccessBase>
    /* updateMessage
     * Edit a message */
    suspend fun updateMessage(messageId:kotlin.Int?,topic:kotlin.String?,propagateMode:kotlin.String?,sendNotificationToOldThread:kotlin.Boolean?,sendNotificationToNewThread:kotlin.Boolean?,content:kotlin.String?,streamId:kotlin.Int?,context:OperationRequest):Response<JsonSuccess>
    /* updateMessageFlags
     * Update personal message flags */
    suspend fun updateMessageFlags(messages:kotlin.Array<kotlin.Int>?,op:kotlin.String?,flag:kotlin.String?,context:OperationRequest):Response<JsonSuccessBase>
    /* uploadFile
     * Upload a file */
    suspend fun uploadFile(filename:kotlin.collections.List<java.io.File>?,context:OperationRequest):Response<JsonSuccessBase>
    companion object {
        const val address = "MessagesApi-service"
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
            for (m in MessagesApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(MessagesApi::class.java, address)
            return routerFactory
        }
    }
}
