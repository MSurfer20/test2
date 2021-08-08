
#include "MissingArgumentError_allOf.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"






void test_MissingArgumentError_allOf_var_name_is_assigned_from_json()
{


    bourne::json input = 
    {
        "var_name", "hello"
    };

    MissingArgumentError_allOf obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVarName().c_str());






}






void test_MissingArgumentError_allOf_var_name_is_converted_to_json()
{

    bourne::json input = 
    {
        "var_name", "hello"
    };

    MissingArgumentError_allOf obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["var_name"] == output["var_name"]);



}


