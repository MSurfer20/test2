#ifndef realm_domain_TEST
#define realm_domain_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realm_domain_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realm_domain.h"
realm_domain_t* instantiate_realm_domain(int include_optional);



realm_domain_t* instantiate_realm_domain(int include_optional) {
  realm_domain_t* realm_domain = NULL;
  if (include_optional) {
    realm_domain = realm_domain_create(
      "0",
      1
    );
  } else {
    realm_domain = realm_domain_create(
      "0",
      1
    );
  }

  return realm_domain;
}


#ifdef realm_domain_MAIN

void test_realm_domain(int include_optional) {
    realm_domain_t* realm_domain_1 = instantiate_realm_domain(include_optional);

	cJSON* jsonrealm_domain_1 = realm_domain_convertToJSON(realm_domain_1);
	printf("realm_domain :\n%s\n", cJSON_Print(jsonrealm_domain_1));
	realm_domain_t* realm_domain_2 = realm_domain_parseFromJSON(jsonrealm_domain_1);
	cJSON* jsonrealm_domain_2 = realm_domain_convertToJSON(realm_domain_2);
	printf("repeating realm_domain:\n%s\n", cJSON_Print(jsonrealm_domain_2));
}

int main() {
  test_realm_domain(1);
  test_realm_domain(0);

  printf("Hello world \n");
  return 0;
}

#endif // realm_domain_MAIN
#endif // realm_domain_TEST
