#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "draft.h"


char* typedraft_ToString(zulip_rest_api_draft_TYPE_e type) {
    char* typeArray[] =  { "NULL", "", "stream", "private" };
	return typeArray[type];
}

zulip_rest_api_draft_TYPE_e typedraft_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "", "stream", "private" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

draft_t *draft_create(
    int id,
    zulip_rest_api_draft_TYPE_e type,
    list_t *to,
    char *topic,
    char *content,
    double timestamp
    ) {
    draft_t *draft_local_var = malloc(sizeof(draft_t));
    if (!draft_local_var) {
        return NULL;
    }
    draft_local_var->id = id;
    draft_local_var->type = type;
    draft_local_var->to = to;
    draft_local_var->topic = topic;
    draft_local_var->content = content;
    draft_local_var->timestamp = timestamp;

    return draft_local_var;
}


void draft_free(draft_t *draft) {
    if(NULL == draft){
        return ;
    }
    listEntry_t *listEntry;
    if (draft->to) {
        list_ForEach(listEntry, draft->to) {
            free(listEntry->data);
        }
        list_free(draft->to);
        draft->to = NULL;
    }
    if (draft->topic) {
        free(draft->topic);
        draft->topic = NULL;
    }
    if (draft->content) {
        free(draft->content);
        draft->content = NULL;
    }
    free(draft);
}

cJSON *draft_convertToJSON(draft_t *draft) {
    cJSON *item = cJSON_CreateObject();

    // draft->id
    if(draft->id) { 
    if(cJSON_AddNumberToObject(item, "id", draft->id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // draft->type
    
    if(cJSON_AddStringToObject(item, "type", typedraft_ToString(draft->type)) == NULL)
    {
    goto fail; //Enum
    }


    // draft->to
    if (!draft->to) {
        goto fail;
    }
    
    cJSON *to = cJSON_AddArrayToObject(item, "to");
    if(to == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *toListEntry;
    list_ForEach(toListEntry, draft->to) {
    if(cJSON_AddNumberToObject(to, "", *(double *)toListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // draft->topic
    if (!draft->topic) {
        goto fail;
    }
    
    if(cJSON_AddStringToObject(item, "topic", draft->topic) == NULL) {
    goto fail; //String
    }


    // draft->content
    if (!draft->content) {
        goto fail;
    }
    
    if(cJSON_AddStringToObject(item, "content", draft->content) == NULL) {
    goto fail; //String
    }


    // draft->timestamp
    if(draft->timestamp) { 
    if(cJSON_AddNumberToObject(item, "timestamp", draft->timestamp) == NULL) {
    goto fail; //Numeric
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

draft_t *draft_parseFromJSON(cJSON *draftJSON){

    draft_t *draft_local_var = NULL;

    // draft->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(draftJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // draft->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(draftJSON, "type");
    if (!type) {
        goto end;
    }

    zulip_rest_api_draft_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = typedraft_FromString(type->valuestring);

    // draft->to
    cJSON *to = cJSON_GetObjectItemCaseSensitive(draftJSON, "to");
    if (!to) {
        goto end;
    }

    list_t *toList;
    
    cJSON *to_local;
    if(!cJSON_IsArray(to)) {
        goto end;//primitive container
    }
    toList = list_create();

    cJSON_ArrayForEach(to_local, to)
    {
        if(!cJSON_IsNumber(to_local))
        {
            goto end;
        }
        list_addElement(toList , &to_local->valuedouble);
    }

    // draft->topic
    cJSON *topic = cJSON_GetObjectItemCaseSensitive(draftJSON, "topic");
    if (!topic) {
        goto end;
    }

    
    if(!cJSON_IsString(topic))
    {
    goto end; //String
    }

    // draft->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(draftJSON, "content");
    if (!content) {
        goto end;
    }

    
    if(!cJSON_IsString(content))
    {
    goto end; //String
    }

    // draft->timestamp
    cJSON *timestamp = cJSON_GetObjectItemCaseSensitive(draftJSON, "timestamp");
    if (timestamp) { 
    if(!cJSON_IsNumber(timestamp))
    {
    goto end; //Numeric
    }
    }


    draft_local_var = draft_create (
        id ? id->valuedouble : 0,
        typeVariable,
        toList,
        strdup(topic->valuestring),
        strdup(content->valuestring),
        timestamp ? timestamp->valuedouble : 0
        );

    return draft_local_var;
end:
    return NULL;

}
