#ifndef basic_stream_base_TEST
#define basic_stream_base_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define basic_stream_base_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/basic_stream_base.h"
basic_stream_base_t* instantiate_basic_stream_base(int include_optional);



basic_stream_base_t* instantiate_basic_stream_base(int include_optional) {
  basic_stream_base_t* basic_stream_base = NULL;
  if (include_optional) {
    basic_stream_base = basic_stream_base_create(
      56,
      "0",
      "0",
      56,
      1,
      "0",
      1,
      56,
      56,
      1,
      56,
      1
    );
  } else {
    basic_stream_base = basic_stream_base_create(
      56,
      "0",
      "0",
      56,
      1,
      "0",
      1,
      56,
      56,
      1,
      56,
      1
    );
  }

  return basic_stream_base;
}


#ifdef basic_stream_base_MAIN

void test_basic_stream_base(int include_optional) {
    basic_stream_base_t* basic_stream_base_1 = instantiate_basic_stream_base(include_optional);

	cJSON* jsonbasic_stream_base_1 = basic_stream_base_convertToJSON(basic_stream_base_1);
	printf("basic_stream_base :\n%s\n", cJSON_Print(jsonbasic_stream_base_1));
	basic_stream_base_t* basic_stream_base_2 = basic_stream_base_parseFromJSON(jsonbasic_stream_base_1);
	cJSON* jsonbasic_stream_base_2 = basic_stream_base_convertToJSON(basic_stream_base_2);
	printf("repeating basic_stream_base:\n%s\n", cJSON_Print(jsonbasic_stream_base_2));
}

int main() {
  test_basic_stream_base(1);
  test_basic_stream_base(0);

  printf("Hello world \n");
  return 0;
}

#endif // basic_stream_base_MAIN
#endif // basic_stream_base_TEST
