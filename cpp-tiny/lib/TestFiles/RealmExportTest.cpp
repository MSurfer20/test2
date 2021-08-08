
#include "RealmExport.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealmExport_id_is_assigned_from_json()
{
    bourne::json input = 
    {
        "id", 1
    };

    RealmExport obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}


void test_RealmExport_acting_user_id_is_assigned_from_json()
{
    bourne::json input = 
    {
        "acting_user_id", 1
    };

    RealmExport obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getActingUserId());








}


void test_RealmExport_export_time_is_assigned_from_json()
{








}


void test_RealmExport_deleted_timestamp_is_assigned_from_json()
{








}


void test_RealmExport_failed_timestamp_is_assigned_from_json()
{








}


void test_RealmExport_export_url_is_assigned_from_json()
{


    bourne::json input = 
    {
        "export_url", "hello"
    };

    RealmExport obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getExportUrl().c_str());






}


void test_RealmExport_pending_is_assigned_from_json()
{




    bourne::json input = 
    {
        "pending", true
    };

    RealmExport obj(input.dump());

    TEST_ASSERT(true == obj.isPending());




}



void test_RealmExport_id_is_converted_to_json()
{
    bourne::json input = 
    {
        "id", 1
    };

    RealmExport obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


void test_RealmExport_acting_user_id_is_converted_to_json()
{
    bourne::json input = 
    {
        "acting_user_id", 1
    };

    RealmExport obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["acting_user_id"] == output["acting_user_id"]);




}


void test_RealmExport_export_time_is_converted_to_json()
{




}


void test_RealmExport_deleted_timestamp_is_converted_to_json()
{




}


void test_RealmExport_failed_timestamp_is_converted_to_json()
{




}


void test_RealmExport_export_url_is_converted_to_json()
{

    bourne::json input = 
    {
        "export_url", "hello"
    };

    RealmExport obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["export_url"] == output["export_url"]);



}


void test_RealmExport_pending_is_converted_to_json()
{


    bourne::json input = 
    {
        "pending", true
    };

    RealmExport obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pending"] == output["pending"]);


}


