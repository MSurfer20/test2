# coding: utf-8

import pytest
import json
from aiohttp import web
from aiohttp import FormData

from openapi_server.models.json_success import JsonSuccess
from openapi_server.models.json_success_base import JsonSuccessBase


async def test_add_code_playground(client):
    """Test case for add_code_playground

    Add a code playground
    """
    params = [('name', 'Python playground'),
                    ('pygments_language', 'Python'),
                    ('url_prefix', 'https://python.example.com')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/realm/playgrounds',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_add_linkifier(client):
    """Test case for add_linkifier

    Add a linkifier
    """
    params = [('pattern', '#(?P<id>[0-9]+)'),
                    ('url_format_string', 'https://github.com/zulip/zulip/issues/%(id)s')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/realm/filters',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_create_custom_profile_field(client):
    """Test case for create_custom_profile_field

    Create a custom profile field
    """
    params = [('name', 'Favorite programming language'),
                    ('hint', 'Your favorite programming language.'),
                    ('field_type', 3),
                    ('field_data', None)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/realm/profile_fields',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_custom_emoji(client):
    """Test case for get_custom_emoji

    Get all custom emoji
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/realm/emoji',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_custom_profile_fields(client):
    """Test case for get_custom_profile_fields

    Get all custom profile fields
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/realm/profile_fields',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_linkifiers(client):
    """Test case for get_linkifiers

    Get linkifiers
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/realm/linkifiers',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_server_settings(client):
    """Test case for get_server_settings

    Get server settings
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/server_settings',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_remove_code_playground(client):
    """Test case for remove_code_playground

    Remove a code playground
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/api/v1/realm/playgrounds/{playground_id}'.format(playground_id=1),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_remove_linkifier(client):
    """Test case for remove_linkifier

    Remove a linkifier
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/api/v1/realm/filters/{filter_id}'.format(filter_id=42),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_reorder_custom_profile_fields(client):
    """Test case for reorder_custom_profile_fields

    Reorder custom profile fields
    """
    params = [('order', [56])]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='PATCH',
        path='/api/v1/realm/profile_fields',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_update_linkifier(client):
    """Test case for update_linkifier

    Update a linkifier
    """
    params = [('pattern', '#(?P<id>[0-9]+)'),
                    ('url_format_string', 'https://github.com/zulip/zulip/issues/%(id)s')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='PATCH',
        path='/api/v1/realm/filters/{filter_id}'.format(filter_id=2),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


@pytest.mark.skip("multipart/form-data not supported by Connexion")
async def test_upload_custom_emoji(client):
    """Test case for upload_custom_emoji

    Upload custom emoji
    """
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'multipart/form-data',
    }
    data = FormData()
    data.add_field('filename', '/path/to/file')
    response = await client.request(
        method='POST',
        path='/api/v1/realm/emoji/{emoji_name}'.format(emoji_name='smile'),
        headers=headers,
        data=data,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

