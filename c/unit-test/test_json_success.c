#ifndef json_success_TEST
#define json_success_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define json_success_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/json_success.h"
json_success_t* instantiate_json_success(int include_optional);



json_success_t* instantiate_json_success(int include_optional) {
  json_success_t* json_success = NULL;
  if (include_optional) {
    json_success = json_success_create(
      null,
      null
    );
  } else {
    json_success = json_success_create(
      null,
      null
    );
  }

  return json_success;
}


#ifdef json_success_MAIN

void test_json_success(int include_optional) {
    json_success_t* json_success_1 = instantiate_json_success(include_optional);

	cJSON* jsonjson_success_1 = json_success_convertToJSON(json_success_1);
	printf("json_success :\n%s\n", cJSON_Print(jsonjson_success_1));
	json_success_t* json_success_2 = json_success_parseFromJSON(jsonjson_success_1);
	cJSON* jsonjson_success_2 = json_success_convertToJSON(json_success_2);
	printf("repeating json_success:\n%s\n", cJSON_Print(jsonjson_success_2));
}

int main() {
  test_json_success(1);
  test_json_success(0);

  printf("Hello world \n");
  return 0;
}

#endif // json_success_MAIN
#endif // json_success_TEST
