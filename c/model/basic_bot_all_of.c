#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "basic_bot_all_of.h"



basic_bot_all_of_t *basic_bot_all_of_create(
    ) {
    basic_bot_all_of_t *basic_bot_all_of_local_var = malloc(sizeof(basic_bot_all_of_t));
    if (!basic_bot_all_of_local_var) {
        return NULL;
    }
    basic_bot_all_of_local_var->user_id = user_id;
    basic_bot_all_of_local_var->full_name = full_name;
    basic_bot_all_of_local_var->api_key = api_key;
    basic_bot_all_of_local_var->default_sending_stream = default_sending_stream;
    basic_bot_all_of_local_var->default_events_register_stream = default_events_register_stream;
    basic_bot_all_of_local_var->default_all_public_streams = default_all_public_streams;
    basic_bot_all_of_local_var->avatar_url = avatar_url;
    basic_bot_all_of_local_var->owner_id = owner_id;
    basic_bot_all_of_local_var->services = services;

    return basic_bot_all_of_local_var;
}


void basic_bot_all_of_free(basic_bot_all_of_t *basic_bot_all_of) {
    if(NULL == basic_bot_all_of){
        return ;
    }
    listEntry_t *listEntry;
    free(basic_bot_all_of);
}

cJSON *basic_bot_all_of_convertToJSON(basic_bot_all_of_t *basic_bot_all_of) {
    cJSON *item = cJSON_CreateObject();

    // basic_bot_all_of->user_id
    if(basic_bot_all_of->user_id) { 
     } 


    // basic_bot_all_of->full_name
    if(basic_bot_all_of->full_name) { 
     } 


    // basic_bot_all_of->api_key
    if(basic_bot_all_of->api_key) { 
     } 


    // basic_bot_all_of->default_sending_stream
    if(basic_bot_all_of->default_sending_stream) { 
     } 


    // basic_bot_all_of->default_events_register_stream
    if(basic_bot_all_of->default_events_register_stream) { 
     } 


    // basic_bot_all_of->default_all_public_streams
    if(basic_bot_all_of->default_all_public_streams) { 
     } 


    // basic_bot_all_of->avatar_url
    if(basic_bot_all_of->avatar_url) { 
     } 


    // basic_bot_all_of->owner_id
    if(basic_bot_all_of->owner_id) { 
     } 


    // basic_bot_all_of->services
    if(basic_bot_all_of->services) { 
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

basic_bot_all_of_t *basic_bot_all_of_parseFromJSON(cJSON *basic_bot_all_ofJSON){

    basic_bot_all_of_t *basic_bot_all_of_local_var = NULL;

    // basic_bot_all_of->user_id
    cJSON *user_id = cJSON_GetObjectItemCaseSensitive(basic_bot_all_ofJSON, "user_id");
    }

    // basic_bot_all_of->full_name
    cJSON *full_name = cJSON_GetObjectItemCaseSensitive(basic_bot_all_ofJSON, "full_name");
    }

    // basic_bot_all_of->api_key
    cJSON *api_key = cJSON_GetObjectItemCaseSensitive(basic_bot_all_ofJSON, "api_key");
    }

    // basic_bot_all_of->default_sending_stream
    cJSON *default_sending_stream = cJSON_GetObjectItemCaseSensitive(basic_bot_all_ofJSON, "default_sending_stream");
    }

    // basic_bot_all_of->default_events_register_stream
    cJSON *default_events_register_stream = cJSON_GetObjectItemCaseSensitive(basic_bot_all_ofJSON, "default_events_register_stream");
    }

    // basic_bot_all_of->default_all_public_streams
    cJSON *default_all_public_streams = cJSON_GetObjectItemCaseSensitive(basic_bot_all_ofJSON, "default_all_public_streams");
    }

    // basic_bot_all_of->avatar_url
    cJSON *avatar_url = cJSON_GetObjectItemCaseSensitive(basic_bot_all_ofJSON, "avatar_url");
    }

    // basic_bot_all_of->owner_id
    cJSON *owner_id = cJSON_GetObjectItemCaseSensitive(basic_bot_all_ofJSON, "owner_id");
    }

    // basic_bot_all_of->services
    cJSON *services = cJSON_GetObjectItemCaseSensitive(basic_bot_all_ofJSON, "services");
    }


    basic_bot_all_of_local_var = basic_bot_all_of_create (
        );

    return basic_bot_all_of_local_var;
end:
    return NULL;

}
