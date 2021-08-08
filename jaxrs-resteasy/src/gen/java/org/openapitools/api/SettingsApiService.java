package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.JsonSuccessBase;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-08T21:12:13.402057Z[Etc/UTC]")
public interface SettingsApiService {
      Response updateSettings(String fullName,String email,String oldPassword,String newPassword,Boolean twentyFourHourTime,Boolean denseMode,Boolean starredMessageCounts,Boolean fluidLayoutWidth,Boolean highContrastMode,Integer colorScheme,Boolean enableDraftsSynchronization,Boolean translateEmoticons,String defaultLanguage,String defaultView,Boolean leftSideUserlist,String emojiset,Integer demoteInactiveStreams,String timezone,Boolean enableStreamDesktopNotifications,Boolean enableStreamEmailNotifications,Boolean enableStreamPushNotifications,Boolean enableStreamAudibleNotifications,String notificationSound,Boolean enableDesktopNotifications,Boolean enableSounds,Integer emailNotificationsBatchingPeriodSeconds,Boolean enableOfflineEmailNotifications,Boolean enableOfflinePushNotifications,Boolean enableOnlinePushNotifications,Boolean enableDigestEmails,Boolean enableMarketingEmails,Boolean enableLoginEmails,Boolean messageContentInEmailNotifications,Boolean pmContentInDesktopNotifications,Boolean wildcardMentionsNotify,Integer desktopIconCountDisplay,Boolean realmNameInNotifications,Boolean presenceEnabled,Boolean enterSends,SecurityContext securityContext)
      throws NotFoundException;
}
