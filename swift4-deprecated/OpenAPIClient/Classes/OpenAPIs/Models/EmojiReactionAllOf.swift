//
// EmojiReactionAllOf.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public struct EmojiReactionAllOf: Codable { 


    public var emojiCode: Any?
    public var emojiName: Any?
    public var reactionType: Any?
    public var userId: Any?
    public var user: Any?

    public init(emojiCode: Any?, emojiName: Any?, reactionType: Any?, userId: Any?, user: Any?) {
        self.emojiCode = emojiCode
        self.emojiName = emojiName
        self.reactionType = reactionType
        self.userId = userId
        self.user = user
    }

    public enum CodingKeys: String, CodingKey { 
        case emojiCode = "emoji_code"
        case emojiName = "emoji_name"
        case reactionType = "reaction_type"
        case userId = "user_id"
        case user
    }

}
