
#include "DefaultStreamGroup.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_DefaultStreamGroup_name_is_assigned_from_json()
{


    bourne::json input = 
    {
        "name", "hello"
    };

    DefaultStreamGroup obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_DefaultStreamGroup_description_is_assigned_from_json()
{


    bourne::json input = 
    {
        "description", "hello"
    };

    DefaultStreamGroup obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_DefaultStreamGroup_id_is_assigned_from_json()
{
    bourne::json input = 
    {
        "id", 1
    };

    DefaultStreamGroup obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}




void test_DefaultStreamGroup_name_is_converted_to_json()
{

    bourne::json input = 
    {
        "name", "hello"
    };

    DefaultStreamGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_DefaultStreamGroup_description_is_converted_to_json()
{

    bourne::json input = 
    {
        "description", "hello"
    };

    DefaultStreamGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_DefaultStreamGroup_id_is_converted_to_json()
{
    bourne::json input = 
    {
        "id", 1
    };

    DefaultStreamGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}



