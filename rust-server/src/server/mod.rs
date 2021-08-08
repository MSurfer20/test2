use futures::{future, future::BoxFuture, Stream, stream, future::FutureExt, stream::TryStreamExt};
use hyper::{Request, Response, StatusCode, Body, HeaderMap};
use hyper::header::{HeaderName, HeaderValue, CONTENT_TYPE};
use log::warn;
#[allow(unused_imports)]
use std::convert::{TryFrom, TryInto};
use std::error::Error;
use std::future::Future;
use std::marker::PhantomData;
use std::task::{Context, Poll};
use swagger::{ApiError, BodyExt, Has, RequestParser, XSpanIdString};
pub use swagger::auth::Authorization;
use swagger::auth::Scopes;
use url::form_urlencoded;
use multipart::server::Multipart;
use multipart::server::save::SaveResult;

#[allow(unused_imports)]
use crate::models;
use crate::header;

pub use crate::context;

type ServiceFuture = BoxFuture<'static, Result<Response<Body>, crate::ServiceError>>;

use crate::{Api,
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
     ZulipOutgoingWebhooksResponse
};

mod paths {
    use lazy_static::lazy_static;

    lazy_static! {
        pub static ref GLOBAL_REGEX_SET: regex::RegexSet = regex::RegexSet::new(vec![
            r"^/api/v1/attachments$",
            r"^/api/v1/calls/bigbluebutton/create$",
            r"^/api/v1/dev_fetch_api_key$",
            r"^/api/v1/drafts$",
            r"^/api/v1/drafts/(?P<draft_id>[^/?#]*)$",
            r"^/api/v1/events$",
            r"^/api/v1/fetch_api_key$",
            r"^/api/v1/get_stream_id$",
            r"^/api/v1/mark_all_as_read$",
            r"^/api/v1/mark_stream_as_read$",
            r"^/api/v1/mark_topic_as_read$",
            r"^/api/v1/messages$",
            r"^/api/v1/messages/flags$",
            r"^/api/v1/messages/matches_narrow$",
            r"^/api/v1/messages/render$",
            r"^/api/v1/messages/(?P<message_id>[^/?#]*)$",
            r"^/api/v1/messages/(?P<message_id>[^/?#]*)/history$",
            r"^/api/v1/messages/(?P<message_id>[^/?#]*)/reactions$",
            r"^/api/v1/real-time$",
            r"^/api/v1/realm/emoji$",
            r"^/api/v1/realm/emoji/(?P<emoji_name>[^/?#]*)$",
            r"^/api/v1/realm/filters$",
            r"^/api/v1/realm/filters/(?P<filter_id>[^/?#]*)$",
            r"^/api/v1/realm/linkifiers$",
            r"^/api/v1/realm/playgrounds$",
            r"^/api/v1/realm/playgrounds/(?P<playground_id>[^/?#]*)$",
            r"^/api/v1/realm/profile_fields$",
            r"^/api/v1/register$",
            r"^/api/v1/rest-error-handling$",
            r"^/api/v1/server_settings$",
            r"^/api/v1/settings$",
            r"^/api/v1/streams$",
            r"^/api/v1/streams/(?P<stream_id>[^/?#]*)$",
            r"^/api/v1/streams/(?P<stream_id>[^/?#]*)/delete_topic$",
            r"^/api/v1/streams/(?P<stream_id>[^/?#]*)/members$",
            r"^/api/v1/typing$",
            r"^/api/v1/user_groups$",
            r"^/api/v1/user_groups/create$",
            r"^/api/v1/user_groups/(?P<user_group_id>[^/?#]*)$",
            r"^/api/v1/user_groups/(?P<user_group_id>[^/?#]*)/members$",
            r"^/api/v1/user_uploads$",
            r"^/api/v1/user_uploads/(?P<realm_id_str>[^/?#]*)/(?P<filename>[^/?#]*)$",
            r"^/api/v1/users$",
            r"^/api/v1/users/me$",
            r"^/api/v1/users/me/muted_users/(?P<muted_user_id>[^/?#]*)$",
            r"^/api/v1/users/me/status$",
            r"^/api/v1/users/me/subscriptions$",
            r"^/api/v1/users/me/subscriptions/muted_topics$",
            r"^/api/v1/users/me/subscriptions/properties$",
            r"^/api/v1/users/me/(?P<stream_id>[^/?#]*)/topics$",
            r"^/api/v1/users/(?P<email>[^/?#]*)$",
            r"^/api/v1/users/(?P<user_id_or_email>[^/?#]*)/presence$",
            r"^/api/v1/users/(?P<user_id>[^/?#]*)$",
            r"^/api/v1/users/(?P<user_id>[^/?#]*)/reactivate$",
            r"^/api/v1/users/(?P<user_id>[^/?#]*)/subscriptions/(?P<stream_id>[^/?#]*)$",
            r"^/api/v1/zulip-outgoing-webhook$"
        ])
        .expect("Unable to create global regex set");
    }
    pub(crate) static ID_ATTACHMENTS: usize = 0;
    pub(crate) static ID_CALLS_BIGBLUEBUTTON_CREATE: usize = 1;
    pub(crate) static ID_DEV_FETCH_API_KEY: usize = 2;
    pub(crate) static ID_DRAFTS: usize = 3;
    pub(crate) static ID_DRAFTS_DRAFT_ID: usize = 4;
    lazy_static! {
        pub static ref REGEX_DRAFTS_DRAFT_ID: regex::Regex =
            regex::Regex::new(r"^/api/v1/drafts/(?P<draft_id>[^/?#]*)$")
                .expect("Unable to create regex for DRAFTS_DRAFT_ID");
    }
    pub(crate) static ID_EVENTS: usize = 5;
    pub(crate) static ID_FETCH_API_KEY: usize = 6;
    pub(crate) static ID_GET_STREAM_ID: usize = 7;
    pub(crate) static ID_MARK_ALL_AS_READ: usize = 8;
    pub(crate) static ID_MARK_STREAM_AS_READ: usize = 9;
    pub(crate) static ID_MARK_TOPIC_AS_READ: usize = 10;
    pub(crate) static ID_MESSAGES: usize = 11;
    pub(crate) static ID_MESSAGES_FLAGS: usize = 12;
    pub(crate) static ID_MESSAGES_MATCHES_NARROW: usize = 13;
    pub(crate) static ID_MESSAGES_RENDER: usize = 14;
    pub(crate) static ID_MESSAGES_MESSAGE_ID: usize = 15;
    lazy_static! {
        pub static ref REGEX_MESSAGES_MESSAGE_ID: regex::Regex =
            regex::Regex::new(r"^/api/v1/messages/(?P<message_id>[^/?#]*)$")
                .expect("Unable to create regex for MESSAGES_MESSAGE_ID");
    }
    pub(crate) static ID_MESSAGES_MESSAGE_ID_HISTORY: usize = 16;
    lazy_static! {
        pub static ref REGEX_MESSAGES_MESSAGE_ID_HISTORY: regex::Regex =
            regex::Regex::new(r"^/api/v1/messages/(?P<message_id>[^/?#]*)/history$")
                .expect("Unable to create regex for MESSAGES_MESSAGE_ID_HISTORY");
    }
    pub(crate) static ID_MESSAGES_MESSAGE_ID_REACTIONS: usize = 17;
    lazy_static! {
        pub static ref REGEX_MESSAGES_MESSAGE_ID_REACTIONS: regex::Regex =
            regex::Regex::new(r"^/api/v1/messages/(?P<message_id>[^/?#]*)/reactions$")
                .expect("Unable to create regex for MESSAGES_MESSAGE_ID_REACTIONS");
    }
    pub(crate) static ID_REAL_TIME: usize = 18;
    pub(crate) static ID_REALM_EMOJI: usize = 19;
    pub(crate) static ID_REALM_EMOJI_EMOJI_NAME: usize = 20;
    lazy_static! {
        pub static ref REGEX_REALM_EMOJI_EMOJI_NAME: regex::Regex =
            regex::Regex::new(r"^/api/v1/realm/emoji/(?P<emoji_name>[^/?#]*)$")
                .expect("Unable to create regex for REALM_EMOJI_EMOJI_NAME");
    }
    pub(crate) static ID_REALM_FILTERS: usize = 21;
    pub(crate) static ID_REALM_FILTERS_FILTER_ID: usize = 22;
    lazy_static! {
        pub static ref REGEX_REALM_FILTERS_FILTER_ID: regex::Regex =
            regex::Regex::new(r"^/api/v1/realm/filters/(?P<filter_id>[^/?#]*)$")
                .expect("Unable to create regex for REALM_FILTERS_FILTER_ID");
    }
    pub(crate) static ID_REALM_LINKIFIERS: usize = 23;
    pub(crate) static ID_REALM_PLAYGROUNDS: usize = 24;
    pub(crate) static ID_REALM_PLAYGROUNDS_PLAYGROUND_ID: usize = 25;
    lazy_static! {
        pub static ref REGEX_REALM_PLAYGROUNDS_PLAYGROUND_ID: regex::Regex =
            regex::Regex::new(r"^/api/v1/realm/playgrounds/(?P<playground_id>[^/?#]*)$")
                .expect("Unable to create regex for REALM_PLAYGROUNDS_PLAYGROUND_ID");
    }
    pub(crate) static ID_REALM_PROFILE_FIELDS: usize = 26;
    pub(crate) static ID_REGISTER: usize = 27;
    pub(crate) static ID_REST_ERROR_HANDLING: usize = 28;
    pub(crate) static ID_SERVER_SETTINGS: usize = 29;
    pub(crate) static ID_SETTINGS: usize = 30;
    pub(crate) static ID_STREAMS: usize = 31;
    pub(crate) static ID_STREAMS_STREAM_ID: usize = 32;
    lazy_static! {
        pub static ref REGEX_STREAMS_STREAM_ID: regex::Regex =
            regex::Regex::new(r"^/api/v1/streams/(?P<stream_id>[^/?#]*)$")
                .expect("Unable to create regex for STREAMS_STREAM_ID");
    }
    pub(crate) static ID_STREAMS_STREAM_ID_DELETE_TOPIC: usize = 33;
    lazy_static! {
        pub static ref REGEX_STREAMS_STREAM_ID_DELETE_TOPIC: regex::Regex =
            regex::Regex::new(r"^/api/v1/streams/(?P<stream_id>[^/?#]*)/delete_topic$")
                .expect("Unable to create regex for STREAMS_STREAM_ID_DELETE_TOPIC");
    }
    pub(crate) static ID_STREAMS_STREAM_ID_MEMBERS: usize = 34;
    lazy_static! {
        pub static ref REGEX_STREAMS_STREAM_ID_MEMBERS: regex::Regex =
            regex::Regex::new(r"^/api/v1/streams/(?P<stream_id>[^/?#]*)/members$")
                .expect("Unable to create regex for STREAMS_STREAM_ID_MEMBERS");
    }
    pub(crate) static ID_TYPING: usize = 35;
    pub(crate) static ID_USER_GROUPS: usize = 36;
    pub(crate) static ID_USER_GROUPS_CREATE: usize = 37;
    pub(crate) static ID_USER_GROUPS_USER_GROUP_ID: usize = 38;
    lazy_static! {
        pub static ref REGEX_USER_GROUPS_USER_GROUP_ID: regex::Regex =
            regex::Regex::new(r"^/api/v1/user_groups/(?P<user_group_id>[^/?#]*)$")
                .expect("Unable to create regex for USER_GROUPS_USER_GROUP_ID");
    }
    pub(crate) static ID_USER_GROUPS_USER_GROUP_ID_MEMBERS: usize = 39;
    lazy_static! {
        pub static ref REGEX_USER_GROUPS_USER_GROUP_ID_MEMBERS: regex::Regex =
            regex::Regex::new(r"^/api/v1/user_groups/(?P<user_group_id>[^/?#]*)/members$")
                .expect("Unable to create regex for USER_GROUPS_USER_GROUP_ID_MEMBERS");
    }
    pub(crate) static ID_USER_UPLOADS: usize = 40;
    pub(crate) static ID_USER_UPLOADS_REALM_ID_STR_FILENAME: usize = 41;
    lazy_static! {
        pub static ref REGEX_USER_UPLOADS_REALM_ID_STR_FILENAME: regex::Regex =
            regex::Regex::new(r"^/api/v1/user_uploads/(?P<realm_id_str>[^/?#]*)/(?P<filename>[^/?#]*)$")
                .expect("Unable to create regex for USER_UPLOADS_REALM_ID_STR_FILENAME");
    }
    pub(crate) static ID_USERS: usize = 42;
    pub(crate) static ID_USERS_ME: usize = 43;
    pub(crate) static ID_USERS_ME_MUTED_USERS_MUTED_USER_ID: usize = 44;
    lazy_static! {
        pub static ref REGEX_USERS_ME_MUTED_USERS_MUTED_USER_ID: regex::Regex =
            regex::Regex::new(r"^/api/v1/users/me/muted_users/(?P<muted_user_id>[^/?#]*)$")
                .expect("Unable to create regex for USERS_ME_MUTED_USERS_MUTED_USER_ID");
    }
    pub(crate) static ID_USERS_ME_STATUS: usize = 45;
    pub(crate) static ID_USERS_ME_SUBSCRIPTIONS: usize = 46;
    pub(crate) static ID_USERS_ME_SUBSCRIPTIONS_MUTED_TOPICS: usize = 47;
    pub(crate) static ID_USERS_ME_SUBSCRIPTIONS_PROPERTIES: usize = 48;
    pub(crate) static ID_USERS_ME_STREAM_ID_TOPICS: usize = 49;
    lazy_static! {
        pub static ref REGEX_USERS_ME_STREAM_ID_TOPICS: regex::Regex =
            regex::Regex::new(r"^/api/v1/users/me/(?P<stream_id>[^/?#]*)/topics$")
                .expect("Unable to create regex for USERS_ME_STREAM_ID_TOPICS");
    }
    pub(crate) static ID_USERS_EMAIL: usize = 50;
    lazy_static! {
        pub static ref REGEX_USERS_EMAIL: regex::Regex =
            regex::Regex::new(r"^/api/v1/users/(?P<email>[^/?#]*)$")
                .expect("Unable to create regex for USERS_EMAIL");
    }
    pub(crate) static ID_USERS_USER_ID_OR_EMAIL_PRESENCE: usize = 51;
    lazy_static! {
        pub static ref REGEX_USERS_USER_ID_OR_EMAIL_PRESENCE: regex::Regex =
            regex::Regex::new(r"^/api/v1/users/(?P<user_id_or_email>[^/?#]*)/presence$")
                .expect("Unable to create regex for USERS_USER_ID_OR_EMAIL_PRESENCE");
    }
    pub(crate) static ID_USERS_USER_ID: usize = 52;
    lazy_static! {
        pub static ref REGEX_USERS_USER_ID: regex::Regex =
            regex::Regex::new(r"^/api/v1/users/(?P<user_id>[^/?#]*)$")
                .expect("Unable to create regex for USERS_USER_ID");
    }
    pub(crate) static ID_USERS_USER_ID_REACTIVATE: usize = 53;
    lazy_static! {
        pub static ref REGEX_USERS_USER_ID_REACTIVATE: regex::Regex =
            regex::Regex::new(r"^/api/v1/users/(?P<user_id>[^/?#]*)/reactivate$")
                .expect("Unable to create regex for USERS_USER_ID_REACTIVATE");
    }
    pub(crate) static ID_USERS_USER_ID_SUBSCRIPTIONS_STREAM_ID: usize = 54;
    lazy_static! {
        pub static ref REGEX_USERS_USER_ID_SUBSCRIPTIONS_STREAM_ID: regex::Regex =
            regex::Regex::new(r"^/api/v1/users/(?P<user_id>[^/?#]*)/subscriptions/(?P<stream_id>[^/?#]*)$")
                .expect("Unable to create regex for USERS_USER_ID_SUBSCRIPTIONS_STREAM_ID");
    }
    pub(crate) static ID_ZULIP_OUTGOING_WEBHOOK: usize = 55;
}

pub struct MakeService<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    api_impl: T,
    marker: PhantomData<C>,
}

impl<T, C> MakeService<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    pub fn new(api_impl: T) -> Self {
        MakeService {
            api_impl,
            marker: PhantomData
        }
    }
}

impl<T, C, Target> hyper::service::Service<Target> for MakeService<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    type Response = Service<T, C>;
    type Error = crate::ServiceError;
    type Future = future::Ready<Result<Self::Response, Self::Error>>;

    fn poll_ready(&mut self, cx: &mut Context<'_>) -> Poll<Result<(), Self::Error>> {
        Poll::Ready(Ok(()))
    }

    fn call(&mut self, target: Target) -> Self::Future {
        futures::future::ok(Service::new(
            self.api_impl.clone(),
        ))
    }
}

fn method_not_allowed() -> Result<Response<Body>, crate::ServiceError> {
    Ok(
        Response::builder().status(StatusCode::METHOD_NOT_ALLOWED)
            .body(Body::empty())
            .expect("Unable to create Method Not Allowed response")
    )
}

pub struct Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    api_impl: T,
    marker: PhantomData<C>,
}

impl<T, C> Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    pub fn new(api_impl: T) -> Self {
        Service {
            api_impl: api_impl,
            marker: PhantomData
        }
    }
}

impl<T, C> Clone for Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    fn clone(&self) -> Self {
        Service {
            api_impl: self.api_impl.clone(),
            marker: self.marker.clone(),
        }
    }
}

