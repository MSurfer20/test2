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
    public interface IMessagesApi
    {
        /// <summary>
        /// Add an emoji reaction Add an [emoji reaction](/help/emoji-reactions) to a message.  &#x60;POST {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 
        /// </summary>
        /// <param name="messageId">The target message&#39;s ID. </param>
        /// <param name="emojiName">The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name. </param>
        /// <param name="emojiCode">A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji. </param>
        /// <param name="reactionType">If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess AddReaction (int? messageId, string emojiName, string emojiCode, string reactionType);
        /// <summary>
        /// Check if messages match a narrow Check whether a set of messages match a [narrow](/api/construct-narrow).  &#x60;GET {{ api_url }}/v1/messages/matches_narrow&#x60;  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the &#x60;match_subject&#x60; and &#x60;match_content&#x60; objects is designed to match those of &#x60;GET /messages&#x60;, so that a client can splice these fields into a &#x60;message&#x60; object received from &#x60;GET /events&#x60; and end up with an extended message object identical to how a &#x60;GET /messages&#x60; for the current narrow would have returned the message. 
        /// </summary>
        /// <param name="msgIds">List of IDs for the messages to check.</param>
        /// <param name="narrow">A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).</param>
        /// <returns>Object</returns>
        Object CheckMessagesMatchNarrow (List<int?> msgIds, List<Object> narrow);
        /// <summary>
        /// Delete a message Permanently delete a message.  &#x60;DELETE {{ api_url }}/v1/messages/{msg_id}&#x60;  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
        /// </summary>
        /// <param name="messageId">The target message&#39;s ID. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess DeleteMessage (int? messageId);
        /// <summary>
        /// Get public temporary URL Get a temporary URL for access to the file that doesn&#39;t require authentication. 
        /// </summary>
        /// <param name="realmIdStr">The realm id. </param>
        /// <param name="filename">Path to the URL. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetFileTemporaryUrl (int? realmIdStr, string filename);
        /// <summary>
        /// Get a message&#39;s edit history Fetch the message edit history of a previously edited message.  &#x60;GET {{ api_url }}/v1/messages/{message_id}/history&#x60;  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
        /// </summary>
        /// <param name="messageId">The target message&#39;s ID. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetMessageHistory (int? messageId);
        /// <summary>
        /// Get messages Fetch message history from a Zulip server.  &#x60;GET {{ api_url }}/v1/messages&#x60;  This &#x60;GET /api/v1/messages&#x60; endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip&#39;s powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user&#39;s message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an &#x60;anchor&#x60; message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the &#x60;num_before&#x60; and &#x60;num_after&#x60; limits.  We recommend using &#x60;num_before &lt;&#x3D; 1000&#x60; and &#x60;num_after &lt;&#x3D; 1000&#x60; to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
        /// </summary>
        /// <param name="numBefore">The number of messages with IDs less than the anchor to retrieve. </param>
        /// <param name="numAfter">The number of messages with IDs greater than the anchor to retrieve. </param>
        /// <param name="anchor">Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * &#x60;newest&#x60;: The most recent message. * &#x60;oldest&#x60;: The oldest message. * &#x60;first_unread&#x60;: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of &#x60;&#39;newest&#39;&#x60; and &#x60;&#39;oldest&#39;&#x60; are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   &#x60;first_unread&#x60; functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, &#x60;oldest&#x60; can be emulated with   &#x60;anchor&#x3D;0&#x60;, and &#x60;newest&#x60; with &#x60;anchor&#x3D;10000000000000000&#x60;   (that specific large value works around a bug in Zulip   2.1.x and older in the &#x60;found_newest&#x60; return value). </param>
        /// <param name="narrow">The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow). </param>
        /// <param name="clientGravatar">Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. </param>
        /// <param name="applyMarkdown">If &#x60;true&#x60;, message content is returned in the rendered HTML format. If &#x60;false&#x60;, message content is returned in the raw Markdown-format text that user entered. </param>
        /// <param name="useFirstUnreadAnchor">Legacy way to specify &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the &#x60;anchor&#x60;.  Mutually exclusive with &#x60;anchor&#x60;.  **Changes**: Deprecated in Zulip 3.0, replaced by &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; instead. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetMessages (int? numBefore, int? numAfter, OneOfstringinteger anchor, List<Object> narrow, bool? clientGravatar, bool? applyMarkdown, bool? useFirstUnreadAnchor);
        /// <summary>
        /// Get a message&#39;s raw Markdown Get the raw content of a message.  &#x60;GET {{ api_url }}/v1/messages/{msg_id}&#x60;  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message&#39;s raw Markdown (e.g. for pre-filling a message-editing UI). 
        /// </summary>
        /// <param name="messageId">The target message&#39;s ID. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetRawMessage (int? messageId);
        /// <summary>
        /// Mark all messages as read Marks all of the current user&#39;s unread messages as read.  &#x60;POST {{ api_url }}/v1/mark_all_as_read&#x60; 
        /// </summary>
        /// <returns>JsonSuccess</returns>
        JsonSuccess MarkAllAsRead ();
        /// <summary>
        /// Mark messages in a stream as read Mark all the unread messages in a stream as read. 
        /// </summary>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess MarkStreamAsRead (int? streamId);
        /// <summary>
        /// Mark messages in a topic as read Mark all the unread messages in a topic as read. 
        /// </summary>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <param name="topicName">The name of the topic whose messages should be marked as read. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess MarkTopicAsRead (int? streamId, string topicName);
        /// <summary>
        /// Remove an emoji reaction Remove an [emoji reaction](/help/emoji-reactions) from a message.  &#x60;DELETE {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 
        /// </summary>
        /// <param name="messageId">The target message&#39;s ID. </param>
        /// <param name="emojiName">The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name. </param>
        /// <param name="emojiCode">A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji. </param>
        /// <param name="reactionType">If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess RemoveReaction (int? messageId, string emojiName, string emojiCode, string reactionType);
        /// <summary>
        /// Render message Render a message to HTML.  &#x60;POST {{ api_url }}/v1/messages/render&#x60; 
        /// </summary>
        /// <param name="content">The content of the message. Maximum message size of 10000 bytes. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase RenderMessage (string content);
        /// <summary>
        /// Send a message Send a stream or a private message.  &#x60;POST {{ api_url }}/v1/messages&#x60; 
        /// </summary>
        /// <param name="type">The type of message to be sent. &#x60;private&#x60; for a private message and &#x60;stream&#x60; for a stream message. </param>
        /// <param name="to">For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. </param>
        /// <param name="content">The content of the message. Maximum message size of 10000 bytes. </param>
        /// <param name="topic">The topic of the message. Only required for stream messages (&#x60;type&#x3D;\&quot;stream\&quot;&#x60;), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias. </param>
        /// <param name="queueId">For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, &#x60;local_id&#x60; is required.  If the message is successfully sent, the server will include &#x60;local_id&#x60; in the &#x60;message&#x60; event that the client with this &#x60;queue_id&#x60; will receive notifying it of the new message via [&#x60;GET /events&#x60;](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device). </param>
        /// <param name="localId">For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the &#x60;queue_id&#x60; description. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase SendMessage (string type, List<int?> to, string content, string topic, string queueId, string localId);
        /// <summary>
        /// Edit a message Edit/update the content or topic of a message.  &#x60;PATCH {{ api_url }}/v1/messages/{msg_id}&#x60;  &#x60;{msg_id}&#x60; in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to &#x60;✔ {original_topic}&#x60;.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
        /// </summary>
        /// <param name="messageId">The target message&#39;s ID. </param>
        /// <param name="topic">The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias. </param>
        /// <param name="propagateMode">Which message(s) should be edited: just the one indicated in &#x60;message_id&#x60;, messages in the same topic that had been sent after this one, or all of them.  Only the default value of &#x60;change_one&#x60; is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic. </param>
        /// <param name="sendNotificationToOldThread">Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9). </param>
        /// <param name="sendNotificationToNewThread">Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9). </param>
        /// <param name="content">The content of the message. Maximum message size of 10000 bytes. </param>
        /// <param name="streamId">The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess UpdateMessage (int? messageId, string topic, string propagateMode, bool? sendNotificationToOldThread, bool? sendNotificationToNewThread, string content, int? streamId);
        /// <summary>
        /// Update personal message flags Add or remove personal message flags like &#x60;read&#x60; and &#x60;starred&#x60; on a collection of message IDs.  &#x60;POST {{ api_url }}/v1/messages/flags&#x60;  For updating the &#x60;read&#x60; flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
        /// </summary>
        /// <param name="messages">An array containing the IDs of the target messages. </param>
        /// <param name="op">Whether to &#x60;add&#x60; the flag or &#x60;remove&#x60; it. </param>
        /// <param name="flag">The flag that should be added/removed. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase UpdateMessageFlags (List<int?> messages, string op, string flag);
        /// <summary>
        /// Upload a file Upload a single file and get the corresponding URI.  &#x60;POST {{ api_url }}/v1/user_uploads&#x60;  Initially, only you will be able to access the link.  To share the uploaded file, you&#39;ll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
        /// </summary>
        /// <param name="filename"></param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase UploadFile (System.IO.Stream filename);
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class MessagesApi : IMessagesApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MessagesApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public MessagesApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient;
            else
                this.ApiClient = apiClient;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="MessagesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public MessagesApi(String basePath)
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
        /// Add an emoji reaction Add an [emoji reaction](/help/emoji-reactions) to a message.  &#x60;POST {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 
        /// </summary>
        /// <param name="messageId">The target message&#39;s ID. </param>
        /// <param name="emojiName">The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name. </param>
        /// <param name="emojiCode">A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji. </param>
        /// <param name="reactionType">If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess AddReaction (int? messageId, string emojiName, string emojiCode, string reactionType)
        {
            
            // verify the required parameter 'messageId' is set
            if (messageId == null) throw new ApiException(400, "Missing required parameter 'messageId' when calling AddReaction");
            
            // verify the required parameter 'emojiName' is set
            if (emojiName == null) throw new ApiException(400, "Missing required parameter 'emojiName' when calling AddReaction");
            

            var path = "/messages/{message_id}/reactions";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "message_id" + "}", ApiClient.ParameterToString(messageId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (emojiName != null) queryParams.Add("emoji_name", ApiClient.ParameterToString(emojiName)); // query parameter
 if (emojiCode != null) queryParams.Add("emoji_code", ApiClient.ParameterToString(emojiCode)); // query parameter
 if (reactionType != null) queryParams.Add("reaction_type", ApiClient.ParameterToString(reactionType)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AddReaction: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AddReaction: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Check if messages match a narrow Check whether a set of messages match a [narrow](/api/construct-narrow).  &#x60;GET {{ api_url }}/v1/messages/matches_narrow&#x60;  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the &#x60;match_subject&#x60; and &#x60;match_content&#x60; objects is designed to match those of &#x60;GET /messages&#x60;, so that a client can splice these fields into a &#x60;message&#x60; object received from &#x60;GET /events&#x60; and end up with an extended message object identical to how a &#x60;GET /messages&#x60; for the current narrow would have returned the message. 
        /// </summary>
        /// <param name="msgIds">List of IDs for the messages to check.</param>
        /// <param name="narrow">A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).</param>
        /// <returns>Object</returns>
        public Object CheckMessagesMatchNarrow (List<int?> msgIds, List<Object> narrow)
        {
            
            // verify the required parameter 'msgIds' is set
            if (msgIds == null) throw new ApiException(400, "Missing required parameter 'msgIds' when calling CheckMessagesMatchNarrow");
            
            // verify the required parameter 'narrow' is set
            if (narrow == null) throw new ApiException(400, "Missing required parameter 'narrow' when calling CheckMessagesMatchNarrow");
            

            var path = "/messages/matches_narrow";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (msgIds != null) queryParams.Add("msg_ids", ApiClient.ParameterToString(msgIds)); // query parameter
 if (narrow != null) queryParams.Add("narrow", ApiClient.ParameterToString(narrow)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CheckMessagesMatchNarrow: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CheckMessagesMatchNarrow: " + response.ErrorMessage, response.ErrorMessage);

            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }

        /// <summary>
        /// Delete a message Permanently delete a message.  &#x60;DELETE {{ api_url }}/v1/messages/{msg_id}&#x60;  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
        /// </summary>
        /// <param name="messageId">The target message&#39;s ID. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess DeleteMessage (int? messageId)
        {
            
            // verify the required parameter 'messageId' is set
            if (messageId == null) throw new ApiException(400, "Missing required parameter 'messageId' when calling DeleteMessage");
            

            var path = "/messages/{message_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "message_id" + "}", ApiClient.ParameterToString(messageId));

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
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteMessage: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteMessage: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Get public temporary URL Get a temporary URL for access to the file that doesn&#39;t require authentication. 
        /// </summary>
        /// <param name="realmIdStr">The realm id. </param>
        /// <param name="filename">Path to the URL. </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase GetFileTemporaryUrl (int? realmIdStr, string filename)
        {
            
            // verify the required parameter 'realmIdStr' is set
            if (realmIdStr == null) throw new ApiException(400, "Missing required parameter 'realmIdStr' when calling GetFileTemporaryUrl");
            
            // verify the required parameter 'filename' is set
            if (filename == null) throw new ApiException(400, "Missing required parameter 'filename' when calling GetFileTemporaryUrl");
            

            var path = "/user_uploads/{realm_id_str}/{filename}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "realm_id_str" + "}", ApiClient.ParameterToString(realmIdStr));
path = path.Replace("{" + "filename" + "}", ApiClient.ParameterToString(filename));

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
                throw new ApiException ((int)response.StatusCode, "Error calling GetFileTemporaryUrl: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetFileTemporaryUrl: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Get a message&#39;s edit history Fetch the message edit history of a previously edited message.  &#x60;GET {{ api_url }}/v1/messages/{message_id}/history&#x60;  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
        /// </summary>
        /// <param name="messageId">The target message&#39;s ID. </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase GetMessageHistory (int? messageId)
        {
            
            // verify the required parameter 'messageId' is set
            if (messageId == null) throw new ApiException(400, "Missing required parameter 'messageId' when calling GetMessageHistory");
            

            var path = "/messages/{message_id}/history";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "message_id" + "}", ApiClient.ParameterToString(messageId));

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
                throw new ApiException ((int)response.StatusCode, "Error calling GetMessageHistory: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetMessageHistory: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Get messages Fetch message history from a Zulip server.  &#x60;GET {{ api_url }}/v1/messages&#x60;  This &#x60;GET /api/v1/messages&#x60; endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip&#39;s powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user&#39;s message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an &#x60;anchor&#x60; message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the &#x60;num_before&#x60; and &#x60;num_after&#x60; limits.  We recommend using &#x60;num_before &lt;&#x3D; 1000&#x60; and &#x60;num_after &lt;&#x3D; 1000&#x60; to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
        /// </summary>
        /// <param name="numBefore">The number of messages with IDs less than the anchor to retrieve. </param>
        /// <param name="numAfter">The number of messages with IDs greater than the anchor to retrieve. </param>
        /// <param name="anchor">Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * &#x60;newest&#x60;: The most recent message. * &#x60;oldest&#x60;: The oldest message. * &#x60;first_unread&#x60;: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of &#x60;&#39;newest&#39;&#x60; and &#x60;&#39;oldest&#39;&#x60; are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   &#x60;first_unread&#x60; functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, &#x60;oldest&#x60; can be emulated with   &#x60;anchor&#x3D;0&#x60;, and &#x60;newest&#x60; with &#x60;anchor&#x3D;10000000000000000&#x60;   (that specific large value works around a bug in Zulip   2.1.x and older in the &#x60;found_newest&#x60; return value). </param>
        /// <param name="narrow">The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow). </param>
        /// <param name="clientGravatar">Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. </param>
        /// <param name="applyMarkdown">If &#x60;true&#x60;, message content is returned in the rendered HTML format. If &#x60;false&#x60;, message content is returned in the raw Markdown-format text that user entered. </param>
        /// <param name="useFirstUnreadAnchor">Legacy way to specify &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the &#x60;anchor&#x60;.  Mutually exclusive with &#x60;anchor&#x60;.  **Changes**: Deprecated in Zulip 3.0, replaced by &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; instead. </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase GetMessages (int? numBefore, int? numAfter, OneOfstringinteger anchor, List<Object> narrow, bool? clientGravatar, bool? applyMarkdown, bool? useFirstUnreadAnchor)
        {
            
            // verify the required parameter 'numBefore' is set
            if (numBefore == null) throw new ApiException(400, "Missing required parameter 'numBefore' when calling GetMessages");
            
            // verify the required parameter 'numAfter' is set
            if (numAfter == null) throw new ApiException(400, "Missing required parameter 'numAfter' when calling GetMessages");
            

            var path = "/messages";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (anchor != null) queryParams.Add("anchor", ApiClient.ParameterToString(anchor)); // query parameter
 if (numBefore != null) queryParams.Add("num_before", ApiClient.ParameterToString(numBefore)); // query parameter
 if (numAfter != null) queryParams.Add("num_after", ApiClient.ParameterToString(numAfter)); // query parameter
 if (narrow != null) queryParams.Add("narrow", ApiClient.ParameterToString(narrow)); // query parameter
 if (clientGravatar != null) queryParams.Add("client_gravatar", ApiClient.ParameterToString(clientGravatar)); // query parameter
 if (applyMarkdown != null) queryParams.Add("apply_markdown", ApiClient.ParameterToString(applyMarkdown)); // query parameter
 if (useFirstUnreadAnchor != null) queryParams.Add("use_first_unread_anchor", ApiClient.ParameterToString(useFirstUnreadAnchor)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetMessages: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetMessages: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Get a message&#39;s raw Markdown Get the raw content of a message.  &#x60;GET {{ api_url }}/v1/messages/{msg_id}&#x60;  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message&#39;s raw Markdown (e.g. for pre-filling a message-editing UI). 
        /// </summary>
        /// <param name="messageId">The target message&#39;s ID. </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase GetRawMessage (int? messageId)
        {
            
            // verify the required parameter 'messageId' is set
            if (messageId == null) throw new ApiException(400, "Missing required parameter 'messageId' when calling GetRawMessage");
            

            var path = "/messages/{message_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "message_id" + "}", ApiClient.ParameterToString(messageId));

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
                throw new ApiException ((int)response.StatusCode, "Error calling GetRawMessage: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetRawMessage: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Mark all messages as read Marks all of the current user&#39;s unread messages as read.  &#x60;POST {{ api_url }}/v1/mark_all_as_read&#x60; 
        /// </summary>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess MarkAllAsRead ()
        {
            

            var path = "/mark_all_as_read";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling MarkAllAsRead: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling MarkAllAsRead: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Mark messages in a stream as read Mark all the unread messages in a stream as read. 
        /// </summary>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess MarkStreamAsRead (int? streamId)
        {
            
            // verify the required parameter 'streamId' is set
            if (streamId == null) throw new ApiException(400, "Missing required parameter 'streamId' when calling MarkStreamAsRead");
            

            var path = "/mark_stream_as_read";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (streamId != null) queryParams.Add("stream_id", ApiClient.ParameterToString(streamId)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling MarkStreamAsRead: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling MarkStreamAsRead: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Mark messages in a topic as read Mark all the unread messages in a topic as read. 
        /// </summary>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <param name="topicName">The name of the topic whose messages should be marked as read. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess MarkTopicAsRead (int? streamId, string topicName)
        {
            
            // verify the required parameter 'streamId' is set
            if (streamId == null) throw new ApiException(400, "Missing required parameter 'streamId' when calling MarkTopicAsRead");
            
            // verify the required parameter 'topicName' is set
            if (topicName == null) throw new ApiException(400, "Missing required parameter 'topicName' when calling MarkTopicAsRead");
            

            var path = "/mark_topic_as_read";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (streamId != null) queryParams.Add("stream_id", ApiClient.ParameterToString(streamId)); // query parameter
 if (topicName != null) queryParams.Add("topic_name", ApiClient.ParameterToString(topicName)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling MarkTopicAsRead: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling MarkTopicAsRead: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Remove an emoji reaction Remove an [emoji reaction](/help/emoji-reactions) from a message.  &#x60;DELETE {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 
        /// </summary>
        /// <param name="messageId">The target message&#39;s ID. </param>
        /// <param name="emojiName">The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name. </param>
        /// <param name="emojiCode">A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji. </param>
        /// <param name="reactionType">If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess RemoveReaction (int? messageId, string emojiName, string emojiCode, string reactionType)
        {
            
            // verify the required parameter 'messageId' is set
            if (messageId == null) throw new ApiException(400, "Missing required parameter 'messageId' when calling RemoveReaction");
            

            var path = "/messages/{message_id}/reactions";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "message_id" + "}", ApiClient.ParameterToString(messageId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (emojiName != null) queryParams.Add("emoji_name", ApiClient.ParameterToString(emojiName)); // query parameter
 if (emojiCode != null) queryParams.Add("emoji_code", ApiClient.ParameterToString(emojiCode)); // query parameter
 if (reactionType != null) queryParams.Add("reaction_type", ApiClient.ParameterToString(reactionType)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling RemoveReaction: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling RemoveReaction: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Render message Render a message to HTML.  &#x60;POST {{ api_url }}/v1/messages/render&#x60; 
        /// </summary>
        /// <param name="content">The content of the message. Maximum message size of 10000 bytes. </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase RenderMessage (string content)
        {
            
            // verify the required parameter 'content' is set
            if (content == null) throw new ApiException(400, "Missing required parameter 'content' when calling RenderMessage");
            

            var path = "/messages/render";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (content != null) queryParams.Add("content", ApiClient.ParameterToString(content)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling RenderMessage: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling RenderMessage: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Send a message Send a stream or a private message.  &#x60;POST {{ api_url }}/v1/messages&#x60; 
        /// </summary>
        /// <param name="type">The type of message to be sent. &#x60;private&#x60; for a private message and &#x60;stream&#x60; for a stream message. </param>
        /// <param name="to">For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. </param>
        /// <param name="content">The content of the message. Maximum message size of 10000 bytes. </param>
        /// <param name="topic">The topic of the message. Only required for stream messages (&#x60;type&#x3D;\&quot;stream\&quot;&#x60;), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias. </param>
        /// <param name="queueId">For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, &#x60;local_id&#x60; is required.  If the message is successfully sent, the server will include &#x60;local_id&#x60; in the &#x60;message&#x60; event that the client with this &#x60;queue_id&#x60; will receive notifying it of the new message via [&#x60;GET /events&#x60;](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device). </param>
        /// <param name="localId">For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the &#x60;queue_id&#x60; description. </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase SendMessage (string type, List<int?> to, string content, string topic, string queueId, string localId)
        {
            
            // verify the required parameter 'type' is set
            if (type == null) throw new ApiException(400, "Missing required parameter 'type' when calling SendMessage");
            
            // verify the required parameter 'to' is set
            if (to == null) throw new ApiException(400, "Missing required parameter 'to' when calling SendMessage");
            
            // verify the required parameter 'content' is set
            if (content == null) throw new ApiException(400, "Missing required parameter 'content' when calling SendMessage");
            

            var path = "/messages";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (type != null) queryParams.Add("type", ApiClient.ParameterToString(type)); // query parameter
 if (to != null) queryParams.Add("to", ApiClient.ParameterToString(to)); // query parameter
 if (content != null) queryParams.Add("content", ApiClient.ParameterToString(content)); // query parameter
 if (topic != null) queryParams.Add("topic", ApiClient.ParameterToString(topic)); // query parameter
 if (queueId != null) queryParams.Add("queue_id", ApiClient.ParameterToString(queueId)); // query parameter
 if (localId != null) queryParams.Add("local_id", ApiClient.ParameterToString(localId)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling SendMessage: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling SendMessage: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Edit a message Edit/update the content or topic of a message.  &#x60;PATCH {{ api_url }}/v1/messages/{msg_id}&#x60;  &#x60;{msg_id}&#x60; in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to &#x60;✔ {original_topic}&#x60;.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
        /// </summary>
        /// <param name="messageId">The target message&#39;s ID. </param>
        /// <param name="topic">The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias. </param>
        /// <param name="propagateMode">Which message(s) should be edited: just the one indicated in &#x60;message_id&#x60;, messages in the same topic that had been sent after this one, or all of them.  Only the default value of &#x60;change_one&#x60; is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic. </param>
        /// <param name="sendNotificationToOldThread">Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9). </param>
        /// <param name="sendNotificationToNewThread">Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9). </param>
        /// <param name="content">The content of the message. Maximum message size of 10000 bytes. </param>
        /// <param name="streamId">The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess UpdateMessage (int? messageId, string topic, string propagateMode, bool? sendNotificationToOldThread, bool? sendNotificationToNewThread, string content, int? streamId)
        {
            
            // verify the required parameter 'messageId' is set
            if (messageId == null) throw new ApiException(400, "Missing required parameter 'messageId' when calling UpdateMessage");
            

            var path = "/messages/{message_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "message_id" + "}", ApiClient.ParameterToString(messageId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (topic != null) queryParams.Add("topic", ApiClient.ParameterToString(topic)); // query parameter
 if (propagateMode != null) queryParams.Add("propagate_mode", ApiClient.ParameterToString(propagateMode)); // query parameter
 if (sendNotificationToOldThread != null) queryParams.Add("send_notification_to_old_thread", ApiClient.ParameterToString(sendNotificationToOldThread)); // query parameter
 if (sendNotificationToNewThread != null) queryParams.Add("send_notification_to_new_thread", ApiClient.ParameterToString(sendNotificationToNewThread)); // query parameter
 if (content != null) queryParams.Add("content", ApiClient.ParameterToString(content)); // query parameter
 if (streamId != null) queryParams.Add("stream_id", ApiClient.ParameterToString(streamId)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PATCH, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateMessage: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateMessage: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Update personal message flags Add or remove personal message flags like &#x60;read&#x60; and &#x60;starred&#x60; on a collection of message IDs.  &#x60;POST {{ api_url }}/v1/messages/flags&#x60;  For updating the &#x60;read&#x60; flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
        /// </summary>
        /// <param name="messages">An array containing the IDs of the target messages. </param>
        /// <param name="op">Whether to &#x60;add&#x60; the flag or &#x60;remove&#x60; it. </param>
        /// <param name="flag">The flag that should be added/removed. </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase UpdateMessageFlags (List<int?> messages, string op, string flag)
        {
            
            // verify the required parameter 'messages' is set
            if (messages == null) throw new ApiException(400, "Missing required parameter 'messages' when calling UpdateMessageFlags");
            
            // verify the required parameter 'op' is set
            if (op == null) throw new ApiException(400, "Missing required parameter 'op' when calling UpdateMessageFlags");
            
            // verify the required parameter 'flag' is set
            if (flag == null) throw new ApiException(400, "Missing required parameter 'flag' when calling UpdateMessageFlags");
            

            var path = "/messages/flags";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (messages != null) queryParams.Add("messages", ApiClient.ParameterToString(messages)); // query parameter
 if (op != null) queryParams.Add("op", ApiClient.ParameterToString(op)); // query parameter
 if (flag != null) queryParams.Add("flag", ApiClient.ParameterToString(flag)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateMessageFlags: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateMessageFlags: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Upload a file Upload a single file and get the corresponding URI.  &#x60;POST {{ api_url }}/v1/user_uploads&#x60;  Initially, only you will be able to access the link.  To share the uploaded file, you&#39;ll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
        /// </summary>
        /// <param name="filename"></param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase UploadFile (System.IO.Stream filename)
        {
            

            var path = "/user_uploads";
            path = path.Replace("{format}", "json");
            
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
                throw new ApiException ((int)response.StatusCode, "Error calling UploadFile: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UploadFile: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

    }
}
