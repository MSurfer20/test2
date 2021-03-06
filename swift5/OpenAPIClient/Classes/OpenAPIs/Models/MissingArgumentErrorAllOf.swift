//
// MissingArgumentErrorAllOf.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied  */
public struct MissingArgumentErrorAllOf: Codable, Hashable {

    public var result: AnyCodable?
    public var msg: AnyCodable?
    public var code: AnyCodable?
    /** It contains the information about the missing parameter.  */
    public var varName: String?

    public init(result: AnyCodable? = nil, msg: AnyCodable? = nil, code: AnyCodable? = nil, varName: String? = nil) {
        self.result = result
        self.msg = msg
        self.code = code
        self.varName = varName
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case result
        case msg
        case code
        case varName = "var_name"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(result, forKey: .result)
        try container.encodeIfPresent(msg, forKey: .msg)
        try container.encodeIfPresent(code, forKey: .code)
        try container.encodeIfPresent(varName, forKey: .varName)
    }
}

