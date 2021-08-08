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
from openapi_client.models.realm_emoji import RealmEmoji  # noqa: E501
from openapi_client.rest import ApiException

class TestRealmEmoji(unittest.TestCase):
    """RealmEmoji unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test RealmEmoji
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.realm_emoji.RealmEmoji()  # noqa: E501
        if include_optional :
            return RealmEmoji(
                id = '', 
                name = '', 
                source_url = '', 
                deactivated = True, 
                author_id = 56
            )
        else :
            return RealmEmoji(
        )

    def testRealmEmoji(self):
        """Test RealmEmoji"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
