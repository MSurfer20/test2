package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param text The original link text present in the topic. 
 * @param url The expanded target url which the link points to. 
 */
case class MessagesBaseTopicLinks(text: Option[String],
                url: Option[String]
                )

object MessagesBaseTopicLinks {
    /**
     * Creates the codec for converting MessagesBaseTopicLinks from and to JSON.
     */
    implicit val decoder: Decoder[MessagesBaseTopicLinks] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessagesBaseTopicLinks] = deriveEncoder
}
