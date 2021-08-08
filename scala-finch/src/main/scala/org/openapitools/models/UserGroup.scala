package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * Object containing the user group's attributes. 
 * @param name The name of the user group. 
 * @param description The description of the user group. 
 * @param members Array containing the id of the users who are members of this user group. 
 * @param id The ID of the user group. 
 */
case class UserGroup(name: Option[String],
                description: Option[String],
                members: Option[Seq[Int]],
                id: Option[Int]
                )

object UserGroup {
    /**
     * Creates the codec for converting UserGroup from and to JSON.
     */
    implicit val decoder: Decoder[UserGroup] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserGroup] = deriveEncoder
}
