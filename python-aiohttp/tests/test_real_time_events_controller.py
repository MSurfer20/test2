# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.bad_event_queue_id_error import BadEventQueueIdError
from openapi_server.models.json_success import JsonSuccess
from openapi_server.models.json_success_base import JsonSuccessBase
from openapi_server.models.one_of_invalid_api_key_error_missing_argument_error_user_not_authorized_error import OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError
from openapi_server.models.one_of_rate_limited_error import OneOfRateLimitedError
from openapi_server.models.one_of_user_deactivated_error_realm_deactivated_error import OneOfUserDeactivatedErrorRealmDeactivatedError


async def test_delete_queue(client):
    """Test case for delete_queue

    Delete an event queue
    """
    params = [('queue_id', '1375801870:2942')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/api/v1/events',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_events(client):
    """Test case for get_events

    Get events from an event queue
    """
    params = [('queue_id', '1375801870:2942'),
                    ('last_event_id', -1),
                    ('dont_block', False)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/events',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_real_time_post(client):
    """Test case for real_time_post

    
    """
    params = [('event_types', ['event_types_example']),
                    ('narrow', []),
                    ('all_public_streams', False)]
    headers = { 
    }
    response = await client.request(
        method='POST',
        path='/api/v1/real-time',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_register_queue(client):
    """Test case for register_queue

    Register an event queue
    """
    params = [('apply_markdown', False),
                    ('client_gravatar', False),
                    ('slim_presence', False),
                    ('event_types', ['event_types_example']),
                    ('all_public_streams', False),
                    ('include_subscribers', False),
                    ('client_capabilities', None),
                    ('fetch_event_types', ['fetch_event_types_example']),
                    ('narrow', [])]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/register',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_rest_error_handling(client):
    """Test case for rest_error_handling

    Error handling
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/rest-error-handling',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

