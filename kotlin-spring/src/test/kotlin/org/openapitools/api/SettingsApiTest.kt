package org.openapitools.api

import org.openapitools.model.JsonSuccessBase
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class SettingsApiTest {

    
    private val api: SettingsApiController = SettingsApiController()

    
    /**
    * Update settings
    *
    * This endpoint is used to edit the current user&#39;s settings.  &#x60;PATCH {{ api_url }}/v1/settings&#x60;  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the &#x60;full_name&#x60;, &#x60;email&#x60;, &#x60;old_password&#x60;, and &#x60;new_password&#x60; parameters. Notification settings were managed by &#x60;PATCH /settings/notifications&#x60;, and all other settings by &#x60;PATCH /settings/display&#x60;. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for &#x60;/settings&#x60; in Zulip 5.0 (feature level 78).  The &#x60;/settings/display&#x60; and &#x60;/settings/notifications&#x60; endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun updateSettingsTest() {
        val fullName:kotlin.String? = null
        val email:kotlin.String? = null
        val oldPassword:kotlin.String? = null
        val newPassword:kotlin.String? = null
        val twentyFourHourTime:kotlin.Boolean? = null
        val denseMode:kotlin.Boolean? = null
        val starredMessageCounts:kotlin.Boolean? = null
        val fluidLayoutWidth:kotlin.Boolean? = null
        val highContrastMode:kotlin.Boolean? = null
        val colorScheme:kotlin.Int? = null
        val enableDraftsSynchronization:kotlin.Boolean? = null
        val translateEmoticons:kotlin.Boolean? = null
        val defaultLanguage:kotlin.String? = null
        val defaultView:kotlin.String? = null
        val leftSideUserlist:kotlin.Boolean? = null
        val emojiset:kotlin.String? = null
        val demoteInactiveStreams:kotlin.Int? = null
        val timezone:kotlin.String? = null
        val enableStreamDesktopNotifications:kotlin.Boolean? = null
        val enableStreamEmailNotifications:kotlin.Boolean? = null
        val enableStreamPushNotifications:kotlin.Boolean? = null
        val enableStreamAudibleNotifications:kotlin.Boolean? = null
        val notificationSound:kotlin.String? = null
        val enableDesktopNotifications:kotlin.Boolean? = null
        val enableSounds:kotlin.Boolean? = null
        val emailNotificationsBatchingPeriodSeconds:kotlin.Int? = null
        val enableOfflineEmailNotifications:kotlin.Boolean? = null
        val enableOfflinePushNotifications:kotlin.Boolean? = null
        val enableOnlinePushNotifications:kotlin.Boolean? = null
        val enableDigestEmails:kotlin.Boolean? = null
        val enableMarketingEmails:kotlin.Boolean? = null
        val enableLoginEmails:kotlin.Boolean? = null
        val messageContentInEmailNotifications:kotlin.Boolean? = null
        val pmContentInDesktopNotifications:kotlin.Boolean? = null
        val wildcardMentionsNotify:kotlin.Boolean? = null
        val desktopIconCountDisplay:kotlin.Int? = null
        val realmNameInNotifications:kotlin.Boolean? = null
        val presenceEnabled:kotlin.Boolean? = null
        val enterSends:kotlin.Boolean? = null
        val response: ResponseEntity<JsonSuccessBase> = api.updateSettings(fullName!!, email!!, oldPassword!!, newPassword!!, twentyFourHourTime!!, denseMode!!, starredMessageCounts!!, fluidLayoutWidth!!, highContrastMode!!, colorScheme!!, enableDraftsSynchronization!!, translateEmoticons!!, defaultLanguage!!, defaultView!!, leftSideUserlist!!, emojiset!!, demoteInactiveStreams!!, timezone!!, enableStreamDesktopNotifications!!, enableStreamEmailNotifications!!, enableStreamPushNotifications!!, enableStreamAudibleNotifications!!, notificationSound!!, enableDesktopNotifications!!, enableSounds!!, emailNotificationsBatchingPeriodSeconds!!, enableOfflineEmailNotifications!!, enableOfflinePushNotifications!!, enableOnlinePushNotifications!!, enableDigestEmails!!, enableMarketingEmails!!, enableLoginEmails!!, messageContentInEmailNotifications!!, pmContentInDesktopNotifications!!, wildcardMentionsNotify!!, desktopIconCountDisplay!!, realmNameInNotifications!!, presenceEnabled!!, enterSends!!)

        // TODO: test validations
    }
    
}
