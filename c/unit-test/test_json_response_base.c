#ifndef json_response_base_TEST
#define json_response_base_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define json_response_base_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/json_response_base.h"
json_response_base_t* instantiate_json_response_base(int include_optional);



json_response_base_t* instantiate_json_response_base(int include_optional) {
  json_response_base_t* json_response_base = NULL;
  if (include_optional) {
    json_response_base = json_response_base_create(
      "0"
    );
  } else {
    json_response_base = json_response_base_create(
      "0"
    );
  }

  return json_response_base;
}


#ifdef json_response_base_MAIN

void test_json_response_base(int include_optional) {
    json_response_base_t* json_response_base_1 = instantiate_json_response_base(include_optional);

	cJSON* jsonjson_response_base_1 = json_response_base_convertToJSON(json_response_base_1);
	printf("json_response_base :\n%s\n", cJSON_Print(jsonjson_response_base_1));
	json_response_base_t* json_response_base_2 = json_response_base_parseFromJSON(jsonjson_response_base_1);
	cJSON* jsonjson_response_base_2 = json_response_base_convertToJSON(json_response_base_2);
	printf("repeating json_response_base:\n%s\n", cJSON_Print(jsonjson_response_base_2));
}

int main() {
  test_json_response_base(1);
  test_json_response_base(0);

  printf("Hello world \n");
  return 0;
}

#endif // json_response_base_MAIN
#endif // json_response_base_TEST
