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
import { EmojiReaction } from '../models/EmojiReaction';
import { EmojiReactionAllOf } from '../models/EmojiReactionAllOf';
import { EmojiReactionBase } from '../models/EmojiReactionBase';
import { EmojiReactionBaseUser } from '../models/EmojiReactionBaseUser';
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

import { ObservableAuthenticationApi } from "./ObservableAPI";
import { AuthenticationApiRequestFactory, AuthenticationApiResponseProcessor} from "../apis/AuthenticationApi";

export interface AuthenticationApiDevFetchApiKeyRequest {
    /**
     * The email address for the user that owns the API key. 
     * @type string
     * @memberof AuthenticationApidevFetchApiKey
     */
    username: string
}

export interface AuthenticationApiFetchApiKeyRequest {
    /**
     * The username to be used for authentication (typically, the email address, but depending on configuration, it could be an LDAP username).  See the &#x60;require_email_format_usernames&#x60; parameter documented in [GET /server_settings](/api/get-server-settings) for details. 
     * @type string
     * @memberof AuthenticationApifetchApiKey
     */
    username: string
    /**
     * The user&#39;s Zulip password (or LDAP password, if LDAP authentication is in use). 
     * @type string
     * @memberof AuthenticationApifetchApiKey
     */
    password: string
}

export class ObjectAuthenticationApi {
    private api: ObservableAuthenticationApi

    public constructor(configuration: Configuration, requestFactory?: AuthenticationApiRequestFactory, responseProcessor?: AuthenticationApiResponseProcessor) {
        this.api = new ObservableAuthenticationApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * For easy testing of mobile apps and other clients and against Zulip development servers, we support fetching a Zulip API key for any user on the development server without authentication (so that they can implement analogues of the one-click login process available for Zulip development servers on the web).  **Note:** This endpoint is only available on Zulip development servers; for obvious security reasons it will always return an error in a Zulip production server.  `POST {{ api_url }}/v1/dev_fetch_api_key` 
     * Fetch an API key (development only)
     * @param param the request object
     */
    public devFetchApiKey(param: AuthenticationApiDevFetchApiKeyRequest, options?: Configuration): Promise<ApiKeyResponse> {
        return this.api.devFetchApiKey(param.username,  options).toPromise();
    }

    /**
     * This API endpoint is used by clients such as the Zulip mobile and terminal apps to implement password-based authentication.  Given the user's Zulip login credentials, it returns a Zulip API key that the client can use to make requests requests as the user.  This endpoint is only useful for Zulip servers/organizations with EmailAuthBackend or LDAPAuthBackend enabled.  The Zulip mobile apps also support SSO/social authentication (GitHub auth, Google auth, SAML, etc.) that does not use this endpoint.  Instead, the mobile apps reuse the web login flow passing the `mobile_flow_otp` in a webview, and the credentials are returned to the app (encrypted) via a redirect to a `zulip://` URL.  !!! warn \"\"     **Note:** If you signed up using passwordless authentication and     never had a password, you can [reset your password](/help/change-your-password).      See the [API keys](/api/api-keys) documentation for     more details on how to download API key manually.  In a [Zulip development environment](https://zulip.readthedocs.io/en/latest/development/overview.html), see also [the unauthenticated variant](/api/dev-fetch-api-key). 
     * Fetch an API key (production)
     * @param param the request object
     */
    public fetchApiKey(param: AuthenticationApiFetchApiKeyRequest, options?: Configuration): Promise<ApiKeyResponse> {
        return this.api.fetchApiKey(param.username, param.password,  options).toPromise();
    }

}

import { ObservableMessagesApi } from "./ObservableAPI";
import { MessagesApiRequestFactory, MessagesApiResponseProcessor} from "../apis/MessagesApi";

export interface MessagesApiAddReactionRequest {
    /**
     * The target message&#39;s ID. 
     * @type number
     * @memberof MessagesApiaddReaction
     */
    messageId: number
    /**
     * The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name. 
     * @type string
     * @memberof MessagesApiaddReaction
     */
    emojiName: string
    /**
     * A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji. 
     * @type string
     * @memberof MessagesApiaddReaction
     */
    emojiCode?: string
    /**
     * If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified. 
     * @type string
     * @memberof MessagesApiaddReaction
     */
    reactionType?: string
}

export interface MessagesApiCheckMessagesMatchNarrowRequest {
    /**
     * List of IDs for the messages to check.
     * @type Array&lt;number&gt;
     * @memberof MessagesApicheckMessagesMatchNarrow
     */
    msgIds: Array<number>
    /**
     * A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).
     * @type Array&lt;any&gt;
     * @memberof MessagesApicheckMessagesMatchNarrow
     */
    narrow: Array<any>
}

export interface MessagesApiDeleteMessageRequest {
    /**
     * The target message&#39;s ID. 
     * @type number
     * @memberof MessagesApideleteMessage
     */
    messageId: number
}

export interface MessagesApiGetFileTemporaryUrlRequest {
    /**
     * The realm id. 
     * @type number
     * @memberof MessagesApigetFileTemporaryUrl
     */
    realmIdStr: number
    /**
     * Path to the URL. 
     * @type string
     * @memberof MessagesApigetFileTemporaryUrl
     */
    filename: string
}

export interface MessagesApiGetMessageHistoryRequest {
    /**
     * The target message&#39;s ID. 
     * @type number
     * @memberof MessagesApigetMessageHistory
     */
    messageId: number
}

export interface MessagesApiGetMessagesRequest {
    /**
     * The number of messages with IDs less than the anchor to retrieve. 
     * @type number
     * @memberof MessagesApigetMessages
     */
    numBefore: number
    /**
     * The number of messages with IDs greater than the anchor to retrieve. 
     * @type number
     * @memberof MessagesApigetMessages
     */
    numAfter: number
    /**
     * Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * &#x60;newest&#x60;: The most recent message. * &#x60;oldest&#x60;: The oldest message. * &#x60;first_unread&#x60;: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of &#x60;&#39;newest&#39;&#x60; and &#x60;&#39;oldest&#39;&#x60; are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   &#x60;first_unread&#x60; functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, &#x60;oldest&#x60; can be emulated with   &#x60;anchor&#x3D;0&#x60;, and &#x60;newest&#x60; with &#x60;anchor&#x3D;10000000000000000&#x60;   (that specific large value works around a bug in Zulip   2.1.x and older in the &#x60;found_newest&#x60; return value). 
     * @type string | number
     * @memberof MessagesApigetMessages
     */
    anchor?: string | number
    /**
     * The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow). 
     * @type Array&lt;any&gt;
     * @memberof MessagesApigetMessages
     */
    narrow?: Array<any>
    /**
     * Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. 
     * @type boolean
     * @memberof MessagesApigetMessages
     */
    clientGravatar?: boolean
    /**
     * If &#x60;true&#x60;, message content is returned in the rendered HTML format. If &#x60;false&#x60;, message content is returned in the raw Markdown-format text that user entered. 
     * @type boolean
     * @memberof MessagesApigetMessages
     */
    applyMarkdown?: boolean
    /**
     * Legacy way to specify &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the &#x60;anchor&#x60;.  Mutually exclusive with &#x60;anchor&#x60;.  **Changes**: Deprecated in Zulip 3.0, replaced by &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; instead. 
     * @type boolean
     * @memberof MessagesApigetMessages
     */
    useFirstUnreadAnchor?: boolean
}

export interface MessagesApiGetRawMessageRequest {
    /**
     * The target message&#39;s ID. 
     * @type number
     * @memberof MessagesApigetRawMessage
     */
    messageId: number
}

export interface MessagesApiMarkAllAsReadRequest {
}

export interface MessagesApiMarkStreamAsReadRequest {
    /**
     * The ID of the stream to access. 
     * @type number
     * @memberof MessagesApimarkStreamAsRead
     */
    streamId: number
}

export interface MessagesApiMarkTopicAsReadRequest {
    /**
     * The ID of the stream to access. 
     * @type number
     * @memberof MessagesApimarkTopicAsRead
     */
    streamId: number
    /**
     * The name of the topic whose messages should be marked as read. 
     * @type string
     * @memberof MessagesApimarkTopicAsRead
     */
    topicName: string
}

export interface MessagesApiRemoveReactionRequest {
    /**
     * The target message&#39;s ID. 
     * @type number
     * @memberof MessagesApiremoveReaction
     */
    messageId: number
    /**
     * The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name. 
     * @type string
     * @memberof MessagesApiremoveReaction
     */
    emojiName?: string
    /**
     * A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji. 
     * @type string
     * @memberof MessagesApiremoveReaction
     */
    emojiCode?: string
    /**
     * If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified. 
     * @type string
     * @memberof MessagesApiremoveReaction
     */
    reactionType?: string
}

export interface MessagesApiRenderMessageRequest {
    /**
     * The content of the message. Maximum message size of 10000 bytes. 
     * @type string
     * @memberof MessagesApirenderMessage
     */
    content: string
}

export interface MessagesApiSendMessageRequest {
    /**
     * The type of message to be sent. &#x60;private&#x60; for a private message and &#x60;stream&#x60; for a stream message. 
     * @type &#39;private&#39; | &#39;stream&#39;
     * @memberof MessagesApisendMessage
     */
    type: 'private' | 'stream'
    /**
     * For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. 
     * @type Array&lt;number&gt;
     * @memberof MessagesApisendMessage
     */
    to: Array<number>
    /**
     * The content of the message. Maximum message size of 10000 bytes. 
     * @type string
     * @memberof MessagesApisendMessage
     */
    content: string
    /**
     * The topic of the message. Only required for stream messages (&#x60;type&#x3D;\&quot;stream\&quot;&#x60;), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias. 
     * @type string
     * @memberof MessagesApisendMessage
     */
    topic?: string
    /**
     * For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, &#x60;local_id&#x60; is required.  If the message is successfully sent, the server will include &#x60;local_id&#x60; in the &#x60;message&#x60; event that the client with this &#x60;queue_id&#x60; will receive notifying it of the new message via [&#x60;GET /events&#x60;](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device). 
     * @type string
     * @memberof MessagesApisendMessage
     */
    queueId?: string
    /**
     * For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the &#x60;queue_id&#x60; description. 
     * @type string
     * @memberof MessagesApisendMessage
     */
    localId?: string
}

export interface MessagesApiUpdateMessageRequest {
    /**
     * The target message&#39;s ID. 
     * @type number
     * @memberof MessagesApiupdateMessage
     */
    messageId: number
    /**
     * The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias. 
     * @type string
     * @memberof MessagesApiupdateMessage
     */
    topic?: string
    /**
     * Which message(s) should be edited: just the one indicated in &#x60;message_id&#x60;, messages in the same topic that had been sent after this one, or all of them.  Only the default value of &#x60;change_one&#x60; is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic. 
     * @type &#39;change_one&#39; | &#39;change_later&#39; | &#39;change_all&#39;
     * @memberof MessagesApiupdateMessage
     */
    propagateMode?: 'change_one' | 'change_later' | 'change_all'
    /**
     * Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9). 
     * @type boolean
     * @memberof MessagesApiupdateMessage
     */
    sendNotificationToOldThread?: boolean
    /**
     * Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9). 
     * @type boolean
     * @memberof MessagesApiupdateMessage
     */
    sendNotificationToNewThread?: boolean
    /**
     * The content of the message. Maximum message size of 10000 bytes. 
     * @type string
     * @memberof MessagesApiupdateMessage
     */
    content?: string
    /**
     * The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message. 
     * @type number
     * @memberof MessagesApiupdateMessage
     */
    streamId?: number
}

export interface MessagesApiUpdateMessageFlagsRequest {
    /**
     * An array containing the IDs of the target messages. 
     * @type Array&lt;number&gt;
     * @memberof MessagesApiupdateMessageFlags
     */
    messages: Array<number>
    /**
     * Whether to &#x60;add&#x60; the flag or &#x60;remove&#x60; it. 
     * @type &#39;add&#39; | &#39;remove&#39;
     * @memberof MessagesApiupdateMessageFlags
     */
    op: 'add' | 'remove'
    /**
     * The flag that should be added/removed. 
     * @type string
     * @memberof MessagesApiupdateMessageFlags
     */
    flag: string
}

export interface MessagesApiUploadFileRequest {
    /**
     * 
     * @type HttpFile
     * @memberof MessagesApiuploadFile
     */
    filename?: HttpFile
}

export class ObjectMessagesApi {
    private api: ObservableMessagesApi

