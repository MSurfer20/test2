#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_messages_all_of.h"



get_messages_all_of_t *get_messages_all_of_create(
    list_t *flags,
    int last_edit_timestamp,
    char *match_content,
    char *match_subject
    ) {
    get_messages_all_of_t *get_messages_all_of_local_var = malloc(sizeof(get_messages_all_of_t));
    if (!get_messages_all_of_local_var) {
        return NULL;
    }
    get_messages_all_of_local_var->avatar_url = avatar_url;
    get_messages_all_of_local_var->client = client;
    get_messages_all_of_local_var->content = content;
    get_messages_all_of_local_var->content_type = content_type;
    get_messages_all_of_local_var->display_recipient = display_recipient;
    get_messages_all_of_local_var->id = id;
    get_messages_all_of_local_var->is_me_message = is_me_message;
    get_messages_all_of_local_var->reactions = reactions;
    get_messages_all_of_local_var->recipient_id = recipient_id;
    get_messages_all_of_local_var->sender_email = sender_email;
    get_messages_all_of_local_var->sender_full_name = sender_full_name;
    get_messages_all_of_local_var->sender_id = sender_id;
    get_messages_all_of_local_var->sender_realm_str = sender_realm_str;
    get_messages_all_of_local_var->stream_id = stream_id;
    get_messages_all_of_local_var->subject = subject;
    get_messages_all_of_local_var->topic_links = topic_links;
    get_messages_all_of_local_var->submessages = submessages;
    get_messages_all_of_local_var->timestamp = timestamp;
    get_messages_all_of_local_var->type = type;
    get_messages_all_of_local_var->flags = flags;
    get_messages_all_of_local_var->last_edit_timestamp = last_edit_timestamp;
    get_messages_all_of_local_var->match_content = match_content;
    get_messages_all_of_local_var->match_subject = match_subject;

    return get_messages_all_of_local_var;
}


void get_messages_all_of_free(get_messages_all_of_t *get_messages_all_of) {
    if(NULL == get_messages_all_of){
        return ;
    }
    listEntry_t *listEntry;
    if (get_messages_all_of->flags) {
        list_ForEach(listEntry, get_messages_all_of->flags) {
            free(listEntry->data);
        }
        list_free(get_messages_all_of->flags);
        get_messages_all_of->flags = NULL;
    }
    if (get_messages_all_of->match_content) {
        free(get_messages_all_of->match_content);
        get_messages_all_of->match_content = NULL;
    }
    if (get_messages_all_of->match_subject) {
        free(get_messages_all_of->match_subject);
        get_messages_all_of->match_subject = NULL;
    }
    free(get_messages_all_of);
}

