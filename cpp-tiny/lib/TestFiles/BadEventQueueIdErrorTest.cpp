
#include "BadEventQueueIdError.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"






void test_BadEventQueueIdError_queue_id_is_assigned_from_json()
{


    bourne::json input = 
    {
        "queue_id", "hello"
    };

    BadEventQueueIdError obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getQueueId().c_str());






}






void test_BadEventQueueIdError_queue_id_is_converted_to_json()
{

    bourne::json input = 
    {
        "queue_id", "hello"
    };

    BadEventQueueIdError obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["queue_id"] == output["queue_id"]);



}