    public constructor(configuration: Configuration, requestFactory?: MessagesApiRequestFactory, responseProcessor?: MessagesApiResponseProcessor) {
        this.api = new ObservableMessagesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` 
     * Add an emoji reaction
     * @param param the request object
     */
    public addReaction(param: MessagesApiAddReactionRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.addReaction(param.messageId, param.emojiName, param.emojiCode, param.reactionType,  options).toPromise();
    }

    /**
     * Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. 
     * Check if messages match a narrow
     * @param param the request object
     */
    public checkMessagesMatchNarrow(param: MessagesApiCheckMessagesMatchNarrowRequest, options?: Configuration): Promise<AnyType> {
        return this.api.checkMessagesMatchNarrow(param.msgIds, param.narrow,  options).toPromise();
    }

    /**
     * Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
     * Delete a message
     * @param param the request object
     */
    public deleteMessage(param: MessagesApiDeleteMessageRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.deleteMessage(param.messageId,  options).toPromise();
    }

    /**
     * Get a temporary URL for access to the file that doesn't require authentication. 
     * Get public temporary URL
     * @param param the request object
     */
    public getFileTemporaryUrl(param: MessagesApiGetFileTemporaryUrlRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.getFileTemporaryUrl(param.realmIdStr, param.filename,  options).toPromise();
    }

    /**
     * Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
     * Get a message's edit history
     * @param param the request object
     */
    public getMessageHistory(param: MessagesApiGetMessageHistoryRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.getMessageHistory(param.messageId,  options).toPromise();
    }

    /**
     * Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
     * Get messages
     * @param param the request object
     */
    public getMessages(param: MessagesApiGetMessagesRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.getMessages(param.numBefore, param.numAfter, param.anchor, param.narrow, param.clientGravatar, param.applyMarkdown, param.useFirstUnreadAnchor,  options).toPromise();
    }

    /**
     * Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). 
     * Get a message's raw Markdown
     * @param param the request object
     */
    public getRawMessage(param: MessagesApiGetRawMessageRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.getRawMessage(param.messageId,  options).toPromise();
    }

    /**
     * Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` 
     * Mark all messages as read
     * @param param the request object
     */
    public markAllAsRead(param: MessagesApiMarkAllAsReadRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.markAllAsRead( options).toPromise();
    }

    /**
     * Mark all the unread messages in a stream as read. 
     * Mark messages in a stream as read
     * @param param the request object
     */
    public markStreamAsRead(param: MessagesApiMarkStreamAsReadRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.markStreamAsRead(param.streamId,  options).toPromise();
    }

    /**
     * Mark all the unread messages in a topic as read. 
     * Mark messages in a topic as read
     * @param param the request object
     */
    public markTopicAsRead(param: MessagesApiMarkTopicAsReadRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.markTopicAsRead(param.streamId, param.topicName,  options).toPromise();
    }

    /**
     * Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` 
     * Remove an emoji reaction
     * @param param the request object
     */
    public removeReaction(param: MessagesApiRemoveReactionRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.removeReaction(param.messageId, param.emojiName, param.emojiCode, param.reactionType,  options).toPromise();
    }

    /**
     * Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` 
     * Render message
     * @param param the request object
     */
    public renderMessage(param: MessagesApiRenderMessageRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.renderMessage(param.content,  options).toPromise();
    }

    /**
     * Send a stream or a private message.  `POST {{ api_url }}/v1/messages` 
     * Send a message
     * @param param the request object
     */
    public sendMessage(param: MessagesApiSendMessageRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.sendMessage(param.type, param.to, param.content, param.topic, param.queueId, param.localId,  options).toPromise();
    }

    /**
     * Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
     * Edit a message
     * @param param the request object
     */
    public updateMessage(param: MessagesApiUpdateMessageRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.updateMessage(param.messageId, param.topic, param.propagateMode, param.sendNotificationToOldThread, param.sendNotificationToNewThread, param.content, param.streamId,  options).toPromise();
    }

    /**
     * Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
     * Update personal message flags
     * @param param the request object
     */
    public updateMessageFlags(param: MessagesApiUpdateMessageFlagsRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.updateMessageFlags(param.messages, param.op, param.flag,  options).toPromise();
    }

    /**
     * Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
     * Upload a file
     * @param param the request object
     */
    public uploadFile(param: MessagesApiUploadFileRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.uploadFile(param.filename,  options).toPromise();
    }

}

import { ObservableRealTimeEventsApi } from "./ObservableAPI";
import { RealTimeEventsApiRequestFactory, RealTimeEventsApiResponseProcessor} from "../apis/RealTimeEventsApi";

export interface RealTimeEventsApiDeleteQueueRequest {
    /**
     * The ID of an event queue that was previously registered via &#x60;POST /api/v1/register&#x60; (see [Register a queue](/api/register-queue)). 
     * @type string
     * @memberof RealTimeEventsApideleteQueue
     */
    queueId: string
}

export interface RealTimeEventsApiGetEventsRequest {
    /**
     * The ID of an event queue that was previously registered via &#x60;POST /api/v1/register&#x60; (see [Register a queue](/api/register-queue)). 
     * @type string
     * @memberof RealTimeEventsApigetEvents
     */
    queueId: string
    /**
     * The highest event ID in this queue that you&#39;ve received and wish to acknowledge. See the [code for &#x60;call_on_each_event&#x60;](https://github.com/zulip/python-zulip-api/blob/master/zulip/zulip/__init__.py) in the [zulip Python module](https://github.com/zulip/python-zulip-api) for an example implementation of correctly processing each event exactly once. 
     * @type number
     * @memberof RealTimeEventsApigetEvents
     */
    lastEventId?: number
    /**
     * Set to &#x60;true&#x60; if the client is requesting a nonblocking reply. If not specified, the request will block until either a new event is available or a few minutes have passed, in which case the server will send the client a heartbeat event. 
     * @type boolean
     * @memberof RealTimeEventsApigetEvents
     */
    dontBlock?: boolean
}

export interface RealTimeEventsApiRealTimePostRequest {
    /**
     * A JSON-encoded array indicating which types of events you&#39;re interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: &#x60;event_types&#x3D;[&#39;message&#39;]&#x60;  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
     * @type Array&lt;string&gt;
     * @memberof RealTimeEventsApirealTimePost
     */
    eventTypes?: Array<string>
    /**
     * A JSON-encoded array of arrays of length 2 indicating the narrow for which you&#39;d like to receive events for. For instance, to receive events for the stream &#x60;Denmark&#x60;, you would specify &#x60;narrow&#x3D;[[&#39;stream&#39;, &#39;Denmark&#39;]]&#x60;.  Another example is &#x60;narrow&#x3D;[[&#39;is&#39;, &#39;private&#39;]]&#x60; for private messages. Default is &#x60;[]&#x60;. 
     * @type Array&lt;Array&lt;string&gt;&gt;
     * @memberof RealTimeEventsApirealTimePost
     */
    narrow?: Array<Array<string>>
    /**
     * Whether you would like to request message events from all public streams.  Useful for workflow bots that you&#39;d like to see all new messages sent to public streams.  (You can also subscribe the user to private streams). 
     * @type boolean
     * @memberof RealTimeEventsApirealTimePost
     */
    allPublicStreams?: boolean
}

export interface RealTimeEventsApiRegisterQueueRequest {
    /**
     * Set to &#x60;true&#x60; if you would like the content to be rendered in HTML format (otherwise the API will return the raw text that the user entered) 
     * @type boolean
     * @memberof RealTimeEventsApiregisterQueue
     */
    applyMarkdown?: boolean
    /**
     * Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. 
     * @type boolean
     * @memberof RealTimeEventsApiregisterQueue
     */
    clientGravatar?: boolean
    /**
     * Setting this to &#x60;true&#x60; will make presence dictionaries be keyed by user_id instead of email.  **Changes**: New in Zulip 3.0 (Unstable with no feature level yet). 
     * @type boolean
     * @memberof RealTimeEventsApiregisterQueue
     */
    slimPresence?: boolean
    /**
     * A JSON-encoded array indicating which types of events you&#39;re interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: &#x60;event_types&#x3D;[&#39;message&#39;]&#x60;  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
     * @type Array&lt;string&gt;
     * @memberof RealTimeEventsApiregisterQueue
     */
    eventTypes?: Array<string>
    /**
     * Whether you would like to request message events from all public streams.  Useful for workflow bots that you&#39;d like to see all new messages sent to public streams.  (You can also subscribe the user to private streams). 
     * @type boolean
     * @memberof RealTimeEventsApiregisterQueue
     */
    allPublicStreams?: boolean
    /**
     * Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 
     * @type boolean
     * @memberof RealTimeEventsApiregisterQueue
     */
    includeSubscribers?: boolean
    /**
     * Dictionary containing details on features the client supports that are relevant to the format of responses sent by the server.  * &#x60;notification_settings_null&#x60;: Boolean for whether the   client can handle the current API with null values for   stream-level notification settings (which means the stream   is not customized and should inherit the user&#39;s global   notification settings for stream messages).  New in Zulip   2.1.0; in earlier Zulip releases, stream-level   notification settings were simple booleans.  * &#x60;bulk_message_deletion&#x60;: Boolean for whether the client&#39;s    handler for the &#x60;delete_message&#x60; event type has been    updated to process the new bulk format (with a    &#x60;message_ids&#x60;, rather than a singleton &#x60;message_id&#x60;).    Otherwise, the server will send &#x60;delete_message&#x60; events    in a loop.  New in Zulip 3.0 (feature level 13).  This    capability is for backwards-compatibility; it will be    required in a future server release.  * &#x60;user_avatar_url_field_optional&#x60;: Boolean for whether the    client required avatar URLs for all users, or supports    using &#x60;GET /avatar/{user_id}&#x60; to access user avatars.  If the    client has this capability, the server may skip sending a    &#x60;avatar_url&#x60; field in the &#x60;realm_user&#x60; at its sole discretion    to optimize network performance.  This is an important optimization    in organizations with 10,000s of users.    New in Zulip 3.0 (feature level 18).  * &#x60;stream_typing_notifications&#x60;: Boolean for whether the client   supports stream typing notifications.    New in Zulip 4.0 (feature level 58).  This capability is   for backwards-compatibility; it will be required in a   future server release. 
     * @type any
     * @memberof RealTimeEventsApiregisterQueue
     */
    clientCapabilities?: any
    /**
     * Same as the &#x60;event_types&#x60; parameter except that the values in &#x60;fetch_event_types&#x60; are used to fetch initial data. If &#x60;fetch_event_types&#x60; is not provided, &#x60;event_types&#x60; is used and if &#x60;event_types&#x60; is not provided, this parameter defaults to &#x60;None&#x60;.  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
     * @type Array&lt;string&gt;
     * @memberof RealTimeEventsApiregisterQueue
     */
    fetchEventTypes?: Array<string>
    /**
     * A JSON-encoded array of arrays of length 2 indicating the narrow for which you&#39;d like to receive events for. For instance, to receive events for the stream &#x60;Denmark&#x60;, you would specify &#x60;narrow&#x3D;[[&#39;stream&#39;, &#39;Denmark&#39;]]&#x60;.  Another example is &#x60;narrow&#x3D;[[&#39;is&#39;, &#39;private&#39;]]&#x60; for private messages. Default is &#x60;[]&#x60;. 
     * @type Array&lt;Array&lt;string&gt;&gt;
     * @memberof RealTimeEventsApiregisterQueue
     */
    narrow?: Array<Array<string>>
}

export interface RealTimeEventsApiRestErrorHandlingRequest {
}

export class ObjectRealTimeEventsApi {
    private api: ObservableRealTimeEventsApi

