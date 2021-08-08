#include "StreamsApi.h"

using namespace Tiny;



        Response<
            JsonSuccess
        >
        StreamsApi::
        archiveStream(
            
            int streamId
            
        )
        {
            std::string url = basepath + "/streams/{stream_id}"; //streamId 
            // Query    | 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_streamId("{");
                s_streamId.append("stream_id");
                s_streamId.append("}");

                int pos = url.find(s_streamId);

                url.erase(pos, s_streamId.length());
                url.insert(pos, stringify(streamId));

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
        StreamsApi::
        createBigBlueButtonVideoCall(
        )
        {
            std::string url = basepath + "/calls/bigbluebutton/create"; //
            // Query    | 
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
            JsonSuccessBase
        >
        StreamsApi::
        getStreamId(
            
            std::string stream
            
        )
        {
            std::string url = basepath + "/get_stream_id"; //
            // Query    | stream 
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
            JsonSuccessBase
        >
        StreamsApi::
        getStreamTopics(
            
            int streamId
            
        )
        {
            std::string url = basepath + "/users/me/{stream_id}/topics"; //streamId 
            // Query    | 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_streamId("{");
                s_streamId.append("stream_id");
                s_streamId.append("}");

                int pos = url.find(s_streamId);

                url.erase(pos, s_streamId.length());
                url.insert(pos, stringify(streamId));

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
            JsonSuccessBase
        >
        StreamsApi::
        getStreams(
            
            bool includePublic
            , 
            
            bool includeWebPublic
            , 
            
            bool includeSubscribed
            , 
            
            bool includeAllActive
            , 
            
            bool includeDefault
            , 
            
            bool includeOwnerSubscribed
            
        )
        {
            std::string url = basepath + "/streams"; //
            // Query    | includePublic includeWebPublic includeSubscribed includeAllActive includeDefault includeOwnerSubscribed 
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
            JsonSuccessBase
        >
        StreamsApi::
        getSubscriptionStatus(
            
            int userId
            , 
            
            int streamId
            
        )
        {
            std::string url = basepath + "/users/{user_id}/subscriptions/{stream_id}"; //userId streamId 
            // Query    | 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_userId("{");
                s_userId.append("user_id");
                s_userId.append("}");

                int pos = url.find(s_userId);

                url.erase(pos, s_userId.length());
                url.insert(pos, stringify(userId));
                std::string s_streamId("{");
                s_streamId.append("stream_id");
                s_streamId.append("}");

                int pos = url.find(s_streamId);

                url.erase(pos, s_streamId.length());
                url.insert(pos, stringify(streamId));

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
            JsonSuccessBase
        >
        StreamsApi::
        getSubscriptions(
            
            bool includeSubscribers
            
        )
        {
            std::string url = basepath + "/users/me/subscriptions"; //
            // Query    | includeSubscribers 
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
            JsonSuccess
        >
        StreamsApi::
        muteTopic(
            
            std::string topic
            , 
            
            std::string op
            , 
            
            std::string stream
            , 
            
            int streamId
            
        )
        {
            std::string url = basepath + "/users/me/subscriptions/muted_topics"; //
            // Query    | stream streamId topic op 
            // Headers  | 
            // Form     | 
            // Body     | 


            begin(url);

            std::string payload = "";
            // Send Request
            // METHOD | PATCH
            int httpCode = http.sendRequest("PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = http.getString();
            std::string output_string = output.c_str();

            http.end();




            JsonSuccess obj(output_string);


            Response<JsonSuccess> response(obj, httpCode);
            return response;
        }

        Response<
            OneOf&lt;object,object&gt;
        >
        StreamsApi::
        subscribe(
            std::list<Object> subscriptions
            
            , 
            std::list<OneOf&lt;string,integer&gt;> principals
            
            , 
            
            bool authorizationErrorsFatal
            , 
            
            bool announce
            , 
            
            bool inviteOnly
            , 
            
            bool historyPublicToSubscribers
            , 
            
            int streamPostPolicy
            , 
            
            OneOf<string,integer> messageRetentionDays
            
        )
        {
            std::string url = basepath + "/users/me/subscriptions"; //
            // Query    | subscriptions principals authorizationErrorsFatal announce inviteOnly historyPublicToSubscribers streamPostPolicy messageRetentionDays 
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




            OneOf&lt;object,object&gt; obj(output_string);


            Response<OneOf&lt;object,object&gt;> response(obj, httpCode);
            return response;
        }

        Response<
            JsonSuccessBase
        >
        StreamsApi::
        unsubscribe(
            std::list<std::string> subscriptions
            
            , 
            std::list<OneOf&lt;string,integer&gt;> principals
            
            
        )
        {
            std::string url = basepath + "/users/me/subscriptions"; //
            // Query    | subscriptions principals 
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




            JsonSuccessBase obj(output_string);


            Response<JsonSuccessBase> response(obj, httpCode);
            return response;
        }

        Response<
            JsonSuccess
        >
        StreamsApi::
        updateStream(
            
            int streamId
            , 
            
            std::string description
            , 
            
            std::string newName
            , 
            
            bool isPrivate
            , 
            
            bool isAnnouncementOnly
            , 
            
            int streamPostPolicy
            , 
            
            bool historyPublicToSubscribers
            , 
            
            OneOf<string,integer> messageRetentionDays
            
        )
        {
            std::string url = basepath + "/streams/{stream_id}"; //streamId 
            // Query    | description newName isPrivate isAnnouncementOnly streamPostPolicy historyPublicToSubscribers messageRetentionDays 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_streamId("{");
                s_streamId.append("stream_id");
                s_streamId.append("}");

                int pos = url.find(s_streamId);

                url.erase(pos, s_streamId.length());
                url.insert(pos, stringify(streamId));

            begin(url);

            std::string payload = "";
            // Send Request
            // METHOD | PATCH
            int httpCode = http.sendRequest("PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

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
        StreamsApi::
        updateSubscriptionSettings(
            std::list<Object> subscriptionData
            
            
        )
        {
            std::string url = basepath + "/users/me/subscriptions/properties"; //
            // Query    | subscriptionData 
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
            JsonSuccessBase
        >
        StreamsApi::
        updateSubscriptions(
            std::list<std::string> r_delete
            
            , 
            std::list<Object> add
            
            
        )
        {
            std::string url = basepath + "/users/me/subscriptions"; //
            // Query    | r_delete add 
            // Headers  | 
            // Form     | 
            // Body     | 


            begin(url);

            std::string payload = "";
            // Send Request
            // METHOD | PATCH
            int httpCode = http.sendRequest("PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = http.getString();
            std::string output_string = output.c_str();

            http.end();




            JsonSuccessBase obj(output_string);


            Response<JsonSuccessBase> response(obj, httpCode);
            return response;
        }




