# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.inline_response200 import InlineResponse200  # noqa: E501
from openapi_server.test import BaseTestCase


class TestWebhooksController(BaseTestCase):
    """WebhooksController integration test stubs"""

    def test_zulip_outgoing_webhooks(self):
        """Test case for zulip_outgoing_webhooks

        Outgoing webhooks
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/zulip-outgoing-webhook',
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
