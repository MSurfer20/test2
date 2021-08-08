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

import com.networknt.server.HandlerProvider;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.server.RoutingHandler;
import io.undertow.server.handlers.PathHandler;
import io.undertow.util.Methods;

/**
 * The default implementation for {@link HandlerProvider} and {@link PathHandlerInterface}.
 *
 * <p>There are two flavors of {@link HttpHandler}s to choose from, depending on your needs:</p>
 *
 * <ul>
 * <li>
 * <b>Stateless</b>: if a specific endpoint is called more than once from multiple sessions,
 * its state is not retained – a different {@link HttpHandler} is instantiated for every new
 * session. This is the default behavior.
 * </li>
 * <li>
 * <b>Stateful</b>: if a specific endpoint is called more than once from multiple sessions,
 * its state is retained properly. For example, if you want to keep a class property that counts
 * the number of requests or the last time a request was received.
 * </li>
 * </ul>
 * <p>Note: <b>Stateful</b> flavor is more performant than <b>Stateless</b>.</p>
 */
@SuppressWarnings("TooManyFunctions")
abstract public class PathHandlerProvider implements HandlerProvider, PathHandlerInterface {
    /**
     * Returns the default base path to access this server.
     */
    @javax.annotation.Nonnull
    public String getBasePath() {
        return "/api/v1";
    }

