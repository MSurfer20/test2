
#include "EmojiBase.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_EmojiBase_emoji_code_is_assigned_from_json()
{


    bourne::json input = 
    {
        "emoji_code", "hello"
    };

    EmojiBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEmojiCode().c_str());






}


void test_EmojiBase_emoji_name_is_assigned_from_json()
{


    bourne::json input = 
    {
        "emoji_name", "hello"
    };

    EmojiBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEmojiName().c_str());






}


void test_EmojiBase_reaction_type_is_assigned_from_json()
{


    bourne::json input = 
    {
        "reaction_type", "hello"
    };

    EmojiBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getReactionType().c_str());






}



void test_EmojiBase_emoji_code_is_converted_to_json()
{

    bourne::json input = 
    {
        "emoji_code", "hello"
    };

    EmojiBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["emoji_code"] == output["emoji_code"]);



}


void test_EmojiBase_emoji_name_is_converted_to_json()
{

    bourne::json input = 
    {
        "emoji_name", "hello"
    };

    EmojiBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["emoji_name"] == output["emoji_name"]);



}


void test_EmojiBase_reaction_type_is_converted_to_json()
{

    bourne::json input = 
    {
        "reaction_type", "hello"
    };

    EmojiBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["reaction_type"] == output["reaction_type"]);



}


