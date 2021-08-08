#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "custom_profile_field.h"



custom_profile_field_t *custom_profile_field_create(
    int id,
    int type,
    int order,
    char *name,
    char *hint,
    char *field_data
    ) {
    custom_profile_field_t *custom_profile_field_local_var = malloc(sizeof(custom_profile_field_t));
    if (!custom_profile_field_local_var) {
        return NULL;
    }
    custom_profile_field_local_var->id = id;
    custom_profile_field_local_var->type = type;
    custom_profile_field_local_var->order = order;
    custom_profile_field_local_var->name = name;
    custom_profile_field_local_var->hint = hint;
    custom_profile_field_local_var->field_data = field_data;

    return custom_profile_field_local_var;
}


void custom_profile_field_free(custom_profile_field_t *custom_profile_field) {
    if(NULL == custom_profile_field){
        return ;
    }
    listEntry_t *listEntry;
    if (custom_profile_field->name) {
        free(custom_profile_field->name);
        custom_profile_field->name = NULL;
    }
    if (custom_profile_field->hint) {
        free(custom_profile_field->hint);
        custom_profile_field->hint = NULL;
    }
    if (custom_profile_field->field_data) {
        free(custom_profile_field->field_data);
        custom_profile_field->field_data = NULL;
    }
    free(custom_profile_field);
}

cJSON *custom_profile_field_convertToJSON(custom_profile_field_t *custom_profile_field) {
    cJSON *item = cJSON_CreateObject();

    // custom_profile_field->id
    if(custom_profile_field->id) { 
    if(cJSON_AddNumberToObject(item, "id", custom_profile_field->id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // custom_profile_field->type
    if(custom_profile_field->type) { 
    if(cJSON_AddNumberToObject(item, "type", custom_profile_field->type) == NULL) {
    goto fail; //Numeric
    }
     } 


    // custom_profile_field->order
    if(custom_profile_field->order) { 
    if(cJSON_AddNumberToObject(item, "order", custom_profile_field->order) == NULL) {
    goto fail; //Numeric
    }
     } 


    // custom_profile_field->name
    if(custom_profile_field->name) { 
    if(cJSON_AddStringToObject(item, "name", custom_profile_field->name) == NULL) {
    goto fail; //String
    }
     } 


    // custom_profile_field->hint
    if(custom_profile_field->hint) { 
    if(cJSON_AddStringToObject(item, "hint", custom_profile_field->hint) == NULL) {
    goto fail; //String
    }
     } 


    // custom_profile_field->field_data
    if(custom_profile_field->field_data) { 
    if(cJSON_AddStringToObject(item, "field_data", custom_profile_field->field_data) == NULL) {
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

custom_profile_field_t *custom_profile_field_parseFromJSON(cJSON *custom_profile_fieldJSON){

    custom_profile_field_t *custom_profile_field_local_var = NULL;

    // custom_profile_field->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(custom_profile_fieldJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // custom_profile_field->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(custom_profile_fieldJSON, "type");
    if (type) { 
    if(!cJSON_IsNumber(type))
    {
    goto end; //Numeric
    }
    }

    // custom_profile_field->order
    cJSON *order = cJSON_GetObjectItemCaseSensitive(custom_profile_fieldJSON, "order");
    if (order) { 
    if(!cJSON_IsNumber(order))
    {
    goto end; //Numeric
    }
    }

    // custom_profile_field->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(custom_profile_fieldJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }
    }

    // custom_profile_field->hint
    cJSON *hint = cJSON_GetObjectItemCaseSensitive(custom_profile_fieldJSON, "hint");
    if (hint) { 
    if(!cJSON_IsString(hint))
    {
    goto end; //String
    }
    }

    // custom_profile_field->field_data
    cJSON *field_data = cJSON_GetObjectItemCaseSensitive(custom_profile_fieldJSON, "field_data");
    if (field_data) { 
    if(!cJSON_IsString(field_data))
    {
    goto end; //String
    }
    }


    custom_profile_field_local_var = custom_profile_field_create (
        id ? id->valuedouble : 0,
        type ? type->valuedouble : 0,
        order ? order->valuedouble : 0,
        name ? strdup(name->valuestring) : NULL,
        hint ? strdup(hint->valuestring) : NULL,
        field_data ? strdup(field_data->valuestring) : NULL
        );

    return custom_profile_field_local_var;
end:
    return NULL;

}
