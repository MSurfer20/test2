//
// Messages.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public struct Messages: Codable { 


    public var avatarUrl: Any?
    public var client: Any?
    public var content: Any?
    public var contentType: Any?
    public var displayRecipient: Any?
    public var id: Any?
    public var isMeMessage: Any?
    public var reactions: Any?
    public var recipientId: Any?
    public var senderEmail: Any?
    public var senderFullName: Any?
    public var senderId: Any?
    public var senderRealmStr: Any?
    public var streamId: Any?
    public var subject: Any?
    public var topicLinks: Any?
    public var submessages: Any?
    public var timestamp: Any?
    public var type: Any?

    public init(avatarUrl: Any?, client: Any?, content: Any?, contentType: Any?, displayRecipient: Any?, id: Any?, isMeMessage: Any?, reactions: Any?, recipientId: Any?, senderEmail: Any?, senderFullName: Any?, senderId: Any?, senderRealmStr: Any?, streamId: Any?, subject: Any?, topicLinks: Any?, submessages: Any?, timestamp: Any?, type: Any?) {
        self.avatarUrl = avatarUrl
        self.client = client
        self.content = content
        self.contentType = contentType
        self.displayRecipient = displayRecipient
        self.id = id
        self.isMeMessage = isMeMessage
        self.reactions = reactions
        self.recipientId = recipientId
        self.senderEmail = senderEmail
        self.senderFullName = senderFullName
        self.senderId = senderId
        self.senderRealmStr = senderRealmStr
        self.streamId = streamId
        self.subject = subject
        self.topicLinks = topicLinks
        self.submessages = submessages
        self.timestamp = timestamp
        self.type = type
    }

    public enum CodingKeys: String, CodingKey { 
        case avatarUrl = "avatar_url"
        case client
        case content
        case contentType = "content_type"
        case displayRecipient = "display_recipient"
        case id
        case isMeMessage = "is_me_message"
        case reactions
        case recipientId = "recipient_id"
        case senderEmail = "sender_email"
        case senderFullName = "sender_full_name"
        case senderId = "sender_id"
        case senderRealmStr = "sender_realm_str"
        case streamId = "stream_id"
        case subject
        case topicLinks = "topic_links"
        case submessages
        case timestamp
        case type
    }

}