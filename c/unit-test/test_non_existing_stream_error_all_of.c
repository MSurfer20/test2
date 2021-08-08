#ifndef non_existing_stream_error_all_of_TEST
#define non_existing_stream_error_all_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define non_existing_stream_error_all_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/non_existing_stream_error_all_of.h"
non_existing_stream_error_all_of_t* instantiate_non_existing_stream_error_all_of(int include_optional);



non_existing_stream_error_all_of_t* instantiate_non_existing_stream_error_all_of(int include_optional) {
  non_existing_stream_error_all_of_t* non_existing_stream_error_all_of = NULL;
  if (include_optional) {
    non_existing_stream_error_all_of = non_existing_stream_error_all_of_create(
      null,
      null,
      null,
      "0"
    );
  } else {
    non_existing_stream_error_all_of = non_existing_stream_error_all_of_create(
      null,
      null,
      null,
      "0"
    );
  }

  return non_existing_stream_error_all_of;
}


#ifdef non_existing_stream_error_all_of_MAIN

void test_non_existing_stream_error_all_of(int include_optional) {
    non_existing_stream_error_all_of_t* non_existing_stream_error_all_of_1 = instantiate_non_existing_stream_error_all_of(include_optional);

	cJSON* jsonnon_existing_stream_error_all_of_1 = non_existing_stream_error_all_of_convertToJSON(non_existing_stream_error_all_of_1);
	printf("non_existing_stream_error_all_of :\n%s\n", cJSON_Print(jsonnon_existing_stream_error_all_of_1));
	non_existing_stream_error_all_of_t* non_existing_stream_error_all_of_2 = non_existing_stream_error_all_of_parseFromJSON(jsonnon_existing_stream_error_all_of_1);
	cJSON* jsonnon_existing_stream_error_all_of_2 = non_existing_stream_error_all_of_convertToJSON(non_existing_stream_error_all_of_2);
	printf("repeating non_existing_stream_error_all_of:\n%s\n", cJSON_Print(jsonnon_existing_stream_error_all_of_2));
}

int main() {
  test_non_existing_stream_error_all_of(1);
  test_non_existing_stream_error_all_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // non_existing_stream_error_all_of_MAIN
#endif // non_existing_stream_error_all_of_TEST
