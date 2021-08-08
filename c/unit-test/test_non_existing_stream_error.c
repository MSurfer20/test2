#ifndef non_existing_stream_error_TEST
#define non_existing_stream_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define non_existing_stream_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/non_existing_stream_error.h"
non_existing_stream_error_t* instantiate_non_existing_stream_error(int include_optional);



non_existing_stream_error_t* instantiate_non_existing_stream_error(int include_optional) {
  non_existing_stream_error_t* non_existing_stream_error = NULL;
  if (include_optional) {
    non_existing_stream_error = non_existing_stream_error_create(
      null,
      null,
      null,
      "0"
    );
  } else {
    non_existing_stream_error = non_existing_stream_error_create(
      null,
      null,
      null,
      "0"
    );
  }

  return non_existing_stream_error;
}


#ifdef non_existing_stream_error_MAIN

void test_non_existing_stream_error(int include_optional) {
    non_existing_stream_error_t* non_existing_stream_error_1 = instantiate_non_existing_stream_error(include_optional);

	cJSON* jsonnon_existing_stream_error_1 = non_existing_stream_error_convertToJSON(non_existing_stream_error_1);
	printf("non_existing_stream_error :\n%s\n", cJSON_Print(jsonnon_existing_stream_error_1));
	non_existing_stream_error_t* non_existing_stream_error_2 = non_existing_stream_error_parseFromJSON(jsonnon_existing_stream_error_1);
	cJSON* jsonnon_existing_stream_error_2 = non_existing_stream_error_convertToJSON(non_existing_stream_error_2);
	printf("repeating non_existing_stream_error:\n%s\n", cJSON_Print(jsonnon_existing_stream_error_2));
}

int main() {
  test_non_existing_stream_error(1);
  test_non_existing_stream_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // non_existing_stream_error_MAIN
#endif // non_existing_stream_error_TEST
