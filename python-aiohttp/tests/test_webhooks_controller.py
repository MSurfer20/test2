# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.inline_response200 import InlineResponse200


async def test_zulip_outgoing_webhooks(client):
    """Test case for zulip_outgoing_webhooks

    Outgoing webhooks
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/zulip-outgoing-webhook',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

