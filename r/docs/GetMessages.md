# openapi::GetMessages


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatar_url** | [**AnyType**](.md) |  | [optional] 
**client** | [**AnyType**](.md) |  | [optional] 
**content** | [**AnyType**](.md) |  | [optional] 
**content_type** | [**AnyType**](.md) |  | [optional] 
**display_recipient** | [**AnyType**](.md) |  | [optional] 
**id** | [**AnyType**](.md) |  | [optional] 
**is_me_message** | [**AnyType**](.md) |  | [optional] 
**reactions** | [**AnyType**](.md) |  | [optional] 
**recipient_id** | [**AnyType**](.md) |  | [optional] 
**sender_email** | [**AnyType**](.md) |  | [optional] 
**sender_full_name** | [**AnyType**](.md) |  | [optional] 
**sender_id** | [**AnyType**](.md) |  | [optional] 
**sender_realm_str** | [**AnyType**](.md) |  | [optional] 
**stream_id** | [**AnyType**](.md) |  | [optional] 
**subject** | [**AnyType**](.md) |  | [optional] 
**topic_links** | [**AnyType**](.md) |  | [optional] 
**submessages** | [**AnyType**](.md) |  | [optional] 
**timestamp** | [**AnyType**](.md) |  | [optional] 
**type** | [**AnyType**](.md) |  | [optional] 
**flags** | **array[character]** | The user&#39;s [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags  | [optional] 
**last_edit_timestamp** | **integer** | The UNIX timestamp for when the message was last edited, in UTC seconds.  | [optional] 
**match_content** | **character** | Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords.  | [optional] 
**match_subject** | **character** | Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords.  | [optional] 


