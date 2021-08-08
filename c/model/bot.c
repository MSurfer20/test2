#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bot.h"



bot_t *bot_create(
    char *email,
    int bot_type,
    int is_active
    ) {
    bot_t *bot_local_var = malloc(sizeof(bot_t));
    if (!bot_local_var) {
        return NULL;
    }
    bot_local_var->user_id = user_id;
    bot_local_var->full_name = full_name;
    bot_local_var->api_key = api_key;
    bot_local_var->default_sending_stream = default_sending_stream;
    bot_local_var->default_events_register_stream = default_events_register_stream;
    bot_local_var->default_all_public_streams = default_all_public_streams;
    bot_local_var->avatar_url = avatar_url;
    bot_local_var->owner_id = owner_id;
    bot_local_var->services = services;
    bot_local_var->email = email;
    bot_local_var->bot_type = bot_type;
    bot_local_var->is_active = is_active;

    return bot_local_var;
}


void bot_free(bot_t *bot) {
    if(NULL == bot){
        return ;
    }
    listEntry_t *listEntry;
    if (bot->email) {
        free(bot->email);
        bot->email = NULL;
    }
    free(bot);
}

cJSON *bot_convertToJSON(bot_t *bot) {
    cJSON *item = cJSON_CreateObject();

    // bot->user_id
    if(bot->user_id) { 
     } 


    // bot->full_name
    if(bot->full_name) { 
     } 


    // bot->api_key
    if(bot->api_key) { 
     } 


    // bot->default_sending_stream
    if(bot->default_sending_stream) { 
     } 


    // bot->default_events_register_stream
    if(bot->default_events_register_stream) { 
     } 


    // bot->default_all_public_streams
    if(bot->default_all_public_streams) { 
     } 


    // bot->avatar_url
    if(bot->avatar_url) { 
     } 


    // bot->owner_id
    if(bot->owner_id) { 
     } 


    // bot->services
    if(bot->services) { 
     } 


    // bot->email
    if(bot->email) { 
    if(cJSON_AddStringToObject(item, "email", bot->email) == NULL) {
    goto fail; //String
    }
     } 


    // bot->bot_type
    if(bot->bot_type) { 
    if(cJSON_AddNumberToObject(item, "bot_type", bot->bot_type) == NULL) {
    goto fail; //Numeric
    }
     } 


    // bot->is_active
    if(bot->is_active) { 
    if(cJSON_AddBoolToObject(item, "is_active", bot->is_active) == NULL) {
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

bot_t *bot_parseFromJSON(cJSON *botJSON){

    bot_t *bot_local_var = NULL;

    // bot->user_id
    cJSON *user_id = cJSON_GetObjectItemCaseSensitive(botJSON, "user_id");
    }

    // bot->full_name
    cJSON *full_name = cJSON_GetObjectItemCaseSensitive(botJSON, "full_name");
    }

    // bot->api_key
    cJSON *api_key = cJSON_GetObjectItemCaseSensitive(botJSON, "api_key");
    }

    // bot->default_sending_stream
    cJSON *default_sending_stream = cJSON_GetObjectItemCaseSensitive(botJSON, "default_sending_stream");
    }

    // bot->default_events_register_stream
    cJSON *default_events_register_stream = cJSON_GetObjectItemCaseSensitive(botJSON, "default_events_register_stream");
    }

    // bot->default_all_public_streams
    cJSON *default_all_public_streams = cJSON_GetObjectItemCaseSensitive(botJSON, "default_all_public_streams");
    }

    // bot->avatar_url
    cJSON *avatar_url = cJSON_GetObjectItemCaseSensitive(botJSON, "avatar_url");
    }

    // bot->owner_id
    cJSON *owner_id = cJSON_GetObjectItemCaseSensitive(botJSON, "owner_id");
    }

    // bot->services
    cJSON *services = cJSON_GetObjectItemCaseSensitive(botJSON, "services");
    }

    // bot->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(botJSON, "email");
    if (email) { 
    if(!cJSON_IsString(email))
    {
    goto end; //String
    }
    }

    // bot->bot_type
    cJSON *bot_type = cJSON_GetObjectItemCaseSensitive(botJSON, "bot_type");
    if (bot_type) { 
    if(!cJSON_IsNumber(bot_type))
    {
    goto end; //Numeric
    }
    }

    // bot->is_active
    cJSON *is_active = cJSON_GetObjectItemCaseSensitive(botJSON, "is_active");
    if (is_active) { 
    if(!cJSON_IsBool(is_active))
    {
    goto end; //Bool
    }
    }


    bot_local_var = bot_create (
        email ? strdup(email->valuestring) : NULL,
        bot_type ? bot_type->valuedouble : 0,
        is_active ? is_active->valueint : 0
        );

    return bot_local_var;
end:
    return NULL;

}
