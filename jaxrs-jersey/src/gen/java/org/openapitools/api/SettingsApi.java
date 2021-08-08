package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.SettingsApiService;
import org.openapitools.api.factories.SettingsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.JsonSuccessBase;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/settings")


@io.swagger.annotations.Api(description = "the settings API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T20:42:23.370561Z[Etc/UTC]")
public class SettingsApi  {
   private final SettingsApiService delegate;

   public SettingsApi(@Context ServletConfig servletContext) {
      SettingsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("SettingsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (SettingsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = SettingsApiServiceFactory.getSettingsApi();
      }

      this.delegate = delegate;
   }

    @PATCH
    @Path("/display")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update display settings", notes = "This endpoint is used to edit the current user's user interface settings.  `PATCH {{ api_url }}/v1/settings/display` ", response = JsonSuccessBase.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = JsonSuccessBase.class)
    })
    public Response updateDisplaySettings(@ApiParam(value = "Whether time should be [displayed in 24-hour notation](/help/change-the-time-format). ") @QueryParam("twenty_four_hour_time")  Boolean twentyFourHourTime,@ApiParam(value = "This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip. ") @QueryParam("dense_mode")  Boolean denseMode,@ApiParam(value = "Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages). ") @QueryParam("starred_message_counts")  Boolean starredMessageCounts,@ApiParam(value = "Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens. ") @QueryParam("fluid_layout_width")  Boolean fluidLayoutWidth,@ApiParam(value = "This setting is reserved for use to control variations in Zulip's design to help visually impaired users. ") @QueryParam("high_contrast_mode")  Boolean highContrastMode,@ApiParam(value = "Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query. ", allowableValues="1, 2, 3") @QueryParam("color_scheme")  Integer colorScheme,@ApiParam(value = "Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends. ") @QueryParam("translate_emoticons")  Boolean translateEmoticons,@ApiParam(value = "What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). ") @QueryParam("default_language")  String defaultLanguage,@ApiParam(value = "The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). ") @QueryParam("default_view")  String defaultView,@ApiParam(value = "Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked. ") @QueryParam("left_side_userlist")  Boolean leftSideUserlist,@ApiParam(value = "The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). ") @QueryParam("emojiset")  String emojiset,@ApiParam(value = "Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never ", allowableValues="1, 2, 3") @QueryParam("demote_inactive_streams")  Integer demoteInactiveStreams,@ApiParam(value = "The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). ") @QueryParam("timezone")  String timezone,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateDisplaySettings(twentyFourHourTime, denseMode, starredMessageCounts, fluidLayoutWidth, highContrastMode, colorScheme, translateEmoticons, defaultLanguage, defaultView, leftSideUserlist, emojiset, demoteInactiveStreams, timezone, securityContext);
    }
    @PATCH
    @Path("/notifications")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update notification settings", notes = "This endpoint is used to edit the user's global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  `PATCH {{ api_url }}/v1/settings/notifications` ", response = JsonSuccessBase.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response updateNotificationSettings(@ApiParam(value = "Enable visual desktop notifications for stream messages. ") @QueryParam("enable_stream_desktop_notifications")  Boolean enableStreamDesktopNotifications,@ApiParam(value = "Enable email notifications for stream messages. ") @QueryParam("enable_stream_email_notifications")  Boolean enableStreamEmailNotifications,@ApiParam(value = "Enable mobile notifications for stream messages. ") @QueryParam("enable_stream_push_notifications")  Boolean enableStreamPushNotifications,@ApiParam(value = "Enable audible desktop notifications for stream messages. ") @QueryParam("enable_stream_audible_notifications")  Boolean enableStreamAudibleNotifications,@ApiParam(value = "Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). ") @QueryParam("notification_sound")  String notificationSound,@ApiParam(value = "Enable visual desktop notifications for private messages and @-mentions. ") @QueryParam("enable_desktop_notifications")  Boolean enableDesktopNotifications,@ApiParam(value = "Enable audible desktop notifications for private messages and @-mentions. ") @QueryParam("enable_sounds")  Boolean enableSounds,@ApiParam(value = "Enable email notifications for private messages and @-mentions received when the user is offline. ") @QueryParam("enable_offline_email_notifications")  Boolean enableOfflineEmailNotifications,@ApiParam(value = "Enable mobile notification for private messages and @-mentions received when the user is offline. ") @QueryParam("enable_offline_push_notifications")  Boolean enableOfflinePushNotifications,@ApiParam(value = "Enable mobile notification for private messages and @-mentions received when the user is online. ") @QueryParam("enable_online_push_notifications")  Boolean enableOnlinePushNotifications,@ApiParam(value = "Enable digest emails when the user is away. ") @QueryParam("enable_digest_emails")  Boolean enableDigestEmails,@ApiParam(value = "Enable marketing emails. Has no function outside Zulip Cloud. ") @QueryParam("enable_marketing_emails")  Boolean enableMarketingEmails,@ApiParam(value = "Enable email notifications for new logins to account. ") @QueryParam("enable_login_emails")  Boolean enableLoginEmails,@ApiParam(value = "Include the message's content in email notifications for new messages. ") @QueryParam("message_content_in_email_notifications")  Boolean messageContentInEmailNotifications,@ApiParam(value = "Include content of private messages in desktop notifications. ") @QueryParam("pm_content_in_desktop_notifications")  Boolean pmContentInDesktopNotifications,@ApiParam(value = "Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention. ") @QueryParam("wildcard_mentions_notify")  Boolean wildcardMentionsNotify,@ApiParam(value = "Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None ", allowableValues="1, 2, 3") @QueryParam("desktop_icon_count_display")  Integer desktopIconCountDisplay,@ApiParam(value = "Include organization name in subject of message notification emails. ") @QueryParam("realm_name_in_notifications")  Boolean realmNameInNotifications,@ApiParam(value = "Display the presence status to other users when online. ") @QueryParam("presence_enabled")  Boolean presenceEnabled,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateNotificationSettings(enableStreamDesktopNotifications, enableStreamEmailNotifications, enableStreamPushNotifications, enableStreamAudibleNotifications, notificationSound, enableDesktopNotifications, enableSounds, enableOfflineEmailNotifications, enableOfflinePushNotifications, enableOnlinePushNotifications, enableDigestEmails, enableMarketingEmails, enableLoginEmails, messageContentInEmailNotifications, pmContentInDesktopNotifications, wildcardMentionsNotify, desktopIconCountDisplay, realmNameInNotifications, presenceEnabled, securityContext);
    }
}
