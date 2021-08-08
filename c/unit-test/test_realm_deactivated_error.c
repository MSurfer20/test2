#ifndef realm_deactivated_error_TEST
#define realm_deactivated_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realm_deactivated_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realm_deactivated_error.h"
realm_deactivated_error_t* instantiate_realm_deactivated_error(int include_optional);



realm_deactivated_error_t* instantiate_realm_deactivated_error(int include_optional) {
  realm_deactivated_error_t* realm_deactivated_error = NULL;
  if (include_optional) {
    realm_deactivated_error = realm_deactivated_error_create(
      null,
      null,
      null
    );
  } else {
    realm_deactivated_error = realm_deactivated_error_create(
      null,
      null,
      null
    );
  }

  return realm_deactivated_error;
}


#ifdef realm_deactivated_error_MAIN

void test_realm_deactivated_error(int include_optional) {
    realm_deactivated_error_t* realm_deactivated_error_1 = instantiate_realm_deactivated_error(include_optional);

	cJSON* jsonrealm_deactivated_error_1 = realm_deactivated_error_convertToJSON(realm_deactivated_error_1);
	printf("realm_deactivated_error :\n%s\n", cJSON_Print(jsonrealm_deactivated_error_1));
	realm_deactivated_error_t* realm_deactivated_error_2 = realm_deactivated_error_parseFromJSON(jsonrealm_deactivated_error_1);
	cJSON* jsonrealm_deactivated_error_2 = realm_deactivated_error_convertToJSON(realm_deactivated_error_2);
	printf("repeating realm_deactivated_error:\n%s\n", cJSON_Print(jsonrealm_deactivated_error_2));
}

int main() {
  test_realm_deactivated_error(1);
  test_realm_deactivated_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // realm_deactivated_error_MAIN
#endif // realm_deactivated_error_TEST
