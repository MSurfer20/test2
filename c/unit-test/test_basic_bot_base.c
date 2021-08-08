#ifndef basic_bot_base_TEST
#define basic_bot_base_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define basic_bot_base_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/basic_bot_base.h"
basic_bot_base_t* instantiate_basic_bot_base(int include_optional);



basic_bot_base_t* instantiate_basic_bot_base(int include_optional) {
  basic_bot_base_t* basic_bot_base = NULL;
  if (include_optional) {
    basic_bot_base = basic_bot_base_create(
      56,
      "0",
      "0",
      "0",
      "0",
      1,
      "0",
      56,
      list_create()
    );
  } else {
    basic_bot_base = basic_bot_base_create(
      56,
      "0",
      "0",
      "0",
      "0",
      1,
      "0",
      56,
      list_create()
    );
  }

  return basic_bot_base;
}


#ifdef basic_bot_base_MAIN

void test_basic_bot_base(int include_optional) {
    basic_bot_base_t* basic_bot_base_1 = instantiate_basic_bot_base(include_optional);

	cJSON* jsonbasic_bot_base_1 = basic_bot_base_convertToJSON(basic_bot_base_1);
	printf("basic_bot_base :\n%s\n", cJSON_Print(jsonbasic_bot_base_1));
	basic_bot_base_t* basic_bot_base_2 = basic_bot_base_parseFromJSON(jsonbasic_bot_base_1);
	cJSON* jsonbasic_bot_base_2 = basic_bot_base_convertToJSON(basic_bot_base_2);
	printf("repeating basic_bot_base:\n%s\n", cJSON_Print(jsonbasic_bot_base_2));
}

int main() {
  test_basic_bot_base(1);
  test_basic_bot_base(0);

  printf("Hello world \n");
  return 0;
}

#endif // basic_bot_base_MAIN
#endif // basic_bot_base_TEST
