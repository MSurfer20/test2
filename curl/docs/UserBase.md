

# UserBase

A dictionary containing basic data on a given Zulip user. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** | The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else.  |  [optional]
**isBot** | **Boolean** | A boolean specifying whether the user is a bot or full account.  |  [optional]
**avatarUrl** | **String** | URL for the user&#39;s avatar.  Will be &#x60;null&#x60; if the &#x60;client_gravatar&#x60; query parameter was set to &#x60;True&#x60; and the user&#39;s avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the &#x60;user_avatar_url_field_optional&#x60; capability, this will be missing at the server&#39;s sole discretion.  |  [optional]
**avatarVersion** | **Integer** | Version for the user&#39;s avatar.  Used for cache-busting requests for the user&#39;s avatar.  Clients generally shouldn&#39;t need to use this; most avatar URLs sent by Zulip will already end with &#x60;?v&#x3D;{avatar_version}&#x60;.  |  [optional]
**fullName** | **String** | Full name of the user or bot, used for all display purposes.  |  [optional]
**isAdmin** | **Boolean** | A boolean specifying whether the user is an organization administrator.  |  [optional]
**isOwner** | **Boolean** | A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8).  |  [optional]
**isBillingAdmin** | **Boolean** | A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73).  |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner &#x3D;&gt; 100 * Organization administrator &#x3D;&gt; 200 * Organization moderator &#x3D;&gt; 300 * Member &#x3D;&gt; 400 * Guest &#x3D;&gt; 600  **Changes**: New in Zulip 4.0 (feature level 59).  |  [optional]
**botType** | **Integer** | An integer describing the type of bot: * &#x60;null&#x60; if the user isn&#39;t a bot. * &#x60;1&#x60; for a &#x60;Generic&#x60; bot. * &#x60;2&#x60; for an &#x60;Incoming webhook&#x60; bot. * &#x60;3&#x60; for an &#x60;Outgoing webhook&#x60; bot. * &#x60;4&#x60; for an &#x60;Embedded&#x60; bot.  |  [optional]
**userId** | **Integer** | The unique ID of the user.  |  [optional]
**botOwnerId** | **Integer** | If the user is a bot (i.e. &#x60;is_bot&#x60; is &#x60;True&#x60;), &#x60;bot_owner&#x60; is the user ID of the bot&#39;s owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a &#x60;bot_owner&#x60; field containing the email address of the bot&#39;s owner.  |  [optional]
**isActive** | **Boolean** | A boolean specifying whether the user account has been deactivated.  |  [optional]
**isGuest** | **Boolean** | A boolean specifying whether the user is a guest user.  |  [optional]
**timezone** | **String** | The time zone of the user.  |  [optional]
**dateJoined** | **String** | The time the user account was created.  |  [optional]
**deliveryEmail** | **String** | The user&#39;s real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy.  |  [optional]
**profileData** | [**Map&lt;String, Object&gt;**](Object.md) | A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user&#39;s data for that field.  Generally the data includes just a single &#x60;value&#x60; key; for those custom profile fields supporting Markdown, a &#x60;rendered_value&#x60; key will also be present.  |  [optional]



## Enum: RoleEnum

Name | Value
---- | -----
NUMBER_100 | 100
NUMBER_200 | 200
NUMBER_300 | 300
NUMBER_400 | 400
NUMBER_600 | 600



