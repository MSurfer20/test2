using System;
using Nancy;
using Nancy.ModelBinding;
using System.Collections.Generic;
using Sharpility.Base;
using Org.OpenAPITools._api_v1.Models;
using Org.OpenAPITools._api_v1.Utils;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Modules
{ 
    /// <summary>
    /// The type of message to be sent. &#x60;private&#x60; for a private message and &#x60;stream&#x60; for a stream message. 
    /// </summary>
    public enum SendMessageTypeEnum
    {
        private = 1, 
        stream = 2
    };

    /// <summary>
    /// Which message(s) should be edited: just the one indicated in &#x60;message_id&#x60;, messages in the same topic that had been sent after this one, or all of them.  Only the default value of &#x60;change_one&#x60; is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic. 
    /// </summary>
    public enum UpdateMessagePropagateModeEnum
    {
        change_one = 1, 
        change_later = 2, 
        change_all = 3
    };

    /// <summary>
    /// Whether to &#x60;add&#x60; the flag or &#x60;remove&#x60; it. 
    /// </summary>
    public enum UpdateMessageFlagsOpEnum
    {
        add = 1, 
        remove = 2
    };


    /// <summary>
    /// Module processing requests of Messages domain.
    /// </summary>
    public sealed class MessagesModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public MessagesModule(MessagesService service) : base("/api/v1")
        { 
            Post["/messages/{message_id}/reactions"] = parameters =>
            {
                var messageId = Parameters.ValueOf<int?>(parameters, Context.Request, "messageId", ParameterType.Path);
                var emojiName = Parameters.ValueOf<string>(parameters, Context.Request, "emojiName", ParameterType.Query);
                var emojiCode = Parameters.ValueOf<string>(parameters, Context.Request, "emojiCode", ParameterType.Query);
                var reactionType = Parameters.ValueOf<string>(parameters, Context.Request, "reactionType", ParameterType.Query);
                Preconditions.IsNotNull(messageId, "Required parameter: 'messageId' is missing at 'AddReaction'");
                
                Preconditions.IsNotNull(emojiName, "Required parameter: 'emojiName' is missing at 'AddReaction'");
                
                return service.AddReaction(Context, messageId, emojiName, emojiCode, reactionType);
            };

            Get["/messages/matches_narrow"] = parameters =>
            {
                var msgIds = Parameters.ValueOf<List<int?>>(parameters, Context.Request, "msgIds", ParameterType.Query);
                var narrow = Parameters.ValueOf<List<Object>>(parameters, Context.Request, "narrow", ParameterType.Query);
                Preconditions.IsNotNull(msgIds, "Required parameter: 'msgIds' is missing at 'CheckMessagesMatchNarrow'");
                
                Preconditions.IsNotNull(narrow, "Required parameter: 'narrow' is missing at 'CheckMessagesMatchNarrow'");
                
                return service.CheckMessagesMatchNarrow(Context, msgIds, narrow);
            };

            Delete["/messages/{message_id}"] = parameters =>
            {
                var messageId = Parameters.ValueOf<int?>(parameters, Context.Request, "messageId", ParameterType.Path);
                Preconditions.IsNotNull(messageId, "Required parameter: 'messageId' is missing at 'DeleteMessage'");
                
                return service.DeleteMessage(Context, messageId);
            };

            Get["/user_uploads/{realm_id_str}/{filename}"] = parameters =>
            {
                var realmIdStr = Parameters.ValueOf<int?>(parameters, Context.Request, "realmIdStr", ParameterType.Path);
                var filename = Parameters.ValueOf<string>(parameters, Context.Request, "filename", ParameterType.Path);
                Preconditions.IsNotNull(realmIdStr, "Required parameter: 'realmIdStr' is missing at 'GetFileTemporaryUrl'");
                
                Preconditions.IsNotNull(filename, "Required parameter: 'filename' is missing at 'GetFileTemporaryUrl'");
                
                return service.GetFileTemporaryUrl(Context, realmIdStr, filename);
            };

            Get["/messages/{message_id}/history"] = parameters =>
            {
                var messageId = Parameters.ValueOf<int?>(parameters, Context.Request, "messageId", ParameterType.Path);
                Preconditions.IsNotNull(messageId, "Required parameter: 'messageId' is missing at 'GetMessageHistory'");
                
                return service.GetMessageHistory(Context, messageId);
            };

            Get["/messages"] = parameters =>
            {
                var numBefore = Parameters.ValueOf<int?>(parameters, Context.Request, "numBefore", ParameterType.Query);
                var numAfter = Parameters.ValueOf<int?>(parameters, Context.Request, "numAfter", ParameterType.Query);
                var anchor = Parameters.ValueOf<OneOfstringinteger>(parameters, Context.Request, "anchor", ParameterType.Query);
                var narrow = Parameters.ValueOf<List<Object>>(parameters, Context.Request, "narrow", ParameterType.Query);
                var clientGravatar = Parameters.ValueOf<bool?>(parameters, Context.Request, "clientGravatar", ParameterType.Query);
                var applyMarkdown = Parameters.ValueOf<bool?>(parameters, Context.Request, "applyMarkdown", ParameterType.Query);
                var useFirstUnreadAnchor = Parameters.ValueOf<bool?>(parameters, Context.Request, "useFirstUnreadAnchor", ParameterType.Query);
                Preconditions.IsNotNull(numBefore, "Required parameter: 'numBefore' is missing at 'GetMessages'");
                
                Preconditions.IsNotNull(numAfter, "Required parameter: 'numAfter' is missing at 'GetMessages'");
                
                return service.GetMessages(Context, numBefore, numAfter, anchor, narrow, clientGravatar, applyMarkdown, useFirstUnreadAnchor);
            };

            Get["/messages/{message_id}"] = parameters =>
            {
                var messageId = Parameters.ValueOf<int?>(parameters, Context.Request, "messageId", ParameterType.Path);
                Preconditions.IsNotNull(messageId, "Required parameter: 'messageId' is missing at 'GetRawMessage'");
                
                return service.GetRawMessage(Context, messageId);
            };

            Post["/mark_all_as_read"] = parameters =>
            {
                
                return service.MarkAllAsRead(Context);
            };

            Post["/mark_stream_as_read"] = parameters =>
            {
                var streamId = Parameters.ValueOf<int?>(parameters, Context.Request, "streamId", ParameterType.Query);
                Preconditions.IsNotNull(streamId, "Required parameter: 'streamId' is missing at 'MarkStreamAsRead'");
                
                return service.MarkStreamAsRead(Context, streamId);
            };

            Post["/mark_topic_as_read"] = parameters =>
            {
                var streamId = Parameters.ValueOf<int?>(parameters, Context.Request, "streamId", ParameterType.Query);
                var topicName = Parameters.ValueOf<string>(parameters, Context.Request, "topicName", ParameterType.Query);
                Preconditions.IsNotNull(streamId, "Required parameter: 'streamId' is missing at 'MarkTopicAsRead'");
                
                Preconditions.IsNotNull(topicName, "Required parameter: 'topicName' is missing at 'MarkTopicAsRead'");
                
                return service.MarkTopicAsRead(Context, streamId, topicName);
            };

            Delete["/messages/{message_id}/reactions"] = parameters =>
            {
                var messageId = Parameters.ValueOf<int?>(parameters, Context.Request, "messageId", ParameterType.Path);
                var emojiName = Parameters.ValueOf<string>(parameters, Context.Request, "emojiName", ParameterType.Query);
                var emojiCode = Parameters.ValueOf<string>(parameters, Context.Request, "emojiCode", ParameterType.Query);
                var reactionType = Parameters.ValueOf<string>(parameters, Context.Request, "reactionType", ParameterType.Query);
                Preconditions.IsNotNull(messageId, "Required parameter: 'messageId' is missing at 'RemoveReaction'");
                
                return service.RemoveReaction(Context, messageId, emojiName, emojiCode, reactionType);
            };

            Post["/messages/render"] = parameters =>
            {
                var content = Parameters.ValueOf<string>(parameters, Context.Request, "content", ParameterType.Query);
                Preconditions.IsNotNull(content, "Required parameter: 'content' is missing at 'RenderMessage'");
                
                return service.RenderMessage(Context, content);
            };

            Post["/messages"] = parameters =>
            {
                var type = Parameters.ValueOf<SendMessageTypeEnum?>(parameters, Context.Request, "type", ParameterType.Query);
                var to = Parameters.ValueOf<List<int?>>(parameters, Context.Request, "to", ParameterType.Query);
                var content = Parameters.ValueOf<string>(parameters, Context.Request, "content", ParameterType.Query);
                var topic = Parameters.ValueOf<string>(parameters, Context.Request, "topic", ParameterType.Query);
                var queueId = Parameters.ValueOf<string>(parameters, Context.Request, "queueId", ParameterType.Query);
                var localId = Parameters.ValueOf<string>(parameters, Context.Request, "localId", ParameterType.Query);
                Preconditions.IsNotNull(type, "Required parameter: 'type' is missing at 'SendMessage'");
                
                Preconditions.IsNotNull(to, "Required parameter: 'to' is missing at 'SendMessage'");
                
                Preconditions.IsNotNull(content, "Required parameter: 'content' is missing at 'SendMessage'");
                
                return service.SendMessage(Context, type, to, content, topic, queueId, localId);
            };

            Patch["/messages/{message_id}"] = parameters =>
            {
                var messageId = Parameters.ValueOf<int?>(parameters, Context.Request, "messageId", ParameterType.Path);
                var topic = Parameters.ValueOf<string>(parameters, Context.Request, "topic", ParameterType.Query);
                var propagateMode = Parameters.ValueOf<UpdateMessagePropagateModeEnum?>(parameters, Context.Request, "propagateMode", ParameterType.Query);
                var sendNotificationToOldThread = Parameters.ValueOf<bool?>(parameters, Context.Request, "sendNotificationToOldThread", ParameterType.Query);
                var sendNotificationToNewThread = Parameters.ValueOf<bool?>(parameters, Context.Request, "sendNotificationToNewThread", ParameterType.Query);
                var content = Parameters.ValueOf<string>(parameters, Context.Request, "content", ParameterType.Query);
                var streamId = Parameters.ValueOf<int?>(parameters, Context.Request, "streamId", ParameterType.Query);
                Preconditions.IsNotNull(messageId, "Required parameter: 'messageId' is missing at 'UpdateMessage'");
                
                return service.UpdateMessage(Context, messageId, topic, propagateMode, sendNotificationToOldThread, sendNotificationToNewThread, content, streamId);
            };

            Post["/messages/flags"] = parameters =>
            {
                var messages = Parameters.ValueOf<List<int?>>(parameters, Context.Request, "messages", ParameterType.Query);
                var op = Parameters.ValueOf<UpdateMessageFlagsOpEnum?>(parameters, Context.Request, "op", ParameterType.Query);
                var flag = Parameters.ValueOf<string>(parameters, Context.Request, "flag", ParameterType.Query);
                Preconditions.IsNotNull(messages, "Required parameter: 'messages' is missing at 'UpdateMessageFlags'");
                
                Preconditions.IsNotNull(op, "Required parameter: 'op' is missing at 'UpdateMessageFlags'");
                
                Preconditions.IsNotNull(flag, "Required parameter: 'flag' is missing at 'UpdateMessageFlags'");
                
                return service.UpdateMessageFlags(Context, messages, op, flag);
            };

            Post["/user_uploads"] = parameters =>
            {
                var filename = Parameters.ValueOf<System.IO.Stream>(parameters, Context.Request, "filename", ParameterType.Undefined);
                return service.UploadFile(Context, filename);
            };
        }
    }

    /// <summary>
    /// Service handling Messages requests.
    /// </summary>
    public interface MessagesService
    {
        /// <summary>
        /// Add an [emoji reaction](/help/emoji-reactions) to a message.  &#x60;POST {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="messageId">The target message&#39;s ID. </param>
        /// <param name="emojiName">The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name. </param>
        /// <param name="emojiCode">A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji.  (optional)</param>
        /// <param name="reactionType">If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified.  (optional)</param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess AddReaction(NancyContext context, int? messageId, string emojiName, string emojiCode, string reactionType);

        /// <summary>
        /// Check whether a set of messages match a [narrow](/api/construct-narrow).  &#x60;GET {{ api_url }}/v1/messages/matches_narrow&#x60;  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the &#x60;match_subject&#x60; and &#x60;match_content&#x60; objects is designed to match those of &#x60;GET /messages&#x60;, so that a client can splice these fields into a &#x60;message&#x60; object received from &#x60;GET /events&#x60; and end up with an extended message object identical to how a &#x60;GET /messages&#x60; for the current narrow would have returned the message. 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="msgIds">List of IDs for the messages to check.</param>
        /// <param name="narrow">A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).</param>
        /// <returns>Object</returns>
        Object CheckMessagesMatchNarrow(NancyContext context, List<int?> msgIds, List<Object> narrow);

        /// <summary>
        /// Permanently delete a message.  &#x60;DELETE {{ api_url }}/v1/messages/{msg_id}&#x60;  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="messageId">The target message&#39;s ID. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess DeleteMessage(NancyContext context, int? messageId);

        /// <summary>
        /// Get a temporary URL for access to the file that doesn&#39;t require authentication. 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="realmIdStr">The realm id. </param>
        /// <param name="filename">Path to the URL. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetFileTemporaryUrl(NancyContext context, int? realmIdStr, string filename);

        /// <summary>
        /// Fetch the message edit history of a previously edited message.  &#x60;GET {{ api_url }}/v1/messages/{message_id}/history&#x60;  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="messageId">The target message&#39;s ID. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetMessageHistory(NancyContext context, int? messageId);

        /// <summary>
        /// Fetch message history from a Zulip server.  &#x60;GET {{ api_url }}/v1/messages&#x60;  This &#x60;GET /api/v1/messages&#x60; endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip&#39;s powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user&#39;s message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an &#x60;anchor&#x60; message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the &#x60;num_before&#x60; and &#x60;num_after&#x60; limits.  We recommend using &#x60;num_before &lt;&#x3D; 1000&#x60; and &#x60;num_after &lt;&#x3D; 1000&#x60; to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="numBefore">The number of messages with IDs less than the anchor to retrieve. </param>
        /// <param name="numAfter">The number of messages with IDs greater than the anchor to retrieve. </param>
        /// <param name="anchor">Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * &#x60;newest&#x60;: The most recent message. * &#x60;oldest&#x60;: The oldest message. * &#x60;first_unread&#x60;: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of &#x60;&#39;newest&#39;&#x60; and &#x60;&#39;oldest&#39;&#x60; are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   &#x60;first_unread&#x60; functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, &#x60;oldest&#x60; can be emulated with   &#x60;anchor&#x3D;0&#x60;, and &#x60;newest&#x60; with &#x60;anchor&#x3D;10000000000000000&#x60;   (that specific large value works around a bug in Zulip   2.1.x and older in the &#x60;found_newest&#x60; return value).  (optional)</param>
        /// <param name="narrow">The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow).  (optional)</param>
        /// <param name="clientGravatar">Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  (optional, default to false)</param>
        /// <param name="applyMarkdown">If &#x60;true&#x60;, message content is returned in the rendered HTML format. If &#x60;false&#x60;, message content is returned in the raw Markdown-format text that user entered.  (optional, default to true)</param>
        /// <param name="useFirstUnreadAnchor">Legacy way to specify &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the &#x60;anchor&#x60;.  Mutually exclusive with &#x60;anchor&#x60;.  **Changes**: Deprecated in Zulip 3.0, replaced by &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; instead.  (optional, default to false)</param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetMessages(NancyContext context, int? numBefore, int? numAfter, OneOfstringinteger anchor, List<Object> narrow, bool? clientGravatar, bool? applyMarkdown, bool? useFirstUnreadAnchor);

        /// <summary>
        /// Get the raw content of a message.  &#x60;GET {{ api_url }}/v1/messages/{msg_id}&#x60;  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message&#39;s raw Markdown (e.g. for pre-filling a message-editing UI). 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="messageId">The target message&#39;s ID. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetRawMessage(NancyContext context, int? messageId);

        /// <summary>
        /// Marks all of the current user&#39;s unread messages as read.  &#x60;POST {{ api_url }}/v1/mark_all_as_read&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess MarkAllAsRead(NancyContext context);

        /// <summary>
        /// Mark all the unread messages in a stream as read. 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess MarkStreamAsRead(NancyContext context, int? streamId);

        /// <summary>
        /// Mark all the unread messages in a topic as read. 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <param name="topicName">The name of the topic whose messages should be marked as read. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess MarkTopicAsRead(NancyContext context, int? streamId, string topicName);

        /// <summary>
        /// Remove an [emoji reaction](/help/emoji-reactions) from a message.  &#x60;DELETE {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="messageId">The target message&#39;s ID. </param>
        /// <param name="emojiName">The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name.  (optional)</param>
        /// <param name="emojiCode">A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji.  (optional)</param>
        /// <param name="reactionType">If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified.  (optional)</param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess RemoveReaction(NancyContext context, int? messageId, string emojiName, string emojiCode, string reactionType);

        /// <summary>
        /// Render a message to HTML.  &#x60;POST {{ api_url }}/v1/messages/render&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="content">The content of the message. Maximum message size of 10000 bytes. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase RenderMessage(NancyContext context, string content);

        /// <summary>
        /// Send a stream or a private message.  &#x60;POST {{ api_url }}/v1/messages&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="type">The type of message to be sent. &#x60;private&#x60; for a private message and &#x60;stream&#x60; for a stream message. </param>
        /// <param name="to">For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. </param>
        /// <param name="content">The content of the message. Maximum message size of 10000 bytes. </param>
        /// <param name="topic">The topic of the message. Only required for stream messages (&#x60;type&#x3D;\&quot;stream\&quot;&#x60;), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias.  (optional)</param>
        /// <param name="queueId">For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, &#x60;local_id&#x60; is required.  If the message is successfully sent, the server will include &#x60;local_id&#x60; in the &#x60;message&#x60; event that the client with this &#x60;queue_id&#x60; will receive notifying it of the new message via [&#x60;GET /events&#x60;](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device).  (optional)</param>
        /// <param name="localId">For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the &#x60;queue_id&#x60; description.  (optional)</param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase SendMessage(NancyContext context, SendMessageTypeEnum? type, List<int?> to, string content, string topic, string queueId, string localId);

        /// <summary>
        /// Edit/update the content or topic of a message.  &#x60;PATCH {{ api_url }}/v1/messages/{msg_id}&#x60;  &#x60;{msg_id}&#x60; in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to &#x60;✔ {original_topic}&#x60;.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="messageId">The target message&#39;s ID. </param>
        /// <param name="topic">The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias.  (optional)</param>
        /// <param name="propagateMode">Which message(s) should be edited: just the one indicated in &#x60;message_id&#x60;, messages in the same topic that had been sent after this one, or all of them.  Only the default value of &#x60;change_one&#x60; is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic.  (optional, default to change_one)</param>
        /// <param name="sendNotificationToOldThread">Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9).  (optional, default to true)</param>
        /// <param name="sendNotificationToNewThread">Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9).  (optional, default to true)</param>
        /// <param name="content">The content of the message. Maximum message size of 10000 bytes.  (optional)</param>
        /// <param name="streamId">The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message.  (optional)</param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess UpdateMessage(NancyContext context, int? messageId, string topic, UpdateMessagePropagateModeEnum? propagateMode, bool? sendNotificationToOldThread, bool? sendNotificationToNewThread, string content, int? streamId);

        /// <summary>
        /// Add or remove personal message flags like &#x60;read&#x60; and &#x60;starred&#x60; on a collection of message IDs.  &#x60;POST {{ api_url }}/v1/messages/flags&#x60;  For updating the &#x60;read&#x60; flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="messages">An array containing the IDs of the target messages. </param>
        /// <param name="op">Whether to &#x60;add&#x60; the flag or &#x60;remove&#x60; it. </param>
        /// <param name="flag">The flag that should be added/removed. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase UpdateMessageFlags(NancyContext context, List<int?> messages, UpdateMessageFlagsOpEnum? op, string flag);

        /// <summary>
        /// Upload a single file and get the corresponding URI.  &#x60;POST {{ api_url }}/v1/user_uploads&#x60;  Initially, only you will be able to access the link.  To share the uploaded file, you&#39;ll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="filename"> (optional)</param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase UploadFile(NancyContext context, System.IO.Stream filename);
    }

    /// <summary>
    /// Abstraction of MessagesService.
    /// </summary>
    public abstract class AbstractMessagesService: MessagesService
    {
        public virtual JsonSuccess AddReaction(NancyContext context, int? messageId, string emojiName, string emojiCode, string reactionType)
        {
            return AddReaction(messageId, emojiName, emojiCode, reactionType);
        }

        public virtual Object CheckMessagesMatchNarrow(NancyContext context, List<int?> msgIds, List<Object> narrow)
        {
            return CheckMessagesMatchNarrow(msgIds, narrow);
        }

        public virtual JsonSuccess DeleteMessage(NancyContext context, int? messageId)
        {
            return DeleteMessage(messageId);
        }

        public virtual JsonSuccessBase GetFileTemporaryUrl(NancyContext context, int? realmIdStr, string filename)
        {
            return GetFileTemporaryUrl(realmIdStr, filename);
        }

        public virtual JsonSuccessBase GetMessageHistory(NancyContext context, int? messageId)
        {
            return GetMessageHistory(messageId);
        }

        public virtual JsonSuccessBase GetMessages(NancyContext context, int? numBefore, int? numAfter, OneOfstringinteger anchor, List<Object> narrow, bool? clientGravatar, bool? applyMarkdown, bool? useFirstUnreadAnchor)
        {
            return GetMessages(numBefore, numAfter, anchor, narrow, clientGravatar, applyMarkdown, useFirstUnreadAnchor);
        }

        public virtual JsonSuccessBase GetRawMessage(NancyContext context, int? messageId)
        {
            return GetRawMessage(messageId);
        }

        public virtual JsonSuccess MarkAllAsRead(NancyContext context)
        {
            return MarkAllAsRead();
        }

        public virtual JsonSuccess MarkStreamAsRead(NancyContext context, int? streamId)
        {
            return MarkStreamAsRead(streamId);
        }

        public virtual JsonSuccess MarkTopicAsRead(NancyContext context, int? streamId, string topicName)
        {
            return MarkTopicAsRead(streamId, topicName);
        }

        public virtual JsonSuccess RemoveReaction(NancyContext context, int? messageId, string emojiName, string emojiCode, string reactionType)
        {
            return RemoveReaction(messageId, emojiName, emojiCode, reactionType);
        }

        public virtual JsonSuccessBase RenderMessage(NancyContext context, string content)
        {
            return RenderMessage(content);
        }

        public virtual JsonSuccessBase SendMessage(NancyContext context, SendMessageTypeEnum? type, List<int?> to, string content, string topic, string queueId, string localId)
        {
            return SendMessage(type, to, content, topic, queueId, localId);
        }

        public virtual JsonSuccess UpdateMessage(NancyContext context, int? messageId, string topic, UpdateMessagePropagateModeEnum? propagateMode, bool? sendNotificationToOldThread, bool? sendNotificationToNewThread, string content, int? streamId)
        {
            return UpdateMessage(messageId, topic, propagateMode, sendNotificationToOldThread, sendNotificationToNewThread, content, streamId);
        }

        public virtual JsonSuccessBase UpdateMessageFlags(NancyContext context, List<int?> messages, UpdateMessageFlagsOpEnum? op, string flag)
        {
            return UpdateMessageFlags(messages, op, flag);
        }

        public virtual JsonSuccessBase UploadFile(NancyContext context, System.IO.Stream filename)
        {
            return UploadFile(filename);
        }

        protected abstract JsonSuccess AddReaction(int? messageId, string emojiName, string emojiCode, string reactionType);

        protected abstract Object CheckMessagesMatchNarrow(List<int?> msgIds, List<Object> narrow);

        protected abstract JsonSuccess DeleteMessage(int? messageId);

        protected abstract JsonSuccessBase GetFileTemporaryUrl(int? realmIdStr, string filename);

        protected abstract JsonSuccessBase GetMessageHistory(int? messageId);

        protected abstract JsonSuccessBase GetMessages(int? numBefore, int? numAfter, OneOfstringinteger anchor, List<Object> narrow, bool? clientGravatar, bool? applyMarkdown, bool? useFirstUnreadAnchor);

        protected abstract JsonSuccessBase GetRawMessage(int? messageId);

        protected abstract JsonSuccess MarkAllAsRead();

        protected abstract JsonSuccess MarkStreamAsRead(int? streamId);

        protected abstract JsonSuccess MarkTopicAsRead(int? streamId, string topicName);

        protected abstract JsonSuccess RemoveReaction(int? messageId, string emojiName, string emojiCode, string reactionType);

        protected abstract JsonSuccessBase RenderMessage(string content);

        protected abstract JsonSuccessBase SendMessage(SendMessageTypeEnum? type, List<int?> to, string content, string topic, string queueId, string localId);

        protected abstract JsonSuccess UpdateMessage(int? messageId, string topic, UpdateMessagePropagateModeEnum? propagateMode, bool? sendNotificationToOldThread, bool? sendNotificationToNewThread, string content, int? streamId);

        protected abstract JsonSuccessBase UpdateMessageFlags(List<int?> messages, UpdateMessageFlagsOpEnum? op, string flag);

        protected abstract JsonSuccessBase UploadFile(System.IO.Stream filename);
    }

}
