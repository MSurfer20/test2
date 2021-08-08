# presence_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client** | **char \*** | The client&#39;s platform name.  | [optional] 
**status** | **zulip_rest_api_presence_STATUS_e** | The status of the user on this client. It is either &#x60;idle&#x60; or &#x60;active&#x60;.  | [optional] 
**timestamp** | **int** | The UNIX timestamp of when this client sent the user&#39;s presence to the server with the precision of a second.  | [optional] 
**pushable** | **int** | Whether the client is capable of showing mobile/push notifications to the user.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


