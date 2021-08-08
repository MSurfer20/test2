
#include "ApiKeyResponse_allOf.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"





void test_ApiKeyResponse_allOf_api_key_is_assigned_from_json()
{


    bourne::json input = 
    {
        "api_key", "hello"
    };

    ApiKeyResponse_allOf obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getApiKey().c_str());






}


void test_ApiKeyResponse_allOf_email_is_assigned_from_json()
{


    bourne::json input = 
    {
        "email", "hello"
    };

    ApiKeyResponse_allOf obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEmail().c_str());






}





void test_ApiKeyResponse_allOf_api_key_is_converted_to_json()
{

    bourne::json input = 
    {
        "api_key", "hello"
    };

    ApiKeyResponse_allOf obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["api_key"] == output["api_key"]);



}


void test_ApiKeyResponse_allOf_email_is_converted_to_json()
{

    bourne::json input = 
    {
        "email", "hello"
    };

    ApiKeyResponse_allOf obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["email"] == output["email"]);



}


