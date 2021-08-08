/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.2.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * ServerAndOrganizationsApi.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_ServerAndOrganizationsApi_H_
#define ORG_OPENAPITOOLS_CLIENT_API_ServerAndOrganizationsApi_H_


#include "../ApiClient.h"

#include "HttpContent.h"
#include "JsonSuccess.h"
#include "JsonSuccessBase.h"
#include "Stdshared_ptrObject.h"
#include <cpprest/details/basic_types.h>


#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  ServerAndOrganizationsApi 
{
public:

    explicit ServerAndOrganizationsApi( std::shared_ptr<const ApiClient> apiClient );

    virtual ~ServerAndOrganizationsApi();

    /// <summary>
    /// Add a code playground
    /// </summary>
    /// <remarks>
    /// Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  &#x60;POST {{ api_url }}/v1/realm/playgrounds&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
    /// </remarks>
    /// <param name="name">The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. </param>
    /// <param name="pygmentsLanguage">The name of the Pygments language lexer for that programming language. </param>
    /// <param name="urlPrefix">The url prefix for the playground. </param>
    pplx::task<std::shared_ptr<JsonSuccessBase>> addCodePlayground(
        utility::string_t name,
        utility::string_t pygmentsLanguage,
        utility::string_t urlPrefix
    ) const;
    /// <summary>
    /// Add a linkifier
    /// </summary>
    /// <remarks>
    /// Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;POST {{ api_url }}/v1/realm/filters&#x60; 
    /// </remarks>
    /// <param name="pattern">The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. </param>
    /// <param name="urlFormatString">The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. </param>
    pplx::task<std::shared_ptr<JsonSuccessBase>> addLinkifier(
        utility::string_t pattern,
        utility::string_t urlFormatString
    ) const;
    /// <summary>
    /// Create a custom profile field
    /// </summary>
    /// <remarks>
    /// [Create a custom profile field](/help/add-custom-profile-fields) in the user&#39;s organization.  &#x60;POST {{ api_url }}/v1/realm/profile_fields&#x60; 
    /// </remarks>
    /// <param name="fieldType">The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account </param>
    /// <param name="name">The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile.  (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="hint">The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="fieldData">Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  (optional, default to new Object())</param>
    pplx::task<std::shared_ptr<JsonSuccessBase>> createCustomProfileField(
        int32_t fieldType,
        boost::optional<utility::string_t> name,
        boost::optional<utility::string_t> hint,
        boost::optional<std::shared_ptr<Object>> fieldData
    ) const;
    /// <summary>
    /// Get all custom emoji
    /// </summary>
    /// <remarks>
    /// Get all the custom emoji in the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/emoji&#x60; 
    /// </remarks>
    pplx::task<std::shared_ptr<JsonSuccessBase>> getCustomEmoji(
    ) const;
    /// <summary>
    /// Get all custom profile fields
    /// </summary>
    /// <remarks>
    /// Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/profile_fields&#x60; 
    /// </remarks>
    pplx::task<std::shared_ptr<JsonSuccessBase>> getCustomProfileFields(
    ) const;
    /// <summary>
    /// Get linkifiers
    /// </summary>
    /// <remarks>
    /// List all of an organization&#39;s configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;GET {{ api_url }}/v1/realm/linkifiers&#x60;  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar &#x60;GET /realm/filters&#x60; endpoint was available with each entry in a &#x60;[pattern, url_format, id]&#x60; tuple format. 
    /// </remarks>
    pplx::task<std::shared_ptr<JsonSuccessBase>> getLinkifiers(
    ) const;
    /// <summary>
    /// Get server settings
    /// </summary>
    /// <remarks>
    /// Fetch global settings for a Zulip server.  &#x60;GET {{ api_url }}/v1/server_settings&#x60;  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it&#39;s running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
    /// </remarks>
    pplx::task<std::shared_ptr<JsonSuccessBase>> getServerSettings(
    ) const;
    /// <summary>
    /// Remove a code playground
    /// </summary>
    /// <remarks>
    /// Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  &#x60;DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). 
    /// </remarks>
    /// <param name="playgroundId">The ID of the playground that you want to remove. </param>
    pplx::task<std::shared_ptr<JsonSuccess>> removeCodePlayground(
        int32_t playgroundId
    ) const;
    /// <summary>
    /// Remove a linkifier
    /// </summary>
    /// <remarks>
    /// Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;DELETE {{ api_url }}/v1/realm/filters/{filter_id}&#x60; 
    /// </remarks>
    /// <param name="filterId">The ID of the linkifier that you want to remove. </param>
    pplx::task<std::shared_ptr<JsonSuccess>> removeLinkifier(
        int32_t filterId
    ) const;
    /// <summary>
    /// Reorder custom profile fields
    /// </summary>
    /// <remarks>
    /// Reorder the custom profile fields in the user&#39;s organization.  &#x60;PATCH {{ api_url }}/v1/realm/profile_fields&#x60;  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
    /// </remarks>
    /// <param name="order">A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. </param>
    pplx::task<std::shared_ptr<JsonSuccess>> reorderCustomProfileFields(
        std::vector<int32_t> order
    ) const;
    /// <summary>
    /// Update a linkifier
    /// </summary>
    /// <remarks>
    /// Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;PATCH {{ api_url }}/v1/realm/filters/{filter_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 57). 
    /// </remarks>
    /// <param name="filterId">The ID of the linkifier that you want to update. </param>
    /// <param name="pattern">The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. </param>
    /// <param name="urlFormatString">The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. </param>
    pplx::task<std::shared_ptr<JsonSuccess>> updateLinkifier(
        int32_t filterId,
        utility::string_t pattern,
        utility::string_t urlFormatString
    ) const;
    /// <summary>
    /// Upload custom emoji
    /// </summary>
    /// <remarks>
    /// This endpoint is used to upload a custom emoji for use in the user&#39;s organization.  Access to this endpoint depends on the [organization&#39;s configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  &#x60;POST {{ api_url }}/v1/realm/emoji/{emoji_name}&#x60; 
    /// </remarks>
    /// <param name="emojiName">The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). </param>
    /// <param name="filename"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::shared_ptr<JsonSuccess>> uploadCustomEmoji(
        utility::string_t emojiName,
        boost::optional<std::shared_ptr<HttpContent>> filename
    ) const;

protected:
    std::shared_ptr<const ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_API_ServerAndOrganizationsApi_H_ */

