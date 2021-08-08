import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import * as models from '../models/all';
import { Configuration} from '../configuration'

import { AddSubscriptionsResponse } from '../models/AddSubscriptionsResponse';
import { AddSubscriptionsResponseAllOf } from '../models/AddSubscriptionsResponseAllOf';
import { ApiKeyResponse } from '../models/ApiKeyResponse';
import { ApiKeyResponseAllOf } from '../models/ApiKeyResponseAllOf';
import { Attachments } from '../models/Attachments';
import { AttachmentsMessages } from '../models/AttachmentsMessages';
import { BadEventQueueIdError } from '../models/BadEventQueueIdError';
import { BadEventQueueIdErrorAllOf } from '../models/BadEventQueueIdErrorAllOf';
import { BasicBot } from '../models/BasicBot';
import { BasicBotAllOf } from '../models/BasicBotAllOf';
import { BasicBotBase } from '../models/BasicBotBase';
import { BasicStream } from '../models/BasicStream';
import { BasicStreamAllOf } from '../models/BasicStreamAllOf';
import { BasicStreamBase } from '../models/BasicStreamBase';
import { Bot } from '../models/Bot';
import { BotAllOf } from '../models/BotAllOf';
import { CodedError } from '../models/CodedError';
import { CodedErrorAllOf } from '../models/CodedErrorAllOf';
import { CodedErrorBase } from '../models/CodedErrorBase';
import { CodedErrorBaseAllOf } from '../models/CodedErrorBaseAllOf';
import { CustomProfileField } from '../models/CustomProfileField';
import { DefaultStreamGroup } from '../models/DefaultStreamGroup';
import { Draft } from '../models/Draft';
import { EmojiBase } from '../models/EmojiBase';
import { EmojiReaction } from '../models/EmojiReaction';
import { EmojiReactionAllOf } from '../models/EmojiReactionAllOf';
import { EmojiReactionBase } from '../models/EmojiReactionBase';
import { EmojiReactionBaseAllOf } from '../models/EmojiReactionBaseAllOf';
import { EmojiReactionBaseAllOfUser } from '../models/EmojiReactionBaseAllOfUser';
import { GetMessages } from '../models/GetMessages';
import { GetMessagesAllOf } from '../models/GetMessagesAllOf';
import { Hotspot } from '../models/Hotspot';
import { InlineResponse200 } from '../models/InlineResponse200';
import { InvalidApiKeyError } from '../models/InvalidApiKeyError';
import { InvalidMessageError } from '../models/InvalidMessageError';
import { InvalidMessageErrorAllOf } from '../models/InvalidMessageErrorAllOf';
import { JsonError } from '../models/JsonError';
import { JsonErrorBase } from '../models/JsonErrorBase';
import { JsonErrorBaseAllOf } from '../models/JsonErrorBaseAllOf';
import { JsonResponseBase } from '../models/JsonResponseBase';
import { JsonSuccess } from '../models/JsonSuccess';
import { JsonSuccessAllOf } from '../models/JsonSuccessAllOf';
import { JsonSuccessBase } from '../models/JsonSuccessBase';
import { JsonSuccessBaseAllOf } from '../models/JsonSuccessBaseAllOf';
import { Messages } from '../models/Messages';
import { MessagesAllOf } from '../models/MessagesAllOf';
import { MessagesBase } from '../models/MessagesBase';
import { MessagesBaseTopicLinks } from '../models/MessagesBaseTopicLinks';
import { MissingArgumentError } from '../models/MissingArgumentError';
import { MissingArgumentErrorAllOf } from '../models/MissingArgumentErrorAllOf';
import { NonExistingStreamError } from '../models/NonExistingStreamError';
import { NonExistingStreamErrorAllOf } from '../models/NonExistingStreamErrorAllOf';
import { Presence } from '../models/Presence';
import { RateLimitedError } from '../models/RateLimitedError';
import { RealmDeactivatedError } from '../models/RealmDeactivatedError';
import { RealmDomain } from '../models/RealmDomain';
import { RealmEmoji } from '../models/RealmEmoji';
import { RealmExport } from '../models/RealmExport';
import { RealmPlayground } from '../models/RealmPlayground';
import { Subscriptions } from '../models/Subscriptions';
import { User } from '../models/User';
import { UserAllOf } from '../models/UserAllOf';
import { UserBase } from '../models/UserBase';
import { UserDeactivatedError } from '../models/UserDeactivatedError';
import { UserGroup } from '../models/UserGroup';
import { UserNotAuthorizedError } from '../models/UserNotAuthorizedError';
import { ObservableAuthenticationApi } from './ObservableAPI';

import { AuthenticationApiRequestFactory, AuthenticationApiResponseProcessor} from "../apis/AuthenticationApi";
export class PromiseAuthenticationApi {
    private api: ObservableAuthenticationApi

