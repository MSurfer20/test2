#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_base.h"


char* roleuser_base_ToString(zulip_rest_api_user_base_ROLE_e role) {
    char* roleArray[] =  { "NULL", "100", "200", "300", "400", "600" };
	return roleArray[role];
}

zulip_rest_api_user_base_ROLE_e roleuser_base_FromString(char* role){
    int stringToReturn = 0;
    char *roleArray[] =  { "NULL", "100", "200", "300", "400", "600" };
    size_t sizeofArray = sizeof(roleArray) / sizeof(roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(role, roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

user_base_t *user_base_create(
    char *email,
    int is_bot,
    char *avatar_url,
    int avatar_version,
    char *full_name,
    int is_admin,
    int is_owner,
    int is_billing_admin,
    int role,
    int bot_type,
    int user_id,
    int bot_owner_id,
    int is_active,
    int is_guest,
    char *timezone,
    char *date_joined,
    char *delivery_email,
    list_t* profile_data
    ) {
    user_base_t *user_base_local_var = malloc(sizeof(user_base_t));
    if (!user_base_local_var) {
        return NULL;
    }
    user_base_local_var->email = email;
    user_base_local_var->is_bot = is_bot;
    user_base_local_var->avatar_url = avatar_url;
    user_base_local_var->avatar_version = avatar_version;
    user_base_local_var->full_name = full_name;
    user_base_local_var->is_admin = is_admin;
    user_base_local_var->is_owner = is_owner;
    user_base_local_var->is_billing_admin = is_billing_admin;
    user_base_local_var->role = role;
    user_base_local_var->bot_type = bot_type;
    user_base_local_var->user_id = user_id;
    user_base_local_var->bot_owner_id = bot_owner_id;
    user_base_local_var->is_active = is_active;
    user_base_local_var->is_guest = is_guest;
    user_base_local_var->timezone = timezone;
    user_base_local_var->date_joined = date_joined;
    user_base_local_var->delivery_email = delivery_email;
    user_base_local_var->profile_data = profile_data;

    return user_base_local_var;
}


void user_base_free(user_base_t *user_base) {
    if(NULL == user_base){
        return ;
    }
    listEntry_t *listEntry;
    if (user_base->email) {
        free(user_base->email);
        user_base->email = NULL;
    }
    if (user_base->avatar_url) {
        free(user_base->avatar_url);
        user_base->avatar_url = NULL;
    }
    if (user_base->full_name) {
        free(user_base->full_name);
        user_base->full_name = NULL;
    }
    if (user_base->timezone) {
        free(user_base->timezone);
        user_base->timezone = NULL;
    }
    if (user_base->date_joined) {
        free(user_base->date_joined);
        user_base->date_joined = NULL;
    }
    if (user_base->delivery_email) {
        free(user_base->delivery_email);
        user_base->delivery_email = NULL;
    }
    if (user_base->profile_data) {
        list_ForEach(listEntry, user_base->profile_data) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_free(user_base->profile_data);
        user_base->profile_data = NULL;
    }
    free(user_base);
}

cJSON *user_base_convertToJSON(user_base_t *user_base) {
    cJSON *item = cJSON_CreateObject();

    // user_base->email
    if(user_base->email) { 
    if(cJSON_AddStringToObject(item, "email", user_base->email) == NULL) {
    goto fail; //String
    }
     } 


    // user_base->is_bot
    if(user_base->is_bot) { 
    if(cJSON_AddBoolToObject(item, "is_bot", user_base->is_bot) == NULL) {
    goto fail; //Bool
    }
     } 


    // user_base->avatar_url
    if(user_base->avatar_url) { 
    if(cJSON_AddStringToObject(item, "avatar_url", user_base->avatar_url) == NULL) {
    goto fail; //String
    }
     } 


    // user_base->avatar_version
    if(user_base->avatar_version) { 
    if(cJSON_AddNumberToObject(item, "avatar_version", user_base->avatar_version) == NULL) {
    goto fail; //Numeric
    }
     } 


    // user_base->full_name
    if(user_base->full_name) { 
    if(cJSON_AddStringToObject(item, "full_name", user_base->full_name) == NULL) {
    goto fail; //String
    }
     } 


    // user_base->is_admin
    if(user_base->is_admin) { 
    if(cJSON_AddBoolToObject(item, "is_admin", user_base->is_admin) == NULL) {
    goto fail; //Bool
    }
     } 


    // user_base->is_owner
    if(user_base->is_owner) { 
    if(cJSON_AddBoolToObject(item, "is_owner", user_base->is_owner) == NULL) {
    goto fail; //Bool
    }
     } 


    // user_base->is_billing_admin
    if(user_base->is_billing_admin) { 
    if(cJSON_AddBoolToObject(item, "is_billing_admin", user_base->is_billing_admin) == NULL) {
    goto fail; //Bool
    }
     } 


    // user_base->role
    
    if(cJSON_AddNumberToObject(item, "role", user_base->role) == NULL) {
    goto fail; //Numeric
    }
    


    // user_base->bot_type
    if(user_base->bot_type) { 
    if(cJSON_AddNumberToObject(item, "bot_type", user_base->bot_type) == NULL) {
    goto fail; //Numeric
    }
     } 


    // user_base->user_id
    if(user_base->user_id) { 
    if(cJSON_AddNumberToObject(item, "user_id", user_base->user_id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // user_base->bot_owner_id
    if(user_base->bot_owner_id) { 
    if(cJSON_AddNumberToObject(item, "bot_owner_id", user_base->bot_owner_id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // user_base->is_active
    if(user_base->is_active) { 
    if(cJSON_AddBoolToObject(item, "is_active", user_base->is_active) == NULL) {
    goto fail; //Bool
    }
     } 


    // user_base->is_guest
    if(user_base->is_guest) { 
    if(cJSON_AddBoolToObject(item, "is_guest", user_base->is_guest) == NULL) {
    goto fail; //Bool
    }
     } 


    // user_base->timezone
    if(user_base->timezone) { 
    if(cJSON_AddStringToObject(item, "timezone", user_base->timezone) == NULL) {
    goto fail; //String
    }
     } 


    // user_base->date_joined
    if(user_base->date_joined) { 
    if(cJSON_AddStringToObject(item, "date_joined", user_base->date_joined) == NULL) {
    goto fail; //String
    }
     } 


    // user_base->delivery_email
    if(user_base->delivery_email) { 
    if(cJSON_AddStringToObject(item, "delivery_email", user_base->delivery_email) == NULL) {
    goto fail; //String
    }
     } 


    // user_base->profile_data
    if(user_base->profile_data) { 
    cJSON *profile_data = cJSON_AddObjectToObject(item, "profile_data");
    if(profile_data == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = profile_data;
    listEntry_t *profile_dataListEntry;
    if (user_base->profile_data) {
    list_ForEach(profile_dataListEntry, user_base->profile_data) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)profile_dataListEntry->data;
    }
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

user_base_t *user_base_parseFromJSON(cJSON *user_baseJSON){

    user_base_t *user_base_local_var = NULL;

    // user_base->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(user_baseJSON, "email");
    if (email) { 
    if(!cJSON_IsString(email))
    {
    goto end; //String
    }
    }

    // user_base->is_bot
    cJSON *is_bot = cJSON_GetObjectItemCaseSensitive(user_baseJSON, "is_bot");
    if (is_bot) { 
    if(!cJSON_IsBool(is_bot))
    {
    goto end; //Bool
    }
    }

    // user_base->avatar_url
    cJSON *avatar_url = cJSON_GetObjectItemCaseSensitive(user_baseJSON, "avatar_url");
    if (avatar_url) { 
    if(!cJSON_IsString(avatar_url))
    {
    goto end; //String
    }
    }

    // user_base->avatar_version
    cJSON *avatar_version = cJSON_GetObjectItemCaseSensitive(user_baseJSON, "avatar_version");
    if (avatar_version) { 
    if(!cJSON_IsNumber(avatar_version))
    {
    goto end; //Numeric
    }
    }

    // user_base->full_name
    cJSON *full_name = cJSON_GetObjectItemCaseSensitive(user_baseJSON, "full_name");
    if (full_name) { 
    if(!cJSON_IsString(full_name))
    {
    goto end; //String
    }
    }

    // user_base->is_admin
    cJSON *is_admin = cJSON_GetObjectItemCaseSensitive(user_baseJSON, "is_admin");
    if (is_admin) { 
    if(!cJSON_IsBool(is_admin))
    {
    goto end; //Bool
    }
    }

    // user_base->is_owner
    cJSON *is_owner = cJSON_GetObjectItemCaseSensitive(user_baseJSON, "is_owner");
    if (is_owner) { 
    if(!cJSON_IsBool(is_owner))
    {
    goto end; //Bool
    }
    }

    // user_base->is_billing_admin
    cJSON *is_billing_admin = cJSON_GetObjectItemCaseSensitive(user_baseJSON, "is_billing_admin");
    if (is_billing_admin) { 
    if(!cJSON_IsBool(is_billing_admin))
    {
    goto end; //Bool
    }
    }

    // user_base->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(user_baseJSON, "role");
    if (role) { 
    if(!cJSON_IsNumber(role))
    {
    goto end; //Numeric
    }
    }

    // user_base->bot_type
    cJSON *bot_type = cJSON_GetObjectItemCaseSensitive(user_baseJSON, "bot_type");
    if (bot_type) { 
    if(!cJSON_IsNumber(bot_type))
    {
    goto end; //Numeric
    }
    }

    // user_base->user_id
    cJSON *user_id = cJSON_GetObjectItemCaseSensitive(user_baseJSON, "user_id");
    if (user_id) { 
    if(!cJSON_IsNumber(user_id))
    {
    goto end; //Numeric
    }
    }

    // user_base->bot_owner_id
    cJSON *bot_owner_id = cJSON_GetObjectItemCaseSensitive(user_baseJSON, "bot_owner_id");
    if (bot_owner_id) { 
    if(!cJSON_IsNumber(bot_owner_id))
    {
    goto end; //Numeric
    }
    }

    // user_base->is_active
    cJSON *is_active = cJSON_GetObjectItemCaseSensitive(user_baseJSON, "is_active");
    if (is_active) { 
    if(!cJSON_IsBool(is_active))
    {
    goto end; //Bool
    }
    }

    // user_base->is_guest
    cJSON *is_guest = cJSON_GetObjectItemCaseSensitive(user_baseJSON, "is_guest");
    if (is_guest) { 
    if(!cJSON_IsBool(is_guest))
    {
    goto end; //Bool
    }
    }

    // user_base->timezone
    cJSON *timezone = cJSON_GetObjectItemCaseSensitive(user_baseJSON, "timezone");
    if (timezone) { 
    if(!cJSON_IsString(timezone))
    {
    goto end; //String
    }
    }

    // user_base->date_joined
    cJSON *date_joined = cJSON_GetObjectItemCaseSensitive(user_baseJSON, "date_joined");
    if (date_joined) { 
    if(!cJSON_IsString(date_joined))
    {
    goto end; //String
    }
    }

    // user_base->delivery_email
    cJSON *delivery_email = cJSON_GetObjectItemCaseSensitive(user_baseJSON, "delivery_email");
    if (delivery_email) { 
    if(!cJSON_IsString(delivery_email))
    {
    goto end; //String
    }
    }

    // user_base->profile_data
    cJSON *profile_data = cJSON_GetObjectItemCaseSensitive(user_baseJSON, "profile_data");
    list_t *profile_dataList;
    if (profile_data) { 
    cJSON *profile_data_local_map;
    if(!cJSON_IsObject(profile_data)) {
        goto end;//primitive map container
    }
    profile_dataList = list_create();
    keyValuePair_t *localMapKeyPair;
    cJSON_ArrayForEach(profile_data_local_map, profile_data)
    {
		cJSON *localMapObject = profile_data_local_map;
        list_addElement(profile_dataList , localMapKeyPair);
    }
    }


    user_base_local_var = user_base_create (
        email ? strdup(email->valuestring) : NULL,
        is_bot ? is_bot->valueint : 0,
        avatar_url ? strdup(avatar_url->valuestring) : NULL,
        avatar_version ? avatar_version->valuedouble : 0,
        full_name ? strdup(full_name->valuestring) : NULL,
        is_admin ? is_admin->valueint : 0,
        is_owner ? is_owner->valueint : 0,
        is_billing_admin ? is_billing_admin->valueint : 0,
        role ? role->valuedouble : 0,
        bot_type ? bot_type->valuedouble : 0,
        user_id ? user_id->valuedouble : 0,
        bot_owner_id ? bot_owner_id->valuedouble : 0,
        is_active ? is_active->valueint : 0,
        is_guest ? is_guest->valueint : 0,
        timezone ? strdup(timezone->valuestring) : NULL,
        date_joined ? strdup(date_joined->valuestring) : NULL,
        delivery_email ? strdup(delivery_email->valuestring) : NULL,
        profile_data ? profile_dataList : NULL
        );

    return user_base_local_var;
end:
    return NULL;

}
