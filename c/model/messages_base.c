#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "messages_base.h"



messages_base_t *messages_base_create(
    char *avatar_url,
    char *client,
    char *content,
    char *content_type,
    one_ofstringarray_t *display_recipient,
    int id,
    int is_me_message,
    list_t *reactions,
    int recipient_id,
    char *sender_email,
    char *sender_full_name,
    int sender_id,
    char *sender_realm_str,
    int stream_id,
    char *subject,
    list_t *topic_links,
    list_t *submessages,
    int timestamp,
    char *type
    ) {
    messages_base_t *messages_base_local_var = malloc(sizeof(messages_base_t));
    if (!messages_base_local_var) {
        return NULL;
    }
    messages_base_local_var->avatar_url = avatar_url;
    messages_base_local_var->client = client;
    messages_base_local_var->content = content;
    messages_base_local_var->content_type = content_type;
    messages_base_local_var->display_recipient = display_recipient;
    messages_base_local_var->id = id;
    messages_base_local_var->is_me_message = is_me_message;
    messages_base_local_var->reactions = reactions;
    messages_base_local_var->recipient_id = recipient_id;
    messages_base_local_var->sender_email = sender_email;
    messages_base_local_var->sender_full_name = sender_full_name;
    messages_base_local_var->sender_id = sender_id;
    messages_base_local_var->sender_realm_str = sender_realm_str;
    messages_base_local_var->stream_id = stream_id;
    messages_base_local_var->subject = subject;
    messages_base_local_var->topic_links = topic_links;
    messages_base_local_var->submessages = submessages;
    messages_base_local_var->timestamp = timestamp;
    messages_base_local_var->type = type;

    return messages_base_local_var;
}


void messages_base_free(messages_base_t *messages_base) {
    if(NULL == messages_base){
        return ;
    }
    listEntry_t *listEntry;
    if (messages_base->avatar_url) {
        free(messages_base->avatar_url);
        messages_base->avatar_url = NULL;
    }
    if (messages_base->client) {
        free(messages_base->client);
        messages_base->client = NULL;
    }
    if (messages_base->content) {
        free(messages_base->content);
        messages_base->content = NULL;
    }
    if (messages_base->content_type) {
        free(messages_base->content_type);
        messages_base->content_type = NULL;
    }
    if (messages_base->display_recipient) {
        one_ofstringarray_free(messages_base->display_recipient);
        messages_base->display_recipient = NULL;
    }
    if (messages_base->reactions) {
        list_ForEach(listEntry, messages_base->reactions) {
            emoji_reaction_free(listEntry->data);
        }
        list_free(messages_base->reactions);
        messages_base->reactions = NULL;
    }
    if (messages_base->sender_email) {
        free(messages_base->sender_email);
        messages_base->sender_email = NULL;
    }
    if (messages_base->sender_full_name) {
        free(messages_base->sender_full_name);
        messages_base->sender_full_name = NULL;
    }
    if (messages_base->sender_realm_str) {
        free(messages_base->sender_realm_str);
        messages_base->sender_realm_str = NULL;
    }
    if (messages_base->subject) {
        free(messages_base->subject);
        messages_base->subject = NULL;
    }
    if (messages_base->topic_links) {
        list_ForEach(listEntry, messages_base->topic_links) {
            messages_base_topic_links_free(listEntry->data);
        }
        list_free(messages_base->topic_links);
        messages_base->topic_links = NULL;
    }
    if (messages_base->submessages) {
        list_ForEach(listEntry, messages_base->submessages) {
            free(listEntry->data);
        }
        list_free(messages_base->submessages);
        messages_base->submessages = NULL;
    }
    if (messages_base->type) {
        free(messages_base->type);
        messages_base->type = NULL;
    }
    free(messages_base);
}

