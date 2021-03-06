import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_mimetype/jaguar_mimetype.dart';
import 'dart:async';

import 'package:openapi/model/json_success_base.dart';
import 'package:openapi/model/json_success.dart';
import 'package:openapi/model/one_ofstringinteger.dart';
import 'package:openapi/model/one_ofobjectobject.dart';
import 'package:openapi/model/invalid_message_error.dart';
import 'package:openapi/model/coded_error.dart';

part 'messages_api.jretro.dart';

@GenApiClient()
class MessagesApi extends ApiClient with _$MessagesApiClient {
    final Route base;
    final Map<String, CodecRepo> converters;
    final Duration timeout;

    MessagesApi({this.base, this.converters, this.timeout = const Duration(minutes: 2)});

    /// Add an emoji reaction
    ///
    /// Add an [emoji reaction](/help/emoji-reactions) to a message.  &#x60;POST {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 
    @PostReq(path: "/messages/:message_id/reactions")
    Future<JsonSuccess> addReaction(
            @PathParam("message_id") int messageId
        ,
            @QueryParam("emoji_name") String emojiName, 
        
            @QueryParam("emoji_code") String emojiCode, 
        
            @QueryParam("reaction_type") String reactionType
        ) {
        return super.addReaction(
        messageId
        ,
        emojiName, 
        
        emojiCode, 
        
        reactionType

        ).timeout(timeout);
    }

    /// Check if messages match a narrow
    ///
    /// Check whether a set of messages match a [narrow](/api/construct-narrow).  &#x60;GET {{ api_url }}/v1/messages/matches_narrow&#x60;  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the &#x60;match_subject&#x60; and &#x60;match_content&#x60; objects is designed to match those of &#x60;GET /messages&#x60;, so that a client can splice these fields into a &#x60;message&#x60; object received from &#x60;GET /events&#x60; and end up with an extended message object identical to how a &#x60;GET /messages&#x60; for the current narrow would have returned the message. 
    @GetReq(path: "/messages/matches_narrow")
    Future<Object> checkMessagesMatchNarrow(
        
            @QueryParam("msg_ids") List<int> msgIds, 
        
            @QueryParam("narrow") List<Object> narrow
        ) {
        return super.checkMessagesMatchNarrow(
        
        msgIds, 
        
        narrow

        ).timeout(timeout);
    }

    /// Delete a message
    ///
    /// Permanently delete a message.  &#x60;DELETE {{ api_url }}/v1/messages/{msg_id}&#x60;  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
    @DeleteReq(path: "/messages/:message_id")
    Future<JsonSuccess> deleteMessage(
            @PathParam("message_id") int messageId
        ) {
        return super.deleteMessage(
        messageId

        ).timeout(timeout);
    }

    /// Get public temporary URL
    ///
    /// Get a temporary URL for access to the file that doesn&#39;t require authentication. 
    @GetReq(path: "/user_uploads/:realm_id_str/:filename")
    Future<JsonSuccessBase> getFileTemporaryUrl(
            @PathParam("realm_id_str") int realmIdStr, 
            @PathParam("filename") String filename
        ) {
        return super.getFileTemporaryUrl(
        realmIdStr, 
        filename

        ).timeout(timeout);
    }

    /// Get a message&#39;s edit history
    ///
    /// Fetch the message edit history of a previously edited message.  &#x60;GET {{ api_url }}/v1/messages/{message_id}/history&#x60;  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
    @GetReq(path: "/messages/:message_id/history")
    Future<JsonSuccessBase> getMessageHistory(
            @PathParam("message_id") int messageId
        ) {
        return super.getMessageHistory(
        messageId

        ).timeout(timeout);
    }

    /// Get messages
    ///
    /// Fetch message history from a Zulip server.  &#x60;GET {{ api_url }}/v1/messages&#x60;  This &#x60;GET /api/v1/messages&#x60; endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip&#39;s powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user&#39;s message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an &#x60;anchor&#x60; message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the &#x60;num_before&#x60; and &#x60;num_after&#x60; limits.  We recommend using &#x60;num_before &lt;&#x3D; 1000&#x60; and &#x60;num_after &lt;&#x3D; 1000&#x60; to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
    @GetReq(path: "/messages")
    Future<JsonSuccessBase> getMessages(
        
            @QueryParam("anchor") OneOfstringinteger anchor, 
        
            @QueryParam("num_before") int numBefore, 
        
            @QueryParam("num_after") int numAfter, 
        
            @QueryParam("narrow") List<Object> narrow, 
        
            @QueryParam("client_gravatar") bool clientGravatar, 
        
            @QueryParam("apply_markdown") bool applyMarkdown, 
        
            @QueryParam("use_first_unread_anchor") bool useFirstUnreadAnchor
        ) {
        return super.getMessages(
        
        anchor, 
        
        numBefore, 
        
        numAfter, 
        
        narrow, 
        
        clientGravatar, 
        
        applyMarkdown, 
        
        useFirstUnreadAnchor

        ).timeout(timeout);
    }

    /// Get a message&#39;s raw Markdown
    ///
    /// Get the raw content of a message.  &#x60;GET {{ api_url }}/v1/messages/{msg_id}&#x60;  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message&#39;s raw Markdown (e.g. for pre-filling a message-editing UI). 
    @GetReq(path: "/messages/:message_id")
    Future<JsonSuccessBase> getRawMessage(
            @PathParam("message_id") int messageId
        ) {
        return super.getRawMessage(
        messageId

        ).timeout(timeout);
    }