impl<T, C> hyper::service::Service<(Request<Body>, C)> for Service<T, C> where
    T: Api<C> + Clone + Send + Sync + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    type Response = Response<Body>;
    type Error = crate::ServiceError;
    type Future = ServiceFuture;

    fn poll_ready(&mut self, cx: &mut Context) -> Poll<Result<(), Self::Error>> {
        self.api_impl.poll_ready(cx)
    }

    fn call(&mut self, req: (Request<Body>, C)) -> Self::Future { async fn run<T, C>(mut api_impl: T, req: (Request<Body>, C)) -> Result<Response<Body>, crate::ServiceError> where
        T: Api<C> + Clone + Send + 'static,
        C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
    {
        let (request, context) = req;
        let (parts, body) = request.into_parts();
        let (method, uri, headers) = (parts.method, parts.uri, parts.headers);
        let path = paths::GLOBAL_REGEX_SET.matches(uri.path());

        match &method {

            // DevFetchApiKey - POST /dev_fetch_api_key
            &hyper::Method::POST if path.matched(paths::ID_DEV_FETCH_API_KEY) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_username = query_params.iter().filter(|e| e.0 == "username").map(|e| e.1.to_owned())
                    .nth(0);
                let param_username = match param_username {
                    Some(param_username) => {
                        let param_username =
                            <String as std::str::FromStr>::from_str
                                (&param_username);
                        match param_username {
                            Ok(param_username) => Some(param_username),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter username - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter username")),
                        }
                    },
                    None => None,
                };
                let param_username = match param_username {
                    Some(param_username) => param_username,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter username"))
                        .expect("Unable to create Bad Request response for missing query parameter username")),
                };

                                let result = api_impl.dev_fetch_api_key(
                                            param_username,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DevFetchApiKeyResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for DEV_FETCH_API_KEY_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // FetchApiKey - POST /fetch_api_key
            &hyper::Method::POST if path.matched(paths::ID_FETCH_API_KEY) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_username = query_params.iter().filter(|e| e.0 == "username").map(|e| e.1.to_owned())
                    .nth(0);
                let param_username = match param_username {
                    Some(param_username) => {
                        let param_username =
                            <String as std::str::FromStr>::from_str
                                (&param_username);
                        match param_username {
                            Ok(param_username) => Some(param_username),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter username - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter username")),
                        }
                    },
                    None => None,
                };
                let param_username = match param_username {
                    Some(param_username) => param_username,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter username"))
                        .expect("Unable to create Bad Request response for missing query parameter username")),
                };
                let param_password = query_params.iter().filter(|e| e.0 == "password").map(|e| e.1.to_owned())
                    .nth(0);
                let param_password = match param_password {
                    Some(param_password) => {
                        let param_password =
                            <String as std::str::FromStr>::from_str
                                (&param_password);
                        match param_password {
                            Ok(param_password) => Some(param_password),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter password - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter password")),
                        }
                    },
                    None => None,
                };
                let param_password = match param_password {
                    Some(param_password) => param_password,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter password"))
                        .expect("Unable to create Bad Request response for missing query parameter password")),
                };

                                let result = api_impl.fetch_api_key(
                                            param_username,
                                            param_password,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                FetchApiKeyResponse::ValidCredentialsTheClientCanUseToAccessTheZulipAPI
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FETCH_API_KEY_VALID_CREDENTIALS_THE_CLIENT_CAN_USE_TO_ACCESS_THE_ZULIP_API"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CreateDrafts - POST /drafts
            &hyper::Method::POST if path.matched(paths::ID_DRAFTS) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_drafts = query_params.iter().filter(|e| e.0 == "drafts").map(|e| e.1.to_owned())
                    .nth(0);
                let param_drafts = match param_drafts {
                    Some(param_drafts) => {
                        let param_drafts =
                            serde_json::from_str::<Vec<models::Draft>>
                                (&param_drafts);
                        match param_drafts {
                            Ok(param_drafts) => Some(param_drafts),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter drafts - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter drafts")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.create_drafts(
                                            param_drafts.as_ref(),
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateDraftsResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CREATE_DRAFTS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CreateDraftsResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CREATE_DRAFTS_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // DeleteDraft - DELETE /drafts/{draft_id}
            &hyper::Method::DELETE if path.matched(paths::ID_DRAFTS_DRAFT_ID) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_DRAFTS_DRAFT_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE DRAFTS_DRAFT_ID in set but failed match against \"{}\"", path, paths::REGEX_DRAFTS_DRAFT_ID.as_str())
                    );

                let param_draft_id = match percent_encoding::percent_decode(path_params["draft_id"].as_bytes()).decode_utf8() {
                    Ok(param_draft_id) => match param_draft_id.parse::<i32>() {
                        Ok(param_draft_id) => param_draft_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter draft_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["draft_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.delete_draft(
                                            param_draft_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteDraftResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for DELETE_DRAFT_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                DeleteDraftResponse::NotFound
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(404).expect("Unable to turn 404 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for DELETE_DRAFT_NOT_FOUND"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // EditDraft - PATCH /drafts/{draft_id}
            &hyper::Method::PATCH if path.matched(paths::ID_DRAFTS_DRAFT_ID) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_DRAFTS_DRAFT_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE DRAFTS_DRAFT_ID in set but failed match against \"{}\"", path, paths::REGEX_DRAFTS_DRAFT_ID.as_str())
                    );

                let param_draft_id = match percent_encoding::percent_decode(path_params["draft_id"].as_bytes()).decode_utf8() {
                    Ok(param_draft_id) => match param_draft_id.parse::<i32>() {
                        Ok(param_draft_id) => param_draft_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter draft_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["draft_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_draft = query_params.iter().filter(|e| e.0 == "draft").map(|e| e.1.to_owned())
                    .nth(0);
                let param_draft = match param_draft {
                    Some(param_draft) => {
                        let param_draft =
                            serde_json::from_str::<models::Draft>
                                (&param_draft);
                        match param_draft {
                            Ok(param_draft) => Some(param_draft),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter draft - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter draft")),
                        }
                    },
                    None => None,
                };
                let param_draft = match param_draft {
                    Some(param_draft) => param_draft,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter draft"))
                        .expect("Unable to create Bad Request response for missing query parameter draft")),
                };

                                let result = api_impl.edit_draft(
                                            param_draft_id,
                                            param_draft,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                EditDraftResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for EDIT_DRAFT_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                EditDraftResponse::NotFound
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(404).expect("Unable to turn 404 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for EDIT_DRAFT_NOT_FOUND"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetDrafts - GET /drafts
            &hyper::Method::GET if path.matched(paths::ID_DRAFTS) => {
                                let result = api_impl.get_drafts(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetDraftsResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_DRAFTS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // AddReaction - POST /messages/{message_id}/reactions
            &hyper::Method::POST if path.matched(paths::ID_MESSAGES_MESSAGE_ID_REACTIONS) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_MESSAGES_MESSAGE_ID_REACTIONS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE MESSAGES_MESSAGE_ID_REACTIONS in set but failed match against \"{}\"", path, paths::REGEX_MESSAGES_MESSAGE_ID_REACTIONS.as_str())
                    );

                let param_message_id = match percent_encoding::percent_decode(path_params["message_id"].as_bytes()).decode_utf8() {
                    Ok(param_message_id) => match param_message_id.parse::<i32>() {
                        Ok(param_message_id) => param_message_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter message_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["message_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_emoji_name = query_params.iter().filter(|e| e.0 == "emoji_name").map(|e| e.1.to_owned())
                    .nth(0);
                let param_emoji_name = match param_emoji_name {
                    Some(param_emoji_name) => {
                        let param_emoji_name =
                            <String as std::str::FromStr>::from_str
                                (&param_emoji_name);
                        match param_emoji_name {
                            Ok(param_emoji_name) => Some(param_emoji_name),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter emoji_name - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter emoji_name")),
                        }
                    },
                    None => None,
                };
                let param_emoji_name = match param_emoji_name {
                    Some(param_emoji_name) => param_emoji_name,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter emoji_name"))
                        .expect("Unable to create Bad Request response for missing query parameter emoji_name")),
                };
                let param_emoji_code = query_params.iter().filter(|e| e.0 == "emoji_code").map(|e| e.1.to_owned())
                    .nth(0);
                let param_emoji_code = match param_emoji_code {
                    Some(param_emoji_code) => {
                        let param_emoji_code =
                            <String as std::str::FromStr>::from_str
                                (&param_emoji_code);
                        match param_emoji_code {
                            Ok(param_emoji_code) => Some(param_emoji_code),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter emoji_code - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter emoji_code")),
                        }
                    },
                    None => None,
                };
                let param_reaction_type = query_params.iter().filter(|e| e.0 == "reaction_type").map(|e| e.1.to_owned())
                    .nth(0);
                let param_reaction_type = match param_reaction_type {
                    Some(param_reaction_type) => {
                        let param_reaction_type =
                            <String as std::str::FromStr>::from_str
                                (&param_reaction_type);
                        match param_reaction_type {
                            Ok(param_reaction_type) => Some(param_reaction_type),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter reaction_type - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter reaction_type")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.add_reaction(
                                            param_message_id,
                                            param_emoji_name,
                                            param_emoji_code,
                                            param_reaction_type,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                AddReactionResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ADD_REACTION_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                AddReactionResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ADD_REACTION_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CheckMessagesMatchNarrow - GET /messages/matches_narrow
            &hyper::Method::GET if path.matched(paths::ID_MESSAGES_MATCHES_NARROW) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_msg_ids = query_params.iter().filter(|e| e.0 == "msg_ids").map(|e| e.1.to_owned())
                    .nth(0);
                let param_msg_ids = match param_msg_ids {
                    Some(param_msg_ids) => {
                        let param_msg_ids =
                            serde_json::from_str::<Vec<i32>>
                                (&param_msg_ids);
                        match param_msg_ids {
                            Ok(param_msg_ids) => Some(param_msg_ids),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter msg_ids - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter msg_ids")),
                        }
                    },
                    None => None,
                };
                let param_msg_ids = match param_msg_ids {
                    Some(param_msg_ids) => param_msg_ids,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter msg_ids"))
                        .expect("Unable to create Bad Request response for missing query parameter msg_ids")),
                };
                let param_narrow = query_params.iter().filter(|e| e.0 == "narrow").map(|e| e.1.to_owned())
                    .nth(0);
                let param_narrow = match param_narrow {
                    Some(param_narrow) => {
                        let param_narrow =
                            serde_json::from_str::<Vec<serde_json::Value>>
                                (&param_narrow);
                        match param_narrow {
                            Ok(param_narrow) => Some(param_narrow),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter narrow - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter narrow")),
                        }
                    },
                    None => None,
                };
                let param_narrow = match param_narrow {
                    Some(param_narrow) => param_narrow,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter narrow"))
                        .expect("Unable to create Bad Request response for missing query parameter narrow")),
                };

                                let result = api_impl.check_messages_match_narrow(
                                            param_msg_ids.as_ref(),
                                            param_narrow.as_ref(),
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CheckMessagesMatchNarrowResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CHECK_MESSAGES_MATCH_NARROW_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // DeleteMessage - DELETE /messages/{message_id}
            &hyper::Method::DELETE if path.matched(paths::ID_MESSAGES_MESSAGE_ID) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_MESSAGES_MESSAGE_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE MESSAGES_MESSAGE_ID in set but failed match against \"{}\"", path, paths::REGEX_MESSAGES_MESSAGE_ID.as_str())
                    );

                let param_message_id = match percent_encoding::percent_decode(path_params["message_id"].as_bytes()).decode_utf8() {
                    Ok(param_message_id) => match param_message_id.parse::<i32>() {
                        Ok(param_message_id) => param_message_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter message_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["message_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.delete_message(
                                            param_message_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteMessageResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for DELETE_MESSAGE_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                DeleteMessageResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for DELETE_MESSAGE_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetFileTemporaryUrl - GET /user_uploads/{realm_id_str}/{filename}
            &hyper::Method::GET if path.matched(paths::ID_USER_UPLOADS_REALM_ID_STR_FILENAME) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_USER_UPLOADS_REALM_ID_STR_FILENAME
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE USER_UPLOADS_REALM_ID_STR_FILENAME in set but failed match against \"{}\"", path, paths::REGEX_USER_UPLOADS_REALM_ID_STR_FILENAME.as_str())
                    );

                let param_realm_id_str = match percent_encoding::percent_decode(path_params["realm_id_str"].as_bytes()).decode_utf8() {
                    Ok(param_realm_id_str) => match param_realm_id_str.parse::<i32>() {
                        Ok(param_realm_id_str) => param_realm_id_str,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter realm_id_str: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["realm_id_str"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_filename = match percent_encoding::percent_decode(path_params["filename"].as_bytes()).decode_utf8() {
                    Ok(param_filename) => match param_filename.parse::<String>() {
                        Ok(param_filename) => param_filename,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter filename: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["filename"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_file_temporary_url(
                                            param_realm_id_str,
                                            param_filename,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetFileTemporaryUrlResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_FILE_TEMPORARY_URL_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetMessageHistory - GET /messages/{message_id}/history
            &hyper::Method::GET if path.matched(paths::ID_MESSAGES_MESSAGE_ID_HISTORY) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_MESSAGES_MESSAGE_ID_HISTORY
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE MESSAGES_MESSAGE_ID_HISTORY in set but failed match against \"{}\"", path, paths::REGEX_MESSAGES_MESSAGE_ID_HISTORY.as_str())
                    );

                let param_message_id = match percent_encoding::percent_decode(path_params["message_id"].as_bytes()).decode_utf8() {
                    Ok(param_message_id) => match param_message_id.parse::<i32>() {
                        Ok(param_message_id) => param_message_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter message_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["message_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_message_history(
                                            param_message_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetMessageHistoryResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_MESSAGE_HISTORY_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                GetMessageHistoryResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_MESSAGE_HISTORY_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetMessages - GET /messages
            &hyper::Method::GET if path.matched(paths::ID_MESSAGES) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_anchor = query_params.iter().filter(|e| e.0 == "anchor").map(|e| e.1.to_owned())
                    .nth(0);
                let param_anchor = match param_anchor {
                    Some(param_anchor) => {
                        let param_anchor =
                            <swagger::OneOf2<String,i32> as std::str::FromStr>::from_str
                                (&param_anchor);
                        match param_anchor {
                            Ok(param_anchor) => Some(param_anchor),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter anchor - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter anchor")),
                        }
                    },
                    None => None,
                };
                let param_num_before = query_params.iter().filter(|e| e.0 == "num_before").map(|e| e.1.to_owned())
                    .nth(0);
                let param_num_before = match param_num_before {
                    Some(param_num_before) => {
                        let param_num_before =
                            <i32 as std::str::FromStr>::from_str
                                (&param_num_before);
                        match param_num_before {
                            Ok(param_num_before) => Some(param_num_before),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter num_before - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter num_before")),
                        }
                    },
                    None => None,
                };
                let param_num_before = match param_num_before {
                    Some(param_num_before) => param_num_before,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter num_before"))
                        .expect("Unable to create Bad Request response for missing query parameter num_before")),
                };
                let param_num_after = query_params.iter().filter(|e| e.0 == "num_after").map(|e| e.1.to_owned())
                    .nth(0);
                let param_num_after = match param_num_after {
                    Some(param_num_after) => {
                        let param_num_after =
                            <i32 as std::str::FromStr>::from_str
                                (&param_num_after);
                        match param_num_after {
                            Ok(param_num_after) => Some(param_num_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter num_after - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter num_after")),
                        }
                    },
                    None => None,
                };
                let param_num_after = match param_num_after {
                    Some(param_num_after) => param_num_after,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter num_after"))
                        .expect("Unable to create Bad Request response for missing query parameter num_after")),
                };
                let param_narrow = query_params.iter().filter(|e| e.0 == "narrow").map(|e| e.1.to_owned())
                    .nth(0);
                let param_narrow = match param_narrow {
                    Some(param_narrow) => {
                        let param_narrow =
                            serde_json::from_str::<Vec<serde_json::Value>>
                                (&param_narrow);
                        match param_narrow {
                            Ok(param_narrow) => Some(param_narrow),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter narrow - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter narrow")),
                        }
                    },
                    None => None,
                };
                let param_client_gravatar = query_params.iter().filter(|e| e.0 == "client_gravatar").map(|e| e.1.to_owned())
                    .nth(0);
                let param_client_gravatar = match param_client_gravatar {
                    Some(param_client_gravatar) => {
                        let param_client_gravatar =
                            <bool as std::str::FromStr>::from_str
                                (&param_client_gravatar);
                        match param_client_gravatar {
                            Ok(param_client_gravatar) => Some(param_client_gravatar),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter client_gravatar - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter client_gravatar")),
                        }
                    },
                    None => None,
                };
                let param_apply_markdown = query_params.iter().filter(|e| e.0 == "apply_markdown").map(|e| e.1.to_owned())
                    .nth(0);
                let param_apply_markdown = match param_apply_markdown {
                    Some(param_apply_markdown) => {
                        let param_apply_markdown =
                            <bool as std::str::FromStr>::from_str
                                (&param_apply_markdown);
                        match param_apply_markdown {
                            Ok(param_apply_markdown) => Some(param_apply_markdown),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter apply_markdown - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter apply_markdown")),
                        }
                    },
                    None => None,
                };
                let param_use_first_unread_anchor = query_params.iter().filter(|e| e.0 == "use_first_unread_anchor").map(|e| e.1.to_owned())
                    .nth(0);
                let param_use_first_unread_anchor = match param_use_first_unread_anchor {
                    Some(param_use_first_unread_anchor) => {
                        let param_use_first_unread_anchor =
                            <bool as std::str::FromStr>::from_str
                                (&param_use_first_unread_anchor);
                        match param_use_first_unread_anchor {
                            Ok(param_use_first_unread_anchor) => Some(param_use_first_unread_anchor),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter use_first_unread_anchor - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter use_first_unread_anchor")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.get_messages(
                                            param_num_before,
                                            param_num_after,
                                            param_anchor,
                                            param_narrow.as_ref(),
                                            param_client_gravatar,
                                            param_apply_markdown,
                                            param_use_first_unread_anchor,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetMessagesResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_MESSAGES_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetRawMessage - GET /messages/{message_id}
            &hyper::Method::GET if path.matched(paths::ID_MESSAGES_MESSAGE_ID) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_MESSAGES_MESSAGE_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE MESSAGES_MESSAGE_ID in set but failed match against \"{}\"", path, paths::REGEX_MESSAGES_MESSAGE_ID.as_str())
                    );

                let param_message_id = match percent_encoding::percent_decode(path_params["message_id"].as_bytes()).decode_utf8() {
                    Ok(param_message_id) => match param_message_id.parse::<i32>() {
                        Ok(param_message_id) => param_message_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter message_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["message_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_raw_message(
                                            param_message_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetRawMessageResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_RAW_MESSAGE_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                GetRawMessageResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_RAW_MESSAGE_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // MarkAllAsRead - POST /mark_all_as_read
            &hyper::Method::POST if path.matched(paths::ID_MARK_ALL_AS_READ) => {
                                let result = api_impl.mark_all_as_read(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MarkAllAsReadResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for MARK_ALL_AS_READ_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // MarkStreamAsRead - POST /mark_stream_as_read
            &hyper::Method::POST if path.matched(paths::ID_MARK_STREAM_AS_READ) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_stream_id = query_params.iter().filter(|e| e.0 == "stream_id").map(|e| e.1.to_owned())
                    .nth(0);
                let param_stream_id = match param_stream_id {
                    Some(param_stream_id) => {
                        let param_stream_id =
                            <i32 as std::str::FromStr>::from_str
                                (&param_stream_id);
                        match param_stream_id {
                            Ok(param_stream_id) => Some(param_stream_id),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter stream_id - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter stream_id")),
                        }
                    },
                    None => None,
                };
                let param_stream_id = match param_stream_id {
                    Some(param_stream_id) => param_stream_id,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter stream_id"))
                        .expect("Unable to create Bad Request response for missing query parameter stream_id")),
                };

                                let result = api_impl.mark_stream_as_read(
                                            param_stream_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MarkStreamAsReadResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for MARK_STREAM_AS_READ_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // MarkTopicAsRead - POST /mark_topic_as_read
            &hyper::Method::POST if path.matched(paths::ID_MARK_TOPIC_AS_READ) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_stream_id = query_params.iter().filter(|e| e.0 == "stream_id").map(|e| e.1.to_owned())
                    .nth(0);
                let param_stream_id = match param_stream_id {
                    Some(param_stream_id) => {
                        let param_stream_id =
                            <i32 as std::str::FromStr>::from_str
                                (&param_stream_id);
                        match param_stream_id {
                            Ok(param_stream_id) => Some(param_stream_id),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter stream_id - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter stream_id")),
                        }
                    },
                    None => None,
                };
                let param_stream_id = match param_stream_id {
                    Some(param_stream_id) => param_stream_id,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter stream_id"))
                        .expect("Unable to create Bad Request response for missing query parameter stream_id")),
                };
                let param_topic_name = query_params.iter().filter(|e| e.0 == "topic_name").map(|e| e.1.to_owned())
                    .nth(0);
                let param_topic_name = match param_topic_name {
                    Some(param_topic_name) => {
                        let param_topic_name =
                            <String as std::str::FromStr>::from_str
                                (&param_topic_name);
                        match param_topic_name {
                            Ok(param_topic_name) => Some(param_topic_name),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter topic_name - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter topic_name")),
                        }
                    },
                    None => None,
                };
                let param_topic_name = match param_topic_name {
                    Some(param_topic_name) => param_topic_name,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter topic_name"))
                        .expect("Unable to create Bad Request response for missing query parameter topic_name")),
                };

                                let result = api_impl.mark_topic_as_read(
                                            param_stream_id,
                                            param_topic_name,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MarkTopicAsReadResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for MARK_TOPIC_AS_READ_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // RemoveReaction - DELETE /messages/{message_id}/reactions
            &hyper::Method::DELETE if path.matched(paths::ID_MESSAGES_MESSAGE_ID_REACTIONS) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_MESSAGES_MESSAGE_ID_REACTIONS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE MESSAGES_MESSAGE_ID_REACTIONS in set but failed match against \"{}\"", path, paths::REGEX_MESSAGES_MESSAGE_ID_REACTIONS.as_str())
                    );

                let param_message_id = match percent_encoding::percent_decode(path_params["message_id"].as_bytes()).decode_utf8() {
                    Ok(param_message_id) => match param_message_id.parse::<i32>() {
                        Ok(param_message_id) => param_message_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter message_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["message_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_emoji_name = query_params.iter().filter(|e| e.0 == "emoji_name").map(|e| e.1.to_owned())
                    .nth(0);
                let param_emoji_name = match param_emoji_name {
                    Some(param_emoji_name) => {
                        let param_emoji_name =
                            <String as std::str::FromStr>::from_str
                                (&param_emoji_name);
                        match param_emoji_name {
                            Ok(param_emoji_name) => Some(param_emoji_name),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter emoji_name - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter emoji_name")),
                        }
                    },
                    None => None,
                };
                let param_emoji_code = query_params.iter().filter(|e| e.0 == "emoji_code").map(|e| e.1.to_owned())
                    .nth(0);
                let param_emoji_code = match param_emoji_code {
                    Some(param_emoji_code) => {
                        let param_emoji_code =
                            <String as std::str::FromStr>::from_str
                                (&param_emoji_code);
                        match param_emoji_code {
                            Ok(param_emoji_code) => Some(param_emoji_code),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter emoji_code - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter emoji_code")),
                        }
                    },
                    None => None,
                };
                let param_reaction_type = query_params.iter().filter(|e| e.0 == "reaction_type").map(|e| e.1.to_owned())
                    .nth(0);
                let param_reaction_type = match param_reaction_type {
                    Some(param_reaction_type) => {
                        let param_reaction_type =
                            <String as std::str::FromStr>::from_str
                                (&param_reaction_type);
                        match param_reaction_type {
                            Ok(param_reaction_type) => Some(param_reaction_type),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter reaction_type - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter reaction_type")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.remove_reaction(
                                            param_message_id,
                                            param_emoji_name,
                                            param_emoji_code,
                                            param_reaction_type,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RemoveReactionResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for REMOVE_REACTION_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                RemoveReactionResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for REMOVE_REACTION_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // RenderMessage - POST /messages/render
            &hyper::Method::POST if path.matched(paths::ID_MESSAGES_RENDER) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_content = query_params.iter().filter(|e| e.0 == "content").map(|e| e.1.to_owned())
                    .nth(0);
                let param_content = match param_content {
                    Some(param_content) => {
                        let param_content =
                            <String as std::str::FromStr>::from_str
                                (&param_content);
                        match param_content {
                            Ok(param_content) => Some(param_content),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter content - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter content")),
                        }
                    },
                    None => None,
                };
                let param_content = match param_content {
                    Some(param_content) => param_content,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter content"))
                        .expect("Unable to create Bad Request response for missing query parameter content")),
                };

                                let result = api_impl.render_message(
                                            param_content,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RenderMessageResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for RENDER_MESSAGE_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // SendMessage - POST /messages
            &hyper::Method::POST if path.matched(paths::ID_MESSAGES) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_type_ = query_params.iter().filter(|e| e.0 == "type").map(|e| e.1.to_owned())
                    .nth(0);
                let param_type_ = match param_type_ {
                    Some(param_type_) => {
                        let param_type_ =
                            <String as std::str::FromStr>::from_str
                                (&param_type_);
                        match param_type_ {
                            Ok(param_type_) => Some(param_type_),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter type - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter type")),
                        }
                    },
                    None => None,
                };
                let param_type_ = match param_type_ {
                    Some(param_type_) => param_type_,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter type"))
                        .expect("Unable to create Bad Request response for missing query parameter type")),
                };
                let param_to = query_params.iter().filter(|e| e.0 == "to").map(|e| e.1.to_owned())
                    .nth(0);
                let param_to = match param_to {
                    Some(param_to) => {
                        let param_to =
                            serde_json::from_str::<Vec<i32>>
                                (&param_to);
                        match param_to {
                            Ok(param_to) => Some(param_to),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter to - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter to")),
                        }
                    },
                    None => None,
                };
                let param_to = match param_to {
                    Some(param_to) => param_to,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter to"))
                        .expect("Unable to create Bad Request response for missing query parameter to")),
                };
                let param_content = query_params.iter().filter(|e| e.0 == "content").map(|e| e.1.to_owned())
                    .nth(0);
                let param_content = match param_content {
                    Some(param_content) => {
                        let param_content =
                            <String as std::str::FromStr>::from_str
                                (&param_content);
                        match param_content {
                            Ok(param_content) => Some(param_content),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter content - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter content")),
                        }
                    },
                    None => None,
                };
                let param_content = match param_content {
                    Some(param_content) => param_content,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter content"))
                        .expect("Unable to create Bad Request response for missing query parameter content")),
                };
                let param_topic = query_params.iter().filter(|e| e.0 == "topic").map(|e| e.1.to_owned())
                    .nth(0);
                let param_topic = match param_topic {
                    Some(param_topic) => {
                        let param_topic =
                            <String as std::str::FromStr>::from_str
                                (&param_topic);
                        match param_topic {
                            Ok(param_topic) => Some(param_topic),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter topic - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter topic")),
                        }
                    },
                    None => None,
                };
                let param_queue_id = query_params.iter().filter(|e| e.0 == "queue_id").map(|e| e.1.to_owned())
                    .nth(0);
                let param_queue_id = match param_queue_id {
                    Some(param_queue_id) => {
                        let param_queue_id =
                            <String as std::str::FromStr>::from_str
                                (&param_queue_id);
                        match param_queue_id {
                            Ok(param_queue_id) => Some(param_queue_id),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter queue_id - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter queue_id")),
                        }
                    },
                    None => None,
                };
                let param_local_id = query_params.iter().filter(|e| e.0 == "local_id").map(|e| e.1.to_owned())
                    .nth(0);
                let param_local_id = match param_local_id {
                    Some(param_local_id) => {
                        let param_local_id =
                            <String as std::str::FromStr>::from_str
                                (&param_local_id);
                        match param_local_id {
                            Ok(param_local_id) => Some(param_local_id),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter local_id - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter local_id")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.send_message(
                                            param_type_,
                                            param_to.as_ref(),
                                            param_content,
                                            param_topic,
                                            param_queue_id,
                                            param_local_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                SendMessageResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for SEND_MESSAGE_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                SendMessageResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for SEND_MESSAGE_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UpdateMessage - PATCH /messages/{message_id}
            &hyper::Method::PATCH if path.matched(paths::ID_MESSAGES_MESSAGE_ID) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_MESSAGES_MESSAGE_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE MESSAGES_MESSAGE_ID in set but failed match against \"{}\"", path, paths::REGEX_MESSAGES_MESSAGE_ID.as_str())
                    );

                let param_message_id = match percent_encoding::percent_decode(path_params["message_id"].as_bytes()).decode_utf8() {
                    Ok(param_message_id) => match param_message_id.parse::<i32>() {
                        Ok(param_message_id) => param_message_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter message_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["message_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_topic = query_params.iter().filter(|e| e.0 == "topic").map(|e| e.1.to_owned())
                    .nth(0);
                let param_topic = match param_topic {
                    Some(param_topic) => {
                        let param_topic =
                            <String as std::str::FromStr>::from_str
                                (&param_topic);
                        match param_topic {
                            Ok(param_topic) => Some(param_topic),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter topic - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter topic")),
                        }
                    },
                    None => None,
                };
                let param_propagate_mode = query_params.iter().filter(|e| e.0 == "propagate_mode").map(|e| e.1.to_owned())
                    .nth(0);
                let param_propagate_mode = match param_propagate_mode {
                    Some(param_propagate_mode) => {
                        let param_propagate_mode =
                            <String as std::str::FromStr>::from_str
                                (&param_propagate_mode);
                        match param_propagate_mode {
                            Ok(param_propagate_mode) => Some(param_propagate_mode),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter propagate_mode - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter propagate_mode")),
                        }
                    },
                    None => None,
                };
                let param_send_notification_to_old_thread = query_params.iter().filter(|e| e.0 == "send_notification_to_old_thread").map(|e| e.1.to_owned())
                    .nth(0);
                let param_send_notification_to_old_thread = match param_send_notification_to_old_thread {
                    Some(param_send_notification_to_old_thread) => {
                        let param_send_notification_to_old_thread =
                            <bool as std::str::FromStr>::from_str
                                (&param_send_notification_to_old_thread);
                        match param_send_notification_to_old_thread {
                            Ok(param_send_notification_to_old_thread) => Some(param_send_notification_to_old_thread),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter send_notification_to_old_thread - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter send_notification_to_old_thread")),
                        }
                    },
                    None => None,
                };
                let param_send_notification_to_new_thread = query_params.iter().filter(|e| e.0 == "send_notification_to_new_thread").map(|e| e.1.to_owned())
                    .nth(0);
                let param_send_notification_to_new_thread = match param_send_notification_to_new_thread {
                    Some(param_send_notification_to_new_thread) => {
                        let param_send_notification_to_new_thread =
                            <bool as std::str::FromStr>::from_str
                                (&param_send_notification_to_new_thread);
                        match param_send_notification_to_new_thread {
                            Ok(param_send_notification_to_new_thread) => Some(param_send_notification_to_new_thread),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter send_notification_to_new_thread - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter send_notification_to_new_thread")),
                        }
                    },
                    None => None,
                };
                let param_content = query_params.iter().filter(|e| e.0 == "content").map(|e| e.1.to_owned())
                    .nth(0);
                let param_content = match param_content {
                    Some(param_content) => {
                        let param_content =
                            <String as std::str::FromStr>::from_str
                                (&param_content);
                        match param_content {
                            Ok(param_content) => Some(param_content),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter content - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter content")),
                        }
                    },
                    None => None,
                };
                let param_stream_id = query_params.iter().filter(|e| e.0 == "stream_id").map(|e| e.1.to_owned())
                    .nth(0);
                let param_stream_id = match param_stream_id {
                    Some(param_stream_id) => {
                        let param_stream_id =
                            <i32 as std::str::FromStr>::from_str
                                (&param_stream_id);
                        match param_stream_id {
                            Ok(param_stream_id) => Some(param_stream_id),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter stream_id - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter stream_id")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.update_message(
                                            param_message_id,
                                            param_topic,
                                            param_propagate_mode,
                                            param_send_notification_to_old_thread,
                                            param_send_notification_to_new_thread,
                                            param_content,
                                            param_stream_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UpdateMessageResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for UPDATE_MESSAGE_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                UpdateMessageResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for UPDATE_MESSAGE_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UpdateMessageFlags - POST /messages/flags
            &hyper::Method::POST if path.matched(paths::ID_MESSAGES_FLAGS) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_messages = query_params.iter().filter(|e| e.0 == "messages").map(|e| e.1.to_owned())
                    .nth(0);
                let param_messages = match param_messages {
                    Some(param_messages) => {
                        let param_messages =
                            serde_json::from_str::<Vec<i32>>
                                (&param_messages);
                        match param_messages {
                            Ok(param_messages) => Some(param_messages),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter messages - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter messages")),
                        }
                    },
                    None => None,
                };
                let param_messages = match param_messages {
                    Some(param_messages) => param_messages,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter messages"))
                        .expect("Unable to create Bad Request response for missing query parameter messages")),
                };
                let param_op = query_params.iter().filter(|e| e.0 == "op").map(|e| e.1.to_owned())
                    .nth(0);
                let param_op = match param_op {
                    Some(param_op) => {
                        let param_op =
                            <String as std::str::FromStr>::from_str
                                (&param_op);
                        match param_op {
                            Ok(param_op) => Some(param_op),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter op - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter op")),
                        }
                    },
                    None => None,
                };
                let param_op = match param_op {
                    Some(param_op) => param_op,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter op"))
                        .expect("Unable to create Bad Request response for missing query parameter op")),
                };
                let param_flag = query_params.iter().filter(|e| e.0 == "flag").map(|e| e.1.to_owned())
                    .nth(0);
                let param_flag = match param_flag {
                    Some(param_flag) => {
                        let param_flag =
                            <String as std::str::FromStr>::from_str
                                (&param_flag);
                        match param_flag {
                            Ok(param_flag) => Some(param_flag),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter flag - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter flag")),
                        }
                    },
                    None => None,
                };
                let param_flag = match param_flag {
                    Some(param_flag) => param_flag,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter flag"))
                        .expect("Unable to create Bad Request response for missing query parameter flag")),
                };

                                let result = api_impl.update_message_flags(
                                            param_messages.as_ref(),
                                            param_op,
                                            param_flag,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UpdateMessageFlagsResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for UPDATE_MESSAGE_FLAGS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UploadFile - POST /user_uploads
            &hyper::Method::POST if path.matched(paths::ID_USER_UPLOADS) => {
                let boundary = match swagger::multipart::form::boundary(&headers) {
                    Some(boundary) => boundary.to_string(),
                    None => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from("Couldn't find valid multipart body".to_string()))
                                .expect("Unable to create Bad Request response for incorrect boundary")),
                };

                // Form Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.to_raw();
                match result.await {
                            Ok(body) => {
                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary).save().temp() {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    _ => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Unable to process all message parts")))
                                                        .expect("Unable to create Bad Request response due to failure to process all message"))
                                    },
                                };
                                let field_filename = entries.fields.remove("filename");
                                let param_filename = match field_filename {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for filename");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let filename_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("filename data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter filename"))
                                            }
                                        };
                                        filename_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let result = api_impl.upload_file(
                                            param_filename,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UploadFileResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for UPLOAD_FILE_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read multipart body")))
                                                .expect("Unable to create Bad Request response due to unable read multipart body")),
                        }
            },

            // DeleteQueue - DELETE /events
            &hyper::Method::DELETE if path.matched(paths::ID_EVENTS) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_queue_id = query_params.iter().filter(|e| e.0 == "queue_id").map(|e| e.1.to_owned())
                    .nth(0);
                let param_queue_id = match param_queue_id {
                    Some(param_queue_id) => {
                        let param_queue_id =
                            <String as std::str::FromStr>::from_str
                                (&param_queue_id);
                        match param_queue_id {
                            Ok(param_queue_id) => Some(param_queue_id),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter queue_id - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter queue_id")),
                        }
                    },
                    None => None,
                };
                let param_queue_id = match param_queue_id {
                    Some(param_queue_id) => param_queue_id,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter queue_id"))
                        .expect("Unable to create Bad Request response for missing query parameter queue_id")),
                };

                                let result = api_impl.delete_queue(
                                            param_queue_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteQueueResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for DELETE_QUEUE_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                DeleteQueueResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for DELETE_QUEUE_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetEvents - GET /events
            &hyper::Method::GET if path.matched(paths::ID_EVENTS) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_queue_id = query_params.iter().filter(|e| e.0 == "queue_id").map(|e| e.1.to_owned())
                    .nth(0);
                let param_queue_id = match param_queue_id {
                    Some(param_queue_id) => {
                        let param_queue_id =
                            <String as std::str::FromStr>::from_str
                                (&param_queue_id);
                        match param_queue_id {
                            Ok(param_queue_id) => Some(param_queue_id),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter queue_id - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter queue_id")),
                        }
                    },
                    None => None,
                };
                let param_queue_id = match param_queue_id {
                    Some(param_queue_id) => param_queue_id,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter queue_id"))
                        .expect("Unable to create Bad Request response for missing query parameter queue_id")),
                };
                let param_last_event_id = query_params.iter().filter(|e| e.0 == "last_event_id").map(|e| e.1.to_owned())
                    .nth(0);
                let param_last_event_id = match param_last_event_id {
                    Some(param_last_event_id) => {
                        let param_last_event_id =
                            <i32 as std::str::FromStr>::from_str
                                (&param_last_event_id);
                        match param_last_event_id {
                            Ok(param_last_event_id) => Some(param_last_event_id),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter last_event_id - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter last_event_id")),
                        }
                    },
                    None => None,
                };
                let param_dont_block = query_params.iter().filter(|e| e.0 == "dont_block").map(|e| e.1.to_owned())
                    .nth(0);
                let param_dont_block = match param_dont_block {
                    Some(param_dont_block) => {
                        let param_dont_block =
                            <bool as std::str::FromStr>::from_str
                                (&param_dont_block);
                        match param_dont_block {
                            Ok(param_dont_block) => Some(param_dont_block),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter dont_block - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter dont_block")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.get_events(
                                            param_queue_id,
                                            param_last_event_id,
                                            param_dont_block,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetEventsResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_EVENTS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                GetEventsResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_EVENTS_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // RealTimePost - POST /real-time
            &hyper::Method::POST if path.matched(paths::ID_REAL_TIME) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_event_types = query_params.iter().filter(|e| e.0 == "event_types").map(|e| e.1.to_owned())
                    .nth(0);
                let param_event_types = match param_event_types {
                    Some(param_event_types) => {
                        let param_event_types =
                            serde_json::from_str::<Vec<String>>
                                (&param_event_types);
                        match param_event_types {
                            Ok(param_event_types) => Some(param_event_types),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter event_types - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter event_types")),
                        }
                    },
                    None => None,
                };
                let param_narrow = query_params.iter().filter(|e| e.0 == "narrow").map(|e| e.1.to_owned())
                    .nth(0);
                let param_narrow = match param_narrow {
                    Some(param_narrow) => {
                        let param_narrow =
                            serde_json::from_str::<Vec<Vec<String>>>
                                (&param_narrow);
                        match param_narrow {
                            Ok(param_narrow) => Some(param_narrow),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter narrow - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter narrow")),
                        }
                    },
                    None => None,
                };
                let param_all_public_streams = query_params.iter().filter(|e| e.0 == "all_public_streams").map(|e| e.1.to_owned())
                    .nth(0);
                let param_all_public_streams = match param_all_public_streams {
                    Some(param_all_public_streams) => {
                        let param_all_public_streams =
                            <bool as std::str::FromStr>::from_str
                                (&param_all_public_streams);
                        match param_all_public_streams {
                            Ok(param_all_public_streams) => Some(param_all_public_streams),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter all_public_streams - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter all_public_streams")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.real_time_post(
                                            param_event_types.as_ref(),
                                            param_narrow.as_ref(),
                                            param_all_public_streams,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RealTimePostResponse::Success
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // RegisterQueue - POST /register
            &hyper::Method::POST if path.matched(paths::ID_REGISTER) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_apply_markdown = query_params.iter().filter(|e| e.0 == "apply_markdown").map(|e| e.1.to_owned())
                    .nth(0);
                let param_apply_markdown = match param_apply_markdown {
                    Some(param_apply_markdown) => {
                        let param_apply_markdown =
                            <bool as std::str::FromStr>::from_str
                                (&param_apply_markdown);
                        match param_apply_markdown {
                            Ok(param_apply_markdown) => Some(param_apply_markdown),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter apply_markdown - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter apply_markdown")),
                        }
                    },
                    None => None,
                };
                let param_client_gravatar = query_params.iter().filter(|e| e.0 == "client_gravatar").map(|e| e.1.to_owned())
                    .nth(0);
                let param_client_gravatar = match param_client_gravatar {
                    Some(param_client_gravatar) => {
                        let param_client_gravatar =
                            <bool as std::str::FromStr>::from_str
                                (&param_client_gravatar);
                        match param_client_gravatar {
                            Ok(param_client_gravatar) => Some(param_client_gravatar),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter client_gravatar - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter client_gravatar")),
                        }
                    },
                    None => None,
                };
                let param_slim_presence = query_params.iter().filter(|e| e.0 == "slim_presence").map(|e| e.1.to_owned())
                    .nth(0);
                let param_slim_presence = match param_slim_presence {
                    Some(param_slim_presence) => {
                        let param_slim_presence =
                            <bool as std::str::FromStr>::from_str
                                (&param_slim_presence);
                        match param_slim_presence {
                            Ok(param_slim_presence) => Some(param_slim_presence),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter slim_presence - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter slim_presence")),
                        }
                    },
                    None => None,
                };
                let param_event_types = query_params.iter().filter(|e| e.0 == "event_types").map(|e| e.1.to_owned())
                    .nth(0);
                let param_event_types = match param_event_types {
                    Some(param_event_types) => {
                        let param_event_types =
                            serde_json::from_str::<Vec<String>>
                                (&param_event_types);
                        match param_event_types {
                            Ok(param_event_types) => Some(param_event_types),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter event_types - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter event_types")),
                        }
                    },
                    None => None,
                };
                let param_all_public_streams = query_params.iter().filter(|e| e.0 == "all_public_streams").map(|e| e.1.to_owned())
                    .nth(0);
                let param_all_public_streams = match param_all_public_streams {
                    Some(param_all_public_streams) => {
                        let param_all_public_streams =
                            <bool as std::str::FromStr>::from_str
                                (&param_all_public_streams);
                        match param_all_public_streams {
                            Ok(param_all_public_streams) => Some(param_all_public_streams),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter all_public_streams - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter all_public_streams")),
                        }
                    },
                    None => None,
                };
                let param_include_subscribers = query_params.iter().filter(|e| e.0 == "include_subscribers").map(|e| e.1.to_owned())
                    .nth(0);
                let param_include_subscribers = match param_include_subscribers {
                    Some(param_include_subscribers) => {
                        let param_include_subscribers =
                            <bool as std::str::FromStr>::from_str
                                (&param_include_subscribers);
                        match param_include_subscribers {
                            Ok(param_include_subscribers) => Some(param_include_subscribers),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter include_subscribers - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter include_subscribers")),
                        }
                    },
                    None => None,
                };
                let param_client_capabilities = query_params.iter().filter(|e| e.0 == "client_capabilities").map(|e| e.1.to_owned())
                    .nth(0);
                let param_client_capabilities = match param_client_capabilities {
                    Some(param_client_capabilities) => {
                        let param_client_capabilities =
                            serde_json::from_str::<serde_json::Value>
                                (&param_client_capabilities);
                        match param_client_capabilities {
                            Ok(param_client_capabilities) => Some(param_client_capabilities),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter client_capabilities - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter client_capabilities")),
                        }
                    },
                    None => None,
                };
                let param_fetch_event_types = query_params.iter().filter(|e| e.0 == "fetch_event_types").map(|e| e.1.to_owned())
                    .nth(0);
                let param_fetch_event_types = match param_fetch_event_types {
                    Some(param_fetch_event_types) => {
                        let param_fetch_event_types =
                            serde_json::from_str::<Vec<String>>
                                (&param_fetch_event_types);
                        match param_fetch_event_types {
                            Ok(param_fetch_event_types) => Some(param_fetch_event_types),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter fetch_event_types - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter fetch_event_types")),
                        }
                    },
                    None => None,
                };
                let param_narrow = query_params.iter().filter(|e| e.0 == "narrow").map(|e| e.1.to_owned())
                    .nth(0);
                let param_narrow = match param_narrow {
                    Some(param_narrow) => {
                        let param_narrow =
                            serde_json::from_str::<Vec<Vec<String>>>
                                (&param_narrow);
                        match param_narrow {
                            Ok(param_narrow) => Some(param_narrow),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter narrow - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter narrow")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.register_queue(
                                            param_apply_markdown,
                                            param_client_gravatar,
                                            param_slim_presence,
                                            param_event_types.as_ref(),
                                            param_all_public_streams,
                                            param_include_subscribers,
                                            param_client_capabilities,
                                            param_fetch_event_types.as_ref(),
                                            param_narrow.as_ref(),
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RegisterQueueResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for REGISTER_QUEUE_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // RestErrorHandling - POST /rest-error-handling
            &hyper::Method::POST if path.matched(paths::ID_REST_ERROR_HANDLING) => {
                                let result = api_impl.rest_error_handling(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RestErrorHandlingResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for REST_ERROR_HANDLING_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                RestErrorHandlingResponse::Unauthorized
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(401).expect("Unable to turn 401 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for REST_ERROR_HANDLING_UNAUTHORIZED"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                RestErrorHandlingResponse::RateLimitExceeded
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(429).expect("Unable to turn 429 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for REST_ERROR_HANDLING_RATE_LIMIT_EXCEEDED"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // AddCodePlayground - POST /realm/playgrounds
            &hyper::Method::POST if path.matched(paths::ID_REALM_PLAYGROUNDS) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_name = query_params.iter().filter(|e| e.0 == "name").map(|e| e.1.to_owned())
                    .nth(0);
                let param_name = match param_name {
                    Some(param_name) => {
                        let param_name =
                            <String as std::str::FromStr>::from_str
                                (&param_name);
                        match param_name {
                            Ok(param_name) => Some(param_name),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter name - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter name")),
                        }
                    },
                    None => None,
                };
                let param_name = match param_name {
                    Some(param_name) => param_name,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter name"))
                        .expect("Unable to create Bad Request response for missing query parameter name")),
                };
                let param_pygments_language = query_params.iter().filter(|e| e.0 == "pygments_language").map(|e| e.1.to_owned())
                    .nth(0);
                let param_pygments_language = match param_pygments_language {
                    Some(param_pygments_language) => {
                        let param_pygments_language =
                            <String as std::str::FromStr>::from_str
                                (&param_pygments_language);
                        match param_pygments_language {
                            Ok(param_pygments_language) => Some(param_pygments_language),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter pygments_language - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter pygments_language")),
                        }
                    },
                    None => None,
                };
                let param_pygments_language = match param_pygments_language {
                    Some(param_pygments_language) => param_pygments_language,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter pygments_language"))
                        .expect("Unable to create Bad Request response for missing query parameter pygments_language")),
                };
                let param_url_prefix = query_params.iter().filter(|e| e.0 == "url_prefix").map(|e| e.1.to_owned())
                    .nth(0);
                let param_url_prefix = match param_url_prefix {
                    Some(param_url_prefix) => {
                        let param_url_prefix =
                            <String as std::str::FromStr>::from_str
                                (&param_url_prefix);
                        match param_url_prefix {
                            Ok(param_url_prefix) => Some(param_url_prefix),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter url_prefix - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter url_prefix")),
                        }
                    },
                    None => None,
                };
                let param_url_prefix = match param_url_prefix {
                    Some(param_url_prefix) => param_url_prefix,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter url_prefix"))
                        .expect("Unable to create Bad Request response for missing query parameter url_prefix")),
                };

                                let result = api_impl.add_code_playground(
                                            param_name,
                                            param_pygments_language,
                                            param_url_prefix,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                AddCodePlaygroundResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ADD_CODE_PLAYGROUND_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // AddLinkifier - POST /realm/filters
            &hyper::Method::POST if path.matched(paths::ID_REALM_FILTERS) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_pattern = query_params.iter().filter(|e| e.0 == "pattern").map(|e| e.1.to_owned())
                    .nth(0);
                let param_pattern = match param_pattern {
                    Some(param_pattern) => {
                        let param_pattern =
                            <String as std::str::FromStr>::from_str
                                (&param_pattern);
                        match param_pattern {
                            Ok(param_pattern) => Some(param_pattern),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter pattern - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter pattern")),
                        }
                    },
                    None => None,
                };
                let param_pattern = match param_pattern {
                    Some(param_pattern) => param_pattern,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter pattern"))
                        .expect("Unable to create Bad Request response for missing query parameter pattern")),
                };
                let param_url_format_string = query_params.iter().filter(|e| e.0 == "url_format_string").map(|e| e.1.to_owned())
                    .nth(0);
                let param_url_format_string = match param_url_format_string {
                    Some(param_url_format_string) => {
                        let param_url_format_string =
                            <String as std::str::FromStr>::from_str
                                (&param_url_format_string);
                        match param_url_format_string {
                            Ok(param_url_format_string) => Some(param_url_format_string),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter url_format_string - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter url_format_string")),
                        }
                    },
                    None => None,
                };
                let param_url_format_string = match param_url_format_string {
                    Some(param_url_format_string) => param_url_format_string,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter url_format_string"))
                        .expect("Unable to create Bad Request response for missing query parameter url_format_string")),
                };

                                let result = api_impl.add_linkifier(
                                            param_pattern,
                                            param_url_format_string,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                AddLinkifierResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ADD_LINKIFIER_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CreateCustomProfileField - POST /realm/profile_fields
            &hyper::Method::POST if path.matched(paths::ID_REALM_PROFILE_FIELDS) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_name = query_params.iter().filter(|e| e.0 == "name").map(|e| e.1.to_owned())
                    .nth(0);
                let param_name = match param_name {
                    Some(param_name) => {
                        let param_name =
                            <String as std::str::FromStr>::from_str
                                (&param_name);
                        match param_name {
                            Ok(param_name) => Some(param_name),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter name - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter name")),
                        }
                    },
                    None => None,
                };
                let param_hint = query_params.iter().filter(|e| e.0 == "hint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_hint = match param_hint {
                    Some(param_hint) => {
                        let param_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_hint);
                        match param_hint {
                            Ok(param_hint) => Some(param_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter hint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter hint")),
                        }
                    },
                    None => None,
                };
                let param_field_type = query_params.iter().filter(|e| e.0 == "field_type").map(|e| e.1.to_owned())
                    .nth(0);
                let param_field_type = match param_field_type {
                    Some(param_field_type) => {
                        let param_field_type =
                            <i32 as std::str::FromStr>::from_str
                                (&param_field_type);
                        match param_field_type {
                            Ok(param_field_type) => Some(param_field_type),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter field_type - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter field_type")),
                        }
                    },
                    None => None,
                };
                let param_field_type = match param_field_type {
                    Some(param_field_type) => param_field_type,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter field_type"))
                        .expect("Unable to create Bad Request response for missing query parameter field_type")),
                };
                let param_field_data = query_params.iter().filter(|e| e.0 == "field_data").map(|e| e.1.to_owned())
                    .nth(0);
                let param_field_data = match param_field_data {
                    Some(param_field_data) => {
                        let param_field_data =
                            serde_json::from_str::<serde_json::Value>
                                (&param_field_data);
                        match param_field_data {
                            Ok(param_field_data) => Some(param_field_data),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter field_data - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter field_data")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.create_custom_profile_field(
                                            param_field_type,
                                            param_name,
                                            param_hint,
                                            param_field_data,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateCustomProfileFieldResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CREATE_CUSTOM_PROFILE_FIELD_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetCustomEmoji - GET /realm/emoji
            &hyper::Method::GET if path.matched(paths::ID_REALM_EMOJI) => {
                                let result = api_impl.get_custom_emoji(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetCustomEmojiResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_CUSTOM_EMOJI_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetCustomProfileFields - GET /realm/profile_fields
            &hyper::Method::GET if path.matched(paths::ID_REALM_PROFILE_FIELDS) => {
                                let result = api_impl.get_custom_profile_fields(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetCustomProfileFieldsResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_CUSTOM_PROFILE_FIELDS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetLinkifiers - GET /realm/linkifiers
            &hyper::Method::GET if path.matched(paths::ID_REALM_LINKIFIERS) => {
                                let result = api_impl.get_linkifiers(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetLinkifiersResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_LINKIFIERS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetServerSettings - GET /server_settings
            &hyper::Method::GET if path.matched(paths::ID_SERVER_SETTINGS) => {
                                let result = api_impl.get_server_settings(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetServerSettingsResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_SERVER_SETTINGS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // RemoveCodePlayground - DELETE /realm/playgrounds/{playground_id}
            &hyper::Method::DELETE if path.matched(paths::ID_REALM_PLAYGROUNDS_PLAYGROUND_ID) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_REALM_PLAYGROUNDS_PLAYGROUND_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE REALM_PLAYGROUNDS_PLAYGROUND_ID in set but failed match against \"{}\"", path, paths::REGEX_REALM_PLAYGROUNDS_PLAYGROUND_ID.as_str())
                    );

                let param_playground_id = match percent_encoding::percent_decode(path_params["playground_id"].as_bytes()).decode_utf8() {
                    Ok(param_playground_id) => match param_playground_id.parse::<i32>() {
                        Ok(param_playground_id) => param_playground_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter playground_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["playground_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.remove_code_playground(
                                            param_playground_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RemoveCodePlaygroundResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for REMOVE_CODE_PLAYGROUND_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // RemoveLinkifier - DELETE /realm/filters/{filter_id}
            &hyper::Method::DELETE if path.matched(paths::ID_REALM_FILTERS_FILTER_ID) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_REALM_FILTERS_FILTER_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE REALM_FILTERS_FILTER_ID in set but failed match against \"{}\"", path, paths::REGEX_REALM_FILTERS_FILTER_ID.as_str())
                    );

                let param_filter_id = match percent_encoding::percent_decode(path_params["filter_id"].as_bytes()).decode_utf8() {
                    Ok(param_filter_id) => match param_filter_id.parse::<i32>() {
                        Ok(param_filter_id) => param_filter_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter filter_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["filter_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.remove_linkifier(
                                            param_filter_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RemoveLinkifierResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for REMOVE_LINKIFIER_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ReorderCustomProfileFields - PATCH /realm/profile_fields
            &hyper::Method::PATCH if path.matched(paths::ID_REALM_PROFILE_FIELDS) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_order = query_params.iter().filter(|e| e.0 == "order").map(|e| e.1.to_owned())
                    .nth(0);
                let param_order = match param_order {
                    Some(param_order) => {
                        let param_order =
                            serde_json::from_str::<Vec<i32>>
                                (&param_order);
                        match param_order {
                            Ok(param_order) => Some(param_order),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter order - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter order")),
                        }
                    },
                    None => None,
                };
                let param_order = match param_order {
                    Some(param_order) => param_order,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter order"))
                        .expect("Unable to create Bad Request response for missing query parameter order")),
                };

                                let result = api_impl.reorder_custom_profile_fields(
                                            param_order.as_ref(),
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ReorderCustomProfileFieldsResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for REORDER_CUSTOM_PROFILE_FIELDS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UpdateLinkifier - PATCH /realm/filters/{filter_id}
            &hyper::Method::PATCH if path.matched(paths::ID_REALM_FILTERS_FILTER_ID) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_REALM_FILTERS_FILTER_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE REALM_FILTERS_FILTER_ID in set but failed match against \"{}\"", path, paths::REGEX_REALM_FILTERS_FILTER_ID.as_str())
                    );

                let param_filter_id = match percent_encoding::percent_decode(path_params["filter_id"].as_bytes()).decode_utf8() {
                    Ok(param_filter_id) => match param_filter_id.parse::<i32>() {
                        Ok(param_filter_id) => param_filter_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter filter_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["filter_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_pattern = query_params.iter().filter(|e| e.0 == "pattern").map(|e| e.1.to_owned())
                    .nth(0);
                let param_pattern = match param_pattern {
                    Some(param_pattern) => {
                        let param_pattern =
                            <String as std::str::FromStr>::from_str
                                (&param_pattern);
                        match param_pattern {
                            Ok(param_pattern) => Some(param_pattern),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter pattern - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter pattern")),
                        }
                    },
                    None => None,
                };
                let param_pattern = match param_pattern {
                    Some(param_pattern) => param_pattern,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter pattern"))
                        .expect("Unable to create Bad Request response for missing query parameter pattern")),
                };
                let param_url_format_string = query_params.iter().filter(|e| e.0 == "url_format_string").map(|e| e.1.to_owned())
                    .nth(0);
                let param_url_format_string = match param_url_format_string {
                    Some(param_url_format_string) => {
                        let param_url_format_string =
                            <String as std::str::FromStr>::from_str
                                (&param_url_format_string);
                        match param_url_format_string {
                            Ok(param_url_format_string) => Some(param_url_format_string),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter url_format_string - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter url_format_string")),
                        }
                    },
                    None => None,
                };
                let param_url_format_string = match param_url_format_string {
                    Some(param_url_format_string) => param_url_format_string,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter url_format_string"))
                        .expect("Unable to create Bad Request response for missing query parameter url_format_string")),
                };

                                let result = api_impl.update_linkifier(
                                            param_filter_id,
                                            param_pattern,
                                            param_url_format_string,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UpdateLinkifierResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for UPDATE_LINKIFIER_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UploadCustomEmoji - POST /realm/emoji/{emoji_name}
            &hyper::Method::POST if path.matched(paths::ID_REALM_EMOJI_EMOJI_NAME) => {
                let boundary = match swagger::multipart::form::boundary(&headers) {
                    Some(boundary) => boundary.to_string(),
                    None => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from("Couldn't find valid multipart body".to_string()))
                                .expect("Unable to create Bad Request response for incorrect boundary")),
                };

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_REALM_EMOJI_EMOJI_NAME
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE REALM_EMOJI_EMOJI_NAME in set but failed match against \"{}\"", path, paths::REGEX_REALM_EMOJI_EMOJI_NAME.as_str())
                    );

                let param_emoji_name = match percent_encoding::percent_decode(path_params["emoji_name"].as_bytes()).decode_utf8() {
                    Ok(param_emoji_name) => match param_emoji_name.parse::<String>() {
                        Ok(param_emoji_name) => param_emoji_name,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter emoji_name: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["emoji_name"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Form Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.to_raw();
                match result.await {
                            Ok(body) => {
                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary).save().temp() {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    _ => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Unable to process all message parts")))
                                                        .expect("Unable to create Bad Request response due to failure to process all message"))
                                    },
                                };
                                let field_filename = entries.fields.remove("filename");
                                let param_filename = match field_filename {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for filename");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let filename_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("filename data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter filename"))
                                            }
                                        };
                                        filename_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let result = api_impl.upload_custom_emoji(
                                            param_emoji_name,
                                            param_filename,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UploadCustomEmojiResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for UPLOAD_CUSTOM_EMOJI_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read multipart body")))
                                                .expect("Unable to create Bad Request response due to unable read multipart body")),
                        }
            },

            // ArchiveStream - DELETE /streams/{stream_id}
            &hyper::Method::DELETE if path.matched(paths::ID_STREAMS_STREAM_ID) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_STREAMS_STREAM_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE STREAMS_STREAM_ID in set but failed match against \"{}\"", path, paths::REGEX_STREAMS_STREAM_ID.as_str())
                    );

                let param_stream_id = match percent_encoding::percent_decode(path_params["stream_id"].as_bytes()).decode_utf8() {
                    Ok(param_stream_id) => match param_stream_id.parse::<i32>() {
                        Ok(param_stream_id) => param_stream_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter stream_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["stream_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.archive_stream(
                                            param_stream_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ArchiveStreamResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ARCHIVE_STREAM_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                ArchiveStreamResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ARCHIVE_STREAM_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CreateBigBlueButtonVideoCall - GET /calls/bigbluebutton/create
            &hyper::Method::GET if path.matched(paths::ID_CALLS_BIGBLUEBUTTON_CREATE) => {
                                let result = api_impl.create_big_blue_button_video_call(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateBigBlueButtonVideoCallResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CREATE_BIG_BLUE_BUTTON_VIDEO_CALL_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // DeleteTopic - POST /streams/{stream_id}/delete_topic
            &hyper::Method::POST if path.matched(paths::ID_STREAMS_STREAM_ID_DELETE_TOPIC) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_STREAMS_STREAM_ID_DELETE_TOPIC
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE STREAMS_STREAM_ID_DELETE_TOPIC in set but failed match against \"{}\"", path, paths::REGEX_STREAMS_STREAM_ID_DELETE_TOPIC.as_str())
                    );

                let param_stream_id = match percent_encoding::percent_decode(path_params["stream_id"].as_bytes()).decode_utf8() {
                    Ok(param_stream_id) => match param_stream_id.parse::<i32>() {
                        Ok(param_stream_id) => param_stream_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter stream_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["stream_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_topic_name = query_params.iter().filter(|e| e.0 == "topic_name").map(|e| e.1.to_owned())
                    .nth(0);
                let param_topic_name = match param_topic_name {
                    Some(param_topic_name) => {
                        let param_topic_name =
                            <String as std::str::FromStr>::from_str
                                (&param_topic_name);
                        match param_topic_name {
                            Ok(param_topic_name) => Some(param_topic_name),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter topic_name - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter topic_name")),
                        }
                    },
                    None => None,
                };
                let param_topic_name = match param_topic_name {
                    Some(param_topic_name) => param_topic_name,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter topic_name"))
                        .expect("Unable to create Bad Request response for missing query parameter topic_name")),
                };

                                let result = api_impl.delete_topic(
                                            param_stream_id,
                                            param_topic_name,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteTopicResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for DELETE_TOPIC_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                DeleteTopicResponse::Error
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for DELETE_TOPIC_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetStreamId - GET /get_stream_id
            &hyper::Method::GET if path.matched(paths::ID_GET_STREAM_ID) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_stream = query_params.iter().filter(|e| e.0 == "stream").map(|e| e.1.to_owned())
                    .nth(0);
                let param_stream = match param_stream {
                    Some(param_stream) => {
                        let param_stream =
                            <String as std::str::FromStr>::from_str
                                (&param_stream);
                        match param_stream {
                            Ok(param_stream) => Some(param_stream),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter stream - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter stream")),
                        }
                    },
                    None => None,
                };
                let param_stream = match param_stream {
                    Some(param_stream) => param_stream,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter stream"))
                        .expect("Unable to create Bad Request response for missing query parameter stream")),
                };

                                let result = api_impl.get_stream_id(
                                            param_stream,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetStreamIdResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_STREAM_ID_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                GetStreamIdResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_STREAM_ID_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetStreamTopics - GET /users/me/{stream_id}/topics
            &hyper::Method::GET if path.matched(paths::ID_USERS_ME_STREAM_ID_TOPICS) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_USERS_ME_STREAM_ID_TOPICS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE USERS_ME_STREAM_ID_TOPICS in set but failed match against \"{}\"", path, paths::REGEX_USERS_ME_STREAM_ID_TOPICS.as_str())
                    );

                let param_stream_id = match percent_encoding::percent_decode(path_params["stream_id"].as_bytes()).decode_utf8() {
                    Ok(param_stream_id) => match param_stream_id.parse::<i32>() {
                        Ok(param_stream_id) => param_stream_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter stream_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["stream_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_stream_topics(
                                            param_stream_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetStreamTopicsResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_STREAM_TOPICS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                GetStreamTopicsResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_STREAM_TOPICS_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetStreams - GET /streams
            &hyper::Method::GET if path.matched(paths::ID_STREAMS) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_include_public = query_params.iter().filter(|e| e.0 == "include_public").map(|e| e.1.to_owned())
                    .nth(0);
                let param_include_public = match param_include_public {
                    Some(param_include_public) => {
                        let param_include_public =
                            <bool as std::str::FromStr>::from_str
                                (&param_include_public);
                        match param_include_public {
                            Ok(param_include_public) => Some(param_include_public),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter include_public - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter include_public")),
                        }
                    },
                    None => None,
                };
                let param_include_web_public = query_params.iter().filter(|e| e.0 == "include_web_public").map(|e| e.1.to_owned())
                    .nth(0);
                let param_include_web_public = match param_include_web_public {
                    Some(param_include_web_public) => {
                        let param_include_web_public =
                            <bool as std::str::FromStr>::from_str
                                (&param_include_web_public);
                        match param_include_web_public {
                            Ok(param_include_web_public) => Some(param_include_web_public),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter include_web_public - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter include_web_public")),
                        }
                    },
                    None => None,
                };
                let param_include_subscribed = query_params.iter().filter(|e| e.0 == "include_subscribed").map(|e| e.1.to_owned())
                    .nth(0);
                let param_include_subscribed = match param_include_subscribed {
                    Some(param_include_subscribed) => {
                        let param_include_subscribed =
                            <bool as std::str::FromStr>::from_str
                                (&param_include_subscribed);
                        match param_include_subscribed {
                            Ok(param_include_subscribed) => Some(param_include_subscribed),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter include_subscribed - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter include_subscribed")),
                        }
                    },
                    None => None,
                };
                let param_include_all_active = query_params.iter().filter(|e| e.0 == "include_all_active").map(|e| e.1.to_owned())
                    .nth(0);
                let param_include_all_active = match param_include_all_active {
                    Some(param_include_all_active) => {
                        let param_include_all_active =
                            <bool as std::str::FromStr>::from_str
                                (&param_include_all_active);
                        match param_include_all_active {
                            Ok(param_include_all_active) => Some(param_include_all_active),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter include_all_active - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter include_all_active")),
                        }
                    },
                    None => None,
                };
                let param_include_default = query_params.iter().filter(|e| e.0 == "include_default").map(|e| e.1.to_owned())
                    .nth(0);
                let param_include_default = match param_include_default {
                    Some(param_include_default) => {
                        let param_include_default =
                            <bool as std::str::FromStr>::from_str
                                (&param_include_default);
                        match param_include_default {
                            Ok(param_include_default) => Some(param_include_default),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter include_default - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter include_default")),
                        }
                    },
                    None => None,
                };
                let param_include_owner_subscribed = query_params.iter().filter(|e| e.0 == "include_owner_subscribed").map(|e| e.1.to_owned())
                    .nth(0);
                let param_include_owner_subscribed = match param_include_owner_subscribed {
                    Some(param_include_owner_subscribed) => {
                        let param_include_owner_subscribed =
                            <bool as std::str::FromStr>::from_str
                                (&param_include_owner_subscribed);
                        match param_include_owner_subscribed {
                            Ok(param_include_owner_subscribed) => Some(param_include_owner_subscribed),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter include_owner_subscribed - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter include_owner_subscribed")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.get_streams(
                                            param_include_public,
                                            param_include_web_public,
                                            param_include_subscribed,
                                            param_include_all_active,
                                            param_include_default,
                                            param_include_owner_subscribed,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetStreamsResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_STREAMS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                GetStreamsResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_STREAMS_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetSubscribers - GET /streams/{stream_id}/members
            &hyper::Method::GET if path.matched(paths::ID_STREAMS_STREAM_ID_MEMBERS) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_STREAMS_STREAM_ID_MEMBERS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE STREAMS_STREAM_ID_MEMBERS in set but failed match against \"{}\"", path, paths::REGEX_STREAMS_STREAM_ID_MEMBERS.as_str())
                    );

                let param_stream_id = match percent_encoding::percent_decode(path_params["stream_id"].as_bytes()).decode_utf8() {
                    Ok(param_stream_id) => match param_stream_id.parse::<i32>() {
                        Ok(param_stream_id) => param_stream_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter stream_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["stream_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_subscribers(
                                            param_stream_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetSubscribersResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_SUBSCRIBERS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                GetSubscribersResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_SUBSCRIBERS_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetSubscriptionStatus - GET /users/{user_id}/subscriptions/{stream_id}
            &hyper::Method::GET if path.matched(paths::ID_USERS_USER_ID_SUBSCRIPTIONS_STREAM_ID) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_USERS_USER_ID_SUBSCRIPTIONS_STREAM_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE USERS_USER_ID_SUBSCRIPTIONS_STREAM_ID in set but failed match against \"{}\"", path, paths::REGEX_USERS_USER_ID_SUBSCRIPTIONS_STREAM_ID.as_str())
                    );

                let param_user_id = match percent_encoding::percent_decode(path_params["user_id"].as_bytes()).decode_utf8() {
                    Ok(param_user_id) => match param_user_id.parse::<i32>() {
                        Ok(param_user_id) => param_user_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter user_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["user_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_stream_id = match percent_encoding::percent_decode(path_params["stream_id"].as_bytes()).decode_utf8() {
                    Ok(param_stream_id) => match param_stream_id.parse::<i32>() {
                        Ok(param_stream_id) => param_stream_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter stream_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["stream_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_subscription_status(
                                            param_user_id,
                                            param_stream_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetSubscriptionStatusResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_SUBSCRIPTION_STATUS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetSubscriptions - GET /users/me/subscriptions
            &hyper::Method::GET if path.matched(paths::ID_USERS_ME_SUBSCRIPTIONS) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_include_subscribers = query_params.iter().filter(|e| e.0 == "include_subscribers").map(|e| e.1.to_owned())
                    .nth(0);
                let param_include_subscribers = match param_include_subscribers {
                    Some(param_include_subscribers) => {
                        let param_include_subscribers =
                            <bool as std::str::FromStr>::from_str
                                (&param_include_subscribers);
                        match param_include_subscribers {
                            Ok(param_include_subscribers) => Some(param_include_subscribers),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter include_subscribers - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter include_subscribers")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.get_subscriptions(
                                            param_include_subscribers,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetSubscriptionsResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_SUBSCRIPTIONS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // MuteTopic - PATCH /users/me/subscriptions/muted_topics
            &hyper::Method::PATCH if path.matched(paths::ID_USERS_ME_SUBSCRIPTIONS_MUTED_TOPICS) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_stream = query_params.iter().filter(|e| e.0 == "stream").map(|e| e.1.to_owned())
                    .nth(0);
                let param_stream = match param_stream {
                    Some(param_stream) => {
                        let param_stream =
                            <String as std::str::FromStr>::from_str
                                (&param_stream);
                        match param_stream {
                            Ok(param_stream) => Some(param_stream),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter stream - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter stream")),
                        }
                    },
                    None => None,
                };
                let param_stream_id = query_params.iter().filter(|e| e.0 == "stream_id").map(|e| e.1.to_owned())
                    .nth(0);
                let param_stream_id = match param_stream_id {
                    Some(param_stream_id) => {
                        let param_stream_id =
                            <i32 as std::str::FromStr>::from_str
                                (&param_stream_id);
                        match param_stream_id {
                            Ok(param_stream_id) => Some(param_stream_id),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter stream_id - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter stream_id")),
                        }
                    },
                    None => None,
                };
                let param_topic = query_params.iter().filter(|e| e.0 == "topic").map(|e| e.1.to_owned())
                    .nth(0);
                let param_topic = match param_topic {
                    Some(param_topic) => {
                        let param_topic =
                            <String as std::str::FromStr>::from_str
                                (&param_topic);
                        match param_topic {
                            Ok(param_topic) => Some(param_topic),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter topic - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter topic")),
                        }
                    },
                    None => None,
                };
                let param_topic = match param_topic {
                    Some(param_topic) => param_topic,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter topic"))
                        .expect("Unable to create Bad Request response for missing query parameter topic")),
                };
                let param_op = query_params.iter().filter(|e| e.0 == "op").map(|e| e.1.to_owned())
                    .nth(0);
                let param_op = match param_op {
                    Some(param_op) => {
                        let param_op =
                            <String as std::str::FromStr>::from_str
                                (&param_op);
                        match param_op {
                            Ok(param_op) => Some(param_op),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter op - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter op")),
                        }
                    },
                    None => None,
                };
                let param_op = match param_op {
                    Some(param_op) => param_op,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter op"))
                        .expect("Unable to create Bad Request response for missing query parameter op")),
                };

                                let result = api_impl.mute_topic(
                                            param_topic,
                                            param_op,
                                            param_stream,
                                            param_stream_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MuteTopicResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for MUTE_TOPIC_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                MuteTopicResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for MUTE_TOPIC_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // Subscribe - POST /users/me/subscriptions
            &hyper::Method::POST if path.matched(paths::ID_USERS_ME_SUBSCRIPTIONS) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_subscriptions = query_params.iter().filter(|e| e.0 == "subscriptions").map(|e| e.1.to_owned())
                    .nth(0);
                let param_subscriptions = match param_subscriptions {
                    Some(param_subscriptions) => {
                        let param_subscriptions =
                            serde_json::from_str::<Vec<serde_json::Value>>
                                (&param_subscriptions);
                        match param_subscriptions {
                            Ok(param_subscriptions) => Some(param_subscriptions),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter subscriptions - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter subscriptions")),
                        }
                    },
                    None => None,
                };
                let param_subscriptions = match param_subscriptions {
                    Some(param_subscriptions) => param_subscriptions,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter subscriptions"))
                        .expect("Unable to create Bad Request response for missing query parameter subscriptions")),
                };
                let param_principals = query_params.iter().filter(|e| e.0 == "principals").map(|e| e.1.to_owned())
                    .nth(0);
                let param_principals = match param_principals {
                    Some(param_principals) => {
                        let param_principals =
                            serde_json::from_str::<Vec<swagger::OneOf2<String,i32>>>
                                (&param_principals);
                        match param_principals {
                            Ok(param_principals) => Some(param_principals),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter principals - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter principals")),
                        }
                    },
                    None => None,
                };
                let param_authorization_errors_fatal = query_params.iter().filter(|e| e.0 == "authorization_errors_fatal").map(|e| e.1.to_owned())
                    .nth(0);
                let param_authorization_errors_fatal = match param_authorization_errors_fatal {
                    Some(param_authorization_errors_fatal) => {
                        let param_authorization_errors_fatal =
                            <bool as std::str::FromStr>::from_str
                                (&param_authorization_errors_fatal);
                        match param_authorization_errors_fatal {
                            Ok(param_authorization_errors_fatal) => Some(param_authorization_errors_fatal),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter authorization_errors_fatal - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter authorization_errors_fatal")),
                        }
                    },
                    None => None,
                };
                let param_announce = query_params.iter().filter(|e| e.0 == "announce").map(|e| e.1.to_owned())
                    .nth(0);
                let param_announce = match param_announce {
                    Some(param_announce) => {
                        let param_announce =
                            <bool as std::str::FromStr>::from_str
                                (&param_announce);
                        match param_announce {
                            Ok(param_announce) => Some(param_announce),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter announce - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter announce")),
                        }
                    },
                    None => None,
                };
                let param_invite_only = query_params.iter().filter(|e| e.0 == "invite_only").map(|e| e.1.to_owned())
                    .nth(0);
                let param_invite_only = match param_invite_only {
                    Some(param_invite_only) => {
                        let param_invite_only =
                            <bool as std::str::FromStr>::from_str
                                (&param_invite_only);
                        match param_invite_only {
                            Ok(param_invite_only) => Some(param_invite_only),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter invite_only - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter invite_only")),
                        }
                    },
                    None => None,
                };
                let param_history_public_to_subscribers = query_params.iter().filter(|e| e.0 == "history_public_to_subscribers").map(|e| e.1.to_owned())
                    .nth(0);
                let param_history_public_to_subscribers = match param_history_public_to_subscribers {
                    Some(param_history_public_to_subscribers) => {
                        let param_history_public_to_subscribers =
                            <bool as std::str::FromStr>::from_str
                                (&param_history_public_to_subscribers);
                        match param_history_public_to_subscribers {
                            Ok(param_history_public_to_subscribers) => Some(param_history_public_to_subscribers),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter history_public_to_subscribers - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter history_public_to_subscribers")),
                        }
                    },
                    None => None,
                };
                let param_stream_post_policy = query_params.iter().filter(|e| e.0 == "stream_post_policy").map(|e| e.1.to_owned())
                    .nth(0);
                let param_stream_post_policy = match param_stream_post_policy {
                    Some(param_stream_post_policy) => {
                        let param_stream_post_policy =
                            <i32 as std::str::FromStr>::from_str
                                (&param_stream_post_policy);
                        match param_stream_post_policy {
                            Ok(param_stream_post_policy) => Some(param_stream_post_policy),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter stream_post_policy - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter stream_post_policy")),
                        }
                    },
                    None => None,
                };
                let param_message_retention_days = query_params.iter().filter(|e| e.0 == "message_retention_days").map(|e| e.1.to_owned())
                    .nth(0);
                let param_message_retention_days = match param_message_retention_days {
                    Some(param_message_retention_days) => {
                        let param_message_retention_days =
                            <swagger::OneOf2<String,i32> as std::str::FromStr>::from_str
                                (&param_message_retention_days);
                        match param_message_retention_days {
                            Ok(param_message_retention_days) => Some(param_message_retention_days),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter message_retention_days - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter message_retention_days")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.subscribe(
                                            param_subscriptions.as_ref(),
                                            param_principals.as_ref(),
                                            param_authorization_errors_fatal,
                                            param_announce,
                                            param_invite_only,
                                            param_history_public_to_subscribers,
                                            param_stream_post_policy,
                                            param_message_retention_days,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                SubscribeResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for SUBSCRIBE_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                SubscribeResponse::Success_2
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for SUBSCRIBE_SUCCESS_2"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // Unsubscribe - DELETE /users/me/subscriptions
            &hyper::Method::DELETE if path.matched(paths::ID_USERS_ME_SUBSCRIPTIONS) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_subscriptions = query_params.iter().filter(|e| e.0 == "subscriptions").map(|e| e.1.to_owned())
                    .nth(0);
                let param_subscriptions = match param_subscriptions {
                    Some(param_subscriptions) => {
                        let param_subscriptions =
                            serde_json::from_str::<Vec<String>>
                                (&param_subscriptions);
                        match param_subscriptions {
                            Ok(param_subscriptions) => Some(param_subscriptions),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter subscriptions - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter subscriptions")),
                        }
                    },
                    None => None,
                };
                let param_subscriptions = match param_subscriptions {
                    Some(param_subscriptions) => param_subscriptions,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter subscriptions"))
                        .expect("Unable to create Bad Request response for missing query parameter subscriptions")),
                };
                let param_principals = query_params.iter().filter(|e| e.0 == "principals").map(|e| e.1.to_owned())
                    .nth(0);
                let param_principals = match param_principals {
                    Some(param_principals) => {
                        let param_principals =
                            serde_json::from_str::<Vec<swagger::OneOf2<String,i32>>>
                                (&param_principals);
                        match param_principals {
                            Ok(param_principals) => Some(param_principals),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter principals - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter principals")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.unsubscribe(
                                            param_subscriptions.as_ref(),
                                            param_principals.as_ref(),
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UnsubscribeResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for UNSUBSCRIBE_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                UnsubscribeResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for UNSUBSCRIBE_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UpdateStream - PATCH /streams/{stream_id}
            &hyper::Method::PATCH if path.matched(paths::ID_STREAMS_STREAM_ID) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_STREAMS_STREAM_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE STREAMS_STREAM_ID in set but failed match against \"{}\"", path, paths::REGEX_STREAMS_STREAM_ID.as_str())
                    );

                let param_stream_id = match percent_encoding::percent_decode(path_params["stream_id"].as_bytes()).decode_utf8() {
                    Ok(param_stream_id) => match param_stream_id.parse::<i32>() {
                        Ok(param_stream_id) => param_stream_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter stream_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["stream_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_description = query_params.iter().filter(|e| e.0 == "description").map(|e| e.1.to_owned())
                    .nth(0);
                let param_description = match param_description {
                    Some(param_description) => {
                        let param_description =
                            <String as std::str::FromStr>::from_str
                                (&param_description);
                        match param_description {
                            Ok(param_description) => Some(param_description),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter description - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter description")),
                        }
                    },
                    None => None,
                };
                let param_new_name = query_params.iter().filter(|e| e.0 == "new_name").map(|e| e.1.to_owned())
                    .nth(0);
                let param_new_name = match param_new_name {
                    Some(param_new_name) => {
                        let param_new_name =
                            <String as std::str::FromStr>::from_str
                                (&param_new_name);
                        match param_new_name {
                            Ok(param_new_name) => Some(param_new_name),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter new_name - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter new_name")),
                        }
                    },
                    None => None,
                };
                let param_is_private = query_params.iter().filter(|e| e.0 == "is_private").map(|e| e.1.to_owned())
                    .nth(0);
                let param_is_private = match param_is_private {
                    Some(param_is_private) => {
                        let param_is_private =
                            <bool as std::str::FromStr>::from_str
                                (&param_is_private);
                        match param_is_private {
                            Ok(param_is_private) => Some(param_is_private),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter is_private - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter is_private")),
                        }
                    },
                    None => None,
                };
                let param_is_announcement_only = query_params.iter().filter(|e| e.0 == "is_announcement_only").map(|e| e.1.to_owned())
                    .nth(0);
                let param_is_announcement_only = match param_is_announcement_only {
                    Some(param_is_announcement_only) => {
                        let param_is_announcement_only =
                            <bool as std::str::FromStr>::from_str
                                (&param_is_announcement_only);
                        match param_is_announcement_only {
                            Ok(param_is_announcement_only) => Some(param_is_announcement_only),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter is_announcement_only - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter is_announcement_only")),
                        }
                    },
                    None => None,
                };
                let param_stream_post_policy = query_params.iter().filter(|e| e.0 == "stream_post_policy").map(|e| e.1.to_owned())
                    .nth(0);
                let param_stream_post_policy = match param_stream_post_policy {
                    Some(param_stream_post_policy) => {
                        let param_stream_post_policy =
                            <i32 as std::str::FromStr>::from_str
                                (&param_stream_post_policy);
                        match param_stream_post_policy {
                            Ok(param_stream_post_policy) => Some(param_stream_post_policy),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter stream_post_policy - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter stream_post_policy")),
                        }
                    },
                    None => None,
                };
                let param_history_public_to_subscribers = query_params.iter().filter(|e| e.0 == "history_public_to_subscribers").map(|e| e.1.to_owned())
                    .nth(0);
                let param_history_public_to_subscribers = match param_history_public_to_subscribers {
                    Some(param_history_public_to_subscribers) => {
                        let param_history_public_to_subscribers =
                            <bool as std::str::FromStr>::from_str
                                (&param_history_public_to_subscribers);
                        match param_history_public_to_subscribers {
                            Ok(param_history_public_to_subscribers) => Some(param_history_public_to_subscribers),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter history_public_to_subscribers - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter history_public_to_subscribers")),
                        }
                    },
                    None => None,
                };
                let param_message_retention_days = query_params.iter().filter(|e| e.0 == "message_retention_days").map(|e| e.1.to_owned())
                    .nth(0);
                let param_message_retention_days = match param_message_retention_days {
                    Some(param_message_retention_days) => {
                        let param_message_retention_days =
                            <swagger::OneOf2<String,i32> as std::str::FromStr>::from_str
                                (&param_message_retention_days);
                        match param_message_retention_days {
                            Ok(param_message_retention_days) => Some(param_message_retention_days),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter message_retention_days - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter message_retention_days")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.update_stream(
                                            param_stream_id,
                                            param_description,
                                            param_new_name,
                                            param_is_private,
                                            param_is_announcement_only,
                                            param_stream_post_policy,
                                            param_history_public_to_subscribers,
                                            param_message_retention_days,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UpdateStreamResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for UPDATE_STREAM_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                UpdateStreamResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for UPDATE_STREAM_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UpdateSubscriptionSettings - POST /users/me/subscriptions/properties
            &hyper::Method::POST if path.matched(paths::ID_USERS_ME_SUBSCRIPTIONS_PROPERTIES) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_subscription_data = query_params.iter().filter(|e| e.0 == "subscription_data").map(|e| e.1.to_owned())
                    .nth(0);
                let param_subscription_data = match param_subscription_data {
                    Some(param_subscription_data) => {
                        let param_subscription_data =
                            serde_json::from_str::<Vec<serde_json::Value>>
                                (&param_subscription_data);
                        match param_subscription_data {
                            Ok(param_subscription_data) => Some(param_subscription_data),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter subscription_data - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter subscription_data")),
                        }
                    },
                    None => None,
                };
                let param_subscription_data = match param_subscription_data {
                    Some(param_subscription_data) => param_subscription_data,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter subscription_data"))
                        .expect("Unable to create Bad Request response for missing query parameter subscription_data")),
                };

                                let result = api_impl.update_subscription_settings(
                                            param_subscription_data.as_ref(),
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UpdateSubscriptionSettingsResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for UPDATE_SUBSCRIPTION_SETTINGS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UpdateSubscriptions - PATCH /users/me/subscriptions
            &hyper::Method::PATCH if path.matched(paths::ID_USERS_ME_SUBSCRIPTIONS) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_delete = query_params.iter().filter(|e| e.0 == "delete").map(|e| e.1.to_owned())
                    .nth(0);
                let param_delete = match param_delete {
                    Some(param_delete) => {
                        let param_delete =
                            serde_json::from_str::<Vec<String>>
                                (&param_delete);
                        match param_delete {
                            Ok(param_delete) => Some(param_delete),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter delete - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter delete")),
                        }
                    },
                    None => None,
                };
                let param_add = query_params.iter().filter(|e| e.0 == "add").map(|e| e.1.to_owned())
                    .nth(0);
                let param_add = match param_add {
                    Some(param_add) => {
                        let param_add =
                            serde_json::from_str::<Vec<serde_json::Value>>
                                (&param_add);
                        match param_add {
                            Ok(param_add) => Some(param_add),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter add - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter add")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.update_subscriptions(
                                            param_delete.as_ref(),
                                            param_add.as_ref(),
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UpdateSubscriptionsResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for UPDATE_SUBSCRIPTIONS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CreateUser - POST /users
            &hyper::Method::POST if path.matched(paths::ID_USERS) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_email = query_params.iter().filter(|e| e.0 == "email").map(|e| e.1.to_owned())
                    .nth(0);
                let param_email = match param_email {
                    Some(param_email) => {
                        let param_email =
                            <String as std::str::FromStr>::from_str
                                (&param_email);
                        match param_email {
                            Ok(param_email) => Some(param_email),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter email - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter email")),
                        }
                    },
                    None => None,
                };
                let param_email = match param_email {
                    Some(param_email) => param_email,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter email"))
                        .expect("Unable to create Bad Request response for missing query parameter email")),
                };
                let param_password = query_params.iter().filter(|e| e.0 == "password").map(|e| e.1.to_owned())
                    .nth(0);
                let param_password = match param_password {
                    Some(param_password) => {
                        let param_password =
                            <String as std::str::FromStr>::from_str
                                (&param_password);
                        match param_password {
                            Ok(param_password) => Some(param_password),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter password - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter password")),
                        }
                    },
                    None => None,
                };
                let param_password = match param_password {
                    Some(param_password) => param_password,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter password"))
                        .expect("Unable to create Bad Request response for missing query parameter password")),
                };
                let param_full_name = query_params.iter().filter(|e| e.0 == "full_name").map(|e| e.1.to_owned())
                    .nth(0);
                let param_full_name = match param_full_name {
                    Some(param_full_name) => {
                        let param_full_name =
                            <String as std::str::FromStr>::from_str
                                (&param_full_name);
                        match param_full_name {
                            Ok(param_full_name) => Some(param_full_name),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter full_name - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter full_name")),
                        }
                    },
                    None => None,
                };
                let param_full_name = match param_full_name {
                    Some(param_full_name) => param_full_name,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter full_name"))
                        .expect("Unable to create Bad Request response for missing query parameter full_name")),
                };

                                let result = api_impl.create_user(
                                            param_email,
                                            param_password,
                                            param_full_name,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateUserResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CREATE_USER_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CreateUserResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CREATE_USER_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CreateUserGroup - POST /user_groups/create
            &hyper::Method::POST if path.matched(paths::ID_USER_GROUPS_CREATE) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_name = query_params.iter().filter(|e| e.0 == "name").map(|e| e.1.to_owned())
                    .nth(0);
                let param_name = match param_name {
                    Some(param_name) => {
                        let param_name =
                            <String as std::str::FromStr>::from_str
                                (&param_name);
                        match param_name {
                            Ok(param_name) => Some(param_name),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter name - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter name")),
                        }
                    },
                    None => None,
                };
                let param_name = match param_name {
                    Some(param_name) => param_name,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter name"))
                        .expect("Unable to create Bad Request response for missing query parameter name")),
                };
                let param_description = query_params.iter().filter(|e| e.0 == "description").map(|e| e.1.to_owned())
                    .nth(0);
                let param_description = match param_description {
                    Some(param_description) => {
                        let param_description =
                            <String as std::str::FromStr>::from_str
                                (&param_description);
                        match param_description {
                            Ok(param_description) => Some(param_description),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter description - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter description")),
                        }
                    },
                    None => None,
                };
                let param_description = match param_description {
                    Some(param_description) => param_description,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter description"))
                        .expect("Unable to create Bad Request response for missing query parameter description")),
                };
                let param_members = query_params.iter().filter(|e| e.0 == "members").map(|e| e.1.to_owned())
                    .nth(0);
                let param_members = match param_members {
                    Some(param_members) => {
                        let param_members =
                            serde_json::from_str::<Vec<i32>>
                                (&param_members);
                        match param_members {
                            Ok(param_members) => Some(param_members),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter members - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter members")),
                        }
                    },
                    None => None,
                };
                let param_members = match param_members {
                    Some(param_members) => param_members,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter members"))
                        .expect("Unable to create Bad Request response for missing query parameter members")),
                };

                                let result = api_impl.create_user_group(
                                            param_name,
                                            param_description,
                                            param_members.as_ref(),
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateUserGroupResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CREATE_USER_GROUP_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CreateUserGroupResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CREATE_USER_GROUP_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // DeactivateOwnUser - DELETE /users/me
            &hyper::Method::DELETE if path.matched(paths::ID_USERS_ME) => {
                                let result = api_impl.deactivate_own_user(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeactivateOwnUserResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for DEACTIVATE_OWN_USER_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                DeactivateOwnUserResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for DEACTIVATE_OWN_USER_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // DeactivateUser - DELETE /users/{user_id}
            &hyper::Method::DELETE if path.matched(paths::ID_USERS_USER_ID) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_USERS_USER_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE USERS_USER_ID in set but failed match against \"{}\"", path, paths::REGEX_USERS_USER_ID.as_str())
                    );

                let param_user_id = match percent_encoding::percent_decode(path_params["user_id"].as_bytes()).decode_utf8() {
                    Ok(param_user_id) => match param_user_id.parse::<i32>() {
                        Ok(param_user_id) => param_user_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter user_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["user_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.deactivate_user(
                                            param_user_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeactivateUserResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for DEACTIVATE_USER_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                DeactivateUserResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for DEACTIVATE_USER_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetAttachments - GET /attachments
            &hyper::Method::GET if path.matched(paths::ID_ATTACHMENTS) => {
                                let result = api_impl.get_attachments(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAttachmentsResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_ATTACHMENTS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetOwnUser - GET /users/me
            &hyper::Method::GET if path.matched(paths::ID_USERS_ME) => {
                                let result = api_impl.get_own_user(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetOwnUserResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_OWN_USER_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetUser - GET /users/{user_id}
            &hyper::Method::GET if path.matched(paths::ID_USERS_USER_ID) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_USERS_USER_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE USERS_USER_ID in set but failed match against \"{}\"", path, paths::REGEX_USERS_USER_ID.as_str())
                    );

                let param_user_id = match percent_encoding::percent_decode(path_params["user_id"].as_bytes()).decode_utf8() {
                    Ok(param_user_id) => match param_user_id.parse::<i32>() {
                        Ok(param_user_id) => param_user_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter user_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["user_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_client_gravatar = query_params.iter().filter(|e| e.0 == "client_gravatar").map(|e| e.1.to_owned())
                    .nth(0);
                let param_client_gravatar = match param_client_gravatar {
                    Some(param_client_gravatar) => {
                        let param_client_gravatar =
                            <bool as std::str::FromStr>::from_str
                                (&param_client_gravatar);
                        match param_client_gravatar {
                            Ok(param_client_gravatar) => Some(param_client_gravatar),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter client_gravatar - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter client_gravatar")),
                        }
                    },
                    None => None,
                };
                let param_include_custom_profile_fields = query_params.iter().filter(|e| e.0 == "include_custom_profile_fields").map(|e| e.1.to_owned())
                    .nth(0);
                let param_include_custom_profile_fields = match param_include_custom_profile_fields {
                    Some(param_include_custom_profile_fields) => {
                        let param_include_custom_profile_fields =
                            <bool as std::str::FromStr>::from_str
                                (&param_include_custom_profile_fields);
                        match param_include_custom_profile_fields {
                            Ok(param_include_custom_profile_fields) => Some(param_include_custom_profile_fields),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter include_custom_profile_fields - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter include_custom_profile_fields")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.get_user(
                                            param_user_id,
                                            param_client_gravatar,
                                            param_include_custom_profile_fields,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetUserResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_USER_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetUserByEmail - GET /users/{email}
            &hyper::Method::GET if path.matched(paths::ID_USERS_EMAIL) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_USERS_EMAIL
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE USERS_EMAIL in set but failed match against \"{}\"", path, paths::REGEX_USERS_EMAIL.as_str())
                    );

                let param_email = match percent_encoding::percent_decode(path_params["email"].as_bytes()).decode_utf8() {
                    Ok(param_email) => match param_email.parse::<String>() {
                        Ok(param_email) => param_email,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter email: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["email"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_client_gravatar = query_params.iter().filter(|e| e.0 == "client_gravatar").map(|e| e.1.to_owned())
                    .nth(0);
                let param_client_gravatar = match param_client_gravatar {
                    Some(param_client_gravatar) => {
                        let param_client_gravatar =
                            <bool as std::str::FromStr>::from_str
                                (&param_client_gravatar);
                        match param_client_gravatar {
                            Ok(param_client_gravatar) => Some(param_client_gravatar),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter client_gravatar - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter client_gravatar")),
                        }
                    },
                    None => None,
                };
                let param_include_custom_profile_fields = query_params.iter().filter(|e| e.0 == "include_custom_profile_fields").map(|e| e.1.to_owned())
                    .nth(0);
                let param_include_custom_profile_fields = match param_include_custom_profile_fields {
                    Some(param_include_custom_profile_fields) => {
                        let param_include_custom_profile_fields =
                            <bool as std::str::FromStr>::from_str
                                (&param_include_custom_profile_fields);
                        match param_include_custom_profile_fields {
                            Ok(param_include_custom_profile_fields) => Some(param_include_custom_profile_fields),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter include_custom_profile_fields - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter include_custom_profile_fields")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.get_user_by_email(
                                            param_email,
                                            param_client_gravatar,
                                            param_include_custom_profile_fields,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetUserByEmailResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_USER_BY_EMAIL_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetUserGroups - GET /user_groups
            &hyper::Method::GET if path.matched(paths::ID_USER_GROUPS) => {
                                let result = api_impl.get_user_groups(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetUserGroupsResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_USER_GROUPS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetUserPresence - GET /users/{user_id_or_email}/presence
            &hyper::Method::GET if path.matched(paths::ID_USERS_USER_ID_OR_EMAIL_PRESENCE) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_USERS_USER_ID_OR_EMAIL_PRESENCE
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE USERS_USER_ID_OR_EMAIL_PRESENCE in set but failed match against \"{}\"", path, paths::REGEX_USERS_USER_ID_OR_EMAIL_PRESENCE.as_str())
                    );

                let param_user_id_or_email = match percent_encoding::percent_decode(path_params["user_id_or_email"].as_bytes()).decode_utf8() {
                    Ok(param_user_id_or_email) => match param_user_id_or_email.parse::<String>() {
                        Ok(param_user_id_or_email) => param_user_id_or_email,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter user_id_or_email: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["user_id_or_email"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_user_presence(
                                            param_user_id_or_email,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetUserPresenceResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_USER_PRESENCE_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetUsers - GET /users
            &hyper::Method::GET if path.matched(paths::ID_USERS) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_client_gravatar = query_params.iter().filter(|e| e.0 == "client_gravatar").map(|e| e.1.to_owned())
                    .nth(0);
                let param_client_gravatar = match param_client_gravatar {
                    Some(param_client_gravatar) => {
                        let param_client_gravatar =
                            <bool as std::str::FromStr>::from_str
                                (&param_client_gravatar);
                        match param_client_gravatar {
                            Ok(param_client_gravatar) => Some(param_client_gravatar),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter client_gravatar - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter client_gravatar")),
                        }
                    },
                    None => None,
                };
                let param_include_custom_profile_fields = query_params.iter().filter(|e| e.0 == "include_custom_profile_fields").map(|e| e.1.to_owned())
                    .nth(0);
                let param_include_custom_profile_fields = match param_include_custom_profile_fields {
                    Some(param_include_custom_profile_fields) => {
                        let param_include_custom_profile_fields =
                            <bool as std::str::FromStr>::from_str
                                (&param_include_custom_profile_fields);
                        match param_include_custom_profile_fields {
                            Ok(param_include_custom_profile_fields) => Some(param_include_custom_profile_fields),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter include_custom_profile_fields - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter include_custom_profile_fields")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.get_users(
                                            param_client_gravatar,
                                            param_include_custom_profile_fields,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetUsersResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_USERS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // MuteUser - POST /users/me/muted_users/{muted_user_id}
            &hyper::Method::POST if path.matched(paths::ID_USERS_ME_MUTED_USERS_MUTED_USER_ID) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_USERS_ME_MUTED_USERS_MUTED_USER_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE USERS_ME_MUTED_USERS_MUTED_USER_ID in set but failed match against \"{}\"", path, paths::REGEX_USERS_ME_MUTED_USERS_MUTED_USER_ID.as_str())
                    );

                let param_muted_user_id = match percent_encoding::percent_decode(path_params["muted_user_id"].as_bytes()).decode_utf8() {
                    Ok(param_muted_user_id) => match param_muted_user_id.parse::<i32>() {
                        Ok(param_muted_user_id) => param_muted_user_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter muted_user_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["muted_user_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.mute_user(
                                            param_muted_user_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MuteUserResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for MUTE_USER_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                MuteUserResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for MUTE_USER_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ReactivateUser - POST /users/{user_id}/reactivate
            &hyper::Method::POST if path.matched(paths::ID_USERS_USER_ID_REACTIVATE) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_USERS_USER_ID_REACTIVATE
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE USERS_USER_ID_REACTIVATE in set but failed match against \"{}\"", path, paths::REGEX_USERS_USER_ID_REACTIVATE.as_str())
                    );

                let param_user_id = match percent_encoding::percent_decode(path_params["user_id"].as_bytes()).decode_utf8() {
                    Ok(param_user_id) => match param_user_id.parse::<i32>() {
                        Ok(param_user_id) => param_user_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter user_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["user_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.reactivate_user(
                                            param_user_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ReactivateUserResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for REACTIVATE_USER_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // RemoveUserGroup - DELETE /user_groups/{user_group_id}
            &hyper::Method::DELETE if path.matched(paths::ID_USER_GROUPS_USER_GROUP_ID) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_USER_GROUPS_USER_GROUP_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE USER_GROUPS_USER_GROUP_ID in set but failed match against \"{}\"", path, paths::REGEX_USER_GROUPS_USER_GROUP_ID.as_str())
                    );

                let param_user_group_id = match percent_encoding::percent_decode(path_params["user_group_id"].as_bytes()).decode_utf8() {
                    Ok(param_user_group_id) => match param_user_group_id.parse::<i32>() {
                        Ok(param_user_group_id) => param_user_group_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter user_group_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["user_group_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.remove_user_group(
                                            param_user_group_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RemoveUserGroupResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for REMOVE_USER_GROUP_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                RemoveUserGroupResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for REMOVE_USER_GROUP_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // SetTypingStatus - POST /typing
            &hyper::Method::POST if path.matched(paths::ID_TYPING) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_type_ = query_params.iter().filter(|e| e.0 == "type").map(|e| e.1.to_owned())
                    .nth(0);
                let param_type_ = match param_type_ {
                    Some(param_type_) => {
                        let param_type_ =
                            <String as std::str::FromStr>::from_str
                                (&param_type_);
                        match param_type_ {
                            Ok(param_type_) => Some(param_type_),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter type - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter type")),
                        }
                    },
                    None => None,
                };
                let param_op = query_params.iter().filter(|e| e.0 == "op").map(|e| e.1.to_owned())
                    .nth(0);
                let param_op = match param_op {
                    Some(param_op) => {
                        let param_op =
                            <String as std::str::FromStr>::from_str
                                (&param_op);
                        match param_op {
                            Ok(param_op) => Some(param_op),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter op - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter op")),
                        }
                    },
                    None => None,
                };
                let param_op = match param_op {
                    Some(param_op) => param_op,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter op"))
                        .expect("Unable to create Bad Request response for missing query parameter op")),
                };
                let param_to = query_params.iter().filter(|e| e.0 == "to").map(|e| e.1.to_owned())
                    .nth(0);
                let param_to = match param_to {
                    Some(param_to) => {
                        let param_to =
                            serde_json::from_str::<Vec<i32>>
                                (&param_to);
                        match param_to {
                            Ok(param_to) => Some(param_to),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter to - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter to")),
                        }
                    },
                    None => None,
                };
                let param_to = match param_to {
                    Some(param_to) => param_to,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter to"))
                        .expect("Unable to create Bad Request response for missing query parameter to")),
                };
                let param_topic = query_params.iter().filter(|e| e.0 == "topic").map(|e| e.1.to_owned())
                    .nth(0);
                let param_topic = match param_topic {
                    Some(param_topic) => {
                        let param_topic =
                            <String as std::str::FromStr>::from_str
                                (&param_topic);
                        match param_topic {
                            Ok(param_topic) => Some(param_topic),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter topic - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter topic")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.set_typing_status(
                                            param_op,
                                            param_to.as_ref(),
                                            param_type_,
                                            param_topic,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                SetTypingStatusResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for SET_TYPING_STATUS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                SetTypingStatusResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for SET_TYPING_STATUS_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UnmuteUser - DELETE /users/me/muted_users/{muted_user_id}
            &hyper::Method::DELETE if path.matched(paths::ID_USERS_ME_MUTED_USERS_MUTED_USER_ID) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_USERS_ME_MUTED_USERS_MUTED_USER_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE USERS_ME_MUTED_USERS_MUTED_USER_ID in set but failed match against \"{}\"", path, paths::REGEX_USERS_ME_MUTED_USERS_MUTED_USER_ID.as_str())
                    );

                let param_muted_user_id = match percent_encoding::percent_decode(path_params["muted_user_id"].as_bytes()).decode_utf8() {
                    Ok(param_muted_user_id) => match param_muted_user_id.parse::<i32>() {
                        Ok(param_muted_user_id) => param_muted_user_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter muted_user_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["muted_user_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.unmute_user(
                                            param_muted_user_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UnmuteUserResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for UNMUTE_USER_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                UnmuteUserResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for UNMUTE_USER_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UpdateSettings - PATCH /settings
            &hyper::Method::PATCH if path.matched(paths::ID_SETTINGS) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_full_name = query_params.iter().filter(|e| e.0 == "full_name").map(|e| e.1.to_owned())
                    .nth(0);
                let param_full_name = match param_full_name {
                    Some(param_full_name) => {
                        let param_full_name =
                            <String as std::str::FromStr>::from_str
                                (&param_full_name);
                        match param_full_name {
                            Ok(param_full_name) => Some(param_full_name),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter full_name - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter full_name")),
                        }
                    },
                    None => None,
                };
                let param_email = query_params.iter().filter(|e| e.0 == "email").map(|e| e.1.to_owned())
                    .nth(0);
                let param_email = match param_email {
                    Some(param_email) => {
                        let param_email =
                            <String as std::str::FromStr>::from_str
                                (&param_email);
                        match param_email {
                            Ok(param_email) => Some(param_email),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter email - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter email")),
                        }
                    },
                    None => None,
                };
                let param_old_password = query_params.iter().filter(|e| e.0 == "old_password").map(|e| e.1.to_owned())
                    .nth(0);
                let param_old_password = match param_old_password {
                    Some(param_old_password) => {
                        let param_old_password =
                            <String as std::str::FromStr>::from_str
                                (&param_old_password);
                        match param_old_password {
                            Ok(param_old_password) => Some(param_old_password),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter old_password - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter old_password")),
                        }
                    },
                    None => None,
                };
                let param_new_password = query_params.iter().filter(|e| e.0 == "new_password").map(|e| e.1.to_owned())
                    .nth(0);
                let param_new_password = match param_new_password {
                    Some(param_new_password) => {
                        let param_new_password =
                            <String as std::str::FromStr>::from_str
                                (&param_new_password);
                        match param_new_password {
                            Ok(param_new_password) => Some(param_new_password),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter new_password - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter new_password")),
                        }
                    },
                    None => None,
                };
                let param_twenty_four_hour_time = query_params.iter().filter(|e| e.0 == "twenty_four_hour_time").map(|e| e.1.to_owned())
                    .nth(0);
                let param_twenty_four_hour_time = match param_twenty_four_hour_time {
                    Some(param_twenty_four_hour_time) => {
                        let param_twenty_four_hour_time =
                            <bool as std::str::FromStr>::from_str
                                (&param_twenty_four_hour_time);
                        match param_twenty_four_hour_time {
                            Ok(param_twenty_four_hour_time) => Some(param_twenty_four_hour_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter twenty_four_hour_time - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter twenty_four_hour_time")),
                        }
                    },
                    None => None,
                };
                let param_dense_mode = query_params.iter().filter(|e| e.0 == "dense_mode").map(|e| e.1.to_owned())
                    .nth(0);
                let param_dense_mode = match param_dense_mode {
                    Some(param_dense_mode) => {
                        let param_dense_mode =
                            <bool as std::str::FromStr>::from_str
                                (&param_dense_mode);
                        match param_dense_mode {
                            Ok(param_dense_mode) => Some(param_dense_mode),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter dense_mode - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter dense_mode")),
                        }
                    },
                    None => None,
                };
                let param_starred_message_counts = query_params.iter().filter(|e| e.0 == "starred_message_counts").map(|e| e.1.to_owned())
                    .nth(0);
                let param_starred_message_counts = match param_starred_message_counts {
                    Some(param_starred_message_counts) => {
                        let param_starred_message_counts =
                            <bool as std::str::FromStr>::from_str
                                (&param_starred_message_counts);
                        match param_starred_message_counts {
                            Ok(param_starred_message_counts) => Some(param_starred_message_counts),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter starred_message_counts - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter starred_message_counts")),
                        }
                    },
                    None => None,
                };
                let param_fluid_layout_width = query_params.iter().filter(|e| e.0 == "fluid_layout_width").map(|e| e.1.to_owned())
                    .nth(0);
                let param_fluid_layout_width = match param_fluid_layout_width {
                    Some(param_fluid_layout_width) => {
                        let param_fluid_layout_width =
                            <bool as std::str::FromStr>::from_str
                                (&param_fluid_layout_width);
                        match param_fluid_layout_width {
                            Ok(param_fluid_layout_width) => Some(param_fluid_layout_width),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter fluid_layout_width - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter fluid_layout_width")),
                        }
                    },
                    None => None,
                };
                let param_high_contrast_mode = query_params.iter().filter(|e| e.0 == "high_contrast_mode").map(|e| e.1.to_owned())
                    .nth(0);
                let param_high_contrast_mode = match param_high_contrast_mode {
                    Some(param_high_contrast_mode) => {
                        let param_high_contrast_mode =
                            <bool as std::str::FromStr>::from_str
                                (&param_high_contrast_mode);
                        match param_high_contrast_mode {
                            Ok(param_high_contrast_mode) => Some(param_high_contrast_mode),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter high_contrast_mode - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter high_contrast_mode")),
                        }
                    },
                    None => None,
                };
                let param_color_scheme = query_params.iter().filter(|e| e.0 == "color_scheme").map(|e| e.1.to_owned())
                    .nth(0);
                let param_color_scheme = match param_color_scheme {
                    Some(param_color_scheme) => {
                        let param_color_scheme =
                            serde_json::from_str::<i32>
                                (&param_color_scheme);
                        match param_color_scheme {
                            Ok(param_color_scheme) => Some(param_color_scheme),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter color_scheme - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter color_scheme")),
                        }
                    },
                    None => None,
                };
                let param_enable_drafts_synchronization = query_params.iter().filter(|e| e.0 == "enable_drafts_synchronization").map(|e| e.1.to_owned())
                    .nth(0);
                let param_enable_drafts_synchronization = match param_enable_drafts_synchronization {
                    Some(param_enable_drafts_synchronization) => {
                        let param_enable_drafts_synchronization =
                            <bool as std::str::FromStr>::from_str
                                (&param_enable_drafts_synchronization);
                        match param_enable_drafts_synchronization {
                            Ok(param_enable_drafts_synchronization) => Some(param_enable_drafts_synchronization),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter enable_drafts_synchronization - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter enable_drafts_synchronization")),
                        }
                    },
                    None => None,
                };
                let param_translate_emoticons = query_params.iter().filter(|e| e.0 == "translate_emoticons").map(|e| e.1.to_owned())
                    .nth(0);
                let param_translate_emoticons = match param_translate_emoticons {
                    Some(param_translate_emoticons) => {
                        let param_translate_emoticons =
                            <bool as std::str::FromStr>::from_str
                                (&param_translate_emoticons);
                        match param_translate_emoticons {
                            Ok(param_translate_emoticons) => Some(param_translate_emoticons),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter translate_emoticons - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter translate_emoticons")),
                        }
                    },
                    None => None,
                };
                let param_default_language = query_params.iter().filter(|e| e.0 == "default_language").map(|e| e.1.to_owned())
                    .nth(0);
                let param_default_language = match param_default_language {
                    Some(param_default_language) => {
                        let param_default_language =
                            <String as std::str::FromStr>::from_str
                                (&param_default_language);
                        match param_default_language {
                            Ok(param_default_language) => Some(param_default_language),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter default_language - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter default_language")),
                        }
                    },
                    None => None,
                };
                let param_default_view = query_params.iter().filter(|e| e.0 == "default_view").map(|e| e.1.to_owned())
                    .nth(0);
                let param_default_view = match param_default_view {
                    Some(param_default_view) => {
                        let param_default_view =
                            <String as std::str::FromStr>::from_str
                                (&param_default_view);
                        match param_default_view {
                            Ok(param_default_view) => Some(param_default_view),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter default_view - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter default_view")),
                        }
                    },
                    None => None,
                };
                let param_left_side_userlist = query_params.iter().filter(|e| e.0 == "left_side_userlist").map(|e| e.1.to_owned())
                    .nth(0);
                let param_left_side_userlist = match param_left_side_userlist {
                    Some(param_left_side_userlist) => {
                        let param_left_side_userlist =
                            <bool as std::str::FromStr>::from_str
                                (&param_left_side_userlist);
                        match param_left_side_userlist {
                            Ok(param_left_side_userlist) => Some(param_left_side_userlist),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter left_side_userlist - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter left_side_userlist")),
                        }
                    },
                    None => None,
                };
                let param_emojiset = query_params.iter().filter(|e| e.0 == "emojiset").map(|e| e.1.to_owned())
                    .nth(0);
                let param_emojiset = match param_emojiset {
                    Some(param_emojiset) => {
                        let param_emojiset =
                            <String as std::str::FromStr>::from_str
                                (&param_emojiset);
                        match param_emojiset {
                            Ok(param_emojiset) => Some(param_emojiset),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter emojiset - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter emojiset")),
                        }
                    },
                    None => None,
                };
                let param_demote_inactive_streams = query_params.iter().filter(|e| e.0 == "demote_inactive_streams").map(|e| e.1.to_owned())
                    .nth(0);
                let param_demote_inactive_streams = match param_demote_inactive_streams {
                    Some(param_demote_inactive_streams) => {
                        let param_demote_inactive_streams =
                            serde_json::from_str::<i32>
                                (&param_demote_inactive_streams);
                        match param_demote_inactive_streams {
                            Ok(param_demote_inactive_streams) => Some(param_demote_inactive_streams),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter demote_inactive_streams - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter demote_inactive_streams")),
                        }
                    },
                    None => None,
                };
                let param_timezone = query_params.iter().filter(|e| e.0 == "timezone").map(|e| e.1.to_owned())
                    .nth(0);
                let param_timezone = match param_timezone {
                    Some(param_timezone) => {
                        let param_timezone =
                            <String as std::str::FromStr>::from_str
                                (&param_timezone);
                        match param_timezone {
                            Ok(param_timezone) => Some(param_timezone),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter timezone - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter timezone")),
                        }
                    },
                    None => None,
                };
                let param_enable_stream_desktop_notifications = query_params.iter().filter(|e| e.0 == "enable_stream_desktop_notifications").map(|e| e.1.to_owned())
                    .nth(0);
                let param_enable_stream_desktop_notifications = match param_enable_stream_desktop_notifications {
                    Some(param_enable_stream_desktop_notifications) => {
                        let param_enable_stream_desktop_notifications =
                            <bool as std::str::FromStr>::from_str
                                (&param_enable_stream_desktop_notifications);
                        match param_enable_stream_desktop_notifications {
                            Ok(param_enable_stream_desktop_notifications) => Some(param_enable_stream_desktop_notifications),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter enable_stream_desktop_notifications - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter enable_stream_desktop_notifications")),
                        }
                    },
                    None => None,
                };
                let param_enable_stream_email_notifications = query_params.iter().filter(|e| e.0 == "enable_stream_email_notifications").map(|e| e.1.to_owned())
                    .nth(0);
                let param_enable_stream_email_notifications = match param_enable_stream_email_notifications {
                    Some(param_enable_stream_email_notifications) => {
                        let param_enable_stream_email_notifications =
                            <bool as std::str::FromStr>::from_str
                                (&param_enable_stream_email_notifications);
                        match param_enable_stream_email_notifications {
                            Ok(param_enable_stream_email_notifications) => Some(param_enable_stream_email_notifications),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter enable_stream_email_notifications - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter enable_stream_email_notifications")),
                        }
                    },
                    None => None,
                };
                let param_enable_stream_push_notifications = query_params.iter().filter(|e| e.0 == "enable_stream_push_notifications").map(|e| e.1.to_owned())
                    .nth(0);
                let param_enable_stream_push_notifications = match param_enable_stream_push_notifications {
                    Some(param_enable_stream_push_notifications) => {
                        let param_enable_stream_push_notifications =
                            <bool as std::str::FromStr>::from_str
                                (&param_enable_stream_push_notifications);
                        match param_enable_stream_push_notifications {
                            Ok(param_enable_stream_push_notifications) => Some(param_enable_stream_push_notifications),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter enable_stream_push_notifications - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter enable_stream_push_notifications")),
                        }
                    },
                    None => None,
                };
                let param_enable_stream_audible_notifications = query_params.iter().filter(|e| e.0 == "enable_stream_audible_notifications").map(|e| e.1.to_owned())
                    .nth(0);
                let param_enable_stream_audible_notifications = match param_enable_stream_audible_notifications {
                    Some(param_enable_stream_audible_notifications) => {
                        let param_enable_stream_audible_notifications =
                            <bool as std::str::FromStr>::from_str
                                (&param_enable_stream_audible_notifications);
                        match param_enable_stream_audible_notifications {
                            Ok(param_enable_stream_audible_notifications) => Some(param_enable_stream_audible_notifications),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter enable_stream_audible_notifications - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter enable_stream_audible_notifications")),
                        }
                    },
                    None => None,
                };
                let param_notification_sound = query_params.iter().filter(|e| e.0 == "notification_sound").map(|e| e.1.to_owned())
                    .nth(0);
                let param_notification_sound = match param_notification_sound {
                    Some(param_notification_sound) => {
                        let param_notification_sound =
                            <String as std::str::FromStr>::from_str
                                (&param_notification_sound);
                        match param_notification_sound {
                            Ok(param_notification_sound) => Some(param_notification_sound),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter notification_sound - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter notification_sound")),
                        }
                    },
                    None => None,
                };
                let param_enable_desktop_notifications = query_params.iter().filter(|e| e.0 == "enable_desktop_notifications").map(|e| e.1.to_owned())
                    .nth(0);
                let param_enable_desktop_notifications = match param_enable_desktop_notifications {
                    Some(param_enable_desktop_notifications) => {
                        let param_enable_desktop_notifications =
                            <bool as std::str::FromStr>::from_str
                                (&param_enable_desktop_notifications);
                        match param_enable_desktop_notifications {
                            Ok(param_enable_desktop_notifications) => Some(param_enable_desktop_notifications),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter enable_desktop_notifications - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter enable_desktop_notifications")),
                        }
                    },
                    None => None,
                };
                let param_enable_sounds = query_params.iter().filter(|e| e.0 == "enable_sounds").map(|e| e.1.to_owned())
                    .nth(0);
                let param_enable_sounds = match param_enable_sounds {
                    Some(param_enable_sounds) => {
                        let param_enable_sounds =
                            <bool as std::str::FromStr>::from_str
                                (&param_enable_sounds);
                        match param_enable_sounds {
                            Ok(param_enable_sounds) => Some(param_enable_sounds),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter enable_sounds - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter enable_sounds")),
                        }
                    },
                    None => None,
                };
                let param_email_notifications_batching_period_seconds = query_params.iter().filter(|e| e.0 == "email_notifications_batching_period_seconds").map(|e| e.1.to_owned())
                    .nth(0);
                let param_email_notifications_batching_period_seconds = match param_email_notifications_batching_period_seconds {
                    Some(param_email_notifications_batching_period_seconds) => {
                        let param_email_notifications_batching_period_seconds =
                            <i32 as std::str::FromStr>::from_str
                                (&param_email_notifications_batching_period_seconds);
                        match param_email_notifications_batching_period_seconds {
                            Ok(param_email_notifications_batching_period_seconds) => Some(param_email_notifications_batching_period_seconds),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter email_notifications_batching_period_seconds - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter email_notifications_batching_period_seconds")),
                        }
                    },
                    None => None,
                };
                let param_enable_offline_email_notifications = query_params.iter().filter(|e| e.0 == "enable_offline_email_notifications").map(|e| e.1.to_owned())
                    .nth(0);
                let param_enable_offline_email_notifications = match param_enable_offline_email_notifications {
                    Some(param_enable_offline_email_notifications) => {
                        let param_enable_offline_email_notifications =
                            <bool as std::str::FromStr>::from_str
                                (&param_enable_offline_email_notifications);
                        match param_enable_offline_email_notifications {
                            Ok(param_enable_offline_email_notifications) => Some(param_enable_offline_email_notifications),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter enable_offline_email_notifications - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter enable_offline_email_notifications")),
                        }
                    },
                    None => None,
                };
                let param_enable_offline_push_notifications = query_params.iter().filter(|e| e.0 == "enable_offline_push_notifications").map(|e| e.1.to_owned())
                    .nth(0);
                let param_enable_offline_push_notifications = match param_enable_offline_push_notifications {
                    Some(param_enable_offline_push_notifications) => {
                        let param_enable_offline_push_notifications =
                            <bool as std::str::FromStr>::from_str
                                (&param_enable_offline_push_notifications);
                        match param_enable_offline_push_notifications {
                            Ok(param_enable_offline_push_notifications) => Some(param_enable_offline_push_notifications),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter enable_offline_push_notifications - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter enable_offline_push_notifications")),
                        }
                    },
                    None => None,
                };
                let param_enable_online_push_notifications = query_params.iter().filter(|e| e.0 == "enable_online_push_notifications").map(|e| e.1.to_owned())
                    .nth(0);
                let param_enable_online_push_notifications = match param_enable_online_push_notifications {
                    Some(param_enable_online_push_notifications) => {
                        let param_enable_online_push_notifications =
                            <bool as std::str::FromStr>::from_str
                                (&param_enable_online_push_notifications);
                        match param_enable_online_push_notifications {
                            Ok(param_enable_online_push_notifications) => Some(param_enable_online_push_notifications),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter enable_online_push_notifications - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter enable_online_push_notifications")),
                        }
                    },
                    None => None,
                };
                let param_enable_digest_emails = query_params.iter().filter(|e| e.0 == "enable_digest_emails").map(|e| e.1.to_owned())
                    .nth(0);
                let param_enable_digest_emails = match param_enable_digest_emails {
                    Some(param_enable_digest_emails) => {
                        let param_enable_digest_emails =
                            <bool as std::str::FromStr>::from_str
                                (&param_enable_digest_emails);
                        match param_enable_digest_emails {
                            Ok(param_enable_digest_emails) => Some(param_enable_digest_emails),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter enable_digest_emails - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter enable_digest_emails")),
                        }
                    },
                    None => None,
                };
                let param_enable_marketing_emails = query_params.iter().filter(|e| e.0 == "enable_marketing_emails").map(|e| e.1.to_owned())
                    .nth(0);
                let param_enable_marketing_emails = match param_enable_marketing_emails {
                    Some(param_enable_marketing_emails) => {
                        let param_enable_marketing_emails =
                            <bool as std::str::FromStr>::from_str
                                (&param_enable_marketing_emails);
                        match param_enable_marketing_emails {
                            Ok(param_enable_marketing_emails) => Some(param_enable_marketing_emails),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter enable_marketing_emails - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter enable_marketing_emails")),
                        }
                    },
                    None => None,
                };
                let param_enable_login_emails = query_params.iter().filter(|e| e.0 == "enable_login_emails").map(|e| e.1.to_owned())
                    .nth(0);
                let param_enable_login_emails = match param_enable_login_emails {
                    Some(param_enable_login_emails) => {
                        let param_enable_login_emails =
                            <bool as std::str::FromStr>::from_str
                                (&param_enable_login_emails);
                        match param_enable_login_emails {
                            Ok(param_enable_login_emails) => Some(param_enable_login_emails),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter enable_login_emails - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter enable_login_emails")),
                        }
                    },
                    None => None,
                };
                let param_message_content_in_email_notifications = query_params.iter().filter(|e| e.0 == "message_content_in_email_notifications").map(|e| e.1.to_owned())
                    .nth(0);
                let param_message_content_in_email_notifications = match param_message_content_in_email_notifications {
                    Some(param_message_content_in_email_notifications) => {
                        let param_message_content_in_email_notifications =
                            <bool as std::str::FromStr>::from_str
                                (&param_message_content_in_email_notifications);
                        match param_message_content_in_email_notifications {
                            Ok(param_message_content_in_email_notifications) => Some(param_message_content_in_email_notifications),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter message_content_in_email_notifications - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter message_content_in_email_notifications")),
                        }
                    },
                    None => None,
                };
                let param_pm_content_in_desktop_notifications = query_params.iter().filter(|e| e.0 == "pm_content_in_desktop_notifications").map(|e| e.1.to_owned())
                    .nth(0);
                let param_pm_content_in_desktop_notifications = match param_pm_content_in_desktop_notifications {
                    Some(param_pm_content_in_desktop_notifications) => {
                        let param_pm_content_in_desktop_notifications =
                            <bool as std::str::FromStr>::from_str
                                (&param_pm_content_in_desktop_notifications);
                        match param_pm_content_in_desktop_notifications {
                            Ok(param_pm_content_in_desktop_notifications) => Some(param_pm_content_in_desktop_notifications),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter pm_content_in_desktop_notifications - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter pm_content_in_desktop_notifications")),
                        }
                    },
                    None => None,
                };
                let param_wildcard_mentions_notify = query_params.iter().filter(|e| e.0 == "wildcard_mentions_notify").map(|e| e.1.to_owned())
                    .nth(0);
                let param_wildcard_mentions_notify = match param_wildcard_mentions_notify {
                    Some(param_wildcard_mentions_notify) => {
                        let param_wildcard_mentions_notify =
                            <bool as std::str::FromStr>::from_str
                                (&param_wildcard_mentions_notify);
                        match param_wildcard_mentions_notify {
                            Ok(param_wildcard_mentions_notify) => Some(param_wildcard_mentions_notify),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter wildcard_mentions_notify - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter wildcard_mentions_notify")),
                        }
                    },
                    None => None,
                };
                let param_desktop_icon_count_display = query_params.iter().filter(|e| e.0 == "desktop_icon_count_display").map(|e| e.1.to_owned())
                    .nth(0);
                let param_desktop_icon_count_display = match param_desktop_icon_count_display {
                    Some(param_desktop_icon_count_display) => {
                        let param_desktop_icon_count_display =
                            serde_json::from_str::<i32>
                                (&param_desktop_icon_count_display);
                        match param_desktop_icon_count_display {
                            Ok(param_desktop_icon_count_display) => Some(param_desktop_icon_count_display),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter desktop_icon_count_display - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter desktop_icon_count_display")),
                        }
                    },
                    None => None,
                };
                let param_realm_name_in_notifications = query_params.iter().filter(|e| e.0 == "realm_name_in_notifications").map(|e| e.1.to_owned())
                    .nth(0);
                let param_realm_name_in_notifications = match param_realm_name_in_notifications {
                    Some(param_realm_name_in_notifications) => {
                        let param_realm_name_in_notifications =
                            <bool as std::str::FromStr>::from_str
                                (&param_realm_name_in_notifications);
                        match param_realm_name_in_notifications {
                            Ok(param_realm_name_in_notifications) => Some(param_realm_name_in_notifications),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter realm_name_in_notifications - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter realm_name_in_notifications")),
                        }
                    },
                    None => None,
                };
                let param_presence_enabled = query_params.iter().filter(|e| e.0 == "presence_enabled").map(|e| e.1.to_owned())
                    .nth(0);
                let param_presence_enabled = match param_presence_enabled {
                    Some(param_presence_enabled) => {
                        let param_presence_enabled =
                            <bool as std::str::FromStr>::from_str
                                (&param_presence_enabled);
                        match param_presence_enabled {
                            Ok(param_presence_enabled) => Some(param_presence_enabled),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter presence_enabled - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter presence_enabled")),
                        }
                    },
                    None => None,
                };
                let param_enter_sends = query_params.iter().filter(|e| e.0 == "enter_sends").map(|e| e.1.to_owned())
                    .nth(0);
                let param_enter_sends = match param_enter_sends {
                    Some(param_enter_sends) => {
                        let param_enter_sends =
                            <bool as std::str::FromStr>::from_str
                                (&param_enter_sends);
                        match param_enter_sends {
                            Ok(param_enter_sends) => Some(param_enter_sends),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter enter_sends - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter enter_sends")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.update_settings(
                                            param_full_name,
                                            param_email,
                                            param_old_password,
                                            param_new_password,
                                            param_twenty_four_hour_time,
                                            param_dense_mode,
                                            param_starred_message_counts,
                                            param_fluid_layout_width,
                                            param_high_contrast_mode,
                                            param_color_scheme,
                                            param_enable_drafts_synchronization,
                                            param_translate_emoticons,
                                            param_default_language,
                                            param_default_view,
                                            param_left_side_userlist,
                                            param_emojiset,
                                            param_demote_inactive_streams,
                                            param_timezone,
                                            param_enable_stream_desktop_notifications,
                                            param_enable_stream_email_notifications,
                                            param_enable_stream_push_notifications,
                                            param_enable_stream_audible_notifications,
                                            param_notification_sound,
                                            param_enable_desktop_notifications,
                                            param_enable_sounds,
                                            param_email_notifications_batching_period_seconds,
                                            param_enable_offline_email_notifications,
                                            param_enable_offline_push_notifications,
                                            param_enable_online_push_notifications,
                                            param_enable_digest_emails,
                                            param_enable_marketing_emails,
                                            param_enable_login_emails,
                                            param_message_content_in_email_notifications,
                                            param_pm_content_in_desktop_notifications,
                                            param_wildcard_mentions_notify,
                                            param_desktop_icon_count_display,
                                            param_realm_name_in_notifications,
                                            param_presence_enabled,
                                            param_enter_sends,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UpdateSettingsResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for UPDATE_SETTINGS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UpdateStatus - POST /users/me/status
            &hyper::Method::POST if path.matched(paths::ID_USERS_ME_STATUS) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_status_text = query_params.iter().filter(|e| e.0 == "status_text").map(|e| e.1.to_owned())
                    .nth(0);
                let param_status_text = match param_status_text {
                    Some(param_status_text) => {
                        let param_status_text =
                            <String as std::str::FromStr>::from_str
                                (&param_status_text);
                        match param_status_text {
                            Ok(param_status_text) => Some(param_status_text),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter status_text - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter status_text")),
                        }
                    },
                    None => None,
                };
                let param_away = query_params.iter().filter(|e| e.0 == "away").map(|e| e.1.to_owned())
                    .nth(0);
                let param_away = match param_away {
                    Some(param_away) => {
                        let param_away =
                            <bool as std::str::FromStr>::from_str
                                (&param_away);
                        match param_away {
                            Ok(param_away) => Some(param_away),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter away - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter away")),
                        }
                    },
                    None => None,
                };
                let param_emoji_name = query_params.iter().filter(|e| e.0 == "emoji_name").map(|e| e.1.to_owned())
                    .nth(0);
                let param_emoji_name = match param_emoji_name {
                    Some(param_emoji_name) => {
                        let param_emoji_name =
                            <String as std::str::FromStr>::from_str
                                (&param_emoji_name);
                        match param_emoji_name {
                            Ok(param_emoji_name) => Some(param_emoji_name),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter emoji_name - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter emoji_name")),
                        }
                    },
                    None => None,
                };
                let param_emoji_code = query_params.iter().filter(|e| e.0 == "emoji_code").map(|e| e.1.to_owned())
                    .nth(0);
                let param_emoji_code = match param_emoji_code {
                    Some(param_emoji_code) => {
                        let param_emoji_code =
                            <String as std::str::FromStr>::from_str
                                (&param_emoji_code);
                        match param_emoji_code {
                            Ok(param_emoji_code) => Some(param_emoji_code),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter emoji_code - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter emoji_code")),
                        }
                    },
                    None => None,
                };
                let param_reaction_type = query_params.iter().filter(|e| e.0 == "reaction_type").map(|e| e.1.to_owned())
                    .nth(0);
                let param_reaction_type = match param_reaction_type {
                    Some(param_reaction_type) => {
                        let param_reaction_type =
                            <String as std::str::FromStr>::from_str
                                (&param_reaction_type);
                        match param_reaction_type {
                            Ok(param_reaction_type) => Some(param_reaction_type),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter reaction_type - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter reaction_type")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.update_status(
                                            param_status_text,
                                            param_away,
                                            param_emoji_name,
                                            param_emoji_code,
                                            param_reaction_type,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UpdateStatusResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for UPDATE_STATUS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                UpdateStatusResponse::Success_2
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for UPDATE_STATUS_SUCCESS_2"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UpdateUser - PATCH /users/{user_id}
            &hyper::Method::PATCH if path.matched(paths::ID_USERS_USER_ID) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_USERS_USER_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE USERS_USER_ID in set but failed match against \"{}\"", path, paths::REGEX_USERS_USER_ID.as_str())
                    );

                let param_user_id = match percent_encoding::percent_decode(path_params["user_id"].as_bytes()).decode_utf8() {
                    Ok(param_user_id) => match param_user_id.parse::<i32>() {
                        Ok(param_user_id) => param_user_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter user_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["user_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_full_name = query_params.iter().filter(|e| e.0 == "full_name").map(|e| e.1.to_owned())
                    .nth(0);
                let param_full_name = match param_full_name {
                    Some(param_full_name) => {
                        let param_full_name =
                            serde_json::from_str::<String>
                                (&param_full_name);
                        match param_full_name {
                            Ok(param_full_name) => Some(param_full_name),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter full_name - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter full_name")),
                        }
                    },
                    None => None,
                };
                let param_role = query_params.iter().filter(|e| e.0 == "role").map(|e| e.1.to_owned())
                    .nth(0);
                let param_role = match param_role {
                    Some(param_role) => {
                        let param_role =
                            <i32 as std::str::FromStr>::from_str
                                (&param_role);
                        match param_role {
                            Ok(param_role) => Some(param_role),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter role - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter role")),
                        }
                    },
                    None => None,
                };
                let param_profile_data = query_params.iter().filter(|e| e.0 == "profile_data").map(|e| e.1.to_owned())
                    .nth(0);
                let param_profile_data = match param_profile_data {
                    Some(param_profile_data) => {
                        let param_profile_data =
                            serde_json::from_str::<Vec<serde_json::Value>>
                                (&param_profile_data);
                        match param_profile_data {
                            Ok(param_profile_data) => Some(param_profile_data),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter profile_data - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter profile_data")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.update_user(
                                            param_user_id,
                                            param_full_name,
                                            param_role,
                                            param_profile_data.as_ref(),
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UpdateUserResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for UPDATE_USER_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                UpdateUserResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for UPDATE_USER_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UpdateUserGroup - PATCH /user_groups/{user_group_id}
            &hyper::Method::PATCH if path.matched(paths::ID_USER_GROUPS_USER_GROUP_ID) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_USER_GROUPS_USER_GROUP_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE USER_GROUPS_USER_GROUP_ID in set but failed match against \"{}\"", path, paths::REGEX_USER_GROUPS_USER_GROUP_ID.as_str())
                    );

                let param_user_group_id = match percent_encoding::percent_decode(path_params["user_group_id"].as_bytes()).decode_utf8() {
                    Ok(param_user_group_id) => match param_user_group_id.parse::<i32>() {
                        Ok(param_user_group_id) => param_user_group_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter user_group_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["user_group_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_name = query_params.iter().filter(|e| e.0 == "name").map(|e| e.1.to_owned())
                    .nth(0);
                let param_name = match param_name {
                    Some(param_name) => {
                        let param_name =
                            <String as std::str::FromStr>::from_str
                                (&param_name);
                        match param_name {
                            Ok(param_name) => Some(param_name),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter name - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter name")),
                        }
                    },
                    None => None,
                };
                let param_name = match param_name {
                    Some(param_name) => param_name,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter name"))
                        .expect("Unable to create Bad Request response for missing query parameter name")),
                };
                let param_description = query_params.iter().filter(|e| e.0 == "description").map(|e| e.1.to_owned())
                    .nth(0);
                let param_description = match param_description {
                    Some(param_description) => {
                        let param_description =
                            <String as std::str::FromStr>::from_str
                                (&param_description);
                        match param_description {
                            Ok(param_description) => Some(param_description),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter description - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter description")),
                        }
                    },
                    None => None,
                };
                let param_description = match param_description {
                    Some(param_description) => param_description,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter description"))
                        .expect("Unable to create Bad Request response for missing query parameter description")),
                };

                                let result = api_impl.update_user_group(
                                            param_user_group_id,
                                            param_name,
                                            param_description,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UpdateUserGroupResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for UPDATE_USER_GROUP_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                UpdateUserGroupResponse::BadRequest
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for UPDATE_USER_GROUP_BAD_REQUEST"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UpdateUserGroupMembers - POST /user_groups/{user_group_id}/members
            &hyper::Method::POST if path.matched(paths::ID_USER_GROUPS_USER_GROUP_ID_MEMBERS) => {
                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_USER_GROUPS_USER_GROUP_ID_MEMBERS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE USER_GROUPS_USER_GROUP_ID_MEMBERS in set but failed match against \"{}\"", path, paths::REGEX_USER_GROUPS_USER_GROUP_ID_MEMBERS.as_str())
                    );

                let param_user_group_id = match percent_encoding::percent_decode(path_params["user_group_id"].as_bytes()).decode_utf8() {
                    Ok(param_user_group_id) => match param_user_group_id.parse::<i32>() {
                        Ok(param_user_group_id) => param_user_group_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter user_group_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["user_group_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_delete = query_params.iter().filter(|e| e.0 == "delete").map(|e| e.1.to_owned())
                    .nth(0);
                let param_delete = match param_delete {
                    Some(param_delete) => {
                        let param_delete =
                            serde_json::from_str::<Vec<i32>>
                                (&param_delete);
                        match param_delete {
                            Ok(param_delete) => Some(param_delete),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter delete - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter delete")),
                        }
                    },
                    None => None,
                };
                let param_add = query_params.iter().filter(|e| e.0 == "add").map(|e| e.1.to_owned())
                    .nth(0);
                let param_add = match param_add {
                    Some(param_add) => {
                        let param_add =
                            serde_json::from_str::<Vec<i32>>
                                (&param_add);
                        match param_add {
                            Ok(param_add) => Some(param_add),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter add - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter add")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.update_user_group_members(
                                            param_user_group_id,
                                            param_delete.as_ref(),
                                            param_add.as_ref(),
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UpdateUserGroupMembersResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for UPDATE_USER_GROUP_MEMBERS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ZulipOutgoingWebhooks - POST /zulip-outgoing-webhook
            &hyper::Method::POST if path.matched(paths::ID_ZULIP_OUTGOING_WEBHOOK) => {
                                let result = api_impl.zulip_outgoing_webhooks(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ZulipOutgoingWebhooksResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ZULIP_OUTGOING_WEBHOOKS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            _ if path.matched(paths::ID_ATTACHMENTS) => method_not_allowed(),
            _ if path.matched(paths::ID_CALLS_BIGBLUEBUTTON_CREATE) => method_not_allowed(),
            _ if path.matched(paths::ID_DEV_FETCH_API_KEY) => method_not_allowed(),
            _ if path.matched(paths::ID_DRAFTS) => method_not_allowed(),
            _ if path.matched(paths::ID_DRAFTS_DRAFT_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_EVENTS) => method_not_allowed(),
            _ if path.matched(paths::ID_FETCH_API_KEY) => method_not_allowed(),
            _ if path.matched(paths::ID_GET_STREAM_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_MARK_ALL_AS_READ) => method_not_allowed(),
            _ if path.matched(paths::ID_MARK_STREAM_AS_READ) => method_not_allowed(),
            _ if path.matched(paths::ID_MARK_TOPIC_AS_READ) => method_not_allowed(),
            _ if path.matched(paths::ID_MESSAGES) => method_not_allowed(),
            _ if path.matched(paths::ID_MESSAGES_FLAGS) => method_not_allowed(),
            _ if path.matched(paths::ID_MESSAGES_MATCHES_NARROW) => method_not_allowed(),
            _ if path.matched(paths::ID_MESSAGES_RENDER) => method_not_allowed(),
            _ if path.matched(paths::ID_MESSAGES_MESSAGE_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_MESSAGES_MESSAGE_ID_HISTORY) => method_not_allowed(),
            _ if path.matched(paths::ID_MESSAGES_MESSAGE_ID_REACTIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_REAL_TIME) => method_not_allowed(),
            _ if path.matched(paths::ID_REALM_EMOJI) => method_not_allowed(),
            _ if path.matched(paths::ID_REALM_EMOJI_EMOJI_NAME) => method_not_allowed(),
            _ if path.matched(paths::ID_REALM_FILTERS) => method_not_allowed(),
            _ if path.matched(paths::ID_REALM_FILTERS_FILTER_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_REALM_LINKIFIERS) => method_not_allowed(),
            _ if path.matched(paths::ID_REALM_PLAYGROUNDS) => method_not_allowed(),
            _ if path.matched(paths::ID_REALM_PLAYGROUNDS_PLAYGROUND_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_REALM_PROFILE_FIELDS) => method_not_allowed(),
            _ if path.matched(paths::ID_REGISTER) => method_not_allowed(),
            _ if path.matched(paths::ID_REST_ERROR_HANDLING) => method_not_allowed(),
            _ if path.matched(paths::ID_SERVER_SETTINGS) => method_not_allowed(),
            _ if path.matched(paths::ID_SETTINGS) => method_not_allowed(),
            _ if path.matched(paths::ID_STREAMS) => method_not_allowed(),
            _ if path.matched(paths::ID_STREAMS_STREAM_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_STREAMS_STREAM_ID_DELETE_TOPIC) => method_not_allowed(),
            _ if path.matched(paths::ID_STREAMS_STREAM_ID_MEMBERS) => method_not_allowed(),
            _ if path.matched(paths::ID_TYPING) => method_not_allowed(),
            _ if path.matched(paths::ID_USER_GROUPS) => method_not_allowed(),
            _ if path.matched(paths::ID_USER_GROUPS_CREATE) => method_not_allowed(),
            _ if path.matched(paths::ID_USER_GROUPS_USER_GROUP_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_USER_GROUPS_USER_GROUP_ID_MEMBERS) => method_not_allowed(),
            _ if path.matched(paths::ID_USER_UPLOADS) => method_not_allowed(),
            _ if path.matched(paths::ID_USER_UPLOADS_REALM_ID_STR_FILENAME) => method_not_allowed(),
            _ if path.matched(paths::ID_USERS) => method_not_allowed(),
            _ if path.matched(paths::ID_USERS_ME) => method_not_allowed(),
            _ if path.matched(paths::ID_USERS_ME_MUTED_USERS_MUTED_USER_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_USERS_ME_STATUS) => method_not_allowed(),
            _ if path.matched(paths::ID_USERS_ME_SUBSCRIPTIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_USERS_ME_SUBSCRIPTIONS_MUTED_TOPICS) => method_not_allowed(),
            _ if path.matched(paths::ID_USERS_ME_SUBSCRIPTIONS_PROPERTIES) => method_not_allowed(),
            _ if path.matched(paths::ID_USERS_ME_STREAM_ID_TOPICS) => method_not_allowed(),
            _ if path.matched(paths::ID_USERS_EMAIL) => method_not_allowed(),
            _ if path.matched(paths::ID_USERS_USER_ID_OR_EMAIL_PRESENCE) => method_not_allowed(),
            _ if path.matched(paths::ID_USERS_USER_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_USERS_USER_ID_REACTIVATE) => method_not_allowed(),
            _ if path.matched(paths::ID_USERS_USER_ID_SUBSCRIPTIONS_STREAM_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_ZULIP_OUTGOING_WEBHOOK) => method_not_allowed(),
            _ => Ok(Response::builder().status(StatusCode::NOT_FOUND)
                    .body(Body::empty())
                    .expect("Unable to create Not Found response"))
        }
    } Box::pin(run(self.api_impl.clone(), req)) }
}

/// Request parser for `Api`.
pub struct ApiRequestParser;
impl<T> RequestParser<T> for ApiRequestParser {
    fn parse_operation_id(request: &Request<T>) -> Result<&'static str, ()> {
        let path = paths::GLOBAL_REGEX_SET.matches(request.uri().path());
        match request.method() {
            // DevFetchApiKey - POST /dev_fetch_api_key
            &hyper::Method::POST if path.matched(paths::ID_DEV_FETCH_API_KEY) => Ok("DevFetchApiKey"),
            // FetchApiKey - POST /fetch_api_key
            &hyper::Method::POST if path.matched(paths::ID_FETCH_API_KEY) => Ok("FetchApiKey"),
            // CreateDrafts - POST /drafts
            &hyper::Method::POST if path.matched(paths::ID_DRAFTS) => Ok("CreateDrafts"),
            // DeleteDraft - DELETE /drafts/{draft_id}
            &hyper::Method::DELETE if path.matched(paths::ID_DRAFTS_DRAFT_ID) => Ok("DeleteDraft"),
            // EditDraft - PATCH /drafts/{draft_id}
            &hyper::Method::PATCH if path.matched(paths::ID_DRAFTS_DRAFT_ID) => Ok("EditDraft"),
            // GetDrafts - GET /drafts
            &hyper::Method::GET if path.matched(paths::ID_DRAFTS) => Ok("GetDrafts"),
            // AddReaction - POST /messages/{message_id}/reactions
            &hyper::Method::POST if path.matched(paths::ID_MESSAGES_MESSAGE_ID_REACTIONS) => Ok("AddReaction"),
            // CheckMessagesMatchNarrow - GET /messages/matches_narrow
            &hyper::Method::GET if path.matched(paths::ID_MESSAGES_MATCHES_NARROW) => Ok("CheckMessagesMatchNarrow"),
            // DeleteMessage - DELETE /messages/{message_id}
            &hyper::Method::DELETE if path.matched(paths::ID_MESSAGES_MESSAGE_ID) => Ok("DeleteMessage"),
            // GetFileTemporaryUrl - GET /user_uploads/{realm_id_str}/{filename}
            &hyper::Method::GET if path.matched(paths::ID_USER_UPLOADS_REALM_ID_STR_FILENAME) => Ok("GetFileTemporaryUrl"),
            // GetMessageHistory - GET /messages/{message_id}/history
            &hyper::Method::GET if path.matched(paths::ID_MESSAGES_MESSAGE_ID_HISTORY) => Ok("GetMessageHistory"),
            // GetMessages - GET /messages
            &hyper::Method::GET if path.matched(paths::ID_MESSAGES) => Ok("GetMessages"),
            // GetRawMessage - GET /messages/{message_id}
            &hyper::Method::GET if path.matched(paths::ID_MESSAGES_MESSAGE_ID) => Ok("GetRawMessage"),
            // MarkAllAsRead - POST /mark_all_as_read
            &hyper::Method::POST if path.matched(paths::ID_MARK_ALL_AS_READ) => Ok("MarkAllAsRead"),
            // MarkStreamAsRead - POST /mark_stream_as_read
            &hyper::Method::POST if path.matched(paths::ID_MARK_STREAM_AS_READ) => Ok("MarkStreamAsRead"),
            // MarkTopicAsRead - POST /mark_topic_as_read
            &hyper::Method::POST if path.matched(paths::ID_MARK_TOPIC_AS_READ) => Ok("MarkTopicAsRead"),
            // RemoveReaction - DELETE /messages/{message_id}/reactions
            &hyper::Method::DELETE if path.matched(paths::ID_MESSAGES_MESSAGE_ID_REACTIONS) => Ok("RemoveReaction"),
            // RenderMessage - POST /messages/render
            &hyper::Method::POST if path.matched(paths::ID_MESSAGES_RENDER) => Ok("RenderMessage"),
            // SendMessage - POST /messages
            &hyper::Method::POST if path.matched(paths::ID_MESSAGES) => Ok("SendMessage"),
            // UpdateMessage - PATCH /messages/{message_id}
            &hyper::Method::PATCH if path.matched(paths::ID_MESSAGES_MESSAGE_ID) => Ok("UpdateMessage"),
            // UpdateMessageFlags - POST /messages/flags
            &hyper::Method::POST if path.matched(paths::ID_MESSAGES_FLAGS) => Ok("UpdateMessageFlags"),
            // UploadFile - POST /user_uploads
            &hyper::Method::POST if path.matched(paths::ID_USER_UPLOADS) => Ok("UploadFile"),
            // DeleteQueue - DELETE /events
            &hyper::Method::DELETE if path.matched(paths::ID_EVENTS) => Ok("DeleteQueue"),
            // GetEvents - GET /events
            &hyper::Method::GET if path.matched(paths::ID_EVENTS) => Ok("GetEvents"),
            // RealTimePost - POST /real-time
            &hyper::Method::POST if path.matched(paths::ID_REAL_TIME) => Ok("RealTimePost"),
            // RegisterQueue - POST /register
            &hyper::Method::POST if path.matched(paths::ID_REGISTER) => Ok("RegisterQueue"),
            // RestErrorHandling - POST /rest-error-handling
            &hyper::Method::POST if path.matched(paths::ID_REST_ERROR_HANDLING) => Ok("RestErrorHandling"),
            // AddCodePlayground - POST /realm/playgrounds
            &hyper::Method::POST if path.matched(paths::ID_REALM_PLAYGROUNDS) => Ok("AddCodePlayground"),
            // AddLinkifier - POST /realm/filters
            &hyper::Method::POST if path.matched(paths::ID_REALM_FILTERS) => Ok("AddLinkifier"),
            // CreateCustomProfileField - POST /realm/profile_fields
            &hyper::Method::POST if path.matched(paths::ID_REALM_PROFILE_FIELDS) => Ok("CreateCustomProfileField"),
            // GetCustomEmoji - GET /realm/emoji
            &hyper::Method::GET if path.matched(paths::ID_REALM_EMOJI) => Ok("GetCustomEmoji"),
            // GetCustomProfileFields - GET /realm/profile_fields
            &hyper::Method::GET if path.matched(paths::ID_REALM_PROFILE_FIELDS) => Ok("GetCustomProfileFields"),
            // GetLinkifiers - GET /realm/linkifiers
            &hyper::Method::GET if path.matched(paths::ID_REALM_LINKIFIERS) => Ok("GetLinkifiers"),
            // GetServerSettings - GET /server_settings
            &hyper::Method::GET if path.matched(paths::ID_SERVER_SETTINGS) => Ok("GetServerSettings"),
            // RemoveCodePlayground - DELETE /realm/playgrounds/{playground_id}
            &hyper::Method::DELETE if path.matched(paths::ID_REALM_PLAYGROUNDS_PLAYGROUND_ID) => Ok("RemoveCodePlayground"),
            // RemoveLinkifier - DELETE /realm/filters/{filter_id}
            &hyper::Method::DELETE if path.matched(paths::ID_REALM_FILTERS_FILTER_ID) => Ok("RemoveLinkifier"),
            // ReorderCustomProfileFields - PATCH /realm/profile_fields
            &hyper::Method::PATCH if path.matched(paths::ID_REALM_PROFILE_FIELDS) => Ok("ReorderCustomProfileFields"),
            // UpdateLinkifier - PATCH /realm/filters/{filter_id}
            &hyper::Method::PATCH if path.matched(paths::ID_REALM_FILTERS_FILTER_ID) => Ok("UpdateLinkifier"),
            // UploadCustomEmoji - POST /realm/emoji/{emoji_name}
            &hyper::Method::POST if path.matched(paths::ID_REALM_EMOJI_EMOJI_NAME) => Ok("UploadCustomEmoji"),
            // ArchiveStream - DELETE /streams/{stream_id}
            &hyper::Method::DELETE if path.matched(paths::ID_STREAMS_STREAM_ID) => Ok("ArchiveStream"),
            // CreateBigBlueButtonVideoCall - GET /calls/bigbluebutton/create
            &hyper::Method::GET if path.matched(paths::ID_CALLS_BIGBLUEBUTTON_CREATE) => Ok("CreateBigBlueButtonVideoCall"),
            // DeleteTopic - POST /streams/{stream_id}/delete_topic
            &hyper::Method::POST if path.matched(paths::ID_STREAMS_STREAM_ID_DELETE_TOPIC) => Ok("DeleteTopic"),
            // GetStreamId - GET /get_stream_id
            &hyper::Method::GET if path.matched(paths::ID_GET_STREAM_ID) => Ok("GetStreamId"),
            // GetStreamTopics - GET /users/me/{stream_id}/topics
            &hyper::Method::GET if path.matched(paths::ID_USERS_ME_STREAM_ID_TOPICS) => Ok("GetStreamTopics"),
            // GetStreams - GET /streams
            &hyper::Method::GET if path.matched(paths::ID_STREAMS) => Ok("GetStreams"),
            // GetSubscribers - GET /streams/{stream_id}/members
            &hyper::Method::GET if path.matched(paths::ID_STREAMS_STREAM_ID_MEMBERS) => Ok("GetSubscribers"),
            // GetSubscriptionStatus - GET /users/{user_id}/subscriptions/{stream_id}
            &hyper::Method::GET if path.matched(paths::ID_USERS_USER_ID_SUBSCRIPTIONS_STREAM_ID) => Ok("GetSubscriptionStatus"),
            // GetSubscriptions - GET /users/me/subscriptions
            &hyper::Method::GET if path.matched(paths::ID_USERS_ME_SUBSCRIPTIONS) => Ok("GetSubscriptions"),
            // MuteTopic - PATCH /users/me/subscriptions/muted_topics
            &hyper::Method::PATCH if path.matched(paths::ID_USERS_ME_SUBSCRIPTIONS_MUTED_TOPICS) => Ok("MuteTopic"),
            // Subscribe - POST /users/me/subscriptions
            &hyper::Method::POST if path.matched(paths::ID_USERS_ME_SUBSCRIPTIONS) => Ok("Subscribe"),
            // Unsubscribe - DELETE /users/me/subscriptions
            &hyper::Method::DELETE if path.matched(paths::ID_USERS_ME_SUBSCRIPTIONS) => Ok("Unsubscribe"),
            // UpdateStream - PATCH /streams/{stream_id}
            &hyper::Method::PATCH if path.matched(paths::ID_STREAMS_STREAM_ID) => Ok("UpdateStream"),
            // UpdateSubscriptionSettings - POST /users/me/subscriptions/properties
            &hyper::Method::POST if path.matched(paths::ID_USERS_ME_SUBSCRIPTIONS_PROPERTIES) => Ok("UpdateSubscriptionSettings"),
            // UpdateSubscriptions - PATCH /users/me/subscriptions
            &hyper::Method::PATCH if path.matched(paths::ID_USERS_ME_SUBSCRIPTIONS) => Ok("UpdateSubscriptions"),
            // CreateUser - POST /users
            &hyper::Method::POST if path.matched(paths::ID_USERS) => Ok("CreateUser"),
            // CreateUserGroup - POST /user_groups/create
            &hyper::Method::POST if path.matched(paths::ID_USER_GROUPS_CREATE) => Ok("CreateUserGroup"),
            // DeactivateOwnUser - DELETE /users/me
            &hyper::Method::DELETE if path.matched(paths::ID_USERS_ME) => Ok("DeactivateOwnUser"),
            // DeactivateUser - DELETE /users/{user_id}
            &hyper::Method::DELETE if path.matched(paths::ID_USERS_USER_ID) => Ok("DeactivateUser"),
            // GetAttachments - GET /attachments
            &hyper::Method::GET if path.matched(paths::ID_ATTACHMENTS) => Ok("GetAttachments"),
            // GetOwnUser - GET /users/me
            &hyper::Method::GET if path.matched(paths::ID_USERS_ME) => Ok("GetOwnUser"),
            // GetUser - GET /users/{user_id}
            &hyper::Method::GET if path.matched(paths::ID_USERS_USER_ID) => Ok("GetUser"),
            // GetUserByEmail - GET /users/{email}
            &hyper::Method::GET if path.matched(paths::ID_USERS_EMAIL) => Ok("GetUserByEmail"),
            // GetUserGroups - GET /user_groups
            &hyper::Method::GET if path.matched(paths::ID_USER_GROUPS) => Ok("GetUserGroups"),
            // GetUserPresence - GET /users/{user_id_or_email}/presence
            &hyper::Method::GET if path.matched(paths::ID_USERS_USER_ID_OR_EMAIL_PRESENCE) => Ok("GetUserPresence"),
            // GetUsers - GET /users
            &hyper::Method::GET if path.matched(paths::ID_USERS) => Ok("GetUsers"),
            // MuteUser - POST /users/me/muted_users/{muted_user_id}
            &hyper::Method::POST if path.matched(paths::ID_USERS_ME_MUTED_USERS_MUTED_USER_ID) => Ok("MuteUser"),
            // ReactivateUser - POST /users/{user_id}/reactivate
            &hyper::Method::POST if path.matched(paths::ID_USERS_USER_ID_REACTIVATE) => Ok("ReactivateUser"),
            // RemoveUserGroup - DELETE /user_groups/{user_group_id}
            &hyper::Method::DELETE if path.matched(paths::ID_USER_GROUPS_USER_GROUP_ID) => Ok("RemoveUserGroup"),
            // SetTypingStatus - POST /typing
            &hyper::Method::POST if path.matched(paths::ID_TYPING) => Ok("SetTypingStatus"),
            // UnmuteUser - DELETE /users/me/muted_users/{muted_user_id}
            &hyper::Method::DELETE if path.matched(paths::ID_USERS_ME_MUTED_USERS_MUTED_USER_ID) => Ok("UnmuteUser"),
            // UpdateSettings - PATCH /settings
            &hyper::Method::PATCH if path.matched(paths::ID_SETTINGS) => Ok("UpdateSettings"),
            // UpdateStatus - POST /users/me/status
            &hyper::Method::POST if path.matched(paths::ID_USERS_ME_STATUS) => Ok("UpdateStatus"),
            // UpdateUser - PATCH /users/{user_id}
            &hyper::Method::PATCH if path.matched(paths::ID_USERS_USER_ID) => Ok("UpdateUser"),
            // UpdateUserGroup - PATCH /user_groups/{user_group_id}
            &hyper::Method::PATCH if path.matched(paths::ID_USER_GROUPS_USER_GROUP_ID) => Ok("UpdateUserGroup"),
            // UpdateUserGroupMembers - POST /user_groups/{user_group_id}/members
            &hyper::Method::POST if path.matched(paths::ID_USER_GROUPS_USER_GROUP_ID_MEMBERS) => Ok("UpdateUserGroupMembers"),
            // ZulipOutgoingWebhooks - POST /zulip-outgoing-webhook
            &hyper::Method::POST if path.matched(paths::ID_ZULIP_OUTGOING_WEBHOOK) => Ok("ZulipOutgoingWebhooks"),
            _ => Err(()),
        }
    }
}
