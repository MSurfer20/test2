package api

import model.CodedError
import model.JsObject
import model.JsonError
import model.JsonSuccess
import model.JsonSuccessBase
import model.OasAnyTypeNotMapped
import model.OneOfobjectobject
import model.OneOfobjectobjectobject
import model.OneOfobjectobjectobjectobjectobjectobject

/**
  * Provides a default implementation for [[UsersApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:23:09.886767Z[Etc/UTC]")
class UsersApiImpl extends UsersApi {
  /**
    * @inheritdoc
    */
  override def createUser(email: String, password: String, fullName: String): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def createUserGroup(name: String, description: String, members: List[Int]): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def deactivateOwnUser(): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def deactivateUser(userId: Int): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def getAttachments(): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def getOwnUser(): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def getUser(userId: Int, clientGravatar: Option[Boolean], includeCustomProfileFields: Option[Boolean]): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def getUserByEmail(email: String, clientGravatar: Option[Boolean], includeCustomProfileFields: Option[Boolean]): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def getUserGroups(): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def getUserPresence(userIdOrEmail: String): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def getUsers(clientGravatar: Option[Boolean], includeCustomProfileFields: Option[Boolean]): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def muteUser(mutedUserId: Int): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def reactivateUser(userId: Int): OasAnyTypeNotMapped = {
    // TODO: Implement better logic

    null
  }

  /**
    * @inheritdoc
    */
  override def removeUserGroup(userGroupId: Int): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def setTypingStatus(op: String, to: List[Int], `type`: Option[String], topic: Option[String]): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def unmuteUser(mutedUserId: Int): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def updateSettings(fullName: Option[String], email: Option[String], oldPassword: Option[String], newPassword: Option[String], twentyFourHourTime: Option[Boolean], denseMode: Option[Boolean], starredMessageCounts: Option[Boolean], fluidLayoutWidth: Option[Boolean], highContrastMode: Option[Boolean], colorScheme: Option[Int], enableDraftsSynchronization: Option[Boolean], translateEmoticons: Option[Boolean], defaultLanguage: Option[String], defaultView: Option[String], leftSideUserlist: Option[Boolean], emojiset: Option[String], demoteInactiveStreams: Option[Int], timezone: Option[String], enableStreamDesktopNotifications: Option[Boolean], enableStreamEmailNotifications: Option[Boolean], enableStreamPushNotifications: Option[Boolean], enableStreamAudibleNotifications: Option[Boolean], notificationSound: Option[String], enableDesktopNotifications: Option[Boolean], enableSounds: Option[Boolean], emailNotificationsBatchingPeriodSeconds: Option[Int], enableOfflineEmailNotifications: Option[Boolean], enableOfflinePushNotifications: Option[Boolean], enableOnlinePushNotifications: Option[Boolean], enableDigestEmails: Option[Boolean], enableMarketingEmails: Option[Boolean], enableLoginEmails: Option[Boolean], messageContentInEmailNotifications: Option[Boolean], pmContentInDesktopNotifications: Option[Boolean], wildcardMentionsNotify: Option[Boolean], desktopIconCountDisplay: Option[Int], realmNameInNotifications: Option[Boolean], presenceEnabled: Option[Boolean], enterSends: Option[Boolean]): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def updateStatus(statusText: Option[String], away: Option[Boolean], emojiName: Option[String], emojiCode: Option[String], reactionType: Option[String]): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def updateUser(userId: Int, fullName: Option[String], role: Option[Int], profileData: Option[List[JsObject]]): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def updateUserGroup(userGroupId: Int, name: String, description: String): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def updateUserGroupMembers(userGroupId: Int, delete: Option[List[Int]], add: Option[List[Int]]): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }
}
