
#include "RealmPlayground.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealmPlayground_id_is_assigned_from_json()
{
    bourne::json input = 
    {
        "id", 1
    };

    RealmPlayground obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}


void test_RealmPlayground_name_is_assigned_from_json()
{


    bourne::json input = 
    {
        "name", "hello"
    };

    RealmPlayground obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_RealmPlayground_pygments_language_is_assigned_from_json()
{


    bourne::json input = 
    {
        "pygments_language", "hello"
    };

    RealmPlayground obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPygmentsLanguage().c_str());






}


void test_RealmPlayground_url_prefix_is_assigned_from_json()
{


    bourne::json input = 
    {
        "url_prefix", "hello"
    };

    RealmPlayground obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUrlPrefix().c_str());






}



void test_RealmPlayground_id_is_converted_to_json()
{
    bourne::json input = 
    {
        "id", 1
    };

    RealmPlayground obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


void test_RealmPlayground_name_is_converted_to_json()
{

    bourne::json input = 
    {
        "name", "hello"
    };

    RealmPlayground obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_RealmPlayground_pygments_language_is_converted_to_json()
{

    bourne::json input = 
    {
        "pygments_language", "hello"
    };

    RealmPlayground obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pygments_language"] == output["pygments_language"]);



}


void test_RealmPlayground_url_prefix_is_converted_to_json()
{

    bourne::json input = 
    {
        "url_prefix", "hello"
    };

    RealmPlayground obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["url_prefix"] == output["url_prefix"]);



}


