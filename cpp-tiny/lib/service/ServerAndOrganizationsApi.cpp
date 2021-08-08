#include "ServerAndOrganizationsApi.h"

using namespace Tiny;



        Response<
            JsonSuccessBase
        >
        ServerAndOrganizationsApi::
        addCodePlayground(
            
            std::string name
            , 
            
            std::string pygmentsLanguage
            , 
            
            std::string urlPrefix
            
        )
        {
            std::string url = basepath + "/realm/playgrounds"; //
            // Query    | name pygmentsLanguage urlPrefix 
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
        ServerAndOrganizationsApi::
        addLinkifier(
            
            std::string pattern
            , 
            
            std::string urlFormatString
            
        )
        {
            std::string url = basepath + "/realm/filters"; //
            // Query    | pattern urlFormatString 
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
        ServerAndOrganizationsApi::
        createCustomProfileField(
            
            int fieldType
            , 
            
            std::string name
            , 
            
            std::string hint
            , 
            
            Object fieldData
            
        )
        {
            std::string url = basepath + "/realm/profile_fields"; //
            // Query    | name hint fieldType fieldData 
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
        ServerAndOrganizationsApi::
        getCustomEmoji(
        )
        {
            std::string url = basepath + "/realm/emoji"; //
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
        ServerAndOrganizationsApi::
        getCustomProfileFields(
        )
        {
            std::string url = basepath + "/realm/profile_fields"; //
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
        ServerAndOrganizationsApi::
        getLinkifiers(
        )
        {
            std::string url = basepath + "/realm/linkifiers"; //
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
        ServerAndOrganizationsApi::
        getServerSettings(
        )
        {
            std::string url = basepath + "/server_settings"; //
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
            JsonSuccess
        >
        ServerAndOrganizationsApi::
        removeCodePlayground(
            
            int playgroundId
            
        )
        {
            std::string url = basepath + "/realm/playgrounds/{playground_id}"; //playgroundId 
            // Query    | 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_playgroundId("{");
                s_playgroundId.append("playground_id");
                s_playgroundId.append("}");

                int pos = url.find(s_playgroundId);

                url.erase(pos, s_playgroundId.length());
                url.insert(pos, stringify(playgroundId));

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
            JsonSuccess
        >
        ServerAndOrganizationsApi::
        removeLinkifier(
            
            int filterId
            
        )
        {
            std::string url = basepath + "/realm/filters/{filter_id}"; //filterId 
            // Query    | 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_filterId("{");
                s_filterId.append("filter_id");
                s_filterId.append("}");

                int pos = url.find(s_filterId);

                url.erase(pos, s_filterId.length());
                url.insert(pos, stringify(filterId));

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
            JsonSuccess
        >
        ServerAndOrganizationsApi::
        reorderCustomProfileFields(
            std::list<int> order
            
            
        )
        {
            std::string url = basepath + "/realm/profile_fields"; //
            // Query    | order 
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
            JsonSuccess
        >
        ServerAndOrganizationsApi::
        updateLinkifier(
            
            int filterId
            , 
            
            std::string pattern
            , 
            
            std::string urlFormatString
            
        )
        {
            std::string url = basepath + "/realm/filters/{filter_id}"; //filterId 
            // Query    | pattern urlFormatString 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_filterId("{");
                s_filterId.append("filter_id");
                s_filterId.append("}");

                int pos = url.find(s_filterId);

                url.erase(pos, s_filterId.length());
                url.insert(pos, stringify(filterId));

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
            JsonSuccess
        >
        ServerAndOrganizationsApi::
        uploadCustomEmoji(
            
            std::string emojiName
            , 
            
            std::string filename
            
        )
        {
            std::string url = basepath + "/realm/emoji/{emoji_name}"; //emojiName 
            // Query    | 
            // Headers  | 
            // Form     | filename 
            // Body     | 

                std::string s_emojiName("{");
                s_emojiName.append("emoji_name");
                s_emojiName.append("}");

                int pos = url.find(s_emojiName);

                url.erase(pos, s_emojiName.length());
                url.insert(pos, stringify(emojiName));

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




