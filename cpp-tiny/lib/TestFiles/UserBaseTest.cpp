
#include "UserBase.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UserBase_email_is_assigned_from_json()
{


    bourne::json input = 
    {
        "email", "hello"
    };

    UserBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEmail().c_str());






}


void test_UserBase_is_bot_is_assigned_from_json()
{




    bourne::json input = 
    {
        "is_bot", true
    };

    UserBase obj(input.dump());

    TEST_ASSERT(true == obj.isIsBot());




}


void test_UserBase_avatar_url_is_assigned_from_json()
{


    bourne::json input = 
    {
        "avatar_url", "hello"
    };

    UserBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAvatarUrl().c_str());






}


void test_UserBase_avatar_version_is_assigned_from_json()
{
    bourne::json input = 
    {
        "avatar_version", 1
    };

    UserBase obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getAvatarVersion());








}


void test_UserBase_full_name_is_assigned_from_json()
{


    bourne::json input = 
    {
        "full_name", "hello"
    };

    UserBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFullName().c_str());






}


void test_UserBase_is_admin_is_assigned_from_json()
{




    bourne::json input = 
    {
        "is_admin", true
    };

    UserBase obj(input.dump());

    TEST_ASSERT(true == obj.isIsAdmin());




}


void test_UserBase_is_owner_is_assigned_from_json()
{




    bourne::json input = 
    {
        "is_owner", true
    };

    UserBase obj(input.dump());

    TEST_ASSERT(true == obj.isIsOwner());




}


void test_UserBase_is_billing_admin_is_assigned_from_json()
{




    bourne::json input = 
    {
        "is_billing_admin", true
    };

    UserBase obj(input.dump());

    TEST_ASSERT(true == obj.isIsBillingAdmin());




}


void test_UserBase_role_is_assigned_from_json()
{
    bourne::json input = 
    {
        "role", 1
    };

    UserBase obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRole());








}


void test_UserBase_bot_type_is_assigned_from_json()
{
    bourne::json input = 
    {
        "bot_type", 1
    };

    UserBase obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBotType());








}


void test_UserBase_user_id_is_assigned_from_json()
{
    bourne::json input = 
    {
        "user_id", 1
    };

    UserBase obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getUserId());








}


void test_UserBase_bot_owner_id_is_assigned_from_json()
{
    bourne::json input = 
    {
        "bot_owner_id", 1
    };

    UserBase obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBotOwnerId());








}


void test_UserBase_is_active_is_assigned_from_json()
{




    bourne::json input = 
    {
        "is_active", true
    };

    UserBase obj(input.dump());

    TEST_ASSERT(true == obj.isIsActive());




}


void test_UserBase_is_guest_is_assigned_from_json()
{




    bourne::json input = 
    {
        "is_guest", true
    };

    UserBase obj(input.dump());

    TEST_ASSERT(true == obj.isIsGuest());




}


void test_UserBase_timezone_is_assigned_from_json()
{


    bourne::json input = 
    {
        "timezone", "hello"
    };

    UserBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTimezone().c_str());






}


void test_UserBase_date_joined_is_assigned_from_json()
{


    bourne::json input = 
    {
        "date_joined", "hello"
    };

    UserBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDateJoined().c_str());






}


void test_UserBase_delivery_email_is_assigned_from_json()
{


    bourne::json input = 
    {
        "delivery_email", "hello"
    };

    UserBase obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDeliveryEmail().c_str());






}




void test_UserBase_email_is_converted_to_json()
{

    bourne::json input = 
    {
        "email", "hello"
    };

    UserBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["email"] == output["email"]);



}


void test_UserBase_is_bot_is_converted_to_json()
{


    bourne::json input = 
    {
        "is_bot", true
    };

    UserBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_bot"] == output["is_bot"]);


}


void test_UserBase_avatar_url_is_converted_to_json()
{

    bourne::json input = 
    {
        "avatar_url", "hello"
    };

    UserBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["avatar_url"] == output["avatar_url"]);



}


void test_UserBase_avatar_version_is_converted_to_json()
{
    bourne::json input = 
    {
        "avatar_version", 1
    };

    UserBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["avatar_version"] == output["avatar_version"]);




}


void test_UserBase_full_name_is_converted_to_json()
{

    bourne::json input = 
    {
        "full_name", "hello"
    };

    UserBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["full_name"] == output["full_name"]);



}


void test_UserBase_is_admin_is_converted_to_json()
{


    bourne::json input = 
    {
        "is_admin", true
    };

    UserBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_admin"] == output["is_admin"]);


}


void test_UserBase_is_owner_is_converted_to_json()
{


    bourne::json input = 
    {
        "is_owner", true
    };

    UserBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_owner"] == output["is_owner"]);


}


void test_UserBase_is_billing_admin_is_converted_to_json()
{


    bourne::json input = 
    {
        "is_billing_admin", true
    };

    UserBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_billing_admin"] == output["is_billing_admin"]);


}


void test_UserBase_role_is_converted_to_json()
{
    bourne::json input = 
    {
        "role", 1
    };

    UserBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["role"] == output["role"]);




}


void test_UserBase_bot_type_is_converted_to_json()
{
    bourne::json input = 
    {
        "bot_type", 1
    };

    UserBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bot_type"] == output["bot_type"]);




}


void test_UserBase_user_id_is_converted_to_json()
{
    bourne::json input = 
    {
        "user_id", 1
    };

    UserBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["user_id"] == output["user_id"]);




}


void test_UserBase_bot_owner_id_is_converted_to_json()
{
    bourne::json input = 
    {
        "bot_owner_id", 1
    };

    UserBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bot_owner_id"] == output["bot_owner_id"]);




}


void test_UserBase_is_active_is_converted_to_json()
{


    bourne::json input = 
    {
        "is_active", true
    };

    UserBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_active"] == output["is_active"]);


}


void test_UserBase_is_guest_is_converted_to_json()
{


    bourne::json input = 
    {
        "is_guest", true
    };

    UserBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_guest"] == output["is_guest"]);


}


void test_UserBase_timezone_is_converted_to_json()
{

    bourne::json input = 
    {
        "timezone", "hello"
    };

    UserBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["timezone"] == output["timezone"]);



}


void test_UserBase_date_joined_is_converted_to_json()
{

    bourne::json input = 
    {
        "date_joined", "hello"
    };

    UserBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["date_joined"] == output["date_joined"]);



}


void test_UserBase_delivery_email_is_converted_to_json()
{

    bourne::json input = 
    {
        "delivery_email", "hello"
    };

    UserBase obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["delivery_email"] == output["delivery_email"]);



}



