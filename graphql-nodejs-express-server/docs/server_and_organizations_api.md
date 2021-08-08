# server_and_organizations_api

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddCodePlayground**](server_and_organizations_api.md#AddCodePlayground) | **POST** /realm/playgrounds | Add a code playground
[**AddLinkifier**](server_and_organizations_api.md#AddLinkifier) | **POST** /realm/filters | Add a linkifier
[**CreateCustomProfileField**](server_and_organizations_api.md#CreateCustomProfileField) | **POST** /realm/profile_fields | Create a custom profile field
[**GetCustomEmoji**](server_and_organizations_api.md#GetCustomEmoji) | **GET** /realm/emoji | Get all custom emoji
[**GetCustomProfileFields**](server_and_organizations_api.md#GetCustomProfileFields) | **GET** /realm/profile_fields | Get all custom profile fields
[**GetLinkifiers**](server_and_organizations_api.md#GetLinkifiers) | **GET** /realm/linkifiers | Get linkifiers
[**GetServerSettings**](server_and_organizations_api.md#GetServerSettings) | **GET** /server_settings | Get server settings
[**RemoveCodePlayground**](server_and_organizations_api.md#RemoveCodePlayground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
[**RemoveLinkifier**](server_and_organizations_api.md#RemoveLinkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
[**ReorderCustomProfileFields**](server_and_organizations_api.md#ReorderCustomProfileFields) | **PATCH** /realm/profile_fields | Reorder custom profile fields
[**UpdateLinkifier**](server_and_organizations_api.md#UpdateLinkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier
[**UploadCustomEmoji**](server_and_organizations_api.md#UploadCustomEmoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji


<a name="AddCodePlayground"></a>
# **AddCodePlayground**
> JsonSuccessBase AddCodePlayground(name, pygmentsLanguage, urlPrefix)

Add a code playground

Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  &#x60;POST {{ api_url }}/v1/realm/playgrounds&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
<a name="AddLinkifier"></a>
# **AddLinkifier**
> JsonSuccessBase AddLinkifier(pattern, urlFormatString)

Add a linkifier

Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;POST {{ api_url }}/v1/realm/filters&#x60; 
<a name="CreateCustomProfileField"></a>
# **CreateCustomProfileField**
> JsonSuccessBase CreateCustomProfileField(fieldType, name, hint, fieldData)

Create a custom profile field

[Create a custom profile field](/help/add-custom-profile-fields) in the user&#39;s organization.  &#x60;POST {{ api_url }}/v1/realm/profile_fields&#x60; 
<a name="GetCustomEmoji"></a>
# **GetCustomEmoji**
> JsonSuccessBase GetCustomEmoji()

Get all custom emoji

Get all the custom emoji in the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/emoji&#x60; 
<a name="GetCustomProfileFields"></a>
# **GetCustomProfileFields**
> JsonSuccessBase GetCustomProfileFields()

Get all custom profile fields

Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/profile_fields&#x60; 
<a name="GetLinkifiers"></a>
# **GetLinkifiers**
> JsonSuccessBase GetLinkifiers()

Get linkifiers

List all of an organization&#39;s configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;GET {{ api_url }}/v1/realm/linkifiers&#x60;  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar &#x60;GET /realm/filters&#x60; endpoint was available with each entry in a &#x60;[pattern, url_format, id]&#x60; tuple format. 
<a name="GetServerSettings"></a>
# **GetServerSettings**
> JsonSuccessBase GetServerSettings()

Get server settings

Fetch global settings for a Zulip server.  &#x60;GET {{ api_url }}/v1/server_settings&#x60;  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it&#39;s running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
<a name="RemoveCodePlayground"></a>
# **RemoveCodePlayground**
> JsonSuccess RemoveCodePlayground(playgroundId)

Remove a code playground

Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  &#x60;DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). 
<a name="RemoveLinkifier"></a>
# **RemoveLinkifier**
> JsonSuccess RemoveLinkifier(filterId)

Remove a linkifier

Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;DELETE {{ api_url }}/v1/realm/filters/{filter_id}&#x60; 
<a name="ReorderCustomProfileFields"></a>
# **ReorderCustomProfileFields**
> JsonSuccess ReorderCustomProfileFields(order)

Reorder custom profile fields

Reorder the custom profile fields in the user&#39;s organization.  &#x60;PATCH {{ api_url }}/v1/realm/profile_fields&#x60;  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
<a name="UpdateLinkifier"></a>
# **UpdateLinkifier**
> JsonSuccess UpdateLinkifier(filterId, pattern, urlFormatString)

Update a linkifier

Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;PATCH {{ api_url }}/v1/realm/filters/{filter_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 57). 
<a name="UploadCustomEmoji"></a>
# **UploadCustomEmoji**
> JsonSuccess UploadCustomEmoji(emojiName, filename)

Upload custom emoji

This endpoint is used to upload a custom emoji for use in the user&#39;s organization.  Access to this endpoint depends on the [organization&#39;s configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  &#x60;POST {{ api_url }}/v1/realm/emoji/{emoji_name}&#x60; 
