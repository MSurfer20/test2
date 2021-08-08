
#include "JsonResponseBase.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_JsonResponseBase_result_is_assigned_from_json()
{


    bourne::json input = 
    {
        "result", "hello"
    };

    JsonResponseBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getResult().c_str());






}



void test_JsonResponseBase_result_is_converted_to_json()
{

    bourne::json input = 
    {
        "result", "hello"
    };

    JsonResponseBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["result"] == output["result"]);



}


