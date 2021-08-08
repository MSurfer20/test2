/* tslint:disable */
/* eslint-disable */
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
 * 
 */
export class DraftsApi extends runtime.BaseAPI {

    /**
     * Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
     * Create drafts
     */
    async createDraftsRaw(requestParameters: CreateDraftsRequest): Promise<runtime.ApiResponse<JsonSuccess & object>> {
        const queryParameters: any = {};

        if (requestParameters.drafts) {
            queryParameters['drafts'] = requestParameters.drafts;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/drafts`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => JsonSuccess &amp; objectFromJSON(jsonValue));
    }

    /**
     * Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
     * Create drafts
     */
    async createDrafts(requestParameters: CreateDraftsRequest): Promise<JsonSuccess & object> {
        const response = await this.createDraftsRaw(requestParameters);
        return await response.value();
    }

    /**
     * Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
     * Delete a draft
     */
    async deleteDraftRaw(requestParameters: DeleteDraftRequest): Promise<runtime.ApiResponse<JsonSuccess>> {
        if (requestParameters.draftId === null || requestParameters.draftId === undefined) {
            throw new runtime.RequiredError('draftId','Required parameter requestParameters.draftId was null or undefined when calling deleteDraft.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/drafts/{draft_id}`.replace(`{${"draft_id"}}`, encodeURIComponent(String(requestParameters.draftId))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => JsonSuccessFromJSON(jsonValue));
    }

    /**
     * Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
     * Delete a draft
     */
    async deleteDraft(requestParameters: DeleteDraftRequest): Promise<JsonSuccess> {
        const response = await this.deleteDraftRaw(requestParameters);
        return await response.value();
    }

    /**
     * Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
     * Edit a draft
     */
    async editDraftRaw(requestParameters: EditDraftRequest): Promise<runtime.ApiResponse<JsonSuccess>> {
        if (requestParameters.draftId === null || requestParameters.draftId === undefined) {
            throw new runtime.RequiredError('draftId','Required parameter requestParameters.draftId was null or undefined when calling editDraft.');
        }

        if (requestParameters.draft === null || requestParameters.draft === undefined) {
            throw new runtime.RequiredError('draft','Required parameter requestParameters.draft was null or undefined when calling editDraft.');
        }

        const queryParameters: any = {};

        if (requestParameters.draft !== undefined) {
            queryParameters['draft'] = requestParameters.draft;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/drafts/{draft_id}`.replace(`{${"draft_id"}}`, encodeURIComponent(String(requestParameters.draftId))),
            method: 'PATCH',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => JsonSuccessFromJSON(jsonValue));
    }

    /**
     * Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
     * Edit a draft
     */
    async editDraft(requestParameters: EditDraftRequest): Promise<JsonSuccess> {
        const response = await this.editDraftRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
     * Get drafts
     */
    async getDraftsRaw(): Promise<runtime.ApiResponse<JsonSuccess & object>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/drafts`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => JsonSuccess &amp; objectFromJSON(jsonValue));
    }

    /**
     * Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
     * Get drafts
     */
    async getDrafts(): Promise<JsonSuccess & object> {
        const response = await this.getDraftsRaw();
        return await response.value();
    }

}
