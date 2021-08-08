#ifndef realm_export_TEST
#define realm_export_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realm_export_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realm_export.h"
realm_export_t* instantiate_realm_export(int include_optional);



realm_export_t* instantiate_realm_export(int include_optional) {
  realm_export_t* realm_export = NULL;
  if (include_optional) {
    realm_export = realm_export_create(
      56,
      56,
      1.337,
      1.337,
      1.337,
      "0",
      1
    );
  } else {
    realm_export = realm_export_create(
      56,
      56,
      1.337,
      1.337,
      1.337,
      "0",
      1
    );
  }

  return realm_export;
}


#ifdef realm_export_MAIN

void test_realm_export(int include_optional) {
    realm_export_t* realm_export_1 = instantiate_realm_export(include_optional);

	cJSON* jsonrealm_export_1 = realm_export_convertToJSON(realm_export_1);
	printf("realm_export :\n%s\n", cJSON_Print(jsonrealm_export_1));
	realm_export_t* realm_export_2 = realm_export_parseFromJSON(jsonrealm_export_1);
	cJSON* jsonrealm_export_2 = realm_export_convertToJSON(realm_export_2);
	printf("repeating realm_export:\n%s\n", cJSON_Print(jsonrealm_export_2));
}

int main() {
  test_realm_export(1);
  test_realm_export(0);

  printf("Hello world \n");
  return 0;
}

#endif // realm_export_MAIN
#endif // realm_export_TEST
