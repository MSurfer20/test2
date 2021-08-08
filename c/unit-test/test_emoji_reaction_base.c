#ifndef emoji_reaction_base_TEST
#define emoji_reaction_base_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define emoji_reaction_base_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/emoji_reaction_base.h"
emoji_reaction_base_t* instantiate_emoji_reaction_base(int include_optional);

#include "test_emoji_reaction_base_all_of_user.c"


emoji_reaction_base_t* instantiate_emoji_reaction_base(int include_optional) {
  emoji_reaction_base_t* emoji_reaction_base = NULL;
  if (include_optional) {
    emoji_reaction_base = emoji_reaction_base_create(
      "0",
      "0",
      "0",
      56,
       // false, not to have infinite recursion
      instantiate_emoji_reaction_base_all_of_user(0)
    );
  } else {
    emoji_reaction_base = emoji_reaction_base_create(
      "0",
      "0",
      "0",
      56,
      NULL
    );
  }

  return emoji_reaction_base;
}


#ifdef emoji_reaction_base_MAIN

void test_emoji_reaction_base(int include_optional) {
    emoji_reaction_base_t* emoji_reaction_base_1 = instantiate_emoji_reaction_base(include_optional);

	cJSON* jsonemoji_reaction_base_1 = emoji_reaction_base_convertToJSON(emoji_reaction_base_1);
	printf("emoji_reaction_base :\n%s\n", cJSON_Print(jsonemoji_reaction_base_1));
	emoji_reaction_base_t* emoji_reaction_base_2 = emoji_reaction_base_parseFromJSON(jsonemoji_reaction_base_1);
	cJSON* jsonemoji_reaction_base_2 = emoji_reaction_base_convertToJSON(emoji_reaction_base_2);
	printf("repeating emoji_reaction_base:\n%s\n", cJSON_Print(jsonemoji_reaction_base_2));
}

int main() {
  test_emoji_reaction_base(1);
  test_emoji_reaction_base(0);

  printf("Hello world \n");
  return 0;
}

#endif // emoji_reaction_base_MAIN
#endif // emoji_reaction_base_TEST
