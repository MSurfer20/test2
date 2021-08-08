#ifndef json_error_TEST
#define json_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define json_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/json_error.h"
json_error_t* instantiate_json_error(int include_optional);



json_error_t* instantiate_json_error(int include_optional) {
  json_error_t* json_error = NULL;
  if (include_optional) {
    json_error = json_error_create(
      null,
      null
    );
  } else {
    json_error = json_error_create(
      null,
      null
    );
  }

  return json_error;
}


#ifdef json_error_MAIN

void test_json_error(int include_optional) {
    json_error_t* json_error_1 = instantiate_json_error(include_optional);

	cJSON* jsonjson_error_1 = json_error_convertToJSON(json_error_1);
	printf("json_error :\n%s\n", cJSON_Print(jsonjson_error_1));
	json_error_t* json_error_2 = json_error_parseFromJSON(jsonjson_error_1);
	cJSON* jsonjson_error_2 = json_error_convertToJSON(json_error_2);
	printf("repeating json_error:\n%s\n", cJSON_Print(jsonjson_error_2));
}

int main() {
  test_json_error(1);
  test_json_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // json_error_MAIN
#endif // json_error_TEST
