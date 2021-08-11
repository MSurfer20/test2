package model

import play.api.libs.json._

/**
  * Object containing details of the newly added domain. 
  * @param domain The new allowed domain. 
  * @param allowSubdomains Whether subdomains are allowed for this domain. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
case class RealmDomain(
  domain: Option[String],
  allowSubdomains: Option[Boolean]
)

object RealmDomain {
  implicit lazy val realmDomainJsonFormat: Format[RealmDomain] = Json.format[RealmDomain]
}

