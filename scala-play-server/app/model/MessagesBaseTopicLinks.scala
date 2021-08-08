package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessagesBase_topic_links.
  * @param text The original link text present in the topic. 
  * @param url The expanded target url which the link points to. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T20:42:55.656112Z[Etc/UTC]")
case class MessagesBaseTopicLinks(
  text: Option[String],
  url: Option[String]
)

object MessagesBaseTopicLinks {
  implicit lazy val messagesBaseTopicLinksJsonFormat: Format[MessagesBaseTopicLinks] = Json.format[MessagesBaseTopicLinks]
}

