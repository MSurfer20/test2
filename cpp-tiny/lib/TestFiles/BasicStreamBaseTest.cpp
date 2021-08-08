
#include "BasicStreamBase.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_BasicStreamBase_stream_id_is_assigned_from_json()
{
    bourne::json input = 
    {
        "stream_id", 1
    };

    BasicStreamBase obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStreamId());








}


void test_BasicStreamBase_name_is_assigned_from_json()
{


    bourne::json input = 
    {
        "name", "hello"
    };

    BasicStreamBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_BasicStreamBase_description_is_assigned_from_json()
{


    bourne::json input = 
    {
        "description", "hello"
    };

    BasicStreamBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_BasicStreamBase_date_created_is_assigned_from_json()
{
    bourne::json input = 
    {
        "date_created", 1
    };

    BasicStreamBase obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getDateCreated());








}


void test_BasicStreamBase_invite_only_is_assigned_from_json()
{




    bourne::json input = 
    {
        "invite_only", true
    };

    BasicStreamBase obj(input.dump());

    TEST_ASSERT(true == obj.isInviteOnly());




}


void test_BasicStreamBase_rendered_description_is_assigned_from_json()
{


    bourne::json input = 
    {
        "rendered_description", "hello"
    };

    BasicStreamBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRenderedDescription().c_str());






}


void test_BasicStreamBase_is_web_public_is_assigned_from_json()
{




    bourne::json input = 
    {
        "is_web_public", true
    };

    BasicStreamBase obj(input.dump());

    TEST_ASSERT(true == obj.isIsWebPublic());




}


void test_BasicStreamBase_stream_post_policy_is_assigned_from_json()
{
    bourne::json input = 
    {
        "stream_post_policy", 1
    };

    BasicStreamBase obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStreamPostPolicy());








}


void test_BasicStreamBase_message_retention_days_is_assigned_from_json()
{
    bourne::json input = 
    {
        "message_retention_days", 1
    };

    BasicStreamBase obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMessageRetentionDays());








}


void test_BasicStreamBase_history_public_to_subscribers_is_assigned_from_json()
{




    bourne::json input = 
    {
        "history_public_to_subscribers", true
    };

    BasicStreamBase obj(input.dump());

    TEST_ASSERT(true == obj.isHistoryPublicToSubscribers());




}


void test_BasicStreamBase_first_message_id_is_assigned_from_json()
{
    bourne::json input = 
    {
        "first_message_id", 1
    };

    BasicStreamBase obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFirstMessageId());








}


void test_BasicStreamBase_is_announcement_only_is_assigned_from_json()
{




    bourne::json input = 
    {
        "is_announcement_only", true
    };

    BasicStreamBase obj(input.dump());

    TEST_ASSERT(true == obj.isIsAnnouncementOnly());




}



void test_BasicStreamBase_stream_id_is_converted_to_json()
{
    bourne::json input = 
    {
        "stream_id", 1
    };

    BasicStreamBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["stream_id"] == output["stream_id"]);




}


void test_BasicStreamBase_name_is_converted_to_json()
{

    bourne::json input = 
    {
        "name", "hello"
    };

    BasicStreamBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_BasicStreamBase_description_is_converted_to_json()
{

    bourne::json input = 
    {
        "description", "hello"
    };

    BasicStreamBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_BasicStreamBase_date_created_is_converted_to_json()
{
    bourne::json input = 
    {
        "date_created", 1
    };

    BasicStreamBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["date_created"] == output["date_created"]);




}


void test_BasicStreamBase_invite_only_is_converted_to_json()
{


    bourne::json input = 
    {
        "invite_only", true
    };

    BasicStreamBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["invite_only"] == output["invite_only"]);


}


void test_BasicStreamBase_rendered_description_is_converted_to_json()
{

    bourne::json input = 
    {
        "rendered_description", "hello"
    };

    BasicStreamBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["rendered_description"] == output["rendered_description"]);



}


void test_BasicStreamBase_is_web_public_is_converted_to_json()
{


    bourne::json input = 
    {
        "is_web_public", true
    };

    BasicStreamBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_web_public"] == output["is_web_public"]);


}


void test_BasicStreamBase_stream_post_policy_is_converted_to_json()
{
    bourne::json input = 
    {
        "stream_post_policy", 1
    };

    BasicStreamBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["stream_post_policy"] == output["stream_post_policy"]);




}


void test_BasicStreamBase_message_retention_days_is_converted_to_json()
{
    bourne::json input = 
    {
        "message_retention_days", 1
    };

    BasicStreamBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message_retention_days"] == output["message_retention_days"]);




}


void test_BasicStreamBase_history_public_to_subscribers_is_converted_to_json()
{


    bourne::json input = 
    {
        "history_public_to_subscribers", true
    };

    BasicStreamBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["history_public_to_subscribers"] == output["history_public_to_subscribers"]);


}


void test_BasicStreamBase_first_message_id_is_converted_to_json()
{
    bourne::json input = 
    {
        "first_message_id", 1
    };

    BasicStreamBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["first_message_id"] == output["first_message_id"]);




}


void test_BasicStreamBase_is_announcement_only_is_converted_to_json()
{


    bourne::json input = 
    {
        "is_announcement_only", true
    };

    BasicStreamBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_announcement_only"] == output["is_announcement_only"]);


}


