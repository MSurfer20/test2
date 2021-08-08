//
// UserBase.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** A dictionary containing basic data on a given Zulip user.  */
public struct UserBase: Codable, Hashable {

    public enum Role: Int, Codable, CaseIterable {
        case _100 = 100
        case _200 = 200
        case _300 = 300
        case _400 = 400
        case _600 = 600
    }
    /** The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else.  */
    public var email: String?
    /** A boolean specifying whether the user is a bot or full account.  */
    public var isBot: Bool?
    /** URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion.  */
    public var avatarUrl: String?
    /** Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`.  */
    public var avatarVersion: Int?
    /** Full name of the user or bot, used for all display purposes.  */
    public var fullName: String?
    /** A boolean specifying whether the user is an organization administrator.  */
    public var isAdmin: Bool?
    /** A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8).  */
    public var isOwner: Bool?
    /** A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73).  */
    public var isBillingAdmin: Bool?
    /** [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59).  */
    public var role: Role?
    /** An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot.  */
    public var botType: Int?
    /** The unique ID of the user.  */
    public var userId: Int?
    /** If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner.  */
    public var botOwnerId: Int?
    /** A boolean specifying whether the user account has been deactivated.  */
    public var isActive: Bool?
    /** A boolean specifying whether the user is a guest user.  */
    public var isGuest: Bool?
    /** The time zone of the user.  */
    public var timezone: String?
    /** The time the user account was created.  */
    public var dateJoined: String?
    /** The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy.  */
    public var deliveryEmail: String?
    /** A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present.  */
    public var profileData: [String: AnyCodable]?

    public init(email: String? = nil, isBot: Bool? = nil, avatarUrl: String? = nil, avatarVersion: Int? = nil, fullName: String? = nil, isAdmin: Bool? = nil, isOwner: Bool? = nil, isBillingAdmin: Bool? = nil, role: Role? = nil, botType: Int? = nil, userId: Int? = nil, botOwnerId: Int? = nil, isActive: Bool? = nil, isGuest: Bool? = nil, timezone: String? = nil, dateJoined: String? = nil, deliveryEmail: String? = nil, profileData: [String: AnyCodable]? = nil) {
        self.email = email
        self.isBot = isBot
        self.avatarUrl = avatarUrl
        self.avatarVersion = avatarVersion
        self.fullName = fullName
        self.isAdmin = isAdmin
        self.isOwner = isOwner
        self.isBillingAdmin = isBillingAdmin
        self.role = role
        self.botType = botType
        self.userId = userId
        self.botOwnerId = botOwnerId
        self.isActive = isActive
        self.isGuest = isGuest
        self.timezone = timezone
        self.dateJoined = dateJoined
        self.deliveryEmail = deliveryEmail
        self.profileData = profileData
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case email
        case isBot = "is_bot"
        case avatarUrl = "avatar_url"
        case avatarVersion = "avatar_version"
        case fullName = "full_name"
        case isAdmin = "is_admin"
        case isOwner = "is_owner"
        case isBillingAdmin = "is_billing_admin"
        case role
        case botType = "bot_type"
        case userId = "user_id"
        case botOwnerId = "bot_owner_id"
        case isActive = "is_active"
        case isGuest = "is_guest"
        case timezone
        case dateJoined = "date_joined"
        case deliveryEmail = "delivery_email"
        case profileData = "profile_data"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(email, forKey: .email)
        try container.encodeIfPresent(isBot, forKey: .isBot)
        try container.encodeIfPresent(avatarUrl, forKey: .avatarUrl)
        try container.encodeIfPresent(avatarVersion, forKey: .avatarVersion)
        try container.encodeIfPresent(fullName, forKey: .fullName)
        try container.encodeIfPresent(isAdmin, forKey: .isAdmin)
        try container.encodeIfPresent(isOwner, forKey: .isOwner)
        try container.encodeIfPresent(isBillingAdmin, forKey: .isBillingAdmin)
        try container.encodeIfPresent(role, forKey: .role)
        try container.encodeIfPresent(botType, forKey: .botType)
        try container.encodeIfPresent(userId, forKey: .userId)
        try container.encodeIfPresent(botOwnerId, forKey: .botOwnerId)
        try container.encodeIfPresent(isActive, forKey: .isActive)
        try container.encodeIfPresent(isGuest, forKey: .isGuest)
        try container.encodeIfPresent(timezone, forKey: .timezone)
        try container.encodeIfPresent(dateJoined, forKey: .dateJoined)
        try container.encodeIfPresent(deliveryEmail, forKey: .deliveryEmail)
        try container.encodeIfPresent(profileData, forKey: .profileData)
    }
}
