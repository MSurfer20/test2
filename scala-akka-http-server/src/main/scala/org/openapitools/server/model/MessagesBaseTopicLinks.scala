package org.openapitools.server.model


/**
 * @param text The original link text present in the topic.  for example: ''null''
 * @param url The expanded target url which the link points to.  for example: ''null''
*/
final case class MessagesBaseTopicLinks (
  text: Option[String],
  url: Option[String]
)

