#include "MessagesApi.h"

using namespace Tiny;



        Response<
            JsonSuccess
        >
        MessagesApi::
        addReaction(
            
            int messageId
            , 
            
            std::string emojiName
            , 
            
            std::string emojiCode
            , 
            
            std::string reactionType
            
        )
        {
            std::string url = basepath + "/messages/{message_id}/reactions"; //messageId 
            // Query    | emojiName emojiCode reactionType 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_messageId("{");
                s_messageId.append("message_id");
                s_messageId.append("}");

                int pos = url.find(s_messageId);

                url.erase(pos, s_messageId.length());
                url.insert(pos, stringify(messageId));

            begin(url);

            std::string payload = "";
            // Send Request
            // METHOD | POST
            int httpCode = http.sendRequest("POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = http.getString();
            std::string output_string = output.c_str();

            http.end();




            JsonSuccess obj(output_string);


            Response<JsonSuccess> response(obj, httpCode);
            return response;
        }

        Response<
            AnyType
        >
        MessagesApi::
        checkMessagesMatchNarrow(
            std::list<int> msgIds
            
            , 
            std::list<Object> narrow
            
            
        )
        {
            std::string url = basepath + "/messages/matches_narrow"; //
            // Query    | msgIds narrow 
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




            AnyType obj(output_string);


            Response<AnyType> response(obj, httpCode);
            return response;
        }

        Response<
            JsonSuccess
        >
        MessagesApi::
        deleteMessage(
            
            int messageId
            
        )
        {
            std::string url = basepath + "/messages/{message_id}"; //messageId 
            // Query    | 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_messageId("{");
                s_messageId.append("message_id");
                s_messageId.append("}");

                int pos = url.find(s_messageId);

                url.erase(pos, s_messageId.length());
                url.insert(pos, stringify(messageId));

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
        MessagesApi::
        getFileTemporaryUrl(
            
            int realmIdStr
            , 
            
            std::string filename
            
        )
        {
            std::string url = basepath + "/user_uploads/{realm_id_str}/{filename}"; //realmIdStr filename 
            // Query    | 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_realmIdStr("{");
                s_realmIdStr.append("realm_id_str");
                s_realmIdStr.append("}");

                int pos = url.find(s_realmIdStr);

                url.erase(pos, s_realmIdStr.length());
                url.insert(pos, stringify(realmIdStr));
                std::string s_filename("{");
                s_filename.append("filename");
                s_filename.append("}");

                int pos = url.find(s_filename);

                url.erase(pos, s_filename.length());
                url.insert(pos, stringify(filename));

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
        MessagesApi::
        getMessageHistory(
            
            int messageId
            
        )
        {
            std::string url = basepath + "/messages/{message_id}/history"; //messageId 
            // Query    | 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_messageId("{");
                s_messageId.append("message_id");
                s_messageId.append("}");

                int pos = url.find(s_messageId);

                url.erase(pos, s_messageId.length());
                url.insert(pos, stringify(messageId));

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
        MessagesApi::
        getMessages(
            
            int numBefore
            , 
            
            int numAfter
            , 
            
            OneOf<string,integer> anchor
            , 
            std::list<Object> narrow
            
            , 
            
            bool clientGravatar
            , 
            
            bool applyMarkdown
            , 
            
            bool useFirstUnreadAnchor
            
        )
        {
            std::string url = basepath + "/messages"; //
            // Query    | anchor numBefore numAfter narrow clientGravatar applyMarkdown useFirstUnreadAnchor 
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
        MessagesApi::
        getRawMessage(
            
            int messageId
            
        )
        {
            std::string url = basepath + "/messages/{message_id}"; //messageId 
            // Query    | 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_messageId("{");
                s_messageId.append("message_id");
                s_messageId.append("}");

                int pos = url.find(s_messageId);

                url.erase(pos, s_messageId.length());
                url.insert(pos, stringify(messageId));

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
        MessagesApi::
        markAllAsRead(
        )
        {
            std::string url = basepath + "/mark_all_as_read"; //
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




            JsonSuccess obj(output_string);


            Response<JsonSuccess> response(obj, httpCode);
            return response;
        }

        Response<
            JsonSuccess
        >
        MessagesApi::
        markStreamAsRead(
            
            int streamId
            
        )
        {
            std::string url = basepath + "/mark_stream_as_read"; //
            // Query    | streamId 
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




            JsonSuccess obj(output_string);


            Response<JsonSuccess> response(obj, httpCode);
            return response;
        }

        Response<
            JsonSuccess
        >
        MessagesApi::
        markTopicAsRead(
            
            int streamId
            , 
            
            std::string topicName
            
        )
        {
            std::string url = basepath + "/mark_topic_as_read"; //
            // Query    | streamId topicName 
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




            JsonSuccess obj(output_string);


            Response<JsonSuccess> response(obj, httpCode);
            return response;
        }

        Response<
            JsonSuccess
        >
        MessagesApi::
        removeReaction(
            
            int messageId
            , 
            
            std::string emojiName
            , 
            
            std::string emojiCode
            , 
            
            std::string reactionType
            
        )
        {
            std::string url = basepath + "/messages/{message_id}/reactions"; //messageId 
            // Query    | emojiName emojiCode reactionType 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_messageId("{");
                s_messageId.append("message_id");
                s_messageId.append("}");

                int pos = url.find(s_messageId);

                url.erase(pos, s_messageId.length());
                url.insert(pos, stringify(messageId));

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
        MessagesApi::
        renderMessage(
            
            std::string content
            
        )
        {
            std::string url = basepath + "/messages/render"; //
            // Query    | content 
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
        MessagesApi::
        sendMessage(
            
            std::string type
            , 
            std::list<int> to
            
            , 
            
            std::string content
            , 
            
            std::string topic
            , 
            
            std::string queueId
            , 
            
            std::string localId
            
        )
        {
            std::string url = basepath + "/messages"; //
            // Query    | type to content topic queueId localId 
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
            JsonSuccess
        >
        MessagesApi::
        updateMessage(
            
            int messageId
            , 
            
            std::string topic
            , 
            
            std::string propagateMode
            , 
            
            bool sendNotificationToOldThread
            , 
            
            bool sendNotificationToNewThread
            , 
            
            std::string content
            , 
            
            int streamId
            
        )
        {
            std::string url = basepath + "/messages/{message_id}"; //messageId 
            // Query    | topic propagateMode sendNotificationToOldThread sendNotificationToNewThread content streamId 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_messageId("{");
                s_messageId.append("message_id");
                s_messageId.append("}");

                int pos = url.find(s_messageId);

                url.erase(pos, s_messageId.length());
                url.insert(pos, stringify(messageId));

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
        MessagesApi::
        updateMessageFlags(
            std::list<int> messages
            
            , 
            
            std::string op
            , 
            
            std::string flag
            
        )
        {
            std::string url = basepath + "/messages/flags"; //
            // Query    | messages op flag 
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
        MessagesApi::
        uploadFile(
            
            std::string filename
            
        )
        {
            std::string url = basepath + "/user_uploads"; //
            // Query    | 
            // Headers  | 
            // Form     | filename 
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




