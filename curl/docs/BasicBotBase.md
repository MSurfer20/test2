

# BasicBotBase


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **Integer** | The user id of the bot.  |  [optional]
**fullName** | **String** | The full name of the bot.  |  [optional]
**apiKey** | **String** | The API key of the bot which it uses to make API requests.  |  [optional]
**defaultSendingStream** | **String** | The default sending stream of the bot. Null if the bot doesn&#39;t have a default sending stream.  |  [optional]
**defaultEventsRegisterStream** | **String** | The default stream for which the bot receives events/register data. Null if the bot doesn&#39;t have such a default stream.  |  [optional]
**defaultAllPublicStreams** | **Boolean** | Whether the bot can send messages to all streams by default.  |  [optional]
**avatarUrl** | **String** | The URL of the bot&#39;s avatar.  |  [optional]
**ownerId** | **Integer** | The user id of the bot&#39;s owner.  Null if the bot has no owner.  |  [optional]
**services** | [**List&lt;OneOfobjectobject&gt;**](OneOfobjectobject.md) | The \&quot;Services\&quot; array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change.  |  [optional]