    public constructor(configuration: Configuration, requestFactory?: RealTimeEventsApiRequestFactory, responseProcessor?: RealTimeEventsApiResponseProcessor) {
        this.api = new ObservableRealTimeEventsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Delete a previously registered queue.  `DELETE {{ api_url }}/v1/events` 
     * Delete an event queue
     * @param param the request object
     */
    public deleteQueue(param: RealTimeEventsApiDeleteQueueRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.deleteQueue(param.queueId,  options).toPromise();
    }

    /**
     * `GET {{ api_url }}/v1/events`  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the `event_queue_longpoll_timeout_seconds` property returned by `POST /register` as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases. 
     * Get events from an event queue
     * @param param the request object
     */
    public getEvents(param: RealTimeEventsApiGetEventsRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.getEvents(param.queueId, param.lastEventId, param.dontBlock,  options).toPromise();
    }

    /**
     * (Ignored) 
     * @param param the request object
     */
    public realTimePost(param: RealTimeEventsApiRealTimePostRequest, options?: Configuration): Promise<void> {
        return this.api.realTimePost(param.eventTypes, param.narrow, param.allPublicStreams,  options).toPromise();
    }

    /**
     * `POST {{ api_url }}/v1/register`  This powerful endpoint can be used to register a Zulip \"event queue\" (subscribed to certain types of \"events\", or updates to the messages and other Zulip data the current user has access to), as well as to fetch the current state of that data.  (`register` also powers the `call_on_each_event` Python API, and is intended primarily for complex applications for which the more convenient `call_on_each_event` API is insufficient).  This endpoint returns a `queue_id` and a `last_event_id`; these can be used in subsequent calls to the [\"events\" endpoint](/api/get-events) to request events from the Zulip server using long-polling.  The server will queue events for up to 10 minutes of inactivity. After 10 minutes, your event queue will be garbage-collected.  The server will send `heartbeat` events every minute, which makes it easy to implement a robust client that does not miss events unless the client loses network connectivity with the Zulip server for 10 minutes or longer.  Once the server garbage-collects your event queue, the server will [return an error](/api/get-events#bad_event_queue_id-errors) with a code of `BAD_EVENT_QUEUE_ID` if you try to fetch events from the event queue.  Your software will need to handle that error condition by re-initializing itself (e.g. this is what triggers your browser reloading the Zulip web app when your laptop comes back online after being offline for more than 10 minutes).  When prototyping with this API, we recommend first calling `register` with no `event_types` parameter to see all the available data from all supported event types.  Before using your client in production, you should set appropriate `event_types` and `fetch_event_types` filters so that your client only requests the data it needs.  A few minutes doing this often saves 90% of the total bandwidth and other resources consumed by a client using this API.  See the [events system developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/events-system.html) if you need deeper details about how the Zulip event queue system works, avoids clients needing to worry about large classes of potentially messy races, etc. 
     * Register an event queue
     * @param param the request object
     */
    public registerQueue(param: RealTimeEventsApiRegisterQueueRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.registerQueue(param.applyMarkdown, param.clientGravatar, param.slimPresence, param.eventTypes, param.allPublicStreams, param.includeSubscribers, param.clientCapabilities, param.fetchEventTypes, param.narrow,  options).toPromise();
    }

    /**
     * Common error to many endpoints 
     * Error handling
     * @param param the request object
     */
    public restErrorHandling(param: RealTimeEventsApiRestErrorHandlingRequest, options?: Configuration): Promise<void> {
        return this.api.restErrorHandling( options).toPromise();
    }

}

import { ObservableServerAndOrganizationsApi } from "./ObservableAPI";
import { ServerAndOrganizationsApiRequestFactory, ServerAndOrganizationsApiResponseProcessor} from "../apis/ServerAndOrganizationsApi";

export interface ServerAndOrganizationsApiAddCodePlaygroundRequest {
    /**
     * The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. 
     * @type string
     * @memberof ServerAndOrganizationsApiaddCodePlayground
     */
    name: string
    /**
     * The name of the Pygments language lexer for that programming language. 
     * @type string
     * @memberof ServerAndOrganizationsApiaddCodePlayground
     */
    pygmentsLanguage: string
    /**
     * The url prefix for the playground. 
     * @type string
     * @memberof ServerAndOrganizationsApiaddCodePlayground
     */
    urlPrefix: string
}

export interface ServerAndOrganizationsApiAddLinkifierRequest {
    /**
     * The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
     * @type string
     * @memberof ServerAndOrganizationsApiaddLinkifier
     */
    pattern: string
    /**
     * The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. 
     * @type string
     * @memberof ServerAndOrganizationsApiaddLinkifier
     */
    urlFormatString: string
}

export interface ServerAndOrganizationsApiCreateCustomProfileFieldRequest {
    /**
     * The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
     * @type number
     * @memberof ServerAndOrganizationsApicreateCustomProfileField
     */
    fieldType: number
    /**
     * The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile. 
     * @type string
     * @memberof ServerAndOrganizationsApicreateCustomProfileField
     */
    name?: string
    /**
     * The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
     * @type string
     * @memberof ServerAndOrganizationsApicreateCustomProfileField
     */
    hint?: string
    /**
     * Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
     * @type any
     * @memberof ServerAndOrganizationsApicreateCustomProfileField
     */
    fieldData?: any
}

export interface ServerAndOrganizationsApiGetCustomEmojiRequest {
}

export interface ServerAndOrganizationsApiGetCustomProfileFieldsRequest {
}

export interface ServerAndOrganizationsApiGetLinkifiersRequest {
}

export interface ServerAndOrganizationsApiGetServerSettingsRequest {
}

export interface ServerAndOrganizationsApiRemoveCodePlaygroundRequest {
    /**
     * The ID of the playground that you want to remove. 
     * @type number
     * @memberof ServerAndOrganizationsApiremoveCodePlayground
     */
    playgroundId: number
}

export interface ServerAndOrganizationsApiRemoveLinkifierRequest {
    /**
     * The ID of the linkifier that you want to remove. 
     * @type number
     * @memberof ServerAndOrganizationsApiremoveLinkifier
     */
    filterId: number
}

export interface ServerAndOrganizationsApiReorderCustomProfileFieldsRequest {
    /**
     * A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. 
     * @type Array&lt;number&gt;
     * @memberof ServerAndOrganizationsApireorderCustomProfileFields
     */
    order: Array<number>
}

export interface ServerAndOrganizationsApiUpdateLinkifierRequest {
    /**
     * The ID of the linkifier that you want to update. 
     * @type number
     * @memberof ServerAndOrganizationsApiupdateLinkifier
     */
    filterId: number
    /**
     * The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
     * @type string
     * @memberof ServerAndOrganizationsApiupdateLinkifier
     */
    pattern: string
    /**
     * The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. 
     * @type string
     * @memberof ServerAndOrganizationsApiupdateLinkifier
     */
    urlFormatString: string
}

export interface ServerAndOrganizationsApiUploadCustomEmojiRequest {
    /**
     * The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). 
     * @type string
     * @memberof ServerAndOrganizationsApiuploadCustomEmoji
     */
    emojiName: string
    /**
     * 
     * @type HttpFile
     * @memberof ServerAndOrganizationsApiuploadCustomEmoji
     */
    filename?: HttpFile
}

export class ObjectServerAndOrganizationsApi {
    private api: ObservableServerAndOrganizationsApi

