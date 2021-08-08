package model

import play.api.libs.json._

/**
  * `{client_name}`: Object containing the details of the user's presence on a particular platform with the client's platform name being the object key. 
  * @param client The client's platform name. 
  * @param status The status of the user on this client. It is either `idle` or `active`. 
  * @param timestamp The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second. 
  * @param pushable Whether the client is capable of showing mobile/push notifications to the user. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T20:42:55.656112Z[Etc/UTC]")
case class Presence(
  client: Option[String],
  status: Option[Presence.Status.Value],
  timestamp: Option[Int],
  pushable: Option[Boolean]
)

object Presence {
  implicit lazy val presenceJsonFormat: Format[Presence] = Json.format[Presence]

  // noinspection TypeAnnotation
  object Status extends Enumeration {
    val Idle = Value("idle")
    val Active = Value("active")

    type Status = Value
    implicit lazy val StatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

