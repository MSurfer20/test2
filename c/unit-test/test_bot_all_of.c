#ifndef bot_all_of_TEST
#define bot_all_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define bot_all_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/bot_all_of.h"
bot_all_of_t* instantiate_bot_all_of(int include_optional);



bot_all_of_t* instantiate_bot_all_of(int include_optional) {
  bot_all_of_t* bot_all_of = NULL;
  if (include_optional) {
    bot_all_of = bot_all_of_create(
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      "0",
      56,
      1
    );
  } else {
    bot_all_of = bot_all_of_create(
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      "0",
      56,
      1
    );
  }

  return bot_all_of;
}


#ifdef bot_all_of_MAIN

void test_bot_all_of(int include_optional) {
    bot_all_of_t* bot_all_of_1 = instantiate_bot_all_of(include_optional);

	cJSON* jsonbot_all_of_1 = bot_all_of_convertToJSON(bot_all_of_1);
	printf("bot_all_of :\n%s\n", cJSON_Print(jsonbot_all_of_1));
	bot_all_of_t* bot_all_of_2 = bot_all_of_parseFromJSON(jsonbot_all_of_1);
	cJSON* jsonbot_all_of_2 = bot_all_of_convertToJSON(bot_all_of_2);
	printf("repeating bot_all_of:\n%s\n", cJSON_Print(jsonbot_all_of_2));
}

int main() {
  test_bot_all_of(1);
  test_bot_all_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // bot_all_of_MAIN
#endif // bot_all_of_TEST
