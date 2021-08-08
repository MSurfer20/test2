# AddSubscriptionsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **Any** |  | 
**msg** | **Any** |  | 
**subscribed** | [String:[String]] | A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query.  | [optional] 
**alreadySubscribed** | [String:[String]] | A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to.  | [optional] 
**unauthorized** | **[String]** | A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if &#x60;authorization_errors_fatal&#x3D;false&#x60;.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


