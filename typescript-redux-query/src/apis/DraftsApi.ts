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
    CodedError,
    CodedErrorFromJSON,
    CodedErrorToJSON,
    Draft,
    DraftFromJSON,
    DraftToJSON,
    JsonError,
    JsonErrorFromJSON,
    JsonErrorToJSON,
    JsonSuccess,
    JsonSuccessFromJSON,
    JsonSuccessToJSON,
} from '../models';

export interface CreateDraftsRequest {
    drafts?: Array<Draft>;
}

export interface DeleteDraftRequest {
    draftId: number;
}

export interface EditDraftRequest {
    draftId: number;
    draft: Draft;
}


/**
 * Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
 * Create drafts
 */
function createDraftsRaw<T>(requestParameters: CreateDraftsRequest, requestConfig: runtime.TypedQueryConfig<T, JsonSuccess & object> = {}): QueryConfig<T> {
    let queryParameters = null;

    queryParameters = {};


    if (requestParameters.drafts) {
        queryParameters['drafts'] = requestParameters.drafts;
    }

    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/drafts`,
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(JsonSuccess &amp; objectFromJSON(body), text);
    }

    return config;
}

/**
* Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
* Create drafts
*/
export function createDrafts<T>(requestParameters: CreateDraftsRequest, requestConfig?: runtime.TypedQueryConfig<T, JsonSuccess & object>): QueryConfig<T> {
    return createDraftsRaw(requestParameters, requestConfig);
}

/**
 * Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
 * Delete a draft
 */
function deleteDraftRaw<T>(requestParameters: DeleteDraftRequest, requestConfig: runtime.TypedQueryConfig<T, JsonSuccess> = {}): QueryConfig<T> {
    if (requestParameters.draftId === null || requestParameters.draftId === undefined) {
        throw new runtime.RequiredError('draftId','Required parameter requestParameters.draftId was null or undefined when calling deleteDraft.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/drafts/{draft_id}`.replace(`{${"draft_id"}}`, encodeURIComponent(String(requestParameters.draftId))),
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
* Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
* Delete a draft
*/
export function deleteDraft<T>(requestParameters: DeleteDraftRequest, requestConfig?: runtime.TypedQueryConfig<T, JsonSuccess>): QueryConfig<T> {
    return deleteDraftRaw(requestParameters, requestConfig);
}

/**
 * Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
 * Edit a draft
 */
function editDraftRaw<T>(requestParameters: EditDraftRequest, requestConfig: runtime.TypedQueryConfig<T, JsonSuccess> = {}): QueryConfig<T> {
    if (requestParameters.draftId === null || requestParameters.draftId === undefined) {
        throw new runtime.RequiredError('draftId','Required parameter requestParameters.draftId was null or undefined when calling editDraft.');
    }

    if (requestParameters.draft === null || requestParameters.draft === undefined) {
        throw new runtime.RequiredError('draft','Required parameter requestParameters.draft was null or undefined when calling editDraft.');
    }

    let queryParameters = null;

    queryParameters = {};


    if (requestParameters.draft !== undefined) {
        queryParameters['draft'] = requestParameters.draft;
    }

    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/drafts/{draft_id}`.replace(`{${"draft_id"}}`, encodeURIComponent(String(requestParameters.draftId))),
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
* Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
* Edit a draft
*/
export function editDraft<T>(requestParameters: EditDraftRequest, requestConfig?: runtime.TypedQueryConfig<T, JsonSuccess>): QueryConfig<T> {
    return editDraftRaw(requestParameters, requestConfig);
}

/**
 * Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
 * Get drafts
 */
function getDraftsRaw<T>( requestConfig: runtime.TypedQueryConfig<T, JsonSuccess & object> = {}): QueryConfig<T> {
    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/drafts`,
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(JsonSuccess &amp; objectFromJSON(body), text);
    }

    return config;
}

/**
* Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
* Get drafts
*/
export function getDrafts<T>( requestConfig?: runtime.TypedQueryConfig<T, JsonSuccess & object>): QueryConfig<T> {
    return getDraftsRaw( requestConfig);
}