    /**
     * Returns a stateless {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Endpoints bound in this method do NOT start with "/api/v1", and
     * it's your responsibility to configure a {@link PathHandler} with a prefix path
     * by calling {@link PathHandler#addPrefixPath} like so:</p>
     *
     * <code>pathHandler.addPrefixPath("/api/v1", handler)</code>
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateless and won't
    * retain any state between multiple sessions.</p>
     *
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    @Override
    public HttpHandler getHandler() {
        return getHandler(false);
    }

    /**
     * Returns a stateless {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateless and won't
     * retain any state between multiple sessions.</p>
     *
     * @param withBasePath if true, all endpoints would start with "/api/v1"
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getHandler(final boolean withBasePath) {
        return getHandler(withBasePath ? getBasePath() : "");
    }

    /**
     * Returns a stateless {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateless and won't
     * retain any state between multiple sessions.</p>
     *
     * @param basePath base path to set for all endpoints
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @SuppressWarnings("Convert2Lambda")
    @javax.annotation.Nonnull
    public HttpHandler getHandler(final String basePath) {
        return Handlers.routing()
            .add(Methods.POST, basePath + "/dev_fetch_api_key", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    devFetchApiKey().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/fetch_api_key", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    fetchApiKey().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/drafts", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createDrafts().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/drafts/{draft_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteDraft().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/drafts/{draft_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    editDraft().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/drafts", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getDrafts().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/messages/{message_id}/reactions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    addReaction().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/messages/matches_narrow", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    checkMessagesMatchNarrow().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/messages/{message_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteMessage().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/user_uploads/{realm_id_str}/{filename}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getFileTemporaryUrl().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/messages/{message_id}/history", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getMessageHistory().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/messages", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getMessages().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/messages/{message_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getRawMessage().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/mark_all_as_read", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    markAllAsRead().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/mark_stream_as_read", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    markStreamAsRead().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/mark_topic_as_read", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    markTopicAsRead().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/messages/{message_id}/reactions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    removeReaction().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/messages/render", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    renderMessage().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/messages", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    sendMessage().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/messages/{message_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateMessage().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/messages/flags", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateMessageFlags().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/user_uploads", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    uploadFile().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/events", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteQueue().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/events", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getEvents().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/real-time", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    realTimePost().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/register", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    registerQueue().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/rest-error-handling", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    restErrorHandling().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/realm/playgrounds", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    addCodePlayground().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/realm/filters", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    addLinkifier().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/realm/profile_fields", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createCustomProfileField().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/realm/emoji", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCustomEmoji().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/realm/profile_fields", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCustomProfileFields().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/realm/linkifiers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getLinkifiers().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/server_settings", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getServerSettings().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/realm/playgrounds/{playground_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    removeCodePlayground().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/realm/filters/{filter_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    removeLinkifier().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/realm/profile_fields", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    reorderCustomProfileFields().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/realm/filters/{filter_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateLinkifier().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/realm/emoji/{emoji_name}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    uploadCustomEmoji().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/streams/{stream_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    archiveStream().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/calls/bigbluebutton/create", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createBigBlueButtonVideoCall().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/streams/{stream_id}/delete_topic", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteTopic().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/get_stream_id", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getStreamId().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/users/me/{stream_id}/topics", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getStreamTopics().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/streams", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getStreams().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/streams/{stream_id}/members", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getSubscribers().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/users/{user_id}/subscriptions/{stream_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getSubscriptionStatus().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/users/me/subscriptions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getSubscriptions().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/users/me/subscriptions/muted_topics", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    muteTopic().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/users/me/subscriptions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    subscribe().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/users/me/subscriptions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    unsubscribe().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/streams/{stream_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateStream().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/users/me/subscriptions/properties", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateSubscriptionSettings().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/users/me/subscriptions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateSubscriptions().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/users", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createUser().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/user_groups/create", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createUserGroup().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/users/me", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deactivateOwnUser().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/users/{user_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deactivateUser().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/attachments", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getAttachments().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/users/me", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOwnUser().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/users/{user_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getUser().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/users/{email}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getUserByEmail().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/user_groups", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getUserGroups().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/users/{user_id_or_email}/presence", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getUserPresence().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/users", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getUsers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/users/me/muted_users/{muted_user_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    muteUser().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/users/{user_id}/reactivate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    reactivateUser().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/user_groups/{user_group_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    removeUserGroup().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/typing", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    setTypingStatus().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/users/me/muted_users/{muted_user_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    unmuteUser().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/settings", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateSettings().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/users/me/status", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateStatus().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/users/{user_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateUser().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/user_groups/{user_group_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateUserGroup().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/user_groups/{user_group_id}/members", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateUserGroupMembers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/zulip-outgoing-webhook", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    zulipOutgoingWebhooks().handleRequest(exchange);
                }
            })
            ;
    }

    /**
     * Returns a stateful {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Endpoints bound in this method do NOT start with "/api/v1", and
     * it's your responsibility to configure a {@link PathHandler} with a prefix path
     * by calling {@link PathHandler#addPrefixPath} like so:</p>
     *
     * <code>pathHandler.addPrefixPath("/api/v1", handler)</code>
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateful and will
     * retain any state between multiple sessions.</p>
     *
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getStatefulHandler() {
        return getStatefulHandler(false);
    }

    /**
     * Returns a stateful {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateful and will
     * retain any state between multiple sessions.</p>
     *
     * @param withBasePath if true, all endpoints would start with "/api/v1"
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getStatefulHandler(final boolean withBasePath) {
        return getStatefulHandler(withBasePath ? getBasePath() : "");
    }

    /**
     * Returns a stateful {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateful and will
     * retain any state between multiple sessions.</p>
     *
     * @param basePath base path to set for all endpoints
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getStatefulHandler(final String basePath) {
        return Handlers.routing()
            .add(Methods.POST, basePath + "/dev_fetch_api_key", devFetchApiKey())
            .add(Methods.POST, basePath + "/fetch_api_key", fetchApiKey())
            .add(Methods.POST, basePath + "/drafts", createDrafts())
            .add(Methods.DELETE, basePath + "/drafts/{draft_id}", deleteDraft())
            .add(Methods.PATCH, basePath + "/drafts/{draft_id}", editDraft())
            .add(Methods.GET, basePath + "/drafts", getDrafts())
            .add(Methods.POST, basePath + "/messages/{message_id}/reactions", addReaction())
            .add(Methods.GET, basePath + "/messages/matches_narrow", checkMessagesMatchNarrow())
            .add(Methods.DELETE, basePath + "/messages/{message_id}", deleteMessage())
            .add(Methods.GET, basePath + "/user_uploads/{realm_id_str}/{filename}", getFileTemporaryUrl())
            .add(Methods.GET, basePath + "/messages/{message_id}/history", getMessageHistory())
            .add(Methods.GET, basePath + "/messages", getMessages())
            .add(Methods.GET, basePath + "/messages/{message_id}", getRawMessage())
            .add(Methods.POST, basePath + "/mark_all_as_read", markAllAsRead())
            .add(Methods.POST, basePath + "/mark_stream_as_read", markStreamAsRead())
            .add(Methods.POST, basePath + "/mark_topic_as_read", markTopicAsRead())
            .add(Methods.DELETE, basePath + "/messages/{message_id}/reactions", removeReaction())
            .add(Methods.POST, basePath + "/messages/render", renderMessage())
            .add(Methods.POST, basePath + "/messages", sendMessage())
            .add(Methods.PATCH, basePath + "/messages/{message_id}", updateMessage())
            .add(Methods.POST, basePath + "/messages/flags", updateMessageFlags())
            .add(Methods.POST, basePath + "/user_uploads", uploadFile())
            .add(Methods.DELETE, basePath + "/events", deleteQueue())
            .add(Methods.GET, basePath + "/events", getEvents())
            .add(Methods.POST, basePath + "/real-time", realTimePost())
            .add(Methods.POST, basePath + "/register", registerQueue())
            .add(Methods.POST, basePath + "/rest-error-handling", restErrorHandling())
            .add(Methods.POST, basePath + "/realm/playgrounds", addCodePlayground())
            .add(Methods.POST, basePath + "/realm/filters", addLinkifier())
            .add(Methods.POST, basePath + "/realm/profile_fields", createCustomProfileField())
            .add(Methods.GET, basePath + "/realm/emoji", getCustomEmoji())
            .add(Methods.GET, basePath + "/realm/profile_fields", getCustomProfileFields())
            .add(Methods.GET, basePath + "/realm/linkifiers", getLinkifiers())
            .add(Methods.GET, basePath + "/server_settings", getServerSettings())
            .add(Methods.DELETE, basePath + "/realm/playgrounds/{playground_id}", removeCodePlayground())
            .add(Methods.DELETE, basePath + "/realm/filters/{filter_id}", removeLinkifier())
            .add(Methods.PATCH, basePath + "/realm/profile_fields", reorderCustomProfileFields())
            .add(Methods.PATCH, basePath + "/realm/filters/{filter_id}", updateLinkifier())
            .add(Methods.POST, basePath + "/realm/emoji/{emoji_name}", uploadCustomEmoji())
            .add(Methods.DELETE, basePath + "/streams/{stream_id}", archiveStream())
            .add(Methods.GET, basePath + "/calls/bigbluebutton/create", createBigBlueButtonVideoCall())
            .add(Methods.POST, basePath + "/streams/{stream_id}/delete_topic", deleteTopic())
            .add(Methods.GET, basePath + "/get_stream_id", getStreamId())
            .add(Methods.GET, basePath + "/users/me/{stream_id}/topics", getStreamTopics())
            .add(Methods.GET, basePath + "/streams", getStreams())
            .add(Methods.GET, basePath + "/streams/{stream_id}/members", getSubscribers())
            .add(Methods.GET, basePath + "/users/{user_id}/subscriptions/{stream_id}", getSubscriptionStatus())
            .add(Methods.GET, basePath + "/users/me/subscriptions", getSubscriptions())
            .add(Methods.PATCH, basePath + "/users/me/subscriptions/muted_topics", muteTopic())
            .add(Methods.POST, basePath + "/users/me/subscriptions", subscribe())
            .add(Methods.DELETE, basePath + "/users/me/subscriptions", unsubscribe())
            .add(Methods.PATCH, basePath + "/streams/{stream_id}", updateStream())
            .add(Methods.POST, basePath + "/users/me/subscriptions/properties", updateSubscriptionSettings())
            .add(Methods.PATCH, basePath + "/users/me/subscriptions", updateSubscriptions())
            .add(Methods.POST, basePath + "/users", createUser())
            .add(Methods.POST, basePath + "/user_groups/create", createUserGroup())
            .add(Methods.DELETE, basePath + "/users/me", deactivateOwnUser())
            .add(Methods.DELETE, basePath + "/users/{user_id}", deactivateUser())
            .add(Methods.GET, basePath + "/attachments", getAttachments())
            .add(Methods.GET, basePath + "/users/me", getOwnUser())
            .add(Methods.GET, basePath + "/users/{user_id}", getUser())
            .add(Methods.GET, basePath + "/users/{email}", getUserByEmail())
            .add(Methods.GET, basePath + "/user_groups", getUserGroups())
            .add(Methods.GET, basePath + "/users/{user_id_or_email}/presence", getUserPresence())
            .add(Methods.GET, basePath + "/users", getUsers())
            .add(Methods.POST, basePath + "/users/me/muted_users/{muted_user_id}", muteUser())
            .add(Methods.POST, basePath + "/users/{user_id}/reactivate", reactivateUser())
            .add(Methods.DELETE, basePath + "/user_groups/{user_group_id}", removeUserGroup())
            .add(Methods.POST, basePath + "/typing", setTypingStatus())
            .add(Methods.DELETE, basePath + "/users/me/muted_users/{muted_user_id}", unmuteUser())
            .add(Methods.PATCH, basePath + "/settings", updateSettings())
            .add(Methods.POST, basePath + "/users/me/status", updateStatus())
            .add(Methods.PATCH, basePath + "/users/{user_id}", updateUser())
            .add(Methods.PATCH, basePath + "/user_groups/{user_group_id}", updateUserGroup())
            .add(Methods.POST, basePath + "/user_groups/{user_group_id}/members", updateUserGroupMembers())
            .add(Methods.POST, basePath + "/zulip-outgoing-webhook", zulipOutgoingWebhooks())
            ;
    }
}
