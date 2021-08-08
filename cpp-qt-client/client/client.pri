QT += network

HEADERS += \
# Models
    $${PWD}/OAIAddSubscriptionsResponse.h \
    $${PWD}/OAIAddSubscriptionsResponse_allOf.h \
    $${PWD}/OAIApiKeyResponse.h \
    $${PWD}/OAIApiKeyResponse_allOf.h \
    $${PWD}/OAIAttachments.h \
    $${PWD}/OAIAttachments_messages.h \
    $${PWD}/OAIBadEventQueueIdError.h \
    $${PWD}/OAIBadEventQueueIdError_allOf.h \
    $${PWD}/OAIBasicBot.h \
    $${PWD}/OAIBasicBotBase.h \
    $${PWD}/OAIBasicBot_allOf.h \
    $${PWD}/OAIBasicStream.h \
    $${PWD}/OAIBasicStreamBase.h \
    $${PWD}/OAIBasicStream_allOf.h \
    $${PWD}/OAIBot.h \
    $${PWD}/OAIBot_allOf.h \
    $${PWD}/OAICodedError.h \
    $${PWD}/OAICodedErrorBase.h \
    $${PWD}/OAICodedErrorBase_allOf.h \
    $${PWD}/OAICodedError_allOf.h \
    $${PWD}/OAICustomProfileField.h \
    $${PWD}/OAIDefaultStreamGroup.h \
    $${PWD}/OAIEmojiReaction.h \
    $${PWD}/OAIEmojiReactionBase.h \
    $${PWD}/OAIEmojiReactionBase_user.h \
    $${PWD}/OAIEmojiReaction_allOf.h \
    $${PWD}/OAIGetMessages.h \
    $${PWD}/OAIGetMessages_allOf.h \
    $${PWD}/OAIHotspot.h \
    $${PWD}/OAIInline_response_200.h \
    $${PWD}/OAIInvalidApiKeyError.h \
    $${PWD}/OAIInvalidMessageError.h \
    $${PWD}/OAIInvalidMessageError_allOf.h \
    $${PWD}/OAIJsonError.h \
    $${PWD}/OAIJsonErrorBase.h \
    $${PWD}/OAIJsonErrorBase_allOf.h \
    $${PWD}/OAIJsonResponseBase.h \
    $${PWD}/OAIJsonSuccess.h \
    $${PWD}/OAIJsonSuccessBase.h \
    $${PWD}/OAIJsonSuccessBase_allOf.h \
    $${PWD}/OAIJsonSuccess_allOf.h \
    $${PWD}/OAIMessages.h \
    $${PWD}/OAIMessagesBase.h \
    $${PWD}/OAIMessagesBase_topic_links.h \
    $${PWD}/OAIMessages_allOf.h \
    $${PWD}/OAIMissingArgumentError.h \
    $${PWD}/OAIMissingArgumentError_allOf.h \
    $${PWD}/OAINonExistingStreamError.h \
    $${PWD}/OAINonExistingStreamError_allOf.h \
    $${PWD}/OAIPresence.h \
    $${PWD}/OAIRateLimitedError.h \
    $${PWD}/OAIRealmDeactivatedError.h \
    $${PWD}/OAIRealmDomain.h \
    $${PWD}/OAIRealmEmoji.h \
    $${PWD}/OAIRealmExport.h \
    $${PWD}/OAIRealmPlayground.h \
    $${PWD}/OAISubscriptions.h \
    $${PWD}/OAIUser.h \
    $${PWD}/OAIUserBase.h \
    $${PWD}/OAIUserDeactivatedError.h \
    $${PWD}/OAIUserGroup.h \
    $${PWD}/OAIUserNotAuthorizedError.h \
    $${PWD}/OAIUser_allOf.h \
# APIs
    $${PWD}/OAIAuthenticationApi.h \
    $${PWD}/OAIMessagesApi.h \
    $${PWD}/OAIRealTimeEventsApi.h \
    $${PWD}/OAIServerAndOrganizationsApi.h \
    $${PWD}/OAIStreamsApi.h \
    $${PWD}/OAIUsersApi.h \
    $${PWD}/OAIWebhooksApi.h \
# Others
    $${PWD}/OAIHelpers.h \
    $${PWD}/OAIHttpRequest.h \
    $${PWD}/OAIObject.h \
    $${PWD}/OAIEnum.h \
    $${PWD}/OAIHttpFileElement.h \
    $${PWD}/OAIServerConfiguration.h \
    $${PWD}/OAIServerVariable.h

