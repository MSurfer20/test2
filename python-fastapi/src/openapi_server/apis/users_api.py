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
from openapi_server.models.one_ofobjectobject import OneOfobjectobject
from openapi_server.models.one_ofobjectobjectobject import OneOfobjectobjectobject
from openapi_server.models.one_ofobjectobjectobjectobjectobjectobject import OneOfobjectobjectobjectobjectobjectobject


router = APIRouter()


@router.post(
    "/users",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success."},
        400: {"model": JsonError, "description": "Bad request."},
    },
    tags=["users"],
    summary="Create a user",
)
async def create_user(
    email: str = Query(None, description="The email address of the new user. "),
    password: str = Query(None, description="The password of the new user. "),
    full_name: str = Query(None, description="The full name of the new user. "),
) -> JsonSuccessBase:
    """{!can-create-users-only.md!}  Create a new user account via the API.  &#x60;POST {{ api_url }}/v1/users&#x60; """
    ...


@router.post(
    "/user_groups/create",
    responses={
        200: {"model": JsonSuccess, "description": "Success."},
        400: {"model": JsonError, "description": "Bad request."},
    },
    tags=["users"],
    summary="Create a user group",
)
async def create_user_group(
    name: str = Query(None, description="The name of the user group. "),
    description: str = Query(None, description="The description of the user group. "),
    members: List[int] = Query(None, description="An array containing the user IDs of the initial members for the new user group. "),
) -> JsonSuccess:
    """Create a new [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/create&#x60; """
    ...


@router.delete(
    "/users/me",
    responses={
        200: {"model": JsonSuccess, "description": "Success."},
        400: {"model": JsonError, "description": "Bad request."},
    },
    tags=["users"],
    summary="Deactivate own user",
)
async def deactivate_own_user(
) -> JsonSuccess:
    """Deactivates the user&#39;s account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  &#x60;DELETE {{ api_url }}/v1/users/me&#x60;  This endpoint is primarily useful to Zulip clients providing a user settings UI. """
    ...


@router.delete(
    "/users/{user_id}",
    responses={
        200: {"model": JsonSuccess, "description": "Success"},
        400: {"model": JsonError, "description": "Bad request"},
    },
    tags=["users"],
    summary="Deactivate a user",
)
async def deactivate_user(
    user_id: int = Path(None, description="The target user&#39;s ID. "),
) -> JsonSuccess:
    """[Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;DELETE {{ api_url }}/v1/users/{user_id}&#x60; """
    ...


@router.get(
    "/attachments",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success."},
    },
    tags=["users"],
    summary="Get attachments",
)
async def get_attachments(
) -> JsonSuccessBase:
    """Fetch metadata on files uploaded by the requesting user.  &#x60;GET {{ api_url }}/v1/attachments&#x60; """
    ...


@router.get(
    "/users/me",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success"},
    },
    tags=["users"],
    summary="Get own user",
)
async def get_own_user(
) -> JsonSuccessBase:
    """Get basic data about the user/bot that requests this endpoint.  &#x60;GET {{ api_url }}/v1/users/me&#x60; """
    ...


@router.get(
    "/users/{user_id}",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success."},
    },
    tags=["users"],
    summary="Get a user",
)
async def get_user(
    user_id: int = Path(None, description="The target user&#39;s ID. "),
    client_gravatar: bool = Query(False, description="Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. "),
    include_custom_profile_fields: bool = Query(False, description="Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. "),
) -> JsonSuccessBase:
    """Fetch details for a single user in the organization.  &#x60;GET {{ api_url }}/v1/users/{user_id}&#x60;  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* """
    ...


@router.get(
    "/users/{email}",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success."},
    },
    tags=["users"],
    summary="Get a user by email",
)
async def get_user_by_email(
    email: str = Path(None, description="The email address of the user whose details you want to fetch. "),
    client_gravatar: bool = Query(False, description="Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. "),
    include_custom_profile_fields: bool = Query(False, description="Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. "),
) -> JsonSuccessBase:
    """Fetch details for a single user in the organization given a Zulip display email address.  &#x60;GET {{ api_url }}/v1/users/{email}&#x60;  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* """
    ...


