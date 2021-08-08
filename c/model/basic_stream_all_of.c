#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "basic_stream_all_of.h"



basic_stream_all_of_t *basic_stream_all_of_create(
    ) {
    basic_stream_all_of_t *basic_stream_all_of_local_var = malloc(sizeof(basic_stream_all_of_t));
    if (!basic_stream_all_of_local_var) {
        return NULL;
    }
    basic_stream_all_of_local_var->stream_id = stream_id;
    basic_stream_all_of_local_var->name = name;
    basic_stream_all_of_local_var->description = description;
    basic_stream_all_of_local_var->date_created = date_created;
    basic_stream_all_of_local_var->invite_only = invite_only;
    basic_stream_all_of_local_var->rendered_description = rendered_description;
    basic_stream_all_of_local_var->is_web_public = is_web_public;
    basic_stream_all_of_local_var->stream_post_policy = stream_post_policy;
    basic_stream_all_of_local_var->message_retention_days = message_retention_days;
    basic_stream_all_of_local_var->history_public_to_subscribers = history_public_to_subscribers;
    basic_stream_all_of_local_var->first_message_id = first_message_id;
    basic_stream_all_of_local_var->is_announcement_only = is_announcement_only;

    return basic_stream_all_of_local_var;
}


void basic_stream_all_of_free(basic_stream_all_of_t *basic_stream_all_of) {
    if(NULL == basic_stream_all_of){
        return ;
    }
    listEntry_t *listEntry;
    free(basic_stream_all_of);
}

cJSON *basic_stream_all_of_convertToJSON(basic_stream_all_of_t *basic_stream_all_of) {
    cJSON *item = cJSON_CreateObject();

    // basic_stream_all_of->stream_id
    if(basic_stream_all_of->stream_id) { 
     } 


    // basic_stream_all_of->name
    if(basic_stream_all_of->name) { 
     } 


    // basic_stream_all_of->description
    if(basic_stream_all_of->description) { 
     } 


    // basic_stream_all_of->date_created
    if(basic_stream_all_of->date_created) { 
     } 


    // basic_stream_all_of->invite_only
    if(basic_stream_all_of->invite_only) { 
     } 


    // basic_stream_all_of->rendered_description
    if(basic_stream_all_of->rendered_description) { 
     } 


    // basic_stream_all_of->is_web_public
    if(basic_stream_all_of->is_web_public) { 
     } 


    // basic_stream_all_of->stream_post_policy
    if(basic_stream_all_of->stream_post_policy) { 
     } 


    // basic_stream_all_of->message_retention_days
    if(basic_stream_all_of->message_retention_days) { 
     } 


    // basic_stream_all_of->history_public_to_subscribers
    if(basic_stream_all_of->history_public_to_subscribers) { 
     } 


    // basic_stream_all_of->first_message_id
    if(basic_stream_all_of->first_message_id) { 
     } 


    // basic_stream_all_of->is_announcement_only
    if(basic_stream_all_of->is_announcement_only) { 
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

basic_stream_all_of_t *basic_stream_all_of_parseFromJSON(cJSON *basic_stream_all_ofJSON){

    basic_stream_all_of_t *basic_stream_all_of_local_var = NULL;

    // basic_stream_all_of->stream_id
    cJSON *stream_id = cJSON_GetObjectItemCaseSensitive(basic_stream_all_ofJSON, "stream_id");
    }

    // basic_stream_all_of->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(basic_stream_all_ofJSON, "name");
    }

    // basic_stream_all_of->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(basic_stream_all_ofJSON, "description");
    }

    // basic_stream_all_of->date_created
    cJSON *date_created = cJSON_GetObjectItemCaseSensitive(basic_stream_all_ofJSON, "date_created");
    }

    // basic_stream_all_of->invite_only
    cJSON *invite_only = cJSON_GetObjectItemCaseSensitive(basic_stream_all_ofJSON, "invite_only");
    }

    // basic_stream_all_of->rendered_description
    cJSON *rendered_description = cJSON_GetObjectItemCaseSensitive(basic_stream_all_ofJSON, "rendered_description");
    }

    // basic_stream_all_of->is_web_public
    cJSON *is_web_public = cJSON_GetObjectItemCaseSensitive(basic_stream_all_ofJSON, "is_web_public");
    }

    // basic_stream_all_of->stream_post_policy
    cJSON *stream_post_policy = cJSON_GetObjectItemCaseSensitive(basic_stream_all_ofJSON, "stream_post_policy");
    }

    // basic_stream_all_of->message_retention_days
    cJSON *message_retention_days = cJSON_GetObjectItemCaseSensitive(basic_stream_all_ofJSON, "message_retention_days");
    }

    // basic_stream_all_of->history_public_to_subscribers
    cJSON *history_public_to_subscribers = cJSON_GetObjectItemCaseSensitive(basic_stream_all_ofJSON, "history_public_to_subscribers");
    }

    // basic_stream_all_of->first_message_id
    cJSON *first_message_id = cJSON_GetObjectItemCaseSensitive(basic_stream_all_ofJSON, "first_message_id");
    }

    // basic_stream_all_of->is_announcement_only
    cJSON *is_announcement_only = cJSON_GetObjectItemCaseSensitive(basic_stream_all_ofJSON, "is_announcement_only");
    }


    basic_stream_all_of_local_var = basic_stream_all_of_create (
        );

    return basic_stream_all_of_local_var;
end:
    return NULL;

}
