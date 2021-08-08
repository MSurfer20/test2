#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/json_success.h"
#include "../model/json_success_base.h"
#include "../model/object.h"


// Add a code playground
//
// Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
//
json_success_base_t*
ServerAndOrganizationsAPI_addCodePlayground(apiClient_t *apiClient, char * name , char * pygments_language , char * url_prefix );


// Add a linkifier
//
// Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 
//
json_success_base_t*
ServerAndOrganizationsAPI_addLinkifier(apiClient_t *apiClient, char * pattern , char * url_format_string );


// Create a custom profile field
//
// [Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 
//
json_success_base_t*
ServerAndOrganizationsAPI_createCustomProfileField(apiClient_t *apiClient, int field_type , char * name , char * hint ,  field_data );


// Get all custom emoji
//
// Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 
//
json_success_base_t*
ServerAndOrganizationsAPI_getCustomEmoji(apiClient_t *apiClient);


// Get all custom profile fields
//
// Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 
//
json_success_base_t*
ServerAndOrganizationsAPI_getCustomProfileFields(apiClient_t *apiClient);


// Get linkifiers
//
// List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 
//
json_success_base_t*
ServerAndOrganizationsAPI_getLinkifiers(apiClient_t *apiClient);


// Get server settings
//
// Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
//
json_success_base_t*
ServerAndOrganizationsAPI_getServerSettings(apiClient_t *apiClient);


// Remove a code playground
//
// Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 
//
json_success_t*
ServerAndOrganizationsAPI_removeCodePlayground(apiClient_t *apiClient, int playground_id );


// Remove a linkifier
//
// Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 
//
json_success_t*
ServerAndOrganizationsAPI_removeLinkifier(apiClient_t *apiClient, int filter_id );


// Reorder custom profile fields
//
// Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
//
json_success_t*
ServerAndOrganizationsAPI_reorderCustomProfileFields(apiClient_t *apiClient, list_t * order );


// Update a linkifier
//
// Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 
//
json_success_t*
ServerAndOrganizationsAPI_updateLinkifier(apiClient_t *apiClient, int filter_id , char * pattern , char * url_format_string );


// Upload custom emoji
//
// This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 
//
json_success_t*
ServerAndOrganizationsAPI_uploadCustomEmoji(apiClient_t *apiClient, char * emoji_name , binary_t* filename );


