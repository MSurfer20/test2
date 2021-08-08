#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realm_export.h"



realm_export_t *realm_export_create(
    int id,
    int acting_user_id,
    double export_time,
    double deleted_timestamp,
    double failed_timestamp,
    char *export_url,
    int pending
    ) {
    realm_export_t *realm_export_local_var = malloc(sizeof(realm_export_t));
    if (!realm_export_local_var) {
        return NULL;
    }
    realm_export_local_var->id = id;
    realm_export_local_var->acting_user_id = acting_user_id;
    realm_export_local_var->export_time = export_time;
    realm_export_local_var->deleted_timestamp = deleted_timestamp;
    realm_export_local_var->failed_timestamp = failed_timestamp;
    realm_export_local_var->export_url = export_url;
    realm_export_local_var->pending = pending;

    return realm_export_local_var;
}


void realm_export_free(realm_export_t *realm_export) {
    if(NULL == realm_export){
        return ;
    }
    listEntry_t *listEntry;
    if (realm_export->export_url) {
        free(realm_export->export_url);
        realm_export->export_url = NULL;
    }
    free(realm_export);
}

cJSON *realm_export_convertToJSON(realm_export_t *realm_export) {
    cJSON *item = cJSON_CreateObject();

    // realm_export->id
    if(realm_export->id) { 
    if(cJSON_AddNumberToObject(item, "id", realm_export->id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // realm_export->acting_user_id
    if(realm_export->acting_user_id) { 
    if(cJSON_AddNumberToObject(item, "acting_user_id", realm_export->acting_user_id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // realm_export->export_time
    if(realm_export->export_time) { 
    if(cJSON_AddNumberToObject(item, "export_time", realm_export->export_time) == NULL) {
    goto fail; //Numeric
    }
     } 


    // realm_export->deleted_timestamp
    if(realm_export->deleted_timestamp) { 
    if(cJSON_AddNumberToObject(item, "deleted_timestamp", realm_export->deleted_timestamp) == NULL) {
    goto fail; //Numeric
    }
     } 


    // realm_export->failed_timestamp
    if(realm_export->failed_timestamp) { 
    if(cJSON_AddNumberToObject(item, "failed_timestamp", realm_export->failed_timestamp) == NULL) {
    goto fail; //Numeric
    }
     } 


    // realm_export->export_url
    if(realm_export->export_url) { 
    if(cJSON_AddStringToObject(item, "export_url", realm_export->export_url) == NULL) {
    goto fail; //String
    }
     } 


    // realm_export->pending
    if(realm_export->pending) { 
    if(cJSON_AddBoolToObject(item, "pending", realm_export->pending) == NULL) {
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

realm_export_t *realm_export_parseFromJSON(cJSON *realm_exportJSON){

    realm_export_t *realm_export_local_var = NULL;

    // realm_export->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(realm_exportJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // realm_export->acting_user_id
    cJSON *acting_user_id = cJSON_GetObjectItemCaseSensitive(realm_exportJSON, "acting_user_id");
    if (acting_user_id) { 
    if(!cJSON_IsNumber(acting_user_id))
    {
    goto end; //Numeric
    }
    }

    // realm_export->export_time
    cJSON *export_time = cJSON_GetObjectItemCaseSensitive(realm_exportJSON, "export_time");
    if (export_time) { 
    if(!cJSON_IsNumber(export_time))
    {
    goto end; //Numeric
    }
    }

    // realm_export->deleted_timestamp
    cJSON *deleted_timestamp = cJSON_GetObjectItemCaseSensitive(realm_exportJSON, "deleted_timestamp");
    if (deleted_timestamp) { 
    if(!cJSON_IsNumber(deleted_timestamp))
    {
    goto end; //Numeric
    }
    }

    // realm_export->failed_timestamp
    cJSON *failed_timestamp = cJSON_GetObjectItemCaseSensitive(realm_exportJSON, "failed_timestamp");
    if (failed_timestamp) { 
    if(!cJSON_IsNumber(failed_timestamp))
    {
    goto end; //Numeric
    }
    }

    // realm_export->export_url
    cJSON *export_url = cJSON_GetObjectItemCaseSensitive(realm_exportJSON, "export_url");
    if (export_url) { 
    if(!cJSON_IsString(export_url))
    {
    goto end; //String
    }
    }

    // realm_export->pending
    cJSON *pending = cJSON_GetObjectItemCaseSensitive(realm_exportJSON, "pending");
    if (pending) { 
    if(!cJSON_IsBool(pending))
    {
    goto end; //Bool
    }
    }


    realm_export_local_var = realm_export_create (
        id ? id->valuedouble : 0,
        acting_user_id ? acting_user_id->valuedouble : 0,
        export_time ? export_time->valuedouble : 0,
        deleted_timestamp ? deleted_timestamp->valuedouble : 0,
        failed_timestamp ? failed_timestamp->valuedouble : 0,
        export_url ? strdup(export_url->valuestring) : NULL,
        pending ? pending->valueint : 0
        );

    return realm_export_local_var;
end:
    return NULL;

}
