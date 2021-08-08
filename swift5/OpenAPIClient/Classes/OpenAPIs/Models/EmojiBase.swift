//
// EmojiBase.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct EmojiBase: Codable, Hashable {

    /** A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji.  */
    public var emojiCode: String?
    /** Name of the emoji.  */
    public var emojiName: String?
    /** One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji.  */
    public var reactionType: String?

    public init(emojiCode: String? = nil, emojiName: String? = nil, reactionType: String? = nil) {
        self.emojiCode = emojiCode
        self.emojiName = emojiName
        self.reactionType = reactionType
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case emojiCode = "emoji_code"
        case emojiName = "emoji_name"
        case reactionType = "reaction_type"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(emojiCode, forKey: .emojiCode)
        try container.encodeIfPresent(emojiName, forKey: .emojiName)
        try container.encodeIfPresent(reactionType, forKey: .reactionType)
    }
}

