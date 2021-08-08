
#include "InvalidMessageError_allOf.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"





void test_InvalidMessageError_allOf_raw_content_is_assigned_from_json()
{


    bourne::json input = 
    {
        "raw_content", "hello"
    };

    InvalidMessageError_allOf obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRawContent().c_str());






}





void test_InvalidMessageError_allOf_raw_content_is_converted_to_json()
{

    bourne::json input = 
    {
        "raw_content", "hello"
    };

    InvalidMessageError_allOf obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["raw_content"] == output["raw_content"]);



}