@router.get(
    "/user_groups",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success."},
    },
    tags=["users"],
    summary="Get user groups",
)
async def get_user_groups(
) -> JsonSuccessBase:
    """{!api-members-only.md!}  Fetches all of the user groups in the organization.  &#x60;GET {{ api_url }}/v1/user_groups&#x60; """
    ...


@router.get(
    "/users/{user_id_or_email}/presence",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success."},
    },
    tags=["users"],
    summary="Get user presence",
)
async def get_user_presence(
    user_id_or_email: str = Path(None, description="The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. "),
) -> JsonSuccessBase:
    """Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user&#39;s presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  &#x60;GET {{ api_url }}/v1/users/{user_id_or_email}/presence&#x60;  See [Zulip&#39;s developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. """
    ...


@router.get(
    "/users",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success."},
    },
    tags=["users"],
    summary="Get all users",
)
async def get_users(
    client_gravatar: bool = Query(False, description="Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. "),
    include_custom_profile_fields: bool = Query(False, description="Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. "),
) -> JsonSuccessBase:
    """Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  &#x60;GET {{ api_url }}/v1/users&#x60;  You can also [fetch details on a single user](/api/get-user). """
    ...


@router.post(
    "/users/me/muted_users/{muted_user_id}",
    responses={
        200: {"model": JsonSuccess, "description": "Success."},
        400: {"model": OneOfobjectobjectobject, "description": "Bad request."},
    },
    tags=["users"],
    summary="Mute a user",
)
async def mute_user(
    muted_user_id: int = Path(None, description="The ID of the user to mute/un-mute. "),
) -> JsonSuccess:
    """This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you&#39;ve muted will be automatically marked as read and hidden.  &#x60;POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \&quot;Muted user\&quot;, rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \&quot;All users that exist   on this stream or realm\&quot;, e.g. for organization   administration or showing stream subscribers, should display   the user&#39;s name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). """
    ...


@router.post(
    "/users/{user_id}/reactivate",
    responses={
        200: {"model": object, "description": "Success"},
    },
    tags=["users"],
    summary="Reactivate a user",
)
async def reactivate_user(
    user_id: int = Path(None, description="The target user&#39;s ID. "),
) -> object:
    """[Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;POST {{ api_url }}/v1/users/{user_id}/reactivate&#x60; """
    ...


@router.delete(
    "/user_groups/{user_group_id}",
    responses={
        200: {"model": JsonSuccess, "description": "Success."},
        400: {"model": JsonError, "description": "Bad request."},
    },
    tags=["users"],
    summary="Delete a user group",
)
async def remove_user_group(
    user_group_id: int = Path(None, description="The ID of the target user group. "),
) -> JsonSuccess:
    """Delete a [user group](/help/user-groups).  &#x60;DELETE {{ api_url }}/v1/user_groups/{user_group_id}&#x60; """
    ...


