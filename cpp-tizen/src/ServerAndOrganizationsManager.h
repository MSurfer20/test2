#ifndef _ServerAndOrganizationsManager_H_
#define _ServerAndOrganizationsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "JsonSuccess.h"
#include "JsonSuccessBase.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup ServerAndOrganizations ServerAndOrganizations
 * \ingroup Operations
 *  @{
 */
class ServerAndOrganizationsManager {
public:
	ServerAndOrganizationsManager();
	virtual ~ServerAndOrganizationsManager();

/*! \brief Add a code playground. *Synchronous*
 *
 * Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
 * \param name The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language.  *Required*
 * \param pygmentsLanguage The name of the Pygments language lexer for that programming language.  *Required*
 * \param urlPrefix The url prefix for the playground.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool addCodePlaygroundSync(char * accessToken,
	std::string name, std::string pygmentsLanguage, std::string urlPrefix, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Add a code playground. *Asynchronous*
 *
 * Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
 * \param name The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language.  *Required*
 * \param pygmentsLanguage The name of the Pygments language lexer for that programming language.  *Required*
 * \param urlPrefix The url prefix for the playground.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool addCodePlaygroundAsync(char * accessToken,
	std::string name, std::string pygmentsLanguage, std::string urlPrefix, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Add a linkifier. *Synchronous*
 *
 * Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 
 * \param pattern The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  *Required*
 * \param urlFormatString The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool addLinkifierSync(char * accessToken,
	std::string pattern, std::string urlFormatString, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Add a linkifier. *Asynchronous*
 *
 * Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 
 * \param pattern The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  *Required*
 * \param urlFormatString The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool addLinkifierAsync(char * accessToken,
	std::string pattern, std::string urlFormatString, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Create a custom profile field. *Synchronous*
 *
 * [Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 
 * \param fieldType The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account  *Required*
 * \param name The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user's profile. 
 * \param hint The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
 * \param fieldData Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createCustomProfileFieldSync(char * accessToken,
	int fieldType, std::string name, std::string hint, std::string fieldData, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Create a custom profile field. *Asynchronous*
 *
 * [Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 
 * \param fieldType The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account  *Required*
 * \param name The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user's profile. 
 * \param hint The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
 * \param fieldData Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createCustomProfileFieldAsync(char * accessToken,
	int fieldType, std::string name, std::string hint, std::string fieldData, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Get all custom emoji. *Synchronous*
 *
 * Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getCustomEmojiSync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Get all custom emoji. *Asynchronous*
 *
 * Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getCustomEmojiAsync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Get all custom profile fields. *Synchronous*
 *
 * Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getCustomProfileFieldsSync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Get all custom profile fields. *Asynchronous*
 *
 * Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getCustomProfileFieldsAsync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Get linkifiers. *Synchronous*
 *
 * List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getLinkifiersSync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Get linkifiers. *Asynchronous*
 *
 * List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getLinkifiersAsync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Get server settings. *Synchronous*
 *
 * Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getServerSettingsSync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Get server settings. *Asynchronous*
 *
 * Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getServerSettingsAsync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Remove a code playground. *Synchronous*
 *
 * Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 
 * \param playgroundId The ID of the playground that you want to remove.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool removeCodePlaygroundSync(char * accessToken,
	int playgroundId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);

/*! \brief Remove a code playground. *Asynchronous*
 *
 * Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 
 * \param playgroundId The ID of the playground that you want to remove.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool removeCodePlaygroundAsync(char * accessToken,
	int playgroundId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);


/*! \brief Remove a linkifier. *Synchronous*
 *
 * Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 
 * \param filterId The ID of the linkifier that you want to remove.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool removeLinkifierSync(char * accessToken,
	int filterId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);

/*! \brief Remove a linkifier. *Asynchronous*
 *
 * Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 
 * \param filterId The ID of the linkifier that you want to remove.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool removeLinkifierAsync(char * accessToken,
	int filterId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);


/*! \brief Reorder custom profile fields. *Synchronous*
 *
 * Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
 * \param order A list of the IDs of all the custom profile fields defined in this organization, in the desired new order.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool reorderCustomProfileFieldsSync(char * accessToken,
	std::list<int> order, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);

/*! \brief Reorder custom profile fields. *Asynchronous*
 *
 * Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
 * \param order A list of the IDs of all the custom profile fields defined in this organization, in the desired new order.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool reorderCustomProfileFieldsAsync(char * accessToken,
	std::list<int> order, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);


/*! \brief Update a linkifier. *Synchronous*
 *
 * Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 
 * \param filterId The ID of the linkifier that you want to update.  *Required*
 * \param pattern The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  *Required*
 * \param urlFormatString The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateLinkifierSync(char * accessToken,
	int filterId, std::string pattern, std::string urlFormatString, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);

/*! \brief Update a linkifier. *Asynchronous*
 *
 * Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 
 * \param filterId The ID of the linkifier that you want to update.  *Required*
 * \param pattern The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  *Required*
 * \param urlFormatString The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateLinkifierAsync(char * accessToken,
	int filterId, std::string pattern, std::string urlFormatString, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);


/*! \brief Upload custom emoji. *Synchronous*
 *
 * This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 
 * \param emojiName The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji).  *Required*
 * \param filename 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uploadCustomEmojiSync(char * accessToken,
	std::string emojiName, std::string filename, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);

/*! \brief Upload custom emoji. *Asynchronous*
 *
 * This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 
 * \param emojiName The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji).  *Required*
 * \param filename 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uploadCustomEmojiAsync(char * accessToken,
	std::string emojiName, std::string filename, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://example.zulipchat.com/api/v1";
	}
};
/** @}*/

}
}
#endif /* ServerAndOrganizationsManager_H_ */