    public constructor(configuration: Configuration, requestFactory?: ServerAndOrganizationsApiRequestFactory, responseProcessor?: ServerAndOrganizationsApiResponseProcessor) {
        this.api = new ObservableServerAndOrganizationsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
     * Add a code playground
     * @param param the request object
     */
    public addCodePlayground(param: ServerAndOrganizationsApiAddCodePlaygroundRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.addCodePlayground(param.name, param.pygmentsLanguage, param.urlPrefix,  options).toPromise();
    }

    /**
     * Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 
     * Add a linkifier
     * @param param the request object
     */
    public addLinkifier(param: ServerAndOrganizationsApiAddLinkifierRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.addLinkifier(param.pattern, param.urlFormatString,  options).toPromise();
    }

    /**
     * [Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 
     * Create a custom profile field
     * @param param the request object
     */
    public createCustomProfileField(param: ServerAndOrganizationsApiCreateCustomProfileFieldRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.createCustomProfileField(param.fieldType, param.name, param.hint, param.fieldData,  options).toPromise();
    }

    /**
     * Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 
     * Get all custom emoji
     * @param param the request object
     */
    public getCustomEmoji(param: ServerAndOrganizationsApiGetCustomEmojiRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.getCustomEmoji( options).toPromise();
    }

    /**
     * Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 
     * Get all custom profile fields
     * @param param the request object
     */
    public getCustomProfileFields(param: ServerAndOrganizationsApiGetCustomProfileFieldsRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.getCustomProfileFields( options).toPromise();
    }

    /**
     * List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 
     * Get linkifiers
     * @param param the request object
     */
    public getLinkifiers(param: ServerAndOrganizationsApiGetLinkifiersRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.getLinkifiers( options).toPromise();
    }

    /**
     * Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
     * Get server settings
     * @param param the request object
     */
    public getServerSettings(param: ServerAndOrganizationsApiGetServerSettingsRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.getServerSettings( options).toPromise();
    }

    /**
     * Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 
     * Remove a code playground
     * @param param the request object
     */
    public removeCodePlayground(param: ServerAndOrganizationsApiRemoveCodePlaygroundRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.removeCodePlayground(param.playgroundId,  options).toPromise();
    }

    /**
     * Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 
     * Remove a linkifier
     * @param param the request object
     */
    public removeLinkifier(param: ServerAndOrganizationsApiRemoveLinkifierRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.removeLinkifier(param.filterId,  options).toPromise();
    }

    /**
     * Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
     * Reorder custom profile fields
     * @param param the request object
     */
    public reorderCustomProfileFields(param: ServerAndOrganizationsApiReorderCustomProfileFieldsRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.reorderCustomProfileFields(param.order,  options).toPromise();
    }

    /**
     * Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 
     * Update a linkifier
     * @param param the request object
     */
    public updateLinkifier(param: ServerAndOrganizationsApiUpdateLinkifierRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.updateLinkifier(param.filterId, param.pattern, param.urlFormatString,  options).toPromise();
    }

    /**
     * This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 
     * Upload custom emoji
     * @param param the request object
     */
    public uploadCustomEmoji(param: ServerAndOrganizationsApiUploadCustomEmojiRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.uploadCustomEmoji(param.emojiName, param.filename,  options).toPromise();
    }

}

import { ObservableStreamsApi } from "./ObservableAPI";
import { StreamsApiRequestFactory, StreamsApiResponseProcessor} from "../apis/StreamsApi";

export interface StreamsApiArchiveStreamRequest {
    /**
     * The ID of the stream to access. 
     * @type number
     * @memberof StreamsApiarchiveStream
     */
    streamId: number
}

export interface StreamsApiCreateBigBlueButtonVideoCallRequest {
}

export interface StreamsApiGetStreamIdRequest {
    /**
     * The name of the stream to access. 
     * @type string
     * @memberof StreamsApigetStreamId
     */
    stream: string
}

export interface StreamsApiGetStreamTopicsRequest {
    /**
     * The ID of the stream to access. 
     * @type number
     * @memberof StreamsApigetStreamTopics
     */
    streamId: number
}

export interface StreamsApiGetStreamsRequest {
    /**
     * Include all public streams. 
     * @type boolean
     * @memberof StreamsApigetStreams
     */
    includePublic?: boolean
    /**
     * Include all web public streams. 
     * @type boolean
     * @memberof StreamsApigetStreams
     */
    includeWebPublic?: boolean
    /**
     * Include all streams that the user is subscribed to. 
     * @type boolean
     * @memberof StreamsApigetStreams
     */
    includeSubscribed?: boolean
    /**
     * Include all active streams. The user must have administrative privileges to use this parameter. 
     * @type boolean
     * @memberof StreamsApigetStreams
     */
    includeAllActive?: boolean
    /**
     * Include all default streams for the user&#39;s realm. 
     * @type boolean
     * @memberof StreamsApigetStreams
     */
    includeDefault?: boolean
    /**
     * If the user is a bot, include all streams that the bot&#39;s owner is subscribed to. 
     * @type boolean
     * @memberof StreamsApigetStreams
     */
    includeOwnerSubscribed?: boolean
}

export interface StreamsApiGetSubscriptionStatusRequest {
    /**
     * The target user&#39;s ID. 
     * @type number
     * @memberof StreamsApigetSubscriptionStatus
     */
    userId: number
    /**
     * The ID of the stream to access. 
     * @type number
     * @memberof StreamsApigetSubscriptionStatus
     */
    streamId: number
}

export interface StreamsApiGetSubscriptionsRequest {
    /**
     * Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 
     * @type boolean
     * @memberof StreamsApigetSubscriptions
     */
    includeSubscribers?: boolean
}

export interface StreamsApiMuteTopicRequest {
    /**
     * The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
     * @type string
     * @memberof StreamsApimuteTopic
     */
    topic: string
    /**
     * Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic. 
     * @type &#39;add&#39; | &#39;remove&#39;
     * @memberof StreamsApimuteTopic
     */
    op: 'add' | 'remove'
    /**
     * The name of the stream to access. 
     * @type string
     * @memberof StreamsApimuteTopic
     */
    stream?: string
    /**
     * The ID of the stream to access. 
     * @type number
     * @memberof StreamsApimuteTopic
     */
    streamId?: number
}

export interface StreamsApiSubscribeRequest {
    /**
     * A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value. 
     * @type Array&lt;any&gt;
     * @memberof StreamsApisubscribe
     */
    subscriptions: Array<any>
    /**
     * A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
     * @type Array&lt;string | number&gt;
     * @memberof StreamsApisubscribe
     */
    principals?: Array<string | number>
    /**
     * A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key. 
     * @type boolean
     * @memberof StreamsApisubscribe
     */
    authorizationErrorsFatal?: boolean
    /**
     * If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation. 
     * @type boolean
     * @memberof StreamsApisubscribe
     */
    announce?: boolean
    /**
     * As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. 
     * @type boolean
     * @memberof StreamsApisubscribe
     */
    inviteOnly?: boolean
    /**
     * Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
     * @type boolean
     * @memberof StreamsApisubscribe
     */
    historyPublicToSubscribers?: boolean
    /**
     * Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. 
     * @type number
     * @memberof StreamsApisubscribe
     */
    streamPostPolicy?: number
    /**
     * Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
     * @type string | number
     * @memberof StreamsApisubscribe
     */
    messageRetentionDays?: string | number
}

export interface StreamsApiUnsubscribeRequest {
    /**
     * A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API. 
     * @type Array&lt;string&gt;
     * @memberof StreamsApiunsubscribe
     */
    subscriptions: Array<string>
    /**
     * A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
     * @type Array&lt;string | number&gt;
     * @memberof StreamsApiunsubscribe
     */
    principals?: Array<string | number>
}

export interface StreamsApiUpdateStreamRequest {
    /**
     * The ID of the stream to access. 
     * @type number
     * @memberof StreamsApiupdateStream
     */
    streamId: number
    /**
     * The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
     * @type string
     * @memberof StreamsApiupdateStream
     */
    description?: string
    /**
     * The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
     * @type string
     * @memberof StreamsApiupdateStream
     */
    newName?: string
    /**
     * Change whether the stream is a private stream. 
     * @type boolean
     * @memberof StreamsApiupdateStream
     */
    isPrivate?: boolean
    /**
     * Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead. 
     * @type boolean
     * @memberof StreamsApiupdateStream
     */
    isAnnouncementOnly?: boolean
    /**
     * Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. 
     * @type number
     * @memberof StreamsApiupdateStream
     */
    streamPostPolicy?: number
    /**
     * Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
     * @type boolean
     * @memberof StreamsApiupdateStream
     */
    historyPublicToSubscribers?: boolean
    /**
     * Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
     * @type string | number
     * @memberof StreamsApiupdateStream
     */
    messageRetentionDays?: string | number
}

export interface StreamsApiUpdateSubscriptionSettingsRequest {
    /**
     * A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream. 
     * @type Array&lt;any&gt;
     * @memberof StreamsApiupdateSubscriptionSettings
     */
    subscriptionData: Array<any>
}

export interface StreamsApiUpdateSubscriptionsRequest {
    /**
     * A list of stream names to unsubscribe from. 
     * @type Array&lt;string&gt;
     * @memberof StreamsApiupdateSubscriptions
     */
    _delete?: Array<string>
    /**
     * A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. 
     * @type Array&lt;any&gt;
     * @memberof StreamsApiupdateSubscriptions
     */
    add?: Array<any>
}

export class ObjectStreamsApi {
    private api: ObservableStreamsApi

