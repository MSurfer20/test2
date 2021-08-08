
#include "Draft.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Draft_id_is_assigned_from_json()
{
    bourne::json input = 
    {
        "id", 1
    };

    Draft obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}


void test_Draft_type_is_assigned_from_json()
{


    bourne::json input = 
    {
        "type", "hello"
    };

    Draft obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}



void test_Draft_topic_is_assigned_from_json()
{


    bourne::json input = 
    {
        "topic", "hello"
    };

    Draft obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTopic().c_str());






}


void test_Draft_content_is_assigned_from_json()
{


    bourne::json input = 
    {
        "content", "hello"
    };

    Draft obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getContent().c_str());






}


void test_Draft_timestamp_is_assigned_from_json()
{








}



void test_Draft_id_is_converted_to_json()
{
    bourne::json input = 
    {
        "id", 1
    };

    Draft obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


void test_Draft_type_is_converted_to_json()
{

    bourne::json input = 
    {
        "type", "hello"
    };

    Draft obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}



void test_Draft_topic_is_converted_to_json()
{

    bourne::json input = 
    {
        "topic", "hello"
    };

    Draft obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["topic"] == output["topic"]);



}


void test_Draft_content_is_converted_to_json()
{

    bourne::json input = 
    {
        "content", "hello"
    };

    Draft obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["content"] == output["content"]);



}


void test_Draft_timestamp_is_converted_to_json()
{




}


