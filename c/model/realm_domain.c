#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realm_domain.h"



realm_domain_t *realm_domain_create(
    char *domain,
    int allow_subdomains
    ) {
    realm_domain_t *realm_domain_local_var = malloc(sizeof(realm_domain_t));
    if (!realm_domain_local_var) {
        return NULL;
    }
    realm_domain_local_var->domain = domain;
    realm_domain_local_var->allow_subdomains = allow_subdomains;

    return realm_domain_local_var;
}


void realm_domain_free(realm_domain_t *realm_domain) {
    if(NULL == realm_domain){
        return ;
    }
    listEntry_t *listEntry;
    if (realm_domain->domain) {
        free(realm_domain->domain);
        realm_domain->domain = NULL;
    }
    free(realm_domain);
}

cJSON *realm_domain_convertToJSON(realm_domain_t *realm_domain) {
    cJSON *item = cJSON_CreateObject();

    // realm_domain->domain
    if(realm_domain->domain) { 
    if(cJSON_AddStringToObject(item, "domain", realm_domain->domain) == NULL) {
    goto fail; //String
    }
     } 


    // realm_domain->allow_subdomains
    if(realm_domain->allow_subdomains) { 
    if(cJSON_AddBoolToObject(item, "allow_subdomains", realm_domain->allow_subdomains) == NULL) {
    goto fail; //Bool
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realm_domain_t *realm_domain_parseFromJSON(cJSON *realm_domainJSON){

    realm_domain_t *realm_domain_local_var = NULL;

    // realm_domain->domain
    cJSON *domain = cJSON_GetObjectItemCaseSensitive(realm_domainJSON, "domain");
    if (domain) { 
    if(!cJSON_IsString(domain))
    {
    goto end; //String
    }
    }

    // realm_domain->allow_subdomains
    cJSON *allow_subdomains = cJSON_GetObjectItemCaseSensitive(realm_domainJSON, "allow_subdomains");
    if (allow_subdomains) { 
    if(!cJSON_IsBool(allow_subdomains))
    {
    goto end; //Bool
    }
    }


    realm_domain_local_var = realm_domain_create (
        domain ? strdup(domain->valuestring) : NULL,
        allow_subdomains ? allow_subdomains->valueint : 0
        );

    return realm_domain_local_var;
end:
    return NULL;

}
