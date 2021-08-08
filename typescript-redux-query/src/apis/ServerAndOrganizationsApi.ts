// tslint:disable
/**
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


import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../runtime';
import {
    JsonSuccess,
    JsonSuccessFromJSON,
    JsonSuccessToJSON,
    JsonSuccessBase,
    JsonSuccessBaseFromJSON,
    JsonSuccessBaseToJSON,
} from '../models';

export interface AddCodePlaygroundRequest {
    name: string;
    pygmentsLanguage: string;
    urlPrefix: string;
}

export interface AddLinkifierRequest {
    pattern: string;
    urlFormatString: string;
}

export interface CreateCustomProfileFieldRequest {
    fieldType: number;
    name?: string;
    hint?: string;
    fieldData?: object;
}

export interface RemoveCodePlaygroundRequest {
    playgroundId: number;
}

export interface RemoveLinkifierRequest {
    filterId: number;
}

export interface ReorderCustomProfileFieldsRequest {
    order: Array<number>;
}

export interface UpdateLinkifierRequest {
    filterId: number;
    pattern: string;
    urlFormatString: string;
}

export interface UploadCustomEmojiRequest {
    emojiName: string;
    filename?: Blob;
}


/**
 * Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
 * Add a code playground
 */
function addCodePlaygroundRaw<T>(requestParameters: AddCodePlaygroundRequest, requestConfig: runtime.TypedQueryConfig<T, JsonSuccessBase & object> = {}): QueryConfig<T> {
    if (requestParameters.name === null || requestParameters.name === undefined) {
        throw new runtime.RequiredError('name','Required parameter requestParameters.name was null or undefined when calling addCodePlayground.');
    }

    if (requestParameters.pygmentsLanguage === null || requestParameters.pygmentsLanguage === undefined) {
        throw new runtime.RequiredError('pygmentsLanguage','Required parameter requestParameters.pygmentsLanguage was null or undefined when calling addCodePlayground.');
    }

    if (requestParameters.urlPrefix === null || requestParameters.urlPrefix === undefined) {
        throw new runtime.RequiredError('urlPrefix','Required parameter requestParameters.urlPrefix was null or undefined when calling addCodePlayground.');
    }

    let queryParameters = null;

    queryParameters = {};


    if (requestParameters.name !== undefined) {
        queryParameters['name'] = requestParameters.name;
    }


    if (requestParameters.pygmentsLanguage !== undefined) {
        queryParameters['pygments_language'] = requestParameters.pygmentsLanguage;
    }


    if (requestParameters.urlPrefix !== undefined) {
        queryParameters['url_prefix'] = requestParameters.urlPrefix;
    }

    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/realm/playgrounds`,
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'POST',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(JsonSuccessBase &amp; objectFromJSON(body), text);
    }

    return config;
}

/**
* Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
* Add a code playground
*/
export function addCodePlayground<T>(requestParameters: AddCodePlaygroundRequest, requestConfig?: runtime.TypedQueryConfig<T, JsonSuccessBase & object>): QueryConfig<T> {
    return addCodePlaygroundRaw(requestParameters, requestConfig);
}

/**
 * Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 
 * Add a linkifier
 */
function addLinkifierRaw<T>(requestParameters: AddLinkifierRequest, requestConfig: runtime.TypedQueryConfig<T, JsonSuccessBase & object> = {}): QueryConfig<T> {
    if (requestParameters.pattern === null || requestParameters.pattern === undefined) {
        throw new runtime.RequiredError('pattern','Required parameter requestParameters.pattern was null or undefined when calling addLinkifier.');
    }

    if (requestParameters.urlFormatString === null || requestParameters.urlFormatString === undefined) {
        throw new runtime.RequiredError('urlFormatString','Required parameter requestParameters.urlFormatString was null or undefined when calling addLinkifier.');
    }

    let queryParameters = null;

    queryParameters = {};


    if (requestParameters.pattern !== undefined) {
        queryParameters['pattern'] = requestParameters.pattern;
    }


    if (requestParameters.urlFormatString !== undefined) {
        queryParameters['url_format_string'] = requestParameters.urlFormatString;
    }

    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/realm/filters`,
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'POST',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(JsonSuccessBase &amp; objectFromJSON(body), text);
    }

    return config;
}

