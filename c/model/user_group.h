/*
 * user_group.h
 *
 * Object containing the user group&#39;s attributes. 
 */

#ifndef _user_group_H_
#define _user_group_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_group_t user_group_t;




typedef struct user_group_t {
    char *name; // string
    char *description; // string
    list_t *members; //primitive container
    int id; //numeric

} user_group_t;

user_group_t *user_group_create(
    char *name,
    char *description,
    list_t *members,
    int id
);

void user_group_free(user_group_t *user_group);

user_group_t *user_group_parseFromJSON(cJSON *user_groupJSON);

cJSON *user_group_convertToJSON(user_group_t *user_group);

#endif /* _user_group_H_ */

