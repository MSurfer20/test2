cmake_minimum_required (VERSION 2.6)
project (CGenerator)

cmake_policy(SET CMP0063 NEW)

set(CMAKE_C_VISIBILITY_PRESET default)
set(CMAKE_CXX_VISIBILITY_PRESET default)
set(CMAKE_VISIBILITY_INLINES_HIDDEN OFF)
set(CMAKE_BUILD_TYPE Debug)

find_package(OpenSSL)

if (OPENSSL_FOUND)
	message (STATUS "OPENSSL found")
	set (CMAKE_C_FLAGS "-DOPENSSL")
	include_directories(${OPENSSL_INCLUDE_DIR})
	include_directories(${OPENSSL_INCLUDE_DIRS})
	link_directories(${OPENSSL_LIBRARIES})
	message(STATUS "Using OpenSSL ${OPENSSL_VERSION}")
else() 
	message (STATUS "OpenSSL Not found.")
endif()

set(pkgName "zulip_rest_api")

find_package(CURL 7.58.0 REQUIRED)
if(CURL_FOUND)
	include_directories(${CURL_INCLUDE_DIR})
	set(PLATFORM_LIBRARIES ${PLATFORM_LIBRARIES} ${CURL_LIBRARIES} )
else(CURL_FOUND)
	message(FATAL_ERROR "Could not find the CURL library and development files.")
endif()

set(SRCS
    src/list.c
    src/apiKey.c
    src/apiClient.c
    src/binary.c
    external/cJSON.c
    model/object.c
    model/add_subscriptions_response.c
    model/add_subscriptions_response_all_of.c
    model/api_key_response.c
    model/api_key_response_all_of.c
    model/attachments.c
    model/attachments_messages.c
    model/bad_event_queue_id_error.c
    model/bad_event_queue_id_error_all_of.c
    model/basic_bot.c
    model/basic_bot_all_of.c
    model/basic_bot_base.c
    model/basic_stream.c
    model/basic_stream_all_of.c
    model/basic_stream_base.c
    model/bot.c
    model/bot_all_of.c
    model/coded_error.c
    model/coded_error_all_of.c
    model/coded_error_base.c
    model/coded_error_base_all_of.c
    model/custom_profile_field.c
    model/default_stream_group.c
    model/emoji_reaction.c
    model/emoji_reaction_all_of.c
    model/emoji_reaction_base.c
    model/emoji_reaction_base_user.c
    model/get_messages.c
    model/get_messages_all_of.c
    model/hotspot.c
    model/inline_response_200.c
    model/invalid_api_key_error.c
    model/invalid_message_error.c
    model/invalid_message_error_all_of.c
    model/json_error.c
    model/json_error_base.c
    model/json_error_base_all_of.c
    model/json_response_base.c
    model/json_success.c
    model/json_success_all_of.c
    model/json_success_base.c
    model/json_success_base_all_of.c
    model/messages.c
    model/messages_all_of.c
    model/messages_base.c
    model/messages_base_topic_links.c
    model/missing_argument_error.c
    model/missing_argument_error_all_of.c
    model/non_existing_stream_error.c
    model/non_existing_stream_error_all_of.c
    model/presence.c
    model/rate_limited_error.c
    model/realm_deactivated_error.c
    model/realm_domain.c
    model/realm_emoji.c
    model/realm_export.c
    model/realm_playground.c
    model/subscriptions.c
    model/user.c
    model/user_all_of.c
    model/user_base.c
    model/user_deactivated_error.c
    model/user_group.c
    model/user_not_authorized_error.c
    api/AuthenticationAPI.c
    api/MessagesAPI.c
    api/RealTimeEventsAPI.c
    api/ServerAndOrganizationsAPI.c
    api/StreamsAPI.c
    api/UsersAPI.c
    api/WebhooksAPI.c

)

