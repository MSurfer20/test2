package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType
import org.openapitools.models.UserAllOf
import org.openapitools.models.UserBase

/**
 * 
 * @param email 
 * @param isUnderscorebot 
 * @param avatarUnderscoreurl 
 * @param avatarUnderscoreversion 
 * @param fullUnderscorename 
 * @param isUnderscoreadmin 
 * @param isUnderscoreowner 
 * @param isUnderscorebillingUnderscoreadmin 
 * @param role 
 * @param botUnderscoretype 
 * @param userUnderscoreid 
 * @param botUnderscoreownerUnderscoreid 
 * @param isUnderscoreactive 
 * @param isUnderscoreguest 
 * @param timezone 
 * @param dateUnderscorejoined 
 * @param deliveryUnderscoreemail 
 * @param profileUnderscoredata 
 */
case class User(email: Option[AnyType],
                isUnderscorebot: Option[AnyType],
                avatarUnderscoreurl: Option[AnyType],
                avatarUnderscoreversion: Option[AnyType],
                fullUnderscorename: Option[AnyType],
                isUnderscoreadmin: Option[AnyType],
                isUnderscoreowner: Option[AnyType],
                isUnderscorebillingUnderscoreadmin: Option[AnyType],
                role: Option[AnyType],
                botUnderscoretype: Option[AnyType],
                userUnderscoreid: Option[AnyType],
                botUnderscoreownerUnderscoreid: Option[AnyType],
                isUnderscoreactive: Option[AnyType],
                isUnderscoreguest: Option[AnyType],
                timezone: Option[AnyType],
                dateUnderscorejoined: Option[AnyType],
                deliveryUnderscoreemail: Option[AnyType],
                profileUnderscoredata: Option[AnyType]
                )

object User {
    /**
     * Creates the codec for converting User from and to JSON.
     */
    implicit val decoder: Decoder[User] = deriveDecoder
    implicit val encoder: ObjectEncoder[User] = deriveEncoder
}
