# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from app.openapi_server.models.coded_error import CodedError  # noqa: E501
from app.openapi_server.models.json_error import JsonError  # noqa: E501
from app.openapi_server.models.json_success import JsonSuccess  # noqa: E501
from app.openapi_server.models.json_success_base import JsonSuccessBase  # noqa: E501
from app.openapi_server.models.one_ofobjectobject import OneOfobjectobject  # noqa: E501
from app.openapi_server.models.one_ofobjectobjectobject import OneOfobjectobjectobject  # noqa: E501
from app.openapi_server.models.one_ofobjectobjectobjectobjectobjectobject import OneOfobjectobjectobjectobjectobjectobject  # noqa: E501
from openapi_server.test import BaseTestCase


class TestUsersController(BaseTestCase):
    """UsersController integration test stubs"""

    def test_create_user(self):
        """Test case for create_user

        Create a user
        """
        query_string = [('email', 'username@example.com'),
                        ('password', 'abcd1234'),
                        ('full_name', 'New User')]
        response = self.client.open(
            '/api/v1/users',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_user_group(self):
        """Test case for create_user_group

        Create a user group
        """
        query_string = [('name', 'marketing'),
                        ('description', 'The marketing team.'),
                        ('members', [56])]
        response = self.client.open(
            '/api/v1/user_groups/create',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_deactivate_own_user(self):
        """Test case for deactivate_own_user

        Deactivate own user
        """
        response = self.client.open(
            '/api/v1/users/me',
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_deactivate_user(self):
        """Test case for deactivate_user

        Deactivate a user
        """
        response = self.client.open(
            '/api/v1/users/{user_id}'.format(user_id=12),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_attachments(self):
        """Test case for get_attachments

        Get attachments
        """
        response = self.client.open(
            '/api/v1/attachments',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_own_user(self):
        """Test case for get_own_user

        Get own user
        """
        response = self.client.open(
            '/api/v1/users/me',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user(self):
        """Test case for get_user

        Get a user
        """
        query_string = [('client_gravatar', False),
                        ('include_custom_profile_fields', False)]
        response = self.client.open(
            '/api/v1/users/{user_id}'.format(user_id=12),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user_by_email(self):
        """Test case for get_user_by_email

        Get a user by email
        """
        query_string = [('client_gravatar', False),
                        ('include_custom_profile_fields', False)]
        response = self.client.open(
            '/api/v1/users/{email}'.format(email='iago@zulip.com'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user_groups(self):
        """Test case for get_user_groups

        Get user groups
        """
        response = self.client.open(
            '/api/v1/user_groups',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user_presence(self):
        """Test case for get_user_presence

        Get user presence
        """
        response = self.client.open(
            '/api/v1/users/{user_id_or_email}/presence'.format(user_id_or_email='iago@zulip.com'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_users(self):
        """Test case for get_users

        Get all users
        """
        query_string = [('client_gravatar', False),
                        ('include_custom_profile_fields', False)]
        response = self.client.open(
            '/api/v1/users',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_mute_user(self):
        """Test case for mute_user

        Mute a user
        """
        response = self.client.open(
            '/api/v1/users/me/muted_users/{muted_user_id}'.format(muted_user_id=10),
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_reactivate_user(self):
        """Test case for reactivate_user

        Reactivate a user
        """
        response = self.client.open(
            '/api/v1/users/{user_id}/reactivate'.format(user_id=12),
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_user_group(self):
        """Test case for remove_user_group

        Delete a user group
        """
        response = self.client.open(
            '/api/v1/user_groups/{user_group_id}'.format(user_group_id=1),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_typing_status(self):
        """Test case for set_typing_status

        Set \"typing\" status
        """
        query_string = [('type', 'private'),
                        ('op', 'start'),
                        ('to', [56]),
                        ('topic', 'typing notifications')]
        response = self.client.open(
            '/api/v1/typing',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_unmute_user(self):
        """Test case for unmute_user

        Unmute a user
        """
        response = self.client.open(
            '/api/v1/users/me/muted_users/{muted_user_id}'.format(muted_user_id=10),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_settings(self):
        """Test case for update_settings

        Update settings
        """
        query_string = [('full_name', 'NewName'),
                        ('email', 'newname@example.com'),
                        ('old_password', 'old12345'),
                        ('new_password', 'new12345'),
                        ('twenty_four_hour_time', true),
                        ('dense_mode', true),
                        ('starred_message_counts', true),
                        ('fluid_layout_width', true),
                        ('high_contrast_mode', true),
                        ('color_scheme', 56),
                        ('enable_drafts_synchronization', true),
                        ('translate_emoticons', true),
                        ('default_language', 'en'),
                        ('default_view', 'all_messages'),
                        ('left_side_userlist', true),
                        ('emojiset', 'google'),
                        ('demote_inactive_streams', 56),
                        ('timezone', 'Asia/Kolkata'),
                        ('enable_stream_desktop_notifications', true),
                        ('enable_stream_email_notifications', true),
                        ('enable_stream_push_notifications', true),
                        ('enable_stream_audible_notifications', true),
                        ('notification_sound', 'ding'),
                        ('enable_desktop_notifications', true),
                        ('enable_sounds', true),
                        ('email_notifications_batching_period_seconds', 120),
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
                        ('presence_enabled', true),
                        ('enter_sends', true)]
        response = self.client.open(
            '/api/v1/settings',
            method='PATCH',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_status(self):
        """Test case for update_status

        Update your status
        """
        query_string = [('status_text', 'on vacation'),
                        ('away', true),
                        ('emoji_name', 'car'),
                        ('emoji_code', '1f697'),
                        ('reaction_type', 'unicode_emoji')]
        response = self.client.open(
            '/api/v1/users/me/status',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_user(self):
        """Test case for update_user

        Update a user
        """
        query_string = [('full_name', 'full_name_example'),
                        ('role', 400),
                        ('profile_data', None)]
        response = self.client.open(
            '/api/v1/users/{user_id}'.format(user_id=12),
            method='PATCH',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_user_group(self):
        """Test case for update_user_group

        Update a user group
        """
        query_string = [('name', 'marketing team'),
                        ('description', 'The marketing team.')]
        response = self.client.open(
            '/api/v1/user_groups/{user_group_id}'.format(user_group_id=1),
            method='PATCH',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_user_group_members(self):
        """Test case for update_user_group_members

        Update user group members
        """
        query_string = [('delete', [56]),
                        ('add', [56])]
        response = self.client.open(
            '/api/v1/user_groups/{user_group_id}/members'.format(user_group_id=1),
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
