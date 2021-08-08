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
    public interface IServerAndOrganizationsApi
    {
        /// <summary>
        /// Add a code playground Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  &#x60;POST {{ api_url }}/v1/realm/playgrounds&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
        /// </summary>
        /// <param name="name">The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. </param>
        /// <param name="pygmentsLanguage">The name of the Pygments language lexer for that programming language. </param>
        /// <param name="urlPrefix">The url prefix for the playground. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase AddCodePlayground (string name, string pygmentsLanguage, string urlPrefix);
        /// <summary>
        /// Add a linkifier Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;POST {{ api_url }}/v1/realm/filters&#x60; 
        /// </summary>
        /// <param name="pattern">The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. </param>
        /// <param name="urlFormatString">The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase AddLinkifier (string pattern, string urlFormatString);
        /// <summary>
        /// Create a custom profile field [Create a custom profile field](/help/add-custom-profile-fields) in the user&#39;s organization.  &#x60;POST {{ api_url }}/v1/realm/profile_fields&#x60; 
        /// </summary>
        /// <param name="fieldType">The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account </param>
        /// <param name="name">The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile. </param>
        /// <param name="hint">The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. </param>
        /// <param name="fieldData">Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase CreateCustomProfileField (int? fieldType, string name, string hint, Object fieldData);
        /// <summary>
        /// Get all custom emoji Get all the custom emoji in the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/emoji&#x60; 
        /// </summary>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetCustomEmoji ();
        /// <summary>
        /// Get all custom profile fields Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/profile_fields&#x60; 
        /// </summary>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetCustomProfileFields ();
        /// <summary>
        /// Get linkifiers List all of an organization&#39;s configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;GET {{ api_url }}/v1/realm/linkifiers&#x60;  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar &#x60;GET /realm/filters&#x60; endpoint was available with each entry in a &#x60;[pattern, url_format, id]&#x60; tuple format. 
        /// </summary>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetLinkifiers ();
        /// <summary>
        /// Get server settings Fetch global settings for a Zulip server.  &#x60;GET {{ api_url }}/v1/server_settings&#x60;  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it&#39;s running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
        /// </summary>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetServerSettings ();
        /// <summary>
        /// Remove a code playground Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  &#x60;DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). 
        /// </summary>
        /// <param name="playgroundId">The ID of the playground that you want to remove. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess RemoveCodePlayground (int? playgroundId);
        /// <summary>
        /// Remove a linkifier Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;DELETE {{ api_url }}/v1/realm/filters/{filter_id}&#x60; 
        /// </summary>
        /// <param name="filterId">The ID of the linkifier that you want to remove. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess RemoveLinkifier (int? filterId);
        /// <summary>
        /// Reorder custom profile fields Reorder the custom profile fields in the user&#39;s organization.  &#x60;PATCH {{ api_url }}/v1/realm/profile_fields&#x60;  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
        /// </summary>
        /// <param name="order">A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess ReorderCustomProfileFields (List<int?> order);
        /// <summary>
        /// Update a linkifier Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;PATCH {{ api_url }}/v1/realm/filters/{filter_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 57). 
        /// </summary>
        /// <param name="filterId">The ID of the linkifier that you want to update. </param>
        /// <param name="pattern">The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. </param>
        /// <param name="urlFormatString">The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess UpdateLinkifier (int? filterId, string pattern, string urlFormatString);
        /// <summary>
        /// Upload custom emoji This endpoint is used to upload a custom emoji for use in the user&#39;s organization.  Access to this endpoint depends on the [organization&#39;s configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  &#x60;POST {{ api_url }}/v1/realm/emoji/{emoji_name}&#x60; 
        /// </summary>
        /// <param name="emojiName">The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). </param>
        /// <param name="filename"></param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess UploadCustomEmoji (string emojiName, System.IO.Stream filename);
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class ServerAndOrganizationsApi : IServerAndOrganizationsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ServerAndOrganizationsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public ServerAndOrganizationsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient;
            else
                this.ApiClient = apiClient;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ServerAndOrganizationsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ServerAndOrganizationsApi(String basePath)
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
        /// Add a code playground Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  &#x60;POST {{ api_url }}/v1/realm/playgrounds&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
        /// </summary>
        /// <param name="name">The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. </param>
        /// <param name="pygmentsLanguage">The name of the Pygments language lexer for that programming language. </param>
        /// <param name="urlPrefix">The url prefix for the playground. </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase AddCodePlayground (string name, string pygmentsLanguage, string urlPrefix)
        {
            
            // verify the required parameter 'name' is set
            if (name == null) throw new ApiException(400, "Missing required parameter 'name' when calling AddCodePlayground");
            
            // verify the required parameter 'pygmentsLanguage' is set
            if (pygmentsLanguage == null) throw new ApiException(400, "Missing required parameter 'pygmentsLanguage' when calling AddCodePlayground");
            
            // verify the required parameter 'urlPrefix' is set
            if (urlPrefix == null) throw new ApiException(400, "Missing required parameter 'urlPrefix' when calling AddCodePlayground");
            

            var path = "/realm/playgrounds";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (name != null) queryParams.Add("name", ApiClient.ParameterToString(name)); // query parameter
 if (pygmentsLanguage != null) queryParams.Add("pygments_language", ApiClient.ParameterToString(pygmentsLanguage)); // query parameter
 if (urlPrefix != null) queryParams.Add("url_prefix", ApiClient.ParameterToString(urlPrefix)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AddCodePlayground: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AddCodePlayground: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Add a linkifier Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;POST {{ api_url }}/v1/realm/filters&#x60; 
        /// </summary>
        /// <param name="pattern">The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. </param>
        /// <param name="urlFormatString">The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase AddLinkifier (string pattern, string urlFormatString)
        {
            
            // verify the required parameter 'pattern' is set
            if (pattern == null) throw new ApiException(400, "Missing required parameter 'pattern' when calling AddLinkifier");
            
            // verify the required parameter 'urlFormatString' is set
            if (urlFormatString == null) throw new ApiException(400, "Missing required parameter 'urlFormatString' when calling AddLinkifier");
            

            var path = "/realm/filters";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (pattern != null) queryParams.Add("pattern", ApiClient.ParameterToString(pattern)); // query parameter
 if (urlFormatString != null) queryParams.Add("url_format_string", ApiClient.ParameterToString(urlFormatString)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AddLinkifier: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AddLinkifier: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Create a custom profile field [Create a custom profile field](/help/add-custom-profile-fields) in the user&#39;s organization.  &#x60;POST {{ api_url }}/v1/realm/profile_fields&#x60; 
        /// </summary>
        /// <param name="fieldType">The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account </param>
        /// <param name="name">The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile. </param>
        /// <param name="hint">The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. </param>
        /// <param name="fieldData">Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase CreateCustomProfileField (int? fieldType, string name, string hint, Object fieldData)
        {
            
            // verify the required parameter 'fieldType' is set
            if (fieldType == null) throw new ApiException(400, "Missing required parameter 'fieldType' when calling CreateCustomProfileField");
            

            var path = "/realm/profile_fields";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (name != null) queryParams.Add("name", ApiClient.ParameterToString(name)); // query parameter
 if (hint != null) queryParams.Add("hint", ApiClient.ParameterToString(hint)); // query parameter
 if (fieldType != null) queryParams.Add("field_type", ApiClient.ParameterToString(fieldType)); // query parameter
 if (fieldData != null) queryParams.Add("field_data", ApiClient.ParameterToString(fieldData)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateCustomProfileField: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateCustomProfileField: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Get all custom emoji Get all the custom emoji in the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/emoji&#x60; 
        /// </summary>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase GetCustomEmoji ()
        {
            

            var path = "/realm/emoji";
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetCustomEmoji: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetCustomEmoji: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Get all custom profile fields Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/profile_fields&#x60; 
        /// </summary>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase GetCustomProfileFields ()
        {
            

            var path = "/realm/profile_fields";
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetCustomProfileFields: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetCustomProfileFields: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Get linkifiers List all of an organization&#39;s configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;GET {{ api_url }}/v1/realm/linkifiers&#x60;  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar &#x60;GET /realm/filters&#x60; endpoint was available with each entry in a &#x60;[pattern, url_format, id]&#x60; tuple format. 
        /// </summary>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase GetLinkifiers ()
        {
            

            var path = "/realm/linkifiers";
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetLinkifiers: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetLinkifiers: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Get server settings Fetch global settings for a Zulip server.  &#x60;GET {{ api_url }}/v1/server_settings&#x60;  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it&#39;s running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
        /// </summary>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase GetServerSettings ()
        {
            

            var path = "/server_settings";
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetServerSettings: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetServerSettings: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Remove a code playground Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  &#x60;DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). 
        /// </summary>
        /// <param name="playgroundId">The ID of the playground that you want to remove. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess RemoveCodePlayground (int? playgroundId)
        {
            
            // verify the required parameter 'playgroundId' is set
            if (playgroundId == null) throw new ApiException(400, "Missing required parameter 'playgroundId' when calling RemoveCodePlayground");
            

            var path = "/realm/playgrounds/{playground_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "playground_id" + "}", ApiClient.ParameterToString(playgroundId));

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
                throw new ApiException ((int)response.StatusCode, "Error calling RemoveCodePlayground: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling RemoveCodePlayground: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Remove a linkifier Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;DELETE {{ api_url }}/v1/realm/filters/{filter_id}&#x60; 
        /// </summary>
        /// <param name="filterId">The ID of the linkifier that you want to remove. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess RemoveLinkifier (int? filterId)
        {
            
            // verify the required parameter 'filterId' is set
            if (filterId == null) throw new ApiException(400, "Missing required parameter 'filterId' when calling RemoveLinkifier");
            

            var path = "/realm/filters/{filter_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "filter_id" + "}", ApiClient.ParameterToString(filterId));

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
                throw new ApiException ((int)response.StatusCode, "Error calling RemoveLinkifier: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling RemoveLinkifier: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Reorder custom profile fields Reorder the custom profile fields in the user&#39;s organization.  &#x60;PATCH {{ api_url }}/v1/realm/profile_fields&#x60;  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
        /// </summary>
        /// <param name="order">A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess ReorderCustomProfileFields (List<int?> order)
        {
            
            // verify the required parameter 'order' is set
            if (order == null) throw new ApiException(400, "Missing required parameter 'order' when calling ReorderCustomProfileFields");
            

            var path = "/realm/profile_fields";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (order != null) queryParams.Add("order", ApiClient.ParameterToString(order)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PATCH, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ReorderCustomProfileFields: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ReorderCustomProfileFields: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Update a linkifier Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;PATCH {{ api_url }}/v1/realm/filters/{filter_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 57). 
        /// </summary>
        /// <param name="filterId">The ID of the linkifier that you want to update. </param>
        /// <param name="pattern">The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. </param>
        /// <param name="urlFormatString">The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess UpdateLinkifier (int? filterId, string pattern, string urlFormatString)
        {
            
            // verify the required parameter 'filterId' is set
            if (filterId == null) throw new ApiException(400, "Missing required parameter 'filterId' when calling UpdateLinkifier");
            
            // verify the required parameter 'pattern' is set
            if (pattern == null) throw new ApiException(400, "Missing required parameter 'pattern' when calling UpdateLinkifier");
            
            // verify the required parameter 'urlFormatString' is set
            if (urlFormatString == null) throw new ApiException(400, "Missing required parameter 'urlFormatString' when calling UpdateLinkifier");
            

            var path = "/realm/filters/{filter_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "filter_id" + "}", ApiClient.ParameterToString(filterId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (pattern != null) queryParams.Add("pattern", ApiClient.ParameterToString(pattern)); // query parameter
 if (urlFormatString != null) queryParams.Add("url_format_string", ApiClient.ParameterToString(urlFormatString)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PATCH, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateLinkifier: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateLinkifier: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Upload custom emoji This endpoint is used to upload a custom emoji for use in the user&#39;s organization.  Access to this endpoint depends on the [organization&#39;s configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  &#x60;POST {{ api_url }}/v1/realm/emoji/{emoji_name}&#x60; 
        /// </summary>
        /// <param name="emojiName">The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). </param>
        /// <param name="filename"></param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess UploadCustomEmoji (string emojiName, System.IO.Stream filename)
        {
            
            // verify the required parameter 'emojiName' is set
            if (emojiName == null) throw new ApiException(400, "Missing required parameter 'emojiName' when calling UploadCustomEmoji");
            

            var path = "/realm/emoji/{emoji_name}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "emoji_name" + "}", ApiClient.ParameterToString(emojiName));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                    if (filename != null) fileParams.Add("filename", ApiClient.ParameterToFile("filename", filename));
            
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UploadCustomEmoji: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UploadCustomEmoji: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

    }
}
