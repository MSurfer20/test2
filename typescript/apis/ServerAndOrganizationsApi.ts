// TODO: better import syntax?
import { BaseAPIRequestFactory, RequiredError } from './baseapi';
import {Configuration} from '../configuration';
import { RequestContext, HttpMethod, ResponseContext, HttpFile} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {isCodeInRange} from '../util';

import { JsonSuccess } from '../models/JsonSuccess';
import { JsonSuccessBase } from '../models/JsonSuccessBase';

/**
 * no description
 */
export class ServerAndOrganizationsApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
     * Add a code playground
     * @param name The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. 
     * @param pygmentsLanguage The name of the Pygments language lexer for that programming language. 
     * @param urlPrefix The url prefix for the playground. 
     */
    public async addCodePlayground(name: string, pygmentsLanguage: string, urlPrefix: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'name' is not null or undefined
        if (name === null || name === undefined) {
            throw new RequiredError('Required parameter name was null or undefined when calling addCodePlayground.');
        }


        // verify required parameter 'pygmentsLanguage' is not null or undefined
        if (pygmentsLanguage === null || pygmentsLanguage === undefined) {
            throw new RequiredError('Required parameter pygmentsLanguage was null or undefined when calling addCodePlayground.');
        }


        // verify required parameter 'urlPrefix' is not null or undefined
        if (urlPrefix === null || urlPrefix === undefined) {
            throw new RequiredError('Required parameter urlPrefix was null or undefined when calling addCodePlayground.');
        }


        // Path Params
        const localVarPath = '/realm/playgrounds';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (name !== undefined) {
            requestContext.setQueryParam("name", ObjectSerializer.serialize(name, "string", ""));
        }
        if (pygmentsLanguage !== undefined) {
            requestContext.setQueryParam("pygments_language", ObjectSerializer.serialize(pygmentsLanguage, "string", ""));
        }
        if (urlPrefix !== undefined) {
            requestContext.setQueryParam("url_prefix", ObjectSerializer.serialize(urlPrefix, "string", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 
     * Add a linkifier
     * @param pattern The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
     * @param urlFormatString The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. 
     */
    public async addLinkifier(pattern: string, urlFormatString: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'pattern' is not null or undefined
        if (pattern === null || pattern === undefined) {
            throw new RequiredError('Required parameter pattern was null or undefined when calling addLinkifier.');
        }


        // verify required parameter 'urlFormatString' is not null or undefined
        if (urlFormatString === null || urlFormatString === undefined) {
            throw new RequiredError('Required parameter urlFormatString was null or undefined when calling addLinkifier.');
        }


        // Path Params
        const localVarPath = '/realm/filters';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (pattern !== undefined) {
            requestContext.setQueryParam("pattern", ObjectSerializer.serialize(pattern, "string", ""));
        }
        if (urlFormatString !== undefined) {
            requestContext.setQueryParam("url_format_string", ObjectSerializer.serialize(urlFormatString, "string", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * [Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 
     * Create a custom profile field
     * @param fieldType The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
     * @param name The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile. 
     * @param hint The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
     * @param fieldData Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
     */
    public async createCustomProfileField(fieldType: number, name?: string, hint?: string, fieldData?: any, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'fieldType' is not null or undefined
        if (fieldType === null || fieldType === undefined) {
            throw new RequiredError('Required parameter fieldType was null or undefined when calling createCustomProfileField.');
        }





        // Path Params
        const localVarPath = '/realm/profile_fields';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (name !== undefined) {
            requestContext.setQueryParam("name", ObjectSerializer.serialize(name, "string", ""));
        }
        if (hint !== undefined) {
            requestContext.setQueryParam("hint", ObjectSerializer.serialize(hint, "string", ""));
        }
        if (fieldType !== undefined) {
            requestContext.setQueryParam("field_type", ObjectSerializer.serialize(fieldType, "number", ""));
        }
        if (fieldData !== undefined) {
            requestContext.setQueryParam("field_data", ObjectSerializer.serialize(fieldData, "any", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 
     * Get all custom emoji
     */
    public async getCustomEmoji(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/realm/emoji';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 
     * Get all custom profile fields
     */
    public async getCustomProfileFields(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/realm/profile_fields';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 
     * Get linkifiers
     */
    public async getLinkifiers(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/realm/linkifiers';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
     * Get server settings
     */
    public async getServerSettings(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/server_settings';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 
     * Remove a code playground
     * @param playgroundId The ID of the playground that you want to remove. 
     */
    public async removeCodePlayground(playgroundId: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'playgroundId' is not null or undefined
        if (playgroundId === null || playgroundId === undefined) {
            throw new RequiredError('Required parameter playgroundId was null or undefined when calling removeCodePlayground.');
        }


        // Path Params
        const localVarPath = '/realm/playgrounds/{playground_id}'
            .replace('{' + 'playground_id' + '}', encodeURIComponent(String(playgroundId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 
     * Remove a linkifier
     * @param filterId The ID of the linkifier that you want to remove. 
     */
    public async removeLinkifier(filterId: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'filterId' is not null or undefined
        if (filterId === null || filterId === undefined) {
            throw new RequiredError('Required parameter filterId was null or undefined when calling removeLinkifier.');
        }


        // Path Params
        const localVarPath = '/realm/filters/{filter_id}'
            .replace('{' + 'filter_id' + '}', encodeURIComponent(String(filterId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
     * Reorder custom profile fields
     * @param order A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. 
     */
    public async reorderCustomProfileFields(order: Array<number>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'order' is not null or undefined
        if (order === null || order === undefined) {
            throw new RequiredError('Required parameter order was null or undefined when calling reorderCustomProfileFields.');
        }


        // Path Params
        const localVarPath = '/realm/profile_fields';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (order !== undefined) {
            requestContext.setQueryParam("order", ObjectSerializer.serialize(order, "Array<number>", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 
     * Update a linkifier
     * @param filterId The ID of the linkifier that you want to update. 
     * @param pattern The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
     * @param urlFormatString The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. 
     */
    public async updateLinkifier(filterId: number, pattern: string, urlFormatString: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'filterId' is not null or undefined
        if (filterId === null || filterId === undefined) {
            throw new RequiredError('Required parameter filterId was null or undefined when calling updateLinkifier.');
        }


        // verify required parameter 'pattern' is not null or undefined
        if (pattern === null || pattern === undefined) {
            throw new RequiredError('Required parameter pattern was null or undefined when calling updateLinkifier.');
        }


        // verify required parameter 'urlFormatString' is not null or undefined
        if (urlFormatString === null || urlFormatString === undefined) {
            throw new RequiredError('Required parameter urlFormatString was null or undefined when calling updateLinkifier.');
        }


        // Path Params
        const localVarPath = '/realm/filters/{filter_id}'
            .replace('{' + 'filter_id' + '}', encodeURIComponent(String(filterId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (pattern !== undefined) {
            requestContext.setQueryParam("pattern", ObjectSerializer.serialize(pattern, "string", ""));
        }
        if (urlFormatString !== undefined) {
            requestContext.setQueryParam("url_format_string", ObjectSerializer.serialize(urlFormatString, "string", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 
     * Upload custom emoji
     * @param emojiName The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). 
     * @param filename 
     */
    public async uploadCustomEmoji(emojiName: string, filename?: HttpFile, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'emojiName' is not null or undefined
        if (emojiName === null || emojiName === undefined) {
            throw new RequiredError('Required parameter emojiName was null or undefined when calling uploadCustomEmoji.');
        }



        // Path Params
        const localVarPath = '/realm/emoji/{emoji_name}'
            .replace('{' + 'emoji_name' + '}', encodeURIComponent(String(emojiName)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params
        let localVarFormParams = new FormData();

        if (filename !== undefined) {
             // TODO: replace .append with .set
             localVarFormParams.append('filename', filename, filename.name);
        }
        requestContext.setBody(localVarFormParams);

        // Body Params

        // Apply auth methods

        return requestContext;
    }

}

export class ServerAndOrganizationsApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to addCodePlayground
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async addCodePlayground(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to addLinkifier
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async addLinkifier(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createCustomProfileField
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async createCustomProfileField(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getCustomEmoji
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getCustomEmoji(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getCustomProfileFields
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getCustomProfileFields(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getLinkifiers
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getLinkifiers(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getServerSettings
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getServerSettings(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to removeCodePlayground
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async removeCodePlayground(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to removeLinkifier
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async removeLinkifier(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reorderCustomProfileFields
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reorderCustomProfileFields(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateLinkifier
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateLinkifier(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to uploadCustomEmoji
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async uploadCustomEmoji(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

}
