// TODO: better import syntax?
import { BaseAPIRequestFactory, RequiredError } from './baseapi';
import {Configuration} from '../configuration';
import { RequestContext, HttpMethod, ResponseContext, HttpFile} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {isCodeInRange} from '../util';

import { CodedError } from '../models/CodedError';
import { Draft } from '../models/Draft';
import { JsonError } from '../models/JsonError';
import { JsonSuccess } from '../models/JsonSuccess';

/**
 * no description
 */
export class DraftsApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
     * Create drafts
     * @param drafts A JSON-encoded list of containing new draft objects. 
     */
    public async createDrafts(drafts?: Array<Draft>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/drafts';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (drafts !== undefined) {
            requestContext.setQueryParam("drafts", ObjectSerializer.serialize(drafts, "Array<Draft>", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
     * Delete a draft
     * @param draftId The ID of the draft you want to delete. 
     */
    public async deleteDraft(draftId: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'draftId' is not null or undefined
        if (draftId === null || draftId === undefined) {
            throw new RequiredError('Required parameter draftId was null or undefined when calling deleteDraft.');
        }


        // Path Params
        const localVarPath = '/drafts/{draft_id}'
            .replace('{' + 'draft_id' + '}', encodeURIComponent(String(draftId)));

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
     * Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
     * Edit a draft
     * @param draftId The ID of the draft to be edited. 
     * @param draft A JSON-encoded object containing a replacement draft object for this ID. 
     */
    public async editDraft(draftId: number, draft: Draft, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'draftId' is not null or undefined
        if (draftId === null || draftId === undefined) {
            throw new RequiredError('Required parameter draftId was null or undefined when calling editDraft.');
        }


        // verify required parameter 'draft' is not null or undefined
        if (draft === null || draft === undefined) {
            throw new RequiredError('Required parameter draft was null or undefined when calling editDraft.');
        }


        // Path Params
        const localVarPath = '/drafts/{draft_id}'
            .replace('{' + 'draft_id' + '}', encodeURIComponent(String(draftId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (draft !== undefined) {
            requestContext.setQueryParam("draft", ObjectSerializer.serialize(draft, "Draft", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
     * Get drafts
     */
    public async getDrafts(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/drafts';

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

}

export class DraftsApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createDrafts
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async createDrafts(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: CodedError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "CodedError", ""
            ) as CodedError;
            throw new ApiException<CodedError>(400, body);
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
     * @params response Response returned by the server for a request to deleteDraft
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async deleteDraft(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: JsonError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonError", ""
            ) as JsonError;
            throw new ApiException<JsonError>(404, body);
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
     * @params response Response returned by the server for a request to editDraft
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async editDraft(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: JsonError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonError", ""
            ) as JsonError;
            throw new ApiException<JsonError>(404, body);
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
     * @params response Response returned by the server for a request to getDrafts
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getDrafts(response: ResponseContext): Promise<JsonSuccess > {
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
