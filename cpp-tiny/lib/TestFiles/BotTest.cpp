
#include "Bot.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"












void test_Bot_email_is_assigned_from_json()
{


    bourne::json input = 
    {
        "email", "hello"
    };

    Bot obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEmail().c_str());






}


void test_Bot_bot_type_is_assigned_from_json()
{
    bourne::json input = 
    {
        "bot_type", 1
    };

    Bot obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBotType());








}


void test_Bot_is_active_is_assigned_from_json()
{




    bourne::json input = 
    {
        "is_active", true
    };

    Bot obj(input.dump());

    TEST_ASSERT(true == obj.isIsActive());




}












void test_Bot_email_is_converted_to_json()
{

    bourne::json input = 
    {
        "email", "hello"
    };

    Bot obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["email"] == output["email"]);



}


void test_Bot_bot_type_is_converted_to_json()
{
    bourne::json input = 
    {
        "bot_type", 1
    };

    Bot obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bot_type"] == output["bot_type"]);




}


void test_Bot_is_active_is_converted_to_json()
{


    bourne::json input = 
    {
        "is_active", true
    };

    Bot obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_active"] == output["is_active"]);


}


