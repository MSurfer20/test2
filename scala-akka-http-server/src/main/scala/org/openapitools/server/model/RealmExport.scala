package org.openapitools.server.model


/**
 * Object containing details about a realm export. 
 *
 * @param id The id of the export.  for example: ''null''
 * @param actingUserId The id of the user who did the export.  for example: ''null''
 * @param exportTime The UNIX timestamp of when the export was made.  for example: ''null''
 * @param deletedTimestamp The timestamp of when the export was deleted. Null if it wasn't.  for example: ''null''
 * @param failedTimestamp The timestamp of when the export failed. Null if it didn't.  for example: ''null''
 * @param exportUrl The URL of the export. `null` if there's no URL.  for example: ''null''
 * @param pending Whether the export is pending or not.  for example: ''null''
*/
final case class RealmExport (
  id: Option[Int],
  actingUserId: Option[Int],
  exportTime: Option[Double],
  deletedTimestamp: Option[Double],
  failedTimestamp: Option[Double],
  exportUrl: Option[String],
  pending: Option[Boolean]
)

