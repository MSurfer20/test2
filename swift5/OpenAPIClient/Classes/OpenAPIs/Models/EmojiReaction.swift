//
// EmojiReaction.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct EmojiReaction: Codable, Hashable {

    public var emojiCode: AnyCodable?
    public var emojiName: AnyCodable?
    public var reactionType: AnyCodable?
    public var userId: AnyCodable?
    public var user: AnyCodable?

    public init(emojiCode: AnyCodable? = nil, emojiName: AnyCodable? = nil, reactionType: AnyCodable? = nil, userId: AnyCodable? = nil, user: AnyCodable? = nil) {
        self.emojiCode = emojiCode
        self.emojiName = emojiName
        self.reactionType = reactionType
        self.userId = userId
        self.user = user
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case emojiCode = "emoji_code"
        case emojiName = "emoji_name"
        case reactionType = "reaction_type"
        case userId = "user_id"
        case user
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(emojiCode, forKey: .emojiCode)
        try container.encodeIfPresent(emojiName, forKey: .emojiName)
        try container.encodeIfPresent(reactionType, forKey: .reactionType)
        try container.encodeIfPresent(userId, forKey: .userId)
        try container.encodeIfPresent(user, forKey: .user)
    }
}

