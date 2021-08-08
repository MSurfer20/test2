# coding: utf-8

import pytest
import json
from aiohttp import web
from aiohttp import FormData

from openapi_server.models.coded_error import CodedError
from openapi_server.models.invalid_message_error import InvalidMessageError
from openapi_server.models.json_success import JsonSuccess
from openapi_server.models.json_success_base import JsonSuccessBase
from openapi_server.models.one_ofobjectobject import OneOfobjectobject
from openapi_server.models.one_ofstringinteger import OneOfstringinteger


async def test_add_reaction(client):
    """Test case for add_reaction

    Add an emoji reaction
    """
    params = [('emoji_name', 'octopus'),
                    ('emoji_code', '1f419'),
                    ('reaction_type', 'unicode_emoji')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/messages/{message_id}/reactions'.format(message_id=42),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_check_messages_match_narrow(client):
    """Test case for check_messages_match_narrow

    Check if messages match a narrow
    """
    params = [('msg_ids', [56]),
                    ('narrow', None)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/messages/matches_narrow',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_delete_message(client):
    """Test case for delete_message

    Delete a message
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/api/v1/messages/{message_id}'.format(message_id=42),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_file_temporary_url(client):
    """Test case for get_file_temporary_url

    Get public temporary URL
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/user_uploads/{realm_id_str}/{filename}'.format(realm_id_str=1, filename='4e/m2A3MSqFnWRLUf9SaPzQ0Up_/zulip.txt'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_message_history(client):
    """Test case for get_message_history

    Get a message's edit history
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/messages/{message_id}/history'.format(message_id=42),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_messages(client):
    """Test case for get_messages

    Get messages
    """
    params = [('anchor', openapi_server.OneOfstringinteger()),
                    ('num_before', 4),
                    ('num_after', 8),
                    ('narrow', []),
                    ('client_gravatar', False),
                    ('apply_markdown', True),
                    ('use_first_unread_anchor', False)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/messages',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_raw_message(client):
    """Test case for get_raw_message

    Get a message's raw Markdown
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/messages/{message_id}'.format(message_id=42),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_mark_all_as_read(client):
    """Test case for mark_all_as_read

    Mark all messages as read
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/mark_all_as_read',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_mark_stream_as_read(client):
    """Test case for mark_stream_as_read

    Mark messages in a stream as read
    """
    params = [('stream_id', 42)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/mark_stream_as_read',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_mark_topic_as_read(client):
    """Test case for mark_topic_as_read

    Mark messages in a topic as read
    """
    params = [('stream_id', 42),
                    ('topic_name', 'new coffee machine')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/mark_topic_as_read',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_remove_reaction(client):
    """Test case for remove_reaction

    Remove an emoji reaction
    """
    params = [('emoji_name', 'octopus'),
                    ('emoji_code', '1f419'),
                    ('reaction_type', 'unicode_emoji')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/api/v1/messages/{message_id}/reactions'.format(message_id=42),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_render_message(client):
    """Test case for render_message

    Render message
    """
    params = [('content', 'Hello')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/messages/render',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_send_message(client):
    """Test case for send_message

    Send a message
    """
    params = [('type', 'private'),
                    ('to', [56]),
                    ('content', 'Hello'),
                    ('topic', 'Castle'),
                    ('queue_id', '1593114627:0'),
                    ('local_id', '100.01')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/messages',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_update_message(client):
    """Test case for update_message

    Edit a message
    """
    params = [('topic', 'Castle'),
                    ('propagate_mode', 'change_one'),
                    ('send_notification_to_old_thread', True),
                    ('send_notification_to_new_thread', True),
                    ('content', 'Hello'),
                    ('stream_id', 42)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='PATCH',
        path='/api/v1/messages/{message_id}'.format(message_id=42),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_update_message_flags(client):
    """Test case for update_message_flags

    Update personal message flags
    """
    params = [('messages', [56]),
                    ('op', 'add'),
                    ('flag', 'read')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/messages/flags',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


@pytest.mark.skip("multipart/form-data not supported by Connexion")
async def test_upload_file(client):
    """Test case for upload_file

    Upload a file
    """
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'multipart/form-data',
    }
    data = FormData()
    data.add_field('filename', '/path/to/file')
    response = await client.request(
        method='POST',
        path='/api/v1/user_uploads',
        headers=headers,
        data=data,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

