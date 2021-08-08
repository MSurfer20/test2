package org.openapitools.api

import org.openapitools.model.JsonSuccessBase
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/api/v1}")
class SettingsApiController() {


    @PatchMapping(
        value = ["/settings/display"],
        produces = ["application/json"]
    )
    fun updateDisplaySettings( @RequestParam(value = "twenty_four_hour_time", required = false) twentyFourHourTime: kotlin.Boolean?
, @RequestParam(value = "dense_mode", required = false) denseMode: kotlin.Boolean?
, @RequestParam(value = "starred_message_counts", required = false) starredMessageCounts: kotlin.Boolean?
, @RequestParam(value = "fluid_layout_width", required = false) fluidLayoutWidth: kotlin.Boolean?
, @RequestParam(value = "high_contrast_mode", required = false) highContrastMode: kotlin.Boolean?
, @RequestParam(value = "color_scheme", required = false) colorScheme: kotlin.Int?
, @RequestParam(value = "translate_emoticons", required = false) translateEmoticons: kotlin.Boolean?
, @RequestParam(value = "default_language", required = false) defaultLanguage: kotlin.String?
, @RequestParam(value = "default_view", required = false) defaultView: kotlin.String?
, @RequestParam(value = "left_side_userlist", required = false) leftSideUserlist: kotlin.Boolean?
, @RequestParam(value = "emojiset", required = false) emojiset: kotlin.String?
, @RequestParam(value = "demote_inactive_streams", required = false) demoteInactiveStreams: kotlin.Int?
, @RequestParam(value = "timezone", required = false) timezone: kotlin.String?
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @PatchMapping(
        value = ["/settings/notifications"],
        produces = ["application/json"]
    )
    fun updateNotificationSettings( @RequestParam(value = "enable_stream_desktop_notifications", required = false) enableStreamDesktopNotifications: kotlin.Boolean?
, @RequestParam(value = "enable_stream_email_notifications", required = false) enableStreamEmailNotifications: kotlin.Boolean?
, @RequestParam(value = "enable_stream_push_notifications", required = false) enableStreamPushNotifications: kotlin.Boolean?
, @RequestParam(value = "enable_stream_audible_notifications", required = false) enableStreamAudibleNotifications: kotlin.Boolean?
, @RequestParam(value = "notification_sound", required = false) notificationSound: kotlin.String?
, @RequestParam(value = "enable_desktop_notifications", required = false) enableDesktopNotifications: kotlin.Boolean?
, @RequestParam(value = "enable_sounds", required = false) enableSounds: kotlin.Boolean?
, @RequestParam(value = "enable_offline_email_notifications", required = false) enableOfflineEmailNotifications: kotlin.Boolean?
, @RequestParam(value = "enable_offline_push_notifications", required = false) enableOfflinePushNotifications: kotlin.Boolean?
, @RequestParam(value = "enable_online_push_notifications", required = false) enableOnlinePushNotifications: kotlin.Boolean?
, @RequestParam(value = "enable_digest_emails", required = false) enableDigestEmails: kotlin.Boolean?
, @RequestParam(value = "enable_marketing_emails", required = false) enableMarketingEmails: kotlin.Boolean?
, @RequestParam(value = "enable_login_emails", required = false) enableLoginEmails: kotlin.Boolean?
, @RequestParam(value = "message_content_in_email_notifications", required = false) messageContentInEmailNotifications: kotlin.Boolean?
, @RequestParam(value = "pm_content_in_desktop_notifications", required = false) pmContentInDesktopNotifications: kotlin.Boolean?
, @RequestParam(value = "wildcard_mentions_notify", required = false) wildcardMentionsNotify: kotlin.Boolean?
, @RequestParam(value = "desktop_icon_count_display", required = false) desktopIconCountDisplay: kotlin.Int?
, @RequestParam(value = "realm_name_in_notifications", required = false) realmNameInNotifications: kotlin.Boolean?
, @RequestParam(value = "presence_enabled", required = false) presenceEnabled: kotlin.Boolean?
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
