package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.JsonSuccessBase;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-08T20:41:44.271935Z[Etc/UTC]")
public abstract class SettingsApiService {
    public abstract Response updateDisplaySettings(Boolean twentyFourHourTime
 ,Boolean denseMode
 ,Boolean starredMessageCounts
 ,Boolean fluidLayoutWidth
 ,Boolean highContrastMode
 ,Integer colorScheme
 ,Boolean translateEmoticons
 ,String defaultLanguage
 ,String defaultView
 ,Boolean leftSideUserlist
 ,String emojiset
 ,Integer demoteInactiveStreams
 ,String timezone
 ) throws NotFoundException;
    public abstract Response updateNotificationSettings(Boolean enableStreamDesktopNotifications
 ,Boolean enableStreamEmailNotifications
 ,Boolean enableStreamPushNotifications
 ,Boolean enableStreamAudibleNotifications
 ,String notificationSound
 ,Boolean enableDesktopNotifications
 ,Boolean enableSounds
 ,Boolean enableOfflineEmailNotifications
 ,Boolean enableOfflinePushNotifications
 ,Boolean enableOnlinePushNotifications
 ,Boolean enableDigestEmails
 ,Boolean enableMarketingEmails
 ,Boolean enableLoginEmails
 ,Boolean messageContentInEmailNotifications
 ,Boolean pmContentInDesktopNotifications
 ,Boolean wildcardMentionsNotify
 ,Integer desktopIconCountDisplay
 ,Boolean realmNameInNotifications
 ,Boolean presenceEnabled
 ) throws NotFoundException;
}
