
# Table `UserGroup` 
(mapped from: UserGroup)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text |  | **kotlin.String** | The name of the user group.  |  [optional]
**description** | description | text |  | **kotlin.String** | The description of the user group.  |  [optional]
**members** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Int&gt;** | Array containing the id of the users who are members of this user group.  |  [optional]
**id** | id | int PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The ID of the user group.  |  [optional]




# **Table `UserGroupMembers`**
(mapped from: UserGroupMembers)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
userGroup | userGroup | long | | kotlin.Long | Primary Key | *one*
members | members | int | | kotlin.Int | Foreign Key | *many*




