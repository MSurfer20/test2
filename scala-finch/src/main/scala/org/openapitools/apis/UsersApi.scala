package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.AnyType
import org.openapitools.models.CodedError
import org.openapitools.models.JsonError
import org.openapitools.models.JsonSuccess
import org.openapitools.models.JsonSuccessBase
import org.openapitools.models.OneOf&lt;object,object,object&gt;
import org.openapitools.models.OneOf&lt;object,object&gt;
import io.finch.circe._
import io.circe.generic.semiauto._
import com.twitter.concurrent.AsyncStream
import com.twitter.finagle.Service
import com.twitter.finagle.Http
import com.twitter.finagle.http.{Request, Response}
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}
import com.twitter.util.Future
import com.twitter.io.Buf
import io.finch._, items._
import java.io.File
import java.nio.file.Files
import java.time._

object UsersApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        createUser(da) :+:
        createUserGroup(da) :+:
        deactivateOwnUser(da) :+:
        deactivateUser(da) :+:
        getAttachments(da) :+:
        getOwnUser(da) :+:
        getUser(da) :+:
        getUserByEmail(da) :+:
        getUserGroups(da) :+:
        getUserPresence(da) :+:
        getUsers(da) :+:
        muteUser(da) :+:
        reactivateUser(da) :+:
        removeUserGroup(da) :+:
        setTypingStatus(da) :+:
        unmuteUser(da) :+:
        updateDisplaySettings(da) :+:
        updateNotificationSettings(da) :+:
        updateUser(da) :+:
        updateUserGroup(da) :+:
        updateUserGroupMembers(da)


    private def checkError(e: CommonError) = e match {
      case InvalidInput(_) => BadRequest(e)
      case MissingIdentifier(_) => BadRequest(e)
      case RecordNotFound(_) => NotFound(e)
      case _ => InternalServerError(e)
    }

    implicit class StringOps(s: String) {

      import java.time.format.DateTimeFormatter

      lazy val localformatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
      lazy val datetimeformatter: DateTimeFormatter =
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ")

      def toLocalDateTime: LocalDateTime = LocalDateTime.parse(s,localformatter)
      def toZonedDateTime: ZonedDateTime = ZonedDateTime.parse(s, datetimeformatter)

    }

        /**
        * 
        * @return An endpoint representing a JsonSuccessBase
        */
        private def createUser(da: DataAccessor): Endpoint[JsonSuccessBase] =
        post("users" :: param("email") :: param("password") :: param("full_name")) { (email: String, password: String, fullName: String) =>
          da.Users_createUser(email, password, fullName) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccess
        */
        private def createUserGroup(da: DataAccessor): Endpoint[JsonSuccess] =
        post("user_groups" :: "create" :: param("name") :: param("description") :: params("members")) { (name: String, description: String, members: Seq[Int]) =>
          da.Users_createUserGroup(name, description, members) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccess
        */
        private def deactivateOwnUser(da: DataAccessor): Endpoint[JsonSuccess] =
        delete("users" :: "me") { () =>
          da.Users_deactivateOwnUser() match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccess
        */
        private def deactivateUser(da: DataAccessor): Endpoint[JsonSuccess] =
        delete("users" :: int) { (userId: Int) =>
          da.Users_deactivateUser(userId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccessBase
        */
        private def getAttachments(da: DataAccessor): Endpoint[JsonSuccessBase] =
        get("attachments") { () =>
          da.Users_getAttachments() match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccessBase
        */
        private def getOwnUser(da: DataAccessor): Endpoint[JsonSuccessBase] =
        get("users" :: "me") { () =>
          da.Users_getOwnUser() match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccessBase
        */
        private def getUser(da: DataAccessor): Endpoint[JsonSuccessBase] =
        get("users" :: int :: paramOption("client_gravatar").map(_.map(_.toBoolean)) :: paramOption("include_custom_profile_fields").map(_.map(_.toBoolean))) { (userId: Int, clientGravatar: Option[Boolean], includeCustomProfileFields: Option[Boolean]) =>
          da.Users_getUser(userId, clientGravatar, includeCustomProfileFields) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccessBase
        */
        private def getUserByEmail(da: DataAccessor): Endpoint[JsonSuccessBase] =
        get("users" :: string :: paramOption("client_gravatar").map(_.map(_.toBoolean)) :: paramOption("include_custom_profile_fields").map(_.map(_.toBoolean))) { (email: String, clientGravatar: Option[Boolean], includeCustomProfileFields: Option[Boolean]) =>
          da.Users_getUserByEmail(email, clientGravatar, includeCustomProfileFields) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccessBase
        */
        private def getUserGroups(da: DataAccessor): Endpoint[JsonSuccessBase] =
        get("user_groups") { () =>
          da.Users_getUserGroups() match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccessBase
        */
        private def getUserPresence(da: DataAccessor): Endpoint[JsonSuccessBase] =
        get("users" :: string :: "presence") { (userIdOrEmail: String) =>
          da.Users_getUserPresence(userIdOrEmail) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccessBase
        */
        private def getUsers(da: DataAccessor): Endpoint[JsonSuccessBase] =
        get("users" :: paramOption("client_gravatar").map(_.map(_.toBoolean)) :: paramOption("include_custom_profile_fields").map(_.map(_.toBoolean))) { (clientGravatar: Option[Boolean], includeCustomProfileFields: Option[Boolean]) =>
          da.Users_getUsers(clientGravatar, includeCustomProfileFields) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccess
        */
        private def muteUser(da: DataAccessor): Endpoint[JsonSuccess] =
        post("users" :: "me" :: "muted_users" :: int) { (mutedUserId: Int) =>
          da.Users_muteUser(mutedUserId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AnyType
        */
        private def reactivateUser(da: DataAccessor): Endpoint[AnyType] =
        post("users" :: int :: "reactivate") { (userId: Int) =>
          da.Users_reactivateUser(userId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccess
        */
        private def removeUserGroup(da: DataAccessor): Endpoint[JsonSuccess] =
        delete("user_groups" :: int) { (userGroupId: Int) =>
          da.Users_removeUserGroup(userGroupId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccess
        */
        private def setTypingStatus(da: DataAccessor): Endpoint[JsonSuccess] =
        post("typing" :: param("op") :: params("to") :: paramOption("type") :: paramOption("topic")) { (op: String, to: Seq[Int], _type: Option[String], topic: Option[String]) =>
          da.Users_setTypingStatus(op, to, _type, topic) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccess
        */
        private def unmuteUser(da: DataAccessor): Endpoint[JsonSuccess] =
        delete("users" :: "me" :: "muted_users" :: int) { (mutedUserId: Int) =>
          da.Users_unmuteUser(mutedUserId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccessBase
        */
        private def updateDisplaySettings(da: DataAccessor): Endpoint[JsonSuccessBase] =
        patch("settings" :: "display" :: paramOption("twenty_four_hour_time").map(_.map(_.toBoolean)) :: paramOption("dense_mode").map(_.map(_.toBoolean)) :: paramOption("starred_message_counts").map(_.map(_.toBoolean)) :: paramOption("fluid_layout_width").map(_.map(_.toBoolean)) :: paramOption("high_contrast_mode").map(_.map(_.toBoolean)) :: paramOption("color_scheme").map(_.map(_.toInt)) :: paramOption("translate_emoticons").map(_.map(_.toBoolean)) :: paramOption("default_language") :: paramOption("default_view") :: paramOption("left_side_userlist").map(_.map(_.toBoolean)) :: paramOption("emojiset") :: paramOption("demote_inactive_streams").map(_.map(_.toInt)) :: paramOption("timezone")) { (twentyFourHourTime: Option[Boolean], denseMode: Option[Boolean], starredMessageCounts: Option[Boolean], fluidLayoutWidth: Option[Boolean], highContrastMode: Option[Boolean], colorScheme: Option[Int], translateEmoticons: Option[Boolean], defaultLanguage: Option[String], defaultView: Option[String], leftSideUserlist: Option[Boolean], emojiset: Option[String], demoteInactiveStreams: Option[Int], timezone: Option[String]) =>
          da.Users_updateDisplaySettings(twentyFourHourTime, denseMode, starredMessageCounts, fluidLayoutWidth, highContrastMode, colorScheme, translateEmoticons, defaultLanguage, defaultView, leftSideUserlist, emojiset, demoteInactiveStreams, timezone) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccessBase
        */
        private def updateNotificationSettings(da: DataAccessor): Endpoint[JsonSuccessBase] =
        patch("settings" :: "notifications" :: paramOption("enable_stream_desktop_notifications").map(_.map(_.toBoolean)) :: paramOption("enable_stream_email_notifications").map(_.map(_.toBoolean)) :: paramOption("enable_stream_push_notifications").map(_.map(_.toBoolean)) :: paramOption("enable_stream_audible_notifications").map(_.map(_.toBoolean)) :: paramOption("notification_sound") :: paramOption("enable_desktop_notifications").map(_.map(_.toBoolean)) :: paramOption("enable_sounds").map(_.map(_.toBoolean)) :: paramOption("enable_offline_email_notifications").map(_.map(_.toBoolean)) :: paramOption("enable_offline_push_notifications").map(_.map(_.toBoolean)) :: paramOption("enable_online_push_notifications").map(_.map(_.toBoolean)) :: paramOption("enable_digest_emails").map(_.map(_.toBoolean)) :: paramOption("enable_marketing_emails").map(_.map(_.toBoolean)) :: paramOption("enable_login_emails").map(_.map(_.toBoolean)) :: paramOption("message_content_in_email_notifications").map(_.map(_.toBoolean)) :: paramOption("pm_content_in_desktop_notifications").map(_.map(_.toBoolean)) :: paramOption("wildcard_mentions_notify").map(_.map(_.toBoolean)) :: paramOption("desktop_icon_count_display").map(_.map(_.toInt)) :: paramOption("realm_name_in_notifications").map(_.map(_.toBoolean)) :: paramOption("presence_enabled").map(_.map(_.toBoolean))) { (enableStreamDesktopNotifications: Option[Boolean], enableStreamEmailNotifications: Option[Boolean], enableStreamPushNotifications: Option[Boolean], enableStreamAudibleNotifications: Option[Boolean], notificationSound: Option[String], enableDesktopNotifications: Option[Boolean], enableSounds: Option[Boolean], enableOfflineEmailNotifications: Option[Boolean], enableOfflinePushNotifications: Option[Boolean], enableOnlinePushNotifications: Option[Boolean], enableDigestEmails: Option[Boolean], enableMarketingEmails: Option[Boolean], enableLoginEmails: Option[Boolean], messageContentInEmailNotifications: Option[Boolean], pmContentInDesktopNotifications: Option[Boolean], wildcardMentionsNotify: Option[Boolean], desktopIconCountDisplay: Option[Int], realmNameInNotifications: Option[Boolean], presenceEnabled: Option[Boolean]) =>
          da.Users_updateNotificationSettings(enableStreamDesktopNotifications, enableStreamEmailNotifications, enableStreamPushNotifications, enableStreamAudibleNotifications, notificationSound, enableDesktopNotifications, enableSounds, enableOfflineEmailNotifications, enableOfflinePushNotifications, enableOnlinePushNotifications, enableDigestEmails, enableMarketingEmails, enableLoginEmails, messageContentInEmailNotifications, pmContentInDesktopNotifications, wildcardMentionsNotify, desktopIconCountDisplay, realmNameInNotifications, presenceEnabled) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccess
        */
        private def updateUser(da: DataAccessor): Endpoint[JsonSuccess] =
        patch("users" :: int :: paramOption("full_name") :: paramOption("role").map(_.map(_.toInt)) :: params("profile_data")) { (userId: Int, fullName: Option[String], role: Option[Int], profileData: Seq[Object]) =>
          da.Users_updateUser(userId, fullName, role, profileData) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccess
        */
        private def updateUserGroup(da: DataAccessor): Endpoint[JsonSuccess] =
        patch("user_groups" :: int :: param("name") :: param("description")) { (userGroupId: Int, name: String, description: String) =>
          da.Users_updateUserGroup(userGroupId, name, description) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccess
        */
        private def updateUserGroupMembers(da: DataAccessor): Endpoint[JsonSuccess] =
        post("user_groups" :: int :: "members" :: params("delete") :: params("add")) { (userGroupId: Int, delete: Seq[Int], add: Seq[Int]) =>
          da.Users_updateUserGroupMembers(userGroupId, delete, add) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }


    implicit private def fileUploadToFile(fileUpload: FileUpload) : File = {
      fileUpload match {
        case upload: InMemoryFileUpload =>
          bytesToFile(Buf.ByteArray.Owned.extract(upload.content))
        case upload: OnDiskFileUpload =>
          upload.content
        case _ => null
      }
    }

    private def bytesToFile(input: Array[Byte]): java.io.File = {
      val file = Files.createTempFile("tmpUsersApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
