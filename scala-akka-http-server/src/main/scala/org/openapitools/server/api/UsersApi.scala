package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AnyType
import org.openapitools.server.model.CodedError
import org.openapitools.server.model.JsonError
import org.openapitools.server.model.JsonSuccess
import org.openapitools.server.model.JsonSuccessBase
import org.openapitools.server.model.OneOfobjectobject
import org.openapitools.server.model.OneOfobjectobjectobject
import org.openapitools.server.model.OneOfobjectobjectobjectobjectobjectobject


class UsersApi(
    usersService: UsersApiService,
    usersMarshaller: UsersApiMarshaller
) {

  
  import usersMarshaller._

  lazy val route: Route =
    path("users") { 
      post { 
        parameters("email".as[String], "password".as[String], "full_name".as[String]) { (email, password, fullName) => 
            usersService.createUser(email = email, password = password, fullName = fullName)
        }
      }
    } ~
    path("user_groups" / "create") { 
      post { 
        parameters("name".as[String], "description".as[String], "members".as[String]) { (name, description, members) => 
            usersService.createUserGroup(name = name, description = description, members = members)
        }
      }
    } ~
    path("users" / "me") { 
      delete {  
            usersService.deactivateOwnUser()
      }
    } ~
    path("users" / IntNumber) { (userId) => 
      delete {  
            usersService.deactivateUser(userId = userId)
      }
    } ~
    path("attachments") { 
      get {  
            usersService.getAttachments()
      }
    } ~
    path("users" / "me") { 
      get {  
            usersService.getOwnUser()
      }
    } ~
    path("users" / IntNumber) { (userId) => 
      get { 
        parameters("client_gravatar".as[Boolean].?(false), "include_custom_profile_fields".as[Boolean].?(false)) { (clientGravatar, includeCustomProfileFields) => 
            usersService.getUser(userId = userId, clientGravatar = clientGravatar, includeCustomProfileFields = includeCustomProfileFields)
        }
      }
    } ~
    path("users" / Segment) { (email) => 
      get { 
        parameters("client_gravatar".as[Boolean].?(false), "include_custom_profile_fields".as[Boolean].?(false)) { (clientGravatar, includeCustomProfileFields) => 
            usersService.getUserByEmail(email = email, clientGravatar = clientGravatar, includeCustomProfileFields = includeCustomProfileFields)
        }
      }
    } ~
    path("user_groups") { 
      get {  
            usersService.getUserGroups()
      }
    } ~
    path("users" / Segment / "presence") { (userIdOrEmail) => 
      get {  
            usersService.getUserPresence(userIdOrEmail = userIdOrEmail)
      }
    } ~
    path("users") { 
      get { 
        parameters("client_gravatar".as[Boolean].?(false), "include_custom_profile_fields".as[Boolean].?(false)) { (clientGravatar, includeCustomProfileFields) => 
            usersService.getUsers(clientGravatar = clientGravatar, includeCustomProfileFields = includeCustomProfileFields)
        }
      }
    } ~
    path("users" / "me" / "muted_users" / IntNumber) { (mutedUserId) => 
      post {  
            usersService.muteUser(mutedUserId = mutedUserId)
      }
    } ~
    path("users" / IntNumber / "reactivate") { (userId) => 
      post {  
            usersService.reactivateUser(userId = userId)
      }
    } ~
    path("user_groups" / IntNumber) { (userGroupId) => 
      delete {  
            usersService.removeUserGroup(userGroupId = userGroupId)
      }
    } ~
    path("typing") { 
      post { 
        parameters("type".as[String].?("private"), "op".as[String], "to".as[String], "topic".as[String].?) { (`type`, op, to, topic) => 
            usersService.setTypingStatus(op = op, to = to, `type` = `type`, topic = topic)
        }
      }
    } ~
    path("users" / "me" / "muted_users" / IntNumber) { (mutedUserId) => 
      delete {  
            usersService.unmuteUser(mutedUserId = mutedUserId)
      }
    } ~
    path("settings") { 
      patch { 
        parameters("full_name".as[String].?, "email".as[String].?, "old_password".as[String].?, "new_password".as[String].?, "twenty_four_hour_time".as[Boolean].?, "dense_mode".as[Boolean].?, "starred_message_counts".as[Boolean].?, "fluid_layout_width".as[Boolean].?, "high_contrast_mode".as[Boolean].?, "color_scheme".as[Int].?, "enable_drafts_synchronization".as[Boolean].?, "translate_emoticons".as[Boolean].?, "default_language".as[String].?, "default_view".as[String].?, "left_side_userlist".as[Boolean].?, "emojiset".as[String].?, "demote_inactive_streams".as[Int].?, "timezone".as[String].?, "enable_stream_desktop_notifications".as[Boolean].?, "enable_stream_email_notifications".as[Boolean].?, "enable_stream_push_notifications".as[Boolean].?, "enable_stream_audible_notifications".as[Boolean].?, "notification_sound".as[String].?, "enable_desktop_notifications".as[Boolean].?, "enable_sounds".as[Boolean].?, "email_notifications_batching_period_seconds".as[Int].?, "enable_offline_email_notifications".as[Boolean].?, "enable_offline_push_notifications".as[Boolean].?, "enable_online_push_notifications".as[Boolean].?, "enable_digest_emails".as[Boolean].?, "enable_marketing_emails".as[Boolean].?, "enable_login_emails".as[Boolean].?, "message_content_in_email_notifications".as[Boolean].?, "pm_content_in_desktop_notifications".as[Boolean].?, "wildcard_mentions_notify".as[Boolean].?, "desktop_icon_count_display".as[Int].?, "realm_name_in_notifications".as[Boolean].?, "presence_enabled".as[Boolean].?, "enter_sends".as[Boolean].?) { (fullName, email, oldPassword, newPassword, twentyFourHourTime, denseMode, starredMessageCounts, fluidLayoutWidth, highContrastMode, colorScheme, enableDraftsSynchronization, translateEmoticons, defaultLanguage, defaultView, leftSideUserlist, emojiset, demoteInactiveStreams, timezone, enableStreamDesktopNotifications, enableStreamEmailNotifications, enableStreamPushNotifications, enableStreamAudibleNotifications, notificationSound, enableDesktopNotifications, enableSounds, emailNotificationsBatchingPeriodSeconds, enableOfflineEmailNotifications, enableOfflinePushNotifications, enableOnlinePushNotifications, enableDigestEmails, enableMarketingEmails, enableLoginEmails, messageContentInEmailNotifications, pmContentInDesktopNotifications, wildcardMentionsNotify, desktopIconCountDisplay, realmNameInNotifications, presenceEnabled, enterSends) => 
            usersService.updateSettings(fullName = fullName, email = email, oldPassword = oldPassword, newPassword = newPassword, twentyFourHourTime = twentyFourHourTime, denseMode = denseMode, starredMessageCounts = starredMessageCounts, fluidLayoutWidth = fluidLayoutWidth, highContrastMode = highContrastMode, colorScheme = colorScheme, enableDraftsSynchronization = enableDraftsSynchronization, translateEmoticons = translateEmoticons, defaultLanguage = defaultLanguage, defaultView = defaultView, leftSideUserlist = leftSideUserlist, emojiset = emojiset, demoteInactiveStreams = demoteInactiveStreams, timezone = timezone, enableStreamDesktopNotifications = enableStreamDesktopNotifications, enableStreamEmailNotifications = enableStreamEmailNotifications, enableStreamPushNotifications = enableStreamPushNotifications, enableStreamAudibleNotifications = enableStreamAudibleNotifications, notificationSound = notificationSound, enableDesktopNotifications = enableDesktopNotifications, enableSounds = enableSounds, emailNotificationsBatchingPeriodSeconds = emailNotificationsBatchingPeriodSeconds, enableOfflineEmailNotifications = enableOfflineEmailNotifications, enableOfflinePushNotifications = enableOfflinePushNotifications, enableOnlinePushNotifications = enableOnlinePushNotifications, enableDigestEmails = enableDigestEmails, enableMarketingEmails = enableMarketingEmails, enableLoginEmails = enableLoginEmails, messageContentInEmailNotifications = messageContentInEmailNotifications, pmContentInDesktopNotifications = pmContentInDesktopNotifications, wildcardMentionsNotify = wildcardMentionsNotify, desktopIconCountDisplay = desktopIconCountDisplay, realmNameInNotifications = realmNameInNotifications, presenceEnabled = presenceEnabled, enterSends = enterSends)
        }
      }
    } ~
    path("users" / "me" / "status") { 
      post { 
        parameters("status_text".as[String].?, "away".as[Boolean].?, "emoji_name".as[String].?, "emoji_code".as[String].?, "reaction_type".as[String].?) { (statusText, away, emojiName, emojiCode, reactionType) => 
            usersService.updateStatus(statusText = statusText, away = away, emojiName = emojiName, emojiCode = emojiCode, reactionType = reactionType)
        }
      }
    } ~
    path("users" / IntNumber) { (userId) => 
      patch { 
        parameters("full_name".as[String].?, "role".as[Int].?, "profile_data".as[String].?("new ListBuffer[Any]() ")) { (fullName, role, profileData) => 
            usersService.updateUser(userId = userId, fullName = fullName, role = role, profileData = profileData)
        }
      }
    } ~
    path("user_groups" / IntNumber) { (userGroupId) => 
      patch { 
        parameters("name".as[String], "description".as[String]) { (name, description) => 
            usersService.updateUserGroup(userGroupId = userGroupId, name = name, description = description)
        }
      }
    } ~
    path("user_groups" / IntNumber / "members") { (userGroupId) => 
      post { 
        parameters("delete".as[String].?("new ListBuffer[Int]() "), "add".as[String].?("new ListBuffer[Int]() ")) { (delete, add) => 
            usersService.updateUserGroupMembers(userGroupId = userGroupId, delete = delete, add = add)
        }
      }
    }
}


