
# Table `Bot` 
(mapped from: Bot)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**userId** | user_id | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**fullName** | full_name | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**apiKey** | api_key | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**defaultSendingStream** | default_sending_stream | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**defaultEventsRegisterStream** | default_events_register_stream | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**defaultAllPublicStreams** | default_all_public_streams | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**avatarUrl** | avatar_url | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**ownerId** | owner_id | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**services** | services | blob |  | [**kotlin.Any**](.md) |  |  [optional]
**email** | email | text |  | **kotlin.String** | The email of the bot.  |  [optional]
**botType** | bot_type | int |  | **kotlin.Int** | An integer describing the type of bot: * &#x60;1&#x60; for a &#x60;Generic&#x60; bot. * &#x60;2&#x60; for an &#x60;Incoming webhook&#x60; bot. * &#x60;3&#x60; for an &#x60;Outgoing webhook&#x60; bot. * &#x60;4&#x60; for an &#x60;Embedded&#x60; bot.  |  [optional]
**isActive** | is_active | boolean |  | **kotlin.Boolean** | A boolean describing whether the user account has been deactivated.  |  [optional]














