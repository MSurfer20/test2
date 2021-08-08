# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.bad_event_queue_id_error import BadEventQueueIdError  # noqa: F401
from openapi_server.models.json_success import JsonSuccess  # noqa: F401
from openapi_server.models.json_success_base import JsonSuccessBase  # noqa: F401
from openapi_server.models.one_of_invalid_api_key_error_missing_argument_error_user_not_authorized_error import OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError  # noqa: F401
from openapi_server.models.one_of_rate_limited_error import OneOfRateLimitedError  # noqa: F401
from openapi_server.models.one_of_user_deactivated_error_realm_deactivated_error import OneOfUserDeactivatedErrorRealmDeactivatedError  # noqa: F401


def test_delete_queue(client: TestClient):
    """Test case for delete_queue

    Delete an event queue
    """
    params = [("queue_id", '1375801870:2942')]
    headers = {
    }
    response = client.request(
        "DELETE",
        "/events",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_events(client: TestClient):
    """Test case for get_events

    Get events from an event queue
    """
    params = [("queue_id", '1375801870:2942'),     ("last_event_id", -1),     ("dont_block", False)]
    headers = {
    }
    response = client.request(
        "GET",
        "/events",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_real_time_post(client: TestClient):
    """Test case for real_time_post

    
    """
    params = [("event_types", ['event_types_example']),     ("narrow", []),     ("all_public_streams", False)]
    headers = {
    }
    response = client.request(
        "POST",
        "/real-time",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_register_queue(client: TestClient):
    """Test case for register_queue

    Register an event queue
    """
    params = [("apply_markdown", False),     ("client_gravatar", False),     ("slim_presence", False),     ("event_types", ['event_types_example']),     ("all_public_streams", False),     ("include_subscribers", False),     ("client_capabilities", None),     ("fetch_event_types", ['fetch_event_types_example']),     ("narrow", [])]
    headers = {
    }
    response = client.request(
        "POST",
        "/register",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_rest_error_handling(client: TestClient):
    """Test case for rest_error_handling

    Error handling
    """

    headers = {
    }
    response = client.request(
        "POST",
        "/rest-error-handling",
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

