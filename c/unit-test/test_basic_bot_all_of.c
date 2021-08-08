#ifndef basic_bot_all_of_TEST
#define basic_bot_all_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define basic_bot_all_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/basic_bot_all_of.h"
basic_bot_all_of_t* instantiate_basic_bot_all_of(int include_optional);



basic_bot_all_of_t* instantiate_basic_bot_all_of(int include_optional) {
  basic_bot_all_of_t* basic_bot_all_of = NULL;
  if (include_optional) {
    basic_bot_all_of = basic_bot_all_of_create(
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
    basic_bot_all_of = basic_bot_all_of_create(
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

  return basic_bot_all_of;
}


#ifdef basic_bot_all_of_MAIN

void test_basic_bot_all_of(int include_optional) {
    basic_bot_all_of_t* basic_bot_all_of_1 = instantiate_basic_bot_all_of(include_optional);

	cJSON* jsonbasic_bot_all_of_1 = basic_bot_all_of_convertToJSON(basic_bot_all_of_1);
	printf("basic_bot_all_of :\n%s\n", cJSON_Print(jsonbasic_bot_all_of_1));
	basic_bot_all_of_t* basic_bot_all_of_2 = basic_bot_all_of_parseFromJSON(jsonbasic_bot_all_of_1);
	cJSON* jsonbasic_bot_all_of_2 = basic_bot_all_of_convertToJSON(basic_bot_all_of_2);
	printf("repeating basic_bot_all_of:\n%s\n", cJSON_Print(jsonbasic_bot_all_of_2));
}

int main() {
  test_basic_bot_all_of(1);
  test_basic_bot_all_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // basic_bot_all_of_MAIN
#endif // basic_bot_all_of_TEST
