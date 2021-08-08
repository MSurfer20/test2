# GetMessages


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatar_url** | **object** |  | [optional] 
**client** | **object** |  | [optional] 
**content** | **object** |  | [optional] 
**content_type** | **object** |  | [optional] 
**display_recipient** | **object** |  | [optional] 
**id** | **object** |  | [optional] 
**is_me_message** | **object** |  | [optional] 
**reactions** | **object** |  | [optional] 
**recipient_id** | **object** |  | [optional] 
**sender_email** | **object** |  | [optional] 
**sender_full_name** | **object** |  | [optional] 
**sender_id** | **object** |  | [optional] 
**sender_realm_str** | **object** |  | [optional] 
**stream_id** | **object** |  | [optional] 
**subject** | **object** |  | [optional] 
**topic_links** | **object** |  | [optional] 
**submessages** | **object** |  | [optional] 
**timestamp** | **object** |  | [optional] 
**type** | **object** |  | [optional] 
**flags** | **list[str]** | The user&#39;s [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags  | [optional] 
**last_edit_timestamp** | **int** | The UNIX timestamp for when the message was last edited, in UTC seconds.  | [optional] 
**match_content** | **str** | Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords.  | [optional] 
**match_subject** | **str** | Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


