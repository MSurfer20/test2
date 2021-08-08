#ifndef api_key_response_all_of_TEST
#define api_key_response_all_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define api_key_response_all_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/api_key_response_all_of.h"
api_key_response_all_of_t* instantiate_api_key_response_all_of(int include_optional);



api_key_response_all_of_t* instantiate_api_key_response_all_of(int include_optional) {
  api_key_response_all_of_t* api_key_response_all_of = NULL;
  if (include_optional) {
    api_key_response_all_of = api_key_response_all_of_create(
      null,
      null,
      "0",
      "0"
    );
  } else {
    api_key_response_all_of = api_key_response_all_of_create(
      null,
      null,
      "0",
      "0"
    );
  }

  return api_key_response_all_of;
}


#ifdef api_key_response_all_of_MAIN

void test_api_key_response_all_of(int include_optional) {
    api_key_response_all_of_t* api_key_response_all_of_1 = instantiate_api_key_response_all_of(include_optional);

	cJSON* jsonapi_key_response_all_of_1 = api_key_response_all_of_convertToJSON(api_key_response_all_of_1);
	printf("api_key_response_all_of :\n%s\n", cJSON_Print(jsonapi_key_response_all_of_1));
	api_key_response_all_of_t* api_key_response_all_of_2 = api_key_response_all_of_parseFromJSON(jsonapi_key_response_all_of_1);
	cJSON* jsonapi_key_response_all_of_2 = api_key_response_all_of_convertToJSON(api_key_response_all_of_2);
	printf("repeating api_key_response_all_of:\n%s\n", cJSON_Print(jsonapi_key_response_all_of_2));
}

int main() {
  test_api_key_response_all_of(1);
  test_api_key_response_all_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // api_key_response_all_of_MAIN
#endif // api_key_response_all_of_TEST
