//
// CodedErrorBase.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct CodedErrorBase: Codable, Hashable {

    public var result: AnyCodable?
    public var msg: AnyCodable?
    /** A string that identifies the error.  */
    public var code: String?

    public init(result: AnyCodable?, msg: AnyCodable?, code: String? = nil) {
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
        try container.encode(result, forKey: .result)
        try container.encode(msg, forKey: .msg)
        try container.encodeIfPresent(code, forKey: .code)
    }
}

