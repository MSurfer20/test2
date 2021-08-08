# UserBase
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | [**String**](string.md) | The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else.  | [optional] [default to null]
**is\_bot** | [**Boolean**](boolean.md) | A boolean specifying whether the user is a bot or full account.  | [optional] [default to null]
**avatar\_url** | [**String**](string.md) | URL for the user&#39;s avatar.  Will be &#x60;null&#x60; if the &#x60;client_gravatar&#x60; query parameter was set to &#x60;True&#x60; and the user&#39;s avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the &#x60;user_avatar_url_field_optional&#x60; capability, this will be missing at the server&#39;s sole discretion.  | [optional] [default to null]
**avatar\_version** | [**Integer**](integer.md) | Version for the user&#39;s avatar.  Used for cache-busting requests for the user&#39;s avatar.  Clients generally shouldn&#39;t need to use this; most avatar URLs sent by Zulip will already end with &#x60;?v&#x3D;{avatar_version}&#x60;.  | [optional] [default to null]
**full\_name** | [**String**](string.md) | Full name of the user or bot, used for all display purposes.  | [optional] [default to null]
**is\_admin** | [**Boolean**](boolean.md) | A boolean specifying whether the user is an organization administrator.  | [optional] [default to null]
**is\_owner** | [**Boolean**](boolean.md) | A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8).  | [optional] [default to null]
**is\_billing\_admin** | [**Boolean**](boolean.md) | A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73).  | [optional] [default to null]
**role** | [**Integer**](integer.md) | [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner &#x3D;&gt; 100 * Organization administrator &#x3D;&gt; 200 * Organization moderator &#x3D;&gt; 300 * Member &#x3D;&gt; 400 * Guest &#x3D;&gt; 600  **Changes**: New in Zulip 4.0 (feature level 59).  | [optional] [default to null]
**bot\_type** | [**Integer**](integer.md) | An integer describing the type of bot: * &#x60;null&#x60; if the user isn&#39;t a bot. * &#x60;1&#x60; for a &#x60;Generic&#x60; bot. * &#x60;2&#x60; for an &#x60;Incoming webhook&#x60; bot. * &#x60;3&#x60; for an &#x60;Outgoing webhook&#x60; bot. * &#x60;4&#x60; for an &#x60;Embedded&#x60; bot.  | [optional] [default to null]
**user\_id** | [**Integer**](integer.md) | The unique ID of the user.  | [optional] [default to null]
**bot\_owner\_id** | [**Integer**](integer.md) | If the user is a bot (i.e. &#x60;is_bot&#x60; is &#x60;True&#x60;), &#x60;bot_owner&#x60; is the user ID of the bot&#39;s owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a &#x60;bot_owner&#x60; field containing the email address of the bot&#39;s owner.  | [optional] [default to null]
**is\_active** | [**Boolean**](boolean.md) | A boolean specifying whether the user account has been deactivated.  | [optional] [default to null]
**is\_guest** | [**Boolean**](boolean.md) | A boolean specifying whether the user is a guest user.  | [optional] [default to null]
**timezone** | [**String**](string.md) | The time zone of the user.  | [optional] [default to null]
**date\_joined** | [**String**](string.md) | The time the user account was created.  | [optional] [default to null]
**delivery\_email** | [**String**](string.md) | The user&#39;s real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy.  | [optional] [default to null]
**profile\_data** | [**Map**](object.md) | A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user&#39;s data for that field.  Generally the data includes just a single &#x60;value&#x60; key; for those custom profile fields supporting Markdown, a &#x60;rendered_value&#x60; key will also be present.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

