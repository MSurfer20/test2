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
export default class DraftsApi {

    /**
    * Constructs a new DraftsApi. 
    * @alias module:api/DraftsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the createDrafts operation.
     * @callback module:api/DraftsApi~createDraftsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/JsonSuccess} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create drafts
     * Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/Draft>} opts.drafts A JSON-encoded list of containing new draft objects. 
     * @param {module:api/DraftsApi~createDraftsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/JsonSuccess}
     */
    createDrafts(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'drafts': this.apiClient.buildCollectionParam(opts['drafts'], 'multi')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccess;
      return this.apiClient.callApi(
        '/drafts', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteDraft operation.
     * @callback module:api/DraftsApi~deleteDraftCallback
     * @param {String} error Error message, if any.
     * @param {module:model/JsonSuccess} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete a draft
     * Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
     * @param {Number} draftId The ID of the draft you want to delete. 
     * @param {module:api/DraftsApi~deleteDraftCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/JsonSuccess}
     */
    deleteDraft(draftId, callback) {
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
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccess;
      return this.apiClient.callApi(
        '/drafts/{draft_id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the editDraft operation.
     * @callback module:api/DraftsApi~editDraftCallback
     * @param {String} error Error message, if any.
     * @param {module:model/JsonSuccess} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Edit a draft
     * Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
     * @param {Number} draftId The ID of the draft to be edited. 
     * @param {module:model/Draft} draft A JSON-encoded object containing a replacement draft object for this ID. 
     * @param {module:api/DraftsApi~editDraftCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/JsonSuccess}
     */
    editDraft(draftId, draft, callback) {
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
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccess;
      return this.apiClient.callApi(
        '/drafts/{draft_id}', 'PATCH',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getDrafts operation.
     * @callback module:api/DraftsApi~getDraftsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/JsonSuccess} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get drafts
     * Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
     * @param {module:api/DraftsApi~getDraftsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/JsonSuccess}
     */
    getDrafts(callback) {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccess;
      return this.apiClient.callApi(
        '/drafts', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}