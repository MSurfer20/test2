
#include "CodedErrorBase_allOf.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"





void test_CodedErrorBase_allOf_code_is_assigned_from_json()
{


    bourne::json input = 
    {
        "code", "hello"
    };

    CodedErrorBase_allOf obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCode().c_str());






}





void test_CodedErrorBase_allOf_code_is_converted_to_json()
{

    bourne::json input = 
    {
        "code", "hello"
    };

    CodedErrorBase_allOf obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["code"] == output["code"]);



}


