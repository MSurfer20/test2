//! Main library entry point for openapi_client implementation.

#![allow(unused_imports)]

use async_trait::async_trait;
use futures::{future, Stream, StreamExt, TryFutureExt, TryStreamExt};
use hyper::server::conn::Http;
use hyper::service::Service;
use log::info;
#[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
use openssl::ssl::SslAcceptorBuilder;
use std::future::Future;
use std::marker::PhantomData;
use std::net::SocketAddr;
use std::sync::{Arc, Mutex};
use std::task::{Context, Poll};
use swagger::{Has, XSpanIdString};
use swagger::auth::MakeAllowAllAuthenticator;
use swagger::EmptyContext;
use tokio::net::TcpListener;

#[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
use openssl::ssl::{SslAcceptor, SslFiletype, SslMethod};

use openapi_client::models;

/// Builds an SSL implementation for Simple HTTPS from some hard-coded file names
pub async fn create(addr: &str, https: bool) {
    let addr = addr.parse().expect("Failed to parse bind address");

    let server = Server::new();

    let service = MakeService::new(server);

    let service = MakeAllowAllAuthenticator::new(service, "cosmo");

    let mut service =
        openapi_client::server::context::MakeAddContext::<_, EmptyContext>::new(
            service
        );

    if https {
        #[cfg(any(target_os = "macos", target_os = "windows", target_os = "ios"))]
        {
            unimplemented!("SSL is not implemented for the examples on MacOS, Windows or iOS");
        }

        #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
        {
            let mut ssl = SslAcceptor::mozilla_intermediate_v5(SslMethod::tls()).expect("Failed to create SSL Acceptor");

            // Server authentication
            ssl.set_private_key_file("examples/server-key.pem", SslFiletype::PEM).expect("Failed to set private key");
            ssl.set_certificate_chain_file("examples/server-chain.pem").expect("Failed to set cerificate chain");
            ssl.check_private_key().expect("Failed to check private key");

            let tls_acceptor = Arc::new(ssl.build());
            let mut tcp_listener = TcpListener::bind(&addr).await.unwrap();
            let mut incoming = tcp_listener.incoming();

            while let (Some(tcp), rest) = incoming.into_future().await {
                if let Ok(tcp) = tcp {
                    let addr = tcp.peer_addr().expect("Unable to get remote address");
                    let service = service.call(addr);
                    let tls_acceptor = Arc::clone(&tls_acceptor);

                    tokio::spawn(async move {
                        let tls = tokio_openssl::accept(&*tls_acceptor, tcp).await.map_err(|_| ())?;

                        let service = service.await.map_err(|_| ())?;

                        Http::new().serve_connection(tls, service).await.map_err(|_| ())
                    });
                }

                incoming = rest;
            }
        }
    } else {
        // Using HTTP
        hyper::server::Server::bind(&addr).serve(service).await.unwrap()
    }
}

#[derive(Copy, Clone)]
pub struct Server<C> {
    marker: PhantomData<C>,
}

impl<C> Server<C> {
    pub fn new() -> Self {
        Server{marker: PhantomData}
    }
}


