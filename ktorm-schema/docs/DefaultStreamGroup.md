
# Table `DefaultStreamGroup` 
(mapped from: DefaultStreamGroup)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text |  | **kotlin.String** | Name of the default stream group.  |  [optional]
**description** | description | text |  | **kotlin.String** | Description of the default stream group.  |  [optional]
**id** | id | int PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | id of the default stream group.  |  [optional]
**streams** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BasicStream&gt;**](BasicStream.md) | Array containing details about the streams in the default stream group.  |  [optional]





# **Table `DefaultStreamGroupBasicStream`**
(mapped from: DefaultStreamGroupBasicStream)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
defaultStreamGroup | defaultStreamGroup | long | | kotlin.Long | Primary Key | *one*
basicStream | basicStream | long | | kotlin.Long | Foreign Key | *many*



