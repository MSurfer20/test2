
#include "Inline_response_200.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Inline_response_200_bot_email_is_assigned_from_json()
{


    bourne::json input = 
    {
        "bot_email", "hello"
    };

    Inline_response_200 obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBotEmail().c_str());






}


void test_Inline_response_200_bot_full_name_is_assigned_from_json()
{


    bourne::json input = 
    {
        "bot_full_name", "hello"
    };

    Inline_response_200 obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBotFullName().c_str());






}


void test_Inline_response_200_data_is_assigned_from_json()
{


    bourne::json input = 
    {
        "data", "hello"
    };

    Inline_response_200 obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getData().c_str());






}


void test_Inline_response_200_trigger_is_assigned_from_json()
{


    bourne::json input = 
    {
        "trigger", "hello"
    };

    Inline_response_200 obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTrigger().c_str());






}


void test_Inline_response_200_token_is_assigned_from_json()
{


    bourne::json input = 
    {
        "token", "hello"
    };

    Inline_response_200 obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getToken().c_str());






}




void test_Inline_response_200_bot_email_is_converted_to_json()
{

    bourne::json input = 
    {
        "bot_email", "hello"
    };

    Inline_response_200 obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bot_email"] == output["bot_email"]);



}


void test_Inline_response_200_bot_full_name_is_converted_to_json()
{

    bourne::json input = 
    {
        "bot_full_name", "hello"
    };

    Inline_response_200 obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bot_full_name"] == output["bot_full_name"]);



}


void test_Inline_response_200_data_is_converted_to_json()
{

    bourne::json input = 
    {
        "data", "hello"
    };

    Inline_response_200 obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["data"] == output["data"]);



}


void test_Inline_response_200_trigger_is_converted_to_json()
{

    bourne::json input = 
    {
        "trigger", "hello"
    };

    Inline_response_200 obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["trigger"] == output["trigger"]);



}


void test_Inline_response_200_token_is_converted_to_json()
{

    bourne::json input = 
    {
        "token", "hello"
    };

    Inline_response_200 obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["token"] == output["token"]);



}



