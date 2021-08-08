
#include "Subscriptions.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Subscriptions_stream_id_is_assigned_from_json()
{
    bourne::json input = 
    {
        "stream_id", 1
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStreamId());








}


void test_Subscriptions_name_is_assigned_from_json()
{


    bourne::json input = 
    {
        "name", "hello"
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_Subscriptions_description_is_assigned_from_json()
{


    bourne::json input = 
    {
        "description", "hello"
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_Subscriptions_rendered_description_is_assigned_from_json()
{


    bourne::json input = 
    {
        "rendered_description", "hello"
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRenderedDescription().c_str());






}


void test_Subscriptions_date_created_is_assigned_from_json()
{
    bourne::json input = 
    {
        "date_created", 1
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getDateCreated());








}


void test_Subscriptions_invite_only_is_assigned_from_json()
{




    bourne::json input = 
    {
        "invite_only", true
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT(true == obj.isInviteOnly());




}



void test_Subscriptions_desktop_notifications_is_assigned_from_json()
{




    bourne::json input = 
    {
        "desktop_notifications", true
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT(true == obj.isDesktopNotifications());




}


void test_Subscriptions_email_notifications_is_assigned_from_json()
{




    bourne::json input = 
    {
        "email_notifications", true
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT(true == obj.isEmailNotifications());




}


void test_Subscriptions_wildcard_mentions_notify_is_assigned_from_json()
{




    bourne::json input = 
    {
        "wildcard_mentions_notify", true
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT(true == obj.isWildcardMentionsNotify());




}


void test_Subscriptions_push_notifications_is_assigned_from_json()
{




    bourne::json input = 
    {
        "push_notifications", true
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT(true == obj.isPushNotifications());




}


void test_Subscriptions_audible_notifications_is_assigned_from_json()
{




    bourne::json input = 
    {
        "audible_notifications", true
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT(true == obj.isAudibleNotifications());




}


void test_Subscriptions_pin_to_top_is_assigned_from_json()
{




    bourne::json input = 
    {
        "pin_to_top", true
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT(true == obj.isPinToTop());




}


void test_Subscriptions_email_address_is_assigned_from_json()
{


    bourne::json input = 
    {
        "email_address", "hello"
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEmailAddress().c_str());






}


void test_Subscriptions_is_muted_is_assigned_from_json()
{




    bourne::json input = 
    {
        "is_muted", true
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT(true == obj.isIsMuted());




}


void test_Subscriptions_in_home_view_is_assigned_from_json()
{




    bourne::json input = 
    {
        "in_home_view", true
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT(true == obj.isInHomeView());




}


void test_Subscriptions_is_announcement_only_is_assigned_from_json()
{




    bourne::json input = 
    {
        "is_announcement_only", true
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT(true == obj.isIsAnnouncementOnly());




}


void test_Subscriptions_is_web_public_is_assigned_from_json()
{




    bourne::json input = 
    {
        "is_web_public", true
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT(true == obj.isIsWebPublic());




}


void test_Subscriptions_role_is_assigned_from_json()
{
    bourne::json input = 
    {
        "role", 1
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRole());








}


void test_Subscriptions_color_is_assigned_from_json()
{


    bourne::json input = 
    {
        "color", "hello"
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getColor().c_str());






}


void test_Subscriptions_stream_post_policy_is_assigned_from_json()
{
    bourne::json input = 
    {
        "stream_post_policy", 1
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStreamPostPolicy());








}


void test_Subscriptions_message_retention_days_is_assigned_from_json()
{
    bourne::json input = 
    {
        "message_retention_days", 1
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMessageRetentionDays());








}


void test_Subscriptions_history_public_to_subscribers_is_assigned_from_json()
{




    bourne::json input = 
    {
        "history_public_to_subscribers", true
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT(true == obj.isHistoryPublicToSubscribers());




}


void test_Subscriptions_first_message_id_is_assigned_from_json()
{
    bourne::json input = 
    {
        "first_message_id", 1
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFirstMessageId());








}


void test_Subscriptions_stream_weekly_traffic_is_assigned_from_json()
{
    bourne::json input = 
    {
        "stream_weekly_traffic", 1
    };

    Subscriptions obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStreamWeeklyTraffic());








}



void test_Subscriptions_stream_id_is_converted_to_json()
{
    bourne::json input = 
    {
        "stream_id", 1
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["stream_id"] == output["stream_id"]);




}


void test_Subscriptions_name_is_converted_to_json()
{

    bourne::json input = 
    {
        "name", "hello"
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_Subscriptions_description_is_converted_to_json()
{

    bourne::json input = 
    {
        "description", "hello"
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_Subscriptions_rendered_description_is_converted_to_json()
{

    bourne::json input = 
    {
        "rendered_description", "hello"
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["rendered_description"] == output["rendered_description"]);



}


void test_Subscriptions_date_created_is_converted_to_json()
{
    bourne::json input = 
    {
        "date_created", 1
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["date_created"] == output["date_created"]);




}


void test_Subscriptions_invite_only_is_converted_to_json()
{


    bourne::json input = 
    {
        "invite_only", true
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["invite_only"] == output["invite_only"]);


}



void test_Subscriptions_desktop_notifications_is_converted_to_json()
{


    bourne::json input = 
    {
        "desktop_notifications", true
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["desktop_notifications"] == output["desktop_notifications"]);


}


void test_Subscriptions_email_notifications_is_converted_to_json()
{


    bourne::json input = 
    {
        "email_notifications", true
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["email_notifications"] == output["email_notifications"]);


}


void test_Subscriptions_wildcard_mentions_notify_is_converted_to_json()
{


    bourne::json input = 
    {
        "wildcard_mentions_notify", true
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["wildcard_mentions_notify"] == output["wildcard_mentions_notify"]);


}


void test_Subscriptions_push_notifications_is_converted_to_json()
{


    bourne::json input = 
    {
        "push_notifications", true
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["push_notifications"] == output["push_notifications"]);


}


void test_Subscriptions_audible_notifications_is_converted_to_json()
{


    bourne::json input = 
    {
        "audible_notifications", true
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["audible_notifications"] == output["audible_notifications"]);


}


void test_Subscriptions_pin_to_top_is_converted_to_json()
{


    bourne::json input = 
    {
        "pin_to_top", true
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pin_to_top"] == output["pin_to_top"]);


}


void test_Subscriptions_email_address_is_converted_to_json()
{

    bourne::json input = 
    {
        "email_address", "hello"
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["email_address"] == output["email_address"]);



}


void test_Subscriptions_is_muted_is_converted_to_json()
{


    bourne::json input = 
    {
        "is_muted", true
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_muted"] == output["is_muted"]);


}


void test_Subscriptions_in_home_view_is_converted_to_json()
{


    bourne::json input = 
    {
        "in_home_view", true
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["in_home_view"] == output["in_home_view"]);


}


void test_Subscriptions_is_announcement_only_is_converted_to_json()
{


    bourne::json input = 
    {
        "is_announcement_only", true
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_announcement_only"] == output["is_announcement_only"]);


}


void test_Subscriptions_is_web_public_is_converted_to_json()
{


    bourne::json input = 
    {
        "is_web_public", true
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_web_public"] == output["is_web_public"]);


}


void test_Subscriptions_role_is_converted_to_json()
{
    bourne::json input = 
    {
        "role", 1
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["role"] == output["role"]);




}


void test_Subscriptions_color_is_converted_to_json()
{

    bourne::json input = 
    {
        "color", "hello"
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["color"] == output["color"]);



}


void test_Subscriptions_stream_post_policy_is_converted_to_json()
{
    bourne::json input = 
    {
        "stream_post_policy", 1
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["stream_post_policy"] == output["stream_post_policy"]);




}


void test_Subscriptions_message_retention_days_is_converted_to_json()
{
    bourne::json input = 
    {
        "message_retention_days", 1
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message_retention_days"] == output["message_retention_days"]);




}


void test_Subscriptions_history_public_to_subscribers_is_converted_to_json()
{


    bourne::json input = 
    {
        "history_public_to_subscribers", true
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["history_public_to_subscribers"] == output["history_public_to_subscribers"]);


}


void test_Subscriptions_first_message_id_is_converted_to_json()
{
    bourne::json input = 
    {
        "first_message_id", 1
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["first_message_id"] == output["first_message_id"]);




}


void test_Subscriptions_stream_weekly_traffic_is_converted_to_json()
{
    bourne::json input = 
    {
        "stream_weekly_traffic", 1
    };

    Subscriptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["stream_weekly_traffic"] == output["stream_weekly_traffic"]);




}