@router.post(
    "/typing",
    responses={
        200: {"model": JsonSuccess, "description": "Success."},
        400: {"model": JsonError, "description": "Bad request."},
    },
    tags=["users"],
    summary="Set \&quot;typing\&quot; status",
)
async def set_typing_status(
    op: str = Query(None, description="Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type. "),
    to: List[int] = Query(None, description="For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). "),
    type: str = Query(&#39;private&#39;, description="Type of the message being composed. "),
    topic: str = Query(None, description="Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type. "),
) -> JsonSuccess:
    """Notify other users whether the current user is typing a message.  &#x60;POST {{ api_url }}/v1/typing&#x60;  Clients implementing Zulip&#39;s typing notifications protocol should work as follows:  * Send a request to this endpoint with &#x60;op&#x3D;\&quot;start\&quot;&#x60; when a user starts typing a message,   and also every &#x60;TYPING_STARTED_WAIT_PERIOD&#x3D;10&#x60; seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with &#x60;op&#x3D;\&quot;stop\&quot;&#x60; when a user pauses using the   compose UI for at least &#x60;TYPING_STOPPED_WAIT_PERIOD&#x3D;5&#x60; seconds or cancels   the compose action (if it had previously sent a \&quot;start\&quot; operation for that   compose action). * Start displaying \&quot;Sender is typing\&quot; for a given conversation when the client   receives an &#x60;op&#x3D;\&quot;start\&quot;&#x60; event from the [events API](/api/get-events). * Continue displaying \&quot;Sender is typing\&quot; until they receive an &#x60;op&#x3D;\&quot;stop\&quot;&#x60; event   from the [events API](/api/get-events) or &#x60;TYPING_STARTED_EXPIRY_PERIOD&#x3D;15&#x60;   seconds have passed without a new &#x60;op&#x3D;\&quot;start\&quot;&#x60; event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   &#x60;stream_typing_notifications&#x60; in the &#x60;client_capabilities&#x60; parameter to &#x60;/register&#x60;.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip&#39;s typing notifications protocol. """
    ...


@router.delete(
    "/users/me/muted_users/{muted_user_id}",
    responses={
        200: {"model": JsonSuccess, "description": "Success."},
        400: {"model": OneOfobjectobject, "description": "Bad request."},
    },
    tags=["users"],
    summary="Unmute a user",
)
async def unmute_user(
    muted_user_id: int = Path(None, description="The ID of the user to mute/un-mute. "),
) -> JsonSuccess:
    """This endpoint unmutes a user.  &#x60;DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 48). """
    ...


@router.patch(
    "/settings",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success"},
    },
    tags=["users"],
    summary="Update settings",
)
async def update_settings(
    full_name: str = Query(None, description="A new display name for the user. "),
    email: str = Query(None, description="Asks the server to initiate a confirmation sequence to change the user&#39;s email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address. "),
    old_password: str = Query(None, description="The user&#39;s old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the &#x60;new_password&#x60; parameter. "),
    new_password: str = Query(None, description="The user&#39;s new Zulip password (or LDAP password, if LDAP authentication is in use).  The &#x60;old_password&#x60; parameter must be included in the request. "),
    twenty_four_hour_time: bool = Query(None, description="Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. "),
    dense_mode: bool = Query(None, description="This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. "),
    starred_message_counts: bool = Query(None, description="Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. "),
    fluid_layout_width: bool = Query(None, description="Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. "),
    high_contrast_mode: bool = Query(None, description="This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. "),
    color_scheme: int = Query(None, description="Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. "),
    enable_drafts_synchronization: bool = Query(None, description="A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87). "),
    translate_emoticons: bool = Query(None, description="Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. "),
    default_language: str = Query(None, description="What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). "),
    default_view: str = Query(None, description="The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). "),
    left_side_userlist: bool = Query(None, description="Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. "),
    emojiset: str = Query(None, description="The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). "),
    demote_inactive_streams: int = Query(None, description="Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. "),
    timezone: str = Query(None, description="The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). "),
    enable_stream_desktop_notifications: bool = Query(None, description="Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. "),
    enable_stream_email_notifications: bool = Query(None, description="Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. "),
    enable_stream_push_notifications: bool = Query(None, description="Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. "),
    enable_stream_audible_notifications: bool = Query(None, description="Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. "),
    notification_sound: str = Query(None, description="Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). "),
    enable_desktop_notifications: bool = Query(None, description="Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. "),
    enable_sounds: bool = Query(None, description="Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. "),
    email_notifications_batching_period_seconds: int = Query(None, description="The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82) "),
    enable_offline_email_notifications: bool = Query(None, description="Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. "),
    enable_offline_push_notifications: bool = Query(None, description="Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. "),
    enable_online_push_notifications: bool = Query(None, description="Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. "),
    enable_digest_emails: bool = Query(None, description="Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. "),
    enable_marketing_emails: bool = Query(None, description="Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. "),
    enable_login_emails: bool = Query(None, description="Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. "),
    message_content_in_email_notifications: bool = Query(None, description="Include the message&#39;s content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. "),
    pm_content_in_desktop_notifications: bool = Query(None, description="Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. "),
    wildcard_mentions_notify: bool = Query(None, description="Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. "),
    desktop_icon_count_display: int = Query(None, description="Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. "),
    realm_name_in_notifications: bool = Query(None, description="Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. "),
    presence_enabled: bool = Query(None, description="Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. "),
    enter_sends: bool = Query(None, description="Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the &#x60;POST /users/me/enter-sends&#x60; endpoint, with the same parameter format. "),
) -> JsonSuccessBase:
    """This endpoint is used to edit the current user&#39;s settings.  &#x60;PATCH {{ api_url }}/v1/settings&#x60;  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the &#x60;full_name&#x60;, &#x60;email&#x60;, &#x60;old_password&#x60;, and &#x60;new_password&#x60; parameters. Notification settings were managed by &#x60;PATCH /settings/notifications&#x60;, and all other settings by &#x60;PATCH /settings/display&#x60;. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for &#x60;/settings&#x60; in Zulip 5.0 (feature level 78).  The &#x60;/settings/display&#x60; and &#x60;/settings/notifications&#x60; endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. """
    ...


