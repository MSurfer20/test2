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

import org.openapitools.client.core.ApiModel

case class GetMessages (
  avatarUrl: Option[AnyType] = None,
  client: Option[AnyType] = None,
  content: Option[AnyType] = None,
  contentType: Option[AnyType] = None,
  displayRecipient: Option[AnyType] = None,
  id: Option[AnyType] = None,
  isMeMessage: Option[AnyType] = None,
  reactions: Option[AnyType] = None,
  recipientId: Option[AnyType] = None,
  senderEmail: Option[AnyType] = None,
  senderFullName: Option[AnyType] = None,
  senderId: Option[AnyType] = None,
  senderRealmStr: Option[AnyType] = None,
  streamId: Option[AnyType] = None,
  subject: Option[AnyType] = None,
  topicLinks: Option[AnyType] = None,
  submessages: Option[AnyType] = None,
  timestamp: Option[AnyType] = None,
  `type`: Option[AnyType] = None,
  /* The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags  */
  flags: Option[Seq[String]] = None,
  /* The UNIX timestamp for when the message was last edited, in UTC seconds.  */
  lastEditTimestamp: Option[Int] = None,
  /* Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords.  */
  matchContent: Option[String] = None,
  /* Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords.  */
  matchSubject: Option[String] = None
) extends ApiModel


