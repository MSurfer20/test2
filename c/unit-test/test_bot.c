#ifndef bot_TEST
#define bot_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define bot_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/bot.h"
bot_t* instantiate_bot(int include_optional);



bot_t* instantiate_bot(int include_optional) {
  bot_t* bot = NULL;
  if (include_optional) {
    bot = bot_create(
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
    bot = bot_create(
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

  return bot;
}


#ifdef bot_MAIN

void test_bot(int include_optional) {
    bot_t* bot_1 = instantiate_bot(include_optional);

	cJSON* jsonbot_1 = bot_convertToJSON(bot_1);
	printf("bot :\n%s\n", cJSON_Print(jsonbot_1));
	bot_t* bot_2 = bot_parseFromJSON(jsonbot_1);
	cJSON* jsonbot_2 = bot_convertToJSON(bot_2);
	printf("repeating bot:\n%s\n", cJSON_Print(jsonbot_2));
}

int main() {
  test_bot(1);
  test_bot(0);

  printf("Hello world \n");
  return 0;
}

#endif // bot_MAIN
#endif // bot_TEST
