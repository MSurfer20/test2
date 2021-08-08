package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BasicStream
import scala.collection.immutable.Seq

/**
 * Dictionary containing details of a default stream group. 
 * @param name Name of the default stream group. 
 * @param description Description of the default stream group. 
 * @param id id of the default stream group. 
 * @param streams Array containing details about the streams in the default stream group. 
 */
case class DefaultStreamGroup(name: Option[String],
                description: Option[String],
                id: Option[Int],
                streams: Option[Seq[BasicStream]]
                )

object DefaultStreamGroup {
    /**
     * Creates the codec for converting DefaultStreamGroup from and to JSON.
     */
    implicit val decoder: Decoder[DefaultStreamGroup] = deriveDecoder
    implicit val encoder: ObjectEncoder[DefaultStreamGroup] = deriveEncoder
}
