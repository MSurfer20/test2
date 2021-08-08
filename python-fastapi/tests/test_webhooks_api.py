# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.inline_response200 import InlineResponse200  # noqa: F401


def test_zulip_outgoing_webhooks(client: TestClient):
    """Test case for zulip_outgoing_webhooks

    Outgoing webhooks
    """

    headers = {
    }
    response = client.request(
        "POST",
        "/zulip-outgoing-webhook",
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

