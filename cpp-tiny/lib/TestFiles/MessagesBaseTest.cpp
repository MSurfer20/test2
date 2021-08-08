
#include "MessagesBase.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_MessagesBase_avatar_url_is_assigned_from_json()
{


    bourne::json input = 
    {
        "avatar_url", "hello"
    };

    MessagesBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAvatarUrl().c_str());






}


void test_MessagesBase_client_is_assigned_from_json()
{


    bourne::json input = 
    {
        "client", "hello"
    };

    MessagesBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getClient().c_str());






}


void test_MessagesBase_content_is_assigned_from_json()
{


    bourne::json input = 
    {
        "content", "hello"
    };

    MessagesBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getContent().c_str());






}


void test_MessagesBase_content_type_is_assigned_from_json()
{


    bourne::json input = 
    {
        "content_type", "hello"
    };

    MessagesBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getContentType().c_str());






}



void test_MessagesBase_id_is_assigned_from_json()
{
    bourne::json input = 
    {
        "id", 1
    };

    MessagesBase obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}


void test_MessagesBase_is_me_message_is_assigned_from_json()
{




    bourne::json input = 
    {
        "is_me_message", true
    };

    MessagesBase obj(input.dump());

    TEST_ASSERT(true == obj.isIsMeMessage());




}



void test_MessagesBase_recipient_id_is_assigned_from_json()
{
    bourne::json input = 
    {
        "recipient_id", 1
    };

    MessagesBase obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRecipientId());








}


void test_MessagesBase_sender_email_is_assigned_from_json()
{


    bourne::json input = 
    {
        "sender_email", "hello"
    };

    MessagesBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSenderEmail().c_str());






}


void test_MessagesBase_sender_full_name_is_assigned_from_json()
{


    bourne::json input = 
    {
        "sender_full_name", "hello"
    };

    MessagesBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSenderFullName().c_str());






}


void test_MessagesBase_sender_id_is_assigned_from_json()
{
    bourne::json input = 
    {
        "sender_id", 1
    };

    MessagesBase obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSenderId());








}


void test_MessagesBase_sender_realm_str_is_assigned_from_json()
{


    bourne::json input = 
    {
        "sender_realm_str", "hello"
    };

    MessagesBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSenderRealmStr().c_str());






}


void test_MessagesBase_stream_id_is_assigned_from_json()
{
    bourne::json input = 
    {
        "stream_id", 1
    };

    MessagesBase obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStreamId());








}


void test_MessagesBase_subject_is_assigned_from_json()
{


    bourne::json input = 
    {
        "subject", "hello"
    };

    MessagesBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSubject().c_str());






}




void test_MessagesBase_timestamp_is_assigned_from_json()
{
    bourne::json input = 
    {
        "timestamp", 1
    };

    MessagesBase obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTimestamp());








}


void test_MessagesBase_type_is_assigned_from_json()
{


    bourne::json input = 
    {
        "type", "hello"
    };

    MessagesBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}



void test_MessagesBase_avatar_url_is_converted_to_json()
{

    bourne::json input = 
    {
        "avatar_url", "hello"
    };

    MessagesBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["avatar_url"] == output["avatar_url"]);



}


void test_MessagesBase_client_is_converted_to_json()
{

    bourne::json input = 
    {
        "client", "hello"
    };

    MessagesBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["client"] == output["client"]);



}


void test_MessagesBase_content_is_converted_to_json()
{

    bourne::json input = 
    {
        "content", "hello"
    };

    MessagesBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["content"] == output["content"]);



}


void test_MessagesBase_content_type_is_converted_to_json()
{

    bourne::json input = 
    {
        "content_type", "hello"
    };

    MessagesBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["content_type"] == output["content_type"]);



}



void test_MessagesBase_id_is_converted_to_json()
{
    bourne::json input = 
    {
        "id", 1
    };

    MessagesBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


void test_MessagesBase_is_me_message_is_converted_to_json()
{


    bourne::json input = 
    {
        "is_me_message", true
    };

    MessagesBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_me_message"] == output["is_me_message"]);


}



void test_MessagesBase_recipient_id_is_converted_to_json()
{
    bourne::json input = 
    {
        "recipient_id", 1
    };

    MessagesBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["recipient_id"] == output["recipient_id"]);




}


void test_MessagesBase_sender_email_is_converted_to_json()
{

    bourne::json input = 
    {
        "sender_email", "hello"
    };

    MessagesBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["sender_email"] == output["sender_email"]);



}


void test_MessagesBase_sender_full_name_is_converted_to_json()
{

    bourne::json input = 
    {
        "sender_full_name", "hello"
    };

    MessagesBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["sender_full_name"] == output["sender_full_name"]);



}


void test_MessagesBase_sender_id_is_converted_to_json()
{
    bourne::json input = 
    {
        "sender_id", 1
    };

    MessagesBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["sender_id"] == output["sender_id"]);




}


void test_MessagesBase_sender_realm_str_is_converted_to_json()
{

    bourne::json input = 
    {
        "sender_realm_str", "hello"
    };

    MessagesBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["sender_realm_str"] == output["sender_realm_str"]);



}


void test_MessagesBase_stream_id_is_converted_to_json()
{
    bourne::json input = 
    {
        "stream_id", 1
    };

    MessagesBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["stream_id"] == output["stream_id"]);




}


void test_MessagesBase_subject_is_converted_to_json()
{

    bourne::json input = 
    {
        "subject", "hello"
    };

    MessagesBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["subject"] == output["subject"]);



}




void test_MessagesBase_timestamp_is_converted_to_json()
{
    bourne::json input = 
    {
        "timestamp", 1
    };

    MessagesBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["timestamp"] == output["timestamp"]);




}


void test_MessagesBase_type_is_converted_to_json()
{

    bourne::json input = 
    {
        "type", "hello"
    };

    MessagesBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