use openapi_client::{
    Api,
    DevFetchApiKeyResponse,
    FetchApiKeyResponse,
    AddReactionResponse,
    CheckMessagesMatchNarrowResponse,
    DeleteMessageResponse,
    GetFileTemporaryUrlResponse,
    GetMessageHistoryResponse,
    GetMessagesResponse,
    GetRawMessageResponse,
    MarkAllAsReadResponse,
    MarkStreamAsReadResponse,
    MarkTopicAsReadResponse,
    RemoveReactionResponse,
    RenderMessageResponse,
    SendMessageResponse,
    UpdateMessageResponse,
    UpdateMessageFlagsResponse,
    UploadFileResponse,
    DeleteQueueResponse,
    GetEventsResponse,
    RealTimePostResponse,
    RegisterQueueResponse,
    RestErrorHandlingResponse,
    AddCodePlaygroundResponse,
    AddLinkifierResponse,
    CreateCustomProfileFieldResponse,
    GetCustomEmojiResponse,
    GetCustomProfileFieldsResponse,
    GetLinkifiersResponse,
    GetServerSettingsResponse,
    RemoveCodePlaygroundResponse,
    RemoveLinkifierResponse,
    ReorderCustomProfileFieldsResponse,
    UpdateLinkifierResponse,
    UploadCustomEmojiResponse,
    ArchiveStreamResponse,
    CreateBigBlueButtonVideoCallResponse,
    GetStreamIdResponse,
    GetStreamTopicsResponse,
    GetStreamsResponse,
    GetSubscriptionStatusResponse,
    GetSubscriptionsResponse,
    MuteTopicResponse,
    SubscribeResponse,
    UnsubscribeResponse,
    UpdateStreamResponse,
    UpdateSubscriptionSettingsResponse,
    UpdateSubscriptionsResponse,
    CreateUserResponse,
    CreateUserGroupResponse,
    DeactivateOwnUserResponse,
    DeactivateUserResponse,
    GetAttachmentsResponse,
    GetOwnUserResponse,
    GetUserResponse,
    GetUserByEmailResponse,
    GetUserGroupsResponse,
    GetUserPresenceResponse,
    GetUsersResponse,
    MuteUserResponse,
    ReactivateUserResponse,
    RemoveUserGroupResponse,
    SetTypingStatusResponse,
    UnmuteUserResponse,
    UpdateDisplaySettingsResponse,
    UpdateNotificationSettingsResponse,
    UpdateUserResponse,
    UpdateUserGroupResponse,
    UpdateUserGroupMembersResponse,
    ZulipOutgoingWebhooksResponse,
};
use openapi_client::server::MakeService;
use std::error::Error;
use swagger::ApiError;

