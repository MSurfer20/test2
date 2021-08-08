#![allow(missing_docs, unused_variables, trivial_casts)]


#[allow(unused_imports)]
use futures::{future, Stream, stream};
#[allow(unused_imports)]
use openapi_client::{Api, ApiNoContext, Client, ContextWrapperExt, models,
                      DevFetchApiKeyResponse,
                      FetchApiKeyResponse,
                      CreateDraftsResponse,
                      DeleteDraftResponse,
                      EditDraftResponse,
                      GetDraftsResponse,
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
                      DeleteTopicResponse,
                      GetStreamIdResponse,
                      GetStreamTopicsResponse,
                      GetStreamsResponse,
                      GetSubscribersResponse,
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
                      UpdateSettingsResponse,
                      UpdateStatusResponse,
                      UpdateUserResponse,
                      UpdateUserGroupResponse,
                      UpdateUserGroupMembersResponse,
                      ZulipOutgoingWebhooksResponse,
                     };
use clap::{App, Arg};

#[allow(unused_imports)]
use log::info;

// swagger::Has may be unused if there are no examples
#[allow(unused_imports)]
use swagger::{AuthData, ContextBuilder, EmptyContext, Has, Push, XSpanIdString};

type ClientContext = swagger::make_context_ty!(ContextBuilder, EmptyContext, Option<AuthData>, XSpanIdString);

