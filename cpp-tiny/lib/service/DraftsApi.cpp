#include "DraftsApi.h"

using namespace Tiny;



        Response<
            JsonSuccess
        >
        DraftsApi::
        createDrafts(
            std::list<Draft> drafts
            
            
        )
        {
            std::string url = basepath + "/drafts"; //
            // Query    | drafts 
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
        DraftsApi::
        deleteDraft(
            
            int draftId
            
        )
        {
            std::string url = basepath + "/drafts/{draft_id}"; //draftId 
            // Query    | 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_draftId("{");
                s_draftId.append("draft_id");
                s_draftId.append("}");

                int pos = url.find(s_draftId);

                url.erase(pos, s_draftId.length());
                url.insert(pos, stringify(draftId));

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
        DraftsApi::
        editDraft(
            
            int draftId
            , 
            
            Draft draft
            
        )
        {
            std::string url = basepath + "/drafts/{draft_id}"; //draftId 
            // Query    | draft 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_draftId("{");
                s_draftId.append("draft_id");
                s_draftId.append("}");

                int pos = url.find(s_draftId);

                url.erase(pos, s_draftId.length());
                url.insert(pos, stringify(draftId));

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
        DraftsApi::
        getDrafts(
        )
        {
            std::string url = basepath + "/drafts"; //
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




            JsonSuccess obj(output_string);


            Response<JsonSuccess> response(obj, httpCode);
            return response;
        }




