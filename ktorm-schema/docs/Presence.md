
# Table `Presence` 
(mapped from: Presence)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**client** | client | text |  | **kotlin.String** | The client&#39;s platform name.  |  [optional]
**status** | status | text |  | [**status**](#StatusEnum) | The status of the user on this client. It is either &#x60;idle&#x60; or &#x60;active&#x60;.  |  [optional]
**timestamp** | timestamp | int |  | **kotlin.Int** | The UNIX timestamp of when this client sent the user&#39;s presence to the server with the precision of a second.  |  [optional]
**pushable** | pushable | boolean |  | **kotlin.Boolean** | Whether the client is capable of showing mobile/push notifications to the user.  |  [optional]






