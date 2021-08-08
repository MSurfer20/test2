# ADD_SUBSCRIPTIONS_RESPONSE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_result** | [**ANY**](.md) |  | [default to null]
**msg** | [**ANY**](.md) |  | [default to null]
**subscribed** | [**STRING_TABLE [LIST [STRING_32]]**](LIST.md) | A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query.  | [optional] [default to null]
**already_subscribed** | [**STRING_TABLE [LIST [STRING_32]]**](LIST.md) | A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to.  | [optional] [default to null]
**unauthorized** | [**LIST [STRING_32]**](STRING_32.md) | A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if &#x60;authorization_errors_fatal&#x3D;false&#x60;.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


