package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * Object containing details about a realm export. 
 * @param id The id of the export. 
 * @param actingUnderscoreuserUnderscoreid The id of the user who did the export. 
 * @param exportUnderscoretime The UNIX timestamp of when the export was made. 
 * @param deletedUnderscoretimestamp The timestamp of when the export was deleted. Null if it wasn't. 
 * @param failedUnderscoretimestamp The timestamp of when the export failed. Null if it didn't. 
 * @param exportUnderscoreurl The URL of the export. `null` if there's no URL. 
 * @param pending Whether the export is pending or not. 
 */
case class RealmExport(id: Option[Int],
                actingUnderscoreuserUnderscoreid: Option[Int],
                exportUnderscoretime: Option[BigDecimal],
                deletedUnderscoretimestamp: Option[BigDecimal],
                failedUnderscoretimestamp: Option[BigDecimal],
                exportUnderscoreurl: Option[String],
                pending: Option[Boolean]
                )

object RealmExport {
    /**
     * Creates the codec for converting RealmExport from and to JSON.
     */
    implicit val decoder: Decoder[RealmExport] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealmExport] = deriveEncoder
}
