#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_messages.h"



get_messages_t *get_messages_create(
    list_t *flags,
    int last_edit_timestamp,
    char *match_content,
    char *match_subject
    ) {
    get_messages_t *get_messages_local_var = malloc(sizeof(get_messages_t));
    if (!get_messages_local_var) {
        return NULL;
    }
    get_messages_local_var->avatar_url = avatar_url;
    get_messages_local_var->client = client;
    get_messages_local_var->content = content;
    get_messages_local_var->content_type = content_type;
    get_messages_local_var->display_recipient = display_recipient;
    get_messages_local_var->id = id;
    get_messages_local_var->is_me_message = is_me_message;
    get_messages_local_var->reactions = reactions;
    get_messages_local_var->recipient_id = recipient_id;
    get_messages_local_var->sender_email = sender_email;
    get_messages_local_var->sender_full_name = sender_full_name;
    get_messages_local_var->sender_id = sender_id;
    get_messages_local_var->sender_realm_str = sender_realm_str;
    get_messages_local_var->stream_id = stream_id;
    get_messages_local_var->subject = subject;
    get_messages_local_var->topic_links = topic_links;
    get_messages_local_var->submessages = submessages;
    get_messages_local_var->timestamp = timestamp;
    get_messages_local_var->type = type;
    get_messages_local_var->flags = flags;
    get_messages_local_var->last_edit_timestamp = last_edit_timestamp;
    get_messages_local_var->match_content = match_content;
    get_messages_local_var->match_subject = match_subject;

    return get_messages_local_var;
}


void get_messages_free(get_messages_t *get_messages) {
    if(NULL == get_messages){
        return ;
    }
    listEntry_t *listEntry;
    if (get_messages->flags) {
        list_ForEach(listEntry, get_messages->flags) {
            free(listEntry->data);
        }
        list_free(get_messages->flags);
        get_messages->flags = NULL;
    }
    if (get_messages->match_content) {
        free(get_messages->match_content);
        get_messages->match_content = NULL;
    }
    if (get_messages->match_subject) {
        free(get_messages->match_subject);
        get_messages->match_subject = NULL;
    }
    free(get_messages);
}