set(HDRS
    include/apiClient.h
    include/list.h
    include/binary.h
    include/keyValuePair.h
    external/cJSON.h
    model/object.h
    model/add_subscriptions_response.h
    model/add_subscriptions_response_all_of.h
    model/api_key_response.h
    model/api_key_response_all_of.h
    model/attachments.h
    model/attachments_messages.h
    model/bad_event_queue_id_error.h
    model/bad_event_queue_id_error_all_of.h
    model/basic_bot.h
    model/basic_bot_all_of.h
    model/basic_bot_base.h
    model/basic_stream.h
    model/basic_stream_all_of.h
    model/basic_stream_base.h
    model/bot.h
    model/bot_all_of.h
    model/coded_error.h
    model/coded_error_all_of.h
    model/coded_error_base.h
    model/coded_error_base_all_of.h
    model/custom_profile_field.h
    model/default_stream_group.h
    model/emoji_reaction.h
    model/emoji_reaction_all_of.h
    model/emoji_reaction_base.h
    model/emoji_reaction_base_user.h
    model/get_messages.h
    model/get_messages_all_of.h
    model/hotspot.h
    model/inline_response_200.h
    model/invalid_api_key_error.h
    model/invalid_message_error.h
    model/invalid_message_error_all_of.h
    model/json_error.h
    model/json_error_base.h
    model/json_error_base_all_of.h
    model/json_response_base.h
    model/json_success.h
    model/json_success_all_of.h
    model/json_success_base.h
    model/json_success_base_all_of.h
    model/messages.h
    model/messages_all_of.h
    model/messages_base.h
    model/messages_base_topic_links.h
    model/missing_argument_error.h
    model/missing_argument_error_all_of.h
    model/non_existing_stream_error.h
    model/non_existing_stream_error_all_of.h
    model/presence.h
    model/rate_limited_error.h
    model/realm_deactivated_error.h
    model/realm_domain.h
    model/realm_emoji.h
    model/realm_export.h
    model/realm_playground.h
    model/subscriptions.h
    model/user.h
    model/user_all_of.h
    model/user_base.h
    model/user_deactivated_error.h
    model/user_group.h
    model/user_not_authorized_error.h
    api/AuthenticationAPI.h
    api/MessagesAPI.h
    api/RealTimeEventsAPI.h
    api/ServerAndOrganizationsAPI.h
    api/StreamsAPI.h
    api/UsersAPI.h
    api/WebhooksAPI.h

)

# Add library with project file with projectname as library name
add_library(${pkgName} SHARED ${SRCS} ${HDRS})
# Link dependent libraries
target_link_libraries(${pkgName} ${CURL_LIBRARIES} )
#install library to destination
install(TARGETS ${pkgName} DESTINATION ${CMAKE_INSTALL_PREFIX})

# Setting file variables to null
set(SRCS "")
set(HDRS "")


## This section shows how to use the above compiled libary to compile the source files
## set source files
#set(SRCS
#    unit-tests/manual-AuthenticationAPI.c
#    unit-tests/manual-MessagesAPI.c
#    unit-tests/manual-RealTimeEventsAPI.c
#    unit-tests/manual-ServerAndOrganizationsAPI.c
#    unit-tests/manual-StreamsAPI.c
#    unit-tests/manual-UsersAPI.c
#    unit-tests/manual-WebhooksAPI.c
#)

##set header files
#set(HDRS
#)

## loop over all files in SRCS variable
#foreach(SOURCE_FILE ${SRCS})
#    # Get only the file name from the file as add_executable doesnot support executable with slash("/")
#    get_filename_component(FILE_NAME_ONLY ${SOURCE_FILE} NAME_WE)
#    # Remove .c from the file name and set it as executable name
#    string( REPLACE ".c" "" EXECUTABLE_FILE ${FILE_NAME_ONLY})
#    # Add executable for every source file in  SRCS
#    add_executable(unit-${EXECUTABLE_FILE} ${SOURCE_FILE})
#    # Link above created libary to executable and dependent libary curl
#    target_link_libraries(unit-${EXECUTABLE_FILE} ${CURL_LIBRARIES} ${pkgName} )
#endforeach(SOURCE_FILE ${SRCS})
