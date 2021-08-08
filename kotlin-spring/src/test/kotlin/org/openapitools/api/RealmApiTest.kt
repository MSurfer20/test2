package org.openapitools.api

import org.openapitools.model.JsonSuccess
import org.openapitools.model.JsonSuccessBase
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class RealmApiTest {

    
    private val api: RealmApiController = RealmApiController()

    
    /**
    * Add a code playground
    *
    * Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  &#x60;POST {{ api_url }}/v1/realm/playgrounds&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun addCodePlaygroundTest() {
        val name:kotlin.String? = null
        val pygmentsLanguage:kotlin.String? = null
        val urlPrefix:kotlin.String? = null
        val response: ResponseEntity<JsonSuccessBase> = api.addCodePlayground(name!!, pygmentsLanguage!!, urlPrefix!!)

        // TODO: test validations
    }
    
    /**
    * Add a linkifier
    *
    * Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;POST {{ api_url }}/v1/realm/filters&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun addLinkifierTest() {
        val pattern:kotlin.String? = null
        val urlFormatString:kotlin.String? = null
        val response: ResponseEntity<JsonSuccessBase> = api.addLinkifier(pattern!!, urlFormatString!!)

        // TODO: test validations
    }
    
    /**
    * Create a custom profile field
    *
    * [Create a custom profile field](/help/add-custom-profile-fields) in the user&#39;s organization.  &#x60;POST {{ api_url }}/v1/realm/profile_fields&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun createCustomProfileFieldTest() {
        val fieldType:kotlin.Int? = null
        val name:kotlin.String? = null
        val hint:kotlin.String? = null
        val fieldData:kotlin.Any? = null
        val response: ResponseEntity<JsonSuccessBase> = api.createCustomProfileField(fieldType!!, name!!, hint!!, fieldData!!)

        // TODO: test validations
    }
    
    /**
    * Get all custom emoji
    *
    * Get all the custom emoji in the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/emoji&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getCustomEmojiTest() {
        val response: ResponseEntity<JsonSuccessBase> = api.getCustomEmoji()

        // TODO: test validations
    }
    
    /**
    * Get all custom profile fields
    *
    * Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/profile_fields&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getCustomProfileFieldsTest() {
        val response: ResponseEntity<JsonSuccessBase> = api.getCustomProfileFields()

        // TODO: test validations
    }
    
    /**
    * Get linkifiers
    *
    * List all of an organization&#39;s configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;GET {{ api_url }}/v1/realm/linkifiers&#x60;  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar &#x60;GET /realm/filters&#x60; endpoint was available with each entry in a &#x60;[pattern, url_format, id]&#x60; tuple format. 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getLinkifiersTest() {
        val response: ResponseEntity<JsonSuccessBase> = api.getLinkifiers()

        // TODO: test validations
    }
    
    /**
    * Remove a code playground
    *
    * Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  &#x60;DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun removeCodePlaygroundTest() {
        val playgroundId:kotlin.Int? = null
        val response: ResponseEntity<JsonSuccess> = api.removeCodePlayground(playgroundId!!)

        // TODO: test validations
    }
    
    /**
    * Remove a linkifier
    *
    * Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;DELETE {{ api_url }}/v1/realm/filters/{filter_id}&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun removeLinkifierTest() {
        val filterId:kotlin.Int? = null
        val response: ResponseEntity<JsonSuccess> = api.removeLinkifier(filterId!!)

        // TODO: test validations
    }
    
    /**
    * Reorder custom profile fields
    *
    * Reorder the custom profile fields in the user&#39;s organization.  &#x60;PATCH {{ api_url }}/v1/realm/profile_fields&#x60;  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun reorderCustomProfileFieldsTest() {
        val order:kotlin.collections.List<kotlin.Int>? = null
        val response: ResponseEntity<JsonSuccess> = api.reorderCustomProfileFields(order!!)

        // TODO: test validations
    }
    
    /**
    * Update a linkifier
    *
    * Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;PATCH {{ api_url }}/v1/realm/filters/{filter_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 57). 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun updateLinkifierTest() {
        val filterId:kotlin.Int? = null
        val pattern:kotlin.String? = null
        val urlFormatString:kotlin.String? = null
        val response: ResponseEntity<JsonSuccess> = api.updateLinkifier(filterId!!, pattern!!, urlFormatString!!)

        // TODO: test validations
    }
    
    /**
    * Upload custom emoji
    *
    * This endpoint is used to upload a custom emoji for use in the user&#39;s organization.  Access to this endpoint depends on the [organization&#39;s configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  &#x60;POST {{ api_url }}/v1/realm/emoji/{emoji_name}&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun uploadCustomEmojiTest() {
        val emojiName:kotlin.String? = null
        val filename:org.springframework.core.io.Resource? = null
        val response: ResponseEntity<JsonSuccess> = api.uploadCustomEmoji(emojiName!!, filename!!)

        // TODO: test validations
    }
    
}
