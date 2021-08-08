# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.coded_error import CodedError
from openapi_server.models.json_error import JsonError
from openapi_server.models.json_success import JsonSuccess
from openapi_server.models.json_success_base import JsonSuccessBase
from openapi_server.models.one_ofobjectobject import OneOfobjectobject
from openapi_server.models.one_ofobjectobjectobject import OneOfobjectobjectobject


async def test_create_user(client):
    """Test case for create_user

    Create a user
    """
    params = [('email', 'username@example.com'),
                    ('password', 'abcd1234'),
                    ('full_name', 'New User')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/users',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_create_user_group(client):
    """Test case for create_user_group

    Create a user group
    """
    params = [('name', 'marketing'),
                    ('description', 'The marketing team.'),
                    ('members', [56])]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/user_groups/create',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_deactivate_own_user(client):
    """Test case for deactivate_own_user

    Deactivate own user
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/api/v1/users/me',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_deactivate_user(client):
    """Test case for deactivate_user

    Deactivate a user
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/api/v1/users/{user_id}'.format(user_id=12),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_attachments(client):
    """Test case for get_attachments

    Get attachments
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/attachments',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_own_user(client):
    """Test case for get_own_user

    Get own user
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/users/me',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_user(client):
    """Test case for get_user

    Get a user
    """
    params = [('client_gravatar', False),
                    ('include_custom_profile_fields', False)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/users/{user_id}'.format(user_id=12),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_user_by_email(client):
    """Test case for get_user_by_email

    Get a user by email
    """
    params = [('client_gravatar', False),
                    ('include_custom_profile_fields', False)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/users/{email}'.format(email='iago@zulip.com'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_user_groups(client):
    """Test case for get_user_groups

    Get user groups
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/user_groups',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_user_presence(client):
    """Test case for get_user_presence

    Get user presence
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/users/{user_id_or_email}/presence'.format(user_id_or_email='iago@zulip.com'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_users(client):
    """Test case for get_users

    Get all users
    """
    params = [('client_gravatar', False),
                    ('include_custom_profile_fields', False)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/users',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_mute_user(client):
    """Test case for mute_user

    Mute a user
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/users/me/muted_users/{muted_user_id}'.format(muted_user_id=10),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_reactivate_user(client):
    """Test case for reactivate_user

    Reactivate a user
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/users/{user_id}/reactivate'.format(user_id=12),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_remove_user_group(client):
    """Test case for remove_user_group

    Delete a user group
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/api/v1/user_groups/{user_group_id}'.format(user_group_id=1),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_set_typing_status(client):
    """Test case for set_typing_status

    Set \"typing\" status
    """
    params = [('type', 'private'),
                    ('op', 'start'),
                    ('to', [56]),
                    ('topic', 'typing notifications')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/typing',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_unmute_user(client):
    """Test case for unmute_user

    Unmute a user
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/api/v1/users/me/muted_users/{muted_user_id}'.format(muted_user_id=10),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_update_display_settings(client):
    """Test case for update_display_settings

    Update display settings
    """
    params = [('twenty_four_hour_time', true),
                    ('dense_mode', true),
                    ('starred_message_counts', true),
                    ('fluid_layout_width', true),
                    ('high_contrast_mode', true),
                    ('color_scheme', 56),
                    ('translate_emoticons', true),
                    ('default_language', 'en'),
                    ('default_view', 'all_messages'),
                    ('left_side_userlist', true),
                    ('emojiset', 'google'),
                    ('demote_inactive_streams', 56),
                    ('timezone', 'Asia/Kolkata')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='PATCH',
        path='/api/v1/settings/display',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_update_notification_settings(client):
    """Test case for update_notification_settings

    Update notification settings
    """
    params = [('enable_stream_desktop_notifications', true),
                    ('enable_stream_email_notifications', true),
                    ('enable_stream_push_notifications', true),
                    ('enable_stream_audible_notifications', true),
                    ('notification_sound', 'ding'),
                    ('enable_desktop_notifications', true),
                    ('enable_sounds', true),
                    ('enable_offline_email_notifications', true),
                    ('enable_offline_push_notifications', true),
                    ('enable_online_push_notifications', true),
                    ('enable_digest_emails', true),
                    ('enable_marketing_emails', true),
                    ('enable_login_emails', true),
                    ('message_content_in_email_notifications', true),
                    ('pm_content_in_desktop_notifications', true),
                    ('wildcard_mentions_notify', true),
                    ('desktop_icon_count_display', 56),
                    ('realm_name_in_notifications', true),
                    ('presence_enabled', true)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='PATCH',
        path='/api/v1/settings/notifications',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_update_user(client):
    """Test case for update_user

    Update a user
    """
    params = [('full_name', 'full_name_example'),
                    ('role', 400),
                    ('profile_data', None)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='PATCH',
        path='/api/v1/users/{user_id}'.format(user_id=12),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_update_user_group(client):
    """Test case for update_user_group

    Update a user group
    """
    params = [('name', 'marketing team'),
                    ('description', 'The marketing team.')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='PATCH',
        path='/api/v1/user_groups/{user_group_id}'.format(user_group_id=1),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_update_user_group_members(client):
    """Test case for update_user_group_members

    Update user group members
    """
    params = [('delete', [56]),
                    ('add', [56])]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/user_groups/{user_group_id}/members'.format(user_group_id=1),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