SOURCES += \
# Models
    $${PWD}/OAIAddSubscriptionsResponse.cpp \
    $${PWD}/OAIAddSubscriptionsResponse_allOf.cpp \
    $${PWD}/OAIApiKeyResponse.cpp \
    $${PWD}/OAIApiKeyResponse_allOf.cpp \
    $${PWD}/OAIAttachments.cpp \
    $${PWD}/OAIAttachments_messages.cpp \
    $${PWD}/OAIBadEventQueueIdError.cpp \
    $${PWD}/OAIBadEventQueueIdError_allOf.cpp \
    $${PWD}/OAIBasicBot.cpp \
    $${PWD}/OAIBasicBotBase.cpp \
    $${PWD}/OAIBasicBot_allOf.cpp \
    $${PWD}/OAIBasicStream.cpp \
    $${PWD}/OAIBasicStreamBase.cpp \
    $${PWD}/OAIBasicStream_allOf.cpp \
    $${PWD}/OAIBot.cpp \
    $${PWD}/OAIBot_allOf.cpp \
    $${PWD}/OAICodedError.cpp \
    $${PWD}/OAICodedErrorBase.cpp \
    $${PWD}/OAICodedErrorBase_allOf.cpp \
    $${PWD}/OAICodedError_allOf.cpp \
    $${PWD}/OAICustomProfileField.cpp \
    $${PWD}/OAIDefaultStreamGroup.cpp \
    $${PWD}/OAIEmojiReaction.cpp \
    $${PWD}/OAIEmojiReactionBase.cpp \
    $${PWD}/OAIEmojiReactionBase_user.cpp \
    $${PWD}/OAIEmojiReaction_allOf.cpp \
    $${PWD}/OAIGetMessages.cpp \
    $${PWD}/OAIGetMessages_allOf.cpp \
    $${PWD}/OAIHotspot.cpp \
    $${PWD}/OAIInline_response_200.cpp \
    $${PWD}/OAIInvalidApiKeyError.cpp \
    $${PWD}/OAIInvalidMessageError.cpp \
    $${PWD}/OAIInvalidMessageError_allOf.cpp \
    $${PWD}/OAIJsonError.cpp \
    $${PWD}/OAIJsonErrorBase.cpp \
    $${PWD}/OAIJsonErrorBase_allOf.cpp \
    $${PWD}/OAIJsonResponseBase.cpp \
    $${PWD}/OAIJsonSuccess.cpp \
    $${PWD}/OAIJsonSuccessBase.cpp \
    $${PWD}/OAIJsonSuccessBase_allOf.cpp \
    $${PWD}/OAIJsonSuccess_allOf.cpp \
    $${PWD}/OAIMessages.cpp \
    $${PWD}/OAIMessagesBase.cpp \
    $${PWD}/OAIMessagesBase_topic_links.cpp \
    $${PWD}/OAIMessages_allOf.cpp \
    $${PWD}/OAIMissingArgumentError.cpp \
    $${PWD}/OAIMissingArgumentError_allOf.cpp \
    $${PWD}/OAINonExistingStreamError.cpp \
    $${PWD}/OAINonExistingStreamError_allOf.cpp \
    $${PWD}/OAIPresence.cpp \
    $${PWD}/OAIRateLimitedError.cpp \
    $${PWD}/OAIRealmDeactivatedError.cpp \
    $${PWD}/OAIRealmDomain.cpp \
    $${PWD}/OAIRealmEmoji.cpp \
    $${PWD}/OAIRealmExport.cpp \
    $${PWD}/OAIRealmPlayground.cpp \
    $${PWD}/OAISubscriptions.cpp \
    $${PWD}/OAIUser.cpp \
    $${PWD}/OAIUserBase.cpp \
    $${PWD}/OAIUserDeactivatedError.cpp \
    $${PWD}/OAIUserGroup.cpp \
    $${PWD}/OAIUserNotAuthorizedError.cpp \
    $${PWD}/OAIUser_allOf.cpp \
# APIs
    $${PWD}/OAIAuthenticationApi.cpp \
    $${PWD}/OAIMessagesApi.cpp \
    $${PWD}/OAIRealTimeEventsApi.cpp \
    $${PWD}/OAIServerAndOrganizationsApi.cpp \
    $${PWD}/OAIStreamsApi.cpp \
    $${PWD}/OAIUsersApi.cpp \
    $${PWD}/OAIWebhooksApi.cpp \
# Others
    $${PWD}/OAIHelpers.cpp \
    $${PWD}/OAIHttpRequest.cpp \
    $${PWD}/OAIHttpFileElement.cpp

