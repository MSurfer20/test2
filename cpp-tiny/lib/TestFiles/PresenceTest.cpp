
#include "Presence.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Presence_client_is_assigned_from_json()
{


    bourne::json input = 
    {
        "client", "hello"
    };

    Presence obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getClient().c_str());






}


void test_Presence_status_is_assigned_from_json()
{


    bourne::json input = 
    {
        "status", "hello"
    };

    Presence obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}


void test_Presence_timestamp_is_assigned_from_json()
{
    bourne::json input = 
    {
        "timestamp", 1
    };

    Presence obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTimestamp());








}


void test_Presence_pushable_is_assigned_from_json()
{




    bourne::json input = 
    {
        "pushable", true
    };

    Presence obj(input.dump());

    TEST_ASSERT(true == obj.isPushable());




}



void test_Presence_client_is_converted_to_json()
{

    bourne::json input = 
    {
        "client", "hello"
    };

    Presence obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["client"] == output["client"]);



}


void test_Presence_status_is_converted_to_json()
{

    bourne::json input = 
    {
        "status", "hello"
    };

    Presence obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}


void test_Presence_timestamp_is_converted_to_json()
{
    bourne::json input = 
    {
        "timestamp", 1
    };

    Presence obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["timestamp"] == output["timestamp"]);




}


void test_Presence_pushable_is_converted_to_json()
{


    bourne::json input = 
    {
        "pushable", true
    };

    Presence obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pushable"] == output["pushable"]);


}


