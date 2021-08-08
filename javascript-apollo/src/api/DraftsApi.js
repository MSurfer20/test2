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
 *
 */



import ApiClient from "../ApiClient";
import CodedError from '../model/CodedError';
import Draft from '../model/Draft';
import JsonError from '../model/JsonError';
import JsonSuccess from '../model/JsonSuccess';

/**
* Drafts service.
* @module api/DraftsApi
* @version 1.0.0
*/
export default class DraftsApi extends ApiClient {

    /**
    * Constructs a new DraftsApi. 
    * @alias module:api/DraftsApi
    * @class
    */
    constructor() {
      super();
      this.baseURL = null;
    }


    /**
     * Create drafts
     * Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
     * @param {Object} opts Optional parameters
     * @param {Array.<Draft>} opts.drafts A JSON-encoded list of containing new draft objects. 
     * @return {Promise<JsonSuccess>}
     */
    async createDrafts(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'drafts': this.buildCollectionParam(opts['drafts'], 'multi')
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/1.0.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccess;

      return this.callApi(
        '/drafts', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Delete a draft
     * Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
     * @param {Number} draftId The ID of the draft you want to delete. 
     * @return {Promise<JsonSuccess>}
     */
    async deleteDraft(draftId) {
      let postBody = null;
      // verify the required parameter 'draftId' is set
      if (draftId === undefined || draftId === null) {
        throw new Error("Missing the required parameter 'draftId' when calling deleteDraft");
      }

      let pathParams = {
        'draft_id': draftId
      };
      let queryParams = {
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/1.0.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccess;

      return this.callApi(
        '/drafts/{draft_id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Edit a draft
     * Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
     * @param {Number} draftId The ID of the draft to be edited. 
     * @param {Draft} draft A JSON-encoded object containing a replacement draft object for this ID. 
     * @return {Promise<JsonSuccess>}
     */
    async editDraft(draftId, draft) {
      let postBody = null;
      // verify the required parameter 'draftId' is set
      if (draftId === undefined || draftId === null) {
        throw new Error("Missing the required parameter 'draftId' when calling editDraft");
      }
      // verify the required parameter 'draft' is set
      if (draft === undefined || draft === null) {
        throw new Error("Missing the required parameter 'draft' when calling editDraft");
      }

      let pathParams = {
        'draft_id': draftId
      };
      let queryParams = {
        'draft': draft
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/1.0.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccess;

      return this.callApi(
        '/drafts/{draft_id}', 'PATCH',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Get drafts
     * Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
     * @return {Promise<JsonSuccess>}
     */
    async getDrafts() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/1.0.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccess;

      return this.callApi(
        '/drafts', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


}