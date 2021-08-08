package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * Dictionary containing details of a single hotspot. 
 * @param delay The delay after which the user should be shown the hotspot. 
 * @param name The name of the hotspot. 
 * @param title The title of the hotspot, as will be displayed to the user. 
 * @param description The description of the hotspot, as will be displayed to the user. 
 */
case class Hotspot(delay: Option[BigDecimal],
                name: Option[String],
                title: Option[String],
                description: Option[String]
                )

object Hotspot {
    /**
     * Creates the codec for converting Hotspot from and to JSON.
     */
    implicit val decoder: Decoder[Hotspot] = deriveDecoder
    implicit val encoder: ObjectEncoder[Hotspot] = deriveEncoder
}
