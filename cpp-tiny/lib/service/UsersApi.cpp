#include "UsersApi.h"

using namespace Tiny;



        Response<
            JsonSuccessBase
        >
        UsersApi::
        createUser(
            
            std::string email
            , 
            
            std::string password
            , 
            
            std::string fullName
            
        )
        {
            std::string url = basepath + "/users"; //
            // Query    | email password fullName 
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
        UsersApi::
        createUserGroup(
            
            std::string name
            , 
            
            std::string description
            , 
            std::list<int> members
            
            
        )
        {
            std::string url = basepath + "/user_groups/create"; //
            // Query    | name description members 
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
        UsersApi::
        deactivateOwnUser(
        )
        {
            std::string url = basepath + "/users/me"; //
            // Query    | 
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
            JsonSuccess
        >
        UsersApi::
        deactivateUser(
            
            int userId
            
        )
        {
            std::string url = basepath + "/users/{user_id}"; //userId 
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
        UsersApi::
        getAttachments(
        )
        {
            std::string url = basepath + "/attachments"; //
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
        UsersApi::
        getOwnUser(
        )
        {
            std::string url = basepath + "/users/me"; //
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
        UsersApi::
        getUser(
            
            int userId
            , 
            
            bool clientGravatar
            , 
            
            bool includeCustomProfileFields
            
        )
        {
            std::string url = basepath + "/users/{user_id}"; //userId 
            // Query    | clientGravatar includeCustomProfileFields 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_userId("{");
                s_userId.append("user_id");
                s_userId.append("}");

                int pos = url.find(s_userId);

                url.erase(pos, s_userId.length());
                url.insert(pos, stringify(userId));

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
        UsersApi::
        getUserByEmail(
            
            std::string email
            , 
            
            bool clientGravatar
            , 
            
            bool includeCustomProfileFields
            
        )
        {
            std::string url = basepath + "/users/{email}"; //email 
            // Query    | clientGravatar includeCustomProfileFields 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_email("{");
                s_email.append("email");
                s_email.append("}");

                int pos = url.find(s_email);

                url.erase(pos, s_email.length());
                url.insert(pos, stringify(email));

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
        UsersApi::
        getUserGroups(
        )
        {
            std::string url = basepath + "/user_groups"; //
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
        UsersApi::
        getUserPresence(
            
            std::string userIdOrEmail
            
        )
        {
            std::string url = basepath + "/users/{user_id_or_email}/presence"; //userIdOrEmail 
            // Query    | 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_userIdOrEmail("{");
                s_userIdOrEmail.append("user_id_or_email");
                s_userIdOrEmail.append("}");

                int pos = url.find(s_userIdOrEmail);

                url.erase(pos, s_userIdOrEmail.length());
                url.insert(pos, stringify(userIdOrEmail));

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
        UsersApi::
        getUsers(
            
            bool clientGravatar
            , 
            
            bool includeCustomProfileFields
            
        )
        {
            std::string url = basepath + "/users"; //
            // Query    | clientGravatar includeCustomProfileFields 
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
        UsersApi::
        muteUser(
            
            int mutedUserId
            
        )
        {
            std::string url = basepath + "/users/me/muted_users/{muted_user_id}"; //mutedUserId 
            // Query    | 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_mutedUserId("{");
                s_mutedUserId.append("muted_user_id");
                s_mutedUserId.append("}");

                int pos = url.find(s_mutedUserId);

                url.erase(pos, s_mutedUserId.length());
                url.insert(pos, stringify(mutedUserId));

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
        UsersApi::
        reactivateUser(
            
            int userId
            
        )
        {
            std::string url = basepath + "/users/{user_id}/reactivate"; //userId 
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

            begin(url);

            std::string payload = "";
            // Send Request
            // METHOD | POST
            int httpCode = http.sendRequest("POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

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
        UsersApi::
        removeUserGroup(
            
            int userGroupId
            
        )
        {
            std::string url = basepath + "/user_groups/{user_group_id}"; //userGroupId 
            // Query    | 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_userGroupId("{");
                s_userGroupId.append("user_group_id");
                s_userGroupId.append("}");

                int pos = url.find(s_userGroupId);

                url.erase(pos, s_userGroupId.length());
                url.insert(pos, stringify(userGroupId));

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
        UsersApi::
        setTypingStatus(
            
            std::string op
            , 
            std::list<int> to
            
            , 
            
            std::string type
            , 
            
            std::string topic
            
        )
        {
            std::string url = basepath + "/typing"; //
            // Query    | type op to topic 
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
        UsersApi::
        unmuteUser(
            
            int mutedUserId
            
        )
        {
            std::string url = basepath + "/users/me/muted_users/{muted_user_id}"; //mutedUserId 
            // Query    | 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_mutedUserId("{");
                s_mutedUserId.append("muted_user_id");
                s_mutedUserId.append("}");

                int pos = url.find(s_mutedUserId);

                url.erase(pos, s_mutedUserId.length());
                url.insert(pos, stringify(mutedUserId));

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
        UsersApi::
        updateSettings(
            
            std::string fullName
            , 
            
            std::string email
            , 
            
            std::string oldPassword
            , 
            
            std::string newPassword
            , 
            
            bool twentyFourHourTime
            , 
            
            bool denseMode
            , 
            
            bool starredMessageCounts
            , 
            
            bool fluidLayoutWidth
            , 
            
            bool highContrastMode
            , 
            
            int colorScheme
            , 
            
            bool enableDraftsSynchronization
            , 
            
            bool translateEmoticons
            , 
            
            std::string defaultLanguage
            , 
            
            std::string defaultView
            , 
            
            bool leftSideUserlist
            , 
            
            std::string emojiset
            , 
            
            int demoteInactiveStreams
            , 
            
            std::string timezone
            , 
            
            bool enableStreamDesktopNotifications
            , 
            
            bool enableStreamEmailNotifications
            , 
            
            bool enableStreamPushNotifications
            , 
            
            bool enableStreamAudibleNotifications
            , 
            
            std::string notificationSound
            , 
            
            bool enableDesktopNotifications
            , 
            
            bool enableSounds
            , 
            
            int emailNotificationsBatchingPeriodSeconds
            , 
            
            bool enableOfflineEmailNotifications
            , 
            
            bool enableOfflinePushNotifications
            , 
            
            bool enableOnlinePushNotifications
            , 
            
            bool enableDigestEmails
            , 
            
            bool enableMarketingEmails
            , 
            
            bool enableLoginEmails
            , 
            
            bool messageContentInEmailNotifications
            , 
            
            bool pmContentInDesktopNotifications
            , 
            
            bool wildcardMentionsNotify
            , 
            
            int desktopIconCountDisplay
            , 
            
            bool realmNameInNotifications
            , 
            
            bool presenceEnabled
            , 
            
            bool enterSends
            
        )
        {
            std::string url = basepath + "/settings"; //
            // Query    | fullName email oldPassword newPassword twentyFourHourTime denseMode starredMessageCounts fluidLayoutWidth highContrastMode colorScheme enableDraftsSynchronization translateEmoticons defaultLanguage defaultView leftSideUserlist emojiset demoteInactiveStreams timezone enableStreamDesktopNotifications enableStreamEmailNotifications enableStreamPushNotifications enableStreamAudibleNotifications notificationSound enableDesktopNotifications enableSounds emailNotificationsBatchingPeriodSeconds enableOfflineEmailNotifications enableOfflinePushNotifications enableOnlinePushNotifications enableDigestEmails enableMarketingEmails enableLoginEmails messageContentInEmailNotifications pmContentInDesktopNotifications wildcardMentionsNotify desktopIconCountDisplay realmNameInNotifications presenceEnabled enterSends 
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

        Response<
            JsonSuccess
        >
        UsersApi::
        updateStatus(
            
            std::string statusText
            , 
            
            bool away
            , 
            
            std::string emojiName
            , 
            
            std::string emojiCode
            , 
            
            std::string reactionType
            
        )
        {
            std::string url = basepath + "/users/me/status"; //
            // Query    | statusText away emojiName emojiCode reactionType 
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
        UsersApi::
        updateUser(
            
            int userId
            , 
            
            std::string fullName
            , 
            
            int role
            , 
            std::list<Object> profileData
            
            
        )
        {
            std::string url = basepath + "/users/{user_id}"; //userId 
            // Query    | fullName role profileData 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_userId("{");
                s_userId.append("user_id");
                s_userId.append("}");

                int pos = url.find(s_userId);

                url.erase(pos, s_userId.length());
                url.insert(pos, stringify(userId));

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
        UsersApi::
        updateUserGroup(
            
            int userGroupId
            , 
            
            std::string name
            , 
            
            std::string description
            
        )
        {
            std::string url = basepath + "/user_groups/{user_group_id}"; //userGroupId 
            // Query    | name description 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_userGroupId("{");
                s_userGroupId.append("user_group_id");
                s_userGroupId.append("}");

                int pos = url.find(s_userGroupId);

                url.erase(pos, s_userGroupId.length());
                url.insert(pos, stringify(userGroupId));

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
        UsersApi::
        updateUserGroupMembers(
            
            int userGroupId
            , 
            std::list<int> r_delete
            
            , 
            std::list<int> add
            
            
        )
        {
            std::string url = basepath + "/user_groups/{user_group_id}/members"; //userGroupId 
            // Query    | r_delete add 
            // Headers  | 
            // Form     | 
            // Body     | 

                std::string s_userGroupId("{");
                s_userGroupId.append("user_group_id");
                s_userGroupId.append("}");

                int pos = url.find(s_userGroupId);

                url.erase(pos, s_userGroupId.length());
                url.insert(pos, stringify(userGroupId));

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




