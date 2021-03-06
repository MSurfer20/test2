//
// AddSubscriptionsResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct AddSubscriptionsResponse: Codable, Hashable {

    public var result: AnyCodable?
    public var msg: AnyCodable?
    /** A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query.  */
    public var subscribed: [String: [String]]?
    /** A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to.  */
    public var alreadySubscribed: [String: [String]]?
    /** A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`.  */
    public var unauthorized: [String]?

    public init(result: AnyCodable?, msg: AnyCodable?, subscribed: [String: [String]]? = nil, alreadySubscribed: [String: [String]]? = nil, unauthorized: [String]? = nil) {
        self.result = result
        self.msg = msg
        self.subscribed = subscribed
        self.alreadySubscribed = alreadySubscribed
        self.unauthorized = unauthorized
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case result
        case msg
        case subscribed
        case alreadySubscribed = "already_subscribed"
        case unauthorized
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(result, forKey: .result)
        try container.encode(msg, forKey: .msg)
        try container.encodeIfPresent(subscribed, forKey: .subscribed)
        try container.encodeIfPresent(alreadySubscribed, forKey: .alreadySubscribed)
        try container.encodeIfPresent(unauthorized, forKey: .unauthorized)
    }
}

