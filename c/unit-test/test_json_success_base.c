#ifndef json_success_base_TEST
#define json_success_base_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define json_success_base_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/json_success_base.h"
json_success_base_t* instantiate_json_success_base(int include_optional);



json_success_base_t* instantiate_json_success_base(int include_optional) {
  json_success_base_t* json_success_base = NULL;
  if (include_optional) {
    json_success_base = json_success_base_create(
      zulip_rest_api_json_success_base_RESULT_success,
      "0"
    );
  } else {
    json_success_base = json_success_base_create(
      zulip_rest_api_json_success_base_RESULT_success,
      "0"
    );
  }

  return json_success_base;
}


#ifdef json_success_base_MAIN

void test_json_success_base(int include_optional) {
    json_success_base_t* json_success_base_1 = instantiate_json_success_base(include_optional);

	cJSON* jsonjson_success_base_1 = json_success_base_convertToJSON(json_success_base_1);
	printf("json_success_base :\n%s\n", cJSON_Print(jsonjson_success_base_1));
	json_success_base_t* json_success_base_2 = json_success_base_parseFromJSON(jsonjson_success_base_1);
	cJSON* jsonjson_success_base_2 = json_success_base_convertToJSON(json_success_base_2);
	printf("repeating json_success_base:\n%s\n", cJSON_Print(jsonjson_success_base_2));
}

int main() {
  test_json_success_base(1);
  test_json_success_base(0);

  printf("Hello world \n");
  return 0;
}

#endif // json_success_base_MAIN
#endif // json_success_base_TEST
