
# Table `AddSubscriptionsResponse_allOf` 
(mapped from: AddSubscriptionsResponseAllOf)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**result** | result | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**msg** | msg | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**subscribed** | subscribed | blob |  | **kotlin.collections.Map&lt;kotlin.String, kotlin.Array&lt;kotlin.String&gt;&gt;** | A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query.  |  [optional]
**alreadySubscribed** | already_subscribed | blob |  | **kotlin.collections.Map&lt;kotlin.String, kotlin.Array&lt;kotlin.String&gt;&gt;** | A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to.  |  [optional]
**unauthorized** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if &#x60;authorization_errors_fatal&#x3D;false&#x60;.  |  [optional]






# **Table `AddSubscriptionsResponseAllOfUnauthorized`**
(mapped from: AddSubscriptionsResponseAllOfUnauthorized)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
addSubscriptionsResponseAllOf | addSubscriptionsResponseAllOf | long | | kotlin.Long | Primary Key | *one*
unauthorized | unauthorized | text | | kotlin.String | Foreign Key | *many*



