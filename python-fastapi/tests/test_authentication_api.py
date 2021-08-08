# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.api_key_response import ApiKeyResponse  # noqa: F401


def test_dev_fetch_api_key(client: TestClient):
    """Test case for dev_fetch_api_key

    Fetch an API key (development only)
    """
    params = [("username", 'iago@zulip.com')]
    headers = {
    }
    response = client.request(
        "POST",
        "/dev_fetch_api_key",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_fetch_api_key(client: TestClient):
    """Test case for fetch_api_key

    Fetch an API key (production)
    """
    params = [("username", 'iago@zulip.com'),     ("password", 'abcd1234')]
    headers = {
    }
    response = client.request(
        "POST",
        "/fetch_api_key",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

