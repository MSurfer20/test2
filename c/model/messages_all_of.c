#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "messages_all_of.h"



messages_all_of_t *messages_all_of_create(
    ) {
    messages_all_of_t *messages_all_of_local_var = malloc(sizeof(messages_all_of_t));
    if (!messages_all_of_local_var) {
        return NULL;
    }
    messages_all_of_local_var->avatar_url = avatar_url;
    messages_all_of_local_var->client = client;
    messages_all_of_local_var->content = content;
    messages_all_of_local_var->content_type = content_type;
    messages_all_of_local_var->display_recipient = display_recipient;
    messages_all_of_local_var->id = id;
    messages_all_of_local_var->is_me_message = is_me_message;
    messages_all_of_local_var->reactions = reactions;
    messages_all_of_local_var->recipient_id = recipient_id;
    messages_all_of_local_var->sender_email = sender_email;
    messages_all_of_local_var->sender_full_name = sender_full_name;
    messages_all_of_local_var->sender_id = sender_id;
    messages_all_of_local_var->sender_realm_str = sender_realm_str;
    messages_all_of_local_var->stream_id = stream_id;
    messages_all_of_local_var->subject = subject;
    messages_all_of_local_var->topic_links = topic_links;
    messages_all_of_local_var->submessages = submessages;
    messages_all_of_local_var->timestamp = timestamp;
    messages_all_of_local_var->type = type;

    return messages_all_of_local_var;
}


void messages_all_of_free(messages_all_of_t *messages_all_of) {
    if(NULL == messages_all_of){
        return ;
    }
    listEntry_t *listEntry;
    free(messages_all_of);
}

cJSON *messages_all_of_convertToJSON(messages_all_of_t *messages_all_of) {
    cJSON *item = cJSON_CreateObject();

    // messages_all_of->avatar_url
    if(messages_all_of->avatar_url) { 
     } 


    // messages_all_of->client
    if(messages_all_of->client) { 
     } 


    // messages_all_of->content
    if(messages_all_of->content) { 
     } 


    // messages_all_of->content_type
    if(messages_all_of->content_type) { 
     } 


    // messages_all_of->display_recipient
    if(messages_all_of->display_recipient) { 
     } 


    // messages_all_of->id
    if(messages_all_of->id) { 
     } 


    // messages_all_of->is_me_message
    if(messages_all_of->is_me_message) { 
     } 


    // messages_all_of->reactions
    if(messages_all_of->reactions) { 
     } 


    // messages_all_of->recipient_id
    if(messages_all_of->recipient_id) { 
     } 


    // messages_all_of->sender_email
    if(messages_all_of->sender_email) { 
     } 


    // messages_all_of->sender_full_name
    if(messages_all_of->sender_full_name) { 
     } 


    // messages_all_of->sender_id
    if(messages_all_of->sender_id) { 
     } 


    // messages_all_of->sender_realm_str
    if(messages_all_of->sender_realm_str) { 
     } 


    // messages_all_of->stream_id
    if(messages_all_of->stream_id) { 
     } 


    // messages_all_of->subject
    if(messages_all_of->subject) { 
     } 


    // messages_all_of->topic_links
    if(messages_all_of->topic_links) { 
     } 


    // messages_all_of->submessages
    if(messages_all_of->submessages) { 
     } 


    // messages_all_of->timestamp
    if(messages_all_of->timestamp) { 
     } 


    // messages_all_of->type
    if(messages_all_of->type) { 
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

messages_all_of_t *messages_all_of_parseFromJSON(cJSON *messages_all_ofJSON){

    messages_all_of_t *messages_all_of_local_var = NULL;

    // messages_all_of->avatar_url
    cJSON *avatar_url = cJSON_GetObjectItemCaseSensitive(messages_all_ofJSON, "avatar_url");
    }

    // messages_all_of->client
    cJSON *client = cJSON_GetObjectItemCaseSensitive(messages_all_ofJSON, "client");
    }

    // messages_all_of->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(messages_all_ofJSON, "content");
    }

    // messages_all_of->content_type
    cJSON *content_type = cJSON_GetObjectItemCaseSensitive(messages_all_ofJSON, "content_type");
    }

    // messages_all_of->display_recipient
    cJSON *display_recipient = cJSON_GetObjectItemCaseSensitive(messages_all_ofJSON, "display_recipient");
    }

    // messages_all_of->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(messages_all_ofJSON, "id");
    }

    // messages_all_of->is_me_message
    cJSON *is_me_message = cJSON_GetObjectItemCaseSensitive(messages_all_ofJSON, "is_me_message");
    }

    // messages_all_of->reactions
    cJSON *reactions = cJSON_GetObjectItemCaseSensitive(messages_all_ofJSON, "reactions");
    }

    // messages_all_of->recipient_id
    cJSON *recipient_id = cJSON_GetObjectItemCaseSensitive(messages_all_ofJSON, "recipient_id");
    }

    // messages_all_of->sender_email
    cJSON *sender_email = cJSON_GetObjectItemCaseSensitive(messages_all_ofJSON, "sender_email");
    }

    // messages_all_of->sender_full_name
    cJSON *sender_full_name = cJSON_GetObjectItemCaseSensitive(messages_all_ofJSON, "sender_full_name");
    }

    // messages_all_of->sender_id
    cJSON *sender_id = cJSON_GetObjectItemCaseSensitive(messages_all_ofJSON, "sender_id");
    }

    // messages_all_of->sender_realm_str
    cJSON *sender_realm_str = cJSON_GetObjectItemCaseSensitive(messages_all_ofJSON, "sender_realm_str");
    }

    // messages_all_of->stream_id
    cJSON *stream_id = cJSON_GetObjectItemCaseSensitive(messages_all_ofJSON, "stream_id");
    }

    // messages_all_of->subject
    cJSON *subject = cJSON_GetObjectItemCaseSensitive(messages_all_ofJSON, "subject");
    }

    // messages_all_of->topic_links
    cJSON *topic_links = cJSON_GetObjectItemCaseSensitive(messages_all_ofJSON, "topic_links");
    }

    // messages_all_of->submessages
    cJSON *submessages = cJSON_GetObjectItemCaseSensitive(messages_all_ofJSON, "submessages");
    }

    // messages_all_of->timestamp
    cJSON *timestamp = cJSON_GetObjectItemCaseSensitive(messages_all_ofJSON, "timestamp");
    }

    // messages_all_of->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(messages_all_ofJSON, "type");
    }


    messages_all_of_local_var = messages_all_of_create (
        );

    return messages_all_of_local_var;
end:
    return NULL;

}
