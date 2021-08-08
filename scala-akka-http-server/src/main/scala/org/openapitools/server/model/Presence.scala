package org.openapitools.server.model


/**
 * `{client_name}`: Object containing the details of the user's presence on a particular platform with the client's platform name being the object key. 
 *
 * @param client The client's platform name.  for example: ''null''
 * @param status The status of the user on this client. It is either `idle` or `active`.  for example: ''null''
 * @param timestamp The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second.  for example: ''null''
 * @param pushable Whether the client is capable of showing mobile/push notifications to the user.  for example: ''null''
*/
final case class Presence (
  client: Option[String],
  status: Option[String],
  timestamp: Option[Int],
  pushable: Option[Boolean]
)

