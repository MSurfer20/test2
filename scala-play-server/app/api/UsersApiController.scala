package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CodedError
import model.JsObject
import model.JsonError
import model.JsonSuccess
import model.JsonSuccessBase
import model.OasAnyTypeNotMapped
import model.OneOfobjectobject
import model.OneOfobjectobjectobject
import model.OneOfobjectobjectobjectobjectobjectobject

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-10T11:47:30.086135Z[Etc/UTC]")
@Singleton
class UsersApiController @Inject()(cc: ControllerComponents, api: UsersApi) extends AbstractController(cc) {
  /**
    * POST /api/v1/users?email=[value]&password=[value]&fullName=[value]
    */
  def createUser(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      val email = request.getQueryString("email")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("email", "query string")
        }
      val password = request.getQueryString("password")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("password", "query string")
        }
      val fullName = request.getQueryString("full_name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("full_name", "query string")
        }
      api.createUser(email, password, fullName)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/v1/user_groups/create?name=[value]&description=[value]&members=[value]
    */
  def createUserGroup(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      val name = request.getQueryString("name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("name", "query string")
        }
      val description = request.getQueryString("description")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("description", "query string")
        }
      val members = request.queryString.get("members")
        .map(_.toList)
        .map(_.map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("members", "query string")
        }
      api.createUserGroup(name, description, members)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/v1/users/me
    */
  def deactivateOwnUser(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      api.deactivateOwnUser()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/v1/users/:userId
    * @param userId The target user&#39;s ID. 
    */
  def deactivateUser(userId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      api.deactivateUser(userId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/attachments
    */
  def getAttachments(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      api.getAttachments()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/users/me
    */
  def getOwnUser(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      api.getOwnUser()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/users/:userId?clientGravatar=[value]&includeCustomProfileFields=[value]
    * @param userId The target user&#39;s ID. 
    */
  def getUser(userId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      val clientGravatar = request.getQueryString("client_gravatar")
        .map(value => value.toBoolean)
      val includeCustomProfileFields = request.getQueryString("include_custom_profile_fields")
        .map(value => value.toBoolean)
      api.getUser(userId, clientGravatar, includeCustomProfileFields)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/users/:email?clientGravatar=[value]&includeCustomProfileFields=[value]
    * @param email The email address of the user whose details you want to fetch. 
    */
  def getUserByEmail(email: String): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      val clientGravatar = request.getQueryString("client_gravatar")
        .map(value => value.toBoolean)
      val includeCustomProfileFields = request.getQueryString("include_custom_profile_fields")
        .map(value => value.toBoolean)
      api.getUserByEmail(email, clientGravatar, includeCustomProfileFields)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/user_groups
    */
  def getUserGroups(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      api.getUserGroups()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/users/:userIdOrEmail/presence
    * @param userIdOrEmail The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. 
    */
  def getUserPresence(userIdOrEmail: String): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      api.getUserPresence(userIdOrEmail)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/users?clientGravatar=[value]&includeCustomProfileFields=[value]
    */
  def getUsers(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      val clientGravatar = request.getQueryString("client_gravatar")
        .map(value => value.toBoolean)
      val includeCustomProfileFields = request.getQueryString("include_custom_profile_fields")
        .map(value => value.toBoolean)
      api.getUsers(clientGravatar, includeCustomProfileFields)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/v1/users/me/muted_users/:mutedUserId
    * @param mutedUserId The ID of the user to mute/un-mute. 
    */
  def muteUser(mutedUserId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      api.muteUser(mutedUserId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/v1/users/:userId/reactivate
    * @param userId The target user&#39;s ID. 
    */
  def reactivateUser(userId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): OasAnyTypeNotMapped = {
      api.reactivateUser(userId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/v1/user_groups/:userGroupId
    * @param userGroupId The ID of the target user group. 
    */
  def removeUserGroup(userGroupId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      api.removeUserGroup(userGroupId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/v1/typing?`type`=[value]&op=[value]&to=[value]&topic=[value]
    */
  def setTypingStatus(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      val `type` = request.getQueryString("type")
        
      val op = request.getQueryString("op")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("op", "query string")
        }
      val to = request.queryString.get("to")
        .map(_.toList)
        .map(_.map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("to", "query string")
        }
      val topic = request.getQueryString("topic")
        
      api.setTypingStatus(op, to, `type`, topic)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/v1/users/me/muted_users/:mutedUserId
    * @param mutedUserId The ID of the user to mute/un-mute. 
    */
  def unmuteUser(mutedUserId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      api.unmuteUser(mutedUserId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /api/v1/settings?fullName=[value]&email=[value]&oldPassword=[value]&newPassword=[value]&twentyFourHourTime=[value]&denseMode=[value]&starredMessageCounts=[value]&fluidLayoutWidth=[value]&highContrastMode=[value]&colorScheme=[value]&enableDraftsSynchronization=[value]&translateEmoticons=[value]&defaultLanguage=[value]&defaultView=[value]&leftSideUserlist=[value]&emojiset=[value]&demoteInactiveStreams=[value]&timezone=[value]&enableStreamDesktopNotifications=[value]&enableStreamEmailNotifications=[value]&enableStreamPushNotifications=[value]&enableStreamAudibleNotifications=[value]&notificationSound=[value]&enableDesktopNotifications=[value]&enableSounds=[value]&emailNotificationsBatchingPeriodSeconds=[value]&enableOfflineEmailNotifications=[value]&enableOfflinePushNotifications=[value]&enableOnlinePushNotifications=[value]&enableDigestEmails=[value]&enableMarketingEmails=[value]&enableLoginEmails=[value]&messageContentInEmailNotifications=[value]&pmContentInDesktopNotifications=[value]&wildcardMentionsNotify=[value]&desktopIconCountDisplay=[value]&realmNameInNotifications=[value]&presenceEnabled=[value]&enterSends=[value]
    */
  def updateSettings(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      val fullName = request.getQueryString("full_name")
        
      val email = request.getQueryString("email")
        
      val oldPassword = request.getQueryString("old_password")
        
      val newPassword = request.getQueryString("new_password")
        
      val twentyFourHourTime = request.getQueryString("twenty_four_hour_time")
        .map(value => value.toBoolean)
      val denseMode = request.getQueryString("dense_mode")
        .map(value => value.toBoolean)
      val starredMessageCounts = request.getQueryString("starred_message_counts")
        .map(value => value.toBoolean)
      val fluidLayoutWidth = request.getQueryString("fluid_layout_width")
        .map(value => value.toBoolean)
      val highContrastMode = request.getQueryString("high_contrast_mode")
        .map(value => value.toBoolean)
      val colorScheme = request.getQueryString("color_scheme")
        .map(value => value.toInt)
      val enableDraftsSynchronization = request.getQueryString("enable_drafts_synchronization")
        .map(value => value.toBoolean)
      val translateEmoticons = request.getQueryString("translate_emoticons")
        .map(value => value.toBoolean)
      val defaultLanguage = request.getQueryString("default_language")
        
      val defaultView = request.getQueryString("default_view")
        
      val leftSideUserlist = request.getQueryString("left_side_userlist")
        .map(value => value.toBoolean)
      val emojiset = request.getQueryString("emojiset")
        
      val demoteInactiveStreams = request.getQueryString("demote_inactive_streams")
        .map(value => value.toInt)
      val timezone = request.getQueryString("timezone")
        
      val enableStreamDesktopNotifications = request.getQueryString("enable_stream_desktop_notifications")
        .map(value => value.toBoolean)
      val enableStreamEmailNotifications = request.getQueryString("enable_stream_email_notifications")
        .map(value => value.toBoolean)
      val enableStreamPushNotifications = request.getQueryString("enable_stream_push_notifications")
        .map(value => value.toBoolean)
      val enableStreamAudibleNotifications = request.getQueryString("enable_stream_audible_notifications")
        .map(value => value.toBoolean)
      val notificationSound = request.getQueryString("notification_sound")
        
      val enableDesktopNotifications = request.getQueryString("enable_desktop_notifications")
        .map(value => value.toBoolean)
      val enableSounds = request.getQueryString("enable_sounds")
        .map(value => value.toBoolean)
      val emailNotificationsBatchingPeriodSeconds = request.getQueryString("email_notifications_batching_period_seconds")
        .map(value => value.toInt)
      val enableOfflineEmailNotifications = request.getQueryString("enable_offline_email_notifications")
        .map(value => value.toBoolean)
      val enableOfflinePushNotifications = request.getQueryString("enable_offline_push_notifications")
        .map(value => value.toBoolean)
      val enableOnlinePushNotifications = request.getQueryString("enable_online_push_notifications")
        .map(value => value.toBoolean)
      val enableDigestEmails = request.getQueryString("enable_digest_emails")
        .map(value => value.toBoolean)
      val enableMarketingEmails = request.getQueryString("enable_marketing_emails")
        .map(value => value.toBoolean)
      val enableLoginEmails = request.getQueryString("enable_login_emails")
        .map(value => value.toBoolean)
      val messageContentInEmailNotifications = request.getQueryString("message_content_in_email_notifications")
        .map(value => value.toBoolean)
      val pmContentInDesktopNotifications = request.getQueryString("pm_content_in_desktop_notifications")
        .map(value => value.toBoolean)
      val wildcardMentionsNotify = request.getQueryString("wildcard_mentions_notify")
        .map(value => value.toBoolean)
      val desktopIconCountDisplay = request.getQueryString("desktop_icon_count_display")
        .map(value => value.toInt)
      val realmNameInNotifications = request.getQueryString("realm_name_in_notifications")
        .map(value => value.toBoolean)
      val presenceEnabled = request.getQueryString("presence_enabled")
        .map(value => value.toBoolean)
      val enterSends = request.getQueryString("enter_sends")
        .map(value => value.toBoolean)
      api.updateSettings(fullName, email, oldPassword, newPassword, twentyFourHourTime, denseMode, starredMessageCounts, fluidLayoutWidth, highContrastMode, colorScheme, enableDraftsSynchronization, translateEmoticons, defaultLanguage, defaultView, leftSideUserlist, emojiset, demoteInactiveStreams, timezone, enableStreamDesktopNotifications, enableStreamEmailNotifications, enableStreamPushNotifications, enableStreamAudibleNotifications, notificationSound, enableDesktopNotifications, enableSounds, emailNotificationsBatchingPeriodSeconds, enableOfflineEmailNotifications, enableOfflinePushNotifications, enableOnlinePushNotifications, enableDigestEmails, enableMarketingEmails, enableLoginEmails, messageContentInEmailNotifications, pmContentInDesktopNotifications, wildcardMentionsNotify, desktopIconCountDisplay, realmNameInNotifications, presenceEnabled, enterSends)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/v1/users/me/status?statusText=[value]&away=[value]&emojiName=[value]&emojiCode=[value]&reactionType=[value]
    */
  def updateStatus(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      val statusText = request.getQueryString("status_text")
        
      val away = request.getQueryString("away")
        .map(value => value.toBoolean)
      val emojiName = request.getQueryString("emoji_name")
        
      val emojiCode = request.getQueryString("emoji_code")
        
      val reactionType = request.getQueryString("reaction_type")
        
      api.updateStatus(statusText, away, emojiName, emojiCode, reactionType)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /api/v1/users/:userId?fullName=[value]&role=[value]&profileData=[value]
    * @param userId The target user&#39;s ID. 
    */
  def updateUser(userId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      val fullName = request.getQueryString("full_name")
        
      val role = request.getQueryString("role")
        .map(value => value.toInt)
      val profileData = request.queryString.get("profile_data")
        .map(_.toList)
        .map(_.map(value => )
      api.updateUser(userId, fullName, role, profileData)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /api/v1/user_groups/:userGroupId?name=[value]&description=[value]
    * @param userGroupId The ID of the target user group. 
    */
  def updateUserGroup(userGroupId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      val name = request.getQueryString("name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("name", "query string")
        }
      val description = request.getQueryString("description")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("description", "query string")
        }
      api.updateUserGroup(userGroupId, name, description)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/v1/user_groups/:userGroupId/members?delete=[value]&add=[value]
    * @param userGroupId The ID of the target user group. 
    */
  def updateUserGroupMembers(userGroupId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      val delete = request.queryString.get("delete")
        .map(_.toList)
        .map(_.map(value => value.toInt)
      val add = request.queryString.get("add")
        .map(_.toList)
        .map(_.map(value => value.toInt)
      api.updateUserGroupMembers(userGroupId, delete, add)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
