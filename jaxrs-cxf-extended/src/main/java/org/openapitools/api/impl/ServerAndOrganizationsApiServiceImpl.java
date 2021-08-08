package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.io.File;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Zulip REST API
 *
 * <p>Powerful open source group chat 
 *
 */
public class ServerAndOrganizationsApiServiceImpl implements ServerAndOrganizationsApi {
    /**
     * Add a code playground
     *
     * Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  &#x60;POST {{ api_url }}/v1/realm/playgrounds&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
     *
     */
    @Override
    public JsonSuccessBase addCodePlayground(String name, String pygmentsLanguage, String urlPrefix) {
        // TODO: Implement...
        return null;
    }

    /**
     * Add a linkifier
     *
     * Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;POST {{ api_url }}/v1/realm/filters&#x60; 
     *
     */
    @Override
    public JsonSuccessBase addLinkifier(String pattern, String urlFormatString) {
        // TODO: Implement...
        return null;
    }

    /**
     * Create a custom profile field
     *
     * [Create a custom profile field](/help/add-custom-profile-fields) in the user&#39;s organization.  &#x60;POST {{ api_url }}/v1/realm/profile_fields&#x60; 
     *
     */
    @Override
    public JsonSuccessBase createCustomProfileField(Integer fieldType, String name, String hint, Object fieldData) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get all custom emoji
     *
     * Get all the custom emoji in the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/emoji&#x60; 
     *
     */
    @Override
    public JsonSuccessBase getCustomEmoji() {
        // TODO: Implement...
        return null;
    }

    /**
     * Get all custom profile fields
     *
     * Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/profile_fields&#x60; 
     *
     */
    @Override
    public JsonSuccessBase getCustomProfileFields() {
        // TODO: Implement...
        return null;
    }

    /**
     * Get linkifiers
     *
     * List all of an organization&#39;s configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;GET {{ api_url }}/v1/realm/linkifiers&#x60;  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar &#x60;GET /realm/filters&#x60; endpoint was available with each entry in a &#x60;[pattern, url_format, id]&#x60; tuple format. 
     *
     */
    @Override
    public JsonSuccessBase getLinkifiers() {
        // TODO: Implement...
        return null;
    }

    /**
     * Get server settings
     *
     * Fetch global settings for a Zulip server.  &#x60;GET {{ api_url }}/v1/server_settings&#x60;  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it&#39;s running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
     *
     */
    @Override
    public JsonSuccessBase getServerSettings() {
        // TODO: Implement...
        return null;
    }

    /**
     * Remove a code playground
     *
     * Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  &#x60;DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). 
     *
     */
    @Override
    public JsonSuccess removeCodePlayground(Integer playgroundId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Remove a linkifier
     *
     * Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;DELETE {{ api_url }}/v1/realm/filters/{filter_id}&#x60; 
     *
     */
    @Override
    public JsonSuccess removeLinkifier(Integer filterId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Reorder custom profile fields
     *
     * Reorder the custom profile fields in the user&#39;s organization.  &#x60;PATCH {{ api_url }}/v1/realm/profile_fields&#x60;  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
     *
     */
    @Override
    public JsonSuccess reorderCustomProfileFields(List<Integer> order) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update a linkifier
     *
     * Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;PATCH {{ api_url }}/v1/realm/filters/{filter_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 57). 
     *
     */
    @Override
    public JsonSuccess updateLinkifier(Integer filterId, String pattern, String urlFormatString) {
        // TODO: Implement...
        return null;
    }

    /**
     * Upload custom emoji
     *
     * This endpoint is used to upload a custom emoji for use in the user&#39;s organization.  Access to this endpoint depends on the [organization&#39;s configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  &#x60;POST {{ api_url }}/v1/realm/emoji/{emoji_name}&#x60; 
     *
     */
    @Override
    public JsonSuccess uploadCustomEmoji(String emojiName,  Attachment filenameDetail) {
        // TODO: Implement...
        return null;
    }

}
