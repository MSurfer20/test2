
# Table `BasicBotBase` 
(mapped from: BasicBotBase)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**userId** | user_id | int |  | **kotlin.Int** | The user id of the bot.  |  [optional]
**fullName** | full_name | text |  | **kotlin.String** | The full name of the bot.  |  [optional]
**apiKey** | api_key | text |  | **kotlin.String** | The API key of the bot which it uses to make API requests.  |  [optional]
**defaultSendingStream** | default_sending_stream | text |  | **kotlin.String** | The default sending stream of the bot. Null if the bot doesn&#39;t have a default sending stream.  |  [optional]
**defaultEventsRegisterStream** | default_events_register_stream | text |  | **kotlin.String** | The default stream for which the bot receives events/register data. Null if the bot doesn&#39;t have such a default stream.  |  [optional]
**defaultAllPublicStreams** | default_all_public_streams | boolean |  | **kotlin.Boolean** | Whether the bot can send messages to all streams by default.  |  [optional]
**avatarUrl** | avatar_url | text |  | **kotlin.String** | The URL of the bot&#39;s avatar.  |  [optional]
**ownerId** | owner_id | int |  | **kotlin.Int** | The user id of the bot&#39;s owner.  Null if the bot has no owner.  |  [optional]
**services** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OneOfLessThanObjectCommaObjectGreaterThan&gt;**](OneOfLessThanObjectCommaObjectGreaterThan.md) | The \&quot;Services\&quot; array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change.  |  [optional]










# **Table `BasicBotBaseOneOfLessThanObjectCommaObjectGreaterThan`**
(mapped from: BasicBotBaseOneOfLessThanObjectCommaObjectGreaterThan)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
basicBotBase | basicBotBase | long | | kotlin.Long | Primary Key | *one*
oneOfLessThanObjectCommaObjectGreaterThan | oneOfLessThanObjectCommaObjectGreaterThan | long | | kotlin.Long | Foreign Key | *many*