cJSON *messages_base_convertToJSON(messages_base_t *messages_base) {
    cJSON *item = cJSON_CreateObject();

    // messages_base->avatar_url
    if(messages_base->avatar_url) { 
    if(cJSON_AddStringToObject(item, "avatar_url", messages_base->avatar_url) == NULL) {
    goto fail; //String
    }
     } 


    // messages_base->client
    if(messages_base->client) { 
    if(cJSON_AddStringToObject(item, "client", messages_base->client) == NULL) {
    goto fail; //String
    }
     } 


    // messages_base->content
    if(messages_base->content) { 
    if(cJSON_AddStringToObject(item, "content", messages_base->content) == NULL) {
    goto fail; //String
    }
     } 


    // messages_base->content_type
    if(messages_base->content_type) { 
    if(cJSON_AddStringToObject(item, "content_type", messages_base->content_type) == NULL) {
    goto fail; //String
    }
     } 


    // messages_base->display_recipient
    if(messages_base->display_recipient) { 
    cJSON *display_recipient_local_JSON = one_ofstringarray_convertToJSON(messages_base->display_recipient);
    if(display_recipient_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "display_recipient", display_recipient_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // messages_base->id
    if(messages_base->id) { 
    if(cJSON_AddNumberToObject(item, "id", messages_base->id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // messages_base->is_me_message
    if(messages_base->is_me_message) { 
    if(cJSON_AddBoolToObject(item, "is_me_message", messages_base->is_me_message) == NULL) {
    goto fail; //Bool
    }
     } 


    // messages_base->reactions
    if(messages_base->reactions) { 
    cJSON *reactions = cJSON_AddArrayToObject(item, "reactions");
    if(reactions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *reactionsListEntry;
    if (messages_base->reactions) {
    list_ForEach(reactionsListEntry, messages_base->reactions) {
    cJSON *itemLocal = emoji_reaction_convertToJSON(reactionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(reactions, itemLocal);
    }
    }
     } 


    // messages_base->recipient_id
    if(messages_base->recipient_id) { 
    if(cJSON_AddNumberToObject(item, "recipient_id", messages_base->recipient_id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // messages_base->sender_email
    if(messages_base->sender_email) { 
    if(cJSON_AddStringToObject(item, "sender_email", messages_base->sender_email) == NULL) {
    goto fail; //String
    }
     } 


    // messages_base->sender_full_name
    if(messages_base->sender_full_name) { 
    if(cJSON_AddStringToObject(item, "sender_full_name", messages_base->sender_full_name) == NULL) {
    goto fail; //String
    }
     } 


    // messages_base->sender_id
    if(messages_base->sender_id) { 
    if(cJSON_AddNumberToObject(item, "sender_id", messages_base->sender_id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // messages_base->sender_realm_str
    if(messages_base->sender_realm_str) { 
    if(cJSON_AddStringToObject(item, "sender_realm_str", messages_base->sender_realm_str) == NULL) {
    goto fail; //String
    }
     } 


    // messages_base->stream_id
    if(messages_base->stream_id) { 
    if(cJSON_AddNumberToObject(item, "stream_id", messages_base->stream_id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // messages_base->subject
    if(messages_base->subject) { 
    if(cJSON_AddStringToObject(item, "subject", messages_base->subject) == NULL) {
    goto fail; //String
    }
     } 


    // messages_base->topic_links
    if(messages_base->topic_links) { 
    cJSON *topic_links = cJSON_AddArrayToObject(item, "topic_links");
    if(topic_links == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *topic_linksListEntry;
    if (messages_base->topic_links) {
    list_ForEach(topic_linksListEntry, messages_base->topic_links) {
    cJSON *itemLocal = messages_base_topic_links_convertToJSON(topic_linksListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(topic_links, itemLocal);
    }
    }
     } 


    // messages_base->submessages
    if(messages_base->submessages) { 
    cJSON *submessages = cJSON_AddArrayToObject(item, "submessages");
    if(submessages == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *submessagesListEntry;
    list_ForEach(submessagesListEntry, messages_base->submessages) {
    if(cJSON_AddStringToObject(submessages, "", (char*)submessagesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
     } 


    // messages_base->timestamp
    if(messages_base->timestamp) { 
    if(cJSON_AddNumberToObject(item, "timestamp", messages_base->timestamp) == NULL) {
    goto fail; //Numeric
    }
     } 


    // messages_base->type
    if(messages_base->type) { 
    if(cJSON_AddStringToObject(item, "type", messages_base->type) == NULL) {
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

messages_base_t *messages_base_parseFromJSON(cJSON *messages_baseJSON){

    messages_base_t *messages_base_local_var = NULL;

    // messages_base->avatar_url
    cJSON *avatar_url = cJSON_GetObjectItemCaseSensitive(messages_baseJSON, "avatar_url");
    if (avatar_url) { 
    if(!cJSON_IsString(avatar_url))
    {
    goto end; //String
    }
    }

    // messages_base->client
    cJSON *client = cJSON_GetObjectItemCaseSensitive(messages_baseJSON, "client");
    if (client) { 
    if(!cJSON_IsString(client))
    {
    goto end; //String
    }
    }

    // messages_base->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(messages_baseJSON, "content");
    if (content) { 
    if(!cJSON_IsString(content))
    {
    goto end; //String
    }
    }

    // messages_base->content_type
    cJSON *content_type = cJSON_GetObjectItemCaseSensitive(messages_baseJSON, "content_type");
    if (content_type) { 
    if(!cJSON_IsString(content_type))
    {
    goto end; //String
    }
    }

    // messages_base->display_recipient
    cJSON *display_recipient = cJSON_GetObjectItemCaseSensitive(messages_baseJSON, "display_recipient");
    one_ofstringarray_t *display_recipient_local_nonprim = NULL;
    if (display_recipient) { 
    display_recipient_local_nonprim = one_ofstringarray_parseFromJSON(display_recipient); //nonprimitive
    }

    // messages_base->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(messages_baseJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // messages_base->is_me_message
    cJSON *is_me_message = cJSON_GetObjectItemCaseSensitive(messages_baseJSON, "is_me_message");
    if (is_me_message) { 
    if(!cJSON_IsBool(is_me_message))
    {
    goto end; //Bool
    }
    }

    // messages_base->reactions
    cJSON *reactions = cJSON_GetObjectItemCaseSensitive(messages_baseJSON, "reactions");
    list_t *reactionsList;
    if (reactions) { 
    cJSON *reactions_local_nonprimitive;
    if(!cJSON_IsArray(reactions)){
        goto end; //nonprimitive container
    }

    reactionsList = list_create();

    cJSON_ArrayForEach(reactions_local_nonprimitive,reactions )
    {
        if(!cJSON_IsObject(reactions_local_nonprimitive)){
            goto end;
        }
        emoji_reaction_t *reactionsItem = emoji_reaction_parseFromJSON(reactions_local_nonprimitive);

        list_addElement(reactionsList, reactionsItem);
    }
    }

    // messages_base->recipient_id
    cJSON *recipient_id = cJSON_GetObjectItemCaseSensitive(messages_baseJSON, "recipient_id");
    if (recipient_id) { 
    if(!cJSON_IsNumber(recipient_id))
    {
    goto end; //Numeric
    }
    }

    // messages_base->sender_email
    cJSON *sender_email = cJSON_GetObjectItemCaseSensitive(messages_baseJSON, "sender_email");
    if (sender_email) { 
    if(!cJSON_IsString(sender_email))
    {
    goto end; //String
    }
    }

    // messages_base->sender_full_name
    cJSON *sender_full_name = cJSON_GetObjectItemCaseSensitive(messages_baseJSON, "sender_full_name");
    if (sender_full_name) { 
    if(!cJSON_IsString(sender_full_name))
    {
    goto end; //String
    }
    }

    // messages_base->sender_id
    cJSON *sender_id = cJSON_GetObjectItemCaseSensitive(messages_baseJSON, "sender_id");
    if (sender_id) { 
    if(!cJSON_IsNumber(sender_id))
    {
    goto end; //Numeric
    }
    }

    // messages_base->sender_realm_str
    cJSON *sender_realm_str = cJSON_GetObjectItemCaseSensitive(messages_baseJSON, "sender_realm_str");
    if (sender_realm_str) { 
    if(!cJSON_IsString(sender_realm_str))
    {
    goto end; //String
    }
    }

    // messages_base->stream_id
    cJSON *stream_id = cJSON_GetObjectItemCaseSensitive(messages_baseJSON, "stream_id");
    if (stream_id) { 
    if(!cJSON_IsNumber(stream_id))
    {
    goto end; //Numeric
    }
    }

    // messages_base->subject
    cJSON *subject = cJSON_GetObjectItemCaseSensitive(messages_baseJSON, "subject");
    if (subject) { 
    if(!cJSON_IsString(subject))
    {
    goto end; //String
    }
    }

    // messages_base->topic_links
    cJSON *topic_links = cJSON_GetObjectItemCaseSensitive(messages_baseJSON, "topic_links");
    list_t *topic_linksList;
    if (topic_links) { 
    cJSON *topic_links_local_nonprimitive;
    if(!cJSON_IsArray(topic_links)){
        goto end; //nonprimitive container
    }

    topic_linksList = list_create();

    cJSON_ArrayForEach(topic_links_local_nonprimitive,topic_links )
    {
        if(!cJSON_IsObject(topic_links_local_nonprimitive)){
            goto end;
        }
        messages_base_topic_links_t *topic_linksItem = messages_base_topic_links_parseFromJSON(topic_links_local_nonprimitive);

        list_addElement(topic_linksList, topic_linksItem);
    }
    }

    // messages_base->submessages
    cJSON *submessages = cJSON_GetObjectItemCaseSensitive(messages_baseJSON, "submessages");
    list_t *submessagesList;
    if (submessages) { 
    cJSON *submessages_local;
    if(!cJSON_IsArray(submessages)) {
        goto end;//primitive container
    }
    submessagesList = list_create();

    cJSON_ArrayForEach(submessages_local, submessages)
    {
        if(!cJSON_IsString(submessages_local))
        {
            goto end;
        }
        list_addElement(submessagesList , strdup(submessages_local->valuestring));
    }
    }

    // messages_base->timestamp
    cJSON *timestamp = cJSON_GetObjectItemCaseSensitive(messages_baseJSON, "timestamp");
    if (timestamp) { 
    if(!cJSON_IsNumber(timestamp))
    {
    goto end; //Numeric
    }
    }

    // messages_base->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(messages_baseJSON, "type");
    if (type) { 
    if(!cJSON_IsString(type))
    {
    goto end; //String
    }
    }


    messages_base_local_var = messages_base_create (
        avatar_url ? strdup(avatar_url->valuestring) : NULL,
        client ? strdup(client->valuestring) : NULL,
        content ? strdup(content->valuestring) : NULL,
        content_type ? strdup(content_type->valuestring) : NULL,
        display_recipient ? display_recipient_local_nonprim : NULL,
        id ? id->valuedouble : 0,
        is_me_message ? is_me_message->valueint : 0,
        reactions ? reactionsList : NULL,
        recipient_id ? recipient_id->valuedouble : 0,
        sender_email ? strdup(sender_email->valuestring) : NULL,
        sender_full_name ? strdup(sender_full_name->valuestring) : NULL,
        sender_id ? sender_id->valuedouble : 0,
        sender_realm_str ? strdup(sender_realm_str->valuestring) : NULL,
        stream_id ? stream_id->valuedouble : 0,
        subject ? strdup(subject->valuestring) : NULL,
        topic_links ? topic_linksList : NULL,
        submessages ? submessagesList : NULL,
        timestamp ? timestamp->valuedouble : 0,
        type ? strdup(type->valuestring) : NULL
        );

    return messages_base_local_var;
end:
    if (display_recipient_local_nonprim) {
        one_ofstringarray_free(display_recipient_local_nonprim);
        display_recipient_local_nonprim = NULL;
    }
    return NULL;

}
