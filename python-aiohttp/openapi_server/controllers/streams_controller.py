from typing import List, Dict
from aiohttp import web

from openapi_server.models.coded_error import CodedError
from openapi_server.models.json_error import JsonError
from openapi_server.models.json_success import JsonSuccess
from openapi_server.models.json_success_base import JsonSuccessBase
from openapi_server.models.non_existing_stream_error import NonExistingStreamError
from openapi_server.models.one_ofobjectobject import OneOfobjectobject
from openapi_server.models.one_ofstringinteger import OneOfstringinteger
from openapi_server import util


async def archive_stream(request: web.Request, stream_id) -> web.Response:
    """Archive a stream

    [Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.  &#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60; 

    :param stream_id: The ID of the stream to access. 
    :type stream_id: int

    """
    return web.Response(status=200)


async def create_big_blue_button_video_call(request: web.Request, ) -> web.Response:
    """Create BigBlueButton video call

    Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 


    """
    return web.Response(status=200)


async def get_stream_id(request: web.Request, stream) -> web.Response:
    """Get stream ID

    Get the unique ID of a given stream.  &#x60;GET {{ api_url }}/v1/get_stream_id&#x60; 

    :param stream: The name of the stream to access. 
    :type stream: str

    """
    return web.Response(status=200)


async def get_stream_topics(request: web.Request, stream_id) -> web.Response:
    """Get topics in a stream

    Get all the topics in a specific stream  &#x60;GET {{ api_url }}/v1/users/me/{stream_id}/topics&#x60; 

    :param stream_id: The ID of the stream to access. 
    :type stream_id: int

    """
    return web.Response(status=200)


async def get_streams(request: web.Request, include_public=None, include_web_public=None, include_subscribed=None, include_all_active=None, include_default=None, include_owner_subscribed=None) -> web.Response:
    """Get all streams

    Get all streams that the user has access to.  &#x60;GET {{ api_url }}/v1/streams&#x60; 

    :param include_public: Include all public streams. 
    :type include_public: bool
    :param include_web_public: Include all web public streams. 
    :type include_web_public: bool
    :param include_subscribed: Include all streams that the user is subscribed to. 
    :type include_subscribed: bool
    :param include_all_active: Include all active streams. The user must have administrative privileges to use this parameter. 
    :type include_all_active: bool
    :param include_default: Include all default streams for the user&#39;s realm. 
    :type include_default: bool
    :param include_owner_subscribed: If the user is a bot, include all streams that the bot&#39;s owner is subscribed to. 
    :type include_owner_subscribed: bool

    """
    return web.Response(status=200)


async def get_subscription_status(request: web.Request, user_id, stream_id) -> web.Response:
    """Get subscription status

    Check whether a user is subscribed to a stream.  &#x60;GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}&#x60;  **Changes**: New in Zulip 3.0 (feature level 11). 

    :param user_id: The target user&#39;s ID. 
    :type user_id: int
    :param stream_id: The ID of the stream to access. 
    :type stream_id: int

    """
    return web.Response(status=200)


async def get_subscriptions(request: web.Request, include_subscribers=None) -> web.Response:
    """Get subscribed streams

    Get all streams that the user is subscribed to.  &#x60;GET {{ api_url }}/v1/users/me/subscriptions&#x60; 

    :param include_subscribers: Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 
    :type include_subscribers: bool

    """
    return web.Response(status=200)


async def mute_topic(request: web.Request, topic, op, stream=None, stream_id=None) -> web.Response:
    """Topic muting

    This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user&#39;s unread count totals.  &#x60;PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics&#x60; 

    :param topic: The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
    :type topic: str
    :param op: Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic. 
    :type op: str
    :param stream: The name of the stream to access. 
    :type stream: str
    :param stream_id: The ID of the stream to access. 
    :type stream_id: int

    """
    return web.Response(status=200)


async def subscribe(request: web.Request, subscriptions, principals=None, authorization_errors_fatal=None, announce=None, invite_only=None, history_public_to_subscribers=None, stream_post_policy=None, message_retention_days=None) -> web.Response:
    """Subscribe to a stream

    Subscribe one or more users to one or more streams.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions&#x60;  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like &#x60;invite_only&#x60; detailed below. 

    :param subscriptions: A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value. 
    :type subscriptions: List[]
    :param principals: A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
    :type principals: list | bytes
    :param authorization_errors_fatal: A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key. 
    :type authorization_errors_fatal: bool
    :param announce: If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation. 
    :type announce: bool
    :param invite_only: As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. 
    :type invite_only: bool
    :param history_public_to_subscribers: Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
    :type history_public_to_subscribers: bool
    :param stream_post_policy: Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. 
    :type stream_post_policy: int
    :param message_retention_days: Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
    :type message_retention_days: dict | bytes

    """
    principals = [OneOfstringinteger.from_dict(d) for d in principals]
    message_retention_days = .from_dict(message_retention_days)
    return web.Response(status=200)


async def unsubscribe(request: web.Request, subscriptions, principals=None) -> web.Response:
    """Unsubscribe from a stream

    Unsubscribe yourself or other users from one or more streams.  &#x60;DELETE {{ api_url }}/v1/users/me/subscriptions&#x60; 

    :param subscriptions: A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API. 
    :type subscriptions: List[str]
    :param principals: A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
    :type principals: list | bytes

    """
    principals = [OneOfstringinteger.from_dict(d) for d in principals]
    return web.Response(status=200)


async def update_stream(request: web.Request, stream_id, description=None, new_name=None, is_private=None, is_announcement_only=None, stream_post_policy=None, history_public_to_subscribers=None, message_retention_days=None) -> web.Response:
    """Update a stream

    Configure the stream with the ID &#x60;stream_id&#x60;.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  &#x60;PATCH {{ api_url }}/v1/streams/{stream_id}&#x60; 

    :param stream_id: The ID of the stream to access. 
    :type stream_id: int
    :param description: The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
    :type description: str
    :param new_name: The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
    :type new_name: str
    :param is_private: Change whether the stream is a private stream. 
    :type is_private: bool
    :param is_announcement_only: Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead. 
    :type is_announcement_only: bool
    :param stream_post_policy: Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. 
    :type stream_post_policy: int
    :param history_public_to_subscribers: Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
    :type history_public_to_subscribers: bool
    :param message_retention_days: Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
    :type message_retention_days: dict | bytes

    """
    message_retention_days = .from_dict(message_retention_days)
    return web.Response(status=200)


async def update_subscription_settings(request: web.Request, subscription_data) -> web.Response:
    """Update subscription settings

    This endpoint is used to update the user&#39;s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions/properties&#x60; 

    :param subscription_data: A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream. 
    :type subscription_data: List[]

    """
    return web.Response(status=200)


async def update_subscriptions(request: web.Request, delete=None, add=None) -> web.Response:
    """Update subscriptions

    Update which streams you are are subscribed to. 

    :param delete: A list of stream names to unsubscribe from. 
    :type delete: List[str]
    :param add: A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. 
    :type add: List[]

    """
    return web.Response(status=200)
