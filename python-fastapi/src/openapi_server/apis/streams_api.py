# coding: utf-8

from typing import Dict, List  # noqa: F401

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from openapi_server.models.coded_error import CodedError
from openapi_server.models.json_error import JsonError
from openapi_server.models.json_success import JsonSuccess
from openapi_server.models.json_success_base import JsonSuccessBase
from openapi_server.models.non_existing_stream_error import NonExistingStreamError
from openapi_server.models.one_ofobjectobject import OneOfobjectobject
from openapi_server.models.one_ofstringinteger import OneOfstringinteger


router = APIRouter()


@router.delete(
    "/streams/{stream_id}",
    responses={
        200: {"model": JsonSuccess, "description": "Success."},
        400: {"model": JsonError, "description": "Bad request."},
    },
    tags=["streams"],
    summary="Archive a stream",
)
async def archive_stream(
    stream_id: int = Path(None, description="The ID of the stream to access. "),
) -> JsonSuccess:
    """[Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.  &#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60; """
    ...


@router.get(
    "/calls/bigbluebutton/create",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success."},
    },
    tags=["streams"],
    summary="Create BigBlueButton video call",
)
async def create_big_blue_button_video_call(
) -> JsonSuccessBase:
    """Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. """
    ...


@router.get(
    "/get_stream_id",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success."},
        400: {"model": CodedError, "description": "Bad request."},
    },
    tags=["streams"],
    summary="Get stream ID",
)
async def get_stream_id(
    stream: str = Query(None, description="The name of the stream to access. "),
) -> JsonSuccessBase:
    """Get the unique ID of a given stream.  &#x60;GET {{ api_url }}/v1/get_stream_id&#x60; """
    ...


@router.get(
    "/users/me/{stream_id}/topics",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success."},
        400: {"model": JsonError, "description": "Bad request."},
    },
    tags=["streams"],
    summary="Get topics in a stream",
)
async def get_stream_topics(
    stream_id: int = Path(None, description="The ID of the stream to access. "),
) -> JsonSuccessBase:
    """Get all the topics in a specific stream  &#x60;GET {{ api_url }}/v1/users/me/{stream_id}/topics&#x60; """
    ...


@router.get(
    "/streams",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success."},
        400: {"model": CodedError, "description": "Bad request."},
    },
    tags=["streams"],
    summary="Get all streams",
)
async def get_streams(
    include_public: bool = Query(True, description="Include all public streams. "),
    include_web_public: bool = Query(False, description="Include all web public streams. "),
    include_subscribed: bool = Query(True, description="Include all streams that the user is subscribed to. "),
    include_all_active: bool = Query(False, description="Include all active streams. The user must have administrative privileges to use this parameter. "),
    include_default: bool = Query(False, description="Include all default streams for the user&#39;s realm. "),
    include_owner_subscribed: bool = Query(False, description="If the user is a bot, include all streams that the bot&#39;s owner is subscribed to. "),
) -> JsonSuccessBase:
    """Get all streams that the user has access to.  &#x60;GET {{ api_url }}/v1/streams&#x60; """
    ...


@router.get(
    "/users/{user_id}/subscriptions/{stream_id}",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success"},
    },
    tags=["streams"],
    summary="Get subscription status",
)
async def get_subscription_status(
    user_id: int = Path(None, description="The target user&#39;s ID. "),
    stream_id: int = Path(None, description="The ID of the stream to access. "),
) -> JsonSuccessBase:
    """Check whether a user is subscribed to a stream.  &#x60;GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}&#x60;  **Changes**: New in Zulip 3.0 (feature level 11). """
    ...


@router.get(
    "/users/me/subscriptions",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success."},
    },
    tags=["streams"],
    summary="Get subscribed streams",
)
async def get_subscriptions(
    include_subscribers: bool = Query(False, description="Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. "),
) -> JsonSuccessBase:
    """Get all streams that the user is subscribed to.  &#x60;GET {{ api_url }}/v1/users/me/subscriptions&#x60; """
    ...


