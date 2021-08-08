
#include "Hotspot.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Hotspot_delay_is_assigned_from_json()
{








}


void test_Hotspot_name_is_assigned_from_json()
{


    bourne::json input = 
    {
        "name", "hello"
    };

    Hotspot obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_Hotspot_title_is_assigned_from_json()
{


    bourne::json input = 
    {
        "title", "hello"
    };

    Hotspot obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTitle().c_str());






}


void test_Hotspot_description_is_assigned_from_json()
{


    bourne::json input = 
    {
        "description", "hello"
    };

    Hotspot obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}



void test_Hotspot_delay_is_converted_to_json()
{




}


void test_Hotspot_name_is_converted_to_json()
{

    bourne::json input = 
    {
        "name", "hello"
    };

    Hotspot obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_Hotspot_title_is_converted_to_json()
{

    bourne::json input = 
    {
        "title", "hello"
    };

    Hotspot obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["title"] == output["title"]);



}


void test_Hotspot_description_is_converted_to_json()
{

    bourne::json input = 
    {
        "description", "hello"
    };

    Hotspot obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


