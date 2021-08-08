#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "attachments_messages.h"



attachments_messages_t *attachments_messages_create(
    int date_sent,
    int id
    ) {
    attachments_messages_t *attachments_messages_local_var = malloc(sizeof(attachments_messages_t));
    if (!attachments_messages_local_var) {
        return NULL;
    }
    attachments_messages_local_var->date_sent = date_sent;
    attachments_messages_local_var->id = id;

    return attachments_messages_local_var;
}


void attachments_messages_free(attachments_messages_t *attachments_messages) {
    if(NULL == attachments_messages){
        return ;
    }
    listEntry_t *listEntry;
    free(attachments_messages);
}

cJSON *attachments_messages_convertToJSON(attachments_messages_t *attachments_messages) {
    cJSON *item = cJSON_CreateObject();

    // attachments_messages->date_sent
    if(attachments_messages->date_sent) { 
    if(cJSON_AddNumberToObject(item, "date_sent", attachments_messages->date_sent) == NULL) {
    goto fail; //Numeric
    }
     } 


    // attachments_messages->id
    if(attachments_messages->id) { 
    if(cJSON_AddNumberToObject(item, "id", attachments_messages->id) == NULL) {
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

attachments_messages_t *attachments_messages_parseFromJSON(cJSON *attachments_messagesJSON){

    attachments_messages_t *attachments_messages_local_var = NULL;

    // attachments_messages->date_sent
    cJSON *date_sent = cJSON_GetObjectItemCaseSensitive(attachments_messagesJSON, "date_sent");
    if (date_sent) { 
    if(!cJSON_IsNumber(date_sent))
    {
    goto end; //Numeric
    }
    }

    // attachments_messages->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(attachments_messagesJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }


    attachments_messages_local_var = attachments_messages_create (
        date_sent ? date_sent->valuedouble : 0,
        id ? id->valuedouble : 0
        );

    return attachments_messages_local_var;
end:
    return NULL;

}
