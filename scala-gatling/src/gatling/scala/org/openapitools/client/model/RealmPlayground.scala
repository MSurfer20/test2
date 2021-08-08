
package org.openapitools.client.model


case class RealmPlayground (
    /* The unique ID for the realm playground.  */
    _id: Option[Integer],
    /* The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49).  */
    _name: Option[String],
    /* The name of the Pygments language lexer for that programming language.  */
    _pygmentsLanguage: Option[String],
    /* The url prefix for the playground.  */
    _urlPrefix: Option[String]
)
object RealmPlayground {
    def toStringBody(var_id: Object, var_name: Object, var_pygmentsLanguage: Object, var_urlPrefix: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"pygmentsLanguage":$var_pygmentsLanguage,"urlPrefix":$var_urlPrefix
        | }
        """.stripMargin
}
