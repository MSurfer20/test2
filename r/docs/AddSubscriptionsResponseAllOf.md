# openapi::AddSubscriptionsResponseAllOf


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | [**AnyType**](.md) |  | [optional] 
**msg** | [**AnyType**](.md) |  | [optional] 
**subscribed** | [**map(array[character])**](array.md) | A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query.  | [optional] 
**already_subscribed** | [**map(array[character])**](array.md) | A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to.  | [optional] 
**unauthorized** | **array[character]** | A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if &#x60;authorization_errors_fatal&#x3D;false&#x60;.  | [optional] 


