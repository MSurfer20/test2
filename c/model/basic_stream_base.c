#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "basic_stream_base.h"



basic_stream_base_t *basic_stream_base_create(
    int stream_id,
    char *name,
    char *description,
    int date_created,
    int invite_only,
    char *rendered_description,
    int is_web_public,
    int stream_post_policy,
    int message_retention_days,
    int history_public_to_subscribers,
    int first_message_id,
    int is_announcement_only
    ) {
    basic_stream_base_t *basic_stream_base_local_var = malloc(sizeof(basic_stream_base_t));
    if (!basic_stream_base_local_var) {
        return NULL;
    }
    basic_stream_base_local_var->stream_id = stream_id;
    basic_stream_base_local_var->name = name;
    basic_stream_base_local_var->description = description;
    basic_stream_base_local_var->date_created = date_created;
    basic_stream_base_local_var->invite_only = invite_only;
    basic_stream_base_local_var->rendered_description = rendered_description;
    basic_stream_base_local_var->is_web_public = is_web_public;
    basic_stream_base_local_var->stream_post_policy = stream_post_policy;
    basic_stream_base_local_var->message_retention_days = message_retention_days;
    basic_stream_base_local_var->history_public_to_subscribers = history_public_to_subscribers;
    basic_stream_base_local_var->first_message_id = first_message_id;
    basic_stream_base_local_var->is_announcement_only = is_announcement_only;

    return basic_stream_base_local_var;
}


void basic_stream_base_free(basic_stream_base_t *basic_stream_base) {
    if(NULL == basic_stream_base){
        return ;
    }
    listEntry_t *listEntry;
    if (basic_stream_base->name) {
        free(basic_stream_base->name);
        basic_stream_base->name = NULL;
    }
    if (basic_stream_base->description) {
        free(basic_stream_base->description);
        basic_stream_base->description = NULL;
    }
    if (basic_stream_base->rendered_description) {
        free(basic_stream_base->rendered_description);
        basic_stream_base->rendered_description = NULL;
    }
    free(basic_stream_base);
}