    public constructor(
        configuration: Configuration,
        requestFactory?: AuthenticationApiRequestFactory,
        responseProcessor?: AuthenticationApiResponseProcessor
    ) {
        this.api = new ObservableAuthenticationApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * For easy testing of mobile apps and other clients and against Zulip development servers, we support fetching a Zulip API key for any user on the development server without authentication (so that they can implement analogues of the one-click login process available for Zulip development servers on the web).  **Note:** This endpoint is only available on Zulip development servers; for obvious security reasons it will always return an error in a Zulip production server.  `POST {{ api_url }}/v1/dev_fetch_api_key` 
     * Fetch an API key (development only)
     * @param username The email address for the user that owns the API key. 
     */
    public devFetchApiKey(username: string, _options?: Configuration): Promise<ApiKeyResponse> {
        const result = this.api.devFetchApiKey(username, _options);
        return result.toPromise();
    }

    /**
     * This API endpoint is used by clients such as the Zulip mobile and terminal apps to implement password-based authentication.  Given the user's Zulip login credentials, it returns a Zulip API key that the client can use to make requests requests as the user.  This endpoint is only useful for Zulip servers/organizations with EmailAuthBackend or LDAPAuthBackend enabled.  The Zulip mobile apps also support SSO/social authentication (GitHub auth, Google auth, SAML, etc.) that does not use this endpoint.  Instead, the mobile apps reuse the web login flow passing the `mobile_flow_otp` in a webview, and the credentials are returned to the app (encrypted) via a redirect to a `zulip://` URL.  !!! warn \"\"     **Note:** If you signed up using passwordless authentication and     never had a password, you can [reset your password](/help/change-your-password).      See the [API keys](/api/api-keys) documentation for     more details on how to download API key manually.  In a [Zulip development environment](https://zulip.readthedocs.io/en/latest/development/overview.html), see also [the unauthenticated variant](/api/dev-fetch-api-key). 
     * Fetch an API key (production)
     * @param username The username to be used for authentication (typically, the email address, but depending on configuration, it could be an LDAP username).  See the &#x60;require_email_format_usernames&#x60; parameter documented in [GET /server_settings](/api/get-server-settings) for details. 
     * @param password The user&#39;s Zulip password (or LDAP password, if LDAP authentication is in use). 
     */
    public fetchApiKey(username: string, password: string, _options?: Configuration): Promise<ApiKeyResponse> {
        const result = this.api.fetchApiKey(username, password, _options);
        return result.toPromise();
    }


}



import { ObservableDraftsApi } from './ObservableAPI';

import { DraftsApiRequestFactory, DraftsApiResponseProcessor} from "../apis/DraftsApi";
export class PromiseDraftsApi {
    private api: ObservableDraftsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DraftsApiRequestFactory,
        responseProcessor?: DraftsApiResponseProcessor
    ) {
        this.api = new ObservableDraftsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
     * Create drafts
     * @param drafts A JSON-encoded list of containing new draft objects. 
     */
    public createDrafts(drafts?: Array<Draft>, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.createDrafts(drafts, _options);
        return result.toPromise();
    }

    /**
     * Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
     * Delete a draft
     * @param draftId The ID of the draft you want to delete. 
     */
    public deleteDraft(draftId: number, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.deleteDraft(draftId, _options);
        return result.toPromise();
    }

    /**
     * Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
     * Edit a draft
     * @param draftId The ID of the draft to be edited. 
     * @param draft A JSON-encoded object containing a replacement draft object for this ID. 
     */
    public editDraft(draftId: number, draft: Draft, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.editDraft(draftId, draft, _options);
        return result.toPromise();
    }

    /**
     * Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
     * Get drafts
     */
    public getDrafts(_options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.getDrafts(_options);
        return result.toPromise();
    }


}



import { ObservableMessagesApi } from './ObservableAPI';

import { MessagesApiRequestFactory, MessagesApiResponseProcessor} from "../apis/MessagesApi";
export class PromiseMessagesApi {
    private api: ObservableMessagesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: MessagesApiRequestFactory,
        responseProcessor?: MessagesApiResponseProcessor
    ) {
        this.api = new ObservableMessagesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` 
     * Add an emoji reaction
     * @param messageId The target message&#39;s ID. 
     * @param emojiName The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name. 
     * @param emojiCode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji. 
     * @param reactionType If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified. 
     */
    public addReaction(messageId: number, emojiName: string, emojiCode?: string, reactionType?: string, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.addReaction(messageId, emojiName, emojiCode, reactionType, _options);
        return result.toPromise();
    }

    /**
     * Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. 
     * Check if messages match a narrow
     * @param msgIds List of IDs for the messages to check.
     * @param narrow A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).
     */
    public checkMessagesMatchNarrow(msgIds: Array<number>, narrow: Array<any>, _options?: Configuration): Promise<AnyType> {
        const result = this.api.checkMessagesMatchNarrow(msgIds, narrow, _options);
        return result.toPromise();
    }

    /**
     * Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
     * Delete a message
     * @param messageId The target message&#39;s ID. 
     */
    public deleteMessage(messageId: number, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.deleteMessage(messageId, _options);
        return result.toPromise();
    }

    /**
     * Get a temporary URL for access to the file that doesn't require authentication. 
     * Get public temporary URL
     * @param realmIdStr The realm id. 
     * @param filename Path to the URL. 
     */
    public getFileTemporaryUrl(realmIdStr: number, filename: string, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.getFileTemporaryUrl(realmIdStr, filename, _options);
        return result.toPromise();
    }

    /**
     * Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
     * Get a message's edit history
     * @param messageId The target message&#39;s ID. 
     */
    public getMessageHistory(messageId: number, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.getMessageHistory(messageId, _options);
        return result.toPromise();
    }

    /**
     * Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
     * Get messages
     * @param numBefore The number of messages with IDs less than the anchor to retrieve. 
     * @param numAfter The number of messages with IDs greater than the anchor to retrieve. 
     * @param anchor Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * &#x60;newest&#x60;: The most recent message. * &#x60;oldest&#x60;: The oldest message. * &#x60;first_unread&#x60;: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of &#x60;&#39;newest&#39;&#x60; and &#x60;&#39;oldest&#39;&#x60; are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   &#x60;first_unread&#x60; functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, &#x60;oldest&#x60; can be emulated with   &#x60;anchor&#x3D;0&#x60;, and &#x60;newest&#x60; with &#x60;anchor&#x3D;10000000000000000&#x60;   (that specific large value works around a bug in Zulip   2.1.x and older in the &#x60;found_newest&#x60; return value). 
     * @param narrow The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow). 
     * @param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. 
     * @param applyMarkdown If &#x60;true&#x60;, message content is returned in the rendered HTML format. If &#x60;false&#x60;, message content is returned in the raw Markdown-format text that user entered. 
     * @param useFirstUnreadAnchor Legacy way to specify &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the &#x60;anchor&#x60;.  Mutually exclusive with &#x60;anchor&#x60;.  **Changes**: Deprecated in Zulip 3.0, replaced by &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; instead. 
     */
    public getMessages(numBefore: number, numAfter: number, anchor?: string | number, narrow?: Array<any>, clientGravatar?: boolean, applyMarkdown?: boolean, useFirstUnreadAnchor?: boolean, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.getMessages(numBefore, numAfter, anchor, narrow, clientGravatar, applyMarkdown, useFirstUnreadAnchor, _options);
        return result.toPromise();
    }

    /**
     * Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). 
     * Get a message's raw Markdown
     * @param messageId The target message&#39;s ID. 
     */
    public getRawMessage(messageId: number, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.getRawMessage(messageId, _options);
        return result.toPromise();
    }

    /**
     * Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` 
     * Mark all messages as read
     */
    public markAllAsRead(_options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.markAllAsRead(_options);
        return result.toPromise();
    }

    /**
     * Mark all the unread messages in a stream as read. 
     * Mark messages in a stream as read
     * @param streamId The ID of the stream to access. 
     */
    public markStreamAsRead(streamId: number, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.markStreamAsRead(streamId, _options);
        return result.toPromise();
    }

    /**
     * Mark all the unread messages in a topic as read. 
     * Mark messages in a topic as read
     * @param streamId The ID of the stream to access. 
     * @param topicName The name of the topic whose messages should be marked as read. 
     */
    public markTopicAsRead(streamId: number, topicName: string, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.markTopicAsRead(streamId, topicName, _options);
        return result.toPromise();
    }

    /**
     * Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` 
     * Remove an emoji reaction
     * @param messageId The target message&#39;s ID. 
     * @param emojiName The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name. 
     * @param emojiCode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji. 
     * @param reactionType If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified. 
     */
    public removeReaction(messageId: number, emojiName?: string, emojiCode?: string, reactionType?: string, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.removeReaction(messageId, emojiName, emojiCode, reactionType, _options);
        return result.toPromise();
    }

    /**
     * Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` 
     * Render message
     * @param content The content of the message. Maximum message size of 10000 bytes. 
     */
    public renderMessage(content: string, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.renderMessage(content, _options);
        return result.toPromise();
    }

    /**
     * Send a stream or a private message.  `POST {{ api_url }}/v1/messages` 
     * Send a message
     * @param type The type of message to be sent. &#x60;private&#x60; for a private message and &#x60;stream&#x60; for a stream message. 
     * @param to For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. 
     * @param content The content of the message. Maximum message size of 10000 bytes. 
     * @param topic The topic of the message. Only required for stream messages (&#x60;type&#x3D;\&quot;stream\&quot;&#x60;), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias. 
     * @param queueId For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, &#x60;local_id&#x60; is required.  If the message is successfully sent, the server will include &#x60;local_id&#x60; in the &#x60;message&#x60; event that the client with this &#x60;queue_id&#x60; will receive notifying it of the new message via [&#x60;GET /events&#x60;](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device). 
     * @param localId For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the &#x60;queue_id&#x60; description. 
     */
    public sendMessage(type: 'private' | 'stream', to: Array<number>, content: string, topic?: string, queueId?: string, localId?: string, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.sendMessage(type, to, content, topic, queueId, localId, _options);
        return result.toPromise();
    }

    /**
     * Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
     * Edit a message
     * @param messageId The target message&#39;s ID. 
     * @param topic The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias. 
     * @param propagateMode Which message(s) should be edited: just the one indicated in &#x60;message_id&#x60;, messages in the same topic that had been sent after this one, or all of them.  Only the default value of &#x60;change_one&#x60; is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic. 
     * @param sendNotificationToOldThread Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9). 
     * @param sendNotificationToNewThread Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9). 
     * @param content The content of the message. Maximum message size of 10000 bytes. 
     * @param streamId The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message. 
     */
    public updateMessage(messageId: number, topic?: string, propagateMode?: 'change_one' | 'change_later' | 'change_all', sendNotificationToOldThread?: boolean, sendNotificationToNewThread?: boolean, content?: string, streamId?: number, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.updateMessage(messageId, topic, propagateMode, sendNotificationToOldThread, sendNotificationToNewThread, content, streamId, _options);
        return result.toPromise();
    }

    /**
     * Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
     * Update personal message flags
     * @param messages An array containing the IDs of the target messages. 
     * @param op Whether to &#x60;add&#x60; the flag or &#x60;remove&#x60; it. 
     * @param flag The flag that should be added/removed. 
     */
    public updateMessageFlags(messages: Array<number>, op: 'add' | 'remove', flag: string, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.updateMessageFlags(messages, op, flag, _options);
        return result.toPromise();
    }

    /**
     * Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
     * Upload a file
     * @param filename 
     */
    public uploadFile(filename?: HttpFile, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.uploadFile(filename, _options);
        return result.toPromise();
    }


}



import { ObservableRealTimeEventsApi } from './ObservableAPI';

import { RealTimeEventsApiRequestFactory, RealTimeEventsApiResponseProcessor} from "../apis/RealTimeEventsApi";
export class PromiseRealTimeEventsApi {
    private api: ObservableRealTimeEventsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: RealTimeEventsApiRequestFactory,
        responseProcessor?: RealTimeEventsApiResponseProcessor
    ) {
        this.api = new ObservableRealTimeEventsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Delete a previously registered queue.  `DELETE {{ api_url }}/v1/events` 
     * Delete an event queue
     * @param queueId The ID of an event queue that was previously registered via &#x60;POST /api/v1/register&#x60; (see [Register a queue](/api/register-queue)). 
     */
    public deleteQueue(queueId: string, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.deleteQueue(queueId, _options);
        return result.toPromise();
    }

    /**
     * `GET {{ api_url }}/v1/events`  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the `event_queue_longpoll_timeout_seconds` property returned by `POST /register` as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases. 
     * Get events from an event queue
     * @param queueId The ID of an event queue that was previously registered via &#x60;POST /api/v1/register&#x60; (see [Register a queue](/api/register-queue)). 
     * @param lastEventId The highest event ID in this queue that you&#39;ve received and wish to acknowledge. See the [code for &#x60;call_on_each_event&#x60;](https://github.com/zulip/python-zulip-api/blob/master/zulip/zulip/__init__.py) in the [zulip Python module](https://github.com/zulip/python-zulip-api) for an example implementation of correctly processing each event exactly once. 
     * @param dontBlock Set to &#x60;true&#x60; if the client is requesting a nonblocking reply. If not specified, the request will block until either a new event is available or a few minutes have passed, in which case the server will send the client a heartbeat event. 
     */
    public getEvents(queueId: string, lastEventId?: number, dontBlock?: boolean, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.getEvents(queueId, lastEventId, dontBlock, _options);
        return result.toPromise();
    }

    /**
     * (Ignored) 
     * @param eventTypes A JSON-encoded array indicating which types of events you&#39;re interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: &#x60;event_types&#x3D;[&#39;message&#39;]&#x60;  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
     * @param narrow A JSON-encoded array of arrays of length 2 indicating the narrow for which you&#39;d like to receive events for. For instance, to receive events for the stream &#x60;Denmark&#x60;, you would specify &#x60;narrow&#x3D;[[&#39;stream&#39;, &#39;Denmark&#39;]]&#x60;.  Another example is &#x60;narrow&#x3D;[[&#39;is&#39;, &#39;private&#39;]]&#x60; for private messages. Default is &#x60;[]&#x60;. 
     * @param allPublicStreams Whether you would like to request message events from all public streams.  Useful for workflow bots that you&#39;d like to see all new messages sent to public streams.  (You can also subscribe the user to private streams). 
     */
    public realTimePost(eventTypes?: Array<string>, narrow?: Array<Array<string>>, allPublicStreams?: boolean, _options?: Configuration): Promise<void> {
        const result = this.api.realTimePost(eventTypes, narrow, allPublicStreams, _options);
        return result.toPromise();
    }

    /**
     * `POST {{ api_url }}/v1/register`  This powerful endpoint can be used to register a Zulip \"event queue\" (subscribed to certain types of \"events\", or updates to the messages and other Zulip data the current user has access to), as well as to fetch the current state of that data.  (`register` also powers the `call_on_each_event` Python API, and is intended primarily for complex applications for which the more convenient `call_on_each_event` API is insufficient).  This endpoint returns a `queue_id` and a `last_event_id`; these can be used in subsequent calls to the [\"events\" endpoint](/api/get-events) to request events from the Zulip server using long-polling.  The server will queue events for up to 10 minutes of inactivity. After 10 minutes, your event queue will be garbage-collected.  The server will send `heartbeat` events every minute, which makes it easy to implement a robust client that does not miss events unless the client loses network connectivity with the Zulip server for 10 minutes or longer.  Once the server garbage-collects your event queue, the server will [return an error](/api/get-events#bad_event_queue_id-errors) with a code of `BAD_EVENT_QUEUE_ID` if you try to fetch events from the event queue.  Your software will need to handle that error condition by re-initializing itself (e.g. this is what triggers your browser reloading the Zulip web app when your laptop comes back online after being offline for more than 10 minutes).  When prototyping with this API, we recommend first calling `register` with no `event_types` parameter to see all the available data from all supported event types.  Before using your client in production, you should set appropriate `event_types` and `fetch_event_types` filters so that your client only requests the data it needs.  A few minutes doing this often saves 90% of the total bandwidth and other resources consumed by a client using this API.  See the [events system developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/events-system.html) if you need deeper details about how the Zulip event queue system works, avoids clients needing to worry about large classes of potentially messy races, etc. 
     * Register an event queue
     * @param applyMarkdown Set to &#x60;true&#x60; if you would like the content to be rendered in HTML format (otherwise the API will return the raw text that the user entered) 
     * @param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. 
     * @param slimPresence Setting this to &#x60;true&#x60; will make presence dictionaries be keyed by user_id instead of email.  **Changes**: New in Zulip 3.0 (Unstable with no feature level yet). 
     * @param eventTypes A JSON-encoded array indicating which types of events you&#39;re interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: &#x60;event_types&#x3D;[&#39;message&#39;]&#x60;  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
     * @param allPublicStreams Whether you would like to request message events from all public streams.  Useful for workflow bots that you&#39;d like to see all new messages sent to public streams.  (You can also subscribe the user to private streams). 
     * @param includeSubscribers Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 
     * @param clientCapabilities Dictionary containing details on features the client supports that are relevant to the format of responses sent by the server.  * &#x60;notification_settings_null&#x60;: Boolean for whether the   client can handle the current API with null values for   stream-level notification settings (which means the stream   is not customized and should inherit the user&#39;s global   notification settings for stream messages).   &lt;br /&gt;   New in Zulip 2.1.0; in earlier Zulip releases, stream-level   notification settings were simple booleans.  * &#x60;bulk_message_deletion&#x60;: Boolean for whether the client&#39;s    handler for the &#x60;delete_message&#x60; event type has been    updated to process the new bulk format (with a    &#x60;message_ids&#x60;, rather than a singleton &#x60;message_id&#x60;).    Otherwise, the server will send &#x60;delete_message&#x60; events    in a loop.    &lt;br /&gt;    New in Zulip 3.0 (feature level 13).  This    capability is for backwards-compatibility; it will be    required in a future server release.  * &#x60;user_avatar_url_field_optional&#x60;: Boolean for whether the    client required avatar URLs for all users, or supports    using &#x60;GET /avatar/{user_id}&#x60; to access user avatars.  If the    client has this capability, the server may skip sending a    &#x60;avatar_url&#x60; field in the &#x60;realm_user&#x60; at its sole discretion    to optimize network performance.  This is an important optimization    in organizations with 10,000s of users.    &lt;br /&gt;    New in Zulip 3.0 (feature level 18).  * &#x60;stream_typing_notifications&#x60;: Boolean for whether the client   supports stream typing notifications.   &lt;br /&gt;   New in Zulip 4.0 (feature level 58).  This capability is   for backwards-compatibility; it will be required in a   future server release.  * &#x60;user_settings_object&#x60;: Boolean for whether the client supports the modern   &#x60;user_settings&#x60; event type. If False, the server will additionally send the   legacy &#x60;update_display_settings&#x60; and &#x60;update_global_notifications&#x60; event   types for backwards-compatibility with clients that predate this API migration.   &lt;br /&gt;   &lt;br /&gt;   Because the feature level 89 API changes were merged together, clients can   safely make a request with this client capability and requesting all of the   &#x60;user_settings&#x60;, &#x60;update_display_settings&#x60;, and   &#x60;update_global_notifications&#x60; event types, and get exactly one copy of   settings data on any server version. (And then use the &#x60;zulip_feature_level&#x60;   in the &#x60;/register&#x60; response or the presence/absence of a &#x60;user_settings&#x60; key   to determine where to look).   &lt;br /&gt;   New in Zulip 5.0 (feature level 89).  This capability is for   backwards-compatibility; it will be removed in a future server release. 
     * @param fetchEventTypes Same as the &#x60;event_types&#x60; parameter except that the values in &#x60;fetch_event_types&#x60; are used to fetch initial data. If &#x60;fetch_event_types&#x60; is not provided, &#x60;event_types&#x60; is used and if &#x60;event_types&#x60; is not provided, this parameter defaults to &#x60;None&#x60;.  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
     * @param narrow A JSON-encoded array of arrays of length 2 indicating the narrow for which you&#39;d like to receive events for. For instance, to receive events for the stream &#x60;Denmark&#x60;, you would specify &#x60;narrow&#x3D;[[&#39;stream&#39;, &#39;Denmark&#39;]]&#x60;.  Another example is &#x60;narrow&#x3D;[[&#39;is&#39;, &#39;private&#39;]]&#x60; for private messages. Default is &#x60;[]&#x60;. 
     */
    public registerQueue(applyMarkdown?: boolean, clientGravatar?: boolean, slimPresence?: boolean, eventTypes?: Array<string>, allPublicStreams?: boolean, includeSubscribers?: boolean, clientCapabilities?: any, fetchEventTypes?: Array<string>, narrow?: Array<Array<string>>, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.registerQueue(applyMarkdown, clientGravatar, slimPresence, eventTypes, allPublicStreams, includeSubscribers, clientCapabilities, fetchEventTypes, narrow, _options);
        return result.toPromise();
    }

    /**
     * Common error to many endpoints 
     * Error handling
     */
    public restErrorHandling(_options?: Configuration): Promise<void> {
        const result = this.api.restErrorHandling(_options);
        return result.toPromise();
    }


}



import { ObservableServerAndOrganizationsApi } from './ObservableAPI';

import { ServerAndOrganizationsApiRequestFactory, ServerAndOrganizationsApiResponseProcessor} from "../apis/ServerAndOrganizationsApi";
export class PromiseServerAndOrganizationsApi {
    private api: ObservableServerAndOrganizationsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ServerAndOrganizationsApiRequestFactory,
        responseProcessor?: ServerAndOrganizationsApiResponseProcessor
    ) {
        this.api = new ObservableServerAndOrganizationsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
     * Add a code playground
     * @param name The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. 
     * @param pygmentsLanguage The name of the Pygments language lexer for that programming language. 
     * @param urlPrefix The url prefix for the playground. 
     */
    public addCodePlayground(name: string, pygmentsLanguage: string, urlPrefix: string, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.addCodePlayground(name, pygmentsLanguage, urlPrefix, _options);
        return result.toPromise();
    }

    /**
     * Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 
     * Add a linkifier
     * @param pattern The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
     * @param urlFormatString The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. 
     */
    public addLinkifier(pattern: string, urlFormatString: string, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.addLinkifier(pattern, urlFormatString, _options);
        return result.toPromise();
    }

    /**
     * [Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 
     * Create a custom profile field
     * @param fieldType The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
     * @param name The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile. 
     * @param hint The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
     * @param fieldData Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
     */
    public createCustomProfileField(fieldType: number, name?: string, hint?: string, fieldData?: any, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.createCustomProfileField(fieldType, name, hint, fieldData, _options);
        return result.toPromise();
    }

    /**
     * Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 
     * Get all custom emoji
     */
    public getCustomEmoji(_options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.getCustomEmoji(_options);
        return result.toPromise();
    }

    /**
     * Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 
     * Get all custom profile fields
     */
    public getCustomProfileFields(_options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.getCustomProfileFields(_options);
        return result.toPromise();
    }

    /**
     * List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 
     * Get linkifiers
     */
    public getLinkifiers(_options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.getLinkifiers(_options);
        return result.toPromise();
    }

    /**
     * Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
     * Get server settings
     */
    public getServerSettings(_options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.getServerSettings(_options);
        return result.toPromise();
    }

    /**
     * Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 
     * Remove a code playground
     * @param playgroundId The ID of the playground that you want to remove. 
     */
    public removeCodePlayground(playgroundId: number, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.removeCodePlayground(playgroundId, _options);
        return result.toPromise();
    }

    /**
     * Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 
     * Remove a linkifier
     * @param filterId The ID of the linkifier that you want to remove. 
     */
    public removeLinkifier(filterId: number, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.removeLinkifier(filterId, _options);
        return result.toPromise();
    }

    /**
     * Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
     * Reorder custom profile fields
     * @param order A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. 
     */
    public reorderCustomProfileFields(order: Array<number>, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.reorderCustomProfileFields(order, _options);
        return result.toPromise();
    }

    /**
     * Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 
     * Update a linkifier
     * @param filterId The ID of the linkifier that you want to update. 
     * @param pattern The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
     * @param urlFormatString The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. 
     */
    public updateLinkifier(filterId: number, pattern: string, urlFormatString: string, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.updateLinkifier(filterId, pattern, urlFormatString, _options);
        return result.toPromise();
    }

    /**
     * This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 
     * Upload custom emoji
     * @param emojiName The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). 
     * @param filename 
     */
    public uploadCustomEmoji(emojiName: string, filename?: HttpFile, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.uploadCustomEmoji(emojiName, filename, _options);
        return result.toPromise();
    }


}



import { ObservableStreamsApi } from './ObservableAPI';

import { StreamsApiRequestFactory, StreamsApiResponseProcessor} from "../apis/StreamsApi";
export class PromiseStreamsApi {
    private api: ObservableStreamsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: StreamsApiRequestFactory,
        responseProcessor?: StreamsApiResponseProcessor
    ) {
        this.api = new ObservableStreamsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 
     * Archive a stream
     * @param streamId The ID of the stream to access. 
     */
    public archiveStream(streamId: number, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.archiveStream(streamId, _options);
        return result.toPromise();
    }

    /**
     * Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
     * Create BigBlueButton video call
     */
    public createBigBlueButtonVideoCall(_options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.createBigBlueButtonVideoCall(_options);
        return result.toPromise();
    }

    /**
     * Delete all messages in a topic.  `POST {{ api_url }}/v1/streams/{stream_id}/delete_topic`  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. 
     * Delete a topic
     * @param streamId The ID of the stream to access. 
     * @param topicName The name of the topic to delete. 
     */
    public deleteTopic(streamId: number, topicName: string, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.deleteTopic(streamId, topicName, _options);
        return result.toPromise();
    }

    /**
     * Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 
     * Get stream ID
     * @param stream The name of the stream to access. 
     */
    public getStreamId(stream: string, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.getStreamId(stream, _options);
        return result.toPromise();
    }

    /**
     * Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 
     * Get topics in a stream
     * @param streamId The ID of the stream to access. 
     */
    public getStreamTopics(streamId: number, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.getStreamTopics(streamId, _options);
        return result.toPromise();
    }

    /**
     * Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 
     * Get all streams
     * @param includePublic Include all public streams. 
     * @param includeWebPublic Include all web public streams. 
     * @param includeSubscribed Include all streams that the user is subscribed to. 
     * @param includeAllActive Include all active streams. The user must have administrative privileges to use this parameter. 
     * @param includeDefault Include all default streams for the user&#39;s realm. 
     * @param includeOwnerSubscribed If the user is a bot, include all streams that the bot&#39;s owner is subscribed to. 
     */
    public getStreams(includePublic?: boolean, includeWebPublic?: boolean, includeSubscribed?: boolean, includeAllActive?: boolean, includeDefault?: boolean, includeOwnerSubscribed?: boolean, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.getStreams(includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed, _options);
        return result.toPromise();
    }

    /**
     * Get all users subscribed to a stream.  `Get {{ api_url }}/v1/streams/{stream_id}/members` 
     * Get the subscribers of a stream
     * @param streamId The ID of the stream to access. 
     */
    public getSubscribers(streamId: number, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.getSubscribers(streamId, _options);
        return result.toPromise();
    }

    /**
     * Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 
     * Get subscription status
     * @param userId The target user&#39;s ID. 
     * @param streamId The ID of the stream to access. 
     */
    public getSubscriptionStatus(userId: number, streamId: number, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.getSubscriptionStatus(userId, streamId, _options);
        return result.toPromise();
    }

    /**
     * Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 
     * Get subscribed streams
     * @param includeSubscribers Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 
     */
    public getSubscriptions(includeSubscribers?: boolean, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.getSubscriptions(includeSubscribers, _options);
        return result.toPromise();
    }

    /**
     * This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 
     * Topic muting
     * @param topic The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
     * @param op Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic. 
     * @param stream The name of the stream to access. 
     * @param streamId The ID of the stream to access. 
     */
    public muteTopic(topic: string, op: 'add' | 'remove', stream?: string, streamId?: number, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.muteTopic(topic, op, stream, streamId, _options);
        return result.toPromise();
    }

    /**
     * Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 
     * Subscribe to a stream
     * @param subscriptions A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value. 
     * @param principals A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
     * @param authorizationErrorsFatal A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key. 
     * @param announce If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation. 
     * @param inviteOnly As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. 
     * @param historyPublicToSubscribers Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
     * @param streamPostPolicy Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. 
     * @param messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
     */
    public subscribe(subscriptions: Array<any>, principals?: Array<string | number>, authorizationErrorsFatal?: boolean, announce?: boolean, inviteOnly?: boolean, historyPublicToSubscribers?: boolean, streamPostPolicy?: number, messageRetentionDays?: string | number, _options?: Configuration): Promise<AddSubscriptionsResponse> {
        const result = this.api.subscribe(subscriptions, principals, authorizationErrorsFatal, announce, inviteOnly, historyPublicToSubscribers, streamPostPolicy, messageRetentionDays, _options);
        return result.toPromise();
    }

    /**
     * Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 
     * Unsubscribe from a stream
     * @param subscriptions A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API. 
     * @param principals A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
     */
    public unsubscribe(subscriptions: Array<string>, principals?: Array<string | number>, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.unsubscribe(subscriptions, principals, _options);
        return result.toPromise();
    }

    /**
     * Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 
     * Update a stream
     * @param streamId The ID of the stream to access. 
     * @param description The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
     * @param newName The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
     * @param isPrivate Change whether the stream is a private stream. 
     * @param isAnnouncementOnly Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead. 
     * @param streamPostPolicy Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. 
     * @param historyPublicToSubscribers Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
     * @param messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
     */
    public updateStream(streamId: number, description?: string, newName?: string, isPrivate?: boolean, isAnnouncementOnly?: boolean, streamPostPolicy?: number, historyPublicToSubscribers?: boolean, messageRetentionDays?: string | number, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.updateStream(streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays, _options);
        return result.toPromise();
    }

    /**
     * This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 
     * Update subscription settings
     * @param subscriptionData A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream. 
     */
    public updateSubscriptionSettings(subscriptionData: Array<any>, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.updateSubscriptionSettings(subscriptionData, _options);
        return result.toPromise();
    }

    /**
     * Update which streams you are are subscribed to. 
     * Update subscriptions
     * @param _delete A list of stream names to unsubscribe from. 
     * @param add A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. 
     */
    public updateSubscriptions(_delete?: Array<string>, add?: Array<any>, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.updateSubscriptions(_delete, add, _options);
        return result.toPromise();
    }


}



import { ObservableUsersApi } from './ObservableAPI';

import { UsersApiRequestFactory, UsersApiResponseProcessor} from "../apis/UsersApi";
export class PromiseUsersApi {
    private api: ObservableUsersApi

