# ZulipRestApi.GetMessages

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatarUrl** | [**AnyType**](.md) |  | [optional] 
**client** | [**AnyType**](.md) |  | [optional] 
**content** | [**AnyType**](.md) |  | [optional] 
**contentType** | [**AnyType**](.md) |  | [optional] 
**displayRecipient** | [**AnyType**](.md) |  | [optional] 
**id** | [**AnyType**](.md) |  | [optional] 
**isMeMessage** | [**AnyType**](.md) |  | [optional] 
**reactions** | [**AnyType**](.md) |  | [optional] 
**recipientId** | [**AnyType**](.md) |  | [optional] 
**senderEmail** | [**AnyType**](.md) |  | [optional] 
**senderFullName** | [**AnyType**](.md) |  | [optional] 
**senderId** | [**AnyType**](.md) |  | [optional] 
**senderRealmStr** | [**AnyType**](.md) |  | [optional] 
**streamId** | [**AnyType**](.md) |  | [optional] 
**subject** | [**AnyType**](.md) |  | [optional] 
**topicLinks** | [**AnyType**](.md) |  | [optional] 
**submessages** | [**AnyType**](.md) |  | [optional] 
**timestamp** | [**AnyType**](.md) |  | [optional] 
**type** | [**AnyType**](.md) |  | [optional] 
**flags** | **[String]** | The user&#39;s [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags  | [optional] 
**lastEditTimestamp** | **Number** | The UNIX timestamp for when the message was last edited, in UTC seconds.  | [optional] 
**matchContent** | **String** | Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords.  | [optional] 
**matchSubject** | **String** | Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords.  | [optional] 


