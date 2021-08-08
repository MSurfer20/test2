package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.SettingsApiService;
import org.openapitools.api.factories.SettingsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.JsonSuccessBase;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/settings")


@io.swagger.annotations.Api(description = "the settings API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-08T21:11:36.575393Z[Etc/UTC]")
public class SettingsApi  {
   private final SettingsApiService delegate = SettingsApiServiceFactory.getSettingsApi();

    @PATCH
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update settings", notes = "This endpoint is used to edit the current user's settings.  `PATCH {{ api_url }}/v1/settings`  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the `full_name`, `email`, `old_password`, and `new_password` parameters. Notification settings were managed by `PATCH /settings/notifications`, and all other settings by `PATCH /settings/display`. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for `/settings` in Zulip 5.0 (feature level 78).  The `/settings/display` and `/settings/notifications` endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. ", response = JsonSuccessBase.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = JsonSuccessBase.class) })
    public Response updateSettings(@ApiParam(value = "A new display name for the user. ") @QueryParam("full_name") String fullName
,@ApiParam(value = "Asks the server to initiate a confirmation sequence to change the user's email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address. ") @QueryParam("email") String email
,@ApiParam(value = "The user's old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the `new_password` parameter. ") @QueryParam("old_password") String oldPassword
,@ApiParam(value = "The user's new Zulip password (or LDAP password, if LDAP authentication is in use).  The `old_password` parameter must be included in the request. ") @QueryParam("new_password") String newPassword
,@ApiParam(value = "Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. ") @QueryParam("twenty_four_hour_time") Boolean twentyFourHourTime
,@ApiParam(value = "This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. ") @QueryParam("dense_mode") Boolean denseMode
,@ApiParam(value = "Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. ") @QueryParam("starred_message_counts") Boolean starredMessageCounts
,@ApiParam(value = "Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. ") @QueryParam("fluid_layout_width") Boolean fluidLayoutWidth
,@ApiParam(value = "This setting is reserved for use to control variations in Zulip's design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. ") @QueryParam("high_contrast_mode") Boolean highContrastMode
,@ApiParam(value = "Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. ", allowableValues="1, 2, 3") @QueryParam("color_scheme") Integer colorScheme
,@ApiParam(value = "A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87). ") @QueryParam("enable_drafts_synchronization") Boolean enableDraftsSynchronization
,@ApiParam(value = "Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. ") @QueryParam("translate_emoticons") Boolean translateEmoticons
,@ApiParam(value = "What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). ") @QueryParam("default_language") String defaultLanguage
,@ApiParam(value = "The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). ") @QueryParam("default_view") String defaultView
,@ApiParam(value = "Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. ") @QueryParam("left_side_userlist") Boolean leftSideUserlist
,@ApiParam(value = "The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). ") @QueryParam("emojiset") String emojiset
,@ApiParam(value = "Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. ", allowableValues="1, 2, 3") @QueryParam("demote_inactive_streams") Integer demoteInactiveStreams
,@ApiParam(value = "The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). ") @QueryParam("timezone") String timezone
,@ApiParam(value = "Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ") @QueryParam("enable_stream_desktop_notifications") Boolean enableStreamDesktopNotifications
,@ApiParam(value = "Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ") @QueryParam("enable_stream_email_notifications") Boolean enableStreamEmailNotifications
,@ApiParam(value = "Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ") @QueryParam("enable_stream_push_notifications") Boolean enableStreamPushNotifications
,@ApiParam(value = "Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ") @QueryParam("enable_stream_audible_notifications") Boolean enableStreamAudibleNotifications
,@ApiParam(value = "Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). ") @QueryParam("notification_sound") String notificationSound
,@ApiParam(value = "Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ") @QueryParam("enable_desktop_notifications") Boolean enableDesktopNotifications
,@ApiParam(value = "Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ") @QueryParam("enable_sounds") Boolean enableSounds
,@ApiParam(value = "The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82) ") @QueryParam("email_notifications_batching_period_seconds") Integer emailNotificationsBatchingPeriodSeconds
,@ApiParam(value = "Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ") @QueryParam("enable_offline_email_notifications") Boolean enableOfflineEmailNotifications
,@ApiParam(value = "Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ") @QueryParam("enable_offline_push_notifications") Boolean enableOfflinePushNotifications
,@ApiParam(value = "Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ") @QueryParam("enable_online_push_notifications") Boolean enableOnlinePushNotifications
,@ApiParam(value = "Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ") @QueryParam("enable_digest_emails") Boolean enableDigestEmails
,@ApiParam(value = "Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ") @QueryParam("enable_marketing_emails") Boolean enableMarketingEmails
,@ApiParam(value = "Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ") @QueryParam("enable_login_emails") Boolean enableLoginEmails
,@ApiParam(value = "Include the message's content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ") @QueryParam("message_content_in_email_notifications") Boolean messageContentInEmailNotifications
,@ApiParam(value = "Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ") @QueryParam("pm_content_in_desktop_notifications") Boolean pmContentInDesktopNotifications
,@ApiParam(value = "Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ") @QueryParam("wildcard_mentions_notify") Boolean wildcardMentionsNotify
,@ApiParam(value = "Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ", allowableValues="1, 2, 3") @QueryParam("desktop_icon_count_display") Integer desktopIconCountDisplay
,@ApiParam(value = "Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ") @QueryParam("realm_name_in_notifications") Boolean realmNameInNotifications
,@ApiParam(value = "Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ") @QueryParam("presence_enabled") Boolean presenceEnabled
,@ApiParam(value = "Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the `POST /users/me/enter-sends` endpoint, with the same parameter format. ") @QueryParam("enter_sends") Boolean enterSends
)
    throws NotFoundException {
        return delegate.updateSettings(fullName,email,oldPassword,newPassword,twentyFourHourTime,denseMode,starredMessageCounts,fluidLayoutWidth,highContrastMode,colorScheme,enableDraftsSynchronization,translateEmoticons,defaultLanguage,defaultView,leftSideUserlist,emojiset,demoteInactiveStreams,timezone,enableStreamDesktopNotifications,enableStreamEmailNotifications,enableStreamPushNotifications,enableStreamAudibleNotifications,notificationSound,enableDesktopNotifications,enableSounds,emailNotificationsBatchingPeriodSeconds,enableOfflineEmailNotifications,enableOfflinePushNotifications,enableOnlinePushNotifications,enableDigestEmails,enableMarketingEmails,enableLoginEmails,messageContentInEmailNotifications,pmContentInDesktopNotifications,wildcardMentionsNotify,desktopIconCountDisplay,realmNameInNotifications,presenceEnabled,enterSends);
    }
}