cJSON *get_messages_convertToJSON(get_messages_t *get_messages) {
    cJSON *item = cJSON_CreateObject();

    // get_messages->avatar_url
    if(get_messages->avatar_url) { 
     } 


    // get_messages->client
    if(get_messages->client) { 
     } 


    // get_messages->content
    if(get_messages->content) { 
     } 


    // get_messages->content_type
    if(get_messages->content_type) { 
     } 


    // get_messages->display_recipient
    if(get_messages->display_recipient) { 
     } 


    // get_messages->id
    if(get_messages->id) { 
     } 


    // get_messages->is_me_message
    if(get_messages->is_me_message) { 
     } 


    // get_messages->reactions
    if(get_messages->reactions) { 
     } 


    // get_messages->recipient_id
    if(get_messages->recipient_id) { 
     } 


    // get_messages->sender_email
    if(get_messages->sender_email) { 
     } 


    // get_messages->sender_full_name
    if(get_messages->sender_full_name) { 
     } 


    // get_messages->sender_id
    if(get_messages->sender_id) { 
     } 


    // get_messages->sender_realm_str
    if(get_messages->sender_realm_str) { 
     } 


    // get_messages->stream_id
    if(get_messages->stream_id) { 
     } 


    // get_messages->subject
    if(get_messages->subject) { 
     } 


    // get_messages->topic_links
    if(get_messages->topic_links) { 
     } 


    // get_messages->submessages
    if(get_messages->submessages) { 
     } 


    // get_messages->timestamp
    if(get_messages->timestamp) { 
     } 


    // get_messages->type
    if(get_messages->type) { 
     } 


    // get_messages->flags
    if(get_messages->flags) { 
    cJSON *flags = cJSON_AddArrayToObject(item, "flags");
    if(flags == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *flagsListEntry;
    list_ForEach(flagsListEntry, get_messages->flags) {
    if(cJSON_AddStringToObject(flags, "", (char*)flagsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
     } 


    // get_messages->last_edit_timestamp
    if(get_messages->last_edit_timestamp) { 
    if(cJSON_AddNumberToObject(item, "last_edit_timestamp", get_messages->last_edit_timestamp) == NULL) {
    goto fail; //Numeric
    }
     } 


    // get_messages->match_content
    if(get_messages->match_content) { 
    if(cJSON_AddStringToObject(item, "match_content", get_messages->match_content) == NULL) {
    goto fail; //String
    }
     } 


    // get_messages->match_subject
    if(get_messages->match_subject) { 
    if(cJSON_AddStringToObject(item, "match_subject", get_messages->match_subject) == NULL) {
    goto fail; //String
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

get_messages_t *get_messages_parseFromJSON(cJSON *get_messagesJSON){

    get_messages_t *get_messages_local_var = NULL;

    // get_messages->avatar_url
    cJSON *avatar_url = cJSON_GetObjectItemCaseSensitive(get_messagesJSON, "avatar_url");
    }

    // get_messages->client
    cJSON *client = cJSON_GetObjectItemCaseSensitive(get_messagesJSON, "client");
    }

    // get_messages->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(get_messagesJSON, "content");
    }

    // get_messages->content_type
    cJSON *content_type = cJSON_GetObjectItemCaseSensitive(get_messagesJSON, "content_type");
    }

    // get_messages->display_recipient
    cJSON *display_recipient = cJSON_GetObjectItemCaseSensitive(get_messagesJSON, "display_recipient");
    }

    // get_messages->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(get_messagesJSON, "id");
    }

    // get_messages->is_me_message
    cJSON *is_me_message = cJSON_GetObjectItemCaseSensitive(get_messagesJSON, "is_me_message");
    }

    // get_messages->reactions
    cJSON *reactions = cJSON_GetObjectItemCaseSensitive(get_messagesJSON, "reactions");
    }

    // get_messages->recipient_id
    cJSON *recipient_id = cJSON_GetObjectItemCaseSensitive(get_messagesJSON, "recipient_id");
    }

    // get_messages->sender_email
    cJSON *sender_email = cJSON_GetObjectItemCaseSensitive(get_messagesJSON, "sender_email");
    }

    // get_messages->sender_full_name
    cJSON *sender_full_name = cJSON_GetObjectItemCaseSensitive(get_messagesJSON, "sender_full_name");
    }

    // get_messages->sender_id
    cJSON *sender_id = cJSON_GetObjectItemCaseSensitive(get_messagesJSON, "sender_id");
    }

    // get_messages->sender_realm_str
    cJSON *sender_realm_str = cJSON_GetObjectItemCaseSensitive(get_messagesJSON, "sender_realm_str");
    }

    // get_messages->stream_id
    cJSON *stream_id = cJSON_GetObjectItemCaseSensitive(get_messagesJSON, "stream_id");
    }

    // get_messages->subject
    cJSON *subject = cJSON_GetObjectItemCaseSensitive(get_messagesJSON, "subject");
    }

    // get_messages->topic_links
    cJSON *topic_links = cJSON_GetObjectItemCaseSensitive(get_messagesJSON, "topic_links");
    }

    // get_messages->submessages
    cJSON *submessages = cJSON_GetObjectItemCaseSensitive(get_messagesJSON, "submessages");
    }

    // get_messages->timestamp
    cJSON *timestamp = cJSON_GetObjectItemCaseSensitive(get_messagesJSON, "timestamp");
    }

    // get_messages->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(get_messagesJSON, "type");
    }

    // get_messages->flags
    cJSON *flags = cJSON_GetObjectItemCaseSensitive(get_messagesJSON, "flags");
    list_t *flagsList;
    if (flags) { 
    cJSON *flags_local;
    if(!cJSON_IsArray(flags)) {
        goto end;//primitive container
    }
    flagsList = list_create();

    cJSON_ArrayForEach(flags_local, flags)
    {
        if(!cJSON_IsString(flags_local))
        {
            goto end;
        }
        list_addElement(flagsList , strdup(flags_local->valuestring));
    }
    }

    // get_messages->last_edit_timestamp
    cJSON *last_edit_timestamp = cJSON_GetObjectItemCaseSensitive(get_messagesJSON, "last_edit_timestamp");
    if (last_edit_timestamp) { 
    if(!cJSON_IsNumber(last_edit_timestamp))
    {
    goto end; //Numeric
    }
    }

    // get_messages->match_content
    cJSON *match_content = cJSON_GetObjectItemCaseSensitive(get_messagesJSON, "match_content");
    if (match_content) { 
    if(!cJSON_IsString(match_content))
    {
    goto end; //String
    }
    }

    // get_messages->match_subject
    cJSON *match_subject = cJSON_GetObjectItemCaseSensitive(get_messagesJSON, "match_subject");
    if (match_subject) { 
    if(!cJSON_IsString(match_subject))
    {
    goto end; //String
    }
    }


    get_messages_local_var = get_messages_create (
        flags ? flagsList : NULL,
        last_edit_timestamp ? last_edit_timestamp->valuedouble : 0,
        match_content ? strdup(match_content->valuestring) : NULL,
        match_subject ? strdup(match_subject->valuestring) : NULL
        );

    return get_messages_local_var;
end:
    return NULL;

}
