#ifndef TINY_CPP_CLIENT_ServerAndOrganizationsApi_H_
#define TINY_CPP_CLIENT_ServerAndOrganizationsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "AbstractService.h"
#include "Helpers.h"
#include <list>

#include "JsonSuccess.h"
#include "JsonSuccessBase.h"
#include "Object.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class ServerAndOrganizationsApi : public AbstractService {
public:
    ServerAndOrganizationsApi() = default;

    virtual ~ServerAndOrganizationsApi() = default;

    /**
    * Add a code playground.
    *
    * Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
    * \param name The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language.  *Required*
    * \param pygmentsLanguage The name of the Pygments language lexer for that programming language.  *Required*
    * \param urlPrefix The url prefix for the playground.  *Required*
    */
    Response<
                JsonSuccessBase
        >
    addCodePlayground(
            
            std::string name
            , 
            
            std::string pygmentsLanguage
            , 
            
            std::string urlPrefix
            
    );
    /**
    * Add a linkifier.
    *
    * Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 
    * \param pattern The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  *Required*
    * \param urlFormatString The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`.  *Required*
    */
    Response<
                JsonSuccessBase
        >
    addLinkifier(
            
            std::string pattern
            , 
            
            std::string urlFormatString
            
    );
    /**
    * Create a custom profile field.
    *
    * [Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 
    * \param fieldType The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account  *Required*
    * \param name The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user's profile. 
    * \param hint The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
    * \param fieldData Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
    */
    Response<
                JsonSuccessBase
        >
    createCustomProfileField(
            
            int fieldType
            , 
            
            std::string name
            , 
            
            std::string hint
            , 
            
            Object fieldData
            
    );
    /**
    * Get all custom emoji.
    *
    * Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 
    */
    Response<
                JsonSuccessBase
        >
    getCustomEmoji(
    );
    /**
    * Get all custom profile fields.
    *
    * Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 
    */
    Response<
                JsonSuccessBase
        >
    getCustomProfileFields(
    );
    /**
    * Get linkifiers.
    *
    * List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 
    */
    Response<
                JsonSuccessBase
        >
    getLinkifiers(
    );
    /**
    * Get server settings.
    *
    * Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
    */
    Response<
                JsonSuccessBase
        >
    getServerSettings(
    );
    /**
    * Remove a code playground.
    *
    * Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 
    * \param playgroundId The ID of the playground that you want to remove.  *Required*
    */
    Response<
                JsonSuccess
        >
    removeCodePlayground(
            
            int playgroundId
            
    );
    /**
    * Remove a linkifier.
    *
    * Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 
    * \param filterId The ID of the linkifier that you want to remove.  *Required*
    */
    Response<
                JsonSuccess
        >
    removeLinkifier(
            
            int filterId
            
    );
    /**
    * Reorder custom profile fields.
    *
    * Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
    * \param order A list of the IDs of all the custom profile fields defined in this organization, in the desired new order.  *Required*
    */
    Response<
                JsonSuccess
        >
    reorderCustomProfileFields(
            std::list<int> order
            
            
    );
    /**
    * Update a linkifier.
    *
    * Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 
    * \param filterId The ID of the linkifier that you want to update.  *Required*
    * \param pattern The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  *Required*
    * \param urlFormatString The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`.  *Required*
    */
    Response<
                JsonSuccess
        >
    updateLinkifier(
            
            int filterId
            , 
            
            std::string pattern
            , 
            
            std::string urlFormatString
            
    );
    /**
    * Upload custom emoji.
    *
    * This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 
    * \param emojiName The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji).  *Required*
    * \param filename 
    */
    Response<
                JsonSuccess
        >
    uploadCustomEmoji(
            
            std::string emojiName
            , 
            
            std::string filename
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_ServerAndOrganizationsApi_H_ */