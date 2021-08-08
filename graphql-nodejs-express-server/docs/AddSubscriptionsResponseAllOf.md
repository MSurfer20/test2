# AddSubscriptionsResponseAllOf

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | [***AnyType**](.md) |  | [optional] [default to null]
**msg** | [***AnyType**](.md) |  | [optional] [default to null]
**subscribed** | [**String!**](array.md) | A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query.  | [optional] [default to null]
**alreadySubscribed** | [**String!**](array.md) | A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to.  | [optional] [default to null]
**unauthorized** | **String!** | A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if &#x60;authorization_errors_fatal&#x3D;false&#x60;.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


