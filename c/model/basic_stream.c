#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "basic_stream.h"



basic_stream_t *basic_stream_create(
    ) {
    basic_stream_t *basic_stream_local_var = malloc(sizeof(basic_stream_t));
    if (!basic_stream_local_var) {
        return NULL;
    }
    basic_stream_local_var->stream_id = stream_id;
    basic_stream_local_var->name = name;
    basic_stream_local_var->description = description;
    basic_stream_local_var->date_created = date_created;
    basic_stream_local_var->invite_only = invite_only;
    basic_stream_local_var->rendered_description = rendered_description;
    basic_stream_local_var->is_web_public = is_web_public;
    basic_stream_local_var->stream_post_policy = stream_post_policy;
    basic_stream_local_var->message_retention_days = message_retention_days;
    basic_stream_local_var->history_public_to_subscribers = history_public_to_subscribers;
    basic_stream_local_var->first_message_id = first_message_id;
    basic_stream_local_var->is_announcement_only = is_announcement_only;

    return basic_stream_local_var;
}


void basic_stream_free(basic_stream_t *basic_stream) {
    if(NULL == basic_stream){
        return ;
    }
    listEntry_t *listEntry;
    free(basic_stream);
}

cJSON *basic_stream_convertToJSON(basic_stream_t *basic_stream) {
    cJSON *item = cJSON_CreateObject();

    // basic_stream->stream_id
    if(basic_stream->stream_id) { 
     } 


    // basic_stream->name
    if(basic_stream->name) { 
     } 


    // basic_stream->description
    if(basic_stream->description) { 
     } 


    // basic_stream->date_created
    if(basic_stream->date_created) { 
     } 


    // basic_stream->invite_only
    if(basic_stream->invite_only) { 
     } 


    // basic_stream->rendered_description
    if(basic_stream->rendered_description) { 
     } 


    // basic_stream->is_web_public
    if(basic_stream->is_web_public) { 
     } 


    // basic_stream->stream_post_policy
    if(basic_stream->stream_post_policy) { 
     } 


    // basic_stream->message_retention_days
    if(basic_stream->message_retention_days) { 
     } 


    // basic_stream->history_public_to_subscribers
    if(basic_stream->history_public_to_subscribers) { 
     } 


    // basic_stream->first_message_id
    if(basic_stream->first_message_id) { 
     } 


    // basic_stream->is_announcement_only
    if(basic_stream->is_announcement_only) { 
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

basic_stream_t *basic_stream_parseFromJSON(cJSON *basic_streamJSON){

    basic_stream_t *basic_stream_local_var = NULL;

    // basic_stream->stream_id
    cJSON *stream_id = cJSON_GetObjectItemCaseSensitive(basic_streamJSON, "stream_id");
    }

    // basic_stream->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(basic_streamJSON, "name");
    }

    // basic_stream->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(basic_streamJSON, "description");
    }

    // basic_stream->date_created
    cJSON *date_created = cJSON_GetObjectItemCaseSensitive(basic_streamJSON, "date_created");
    }

    // basic_stream->invite_only
    cJSON *invite_only = cJSON_GetObjectItemCaseSensitive(basic_streamJSON, "invite_only");
    }

    // basic_stream->rendered_description
    cJSON *rendered_description = cJSON_GetObjectItemCaseSensitive(basic_streamJSON, "rendered_description");
    }

    // basic_stream->is_web_public
    cJSON *is_web_public = cJSON_GetObjectItemCaseSensitive(basic_streamJSON, "is_web_public");
    }

    // basic_stream->stream_post_policy
    cJSON *stream_post_policy = cJSON_GetObjectItemCaseSensitive(basic_streamJSON, "stream_post_policy");
    }

    // basic_stream->message_retention_days
    cJSON *message_retention_days = cJSON_GetObjectItemCaseSensitive(basic_streamJSON, "message_retention_days");
    }

    // basic_stream->history_public_to_subscribers
    cJSON *history_public_to_subscribers = cJSON_GetObjectItemCaseSensitive(basic_streamJSON, "history_public_to_subscribers");
    }

    // basic_stream->first_message_id
    cJSON *first_message_id = cJSON_GetObjectItemCaseSensitive(basic_streamJSON, "first_message_id");
    }

    // basic_stream->is_announcement_only
    cJSON *is_announcement_only = cJSON_GetObjectItemCaseSensitive(basic_streamJSON, "is_announcement_only");
    }


    basic_stream_local_var = basic_stream_create (
        );

    return basic_stream_local_var;
end:
    return NULL;

}
