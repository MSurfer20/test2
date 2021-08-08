cmake_minimum_required(VERSION 3.2)

project(client)
set(CMAKE_VERBOSE_MAKEFILE ON)
set(CMAKE_INCLUDE_CURRENT_DIR ON)
set(CMAKE_AUTOMOC ON)

if (MSVC)
    set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} /W4")
else ()
    set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -fPIC -Wall -Wno-unused-variable")
endif ()

find_package(Qt5Core REQUIRED)
find_package(Qt5Network REQUIRED)

add_library(${PROJECT_NAME}
    OAIAddSubscriptionsResponse.cpp
    OAIAddSubscriptionsResponse_allOf.cpp
    OAIApiKeyResponse.cpp
    OAIApiKeyResponse_allOf.cpp
    OAIAttachments.cpp
    OAIAttachments_messages.cpp
    OAIBadEventQueueIdError.cpp
    OAIBadEventQueueIdError_allOf.cpp
    OAIBasicBot.cpp
    OAIBasicBotBase.cpp
    OAIBasicBot_allOf.cpp
    OAIBasicStream.cpp
    OAIBasicStreamBase.cpp
    OAIBasicStream_allOf.cpp
    OAIBot.cpp
    OAIBot_allOf.cpp
    OAICodedError.cpp
    OAICodedErrorBase.cpp
    OAICodedErrorBase_allOf.cpp
    OAICodedError_allOf.cpp
    OAICustomProfileField.cpp
    OAIDefaultStreamGroup.cpp
    OAIDraft.cpp
    OAIEmojiBase.cpp
    OAIEmojiReaction.cpp
    OAIEmojiReactionBase.cpp
    OAIEmojiReactionBase_allOf.cpp
    OAIEmojiReactionBase_allOf_user.cpp
    OAIEmojiReaction_allOf.cpp
    OAIGetMessages.cpp
    OAIGetMessages_allOf.cpp
    OAIHotspot.cpp
    OAIInline_response_200.cpp
    OAIInvalidApiKeyError.cpp
    OAIInvalidMessageError.cpp
    OAIInvalidMessageError_allOf.cpp
    OAIJsonError.cpp
    OAIJsonErrorBase.cpp
    OAIJsonErrorBase_allOf.cpp
    OAIJsonResponseBase.cpp
    OAIJsonSuccess.cpp
    OAIJsonSuccessBase.cpp
    OAIJsonSuccessBase_allOf.cpp
    OAIJsonSuccess_allOf.cpp
    OAIMessages.cpp
    OAIMessagesBase.cpp
    OAIMessagesBase_topic_links.cpp
    OAIMessages_allOf.cpp
    OAIMissingArgumentError.cpp
    OAIMissingArgumentError_allOf.cpp
    OAINonExistingStreamError.cpp
    OAINonExistingStreamError_allOf.cpp
    OAIPresence.cpp
    OAIRateLimitedError.cpp
    OAIRealmDeactivatedError.cpp
    OAIRealmDomain.cpp
    OAIRealmEmoji.cpp
    OAIRealmExport.cpp
    OAIRealmPlayground.cpp
    OAISubscriptions.cpp
    OAIUser.cpp
    OAIUserBase.cpp
    OAIUserDeactivatedError.cpp
    OAIUserGroup.cpp
    OAIUserNotAuthorizedError.cpp
    OAIUser_allOf.cpp
    OAIAuthenticationApi.cpp
    OAIDraftsApi.cpp
    OAIMessagesApi.cpp
    OAIRealTimeEventsApi.cpp
    OAIServerAndOrganizationsApi.cpp
    OAIStreamsApi.cpp
    OAIUsersApi.cpp
    OAIWebhooksApi.cpp
    OAIHelpers.cpp
    OAIHttpRequest.cpp
    OAIHttpFileElement.cpp
)
target_link_libraries(${PROJECT_NAME} PRIVATE Qt5::Core Qt5::Network )

if(NOT APPLE)
  target_link_libraries(${PROJECT_NAME} PRIVATE ssl crypto)
endif()

set_property(TARGET ${PROJECT_NAME} PROPERTY CXX_STANDARD 14)
set_property(TARGET ${PROJECT_NAME} PROPERTY CXX_STANDARD_REQUIRED ON)
set_property(TARGET ${PROJECT_NAME} PROPERTY CXX_EXTENSIONS OFF)

install(TARGETS ${PROJECT_NAME} RUNTIME DESTINATION bin LIBRARY DESTINATION lib ARCHIVE DESTINATION lib)
