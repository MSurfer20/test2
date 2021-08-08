
# Table `Attachments_messages` 
(mapped from: AttachmentsMessages)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**dateSent** | date_sent | int |  | **kotlin.Int** | Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called &#x60;name&#x60; and was a floating point number.  |  [optional]
**id** | id | int PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The unique message ID.  Messages should always be displayed sorted by ID.  |  [optional]




