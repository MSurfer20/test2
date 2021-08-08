//
// BasicStreamBase.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Object containing basic details about the stream.  */
public struct BasicStreamBase: Codable, Hashable {

    /** The unique ID of the stream.  */
    public var streamId: Int?
    /** The name of the stream.  */
    public var name: String?
    /** The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description.  */
    public var description: String?
    /** The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30).  */
    public var dateCreated: Int?
    /** Specifies whether the stream is private or not. Only people who have been invited can access a private stream.  */
    public var inviteOnly: Bool?
    /** The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message.  */
    public var renderedDescription: String?
    /** Whether the stream has been configured to allow unauthenticated access to its message history from the web.  */
    public var isWebPublic: Bool?
    /** Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  */
    public var streamPostPolicy: Int?
    /** Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17).  */
    public var messageRetentionDays: Int?
    /** Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future.  */
    public var historyPublicToSubscribers: Bool?
    /** The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history.  */
    public var firstMessageId: Int?
    /** Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead.  */
    @available(*, deprecated, message: "This property is deprecated.")
    public var isAnnouncementOnly: Bool?

    public init(streamId: Int? = nil, name: String? = nil, description: String? = nil, dateCreated: Int? = nil, inviteOnly: Bool? = nil, renderedDescription: String? = nil, isWebPublic: Bool? = nil, streamPostPolicy: Int? = nil, messageRetentionDays: Int? = nil, historyPublicToSubscribers: Bool? = nil, firstMessageId: Int? = nil, isAnnouncementOnly: Bool? = nil) {
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

    public enum CodingKeys: String, CodingKey, CaseIterable {
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

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(streamId, forKey: .streamId)
        try container.encodeIfPresent(name, forKey: .name)
        try container.encodeIfPresent(description, forKey: .description)
        try container.encodeIfPresent(dateCreated, forKey: .dateCreated)
        try container.encodeIfPresent(inviteOnly, forKey: .inviteOnly)
        try container.encodeIfPresent(renderedDescription, forKey: .renderedDescription)
        try container.encodeIfPresent(isWebPublic, forKey: .isWebPublic)
        try container.encodeIfPresent(streamPostPolicy, forKey: .streamPostPolicy)
        try container.encodeIfPresent(messageRetentionDays, forKey: .messageRetentionDays)
        try container.encodeIfPresent(historyPublicToSubscribers, forKey: .historyPublicToSubscribers)
        try container.encodeIfPresent(firstMessageId, forKey: .firstMessageId)
        try container.encodeIfPresent(isAnnouncementOnly, forKey: .isAnnouncementOnly)
    }
}

