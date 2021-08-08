# get_messages_all_of_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatar_url** |  |  | [optional] 
**client** |  |  | [optional] 
**content** |  |  | [optional] 
**content_type** |  |  | [optional] 
**display_recipient** |  |  | [optional] 
**id** |  |  | [optional] 
**is_me_message** |  |  | [optional] 
**reactions** |  |  | [optional] 
**recipient_id** |  |  | [optional] 
**sender_email** |  |  | [optional] 
**sender_full_name** |  |  | [optional] 
**sender_id** |  |  | [optional] 
**sender_realm_str** |  |  | [optional] 
**stream_id** |  |  | [optional] 
**subject** |  |  | [optional] 
**topic_links** |  |  | [optional] 
**submessages** |  |  | [optional] 
**timestamp** |  |  | [optional] 
**type** |  |  | [optional] 
**flags** | **list_t \*** | The user&#39;s [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags  | [optional] 
**last_edit_timestamp** | **int** | The UNIX timestamp for when the message was last edited, in UTC seconds.  | [optional] 
**match_content** | **char \*** | Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords.  | [optional] 
**match_subject** | **char \*** | Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


