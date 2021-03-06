//
// CodedErrorBase.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public struct CodedErrorBase: Codable { 


    public var result: Any
    public var msg: Any
    /** A string that identifies the error.  */
    public var code: String?

    public init(result: Any, msg: Any, code: String?) {
        self.result = result
        self.msg = msg
        self.code = code
    }

}
