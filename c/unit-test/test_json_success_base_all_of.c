#ifndef json_success_base_all_of_TEST
#define json_success_base_all_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define json_success_base_all_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/json_success_base_all_of.h"
json_success_base_all_of_t* instantiate_json_success_base_all_of(int include_optional);



json_success_base_all_of_t* instantiate_json_success_base_all_of(int include_optional) {
  json_success_base_all_of_t* json_success_base_all_of = NULL;
  if (include_optional) {
    json_success_base_all_of = json_success_base_all_of_create(
      zulip_rest_api_json_success_base_all_of_RESULT_success,
      "0"
    );
  } else {
    json_success_base_all_of = json_success_base_all_of_create(
      zulip_rest_api_json_success_base_all_of_RESULT_success,
      "0"
    );
  }

  return json_success_base_all_of;
}


#ifdef json_success_base_all_of_MAIN

void test_json_success_base_all_of(int include_optional) {
    json_success_base_all_of_t* json_success_base_all_of_1 = instantiate_json_success_base_all_of(include_optional);

	cJSON* jsonjson_success_base_all_of_1 = json_success_base_all_of_convertToJSON(json_success_base_all_of_1);
	printf("json_success_base_all_of :\n%s\n", cJSON_Print(jsonjson_success_base_all_of_1));
	json_success_base_all_of_t* json_success_base_all_of_2 = json_success_base_all_of_parseFromJSON(jsonjson_success_base_all_of_1);
	cJSON* jsonjson_success_base_all_of_2 = json_success_base_all_of_convertToJSON(json_success_base_all_of_2);
	printf("repeating json_success_base_all_of:\n%s\n", cJSON_Print(jsonjson_success_base_all_of_2));
}

int main() {
  test_json_success_base_all_of(1);
  test_json_success_base_all_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // json_success_base_all_of_MAIN
#endif // json_success_base_all_of_TEST
