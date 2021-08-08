#ifndef basic_bot_TEST
#define basic_bot_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define basic_bot_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/basic_bot.h"
basic_bot_t* instantiate_basic_bot(int include_optional);



basic_bot_t* instantiate_basic_bot(int include_optional) {
  basic_bot_t* basic_bot = NULL;
  if (include_optional) {
    basic_bot = basic_bot_create(
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
    basic_bot = basic_bot_create(
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

  return basic_bot;
}


#ifdef basic_bot_MAIN

void test_basic_bot(int include_optional) {
    basic_bot_t* basic_bot_1 = instantiate_basic_bot(include_optional);

	cJSON* jsonbasic_bot_1 = basic_bot_convertToJSON(basic_bot_1);
	printf("basic_bot :\n%s\n", cJSON_Print(jsonbasic_bot_1));
	basic_bot_t* basic_bot_2 = basic_bot_parseFromJSON(jsonbasic_bot_1);
	cJSON* jsonbasic_bot_2 = basic_bot_convertToJSON(basic_bot_2);
	printf("repeating basic_bot:\n%s\n", cJSON_Print(jsonbasic_bot_2));
}

int main() {
  test_basic_bot(1);
  test_basic_bot(0);

  printf("Hello world \n");
  return 0;
}

#endif // basic_bot_MAIN
#endif // basic_bot_TEST
