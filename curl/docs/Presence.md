

# Presence

`{client_name}`: Object containing the details of the user's presence on a particular platform with the client's platform name being the object key. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client** | **String** | The client&#39;s platform name.  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the user on this client. It is either &#x60;idle&#x60; or &#x60;active&#x60;.  |  [optional]
**timestamp** | **Integer** | The UNIX timestamp of when this client sent the user&#39;s presence to the server with the precision of a second.  |  [optional]
**pushable** | **Boolean** | Whether the client is capable of showing mobile/push notifications to the user.  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
IDLE | &quot;idle&quot;
ACTIVE | &quot;active&quot;



