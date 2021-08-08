/*
 * custom_profile_field.h
 *
 * Dictionary containing the details of a custom profile field configured for this organization. 
 */

#ifndef _custom_profile_field_H_
#define _custom_profile_field_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct custom_profile_field_t custom_profile_field_t;




typedef struct custom_profile_field_t {
    int id; //numeric
    int type; //numeric
    int order; //numeric
    char *name; // string
    char *hint; // string
    char *field_data; // string

} custom_profile_field_t;

custom_profile_field_t *custom_profile_field_create(
    int id,
    int type,
    int order,
    char *name,
    char *hint,
    char *field_data
);

void custom_profile_field_free(custom_profile_field_t *custom_profile_field);

custom_profile_field_t *custom_profile_field_parseFromJSON(cJSON *custom_profile_fieldJSON);

cJSON *custom_profile_field_convertToJSON(custom_profile_field_t *custom_profile_field);

#endif /* _custom_profile_field_H_ */

