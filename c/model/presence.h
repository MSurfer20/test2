/*
 * presence.h
 *
 * &#x60;{client_name}&#x60;: Object containing the details of the user&#39;s presence on a particular platform with the client&#39;s platform name being the object key. 
 */

#ifndef _presence_H_
#define _presence_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct presence_t presence_t;


// Enum STATUS for presence

typedef enum  { zulip_rest_api_presence_STATUS_NULL = 0, zulip_rest_api_presence_STATUS_idle, zulip_rest_api_presence_STATUS_active } zulip_rest_api_presence_STATUS_e;

char* presence_status_ToString(zulip_rest_api_presence_STATUS_e status);

zulip_rest_api_presence_STATUS_e presence_status_FromString(char* status);



typedef struct presence_t {
    char *client; // string
    zulip_rest_api_presence_STATUS_e status; //enum
    int timestamp; //numeric
    int pushable; //boolean

} presence_t;

presence_t *presence_create(
    char *client,
    zulip_rest_api_presence_STATUS_e status,
    int timestamp,
    int pushable
);

void presence_free(presence_t *presence);

presence_t *presence_parseFromJSON(cJSON *presenceJSON);

cJSON *presence_convertToJSON(presence_t *presence);

#endif /* _presence_H_ */

