/*
 * realm_domain.h
 *
 * Object containing details of the newly added domain. 
 */

#ifndef _realm_domain_H_
#define _realm_domain_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realm_domain_t realm_domain_t;




typedef struct realm_domain_t {
    char *domain; // string
    int allow_subdomains; //boolean

} realm_domain_t;

realm_domain_t *realm_domain_create(
    char *domain,
    int allow_subdomains
);

void realm_domain_free(realm_domain_t *realm_domain);

realm_domain_t *realm_domain_parseFromJSON(cJSON *realm_domainJSON);

cJSON *realm_domain_convertToJSON(realm_domain_t *realm_domain);

#endif /* _realm_domain_H_ */

