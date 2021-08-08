
package org.openapitools.client.model


case class UserAllOf (
    _email: Option[AnyType],
    _isBot: Option[AnyType],
    _avatarUrl: Option[AnyType],
    _avatarVersion: Option[AnyType],
    _fullName: Option[AnyType],
    _isAdmin: Option[AnyType],
    _isOwner: Option[AnyType],
    _isBillingAdmin: Option[AnyType],
    _role: Option[AnyType],
    _botType: Option[AnyType],
    _userId: Option[AnyType],
    _botOwnerId: Option[AnyType],
    _isActive: Option[AnyType],
    _isGuest: Option[AnyType],
    _timezone: Option[AnyType],
    _dateJoined: Option[AnyType],
    _deliveryEmail: Option[AnyType],
    _profileData: Option[AnyType]
)
object UserAllOf {
    def toStringBody(var_email: Object, var_isBot: Object, var_avatarUrl: Object, var_avatarVersion: Object, var_fullName: Object, var_isAdmin: Object, var_isOwner: Object, var_isBillingAdmin: Object, var_role: Object, var_botType: Object, var_userId: Object, var_botOwnerId: Object, var_isActive: Object, var_isGuest: Object, var_timezone: Object, var_dateJoined: Object, var_deliveryEmail: Object, var_profileData: Object) =
        s"""
        | {
        | "email":$var_email,"isBot":$var_isBot,"avatarUrl":$var_avatarUrl,"avatarVersion":$var_avatarVersion,"fullName":$var_fullName,"isAdmin":$var_isAdmin,"isOwner":$var_isOwner,"isBillingAdmin":$var_isBillingAdmin,"role":$var_role,"botType":$var_botType,"userId":$var_userId,"botOwnerId":$var_botOwnerId,"isActive":$var_isActive,"isGuest":$var_isGuest,"timezone":$var_timezone,"dateJoined":$var_dateJoined,"deliveryEmail":$var_deliveryEmail,"profileData":$var_profileData
        | }
        """.stripMargin
}
