# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from app.openapi_server.models.api_key_response import ApiKeyResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAuthenticationController(BaseTestCase):
    """AuthenticationController integration test stubs"""

    def test_dev_fetch_api_key(self):
        """Test case for dev_fetch_api_key

        Fetch an API key (development only)
        """
        query_string = [('username', 'iago@zulip.com')]
        response = self.client.open(
            '/api/v1/dev_fetch_api_key',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_fetch_api_key(self):
        """Test case for fetch_api_key

        Fetch an API key (production)
        """
        query_string = [('username', 'iago@zulip.com'),
                        ('password', 'abcd1234')]
        response = self.client.open(
            '/api/v1/fetch_api_key',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
