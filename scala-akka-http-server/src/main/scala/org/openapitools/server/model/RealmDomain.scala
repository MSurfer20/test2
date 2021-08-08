package org.openapitools.server.model


/**
 * Object containing details of the newly added domain. 
 *
 * @param domain The new allowed domain.  for example: ''null''
 * @param allowSubdomains Whether subdomains are allowed for this domain.  for example: ''null''
*/
final case class RealmDomain (
  domain: Option[String],
  allowSubdomains: Option[Boolean]
)

