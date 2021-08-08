
#include "JsonErrorBase_allOf.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_JsonErrorBase_allOf_result_is_assigned_from_json()
{


    bourne::json input = 
    {
        "result", "hello"
    };

    JsonErrorBase_allOf obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getResult().c_str());






}


void test_JsonErrorBase_allOf_msg_is_assigned_from_json()
{


    bourne::json input = 
    {
        "msg", "hello"
    };

    JsonErrorBase_allOf obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMsg().c_str());






}



void test_JsonErrorBase_allOf_result_is_converted_to_json()
{

    bourne::json input = 
    {
        "result", "hello"
    };

    JsonErrorBase_allOf obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["result"] == output["result"]);



}


void test_JsonErrorBase_allOf_msg_is_converted_to_json()
{

    bourne::json input = 
    {
        "msg", "hello"
    };

    JsonErrorBase_allOf obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["msg"] == output["msg"]);



}


