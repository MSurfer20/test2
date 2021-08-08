package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import java.io.File
import java.net.URLEncoder
import java.util.UUID

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.http4s.client._
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.headers._

import org.joda.time.DateTime

import scalaz.concurrent.Task

import HelperCodecs._

import org.openapitools.client.api.AnyType
import org.openapitools.client.api.CodedError
import org.openapitools.client.api.JsonError
import org.openapitools.client.api.JsonSuccess
import org.openapitools.client.api.JsonSuccessBase
import org.openapitools.client.api.OneOfobjectobject
import org.openapitools.client.api.OneOfobjectobjectobject

object UsersApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def createUser(host: String, email: String, password: String, fullName: String)(implicit emailQuery: QueryParam[String], passwordQuery: QueryParam[String], fullNameQuery: QueryParam[String]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("email", Some(emailQuery.toParamString(email))), ("password", Some(passwordQuery.toParamString(password))), ("fullName", Some(full_nameQuery.toParamString(full_name))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def createUserGroup(host: String, name: String, description: String, members: List[Integer] = List.empty[Integer] )(implicit nameQuery: QueryParam[String], descriptionQuery: QueryParam[String], membersQuery: QueryParam[List[Integer]]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/user_groups/create"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("name", Some(nameQuery.toParamString(name))), ("description", Some(descriptionQuery.toParamString(description))), ("members", Some(membersQuery.toParamString(members))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def deactivateOwnUser(host: String): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/users/me"
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def deactivateUser(host: String, userId: Integer): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/users/{user_id}".replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString))
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def getAttachments(host: String): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/attachments"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getOwnUser(host: String): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users/me"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getUser(host: String, userId: Integer, clientGravatar: Boolean = false, includeCustomProfileFields: Boolean = false)(implicit clientGravatarQuery: QueryParam[Boolean], includeCustomProfileFieldsQuery: QueryParam[Boolean]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users/{user_id}".replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("clientGravatar", Some(client_gravatarQuery.toParamString(client_gravatar))), ("includeCustomProfileFields", Some(include_custom_profile_fieldsQuery.toParamString(include_custom_profile_fields))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getUserByEmail(host: String, email: String, clientGravatar: Boolean = false, includeCustomProfileFields: Boolean = false)(implicit clientGravatarQuery: QueryParam[Boolean], includeCustomProfileFieldsQuery: QueryParam[Boolean]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users/{email}".replaceAll("\\{" + "email" + "\\}",escape(email.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("clientGravatar", Some(client_gravatarQuery.toParamString(client_gravatar))), ("includeCustomProfileFields", Some(include_custom_profile_fieldsQuery.toParamString(include_custom_profile_fields))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getUserGroups(host: String): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/user_groups"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getUserPresence(host: String, userIdOrEmail: String): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users/{user_id_or_email}/presence".replaceAll("\\{" + "user_id_or_email" + "\\}",escape(userIdOrEmail.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getUsers(host: String, clientGravatar: Boolean = false, includeCustomProfileFields: Boolean = false)(implicit clientGravatarQuery: QueryParam[Boolean], includeCustomProfileFieldsQuery: QueryParam[Boolean]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("clientGravatar", Some(client_gravatarQuery.toParamString(client_gravatar))), ("includeCustomProfileFields", Some(include_custom_profile_fieldsQuery.toParamString(include_custom_profile_fields))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def muteUser(host: String, mutedUserId: Integer): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/users/me/muted_users/{muted_user_id}".replaceAll("\\{" + "muted_user_id" + "\\}",escape(mutedUserId.toString))
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def reactivateUser(host: String, userId: Integer): Task[AnyType] = {
    implicit val returnTypeDecoder: EntityDecoder[AnyType] = jsonOf[AnyType]

    val path = "/users/{user_id}/reactivate".replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString))
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AnyType](req)

    } yield resp
  }
  
  def removeUserGroup(host: String, userGroupId: Integer): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/user_groups/{user_group_id}".replaceAll("\\{" + "user_group_id" + "\\}",escape(userGroupId.toString))
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def setTypingStatus(host: String, op: String, to: List[Integer] = List.empty[Integer] , `type`: String = private, topic: String)(implicit `type`Query: QueryParam[String], opQuery: QueryParam[String], toQuery: QueryParam[List[Integer]], topicQuery: QueryParam[String]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/typing"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("`type`", Some(typeQuery.toParamString(type))), ("op", Some(opQuery.toParamString(op))), ("to", Some(toQuery.toParamString(to))), ("topic", Some(topicQuery.toParamString(topic))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def unmuteUser(host: String, mutedUserId: Integer): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/users/me/muted_users/{muted_user_id}".replaceAll("\\{" + "muted_user_id" + "\\}",escape(mutedUserId.toString))
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def updateDisplaySettings(host: String, twentyFourHourTime: Boolean, denseMode: Boolean, starredMessageCounts: Boolean, fluidLayoutWidth: Boolean, highContrastMode: Boolean, colorScheme: Integer, translateEmoticons: Boolean, defaultLanguage: String, defaultView: String, leftSideUserlist: Boolean, emojiset: String, demoteInactiveStreams: Integer, timezone: String)(implicit twentyFourHourTimeQuery: QueryParam[Boolean], denseModeQuery: QueryParam[Boolean], starredMessageCountsQuery: QueryParam[Boolean], fluidLayoutWidthQuery: QueryParam[Boolean], highContrastModeQuery: QueryParam[Boolean], colorSchemeQuery: QueryParam[Integer], translateEmoticonsQuery: QueryParam[Boolean], defaultLanguageQuery: QueryParam[String], defaultViewQuery: QueryParam[String], leftSideUserlistQuery: QueryParam[Boolean], emojisetQuery: QueryParam[String], demoteInactiveStreamsQuery: QueryParam[Integer], timezoneQuery: QueryParam[String]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/settings/display"
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("twentyFourHourTime", Some(twenty_four_hour_timeQuery.toParamString(twenty_four_hour_time))), ("denseMode", Some(dense_modeQuery.toParamString(dense_mode))), ("starredMessageCounts", Some(starred_message_countsQuery.toParamString(starred_message_counts))), ("fluidLayoutWidth", Some(fluid_layout_widthQuery.toParamString(fluid_layout_width))), ("highContrastMode", Some(high_contrast_modeQuery.toParamString(high_contrast_mode))), ("colorScheme", Some(color_schemeQuery.toParamString(color_scheme))), ("translateEmoticons", Some(translate_emoticonsQuery.toParamString(translate_emoticons))), ("defaultLanguage", Some(default_languageQuery.toParamString(default_language))), ("defaultView", Some(default_viewQuery.toParamString(default_view))), ("leftSideUserlist", Some(left_side_userlistQuery.toParamString(left_side_userlist))), ("emojiset", Some(emojisetQuery.toParamString(emojiset))), ("demoteInactiveStreams", Some(demote_inactive_streamsQuery.toParamString(demote_inactive_streams))), ("timezone", Some(timezoneQuery.toParamString(timezone))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def updateNotificationSettings(host: String, enableStreamDesktopNotifications: Boolean, enableStreamEmailNotifications: Boolean, enableStreamPushNotifications: Boolean, enableStreamAudibleNotifications: Boolean, notificationSound: String, enableDesktopNotifications: Boolean, enableSounds: Boolean, enableOfflineEmailNotifications: Boolean, enableOfflinePushNotifications: Boolean, enableOnlinePushNotifications: Boolean, enableDigestEmails: Boolean, enableMarketingEmails: Boolean, enableLoginEmails: Boolean, messageContentInEmailNotifications: Boolean, pmContentInDesktopNotifications: Boolean, wildcardMentionsNotify: Boolean, desktopIconCountDisplay: Integer, realmNameInNotifications: Boolean, presenceEnabled: Boolean)(implicit enableStreamDesktopNotificationsQuery: QueryParam[Boolean], enableStreamEmailNotificationsQuery: QueryParam[Boolean], enableStreamPushNotificationsQuery: QueryParam[Boolean], enableStreamAudibleNotificationsQuery: QueryParam[Boolean], notificationSoundQuery: QueryParam[String], enableDesktopNotificationsQuery: QueryParam[Boolean], enableSoundsQuery: QueryParam[Boolean], enableOfflineEmailNotificationsQuery: QueryParam[Boolean], enableOfflinePushNotificationsQuery: QueryParam[Boolean], enableOnlinePushNotificationsQuery: QueryParam[Boolean], enableDigestEmailsQuery: QueryParam[Boolean], enableMarketingEmailsQuery: QueryParam[Boolean], enableLoginEmailsQuery: QueryParam[Boolean], messageContentInEmailNotificationsQuery: QueryParam[Boolean], pmContentInDesktopNotificationsQuery: QueryParam[Boolean], wildcardMentionsNotifyQuery: QueryParam[Boolean], desktopIconCountDisplayQuery: QueryParam[Integer], realmNameInNotificationsQuery: QueryParam[Boolean], presenceEnabledQuery: QueryParam[Boolean]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/settings/notifications"
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("enableStreamDesktopNotifications", Some(enable_stream_desktop_notificationsQuery.toParamString(enable_stream_desktop_notifications))), ("enableStreamEmailNotifications", Some(enable_stream_email_notificationsQuery.toParamString(enable_stream_email_notifications))), ("enableStreamPushNotifications", Some(enable_stream_push_notificationsQuery.toParamString(enable_stream_push_notifications))), ("enableStreamAudibleNotifications", Some(enable_stream_audible_notificationsQuery.toParamString(enable_stream_audible_notifications))), ("notificationSound", Some(notification_soundQuery.toParamString(notification_sound))), ("enableDesktopNotifications", Some(enable_desktop_notificationsQuery.toParamString(enable_desktop_notifications))), ("enableSounds", Some(enable_soundsQuery.toParamString(enable_sounds))), ("enableOfflineEmailNotifications", Some(enable_offline_email_notificationsQuery.toParamString(enable_offline_email_notifications))), ("enableOfflinePushNotifications", Some(enable_offline_push_notificationsQuery.toParamString(enable_offline_push_notifications))), ("enableOnlinePushNotifications", Some(enable_online_push_notificationsQuery.toParamString(enable_online_push_notifications))), ("enableDigestEmails", Some(enable_digest_emailsQuery.toParamString(enable_digest_emails))), ("enableMarketingEmails", Some(enable_marketing_emailsQuery.toParamString(enable_marketing_emails))), ("enableLoginEmails", Some(enable_login_emailsQuery.toParamString(enable_login_emails))), ("messageContentInEmailNotifications", Some(message_content_in_email_notificationsQuery.toParamString(message_content_in_email_notifications))), ("pmContentInDesktopNotifications", Some(pm_content_in_desktop_notificationsQuery.toParamString(pm_content_in_desktop_notifications))), ("wildcardMentionsNotify", Some(wildcard_mentions_notifyQuery.toParamString(wildcard_mentions_notify))), ("desktopIconCountDisplay", Some(desktop_icon_count_displayQuery.toParamString(desktop_icon_count_display))), ("realmNameInNotifications", Some(realm_name_in_notificationsQuery.toParamString(realm_name_in_notifications))), ("presenceEnabled", Some(presence_enabledQuery.toParamString(presence_enabled))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def updateUser(host: String, userId: Integer, fullName: String, role: Integer, profileData: List[Any] = List.empty[Any] )(implicit fullNameQuery: QueryParam[String], roleQuery: QueryParam[Integer], profileDataQuery: QueryParam[List[Any]]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/users/{user_id}".replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString))
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("fullName", Some(full_nameQuery.toParamString(full_name))), ("role", Some(roleQuery.toParamString(role))), ("profileData", Some(profile_dataQuery.toParamString(profile_data))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def updateUserGroup(host: String, userGroupId: Integer, name: String, description: String)(implicit nameQuery: QueryParam[String], descriptionQuery: QueryParam[String]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/user_groups/{user_group_id}".replaceAll("\\{" + "user_group_id" + "\\}",escape(userGroupId.toString))
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("name", Some(nameQuery.toParamString(name))), ("description", Some(descriptionQuery.toParamString(description))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def updateUserGroupMembers(host: String, userGroupId: Integer, delete: List[Integer] = List.empty[Integer] , add: List[Integer] = List.empty[Integer] )(implicit deleteQuery: QueryParam[List[Integer]], addQuery: QueryParam[List[Integer]]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/user_groups/{user_group_id}/members".replaceAll("\\{" + "user_group_id" + "\\}",escape(userGroupId.toString))
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("delete", Some(deleteQuery.toParamString(delete))), ("add", Some(addQuery.toParamString(add))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
}

class HttpServiceUsersApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def createUser(email: String, password: String, fullName: String)(implicit emailQuery: QueryParam[String], passwordQuery: QueryParam[String], fullNameQuery: QueryParam[String]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("email", Some(emailQuery.toParamString(email))), ("password", Some(passwordQuery.toParamString(password))), ("fullName", Some(full_nameQuery.toParamString(full_name))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def createUserGroup(name: String, description: String, members: List[Integer] = List.empty[Integer] )(implicit nameQuery: QueryParam[String], descriptionQuery: QueryParam[String], membersQuery: QueryParam[List[Integer]]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/user_groups/create"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("name", Some(nameQuery.toParamString(name))), ("description", Some(descriptionQuery.toParamString(description))), ("members", Some(membersQuery.toParamString(members))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def deactivateOwnUser(): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/users/me"
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def deactivateUser(userId: Integer): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/users/{user_id}".replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString))
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def getAttachments(): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/attachments"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getOwnUser(): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users/me"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getUser(userId: Integer, clientGravatar: Boolean = false, includeCustomProfileFields: Boolean = false)(implicit clientGravatarQuery: QueryParam[Boolean], includeCustomProfileFieldsQuery: QueryParam[Boolean]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users/{user_id}".replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("clientGravatar", Some(client_gravatarQuery.toParamString(client_gravatar))), ("includeCustomProfileFields", Some(include_custom_profile_fieldsQuery.toParamString(include_custom_profile_fields))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getUserByEmail(email: String, clientGravatar: Boolean = false, includeCustomProfileFields: Boolean = false)(implicit clientGravatarQuery: QueryParam[Boolean], includeCustomProfileFieldsQuery: QueryParam[Boolean]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users/{email}".replaceAll("\\{" + "email" + "\\}",escape(email.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("clientGravatar", Some(client_gravatarQuery.toParamString(client_gravatar))), ("includeCustomProfileFields", Some(include_custom_profile_fieldsQuery.toParamString(include_custom_profile_fields))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getUserGroups(): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/user_groups"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getUserPresence(userIdOrEmail: String): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users/{user_id_or_email}/presence".replaceAll("\\{" + "user_id_or_email" + "\\}",escape(userIdOrEmail.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getUsers(clientGravatar: Boolean = false, includeCustomProfileFields: Boolean = false)(implicit clientGravatarQuery: QueryParam[Boolean], includeCustomProfileFieldsQuery: QueryParam[Boolean]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("clientGravatar", Some(client_gravatarQuery.toParamString(client_gravatar))), ("includeCustomProfileFields", Some(include_custom_profile_fieldsQuery.toParamString(include_custom_profile_fields))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def muteUser(mutedUserId: Integer): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/users/me/muted_users/{muted_user_id}".replaceAll("\\{" + "muted_user_id" + "\\}",escape(mutedUserId.toString))
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def reactivateUser(userId: Integer): Task[AnyType] = {
    implicit val returnTypeDecoder: EntityDecoder[AnyType] = jsonOf[AnyType]

    val path = "/users/{user_id}/reactivate".replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString))
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AnyType](req)

    } yield resp
  }
  
  def removeUserGroup(userGroupId: Integer): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/user_groups/{user_group_id}".replaceAll("\\{" + "user_group_id" + "\\}",escape(userGroupId.toString))
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def setTypingStatus(op: String, to: List[Integer] = List.empty[Integer] , `type`: String = private, topic: String)(implicit `type`Query: QueryParam[String], opQuery: QueryParam[String], toQuery: QueryParam[List[Integer]], topicQuery: QueryParam[String]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/typing"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("`type`", Some(typeQuery.toParamString(type))), ("op", Some(opQuery.toParamString(op))), ("to", Some(toQuery.toParamString(to))), ("topic", Some(topicQuery.toParamString(topic))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def unmuteUser(mutedUserId: Integer): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/users/me/muted_users/{muted_user_id}".replaceAll("\\{" + "muted_user_id" + "\\}",escape(mutedUserId.toString))
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def updateDisplaySettings(twentyFourHourTime: Boolean, denseMode: Boolean, starredMessageCounts: Boolean, fluidLayoutWidth: Boolean, highContrastMode: Boolean, colorScheme: Integer, translateEmoticons: Boolean, defaultLanguage: String, defaultView: String, leftSideUserlist: Boolean, emojiset: String, demoteInactiveStreams: Integer, timezone: String)(implicit twentyFourHourTimeQuery: QueryParam[Boolean], denseModeQuery: QueryParam[Boolean], starredMessageCountsQuery: QueryParam[Boolean], fluidLayoutWidthQuery: QueryParam[Boolean], highContrastModeQuery: QueryParam[Boolean], colorSchemeQuery: QueryParam[Integer], translateEmoticonsQuery: QueryParam[Boolean], defaultLanguageQuery: QueryParam[String], defaultViewQuery: QueryParam[String], leftSideUserlistQuery: QueryParam[Boolean], emojisetQuery: QueryParam[String], demoteInactiveStreamsQuery: QueryParam[Integer], timezoneQuery: QueryParam[String]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/settings/display"
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("twentyFourHourTime", Some(twenty_four_hour_timeQuery.toParamString(twenty_four_hour_time))), ("denseMode", Some(dense_modeQuery.toParamString(dense_mode))), ("starredMessageCounts", Some(starred_message_countsQuery.toParamString(starred_message_counts))), ("fluidLayoutWidth", Some(fluid_layout_widthQuery.toParamString(fluid_layout_width))), ("highContrastMode", Some(high_contrast_modeQuery.toParamString(high_contrast_mode))), ("colorScheme", Some(color_schemeQuery.toParamString(color_scheme))), ("translateEmoticons", Some(translate_emoticonsQuery.toParamString(translate_emoticons))), ("defaultLanguage", Some(default_languageQuery.toParamString(default_language))), ("defaultView", Some(default_viewQuery.toParamString(default_view))), ("leftSideUserlist", Some(left_side_userlistQuery.toParamString(left_side_userlist))), ("emojiset", Some(emojisetQuery.toParamString(emojiset))), ("demoteInactiveStreams", Some(demote_inactive_streamsQuery.toParamString(demote_inactive_streams))), ("timezone", Some(timezoneQuery.toParamString(timezone))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def updateNotificationSettings(enableStreamDesktopNotifications: Boolean, enableStreamEmailNotifications: Boolean, enableStreamPushNotifications: Boolean, enableStreamAudibleNotifications: Boolean, notificationSound: String, enableDesktopNotifications: Boolean, enableSounds: Boolean, enableOfflineEmailNotifications: Boolean, enableOfflinePushNotifications: Boolean, enableOnlinePushNotifications: Boolean, enableDigestEmails: Boolean, enableMarketingEmails: Boolean, enableLoginEmails: Boolean, messageContentInEmailNotifications: Boolean, pmContentInDesktopNotifications: Boolean, wildcardMentionsNotify: Boolean, desktopIconCountDisplay: Integer, realmNameInNotifications: Boolean, presenceEnabled: Boolean)(implicit enableStreamDesktopNotificationsQuery: QueryParam[Boolean], enableStreamEmailNotificationsQuery: QueryParam[Boolean], enableStreamPushNotificationsQuery: QueryParam[Boolean], enableStreamAudibleNotificationsQuery: QueryParam[Boolean], notificationSoundQuery: QueryParam[String], enableDesktopNotificationsQuery: QueryParam[Boolean], enableSoundsQuery: QueryParam[Boolean], enableOfflineEmailNotificationsQuery: QueryParam[Boolean], enableOfflinePushNotificationsQuery: QueryParam[Boolean], enableOnlinePushNotificationsQuery: QueryParam[Boolean], enableDigestEmailsQuery: QueryParam[Boolean], enableMarketingEmailsQuery: QueryParam[Boolean], enableLoginEmailsQuery: QueryParam[Boolean], messageContentInEmailNotificationsQuery: QueryParam[Boolean], pmContentInDesktopNotificationsQuery: QueryParam[Boolean], wildcardMentionsNotifyQuery: QueryParam[Boolean], desktopIconCountDisplayQuery: QueryParam[Integer], realmNameInNotificationsQuery: QueryParam[Boolean], presenceEnabledQuery: QueryParam[Boolean]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/settings/notifications"
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("enableStreamDesktopNotifications", Some(enable_stream_desktop_notificationsQuery.toParamString(enable_stream_desktop_notifications))), ("enableStreamEmailNotifications", Some(enable_stream_email_notificationsQuery.toParamString(enable_stream_email_notifications))), ("enableStreamPushNotifications", Some(enable_stream_push_notificationsQuery.toParamString(enable_stream_push_notifications))), ("enableStreamAudibleNotifications", Some(enable_stream_audible_notificationsQuery.toParamString(enable_stream_audible_notifications))), ("notificationSound", Some(notification_soundQuery.toParamString(notification_sound))), ("enableDesktopNotifications", Some(enable_desktop_notificationsQuery.toParamString(enable_desktop_notifications))), ("enableSounds", Some(enable_soundsQuery.toParamString(enable_sounds))), ("enableOfflineEmailNotifications", Some(enable_offline_email_notificationsQuery.toParamString(enable_offline_email_notifications))), ("enableOfflinePushNotifications", Some(enable_offline_push_notificationsQuery.toParamString(enable_offline_push_notifications))), ("enableOnlinePushNotifications", Some(enable_online_push_notificationsQuery.toParamString(enable_online_push_notifications))), ("enableDigestEmails", Some(enable_digest_emailsQuery.toParamString(enable_digest_emails))), ("enableMarketingEmails", Some(enable_marketing_emailsQuery.toParamString(enable_marketing_emails))), ("enableLoginEmails", Some(enable_login_emailsQuery.toParamString(enable_login_emails))), ("messageContentInEmailNotifications", Some(message_content_in_email_notificationsQuery.toParamString(message_content_in_email_notifications))), ("pmContentInDesktopNotifications", Some(pm_content_in_desktop_notificationsQuery.toParamString(pm_content_in_desktop_notifications))), ("wildcardMentionsNotify", Some(wildcard_mentions_notifyQuery.toParamString(wildcard_mentions_notify))), ("desktopIconCountDisplay", Some(desktop_icon_count_displayQuery.toParamString(desktop_icon_count_display))), ("realmNameInNotifications", Some(realm_name_in_notificationsQuery.toParamString(realm_name_in_notifications))), ("presenceEnabled", Some(presence_enabledQuery.toParamString(presence_enabled))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def updateUser(userId: Integer, fullName: String, role: Integer, profileData: List[Any] = List.empty[Any] )(implicit fullNameQuery: QueryParam[String], roleQuery: QueryParam[Integer], profileDataQuery: QueryParam[List[Any]]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/users/{user_id}".replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString))
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("fullName", Some(full_nameQuery.toParamString(full_name))), ("role", Some(roleQuery.toParamString(role))), ("profileData", Some(profile_dataQuery.toParamString(profile_data))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def updateUserGroup(userGroupId: Integer, name: String, description: String)(implicit nameQuery: QueryParam[String], descriptionQuery: QueryParam[String]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/user_groups/{user_group_id}".replaceAll("\\{" + "user_group_id" + "\\}",escape(userGroupId.toString))
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("name", Some(nameQuery.toParamString(name))), ("description", Some(descriptionQuery.toParamString(description))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def updateUserGroupMembers(userGroupId: Integer, delete: List[Integer] = List.empty[Integer] , add: List[Integer] = List.empty[Integer] )(implicit deleteQuery: QueryParam[List[Integer]], addQuery: QueryParam[List[Integer]]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/user_groups/{user_group_id}/members".replaceAll("\\{" + "user_group_id" + "\\}",escape(userGroupId.toString))
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("delete", Some(deleteQuery.toParamString(delete))), ("add", Some(addQuery.toParamString(add))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
}
