
#include "Attachments.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Attachments_id_is_assigned_from_json()
{
    bourne::json input = 
    {
        "id", 1
    };

    Attachments obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}


void test_Attachments_name_is_assigned_from_json()
{


    bourne::json input = 
    {
        "name", "hello"
    };

    Attachments obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_Attachments_path_id_is_assigned_from_json()
{


    bourne::json input = 
    {
        "path_id", "hello"
    };

    Attachments obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPathId().c_str());






}


void test_Attachments_size_is_assigned_from_json()
{
    bourne::json input = 
    {
        "size", 1
    };

    Attachments obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSize());








}


void test_Attachments_create_time_is_assigned_from_json()
{
    bourne::json input = 
    {
        "create_time", 1
    };

    Attachments obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreateTime());








}




void test_Attachments_id_is_converted_to_json()
{
    bourne::json input = 
    {
        "id", 1
    };

    Attachments obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


void test_Attachments_name_is_converted_to_json()
{

    bourne::json input = 
    {
        "name", "hello"
    };

    Attachments obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_Attachments_path_id_is_converted_to_json()
{

    bourne::json input = 
    {
        "path_id", "hello"
    };

    Attachments obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["path_id"] == output["path_id"]);



}


void test_Attachments_size_is_converted_to_json()
{
    bourne::json input = 
    {
        "size", 1
    };

    Attachments obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["size"] == output["size"]);




}


void test_Attachments_create_time_is_converted_to_json()
{
    bourne::json input = 
    {
        "create_time", 1
    };

    Attachments obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["create_time"] == output["create_time"]);




}



