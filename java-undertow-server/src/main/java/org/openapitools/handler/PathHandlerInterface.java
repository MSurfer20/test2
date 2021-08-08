/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * OpenAPI document version: 1.0.0
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.handler;

import io.undertow.server.*;
import io.undertow.util.*;

import org.openapitools.model.*;

@SuppressWarnings("TooManyFunctions")
public interface PathHandlerInterface {

    /**
     * <p>Fetch an API key (development only)</p>
     *
     * <p>For easy testing of mobile apps and other clients and against Zulip development servers, we support fetching a Zulip API key for any user on the development server without authentication (so that they can implement analogues of the one-click login process available for Zulip development servers on the web).  **Note:** This endpoint is only available on Zulip development servers; for obvious security reasons it will always return an error in a Zulip production server.  `POST {{ api_url }}/v1/dev_fetch_api_key` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/dev_fetch_api_key" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>username</b>"
     * <p>The email address for the user that owns the API key. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ApiKeyResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler devFetchApiKey();

    /**
     * <p>Fetch an API key (production)</p>
     *
     * <p>This API endpoint is used by clients such as the Zulip mobile and terminal apps to implement password-based authentication.  Given the user's Zulip login credentials, it returns a Zulip API key that the client can use to make requests requests as the user.  This endpoint is only useful for Zulip servers/organizations with EmailAuthBackend or LDAPAuthBackend enabled.  The Zulip mobile apps also support SSO/social authentication (GitHub auth, Google auth, SAML, etc.) that does not use this endpoint.  Instead, the mobile apps reuse the web login flow passing the `mobile_flow_otp` in a webview, and the credentials are returned to the app (encrypted) via a redirect to a `zulip://` URL.  !!! warn \"\"     **Note:** If you signed up using passwordless authentication and     never had a password, you can [reset your password](/help/change-your-password).      See the [API keys](/api/api-keys) documentation for     more details on how to download API key manually.  In a [Zulip development environment](https://zulip.readthedocs.io/en/latest/development/overview.html), see also [the unauthenticated variant](/api/dev-fetch-api-key). </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/fetch_api_key" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>username</b>"
     * <p>The username to be used for authentication (typically, the email address, but depending on configuration, it could be an LDAP username).  See the `require_email_format_usernames` parameter documented in [GET /server_settings](/api/get-server-settings) for details. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>password</b>"
     * <p>The user's Zulip password (or LDAP password, if LDAP authentication is in use). </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ApiKeyResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Valid credentials the client can use to access the Zulip API.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler fetchApiKey();

    /**
     * <p>Add an emoji reaction</p>
     *
     * <p>Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/messages/{message_id}/reactions" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>message_id</b>"
     * <p>The target message's ID. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>emoji_name</b>"
     * <p>The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>emoji_code</b>"
     * <p>A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>reaction_type</b>"
     * <p>If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler addReaction();

    /**
     * <p>Check if messages match a narrow</p>
     *
     * <p>Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v1/messages/matches_narrow" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>msg_ids</b>"
     * <p>List of IDs for the messages to check.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;Integer&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>narrow</b>"
     * <p>A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;Object&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Object}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler checkMessagesMatchNarrow();

    /**
     * <p>Delete a message</p>
     *
     * <p>Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/api/v1/messages/{message_id}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>message_id</b>"
     * <p>The target message's ID. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deleteMessage();

    /**
     * <p>Get public temporary URL</p>
     *
     * <p>Get a temporary URL for access to the file that doesn't require authentication. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v1/user_uploads/{realm_id_str}/{filename}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>realm_id_str</b>"
     * <p>The realm id. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>filename</b>"
     * <p>Path to the URL. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getFileTemporaryUrl();

    /**
     * <p>Get a message's edit history</p>
     *
     * <p>Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v1/messages/{message_id}/history" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>message_id</b>"
     * <p>The target message's ID. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getMessageHistory();

    /**
     * <p>Get messages</p>
     *
     * <p>Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v1/messages" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>num_before</b>"
     * <p>The number of messages with IDs less than the anchor to retrieve. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>num_after</b>"
     * <p>The number of messages with IDs greater than the anchor to retrieve. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>anchor</b>"
     * <p>Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * `newest`: The most recent message. * `oldest`: The oldest message. * `first_unread`: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of `'newest'` and `'oldest'` are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   `first_unread` functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, `oldest` can be emulated with   `anchor=0`, and `newest` with `anchor=10000000000000000`   (that specific large value works around a bug in Zulip   2.1.x and older in the `found_newest` return value). </p>
     * <p>
     * - Parameter type: <b>{@link OneOfstringinteger}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>narrow</b>"
     * <p>The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow). </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;Object&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>[]</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>client_gravatar</b>"
     * <p>Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>apply_markdown</b>"
     * <p>If `true`, message content is returned in the rendered HTML format. If `false`, message content is returned in the raw Markdown-format text that user entered. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>true</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>use_first_unread_anchor</b>"
     * <p>Legacy way to specify `anchor=\"first_unread\"` in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the `anchor`.  Mutually exclusive with `anchor`.  **Changes**: Deprecated in Zulip 3.0, replaced by `anchor=\"first_unread\"` instead. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getMessages();

    /**
     * <p>Get a message's raw Markdown</p>
     *
     * <p>Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v1/messages/{message_id}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>message_id</b>"
     * <p>The target message's ID. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getRawMessage();

    /**
     * <p>Mark all messages as read</p>
     *
     * <p>Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/mark_all_as_read" (<i>privileged: false</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler markAllAsRead();

    /**
     * <p>Mark messages in a stream as read</p>
     *
     * <p>Mark all the unread messages in a stream as read. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/mark_stream_as_read" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>stream_id</b>"
     * <p>The ID of the stream to access. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler markStreamAsRead();

    /**
     * <p>Mark messages in a topic as read</p>
     *
     * <p>Mark all the unread messages in a topic as read. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/mark_topic_as_read" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>stream_id</b>"
     * <p>The ID of the stream to access. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>topic_name</b>"
     * <p>The name of the topic whose messages should be marked as read. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler markTopicAsRead();

    /**
     * <p>Remove an emoji reaction</p>
     *
     * <p>Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/api/v1/messages/{message_id}/reactions" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>message_id</b>"
     * <p>The target message's ID. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>emoji_name</b>"
     * <p>The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>emoji_code</b>"
     * <p>A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>reaction_type</b>"
     * <p>If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler removeReaction();

    /**
     * <p>Render message</p>
     *
     * <p>Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/messages/render" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>content</b>"
     * <p>The content of the message. Maximum message size of 10000 bytes. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler renderMessage();

    /**
     * <p>Send a message</p>
     *
     * <p>Send a stream or a private message.  `POST {{ api_url }}/v1/messages` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/messages" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>type</b>"
     * <p>The type of message to be sent. `private` for a private message and `stream` for a stream message. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>to</b>"
     * <p>For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;Integer&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>content</b>"
     * <p>The content of the message. Maximum message size of 10000 bytes. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>topic</b>"
     * <p>The topic of the message. Only required for stream messages (`type=\"stream\"`), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>queue_id</b>"
     * <p>For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, `local_id` is required.  If the message is successfully sent, the server will include `local_id` in the `message` event that the client with this `queue_id` will receive notifying it of the new message via [`GET /events`](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device). </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>local_id</b>"
     * <p>For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the `queue_id` description. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler sendMessage();

    /**
     * <p>Edit a message</p>
     *
     * <p>Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/api/v1/messages/{message_id}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>message_id</b>"
     * <p>The target message's ID. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>topic</b>"
     * <p>The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>propagate_mode</b>"
     * <p>Which message(s) should be edited: just the one indicated in `message_id`, messages in the same topic that had been sent after this one, or all of them.  Only the default value of `change_one` is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>change_one</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>send_notification_to_old_thread</b>"
     * <p>Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9). </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>true</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>send_notification_to_new_thread</b>"
     * <p>Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9). </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>true</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>content</b>"
     * <p>The content of the message. Maximum message size of 10000 bytes. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>stream_id</b>"
     * <p>The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler updateMessage();

    /**
     * <p>Update personal message flags</p>
     *
     * <p>Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/messages/flags" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>messages</b>"
     * <p>An array containing the IDs of the target messages. </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;Integer&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>op</b>"
     * <p>Whether to `add` the flag or `remove` it. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>flag</b>"
     * <p>The flag that should be added/removed. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler updateMessageFlags();

    /**
     * <p>Upload a file</p>
     *
     * <p>Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/user_uploads" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>filename</b>"
     * <p>
     * - Parameter type: <b>BinaryFile</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=multipart/form-data}]</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler uploadFile();

    /**
     * <p>Delete an event queue</p>
     *
     * <p>Delete a previously registered queue.  `DELETE {{ api_url }}/v1/events` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/api/v1/events" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>queue_id</b>"
     * <p>The ID of an event queue that was previously registered via `POST /api/v1/register` (see [Register a queue](/api/register-queue)). </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deleteQueue();

    /**
     * <p>Get events from an event queue</p>
     *
     * <p>`GET {{ api_url }}/v1/events`  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the `event_queue_longpoll_timeout_seconds` property returned by `POST /register` as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v1/events" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>queue_id</b>"
     * <p>The ID of an event queue that was previously registered via `POST /api/v1/register` (see [Register a queue](/api/register-queue)). </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>last_event_id</b>"
     * <p>The highest event ID in this queue that you've received and wish to acknowledge. See the [code for `call_on_each_event`](https://github.com/zulip/python-zulip-api/blob/master/zulip/zulip/__init__.py) in the [zulip Python module](https://github.com/zulip/python-zulip-api) for an example implementation of correctly processing each event exactly once. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>dont_block</b>"
     * <p>Set to `true` if the client is requesting a nonblocking reply. If not specified, the request will block until either a new event is available or a few minutes have passed, in which case the server will send the client a heartbeat event. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getEvents();

    /**
     * <p>(Ignored) </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/real-time" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>event_types</b>"
     * <p>A JSON-encoded array indicating which types of events you're interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: `event_types=['message']`  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>narrow</b>"
     * <p>A JSON-encoded array of arrays of length 2 indicating the narrow for which you'd like to receive events for. For instance, to receive events for the stream `Denmark`, you would specify `narrow=[['stream', 'Denmark']]`.  Another example is `narrow=[['is', 'private']]` for private messages. Default is `[]`. </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;List&lt;String&gt;&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>[]</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>all_public_streams</b>"
     * <p>Whether you would like to request message events from all public streams.  Useful for workflow bots that you'd like to see all new messages sent to public streams.  (You can also subscribe the user to private streams). </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler realTimePost();

    /**
     * <p>Register an event queue</p>
     *
     * <p>`POST {{ api_url }}/v1/register`  This powerful endpoint can be used to register a Zulip \"event queue\" (subscribed to certain types of \"events\", or updates to the messages and other Zulip data the current user has access to), as well as to fetch the current state of that data.  (`register` also powers the `call_on_each_event` Python API, and is intended primarily for complex applications for which the more convenient `call_on_each_event` API is insufficient).  This endpoint returns a `queue_id` and a `last_event_id`; these can be used in subsequent calls to the [\"events\" endpoint](/api/get-events) to request events from the Zulip server using long-polling.  The server will queue events for up to 10 minutes of inactivity. After 10 minutes, your event queue will be garbage-collected.  The server will send `heartbeat` events every minute, which makes it easy to implement a robust client that does not miss events unless the client loses network connectivity with the Zulip server for 10 minutes or longer.  Once the server garbage-collects your event queue, the server will [return an error](/api/get-events#bad_event_queue_id-errors) with a code of `BAD_EVENT_QUEUE_ID` if you try to fetch events from the event queue.  Your software will need to handle that error condition by re-initializing itself (e.g. this is what triggers your browser reloading the Zulip web app when your laptop comes back online after being offline for more than 10 minutes).  When prototyping with this API, we recommend first calling `register` with no `event_types` parameter to see all the available data from all supported event types.  Before using your client in production, you should set appropriate `event_types` and `fetch_event_types` filters so that your client only requests the data it needs.  A few minutes doing this often saves 90% of the total bandwidth and other resources consumed by a client using this API.  See the [events system developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/events-system.html) if you need deeper details about how the Zulip event queue system works, avoids clients needing to worry about large classes of potentially messy races, etc. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/register" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>apply_markdown</b>"
     * <p>Set to `true` if you would like the content to be rendered in HTML format (otherwise the API will return the raw text that the user entered) </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>client_gravatar</b>"
     * <p>Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>slim_presence</b>"
     * <p>Setting this to `true` will make presence dictionaries be keyed by user_id instead of email.  **Changes**: New in Zulip 3.0 (Unstable with no feature level yet). </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>event_types</b>"
     * <p>A JSON-encoded array indicating which types of events you're interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: `event_types=['message']`  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>all_public_streams</b>"
     * <p>Whether you would like to request message events from all public streams.  Useful for workflow bots that you'd like to see all new messages sent to public streams.  (You can also subscribe the user to private streams). </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>include_subscribers</b>"
     * <p>Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>client_capabilities</b>"
     * <p>Dictionary containing details on features the client supports that are relevant to the format of responses sent by the server.  * `notification_settings_null`: Boolean for whether the   client can handle the current API with null values for   stream-level notification settings (which means the stream   is not customized and should inherit the user's global   notification settings for stream messages).  New in Zulip   2.1.0; in earlier Zulip releases, stream-level   notification settings were simple booleans.  * `bulk_message_deletion`: Boolean for whether the client's    handler for the `delete_message` event type has been    updated to process the new bulk format (with a    `message_ids`, rather than a singleton `message_id`).    Otherwise, the server will send `delete_message` events    in a loop.  New in Zulip 3.0 (feature level 13).  This    capability is for backwards-compatibility; it will be    required in a future server release.  * `user_avatar_url_field_optional`: Boolean for whether the    client required avatar URLs for all users, or supports    using `GET /avatar/{user_id}` to access user avatars.  If the    client has this capability, the server may skip sending a    `avatar_url` field in the `realm_user` at its sole discretion    to optimize network performance.  This is an important optimization    in organizations with 10,000s of users.    New in Zulip 3.0 (feature level 18).  * `stream_typing_notifications`: Boolean for whether the client   supports stream typing notifications.    New in Zulip 4.0 (feature level 58).  This capability is   for backwards-compatibility; it will be required in a   future server release. </p>
     * <p>
     * - Parameter type: <b>{@link Object}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>fetch_event_types</b>"
     * <p>Same as the `event_types` parameter except that the values in `fetch_event_types` are used to fetch initial data. If `fetch_event_types` is not provided, `event_types` is used and if `event_types` is not provided, this parameter defaults to `None`.  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>narrow</b>"
     * <p>A JSON-encoded array of arrays of length 2 indicating the narrow for which you'd like to receive events for. For instance, to receive events for the stream `Denmark`, you would specify `narrow=[['stream', 'Denmark']]`.  Another example is `narrow=[['is', 'private']]` for private messages. Default is `[]`. </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;List&lt;String&gt;&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>[]</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler registerQueue();

    /**
     * <p>Error handling</p>
     *
     * <p>Common error to many endpoints </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/rest-error-handling" (<i>privileged: false</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>400 (client error)</b>: Bad request. </li>
     * <li><b>401 (client error)</b>: Unauthorized. </li>
     * <li><b>429 (client error)</b>: Rate limit exceeded. </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler restErrorHandling();

    /**
     * <p>Add a code playground</p>
     *
     * <p>Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/realm/playgrounds" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>name</b>"
     * <p>The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>pygments_language</b>"
     * <p>The name of the Pygments language lexer for that programming language. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>url_prefix</b>"
     * <p>The url prefix for the playground. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler addCodePlayground();

    /**
     * <p>Add a linkifier</p>
     *
     * <p>Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/realm/filters" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>pattern</b>"
     * <p>The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>url_format_string</b>"
     * <p>The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler addLinkifier();

    /**
     * <p>Create a custom profile field</p>
     *
     * <p>[Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/realm/profile_fields" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>field_type</b>"
     * <p>The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>name</b>"
     * <p>The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user's profile. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>hint</b>"
     * <p>The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>field_data</b>"
     * <p>Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. </p>
     * <p>
     * - Parameter type: <b>{@link Object}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createCustomProfileField();

    /**
     * <p>Get all custom emoji</p>
     *
     * <p>Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v1/realm/emoji" (<i>privileged: false</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getCustomEmoji();

    /**
     * <p>Get all custom profile fields</p>
     *
     * <p>Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v1/realm/profile_fields" (<i>privileged: false</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getCustomProfileFields();

    /**
     * <p>Get linkifiers</p>
     *
     * <p>List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v1/realm/linkifiers" (<i>privileged: false</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getLinkifiers();

    /**
     * <p>Get server settings</p>
     *
     * <p>Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v1/server_settings" (<i>privileged: false</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getServerSettings();

    /**
     * <p>Remove a code playground</p>
     *
     * <p>Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/api/v1/realm/playgrounds/{playground_id}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>playground_id</b>"
     * <p>The ID of the playground that you want to remove. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler removeCodePlayground();

    /**
     * <p>Remove a linkifier</p>
     *
     * <p>Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/api/v1/realm/filters/{filter_id}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>filter_id</b>"
     * <p>The ID of the linkifier that you want to remove. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler removeLinkifier();

    /**
     * <p>Reorder custom profile fields</p>
     *
     * <p>Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/api/v1/realm/profile_fields" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>order</b>"
     * <p>A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;Integer&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler reorderCustomProfileFields();

    /**
     * <p>Update a linkifier</p>
     *
     * <p>Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/api/v1/realm/filters/{filter_id}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>filter_id</b>"
     * <p>The ID of the linkifier that you want to update. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>pattern</b>"
     * <p>The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>url_format_string</b>"
     * <p>The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler updateLinkifier();

    /**
     * <p>Upload custom emoji</p>
     *
     * <p>This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/realm/emoji/{emoji_name}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>emoji_name</b>"
     * <p>The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>filename</b>"
     * <p>
     * - Parameter type: <b>BinaryFile</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=multipart/form-data}]</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler uploadCustomEmoji();

    /**
     * <p>Archive a stream</p>
     *
     * <p>[Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/api/v1/streams/{stream_id}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>stream_id</b>"
     * <p>The ID of the stream to access. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler archiveStream();

    /**
     * <p>Create BigBlueButton video call</p>
     *
     * <p>Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v1/calls/bigbluebutton/create" (<i>privileged: false</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createBigBlueButtonVideoCall();

    /**
     * <p>Get stream ID</p>
     *
     * <p>Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v1/get_stream_id" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>stream</b>"
     * <p>The name of the stream to access. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getStreamId();

    /**
     * <p>Get topics in a stream</p>
     *
     * <p>Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v1/users/me/{stream_id}/topics" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>stream_id</b>"
     * <p>The ID of the stream to access. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getStreamTopics();

    /**
     * <p>Get all streams</p>
     *
     * <p>Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v1/streams" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>include_public</b>"
     * <p>Include all public streams. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>true</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>include_web_public</b>"
     * <p>Include all web public streams. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>include_subscribed</b>"
     * <p>Include all streams that the user is subscribed to. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>true</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>include_all_active</b>"
     * <p>Include all active streams. The user must have administrative privileges to use this parameter. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>include_default</b>"
     * <p>Include all default streams for the user's realm. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>include_owner_subscribed</b>"
     * <p>If the user is a bot, include all streams that the bot's owner is subscribed to. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getStreams();

    /**
     * <p>Get subscription status</p>
     *
     * <p>Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v1/users/{user_id}/subscriptions/{stream_id}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>user_id</b>"
     * <p>The target user's ID. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>stream_id</b>"
     * <p>The ID of the stream to access. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getSubscriptionStatus();

    /**
     * <p>Get subscribed streams</p>
     *
     * <p>Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v1/users/me/subscriptions" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>include_subscribers</b>"
     * <p>Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getSubscriptions();

    /**
     * <p>Topic muting</p>
     *
     * <p>This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/api/v1/users/me/subscriptions/muted_topics" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>topic</b>"
     * <p>The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>op</b>"
     * <p>Whether to mute (`add`) or unmute (`remove`) the provided topic. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>stream</b>"
     * <p>The name of the stream to access. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>stream_id</b>"
     * <p>The ID of the stream to access. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler muteTopic();

    /**
     * <p>Subscribe to a stream</p>
     *
     * <p>Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/users/me/subscriptions" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>subscriptions</b>"
     * <p>A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value. </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;Object&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>principals</b>"
     * <p>A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;OneOfstringinteger&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>authorization_errors_fatal</b>"
     * <p>A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When `True`, an authorization error is reported as such. When set to `False`, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the `unauthorized` key. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>true</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>announce</b>"
     * <p>If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream's creation. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>invite_only</b>"
     * <p>As described above, this endpoint will create a new stream if passed a stream name that doesn't already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>history_public_to_subscribers</b>"
     * <p>Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>stream_post_policy</b>"
     * <p>Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>1</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>message_retention_days</b>"
     * <p>Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). </p>
     * <p>
     * - Parameter type: <b>{@link OneOfstringinteger}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link OneOfobjectobject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler subscribe();

    /**
     * <p>Unsubscribe from a stream</p>
     *
     * <p>Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/api/v1/users/me/subscriptions" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>subscriptions</b>"
     * <p>A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API. </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>principals</b>"
     * <p>A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;OneOfstringinteger&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler unsubscribe();

    /**
     * <p>Update a stream</p>
     *
     * <p>Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/api/v1/streams/{stream_id}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>stream_id</b>"
     * <p>The ID of the stream to access. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>description</b>"
     * <p>The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>new_name</b>"
     * <p>The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>is_private</b>"
     * <p>Change whether the stream is a private stream. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>is_announcement_only</b>"
     * <p>Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>stream_post_policy</b>"
     * <p>Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>1</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>history_public_to_subscribers</b>"
     * <p>Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>message_retention_days</b>"
     * <p>Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). </p>
     * <p>
     * - Parameter type: <b>{@link OneOfstringinteger}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler updateStream();

    /**
     * <p>Update subscription settings</p>
     *
     * <p>This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/users/me/subscriptions/properties" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>subscription_data</b>"
     * <p>A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream. </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;Object&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler updateSubscriptionSettings();

    /**
     * <p>Update subscriptions</p>
     *
     * <p>Update which streams you are are subscribed to. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/api/v1/users/me/subscriptions" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>delete</b>"
     * <p>A list of stream names to unsubscribe from. </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>add</b>"
     * <p>A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;Object&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler updateSubscriptions();

    /**
     * <p>Create a user</p>
     *
     * <p>{!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/users" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>email</b>"
     * <p>The email address of the new user. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>password</b>"
     * <p>The password of the new user. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>full_name</b>"
     * <p>The full name of the new user. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createUser();

    /**
     * <p>Create a user group</p>
     *
     * <p>Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/user_groups/create" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>name</b>"
     * <p>The name of the user group. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>description</b>"
     * <p>The description of the user group. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>members</b>"
     * <p>An array containing the user IDs of the initial members for the new user group. </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;Integer&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createUserGroup();

    /**
     * <p>Deactivate own user</p>
     *
     * <p>Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/api/v1/users/me" (<i>privileged: false</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deactivateOwnUser();

    /**
     * <p>Deactivate a user</p>
     *
     * <p>[Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/api/v1/users/{user_id}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>user_id</b>"
     * <p>The target user's ID. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success</li>
     * <li><b>400 (client error)</b>: Bad request</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deactivateUser();

    /**
     * <p>Get attachments</p>
     *
     * <p>Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v1/attachments" (<i>privileged: false</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getAttachments();

    /**
     * <p>Get own user</p>
     *
     * <p>Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v1/users/me" (<i>privileged: false</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getOwnUser();

    /**
     * <p>Get a user</p>
     *
     * <p>Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v1/users/{user_id}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>user_id</b>"
     * <p>The target user's ID. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>client_gravatar</b>"
     * <p>Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>include_custom_profile_fields</b>"
     * <p>Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getUser();

    /**
     * <p>Get a user by email</p>
     *
     * <p>Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v1/users/{email}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>email</b>"
     * <p>The email address of the user whose details you want to fetch. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>client_gravatar</b>"
     * <p>Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>include_custom_profile_fields</b>"
     * <p>Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getUserByEmail();

    /**
     * <p>Get user groups</p>
     *
     * <p>{!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v1/user_groups" (<i>privileged: false</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getUserGroups();

    /**
     * <p>Get user presence</p>
     *
     * <p>Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v1/users/{user_id_or_email}/presence" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>user_id_or_email</b>"
     * <p>The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getUserPresence();

    /**
     * <p>Get all users</p>
     *
     * <p>Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/v1/users" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>client_gravatar</b>"
     * <p>Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>include_custom_profile_fields</b>"
     * <p>Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getUsers();

    /**
     * <p>Mute a user</p>
     *
     * <p>This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/users/me/muted_users/{muted_user_id}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>muted_user_id</b>"
     * <p>The ID of the user to mute/un-mute. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler muteUser();

    /**
     * <p>Reactivate a user</p>
     *
     * <p>[Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/users/{user_id}/reactivate" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>user_id</b>"
     * <p>The target user's ID. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Object}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler reactivateUser();

    /**
     * <p>Delete a user group</p>
     *
     * <p>Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/api/v1/user_groups/{user_group_id}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>user_group_id</b>"
     * <p>The ID of the target user group. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler removeUserGroup();

    /**
     * <p>Set \"typing\" status</p>
     *
     * <p>Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/typing" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>op</b>"
     * <p>Whether the user has started (`start`) or stopped (`stop`) to type. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>to</b>"
     * <p>For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;Integer&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>type</b>"
     * <p>Type of the message being composed. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>private</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>topic</b>"
     * <p>Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler setTypingStatus();

    /**
     * <p>Unmute a user</p>
     *
     * <p>This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/api/v1/users/me/muted_users/{muted_user_id}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>muted_user_id</b>"
     * <p>The ID of the user to mute/un-mute. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler unmuteUser();

    /**
     * <p>Update display settings</p>
     *
     * <p>This endpoint is used to edit the current user's user interface settings.  `PATCH {{ api_url }}/v1/settings/display` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/api/v1/settings/display" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>twenty_four_hour_time</b>"
     * <p>Whether time should be [displayed in 24-hour notation](/help/change-the-time-format). </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>dense_mode</b>"
     * <p>This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>starred_message_counts</b>"
     * <p>Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages). </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>fluid_layout_width</b>"
     * <p>Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>high_contrast_mode</b>"
     * <p>This setting is reserved for use to control variations in Zulip's design to help visually impaired users. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>color_scheme</b>"
     * <p>Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>translate_emoticons</b>"
     * <p>Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>default_language</b>"
     * <p>What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>default_view</b>"
     * <p>The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>left_side_userlist</b>"
     * <p>Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>emojiset</b>"
     * <p>The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>demote_inactive_streams</b>"
     * <p>Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>timezone</b>"
     * <p>The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler updateDisplaySettings();

    /**
     * <p>Update notification settings</p>
     *
     * <p>This endpoint is used to edit the user's global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  `PATCH {{ api_url }}/v1/settings/notifications` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/api/v1/settings/notifications" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>enable_stream_desktop_notifications</b>"
     * <p>Enable visual desktop notifications for stream messages. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>enable_stream_email_notifications</b>"
     * <p>Enable email notifications for stream messages. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>enable_stream_push_notifications</b>"
     * <p>Enable mobile notifications for stream messages. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>enable_stream_audible_notifications</b>"
     * <p>Enable audible desktop notifications for stream messages. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>notification_sound</b>"
     * <p>Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>enable_desktop_notifications</b>"
     * <p>Enable visual desktop notifications for private messages and @-mentions. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>enable_sounds</b>"
     * <p>Enable audible desktop notifications for private messages and @-mentions. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>enable_offline_email_notifications</b>"
     * <p>Enable email notifications for private messages and @-mentions received when the user is offline. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>enable_offline_push_notifications</b>"
     * <p>Enable mobile notification for private messages and @-mentions received when the user is offline. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>enable_online_push_notifications</b>"
     * <p>Enable mobile notification for private messages and @-mentions received when the user is online. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>enable_digest_emails</b>"
     * <p>Enable digest emails when the user is away. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>enable_marketing_emails</b>"
     * <p>Enable marketing emails. Has no function outside Zulip Cloud. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>enable_login_emails</b>"
     * <p>Enable email notifications for new logins to account. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>message_content_in_email_notifications</b>"
     * <p>Include the message's content in email notifications for new messages. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>pm_content_in_desktop_notifications</b>"
     * <p>Include content of private messages in desktop notifications. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>wildcard_mentions_notify</b>"
     * <p>Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>desktop_icon_count_display</b>"
     * <p>Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>realm_name_in_notifications</b>"
     * <p>Include organization name in subject of message notification emails. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>presence_enabled</b>"
     * <p>Display the presence status to other users when online. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccessBase}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler updateNotificationSettings();

    /**
     * <p>Update a user</p>
     *
     * <p>Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/api/v1/users/{user_id}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>user_id</b>"
     * <p>The target user's ID. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>full_name</b>"
     * <p>The user's full name. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>role</b>"
     * <p>New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>profile_data</b>"
     * <p>A dictionary containing the to be updated custom profile field data for the user. </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;Object&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler updateUser();

    /**
     * <p>Update a user group</p>
     *
     * <p>Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/api/v1/user_groups/{user_group_id}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>user_group_id</b>"
     * <p>The ID of the target user group. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>name</b>"
     * <p>The new name of the group. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>description</b>"
     * <p>The new description of the group. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * <li><b>400 (client error)</b>: Bad request.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler updateUserGroup();

    /**
     * <p>Update user group members</p>
     *
     * <p>Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/user_groups/{user_group_id}/members" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>user_group_id</b>"
     * <p>The ID of the target user group. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>delete</b>"
     * <p>The list of user ids to be removed from the user group. </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;Integer&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>add</b>"
     * <p>The list of user ids to be added to the user group. </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;Integer&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link JsonSuccess}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler updateUserGroupMembers();

    /**
     * <p>Outgoing webhooks</p>
     *
     * <p>Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/api/v1/zulip-outgoing-webhook" (<i>privileged: false</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link InlineResponse200}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success </li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler zulipOutgoingWebhooks();
}
