#ifndef realm_playground_TEST
#define realm_playground_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realm_playground_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realm_playground.h"
realm_playground_t* instantiate_realm_playground(int include_optional);



realm_playground_t* instantiate_realm_playground(int include_optional) {
  realm_playground_t* realm_playground = NULL;
  if (include_optional) {
    realm_playground = realm_playground_create(
      56,
      "0",
      "0",
      "0"
    );
  } else {
    realm_playground = realm_playground_create(
      56,
      "0",
      "0",
      "0"
    );
  }

  return realm_playground;
}


#ifdef realm_playground_MAIN

void test_realm_playground(int include_optional) {
    realm_playground_t* realm_playground_1 = instantiate_realm_playground(include_optional);

	cJSON* jsonrealm_playground_1 = realm_playground_convertToJSON(realm_playground_1);
	printf("realm_playground :\n%s\n", cJSON_Print(jsonrealm_playground_1));
	realm_playground_t* realm_playground_2 = realm_playground_parseFromJSON(jsonrealm_playground_1);
	cJSON* jsonrealm_playground_2 = realm_playground_convertToJSON(realm_playground_2);
	printf("repeating realm_playground:\n%s\n", cJSON_Print(jsonrealm_playground_2));
}

int main() {
  test_realm_playground(1);
  test_realm_playground(0);

  printf("Hello world \n");
  return 0;
}

#endif // realm_playground_MAIN
#endif // realm_playground_TEST
