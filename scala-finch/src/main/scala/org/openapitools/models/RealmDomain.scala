package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Object containing details of the newly added domain. 
 * @param domain The new allowed domain. 
 * @param allowUnderscoresubdomains Whether subdomains are allowed for this domain. 
 */
case class RealmDomain(domain: Option[String],
                allowUnderscoresubdomains: Option[Boolean]
                )

object RealmDomain {
    /**
     * Creates the codec for converting RealmDomain from and to JSON.
     */
    implicit val decoder: Decoder[RealmDomain] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealmDomain] = deriveEncoder
}