    public constructor(configuration: Configuration, requestFactory?: StreamsApiRequestFactory, responseProcessor?: StreamsApiResponseProcessor) {
        this.api = new ObservableStreamsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 
     * Archive a stream
     * @param param the request object
     */
    public archiveStream(param: StreamsApiArchiveStreamRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.archiveStream(param.streamId,  options).toPromise();
    }

    /**
     * Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
     * Create BigBlueButton video call
     * @param param the request object
     */
    public createBigBlueButtonVideoCall(param: StreamsApiCreateBigBlueButtonVideoCallRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.createBigBlueButtonVideoCall( options).toPromise();
    }

    /**
     * Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 
     * Get stream ID
     * @param param the request object
     */
    public getStreamId(param: StreamsApiGetStreamIdRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.getStreamId(param.stream,  options).toPromise();
    }

    /**
     * Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 
     * Get topics in a stream
     * @param param the request object
     */
    public getStreamTopics(param: StreamsApiGetStreamTopicsRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.getStreamTopics(param.streamId,  options).toPromise();
    }

    /**
     * Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 
     * Get all streams
     * @param param the request object
     */
    public getStreams(param: StreamsApiGetStreamsRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.getStreams(param.includePublic, param.includeWebPublic, param.includeSubscribed, param.includeAllActive, param.includeDefault, param.includeOwnerSubscribed,  options).toPromise();
    }

    /**
     * Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 
     * Get subscription status
     * @param param the request object
     */
    public getSubscriptionStatus(param: StreamsApiGetSubscriptionStatusRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.getSubscriptionStatus(param.userId, param.streamId,  options).toPromise();
    }

    /**
     * Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 
     * Get subscribed streams
     * @param param the request object
     */
    public getSubscriptions(param: StreamsApiGetSubscriptionsRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.getSubscriptions(param.includeSubscribers,  options).toPromise();
    }

    /**
     * This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 
     * Topic muting
     * @param param the request object
     */
    public muteTopic(param: StreamsApiMuteTopicRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.muteTopic(param.topic, param.op, param.stream, param.streamId,  options).toPromise();
    }

    /**
     * Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 
     * Subscribe to a stream
     * @param param the request object
     */
    public subscribe(param: StreamsApiSubscribeRequest, options?: Configuration): Promise<AddSubscriptionsResponse> {
        return this.api.subscribe(param.subscriptions, param.principals, param.authorizationErrorsFatal, param.announce, param.inviteOnly, param.historyPublicToSubscribers, param.streamPostPolicy, param.messageRetentionDays,  options).toPromise();
    }

    /**
     * Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 
     * Unsubscribe from a stream
     * @param param the request object
     */
    public unsubscribe(param: StreamsApiUnsubscribeRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.unsubscribe(param.subscriptions, param.principals,  options).toPromise();
    }

    /**
     * Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 
     * Update a stream
     * @param param the request object
     */
    public updateStream(param: StreamsApiUpdateStreamRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.updateStream(param.streamId, param.description, param.newName, param.isPrivate, param.isAnnouncementOnly, param.streamPostPolicy, param.historyPublicToSubscribers, param.messageRetentionDays,  options).toPromise();
    }

    /**
     * This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 
     * Update subscription settings
     * @param param the request object
     */
    public updateSubscriptionSettings(param: StreamsApiUpdateSubscriptionSettingsRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.updateSubscriptionSettings(param.subscriptionData,  options).toPromise();
    }

    /**
     * Update which streams you are are subscribed to. 
     * Update subscriptions
     * @param param the request object
     */
    public updateSubscriptions(param: StreamsApiUpdateSubscriptionsRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.updateSubscriptions(param._delete, param.add,  options).toPromise();
    }

}

import { ObservableUsersApi } from "./ObservableAPI";
import { UsersApiRequestFactory, UsersApiResponseProcessor} from "../apis/UsersApi";

export interface UsersApiCreateUserRequest {
    /**
     * The email address of the new user. 
     * @type string
     * @memberof UsersApicreateUser
     */
    email: string
    /**
     * The password of the new user. 
     * @type string
     * @memberof UsersApicreateUser
     */
    password: string
    /**
     * The full name of the new user. 
     * @type string
     * @memberof UsersApicreateUser
     */
    fullName: string
}

export interface UsersApiCreateUserGroupRequest {
    /**
     * The name of the user group. 
     * @type string
     * @memberof UsersApicreateUserGroup
     */
    name: string
    /**
     * The description of the user group. 
     * @type string
     * @memberof UsersApicreateUserGroup
     */
    description: string
    /**
     * An array containing the user IDs of the initial members for the new user group. 
     * @type Array&lt;number&gt;
     * @memberof UsersApicreateUserGroup
     */
    members: Array<number>
}

export interface UsersApiDeactivateOwnUserRequest {
}

export interface UsersApiDeactivateUserRequest {
    /**
     * The target user&#39;s ID. 
     * @type number
     * @memberof UsersApideactivateUser
     */
    userId: number
}

export interface UsersApiGetAttachmentsRequest {
}

export interface UsersApiGetOwnUserRequest {
}

export interface UsersApiGetUserRequest {
    /**
     * The target user&#39;s ID. 
     * @type number
     * @memberof UsersApigetUser
     */
    userId: number
    /**
     * Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. 
     * @type boolean
     * @memberof UsersApigetUser
     */
    clientGravatar?: boolean
    /**
     * Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
     * @type boolean
     * @memberof UsersApigetUser
     */
    includeCustomProfileFields?: boolean
}

export interface UsersApiGetUserByEmailRequest {
    /**
     * The email address of the user whose details you want to fetch. 
     * @type string
     * @memberof UsersApigetUserByEmail
     */
    email: string
    /**
     * Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. 
     * @type boolean
     * @memberof UsersApigetUserByEmail
     */
    clientGravatar?: boolean
    /**
     * Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
     * @type boolean
     * @memberof UsersApigetUserByEmail
     */
    includeCustomProfileFields?: boolean
}

export interface UsersApiGetUserGroupsRequest {
}

export interface UsersApiGetUserPresenceRequest {
    /**
     * The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. 
     * @type string
     * @memberof UsersApigetUserPresence
     */
    userIdOrEmail: string
}

export interface UsersApiGetUsersRequest {
    /**
     * Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. 
     * @type boolean
     * @memberof UsersApigetUsers
     */
    clientGravatar?: boolean
    /**
     * Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
     * @type boolean
     * @memberof UsersApigetUsers
     */
    includeCustomProfileFields?: boolean
}

export interface UsersApiMuteUserRequest {
    /**
     * The ID of the user to mute/un-mute. 
     * @type number
     * @memberof UsersApimuteUser
     */
    mutedUserId: number
}

export interface UsersApiReactivateUserRequest {
    /**
     * The target user&#39;s ID. 
     * @type number
     * @memberof UsersApireactivateUser
     */
    userId: number
}

export interface UsersApiRemoveUserGroupRequest {
    /**
     * The ID of the target user group. 
     * @type number
     * @memberof UsersApiremoveUserGroup
     */
    userGroupId: number
}

export interface UsersApiSetTypingStatusRequest {
    /**
     * Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type. 
     * @type &#39;start&#39; | &#39;stop&#39;
     * @memberof UsersApisetTypingStatus
     */
    op: 'start' | 'stop'
    /**
     * For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). 
     * @type Array&lt;number&gt;
     * @memberof UsersApisetTypingStatus
     */
    to: Array<number>
    /**
     * Type of the message being composed. 
     * @type &#39;private&#39; | &#39;stream&#39;
     * @memberof UsersApisetTypingStatus
     */
    type?: 'private' | 'stream'
    /**
     * Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type. 
     * @type string
     * @memberof UsersApisetTypingStatus
     */
    topic?: string
}

export interface UsersApiUnmuteUserRequest {
    /**
     * The ID of the user to mute/un-mute. 
     * @type number
     * @memberof UsersApiunmuteUser
     */
    mutedUserId: number
}

export interface UsersApiUpdateDisplaySettingsRequest {
    /**
     * Whether time should be [displayed in 24-hour notation](/help/change-the-time-format). 
     * @type boolean
     * @memberof UsersApiupdateDisplaySettings
     */
    twentyFourHourTime?: boolean
    /**
     * This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip. 
     * @type boolean
     * @memberof UsersApiupdateDisplaySettings
     */
    denseMode?: boolean
    /**
     * Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages). 
     * @type boolean
     * @memberof UsersApiupdateDisplaySettings
     */
    starredMessageCounts?: boolean
    /**
     * Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens. 
     * @type boolean
     * @memberof UsersApiupdateDisplaySettings
     */
    fluidLayoutWidth?: boolean
    /**
     * This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users. 
     * @type boolean
     * @memberof UsersApiupdateDisplaySettings
     */
    highContrastMode?: boolean
    /**
     * Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query. 
     * @type 1 | 2 | 3
     * @memberof UsersApiupdateDisplaySettings
     */
    colorScheme?: 1 | 2 | 3
    /**
     * Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends. 
     * @type boolean
     * @memberof UsersApiupdateDisplaySettings
     */
    translateEmoticons?: boolean
    /**
     * What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). 
     * @type string
     * @memberof UsersApiupdateDisplaySettings
     */
    defaultLanguage?: string
    /**
     * The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
     * @type string
     * @memberof UsersApiupdateDisplaySettings
     */
    defaultView?: string
    /**
     * Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked. 
     * @type boolean
     * @memberof UsersApiupdateDisplaySettings
     */
    leftSideUserlist?: boolean
    /**
     * The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
     * @type string
     * @memberof UsersApiupdateDisplaySettings
     */
    emojiset?: string
    /**
     * Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never 
     * @type 1 | 2 | 3
     * @memberof UsersApiupdateDisplaySettings
     */
    demoteInactiveStreams?: 1 | 2 | 3
    /**
     * The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
     * @type string
     * @memberof UsersApiupdateDisplaySettings
     */
    timezone?: string
}

export interface UsersApiUpdateNotificationSettingsRequest {
    /**
     * Enable visual desktop notifications for stream messages. 
     * @type boolean
     * @memberof UsersApiupdateNotificationSettings
     */
    enableStreamDesktopNotifications?: boolean
    /**
     * Enable email notifications for stream messages. 
     * @type boolean
     * @memberof UsersApiupdateNotificationSettings
     */
    enableStreamEmailNotifications?: boolean
    /**
     * Enable mobile notifications for stream messages. 
     * @type boolean
     * @memberof UsersApiupdateNotificationSettings
     */
    enableStreamPushNotifications?: boolean
    /**
     * Enable audible desktop notifications for stream messages. 
     * @type boolean
     * @memberof UsersApiupdateNotificationSettings
     */
    enableStreamAudibleNotifications?: boolean
    /**
     * Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). 
     * @type string
     * @memberof UsersApiupdateNotificationSettings
     */
    notificationSound?: string
    /**
     * Enable visual desktop notifications for private messages and @-mentions. 
     * @type boolean
     * @memberof UsersApiupdateNotificationSettings
     */
    enableDesktopNotifications?: boolean
    /**
     * Enable audible desktop notifications for private messages and @-mentions. 
     * @type boolean
     * @memberof UsersApiupdateNotificationSettings
     */
    enableSounds?: boolean
    /**
     * Enable email notifications for private messages and @-mentions received when the user is offline. 
     * @type boolean
     * @memberof UsersApiupdateNotificationSettings
     */
    enableOfflineEmailNotifications?: boolean
    /**
     * Enable mobile notification for private messages and @-mentions received when the user is offline. 
     * @type boolean
     * @memberof UsersApiupdateNotificationSettings
     */
    enableOfflinePushNotifications?: boolean
    /**
     * Enable mobile notification for private messages and @-mentions received when the user is online. 
     * @type boolean
     * @memberof UsersApiupdateNotificationSettings
     */
    enableOnlinePushNotifications?: boolean
    /**
     * Enable digest emails when the user is away. 
     * @type boolean
     * @memberof UsersApiupdateNotificationSettings
     */
    enableDigestEmails?: boolean
    /**
     * Enable marketing emails. Has no function outside Zulip Cloud. 
     * @type boolean
     * @memberof UsersApiupdateNotificationSettings
     */
    enableMarketingEmails?: boolean
    /**
     * Enable email notifications for new logins to account. 
     * @type boolean
     * @memberof UsersApiupdateNotificationSettings
     */
    enableLoginEmails?: boolean
    /**
     * Include the message&#39;s content in email notifications for new messages. 
     * @type boolean
     * @memberof UsersApiupdateNotificationSettings
     */
    messageContentInEmailNotifications?: boolean
    /**
     * Include content of private messages in desktop notifications. 
     * @type boolean
     * @memberof UsersApiupdateNotificationSettings
     */
    pmContentInDesktopNotifications?: boolean
    /**
     * Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention. 
     * @type boolean
     * @memberof UsersApiupdateNotificationSettings
     */
    wildcardMentionsNotify?: boolean
    /**
     * Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None 
     * @type 1 | 2 | 3
     * @memberof UsersApiupdateNotificationSettings
     */
    desktopIconCountDisplay?: 1 | 2 | 3
    /**
     * Include organization name in subject of message notification emails. 
     * @type boolean
     * @memberof UsersApiupdateNotificationSettings
     */
    realmNameInNotifications?: boolean
    /**
     * Display the presence status to other users when online. 
     * @type boolean
     * @memberof UsersApiupdateNotificationSettings
     */
    presenceEnabled?: boolean
}

export interface UsersApiUpdateUserRequest {
    /**
     * The target user&#39;s ID. 
     * @type number
     * @memberof UsersApiupdateUser
     */
    userId: number
    /**
     * The user&#39;s full name. 
     * @type string
     * @memberof UsersApiupdateUser
     */
    fullName?: string
    /**
     * New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). 
     * @type number
     * @memberof UsersApiupdateUser
     */
    role?: number
    /**
     * A dictionary containing the to be updated custom profile field data for the user. 
     * @type Array&lt;any&gt;
     * @memberof UsersApiupdateUser
     */
    profileData?: Array<any>
}

export interface UsersApiUpdateUserGroupRequest {
    /**
     * The ID of the target user group. 
     * @type number
     * @memberof UsersApiupdateUserGroup
     */
    userGroupId: number
    /**
     * The new name of the group. 
     * @type string
     * @memberof UsersApiupdateUserGroup
     */
    name: string
    /**
     * The new description of the group. 
     * @type string
     * @memberof UsersApiupdateUserGroup
     */
    description: string
}

export interface UsersApiUpdateUserGroupMembersRequest {
    /**
     * The ID of the target user group. 
     * @type number
     * @memberof UsersApiupdateUserGroupMembers
     */
    userGroupId: number
    /**
     * The list of user ids to be removed from the user group. 
     * @type Array&lt;number&gt;
     * @memberof UsersApiupdateUserGroupMembers
     */
    _delete?: Array<number>
    /**
     * The list of user ids to be added to the user group. 
     * @type Array&lt;number&gt;
     * @memberof UsersApiupdateUserGroupMembers
     */
    add?: Array<number>
}

export class ObjectUsersApi {
    private api: ObservableUsersApi

