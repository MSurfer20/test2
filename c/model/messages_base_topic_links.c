#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "messages_base_topic_links.h"



messages_base_topic_links_t *messages_base_topic_links_create(
    char *text,
    char *url
    ) {
    messages_base_topic_links_t *messages_base_topic_links_local_var = malloc(sizeof(messages_base_topic_links_t));
    if (!messages_base_topic_links_local_var) {
        return NULL;
    }
    messages_base_topic_links_local_var->text = text;
    messages_base_topic_links_local_var->url = url;

    return messages_base_topic_links_local_var;
}


void messages_base_topic_links_free(messages_base_topic_links_t *messages_base_topic_links) {
    if(NULL == messages_base_topic_links){
        return ;
    }
    listEntry_t *listEntry;
    if (messages_base_topic_links->text) {
        free(messages_base_topic_links->text);
        messages_base_topic_links->text = NULL;
    }
    if (messages_base_topic_links->url) {
        free(messages_base_topic_links->url);
        messages_base_topic_links->url = NULL;
    }
    free(messages_base_topic_links);
}

cJSON *messages_base_topic_links_convertToJSON(messages_base_topic_links_t *messages_base_topic_links) {
    cJSON *item = cJSON_CreateObject();

    // messages_base_topic_links->text
    if(messages_base_topic_links->text) { 
    if(cJSON_AddStringToObject(item, "text", messages_base_topic_links->text) == NULL) {
    goto fail; //String
    }
     } 


    // messages_base_topic_links->url
    if(messages_base_topic_links->url) { 
    if(cJSON_AddStringToObject(item, "url", messages_base_topic_links->url) == NULL) {
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

messages_base_topic_links_t *messages_base_topic_links_parseFromJSON(cJSON *messages_base_topic_linksJSON){

    messages_base_topic_links_t *messages_base_topic_links_local_var = NULL;

    // messages_base_topic_links->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(messages_base_topic_linksJSON, "text");
    if (text) { 
    if(!cJSON_IsString(text))
    {
    goto end; //String
    }
    }

    // messages_base_topic_links->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(messages_base_topic_linksJSON, "url");
    if (url) { 
    if(!cJSON_IsString(url))
    {
    goto end; //String
    }
    }


    messages_base_topic_links_local_var = messages_base_topic_links_create (
        text ? strdup(text->valuestring) : NULL,
        url ? strdup(url->valuestring) : NULL
        );

    return messages_base_topic_links_local_var;
end:
    return NULL;

}
