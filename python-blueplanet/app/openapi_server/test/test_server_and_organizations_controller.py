# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from app.openapi_server.models.json_success import JsonSuccess  # noqa: E501
from app.openapi_server.models.json_success_base import JsonSuccessBase  # noqa: E501
from openapi_server.test import BaseTestCase


class TestServerAndOrganizationsController(BaseTestCase):
    """ServerAndOrganizationsController integration test stubs"""

    def test_add_code_playground(self):
        """Test case for add_code_playground

        Add a code playground
        """
        query_string = [('name', 'Python playground'),
                        ('pygments_language', 'Python'),
                        ('url_prefix', 'https://python.example.com')]
        response = self.client.open(
            '/api/v1/realm/playgrounds',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_add_linkifier(self):
        """Test case for add_linkifier

        Add a linkifier
        """
        query_string = [('pattern', '#(?P<id>[0-9]+)'),
                        ('url_format_string', 'https://github.com/zulip/zulip/issues/%(id)s')]
        response = self.client.open(
            '/api/v1/realm/filters',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_custom_profile_field(self):
        """Test case for create_custom_profile_field

        Create a custom profile field
        """
        query_string = [('name', 'Favorite programming language'),
                        ('hint', 'Your favorite programming language.'),
                        ('field_type', 3),
                        ('field_data', None)]
        response = self.client.open(
            '/api/v1/realm/profile_fields',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_custom_emoji(self):
        """Test case for get_custom_emoji

        Get all custom emoji
        """
        response = self.client.open(
            '/api/v1/realm/emoji',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_custom_profile_fields(self):
        """Test case for get_custom_profile_fields

        Get all custom profile fields
        """
        response = self.client.open(
            '/api/v1/realm/profile_fields',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_linkifiers(self):
        """Test case for get_linkifiers

        Get linkifiers
        """
        response = self.client.open(
            '/api/v1/realm/linkifiers',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_server_settings(self):
        """Test case for get_server_settings

        Get server settings
        """
        response = self.client.open(
            '/api/v1/server_settings',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_code_playground(self):
        """Test case for remove_code_playground

        Remove a code playground
        """
        response = self.client.open(
            '/api/v1/realm/playgrounds/{playground_id}'.format(playground_id=1),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_linkifier(self):
        """Test case for remove_linkifier

        Remove a linkifier
        """
        response = self.client.open(
            '/api/v1/realm/filters/{filter_id}'.format(filter_id=42),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_reorder_custom_profile_fields(self):
        """Test case for reorder_custom_profile_fields

        Reorder custom profile fields
        """
        query_string = [('order', [56])]
        response = self.client.open(
            '/api/v1/realm/profile_fields',
            method='PATCH',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_linkifier(self):
        """Test case for update_linkifier

        Update a linkifier
        """
        query_string = [('pattern', '#(?P<id>[0-9]+)'),
                        ('url_format_string', 'https://github.com/zulip/zulip/issues/%(id)s')]
        response = self.client.open(
            '/api/v1/realm/filters/{filter_id}'.format(filter_id=2),
            method='PATCH',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_upload_custom_emoji(self):
        """Test case for upload_custom_emoji

        Upload custom emoji
        """
        data = dict(filename='/path/to/file')
        response = self.client.open(
            '/api/v1/realm/emoji/{emoji_name}'.format(emoji_name='smile'),
            method='POST',
            data=data,
            content_type='multipart/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
