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


import * as $ from 'jquery';
import * as models from '../model/models';
import { COLLECTION_FORMATS } from '../variables';
import { Configuration } from '../configuration';

/* tslint:disable:no-unused-variable member-ordering */


export class DraftsApi {
    protected basePath = 'https://example.zulipchat.com/api/v1';
    public defaultHeaders: Array<string> = [];
    public defaultExtraJQueryAjaxSettings?: JQueryAjaxSettings = undefined;
    public configuration: Configuration = new Configuration();

    constructor(basePath?: string, configuration?: Configuration, defaultExtraJQueryAjaxSettings?: JQueryAjaxSettings) {
        if (basePath) {
            this.basePath = basePath;
        }
        if (configuration) {
            this.configuration = configuration;
        }
        if (defaultExtraJQueryAjaxSettings) {
            this.defaultExtraJQueryAjaxSettings = defaultExtraJQueryAjaxSettings;
        }
    }

    private extendObj<T1 extends object, T2 extends T1>(objA: T2, objB: T2): T1|T2 {
        for (let key in objB) {
            if (objB.hasOwnProperty(key)) {
                objA[key] = objB[key];
            }
        }
        return objA;
    }

    /**
     * Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
     * @summary Create drafts
     * @param drafts A JSON-encoded list of containing new draft objects. 
     */
    public createDrafts(drafts?: Array<models.Draft>, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQuery.Promise<
    { response: JQueryXHR; body: models.models.JsonSuccess & object;  },
    { response: JQueryXHR; errorThrown: string }
    > {
        let localVarPath = this.basePath + '/drafts';

        let queryParameters: any = {};
        let headerParams: any = {};
        if (drafts) {
            queryParameters['drafts'] = [];
            drafts.forEach((element: any) => {
                queryParameters['drafts'].push(element);
            });
        }

        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'POST',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred<
            { response: JQueryXHR; body: models.models.JsonSuccess & object;  },
            { response: JQueryXHR; errorThrown: string }
        >();
        $.ajax(requestOptions).then(
            (data: models.models.JsonSuccess & object, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve({response: jqXHR, body: data}),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject({response: xhr, errorThrown: errorThrown})
        );
        return dfd.promise();
    }

    /**
     * Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
     * @summary Delete a draft
     * @param draftId The ID of the draft you want to delete. 
     */
    public deleteDraft(draftId: number, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQuery.Promise<
    { response: JQueryXHR; body: models.models.JsonSuccess;  },
    { response: JQueryXHR; errorThrown: string }
    > {
        let localVarPath = this.basePath + '/drafts/{draft_id}'.replace('{' + 'draft_id' + '}', encodeURIComponent(String(draftId)));

        let queryParameters: any = {};
        let headerParams: any = {};
        // verify required parameter 'draftId' is not null or undefined
        if (draftId === null || draftId === undefined) {
            throw new Error('Required parameter draftId was null or undefined when calling deleteDraft.');
        }


        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'DELETE',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred<
            { response: JQueryXHR; body: models.models.JsonSuccess;  },
            { response: JQueryXHR; errorThrown: string }
        >();
        $.ajax(requestOptions).then(
            (data: models.models.JsonSuccess, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve({response: jqXHR, body: data}),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject({response: xhr, errorThrown: errorThrown})
        );
        return dfd.promise();
    }

    /**
     * Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
     * @summary Edit a draft
     * @param draftId The ID of the draft to be edited. 
     * @param draft A JSON-encoded object containing a replacement draft object for this ID. 
     */
    public editDraft(draftId: number, draft: models.Draft, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQuery.Promise<
    { response: JQueryXHR; body: models.models.JsonSuccess;  },
    { response: JQueryXHR; errorThrown: string }
    > {
        let localVarPath = this.basePath + '/drafts/{draft_id}'.replace('{' + 'draft_id' + '}', encodeURIComponent(String(draftId)));

        let queryParameters: any = {};
        let headerParams: any = {};
        // verify required parameter 'draftId' is not null or undefined
        if (draftId === null || draftId === undefined) {
            throw new Error('Required parameter draftId was null or undefined when calling editDraft.');
        }

        // verify required parameter 'draft' is not null or undefined
        if (draft === null || draft === undefined) {
            throw new Error('Required parameter draft was null or undefined when calling editDraft.');
        }

        if (draft !== null && draft !== undefined) {
            queryParameters['draft'] = <string><any>draft;
        }

        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'PATCH',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred<
            { response: JQueryXHR; body: models.models.JsonSuccess;  },
            { response: JQueryXHR; errorThrown: string }
        >();
        $.ajax(requestOptions).then(
            (data: models.models.JsonSuccess, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve({response: jqXHR, body: data}),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject({response: xhr, errorThrown: errorThrown})
        );
        return dfd.promise();
    }

    /**
     * Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
     * @summary Get drafts
     */
    public getDrafts(extraJQueryAjaxSettings?: JQueryAjaxSettings): JQuery.Promise<
    { response: JQueryXHR; body: models.models.JsonSuccess & object;  },
    { response: JQueryXHR; errorThrown: string }
    > {
        let localVarPath = this.basePath + '/drafts';

        let queryParameters: any = {};
        let headerParams: any = {};

        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred<
            { response: JQueryXHR; body: models.models.JsonSuccess & object;  },
            { response: JQueryXHR; errorThrown: string }
        >();
        $.ajax(requestOptions).then(
            (data: models.models.JsonSuccess & object, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve({response: jqXHR, body: data}),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject({response: xhr, errorThrown: errorThrown})
        );
        return dfd.promise();
    }

}
