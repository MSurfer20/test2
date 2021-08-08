#ifndef emoji_reaction_base_user_TEST
#define emoji_reaction_base_user_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define emoji_reaction_base_user_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/emoji_reaction_base_user.h"
emoji_reaction_base_user_t* instantiate_emoji_reaction_base_user(int include_optional);



emoji_reaction_base_user_t* instantiate_emoji_reaction_base_user(int include_optional) {
  emoji_reaction_base_user_t* emoji_reaction_base_user = NULL;
  if (include_optional) {
    emoji_reaction_base_user = emoji_reaction_base_user_create(
      56,
      "0",
      "0",
      1
    );
  } else {
    emoji_reaction_base_user = emoji_reaction_base_user_create(
      56,
      "0",
      "0",
      1
    );
  }

  return emoji_reaction_base_user;
}


#ifdef emoji_reaction_base_user_MAIN

void test_emoji_reaction_base_user(int include_optional) {
    emoji_reaction_base_user_t* emoji_reaction_base_user_1 = instantiate_emoji_reaction_base_user(include_optional);

	cJSON* jsonemoji_reaction_base_user_1 = emoji_reaction_base_user_convertToJSON(emoji_reaction_base_user_1);
	printf("emoji_reaction_base_user :\n%s\n", cJSON_Print(jsonemoji_reaction_base_user_1));
	emoji_reaction_base_user_t* emoji_reaction_base_user_2 = emoji_reaction_base_user_parseFromJSON(jsonemoji_reaction_base_user_1);
	cJSON* jsonemoji_reaction_base_user_2 = emoji_reaction_base_user_convertToJSON(emoji_reaction_base_user_2);
	printf("repeating emoji_reaction_base_user:\n%s\n", cJSON_Print(jsonemoji_reaction_base_user_2));
}

int main() {
  test_emoji_reaction_base_user(1);
  test_emoji_reaction_base_user(0);

  printf("Hello world \n");
  return 0;
}

#endif // emoji_reaction_base_user_MAIN
#endif // emoji_reaction_base_user_TEST
