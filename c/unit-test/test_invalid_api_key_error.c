#ifndef invalid_api_key_error_TEST
#define invalid_api_key_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define invalid_api_key_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/invalid_api_key_error.h"
invalid_api_key_error_t* instantiate_invalid_api_key_error(int include_optional);



invalid_api_key_error_t* instantiate_invalid_api_key_error(int include_optional) {
  invalid_api_key_error_t* invalid_api_key_error = NULL;
  if (include_optional) {
    invalid_api_key_error = invalid_api_key_error_create(
      null,
      null
    );
  } else {
    invalid_api_key_error = invalid_api_key_error_create(
      null,
      null
    );
  }

  return invalid_api_key_error;
}


#ifdef invalid_api_key_error_MAIN

void test_invalid_api_key_error(int include_optional) {
    invalid_api_key_error_t* invalid_api_key_error_1 = instantiate_invalid_api_key_error(include_optional);

	cJSON* jsoninvalid_api_key_error_1 = invalid_api_key_error_convertToJSON(invalid_api_key_error_1);
	printf("invalid_api_key_error :\n%s\n", cJSON_Print(jsoninvalid_api_key_error_1));
	invalid_api_key_error_t* invalid_api_key_error_2 = invalid_api_key_error_parseFromJSON(jsoninvalid_api_key_error_1);
	cJSON* jsoninvalid_api_key_error_2 = invalid_api_key_error_convertToJSON(invalid_api_key_error_2);
	printf("repeating invalid_api_key_error:\n%s\n", cJSON_Print(jsoninvalid_api_key_error_2));
}

int main() {
  test_invalid_api_key_error(1);
  test_invalid_api_key_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // invalid_api_key_error_MAIN
#endif // invalid_api_key_error_TEST
