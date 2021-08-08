package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.AnyType
import org.openapitools.server.api.model.CodedError
import org.openapitools.server.api.model.JsonError
import org.openapitools.server.api.model.JsonSuccess
import org.openapitools.server.api.model.JsonSuccessBase
import org.openapitools.server.api.model.OneOfLessThanObjectCommaObjectCommaObjectGreaterThan
import org.openapitools.server.api.model.OneOfLessThanObjectCommaObjectGreaterThan
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


interface UsersApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* createUser
     * Create a user */
    suspend fun createUser(email:kotlin.String?,password:kotlin.String?,fullName:kotlin.String?,context:OperationRequest):Response<JsonSuccessBase>
    /* createUserGroup
     * Create a user group */
    suspend fun createUserGroup(name:kotlin.String?,description:kotlin.String?,members:kotlin.Array<kotlin.Int>?,context:OperationRequest):Response<JsonSuccess>
    /* deactivateOwnUser
     * Deactivate own user */
    suspend fun deactivateOwnUser(context:OperationRequest):Response<JsonSuccess>
    /* deactivateUser
     * Deactivate a user */
    suspend fun deactivateUser(userId:kotlin.Int?,context:OperationRequest):Response<JsonSuccess>
    /* getAttachments
     * Get attachments */
    suspend fun getAttachments(context:OperationRequest):Response<JsonSuccessBase>
    /* getOwnUser
     * Get own user */
    suspend fun getOwnUser(context:OperationRequest):Response<JsonSuccessBase>
    /* getUser
     * Get a user */
    suspend fun getUser(userId:kotlin.Int?,clientGravatar:kotlin.Boolean?,includeCustomProfileFields:kotlin.Boolean?,context:OperationRequest):Response<JsonSuccessBase>
    /* getUserByEmail
     * Get a user by email */
    suspend fun getUserByEmail(email:kotlin.String?,clientGravatar:kotlin.Boolean?,includeCustomProfileFields:kotlin.Boolean?,context:OperationRequest):Response<JsonSuccessBase>
    /* getUserGroups
     * Get user groups */
    suspend fun getUserGroups(context:OperationRequest):Response<JsonSuccessBase>
    /* getUserPresence
     * Get user presence */
    suspend fun getUserPresence(userIdOrEmail:kotlin.String?,context:OperationRequest):Response<JsonSuccessBase>
    /* getUsers
     * Get all users */
    suspend fun getUsers(clientGravatar:kotlin.Boolean?,includeCustomProfileFields:kotlin.Boolean?,context:OperationRequest):Response<JsonSuccessBase>
    /* muteUser
     * Mute a user */
    suspend fun muteUser(mutedUserId:kotlin.Int?,context:OperationRequest):Response<JsonSuccess>
    /* reactivateUser
     * Reactivate a user */
    suspend fun reactivateUser(userId:kotlin.Int?,context:OperationRequest):Response<AnyType>
    /* removeUserGroup
     * Delete a user group */
    suspend fun removeUserGroup(userGroupId:kotlin.Int?,context:OperationRequest):Response<JsonSuccess>
    /* setTypingStatus
     * Set \&quot;typing\&quot; status */
    suspend fun setTypingStatus(op:kotlin.String?,to:kotlin.Array<kotlin.Int>?,type:kotlin.String?,topic:kotlin.String?,context:OperationRequest):Response<JsonSuccess>
    /* unmuteUser
     * Unmute a user */
    suspend fun unmuteUser(mutedUserId:kotlin.Int?,context:OperationRequest):Response<JsonSuccess>
    /* updateDisplaySettings
     * Update display settings */
    suspend fun updateDisplaySettings(twentyFourHourTime:kotlin.Boolean?,denseMode:kotlin.Boolean?,starredMessageCounts:kotlin.Boolean?,fluidLayoutWidth:kotlin.Boolean?,highContrastMode:kotlin.Boolean?,colorScheme:kotlin.Int?,translateEmoticons:kotlin.Boolean?,defaultLanguage:kotlin.String?,defaultView:kotlin.String?,leftSideUserlist:kotlin.Boolean?,emojiset:kotlin.String?,demoteInactiveStreams:kotlin.Int?,timezone:kotlin.String?,context:OperationRequest):Response<JsonSuccessBase>
    /* updateNotificationSettings
     * Update notification settings */
    suspend fun updateNotificationSettings(enableStreamDesktopNotifications:kotlin.Boolean?,enableStreamEmailNotifications:kotlin.Boolean?,enableStreamPushNotifications:kotlin.Boolean?,enableStreamAudibleNotifications:kotlin.Boolean?,notificationSound:kotlin.String?,enableDesktopNotifications:kotlin.Boolean?,enableSounds:kotlin.Boolean?,enableOfflineEmailNotifications:kotlin.Boolean?,enableOfflinePushNotifications:kotlin.Boolean?,enableOnlinePushNotifications:kotlin.Boolean?,enableDigestEmails:kotlin.Boolean?,enableMarketingEmails:kotlin.Boolean?,enableLoginEmails:kotlin.Boolean?,messageContentInEmailNotifications:kotlin.Boolean?,pmContentInDesktopNotifications:kotlin.Boolean?,wildcardMentionsNotify:kotlin.Boolean?,desktopIconCountDisplay:kotlin.Int?,realmNameInNotifications:kotlin.Boolean?,presenceEnabled:kotlin.Boolean?,context:OperationRequest):Response<JsonSuccessBase>
    /* updateUser
     * Update a user */
    suspend fun updateUser(userId:kotlin.Int?,fullName:kotlin.String?,role:kotlin.Int?,profileData:kotlin.Array<kotlin.Any>?,context:OperationRequest):Response<JsonSuccess>
    /* updateUserGroup
     * Update a user group */
    suspend fun updateUserGroup(userGroupId:kotlin.Int?,name:kotlin.String?,description:kotlin.String?,context:OperationRequest):Response<JsonSuccess>
    /* updateUserGroupMembers
     * Update user group members */
    suspend fun updateUserGroupMembers(userGroupId:kotlin.Int?,delete:kotlin.Array<kotlin.Int>?,add:kotlin.Array<kotlin.Int>?,context:OperationRequest):Response<JsonSuccess>
    companion object {
        const val address = "UsersApi-service"
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
            for (m in UsersApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(UsersApi::class.java, address)
            return routerFactory
        }
    }
}
