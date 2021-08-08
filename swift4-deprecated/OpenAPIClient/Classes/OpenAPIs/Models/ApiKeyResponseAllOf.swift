//
// ApiKeyResponseAllOf.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public struct ApiKeyResponseAllOf: Codable { 


    public var result: Any?
    public var msg: Any?
    /** The API key that can be used to authenticate as the requested user.  */
    public var apiKey: String
    /** The email address of the user who owns the API key  */
    public var email: String

    public init(result: Any?, msg: Any?, apiKey: String, email: String) {
        self.result = result
        self.msg = msg
        self.apiKey = apiKey
        self.email = email
    }

    public enum CodingKeys: String, CodingKey { 
        case result
        case msg
        case apiKey = "api_key"
        case email
    }

}
