package model

import play.api.libs.json._

/**
  * Object containing details about a realm export. 
  * @param id The id of the export. 
  * @param actingUserId The id of the user who did the export. 
  * @param exportTime The UNIX timestamp of when the export was made. 
  * @param deletedTimestamp The timestamp of when the export was deleted. Null if it wasn't. 
  * @param failedTimestamp The timestamp of when the export failed. Null if it didn't. 
  * @param exportUrl The URL of the export. `null` if there's no URL. 
  * @param pending Whether the export is pending or not. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T20:45:49.166589Z[Etc/UTC]")
case class RealmExport(
  id: Option[Int],
  actingUserId: Option[Int],
  exportTime: Option[BigDecimal],
  deletedTimestamp: Option[BigDecimal],
  failedTimestamp: Option[BigDecimal],
  exportUrl: Option[String],
  pending: Option[Boolean]
)

object RealmExport {
  implicit lazy val realmExportJsonFormat: Format[RealmExport] = Json.format[RealmExport]
}

