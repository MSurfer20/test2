
#include "EmojiReactionBase_allOf.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_EmojiReactionBase_allOf_user_id_is_assigned_from_json()
{
    bourne::json input = 
    {
        "user_id", 1
    };

    EmojiReactionBase_allOf obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getUserId());








}




void test_EmojiReactionBase_allOf_user_id_is_converted_to_json()
{
    bourne::json input = 
    {
        "user_id", 1
    };

    EmojiReactionBase_allOf obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["user_id"] == output["user_id"]);




}