// rt may be unused if there are no examples
#[allow(unused_mut)]
fn main() {
    env_logger::init();

    let matches = App::new("client")
        .arg(Arg::with_name("operation")
            .help("Sets the operation to run")
            .possible_values(&[
                "DevFetchApiKey",
                "FetchApiKey",
                "CreateDrafts",
                "DeleteDraft",
                "GetDrafts",
                "AddReaction",
                "CheckMessagesMatchNarrow",
                "DeleteMessage",
                "GetFileTemporaryUrl",
                "GetMessageHistory",
                "GetMessages",
                "GetRawMessage",
                "MarkAllAsRead",
                "MarkStreamAsRead",
                "MarkTopicAsRead",
                "RemoveReaction",
                "RenderMessage",
                "SendMessage",
                "UpdateMessage",
                "UpdateMessageFlags",
                "UploadFile",
                "DeleteQueue",
                "GetEvents",
                "RealTimePost",
                "RegisterQueue",
                "RestErrorHandling",
                "AddCodePlayground",
                "AddLinkifier",
                "CreateCustomProfileField",
                "GetCustomEmoji",
                "GetCustomProfileFields",
                "GetLinkifiers",
                "GetServerSettings",
                "RemoveCodePlayground",
                "RemoveLinkifier",
                "ReorderCustomProfileFields",
                "UpdateLinkifier",
                "UploadCustomEmoji",
                "ArchiveStream",
                "CreateBigBlueButtonVideoCall",
                "DeleteTopic",
                "GetStreamId",
                "GetStreamTopics",
                "GetStreams",
                "GetSubscribers",
                "GetSubscriptionStatus",
                "GetSubscriptions",
                "MuteTopic",
                "Subscribe",
                "Unsubscribe",
                "UpdateStream",
                "UpdateSubscriptionSettings",
                "UpdateSubscriptions",
                "CreateUser",
                "CreateUserGroup",
                "DeactivateOwnUser",
                "DeactivateUser",
                "GetAttachments",
                "GetOwnUser",
                "GetUser",
                "GetUserByEmail",
                "GetUserGroups",
                "GetUserPresence",
                "GetUsers",
                "MuteUser",
                "ReactivateUser",
                "RemoveUserGroup",
                "SetTypingStatus",
                "UnmuteUser",
                "UpdateSettings",
                "UpdateStatus",
                "UpdateUser",
                "UpdateUserGroup",
                "UpdateUserGroupMembers",
                "ZulipOutgoingWebhooks",
            ])
            .required(true)
            .index(1))
        .arg(Arg::with_name("https")
            .long("https")
            .help("Whether to use HTTPS or not"))
        .arg(Arg::with_name("host")
            .long("host")
            .takes_value(true)
            .default_value("example.zulipchat.com")
            .help("Hostname to contact"))
        .arg(Arg::with_name("port")
            .long("port")
            .takes_value(true)
            .default_value("8080")
            .help("Port to contact"))
        .get_matches();

    let is_https = matches.is_present("https");
    let base_url = format!("{}://{}:{}",
                           if is_https { "https" } else { "http" },
                           matches.value_of("host").unwrap(),
                           matches.value_of("port").unwrap());

    let context: ClientContext =
        swagger::make_context!(ContextBuilder, EmptyContext, None as Option<AuthData>, XSpanIdString::default());

    let mut client : Box<dyn ApiNoContext<ClientContext>> = if matches.is_present("https") {
        // Using Simple HTTPS
        let client = Box::new(Client::try_new_https(&base_url)
            .expect("Failed to create HTTPS client"));
        Box::new(client.with_context(context))
    } else {
        // Using HTTP
        let client = Box::new(Client::try_new_http(
            &base_url)
            .expect("Failed to create HTTP client"));
        Box::new(client.with_context(context))
    };

    let mut rt = tokio::runtime::Runtime::new().unwrap();

    match matches.value_of("operation") {
        Some("DevFetchApiKey") => {
            let result = rt.block_on(client.dev_fetch_api_key(
                  "iago@zulip.com".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("FetchApiKey") => {
            let result = rt.block_on(client.fetch_api_key(
                  "iago@zulip.com".to_string(),
                  "abcd1234".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateDrafts") => {
            let result = rt.block_on(client.create_drafts(
                  Some(&Vec::new())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteDraft") => {
            let result = rt.block_on(client.delete_draft(
                  1
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("EditDraft") => {
            let result = rt.block_on(client.edit_draft(
                  2,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetDrafts") => {
            let result = rt.block_on(client.get_drafts(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AddReaction") => {
            let result = rt.block_on(client.add_reaction(
                  42,
                  "octopus".to_string(),
                  Some("1f419".to_string()),
                  Some("unicode_emoji".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CheckMessagesMatchNarrow") => {
            let result = rt.block_on(client.check_messages_match_narrow(
                  &Vec::new(),
                  &Vec::new()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteMessage") => {
            let result = rt.block_on(client.delete_message(
                  42
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetFileTemporaryUrl") => {
            let result = rt.block_on(client.get_file_temporary_url(
                  1,
                  "4e/m2A3MSqFnWRLUf9SaPzQ0Up_/zulip.txt".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetMessageHistory") => {
            let result = rt.block_on(client.get_message_history(
                  42
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetMessages") => {
            let result = rt.block_on(client.get_messages(
                  4,
                  8,
                  Some(serde_json::from_str::<swagger::OneOf2<String,i32>>(r#"42"#).expect("Failed to parse JSON example")),
                  Some(&Vec::new()),
                  Some(true),
                  Some(false),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetRawMessage") => {
            let result = rt.block_on(client.get_raw_message(
                  42
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MarkAllAsRead") => {
            let result = rt.block_on(client.mark_all_as_read(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MarkStreamAsRead") => {
            let result = rt.block_on(client.mark_stream_as_read(
                  42
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MarkTopicAsRead") => {
            let result = rt.block_on(client.mark_topic_as_read(
                  42,
                  "new coffee machine".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RemoveReaction") => {
            let result = rt.block_on(client.remove_reaction(
                  42,
                  Some("octopus".to_string()),
                  Some("1f419".to_string()),
                  Some("unicode_emoji".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RenderMessage") => {
            let result = rt.block_on(client.render_message(
                  "Hello".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SendMessage") => {
            let result = rt.block_on(client.send_message(
                  "private".to_string(),
                  &Vec::new(),
                  "Hello".to_string(),
                  Some("Castle".to_string()),
                  Some("1593114627:0".to_string()),
                  Some("100.01".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateMessage") => {
            let result = rt.block_on(client.update_message(
                  42,
                  Some("Castle".to_string()),
                  Some("change_all".to_string()),
                  Some(true),
                  Some(true),
                  Some("Hello".to_string()),
                  Some(42)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateMessageFlags") => {
            let result = rt.block_on(client.update_message_flags(
                  &Vec::new(),
                  "add".to_string(),
                  "read".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UploadFile") => {
            let result = rt.block_on(client.upload_file(
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")))
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteQueue") => {
            let result = rt.block_on(client.delete_queue(
                  "1375801870:2942".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetEvents") => {
            let result = rt.block_on(client.get_events(
                  "1375801870:2942".to_string(),
                  Some(-1),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RealTimePost") => {
            let result = rt.block_on(client.real_time_post(
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RegisterQueue") => {
            let result = rt.block_on(client.register_queue(
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(&Vec::new()),
                  Some(true),
                  Some(true),
                  None,
                  Some(&Vec::new()),
                  Some(&Vec::new())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RestErrorHandling") => {
            let result = rt.block_on(client.rest_error_handling(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AddCodePlayground") => {
            let result = rt.block_on(client.add_code_playground(
                  "Python playground".to_string(),
                  "Python".to_string(),
                  "https://python.example.com".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AddLinkifier") => {
            let result = rt.block_on(client.add_linkifier(
                  "#(?P<id>[0-9]+)".to_string(),
                  "https://github.com/zulip/zulip/issues/%(id)s".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateCustomProfileField") => {
            let result = rt.block_on(client.create_custom_profile_field(
                  3,
                  Some("Favorite programming language".to_string()),
                  Some("Your favorite programming language.".to_string()),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetCustomEmoji") => {
            let result = rt.block_on(client.get_custom_emoji(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetCustomProfileFields") => {
            let result = rt.block_on(client.get_custom_profile_fields(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetLinkifiers") => {
            let result = rt.block_on(client.get_linkifiers(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetServerSettings") => {
            let result = rt.block_on(client.get_server_settings(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RemoveCodePlayground") => {
            let result = rt.block_on(client.remove_code_playground(
                  1
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RemoveLinkifier") => {
            let result = rt.block_on(client.remove_linkifier(
                  42
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ReorderCustomProfileFields") => {
            let result = rt.block_on(client.reorder_custom_profile_fields(
                  &Vec::new()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateLinkifier") => {
            let result = rt.block_on(client.update_linkifier(
                  2,
                  "#(?P<id>[0-9]+)".to_string(),
                  "https://github.com/zulip/zulip/issues/%(id)s".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UploadCustomEmoji") => {
            let result = rt.block_on(client.upload_custom_emoji(
                  "smile".to_string(),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")))
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ArchiveStream") => {
            let result = rt.block_on(client.archive_stream(
                  1
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateBigBlueButtonVideoCall") => {
            let result = rt.block_on(client.create_big_blue_button_video_call(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteTopic") => {
            let result = rt.block_on(client.delete_topic(
                  1,
                  "new coffee machine".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetStreamId") => {
            let result = rt.block_on(client.get_stream_id(
                  "Denmark".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetStreamTopics") => {
            let result = rt.block_on(client.get_stream_topics(
                  1
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetStreams") => {
            let result = rt.block_on(client.get_streams(
                  Some(false),
                  Some(true),
                  Some(false),
                  Some(true),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetSubscribers") => {
            let result = rt.block_on(client.get_subscribers(
                  1
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetSubscriptionStatus") => {
            let result = rt.block_on(client.get_subscription_status(
                  12,
                  1
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetSubscriptions") => {
            let result = rt.block_on(client.get_subscriptions(
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MuteTopic") => {
            let result = rt.block_on(client.mute_topic(
                  "dinner".to_string(),
                  "add".to_string(),
                  Some("Denmark".to_string()),
                  Some(42)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("Subscribe") => {
            let result = rt.block_on(client.subscribe(
                  &Vec::new(),
                  Some(&Vec::new()),
                  Some(false),
                  Some(true),
                  Some(true),
                  Some(false),
                  Some(2),
                  Some(serde_json::from_str::<swagger::OneOf2<String,i32>>(r#"20"#).expect("Failed to parse JSON example"))
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("Unsubscribe") => {
            let result = rt.block_on(client.unsubscribe(
                  &Vec::new(),
                  Some(&Vec::new())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateStream") => {
            let result = rt.block_on(client.update_stream(
                  1,
                  Some("Discuss Italian history and travel destinations.".to_string()),
                  Some("Italy".to_string()),
                  Some(true),
                  Some(true),
                  Some(2),
                  Some(false),
                  Some(serde_json::from_str::<swagger::OneOf2<String,i32>>(r#"20"#).expect("Failed to parse JSON example"))
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateSubscriptionSettings") => {
            let result = rt.block_on(client.update_subscription_settings(
                  &Vec::new()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateSubscriptions") => {
            let result = rt.block_on(client.update_subscriptions(
                  Some(&Vec::new()),
                  Some(&Vec::new())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateUser") => {
            let result = rt.block_on(client.create_user(
                  "username@example.com".to_string(),
                  "abcd1234".to_string(),
                  "New User".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateUserGroup") => {
            let result = rt.block_on(client.create_user_group(
                  "marketing".to_string(),
                  "The marketing team.".to_string(),
                  &Vec::new()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeactivateOwnUser") => {
            let result = rt.block_on(client.deactivate_own_user(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeactivateUser") => {
            let result = rt.block_on(client.deactivate_user(
                  12
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetAttachments") => {
            let result = rt.block_on(client.get_attachments(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetOwnUser") => {
            let result = rt.block_on(client.get_own_user(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetUser") => {
            let result = rt.block_on(client.get_user(
                  12,
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetUserByEmail") => {
            let result = rt.block_on(client.get_user_by_email(
                  "iago@zulip.com".to_string(),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetUserGroups") => {
            let result = rt.block_on(client.get_user_groups(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetUserPresence") => {
            let result = rt.block_on(client.get_user_presence(
                  "iago@zulip.com".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetUsers") => {
            let result = rt.block_on(client.get_users(
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MuteUser") => {
            let result = rt.block_on(client.mute_user(
                  10
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ReactivateUser") => {
            let result = rt.block_on(client.reactivate_user(
                  12
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RemoveUserGroup") => {
            let result = rt.block_on(client.remove_user_group(
                  1
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SetTypingStatus") => {
            let result = rt.block_on(client.set_typing_status(
                  "start".to_string(),
                  &Vec::new(),
                  Some("private".to_string()),
                  Some("typing notifications".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UnmuteUser") => {
            let result = rt.block_on(client.unmute_user(
                  10
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateSettings") => {
            let result = rt.block_on(client.update_settings(
                  Some("NewName".to_string()),
                  Some("newname@example.com".to_string()),
                  Some("old12345".to_string()),
                  Some("new12345".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(56),
                  Some(true),
                  Some(true),
                  Some("en".to_string()),
                  Some("all_messages".to_string()),
                  Some(true),
                  Some("google".to_string()),
                  Some(56),
                  Some("Asia/Kolkata".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("ding".to_string()),
                  Some(true),
                  Some(true),
                  Some(120),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(56),
                  Some(true),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateStatus") => {
            let result = rt.block_on(client.update_status(
                  Some("on vacation".to_string()),
                  Some(true),
                  Some("car".to_string()),
                  Some("1f697".to_string()),
                  Some("unicode_emoji".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateUser") => {
            let result = rt.block_on(client.update_user(
                  12,
                  Some("full_name_example".to_string()),
                  Some(400),
                  Some(&Vec::new())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateUserGroup") => {
            let result = rt.block_on(client.update_user_group(
                  1,
                  "marketing team".to_string(),
                  "The marketing team.".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateUserGroupMembers") => {
            let result = rt.block_on(client.update_user_group_members(
                  1,
                  Some(&Vec::new()),
                  Some(&Vec::new())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ZulipOutgoingWebhooks") => {
            let result = rt.block_on(client.zulip_outgoing_webhooks(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        _ => {
            panic!("Invalid operation provided")
        }
    }
}
