/*
 * realm_emoji.h
 *
 * &#x60;{emoji_id}&#x60;: Object containing details about the emoji with  the specified ID. It has the following properties: 
 */

#ifndef _realm_emoji_H_
#define _realm_emoji_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realm_emoji_t realm_emoji_t;




typedef struct realm_emoji_t {
    char *id; // string
    char *name; // string
    char *source_url; // string
    int deactivated; //boolean
    int author_id; //numeric

} realm_emoji_t;

realm_emoji_t *realm_emoji_create(
    char *id,
    char *name,
    char *source_url,
    int deactivated,
    int author_id
);

void realm_emoji_free(realm_emoji_t *realm_emoji);

realm_emoji_t *realm_emoji_parseFromJSON(cJSON *realm_emojiJSON);

cJSON *realm_emoji_convertToJSON(realm_emoji_t *realm_emoji);

#endif /* _realm_emoji_H_ */

