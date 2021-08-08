
package org.openapitools.client.model


case class DefaultStreamGroup (
    /* Name of the default stream group.  */
    _name: Option[String],
    /* Description of the default stream group.  */
    _description: Option[String],
    /* id of the default stream group.  */
    _id: Option[Integer],
    /* Array containing details about the streams in the default stream group.  */
    _streams: Option[List[BasicStream]]
)
object DefaultStreamGroup {
    def toStringBody(var_name: Object, var_description: Object, var_id: Object, var_streams: Object) =
        s"""
        | {
        | "name":$var_name,"description":$var_description,"id":$var_id,"streams":$var_streams
        | }
        """.stripMargin
}
