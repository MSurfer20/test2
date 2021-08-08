#ifndef bad_event_queue_id_error_all_of_TEST
#define bad_event_queue_id_error_all_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define bad_event_queue_id_error_all_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/bad_event_queue_id_error_all_of.h"
bad_event_queue_id_error_all_of_t* instantiate_bad_event_queue_id_error_all_of(int include_optional);



bad_event_queue_id_error_all_of_t* instantiate_bad_event_queue_id_error_all_of(int include_optional) {
  bad_event_queue_id_error_all_of_t* bad_event_queue_id_error_all_of = NULL;
  if (include_optional) {
    bad_event_queue_id_error_all_of = bad_event_queue_id_error_all_of_create(
      null,
      null,
      null,
      "0"
    );
  } else {
    bad_event_queue_id_error_all_of = bad_event_queue_id_error_all_of_create(
      null,
      null,
      null,
      "0"
    );
  }

  return bad_event_queue_id_error_all_of;
}


#ifdef bad_event_queue_id_error_all_of_MAIN

void test_bad_event_queue_id_error_all_of(int include_optional) {
    bad_event_queue_id_error_all_of_t* bad_event_queue_id_error_all_of_1 = instantiate_bad_event_queue_id_error_all_of(include_optional);

	cJSON* jsonbad_event_queue_id_error_all_of_1 = bad_event_queue_id_error_all_of_convertToJSON(bad_event_queue_id_error_all_of_1);
	printf("bad_event_queue_id_error_all_of :\n%s\n", cJSON_Print(jsonbad_event_queue_id_error_all_of_1));
	bad_event_queue_id_error_all_of_t* bad_event_queue_id_error_all_of_2 = bad_event_queue_id_error_all_of_parseFromJSON(jsonbad_event_queue_id_error_all_of_1);
	cJSON* jsonbad_event_queue_id_error_all_of_2 = bad_event_queue_id_error_all_of_convertToJSON(bad_event_queue_id_error_all_of_2);
	printf("repeating bad_event_queue_id_error_all_of:\n%s\n", cJSON_Print(jsonbad_event_queue_id_error_all_of_2));
}

int main() {
  test_bad_event_queue_id_error_all_of(1);
  test_bad_event_queue_id_error_all_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // bad_event_queue_id_error_all_of_MAIN
#endif // bad_event_queue_id_error_all_of_TEST
