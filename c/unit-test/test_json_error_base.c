#ifndef json_error_base_TEST
#define json_error_base_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define json_error_base_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/json_error_base.h"
json_error_base_t* instantiate_json_error_base(int include_optional);



json_error_base_t* instantiate_json_error_base(int include_optional) {
  json_error_base_t* json_error_base = NULL;
  if (include_optional) {
    json_error_base = json_error_base_create(
      zulip_rest_api_json_error_base_RESULT_error,
      "0"
    );
  } else {
    json_error_base = json_error_base_create(
      zulip_rest_api_json_error_base_RESULT_error,
      "0"
    );
  }

  return json_error_base;
}


#ifdef json_error_base_MAIN

void test_json_error_base(int include_optional) {
    json_error_base_t* json_error_base_1 = instantiate_json_error_base(include_optional);

	cJSON* jsonjson_error_base_1 = json_error_base_convertToJSON(json_error_base_1);
	printf("json_error_base :\n%s\n", cJSON_Print(jsonjson_error_base_1));
	json_error_base_t* json_error_base_2 = json_error_base_parseFromJSON(jsonjson_error_base_1);
	cJSON* jsonjson_error_base_2 = json_error_base_convertToJSON(json_error_base_2);
	printf("repeating json_error_base:\n%s\n", cJSON_Print(jsonjson_error_base_2));
}

int main() {
  test_json_error_base(1);
  test_json_error_base(0);

  printf("Hello world \n");
  return 0;
}

#endif // json_error_base_MAIN
#endif // json_error_base_TEST
