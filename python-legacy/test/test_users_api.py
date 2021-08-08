# coding: utf-8

"""
    Zulip REST API

    Powerful open source group chat   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest

import openapi_client
from openapi_client.api.users_api import UsersApi  # noqa: E501
from openapi_client.rest import ApiException


class TestUsersApi(unittest.TestCase):
    """UsersApi unit test stubs"""

    def setUp(self):
        self.api = openapi_client.api.users_api.UsersApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_user(self):
        """Test case for create_user

        Create a user  # noqa: E501
        """
        pass

    def test_create_user_group(self):
        """Test case for create_user_group

        Create a user group  # noqa: E501
        """
        pass

    def test_deactivate_own_user(self):
        """Test case for deactivate_own_user

        Deactivate own user  # noqa: E501
        """
        pass

    def test_deactivate_user(self):
        """Test case for deactivate_user

        Deactivate a user  # noqa: E501
        """
        pass

    def test_get_attachments(self):
        """Test case for get_attachments

        Get attachments  # noqa: E501
        """
        pass

    def test_get_own_user(self):
        """Test case for get_own_user

        Get own user  # noqa: E501
        """
        pass

    def test_get_user(self):
        """Test case for get_user

        Get a user  # noqa: E501
        """
        pass

    def test_get_user_by_email(self):
        """Test case for get_user_by_email

        Get a user by email  # noqa: E501
        """
        pass

    def test_get_user_groups(self):
        """Test case for get_user_groups

        Get user groups  # noqa: E501
        """
        pass

    def test_get_user_presence(self):
        """Test case for get_user_presence

        Get user presence  # noqa: E501
        """
        pass

    def test_get_users(self):
        """Test case for get_users

        Get all users  # noqa: E501
        """
        pass

    def test_mute_user(self):
        """Test case for mute_user

        Mute a user  # noqa: E501
        """
        pass

    def test_reactivate_user(self):
        """Test case for reactivate_user

        Reactivate a user  # noqa: E501
        """
        pass

    def test_remove_user_group(self):
        """Test case for remove_user_group

        Delete a user group  # noqa: E501
        """
        pass

    def test_set_typing_status(self):
        """Test case for set_typing_status

        Set \"typing\" status  # noqa: E501
        """
        pass

    def test_unmute_user(self):
        """Test case for unmute_user

        Unmute a user  # noqa: E501
        """
        pass

    def test_update_settings(self):
        """Test case for update_settings

        Update settings  # noqa: E501
        """
        pass

    def test_update_status(self):
        """Test case for update_status

        Update your status  # noqa: E501
        """
        pass

    def test_update_user(self):
        """Test case for update_user

        Update a user  # noqa: E501
        """
        pass

    def test_update_user_group(self):
        """Test case for update_user_group

        Update a user group  # noqa: E501
        """
        pass

    def test_update_user_group_members(self):
        """Test case for update_user_group_members

        Update user group members  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
