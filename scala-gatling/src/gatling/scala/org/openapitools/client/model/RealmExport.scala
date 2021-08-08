
package org.openapitools.client.model


case class RealmExport (
    /* The id of the export.  */
    _id: Option[Integer],
    /* The id of the user who did the export.  */
    _actingUserId: Option[Integer],
    /* The UNIX timestamp of when the export was made.  */
    _exportTime: Option[Number],
    /* The timestamp of when the export was deleted. Null if it wasn't.  */
    _deletedTimestamp: Option[Number],
    /* The timestamp of when the export failed. Null if it didn't.  */
    _failedTimestamp: Option[Number],
    /* The URL of the export. `null` if there's no URL.  */
    _exportUrl: Option[String],
    /* Whether the export is pending or not.  */
    _pending: Option[Boolean]
)
object RealmExport {
    def toStringBody(var_id: Object, var_actingUserId: Object, var_exportTime: Object, var_deletedTimestamp: Object, var_failedTimestamp: Object, var_exportUrl: Object, var_pending: Object) =
        s"""
        | {
        | "id":$var_id,"actingUserId":$var_actingUserId,"exportTime":$var_exportTime,"deletedTimestamp":$var_deletedTimestamp,"failedTimestamp":$var_failedTimestamp,"exportUrl":$var_exportUrl,"pending":$var_pending
        | }
        """.stripMargin
}