trait UsersApiService {

  def createUser200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  def createUser400(responseJsonError: JsonError)(implicit toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route =
    complete((400, responseJsonError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   * Code: 400, Message: Bad request., DataType: JsonError
   */
  def createUser(email: String, password: String, fullName: String)
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase], toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route

  def createUserGroup200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  def createUserGroup400(responseJsonError: JsonError)(implicit toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route =
    complete((400, responseJsonError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   * Code: 400, Message: Bad request., DataType: JsonError
   */
  def createUserGroup(name: String, description: String, members: String)
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess], toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route

  def deactivateOwnUser200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  def deactivateOwnUser400(responseJsonError: JsonError)(implicit toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route =
    complete((400, responseJsonError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   * Code: 400, Message: Bad request., DataType: JsonError
   */
  def deactivateOwnUser()
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess], toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route

  def deactivateUser200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  def deactivateUser400(responseJsonError: JsonError)(implicit toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route =
    complete((400, responseJsonError))
  /**
   * Code: 200, Message: Success, DataType: JsonSuccess
   * Code: 400, Message: Bad request, DataType: JsonError
   */
  def deactivateUser(userId: Int)
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess], toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route

  def getAttachments200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   */
  def getAttachments()
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def getOwnUser200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success, DataType: JsonSuccessBase
   */
  def getOwnUser()
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def getUser200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   */
  def getUser(userId: Int, clientGravatar: Boolean, includeCustomProfileFields: Boolean)
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def getUserByEmail200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   */
  def getUserByEmail(email: String, clientGravatar: Boolean, includeCustomProfileFields: Boolean)
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def getUserGroups200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   */
  def getUserGroups()
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def getUserPresence200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   */
  def getUserPresence(userIdOrEmail: String)
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def getUsers200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   */
  def getUsers(clientGravatar: Boolean, includeCustomProfileFields: Boolean)
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def muteUser200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  def muteUser400(responseOneOfobjectobjectobject: OneOfobjectobjectobject)(implicit toEntityMarshallerOneOfobjectobjectobject: ToEntityMarshaller[OneOfobjectobjectobject]): Route =
    complete((400, responseOneOfobjectobjectobject))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   * Code: 400, Message: Bad request., DataType: OneOfobjectobjectobject
   */
  def muteUser(mutedUserId: Int)
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess], toEntityMarshallerOneOfobjectobjectobject: ToEntityMarshaller[OneOfobjectobjectobject]): Route

  def reactivateUser200(responseAnyType: AnyType)(implicit toEntityMarshallerAnyType: ToEntityMarshaller[AnyType]): Route =
    complete((200, responseAnyType))
  /**
   * Code: 200, Message: Success, DataType: AnyType
   */
  def reactivateUser(userId: Int)
      (implicit toEntityMarshallerAnyType: ToEntityMarshaller[AnyType]): Route

  def removeUserGroup200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  def removeUserGroup400(responseJsonError: JsonError)(implicit toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route =
    complete((400, responseJsonError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   * Code: 400, Message: Bad request., DataType: JsonError
   */
  def removeUserGroup(userGroupId: Int)
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess], toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route

  def setTypingStatus200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  def setTypingStatus400(responseJsonError: JsonError)(implicit toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route =
    complete((400, responseJsonError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   * Code: 400, Message: Bad request., DataType: JsonError
   */
  def setTypingStatus(op: String, to: String, `type`: String, topic: Option[String])
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess], toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route

  def unmuteUser200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  def unmuteUser400(responseOneOfobjectobject: OneOfobjectobject)(implicit toEntityMarshallerOneOfobjectobject: ToEntityMarshaller[OneOfobjectobject]): Route =
    complete((400, responseOneOfobjectobject))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   * Code: 400, Message: Bad request., DataType: OneOfobjectobject
   */
  def unmuteUser(mutedUserId: Int)
      (implicit toEntityMarshallerOneOfobjectobject: ToEntityMarshaller[OneOfobjectobject], toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route

  def updateSettings200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success, DataType: JsonSuccessBase
   */
  def updateSettings(fullName: Option[String], email: Option[String], oldPassword: Option[String], newPassword: Option[String], twentyFourHourTime: Option[Boolean], denseMode: Option[Boolean], starredMessageCounts: Option[Boolean], fluidLayoutWidth: Option[Boolean], highContrastMode: Option[Boolean], colorScheme: Option[Int], enableDraftsSynchronization: Option[Boolean], translateEmoticons: Option[Boolean], defaultLanguage: Option[String], defaultView: Option[String], leftSideUserlist: Option[Boolean], emojiset: Option[String], demoteInactiveStreams: Option[Int], timezone: Option[String], enableStreamDesktopNotifications: Option[Boolean], enableStreamEmailNotifications: Option[Boolean], enableStreamPushNotifications: Option[Boolean], enableStreamAudibleNotifications: Option[Boolean], notificationSound: Option[String], enableDesktopNotifications: Option[Boolean], enableSounds: Option[Boolean], emailNotificationsBatchingPeriodSeconds: Option[Int], enableOfflineEmailNotifications: Option[Boolean], enableOfflinePushNotifications: Option[Boolean], enableOnlinePushNotifications: Option[Boolean], enableDigestEmails: Option[Boolean], enableMarketingEmails: Option[Boolean], enableLoginEmails: Option[Boolean], messageContentInEmailNotifications: Option[Boolean], pmContentInDesktopNotifications: Option[Boolean], wildcardMentionsNotify: Option[Boolean], desktopIconCountDisplay: Option[Int], realmNameInNotifications: Option[Boolean], presenceEnabled: Option[Boolean], enterSends: Option[Boolean])
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def updateStatus200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  def updateStatus400(responseOneOfobjectobjectobjectobjectobjectobject: OneOfobjectobjectobjectobjectobjectobject)(implicit toEntityMarshallerOneOfobjectobjectobjectobjectobjectobject: ToEntityMarshaller[OneOfobjectobjectobjectobjectobjectobject]): Route =
    complete((400, responseOneOfobjectobjectobjectobjectobjectobject))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   * Code: 400, Message: Success., DataType: OneOfobjectobjectobjectobjectobjectobject
   */
  def updateStatus(statusText: Option[String], away: Option[Boolean], emojiName: Option[String], emojiCode: Option[String], reactionType: Option[String])
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess], toEntityMarshallerOneOfobjectobjectobjectobjectobjectobject: ToEntityMarshaller[OneOfobjectobjectobjectobjectobjectobject]): Route

  def updateUser200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  def updateUser400(responseCodedError: CodedError)(implicit toEntityMarshallerCodedError: ToEntityMarshaller[CodedError]): Route =
    complete((400, responseCodedError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   * Code: 400, Message: Bad request., DataType: CodedError
   */
  def updateUser(userId: Int, fullName: Option[String], role: Option[Int], profileData: String)
      (implicit toEntityMarshallerCodedError: ToEntityMarshaller[CodedError], toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route

  def updateUserGroup200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  def updateUserGroup400(responseJsonError: JsonError)(implicit toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route =
    complete((400, responseJsonError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   * Code: 400, Message: Bad request., DataType: JsonError
   */
  def updateUserGroup(userGroupId: Int, name: String, description: String)
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess], toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route

  def updateUserGroupMembers200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   */
  def updateUserGroupMembers(userGroupId: Int, delete: String, add: String)
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route

}

trait UsersApiMarshaller {


  implicit def toEntityMarshallerOneOfobjectobject: ToEntityMarshaller[OneOfobjectobject]

  implicit def toEntityMarshallerCodedError: ToEntityMarshaller[CodedError]

  implicit def toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]

  implicit def toEntityMarshallerAnyType: ToEntityMarshaller[AnyType]

  implicit def toEntityMarshallerOneOfobjectobjectobject: ToEntityMarshaller[OneOfobjectobjectobject]

  implicit def toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]

  implicit def toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]

  implicit def toEntityMarshallerOneOfobjectobjectobjectobjectobjectobject: ToEntityMarshaller[OneOfobjectobjectobjectobjectobjectobject]

}

