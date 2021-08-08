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
import org.openapitools.server.api.model.JsonError
import org.openapitools.server.api.model.JsonSuccess
import org.openapitools.server.api.model.JsonSuccessBase
import org.openapitools.server.api.model.OneOfLessThanObjectCommaObjectCommaObjectCommaObjectCommaObjectCommaObjectGreaterThan
import org.openapitools.server.api.model.OneOfLessThanObjectCommaObjectCommaObjectGreaterThan
import org.openapitools.server.api.model.OneOfLessThanObjectCommaObjectGreaterThan

class UsersApiVertxProxyHandler(private val vertx: Vertx, private val service: UsersApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "createUser" -> {
                    val params = context.params
                    val email = ApiHandlerUtils.searchStringInJson(params,"email")
                    if(email == null){
                        throw IllegalArgumentException("email is required")
                    }
                    val password = ApiHandlerUtils.searchStringInJson(params,"password")
                    if(password == null){
                        throw IllegalArgumentException("password is required")
                    }
                    val fullName = ApiHandlerUtils.searchStringInJson(params,"full_name")
                    if(fullName == null){
                        throw IllegalArgumentException("fullName is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createUser(email,password,fullName,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createUserGroup" -> {
                    val params = context.params
                    val name = ApiHandlerUtils.searchStringInJson(params,"name")
                    if(name == null){
                        throw IllegalArgumentException("name is required")
                    }
                    val description = ApiHandlerUtils.searchStringInJson(params,"description")
                    if(description == null){
                        throw IllegalArgumentException("description is required")
                    }
                    val membersParam = ApiHandlerUtils.searchJsonArrayInJson(params,"members")
                    if(membersParam == null){
                         throw IllegalArgumentException("members is required")
                    }
                    val members:kotlin.Array<kotlin.Int> = Gson().fromJson(membersParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.Int>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createUserGroup(name,description,members,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "deactivateOwnUser" -> {
                }
        
                "deactivateUser" -> {
                    val params = context.params
                    val userId = ApiHandlerUtils.searchIntegerInJson(params,"user_id")
                    if(userId == null){
                        throw IllegalArgumentException("userId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deactivateUser(userId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getAttachments" -> {
                }
        
                "getOwnUser" -> {
                }
        
                "getUser" -> {
                    val params = context.params
                    val userId = ApiHandlerUtils.searchIntegerInJson(params,"user_id")
                    if(userId == null){
                        throw IllegalArgumentException("userId is required")
                    }
                    val clientGravatar = ApiHandlerUtils.searchStringInJson(params,"client_gravatar")?.toBoolean()
                    val includeCustomProfileFields = ApiHandlerUtils.searchStringInJson(params,"include_custom_profile_fields")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getUser(userId,clientGravatar,includeCustomProfileFields,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getUserByEmail" -> {
                    val params = context.params
                    val email = ApiHandlerUtils.searchStringInJson(params,"email")
                    if(email == null){
                        throw IllegalArgumentException("email is required")
                    }
                    val clientGravatar = ApiHandlerUtils.searchStringInJson(params,"client_gravatar")?.toBoolean()
                    val includeCustomProfileFields = ApiHandlerUtils.searchStringInJson(params,"include_custom_profile_fields")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getUserByEmail(email,clientGravatar,includeCustomProfileFields,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getUserGroups" -> {
                }
        
                "getUserPresence" -> {
                    val params = context.params
                    val userIdOrEmail = ApiHandlerUtils.searchStringInJson(params,"user_id_or_email")
                    if(userIdOrEmail == null){
                        throw IllegalArgumentException("userIdOrEmail is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getUserPresence(userIdOrEmail,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getUsers" -> {
                    val params = context.params
                    val clientGravatar = ApiHandlerUtils.searchStringInJson(params,"client_gravatar")?.toBoolean()
                    val includeCustomProfileFields = ApiHandlerUtils.searchStringInJson(params,"include_custom_profile_fields")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getUsers(clientGravatar,includeCustomProfileFields,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "muteUser" -> {
                    val params = context.params
                    val mutedUserId = ApiHandlerUtils.searchIntegerInJson(params,"muted_user_id")
                    if(mutedUserId == null){
                        throw IllegalArgumentException("mutedUserId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.muteUser(mutedUserId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "reactivateUser" -> {
                    val params = context.params
                    val userId = ApiHandlerUtils.searchIntegerInJson(params,"user_id")
                    if(userId == null){
                        throw IllegalArgumentException("userId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.reactivateUser(userId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "removeUserGroup" -> {
                    val params = context.params
                    val userGroupId = ApiHandlerUtils.searchIntegerInJson(params,"user_group_id")
                    if(userGroupId == null){
                        throw IllegalArgumentException("userGroupId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.removeUserGroup(userGroupId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "setTypingStatus" -> {
                    val params = context.params
                    val op = ApiHandlerUtils.searchStringInJson(params,"op")
                    if(op == null){
                        throw IllegalArgumentException("op is required")
                    }
                    val toParam = ApiHandlerUtils.searchJsonArrayInJson(params,"to")
                    if(toParam == null){
                         throw IllegalArgumentException("to is required")
                    }
                    val to:kotlin.Array<kotlin.Int> = Gson().fromJson(toParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.Int>>(){}.type)
                    val type = ApiHandlerUtils.searchStringInJson(params,"type")
                    val topic = ApiHandlerUtils.searchStringInJson(params,"topic")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.setTypingStatus(op,to,type,topic,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "unmuteUser" -> {
                    val params = context.params
                    val mutedUserId = ApiHandlerUtils.searchIntegerInJson(params,"muted_user_id")
                    if(mutedUserId == null){
                        throw IllegalArgumentException("mutedUserId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.unmuteUser(mutedUserId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateSettings" -> {
                    val params = context.params
                    val fullName = ApiHandlerUtils.searchStringInJson(params,"full_name")
                    val email = ApiHandlerUtils.searchStringInJson(params,"email")
                    val oldPassword = ApiHandlerUtils.searchStringInJson(params,"old_password")
                    val newPassword = ApiHandlerUtils.searchStringInJson(params,"new_password")
                    val twentyFourHourTime = ApiHandlerUtils.searchStringInJson(params,"twenty_four_hour_time")?.toBoolean()
                    val denseMode = ApiHandlerUtils.searchStringInJson(params,"dense_mode")?.toBoolean()
                    val starredMessageCounts = ApiHandlerUtils.searchStringInJson(params,"starred_message_counts")?.toBoolean()
                    val fluidLayoutWidth = ApiHandlerUtils.searchStringInJson(params,"fluid_layout_width")?.toBoolean()
                    val highContrastMode = ApiHandlerUtils.searchStringInJson(params,"high_contrast_mode")?.toBoolean()
                    val colorScheme = ApiHandlerUtils.searchIntegerInJson(params,"color_scheme")
                    val enableDraftsSynchronization = ApiHandlerUtils.searchStringInJson(params,"enable_drafts_synchronization")?.toBoolean()
                    val translateEmoticons = ApiHandlerUtils.searchStringInJson(params,"translate_emoticons")?.toBoolean()
                    val defaultLanguage = ApiHandlerUtils.searchStringInJson(params,"default_language")
                    val defaultView = ApiHandlerUtils.searchStringInJson(params,"default_view")
                    val leftSideUserlist = ApiHandlerUtils.searchStringInJson(params,"left_side_userlist")?.toBoolean()
                    val emojiset = ApiHandlerUtils.searchStringInJson(params,"emojiset")
                    val demoteInactiveStreams = ApiHandlerUtils.searchIntegerInJson(params,"demote_inactive_streams")
                    val timezone = ApiHandlerUtils.searchStringInJson(params,"timezone")
                    val enableStreamDesktopNotifications = ApiHandlerUtils.searchStringInJson(params,"enable_stream_desktop_notifications")?.toBoolean()
                    val enableStreamEmailNotifications = ApiHandlerUtils.searchStringInJson(params,"enable_stream_email_notifications")?.toBoolean()
                    val enableStreamPushNotifications = ApiHandlerUtils.searchStringInJson(params,"enable_stream_push_notifications")?.toBoolean()
                    val enableStreamAudibleNotifications = ApiHandlerUtils.searchStringInJson(params,"enable_stream_audible_notifications")?.toBoolean()
                    val notificationSound = ApiHandlerUtils.searchStringInJson(params,"notification_sound")
                    val enableDesktopNotifications = ApiHandlerUtils.searchStringInJson(params,"enable_desktop_notifications")?.toBoolean()
                    val enableSounds = ApiHandlerUtils.searchStringInJson(params,"enable_sounds")?.toBoolean()
                    val emailNotificationsBatchingPeriodSeconds = ApiHandlerUtils.searchIntegerInJson(params,"email_notifications_batching_period_seconds")
                    val enableOfflineEmailNotifications = ApiHandlerUtils.searchStringInJson(params,"enable_offline_email_notifications")?.toBoolean()
                    val enableOfflinePushNotifications = ApiHandlerUtils.searchStringInJson(params,"enable_offline_push_notifications")?.toBoolean()
                    val enableOnlinePushNotifications = ApiHandlerUtils.searchStringInJson(params,"enable_online_push_notifications")?.toBoolean()
                    val enableDigestEmails = ApiHandlerUtils.searchStringInJson(params,"enable_digest_emails")?.toBoolean()
                    val enableMarketingEmails = ApiHandlerUtils.searchStringInJson(params,"enable_marketing_emails")?.toBoolean()
                    val enableLoginEmails = ApiHandlerUtils.searchStringInJson(params,"enable_login_emails")?.toBoolean()
                    val messageContentInEmailNotifications = ApiHandlerUtils.searchStringInJson(params,"message_content_in_email_notifications")?.toBoolean()
                    val pmContentInDesktopNotifications = ApiHandlerUtils.searchStringInJson(params,"pm_content_in_desktop_notifications")?.toBoolean()
                    val wildcardMentionsNotify = ApiHandlerUtils.searchStringInJson(params,"wildcard_mentions_notify")?.toBoolean()
                    val desktopIconCountDisplay = ApiHandlerUtils.searchIntegerInJson(params,"desktop_icon_count_display")
                    val realmNameInNotifications = ApiHandlerUtils.searchStringInJson(params,"realm_name_in_notifications")?.toBoolean()
                    val presenceEnabled = ApiHandlerUtils.searchStringInJson(params,"presence_enabled")?.toBoolean()
                    val enterSends = ApiHandlerUtils.searchStringInJson(params,"enter_sends")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateSettings(fullName,email,oldPassword,newPassword,twentyFourHourTime,denseMode,starredMessageCounts,fluidLayoutWidth,highContrastMode,colorScheme,enableDraftsSynchronization,translateEmoticons,defaultLanguage,defaultView,leftSideUserlist,emojiset,demoteInactiveStreams,timezone,enableStreamDesktopNotifications,enableStreamEmailNotifications,enableStreamPushNotifications,enableStreamAudibleNotifications,notificationSound,enableDesktopNotifications,enableSounds,emailNotificationsBatchingPeriodSeconds,enableOfflineEmailNotifications,enableOfflinePushNotifications,enableOnlinePushNotifications,enableDigestEmails,enableMarketingEmails,enableLoginEmails,messageContentInEmailNotifications,pmContentInDesktopNotifications,wildcardMentionsNotify,desktopIconCountDisplay,realmNameInNotifications,presenceEnabled,enterSends,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateStatus" -> {
                    val params = context.params
                    val statusText = ApiHandlerUtils.searchStringInJson(params,"status_text")
                    val away = ApiHandlerUtils.searchStringInJson(params,"away")?.toBoolean()
                    val emojiName = ApiHandlerUtils.searchStringInJson(params,"emoji_name")
                    val emojiCode = ApiHandlerUtils.searchStringInJson(params,"emoji_code")
                    val reactionType = ApiHandlerUtils.searchStringInJson(params,"reaction_type")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateStatus(statusText,away,emojiName,emojiCode,reactionType,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateUser" -> {
                    val params = context.params
                    val userId = ApiHandlerUtils.searchIntegerInJson(params,"user_id")
                    if(userId == null){
                        throw IllegalArgumentException("userId is required")
                    }
                    val fullName = ApiHandlerUtils.searchStringInJson(params,"full_name")
                    val role = ApiHandlerUtils.searchIntegerInJson(params,"role")
                    val profileDataParam = ApiHandlerUtils.searchJsonArrayInJson(params,"profile_data")
                    val profileData:kotlin.Array<kotlin.Any>? = if(profileDataParam == null) null
                            else Gson().fromJson(profileDataParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.Any>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateUser(userId,fullName,role,profileData,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateUserGroup" -> {
                    val params = context.params
                    val userGroupId = ApiHandlerUtils.searchIntegerInJson(params,"user_group_id")
                    if(userGroupId == null){
                        throw IllegalArgumentException("userGroupId is required")
                    }
                    val name = ApiHandlerUtils.searchStringInJson(params,"name")
                    if(name == null){
                        throw IllegalArgumentException("name is required")
                    }
                    val description = ApiHandlerUtils.searchStringInJson(params,"description")
                    if(description == null){
                        throw IllegalArgumentException("description is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateUserGroup(userGroupId,name,description,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateUserGroupMembers" -> {
                    val params = context.params
                    val userGroupId = ApiHandlerUtils.searchIntegerInJson(params,"user_group_id")
                    if(userGroupId == null){
                        throw IllegalArgumentException("userGroupId is required")
                    }
                    val deleteParam = ApiHandlerUtils.searchJsonArrayInJson(params,"delete")
                    val delete:kotlin.Array<kotlin.Int>? = if(deleteParam == null) null
                            else Gson().fromJson(deleteParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.Int>>(){}.type)
                    val addParam = ApiHandlerUtils.searchJsonArrayInJson(params,"add")
                    val add:kotlin.Array<kotlin.Int>? = if(addParam == null) null
                            else Gson().fromJson(addParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.Int>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateUserGroupMembers(userGroupId,delete,add,context)
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
