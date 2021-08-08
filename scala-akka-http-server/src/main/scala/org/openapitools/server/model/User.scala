package org.openapitools.server.model


/**
 * @param email  for example: ''null''
 * @param isBot  for example: ''null''
 * @param avatarUrl  for example: ''null''
 * @param avatarVersion  for example: ''null''
 * @param fullName  for example: ''null''
 * @param isAdmin  for example: ''null''
 * @param isOwner  for example: ''null''
 * @param isBillingAdmin  for example: ''null''
 * @param role  for example: ''null''
 * @param botType  for example: ''null''
 * @param userId  for example: ''null''
 * @param botOwnerId  for example: ''null''
 * @param isActive  for example: ''null''
 * @param isGuest  for example: ''null''
 * @param timezone  for example: ''null''
 * @param dateJoined  for example: ''null''
 * @param deliveryEmail  for example: ''null''
 * @param profileData  for example: ''null''
*/
final case class User (
  email: Option[AnyType],
  isBot: Option[AnyType],
  avatarUrl: Option[AnyType],
  avatarVersion: Option[AnyType],
  fullName: Option[AnyType],
  isAdmin: Option[AnyType],
  isOwner: Option[AnyType],
  isBillingAdmin: Option[AnyType],
  role: Option[AnyType],
  botType: Option[AnyType],
  userId: Option[AnyType],
  botOwnerId: Option[AnyType],
  isActive: Option[AnyType],
  isGuest: Option[AnyType],
  timezone: Option[AnyType],
  dateJoined: Option[AnyType],
  deliveryEmail: Option[AnyType],
  profileData: Option[AnyType]
)

