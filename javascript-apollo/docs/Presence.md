# ZulipRestApi.Presence

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client** | **String** | The client&#39;s platform name.  | [optional] 
**status** | **String** | The status of the user on this client. It is either &#x60;idle&#x60; or &#x60;active&#x60;.  | [optional] 
**timestamp** | **Number** | The UNIX timestamp of when this client sent the user&#39;s presence to the server with the precision of a second.  | [optional] 
**pushable** | **Boolean** | Whether the client is capable of showing mobile/push notifications to the user.  | [optional] 



## Enum: StatusEnum


* `idle` (value: `"idle"`)

* `active` (value: `"active"`)




