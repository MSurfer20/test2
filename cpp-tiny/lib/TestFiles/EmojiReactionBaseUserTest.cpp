
#include "EmojiReactionBase_user.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_EmojiReactionBase_user_id_is_assigned_from_json()
{
    bourne::json input = 
    {
        "id", 1
    };

    EmojiReactionBase_user obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}


void test_EmojiReactionBase_user_email_is_assigned_from_json()
{


    bourne::json input = 
    {
        "email", "hello"
    };

    EmojiReactionBase_user obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEmail().c_str());






}


void test_EmojiReactionBase_user_full_name_is_assigned_from_json()
{


    bourne::json input = 
    {
        "full_name", "hello"
    };

    EmojiReactionBase_user obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFullName().c_str());






}


void test_EmojiReactionBase_user_is_mirror_dummy_is_assigned_from_json()
{




    bourne::json input = 
    {
        "is_mirror_dummy", true
    };

    EmojiReactionBase_user obj(input.dump());

    TEST_ASSERT(true == obj.isIsMirrorDummy());




}



void test_EmojiReactionBase_user_id_is_converted_to_json()
{
    bourne::json input = 
    {
        "id", 1
    };

    EmojiReactionBase_user obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


void test_EmojiReactionBase_user_email_is_converted_to_json()
{

    bourne::json input = 
    {
        "email", "hello"
    };

    EmojiReactionBase_user obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["email"] == output["email"]);



}


void test_EmojiReactionBase_user_full_name_is_converted_to_json()
{

    bourne::json input = 
    {
        "full_name", "hello"
    };

    EmojiReactionBase_user obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["full_name"] == output["full_name"]);



}


void test_EmojiReactionBase_user_is_mirror_dummy_is_converted_to_json()
{


    bourne::json input = 
    {
        "is_mirror_dummy", true
    };

    EmojiReactionBase_user obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_mirror_dummy"] == output["is_mirror_dummy"]);


}


