# AddSubscriptionsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | [***serde_json::Value**](.md) |  | 
**msg** | [***serde_json::Value**](.md) |  | 
**subscribed** | [**std::collections::HashMap<String, Vec<String>>**](array.md) | A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query.  | [optional] [default to None]
**already_subscribed** | [**std::collections::HashMap<String, Vec<String>>**](array.md) | A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to.  | [optional] [default to None]
**unauthorized** | **Vec<String>** | A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