/**
* Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 
* Add a linkifier
*/
export function addLinkifier<T>(requestParameters: AddLinkifierRequest, requestConfig?: runtime.TypedQueryConfig<T, JsonSuccessBase & object>): QueryConfig<T> {
    return addLinkifierRaw(requestParameters, requestConfig);
}

/**
 * [Create a custom profile field](/help/add-custom-profile-fields) in the user\'s organization.  `POST {{ api_url }}/v1/realm/profile_fields` 
 * Create a custom profile field
 */
function createCustomProfileFieldRaw<T>(requestParameters: CreateCustomProfileFieldRequest, requestConfig: runtime.TypedQueryConfig<T, JsonSuccessBase & object> = {}): QueryConfig<T> {
    if (requestParameters.fieldType === null || requestParameters.fieldType === undefined) {
        throw new runtime.RequiredError('fieldType','Required parameter requestParameters.fieldType was null or undefined when calling createCustomProfileField.');
    }

    let queryParameters = null;

    queryParameters = {};


    if (requestParameters.name !== undefined) {
        queryParameters['name'] = requestParameters.name;
    }


    if (requestParameters.hint !== undefined) {
        queryParameters['hint'] = requestParameters.hint;
    }


    if (requestParameters.fieldType !== undefined) {
        queryParameters['field_type'] = requestParameters.fieldType;
    }


    if (requestParameters.fieldData !== undefined) {
        queryParameters['field_data'] = requestParameters.fieldData;
    }

    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/realm/profile_fields`,
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'POST',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(JsonSuccessBase &amp; objectFromJSON(body), text);
    }

    return config;
}

/**
* [Create a custom profile field](/help/add-custom-profile-fields) in the user\'s organization.  `POST {{ api_url }}/v1/realm/profile_fields` 
* Create a custom profile field
*/
export function createCustomProfileField<T>(requestParameters: CreateCustomProfileFieldRequest, requestConfig?: runtime.TypedQueryConfig<T, JsonSuccessBase & object>): QueryConfig<T> {
    return createCustomProfileFieldRaw(requestParameters, requestConfig);
}

/**
 * Get all the custom emoji in the user\'s organization.  `GET {{ api_url }}/v1/realm/emoji` 
 * Get all custom emoji
 */
function getCustomEmojiRaw<T>( requestConfig: runtime.TypedQueryConfig<T, JsonSuccessBase & object> = {}): QueryConfig<T> {
    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/realm/emoji`,
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'GET',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(JsonSuccessBase &amp; objectFromJSON(body), text);
    }

    return config;
}

/**
* Get all the custom emoji in the user\'s organization.  `GET {{ api_url }}/v1/realm/emoji` 
* Get all custom emoji
*/
export function getCustomEmoji<T>( requestConfig?: runtime.TypedQueryConfig<T, JsonSuccessBase & object>): QueryConfig<T> {
    return getCustomEmojiRaw( requestConfig);
}

/**
 * Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user\'s organization.  `GET {{ api_url }}/v1/realm/profile_fields` 
 * Get all custom profile fields
 */
function getCustomProfileFieldsRaw<T>( requestConfig: runtime.TypedQueryConfig<T, JsonSuccessBase & object> = {}): QueryConfig<T> {
    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/realm/profile_fields`,
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'GET',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(JsonSuccessBase &amp; objectFromJSON(body), text);
    }

    return config;
}

/**
* Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user\'s organization.  `GET {{ api_url }}/v1/realm/profile_fields` 
* Get all custom profile fields
*/
export function getCustomProfileFields<T>( requestConfig?: runtime.TypedQueryConfig<T, JsonSuccessBase & object>): QueryConfig<T> {
    return getCustomProfileFieldsRaw( requestConfig);
}

/**
 * List all of an organization\'s configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 
 * Get linkifiers
 */
function getLinkifiersRaw<T>( requestConfig: runtime.TypedQueryConfig<T, JsonSuccessBase & object> = {}): QueryConfig<T> {
    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/realm/linkifiers`,
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'GET',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(JsonSuccessBase &amp; objectFromJSON(body), text);
    }

    return config;
}

