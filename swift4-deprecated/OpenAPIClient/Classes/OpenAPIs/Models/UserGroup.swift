//
// UserGroup.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/** Object containing the user group&#39;s attributes.  */
public struct UserGroup: Codable { 


    /** The name of the user group.  */
    public var name: String?
    /** The description of the user group.  */
    public var description: String?
    /** Array containing the id of the users who are members of this user group.  */
    public var members: [Int]?
    /** The ID of the user group.  */
    public var id: Int?

    public init(name: String?, description: String?, members: [Int]?, id: Int?) {
        self.name = name
        self.description = description
        self.members = members
        self.id = id
    }

}
