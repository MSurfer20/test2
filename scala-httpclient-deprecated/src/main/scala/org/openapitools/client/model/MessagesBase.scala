/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model


case class MessagesBase (
  // The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. 
  avatarUrl: Option[String] = None,
  // A Zulip \"client\" string, describing what Zulip client sent the message. 
  client: Option[String] = None,
  // The content/body of the message. 
  content: Option[String] = None,
  // The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. 
  `contentType`: Option[String] = None,
  // Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
  displayRecipient: Option[OneOfstringarray] = None,
  // The unique message ID.  Messages should always be displayed sorted by ID. 
  id: Option[Integer] = None,
  // Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
  isMeMessage: Option[Boolean] = None,
  // Data on any reactions to the message. 
  reactions: Option[List[EmojiReaction]] = None,
  // A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
  recipientId: Option[Integer] = None,
  // The Zulip display email address of the message's sender. 
  senderEmail: Option[String] = None,
  // The full name of the message's sender. 
  senderFullName: Option[String] = None,
  // The user ID of the message's sender. 
  senderId: Option[Integer] = None,
  // A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. 
  senderRealmStr: Option[String] = None,
  // Only present for stream messages; the ID of the stream. 
  streamId: Option[Integer] = None,
  // The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. 
  subject: Option[String] = None,
  // Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. 
  topicLinks: Option[List[MessagesBaseTopicLinks]] = None,
  // Data used for certain experimental Zulip integrations. 
  submessages: Option[List[String]] = None,
  // The UNIX timestamp for when the message was sent, in UTC seconds. 
  timestamp: Option[Integer] = None,
  // The type of the message: `stream` or `private`. 
  `type`: Option[String] = None
)

