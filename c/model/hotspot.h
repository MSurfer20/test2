/*
 * hotspot.h
 *
 * Dictionary containing details of a single hotspot. 
 */

#ifndef _hotspot_H_
#define _hotspot_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct hotspot_t hotspot_t;




typedef struct hotspot_t {
    double delay; //numeric
    char *name; // string
    char *title; // string
    char *description; // string

} hotspot_t;

hotspot_t *hotspot_create(
    double delay,
    char *name,
    char *title,
    char *description
);

void hotspot_free(hotspot_t *hotspot);

hotspot_t *hotspot_parseFromJSON(cJSON *hotspotJSON);

cJSON *hotspot_convertToJSON(hotspot_t *hotspot);

#endif /* _hotspot_H_ */

