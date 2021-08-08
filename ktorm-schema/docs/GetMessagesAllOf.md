
# Table `GetMessages_allOf` 
(mapped from: GetMessagesAllOf)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**avatarUrl** | avatar_url | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**client** | client | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**content** | content | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**contentType** | content_type | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**displayRecipient** | display_recipient | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**id** | id | blob PRIMARY KEY |  | [**kotlin.Any**](.md) |  |  [optional]
**isMeMessage** | is_me_message | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**reactions** | reactions | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**recipientId** | recipient_id | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**senderEmail** | sender_email | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**senderFullName** | sender_full_name | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**senderId** | sender_id | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**senderRealmStr** | sender_realm_str | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**streamId** | stream_id | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**subject** | subject | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**topicLinks** | topic_links | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**submessages** | submessages | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**timestamp** | timestamp | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**type** | type | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**flags** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | The user&#39;s [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags  |  [optional]
**lastEditTimestamp** | last_edit_timestamp | int |  | **kotlin.Int** | The UNIX timestamp for when the message was last edited, in UTC seconds.  |  [optional]
**matchContent** | match_content | text |  | **kotlin.String** | Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords.  |  [optional]
**matchSubject** | match_subject | text |  | **kotlin.String** | Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords.  |  [optional]





















# **Table `GetMessagesAllOfFlags`**
(mapped from: GetMessagesAllOfFlags)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getMessagesAllOf | getMessagesAllOf | long | | kotlin.Long | Primary Key | *one*
flags | flags | text | | kotlin.String | Foreign Key | *many*






