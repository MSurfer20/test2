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

import { autoinject } from 'aurelia-framework';
import { HttpClient } from 'aurelia-http-client';
import { Api } from './Api';
import { AuthStorage } from './AuthStorage';
import {
  Draft,
  JsonSuccess &amp; object,
  JsonSuccess,
} from './models';

/**
 * createDrafts - parameters interface
 */
export interface ICreateDraftsParams {
  drafts?: Array<Draft>;
}

/**
 * deleteDraft - parameters interface
 */
export interface IDeleteDraftParams {
  draftId: number;
}

/**
 * editDraft - parameters interface
 */
export interface IEditDraftParams {
  draftId: number;
  draft: Draft;
}

/**
 * getDrafts - parameters interface
 */
export interface IGetDraftsParams {
}

/**
 * DraftsApi - API class
 */
@autoinject()
export class DraftsApi extends Api {

  /**
   * Creates a new DraftsApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * Create drafts
   * Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; 
   * @param params.drafts A JSON-encoded list of containing new draft objects. 
   */
  async createDrafts(params: ICreateDraftsParams): Promise<JsonSuccess & object> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/drafts`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'drafts': params['drafts'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Delete a draft
   * Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; 
   * @param params.draftId The ID of the draft you want to delete. 
   */
  async deleteDraft(params: IDeleteDraftParams): Promise<JsonSuccess> {
    // Verify required parameters are set
    this.ensureParamIsSet('deleteDraft', params, 'draftId');

    // Create URL to call
    const url = `${this.basePath}/drafts/{draft_id}`
      .replace(`{${'draft_id'}}`, encodeURIComponent(`${params['draftId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asDelete()

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Edit a draft
   * Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; 
   * @param params.draftId The ID of the draft to be edited. 
   * @param params.draft A JSON-encoded object containing a replacement draft object for this ID. 
   */
  async editDraft(params: IEditDraftParams): Promise<JsonSuccess> {
    // Verify required parameters are set
    this.ensureParamIsSet('editDraft', params, 'draftId');
    this.ensureParamIsSet('editDraft', params, 'draft');

    // Create URL to call
    const url = `${this.basePath}/drafts/{draft_id}`
      .replace(`{${'draft_id'}}`, encodeURIComponent(`${params['draftId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPatch()
      // Set query parameters
      .withParams({ 
        'draft': params['draft'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Get drafts
   * Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; 
   */
  async getDrafts(): Promise<JsonSuccess & object> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/drafts`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

}
