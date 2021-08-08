# Org.OpenAPITools.Model.Presence
`{client_name}`: Object containing the details of the user's presence on a particular platform with the client's platform name being the object key. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_Client** | **string** | The client&#39;s platform name.  | [optional] 
**Status** | **string** | The status of the user on this client. It is either &#x60;idle&#x60; or &#x60;active&#x60;.  | [optional] 
**Timestamp** | **int** | The UNIX timestamp of when this client sent the user&#39;s presence to the server with the precision of a second.  | [optional] 
**Pushable** | **bool** | Whether the client is capable of showing mobile/push notifications to the user.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