#[async_trait]
impl<C> Api<C> for Server<C> where C: Has<XSpanIdString> + Send + Sync
{
    /// Fetch an API key (development only)
    async fn dev_fetch_api_key(
        &self,
        username: String,
        context: &C) -> Result<DevFetchApiKeyResponse, ApiError>
    {
        let context = context.clone();
        info!("dev_fetch_api_key(\"{}\") - X-Span-ID: {:?}", username, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Fetch an API key (production)
    async fn fetch_api_key(
        &self,
        username: String,
        password: String,
        context: &C) -> Result<FetchApiKeyResponse, ApiError>
    {
        let context = context.clone();
        info!("fetch_api_key(\"{}\", \"{}\") - X-Span-ID: {:?}", username, password, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Add an emoji reaction
    async fn add_reaction(
        &self,
        message_id: i32,
        emoji_name: String,
        emoji_code: Option<String>,
        reaction_type: Option<String>,
        context: &C) -> Result<AddReactionResponse, ApiError>
    {
        let context = context.clone();
        info!("add_reaction({}, \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", message_id, emoji_name, emoji_code, reaction_type, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Check if messages match a narrow
    async fn check_messages_match_narrow(
        &self,
        msg_ids: &Vec<i32>,
        narrow: &Vec<serde_json::Value>,
        context: &C) -> Result<CheckMessagesMatchNarrowResponse, ApiError>
    {
        let context = context.clone();
        info!("check_messages_match_narrow({:?}, {:?}) - X-Span-ID: {:?}", msg_ids, narrow, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Delete a message
    async fn delete_message(
        &self,
        message_id: i32,
        context: &C) -> Result<DeleteMessageResponse, ApiError>
    {
        let context = context.clone();
        info!("delete_message({}) - X-Span-ID: {:?}", message_id, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Get public temporary URL
    async fn get_file_temporary_url(
        &self,
        realm_id_str: i32,
        filename: String,
        context: &C) -> Result<GetFileTemporaryUrlResponse, ApiError>
    {
        let context = context.clone();
        info!("get_file_temporary_url({}, \"{}\") - X-Span-ID: {:?}", realm_id_str, filename, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Get a message's edit history
    async fn get_message_history(
        &self,
        message_id: i32,
        context: &C) -> Result<GetMessageHistoryResponse, ApiError>
    {
        let context = context.clone();
        info!("get_message_history({}) - X-Span-ID: {:?}", message_id, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Get messages
    async fn get_messages(
        &self,
        num_before: i32,
        num_after: i32,
        anchor: Option<swagger::OneOf2<String,i32>>,
        narrow: Option<&Vec<serde_json::Value>>,
        client_gravatar: Option<bool>,
        apply_markdown: Option<bool>,
        use_first_unread_anchor: Option<bool>,
        context: &C) -> Result<GetMessagesResponse, ApiError>
    {
        let context = context.clone();
        info!("get_messages({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", num_before, num_after, anchor, narrow, client_gravatar, apply_markdown, use_first_unread_anchor, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Get a message's raw Markdown
    async fn get_raw_message(
        &self,
        message_id: i32,
        context: &C) -> Result<GetRawMessageResponse, ApiError>
    {
        let context = context.clone();
        info!("get_raw_message({}) - X-Span-ID: {:?}", message_id, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Mark all messages as read
    async fn mark_all_as_read(
        &self,
        context: &C) -> Result<MarkAllAsReadResponse, ApiError>
    {
        let context = context.clone();
        info!("mark_all_as_read() - X-Span-ID: {:?}", context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Mark messages in a stream as read
    async fn mark_stream_as_read(
        &self,
        stream_id: i32,
        context: &C) -> Result<MarkStreamAsReadResponse, ApiError>
    {
        let context = context.clone();
        info!("mark_stream_as_read({}) - X-Span-ID: {:?}", stream_id, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Mark messages in a topic as read
    async fn mark_topic_as_read(
        &self,
        stream_id: i32,
        topic_name: String,
        context: &C) -> Result<MarkTopicAsReadResponse, ApiError>
    {
        let context = context.clone();
        info!("mark_topic_as_read({}, \"{}\") - X-Span-ID: {:?}", stream_id, topic_name, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Remove an emoji reaction
    async fn remove_reaction(
        &self,
        message_id: i32,
        emoji_name: Option<String>,
        emoji_code: Option<String>,
        reaction_type: Option<String>,
        context: &C) -> Result<RemoveReactionResponse, ApiError>
    {
        let context = context.clone();
        info!("remove_reaction({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", message_id, emoji_name, emoji_code, reaction_type, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Render message
    async fn render_message(
        &self,
        content: String,
        context: &C) -> Result<RenderMessageResponse, ApiError>
    {
        let context = context.clone();
        info!("render_message(\"{}\") - X-Span-ID: {:?}", content, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Send a message
    async fn send_message(
        &self,
        type_: String,
        to: &Vec<i32>,
        content: String,
        topic: Option<String>,
        queue_id: Option<String>,
        local_id: Option<String>,
        context: &C) -> Result<SendMessageResponse, ApiError>
    {
        let context = context.clone();
        info!("send_message(\"{}\", {:?}, \"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", type_, to, content, topic, queue_id, local_id, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Edit a message
    async fn update_message(
        &self,
        message_id: i32,
        topic: Option<String>,
        propagate_mode: Option<String>,
        send_notification_to_old_thread: Option<bool>,
        send_notification_to_new_thread: Option<bool>,
        content: Option<String>,
        stream_id: Option<i32>,
        context: &C) -> Result<UpdateMessageResponse, ApiError>
    {
        let context = context.clone();
        info!("update_message({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", message_id, topic, propagate_mode, send_notification_to_old_thread, send_notification_to_new_thread, content, stream_id, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Update personal message flags
    async fn update_message_flags(
        &self,
        messages: &Vec<i32>,
        op: String,
        flag: String,
        context: &C) -> Result<UpdateMessageFlagsResponse, ApiError>
    {
        let context = context.clone();
        info!("update_message_flags({:?}, \"{}\", \"{}\") - X-Span-ID: {:?}", messages, op, flag, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Upload a file
    async fn upload_file(
        &self,
        filename: Option<swagger::ByteArray>,
        context: &C) -> Result<UploadFileResponse, ApiError>
    {
        let context = context.clone();
        info!("upload_file({:?}) - X-Span-ID: {:?}", filename, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Delete an event queue
    async fn delete_queue(
        &self,
        queue_id: String,
        context: &C) -> Result<DeleteQueueResponse, ApiError>
    {
        let context = context.clone();
        info!("delete_queue(\"{}\") - X-Span-ID: {:?}", queue_id, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Get events from an event queue
    async fn get_events(
        &self,
        queue_id: String,
        last_event_id: Option<i32>,
        dont_block: Option<bool>,
        context: &C) -> Result<GetEventsResponse, ApiError>
    {
        let context = context.clone();
        info!("get_events(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", queue_id, last_event_id, dont_block, context.get().0.clone());
        Err("Generic failuare".into())
    }

    async fn real_time_post(
        &self,
        event_types: Option<&Vec<String>>,
        narrow: Option<&Vec<Vec<String>>>,
        all_public_streams: Option<bool>,
        context: &C) -> Result<RealTimePostResponse, ApiError>
    {
        let context = context.clone();
        info!("real_time_post({:?}, {:?}, {:?}) - X-Span-ID: {:?}", event_types, narrow, all_public_streams, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Register an event queue
    async fn register_queue(
        &self,
        apply_markdown: Option<bool>,
        client_gravatar: Option<bool>,
        slim_presence: Option<bool>,
        event_types: Option<&Vec<String>>,
        all_public_streams: Option<bool>,
        include_subscribers: Option<bool>,
        client_capabilities: Option<serde_json::Value>,
        fetch_event_types: Option<&Vec<String>>,
        narrow: Option<&Vec<Vec<String>>>,
        context: &C) -> Result<RegisterQueueResponse, ApiError>
    {
        let context = context.clone();
        info!("register_queue({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", apply_markdown, client_gravatar, slim_presence, event_types, all_public_streams, include_subscribers, client_capabilities, fetch_event_types, narrow, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Error handling
    async fn rest_error_handling(
        &self,
        context: &C) -> Result<RestErrorHandlingResponse, ApiError>
    {
        let context = context.clone();
        info!("rest_error_handling() - X-Span-ID: {:?}", context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Add a code playground
    async fn add_code_playground(
        &self,
        name: String,
        pygments_language: String,
        url_prefix: String,
        context: &C) -> Result<AddCodePlaygroundResponse, ApiError>
    {
        let context = context.clone();
        info!("add_code_playground(\"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", name, pygments_language, url_prefix, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Add a linkifier
    async fn add_linkifier(
        &self,
        pattern: String,
        url_format_string: String,
        context: &C) -> Result<AddLinkifierResponse, ApiError>
    {
        let context = context.clone();
        info!("add_linkifier(\"{}\", \"{}\") - X-Span-ID: {:?}", pattern, url_format_string, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Create a custom profile field
    async fn create_custom_profile_field(
        &self,
        field_type: i32,
        name: Option<String>,
        hint: Option<String>,
        field_data: Option<serde_json::Value>,
        context: &C) -> Result<CreateCustomProfileFieldResponse, ApiError>
    {
        let context = context.clone();
        info!("create_custom_profile_field({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", field_type, name, hint, field_data, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Get all custom emoji
    async fn get_custom_emoji(
        &self,
        context: &C) -> Result<GetCustomEmojiResponse, ApiError>
    {
        let context = context.clone();
        info!("get_custom_emoji() - X-Span-ID: {:?}", context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Get all custom profile fields
    async fn get_custom_profile_fields(
        &self,
        context: &C) -> Result<GetCustomProfileFieldsResponse, ApiError>
    {
        let context = context.clone();
        info!("get_custom_profile_fields() - X-Span-ID: {:?}", context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Get linkifiers
    async fn get_linkifiers(
        &self,
        context: &C) -> Result<GetLinkifiersResponse, ApiError>
    {
        let context = context.clone();
        info!("get_linkifiers() - X-Span-ID: {:?}", context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Get server settings
    async fn get_server_settings(
        &self,
        context: &C) -> Result<GetServerSettingsResponse, ApiError>
    {
        let context = context.clone();
        info!("get_server_settings() - X-Span-ID: {:?}", context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Remove a code playground
    async fn remove_code_playground(
        &self,
        playground_id: i32,
        context: &C) -> Result<RemoveCodePlaygroundResponse, ApiError>
    {
        let context = context.clone();
        info!("remove_code_playground({}) - X-Span-ID: {:?}", playground_id, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Remove a linkifier
    async fn remove_linkifier(
        &self,
        filter_id: i32,
        context: &C) -> Result<RemoveLinkifierResponse, ApiError>
    {
        let context = context.clone();
        info!("remove_linkifier({}) - X-Span-ID: {:?}", filter_id, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Reorder custom profile fields
    async fn reorder_custom_profile_fields(
        &self,
        order: &Vec<i32>,
        context: &C) -> Result<ReorderCustomProfileFieldsResponse, ApiError>
    {
        let context = context.clone();
        info!("reorder_custom_profile_fields({:?}) - X-Span-ID: {:?}", order, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Update a linkifier
    async fn update_linkifier(
        &self,
        filter_id: i32,
        pattern: String,
        url_format_string: String,
        context: &C) -> Result<UpdateLinkifierResponse, ApiError>
    {
        let context = context.clone();
        info!("update_linkifier({}, \"{}\", \"{}\") - X-Span-ID: {:?}", filter_id, pattern, url_format_string, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Upload custom emoji
    async fn upload_custom_emoji(
        &self,
        emoji_name: String,
        filename: Option<swagger::ByteArray>,
        context: &C) -> Result<UploadCustomEmojiResponse, ApiError>
    {
        let context = context.clone();
        info!("upload_custom_emoji(\"{}\", {:?}) - X-Span-ID: {:?}", emoji_name, filename, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Archive a stream
    async fn archive_stream(
        &self,
        stream_id: i32,
        context: &C) -> Result<ArchiveStreamResponse, ApiError>
    {
        let context = context.clone();
        info!("archive_stream({}) - X-Span-ID: {:?}", stream_id, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Create BigBlueButton video call
    async fn create_big_blue_button_video_call(
        &self,
        context: &C) -> Result<CreateBigBlueButtonVideoCallResponse, ApiError>
    {
        let context = context.clone();
        info!("create_big_blue_button_video_call() - X-Span-ID: {:?}", context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Get stream ID
    async fn get_stream_id(
        &self,
        stream: String,
        context: &C) -> Result<GetStreamIdResponse, ApiError>
    {
        let context = context.clone();
        info!("get_stream_id(\"{}\") - X-Span-ID: {:?}", stream, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Get topics in a stream
    async fn get_stream_topics(
        &self,
        stream_id: i32,
        context: &C) -> Result<GetStreamTopicsResponse, ApiError>
    {
        let context = context.clone();
        info!("get_stream_topics({}) - X-Span-ID: {:?}", stream_id, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Get all streams
    async fn get_streams(
        &self,
        include_public: Option<bool>,
        include_web_public: Option<bool>,
        include_subscribed: Option<bool>,
        include_all_active: Option<bool>,
        include_default: Option<bool>,
        include_owner_subscribed: Option<bool>,
        context: &C) -> Result<GetStreamsResponse, ApiError>
    {
        let context = context.clone();
        info!("get_streams({:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", include_public, include_web_public, include_subscribed, include_all_active, include_default, include_owner_subscribed, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Get subscription status
    async fn get_subscription_status(
        &self,
        user_id: i32,
        stream_id: i32,
        context: &C) -> Result<GetSubscriptionStatusResponse, ApiError>
    {
        let context = context.clone();
        info!("get_subscription_status({}, {}) - X-Span-ID: {:?}", user_id, stream_id, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Get subscribed streams
    async fn get_subscriptions(
        &self,
        include_subscribers: Option<bool>,
        context: &C) -> Result<GetSubscriptionsResponse, ApiError>
    {
        let context = context.clone();
        info!("get_subscriptions({:?}) - X-Span-ID: {:?}", include_subscribers, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Topic muting
    async fn mute_topic(
        &self,
        topic: String,
        op: String,
        stream: Option<String>,
        stream_id: Option<i32>,
        context: &C) -> Result<MuteTopicResponse, ApiError>
    {
        let context = context.clone();
        info!("mute_topic(\"{}\", \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", topic, op, stream, stream_id, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Subscribe to a stream
    async fn subscribe(
        &self,
        subscriptions: &Vec<serde_json::Value>,
        principals: Option<&Vec<swagger::OneOf2<String,i32>>>,
        authorization_errors_fatal: Option<bool>,
        announce: Option<bool>,
        invite_only: Option<bool>,
        history_public_to_subscribers: Option<bool>,
        stream_post_policy: Option<i32>,
        message_retention_days: Option<swagger::OneOf2<String,i32>>,
        context: &C) -> Result<SubscribeResponse, ApiError>
    {
        let context = context.clone();
        info!("subscribe({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", subscriptions, principals, authorization_errors_fatal, announce, invite_only, history_public_to_subscribers, stream_post_policy, message_retention_days, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Unsubscribe from a stream
    async fn unsubscribe(
        &self,
        subscriptions: &Vec<String>,
        principals: Option<&Vec<swagger::OneOf2<String,i32>>>,
        context: &C) -> Result<UnsubscribeResponse, ApiError>
    {
        let context = context.clone();
        info!("unsubscribe({:?}, {:?}) - X-Span-ID: {:?}", subscriptions, principals, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Update a stream
    async fn update_stream(
        &self,
        stream_id: i32,
        description: Option<String>,
        new_name: Option<String>,
        is_private: Option<bool>,
        is_announcement_only: Option<bool>,
        stream_post_policy: Option<i32>,
        history_public_to_subscribers: Option<bool>,
        message_retention_days: Option<swagger::OneOf2<String,i32>>,
        context: &C) -> Result<UpdateStreamResponse, ApiError>
    {
        let context = context.clone();
        info!("update_stream({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", stream_id, description, new_name, is_private, is_announcement_only, stream_post_policy, history_public_to_subscribers, message_retention_days, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Update subscription settings
    async fn update_subscription_settings(
        &self,
        subscription_data: &Vec<serde_json::Value>,
        context: &C) -> Result<UpdateSubscriptionSettingsResponse, ApiError>
    {
        let context = context.clone();
        info!("update_subscription_settings({:?}) - X-Span-ID: {:?}", subscription_data, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Update subscriptions
    async fn update_subscriptions(
        &self,
        delete: Option<&Vec<String>>,
        add: Option<&Vec<serde_json::Value>>,
        context: &C) -> Result<UpdateSubscriptionsResponse, ApiError>
    {
        let context = context.clone();
        info!("update_subscriptions({:?}, {:?}) - X-Span-ID: {:?}", delete, add, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Create a user
    async fn create_user(
        &self,
        email: String,
        password: String,
        full_name: String,
        context: &C) -> Result<CreateUserResponse, ApiError>
    {
        let context = context.clone();
        info!("create_user(\"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", email, password, full_name, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Create a user group
    async fn create_user_group(
        &self,
        name: String,
        description: String,
        members: &Vec<i32>,
        context: &C) -> Result<CreateUserGroupResponse, ApiError>
    {
        let context = context.clone();
        info!("create_user_group(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", name, description, members, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Deactivate own user
    async fn deactivate_own_user(
        &self,
        context: &C) -> Result<DeactivateOwnUserResponse, ApiError>
    {
        let context = context.clone();
        info!("deactivate_own_user() - X-Span-ID: {:?}", context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Deactivate a user
    async fn deactivate_user(
        &self,
        user_id: i32,
        context: &C) -> Result<DeactivateUserResponse, ApiError>
    {
        let context = context.clone();
        info!("deactivate_user({}) - X-Span-ID: {:?}", user_id, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Get attachments
    async fn get_attachments(
        &self,
        context: &C) -> Result<GetAttachmentsResponse, ApiError>
    {
        let context = context.clone();
        info!("get_attachments() - X-Span-ID: {:?}", context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Get own user
    async fn get_own_user(
        &self,
        context: &C) -> Result<GetOwnUserResponse, ApiError>
    {
        let context = context.clone();
        info!("get_own_user() - X-Span-ID: {:?}", context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Get a user
    async fn get_user(
        &self,
        user_id: i32,
        client_gravatar: Option<bool>,
        include_custom_profile_fields: Option<bool>,
        context: &C) -> Result<GetUserResponse, ApiError>
    {
        let context = context.clone();
        info!("get_user({}, {:?}, {:?}) - X-Span-ID: {:?}", user_id, client_gravatar, include_custom_profile_fields, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Get a user by email
    async fn get_user_by_email(
        &self,
        email: String,
        client_gravatar: Option<bool>,
        include_custom_profile_fields: Option<bool>,
        context: &C) -> Result<GetUserByEmailResponse, ApiError>
    {
        let context = context.clone();
        info!("get_user_by_email(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", email, client_gravatar, include_custom_profile_fields, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Get user groups
    async fn get_user_groups(
        &self,
        context: &C) -> Result<GetUserGroupsResponse, ApiError>
    {
        let context = context.clone();
        info!("get_user_groups() - X-Span-ID: {:?}", context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Get user presence
    async fn get_user_presence(
        &self,
        user_id_or_email: String,
        context: &C) -> Result<GetUserPresenceResponse, ApiError>
    {
        let context = context.clone();
        info!("get_user_presence(\"{}\") - X-Span-ID: {:?}", user_id_or_email, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Get all users
    async fn get_users(
        &self,
        client_gravatar: Option<bool>,
        include_custom_profile_fields: Option<bool>,
        context: &C) -> Result<GetUsersResponse, ApiError>
    {
        let context = context.clone();
        info!("get_users({:?}, {:?}) - X-Span-ID: {:?}", client_gravatar, include_custom_profile_fields, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Mute a user
    async fn mute_user(
        &self,
        muted_user_id: i32,
        context: &C) -> Result<MuteUserResponse, ApiError>
    {
        let context = context.clone();
        info!("mute_user({}) - X-Span-ID: {:?}", muted_user_id, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Reactivate a user
    async fn reactivate_user(
        &self,
        user_id: i32,
        context: &C) -> Result<ReactivateUserResponse, ApiError>
    {
        let context = context.clone();
        info!("reactivate_user({}) - X-Span-ID: {:?}", user_id, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Delete a user group
    async fn remove_user_group(
        &self,
        user_group_id: i32,
        context: &C) -> Result<RemoveUserGroupResponse, ApiError>
    {
        let context = context.clone();
        info!("remove_user_group({}) - X-Span-ID: {:?}", user_group_id, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Set \"typing\" status
    async fn set_typing_status(
        &self,
        op: String,
        to: &Vec<i32>,
        type_: Option<String>,
        topic: Option<String>,
        context: &C) -> Result<SetTypingStatusResponse, ApiError>
    {
        let context = context.clone();
        info!("set_typing_status(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", op, to, type_, topic, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Unmute a user
    async fn unmute_user(
        &self,
        muted_user_id: i32,
        context: &C) -> Result<UnmuteUserResponse, ApiError>
    {
        let context = context.clone();
        info!("unmute_user({}) - X-Span-ID: {:?}", muted_user_id, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Update display settings
    async fn update_display_settings(
        &self,
        twenty_four_hour_time: Option<bool>,
        dense_mode: Option<bool>,
        starred_message_counts: Option<bool>,
        fluid_layout_width: Option<bool>,
        high_contrast_mode: Option<bool>,
        color_scheme: Option<i32>,
        translate_emoticons: Option<bool>,
        default_language: Option<String>,
        default_view: Option<String>,
        left_side_userlist: Option<bool>,
        emojiset: Option<String>,
        demote_inactive_streams: Option<i32>,
        timezone: Option<String>,
        context: &C) -> Result<UpdateDisplaySettingsResponse, ApiError>
    {
        let context = context.clone();
        info!("update_display_settings({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", twenty_four_hour_time, dense_mode, starred_message_counts, fluid_layout_width, high_contrast_mode, color_scheme, translate_emoticons, default_language, default_view, left_side_userlist, emojiset, demote_inactive_streams, timezone, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Update notification settings
    async fn update_notification_settings(
        &self,
        enable_stream_desktop_notifications: Option<bool>,
        enable_stream_email_notifications: Option<bool>,
        enable_stream_push_notifications: Option<bool>,
        enable_stream_audible_notifications: Option<bool>,
        notification_sound: Option<String>,
        enable_desktop_notifications: Option<bool>,
        enable_sounds: Option<bool>,
        enable_offline_email_notifications: Option<bool>,
        enable_offline_push_notifications: Option<bool>,
        enable_online_push_notifications: Option<bool>,
        enable_digest_emails: Option<bool>,
        enable_marketing_emails: Option<bool>,
        enable_login_emails: Option<bool>,
        message_content_in_email_notifications: Option<bool>,
        pm_content_in_desktop_notifications: Option<bool>,
        wildcard_mentions_notify: Option<bool>,
        desktop_icon_count_display: Option<i32>,
        realm_name_in_notifications: Option<bool>,
        presence_enabled: Option<bool>,
        context: &C) -> Result<UpdateNotificationSettingsResponse, ApiError>
    {
        let context = context.clone();
        info!("update_notification_settings({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", enable_stream_desktop_notifications, enable_stream_email_notifications, enable_stream_push_notifications, enable_stream_audible_notifications, notification_sound, enable_desktop_notifications, enable_sounds, enable_offline_email_notifications, enable_offline_push_notifications, enable_online_push_notifications, enable_digest_emails, enable_marketing_emails, enable_login_emails, message_content_in_email_notifications, pm_content_in_desktop_notifications, wildcard_mentions_notify, desktop_icon_count_display, realm_name_in_notifications, presence_enabled, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Update a user
    async fn update_user(
        &self,
        user_id: i32,
        full_name: Option<String>,
        role: Option<i32>,
        profile_data: Option<&Vec<serde_json::Value>>,
        context: &C) -> Result<UpdateUserResponse, ApiError>
    {
        let context = context.clone();
        info!("update_user({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", user_id, full_name, role, profile_data, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Update a user group
    async fn update_user_group(
        &self,
        user_group_id: i32,
        name: String,
        description: String,
        context: &C) -> Result<UpdateUserGroupResponse, ApiError>
    {
        let context = context.clone();
        info!("update_user_group({}, \"{}\", \"{}\") - X-Span-ID: {:?}", user_group_id, name, description, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Update user group members
    async fn update_user_group_members(
        &self,
        user_group_id: i32,
        delete: Option<&Vec<i32>>,
        add: Option<&Vec<i32>>,
        context: &C) -> Result<UpdateUserGroupMembersResponse, ApiError>
    {
        let context = context.clone();
        info!("update_user_group_members({}, {:?}, {:?}) - X-Span-ID: {:?}", user_group_id, delete, add, context.get().0.clone());
        Err("Generic failuare".into())
    }

    /// Outgoing webhooks
    async fn zulip_outgoing_webhooks(
        &self,
        context: &C) -> Result<ZulipOutgoingWebhooksResponse, ApiError>
    {
        let context = context.clone();
        info!("zulip_outgoing_webhooks() - X-Span-ID: {:?}", context.get().0.clone());
        Err("Generic failuare".into())
    }

}
