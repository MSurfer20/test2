using System;
using System.Collections.Generic;
using RestSharp;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDraftsApi
    {
        /// <summary>
        /// Create drafts Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; 
        /// </summary>
        /// <param name="drafts">A JSON-encoded list of containing new draft objects. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess CreateDrafts (List<Draft> drafts);
        /// <summary>
        /// Delete a draft Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; 
        /// </summary>
        /// <param name="draftId">The ID of the draft you want to delete. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess DeleteDraft (int? draftId);
        /// <summary>
        /// Edit a draft Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; 
        /// </summary>
        /// <param name="draftId">The ID of the draft to be edited. </param>
        /// <param name="draft">A JSON-encoded object containing a replacement draft object for this ID. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess EditDraft (int? draftId, Draft draft);
        /// <summary>
        /// Get drafts Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; 
        /// </summary>
        /// <returns>JsonSuccess</returns>
        JsonSuccess GetDrafts ();
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class DraftsApi : IDraftsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DraftsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public DraftsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient;
            else
                this.ApiClient = apiClient;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DraftsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DraftsApi(String basePath)
        {
            this.ApiClient = new ApiClient(basePath);
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public void SetBasePath(String basePath)
        {
            this.ApiClient.BasePath = basePath;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public String GetBasePath(String basePath)
        {
            return this.ApiClient.BasePath;
        }

        /// <summary>
        /// Gets or sets the API client.
        /// </summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; set;}

        /// <summary>
        /// Create drafts Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; 
        /// </summary>
        /// <param name="drafts">A JSON-encoded list of containing new draft objects. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess CreateDrafts (List<Draft> drafts)
        {
            

            var path = "/drafts";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (drafts != null) queryParams.Add("drafts", ApiClient.ParameterToString(drafts)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateDrafts: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateDrafts: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Delete a draft Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; 
        /// </summary>
        /// <param name="draftId">The ID of the draft you want to delete. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess DeleteDraft (int? draftId)
        {
            
            // verify the required parameter 'draftId' is set
            if (draftId == null) throw new ApiException(400, "Missing required parameter 'draftId' when calling DeleteDraft");
            

            var path = "/drafts/{draft_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "draft_id" + "}", ApiClient.ParameterToString(draftId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteDraft: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteDraft: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Edit a draft Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; 
        /// </summary>
        /// <param name="draftId">The ID of the draft to be edited. </param>
        /// <param name="draft">A JSON-encoded object containing a replacement draft object for this ID. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess EditDraft (int? draftId, Draft draft)
        {
            
            // verify the required parameter 'draftId' is set
            if (draftId == null) throw new ApiException(400, "Missing required parameter 'draftId' when calling EditDraft");
            
            // verify the required parameter 'draft' is set
            if (draft == null) throw new ApiException(400, "Missing required parameter 'draft' when calling EditDraft");
            

            var path = "/drafts/{draft_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "draft_id" + "}", ApiClient.ParameterToString(draftId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (draft != null) queryParams.Add("draft", ApiClient.ParameterToString(draft)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PATCH, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling EditDraft: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling EditDraft: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Get drafts Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; 
        /// </summary>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess GetDrafts ()
        {
            

            var path = "/drafts";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetDrafts: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetDrafts: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

    }
}
