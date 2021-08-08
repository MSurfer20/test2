package org.openapitools

// TODO: properly handle custom imports
import java.io._
import java.util.UUID
import java.time._
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}

import org.openapitools.models._

trait DataAccessor {
    // TODO: apiInfo -> apis -> operations = TODO error
    private object TODO extends CommonError("Not implemented") {
        def message = "Not implemented"
    }

        /**
        * 
        * @return A ApiKeyResponse
        */
        def Authentication_devFetchApiKey(username: String): Either[CommonError,ApiKeyResponse] = Left(TODO)

        /**
        * 
        * @return A ApiKeyResponse
        */
        def Authentication_fetchApiKey(username: String, password: String): Either[CommonError,ApiKeyResponse] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def Messages_addReaction(messageId: Int, emojiName: String, emojiCode: Option[String], reactionType: Option[String]): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A AnyType
        */
        def Messages_checkMessagesMatchNarrow(msgIds: Seq[Int], narrow: Seq[Object]): Either[CommonError,AnyType] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def Messages_deleteMessage(messageId: Int): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Messages_getFileTemporaryUrl(realmIdStr: Int, filename: String): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Messages_getMessageHistory(messageId: Int): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Messages_getMessages(numBefore: Int, numAfter: Int, anchor: Option[OneOf<string,integer>], narrow: Seq[Object], clientGravatar: Option[Boolean], applyMarkdown: Option[Boolean], useFirstUnreadAnchor: Option[Boolean]): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Messages_getRawMessage(messageId: Int): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def Messages_markAllAsRead(): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def Messages_markStreamAsRead(streamId: Int): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def Messages_markTopicAsRead(streamId: Int, topicName: String): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def Messages_removeReaction(messageId: Int, emojiName: Option[String], emojiCode: Option[String], reactionType: Option[String]): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Messages_renderMessage(content: String): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Messages_sendMessage(_type: String, to: Seq[Int], content: String, topic: Option[String], queueId: Option[String], localId: Option[String]): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def Messages_updateMessage(messageId: Int, topic: Option[String], propagateMode: Option[String], sendNotificationToOldThread: Option[Boolean], sendNotificationToNewThread: Option[Boolean], content: Option[String], streamId: Option[Int]): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Messages_updateMessageFlags(messages: Seq[Int], op: String, flag: String): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Messages_uploadFile(filename: FileUpload): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def RealTimeEvents_deleteQueue(queueId: String): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def RealTimeEvents_getEvents(queueId: String, lastEventId: Option[Int], dontBlock: Option[Boolean]): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def RealTimeEvents_realTimePost(eventTypes: Seq[String], narrow: Seq[Seq[String]], allPublicStreams: Option[Boolean]): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def RealTimeEvents_registerQueue(applyMarkdown: Option[Boolean], clientGravatar: Option[Boolean], slimPresence: Option[Boolean], eventTypes: Seq[String], allPublicStreams: Option[Boolean], includeSubscribers: Option[Boolean], clientCapabilities: Option[Object], fetchEventTypes: Seq[String], narrow: Seq[Seq[String]]): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def RealTimeEvents_restErrorHandling(): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def ServerAndOrganizations_addCodePlayground(name: String, pygmentsLanguage: String, urlPrefix: String): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def ServerAndOrganizations_addLinkifier(pattern: String, urlFormatString: String): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def ServerAndOrganizations_createCustomProfileField(fieldType: Int, name: Option[String], hint: Option[String], fieldData: Option[Object]): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def ServerAndOrganizations_getCustomEmoji(): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def ServerAndOrganizations_getCustomProfileFields(): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def ServerAndOrganizations_getLinkifiers(): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def ServerAndOrganizations_getServerSettings(): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def ServerAndOrganizations_removeCodePlayground(playgroundId: Int): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def ServerAndOrganizations_removeLinkifier(filterId: Int): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def ServerAndOrganizations_reorderCustomProfileFields(order: Seq[Int]): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def ServerAndOrganizations_updateLinkifier(filterId: Int, pattern: String, urlFormatString: String): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def ServerAndOrganizations_uploadCustomEmoji(emojiName: String, filename: FileUpload): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def Streams_archiveStream(streamId: Int): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Streams_createBigBlueButtonVideoCall(): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Streams_getStreamId(stream: String): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Streams_getStreamTopics(streamId: Int): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Streams_getStreams(includePublic: Option[Boolean], includeWebPublic: Option[Boolean], includeSubscribed: Option[Boolean], includeAllActive: Option[Boolean], includeDefault: Option[Boolean], includeOwnerSubscribed: Option[Boolean]): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Streams_getSubscriptionStatus(userId: Int, streamId: Int): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Streams_getSubscriptions(includeSubscribers: Option[Boolean]): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def Streams_muteTopic(topic: String, op: String, stream: Option[String], streamId: Option[Int]): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A OneOf&lt;object,object&gt;
        */
        def Streams_subscribe(subscriptions: Seq[Object], principals: Seq[OneOf<string,integer>], authorizationErrorsFatal: Option[Boolean], announce: Option[Boolean], inviteOnly: Option[Boolean], historyPublicToSubscribers: Option[Boolean], streamPostPolicy: Option[Int], messageRetentionDays: Option[OneOf<string,integer>]): Either[CommonError,OneOf&lt;object,object&gt;] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Streams_unsubscribe(subscriptions: Seq[String], principals: Seq[OneOf<string,integer>]): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def Streams_updateStream(streamId: Int, description: Option[String], newName: Option[String], isPrivate: Option[Boolean], isAnnouncementOnly: Option[Boolean], streamPostPolicy: Option[Int], historyPublicToSubscribers: Option[Boolean], messageRetentionDays: Option[OneOf<string,integer>]): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Streams_updateSubscriptionSettings(subscriptionData: Seq[Object]): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Streams_updateSubscriptions(delete: Seq[String], add: Seq[Object]): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Users_createUser(email: String, password: String, fullName: String): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def Users_createUserGroup(name: String, description: String, members: Seq[Int]): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def Users_deactivateOwnUser(): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def Users_deactivateUser(userId: Int): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Users_getAttachments(): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Users_getOwnUser(): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Users_getUser(userId: Int, clientGravatar: Option[Boolean], includeCustomProfileFields: Option[Boolean]): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Users_getUserByEmail(email: String, clientGravatar: Option[Boolean], includeCustomProfileFields: Option[Boolean]): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Users_getUserGroups(): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Users_getUserPresence(userIdOrEmail: String): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Users_getUsers(clientGravatar: Option[Boolean], includeCustomProfileFields: Option[Boolean]): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def Users_muteUser(mutedUserId: Int): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A AnyType
        */
        def Users_reactivateUser(userId: Int): Either[CommonError,AnyType] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def Users_removeUserGroup(userGroupId: Int): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def Users_setTypingStatus(op: String, to: Seq[Int], _type: Option[String], topic: Option[String]): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def Users_unmuteUser(mutedUserId: Int): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Users_updateDisplaySettings(twentyFourHourTime: Option[Boolean], denseMode: Option[Boolean], starredMessageCounts: Option[Boolean], fluidLayoutWidth: Option[Boolean], highContrastMode: Option[Boolean], colorScheme: Option[Int], translateEmoticons: Option[Boolean], defaultLanguage: Option[String], defaultView: Option[String], leftSideUserlist: Option[Boolean], emojiset: Option[String], demoteInactiveStreams: Option[Int], timezone: Option[String]): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccessBase
        */
        def Users_updateNotificationSettings(enableStreamDesktopNotifications: Option[Boolean], enableStreamEmailNotifications: Option[Boolean], enableStreamPushNotifications: Option[Boolean], enableStreamAudibleNotifications: Option[Boolean], notificationSound: Option[String], enableDesktopNotifications: Option[Boolean], enableSounds: Option[Boolean], enableOfflineEmailNotifications: Option[Boolean], enableOfflinePushNotifications: Option[Boolean], enableOnlinePushNotifications: Option[Boolean], enableDigestEmails: Option[Boolean], enableMarketingEmails: Option[Boolean], enableLoginEmails: Option[Boolean], messageContentInEmailNotifications: Option[Boolean], pmContentInDesktopNotifications: Option[Boolean], wildcardMentionsNotify: Option[Boolean], desktopIconCountDisplay: Option[Int], realmNameInNotifications: Option[Boolean], presenceEnabled: Option[Boolean]): Either[CommonError,JsonSuccessBase] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def Users_updateUser(userId: Int, fullName: Option[String], role: Option[Int], profileData: Seq[Object]): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def Users_updateUserGroup(userGroupId: Int, name: String, description: String): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A JsonSuccess
        */
        def Users_updateUserGroupMembers(userGroupId: Int, delete: Seq[Int], add: Seq[Int]): Either[CommonError,JsonSuccess] = Left(TODO)

        /**
        * 
        * @return A InlineResponse200
        */
        def Webhooks_zulipOutgoingWebhooks(): Either[CommonError,InlineResponse200] = Left(TODO)

}