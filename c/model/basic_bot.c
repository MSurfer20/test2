#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "basic_bot.h"



basic_bot_t *basic_bot_create(
    ) {
    basic_bot_t *basic_bot_local_var = malloc(sizeof(basic_bot_t));
    if (!basic_bot_local_var) {
        return NULL;
    }
    basic_bot_local_var->user_id = user_id;
    basic_bot_local_var->full_name = full_name;
    basic_bot_local_var->api_key = api_key;
    basic_bot_local_var->default_sending_stream = default_sending_stream;
    basic_bot_local_var->default_events_register_stream = default_events_register_stream;
    basic_bot_local_var->default_all_public_streams = default_all_public_streams;
    basic_bot_local_var->avatar_url = avatar_url;
    basic_bot_local_var->owner_id = owner_id;
    basic_bot_local_var->services = services;

    return basic_bot_local_var;
}


void basic_bot_free(basic_bot_t *basic_bot) {
    if(NULL == basic_bot){
        return ;
    }
    listEntry_t *listEntry;
    free(basic_bot);
}

cJSON *basic_bot_convertToJSON(basic_bot_t *basic_bot) {
    cJSON *item = cJSON_CreateObject();

    // basic_bot->user_id
    if(basic_bot->user_id) { 
     } 


    // basic_bot->full_name
    if(basic_bot->full_name) { 
     } 


    // basic_bot->api_key
    if(basic_bot->api_key) { 
     } 


    // basic_bot->default_sending_stream
    if(basic_bot->default_sending_stream) { 
     } 


    // basic_bot->default_events_register_stream
    if(basic_bot->default_events_register_stream) { 
     } 


    // basic_bot->default_all_public_streams
    if(basic_bot->default_all_public_streams) { 
     } 


    // basic_bot->avatar_url
    if(basic_bot->avatar_url) { 
     } 


    // basic_bot->owner_id
    if(basic_bot->owner_id) { 
     } 


    // basic_bot->services
    if(basic_bot->services) { 
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

basic_bot_t *basic_bot_parseFromJSON(cJSON *basic_botJSON){

    basic_bot_t *basic_bot_local_var = NULL;

    // basic_bot->user_id
    cJSON *user_id = cJSON_GetObjectItemCaseSensitive(basic_botJSON, "user_id");
    }

    // basic_bot->full_name
    cJSON *full_name = cJSON_GetObjectItemCaseSensitive(basic_botJSON, "full_name");
    }

    // basic_bot->api_key
    cJSON *api_key = cJSON_GetObjectItemCaseSensitive(basic_botJSON, "api_key");
    }

    // basic_bot->default_sending_stream
    cJSON *default_sending_stream = cJSON_GetObjectItemCaseSensitive(basic_botJSON, "default_sending_stream");
    }

    // basic_bot->default_events_register_stream
    cJSON *default_events_register_stream = cJSON_GetObjectItemCaseSensitive(basic_botJSON, "default_events_register_stream");
    }

    // basic_bot->default_all_public_streams
    cJSON *default_all_public_streams = cJSON_GetObjectItemCaseSensitive(basic_botJSON, "default_all_public_streams");
    }

    // basic_bot->avatar_url
    cJSON *avatar_url = cJSON_GetObjectItemCaseSensitive(basic_botJSON, "avatar_url");
    }

    // basic_bot->owner_id
    cJSON *owner_id = cJSON_GetObjectItemCaseSensitive(basic_botJSON, "owner_id");
    }

    // basic_bot->services
    cJSON *services = cJSON_GetObjectItemCaseSensitive(basic_botJSON, "services");
    }


    basic_bot_local_var = basic_bot_create (
        );

    return basic_bot_local_var;
end:
    return NULL;

}
