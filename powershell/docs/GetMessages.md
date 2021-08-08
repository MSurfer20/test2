# GetMessages
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AvatarUrl** | [**AnyType**](.md) |  | [optional] 
**Client** | [**AnyType**](.md) |  | [optional] 
**Content** | [**AnyType**](.md) |  | [optional] 
**ContentType** | [**AnyType**](.md) |  | [optional] 
**DisplayRecipient** | [**AnyType**](.md) |  | [optional] 
**Id** | [**AnyType**](.md) |  | [optional] 
**IsMeMessage** | [**AnyType**](.md) |  | [optional] 
**Reactions** | [**AnyType**](.md) |  | [optional] 
**RecipientId** | [**AnyType**](.md) |  | [optional] 
**SenderEmail** | [**AnyType**](.md) |  | [optional] 
**SenderFullName** | [**AnyType**](.md) |  | [optional] 
**SenderId** | [**AnyType**](.md) |  | [optional] 
**SenderRealmStr** | [**AnyType**](.md) |  | [optional] 
**StreamId** | [**AnyType**](.md) |  | [optional] 
**Subject** | [**AnyType**](.md) |  | [optional] 
**TopicLinks** | [**AnyType**](.md) |  | [optional] 
**Submessages** | [**AnyType**](.md) |  | [optional] 
**Timestamp** | [**AnyType**](.md) |  | [optional] 
**Type** | [**AnyType**](.md) |  | [optional] 
**Flags** | **String[]** | The user&#39;s [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags  | [optional] 
**LastEditTimestamp** | **Int32** | The UNIX timestamp for when the message was last edited, in UTC seconds.  | [optional] 
**MatchContent** | **String** | Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;&quot;&quot;highlight&quot;&quot;&gt;&#x60; elements wrapping the matches for the search keywords.  | [optional] 
**MatchSubject** | **String** | Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;&quot;&quot;highlight&quot;&quot;&gt;&#x60; elements wrapping the matches for the search keywords.  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetMessages = Initialize-PSOpenAPIToolsGetMessages  -AvatarUrl null `
 -Client null `
 -Content null `
 -ContentType null `
 -DisplayRecipient null `
 -Id null `
 -IsMeMessage null `
 -Reactions null `
 -RecipientId null `
 -SenderEmail null `
 -SenderFullName null `
 -SenderId null `
 -SenderRealmStr null `
 -StreamId null `
 -Subject null `
 -TopicLinks null `
 -Submessages null `
 -Timestamp null `
 -Type null `
 -Flags null `
 -LastEditTimestamp null `
 -MatchContent null `
 -MatchSubject null
```

- Convert the resource to JSON
```powershell
$GetMessages | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

