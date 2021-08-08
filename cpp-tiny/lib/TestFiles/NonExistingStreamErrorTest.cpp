
#include "NonExistingStreamError.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"






void test_NonExistingStreamError_stream_is_assigned_from_json()
{


    bourne::json input = 
    {
        "stream", "hello"
    };

    NonExistingStreamError obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStream().c_str());






}






void test_NonExistingStreamError_stream_is_converted_to_json()
{

    bourne::json input = 
    {
        "stream", "hello"
    };

    NonExistingStreamError obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["stream"] == output["stream"]);



}


