
#include "RealmEmoji.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealmEmoji_id_is_assigned_from_json()
{


    bourne::json input = 
    {
        "id", "hello"
    };

    RealmEmoji obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_RealmEmoji_name_is_assigned_from_json()
{


    bourne::json input = 
    {
        "name", "hello"
    };

    RealmEmoji obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_RealmEmoji_source_url_is_assigned_from_json()
{


    bourne::json input = 
    {
        "source_url", "hello"
    };

    RealmEmoji obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSourceUrl().c_str());






}


void test_RealmEmoji_deactivated_is_assigned_from_json()
{




    bourne::json input = 
    {
        "deactivated", true
    };

    RealmEmoji obj(input.dump());

    TEST_ASSERT(true == obj.isDeactivated());




}


void test_RealmEmoji_author_id_is_assigned_from_json()
{
    bourne::json input = 
    {
        "author_id", 1
    };

    RealmEmoji obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getAuthorId());








}



void test_RealmEmoji_id_is_converted_to_json()
{

    bourne::json input = 
    {
        "id", "hello"
    };

    RealmEmoji obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_RealmEmoji_name_is_converted_to_json()
{

    bourne::json input = 
    {
        "name", "hello"
    };

    RealmEmoji obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_RealmEmoji_source_url_is_converted_to_json()
{

    bourne::json input = 
    {
        "source_url", "hello"
    };

    RealmEmoji obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["source_url"] == output["source_url"]);



}


void test_RealmEmoji_deactivated_is_converted_to_json()
{


    bourne::json input = 
    {
        "deactivated", true
    };

    RealmEmoji obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["deactivated"] == output["deactivated"]);


}


void test_RealmEmoji_author_id_is_converted_to_json()
{
    bourne::json input = 
    {
        "author_id", 1
    };

    RealmEmoji obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["author_id"] == output["author_id"]);




}


