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
    public interface IStreamsApi
    {
        /// <summary>
        /// Archive a stream [Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.  &#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60; 
        /// </summary>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess ArchiveStream (int? streamId);
        /// <summary>
        /// Create BigBlueButton video call Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
        /// </summary>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase CreateBigBlueButtonVideoCall ();
        /// <summary>
        /// Get stream ID Get the unique ID of a given stream.  &#x60;GET {{ api_url }}/v1/get_stream_id&#x60; 
        /// </summary>
        /// <param name="stream">The name of the stream to access. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetStreamId (string stream);
        /// <summary>
        /// Get topics in a stream Get all the topics in a specific stream  &#x60;GET {{ api_url }}/v1/users/me/{stream_id}/topics&#x60; 
        /// </summary>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetStreamTopics (int? streamId);
        /// <summary>
        /// Get all streams Get all streams that the user has access to.  &#x60;GET {{ api_url }}/v1/streams&#x60; 
        /// </summary>
        /// <param name="includePublic">Include all public streams. </param>
        /// <param name="includeWebPublic">Include all web public streams. </param>
        /// <param name="includeSubscribed">Include all streams that the user is subscribed to. </param>
        /// <param name="includeAllActive">Include all active streams. The user must have administrative privileges to use this parameter. </param>
        /// <param name="includeDefault">Include all default streams for the user&#39;s realm. </param>
        /// <param name="includeOwnerSubscribed">If the user is a bot, include all streams that the bot&#39;s owner is subscribed to. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetStreams (bool? includePublic, bool? includeWebPublic, bool? includeSubscribed, bool? includeAllActive, bool? includeDefault, bool? includeOwnerSubscribed);
        /// <summary>
        /// Get subscription status Check whether a user is subscribed to a stream.  &#x60;GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}&#x60;  **Changes**: New in Zulip 3.0 (feature level 11). 
        /// </summary>
        /// <param name="userId">The target user&#39;s ID. </param>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetSubscriptionStatus (int? userId, int? streamId);
        /// <summary>
        /// Get subscribed streams Get all streams that the user is subscribed to.  &#x60;GET {{ api_url }}/v1/users/me/subscriptions&#x60; 
        /// </summary>
        /// <param name="includeSubscribers">Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetSubscriptions (bool? includeSubscribers);
        /// <summary>
        /// Topic muting This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user&#39;s unread count totals.  &#x60;PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics&#x60; 
        /// </summary>
        /// <param name="topic">The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. </param>
        /// <param name="op">Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic. </param>
        /// <param name="stream">The name of the stream to access. </param>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess MuteTopic (string topic, string op, string stream, int? streamId);
        /// <summary>
        /// Subscribe to a stream Subscribe one or more users to one or more streams.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions&#x60;  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like &#x60;invite_only&#x60; detailed below. 
        /// </summary>
        /// <param name="subscriptions">A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value. </param>
        /// <param name="principals">A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). </param>
        /// <param name="authorizationErrorsFatal">A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key. </param>
        /// <param name="announce">If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation. </param>
        /// <param name="inviteOnly">As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. </param>
        /// <param name="historyPublicToSubscribers">Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. </param>
        /// <param name="streamPostPolicy">Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. </param>
        /// <param name="messageRetentionDays">Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). </param>
        /// <returns>OneOfobjectobject</returns>
        OneOfobjectobject Subscribe (List<Object> subscriptions, List<OneOfstringinteger> principals, bool? authorizationErrorsFatal, bool? announce, bool? inviteOnly, bool? historyPublicToSubscribers, int? streamPostPolicy, OneOfstringinteger messageRetentionDays);
        /// <summary>
        /// Unsubscribe from a stream Unsubscribe yourself or other users from one or more streams.  &#x60;DELETE {{ api_url }}/v1/users/me/subscriptions&#x60; 
        /// </summary>
        /// <param name="subscriptions">A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API. </param>
        /// <param name="principals">A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase Unsubscribe (List<string> subscriptions, List<OneOfstringinteger> principals);
        /// <summary>
        /// Update a stream Configure the stream with the ID &#x60;stream_id&#x60;.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  &#x60;PATCH {{ api_url }}/v1/streams/{stream_id}&#x60; 
        /// </summary>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <param name="description">The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). </param>
        /// <param name="newName">The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). </param>
        /// <param name="isPrivate">Change whether the stream is a private stream. </param>
        /// <param name="isAnnouncementOnly">Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead. </param>
        /// <param name="streamPostPolicy">Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. </param>
        /// <param name="historyPublicToSubscribers">Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. </param>
        /// <param name="messageRetentionDays">Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess UpdateStream (int? streamId, string description, string newName, bool? isPrivate, bool? isAnnouncementOnly, int? streamPostPolicy, bool? historyPublicToSubscribers, OneOfstringinteger messageRetentionDays);
        /// <summary>
        /// Update subscription settings This endpoint is used to update the user&#39;s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions/properties&#x60; 
        /// </summary>
        /// <param name="subscriptionData">A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase UpdateSubscriptionSettings (List<Object> subscriptionData);
        /// <summary>
        /// Update subscriptions Update which streams you are are subscribed to. 
        /// </summary>
        /// <param name="delete">A list of stream names to unsubscribe from. </param>
        /// <param name="add">A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase UpdateSubscriptions (List<string> delete, List<Object> add);
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class StreamsApi : IStreamsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="StreamsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public StreamsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient;
            else
                this.ApiClient = apiClient;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="StreamsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public StreamsApi(String basePath)
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
        /// Archive a stream [Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.  &#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60; 
        /// </summary>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess ArchiveStream (int? streamId)
        {
            
            // verify the required parameter 'streamId' is set
            if (streamId == null) throw new ApiException(400, "Missing required parameter 'streamId' when calling ArchiveStream");
            

            var path = "/streams/{stream_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "stream_id" + "}", ApiClient.ParameterToString(streamId));

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
                throw new ApiException ((int)response.StatusCode, "Error calling ArchiveStream: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ArchiveStream: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Create BigBlueButton video call Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
        /// </summary>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase CreateBigBlueButtonVideoCall ()
        {
            

            var path = "/calls/bigbluebutton/create";
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
                throw new ApiException ((int)response.StatusCode, "Error calling CreateBigBlueButtonVideoCall: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateBigBlueButtonVideoCall: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Get stream ID Get the unique ID of a given stream.  &#x60;GET {{ api_url }}/v1/get_stream_id&#x60; 
        /// </summary>
        /// <param name="stream">The name of the stream to access. </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase GetStreamId (string stream)
        {
            
            // verify the required parameter 'stream' is set
            if (stream == null) throw new ApiException(400, "Missing required parameter 'stream' when calling GetStreamId");
            

            var path = "/get_stream_id";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (stream != null) queryParams.Add("stream", ApiClient.ParameterToString(stream)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetStreamId: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetStreamId: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Get topics in a stream Get all the topics in a specific stream  &#x60;GET {{ api_url }}/v1/users/me/{stream_id}/topics&#x60; 
        /// </summary>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase GetStreamTopics (int? streamId)
        {
            
            // verify the required parameter 'streamId' is set
            if (streamId == null) throw new ApiException(400, "Missing required parameter 'streamId' when calling GetStreamTopics");
            

            var path = "/users/me/{stream_id}/topics";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "stream_id" + "}", ApiClient.ParameterToString(streamId));

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
                throw new ApiException ((int)response.StatusCode, "Error calling GetStreamTopics: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetStreamTopics: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Get all streams Get all streams that the user has access to.  &#x60;GET {{ api_url }}/v1/streams&#x60; 
        /// </summary>
        /// <param name="includePublic">Include all public streams. </param>
        /// <param name="includeWebPublic">Include all web public streams. </param>
        /// <param name="includeSubscribed">Include all streams that the user is subscribed to. </param>
        /// <param name="includeAllActive">Include all active streams. The user must have administrative privileges to use this parameter. </param>
        /// <param name="includeDefault">Include all default streams for the user&#39;s realm. </param>
        /// <param name="includeOwnerSubscribed">If the user is a bot, include all streams that the bot&#39;s owner is subscribed to. </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase GetStreams (bool? includePublic, bool? includeWebPublic, bool? includeSubscribed, bool? includeAllActive, bool? includeDefault, bool? includeOwnerSubscribed)
        {
            

            var path = "/streams";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (includePublic != null) queryParams.Add("include_public", ApiClient.ParameterToString(includePublic)); // query parameter
 if (includeWebPublic != null) queryParams.Add("include_web_public", ApiClient.ParameterToString(includeWebPublic)); // query parameter
 if (includeSubscribed != null) queryParams.Add("include_subscribed", ApiClient.ParameterToString(includeSubscribed)); // query parameter
 if (includeAllActive != null) queryParams.Add("include_all_active", ApiClient.ParameterToString(includeAllActive)); // query parameter
 if (includeDefault != null) queryParams.Add("include_default", ApiClient.ParameterToString(includeDefault)); // query parameter
 if (includeOwnerSubscribed != null) queryParams.Add("include_owner_subscribed", ApiClient.ParameterToString(includeOwnerSubscribed)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetStreams: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetStreams: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Get subscription status Check whether a user is subscribed to a stream.  &#x60;GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}&#x60;  **Changes**: New in Zulip 3.0 (feature level 11). 
        /// </summary>
        /// <param name="userId">The target user&#39;s ID. </param>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase GetSubscriptionStatus (int? userId, int? streamId)
        {
            
            // verify the required parameter 'userId' is set
            if (userId == null) throw new ApiException(400, "Missing required parameter 'userId' when calling GetSubscriptionStatus");
            
            // verify the required parameter 'streamId' is set
            if (streamId == null) throw new ApiException(400, "Missing required parameter 'streamId' when calling GetSubscriptionStatus");
            

            var path = "/users/{user_id}/subscriptions/{stream_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "user_id" + "}", ApiClient.ParameterToString(userId));
path = path.Replace("{" + "stream_id" + "}", ApiClient.ParameterToString(streamId));

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
                throw new ApiException ((int)response.StatusCode, "Error calling GetSubscriptionStatus: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetSubscriptionStatus: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Get subscribed streams Get all streams that the user is subscribed to.  &#x60;GET {{ api_url }}/v1/users/me/subscriptions&#x60; 
        /// </summary>
        /// <param name="includeSubscribers">Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase GetSubscriptions (bool? includeSubscribers)
        {
            

            var path = "/users/me/subscriptions";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (includeSubscribers != null) queryParams.Add("include_subscribers", ApiClient.ParameterToString(includeSubscribers)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetSubscriptions: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetSubscriptions: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Topic muting This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user&#39;s unread count totals.  &#x60;PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics&#x60; 
        /// </summary>
        /// <param name="topic">The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. </param>
        /// <param name="op">Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic. </param>
        /// <param name="stream">The name of the stream to access. </param>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess MuteTopic (string topic, string op, string stream, int? streamId)
        {
            
            // verify the required parameter 'topic' is set
            if (topic == null) throw new ApiException(400, "Missing required parameter 'topic' when calling MuteTopic");
            
            // verify the required parameter 'op' is set
            if (op == null) throw new ApiException(400, "Missing required parameter 'op' when calling MuteTopic");
            

            var path = "/users/me/subscriptions/muted_topics";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (stream != null) queryParams.Add("stream", ApiClient.ParameterToString(stream)); // query parameter
 if (streamId != null) queryParams.Add("stream_id", ApiClient.ParameterToString(streamId)); // query parameter
 if (topic != null) queryParams.Add("topic", ApiClient.ParameterToString(topic)); // query parameter
 if (op != null) queryParams.Add("op", ApiClient.ParameterToString(op)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PATCH, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling MuteTopic: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling MuteTopic: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Subscribe to a stream Subscribe one or more users to one or more streams.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions&#x60;  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like &#x60;invite_only&#x60; detailed below. 
        /// </summary>
        /// <param name="subscriptions">A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value. </param>
        /// <param name="principals">A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). </param>
        /// <param name="authorizationErrorsFatal">A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key. </param>
        /// <param name="announce">If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation. </param>
        /// <param name="inviteOnly">As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. </param>
        /// <param name="historyPublicToSubscribers">Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. </param>
        /// <param name="streamPostPolicy">Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. </param>
        /// <param name="messageRetentionDays">Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). </param>
        /// <returns>OneOfobjectobject</returns>
        public OneOfobjectobject Subscribe (List<Object> subscriptions, List<OneOfstringinteger> principals, bool? authorizationErrorsFatal, bool? announce, bool? inviteOnly, bool? historyPublicToSubscribers, int? streamPostPolicy, OneOfstringinteger messageRetentionDays)
        {
            
            // verify the required parameter 'subscriptions' is set
            if (subscriptions == null) throw new ApiException(400, "Missing required parameter 'subscriptions' when calling Subscribe");
            

            var path = "/users/me/subscriptions";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (subscriptions != null) queryParams.Add("subscriptions", ApiClient.ParameterToString(subscriptions)); // query parameter
 if (principals != null) queryParams.Add("principals", ApiClient.ParameterToString(principals)); // query parameter
 if (authorizationErrorsFatal != null) queryParams.Add("authorization_errors_fatal", ApiClient.ParameterToString(authorizationErrorsFatal)); // query parameter
 if (announce != null) queryParams.Add("announce", ApiClient.ParameterToString(announce)); // query parameter
 if (inviteOnly != null) queryParams.Add("invite_only", ApiClient.ParameterToString(inviteOnly)); // query parameter
 if (historyPublicToSubscribers != null) queryParams.Add("history_public_to_subscribers", ApiClient.ParameterToString(historyPublicToSubscribers)); // query parameter
 if (streamPostPolicy != null) queryParams.Add("stream_post_policy", ApiClient.ParameterToString(streamPostPolicy)); // query parameter
 if (messageRetentionDays != null) queryParams.Add("message_retention_days", ApiClient.ParameterToString(messageRetentionDays)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling Subscribe: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling Subscribe: " + response.ErrorMessage, response.ErrorMessage);

            return (OneOfobjectobject) ApiClient.Deserialize(response.Content, typeof(OneOfobjectobject), response.Headers);
        }

        /// <summary>
        /// Unsubscribe from a stream Unsubscribe yourself or other users from one or more streams.  &#x60;DELETE {{ api_url }}/v1/users/me/subscriptions&#x60; 
        /// </summary>
        /// <param name="subscriptions">A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API. </param>
        /// <param name="principals">A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase Unsubscribe (List<string> subscriptions, List<OneOfstringinteger> principals)
        {
            
            // verify the required parameter 'subscriptions' is set
            if (subscriptions == null) throw new ApiException(400, "Missing required parameter 'subscriptions' when calling Unsubscribe");
            

            var path = "/users/me/subscriptions";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (subscriptions != null) queryParams.Add("subscriptions", ApiClient.ParameterToString(subscriptions)); // query parameter
 if (principals != null) queryParams.Add("principals", ApiClient.ParameterToString(principals)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling Unsubscribe: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling Unsubscribe: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Update a stream Configure the stream with the ID &#x60;stream_id&#x60;.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  &#x60;PATCH {{ api_url }}/v1/streams/{stream_id}&#x60; 
        /// </summary>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <param name="description">The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). </param>
        /// <param name="newName">The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). </param>
        /// <param name="isPrivate">Change whether the stream is a private stream. </param>
        /// <param name="isAnnouncementOnly">Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead. </param>
        /// <param name="streamPostPolicy">Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. </param>
        /// <param name="historyPublicToSubscribers">Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. </param>
        /// <param name="messageRetentionDays">Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess UpdateStream (int? streamId, string description, string newName, bool? isPrivate, bool? isAnnouncementOnly, int? streamPostPolicy, bool? historyPublicToSubscribers, OneOfstringinteger messageRetentionDays)
        {
            
            // verify the required parameter 'streamId' is set
            if (streamId == null) throw new ApiException(400, "Missing required parameter 'streamId' when calling UpdateStream");
            

            var path = "/streams/{stream_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "stream_id" + "}", ApiClient.ParameterToString(streamId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (description != null) queryParams.Add("description", ApiClient.ParameterToString(description)); // query parameter
 if (newName != null) queryParams.Add("new_name", ApiClient.ParameterToString(newName)); // query parameter
 if (isPrivate != null) queryParams.Add("is_private", ApiClient.ParameterToString(isPrivate)); // query parameter
 if (isAnnouncementOnly != null) queryParams.Add("is_announcement_only", ApiClient.ParameterToString(isAnnouncementOnly)); // query parameter
 if (streamPostPolicy != null) queryParams.Add("stream_post_policy", ApiClient.ParameterToString(streamPostPolicy)); // query parameter
 if (historyPublicToSubscribers != null) queryParams.Add("history_public_to_subscribers", ApiClient.ParameterToString(historyPublicToSubscribers)); // query parameter
 if (messageRetentionDays != null) queryParams.Add("message_retention_days", ApiClient.ParameterToString(messageRetentionDays)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PATCH, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateStream: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateStream: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Update subscription settings This endpoint is used to update the user&#39;s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions/properties&#x60; 
        /// </summary>
        /// <param name="subscriptionData">A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream. </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase UpdateSubscriptionSettings (List<Object> subscriptionData)
        {
            
            // verify the required parameter 'subscriptionData' is set
            if (subscriptionData == null) throw new ApiException(400, "Missing required parameter 'subscriptionData' when calling UpdateSubscriptionSettings");
            

            var path = "/users/me/subscriptions/properties";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (subscriptionData != null) queryParams.Add("subscription_data", ApiClient.ParameterToString(subscriptionData)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateSubscriptionSettings: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateSubscriptionSettings: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Update subscriptions Update which streams you are are subscribed to. 
        /// </summary>
        /// <param name="delete">A list of stream names to unsubscribe from. </param>
        /// <param name="add">A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase UpdateSubscriptions (List<string> delete, List<Object> add)
        {
            

            var path = "/users/me/subscriptions";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (delete != null) queryParams.Add("delete", ApiClient.ParameterToString(delete)); // query parameter
 if (add != null) queryParams.Add("add", ApiClient.ParameterToString(add)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PATCH, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateSubscriptions: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateSubscriptions: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

    }
}