    public constructor(
        configuration: Configuration,
        requestFactory?: UsersApiRequestFactory,
        responseProcessor?: UsersApiResponseProcessor
    ) {
        this.api = new ObservableUsersApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * {!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 
     * Create a user
     * @param email The email address of the new user. 
     * @param password The password of the new user. 
     * @param fullName The full name of the new user. 
     */
    public createUser(email: string, password: string, fullName: string, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.createUser(email, password, fullName, _options);
        return result.toPromise();
    }

    /**
     * Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 
     * Create a user group
     * @param name The name of the user group. 
     * @param description The description of the user group. 
     * @param members An array containing the user IDs of the initial members for the new user group. 
     */
    public createUserGroup(name: string, description: string, members: Array<number>, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.createUserGroup(name, description, members, _options);
        return result.toPromise();
    }

    /**
     * Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
     * Deactivate own user
     */
    public deactivateOwnUser(_options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.deactivateOwnUser(_options);
        return result.toPromise();
    }

    /**
     * [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 
     * Deactivate a user
     * @param userId The target user&#39;s ID. 
     */
    public deactivateUser(userId: number, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.deactivateUser(userId, _options);
        return result.toPromise();
    }

    /**
     * Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 
     * Get attachments
     */
    public getAttachments(_options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.getAttachments(_options);
        return result.toPromise();
    }

    /**
     * Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 
     * Get own user
     */
    public getOwnUser(_options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.getOwnUser(_options);
        return result.toPromise();
    }

    /**
     * Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
     * Get a user
     * @param userId The target user&#39;s ID. 
     * @param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. 
     * @param includeCustomProfileFields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
     */
    public getUser(userId: number, clientGravatar?: boolean, includeCustomProfileFields?: boolean, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.getUser(userId, clientGravatar, includeCustomProfileFields, _options);
        return result.toPromise();
    }

    /**
     * Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
     * Get a user by email
     * @param email The email address of the user whose details you want to fetch. 
     * @param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. 
     * @param includeCustomProfileFields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
     */
    public getUserByEmail(email: string, clientGravatar?: boolean, includeCustomProfileFields?: boolean, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.getUserByEmail(email, clientGravatar, includeCustomProfileFields, _options);
        return result.toPromise();
    }

    /**
     * {!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 
     * Get user groups
     */
    public getUserGroups(_options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.getUserGroups(_options);
        return result.toPromise();
    }

    /**
     * Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
     * Get user presence
     * @param userIdOrEmail The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. 
     */
    public getUserPresence(userIdOrEmail: string, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.getUserPresence(userIdOrEmail, _options);
        return result.toPromise();
    }

    /**
     * Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 
     * Get all users
     * @param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. 
     * @param includeCustomProfileFields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
     */
    public getUsers(clientGravatar?: boolean, includeCustomProfileFields?: boolean, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.getUsers(clientGravatar, includeCustomProfileFields, _options);
        return result.toPromise();
    }

    /**
     * This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
     * Mute a user
     * @param mutedUserId The ID of the user to mute/un-mute. 
     */
    public muteUser(mutedUserId: number, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.muteUser(mutedUserId, _options);
        return result.toPromise();
    }

    /**
     * [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 
     * Reactivate a user
     * @param userId The target user&#39;s ID. 
     */
    public reactivateUser(userId: number, _options?: Configuration): Promise<AnyType> {
        const result = this.api.reactivateUser(userId, _options);
        return result.toPromise();
    }

    /**
     * Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 
     * Delete a user group
     * @param userGroupId The ID of the target user group. 
     */
    public removeUserGroup(userGroupId: number, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.removeUserGroup(userGroupId, _options);
        return result.toPromise();
    }

    /**
     * Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 
     * Set \"typing\" status
     * @param op Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type. 
     * @param to For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). 
     * @param type Type of the message being composed. 
     * @param topic Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type. 
     */
    public setTypingStatus(op: 'start' | 'stop', to: Array<number>, type?: 'private' | 'stream', topic?: string, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.setTypingStatus(op, to, type, topic, _options);
        return result.toPromise();
    }

    /**
     * This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 
     * Unmute a user
     * @param mutedUserId The ID of the user to mute/un-mute. 
     */
    public unmuteUser(mutedUserId: number, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.unmuteUser(mutedUserId, _options);
        return result.toPromise();
    }

    /**
     * This endpoint is used to edit the current user's settings.  `PATCH {{ api_url }}/v1/settings`  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the `full_name`, `email`, `old_password`, and `new_password` parameters. Notification settings were managed by `PATCH /settings/notifications`, and all other settings by `PATCH /settings/display`. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for `/settings` in Zulip 5.0 (feature level 78).  The `/settings/display` and `/settings/notifications` endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 
     * Update settings
     * @param fullName A new display name for the user. 
     * @param email Asks the server to initiate a confirmation sequence to change the user&#39;s email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address. 
     * @param oldPassword The user&#39;s old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the &#x60;new_password&#x60; parameter. 
     * @param newPassword The user&#39;s new Zulip password (or LDAP password, if LDAP authentication is in use).  The &#x60;old_password&#x60; parameter must be included in the request. 
     * @param twentyFourHourTime Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
     * @param denseMode This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
     * @param starredMessageCounts Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
     * @param fluidLayoutWidth Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
     * @param highContrastMode This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
     * @param colorScheme Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
     * @param enableDraftsSynchronization A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87). 
     * @param translateEmoticons Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
     * @param defaultLanguage What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). 
     * @param defaultView The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
     * @param leftSideUserlist Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
     * @param emojiset The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
     * @param demoteInactiveStreams Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
     * @param timezone The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
     * @param enableStreamDesktopNotifications Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param enableStreamEmailNotifications Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param enableStreamPushNotifications Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param enableStreamAudibleNotifications Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param notificationSound Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). 
     * @param enableDesktopNotifications Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param enableSounds Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param emailNotificationsBatchingPeriodSeconds The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82) 
     * @param enableOfflineEmailNotifications Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param enableOfflinePushNotifications Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param enableOnlinePushNotifications Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param enableDigestEmails Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param enableMarketingEmails Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param enableLoginEmails Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param messageContentInEmailNotifications Include the message&#39;s content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param pmContentInDesktopNotifications Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param wildcardMentionsNotify Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param desktopIconCountDisplay Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param realmNameInNotifications Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param presenceEnabled Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param enterSends Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the &#x60;POST /users/me/enter-sends&#x60; endpoint, with the same parameter format. 
     */
    public updateSettings(fullName?: string, email?: string, oldPassword?: string, newPassword?: string, twentyFourHourTime?: boolean, denseMode?: boolean, starredMessageCounts?: boolean, fluidLayoutWidth?: boolean, highContrastMode?: boolean, colorScheme?: 1 | 2 | 3, enableDraftsSynchronization?: boolean, translateEmoticons?: boolean, defaultLanguage?: string, defaultView?: string, leftSideUserlist?: boolean, emojiset?: string, demoteInactiveStreams?: 1 | 2 | 3, timezone?: string, enableStreamDesktopNotifications?: boolean, enableStreamEmailNotifications?: boolean, enableStreamPushNotifications?: boolean, enableStreamAudibleNotifications?: boolean, notificationSound?: string, enableDesktopNotifications?: boolean, enableSounds?: boolean, emailNotificationsBatchingPeriodSeconds?: number, enableOfflineEmailNotifications?: boolean, enableOfflinePushNotifications?: boolean, enableOnlinePushNotifications?: boolean, enableDigestEmails?: boolean, enableMarketingEmails?: boolean, enableLoginEmails?: boolean, messageContentInEmailNotifications?: boolean, pmContentInDesktopNotifications?: boolean, wildcardMentionsNotify?: boolean, desktopIconCountDisplay?: 1 | 2 | 3, realmNameInNotifications?: boolean, presenceEnabled?: boolean, enterSends?: boolean, _options?: Configuration): Promise<JsonSuccessBase> {
        const result = this.api.updateSettings(fullName, email, oldPassword, newPassword, twentyFourHourTime, denseMode, starredMessageCounts, fluidLayoutWidth, highContrastMode, colorScheme, enableDraftsSynchronization, translateEmoticons, defaultLanguage, defaultView, leftSideUserlist, emojiset, demoteInactiveStreams, timezone, enableStreamDesktopNotifications, enableStreamEmailNotifications, enableStreamPushNotifications, enableStreamAudibleNotifications, notificationSound, enableDesktopNotifications, enableSounds, emailNotificationsBatchingPeriodSeconds, enableOfflineEmailNotifications, enableOfflinePushNotifications, enableOnlinePushNotifications, enableDigestEmails, enableMarketingEmails, enableLoginEmails, messageContentInEmailNotifications, pmContentInDesktopNotifications, wildcardMentionsNotify, desktopIconCountDisplay, realmNameInNotifications, presenceEnabled, enterSends, _options);
        return result.toPromise();
    }

    /**
     * Change your [status](/help/status-and-availability).  `POST {{ api_url }}/v1/users/me/status`  A request to this endpoint will only change the parameters passed. For example, passing just `status_text` requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user's status to a specific value should pass all supported parameters. 
     * Update your status
     * @param statusText The text content of the status message. Sending the empty string will clear the user&#39;s status.  **Note**: The limit on the size of the message is 60 characters. 
     * @param away Whether the user should be marked as \&quot;away\&quot;. 
     * @param emojiName The name for the emoji to associate with this status. 
     * @param emojiCode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji. 
     * @param reactionType One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji. 
     */
    public updateStatus(statusText?: string, away?: boolean, emojiName?: string, emojiCode?: string, reactionType?: string, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.updateStatus(statusText, away, emojiName, emojiCode, reactionType, _options);
        return result.toPromise();
    }

    /**
     * Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
     * Update a user
     * @param userId The target user&#39;s ID. 
     * @param fullName The user&#39;s full name. 
     * @param role New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). 
     * @param profileData A dictionary containing the to be updated custom profile field data for the user. 
     */
    public updateUser(userId: number, fullName?: string, role?: number, profileData?: Array<any>, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.updateUser(userId, fullName, role, profileData, _options);
        return result.toPromise();
    }

    /**
     * Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 
     * Update a user group
     * @param userGroupId The ID of the target user group. 
     * @param name The new name of the group. 
     * @param description The new description of the group. 
     */
    public updateUserGroup(userGroupId: number, name: string, description: string, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.updateUserGroup(userGroupId, name, description, _options);
        return result.toPromise();
    }

    /**
     * Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 
     * Update user group members
     * @param userGroupId The ID of the target user group. 
     * @param _delete The list of user ids to be removed from the user group. 
     * @param add The list of user ids to be added to the user group. 
     */
    public updateUserGroupMembers(userGroupId: number, _delete?: Array<number>, add?: Array<number>, _options?: Configuration): Promise<JsonSuccess> {
        const result = this.api.updateUserGroupMembers(userGroupId, _delete, add, _options);
        return result.toPromise();
    }


}



import { ObservableWebhooksApi } from './ObservableAPI';

import { WebhooksApiRequestFactory, WebhooksApiResponseProcessor} from "../apis/WebhooksApi";
export class PromiseWebhooksApi {
    private api: ObservableWebhooksApi

    public constructor(
        configuration: Configuration,
        requestFactory?: WebhooksApiRequestFactory,
        responseProcessor?: WebhooksApiResponseProcessor
    ) {
        this.api = new ObservableWebhooksApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
     * Outgoing webhooks
     */
    public zulipOutgoingWebhooks(_options?: Configuration): Promise<InlineResponse200> {
        const result = this.api.zulipOutgoingWebhooks(_options);
        return result.toPromise();
    }


}