@router.patch(
    "/users/me/subscriptions/muted_topics",
    responses={
        200: {"model": JsonSuccess, "description": "Success."},
        400: {"model": OneOfobjectobject, "description": "Bad request."},
    },
    tags=["streams"],
    summary="Topic muting",
)
async def mute_topic(
    topic: str = Query(None, description="The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. "),
    op: str = Query(None, description="Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic. "),
    stream: str = Query(None, description="The name of the stream to access. "),
    stream_id: int = Query(None, description="The ID of the stream to access. "),
) -> JsonSuccess:
    """This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user&#39;s unread count totals.  &#x60;PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics&#x60; """
    ...


@router.post(
    "/users/me/subscriptions",
    responses={
        200: {"model": OneOfobjectobject, "description": "Success."},
        400: {"model": OneOfobjectobject, "description": "Success."},
    },
    tags=["streams"],
    summary="Subscribe to a stream",
)
async def subscribe(
    subscriptions: List[object] = Query(None, description="A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value. "),
    principals: List[OneOfstringinteger] = Query(None, description="A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). "),
    authorization_errors_fatal: bool = Query(True, description="A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key. "),
    announce: bool = Query(False, description="If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation. "),
    invite_only: bool = Query(False, description="As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. "),
    history_public_to_subscribers: bool = Query(None, description="Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. "),
    stream_post_policy: int = Query(1, description="Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. "),
    message_retention_days: OneOfstringinteger = Query(None, description="Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). "),
) -> OneOfobjectobject:
    """Subscribe one or more users to one or more streams.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions&#x60;  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like &#x60;invite_only&#x60; detailed below. """
    ...


@router.delete(
    "/users/me/subscriptions",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success."},
        400: {"model": NonExistingStreamError, "description": "Bad request."},
    },
    tags=["streams"],
    summary="Unsubscribe from a stream",
)
async def unsubscribe(
    subscriptions: List[str] = Query(None, description="A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API. "),
    principals: List[OneOfstringinteger] = Query(None, description="A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). "),
) -> JsonSuccessBase:
    """Unsubscribe yourself or other users from one or more streams.  &#x60;DELETE {{ api_url }}/v1/users/me/subscriptions&#x60; """
    ...


@router.patch(
    "/streams/{stream_id}",
    responses={
        200: {"model": JsonSuccess, "description": "Success."},
        400: {"model": JsonError, "description": "Bad request."},
    },
    tags=["streams"],
    summary="Update a stream",
)
async def update_stream(
    stream_id: int = Path(None, description="The ID of the stream to access. "),
    description: str = Query(None, description="The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). "),
    new_name: str = Query(None, description="The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). "),
    is_private: bool = Query(None, description="Change whether the stream is a private stream. "),
    is_announcement_only: bool = Query(None, description="Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead. "),
    stream_post_policy: int = Query(1, description="Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. "),
    history_public_to_subscribers: bool = Query(None, description="Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. "),
    message_retention_days: OneOfstringinteger = Query(None, description="Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). "),
) -> JsonSuccess:
    """Configure the stream with the ID &#x60;stream_id&#x60;.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  &#x60;PATCH {{ api_url }}/v1/streams/{stream_id}&#x60; """
    ...


@router.post(
    "/users/me/subscriptions/properties",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success."},
    },
    tags=["streams"],
    summary="Update subscription settings",
)
async def update_subscription_settings(
    subscription_data: List[object] = Query(None, description="A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream. "),
) -> JsonSuccessBase:
    """This endpoint is used to update the user&#39;s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions/properties&#x60; """
    ...


@router.patch(
    "/users/me/subscriptions",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success."},
    },
    tags=["streams"],
    summary="Update subscriptions",
)
async def update_subscriptions(
    delete: List[str] = Query(None, description="A list of stream names to unsubscribe from. "),
    add: List[object] = Query(None, description="A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. "),
) -> JsonSuccessBase:
    """Update which streams you are are subscribed to. """
    ...
