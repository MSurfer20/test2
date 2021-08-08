/*
 * realm_playground.h
 *
 * Object containing details about a realm playground. 
 */

#ifndef _realm_playground_H_
#define _realm_playground_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realm_playground_t realm_playground_t;




typedef struct realm_playground_t {
    int id; //numeric
    char *name; // string
    char *pygments_language; // string
    char *url_prefix; // string

} realm_playground_t;

realm_playground_t *realm_playground_create(
    int id,
    char *name,
    char *pygments_language,
    char *url_prefix
);

void realm_playground_free(realm_playground_t *realm_playground);

realm_playground_t *realm_playground_parseFromJSON(cJSON *realm_playgroundJSON);

cJSON *realm_playground_convertToJSON(realm_playground_t *realm_playground);

#endif /* _realm_playground_H_ */

