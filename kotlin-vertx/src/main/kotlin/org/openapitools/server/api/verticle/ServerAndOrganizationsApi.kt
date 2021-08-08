package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.JsonSuccess
import org.openapitools.server.api.model.JsonSuccessBase
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


interface ServerAndOrganizationsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* addCodePlayground
     * Add a code playground */
    suspend fun addCodePlayground(name:kotlin.String?,pygmentsLanguage:kotlin.String?,urlPrefix:kotlin.String?,context:OperationRequest):Response<JsonSuccessBase>
    /* addLinkifier
     * Add a linkifier */
    suspend fun addLinkifier(pattern:kotlin.String?,urlFormatString:kotlin.String?,context:OperationRequest):Response<JsonSuccessBase>
    /* createCustomProfileField
     * Create a custom profile field */
    suspend fun createCustomProfileField(fieldType:kotlin.Int?,name:kotlin.String?,hint:kotlin.String?,fieldData:kotlin.Any?,context:OperationRequest):Response<JsonSuccessBase>
    /* getCustomEmoji
     * Get all custom emoji */
    suspend fun getCustomEmoji(context:OperationRequest):Response<JsonSuccessBase>
    /* getCustomProfileFields
     * Get all custom profile fields */
    suspend fun getCustomProfileFields(context:OperationRequest):Response<JsonSuccessBase>
    /* getLinkifiers
     * Get linkifiers */
    suspend fun getLinkifiers(context:OperationRequest):Response<JsonSuccessBase>
    /* getServerSettings
     * Get server settings */
    suspend fun getServerSettings(context:OperationRequest):Response<JsonSuccessBase>
    /* removeCodePlayground
     * Remove a code playground */
    suspend fun removeCodePlayground(playgroundId:kotlin.Int?,context:OperationRequest):Response<JsonSuccess>
    /* removeLinkifier
     * Remove a linkifier */
    suspend fun removeLinkifier(filterId:kotlin.Int?,context:OperationRequest):Response<JsonSuccess>
    /* reorderCustomProfileFields
     * Reorder custom profile fields */
    suspend fun reorderCustomProfileFields(order:kotlin.Array<kotlin.Int>?,context:OperationRequest):Response<JsonSuccess>
    /* updateLinkifier
     * Update a linkifier */
    suspend fun updateLinkifier(filterId:kotlin.Int?,pattern:kotlin.String?,urlFormatString:kotlin.String?,context:OperationRequest):Response<JsonSuccess>
    /* uploadCustomEmoji
     * Upload custom emoji */
    suspend fun uploadCustomEmoji(emojiName:kotlin.String?,filename:kotlin.collections.List<java.io.File>?,context:OperationRequest):Response<JsonSuccess>
    companion object {
        const val address = "ServerAndOrganizationsApi-service"
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
            for (m in ServerAndOrganizationsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(ServerAndOrganizationsApi::class.java, address)
            return routerFactory
        }
    }
}
