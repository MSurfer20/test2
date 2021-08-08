#ifndef emoji_reaction_all_of_TEST
#define emoji_reaction_all_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define emoji_reaction_all_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/emoji_reaction_all_of.h"
emoji_reaction_all_of_t* instantiate_emoji_reaction_all_of(int include_optional);



emoji_reaction_all_of_t* instantiate_emoji_reaction_all_of(int include_optional) {
  emoji_reaction_all_of_t* emoji_reaction_all_of = NULL;
  if (include_optional) {
    emoji_reaction_all_of = emoji_reaction_all_of_create(
      null,
      null,
      null,
      null,
      null
    );
  } else {
    emoji_reaction_all_of = emoji_reaction_all_of_create(
      null,
      null,
      null,
      null,
      null
    );
  }

  return emoji_reaction_all_of;
}


#ifdef emoji_reaction_all_of_MAIN

void test_emoji_reaction_all_of(int include_optional) {
    emoji_reaction_all_of_t* emoji_reaction_all_of_1 = instantiate_emoji_reaction_all_of(include_optional);

	cJSON* jsonemoji_reaction_all_of_1 = emoji_reaction_all_of_convertToJSON(emoji_reaction_all_of_1);
	printf("emoji_reaction_all_of :\n%s\n", cJSON_Print(jsonemoji_reaction_all_of_1));
	emoji_reaction_all_of_t* emoji_reaction_all_of_2 = emoji_reaction_all_of_parseFromJSON(jsonemoji_reaction_all_of_1);
	cJSON* jsonemoji_reaction_all_of_2 = emoji_reaction_all_of_convertToJSON(emoji_reaction_all_of_2);
	printf("repeating emoji_reaction_all_of:\n%s\n", cJSON_Print(jsonemoji_reaction_all_of_2));
}

int main() {
  test_emoji_reaction_all_of(1);
  test_emoji_reaction_all_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // emoji_reaction_all_of_MAIN
#endif // emoji_reaction_all_of_TEST
