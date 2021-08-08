# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.coded_error import CodedError
from openapi_server.models.json_error import JsonError
from openapi_server.models.json_success import JsonSuccess
from openapi_server.models.json_success_base import JsonSuccessBase
from openapi_server.models.non_existing_stream_error import NonExistingStreamError
from openapi_server.models.one_ofobjectobject import OneOfobjectobject
from openapi_server.models.one_ofstringinteger import OneOfstringinteger


async def test_archive_stream(client):
    """Test case for archive_stream

    Archive a stream
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/api/v1/streams/{stream_id}'.format(stream_id=1),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_create_big_blue_button_video_call(client):
    """Test case for create_big_blue_button_video_call

    Create BigBlueButton video call
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/calls/bigbluebutton/create',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_delete_topic(client):
    """Test case for delete_topic

    Delete a topic
    """
    params = [('topic_name', 'new coffee machine')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/streams/{stream_id}/delete_topic'.format(stream_id=1),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_stream_id(client):
    """Test case for get_stream_id

    Get stream ID
    """
    params = [('stream', 'Denmark')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/get_stream_id',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_stream_topics(client):
    """Test case for get_stream_topics

    Get topics in a stream
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/users/me/{stream_id}/topics'.format(stream_id=1),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_streams(client):
    """Test case for get_streams

    Get all streams
    """
    params = [('include_public', True),
                    ('include_web_public', False),
                    ('include_subscribed', True),
                    ('include_all_active', False),
                    ('include_default', False),
                    ('include_owner_subscribed', False)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/streams',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_subscribers(client):
    """Test case for get_subscribers

    Get the subscribers of a stream
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/streams/{stream_id}/members'.format(stream_id=1),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_subscription_status(client):
    """Test case for get_subscription_status

    Get subscription status
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/users/{user_id}/subscriptions/{stream_id}'.format(user_id=12, stream_id=1),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_subscriptions(client):
    """Test case for get_subscriptions

    Get subscribed streams
    """
    params = [('include_subscribers', False)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/users/me/subscriptions',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_mute_topic(client):
    """Test case for mute_topic

    Topic muting
    """
    params = [('stream', 'Denmark'),
                    ('stream_id', 42),
                    ('topic', 'dinner'),
                    ('op', 'add')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='PATCH',
        path='/api/v1/users/me/subscriptions/muted_topics',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_subscribe(client):
    """Test case for subscribe

    Subscribe to a stream
    """
    params = [('subscriptions', None),
                    ('principals', [openapi_server.OneOfstringinteger()]),
                    ('authorization_errors_fatal', True),
                    ('announce', False),
                    ('invite_only', False),
                    ('history_public_to_subscribers', false),
                    ('stream_post_policy', 1),
                    ('message_retention_days', openapi_server.OneOfstringinteger())]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/users/me/subscriptions',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_unsubscribe(client):
    """Test case for unsubscribe

    Unsubscribe from a stream
    """
    params = [('subscriptions', ['subscriptions_example']),
                    ('principals', [openapi_server.OneOfstringinteger()])]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/api/v1/users/me/subscriptions',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_update_stream(client):
    """Test case for update_stream

    Update a stream
    """
    params = [('description', 'Discuss Italian history and travel destinations.'),
                    ('new_name', 'Italy'),
                    ('is_private', true),
                    ('is_announcement_only', true),
                    ('stream_post_policy', 1),
                    ('history_public_to_subscribers', false),
                    ('message_retention_days', openapi_server.OneOfstringinteger())]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='PATCH',
        path='/api/v1/streams/{stream_id}'.format(stream_id=1),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_update_subscription_settings(client):
    """Test case for update_subscription_settings

    Update subscription settings
    """
    params = [('subscription_data', None)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/users/me/subscriptions/properties',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_update_subscriptions(client):
    """Test case for update_subscriptions

    Update subscriptions
    """
    params = [('delete', ['delete_example']),
                    ('add', None)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='PATCH',
        path='/api/v1/users/me/subscriptions',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

