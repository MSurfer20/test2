#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "basic_bot_base.h"



basic_bot_base_t *basic_bot_base_create(
    int user_id,
    char *full_name,
    char *api_key,
    char *default_sending_stream,
    char *default_events_register_stream,
    int default_all_public_streams,
    char *avatar_url,
    int owner_id,
    list_t *services
    ) {
    basic_bot_base_t *basic_bot_base_local_var = malloc(sizeof(basic_bot_base_t));
    if (!basic_bot_base_local_var) {
        return NULL;
    }
    basic_bot_base_local_var->user_id = user_id;
    basic_bot_base_local_var->full_name = full_name;
    basic_bot_base_local_var->api_key = api_key;
    basic_bot_base_local_var->default_sending_stream = default_sending_stream;
    basic_bot_base_local_var->default_events_register_stream = default_events_register_stream;
    basic_bot_base_local_var->default_all_public_streams = default_all_public_streams;
    basic_bot_base_local_var->avatar_url = avatar_url;
    basic_bot_base_local_var->owner_id = owner_id;
    basic_bot_base_local_var->services = services;

    return basic_bot_base_local_var;
}


void basic_bot_base_free(basic_bot_base_t *basic_bot_base) {
    if(NULL == basic_bot_base){
        return ;
    }
    listEntry_t *listEntry;
    if (basic_bot_base->full_name) {
        free(basic_bot_base->full_name);
        basic_bot_base->full_name = NULL;
    }
    if (basic_bot_base->api_key) {
        free(basic_bot_base->api_key);
        basic_bot_base->api_key = NULL;
    }
    if (basic_bot_base->default_sending_stream) {
        free(basic_bot_base->default_sending_stream);
        basic_bot_base->default_sending_stream = NULL;
    }
    if (basic_bot_base->default_events_register_stream) {
        free(basic_bot_base->default_events_register_stream);
        basic_bot_base->default_events_register_stream = NULL;
    }
    if (basic_bot_base->avatar_url) {
        free(basic_bot_base->avatar_url);
        basic_bot_base->avatar_url = NULL;
    }
    if (basic_bot_base->services) {
        list_ForEach(listEntry, basic_bot_base->services) {
            one_ofobjectobject_free(listEntry->data);
        }
        list_free(basic_bot_base->services);
        basic_bot_base->services = NULL;
    }
    free(basic_bot_base);
}