/**
* List all of an organization\'s configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 
* Get linkifiers
*/
export function getLinkifiers<T>( requestConfig?: runtime.TypedQueryConfig<T, JsonSuccessBase & object>): QueryConfig<T> {
    return getLinkifiersRaw( requestConfig);
}

/**
 * Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it\'s running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
 * Get server settings
 */
function getServerSettingsRaw<T>( requestConfig: runtime.TypedQueryConfig<T, JsonSuccessBase & object> = {}): QueryConfig<T> {
    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/server_settings`,
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'GET',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(JsonSuccessBase &amp; objectFromJSON(body), text);
    }

    return config;
}

/**
* Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it\'s running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
* Get server settings
*/
export function getServerSettings<T>( requestConfig?: runtime.TypedQueryConfig<T, JsonSuccessBase & object>): QueryConfig<T> {
    return getServerSettingsRaw( requestConfig);
}

/**
 * Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 
 * Remove a code playground
 */
function removeCodePlaygroundRaw<T>(requestParameters: RemoveCodePlaygroundRequest, requestConfig: runtime.TypedQueryConfig<T, JsonSuccess> = {}): QueryConfig<T> {
    if (requestParameters.playgroundId === null || requestParameters.playgroundId === undefined) {
        throw new runtime.RequiredError('playgroundId','Required parameter requestParameters.playgroundId was null or undefined when calling removeCodePlayground.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/realm/playgrounds/{playground_id}`.replace(`{${"playground_id"}}`, encodeURIComponent(String(requestParameters.playgroundId))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'DELETE',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(JsonSuccessFromJSON(body), text);
    }

    return config;
}

/**
* Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 
* Remove a code playground
*/
export function removeCodePlayground<T>(requestParameters: RemoveCodePlaygroundRequest, requestConfig?: runtime.TypedQueryConfig<T, JsonSuccess>): QueryConfig<T> {
    return removeCodePlaygroundRaw(requestParameters, requestConfig);
}

/**
 * Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 
 * Remove a linkifier
 */
