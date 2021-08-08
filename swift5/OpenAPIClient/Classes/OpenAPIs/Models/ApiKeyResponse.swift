//
// ApiKeyResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct ApiKeyResponse: Codable, Hashable {

    public var result: AnyCodable?
    public var msg: AnyCodable?
    /** The API key that can be used to authenticate as the requested user.  */
    public var apiKey: String
    /** The email address of the user who owns the API key  */
    public var email: String

    public init(result: AnyCodable?, msg: AnyCodable?, apiKey: String, email: String) {
        self.result = result
        self.msg = msg
        self.apiKey = apiKey
        self.email = email
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case result
        case msg
        case apiKey = "api_key"
        case email
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(result, forKey: .result)
        try container.encode(msg, forKey: .msg)
        try container.encode(apiKey, forKey: .apiKey)
        try container.encode(email, forKey: .email)
    }
}

