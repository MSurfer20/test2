
#include "CustomProfileField.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CustomProfileField_id_is_assigned_from_json()
{
    bourne::json input = 
    {
        "id", 1
    };

    CustomProfileField obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}


void test_CustomProfileField_type_is_assigned_from_json()
{
    bourne::json input = 
    {
        "type", 1
    };

    CustomProfileField obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getType());








}


void test_CustomProfileField_order_is_assigned_from_json()
{
    bourne::json input = 
    {
        "order", 1
    };

    CustomProfileField obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOrder());








}


void test_CustomProfileField_name_is_assigned_from_json()
{


    bourne::json input = 
    {
        "name", "hello"
    };

    CustomProfileField obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_CustomProfileField_hint_is_assigned_from_json()
{


    bourne::json input = 
    {
        "hint", "hello"
    };

    CustomProfileField obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getHint().c_str());






}


void test_CustomProfileField_field_data_is_assigned_from_json()
{


    bourne::json input = 
    {
        "field_data", "hello"
    };

    CustomProfileField obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFieldData().c_str());






}



void test_CustomProfileField_id_is_converted_to_json()
{
    bourne::json input = 
    {
        "id", 1
    };

    CustomProfileField obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


void test_CustomProfileField_type_is_converted_to_json()
{
    bourne::json input = 
    {
        "type", 1
    };

    CustomProfileField obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);




}


void test_CustomProfileField_order_is_converted_to_json()
{
    bourne::json input = 
    {
        "order", 1
    };

    CustomProfileField obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["order"] == output["order"]);




}


void test_CustomProfileField_name_is_converted_to_json()
{

    bourne::json input = 
    {
        "name", "hello"
    };

    CustomProfileField obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_CustomProfileField_hint_is_converted_to_json()
{

    bourne::json input = 
    {
        "hint", "hello"
    };

    CustomProfileField obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["hint"] == output["hint"]);



}


void test_CustomProfileField_field_data_is_converted_to_json()
{

    bourne::json input = 
    {
        "field_data", "hello"
    };

    CustomProfileField obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["field_data"] == output["field_data"]);



}