function removeLinkifierRaw<T>(requestParameters: RemoveLinkifierRequest, requestConfig: runtime.TypedQueryConfig<T, JsonSuccess> = {}): QueryConfig<T> {
    if (requestParameters.filterId === null || requestParameters.filterId === undefined) {
        throw new runtime.RequiredError('filterId','Required parameter requestParameters.filterId was null or undefined when calling removeLinkifier.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/realm/filters/{filter_id}`.replace(`{${"filter_id"}}`, encodeURIComponent(String(requestParameters.filterId))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'DELETE',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(JsonSuccessFromJSON(body), text);
    }

    return config;
}

/**
* Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 
* Remove a linkifier
*/
export function removeLinkifier<T>(requestParameters: RemoveLinkifierRequest, requestConfig?: runtime.TypedQueryConfig<T, JsonSuccess>): QueryConfig<T> {
    return removeLinkifierRaw(requestParameters, requestConfig);
}

/**
 * Reorder the custom profile fields in the user\'s organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
 * Reorder custom profile fields
 */
function reorderCustomProfileFieldsRaw<T>(requestParameters: ReorderCustomProfileFieldsRequest, requestConfig: runtime.TypedQueryConfig<T, JsonSuccess> = {}): QueryConfig<T> {
    if (requestParameters.order === null || requestParameters.order === undefined) {
        throw new runtime.RequiredError('order','Required parameter requestParameters.order was null or undefined when calling reorderCustomProfileFields.');
    }

    let queryParameters = null;

    queryParameters = {};


    if (requestParameters.order) {
        queryParameters['order'] = requestParameters.order;
    }

    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/realm/profile_fields`,
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'PATCH',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(JsonSuccessFromJSON(body), text);
    }

    return config;
}

/**
* Reorder the custom profile fields in the user\'s organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
* Reorder custom profile fields
*/
export function reorderCustomProfileFields<T>(requestParameters: ReorderCustomProfileFieldsRequest, requestConfig?: runtime.TypedQueryConfig<T, JsonSuccess>): QueryConfig<T> {
    return reorderCustomProfileFieldsRaw(requestParameters, requestConfig);
}

/**
 * Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 
 * Update a linkifier
 */
function updateLinkifierRaw<T>(requestParameters: UpdateLinkifierRequest, requestConfig: runtime.TypedQueryConfig<T, JsonSuccess> = {}): QueryConfig<T> {
    if (requestParameters.filterId === null || requestParameters.filterId === undefined) {
        throw new runtime.RequiredError('filterId','Required parameter requestParameters.filterId was null or undefined when calling updateLinkifier.');
    }

    if (requestParameters.pattern === null || requestParameters.pattern === undefined) {
        throw new runtime.RequiredError('pattern','Required parameter requestParameters.pattern was null or undefined when calling updateLinkifier.');
    }

    if (requestParameters.urlFormatString === null || requestParameters.urlFormatString === undefined) {
        throw new runtime.RequiredError('urlFormatString','Required parameter requestParameters.urlFormatString was null or undefined when calling updateLinkifier.');
    }

    let queryParameters = null;

    queryParameters = {};


    if (requestParameters.pattern !== undefined) {
        queryParameters['pattern'] = requestParameters.pattern;
    }


    if (requestParameters.urlFormatString !== undefined) {
        queryParameters['url_format_string'] = requestParameters.urlFormatString;
    }

    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/realm/filters/{filter_id}`.replace(`{${"filter_id"}}`, encodeURIComponent(String(requestParameters.filterId))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'PATCH',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(JsonSuccessFromJSON(body), text);
    }

    return config;
}

/**
* Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 
* Update a linkifier
*/
export function updateLinkifier<T>(requestParameters: UpdateLinkifierRequest, requestConfig?: runtime.TypedQueryConfig<T, JsonSuccess>): QueryConfig<T> {
    return updateLinkifierRaw(requestParameters, requestConfig);
}

/**
 * This endpoint is used to upload a custom emoji for use in the user\'s organization.  Access to this endpoint depends on the [organization\'s configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 
 * Upload custom emoji
 */
function uploadCustomEmojiRaw<T>(requestParameters: UploadCustomEmojiRequest, requestConfig: runtime.TypedQueryConfig<T, JsonSuccess> = {}): QueryConfig<T> {
    if (requestParameters.emojiName === null || requestParameters.emojiName === undefined) {
        throw new runtime.RequiredError('emojiName','Required parameter requestParameters.emojiName was null or undefined when calling uploadCustomEmoji.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const formData = new FormData();
    if (requestParameters.filename !== undefined) {
        formData.append('filename', requestParameters.filename as any);
    }

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/realm/emoji/{emoji_name}`.replace(`{${"emoji_name"}}`, encodeURIComponent(String(requestParameters.emojiName))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'POST',
            headers: headerParameters,
        },
        body: formData,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(JsonSuccessFromJSON(body), text);
    }

    return config;
}

/**
* This endpoint is used to upload a custom emoji for use in the user\'s organization.  Access to this endpoint depends on the [organization\'s configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 
* Upload custom emoji
*/
export function uploadCustomEmoji<T>(requestParameters: UploadCustomEmojiRequest, requestConfig?: runtime.TypedQueryConfig<T, JsonSuccess>): QueryConfig<T> {
    return uploadCustomEmojiRaw(requestParameters, requestConfig);
}
