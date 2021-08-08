#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "attachments.h"



attachments_t *attachments_create(
    int id,
    char *name,
    char *path_id,
    int size,
    int create_time,
    list_t *messages
    ) {
    attachments_t *attachments_local_var = malloc(sizeof(attachments_t));
    if (!attachments_local_var) {
        return NULL;
    }
    attachments_local_var->id = id;
    attachments_local_var->name = name;
    attachments_local_var->path_id = path_id;
    attachments_local_var->size = size;
    attachments_local_var->create_time = create_time;
    attachments_local_var->messages = messages;

    return attachments_local_var;
}


void attachments_free(attachments_t *attachments) {
    if(NULL == attachments){
        return ;
    }
    listEntry_t *listEntry;
    if (attachments->name) {
        free(attachments->name);
        attachments->name = NULL;
    }
    if (attachments->path_id) {
        free(attachments->path_id);
        attachments->path_id = NULL;
    }
    if (attachments->messages) {
        list_ForEach(listEntry, attachments->messages) {
            attachments_messages_free(listEntry->data);
        }
        list_free(attachments->messages);
        attachments->messages = NULL;
    }
    free(attachments);
}

cJSON *attachments_convertToJSON(attachments_t *attachments) {
    cJSON *item = cJSON_CreateObject();

    // attachments->id
    if(attachments->id) { 
    if(cJSON_AddNumberToObject(item, "id", attachments->id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // attachments->name
    if(attachments->name) { 
    if(cJSON_AddStringToObject(item, "name", attachments->name) == NULL) {
    goto fail; //String
    }
     } 


    // attachments->path_id
    if(attachments->path_id) { 
    if(cJSON_AddStringToObject(item, "path_id", attachments->path_id) == NULL) {
    goto fail; //String
    }
     } 


    // attachments->size
    if(attachments->size) { 
    if(cJSON_AddNumberToObject(item, "size", attachments->size) == NULL) {
    goto fail; //Numeric
    }
     } 


    // attachments->create_time
    if(attachments->create_time) { 
    if(cJSON_AddNumberToObject(item, "create_time", attachments->create_time) == NULL) {
    goto fail; //Numeric
    }
     } 


    // attachments->messages
    if(attachments->messages) { 
    cJSON *messages = cJSON_AddArrayToObject(item, "messages");
    if(messages == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *messagesListEntry;
    if (attachments->messages) {
    list_ForEach(messagesListEntry, attachments->messages) {
    cJSON *itemLocal = attachments_messages_convertToJSON(messagesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(messages, itemLocal);
    }
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

attachments_t *attachments_parseFromJSON(cJSON *attachmentsJSON){

    attachments_t *attachments_local_var = NULL;

    // attachments->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(attachmentsJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // attachments->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(attachmentsJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }
    }

    // attachments->path_id
    cJSON *path_id = cJSON_GetObjectItemCaseSensitive(attachmentsJSON, "path_id");
    if (path_id) { 
    if(!cJSON_IsString(path_id))
    {
    goto end; //String
    }
    }

    // attachments->size
    cJSON *size = cJSON_GetObjectItemCaseSensitive(attachmentsJSON, "size");
    if (size) { 
    if(!cJSON_IsNumber(size))
    {
    goto end; //Numeric
    }
    }

    // attachments->create_time
    cJSON *create_time = cJSON_GetObjectItemCaseSensitive(attachmentsJSON, "create_time");
    if (create_time) { 
    if(!cJSON_IsNumber(create_time))
    {
    goto end; //Numeric
    }
    }

    // attachments->messages
    cJSON *messages = cJSON_GetObjectItemCaseSensitive(attachmentsJSON, "messages");
    list_t *messagesList;
    if (messages) { 
    cJSON *messages_local_nonprimitive;
    if(!cJSON_IsArray(messages)){
        goto end; //nonprimitive container
    }

    messagesList = list_create();

    cJSON_ArrayForEach(messages_local_nonprimitive,messages )
    {
        if(!cJSON_IsObject(messages_local_nonprimitive)){
            goto end;
        }
        attachments_messages_t *messagesItem = attachments_messages_parseFromJSON(messages_local_nonprimitive);

        list_addElement(messagesList, messagesItem);
    }
    }


    attachments_local_var = attachments_create (
        id ? id->valuedouble : 0,
        name ? strdup(name->valuestring) : NULL,
        path_id ? strdup(path_id->valuestring) : NULL,
        size ? size->valuedouble : 0,
        create_time ? create_time->valuedouble : 0,
        messages ? messagesList : NULL
        );

    return attachments_local_var;
end:
    return NULL;

}
