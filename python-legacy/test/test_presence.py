# coding: utf-8

"""
    Zulip REST API

    Powerful open source group chat   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest
import datetime

import openapi_client
from openapi_client.models.presence import Presence  # noqa: E501
from openapi_client.rest import ApiException

class TestPresence(unittest.TestCase):
    """Presence unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test Presence
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.presence.Presence()  # noqa: E501
        if include_optional :
            return Presence(
                client = '', 
                status = 'idle', 
                timestamp = 56, 
                pushable = True
            )
        else :
            return Presence(
        )

    def testPresence(self):
        """Test Presence"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
