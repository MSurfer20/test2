/*
 * realm_export.h
 *
 * Object containing details about a realm export. 
 */

#ifndef _realm_export_H_
#define _realm_export_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realm_export_t realm_export_t;




typedef struct realm_export_t {
    int id; //numeric
    int acting_user_id; //numeric
    double export_time; //numeric
    double deleted_timestamp; //numeric
    double failed_timestamp; //numeric
    char *export_url; // string
    int pending; //boolean

} realm_export_t;

realm_export_t *realm_export_create(
    int id,
    int acting_user_id,
    double export_time,
    double deleted_timestamp,
    double failed_timestamp,
    char *export_url,
    int pending
);

void realm_export_free(realm_export_t *realm_export);

realm_export_t *realm_export_parseFromJSON(cJSON *realm_exportJSON);

cJSON *realm_export_convertToJSON(realm_export_t *realm_export);

#endif /* _realm_export_H_ */

