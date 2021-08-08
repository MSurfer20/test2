
#include "Attachments_messages.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Attachments_messages_date_sent_is_assigned_from_json()
{
    bourne::json input = 
    {
        "date_sent", 1
    };

    Attachments_messages obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getDateSent());








}


void test_Attachments_messages_id_is_assigned_from_json()
{
    bourne::json input = 
    {
        "id", 1
    };

    Attachments_messages obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}



void test_Attachments_messages_date_sent_is_converted_to_json()
{
    bourne::json input = 
    {
        "date_sent", 1
    };

    Attachments_messages obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["date_sent"] == output["date_sent"]);




}


void test_Attachments_messages_id_is_converted_to_json()
{
    bourne::json input = 
    {
        "id", 1
    };

    Attachments_messages obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


