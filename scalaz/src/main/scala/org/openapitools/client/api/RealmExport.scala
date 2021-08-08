package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealmExport._

case class RealmExport (
  /* The id of the export.  */
  id: Option[Integer],
/* The id of the user who did the export.  */
  actingUserId: Option[Integer],
/* The UNIX timestamp of when the export was made.  */
  exportTime: Option[BigDecimal],
/* The timestamp of when the export was deleted. Null if it wasn't.  */
  deletedTimestamp: Option[BigDecimal],
/* The timestamp of when the export failed. Null if it didn't.  */
  failedTimestamp: Option[BigDecimal],
/* The URL of the export. `null` if there's no URL.  */
  exportUrl: Option[String],
/* Whether the export is pending or not.  */
  pending: Option[Boolean])

object RealmExport {
  import DateTimeCodecs._

  implicit val RealmExportCodecJson: CodecJson[RealmExport] = CodecJson.derive[RealmExport]
  implicit val RealmExportDecoder: EntityDecoder[RealmExport] = jsonOf[RealmExport]
  implicit val RealmExportEncoder: EntityEncoder[RealmExport] = jsonEncoderOf[RealmExport]
}