cJSON *basic_bot_base_convertToJSON(basic_bot_base_t *basic_bot_base) {
    cJSON *item = cJSON_CreateObject();

    // basic_bot_base->user_id
    if(basic_bot_base->user_id) { 
    if(cJSON_AddNumberToObject(item, "user_id", basic_bot_base->user_id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // basic_bot_base->full_name
    if(basic_bot_base->full_name) { 
    if(cJSON_AddStringToObject(item, "full_name", basic_bot_base->full_name) == NULL) {
    goto fail; //String
    }
     } 


    // basic_bot_base->api_key
    if(basic_bot_base->api_key) { 
    if(cJSON_AddStringToObject(item, "api_key", basic_bot_base->api_key) == NULL) {
    goto fail; //String
    }
     } 


    // basic_bot_base->default_sending_stream
    if(basic_bot_base->default_sending_stream) { 
    if(cJSON_AddStringToObject(item, "default_sending_stream", basic_bot_base->default_sending_stream) == NULL) {
    goto fail; //String
    }
     } 


    // basic_bot_base->default_events_register_stream
    if(basic_bot_base->default_events_register_stream) { 
    if(cJSON_AddStringToObject(item, "default_events_register_stream", basic_bot_base->default_events_register_stream) == NULL) {
    goto fail; //String
    }
     } 


    // basic_bot_base->default_all_public_streams
    if(basic_bot_base->default_all_public_streams) { 
    if(cJSON_AddBoolToObject(item, "default_all_public_streams", basic_bot_base->default_all_public_streams) == NULL) {
    goto fail; //Bool
    }
     } 


    // basic_bot_base->avatar_url
    if(basic_bot_base->avatar_url) { 
    if(cJSON_AddStringToObject(item, "avatar_url", basic_bot_base->avatar_url) == NULL) {
    goto fail; //String
    }
     } 


    // basic_bot_base->owner_id
    if(basic_bot_base->owner_id) { 
    if(cJSON_AddNumberToObject(item, "owner_id", basic_bot_base->owner_id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // basic_bot_base->services
    if(basic_bot_base->services) { 
    cJSON *services = cJSON_AddArrayToObject(item, "services");
    if(services == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *servicesListEntry;
    if (basic_bot_base->services) {
    list_ForEach(servicesListEntry, basic_bot_base->services) {
    cJSON *itemLocal = one_ofobjectobject_convertToJSON(servicesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(services, itemLocal);
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

basic_bot_base_t *basic_bot_base_parseFromJSON(cJSON *basic_bot_baseJSON){

    basic_bot_base_t *basic_bot_base_local_var = NULL;

    // basic_bot_base->user_id
    cJSON *user_id = cJSON_GetObjectItemCaseSensitive(basic_bot_baseJSON, "user_id");
    if (user_id) { 
    if(!cJSON_IsNumber(user_id))
    {
    goto end; //Numeric
    }
    }

    // basic_bot_base->full_name
    cJSON *full_name = cJSON_GetObjectItemCaseSensitive(basic_bot_baseJSON, "full_name");
    if (full_name) { 
    if(!cJSON_IsString(full_name))
    {
    goto end; //String
    }
    }

    // basic_bot_base->api_key
    cJSON *api_key = cJSON_GetObjectItemCaseSensitive(basic_bot_baseJSON, "api_key");
    if (api_key) { 
    if(!cJSON_IsString(api_key))
    {
    goto end; //String
    }
    }

    // basic_bot_base->default_sending_stream
    cJSON *default_sending_stream = cJSON_GetObjectItemCaseSensitive(basic_bot_baseJSON, "default_sending_stream");
    if (default_sending_stream) { 
    if(!cJSON_IsString(default_sending_stream))
    {
    goto end; //String
    }
    }

    // basic_bot_base->default_events_register_stream
    cJSON *default_events_register_stream = cJSON_GetObjectItemCaseSensitive(basic_bot_baseJSON, "default_events_register_stream");
    if (default_events_register_stream) { 
    if(!cJSON_IsString(default_events_register_stream))
    {
    goto end; //String
    }
    }

    // basic_bot_base->default_all_public_streams
    cJSON *default_all_public_streams = cJSON_GetObjectItemCaseSensitive(basic_bot_baseJSON, "default_all_public_streams");
    if (default_all_public_streams) { 
    if(!cJSON_IsBool(default_all_public_streams))
    {
    goto end; //Bool
    }
    }

    // basic_bot_base->avatar_url
    cJSON *avatar_url = cJSON_GetObjectItemCaseSensitive(basic_bot_baseJSON, "avatar_url");
    if (avatar_url) { 
    if(!cJSON_IsString(avatar_url))
    {
    goto end; //String
    }
    }

    // basic_bot_base->owner_id
    cJSON *owner_id = cJSON_GetObjectItemCaseSensitive(basic_bot_baseJSON, "owner_id");
    if (owner_id) { 
    if(!cJSON_IsNumber(owner_id))
    {
    goto end; //Numeric
    }
    }

    // basic_bot_base->services
    cJSON *services = cJSON_GetObjectItemCaseSensitive(basic_bot_baseJSON, "services");
    list_t *servicesList;
    if (services) { 
    cJSON *services_local_nonprimitive;
    if(!cJSON_IsArray(services)){
        goto end; //nonprimitive container
    }

    servicesList = list_create();

    cJSON_ArrayForEach(services_local_nonprimitive,services )
    {
        if(!cJSON_IsObject(services_local_nonprimitive)){
            goto end;
        }
        one_ofobjectobject_t *servicesItem = one_ofobjectobject_parseFromJSON(services_local_nonprimitive);

        list_addElement(servicesList, servicesItem);
    }
    }


    basic_bot_base_local_var = basic_bot_base_create (
        user_id ? user_id->valuedouble : 0,
        full_name ? strdup(full_name->valuestring) : NULL,
        api_key ? strdup(api_key->valuestring) : NULL,
        default_sending_stream ? strdup(default_sending_stream->valuestring) : NULL,
        default_events_register_stream ? strdup(default_events_register_stream->valuestring) : NULL,
        default_all_public_streams ? default_all_public_streams->valueint : 0,
        avatar_url ? strdup(avatar_url->valuestring) : NULL,
        owner_id ? owner_id->valuedouble : 0,
        services ? servicesList : NULL
        );

    return basic_bot_base_local_var;
end:
    return NULL;

}
