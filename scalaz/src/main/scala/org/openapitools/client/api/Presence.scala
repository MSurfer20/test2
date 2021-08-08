package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Presence._

case class Presence (
  /* The client's platform name.  */
  client: Option[String],
/* The status of the user on this client. It is either `idle` or `active`.  */
  status: Option[Status],
/* The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second.  */
  timestamp: Option[Integer],
/* Whether the client is capable of showing mobile/push notifications to the user.  */
  pushable: Option[Boolean])

object Presence {
  import DateTimeCodecs._
  sealed trait Status
  case object Idle extends Status
  case object Active extends Status

  object Status {
    def toStatus(s: String): Option[Status] = s match {
      case "Idle" => Some(Idle)
      case "Active" => Some(Active)
      case _ => None
    }

    def fromStatus(x: Status): String = x match {
      case Idle => "Idle"
      case Active => "Active"
    }
  }

  implicit val StatusEnumEncoder: EncodeJson[Status] =
    EncodeJson[Status](is => StringEncodeJson(Status.fromStatus(is)))

  implicit val StatusEnumDecoder: DecodeJson[Status] =
    DecodeJson.optionDecoder[Status](n => n.string.flatMap(jStr => Status.toStatus(jStr)), "Status failed to de-serialize")

  implicit val PresenceCodecJson: CodecJson[Presence] = CodecJson.derive[Presence]
  implicit val PresenceDecoder: EntityDecoder[Presence] = jsonOf[Presence]
  implicit val PresenceEncoder: EntityEncoder[Presence] = jsonEncoderOf[Presence]
}
