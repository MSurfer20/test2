#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bot_all_of.h"



bot_all_of_t *bot_all_of_create(
    char *email,
    int bot_type,
    int is_active
    ) {
    bot_all_of_t *bot_all_of_local_var = malloc(sizeof(bot_all_of_t));
    if (!bot_all_of_local_var) {
        return NULL;
    }
    bot_all_of_local_var->user_id = user_id;
    bot_all_of_local_var->full_name = full_name;
    bot_all_of_local_var->api_key = api_key;
    bot_all_of_local_var->default_sending_stream = default_sending_stream;
    bot_all_of_local_var->default_events_register_stream = default_events_register_stream;
    bot_all_of_local_var->default_all_public_streams = default_all_public_streams;
    bot_all_of_local_var->avatar_url = avatar_url;
    bot_all_of_local_var->owner_id = owner_id;
    bot_all_of_local_var->services = services;
    bot_all_of_local_var->email = email;
    bot_all_of_local_var->bot_type = bot_type;
    bot_all_of_local_var->is_active = is_active;

    return bot_all_of_local_var;
}


void bot_all_of_free(bot_all_of_t *bot_all_of) {
    if(NULL == bot_all_of){
        return ;
    }
    listEntry_t *listEntry;
    if (bot_all_of->email) {
        free(bot_all_of->email);
        bot_all_of->email = NULL;
    }
    free(bot_all_of);
}

cJSON *bot_all_of_convertToJSON(bot_all_of_t *bot_all_of) {
    cJSON *item = cJSON_CreateObject();

    // bot_all_of->user_id
    if(bot_all_of->user_id) { 
     } 


    // bot_all_of->full_name
    if(bot_all_of->full_name) { 
     } 


    // bot_all_of->api_key
    if(bot_all_of->api_key) { 
     } 


    // bot_all_of->default_sending_stream
    if(bot_all_of->default_sending_stream) { 
     } 


    // bot_all_of->default_events_register_stream
    if(bot_all_of->default_events_register_stream) { 
     } 


    // bot_all_of->default_all_public_streams
    if(bot_all_of->default_all_public_streams) { 
     } 


    // bot_all_of->avatar_url
    if(bot_all_of->avatar_url) { 
     } 


    // bot_all_of->owner_id
    if(bot_all_of->owner_id) { 
     } 


    // bot_all_of->services
    if(bot_all_of->services) { 
     } 


    // bot_all_of->email
    if(bot_all_of->email) { 
    if(cJSON_AddStringToObject(item, "email", bot_all_of->email) == NULL) {
    goto fail; //String
    }
     } 


    // bot_all_of->bot_type
    if(bot_all_of->bot_type) { 
    if(cJSON_AddNumberToObject(item, "bot_type", bot_all_of->bot_type) == NULL) {
    goto fail; //Numeric
    }
     } 


    // bot_all_of->is_active
    if(bot_all_of->is_active) { 
    if(cJSON_AddBoolToObject(item, "is_active", bot_all_of->is_active) == NULL) {
    goto fail; //Bool
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

bot_all_of_t *bot_all_of_parseFromJSON(cJSON *bot_all_ofJSON){

    bot_all_of_t *bot_all_of_local_var = NULL;

    // bot_all_of->user_id
    cJSON *user_id = cJSON_GetObjectItemCaseSensitive(bot_all_ofJSON, "user_id");
    }

    // bot_all_of->full_name
    cJSON *full_name = cJSON_GetObjectItemCaseSensitive(bot_all_ofJSON, "full_name");
    }

    // bot_all_of->api_key
    cJSON *api_key = cJSON_GetObjectItemCaseSensitive(bot_all_ofJSON, "api_key");
    }

    // bot_all_of->default_sending_stream
    cJSON *default_sending_stream = cJSON_GetObjectItemCaseSensitive(bot_all_ofJSON, "default_sending_stream");
    }

    // bot_all_of->default_events_register_stream
    cJSON *default_events_register_stream = cJSON_GetObjectItemCaseSensitive(bot_all_ofJSON, "default_events_register_stream");
    }

    // bot_all_of->default_all_public_streams
    cJSON *default_all_public_streams = cJSON_GetObjectItemCaseSensitive(bot_all_ofJSON, "default_all_public_streams");
    }

    // bot_all_of->avatar_url
    cJSON *avatar_url = cJSON_GetObjectItemCaseSensitive(bot_all_ofJSON, "avatar_url");
    }

    // bot_all_of->owner_id
    cJSON *owner_id = cJSON_GetObjectItemCaseSensitive(bot_all_ofJSON, "owner_id");
    }

    // bot_all_of->services
    cJSON *services = cJSON_GetObjectItemCaseSensitive(bot_all_ofJSON, "services");
    }

    // bot_all_of->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(bot_all_ofJSON, "email");
    if (email) { 
    if(!cJSON_IsString(email))
    {
    goto end; //String
    }
    }

    // bot_all_of->bot_type
    cJSON *bot_type = cJSON_GetObjectItemCaseSensitive(bot_all_ofJSON, "bot_type");
    if (bot_type) { 
    if(!cJSON_IsNumber(bot_type))
    {
    goto end; //Numeric
    }
    }

    // bot_all_of->is_active
    cJSON *is_active = cJSON_GetObjectItemCaseSensitive(bot_all_ofJSON, "is_active");
    if (is_active) { 
    if(!cJSON_IsBool(is_active))
    {
    goto end; //Bool
    }
    }


    bot_all_of_local_var = bot_all_of_create (
        email ? strdup(email->valuestring) : NULL,
        bot_type ? bot_type->valuedouble : 0,
        is_active ? is_active->valueint : 0
        );

    return bot_all_of_local_var;
end:
    return NULL;

}
