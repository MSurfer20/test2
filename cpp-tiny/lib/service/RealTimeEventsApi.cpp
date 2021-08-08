#include "RealTimeEventsApi.h"

using namespace Tiny;



        Response<
            JsonSuccess
        >
        RealTimeEventsApi::
        deleteQueue(
            
            std::string queueId
            
        )
        {
            std::string url = basepath + "/events"; //
            // Query    | queueId 
            // Headers  | 
            // Form     | 
            // Body     | 


            begin(url);

            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            int httpCode = http.sendRequest("DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = http.getString();
            std::string output_string = output.c_str();

            http.end();




            JsonSuccess obj(output_string);


            Response<JsonSuccess> response(obj, httpCode);
            return response;
        }

        Response<
            JsonSuccessBase
        >
        RealTimeEventsApi::
        getEvents(
            
            std::string queueId
            , 
            
            int lastEventId
            , 
            
            bool dontBlock
            
        )
        {
            std::string url = basepath + "/events"; //
            // Query    | queueId lastEventId dontBlock 
            // Headers  | 
            // Form     | 
            // Body     | 


            begin(url);

            std::string payload = "";
            // Send Request
            // METHOD | GET
            int httpCode = http.sendRequest("GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = http.getString();
            std::string output_string = output.c_str();

            http.end();




            JsonSuccessBase obj(output_string);


            Response<JsonSuccessBase> response(obj, httpCode);
            return response;
        }

        Response<
            String
        >
        RealTimeEventsApi::
        realTimePost(
            std::list<std::string> eventTypes
            
            , 
            std::list<std::list> narrow
            
            , 
            
            bool allPublicStreams
            
        )
        {
            std::string url = basepath + "/real-time"; //
            // Query    | eventTypes narrow allPublicStreams 
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


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            JsonSuccessBase
        >
        RealTimeEventsApi::
        registerQueue(
            
            bool applyMarkdown
            , 
            
            bool clientGravatar
            , 
            
            bool slimPresence
            , 
            std::list<std::string> eventTypes
            
            , 
            
            bool allPublicStreams
            , 
            
            bool includeSubscribers
            , 
            
            Object clientCapabilities
            , 
            std::list<std::string> fetchEventTypes
            
            , 
            std::list<std::list> narrow
            
            
        )
        {
            std::string url = basepath + "/register"; //
            // Query    | applyMarkdown clientGravatar slimPresence eventTypes allPublicStreams includeSubscribers clientCapabilities fetchEventTypes narrow 
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




            JsonSuccessBase obj(output_string);


            Response<JsonSuccessBase> response(obj, httpCode);
            return response;
        }

        Response<
            String
        >
        RealTimeEventsApi::
        restErrorHandling(
        )
        {
            std::string url = basepath + "/rest-error-handling"; //
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


            Response<String> response(output, httpCode);
            return response;
        }




