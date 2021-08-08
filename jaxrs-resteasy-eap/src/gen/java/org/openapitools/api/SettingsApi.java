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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2021-08-08T20:40:09.617193Z[Etc/UTC]")
public interface SettingsApi  {
   
    @PATCH
    @Path("/display")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update display settings", notes = "This endpoint is used to edit the current user's user interface settings.  `PATCH {{ api_url }}/v1/settings/display` ", response = JsonSuccessBase.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = JsonSuccessBase.class) })
    public Response updateDisplaySettings(  @QueryParam("twenty_four_hour_time") Boolean twentyFourHourTime,  @QueryParam("dense_mode") Boolean denseMode,  @QueryParam("starred_message_counts") Boolean starredMessageCounts,  @QueryParam("fluid_layout_width") Boolean fluidLayoutWidth,  @QueryParam("high_contrast_mode") Boolean highContrastMode, , allowableValues="1, 2, 3" @QueryParam("color_scheme") Integer colorScheme,  @QueryParam("translate_emoticons") Boolean translateEmoticons,  @QueryParam("default_language") String defaultLanguage,  @QueryParam("default_view") String defaultView,  @QueryParam("left_side_userlist") Boolean leftSideUserlist,  @QueryParam("emojiset") String emojiset, , allowableValues="1, 2, 3" @QueryParam("demote_inactive_streams") Integer demoteInactiveStreams,  @QueryParam("timezone") String timezone,@Context SecurityContext securityContext);
    @PATCH
    @Path("/notifications")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update notification settings", notes = "This endpoint is used to edit the user's global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  `PATCH {{ api_url }}/v1/settings/notifications` ", response = JsonSuccessBase.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response updateNotificationSettings(  @QueryParam("enable_stream_desktop_notifications") Boolean enableStreamDesktopNotifications,  @QueryParam("enable_stream_email_notifications") Boolean enableStreamEmailNotifications,  @QueryParam("enable_stream_push_notifications") Boolean enableStreamPushNotifications,  @QueryParam("enable_stream_audible_notifications") Boolean enableStreamAudibleNotifications,  @QueryParam("notification_sound") String notificationSound,  @QueryParam("enable_desktop_notifications") Boolean enableDesktopNotifications,  @QueryParam("enable_sounds") Boolean enableSounds,  @QueryParam("enable_offline_email_notifications") Boolean enableOfflineEmailNotifications,  @QueryParam("enable_offline_push_notifications") Boolean enableOfflinePushNotifications,  @QueryParam("enable_online_push_notifications") Boolean enableOnlinePushNotifications,  @QueryParam("enable_digest_emails") Boolean enableDigestEmails,  @QueryParam("enable_marketing_emails") Boolean enableMarketingEmails,  @QueryParam("enable_login_emails") Boolean enableLoginEmails,  @QueryParam("message_content_in_email_notifications") Boolean messageContentInEmailNotifications,  @QueryParam("pm_content_in_desktop_notifications") Boolean pmContentInDesktopNotifications,  @QueryParam("wildcard_mentions_notify") Boolean wildcardMentionsNotify, , allowableValues="1, 2, 3" @QueryParam("desktop_icon_count_display") Integer desktopIconCountDisplay,  @QueryParam("realm_name_in_notifications") Boolean realmNameInNotifications,  @QueryParam("presence_enabled") Boolean presenceEnabled,@Context SecurityContext securityContext);
}
