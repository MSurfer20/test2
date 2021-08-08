# OAIGetMessagesAllOf

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatarUrl** | [**OAIAnyType***](.md) |  | [optional] 
**client** | [**OAIAnyType***](.md) |  | [optional] 
**content** | [**OAIAnyType***](.md) |  | [optional] 
**contentType** | [**OAIAnyType***](.md) |  | [optional] 
**displayRecipient** | [**OAIAnyType***](.md) |  | [optional] 
**_id** | [**OAIAnyType***](.md) |  | [optional] 
**isMeMessage** | [**OAIAnyType***](.md) |  | [optional] 
**reactions** | [**OAIAnyType***](.md) |  | [optional] 
**recipientId** | [**OAIAnyType***](.md) |  | [optional] 
**senderEmail** | [**OAIAnyType***](.md) |  | [optional] 
**senderFullName** | [**OAIAnyType***](.md) |  | [optional] 
**senderId** | [**OAIAnyType***](.md) |  | [optional] 
**senderRealmStr** | [**OAIAnyType***](.md) |  | [optional] 
**streamId** | [**OAIAnyType***](.md) |  | [optional] 
**subject** | [**OAIAnyType***](.md) |  | [optional] 
**topicLinks** | [**OAIAnyType***](.md) |  | [optional] 
**submessages** | [**OAIAnyType***](.md) |  | [optional] 
**timestamp** | [**OAIAnyType***](.md) |  | [optional] 
**type** | [**OAIAnyType***](.md) |  | [optional] 
**flags** | **NSArray&lt;NSString*&gt;*** | The user&#39;s [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags  | [optional] 
**lastEditTimestamp** | **NSNumber*** | The UNIX timestamp for when the message was last edited, in UTC seconds.  | [optional] 
**matchContent** | **NSString*** | Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords.  | [optional] 
**matchSubject** | **NSString*** | Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


