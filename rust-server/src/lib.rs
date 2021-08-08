#![allow(missing_docs, trivial_casts, unused_variables, unused_mut, unused_imports, unused_extern_crates, non_camel_case_types)]

use async_trait::async_trait;
use futures::Stream;
use std::error::Error;
use std::task::{Poll, Context};
use swagger::{ApiError, ContextWrapper};
use serde::{Serialize, Deserialize};

type ServiceError = Box<dyn Error + Send + Sync + 'static>;

pub const BASE_PATH: &'static str = "/api/v1";
pub const API_VERSION: &'static str = "1.0.0";

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum DevFetchApiKeyResponse {
    /// Success.
    Success
    (ApiKeyResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum FetchApiKeyResponse {
    /// Valid credentials the client can use to access the Zulip API.
    ValidCredentialsTheClientCanUseToAccessTheZulipAPI
    (ApiKeyResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AddReactionResponse {
    /// Success.
    Success
    (JsonSuccess)
    ,
    /// Bad request.
    BadRequest
    (CodedError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CheckMessagesMatchNarrowResponse {
    /// Success.
    Success
    (serde_json::Value)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum DeleteMessageResponse {
    /// Success.
    Success
    (JsonSuccess)
    ,
    /// Bad request.
    BadRequest
    (swagger::OneOf2<InvalidMessageError,CodedError>)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetFileTemporaryUrlResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetMessageHistoryResponse {
    /// Success.
    Success
    (JsonSuccessBase)
    ,
    /// Bad request.
    BadRequest
    (InvalidMessageError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetMessagesResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetRawMessageResponse {
    /// Success.
    Success
    (JsonSuccessBase)
    ,
    /// Bad request.
    BadRequest
    (InvalidMessageError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MarkAllAsReadResponse {
    /// Success.
    Success
    (JsonSuccess)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MarkStreamAsReadResponse {
    /// Success.
    Success
    (JsonSuccess)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MarkTopicAsReadResponse {
    /// Success.
    Success
    (JsonSuccess)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum RemoveReactionResponse {
    /// Success.
    Success
    (JsonSuccess)
    ,
    /// Bad request.
    BadRequest
    (CodedError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum RenderMessageResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SendMessageResponse {
    /// Success.
    Success
    (JsonSuccessBase)
    ,
    /// Bad request.
    BadRequest
    (swagger::OneOf2<NonExistingStreamError,CodedError>)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UpdateMessageResponse {
    /// Success.
    Success
    (JsonSuccess)
    ,
    /// Bad request.
    BadRequest
    (CodedError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum UpdateMessageFlagsResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum UploadFileResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum DeleteQueueResponse {
    /// Success.
    Success
    (JsonSuccess)
    ,
    /// Bad request.
    BadRequest
    (BadEventQueueIdError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetEventsResponse {
    /// Success.
    Success
    (JsonSuccessBase)
    ,
    /// Bad request.
    BadRequest
    (BadEventQueueIdError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum RealTimePostResponse {
    /// Success
    Success
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum RegisterQueueResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum RestErrorHandlingResponse {
    /// Bad request. 
    BadRequest
    (swagger::OneOf3<models::InvalidApiKeyError,models::MissingArgumentError,models::UserNotAuthorizedError>)
    ,
    /// Unauthorized. 
    Unauthorized
    (swagger::OneOf2<models::UserDeactivatedError,models::RealmDeactivatedError>)
    ,
    /// Rate limit exceeded. 
    RateLimitExceeded
    (swagger::OneOf1<models::RateLimitedError>)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum AddCodePlaygroundResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum AddLinkifierResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateCustomProfileFieldResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetCustomEmojiResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetCustomProfileFieldsResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetLinkifiersResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetServerSettingsResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum RemoveCodePlaygroundResponse {
    /// Success.
    Success
    (JsonSuccess)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum RemoveLinkifierResponse {
    /// Success.
    Success
    (JsonSuccess)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ReorderCustomProfileFieldsResponse {
    /// Success.
    Success
    (JsonSuccess)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum UpdateLinkifierResponse {
    /// Success.
    Success
    (JsonSuccess)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum UploadCustomEmojiResponse {
    /// Success.
    Success
    (JsonSuccess)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ArchiveStreamResponse {
    /// Success.
    Success
    (JsonSuccess)
    ,
    /// Bad request.
    BadRequest
    (JsonError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateBigBlueButtonVideoCallResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetStreamIdResponse {
    /// Success.
    Success
    (JsonSuccessBase)
    ,
    /// Bad request.
    BadRequest
    (CodedError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetStreamTopicsResponse {
    /// Success.
    Success
    (JsonSuccessBase)
    ,
    /// Bad request.
    BadRequest
    (JsonError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetStreamsResponse {
    /// Success.
    Success
    (JsonSuccessBase)
    ,
    /// Bad request.
    BadRequest
    (CodedError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetSubscriptionStatusResponse {
    /// Success
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetSubscriptionsResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum MuteTopicResponse {
    /// Success.
    Success
    (JsonSuccess)
    ,
    /// Bad request.
    BadRequest
    (swagger::OneOf2<JsonError,JsonError>)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SubscribeResponse {
    /// Success.
    Success
    (swagger::OneOf2<AddSubscriptionsResponse,AddSubscriptionsResponse>)
    ,
    /// Success.
    Success_2
    (swagger::OneOf2<AddSubscriptionsResponse,AddSubscriptionsResponse>)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UnsubscribeResponse {
    /// Success.
    Success
    (JsonSuccessBase)
    ,
    /// Bad request.
    BadRequest
    (NonExistingStreamError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UpdateStreamResponse {
    /// Success.
    Success
    (JsonSuccess)
    ,
    /// Bad request.
    BadRequest
    (JsonError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum UpdateSubscriptionSettingsResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum UpdateSubscriptionsResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CreateUserResponse {
    /// Success.
    Success
    (JsonSuccessBase)
    ,
    /// Bad request.
    BadRequest
    (JsonError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CreateUserGroupResponse {
    /// Success.
    Success
    (JsonSuccess)
    ,
    /// Bad request.
    BadRequest
    (JsonError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum DeactivateOwnUserResponse {
    /// Success.
    Success
    (JsonSuccess)
    ,
    /// Bad request.
    BadRequest
    (JsonError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum DeactivateUserResponse {
    /// Success
    Success
    (JsonSuccess)
    ,
    /// Bad request
    BadRequest
    (JsonError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetAttachmentsResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetOwnUserResponse {
    /// Success
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetUserResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetUserByEmailResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetUserGroupsResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetUserPresenceResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetUsersResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum MuteUserResponse {
    /// Success.
    Success
    (JsonSuccess)
    ,
    /// Bad request.
    BadRequest
    (swagger::OneOf3<JsonError,JsonError,JsonError>)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ReactivateUserResponse {
    /// Success
    Success
    (serde_json::Value)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum RemoveUserGroupResponse {
    /// Success.
    Success
    (JsonSuccess)
    ,
    /// Bad request.
    BadRequest
    (JsonError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SetTypingStatusResponse {
    /// Success.
    Success
    (JsonSuccess)
    ,
    /// Bad request.
    BadRequest
    (JsonError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UnmuteUserResponse {
    /// Success.
    Success
    (JsonSuccess)
    ,
    /// Bad request.
    BadRequest
    (swagger::OneOf2<JsonError,JsonError>)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum UpdateDisplaySettingsResponse {
    /// Success
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum UpdateNotificationSettingsResponse {
    /// Success.
    Success
    (JsonSuccessBase)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UpdateUserResponse {
    /// Success.
    Success
    (JsonSuccess)
    ,
    /// Bad request.
    BadRequest
    (CodedError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UpdateUserGroupResponse {
    /// Success.
    Success
    (JsonSuccess)
    ,
    /// Bad request.
    BadRequest
    (JsonError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum UpdateUserGroupMembersResponse {
    /// Success.
    Success
    (JsonSuccess)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ZulipOutgoingWebhooksResponse {
    /// Success 
    Success
    (models::InlineResponse200)
}

/// API
#[async_trait]
pub trait Api<C: Send + Sync> {
    fn poll_ready(&self, _cx: &mut Context) -> Poll<Result<(), Box<dyn Error + Send + Sync + 'static>>> {
        Poll::Ready(Ok(()))
    }

    /// Fetch an API key (development only)
    async fn dev_fetch_api_key(
        &self,
        username: String,
        context: &C) -> Result<DevFetchApiKeyResponse, ApiError>;

    /// Fetch an API key (production)
    async fn fetch_api_key(
        &self,
        username: String,
        password: String,
        context: &C) -> Result<FetchApiKeyResponse, ApiError>;

    /// Add an emoji reaction
    async fn add_reaction(
        &self,
        message_id: i32,
        emoji_name: String,
        emoji_code: Option<String>,
        reaction_type: Option<String>,
        context: &C) -> Result<AddReactionResponse, ApiError>;

    /// Check if messages match a narrow
    async fn check_messages_match_narrow(
        &self,
        msg_ids: &Vec<i32>,
        narrow: &Vec<serde_json::Value>,
        context: &C) -> Result<CheckMessagesMatchNarrowResponse, ApiError>;

    /// Delete a message
    async fn delete_message(
        &self,
        message_id: i32,
        context: &C) -> Result<DeleteMessageResponse, ApiError>;

    /// Get public temporary URL
    async fn get_file_temporary_url(
        &self,
        realm_id_str: i32,
        filename: String,
        context: &C) -> Result<GetFileTemporaryUrlResponse, ApiError>;

    /// Get a message's edit history
    async fn get_message_history(
        &self,
        message_id: i32,
        context: &C) -> Result<GetMessageHistoryResponse, ApiError>;

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
        context: &C) -> Result<GetMessagesResponse, ApiError>;

    /// Get a message's raw Markdown
    async fn get_raw_message(
        &self,
        message_id: i32,
        context: &C) -> Result<GetRawMessageResponse, ApiError>;

    /// Mark all messages as read
    async fn mark_all_as_read(
        &self,
        context: &C) -> Result<MarkAllAsReadResponse, ApiError>;

    /// Mark messages in a stream as read
    async fn mark_stream_as_read(
        &self,
        stream_id: i32,
        context: &C) -> Result<MarkStreamAsReadResponse, ApiError>;

    /// Mark messages in a topic as read
    async fn mark_topic_as_read(
        &self,
        stream_id: i32,
        topic_name: String,
        context: &C) -> Result<MarkTopicAsReadResponse, ApiError>;

    /// Remove an emoji reaction
    async fn remove_reaction(
        &self,
        message_id: i32,
        emoji_name: Option<String>,
        emoji_code: Option<String>,
        reaction_type: Option<String>,
        context: &C) -> Result<RemoveReactionResponse, ApiError>;

    /// Render message
    async fn render_message(
        &self,
        content: String,
        context: &C) -> Result<RenderMessageResponse, ApiError>;

    /// Send a message
    async fn send_message(
        &self,
        type_: String,
        to: &Vec<i32>,
        content: String,
        topic: Option<String>,
        queue_id: Option<String>,
        local_id: Option<String>,
        context: &C) -> Result<SendMessageResponse, ApiError>;

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
        context: &C) -> Result<UpdateMessageResponse, ApiError>;

    /// Update personal message flags
    async fn update_message_flags(
        &self,
        messages: &Vec<i32>,
        op: String,
        flag: String,
        context: &C) -> Result<UpdateMessageFlagsResponse, ApiError>;

    /// Upload a file
    async fn upload_file(
        &self,
        filename: Option<swagger::ByteArray>,
        context: &C) -> Result<UploadFileResponse, ApiError>;

    /// Delete an event queue
    async fn delete_queue(
        &self,
        queue_id: String,
        context: &C) -> Result<DeleteQueueResponse, ApiError>;

    /// Get events from an event queue
    async fn get_events(
        &self,
        queue_id: String,
        last_event_id: Option<i32>,
        dont_block: Option<bool>,
        context: &C) -> Result<GetEventsResponse, ApiError>;

    async fn real_time_post(
        &self,
        event_types: Option<&Vec<String>>,
        narrow: Option<&Vec<Vec<String>>>,
        all_public_streams: Option<bool>,
        context: &C) -> Result<RealTimePostResponse, ApiError>;

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
        context: &C) -> Result<RegisterQueueResponse, ApiError>;

    /// Error handling
    async fn rest_error_handling(
        &self,
        context: &C) -> Result<RestErrorHandlingResponse, ApiError>;

    /// Add a code playground
    async fn add_code_playground(
        &self,
        name: String,
        pygments_language: String,
        url_prefix: String,
        context: &C) -> Result<AddCodePlaygroundResponse, ApiError>;

    /// Add a linkifier
    async fn add_linkifier(
        &self,
        pattern: String,
        url_format_string: String,
        context: &C) -> Result<AddLinkifierResponse, ApiError>;

    /// Create a custom profile field
    async fn create_custom_profile_field(
        &self,
        field_type: i32,
        name: Option<String>,
        hint: Option<String>,
        field_data: Option<serde_json::Value>,
        context: &C) -> Result<CreateCustomProfileFieldResponse, ApiError>;

    /// Get all custom emoji
    async fn get_custom_emoji(
        &self,
        context: &C) -> Result<GetCustomEmojiResponse, ApiError>;

    /// Get all custom profile fields
    async fn get_custom_profile_fields(
        &self,
        context: &C) -> Result<GetCustomProfileFieldsResponse, ApiError>;

    /// Get linkifiers
    async fn get_linkifiers(
        &self,
        context: &C) -> Result<GetLinkifiersResponse, ApiError>;

    /// Get server settings
    async fn get_server_settings(
        &self,
        context: &C) -> Result<GetServerSettingsResponse, ApiError>;

    /// Remove a code playground
    async fn remove_code_playground(
        &self,
        playground_id: i32,
        context: &C) -> Result<RemoveCodePlaygroundResponse, ApiError>;

    /// Remove a linkifier
    async fn remove_linkifier(
        &self,
        filter_id: i32,
        context: &C) -> Result<RemoveLinkifierResponse, ApiError>;

    /// Reorder custom profile fields
    async fn reorder_custom_profile_fields(
        &self,
        order: &Vec<i32>,
        context: &C) -> Result<ReorderCustomProfileFieldsResponse, ApiError>;

    /// Update a linkifier
    async fn update_linkifier(
        &self,
        filter_id: i32,
        pattern: String,
        url_format_string: String,
        context: &C) -> Result<UpdateLinkifierResponse, ApiError>;

    /// Upload custom emoji
    async fn upload_custom_emoji(
        &self,
        emoji_name: String,
        filename: Option<swagger::ByteArray>,
        context: &C) -> Result<UploadCustomEmojiResponse, ApiError>;

    /// Archive a stream
    async fn archive_stream(
        &self,
        stream_id: i32,
        context: &C) -> Result<ArchiveStreamResponse, ApiError>;

    /// Create BigBlueButton video call
    async fn create_big_blue_button_video_call(
        &self,
        context: &C) -> Result<CreateBigBlueButtonVideoCallResponse, ApiError>;

    /// Get stream ID
    async fn get_stream_id(
        &self,
        stream: String,
        context: &C) -> Result<GetStreamIdResponse, ApiError>;

    /// Get topics in a stream
    async fn get_stream_topics(
        &self,
        stream_id: i32,
        context: &C) -> Result<GetStreamTopicsResponse, ApiError>;

    /// Get all streams
    async fn get_streams(
        &self,
        include_public: Option<bool>,
        include_web_public: Option<bool>,
        include_subscribed: Option<bool>,
        include_all_active: Option<bool>,
        include_default: Option<bool>,
        include_owner_subscribed: Option<bool>,
        context: &C) -> Result<GetStreamsResponse, ApiError>;

    /// Get subscription status
    async fn get_subscription_status(
        &self,
        user_id: i32,
        stream_id: i32,
        context: &C) -> Result<GetSubscriptionStatusResponse, ApiError>;

    /// Get subscribed streams
    async fn get_subscriptions(
        &self,
        include_subscribers: Option<bool>,
        context: &C) -> Result<GetSubscriptionsResponse, ApiError>;

    /// Topic muting
    async fn mute_topic(
        &self,
        topic: String,
        op: String,
        stream: Option<String>,
        stream_id: Option<i32>,
        context: &C) -> Result<MuteTopicResponse, ApiError>;

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
        context: &C) -> Result<SubscribeResponse, ApiError>;

    /// Unsubscribe from a stream
    async fn unsubscribe(
        &self,
        subscriptions: &Vec<String>,
        principals: Option<&Vec<swagger::OneOf2<String,i32>>>,
        context: &C) -> Result<UnsubscribeResponse, ApiError>;

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
        context: &C) -> Result<UpdateStreamResponse, ApiError>;

    /// Update subscription settings
    async fn update_subscription_settings(
        &self,
        subscription_data: &Vec<serde_json::Value>,
        context: &C) -> Result<UpdateSubscriptionSettingsResponse, ApiError>;

    /// Update subscriptions
    async fn update_subscriptions(
        &self,
        delete: Option<&Vec<String>>,
        add: Option<&Vec<serde_json::Value>>,
        context: &C) -> Result<UpdateSubscriptionsResponse, ApiError>;

    /// Create a user
    async fn create_user(
        &self,
        email: String,
        password: String,
        full_name: String,
        context: &C) -> Result<CreateUserResponse, ApiError>;

    /// Create a user group
    async fn create_user_group(
        &self,
        name: String,
        description: String,
        members: &Vec<i32>,
        context: &C) -> Result<CreateUserGroupResponse, ApiError>;

    /// Deactivate own user
    async fn deactivate_own_user(
        &self,
        context: &C) -> Result<DeactivateOwnUserResponse, ApiError>;

    /// Deactivate a user
    async fn deactivate_user(
        &self,
        user_id: i32,
        context: &C) -> Result<DeactivateUserResponse, ApiError>;

    /// Get attachments
    async fn get_attachments(
        &self,
        context: &C) -> Result<GetAttachmentsResponse, ApiError>;

    /// Get own user
    async fn get_own_user(
        &self,
        context: &C) -> Result<GetOwnUserResponse, ApiError>;

    /// Get a user
    async fn get_user(
        &self,
        user_id: i32,
        client_gravatar: Option<bool>,
        include_custom_profile_fields: Option<bool>,
        context: &C) -> Result<GetUserResponse, ApiError>;

    /// Get a user by email
    async fn get_user_by_email(
        &self,
        email: String,
        client_gravatar: Option<bool>,
        include_custom_profile_fields: Option<bool>,
        context: &C) -> Result<GetUserByEmailResponse, ApiError>;

    /// Get user groups
    async fn get_user_groups(
        &self,
        context: &C) -> Result<GetUserGroupsResponse, ApiError>;

    /// Get user presence
    async fn get_user_presence(
        &self,
        user_id_or_email: String,
        context: &C) -> Result<GetUserPresenceResponse, ApiError>;

    /// Get all users
    async fn get_users(
        &self,
        client_gravatar: Option<bool>,
        include_custom_profile_fields: Option<bool>,
        context: &C) -> Result<GetUsersResponse, ApiError>;

    /// Mute a user
    async fn mute_user(
        &self,
        muted_user_id: i32,
        context: &C) -> Result<MuteUserResponse, ApiError>;

    /// Reactivate a user
    async fn reactivate_user(
        &self,
        user_id: i32,
        context: &C) -> Result<ReactivateUserResponse, ApiError>;

    /// Delete a user group
    async fn remove_user_group(
        &self,
        user_group_id: i32,
        context: &C) -> Result<RemoveUserGroupResponse, ApiError>;

    /// Set \"typing\" status
    async fn set_typing_status(
        &self,
        op: String,
        to: &Vec<i32>,
        type_: Option<String>,
        topic: Option<String>,
        context: &C) -> Result<SetTypingStatusResponse, ApiError>;

    /// Unmute a user
    async fn unmute_user(
        &self,
        muted_user_id: i32,
        context: &C) -> Result<UnmuteUserResponse, ApiError>;

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
        context: &C) -> Result<UpdateDisplaySettingsResponse, ApiError>;

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
        context: &C) -> Result<UpdateNotificationSettingsResponse, ApiError>;

    /// Update a user
    async fn update_user(
        &self,
        user_id: i32,
        full_name: Option<String>,
        role: Option<i32>,
        profile_data: Option<&Vec<serde_json::Value>>,
        context: &C) -> Result<UpdateUserResponse, ApiError>;

    /// Update a user group
    async fn update_user_group(
        &self,
        user_group_id: i32,
        name: String,
        description: String,
        context: &C) -> Result<UpdateUserGroupResponse, ApiError>;

    /// Update user group members
    async fn update_user_group_members(
        &self,
        user_group_id: i32,
        delete: Option<&Vec<i32>>,
        add: Option<&Vec<i32>>,
        context: &C) -> Result<UpdateUserGroupMembersResponse, ApiError>;

    /// Outgoing webhooks
    async fn zulip_outgoing_webhooks(
        &self,
        context: &C) -> Result<ZulipOutgoingWebhooksResponse, ApiError>;

}

/// API where `Context` isn't passed on every API call
#[async_trait]
pub trait ApiNoContext<C: Send + Sync> {

    fn poll_ready(&self, _cx: &mut Context) -> Poll<Result<(), Box<dyn Error + Send + Sync + 'static>>>;

    fn context(&self) -> &C;

    /// Fetch an API key (development only)
    async fn dev_fetch_api_key(
        &self,
        username: String,
        ) -> Result<DevFetchApiKeyResponse, ApiError>;

    /// Fetch an API key (production)
    async fn fetch_api_key(
        &self,
        username: String,
        password: String,
        ) -> Result<FetchApiKeyResponse, ApiError>;

    /// Add an emoji reaction
    async fn add_reaction(
        &self,
        message_id: i32,
        emoji_name: String,
        emoji_code: Option<String>,
        reaction_type: Option<String>,
        ) -> Result<AddReactionResponse, ApiError>;

    /// Check if messages match a narrow
    async fn check_messages_match_narrow(
        &self,
        msg_ids: &Vec<i32>,
        narrow: &Vec<serde_json::Value>,
        ) -> Result<CheckMessagesMatchNarrowResponse, ApiError>;

    /// Delete a message
    async fn delete_message(
        &self,
        message_id: i32,
        ) -> Result<DeleteMessageResponse, ApiError>;

    /// Get public temporary URL
    async fn get_file_temporary_url(
        &self,
        realm_id_str: i32,
        filename: String,
        ) -> Result<GetFileTemporaryUrlResponse, ApiError>;

    /// Get a message's edit history
    async fn get_message_history(
        &self,
        message_id: i32,
        ) -> Result<GetMessageHistoryResponse, ApiError>;

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
        ) -> Result<GetMessagesResponse, ApiError>;

    /// Get a message's raw Markdown
    async fn get_raw_message(
        &self,
        message_id: i32,
        ) -> Result<GetRawMessageResponse, ApiError>;

    /// Mark all messages as read
    async fn mark_all_as_read(
        &self,
        ) -> Result<MarkAllAsReadResponse, ApiError>;

    /// Mark messages in a stream as read
    async fn mark_stream_as_read(
        &self,
        stream_id: i32,
        ) -> Result<MarkStreamAsReadResponse, ApiError>;

    /// Mark messages in a topic as read
    async fn mark_topic_as_read(
        &self,
        stream_id: i32,
        topic_name: String,
        ) -> Result<MarkTopicAsReadResponse, ApiError>;

    /// Remove an emoji reaction
    async fn remove_reaction(
        &self,
        message_id: i32,
        emoji_name: Option<String>,
        emoji_code: Option<String>,
        reaction_type: Option<String>,
        ) -> Result<RemoveReactionResponse, ApiError>;

    /// Render message
    async fn render_message(
        &self,
        content: String,
        ) -> Result<RenderMessageResponse, ApiError>;

    /// Send a message
    async fn send_message(
        &self,
        type_: String,
        to: &Vec<i32>,
        content: String,
        topic: Option<String>,
        queue_id: Option<String>,
        local_id: Option<String>,
        ) -> Result<SendMessageResponse, ApiError>;

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
        ) -> Result<UpdateMessageResponse, ApiError>;

    /// Update personal message flags
    async fn update_message_flags(
        &self,
        messages: &Vec<i32>,
        op: String,
        flag: String,
        ) -> Result<UpdateMessageFlagsResponse, ApiError>;

    /// Upload a file
    async fn upload_file(
        &self,
        filename: Option<swagger::ByteArray>,
        ) -> Result<UploadFileResponse, ApiError>;

    /// Delete an event queue
    async fn delete_queue(
        &self,
        queue_id: String,
        ) -> Result<DeleteQueueResponse, ApiError>;

    /// Get events from an event queue
    async fn get_events(
        &self,
        queue_id: String,
        last_event_id: Option<i32>,
        dont_block: Option<bool>,
        ) -> Result<GetEventsResponse, ApiError>;

    async fn real_time_post(
        &self,
        event_types: Option<&Vec<String>>,
        narrow: Option<&Vec<Vec<String>>>,
        all_public_streams: Option<bool>,
        ) -> Result<RealTimePostResponse, ApiError>;

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
        ) -> Result<RegisterQueueResponse, ApiError>;

    /// Error handling
    async fn rest_error_handling(
        &self,
        ) -> Result<RestErrorHandlingResponse, ApiError>;

    /// Add a code playground
    async fn add_code_playground(
        &self,
        name: String,
        pygments_language: String,
        url_prefix: String,
        ) -> Result<AddCodePlaygroundResponse, ApiError>;

    /// Add a linkifier
    async fn add_linkifier(
        &self,
        pattern: String,
        url_format_string: String,
        ) -> Result<AddLinkifierResponse, ApiError>;

    /// Create a custom profile field
    async fn create_custom_profile_field(
        &self,
        field_type: i32,
        name: Option<String>,
        hint: Option<String>,
        field_data: Option<serde_json::Value>,
        ) -> Result<CreateCustomProfileFieldResponse, ApiError>;

    /// Get all custom emoji
    async fn get_custom_emoji(
        &self,
        ) -> Result<GetCustomEmojiResponse, ApiError>;

    /// Get all custom profile fields
    async fn get_custom_profile_fields(
        &self,
        ) -> Result<GetCustomProfileFieldsResponse, ApiError>;

    /// Get linkifiers
    async fn get_linkifiers(
        &self,
        ) -> Result<GetLinkifiersResponse, ApiError>;

    /// Get server settings
    async fn get_server_settings(
        &self,
        ) -> Result<GetServerSettingsResponse, ApiError>;

    /// Remove a code playground
    async fn remove_code_playground(
        &self,
        playground_id: i32,
        ) -> Result<RemoveCodePlaygroundResponse, ApiError>;

    /// Remove a linkifier
    async fn remove_linkifier(
        &self,
        filter_id: i32,
        ) -> Result<RemoveLinkifierResponse, ApiError>;

    /// Reorder custom profile fields
    async fn reorder_custom_profile_fields(
        &self,
        order: &Vec<i32>,
        ) -> Result<ReorderCustomProfileFieldsResponse, ApiError>;

    /// Update a linkifier
    async fn update_linkifier(
        &self,
        filter_id: i32,
        pattern: String,
        url_format_string: String,
        ) -> Result<UpdateLinkifierResponse, ApiError>;

    /// Upload custom emoji
    async fn upload_custom_emoji(
        &self,
        emoji_name: String,
        filename: Option<swagger::ByteArray>,
        ) -> Result<UploadCustomEmojiResponse, ApiError>;

    /// Archive a stream
    async fn archive_stream(
        &self,
        stream_id: i32,
        ) -> Result<ArchiveStreamResponse, ApiError>;

    /// Create BigBlueButton video call
    async fn create_big_blue_button_video_call(
        &self,
        ) -> Result<CreateBigBlueButtonVideoCallResponse, ApiError>;

    /// Get stream ID
    async fn get_stream_id(
        &self,
        stream: String,
        ) -> Result<GetStreamIdResponse, ApiError>;

    /// Get topics in a stream
    async fn get_stream_topics(
        &self,
        stream_id: i32,
        ) -> Result<GetStreamTopicsResponse, ApiError>;

    /// Get all streams
    async fn get_streams(
        &self,
        include_public: Option<bool>,
        include_web_public: Option<bool>,
        include_subscribed: Option<bool>,
        include_all_active: Option<bool>,
        include_default: Option<bool>,
        include_owner_subscribed: Option<bool>,
        ) -> Result<GetStreamsResponse, ApiError>;

    /// Get subscription status
    async fn get_subscription_status(
        &self,
        user_id: i32,
        stream_id: i32,
        ) -> Result<GetSubscriptionStatusResponse, ApiError>;

    /// Get subscribed streams
    async fn get_subscriptions(
        &self,
        include_subscribers: Option<bool>,
        ) -> Result<GetSubscriptionsResponse, ApiError>;

    /// Topic muting
    async fn mute_topic(
        &self,
        topic: String,
        op: String,
        stream: Option<String>,
        stream_id: Option<i32>,
        ) -> Result<MuteTopicResponse, ApiError>;

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
        ) -> Result<SubscribeResponse, ApiError>;

    /// Unsubscribe from a stream
    async fn unsubscribe(
        &self,
        subscriptions: &Vec<String>,
        principals: Option<&Vec<swagger::OneOf2<String,i32>>>,
        ) -> Result<UnsubscribeResponse, ApiError>;

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
        ) -> Result<UpdateStreamResponse, ApiError>;

    /// Update subscription settings
    async fn update_subscription_settings(
        &self,
        subscription_data: &Vec<serde_json::Value>,
        ) -> Result<UpdateSubscriptionSettingsResponse, ApiError>;

    /// Update subscriptions
    async fn update_subscriptions(
        &self,
        delete: Option<&Vec<String>>,
        add: Option<&Vec<serde_json::Value>>,
        ) -> Result<UpdateSubscriptionsResponse, ApiError>;

    /// Create a user
    async fn create_user(
        &self,
        email: String,
        password: String,
        full_name: String,
        ) -> Result<CreateUserResponse, ApiError>;

    /// Create a user group
    async fn create_user_group(
        &self,
        name: String,
        description: String,
        members: &Vec<i32>,
        ) -> Result<CreateUserGroupResponse, ApiError>;

    /// Deactivate own user
    async fn deactivate_own_user(
        &self,
        ) -> Result<DeactivateOwnUserResponse, ApiError>;

    /// Deactivate a user
    async fn deactivate_user(
        &self,
        user_id: i32,
        ) -> Result<DeactivateUserResponse, ApiError>;

    /// Get attachments
    async fn get_attachments(
        &self,
        ) -> Result<GetAttachmentsResponse, ApiError>;

    /// Get own user
    async fn get_own_user(
        &self,
        ) -> Result<GetOwnUserResponse, ApiError>;

    /// Get a user
    async fn get_user(
        &self,
        user_id: i32,
        client_gravatar: Option<bool>,
        include_custom_profile_fields: Option<bool>,
        ) -> Result<GetUserResponse, ApiError>;

    /// Get a user by email
    async fn get_user_by_email(
        &self,
        email: String,
        client_gravatar: Option<bool>,
        include_custom_profile_fields: Option<bool>,
        ) -> Result<GetUserByEmailResponse, ApiError>;

    /// Get user groups
    async fn get_user_groups(
        &self,
        ) -> Result<GetUserGroupsResponse, ApiError>;

    /// Get user presence
    async fn get_user_presence(
        &self,
        user_id_or_email: String,
        ) -> Result<GetUserPresenceResponse, ApiError>;

    /// Get all users
    async fn get_users(
        &self,
        client_gravatar: Option<bool>,
        include_custom_profile_fields: Option<bool>,
        ) -> Result<GetUsersResponse, ApiError>;

    /// Mute a user
    async fn mute_user(
        &self,
        muted_user_id: i32,
        ) -> Result<MuteUserResponse, ApiError>;

    /// Reactivate a user
    async fn reactivate_user(
        &self,
        user_id: i32,
        ) -> Result<ReactivateUserResponse, ApiError>;

    /// Delete a user group
    async fn remove_user_group(
        &self,
        user_group_id: i32,
        ) -> Result<RemoveUserGroupResponse, ApiError>;

    /// Set \"typing\" status
    async fn set_typing_status(
        &self,
        op: String,
        to: &Vec<i32>,
        type_: Option<String>,
        topic: Option<String>,
        ) -> Result<SetTypingStatusResponse, ApiError>;

    /// Unmute a user
    async fn unmute_user(
        &self,
        muted_user_id: i32,
        ) -> Result<UnmuteUserResponse, ApiError>;

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
        ) -> Result<UpdateDisplaySettingsResponse, ApiError>;

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
        ) -> Result<UpdateNotificationSettingsResponse, ApiError>;

    /// Update a user
    async fn update_user(
        &self,
        user_id: i32,
        full_name: Option<String>,
        role: Option<i32>,
        profile_data: Option<&Vec<serde_json::Value>>,
        ) -> Result<UpdateUserResponse, ApiError>;

    /// Update a user group
    async fn update_user_group(
        &self,
        user_group_id: i32,
        name: String,
        description: String,
        ) -> Result<UpdateUserGroupResponse, ApiError>;

    /// Update user group members
    async fn update_user_group_members(
        &self,
        user_group_id: i32,
        delete: Option<&Vec<i32>>,
        add: Option<&Vec<i32>>,
        ) -> Result<UpdateUserGroupMembersResponse, ApiError>;

    /// Outgoing webhooks
    async fn zulip_outgoing_webhooks(
        &self,
        ) -> Result<ZulipOutgoingWebhooksResponse, ApiError>;

}

/// Trait to extend an API to make it easy to bind it to a context.
pub trait ContextWrapperExt<C: Send + Sync> where Self: Sized
{
    /// Binds this API to a context.
    fn with_context(self: Self, context: C) -> ContextWrapper<Self, C>;
}

impl<T: Api<C> + Send + Sync, C: Clone + Send + Sync> ContextWrapperExt<C> for T {
    fn with_context(self: T, context: C) -> ContextWrapper<T, C> {
         ContextWrapper::<T, C>::new(self, context)
    }
}

#[async_trait]
impl<T: Api<C> + Send + Sync, C: Clone + Send + Sync> ApiNoContext<C> for ContextWrapper<T, C> {
    fn poll_ready(&self, cx: &mut Context) -> Poll<Result<(), ServiceError>> {
        self.api().poll_ready(cx)
    }

    fn context(&self) -> &C {
        ContextWrapper::context(self)
    }

    /// Fetch an API key (development only)
    async fn dev_fetch_api_key(
        &self,
        username: String,
        ) -> Result<DevFetchApiKeyResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().dev_fetch_api_key(username, &context).await
    }

    /// Fetch an API key (production)
    async fn fetch_api_key(
        &self,
        username: String,
        password: String,
        ) -> Result<FetchApiKeyResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().fetch_api_key(username, password, &context).await
    }

    /// Add an emoji reaction
    async fn add_reaction(
        &self,
        message_id: i32,
        emoji_name: String,
        emoji_code: Option<String>,
        reaction_type: Option<String>,
        ) -> Result<AddReactionResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().add_reaction(message_id, emoji_name, emoji_code, reaction_type, &context).await
    }

    /// Check if messages match a narrow
    async fn check_messages_match_narrow(
        &self,
        msg_ids: &Vec<i32>,
        narrow: &Vec<serde_json::Value>,
        ) -> Result<CheckMessagesMatchNarrowResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().check_messages_match_narrow(msg_ids, narrow, &context).await
    }

    /// Delete a message
    async fn delete_message(
        &self,
        message_id: i32,
        ) -> Result<DeleteMessageResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_message(message_id, &context).await
    }

    /// Get public temporary URL
    async fn get_file_temporary_url(
        &self,
        realm_id_str: i32,
        filename: String,
        ) -> Result<GetFileTemporaryUrlResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_file_temporary_url(realm_id_str, filename, &context).await
    }

    /// Get a message's edit history
    async fn get_message_history(
        &self,
        message_id: i32,
        ) -> Result<GetMessageHistoryResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_message_history(message_id, &context).await
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
        ) -> Result<GetMessagesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_messages(num_before, num_after, anchor, narrow, client_gravatar, apply_markdown, use_first_unread_anchor, &context).await
    }

    /// Get a message's raw Markdown
    async fn get_raw_message(
        &self,
        message_id: i32,
        ) -> Result<GetRawMessageResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_raw_message(message_id, &context).await
    }

    /// Mark all messages as read
    async fn mark_all_as_read(
        &self,
        ) -> Result<MarkAllAsReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().mark_all_as_read(&context).await
    }

    /// Mark messages in a stream as read
    async fn mark_stream_as_read(
        &self,
        stream_id: i32,
        ) -> Result<MarkStreamAsReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().mark_stream_as_read(stream_id, &context).await
    }

    /// Mark messages in a topic as read
    async fn mark_topic_as_read(
        &self,
        stream_id: i32,
        topic_name: String,
        ) -> Result<MarkTopicAsReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().mark_topic_as_read(stream_id, topic_name, &context).await
    }

    /// Remove an emoji reaction
    async fn remove_reaction(
        &self,
        message_id: i32,
        emoji_name: Option<String>,
        emoji_code: Option<String>,
        reaction_type: Option<String>,
        ) -> Result<RemoveReactionResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().remove_reaction(message_id, emoji_name, emoji_code, reaction_type, &context).await
    }

    /// Render message
    async fn render_message(
        &self,
        content: String,
        ) -> Result<RenderMessageResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().render_message(content, &context).await
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
        ) -> Result<SendMessageResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().send_message(type_, to, content, topic, queue_id, local_id, &context).await
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
        ) -> Result<UpdateMessageResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_message(message_id, topic, propagate_mode, send_notification_to_old_thread, send_notification_to_new_thread, content, stream_id, &context).await
    }

    /// Update personal message flags
    async fn update_message_flags(
        &self,
        messages: &Vec<i32>,
        op: String,
        flag: String,
        ) -> Result<UpdateMessageFlagsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_message_flags(messages, op, flag, &context).await
    }

    /// Upload a file
    async fn upload_file(
        &self,
        filename: Option<swagger::ByteArray>,
        ) -> Result<UploadFileResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().upload_file(filename, &context).await
    }

    /// Delete an event queue
    async fn delete_queue(
        &self,
        queue_id: String,
        ) -> Result<DeleteQueueResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_queue(queue_id, &context).await
    }

    /// Get events from an event queue
    async fn get_events(
        &self,
        queue_id: String,
        last_event_id: Option<i32>,
        dont_block: Option<bool>,
        ) -> Result<GetEventsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_events(queue_id, last_event_id, dont_block, &context).await
    }

    async fn real_time_post(
        &self,
        event_types: Option<&Vec<String>>,
        narrow: Option<&Vec<Vec<String>>>,
        all_public_streams: Option<bool>,
        ) -> Result<RealTimePostResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().real_time_post(event_types, narrow, all_public_streams, &context).await
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
        ) -> Result<RegisterQueueResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().register_queue(apply_markdown, client_gravatar, slim_presence, event_types, all_public_streams, include_subscribers, client_capabilities, fetch_event_types, narrow, &context).await
    }

    /// Error handling
    async fn rest_error_handling(
        &self,
        ) -> Result<RestErrorHandlingResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().rest_error_handling(&context).await
    }

    /// Add a code playground
    async fn add_code_playground(
        &self,
        name: String,
        pygments_language: String,
        url_prefix: String,
        ) -> Result<AddCodePlaygroundResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().add_code_playground(name, pygments_language, url_prefix, &context).await
    }

    /// Add a linkifier
    async fn add_linkifier(
        &self,
        pattern: String,
        url_format_string: String,
        ) -> Result<AddLinkifierResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().add_linkifier(pattern, url_format_string, &context).await
    }

    /// Create a custom profile field
    async fn create_custom_profile_field(
        &self,
        field_type: i32,
        name: Option<String>,
        hint: Option<String>,
        field_data: Option<serde_json::Value>,
        ) -> Result<CreateCustomProfileFieldResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_custom_profile_field(field_type, name, hint, field_data, &context).await
    }

    /// Get all custom emoji
    async fn get_custom_emoji(
        &self,
        ) -> Result<GetCustomEmojiResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_custom_emoji(&context).await
    }

    /// Get all custom profile fields
    async fn get_custom_profile_fields(
        &self,
        ) -> Result<GetCustomProfileFieldsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_custom_profile_fields(&context).await
    }

    /// Get linkifiers
    async fn get_linkifiers(
        &self,
        ) -> Result<GetLinkifiersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_linkifiers(&context).await
    }

    /// Get server settings
    async fn get_server_settings(
        &self,
        ) -> Result<GetServerSettingsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_server_settings(&context).await
    }

    /// Remove a code playground
    async fn remove_code_playground(
        &self,
        playground_id: i32,
        ) -> Result<RemoveCodePlaygroundResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().remove_code_playground(playground_id, &context).await
    }

    /// Remove a linkifier
    async fn remove_linkifier(
        &self,
        filter_id: i32,
        ) -> Result<RemoveLinkifierResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().remove_linkifier(filter_id, &context).await
    }

    /// Reorder custom profile fields
    async fn reorder_custom_profile_fields(
        &self,
        order: &Vec<i32>,
        ) -> Result<ReorderCustomProfileFieldsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().reorder_custom_profile_fields(order, &context).await
    }

    /// Update a linkifier
    async fn update_linkifier(
        &self,
        filter_id: i32,
        pattern: String,
        url_format_string: String,
        ) -> Result<UpdateLinkifierResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_linkifier(filter_id, pattern, url_format_string, &context).await
    }

    /// Upload custom emoji
    async fn upload_custom_emoji(
        &self,
        emoji_name: String,
        filename: Option<swagger::ByteArray>,
        ) -> Result<UploadCustomEmojiResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().upload_custom_emoji(emoji_name, filename, &context).await
    }

    /// Archive a stream
    async fn archive_stream(
        &self,
        stream_id: i32,
        ) -> Result<ArchiveStreamResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().archive_stream(stream_id, &context).await
    }

    /// Create BigBlueButton video call
    async fn create_big_blue_button_video_call(
        &self,
        ) -> Result<CreateBigBlueButtonVideoCallResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_big_blue_button_video_call(&context).await
    }

    /// Get stream ID
    async fn get_stream_id(
        &self,
        stream: String,
        ) -> Result<GetStreamIdResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_stream_id(stream, &context).await
    }

    /// Get topics in a stream
    async fn get_stream_topics(
        &self,
        stream_id: i32,
        ) -> Result<GetStreamTopicsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_stream_topics(stream_id, &context).await
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
        ) -> Result<GetStreamsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_streams(include_public, include_web_public, include_subscribed, include_all_active, include_default, include_owner_subscribed, &context).await
    }

    /// Get subscription status
    async fn get_subscription_status(
        &self,
        user_id: i32,
        stream_id: i32,
        ) -> Result<GetSubscriptionStatusResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_subscription_status(user_id, stream_id, &context).await
    }

    /// Get subscribed streams
    async fn get_subscriptions(
        &self,
        include_subscribers: Option<bool>,
        ) -> Result<GetSubscriptionsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_subscriptions(include_subscribers, &context).await
    }

    /// Topic muting
    async fn mute_topic(
        &self,
        topic: String,
        op: String,
        stream: Option<String>,
        stream_id: Option<i32>,
        ) -> Result<MuteTopicResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().mute_topic(topic, op, stream, stream_id, &context).await
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
        ) -> Result<SubscribeResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().subscribe(subscriptions, principals, authorization_errors_fatal, announce, invite_only, history_public_to_subscribers, stream_post_policy, message_retention_days, &context).await
    }

    /// Unsubscribe from a stream
    async fn unsubscribe(
        &self,
        subscriptions: &Vec<String>,
        principals: Option<&Vec<swagger::OneOf2<String,i32>>>,
        ) -> Result<UnsubscribeResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().unsubscribe(subscriptions, principals, &context).await
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
        ) -> Result<UpdateStreamResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_stream(stream_id, description, new_name, is_private, is_announcement_only, stream_post_policy, history_public_to_subscribers, message_retention_days, &context).await
    }

    /// Update subscription settings
    async fn update_subscription_settings(
        &self,
        subscription_data: &Vec<serde_json::Value>,
        ) -> Result<UpdateSubscriptionSettingsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_subscription_settings(subscription_data, &context).await
    }

    /// Update subscriptions
    async fn update_subscriptions(
        &self,
        delete: Option<&Vec<String>>,
        add: Option<&Vec<serde_json::Value>>,
        ) -> Result<UpdateSubscriptionsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_subscriptions(delete, add, &context).await
    }

    /// Create a user
    async fn create_user(
        &self,
        email: String,
        password: String,
        full_name: String,
        ) -> Result<CreateUserResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_user(email, password, full_name, &context).await
    }

    /// Create a user group
    async fn create_user_group(
        &self,
        name: String,
        description: String,
        members: &Vec<i32>,
        ) -> Result<CreateUserGroupResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_user_group(name, description, members, &context).await
    }

    /// Deactivate own user
    async fn deactivate_own_user(
        &self,
        ) -> Result<DeactivateOwnUserResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().deactivate_own_user(&context).await
    }

    /// Deactivate a user
    async fn deactivate_user(
        &self,
        user_id: i32,
        ) -> Result<DeactivateUserResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().deactivate_user(user_id, &context).await
    }

    /// Get attachments
    async fn get_attachments(
        &self,
        ) -> Result<GetAttachmentsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_attachments(&context).await
    }

    /// Get own user
    async fn get_own_user(
        &self,
        ) -> Result<GetOwnUserResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_own_user(&context).await
    }

    /// Get a user
    async fn get_user(
        &self,
        user_id: i32,
        client_gravatar: Option<bool>,
        include_custom_profile_fields: Option<bool>,
        ) -> Result<GetUserResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_user(user_id, client_gravatar, include_custom_profile_fields, &context).await
    }

    /// Get a user by email
    async fn get_user_by_email(
        &self,
        email: String,
        client_gravatar: Option<bool>,
        include_custom_profile_fields: Option<bool>,
        ) -> Result<GetUserByEmailResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_user_by_email(email, client_gravatar, include_custom_profile_fields, &context).await
    }

    /// Get user groups
    async fn get_user_groups(
        &self,
        ) -> Result<GetUserGroupsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_user_groups(&context).await
    }

    /// Get user presence
    async fn get_user_presence(
        &self,
        user_id_or_email: String,
        ) -> Result<GetUserPresenceResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_user_presence(user_id_or_email, &context).await
    }

    /// Get all users
    async fn get_users(
        &self,
        client_gravatar: Option<bool>,
        include_custom_profile_fields: Option<bool>,
        ) -> Result<GetUsersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_users(client_gravatar, include_custom_profile_fields, &context).await
    }

    /// Mute a user
    async fn mute_user(
        &self,
        muted_user_id: i32,
        ) -> Result<MuteUserResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().mute_user(muted_user_id, &context).await
    }

    /// Reactivate a user
    async fn reactivate_user(
        &self,
        user_id: i32,
        ) -> Result<ReactivateUserResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().reactivate_user(user_id, &context).await
    }

    /// Delete a user group
    async fn remove_user_group(
        &self,
        user_group_id: i32,
        ) -> Result<RemoveUserGroupResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().remove_user_group(user_group_id, &context).await
    }

    /// Set \"typing\" status
    async fn set_typing_status(
        &self,
        op: String,
        to: &Vec<i32>,
        type_: Option<String>,
        topic: Option<String>,
        ) -> Result<SetTypingStatusResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().set_typing_status(op, to, type_, topic, &context).await
    }

    /// Unmute a user
    async fn unmute_user(
        &self,
        muted_user_id: i32,
        ) -> Result<UnmuteUserResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().unmute_user(muted_user_id, &context).await
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
        ) -> Result<UpdateDisplaySettingsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_display_settings(twenty_four_hour_time, dense_mode, starred_message_counts, fluid_layout_width, high_contrast_mode, color_scheme, translate_emoticons, default_language, default_view, left_side_userlist, emojiset, demote_inactive_streams, timezone, &context).await
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
        ) -> Result<UpdateNotificationSettingsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_notification_settings(enable_stream_desktop_notifications, enable_stream_email_notifications, enable_stream_push_notifications, enable_stream_audible_notifications, notification_sound, enable_desktop_notifications, enable_sounds, enable_offline_email_notifications, enable_offline_push_notifications, enable_online_push_notifications, enable_digest_emails, enable_marketing_emails, enable_login_emails, message_content_in_email_notifications, pm_content_in_desktop_notifications, wildcard_mentions_notify, desktop_icon_count_display, realm_name_in_notifications, presence_enabled, &context).await
    }

    /// Update a user
    async fn update_user(
        &self,
        user_id: i32,
        full_name: Option<String>,
        role: Option<i32>,
        profile_data: Option<&Vec<serde_json::Value>>,
        ) -> Result<UpdateUserResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_user(user_id, full_name, role, profile_data, &context).await
    }

    /// Update a user group
    async fn update_user_group(
        &self,
        user_group_id: i32,
        name: String,
        description: String,
        ) -> Result<UpdateUserGroupResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_user_group(user_group_id, name, description, &context).await
    }

    /// Update user group members
    async fn update_user_group_members(
        &self,
        user_group_id: i32,
        delete: Option<&Vec<i32>>,
        add: Option<&Vec<i32>>,
        ) -> Result<UpdateUserGroupMembersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_user_group_members(user_group_id, delete, add, &context).await
    }

    /// Outgoing webhooks
    async fn zulip_outgoing_webhooks(
        &self,
        ) -> Result<ZulipOutgoingWebhooksResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().zulip_outgoing_webhooks(&context).await
    }

}


#[cfg(feature = "client")]
pub mod client;

// Re-export Client as a top-level name
#[cfg(feature = "client")]
pub use client::Client;

#[cfg(feature = "server")]
pub mod server;

// Re-export router() as a top-level name
#[cfg(feature = "server")]
pub use self::server::Service;

#[cfg(feature = "server")]
pub mod context;

pub mod models;

#[cfg(any(feature = "client", feature = "server"))]
pub(crate) mod header;
