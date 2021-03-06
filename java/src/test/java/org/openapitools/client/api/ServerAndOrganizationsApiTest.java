/*
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import java.io.File;
import org.openapitools.client.model.JsonSuccess;
import org.openapitools.client.model.JsonSuccessBase;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ServerAndOrganizationsApi
 */
@Ignore
public class ServerAndOrganizationsApiTest {

    private final ServerAndOrganizationsApi api = new ServerAndOrganizationsApi();

    
    /**
     * Add a code playground
     *
     * Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  &#x60;POST {{ api_url }}/v1/realm/playgrounds&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCodePlaygroundTest() throws ApiException {
        String name = null;
        String pygmentsLanguage = null;
        String urlPrefix = null;
        JsonSuccessBase response = api.addCodePlayground(name, pygmentsLanguage, urlPrefix);

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
    public void addLinkifierTest() throws ApiException {
        String pattern = null;
        String urlFormatString = null;
        JsonSuccessBase response = api.addLinkifier(pattern, urlFormatString);

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
    public void createCustomProfileFieldTest() throws ApiException {
        Integer fieldType = null;
        String name = null;
        String hint = null;
        Object fieldData = null;
        JsonSuccessBase response = api.createCustomProfileField(fieldType, name, hint, fieldData);

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
    public void getCustomEmojiTest() throws ApiException {
        JsonSuccessBase response = api.getCustomEmoji();

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
    public void getCustomProfileFieldsTest() throws ApiException {
        JsonSuccessBase response = api.getCustomProfileFields();

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
    public void getLinkifiersTest() throws ApiException {
        JsonSuccessBase response = api.getLinkifiers();

        // TODO: test validations
    }
    
    /**
     * Get server settings
     *
     * Fetch global settings for a Zulip server.  &#x60;GET {{ api_url }}/v1/server_settings&#x60;  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it&#39;s running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getServerSettingsTest() throws ApiException {
        JsonSuccessBase response = api.getServerSettings();

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
    public void removeCodePlaygroundTest() throws ApiException {
        Integer playgroundId = null;
        JsonSuccess response = api.removeCodePlayground(playgroundId);

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
    public void removeLinkifierTest() throws ApiException {
        Integer filterId = null;
        JsonSuccess response = api.removeLinkifier(filterId);

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
    public void reorderCustomProfileFieldsTest() throws ApiException {
        List<Integer> order = null;
        JsonSuccess response = api.reorderCustomProfileFields(order);

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
    public void updateLinkifierTest() throws ApiException {
        Integer filterId = null;
        String pattern = null;
        String urlFormatString = null;
        JsonSuccess response = api.updateLinkifier(filterId, pattern, urlFormatString);

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
    public void uploadCustomEmojiTest() throws ApiException {
        String emojiName = null;
        File filename = null;
        JsonSuccess response = api.uploadCustomEmoji(emojiName, filename);

        // TODO: test validations
    }
    
}
