#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_group.h"



user_group_t *user_group_create(
    char *name,
    char *description,
    list_t *members,
    int id
    ) {
    user_group_t *user_group_local_var = malloc(sizeof(user_group_t));
    if (!user_group_local_var) {
        return NULL;
    }
    user_group_local_var->name = name;
    user_group_local_var->description = description;
    user_group_local_var->members = members;
    user_group_local_var->id = id;

    return user_group_local_var;
}


void user_group_free(user_group_t *user_group) {
    if(NULL == user_group){
        return ;
    }
    listEntry_t *listEntry;
    if (user_group->name) {
        free(user_group->name);
        user_group->name = NULL;
    }
    if (user_group->description) {
        free(user_group->description);
        user_group->description = NULL;
    }
    if (user_group->members) {
        list_ForEach(listEntry, user_group->members) {
            free(listEntry->data);
        }
        list_free(user_group->members);
        user_group->members = NULL;
    }
    free(user_group);
}

cJSON *user_group_convertToJSON(user_group_t *user_group) {
    cJSON *item = cJSON_CreateObject();

    // user_group->name
    if(user_group->name) { 
    if(cJSON_AddStringToObject(item, "name", user_group->name) == NULL) {
    goto fail; //String
    }
     } 


    // user_group->description
    if(user_group->description) { 
    if(cJSON_AddStringToObject(item, "description", user_group->description) == NULL) {
    goto fail; //String
    }
     } 


    // user_group->members
    if(user_group->members) { 
    cJSON *members = cJSON_AddArrayToObject(item, "members");
    if(members == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *membersListEntry;
    list_ForEach(membersListEntry, user_group->members) {
    if(cJSON_AddNumberToObject(members, "", *(double *)membersListEntry->data) == NULL)
    {
        goto fail;
    }
    }
     } 


    // user_group->id
    if(user_group->id) { 
    if(cJSON_AddNumberToObject(item, "id", user_group->id) == NULL) {
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

user_group_t *user_group_parseFromJSON(cJSON *user_groupJSON){

    user_group_t *user_group_local_var = NULL;

    // user_group->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(user_groupJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }
    }

    // user_group->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(user_groupJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description))
    {
    goto end; //String
    }
    }

    // user_group->members
    cJSON *members = cJSON_GetObjectItemCaseSensitive(user_groupJSON, "members");
    list_t *membersList;
    if (members) { 
    cJSON *members_local;
    if(!cJSON_IsArray(members)) {
        goto end;//primitive container
    }
    membersList = list_create();

    cJSON_ArrayForEach(members_local, members)
    {
        if(!cJSON_IsNumber(members_local))
        {
            goto end;
        }
        list_addElement(membersList , &members_local->valuedouble);
    }
    }

    // user_group->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(user_groupJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }


    user_group_local_var = user_group_create (
        name ? strdup(name->valuestring) : NULL,
        description ? strdup(description->valuestring) : NULL,
        members ? membersList : NULL,
        id ? id->valuedouble : 0
        );

    return user_group_local_var;
end:
    return NULL;

}