@router.post(
    "/users/me/status",
    responses={
        200: {"model": JsonSuccess, "description": "Success."},
        400: {"model": OneOfobjectobjectobjectobjectobjectobject, "description": "Success."},
    },
    tags=["users"],
    summary="Update your status",
)
async def update_status(
    status_text: str = Query(None, description="The text content of the status message. Sending the empty string will clear the user&#39;s status.  **Note**: The limit on the size of the message is 60 characters. "),
    away: bool = Query(None, description="Whether the user should be marked as \&quot;away\&quot;. "),
    emoji_name: str = Query(None, description="The name for the emoji to associate with this status. "),
    emoji_code: str = Query(None, description="A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji. "),
    reaction_type: str = Query(None, description="One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji. "),
) -> JsonSuccess:
    """Change your [status](/help/status-and-availability).  &#x60;POST {{ api_url }}/v1/users/me/status&#x60;  A request to this endpoint will only change the parameters passed. For example, passing just &#x60;status_text&#x60; requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user&#39;s status to a specific value should pass all supported parameters. """
    ...


@router.patch(
    "/users/{user_id}",
    responses={
        200: {"model": JsonSuccess, "description": "Success."},
        400: {"model": CodedError, "description": "Bad request."},
    },
    tags=["users"],
    summary="Update a user",
)
async def update_user(
    user_id: int = Path(None, description="The target user&#39;s ID. "),
    full_name: str = Query(None, description="The user&#39;s full name. "),
    role: int = Query(None, description="New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). "),
    profile_data: List[object] = Query(None, description="A dictionary containing the to be updated custom profile field data for the user. "),
) -> JsonSuccess:
    """Administrative endpoint to update the details of another user in the organization.  &#x60;PATCH {{ api_url }}/v1/users/{user_id}&#x60;  Supports everything an administrator can do to edit details of another user&#39;s account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). """
    ...


@router.patch(
    "/user_groups/{user_group_id}",
    responses={
        200: {"model": JsonSuccess, "description": "Success."},
        400: {"model": JsonError, "description": "Bad request."},
    },
    tags=["users"],
    summary="Update a user group",
)
async def update_user_group(
    user_group_id: int = Path(None, description="The ID of the target user group. "),
    name: str = Query(None, description="The new name of the group. "),
    description: str = Query(None, description="The new description of the group. "),
) -> JsonSuccess:
    """Update the name or description of a [user group](/help/user-groups).  &#x60;PATCH {{ api_url }}/v1/user_groups/{user_group_id}&#x60; """
    ...


@router.post(
    "/user_groups/{user_group_id}/members",
    responses={
        200: {"model": JsonSuccess, "description": "Success."},
    },
    tags=["users"],
    summary="Update user group members",
)
async def update_user_group_members(
    user_group_id: int = Path(None, description="The ID of the target user group. "),
    delete: List[int] = Query(None, description="The list of user ids to be removed from the user group. "),
    add: List[int] = Query(None, description="The list of user ids to be added to the user group. "),
) -> JsonSuccess:
    """Update the members of a [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/{user_group_id}/members&#x60; """
    ...