    /// Mark all messages as read
    ///
    /// Marks all of the current user&#39;s unread messages as read.  &#x60;POST {{ api_url }}/v1/mark_all_as_read&#x60; 
    @PostReq(path: "/mark_all_as_read")
    Future<JsonSuccess> markAllAsRead(
        ) {
        return super.markAllAsRead(

        ).timeout(timeout);
    }

    /// Mark messages in a stream as read
    ///
    /// Mark all the unread messages in a stream as read. 
    @PostReq(path: "/mark_stream_as_read")
    Future<JsonSuccess> markStreamAsRead(
        
            @QueryParam("stream_id") int streamId
        ) {
        return super.markStreamAsRead(
        
        streamId

        ).timeout(timeout);
    }

    /// Mark messages in a topic as read
    ///
    /// Mark all the unread messages in a topic as read. 
    @PostReq(path: "/mark_topic_as_read")
    Future<JsonSuccess> markTopicAsRead(
        
            @QueryParam("stream_id") int streamId, 
        
            @QueryParam("topic_name") String topicName
        ) {
        return super.markTopicAsRead(
        
        streamId, 
        
        topicName

        ).timeout(timeout);
    }

    /// Remove an emoji reaction
    ///
    /// Remove an [emoji reaction](/help/emoji-reactions) from a message.  &#x60;DELETE {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 
    @DeleteReq(path: "/messages/:message_id/reactions")
    Future<JsonSuccess> removeReaction(
            @PathParam("message_id") int messageId
        ,
            @QueryParam("emoji_name") String emojiName, 
        
            @QueryParam("emoji_code") String emojiCode, 
        
            @QueryParam("reaction_type") String reactionType
        ) {
        return super.removeReaction(
        messageId
        ,
        emojiName, 
        
        emojiCode, 
        
        reactionType

        ).timeout(timeout);
    }

    /// Render message
    ///
    /// Render a message to HTML.  &#x60;POST {{ api_url }}/v1/messages/render&#x60; 
    @PostReq(path: "/messages/render")
    Future<JsonSuccessBase> renderMessage(
        
            @QueryParam("content") String content
        ) {
        return super.renderMessage(
        
        content

        ).timeout(timeout);
    }

    /// Send a message
    ///
    /// Send a stream or a private message.  &#x60;POST {{ api_url }}/v1/messages&#x60; 
    @PostReq(path: "/messages")
    Future<JsonSuccessBase> sendMessage(
        
            @QueryParam("type") String type, 
        
            @QueryParam("to") List<int> to, 
        
            @QueryParam("content") String content, 
        
            @QueryParam("topic") String topic, 
        
            @QueryParam("queue_id") String queueId, 
        
            @QueryParam("local_id") String localId
        ) {
        return super.sendMessage(
        
        type, 
        
        to, 
        
        content, 
        
        topic, 
        
        queueId, 
        
        localId

        ).timeout(timeout);
    }

    /// Edit a message
    ///
    /// Edit/update the content or topic of a message.  &#x60;PATCH {{ api_url }}/v1/messages/{msg_id}&#x60;  &#x60;{msg_id}&#x60; in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to &#x60;??? {original_topic}&#x60;.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
    @PatchReq(path: "/messages/:message_id")
    Future<JsonSuccess> updateMessage(
            @PathParam("message_id") int messageId
        ,
            @QueryParam("topic") String topic, 
        
            @QueryParam("propagate_mode") String propagateMode, 
        
            @QueryParam("send_notification_to_old_thread") bool sendNotificationToOldThread, 
        
            @QueryParam("send_notification_to_new_thread") bool sendNotificationToNewThread, 
        
            @QueryParam("content") String content, 
        
            @QueryParam("stream_id") int streamId
        ) {
        return super.updateMessage(
        messageId
        ,
        topic, 
        
        propagateMode, 
        
        sendNotificationToOldThread, 
        
        sendNotificationToNewThread, 
        
        content, 
        
        streamId

        ).timeout(timeout);
    }

    /// Update personal message flags
    ///
    /// Add or remove personal message flags like &#x60;read&#x60; and &#x60;starred&#x60; on a collection of message IDs.  &#x60;POST {{ api_url }}/v1/messages/flags&#x60;  For updating the &#x60;read&#x60; flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
    @PostReq(path: "/messages/flags")
    Future<JsonSuccessBase> updateMessageFlags(
        
            @QueryParam("messages") List<int> messages, 
        
            @QueryParam("op") String op, 
        
            @QueryParam("flag") String flag
        ) {
        return super.updateMessageFlags(
        
        messages, 
        
        op, 
        
        flag

        ).timeout(timeout);
    }

    /// Upload a file
    ///
    /// Upload a single file and get the corresponding URI.  &#x60;POST {{ api_url }}/v1/user_uploads&#x60;  Initially, only you will be able to access the link.  To share the uploaded file, you&#39;ll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
    @PostReq(path: "/user_uploads")
    Future<JsonSuccessBase> uploadFile(
            
            @AsMultipartField() MultipartFile filename
        ) {
        return super.uploadFile(

        
        filename
        ).timeout(timeout);
    }


}
