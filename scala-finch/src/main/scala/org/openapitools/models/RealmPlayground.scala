package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Object containing details about a realm playground. 
 * @param id The unique ID for the realm playground. 
 * @param name The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
 * @param pygmentsUnderscorelanguage The name of the Pygments language lexer for that programming language. 
 * @param urlUnderscoreprefix The url prefix for the playground. 
 */
case class RealmPlayground(id: Option[Int],
                name: Option[String],
                pygmentsUnderscorelanguage: Option[String],
                urlUnderscoreprefix: Option[String]
                )

object RealmPlayground {
    /**
     * Creates the codec for converting RealmPlayground from and to JSON.
     */
    implicit val decoder: Decoder[RealmPlayground] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealmPlayground] = deriveEncoder
}