cJSON *basic_stream_base_convertToJSON(basic_stream_base_t *basic_stream_base) {
    cJSON *item = cJSON_CreateObject();

    // basic_stream_base->stream_id
    if(basic_stream_base->stream_id) { 
    if(cJSON_AddNumberToObject(item, "stream_id", basic_stream_base->stream_id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // basic_stream_base->name
    if(basic_stream_base->name) { 
    if(cJSON_AddStringToObject(item, "name", basic_stream_base->name) == NULL) {
    goto fail; //String
    }
     } 


    // basic_stream_base->description
    if(basic_stream_base->description) { 
    if(cJSON_AddStringToObject(item, "description", basic_stream_base->description) == NULL) {
    goto fail; //String
    }
     } 


    // basic_stream_base->date_created
    if(basic_stream_base->date_created) { 
    if(cJSON_AddNumberToObject(item, "date_created", basic_stream_base->date_created) == NULL) {
    goto fail; //Numeric
    }
     } 


    // basic_stream_base->invite_only
    if(basic_stream_base->invite_only) { 
    if(cJSON_AddBoolToObject(item, "invite_only", basic_stream_base->invite_only) == NULL) {
    goto fail; //Bool
    }
     } 


    // basic_stream_base->rendered_description
    if(basic_stream_base->rendered_description) { 
    if(cJSON_AddStringToObject(item, "rendered_description", basic_stream_base->rendered_description) == NULL) {
    goto fail; //String
    }
     } 


    // basic_stream_base->is_web_public
    if(basic_stream_base->is_web_public) { 
    if(cJSON_AddBoolToObject(item, "is_web_public", basic_stream_base->is_web_public) == NULL) {
    goto fail; //Bool
    }
     } 


    // basic_stream_base->stream_post_policy
    if(basic_stream_base->stream_post_policy) { 
    if(cJSON_AddNumberToObject(item, "stream_post_policy", basic_stream_base->stream_post_policy) == NULL) {
    goto fail; //Numeric
    }
     } 


    // basic_stream_base->message_retention_days
    if(basic_stream_base->message_retention_days) { 
    if(cJSON_AddNumberToObject(item, "message_retention_days", basic_stream_base->message_retention_days) == NULL) {
    goto fail; //Numeric
    }
     } 


    // basic_stream_base->history_public_to_subscribers
    if(basic_stream_base->history_public_to_subscribers) { 
    if(cJSON_AddBoolToObject(item, "history_public_to_subscribers", basic_stream_base->history_public_to_subscribers) == NULL) {
    goto fail; //Bool
    }
     } 


    // basic_stream_base->first_message_id
    if(basic_stream_base->first_message_id) { 
    if(cJSON_AddNumberToObject(item, "first_message_id", basic_stream_base->first_message_id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // basic_stream_base->is_announcement_only
    if(basic_stream_base->is_announcement_only) { 
    if(cJSON_AddBoolToObject(item, "is_announcement_only", basic_stream_base->is_announcement_only) == NULL) {
    goto fail; //Bool
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

basic_stream_base_t *basic_stream_base_parseFromJSON(cJSON *basic_stream_baseJSON){

    basic_stream_base_t *basic_stream_base_local_var = NULL;

    // basic_stream_base->stream_id
    cJSON *stream_id = cJSON_GetObjectItemCaseSensitive(basic_stream_baseJSON, "stream_id");
    if (stream_id) { 
    if(!cJSON_IsNumber(stream_id))
    {
    goto end; //Numeric
    }
    }

    // basic_stream_base->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(basic_stream_baseJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }
    }

    // basic_stream_base->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(basic_stream_baseJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description))
    {
    goto end; //String
    }
    }

    // basic_stream_base->date_created
    cJSON *date_created = cJSON_GetObjectItemCaseSensitive(basic_stream_baseJSON, "date_created");
    if (date_created) { 
    if(!cJSON_IsNumber(date_created))
    {
    goto end; //Numeric
    }
    }

    // basic_stream_base->invite_only
    cJSON *invite_only = cJSON_GetObjectItemCaseSensitive(basic_stream_baseJSON, "invite_only");
    if (invite_only) { 
    if(!cJSON_IsBool(invite_only))
    {
    goto end; //Bool
    }
    }

    // basic_stream_base->rendered_description
    cJSON *rendered_description = cJSON_GetObjectItemCaseSensitive(basic_stream_baseJSON, "rendered_description");
    if (rendered_description) { 
    if(!cJSON_IsString(rendered_description))
    {
    goto end; //String
    }
    }

    // basic_stream_base->is_web_public
    cJSON *is_web_public = cJSON_GetObjectItemCaseSensitive(basic_stream_baseJSON, "is_web_public");
    if (is_web_public) { 
    if(!cJSON_IsBool(is_web_public))
    {
    goto end; //Bool
    }
    }

    // basic_stream_base->stream_post_policy
    cJSON *stream_post_policy = cJSON_GetObjectItemCaseSensitive(basic_stream_baseJSON, "stream_post_policy");
    if (stream_post_policy) { 
    if(!cJSON_IsNumber(stream_post_policy))
    {
    goto end; //Numeric
    }
    }

    // basic_stream_base->message_retention_days
    cJSON *message_retention_days = cJSON_GetObjectItemCaseSensitive(basic_stream_baseJSON, "message_retention_days");
    if (message_retention_days) { 
    if(!cJSON_IsNumber(message_retention_days))
    {
    goto end; //Numeric
    }
    }

    // basic_stream_base->history_public_to_subscribers
    cJSON *history_public_to_subscribers = cJSON_GetObjectItemCaseSensitive(basic_stream_baseJSON, "history_public_to_subscribers");
    if (history_public_to_subscribers) { 
    if(!cJSON_IsBool(history_public_to_subscribers))
    {
    goto end; //Bool
    }
    }

    // basic_stream_base->first_message_id
    cJSON *first_message_id = cJSON_GetObjectItemCaseSensitive(basic_stream_baseJSON, "first_message_id");
    if (first_message_id) { 
    if(!cJSON_IsNumber(first_message_id))
    {
    goto end; //Numeric
    }
    }

    // basic_stream_base->is_announcement_only
    cJSON *is_announcement_only = cJSON_GetObjectItemCaseSensitive(basic_stream_baseJSON, "is_announcement_only");
    if (is_announcement_only) { 
    if(!cJSON_IsBool(is_announcement_only))
    {
    goto end; //Bool
    }
    }


    basic_stream_base_local_var = basic_stream_base_create (
        stream_id ? stream_id->valuedouble : 0,
        name ? strdup(name->valuestring) : NULL,
        description ? strdup(description->valuestring) : NULL,
        date_created ? date_created->valuedouble : 0,
        invite_only ? invite_only->valueint : 0,
        rendered_description ? strdup(rendered_description->valuestring) : NULL,
        is_web_public ? is_web_public->valueint : 0,
        stream_post_policy ? stream_post_policy->valuedouble : 0,
        message_retention_days ? message_retention_days->valuedouble : 0,
        history_public_to_subscribers ? history_public_to_subscribers->valueint : 0,
        first_message_id ? first_message_id->valuedouble : 0,
        is_announcement_only ? is_announcement_only->valueint : 0
        );

    return basic_stream_base_local_var;
end:
    return NULL;

}
