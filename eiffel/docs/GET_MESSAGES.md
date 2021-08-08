# GET_MESSAGES

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatar_url** | [**ANY**](.md) |  | [optional] [default to null]
**client** | [**ANY**](.md) |  | [optional] [default to null]
**content** | [**ANY**](.md) |  | [optional] [default to null]
**content_type** | [**ANY**](.md) |  | [optional] [default to null]
**display_recipient** | [**ANY**](.md) |  | [optional] [default to null]
**id** | [**ANY**](.md) |  | [optional] [default to null]
**is_me_message** | [**ANY**](.md) |  | [optional] [default to null]
**reactions** | [**ANY**](.md) |  | [optional] [default to null]
**recipient_id** | [**ANY**](.md) |  | [optional] [default to null]
**sender_email** | [**ANY**](.md) |  | [optional] [default to null]
**sender_full_name** | [**ANY**](.md) |  | [optional] [default to null]
**sender_id** | [**ANY**](.md) |  | [optional] [default to null]
**sender_realm_str** | [**ANY**](.md) |  | [optional] [default to null]
**stream_id** | [**ANY**](.md) |  | [optional] [default to null]
**subject** | [**ANY**](.md) |  | [optional] [default to null]
**topic_links** | [**ANY**](.md) |  | [optional] [default to null]
**submessages** | [**ANY**](.md) |  | [optional] [default to null]
**timestamp** | [**ANY**](.md) |  | [optional] [default to null]
**type** | [**ANY**](.md) |  | [optional] [default to null]
**flags** | [**LIST [STRING_32]**](STRING_32.md) | The user&#39;s [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags  | [optional] [default to null]
**last_edit_timestamp** | **INTEGER_32** | The UNIX timestamp for when the message was last edited, in UTC seconds.  | [optional] [default to null]
**match_content** | [**STRING_32**](STRING_32.md) | Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords.  | [optional] [default to null]
**match_subject** | [**STRING_32**](STRING_32.md) | Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


