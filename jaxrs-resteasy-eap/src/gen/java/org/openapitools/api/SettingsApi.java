package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.JsonSuccessBase;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/settings")


@io.swagger.annotations.Api(description = "the settings API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2021-08-08T21:20:09.368890Z[Etc/UTC]")
public interface SettingsApi  {
   
    @PATCH
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update settings", notes = "This endpoint is used to edit the current user's settings.  `PATCH {{ api_url }}/v1/settings`  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the `full_name`, `email`, `old_password`, and `new_password` parameters. Notification settings were managed by `PATCH /settings/notifications`, and all other settings by `PATCH /settings/display`. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for `/settings` in Zulip 5.0 (feature level 78).  The `/settings/display` and `/settings/notifications` endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. ", response = JsonSuccessBase.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = JsonSuccessBase.class) })
    public Response updateSettings(  @QueryParam("full_name") String fullName,  @QueryParam("email") String email,  @QueryParam("old_password") String oldPassword,  @QueryParam("new_password") String newPassword,  @QueryParam("twenty_four_hour_time") Boolean twentyFourHourTime,  @QueryParam("dense_mode") Boolean denseMode,  @QueryParam("starred_message_counts") Boolean starredMessageCounts,  @QueryParam("fluid_layout_width") Boolean fluidLayoutWidth,  @QueryParam("high_contrast_mode") Boolean highContrastMode, , allowableValues="1, 2, 3" @QueryParam("color_scheme") Integer colorScheme,  @QueryParam("enable_drafts_synchronization") Boolean enableDraftsSynchronization,  @QueryParam("translate_emoticons") Boolean translateEmoticons,  @QueryParam("default_language") String defaultLanguage,  @QueryParam("default_view") String defaultView,  @QueryParam("left_side_userlist") Boolean leftSideUserlist,  @QueryParam("emojiset") String emojiset, , allowableValues="1, 2, 3" @QueryParam("demote_inactive_streams") Integer demoteInactiveStreams,  @QueryParam("timezone") String timezone,  @QueryParam("enable_stream_desktop_notifications") Boolean enableStreamDesktopNotifications,  @QueryParam("enable_stream_email_notifications") Boolean enableStreamEmailNotifications,  @QueryParam("enable_stream_push_notifications") Boolean enableStreamPushNotifications,  @QueryParam("enable_stream_audible_notifications") Boolean enableStreamAudibleNotifications,  @QueryParam("notification_sound") String notificationSound,  @QueryParam("enable_desktop_notifications") Boolean enableDesktopNotifications,  @QueryParam("enable_sounds") Boolean enableSounds,  @QueryParam("email_notifications_batching_period_seconds") Integer emailNotificationsBatchingPeriodSeconds,  @QueryParam("enable_offline_email_notifications") Boolean enableOfflineEmailNotifications,  @QueryParam("enable_offline_push_notifications") Boolean enableOfflinePushNotifications,  @QueryParam("enable_online_push_notifications") Boolean enableOnlinePushNotifications,  @QueryParam("enable_digest_emails") Boolean enableDigestEmails,  @QueryParam("enable_marketing_emails") Boolean enableMarketingEmails,  @QueryParam("enable_login_emails") Boolean enableLoginEmails,  @QueryParam("message_content_in_email_notifications") Boolean messageContentInEmailNotifications,  @QueryParam("pm_content_in_desktop_notifications") Boolean pmContentInDesktopNotifications,  @QueryParam("wildcard_mentions_notify") Boolean wildcardMentionsNotify, , allowableValues="1, 2, 3" @QueryParam("desktop_icon_count_display") Integer desktopIconCountDisplay,  @QueryParam("realm_name_in_notifications") Boolean realmNameInNotifications,  @QueryParam("presence_enabled") Boolean presenceEnabled,  @QueryParam("enter_sends") Boolean enterSends,@Context SecurityContext securityContext);
}