cJSON *get_messages_all_of_convertToJSON(get_messages_all_of_t *get_messages_all_of) {
    cJSON *item = cJSON_CreateObject();

    // get_messages_all_of->avatar_url
    if(get_messages_all_of->avatar_url) { 
     } 


    // get_messages_all_of->client
    if(get_messages_all_of->client) { 
     } 


    // get_messages_all_of->content
    if(get_messages_all_of->content) { 
     } 


    // get_messages_all_of->content_type
    if(get_messages_all_of->content_type) { 
     } 


    // get_messages_all_of->display_recipient
    if(get_messages_all_of->display_recipient) { 
     } 


    // get_messages_all_of->id
    if(get_messages_all_of->id) { 
     } 


    // get_messages_all_of->is_me_message
    if(get_messages_all_of->is_me_message) { 
     } 


    // get_messages_all_of->reactions
    if(get_messages_all_of->reactions) { 
     } 


    // get_messages_all_of->recipient_id
    if(get_messages_all_of->recipient_id) { 
     } 


    // get_messages_all_of->sender_email
    if(get_messages_all_of->sender_email) { 
     } 


    // get_messages_all_of->sender_full_name
    if(get_messages_all_of->sender_full_name) { 
     } 


    // get_messages_all_of->sender_id
    if(get_messages_all_of->sender_id) { 
     } 


    // get_messages_all_of->sender_realm_str
    if(get_messages_all_of->sender_realm_str) { 
     } 


    // get_messages_all_of->stream_id
    if(get_messages_all_of->stream_id) { 
     } 


    // get_messages_all_of->subject
    if(get_messages_all_of->subject) { 
     } 


    // get_messages_all_of->topic_links
    if(get_messages_all_of->topic_links) { 
     } 


    // get_messages_all_of->submessages
    if(get_messages_all_of->submessages) { 
     } 


    // get_messages_all_of->timestamp
    if(get_messages_all_of->timestamp) { 
     } 


    // get_messages_all_of->type
    if(get_messages_all_of->type) { 
     } 


    // get_messages_all_of->flags
    if(get_messages_all_of->flags) { 
    cJSON *flags = cJSON_AddArrayToObject(item, "flags");
    if(flags == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *flagsListEntry;
    list_ForEach(flagsListEntry, get_messages_all_of->flags) {
    if(cJSON_AddStringToObject(flags, "", (char*)flagsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
     } 


    // get_messages_all_of->last_edit_timestamp
    if(get_messages_all_of->last_edit_timestamp) { 
    if(cJSON_AddNumberToObject(item, "last_edit_timestamp", get_messages_all_of->last_edit_timestamp) == NULL) {
    goto fail; //Numeric
    }
     } 


    // get_messages_all_of->match_content
    if(get_messages_all_of->match_content) { 
    if(cJSON_AddStringToObject(item, "match_content", get_messages_all_of->match_content) == NULL) {
    goto fail; //String
    }
     } 


    // get_messages_all_of->match_subject
    if(get_messages_all_of->match_subject) { 
    if(cJSON_AddStringToObject(item, "match_subject", get_messages_all_of->match_subject) == NULL) {
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

get_messages_all_of_t *get_messages_all_of_parseFromJSON(cJSON *get_messages_all_ofJSON){

    get_messages_all_of_t *get_messages_all_of_local_var = NULL;

    // get_messages_all_of->avatar_url
    cJSON *avatar_url = cJSON_GetObjectItemCaseSensitive(get_messages_all_ofJSON, "avatar_url");
    }

    // get_messages_all_of->client
    cJSON *client = cJSON_GetObjectItemCaseSensitive(get_messages_all_ofJSON, "client");
    }

    // get_messages_all_of->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(get_messages_all_ofJSON, "content");
    }

    // get_messages_all_of->content_type
    cJSON *content_type = cJSON_GetObjectItemCaseSensitive(get_messages_all_ofJSON, "content_type");
    }

    // get_messages_all_of->display_recipient
    cJSON *display_recipient = cJSON_GetObjectItemCaseSensitive(get_messages_all_ofJSON, "display_recipient");
    }

    // get_messages_all_of->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(get_messages_all_ofJSON, "id");
    }

    // get_messages_all_of->is_me_message
    cJSON *is_me_message = cJSON_GetObjectItemCaseSensitive(get_messages_all_ofJSON, "is_me_message");
    }

    // get_messages_all_of->reactions
    cJSON *reactions = cJSON_GetObjectItemCaseSensitive(get_messages_all_ofJSON, "reactions");
    }

    // get_messages_all_of->recipient_id
    cJSON *recipient_id = cJSON_GetObjectItemCaseSensitive(get_messages_all_ofJSON, "recipient_id");
    }

    // get_messages_all_of->sender_email
    cJSON *sender_email = cJSON_GetObjectItemCaseSensitive(get_messages_all_ofJSON, "sender_email");
    }

    // get_messages_all_of->sender_full_name
    cJSON *sender_full_name = cJSON_GetObjectItemCaseSensitive(get_messages_all_ofJSON, "sender_full_name");
    }

    // get_messages_all_of->sender_id
    cJSON *sender_id = cJSON_GetObjectItemCaseSensitive(get_messages_all_ofJSON, "sender_id");
    }

    // get_messages_all_of->sender_realm_str
    cJSON *sender_realm_str = cJSON_GetObjectItemCaseSensitive(get_messages_all_ofJSON, "sender_realm_str");
    }

    // get_messages_all_of->stream_id
    cJSON *stream_id = cJSON_GetObjectItemCaseSensitive(get_messages_all_ofJSON, "stream_id");
    }

    // get_messages_all_of->subject
    cJSON *subject = cJSON_GetObjectItemCaseSensitive(get_messages_all_ofJSON, "subject");
    }

    // get_messages_all_of->topic_links
    cJSON *topic_links = cJSON_GetObjectItemCaseSensitive(get_messages_all_ofJSON, "topic_links");
    }

    // get_messages_all_of->submessages
    cJSON *submessages = cJSON_GetObjectItemCaseSensitive(get_messages_all_ofJSON, "submessages");
    }

    // get_messages_all_of->timestamp
    cJSON *timestamp = cJSON_GetObjectItemCaseSensitive(get_messages_all_ofJSON, "timestamp");
    }

    // get_messages_all_of->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(get_messages_all_ofJSON, "type");
    }

    // get_messages_all_of->flags
    cJSON *flags = cJSON_GetObjectItemCaseSensitive(get_messages_all_ofJSON, "flags");
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

    // get_messages_all_of->last_edit_timestamp
    cJSON *last_edit_timestamp = cJSON_GetObjectItemCaseSensitive(get_messages_all_ofJSON, "last_edit_timestamp");
    if (last_edit_timestamp) { 
    if(!cJSON_IsNumber(last_edit_timestamp))
    {
    goto end; //Numeric
    }
    }

    // get_messages_all_of->match_content
    cJSON *match_content = cJSON_GetObjectItemCaseSensitive(get_messages_all_ofJSON, "match_content");
    if (match_content) { 
    if(!cJSON_IsString(match_content))
    {
    goto end; //String
    }
    }

    // get_messages_all_of->match_subject
    cJSON *match_subject = cJSON_GetObjectItemCaseSensitive(get_messages_all_ofJSON, "match_subject");
    if (match_subject) { 
    if(!cJSON_IsString(match_subject))
    {
    goto end; //String
    }
    }


    get_messages_all_of_local_var = get_messages_all_of_create (
        flags ? flagsList : NULL,
        last_edit_timestamp ? last_edit_timestamp->valuedouble : 0,
        match_content ? strdup(match_content->valuestring) : NULL,
        match_subject ? strdup(match_subject->valuestring) : NULL
        );

    return get_messages_all_of_local_var;
end:
    return NULL;

}
