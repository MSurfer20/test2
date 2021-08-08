/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"
#include "OpenAPIServerAndOrganizationsApi.h"

#include "OpenAPIHelpers.h"
#include "OpenAPIJsonSuccess.h"
#include "OpenAPIJsonSuccessBase.h"

namespace OpenAPI 
{

/* Add a code playground
 *
 * Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  &#x60;POST {{ api_url }}/v1/realm/playgrounds&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
*/
class OPENAPI_API OpenAPIServerAndOrganizationsApi::AddCodePlaygroundRequest : public Request
{
public:
    virtual ~AddCodePlaygroundRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language.  */
	FString Name;
	/* The name of the Pygments language lexer for that programming language.  */
	FString PygmentsLanguage;
	/* The url prefix for the playground.  */
	FString UrlPrefix;
};

class OPENAPI_API OpenAPIServerAndOrganizationsApi::AddCodePlaygroundResponse : public Response
{
public:
    virtual ~AddCodePlaygroundResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccessBase Content;
};

/* Add a linkifier
 *
 * Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;POST {{ api_url }}/v1/realm/filters&#x60; 
*/
class OPENAPI_API OpenAPIServerAndOrganizationsApi::AddLinkifierRequest : public Request
{
public:
    virtual ~AddLinkifierRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  */
	FString Pattern;
	/* The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`.  */
	FString UrlFormatString;
};

class OPENAPI_API OpenAPIServerAndOrganizationsApi::AddLinkifierResponse : public Response
{
public:
    virtual ~AddLinkifierResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccessBase Content;
};

/* Create a custom profile field
 *
 * [Create a custom profile field](/help/add-custom-profile-fields) in the user&#39;s organization.  &#x60;POST {{ api_url }}/v1/realm/profile_fields&#x60; 
*/
class OPENAPI_API OpenAPIServerAndOrganizationsApi::CreateCustomProfileFieldRequest : public Request
{
public:
    virtual ~CreateCustomProfileFieldRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account  */
	int32 FieldType = 0;
	/* The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user's profile.  */
	TOptional<FString> Name;
	/* The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  */
	TOptional<FString> Hint;
	/* Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  */
	TOptional<TSharedPtr<FJsonObject>> FieldData;
};

class OPENAPI_API OpenAPIServerAndOrganizationsApi::CreateCustomProfileFieldResponse : public Response
{
public:
    virtual ~CreateCustomProfileFieldResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccessBase Content;
};

/* Get all custom emoji
 *
 * Get all the custom emoji in the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/emoji&#x60; 
*/
class OPENAPI_API OpenAPIServerAndOrganizationsApi::GetCustomEmojiRequest : public Request
{
public:
    virtual ~GetCustomEmojiRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
};

class OPENAPI_API OpenAPIServerAndOrganizationsApi::GetCustomEmojiResponse : public Response
{
public:
    virtual ~GetCustomEmojiResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccessBase Content;
};

/* Get all custom profile fields
 *
 * Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/profile_fields&#x60; 
*/
class OPENAPI_API OpenAPIServerAndOrganizationsApi::GetCustomProfileFieldsRequest : public Request
{
public:
    virtual ~GetCustomProfileFieldsRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
};

class OPENAPI_API OpenAPIServerAndOrganizationsApi::GetCustomProfileFieldsResponse : public Response
{
public:
    virtual ~GetCustomProfileFieldsResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccessBase Content;
};

/* Get linkifiers
 *
 * List all of an organization&#39;s configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;GET {{ api_url }}/v1/realm/linkifiers&#x60;  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar &#x60;GET /realm/filters&#x60; endpoint was available with each entry in a &#x60;[pattern, url_format, id]&#x60; tuple format. 
*/
class OPENAPI_API OpenAPIServerAndOrganizationsApi::GetLinkifiersRequest : public Request
{
public:
    virtual ~GetLinkifiersRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
};

class OPENAPI_API OpenAPIServerAndOrganizationsApi::GetLinkifiersResponse : public Response
{
public:
    virtual ~GetLinkifiersResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccessBase Content;
};

/* Get server settings
 *
 * Fetch global settings for a Zulip server.  &#x60;GET {{ api_url }}/v1/server_settings&#x60;  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it&#39;s running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
*/
class OPENAPI_API OpenAPIServerAndOrganizationsApi::GetServerSettingsRequest : public Request
{
public:
    virtual ~GetServerSettingsRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
};

class OPENAPI_API OpenAPIServerAndOrganizationsApi::GetServerSettingsResponse : public Response
{
public:
    virtual ~GetServerSettingsResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccessBase Content;
};

/* Remove a code playground
 *
 * Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  &#x60;DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). 
*/
class OPENAPI_API OpenAPIServerAndOrganizationsApi::RemoveCodePlaygroundRequest : public Request
{
public:
    virtual ~RemoveCodePlaygroundRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* The ID of the playground that you want to remove.  */
	int32 PlaygroundId = 0;
};

class OPENAPI_API OpenAPIServerAndOrganizationsApi::RemoveCodePlaygroundResponse : public Response
{
public:
    virtual ~RemoveCodePlaygroundResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccess Content;
};

/* Remove a linkifier
 *
 * Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;DELETE {{ api_url }}/v1/realm/filters/{filter_id}&#x60; 
*/
class OPENAPI_API OpenAPIServerAndOrganizationsApi::RemoveLinkifierRequest : public Request
{
public:
    virtual ~RemoveLinkifierRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* The ID of the linkifier that you want to remove.  */
	int32 FilterId = 0;
};

class OPENAPI_API OpenAPIServerAndOrganizationsApi::RemoveLinkifierResponse : public Response
{
public:
    virtual ~RemoveLinkifierResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccess Content;
};

/* Reorder custom profile fields
 *
 * Reorder the custom profile fields in the user&#39;s organization.  &#x60;PATCH {{ api_url }}/v1/realm/profile_fields&#x60;  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
*/
class OPENAPI_API OpenAPIServerAndOrganizationsApi::ReorderCustomProfileFieldsRequest : public Request
{
public:
    virtual ~ReorderCustomProfileFieldsRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* A list of the IDs of all the custom profile fields defined in this organization, in the desired new order.  */
	TArray<int32> Order;
};

class OPENAPI_API OpenAPIServerAndOrganizationsApi::ReorderCustomProfileFieldsResponse : public Response
{
public:
    virtual ~ReorderCustomProfileFieldsResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccess Content;
};

/* Update a linkifier
 *
 * Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;PATCH {{ api_url }}/v1/realm/filters/{filter_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 57). 
*/
class OPENAPI_API OpenAPIServerAndOrganizationsApi::UpdateLinkifierRequest : public Request
{
public:
    virtual ~UpdateLinkifierRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* The ID of the linkifier that you want to update.  */
	int32 FilterId = 0;
	/* The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  */
	FString Pattern;
	/* The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`.  */
	FString UrlFormatString;
};

class OPENAPI_API OpenAPIServerAndOrganizationsApi::UpdateLinkifierResponse : public Response
{
public:
    virtual ~UpdateLinkifierResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccess Content;
};

/* Upload custom emoji
 *
 * This endpoint is used to upload a custom emoji for use in the user&#39;s organization.  Access to this endpoint depends on the [organization&#39;s configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  &#x60;POST {{ api_url }}/v1/realm/emoji/{emoji_name}&#x60; 
*/
class OPENAPI_API OpenAPIServerAndOrganizationsApi::UploadCustomEmojiRequest : public Request
{
public:
    virtual ~UploadCustomEmojiRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji).  */
	FString EmojiName;
	TOptional<HttpFileInput> Filename;
};

class OPENAPI_API OpenAPIServerAndOrganizationsApi::UploadCustomEmojiResponse : public Response
{
public:
    virtual ~UploadCustomEmojiResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccess Content;
};

}
