#include "WebhooksApi.h"

using namespace Tiny;



        Response<
            Inline_response_200
        >
        WebhooksApi::
        zulipOutgoingWebhooks(
        )
        {
            std::string url = basepath + "/zulip-outgoing-webhook"; //
            // Query    | 
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




            Inline_response_200 obj(output_string);


            Response<Inline_response_200> response(obj, httpCode);
            return response;
        }




