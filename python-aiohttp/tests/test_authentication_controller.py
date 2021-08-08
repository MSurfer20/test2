# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.api_key_response import ApiKeyResponse


async def test_dev_fetch_api_key(client):
    """Test case for dev_fetch_api_key

    Fetch an API key (development only)
    """
    params = [('username', 'iago@zulip.com')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/dev_fetch_api_key',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_fetch_api_key(client):
    """Test case for fetch_api_key

    Fetch an API key (production)
    """
    params = [('username', 'iago@zulip.com'),
                    ('password', 'abcd1234')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/fetch_api_key',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

