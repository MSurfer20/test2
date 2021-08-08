# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.coded_error import CodedError  # noqa: F401
from openapi_server.models.json_error import JsonError  # noqa: F401
from openapi_server.models.json_success import JsonSuccess  # noqa: F401
from openapi_server.models.json_success_base import JsonSuccessBase  # noqa: F401
from openapi_server.models.non_existing_stream_error import NonExistingStreamError  # noqa: F401
from openapi_server.models.one_ofobjectobject import OneOfobjectobject  # noqa: F401
from openapi_server.models.one_ofstringinteger import OneOfstringinteger  # noqa: F401


def test_archive_stream(client: TestClient):
    """Test case for archive_stream

    Archive a stream
    """

    headers = {
    }
    response = client.request(
        "DELETE",
        "/streams/{stream_id}".format(stream_id=1),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_big_blue_button_video_call(client: TestClient):
    """Test case for create_big_blue_button_video_call

    Create BigBlueButton video call
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/calls/bigbluebutton/create",
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_topic(client: TestClient):
    """Test case for delete_topic

    Delete a topic
    """
    params = [("topic_name", 'new coffee machine')]
    headers = {
    }
    response = client.request(
        "POST",
        "/streams/{stream_id}/delete_topic".format(stream_id=1),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_stream_id(client: TestClient):
    """Test case for get_stream_id

    Get stream ID
    """
    params = [("stream", 'Denmark')]
    headers = {
    }
    response = client.request(
        "GET",
        "/get_stream_id",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_stream_topics(client: TestClient):
    """Test case for get_stream_topics

    Get topics in a stream
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/users/me/{stream_id}/topics".format(stream_id=1),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_streams(client: TestClient):
    """Test case for get_streams

    Get all streams
    """
    params = [("include_public", True),     ("include_web_public", False),     ("include_subscribed", True),     ("include_all_active", False),     ("include_default", False),     ("include_owner_subscribed", False)]
    headers = {
    }
    response = client.request(
        "GET",
        "/streams",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_subscribers(client: TestClient):
    """Test case for get_subscribers

    Get the subscribers of a stream
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/streams/{stream_id}/members".format(stream_id=1),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_subscription_status(client: TestClient):
    """Test case for get_subscription_status

    Get subscription status
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/users/{user_id}/subscriptions/{stream_id}".format(user_id=12, stream_id=1),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_subscriptions(client: TestClient):
    """Test case for get_subscriptions

    Get subscribed streams
    """
    params = [("include_subscribers", False)]
    headers = {
    }
    response = client.request(
        "GET",
        "/users/me/subscriptions",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_mute_topic(client: TestClient):
    """Test case for mute_topic

    Topic muting
    """
    params = [("stream", 'Denmark'),     ("stream_id", 42),     ("topic", 'dinner'),     ("op", 'add')]
    headers = {
    }
    response = client.request(
        "PATCH",
        "/users/me/subscriptions/muted_topics",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_subscribe(client: TestClient):
    """Test case for subscribe

    Subscribe to a stream
    """
    params = [("subscriptions", None),     ("principals", [openapi_server.OneOfstringinteger()]),     ("authorization_errors_fatal", True),     ("announce", False),     ("invite_only", False),     ("history_public_to_subscribers", false),     ("stream_post_policy", 1),     ("message_retention_days", openapi_server.OneOfstringinteger())]
    headers = {
    }
    response = client.request(
        "POST",
        "/users/me/subscriptions",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_unsubscribe(client: TestClient):
    """Test case for unsubscribe

    Unsubscribe from a stream
    """
    params = [("subscriptions", ['subscriptions_example']),     ("principals", [openapi_server.OneOfstringinteger()])]
    headers = {
    }
    response = client.request(
        "DELETE",
        "/users/me/subscriptions",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_stream(client: TestClient):
    """Test case for update_stream

    Update a stream
    """
    params = [("description", 'Discuss Italian history and travel destinations.'),     ("new_name", 'Italy'),     ("is_private", true),     ("is_announcement_only", true),     ("stream_post_policy", 1),     ("history_public_to_subscribers", false),     ("message_retention_days", openapi_server.OneOfstringinteger())]
    headers = {
    }
    response = client.request(
        "PATCH",
        "/streams/{stream_id}".format(stream_id=1),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_subscription_settings(client: TestClient):
    """Test case for update_subscription_settings

    Update subscription settings
    """
    params = [("subscription_data", None)]
    headers = {
    }
    response = client.request(
        "POST",
        "/users/me/subscriptions/properties",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_subscriptions(client: TestClient):
    """Test case for update_subscriptions

    Update subscriptions
    """
    params = [("delete", ['delete_example']),     ("add", None)]
    headers = {
    }
    response = client.request(
        "PATCH",
        "/users/me/subscriptions",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

