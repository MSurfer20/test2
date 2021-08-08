#ifndef inline_response_200_TEST
#define inline_response_200_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define inline_response_200_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/inline_response_200.h"
inline_response_200_t* instantiate_inline_response_200(int include_optional);

#include "test_messages_base.c"


inline_response_200_t* instantiate_inline_response_200(int include_optional) {
  inline_response_200_t* inline_response_200 = NULL;
  if (include_optional) {
    inline_response_200 = inline_response_200_create(
      "0",
      "0",
      "0",
      "0",
      "0",
      null
    );
  } else {
    inline_response_200 = inline_response_200_create(
      "0",
      "0",
      "0",
      "0",
      "0",
      null
    );
  }

  return inline_response_200;
}


#ifdef inline_response_200_MAIN

void test_inline_response_200(int include_optional) {
    inline_response_200_t* inline_response_200_1 = instantiate_inline_response_200(include_optional);

	cJSON* jsoninline_response_200_1 = inline_response_200_convertToJSON(inline_response_200_1);
	printf("inline_response_200 :\n%s\n", cJSON_Print(jsoninline_response_200_1));
	inline_response_200_t* inline_response_200_2 = inline_response_200_parseFromJSON(jsoninline_response_200_1);
	cJSON* jsoninline_response_200_2 = inline_response_200_convertToJSON(inline_response_200_2);
	printf("repeating inline_response_200:\n%s\n", cJSON_Print(jsoninline_response_200_2));
}

int main() {
  test_inline_response_200(1);
  test_inline_response_200(0);

  printf("Hello world \n");
  return 0;
}

#endif // inline_response_200_MAIN
#endif // inline_response_200_TEST
