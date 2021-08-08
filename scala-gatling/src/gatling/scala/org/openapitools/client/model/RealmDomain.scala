
package org.openapitools.client.model


case class RealmDomain (
    /* The new allowed domain.  */
    _domain: Option[String],
    /* Whether subdomains are allowed for this domain.  */
    _allowSubdomains: Option[Boolean]
)
object RealmDomain {
    def toStringBody(var_domain: Object, var_allowSubdomains: Object) =
        s"""
        | {
        | "domain":$var_domain,"allowSubdomains":$var_allowSubdomains
        | }
        """.stripMargin
}