    public constructor(configuration: Configuration, requestFactory?: UsersApiRequestFactory, responseProcessor?: UsersApiResponseProcessor) {
        this.api = new ObservableUsersApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * {!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 
     * Create a user
     * @param param the request object
     */
    public createUser(param: UsersApiCreateUserRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.createUser(param.email, param.password, param.fullName,  options).toPromise();
    }

    /**
     * Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 
     * Create a user group
     * @param param the request object
     */
    public createUserGroup(param: UsersApiCreateUserGroupRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.createUserGroup(param.name, param.description, param.members,  options).toPromise();
    }

    /**
     * Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
     * Deactivate own user
     * @param param the request object
     */
    public deactivateOwnUser(param: UsersApiDeactivateOwnUserRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.deactivateOwnUser( options).toPromise();
    }

    /**
     * [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 
     * Deactivate a user
     * @param param the request object
     */
    public deactivateUser(param: UsersApiDeactivateUserRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.deactivateUser(param.userId,  options).toPromise();
    }

    /**
     * Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 
     * Get attachments
     * @param param the request object
     */
    public getAttachments(param: UsersApiGetAttachmentsRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.getAttachments( options).toPromise();
    }

    /**
     * Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 
     * Get own user
     * @param param the request object
     */
    public getOwnUser(param: UsersApiGetOwnUserRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.getOwnUser( options).toPromise();
    }

    /**
     * Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
     * Get a user
     * @param param the request object
     */
    public getUser(param: UsersApiGetUserRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.getUser(param.userId, param.clientGravatar, param.includeCustomProfileFields,  options).toPromise();
    }

    /**
     * Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
     * Get a user by email
     * @param param the request object
     */
    public getUserByEmail(param: UsersApiGetUserByEmailRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.getUserByEmail(param.email, param.clientGravatar, param.includeCustomProfileFields,  options).toPromise();
    }

    /**
     * {!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 
     * Get user groups
     * @param param the request object
     */
    public getUserGroups(param: UsersApiGetUserGroupsRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.getUserGroups( options).toPromise();
    }

    /**
     * Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
     * Get user presence
     * @param param the request object
     */
    public getUserPresence(param: UsersApiGetUserPresenceRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.getUserPresence(param.userIdOrEmail,  options).toPromise();
    }

    /**
     * Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 
     * Get all users
     * @param param the request object
     */
    public getUsers(param: UsersApiGetUsersRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.getUsers(param.clientGravatar, param.includeCustomProfileFields,  options).toPromise();
    }

    /**
     * This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
     * Mute a user
     * @param param the request object
     */
    public muteUser(param: UsersApiMuteUserRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.muteUser(param.mutedUserId,  options).toPromise();
    }

    /**
     * [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 
     * Reactivate a user
     * @param param the request object
     */
    public reactivateUser(param: UsersApiReactivateUserRequest, options?: Configuration): Promise<AnyType> {
        return this.api.reactivateUser(param.userId,  options).toPromise();
    }

    /**
     * Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 
     * Delete a user group
     * @param param the request object
     */
    public removeUserGroup(param: UsersApiRemoveUserGroupRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.removeUserGroup(param.userGroupId,  options).toPromise();
    }

    /**
     * Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 
     * Set \"typing\" status
     * @param param the request object
     */
    public setTypingStatus(param: UsersApiSetTypingStatusRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.setTypingStatus(param.op, param.to, param.type, param.topic,  options).toPromise();
    }

    /**
     * This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 
     * Unmute a user
     * @param param the request object
     */
    public unmuteUser(param: UsersApiUnmuteUserRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.unmuteUser(param.mutedUserId,  options).toPromise();
    }

    /**
     * This endpoint is used to edit the current user's user interface settings.  `PATCH {{ api_url }}/v1/settings/display` 
     * Update display settings
     * @param param the request object
     */
    public updateDisplaySettings(param: UsersApiUpdateDisplaySettingsRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.updateDisplaySettings(param.twentyFourHourTime, param.denseMode, param.starredMessageCounts, param.fluidLayoutWidth, param.highContrastMode, param.colorScheme, param.translateEmoticons, param.defaultLanguage, param.defaultView, param.leftSideUserlist, param.emojiset, param.demoteInactiveStreams, param.timezone,  options).toPromise();
    }

    /**
     * This endpoint is used to edit the user's global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  `PATCH {{ api_url }}/v1/settings/notifications` 
     * Update notification settings
     * @param param the request object
     */
    public updateNotificationSettings(param: UsersApiUpdateNotificationSettingsRequest, options?: Configuration): Promise<JsonSuccessBase> {
        return this.api.updateNotificationSettings(param.enableStreamDesktopNotifications, param.enableStreamEmailNotifications, param.enableStreamPushNotifications, param.enableStreamAudibleNotifications, param.notificationSound, param.enableDesktopNotifications, param.enableSounds, param.enableOfflineEmailNotifications, param.enableOfflinePushNotifications, param.enableOnlinePushNotifications, param.enableDigestEmails, param.enableMarketingEmails, param.enableLoginEmails, param.messageContentInEmailNotifications, param.pmContentInDesktopNotifications, param.wildcardMentionsNotify, param.desktopIconCountDisplay, param.realmNameInNotifications, param.presenceEnabled,  options).toPromise();
    }

    /**
     * Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
     * Update a user
     * @param param the request object
     */
    public updateUser(param: UsersApiUpdateUserRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.updateUser(param.userId, param.fullName, param.role, param.profileData,  options).toPromise();
    }

    /**
     * Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 
     * Update a user group
     * @param param the request object
     */
    public updateUserGroup(param: UsersApiUpdateUserGroupRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.updateUserGroup(param.userGroupId, param.name, param.description,  options).toPromise();
    }

    /**
     * Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 
     * Update user group members
     * @param param the request object
     */
    public updateUserGroupMembers(param: UsersApiUpdateUserGroupMembersRequest, options?: Configuration): Promise<JsonSuccess> {
        return this.api.updateUserGroupMembers(param.userGroupId, param._delete, param.add,  options).toPromise();
    }

}

import { ObservableWebhooksApi } from "./ObservableAPI";
import { WebhooksApiRequestFactory, WebhooksApiResponseProcessor} from "../apis/WebhooksApi";

export interface WebhooksApiZulipOutgoingWebhooksRequest {
}

export class ObjectWebhooksApi {
    private api: ObservableWebhooksApi

    public constructor(configuration: Configuration, requestFactory?: WebhooksApiRequestFactory, responseProcessor?: WebhooksApiResponseProcessor) {
        this.api = new ObservableWebhooksApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
     * Outgoing webhooks
     * @param param the request object
     */
    public zulipOutgoingWebhooks(param: WebhooksApiZulipOutgoingWebhooksRequest, options?: Configuration): Promise<InlineResponse200> {
        return this.api.zulipOutgoingWebhooks( options).toPromise();
    }

}
