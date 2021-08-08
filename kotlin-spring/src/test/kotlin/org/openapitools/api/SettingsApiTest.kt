package org.openapitools.api

import org.openapitools.model.JsonSuccessBase
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class SettingsApiTest {

    
    private val api: SettingsApiController = SettingsApiController()

    
    /**
    * Update display settings
    *
    * This endpoint is used to edit the current user&#39;s user interface settings.  &#x60;PATCH {{ api_url }}/v1/settings/display&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun updateDisplaySettingsTest() {
        val twentyFourHourTime:kotlin.Boolean? = null
        val denseMode:kotlin.Boolean? = null
        val starredMessageCounts:kotlin.Boolean? = null
        val fluidLayoutWidth:kotlin.Boolean? = null
        val highContrastMode:kotlin.Boolean? = null
        val colorScheme:kotlin.Int? = null
        val translateEmoticons:kotlin.Boolean? = null
        val defaultLanguage:kotlin.String? = null
        val defaultView:kotlin.String? = null
        val leftSideUserlist:kotlin.Boolean? = null
        val emojiset:kotlin.String? = null
        val demoteInactiveStreams:kotlin.Int? = null
        val timezone:kotlin.String? = null
        val response: ResponseEntity<JsonSuccessBase> = api.updateDisplaySettings(twentyFourHourTime!!, denseMode!!, starredMessageCounts!!, fluidLayoutWidth!!, highContrastMode!!, colorScheme!!, translateEmoticons!!, defaultLanguage!!, defaultView!!, leftSideUserlist!!, emojiset!!, demoteInactiveStreams!!, timezone!!)

        // TODO: test validations
    }
    
    /**
    * Update notification settings
    *
    * This endpoint is used to edit the user&#39;s global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  &#x60;PATCH {{ api_url }}/v1/settings/notifications&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun updateNotificationSettingsTest() {
        val enableStreamDesktopNotifications:kotlin.Boolean? = null
        val enableStreamEmailNotifications:kotlin.Boolean? = null
        val enableStreamPushNotifications:kotlin.Boolean? = null
        val enableStreamAudibleNotifications:kotlin.Boolean? = null
        val notificationSound:kotlin.String? = null
        val enableDesktopNotifications:kotlin.Boolean? = null
        val enableSounds:kotlin.Boolean? = null
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
        val response: ResponseEntity<JsonSuccessBase> = api.updateNotificationSettings(enableStreamDesktopNotifications!!, enableStreamEmailNotifications!!, enableStreamPushNotifications!!, enableStreamAudibleNotifications!!, notificationSound!!, enableDesktopNotifications!!, enableSounds!!, enableOfflineEmailNotifications!!, enableOfflinePushNotifications!!, enableOnlinePushNotifications!!, enableDigestEmails!!, enableMarketingEmails!!, enableLoginEmails!!, messageContentInEmailNotifications!!, pmContentInDesktopNotifications!!, wildcardMentionsNotify!!, desktopIconCountDisplay!!, realmNameInNotifications!!, presenceEnabled!!)

        // TODO: test validations
    }
    
}
