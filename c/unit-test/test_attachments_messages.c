#ifndef attachments_messages_TEST
#define attachments_messages_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define attachments_messages_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/attachments_messages.h"
attachments_messages_t* instantiate_attachments_messages(int include_optional);



attachments_messages_t* instantiate_attachments_messages(int include_optional) {
  attachments_messages_t* attachments_messages = NULL;
  if (include_optional) {
    attachments_messages = attachments_messages_create(
      56,
      56
    );
  } else {
    attachments_messages = attachments_messages_create(
      56,
      56
    );
  }

  return attachments_messages;
}


#ifdef attachments_messages_MAIN

void test_attachments_messages(int include_optional) {
    attachments_messages_t* attachments_messages_1 = instantiate_attachments_messages(include_optional);

	cJSON* jsonattachments_messages_1 = attachments_messages_convertToJSON(attachments_messages_1);
	printf("attachments_messages :\n%s\n", cJSON_Print(jsonattachments_messages_1));
	attachments_messages_t* attachments_messages_2 = attachments_messages_parseFromJSON(jsonattachments_messages_1);
	cJSON* jsonattachments_messages_2 = attachments_messages_convertToJSON(attachments_messages_2);
	printf("repeating attachments_messages:\n%s\n", cJSON_Print(jsonattachments_messages_2));
}

int main() {
  test_attachments_messages(1);
  test_attachments_messages(0);

  printf("Hello world \n");
  return 0;
}

#endif // attachments_messages_MAIN
#endif // attachments_messages_TEST
