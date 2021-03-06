//
// BasicStreamAllOf.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public struct BasicStreamAllOf: Codable { 


    public var streamId: Any?
    public var name: Any?
    public var description: Any?
    public var dateCreated: Any?
    public var inviteOnly: Any?
    public var renderedDescription: Any?
    public var isWebPublic: Any?
    public var streamPostPolicy: Any?
    public var messageRetentionDays: Any?
    public var historyPublicToSubscribers: Any?
    public var firstMessageId: Any?
    public var isAnnouncementOnly: Any?

    public init(streamId: Any?, name: Any?, description: Any?, dateCreated: Any?, inviteOnly: Any?, renderedDescription: Any?, isWebPublic: Any?, streamPostPolicy: Any?, messageRetentionDays: Any?, historyPublicToSubscribers: Any?, firstMessageId: Any?, isAnnouncementOnly: Any?) {
        self.streamId = streamId
        self.name = name
        self.description = description
        self.dateCreated = dateCreated
        self.inviteOnly = inviteOnly
        self.renderedDescription = renderedDescription
        self.isWebPublic = isWebPublic
        self.streamPostPolicy = streamPostPolicy
        self.messageRetentionDays = messageRetentionDays
        self.historyPublicToSubscribers = historyPublicToSubscribers
        self.firstMessageId = firstMessageId
        self.isAnnouncementOnly = isAnnouncementOnly
    }

    public enum CodingKeys: String, CodingKey { 
        case streamId = "stream_id"
        case name
        case description
        case dateCreated = "date_created"
        case inviteOnly = "invite_only"
        case renderedDescription = "rendered_description"
        case isWebPublic = "is_web_public"
        case streamPostPolicy = "stream_post_policy"
        case messageRetentionDays = "message_retention_days"
        case historyPublicToSubscribers = "history_public_to_subscribers"
        case firstMessageId = "first_message_id"
        case isAnnouncementOnly = "is_announcement_only"
    }

}
