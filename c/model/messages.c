#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "messages.h"



messages_t *messages_create(
    ) {
    messages_t *messages_local_var = malloc(sizeof(messages_t));
    if (!messages_local_var) {
        return NULL;
    }
    messages_local_var->avatar_url = avatar_url;
    messages_local_var->client = client;
    messages_local_var->content = content;
    messages_local_var->content_type = content_type;
    messages_local_var->display_recipient = display_recipient;
    messages_local_var->id = id;
    messages_local_var->is_me_message = is_me_message;
    messages_local_var->reactions = reactions;
    messages_local_var->recipient_id = recipient_id;
    messages_local_var->sender_email = sender_email;
    messages_local_var->sender_full_name = sender_full_name;
    messages_local_var->sender_id = sender_id;
    messages_local_var->sender_realm_str = sender_realm_str;
    messages_local_var->stream_id = stream_id;
    messages_local_var->subject = subject;
    messages_local_var->topic_links = topic_links;
    messages_local_var->submessages = submessages;
    messages_local_var->timestamp = timestamp;
    messages_local_var->type = type;

    return messages_local_var;
}


void messages_free(messages_t *messages) {
    if(NULL == messages){
        return ;
    }
    listEntry_t *listEntry;
    free(messages);
}

cJSON *messages_convertToJSON(messages_t *messages) {
    cJSON *item = cJSON_CreateObject();

    // messages->avatar_url
    if(messages->avatar_url) { 
     } 


    // messages->client
    if(messages->client) { 
     } 


    // messages->content
    if(messages->content) { 
     } 


    // messages->content_type
    if(messages->content_type) { 
     } 


    // messages->display_recipient
    if(messages->display_recipient) { 
     } 


    // messages->id
    if(messages->id) { 
     } 


    // messages->is_me_message
    if(messages->is_me_message) { 
     } 


    // messages->reactions
    if(messages->reactions) { 
     } 


    // messages->recipient_id
    if(messages->recipient_id) { 
     } 


    // messages->sender_email
    if(messages->sender_email) { 
     } 


    // messages->sender_full_name
    if(messages->sender_full_name) { 
     } 


    // messages->sender_id
    if(messages->sender_id) { 
     } 


    // messages->sender_realm_str
    if(messages->sender_realm_str) { 
     } 


    // messages->stream_id
    if(messages->stream_id) { 
     } 


    // messages->subject
    if(messages->subject) { 
     } 


    // messages->topic_links
    if(messages->topic_links) { 
     } 


    // messages->submessages
    if(messages->submessages) { 
     } 


    // messages->timestamp
    if(messages->timestamp) { 
     } 


    // messages->type
    if(messages->type) { 
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

messages_t *messages_parseFromJSON(cJSON *messagesJSON){

    messages_t *messages_local_var = NULL;

    // messages->avatar_url
    cJSON *avatar_url = cJSON_GetObjectItemCaseSensitive(messagesJSON, "avatar_url");
    }

    // messages->client
    cJSON *client = cJSON_GetObjectItemCaseSensitive(messagesJSON, "client");
    }

    // messages->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(messagesJSON, "content");
    }

    // messages->content_type
    cJSON *content_type = cJSON_GetObjectItemCaseSensitive(messagesJSON, "content_type");
    }

    // messages->display_recipient
    cJSON *display_recipient = cJSON_GetObjectItemCaseSensitive(messagesJSON, "display_recipient");
    }

    // messages->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(messagesJSON, "id");
    }

    // messages->is_me_message
    cJSON *is_me_message = cJSON_GetObjectItemCaseSensitive(messagesJSON, "is_me_message");
    }

    // messages->reactions
    cJSON *reactions = cJSON_GetObjectItemCaseSensitive(messagesJSON, "reactions");
    }

    // messages->recipient_id
    cJSON *recipient_id = cJSON_GetObjectItemCaseSensitive(messagesJSON, "recipient_id");
    }

    // messages->sender_email
    cJSON *sender_email = cJSON_GetObjectItemCaseSensitive(messagesJSON, "sender_email");
    }

    // messages->sender_full_name
    cJSON *sender_full_name = cJSON_GetObjectItemCaseSensitive(messagesJSON, "sender_full_name");
    }

    // messages->sender_id
    cJSON *sender_id = cJSON_GetObjectItemCaseSensitive(messagesJSON, "sender_id");
    }

    // messages->sender_realm_str
    cJSON *sender_realm_str = cJSON_GetObjectItemCaseSensitive(messagesJSON, "sender_realm_str");
    }

    // messages->stream_id
    cJSON *stream_id = cJSON_GetObjectItemCaseSensitive(messagesJSON, "stream_id");
    }

    // messages->subject
    cJSON *subject = cJSON_GetObjectItemCaseSensitive(messagesJSON, "subject");
    }

    // messages->topic_links
    cJSON *topic_links = cJSON_GetObjectItemCaseSensitive(messagesJSON, "topic_links");
    }

    // messages->submessages
    cJSON *submessages = cJSON_GetObjectItemCaseSensitive(messagesJSON, "submessages");
    }

    // messages->timestamp
    cJSON *timestamp = cJSON_GetObjectItemCaseSensitive(messagesJSON, "timestamp");
    }

    // messages->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(messagesJSON, "type");
    }


    messages_local_var = messages_create (
        );

    return messages_local_var;
end:
    return NULL;

}
