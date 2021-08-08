
package org.openapitools.client.model


case class Hotspot (
    /* The delay after which the user should be shown the hotspot.  */
    _delay: Option[Number],
    /* The name of the hotspot.  */
    _name: Option[String],
    /* The title of the hotspot, as will be displayed to the user.  */
    _title: Option[String],
    /* The description of the hotspot, as will be displayed to the user.  */
    _description: Option[String]
)
object Hotspot {
    def toStringBody(var_delay: Object, var_name: Object, var_title: Object, var_description: Object) =
        s"""
        | {
        | "delay":$var_delay,"name":$var_name,"title":$var_title,"description":$var_description
        | }
        """.stripMargin
}
