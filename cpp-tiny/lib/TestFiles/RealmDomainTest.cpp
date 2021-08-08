
#include "RealmDomain.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealmDomain_domain_is_assigned_from_json()
{


    bourne::json input = 
    {
        "domain", "hello"
    };

    RealmDomain obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDomain().c_str());






}


void test_RealmDomain_allow_subdomains_is_assigned_from_json()
{




    bourne::json input = 
    {
        "allow_subdomains", true
    };

    RealmDomain obj(input.dump());

    TEST_ASSERT(true == obj.isAllowSubdomains());




}



void test_RealmDomain_domain_is_converted_to_json()
{

    bourne::json input = 
    {
        "domain", "hello"
    };

    RealmDomain obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["domain"] == output["domain"]);



}


void test_RealmDomain_allow_subdomains_is_converted_to_json()
{


    bourne::json input = 
    {
        "allow_subdomains", true
    };

    RealmDomain obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["allow_subdomains"] == output["allow_subdomains"]);


}


