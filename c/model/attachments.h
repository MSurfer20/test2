/*
 * attachments.h
 *
 * Dictionary containing details of a file uploaded by a user. 
 */

#ifndef _attachments_H_
#define _attachments_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct attachments_t attachments_t;

#include "attachments_messages.h"



typedef struct attachments_t {
    int id; //numeric
    char *name; // string
    char *path_id; // string
    int size; //numeric
    int create_time; //numeric
    list_t *messages; //nonprimitive container

} attachments_t;

attachments_t *attachments_create(
    int id,
    char *name,
    char *path_id,
    int size,
    int create_time,
    list_t *messages
);

void attachments_free(attachments_t *attachments);

attachments_t *attachments_parseFromJSON(cJSON *attachmentsJSON);

cJSON *attachments_convertToJSON(attachments_t *attachments);

#endif /* _attachments_H_ */

