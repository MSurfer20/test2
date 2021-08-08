# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.coded_error import CodedError  # noqa: F401
from openapi_server.models.json_error import JsonError  # noqa: F401
from openapi_server.models.json_success import JsonSuccess  # noqa: F401
from openapi_server.models.json_success_base import JsonSuccessBase  # noqa: F401
from openapi_server.models.one_ofobjectobject import OneOfobjectobject  # noqa: F401
from openapi_server.models.one_ofobjectobjectobject import OneOfobjectobjectobject  # noqa: F401
from openapi_server.models.one_ofobjectobjectobjectobjectobjectobject import OneOfobjectobjectobjectobjectobjectobject  # noqa: F401


def test_create_user(client: TestClient):
    """Test case for create_user

    Create a user
    """
    params = [("email", 'username@example.com'),     ("password", 'abcd1234'),     ("full_name", 'New User')]
    headers = {
    }
    response = client.request(
        "POST",
        "/users",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_user_group(client: TestClient):
    """Test case for create_user_group

    Create a user group
    """
    params = [("name", 'marketing'),     ("description", 'The marketing team.'),     ("members", [56])]
    headers = {
    }
    response = client.request(
        "POST",
        "/user_groups/create",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_deactivate_own_user(client: TestClient):
    """Test case for deactivate_own_user

    Deactivate own user
    """

    headers = {
    }
    response = client.request(
        "DELETE",
        "/users/me",
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_deactivate_user(client: TestClient):
    """Test case for deactivate_user

    Deactivate a user
    """

    headers = {
    }
    response = client.request(
        "DELETE",
        "/users/{user_id}".format(user_id=12),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_attachments(client: TestClient):
    """Test case for get_attachments

    Get attachments
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/attachments",
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_own_user(client: TestClient):
    """Test case for get_own_user

    Get own user
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/users/me",
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_user(client: TestClient):
    """Test case for get_user

    Get a user
    """
    params = [("client_gravatar", False),     ("include_custom_profile_fields", False)]
    headers = {
    }
    response = client.request(
        "GET",
        "/users/{user_id}".format(user_id=12),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_user_by_email(client: TestClient):
    """Test case for get_user_by_email

    Get a user by email
    """
    params = [("client_gravatar", False),     ("include_custom_profile_fields", False)]
    headers = {
    }
    response = client.request(
        "GET",
        "/users/{email}".format(email='iago@zulip.com'),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_user_groups(client: TestClient):
    """Test case for get_user_groups

    Get user groups
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/user_groups",
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_user_presence(client: TestClient):
    """Test case for get_user_presence

    Get user presence
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/users/{user_id_or_email}/presence".format(user_id_or_email='iago@zulip.com'),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_users(client: TestClient):
    """Test case for get_users

    Get all users
    """
    params = [("client_gravatar", False),     ("include_custom_profile_fields", False)]
    headers = {
    }
    response = client.request(
        "GET",
        "/users",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_mute_user(client: TestClient):
    """Test case for mute_user

    Mute a user
    """

    headers = {
    }
    response = client.request(
        "POST",
        "/users/me/muted_users/{muted_user_id}".format(muted_user_id=10),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_reactivate_user(client: TestClient):
    """Test case for reactivate_user

    Reactivate a user
    """

    headers = {
    }
    response = client.request(
        "POST",
        "/users/{user_id}/reactivate".format(user_id=12),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_remove_user_group(client: TestClient):
    """Test case for remove_user_group

    Delete a user group
    """

    headers = {
    }
    response = client.request(
        "DELETE",
        "/user_groups/{user_group_id}".format(user_group_id=1),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_set_typing_status(client: TestClient):
    """Test case for set_typing_status

    Set \"typing\" status
    """
    params = [("type", 'private'),     ("op", 'start'),     ("to", [56]),     ("topic", 'typing notifications')]
    headers = {
    }
    response = client.request(
        "POST",
        "/typing",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_unmute_user(client: TestClient):
    """Test case for unmute_user

    Unmute a user
    """

    headers = {
    }
    response = client.request(
        "DELETE",
        "/users/me/muted_users/{muted_user_id}".format(muted_user_id=10),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_settings(client: TestClient):
    """Test case for update_settings

    Update settings
    """
    params = [("full_name", 'NewName'),     ("email", 'newname@example.com'),     ("old_password", 'old12345'),     ("new_password", 'new12345'),     ("twenty_four_hour_time", true),     ("dense_mode", true),     ("starred_message_counts", true),     ("fluid_layout_width", true),     ("high_contrast_mode", true),     ("color_scheme", 56),     ("enable_drafts_synchronization", true),     ("translate_emoticons", true),     ("default_language", 'en'),     ("default_view", 'all_messages'),     ("left_side_userlist", true),     ("emojiset", 'google'),     ("demote_inactive_streams", 56),     ("timezone", 'Asia/Kolkata'),     ("enable_stream_desktop_notifications", true),     ("enable_stream_email_notifications", true),     ("enable_stream_push_notifications", true),     ("enable_stream_audible_notifications", true),     ("notification_sound", 'ding'),     ("enable_desktop_notifications", true),     ("enable_sounds", true),     ("email_notifications_batching_period_seconds", 120),     ("enable_offline_email_notifications", true),     ("enable_offline_push_notifications", true),     ("enable_online_push_notifications", true),     ("enable_digest_emails", true),     ("enable_marketing_emails", true),     ("enable_login_emails", true),     ("message_content_in_email_notifications", true),     ("pm_content_in_desktop_notifications", true),     ("wildcard_mentions_notify", true),     ("desktop_icon_count_display", 56),     ("realm_name_in_notifications", true),     ("presence_enabled", true),     ("enter_sends", true)]
    headers = {
    }
    response = client.request(
        "PATCH",
        "/settings",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_status(client: TestClient):
    """Test case for update_status

    Update your status
    """
    params = [("status_text", 'on vacation'),     ("away", true),     ("emoji_name", 'car'),     ("emoji_code", '1f697'),     ("reaction_type", 'unicode_emoji')]
    headers = {
    }
    response = client.request(
        "POST",
        "/users/me/status",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_user(client: TestClient):
    """Test case for update_user

    Update a user
    """
    params = [("full_name", 'full_name_example'),     ("role", 400),     ("profile_data", None)]
    headers = {
    }
    response = client.request(
        "PATCH",
        "/users/{user_id}".format(user_id=12),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_user_group(client: TestClient):
    """Test case for update_user_group

    Update a user group
    """
    params = [("name", 'marketing team'),     ("description", 'The marketing team.')]
    headers = {
    }
    response = client.request(
        "PATCH",
        "/user_groups/{user_group_id}".format(user_group_id=1),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_user_group_members(client: TestClient):
    """Test case for update_user_group_members

    Update user group members
    """
    params = [("delete", [56]),     ("add", [56])]
    headers = {
    }
    response = client.request(
        "POST",
        "/user_groups/{user_group_id}/members".format(user_group_id=1),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

