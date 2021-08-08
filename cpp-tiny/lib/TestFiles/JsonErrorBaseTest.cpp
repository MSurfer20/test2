
#include "JsonErrorBase.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_JsonErrorBase_result_is_assigned_from_json()
{


    bourne::json input = 
    {
        "result", "hello"
    };

    JsonErrorBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getResult().c_str());






}


void test_JsonErrorBase_msg_is_assigned_from_json()
{


    bourne::json input = 
    {
        "msg", "hello"
    };

    JsonErrorBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMsg().c_str());






}



void test_JsonErrorBase_result_is_converted_to_json()
{

    bourne::json input = 
    {
        "result", "hello"
    };

    JsonErrorBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["result"] == output["result"]);



}


void test_JsonErrorBase_msg_is_converted_to_json()
{

    bourne::json input = 
    {
        "msg", "hello"
    };

    JsonErrorBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["msg"] == output["msg"]);



}


