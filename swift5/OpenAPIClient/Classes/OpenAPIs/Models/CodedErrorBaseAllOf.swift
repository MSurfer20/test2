//
// CodedErrorBaseAllOf.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct CodedErrorBaseAllOf: Codable, Hashable {

    public var result: AnyCodable?
    public var msg: AnyCodable?
    /** A string that identifies the error.  */
    public var code: String?

    public init(result: AnyCodable? = nil, msg: AnyCodable? = nil, code: String? = nil) {
        self.result = result
        self.msg = msg
        self.code = code
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case result
        case msg
        case code
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(result, forKey: .result)
        try container.encodeIfPresent(msg, forKey: .msg)
        try container.encodeIfPresent(code, forKey: .code)
    }
}

