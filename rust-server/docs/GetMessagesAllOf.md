# GetMessagesAllOf

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatar_url** | [***serde_json::Value**](.md) |  | [optional] [default to None]
**client** | [***serde_json::Value**](.md) |  | [optional] [default to None]
**content** | [***serde_json::Value**](.md) |  | [optional] [default to None]
**content_type** | [***serde_json::Value**](.md) |  | [optional] [default to None]
**display_recipient** | [***serde_json::Value**](.md) |  | [optional] [default to None]
**id** | [***serde_json::Value**](.md) |  | [optional] [default to None]
**is_me_message** | [***serde_json::Value**](.md) |  | [optional] [default to None]
**reactions** | [***serde_json::Value**](.md) |  | [optional] [default to None]
**recipient_id** | [***serde_json::Value**](.md) |  | [optional] [default to None]
**sender_email** | [***serde_json::Value**](.md) |  | [optional] [default to None]
**sender_full_name** | [***serde_json::Value**](.md) |  | [optional] [default to None]
**sender_id** | [***serde_json::Value**](.md) |  | [optional] [default to None]
**sender_realm_str** | [***serde_json::Value**](.md) |  | [optional] [default to None]
**stream_id** | [***serde_json::Value**](.md) |  | [optional] [default to None]
**subject** | [***serde_json::Value**](.md) |  | [optional] [default to None]
**topic_links** | [***serde_json::Value**](.md) |  | [optional] [default to None]
**submessages** | [***serde_json::Value**](.md) |  | [optional] [default to None]
**timestamp** | [***serde_json::Value**](.md) |  | [optional] [default to None]
**type_** | [***serde_json::Value**](.md) |  | [optional] [default to None]
**flags** | **Vec<String>** | The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags  | [optional] [default to None]
**last_edit_timestamp** | **isize** | The UNIX timestamp for when the message was last edited, in UTC seconds.  | [optional] [default to None]
**match_content** | **String** | Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords.  | [optional] [default to None]
**match_subject** | **String** | Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


