#ifndef basic_stream_TEST
#define basic_stream_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define basic_stream_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/basic_stream.h"
basic_stream_t* instantiate_basic_stream(int include_optional);



basic_stream_t* instantiate_basic_stream(int include_optional) {
  basic_stream_t* basic_stream = NULL;
  if (include_optional) {
    basic_stream = basic_stream_create(
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null
    );
  } else {
    basic_stream = basic_stream_create(
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null
    );
  }

  return basic_stream;
}


#ifdef basic_stream_MAIN

void test_basic_stream(int include_optional) {
    basic_stream_t* basic_stream_1 = instantiate_basic_stream(include_optional);

	cJSON* jsonbasic_stream_1 = basic_stream_convertToJSON(basic_stream_1);
	printf("basic_stream :\n%s\n", cJSON_Print(jsonbasic_stream_1));
	basic_stream_t* basic_stream_2 = basic_stream_parseFromJSON(jsonbasic_stream_1);
	cJSON* jsonbasic_stream_2 = basic_stream_convertToJSON(basic_stream_2);
	printf("repeating basic_stream:\n%s\n", cJSON_Print(jsonbasic_stream_2));
}

int main() {
  test_basic_stream(1);
  test_basic_stream(0);

  printf("Hello world \n");
  return 0;
}

#endif // basic_stream_MAIN
#endif // basic_stream_TEST
