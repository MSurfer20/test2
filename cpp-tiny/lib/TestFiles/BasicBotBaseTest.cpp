
#include "BasicBotBase.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_BasicBotBase_user_id_is_assigned_from_json()
{
    bourne::json input = 
    {
        "user_id", 1
    };

    BasicBotBase obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getUserId());








}


void test_BasicBotBase_full_name_is_assigned_from_json()
{


    bourne::json input = 
    {
        "full_name", "hello"
    };

    BasicBotBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFullName().c_str());






}


void test_BasicBotBase_api_key_is_assigned_from_json()
{


    bourne::json input = 
    {
        "api_key", "hello"
    };

    BasicBotBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getApiKey().c_str());






}


void test_BasicBotBase_default_sending_stream_is_assigned_from_json()
{


    bourne::json input = 
    {
        "default_sending_stream", "hello"
    };

    BasicBotBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDefaultSendingStream().c_str());






}


void test_BasicBotBase_default_events_register_stream_is_assigned_from_json()
{


    bourne::json input = 
    {
        "default_events_register_stream", "hello"
    };

    BasicBotBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDefaultEventsRegisterStream().c_str());






}


void test_BasicBotBase_default_all_public_streams_is_assigned_from_json()
{




    bourne::json input = 
    {
        "default_all_public_streams", true
    };

    BasicBotBase obj(input.dump());

    TEST_ASSERT(true == obj.isDefaultAllPublicStreams());




}


void test_BasicBotBase_avatar_url_is_assigned_from_json()
{


    bourne::json input = 
    {
        "avatar_url", "hello"
    };

    BasicBotBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAvatarUrl().c_str());






}


void test_BasicBotBase_owner_id_is_assigned_from_json()
{
    bourne::json input = 
    {
        "owner_id", 1
    };

    BasicBotBase obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOwnerId());








}




void test_BasicBotBase_user_id_is_converted_to_json()
{
    bourne::json input = 
    {
        "user_id", 1
    };

    BasicBotBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["user_id"] == output["user_id"]);




}


void test_BasicBotBase_full_name_is_converted_to_json()
{

    bourne::json input = 
    {
        "full_name", "hello"
    };

    BasicBotBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["full_name"] == output["full_name"]);



}


void test_BasicBotBase_api_key_is_converted_to_json()
{

    bourne::json input = 
    {
        "api_key", "hello"
    };

    BasicBotBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["api_key"] == output["api_key"]);



}


void test_BasicBotBase_default_sending_stream_is_converted_to_json()
{

    bourne::json input = 
    {
        "default_sending_stream", "hello"
    };

    BasicBotBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["default_sending_stream"] == output["default_sending_stream"]);



}


void test_BasicBotBase_default_events_register_stream_is_converted_to_json()
{

    bourne::json input = 
    {
        "default_events_register_stream", "hello"
    };

    BasicBotBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["default_events_register_stream"] == output["default_events_register_stream"]);



}


void test_BasicBotBase_default_all_public_streams_is_converted_to_json()
{


    bourne::json input = 
    {
        "default_all_public_streams", true
    };

    BasicBotBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["default_all_public_streams"] == output["default_all_public_streams"]);


}


void test_BasicBotBase_avatar_url_is_converted_to_json()
{

    bourne::json input = 
    {
        "avatar_url", "hello"
    };

    BasicBotBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["avatar_url"] == output["avatar_url"]);



}


void test_BasicBotBase_owner_id_is_converted_to_json()
{
    bourne::json input = 
    {
        "owner_id", 1
    };

    BasicBotBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["owner_id"] == output["owner_id"]);




}



