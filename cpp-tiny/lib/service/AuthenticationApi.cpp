#include "AuthenticationApi.h"

using namespace Tiny;



        Response<
            ApiKeyResponse
        >
        AuthenticationApi::
        devFetchApiKey(
            
            std::string username
            
        )
        {
            std::string url = basepath + "/dev_fetch_api_key"; //
            // Query    | username 
            // Headers  | 
            // Form     | 
            // Body     | 


            begin(url);

            std::string payload = "";
            // Send Request
            // METHOD | POST
            int httpCode = http.sendRequest("POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = http.getString();
            std::string output_string = output.c_str();

            http.end();




            ApiKeyResponse obj(output_string);


            Response<ApiKeyResponse> response(obj, httpCode);
            return response;
        }

        Response<
            ApiKeyResponse
        >
        AuthenticationApi::
        fetchApiKey(
            
            std::string username
            , 
            
            std::string password
            
        )
        {
            std::string url = basepath + "/fetch_api_key"; //
            // Query    | username password 
            // Headers  | 
            // Form     | 
            // Body     | 


            begin(url);

            std::string payload = "";
            // Send Request
            // METHOD | POST
            int httpCode = http.sendRequest("POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = http.getString();
            std::string output_string = output.c_str();

            http.end();




            ApiKeyResponse obj(output_string);


            Response<ApiKeyResponse> response(obj, httpCode);
            return response;
        }




