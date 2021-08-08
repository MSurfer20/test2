
#include "GetMessages.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"























void test_GetMessages_last_edit_timestamp_is_assigned_from_json()
{
    bourne::json input = 
    {
        "last_edit_timestamp", 1
    };

    GetMessages obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLastEditTimestamp());








}


void test_GetMessages_match_content_is_assigned_from_json()
{


    bourne::json input = 
    {
        "match_content", "hello"
    };

    GetMessages obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMatchContent().c_str());






}


void test_GetMessages_match_subject_is_assigned_from_json()
{


    bourne::json input = 
    {
        "match_subject", "hello"
    };

    GetMessages obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMatchSubject().c_str());






}























void test_GetMessages_last_edit_timestamp_is_converted_to_json()
{
    bourne::json input = 
    {
        "last_edit_timestamp", 1
    };

    GetMessages obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["last_edit_timestamp"] == output["last_edit_timestamp"]);




}


void test_GetMessages_match_content_is_converted_to_json()
{

    bourne::json input = 
    {
        "match_content", "hello"
    };

    GetMessages obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["match_content"] == output["match_content"]);



}


void test_GetMessages_match_subject_is_converted_to_json()
{

    bourne::json input = 
    {
        "match_subject", "hello"
    };

    GetMessages obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["match_subject"] == output["match_subject"]);



}


